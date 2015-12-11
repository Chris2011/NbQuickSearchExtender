package org.chrisle.netbeans.plugins.nbquicksearchextender;

import org.netbeans.spi.quicksearch.SearchRequest;
import org.netbeans.spi.quicksearch.SearchResponse;

public class GithubSearchProvider extends QuickSearchProvider {
    public GithubSearchProvider() {
        super.setSearchUrl("https://github.com/search?q=");
        super.setSelector(".repo-list li .repo-list-name a");
    }

    @Override
    public void evaluate(SearchRequest request, SearchResponse response) {
        super.evaluate(request, response);
    }
}