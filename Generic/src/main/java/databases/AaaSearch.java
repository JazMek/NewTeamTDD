package databases;

public class AaaSearch {
    public String getSearch_Words() {
        return search_Words;
    }

    public String getExpectedsearchResult() {
        return expectedsearchResult;
    }

    String search_Words;
    String expectedsearchResult;

    public  AaaSearch( String search,String expectedR){
        this.search_Words = search;
        this.expectedsearchResult = expectedR;
    }

}
