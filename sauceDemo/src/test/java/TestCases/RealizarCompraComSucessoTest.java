package TestCases;

import Framework.TestBase;
import Tasks.LoginTasks;
import Tasks.ProdutoTasks;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class RealizarCompraComSucessoTest extends TestBase {
    private final WebDriver driver = getDriverManager();

    LoginTasks loginTasks = new LoginTasks(driver);
    ProdutoTasks produtoTasks = new ProdutoTasks(driver);

    @Test
    public void realizarCompra(){
        loginTasks.efetuarLogin();
        produtoTasks.selecionarProduto();

    }
}
