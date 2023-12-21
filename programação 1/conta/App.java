// Jeffley Garçon
// 2311100023

public class App {
    public static void main(String[] args) throws Exception {
        Cliente Cl1 = new Cliente("Jeffley", 1234);
        
        CartaoCredito Ca1 = new CartaoCredito(0023, "2029");
        
        Agencia Ag1 = new Agencia(0001);
        


        Cl1.setnomes("Jhonsley");
        Cl1.setCodigos(56789);

        System.out.println("Nome do cliente: " + Cl1.getnomes());
        System.out.println("Código do Cliente: " + Cl1.getCodigos());
        
        Ca1.setnumeros(45674);
        Ca1.setDataDeValidacao("2034");
        System.out.println("Numero do cartão de crédito: " + Ca1.getnumeros() );
        System.out.println("data de validade: " + Ca1.getDataDeValidacao());

        Ag1.setnumero(1234);
        System.out.println("Agencia: " + Ag1.getnumero());

    }
}
