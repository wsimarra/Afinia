package pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

@DefaultUrl("https://caribemar.facture.co/Login?returnurl=%2f")
public class LoginPage extends PageObject {

@FindBy(id ="dnn_ctr_Login_Login_DotNetNuke.Membership.GatewayMembershipProvider_txtUsername")
public WebElementFacade txtUser;

@FindBy(id="dnn_ctr_Login_Login_DotNetNuke.Membership.GatewayMembershipProvider_txtPassword")
public  WebElementFacade txtPassword;

@FindBy (tagName ="button")
public  WebElementFacade btbIngresar;

@FindBy(linkText = "Inicio")
public  WebElementFacade labelInicio;

public  void logeArse(String User,String Pass){
   txtUser.sendKeys(User);
   txtPassword.sendKeys(Pass);
   btbIngresar.click();
}
public void verificarInicio(){
    String Label="Inicio";
    String SrtMensaje=labelInicio.getText();
    assertThat(SrtMensaje,containsString(Label));
}


}
