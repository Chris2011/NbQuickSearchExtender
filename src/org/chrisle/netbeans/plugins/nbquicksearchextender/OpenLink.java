package org.chrisle.netbeans.plugins.nbquicksearchextender;

import java.net.MalformedURLException;
import java.net.URL;
import org.openide.awt.HtmlBrowser.URLDisplayer;
import org.openide.awt.StatusDisplayer;
import org.openide.util.Exceptions;

public class OpenLink implements Runnable {

    private final String _urlToOpen;

    public OpenLink(String urlToOpen) {
        this._urlToOpen = urlToOpen;
    }

    @Override
    public void run() {
        try {
            URL url = new URL(this._urlToOpen);
            StatusDisplayer.getDefault().setStatusText(url.toString());
            URLDisplayer.getDefault().showURL(url);
        } catch (MalformedURLException ex) {
            Exceptions.printStackTrace(ex);
        }
    }
}