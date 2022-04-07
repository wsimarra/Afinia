package steps;

import net.thucydides.core.annotations.Step;
import pages.LoginPage;

public class LoginSteps {

    LoginPage loGin;

    @Step

    public  void loginAfinia(String user,String pass){
        // Abrir Navegador
        loGin.open();
        // ingresar usuario y clave
        loGin.logeArse(user,pass);
    }

}
