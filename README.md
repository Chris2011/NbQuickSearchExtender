<h1>NbQuickSearchExtender</h1>
<h3>Extends the quick search of netbeans with google, stackoverflow, npm and wikipedia search provider.</h3>

It is a pain in the ass, if we add a new toolbar to netbeans only to add a new 
search provider like the google example from netbeans or the plugin to add search
inside stackoverflow or for jar files etc. Because you have so move toolbars than
each will look differnet, maybe has an other behaviour and so on. This is
why I developed this little plugin which already extends the Quick Search
with new search provider, for example, google, npm, wikipedia or stackoverflow.

You can see inside the code how easy it is to add a new provider to my plugin
maybe via a pull request or so.

<h3>Legend</h3>
<ol>
    <li><strong>g</strong> = google.com</li>
    <li><strong>n</strong> = npmjs.com</li>
    <li><strong>w</strong> = wikipedia.com</li>
    <li><strong>st</strong> = stackoverflow.com</li>
    <li><strong>gh</strong> = github.com</li>
    <li><strong>bb</strong> = bitbucket.org</li>
    <li><strong>pg</strong> = packagist.org</li>
</ol>

<h3>Usage</h3>
<ol>
    <li>Go to quick search (Maybe with Ctrl + I)</li>
    <li>Type "g netbeans" and see the results</li>
    <li>Hit enter or use the mouse to click on a link to open it inside the browser</li>
</ol>

<h3>Known provider problems</h3>
<ol>
<li>Bower.io - Unfortunately it's not possible to use this, because bower.io do an ajax call which and bind the result with angular.
If I read the links of the result, the result is still empty. Don't know how to fix it atm.</li>
<li>Findjar.com - I tried it but I got a socket timeout, because of the long response time.</li>
<li>Problems with Wikipedia.com - The problem is how wikipedia shows results.
they only show resulsts if they can't find a word or you search for phrases.
If you search for "Netbeans" and hit enter at wikipedia, it will open the link
to netbeans immediately. And this is the problem why you don't have any resultlist.</li>
</ol>

<h3>See how it works</h3>
<img src="screenshots/NbQuickSearchExtender.gif?raw=true" />