package page

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.support.PageFactory
import java.util.*

class SearchResultPage(private val driver: WebDriver) : BasePage {
    fun isResultItemDisplayed(itemName: String?): Boolean {
        return driver.findElement(By.cssSelector(String.format("img[alt='%s']", itemName))).isDisplayed
    }

    init { initPage() }

    override fun initPage() {
        Objects.requireNonNull(driver)
        PageFactory.initElements(this.driver, this)
    }
}