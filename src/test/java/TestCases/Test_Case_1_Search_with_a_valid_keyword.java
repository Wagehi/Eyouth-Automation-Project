package TestCases;

import Base.BaseTest;
import Pages.how_to_join_a_bank_Page;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Test_Case_1_Search_with_a_valid_keyword extends BaseTest {

    @Test
    public void Search_with_a_valid_keyword() {

        homePage.SearchOnTitle("كيف تنضم الي البنك");

        how_to_join_a_bank_Page howToJoinABankPage = homePage.OpenSearchResult();

        String Title = howToJoinABankPage.GetTextMessage();

        assertEquals(Title, "كيف تنضم إلى البنك؟", "Title is Not Found !!");
    }
}
