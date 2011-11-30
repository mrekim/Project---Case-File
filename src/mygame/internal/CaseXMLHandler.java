/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mygame.internal;

import java.util.ArrayList;
import mygame.base.Case;
import mygame.base.Page;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;

/**
 *
 * @author mrucinski
 */
public class CaseXMLHandler implements ContentHandler {
    private Case thisCase;
    private String currentValue;
    private Page page;
    private ArrayList<Page> pages = new ArrayList<Page>();
    
    // Blubb!
    public void characters(char[] ch, int start, int length) throws SAXException {
        currentValue = new String(ch, start, length);
    }

    /////////
    // Start
    public void startDocument() throws SAXException {
        // todo : /
        System.out.println("Opening Case XML - Start parsing");
    }

    public void endDocument() throws SAXException {
        // todo : consolidate objects to case
        System.out.println("Finished parsing Case XML");
    }
    // End
    /////////

    // Classes
    public void startElement(String uri, String localName, String qName, Attributes atts) throws SAXException {
       System.out.println("Start Element : "+ localName);
       if (localName.equals("Case"))
       {
           System.out.println("Found new case - creating instance");
           thisCase = new Case();
       }
       
       if (localName.equals("Page"))
       {
           System.out.println("Found new page - creating instance");
           page = new Page();
           page.setId(Integer.parseInt(atts.getValue("id")));
       }
       
       if(localName.equals("Picture"))
       {
           System.out.println("Found new Image - creating instance");
           System.out.println("Todo");
       }
    }

    // Elements
    public void endElement(String uri, String localName, String qName) throws SAXException {
        System.out.println("End Element : " + localName + ":" + currentValue );
        
        //Case class 
        if(localName.equals("Title"))
            thisCase.setTitle(currentValue);
        
        //Page class
        if(localName.equals("Visible"))
            page.setVisible(Boolean.parseBoolean(currentValue));
        if(localName.equals("Text"))
            page.setText(currentValue);
              
    }
    
    public void setDocumentLocator(Locator locator) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }
    


    public void ignorableWhitespace(char[] ch, int start, int length) throws SAXException {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    public void processingInstruction(String target, String data) throws SAXException {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    public void skippedEntity(String name) throws SAXException {
        //throw new UnsupportedOperationException("Not supported yet.");
    }
    public void startPrefixMapping(String prefix, String uri) throws SAXException {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    public void endPrefixMapping(String prefix) throws SAXException {
        //throw new UnsupportedOperationException("Not supported yet.");
        
        
    }
    
}
