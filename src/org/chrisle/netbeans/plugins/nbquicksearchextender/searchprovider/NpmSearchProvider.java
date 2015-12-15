package org.chrisle.netbeans.plugins.nbquicksearchextender.searchprovider;

import org.chrisle.netbeans.plugins.nbquicksearchextender.QuickSearchProvider;
import org.netbeans.spi.quicksearch.SearchRequest;
import org.netbeans.spi.quicksearch.SearchResponse;


public class NpmSearchProvider extends QuickSearchProvider {
    public NpmSearchProvider() {
        super.setBaseUrl("https://www.npmjs.com/");
        super.setSearchUrl("https://www.npmjs.com/search?q=");
        super.setSelector(".search-results .package-details a");
    }

    @Override
    public void evaluate(SearchRequest request, SearchResponse response) {
        super.evaluate(request, response);
    }
}