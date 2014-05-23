/*
 * XML Type:  geocodeType
 * Namespace: http://lendholt.de/geo/wps/gcap/1.2
 * Java type: de.lendholt.geo.wps.gcap.x12.GeocodeType
 *
 * Automatically generated - do not modify.
 */
package de.lendholt.geo.wps.gcap.x12.impl;
/**
 * An XML geocodeType(@http://lendholt.de/geo/wps/gcap/1.2).
 *
 * This is a complex type.
 */
public class GeocodeTypeImpl extends de.lendholt.geo.wps.gcap.x12.impl.KeyValueTypeImpl implements de.lendholt.geo.wps.gcap.x12.GeocodeType
{
    private static final long serialVersionUID = 1L;
    
    public GeocodeTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LEVEL$0 = 
        new javax.xml.namespace.QName("", "level");
    
    
    /**
     * Gets the "level" attribute
     */
    public byte getLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LEVEL$0);
            if (target == null)
            {
                return 0;
            }
            return target.getByteValue();
        }
    }
    
    /**
     * Gets (as xml) the "level" attribute
     */
    public de.lendholt.geo.wps.gcap.x12.GeocodeLevelType xgetLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.lendholt.geo.wps.gcap.x12.GeocodeLevelType target = null;
            target = (de.lendholt.geo.wps.gcap.x12.GeocodeLevelType)get_store().find_attribute_user(LEVEL$0);
            return target;
        }
    }
    
    /**
     * True if has "level" attribute
     */
    public boolean isSetLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LEVEL$0) != null;
        }
    }
    
    /**
     * Sets the "level" attribute
     */
    public void setLevel(byte level)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LEVEL$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LEVEL$0);
            }
            target.setByteValue(level);
        }
    }
    
    /**
     * Sets (as xml) the "level" attribute
     */
    public void xsetLevel(de.lendholt.geo.wps.gcap.x12.GeocodeLevelType level)
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.lendholt.geo.wps.gcap.x12.GeocodeLevelType target = null;
            target = (de.lendholt.geo.wps.gcap.x12.GeocodeLevelType)get_store().find_attribute_user(LEVEL$0);
            if (target == null)
            {
                target = (de.lendholt.geo.wps.gcap.x12.GeocodeLevelType)get_store().add_attribute_user(LEVEL$0);
            }
            target.set(level);
        }
    }
    
    /**
     * Unsets the "level" attribute
     */
    public void unsetLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LEVEL$0);
        }
    }
}
