/*
 * An XML document type.
 * Localname: geocodeLevel
 * Namespace: http://lendholt.de/geo/wps/gcap/1.2
 * Java type: de.lendholt.geo.wps.gcap.x12.GeocodeLevelDocument
 *
 * Automatically generated - do not modify.
 */
package de.lendholt.geo.wps.gcap.x12.impl;
/**
 * A document containing one geocodeLevel(@http://lendholt.de/geo/wps/gcap/1.2) element.
 *
 * This is a complex type.
 */
public class GeocodeLevelDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.lendholt.geo.wps.gcap.x12.GeocodeLevelDocument
{
    private static final long serialVersionUID = 1L;
    
    public GeocodeLevelDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GEOCODELEVEL$0 = 
        new javax.xml.namespace.QName("http://lendholt.de/geo/wps/gcap/1.2", "geocodeLevel");
    
    
    /**
     * Gets the "geocodeLevel" element
     */
    public byte getGeocodeLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GEOCODELEVEL$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getByteValue();
        }
    }
    
    /**
     * Gets (as xml) the "geocodeLevel" element
     */
    public de.lendholt.geo.wps.gcap.x12.GeocodeLevelType xgetGeocodeLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.lendholt.geo.wps.gcap.x12.GeocodeLevelType target = null;
            target = (de.lendholt.geo.wps.gcap.x12.GeocodeLevelType)get_store().find_element_user(GEOCODELEVEL$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "geocodeLevel" element
     */
    public void setGeocodeLevel(byte geocodeLevel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GEOCODELEVEL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GEOCODELEVEL$0);
            }
            target.setByteValue(geocodeLevel);
        }
    }
    
    /**
     * Sets (as xml) the "geocodeLevel" element
     */
    public void xsetGeocodeLevel(de.lendholt.geo.wps.gcap.x12.GeocodeLevelType geocodeLevel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.lendholt.geo.wps.gcap.x12.GeocodeLevelType target = null;
            target = (de.lendholt.geo.wps.gcap.x12.GeocodeLevelType)get_store().find_element_user(GEOCODELEVEL$0, 0);
            if (target == null)
            {
                target = (de.lendholt.geo.wps.gcap.x12.GeocodeLevelType)get_store().add_element_user(GEOCODELEVEL$0);
            }
            target.set(geocodeLevel);
        }
    }
}
