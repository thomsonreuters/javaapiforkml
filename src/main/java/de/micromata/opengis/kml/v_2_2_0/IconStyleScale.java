package de.micromata.opengis.kml.v_2_2_0;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    propOrder = {"value"}
)
@XmlRootElement(
    name = "scale",
    namespace = "http://www.opengis.net/kml/2.2"
)
public class IconStyleScale implements Cloneable {
    public static final double DefaultScaleValue = 1;
    public static final boolean DefaultFixedValue = false;

    @XmlAttribute(
        name = "fixed",
        namespace = "http://www.thomsonreuters.com/ns/2013/11/mapping/kml"
    )
    private Boolean fixed;

    @XmlValue
    private Double value;

    public IconStyleScale() {
    }

    public double getScale() {
        return this.value != null ? this.value : DefaultScaleValue;
    }

    public void setScale(double scale) {
        this.value = scale;
    }

    public boolean getFixed() {
        return this.fixed != null ? this.fixed : DefaultFixedValue;
    }

    public void setFixed(boolean fixed) {
        this.fixed = fixed;
    }

    @Override
    public IconStyleScale clone() {
        IconStyleScale clone;
        clone = new IconStyleScale();
        clone.value = this.value;
        clone.fixed = this.fixed;
        return clone;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + Double.hashCode(value);
        result = prime * result + Boolean.hashCode(fixed);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }

        if (!(obj instanceof IconStyleScale)) {
            return false;
        }

        IconStyleScale other = (IconStyleScale) obj;
        if (value != other.value) {
            return false;
        }
        if (fixed != other.fixed) {
            return false;
        }
        return true;
    }
}
