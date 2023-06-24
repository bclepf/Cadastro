
package cadastro;

/**
 *
 * @author bernardo
 */
public class Controle {

   public static void main(String[] args) {
        Cliente<String> cliente = new Cliente<>("Bernardo", "Clepf", 19, "Rua João Gomes, 132 A", "bclepf@mail.com");
        imprimirCliente(cliente);
    }
    
    public static <T> void imprimirCliente(Cliente<T> cliente) {
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Sobrenome: " + cliente.getSobrenome());
        System.out.println("Idade: " + cliente.getIdade());
        System.out.println("Endereço: " + cliente.getEndereco());
        System.out.println("E-mail: " + cliente.getEmail());
    }
}