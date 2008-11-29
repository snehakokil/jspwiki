
package com.ecyrd.jspwiki;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AllTests extends TestCase
{
 
    public AllTests( String s )
    {
        super( s );
    }

    public static Test suite()
    {
        TestSuite suite = new TestSuite("JSPWiki Unit Tests");

        suite.addTest( FileUtilTest.suite() );
        suite.addTest( PageManagerTest.suite() );
        suite.addTest( PropertyReaderTest.suite() );
        suite.addTest( ReferenceManagerTest.suite() );
        suite.addTest( ReleaseTest.suite() );
        suite.addTest( TextUtilTest.suite() );
        suite.addTest( VariableManagerTest.suite() );
        // This is obsolete and not maintained anymore
        // suite.addTest( TranslatorReaderTest.suite() );
        suite.addTest( WikiSessionTest.suite() );
        suite.addTest( WikiEngineTest.suite() );
        suite.addTest( com.ecyrd.jspwiki.content.AllTests.suite() );
        suite.addTest( com.ecyrd.jspwiki.attachment.AllTests.suite() );
        suite.addTest( com.ecyrd.jspwiki.auth.AllTests.suite() );
        suite.addTest( com.ecyrd.jspwiki.dav.AllTests.suite() );
        suite.addTest( com.ecyrd.jspwiki.diff.AllTests.suite() );
        suite.addTest( com.ecyrd.jspwiki.filters.AllTests.suite() );
        suite.addTest( com.ecyrd.jspwiki.htmltowiki.AllTests.suite() );
        suite.addTest( com.ecyrd.jspwiki.parser.AllTests.suite() );
        suite.addTest( com.ecyrd.jspwiki.plugin.AllTests.suite() );
        suite.addTest( com.ecyrd.jspwiki.providers.AllTests.suite() );
        suite.addTest( com.ecyrd.jspwiki.render.AllTests.suite() );
        suite.addTest( com.ecyrd.jspwiki.rss.AllTests.suite() );
        suite.addTest( com.ecyrd.jspwiki.search.AllTests.suite() );
        suite.addTest( com.ecyrd.jspwiki.ui.AllTests.suite() );
        suite.addTest( com.ecyrd.jspwiki.url.AllTests.suite() );
        suite.addTest( com.ecyrd.jspwiki.util.AllTests.suite() );
        // These are not runnable without a running tomcat
        //suite.addTest( com.ecyrd.jspwiki.web.AllTests.suite() );
        suite.addTest( com.ecyrd.jspwiki.workflow.AllTests.suite() );
        suite.addTest( com.ecyrd.jspwiki.xmlrpc.AllTests.suite() );
        
        return suite;
    }
}
