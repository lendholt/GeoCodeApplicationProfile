/*
 * XML Type:  geometryType
 * Namespace: http://lendholt.de/geo/wps/gcap/1.2
 * Java type: de.lendholt.geo.wps.gcap.x12.GeometryType
 *
 * Automatically generated - do not modify.
 */
package de.lendholt.geo.wps.gcap.x12.impl;
/**
 * An XML geometryType(@http://lendholt.de/geo/wps/gcap/1.2).
 *
 * This is a complex type.
 */
public class GeometryTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.lendholt.geo.wps.gcap.x12.GeometryType
{
    private static final long serialVersionUID = 1L;
    
    public GeometryTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WKT$0 = 
        new javax.xml.namespace.QName("http://lendholt.de/geo/wps/gcap/1.2", "wkt");
    private static final javax.xml.namespace.QName HEXEWKB$2 = 
        new javax.xml.namespace.QName("http://lendholt.de/geo/wps/gcap/1.2", "hexewkb");
    private static final javax.xml.namespace.QName SHAPEFILE$4 = 
        new javax.xml.namespace.QName("http://lendholt.de/geo/wps/gcap/1.2", "shapefile");
    private static final javax.xml.namespace.QName GEOJSON$6 = 
        new javax.xml.namespace.QName("http://lendholt.de/geo/wps/gcap/1.2", "geojson");
    
    
    /**
     * Gets the "wkt" element
     */
    public java.lang.String getWkt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WKT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "wkt" element
     */
    public org.apache.xmlbeans.XmlString xgetWkt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WKT$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "wkt" element
     */
    public boolean isSetWkt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WKT$0) != 0;
        }
    }
    
    /**
     * Sets the "wkt" element
     */
    public void setWkt(java.lang.String wkt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WKT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WKT$0);
            }
            target.setStringValue(wkt);
        }
    }
    
    /**
     * Sets (as xml) the "wkt" element
     */
    public void xsetWkt(org.apache.xmlbeans.XmlString wkt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WKT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(WKT$0);
            }
            target.set(wkt);
        }
    }
    
    /**
     * Unsets the "wkt" element
     */
    public void unsetWkt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WKT$0, 0);
        }
    }
    
    /**
     * Gets the "hexewkb" element
     */
    public byte[] getHexewkb()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HEXEWKB$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "hexewkb" element
     */
    public org.apache.xmlbeans.XmlHexBinary xgetHexewkb()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlHexBinary target = null;
            target = (org.apache.xmlbeans.XmlHexBinary)get_store().find_element_user(HEXEWKB$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "hexewkb" element
     */
    public boolean isSetHexewkb()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HEXEWKB$2) != 0;
        }
    }
    
    /**
     * Sets the "hexewkb" element
     */
    public void setHexewkb(byte[] hexewkb)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HEXEWKB$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HEXEWKB$2);
            }
            target.setByteArrayValue(hexewkb);
        }
    }
    
    /**
     * Sets (as xml) the "hexewkb" element
     */
    public void xsetHexewkb(org.apache.xmlbeans.XmlHexBinary hexewkb)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlHexBinary target = null;
            target = (org.apache.xmlbeans.XmlHexBinary)get_store().find_element_user(HEXEWKB$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlHexBinary)get_store().add_element_user(HEXEWKB$2);
            }
            target.set(hexewkb);
        }
    }
    
    /**
     * Unsets the "hexewkb" element
     */
    public void unsetHexewkb()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HEXEWKB$2, 0);
        }
    }
    
    /**
     * Gets the "shapefile" element
     */
    public byte[] getShapefile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHAPEFILE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "shapefile" element
     */
    public org.apache.xmlbeans.XmlBase64Binary xgetShapefile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(SHAPEFILE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "shapefile" element
     */
    public boolean isSetShapefile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHAPEFILE$4) != 0;
        }
    }
    
    /**
     * Sets the "shapefile" element
     */
    public void setShapefile(byte[] shapefile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHAPEFILE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHAPEFILE$4);
            }
            target.setByteArrayValue(shapefile);
        }
    }
    
    /**
     * Sets (as xml) the "shapefile" element
     */
    public void xsetShapefile(org.apache.xmlbeans.XmlBase64Binary shapefile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(SHAPEFILE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBase64Binary)get_store().add_element_user(SHAPEFILE$4);
            }
            target.set(shapefile);
        }
    }
    
    /**
     * Unsets the "shapefile" element
     */
    public void unsetShapefile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHAPEFILE$4, 0);
        }
    }
    
    /**
     * Gets the "geojson" element
     */
    public java.lang.String getGeojson()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GEOJSON$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "geojson" element
     */
    public org.apache.xmlbeans.XmlString xgetGeojson()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GEOJSON$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "geojson" element
     */
    public boolean isSetGeojson()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GEOJSON$6) != 0;
        }
    }
    
    /**
     * Sets the "geojson" element
     */
    public void setGeojson(java.lang.String geojson)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GEOJSON$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GEOJSON$6);
            }
            target.setStringValue(geojson);
        }
    }
    
    /**
     * Sets (as xml) the "geojson" element
     */
    public void xsetGeojson(org.apache.xmlbeans.XmlString geojson)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GEOJSON$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GEOJSON$6);
            }
            target.set(geojson);
        }
    }
    
    /**
     * Unsets the "geojson" element
     */
    public void unsetGeojson()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GEOJSON$6, 0);
        }
    }
}
