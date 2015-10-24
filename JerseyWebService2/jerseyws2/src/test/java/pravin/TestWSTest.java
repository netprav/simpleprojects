package pravin;

import com.sun.org.apache.xerces.internal.parsers.XMLDocumentParser;
import com.sun.org.apache.xerces.internal.util.FeatureState;
import com.sun.org.apache.xerces.internal.util.PropertyState;
import com.sun.org.apache.xerces.internal.xni.XMLDTDContentModelHandler;
import com.sun.org.apache.xerces.internal.xni.XMLDTDHandler;
import com.sun.org.apache.xerces.internal.xni.XMLDocumentHandler;
import com.sun.org.apache.xerces.internal.xni.XNIException;
import com.sun.org.apache.xerces.internal.xni.parser.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.TestNGException;
import org.testng.annotations.Test;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.StringReader;


public class TestWSTest {
    Logger LOG = LoggerFactory.getLogger(this.getClass());

    @Test
    public void testDateFunctionReturnsValue(){
        Assert.assertNotEquals(null, new TestWS().getDate());
    }

/*    @Test
    public void testDateFunctionReturnsValidXML(){
        TestWS testWS = new TestWS();
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            builder.parse(new InputSource(new StringReader(testWS.getDate())));
        }catch(ParserConfigurationException ex){
            LOG.debug(" TestWS getDate returns invalid XML : " + testWS.getDate());
            Assert.fail();
        }catch (Exception ex){
            LOG.debug(" TestWS getDate returns invalid value : " + testWS.getDate());
            Assert.fail();
        }
        LOG.debug("Test Completed");
    }
*/
}