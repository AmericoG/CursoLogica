package logicadeprogramacao.src.Exercicios.LacosDeRepeticao;
/* Apresentar ao usuário uma tela solicitando um login e depois uma senha, o usuário e senha
 corretos devem estar armazenados em constantes no seu programa. Se o usuário acertar o usuário
  e a senha exibir a mensagem ACESSO CONCEDIDO, caso contrário exibir a mensagem ACESSO NEGADO e
   voltar a pedir o usuário e senha, essa condição deve-se repetir até que o usuário acerte a combinação.
*/

import java.util.Scanner;

public class LoginSenha {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final String usuario = "BRZ234";
        final String senha = "123ba";
        while (true) {
            System.out.println("Digite o seu usuario");
            String usuarioDigitado = teclado.next();
            System.out.println("Digite a sua senha");
            String senhaDigitada = teclado.next();
            if (usuario.equals(usuarioDigitado) & senha.equals(senhaDigitada)) {
                System.out.println("ACESSO CONCEDIDO");
                break;
            } else {
                System.out.println("USUARIO OU SENHA INCORRETA");
            }
        }
    }
}