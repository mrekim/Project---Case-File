/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mygame.internal;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.ContentHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;

/**
 *
 * @author mrucinski
 */
public class ReadXML {
    public void Parse() throws IOException
    {
        try {
            XMLReader xmlReader = XMLReaderFactory.createXMLReader();
          
          // Pfad zur XML Datei
          FileReader reader = new FileReader("Test.xml");
          InputSource inputSource = new InputSource(reader);

          // DTD kann optional übergeben werden
          // inputSource.setSystemId("X:\\personen.dtd");

          // PersonenContentHandler wird übergeben
          xmlReader.setContentHandler(new CaseXMLHandler());

          // Parsen wird gestartet
          xmlReader.parse(inputSource);
        } 
        
        catch (SAXException ex) 
        {
            Logger.getLogger(ReadXML.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}


