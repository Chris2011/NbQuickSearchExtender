package org.chrisle.netbeans.plugins.nbquicksearchextender.searchprovider;

import org.chrisle.netbeans.plugins.nbquicksearchextender.QuickSearchProvider;
import org.netbeans.spi.quicksearch.SearchRequest;
import org.netbeans.spi.quicksearch.SearchResponse;


public class WikipediaSearchProvider extends QuickSearchProvider {

    public WikipediaSearchProvider() {
        super.setSearchUrl("https://en.wikipedia.org/w/index.php?fulltext=1&search=");
        super.setSelector(".mw-search-results li .mw-search-result-heading a");
    }

    @Override
    public void evaluate(SearchRequest request, SearchResponse response) {
        super.evaluate(request, response);
    }
}