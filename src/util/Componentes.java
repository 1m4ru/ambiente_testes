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

    public void validaTextField(){
        Assert.assertEquals("Maruan",driver.findElement(By.id("elementosForm:nome")).getAttribute("value"));

    }
    public void testeTextArea(){
        driver.findElement(By.id("elementosForm:sobrenome")).sendKeys("Moussa");
    }

    public void validaTextArea(){
        Assert.assertEquals("Moussa",driver.findElement(By.id("elementosForm:sugestoes")).getAttribute("value"));

    }


    public void clicarElementoRadioButton(){
        driver.findElement(By.id("elementosForm:sexo:0")).click();
    }
    public void clicarElementoCheckBox(){
        driver.findElement(By.id("elementosForm:comidaFavorita:1")).click();
    }



    public void validaElementoRadioButton(){
        Assert.assertTrue(driver.findElement(By.id("elementosForm:sexo:0")).isSelected());
    }

    public void validaElementoCheckbox(){
        Assert.assertTrue(driver.findElement(By.id("elementosForm:comidaFavorita:1")).isSelected());
    }

    public void selecionarValorCombo(){
        WebElement elemento = driver.findElement(By.id("elementosForm:Escolaridade"));
        combo = new Select(elemento);
        combo.selectByValue("superior");
    }

    public void validaValorCombo(){
        Assert.assertEquals("Superior", combo.getFirstSelectedOption().getText());
    }

    public void selecionarCombobox(){
        WebElement elemento = driver.findElement(By.id("elementosForm:esportes"));
        combo = new Select(elemento);
        combo.selectByValue("natacao");
    }

    public void validarQuantidadeCombobox(){
        List<WebElement> options = combo.getOptions();
        Assert.assertEquals(8, options.size());
    }

    public void selecionarBotaoCadastrar(){
        botao = driver.findElement(By.id("elementosForm:cadastrar"));
        botao.click();
    }

    public void validaBotaoCadastrar(){
        Assert.assertEquals("Cadastrado com Sucesso", botao.getAttribute("value"));
    }

    public void testarCampoNomeObrigatorio(){
        driver.findElement(By.id("elementosForm:nome")).sendKeys();
    }

    public void validaCampoNomeObrigatorio(){
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals("Nome eh obrigatorio", alert.getText());
    }

    public void testarSobrenomeObrigatorio(){
            driver.findElement(By.id("elementosForm:sobrenome")).sendKeys();
    }

    public void validaSobrenomeObrigatorio(){
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals("Sobrenome eh obrigatorio", alert.getText());
    }

    public void testarSexoObrigatório(){
        driver.findElement(By.id("")).click();
    }

    public void validaCampoSexoObrigatorio(){
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals("Sexo eh obrigatorio", alert.getText());
    }
    public void fecharNavegador(){
        driver.quit();

    }


}

