import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        //Escribe un programa que pida al usuario ingresar un nombre de usuario y una contraseña, si son iguales a los datos dados imprimirá en terminal: Acceso concedido, si no son iguales imprimirá en terminal: Nombre de usuario o contraseña incorrecta.
        //Averigua como hacer para poder ingresar el dato justo al lado de lo que termine la pregunta, es decir, que no haga un salto de línea.
        Scanner scanner = new Scanner(System.in);
        String nameSaved = "debrubio";
        String passwordSaved = "123123";
        System.out.print("Introduce un nombre de usuario: ");
        String name = scanner.nextLine();
        System.out.print("Introduce una contraseña: ");
        String password = scanner.nextLine();
        if (name.equals(nameSaved) && password.equals(passwordSaved)) {
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Nombre de usuario o contraseña incorrecta");
        }
        scanner.close();
    }
}
