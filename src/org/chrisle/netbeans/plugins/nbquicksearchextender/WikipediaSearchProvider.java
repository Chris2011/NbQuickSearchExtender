package org.chrisle.netbeans.plugins.nbquicksearchextender;

import org.netbeans.spi.quicksearch.SearchRequest;
import org.netbeans.spi.quicksearch.SearchResponse;


public class WikipediaSearchProvider extends QuickSearchProvider {

    public WikipediaSearchProvider() {
        super.setSearchUrl("https://de.wikipedia.org/wiki/?search=");
        super.setSelector(".mw-search-results>li a");
    }

    @Override
    public void evaluate(SearchRequest request, SearchResponse response) {
        super.evaluate(request, response);
    }
}