package de.micromata.jak;

import de.micromata.opengis.kml.v_2_2_0.IconStyle;
import de.micromata.opengis.kml.v_2_2_0.KmlFactory;
import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.Element;

import static org.hamcrest.CoreMatchers.not;
import static org.xmlunit.matchers.HasXPathMatcher.hasXPath;

public class KmlIMapReferenceApiTest {
    @Test
    public void iconStyleNoScale() {
        IconStyle iconstyle = KmlFactory.createIconStyle();

        Assert.assertEquals(1, iconstyle.getScale(), 0.0001);
        Assert.assertEquals(false, iconstyle.getScaleFixed());

        iconstyle = Utils.marshalAndUnmarshall(iconstyle);

        Assert.assertEquals(1, iconstyle.getScale(), 0.0001);
        Assert.assertEquals(false, iconstyle.getScaleFixed());
    }

    @Test
    public void iconStyleNoScaleMarshall() {
        IconStyle iconstyle = KmlFactory.createIconStyle();

        Element iconstyleElement = Utils.marshalToXmlElement(iconstyle);

        Assert.assertThat(iconstyleElement, not(hasXPath("//IconStyle/scale")));
    }

    @Test
    public void iconStyleNoScaleFixed() {
        IconStyle iconstyle = KmlFactory.createIconStyle()
            .withScaleFixed(true);

        Assert.assertEquals(1, iconstyle.getScale(), 0.0001);
        Assert.assertEquals(true, iconstyle.getScaleFixed());

        iconstyle = Utils.marshalAndUnmarshall(iconstyle);

        Assert.assertEquals(1, iconstyle.getScale(), 0.0001);
        Assert.assertEquals(true, iconstyle.getScaleFixed());
    }

    @Test
    public void iconStyleNoScaleFixedMarshall() {
        IconStyle iconstyle = KmlFactory.createIconStyle()
            .withScaleFixed(true);

        Element iconstyleElement = Utils.marshalToXmlElement(iconstyle);

        Assert.assertThat(iconstyleElement, hasXPath("//IconStyle/scale"));
        Assert.assertThat(iconstyleElement, not(hasXPath("//IconStyle/scale[*]")));
        Assert.assertThat(iconstyleElement, hasXPath("//IconStyle/scale[@fixed='true']"));
    }

    @Test
    public void iconStyleScale() {
        IconStyle iconstyle = KmlFactory.createIconStyle()
            .withScale(2);

        Assert.assertEquals(2, iconstyle.getScale(), 0.0001);
        Assert.assertEquals(false, iconstyle.getScaleFixed());

        iconstyle = Utils.marshalAndUnmarshall(iconstyle);

        Assert.assertEquals(2, iconstyle.getScale(), 0.0001);
        Assert.assertEquals(false, iconstyle.getScaleFixed());
    }

    @Test
    public void iconStyleScaleMarshall() {
        IconStyle iconstyle = KmlFactory.createIconStyle()
            .withScale(2);

        Element iconstyleElement = Utils.marshalToXmlElement(iconstyle);

        Assert.assertThat(iconstyleElement, hasXPath("//IconStyle/scale"));
        Assert.assertThat(iconstyleElement, hasXPath("//IconStyle/scale[.=2]"));
        Assert.assertThat(iconstyleElement, not(hasXPath("//IconStyle/scale[@fixed]")));
    }

    @Test
    public void iconStyleScaleFixed() {
        IconStyle iconstyle = KmlFactory.createIconStyle()
            .withScale(2)
            .withScaleFixed(true);

        Assert.assertEquals(2, iconstyle.getScale(), 0.0001);
        Assert.assertEquals(true, iconstyle.getScaleFixed());

        iconstyle = Utils.marshalAndUnmarshall(iconstyle);

        Assert.assertEquals(2, iconstyle.getScale(), 0.0001);
        Assert.assertEquals(true, iconstyle.getScaleFixed());
    }

    @Test
    public void iconStyleScaleFixedMarshall() {
        IconStyle iconstyle = KmlFactory.createIconStyle()
            .withScale(2)
            .withScaleFixed(true);

        Element iconstyleElement = Utils.marshalToXmlElement(iconstyle);

        Assert.assertThat(iconstyleElement, hasXPath("//IconStyle/scale"));
        Assert.assertThat(iconstyleElement, hasXPath("//IconStyle/scale[.=2]"));
        Assert.assertThat(iconstyleElement, hasXPath("//IconStyle/scale[@fixed='true']"));
    }
}
