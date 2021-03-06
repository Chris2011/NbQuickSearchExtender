package org.chrisle.netbeans.plugins.nbquicksearchextender.searchprovider;

import org.chrisle.netbeans.plugins.nbquicksearchextender.QuickSearchProvider;
import org.netbeans.spi.quicksearch.SearchRequest;
import org.netbeans.spi.quicksearch.SearchResponse;


public class GoogleSearchProvider extends QuickSearchProvider {
    public GoogleSearchProvider() {
        super.setSearchUrl("http://www.google.com/search?q=");
        super.setSelector("#search .g h3>a");
    }

    @Override
    public void evaluate(SearchRequest request, SearchResponse response) {
        super.evaluate(request, response);
    }   
}