package util;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Componentes {

    private WebDriver driver;
    private Select combo;
    private WebElement botao;

    public void inicializa(){
        String chromeDriver = System.getProperty("user.dir") + "/Driver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriver);
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("file:///" + System.getProperty("user.dir") + "/Driver/componentes.html");
    }

    public void testeTextField(){
        driver.findElement(By.id("elementosForm:nome")).sendKeys("Maruan");
    }

    public void validaTextField() {
        Assert.assertEquals("Nome: Maruan", driver.findElement(By.id("descNome")).getText());
    }

    public void testeTextArea(){
        driver.findElement(By.id("elementosForm:sobrenome")).sendKeys("Moussa");
    }

    public void validaTextArea(){
        Assert.assertEquals("Sobrenome: Moussa",driver.findElement(By.id("descSobrenome")).getText());

    }

    public void clicarElementoRadioButton(){
        driver.findElement(By.id("elementosForm:sexo:0")).click();
    }
    public void clicarElementoCheckBox(){
        driver.findElement(By.id("elementosForm:comidaFavorita:1")).click();
    }

    public void validaElementoRadioButton(){
        Assert.assertEquals("Sexo: Masculino", driver.findElement(By.id("descSexo")).getText());
    }

    public void validaElementoCheckbox(){
        Assert.assertEquals("Comida: Frango", driver.findElement(By.id("descComida")).getText());
    }

    public void selecionarValorCombo(){
        WebElement elemento = driver.findElement(By.id("elementosForm:Escolaridade"));
        combo = new Select(elemento);
        combo.selectByValue("superior");
    }

    public void validaValorCombo(){
        Assert.assertEquals("Escolaridade: superior", driver.findElement(By.id("descEscolaridade")).getText());
    }
    public void selecionarCombobox(){
        WebElement elemento = driver.findElement(By.id("elementosForm:esportes"));
        combo = new Select(elemento);
        combo.selectByValue("natacao");
    }

    public void validarQuantidadeCombobox(){
        Assert.assertEquals("Esportes: Natacao", driver.findElement(By.id("descEsportes")).getText());
    }

    public void selecionarBotaoCadastrar(){
        botao = driver.findElement(By.id("elementosForm:cadastrar"));
        botao.click();
    }

    public void validaBotaoCadastrar(){
        Assert.assertEquals("Cadastrar", botao.getAttribute("value"));
    }

    public void testarCampoNomeObrigatorio(){
        driver.findElement(By.id("elementosForm:nome")).sendKeys("");
    }

    public void validaCampoNomeObrigatorio(){
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals("Nome eh obrigatorio", alert.getText());
    }

    public void testarSobrenomeObrigatorio(){
        driver.findElement(By.id("elementosForm:sobrenome")).sendKeys("");
    }

    public void validaSobrenomeObrigatorio(){
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals("Sobrenome eh obrigatorio", alert.getText());
    }



    public void validaCampoSexoObrigatorio(){
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals("Sexo eh obrigatorio", alert.getText());
    }
    public void fecharNavegador(){
        driver.quit();

    }



}

