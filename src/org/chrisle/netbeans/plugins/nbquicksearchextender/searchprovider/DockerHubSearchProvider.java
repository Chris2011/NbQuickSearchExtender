package org.chrisle.netbeans.plugins.nbquicksearchextender.searchprovider;

import org.chrisle.netbeans.plugins.nbquicksearchextender.QuickSearchProvider;
import org.netbeans.spi.quicksearch.SearchRequest;
import org.netbeans.spi.quicksearch.SearchResponse;

public class DockerHubSearchProvider extends QuickSearchProvider {
    public DockerHubSearchProvider() {
        super.setSearchUrl("https://hub.docker.com/search/?isOfficial=0&q=");
        super.setSelector(".profile-repos ul li a");
    }

    @Override
    public void evaluate(SearchRequest request, SearchResponse response) {
        super.evaluate(request, response);
    }
}