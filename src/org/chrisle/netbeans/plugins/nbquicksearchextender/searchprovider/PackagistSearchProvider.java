package org.chrisle.netbeans.plugins.nbquicksearchextender.searchprovider;

import org.chrisle.netbeans.plugins.nbquicksearchextender.QuickSearchProvider;
import org.netbeans.spi.quicksearch.SearchRequest;
import org.netbeans.spi.quicksearch.SearchResponse;

public class PackagistSearchProvider extends QuickSearchProvider {
    public PackagistSearchProvider() {
        super.setSearchUrl("https://packagist.org/search/?q=");
        super.setSelector(".search-list ul li .package-item a");
    }

    @Override
    public void evaluate(SearchRequest request, SearchResponse response) {
        super.evaluate(request, response);
    }
}