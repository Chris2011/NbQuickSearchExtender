package org.chrisle.netbeans.plugins.nbquicksearchextender.searchprovider;

import org.chrisle.netbeans.plugins.nbquicksearchextender.QuickSearchProvider;
import org.netbeans.spi.quicksearch.SearchRequest;
import org.netbeans.spi.quicksearch.SearchResponse;


public class BowerSearchProvider extends QuickSearchProvider {
    public BowerSearchProvider() {
        super.setBaseUrl("");
        super.setSearchUrl("https://libraries.io/api/bower-search?q=");
        super.setSelector(".search-results td a"); // FIXME: Result is JSON not HTML anymore.
    }

    @Override
    public void evaluate(SearchRequest request, SearchResponse response) {
        super.evaluate(request, response); //To change body of generated methods, choose Tools | Templates.
    }
}