# NbQuickSearchExtender
### Extends the quick search of netbeans with google, stackoverflow, npm and wikipedia search provider.

It is a pain in the ass, if we add a new toolbar to netbeans only to add a new 
search provider like the google example from netbeans or the plugin to add search
inside stackoverflow or for jar files etc. Because you have so move toolbars than
each will look differnet, maybe has an other behaviour and so on. This is
why I developed this little plugin which already extends the Quick Search
with new search provider, for example, google, npm, wikipedia or stackoverflow.

You can see inside the code how easy it is to add a new provider to my plugin
maybe via a pull request or so.

### Legend
1. __g__ = google.com
2. __n__ = npmjs.com
3. __w__ = wikipedia.com
4. __st__ = stackoverflow.com

### Usage
1. Go to quick search (Maybe with Ctrl + I)
2. Type "g netbeans" and see the results
3. Hit enter or use the mouse to click on a link to open it inside the browser

### Providers are not in because of problems
1. Bower.io - Unfortunately it's not possible to use this, because bower.io do an ajax call which and bind the result with angular.
If I read the links of the result, the result is still empty. Don't know how to fix it atm.
2. Findjar.com - I tried it but I got a socket timeout, because of the long response time.
3. Problems with Wikipedia.com - The problem is how wikipedia shows results.
they only show resulsts if they can't find a word or you search for phrases.
If you search for "Netbeans" and hit enter at wikipedia, it will open the link
to netbeans immediately. And this is the problem why you don't have any resultlist.

### See how it works
![Alt text](screenshots/NbQuickSearchExtender.gif?raw=true)