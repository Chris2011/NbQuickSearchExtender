package org.chrisle.netbeans.plugins.nbquicksearchextender.searchprovider;

import org.chrisle.netbeans.plugins.nbquicksearchextender.QuickSearchProvider;
import org.netbeans.spi.quicksearch.SearchRequest;
import org.netbeans.spi.quicksearch.SearchResponse;


public class BitbucketSearchProvider extends QuickSearchProvider {
    public BitbucketSearchProvider() {
        super.setBaseUrl("");
        super.setSearchUrl("https://bitbucket.org/repo/all?name=");
        super.setSelector("#repositories .iterable-item .repo-link");
    }

    @Override
    public void evaluate(SearchRequest request, SearchResponse response) {
        super.evaluate(request, response); //To change body of generated methods, choose Tools | Templates.
    }
}