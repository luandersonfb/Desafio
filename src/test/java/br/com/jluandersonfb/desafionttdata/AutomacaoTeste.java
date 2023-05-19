package br.com.jluandersonfb.desafionttdata;

import java.time.Duration;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomacaoTeste {
	
	
	@Test
	public void deveAcessarPaginaDesafio() {
		
		System.setProperty("webdriver.chrome.driver","drives/chromedriver.exe");
		WebDriver jack = new ChromeDriver();
		
		jack.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		jack.navigate().to("https://www.google.com.br");
		jack.findElement(By.id("APjFqb")).sendKeys("nttdata"+"\n");
		
		//clicando no link nttdatabrasil
		jack.findElement(By.xpath("//*[@id=\"tads\"]/div/div/div/div/div[1]/a/div[1]/span")).click();
		
		//fechando popup
		jack.findElement(By.xpath("//*[@id=\"all\"]")).click();
		
		//clicando em carreira
		jack.findElement(By.xpath("//*[@id=\"menu-item-32094\"]/a/span")).click();
		
		//clicando junte-se a nossa equipe
		jack.findElement(By.xpath("/html/body/main/div[4]/div/div/div[2]/a")).click();
		
		//pesquisando arquiteto
		ArrayList<String> handles = new ArrayList<>(jack.getWindowHandles());
		jack.switchTo().window(handles.get(1));
		
		jack.findElement(By.xpath("//*[@id=\"pesquisar-vaga-localidade-etc\"]")).sendKeys("Arquiteto");
		//jack.findElement(By.xpath("//*[@id=\"pesquisar-vaga-localidade-etc\"]")).sendKeys("Arquiteto");   
		
		
		
		
		
		
		jack.quit();
		
		
		
	}
	
	

}
