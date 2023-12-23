# https://www.gymlibrary.dev/
# https://github.com/openai/gym/blob/master/gym/envs/toy_text/taxi.py
import gym
import time
import numpy as np
import random
from IPython.display import clear_output


# Executar joguinho
def exploration():
    # Carrega o ambiente do jogo
    env = gym.make("Taxi-v3", render_mode="human")
    # Reinicia o jogo em uma configuração aleatória
    env.reset()
    print("Ações Possíveis {}".format(env.action_space))
    print("Estados Possíveis {}".format(env.observation_space))
    # tempo de execução em segundos
    tempo = 60
    t = time.time()
    terminou = False
    while not terminou:
        # escolhe uma ação aleatória
        acao = env.action_space.sample()
        # Ações 0 - sul, 1 - norte, 2 - leste, 3 - oeste, 4 - pegar, 5 - largar
        print("Ação:", acao)
        time.sleep(.5)
        # executa a ação
        estado, recompensa, terminou, _, _ = env.step(acao)
        # decodificação de um estado(linha do taxi, coluna do taxi, posição do passageiro, destino do passageiro)
        print("Estado após ação:", *env.decode(estado))
        print("Recompensa: ", recompensa)
        print("Estado final?: ", terminou)
        if time.time() - t > tempo:
            break


# Q-Learning
def q_learning():
    env = gym.make("Taxi-v3", render_mode="None")
    q_tabela = np.zeros([env.observation_space.n, env.action_space.n])
    # Hyperparâmetros
    # Taxa de Aprendizagem
    alpha = 0.5
    # Taxa de Desconto
    gamma = 0.5
    # Exploration vs exploitation
    epsilon = 1
    print("Iniciar Treinamento")
    for i in range(1, 1000):
        estado = env.reset()[0]
        terminou = False
        while not terminou:
            if random.uniform(0, 1) <= epsilon:
                acao = env.action_space.sample() # Explore
            else:
                acao = np.argmax(q_tabela[estado]) # Exploit
            proximo_estado, recompensa, terminou, _, _ = env.step(acao)

            # Aprendizado do Q-Learning
            q_tabela[estado, acao] = (1 - alpha) * q_tabela[estado, acao] + alpha * (recompensa + gamma * np.max(q_tabela[proximo_estado]))

            estado = proximo_estado

        # Atualização dos parâmetros
        if i % 100 == 0:
            clear_output(wait=True)
            print("Épocas: ", i)
            epsilon = epsilon * 0.95
            alpha = alpha * 0.95
            print("Chance de Explore (epsilon): ", epsilon)
            print("Chance de Exploit (1-epsilon): ", 1-epsilon)
            print("Taxa de Aprendizagem (alpha): ", alpha)

    print("Fim do Treinamento.")
    return q_tabela


# Avaliando agente treinado
def testar_modelo(q_tabela):
    # Carrega o ambiente do jogo
    env = gym.make("Taxi-v3", render_mode="human")
    total_passos = 0
    episodios = 50
    for i in range(1, episodios+1):
        estado = env.reset()[0]
        passos, recompensa = 0, 0
        terminou = False

        while not terminou:
            acao = np.argmax(q_tabela[estado])
            estado, recompensa, terminou, _, _ = env.step(acao)
            passos += 1
        total_passos += passos
        clear_output(wait=True)
        print(f"Episódio: {i}")

    print(f"Média de passos por jogo: {total_passos / episodios}")


#exploration()
modelo = q_learning()
testar_modelo(modelo)
