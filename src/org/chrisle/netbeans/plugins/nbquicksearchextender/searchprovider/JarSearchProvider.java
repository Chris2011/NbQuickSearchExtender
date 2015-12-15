package org.chrisle.netbeans.plugins.nbquicksearchextender.searchprovider;

import org.chrisle.netbeans.plugins.nbquicksearchextender.QuickSearchProvider;
import org.netbeans.spi.quicksearch.SearchRequest;
import org.netbeans.spi.quicksearch.SearchResponse;


public class JarSearchProvider extends QuickSearchProvider {
    public JarSearchProvider() {
        super.setSearchUrl("http://www.findjar.com/index.x?query=");
        super.setSelector(".results a");
    }

    @Override
    public void evaluate(SearchRequest request, SearchResponse response) {
        super.evaluate(request, response); //To change body of generated methods, choose Tools | Templates.
    }
}