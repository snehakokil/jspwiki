/*
    JSPWiki - a JSP-based WikiWiki clone.

    Licensed to the Apache Software Foundation (ASF) under one
    or more contributor license agreements.  See the NOTICE file
    distributed with this work for additional information
    regarding copyright ownership.  The ASF licenses this file
    to you under the Apache License, Version 2.0 (the
    "License"); you may not use this file except in compliance
    with the License.  You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing,
    software distributed under the License is distributed on an
    "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
    KIND, either express or implied.  See the License for the
    specific language governing permissions and limitations
    under the License.    
 */

package org.apache.wiki;

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
        TestSuite suite = new TestSuite("JSPWiki top-level tests");

        suite.addTest( ReleaseTest.suite() );
        suite.addTest( VariableManagerTest.suite() );
        suite.addTest( WikiEngineTest.suite() );
        suite.addTest( WikiSessionTest.suite() );
        suite.addTest( org.apache.wiki.action.AllTests.suite() );
        suite.addTest( org.apache.wiki.attachment.AllTests.suite() );
        suite.addTest( org.apache.wiki.auth.AllTests.suite() );
        suite.addTest( org.apache.wiki.auth.acl.AllTests.suite() );
        suite.addTest( org.apache.wiki.auth.authorize.AllTests.suite() );
        suite.addTest( org.apache.wiki.auth.login.AllTests.suite() );
        suite.addTest( org.apache.wiki.auth.permissions.AllTests.suite() );
        suite.addTest( org.apache.wiki.auth.user.AllTests.suite() );
        suite.addTest( org.apache.wiki.content.AllTests.suite() );
        suite.addTest( org.apache.wiki.content.inspect.AllTests.suite() );
        suite.addTest( org.apache.wiki.content.resolver.AllTests.suite() );
        suite.addTest( org.apache.wiki.diff.AllTests.suite() );
        suite.addTest( org.apache.wiki.filters.AllTests.suite() );
        suite.addTest( org.apache.wiki.htmltowiki.AllTests.suite() );
        suite.addTest( org.apache.wiki.parser.AllTests.suite() );
        suite.addTest( org.apache.wiki.plugin.AllTests.suite() );
        suite.addTest( org.apache.wiki.render.AllTests.suite() );
        suite.addTest( org.apache.wiki.rss.AllTests.suite() );
        suite.addTest( org.apache.wiki.search.AllTests.suite() );
        suite.addTest( org.apache.wiki.ui.AllTests.suite() );
        suite.addTest( org.apache.wiki.ui.migrator.AllTests.suite() );
        suite.addTest( org.apache.wiki.ui.stripes.AllTests.suite() );
        suite.addTest( org.apache.wiki.url.AllTests.suite() );
        suite.addTest( org.apache.wiki.util.AllTests.suite() );
        suite.addTest( org.apache.wiki.workflow.AllTests.suite() );
        suite.addTest( org.apache.wiki.xmlrpc.AllTests.suite() );
        
        return suite;
    }
}
