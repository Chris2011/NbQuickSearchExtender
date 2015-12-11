package org.chrisle.netbeans.plugins.nbquicksearchextender;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import org.netbeans.spi.quicksearch.SearchProvider;
import org.netbeans.spi.quicksearch.SearchRequest;
import org.netbeans.spi.quicksearch.SearchResponse;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.openide.util.Exceptions;

public class QuickSearchProvider implements SearchProvider {

    private String _searchUrl;
    private String _selector;
    private final String _charset;
    private final String _userAgent;
    private String _baseUrl;

    public QuickSearchProvider() {
        this._charset = "UTF-8";
        this._userAgent = "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/46.0.2490.86 Safari/537.36";
    }

    @Override
    public void evaluate(SearchRequest request, SearchResponse response) {
        try {
            Elements links = Jsoup.connect(_searchUrl + URLEncoder.encode(request.getText().toLowerCase(), _charset)).userAgent(_userAgent).get().select(_selector);

            for (Element link : links) {
                String title = link.text();
                String url = link.absUrl("href");

                if (!url.startsWith("http") && this._searchUrl.contains("google")) {
                    continue; // Ads/news/etc.
                }

                if (!response.addResult(new OpenLink(url), title)) {
                    return;
                }
            }
        } catch (UnsupportedEncodingException ex) {
            Exceptions.printStackTrace(ex);
        } catch (IOException ex) {
            Exceptions.printStackTrace(ex);
        }
    }

    public String getSearchUrl() {
        return _searchUrl;
    }

    public void setSearchUrl(String _searchUrl) {
        this._searchUrl = _searchUrl;
    }

    public String getSelector() {
        return _selector;
    }

    public void setSelector(String _selector) {
        this._selector = _selector;
    }

    void setBaseUrl(String baseUrl) {
        this._baseUrl = baseUrl;
    }

    
}
