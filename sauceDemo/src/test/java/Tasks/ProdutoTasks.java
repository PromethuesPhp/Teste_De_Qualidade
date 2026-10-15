package Tasks;

import PageObjects.ProdutoPage;
import org.openqa.selenium.WebDriver;

public class ProdutoTasks {
    private WebDriver driver;
    private ProdutoPage produtoPage;

    public ProdutoTasks (WebDriver driver){

        this.driver = driver;
        produtoPage = new ProdutoPage(this.driver);
    }
    public void selecionarProduto(){
        produtoPage.getAddToCartButton().click();
        produtoPage.getCartButton().click();

    }


}


