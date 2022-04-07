package definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.LoginSteps;

public class PagoFacturaDefinition {

@Steps
    LoginSteps loginSteps;

    @Given("^INGRESAR USUARIO Y CLAVE \"([^\"]*)\" y clave \"([^\"]*)\"$")
    public  void ingresar_usuario_y_clave_y_clave(String User,String Clave){
    loginSteps.loginAfinia(User,Clave);

    }

    @When("^INGRESO_A_MIS_FACTURAS$")
    public void selecionar_factura()  {


    }
   @And("^SELECIONA_DOCUMENTO_A_PAGAR$")
   public void seleciona_documento_a_paga(){


   }

    @Then("^Cancelar_pago$")
    public void cancelar_pago()
            {

            }

}
