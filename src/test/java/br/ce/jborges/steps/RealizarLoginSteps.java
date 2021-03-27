package br.ce.jborges.steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class RealizarLoginSteps {
	
	WebDriver driver = new ChromeDriver();
	
	
	@Dado("que tenho um email cadastrado")
	public void queTenhoUmEmailCadastrado() {
		driver.get("https://srbarriga.herokuapp.com/login");
		driver.findElement(By.id("email")).sendKeys("tester@teste.com");
	}

	@Dado("uma senha válida")
	public void umaSenhaVálida() {
		driver.findElement(By.name("senha")).sendKeys("1234");
	}

	@Quando("clicar em Entrar")
	public void clicarEmEntrar() {
		driver.findElement(By.xpath("//button[text()='Entrar']")).click();
	}

	@Então("recebo a mensagem {string}")
	public void receboAMensagem(String string) {
		String texto = driver.findElement(By.xpath("//div[starts-with(@class,'alert alert-')]")).getText();
		Assert.assertEquals(true, texto.contains(string));
	}
	
	
	@Dado("que insiro um email não cadastrado")
	public void queInsiroUmEmailNãoCadastrado() {
		driver.get("https://srbarriga.herokuapp.com/login");
		driver.findElement(By.id("email")).sendKeys("invalid@invalid.com");
	}

	@Dado("uma senha qualquer")
	public void umaSenhaQualquer() {
		driver.findElement(By.name("senha")).sendKeys("1234");

	}
	
	@After
	public void fecharBrowser() {
		driver.quit();
	}

}
