package org.chrisle.netbeans.plugins.nbquicksearchextender.searchprovider;

import org.chrisle.netbeans.plugins.nbquicksearchextender.QuickSearchProvider;
import org.netbeans.spi.quicksearch.SearchRequest;
import org.netbeans.spi.quicksearch.SearchResponse;

public class GithubSearchProvider extends QuickSearchProvider {
    public GithubSearchProvider() {
        super.setSearchUrl("https://github.com/search?q=");
        super.setSelector(".repo-list li > div h3 a");
    }

    @Override
    public void evaluate(SearchRequest request, SearchResponse response) {
        super.evaluate(request, response);
    }
}