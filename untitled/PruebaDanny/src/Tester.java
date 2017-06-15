/**
 * Created by odrazul on 5/25/17.
 */

public class Tester {
public static String string2Encrypt = "Admin";

        public static void main(String[] args) throws Exception {

            String encriptado = CriptoGraphy.Encrypt(string2Encrypt);
            System.out.println(encriptado);
            String desencriptado = CriptoGraphy.Decrypt(encriptado) ;
            System.out.println(desencriptado);

    }
}
