/*
 * XML Type:  basicEnvelopeType
 * Namespace: http://lendholt.de/geo/wps/gcap/1.2
 * Java type: de.lendholt.geo.wps.gcap.x12.BasicEnvelopeType
 *
 * Automatically generated - do not modify.
 */
package de.lendholt.geo.wps.gcap.x12.impl;
/**
 * An XML basicEnvelopeType(@http://lendholt.de/geo/wps/gcap/1.2).
 *
 * This is a complex type.
 */
public class BasicEnvelopeTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.lendholt.geo.wps.gcap.x12.BasicEnvelopeType
{
    private static final long serialVersionUID = 1L;
    
    public BasicEnvelopeTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOWERCORNERLON$0 = 
        new javax.xml.namespace.QName("http://lendholt.de/geo/wps/gcap/1.2", "lowerCornerLon");
    private static final javax.xml.namespace.QName LOWERCORNERLAT$2 = 
        new javax.xml.namespace.QName("http://lendholt.de/geo/wps/gcap/1.2", "lowerCornerLat");
    private static final javax.xml.namespace.QName UPPERCORNERLON$4 = 
        new javax.xml.namespace.QName("http://lendholt.de/geo/wps/gcap/1.2", "upperCornerLon");
    private static final javax.xml.namespace.QName UPPERCORNERLAT$6 = 
        new javax.xml.namespace.QName("http://lendholt.de/geo/wps/gcap/1.2", "upperCornerLat");
    
    
    /**
     * Gets the "lowerCornerLon" element
     */
    public double getLowerCornerLon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOWERCORNERLON$0, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "lowerCornerLon" element
     */
    public org.apache.xmlbeans.XmlDouble xgetLowerCornerLon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(LOWERCORNERLON$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "lowerCornerLon" element
     */
    public void setLowerCornerLon(double lowerCornerLon)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOWERCORNERLON$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOWERCORNERLON$0);
            }
            target.setDoubleValue(lowerCornerLon);
        }
    }
    
    /**
     * Sets (as xml) the "lowerCornerLon" element
     */
    public void xsetLowerCornerLon(org.apache.xmlbeans.XmlDouble lowerCornerLon)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(LOWERCORNERLON$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(LOWERCORNERLON$0);
            }
            target.set(lowerCornerLon);
        }
    }
    
    /**
     * Gets the "lowerCornerLat" element
     */
    public double getLowerCornerLat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOWERCORNERLAT$2, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "lowerCornerLat" element
     */
    public org.apache.xmlbeans.XmlDouble xgetLowerCornerLat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(LOWERCORNERLAT$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "lowerCornerLat" element
     */
    public void setLowerCornerLat(double lowerCornerLat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOWERCORNERLAT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOWERCORNERLAT$2);
            }
            target.setDoubleValue(lowerCornerLat);
        }
    }
    
    /**
     * Sets (as xml) the "lowerCornerLat" element
     */
    public void xsetLowerCornerLat(org.apache.xmlbeans.XmlDouble lowerCornerLat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(LOWERCORNERLAT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(LOWERCORNERLAT$2);
            }
            target.set(lowerCornerLat);
        }
    }
    
    /**
     * Gets the "upperCornerLon" element
     */
    public double getUpperCornerLon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPPERCORNERLON$4, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "upperCornerLon" element
     */
    public org.apache.xmlbeans.XmlDouble xgetUpperCornerLon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(UPPERCORNERLON$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "upperCornerLon" element
     */
    public void setUpperCornerLon(double upperCornerLon)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPPERCORNERLON$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UPPERCORNERLON$4);
            }
            target.setDoubleValue(upperCornerLon);
        }
    }
    
    /**
     * Sets (as xml) the "upperCornerLon" element
     */
    public void xsetUpperCornerLon(org.apache.xmlbeans.XmlDouble upperCornerLon)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(UPPERCORNERLON$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(UPPERCORNERLON$4);
            }
            target.set(upperCornerLon);
        }
    }
    
    /**
     * Gets the "upperCornerLat" element
     */
    public double getUpperCornerLat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPPERCORNERLAT$6, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "upperCornerLat" element
     */
    public org.apache.xmlbeans.XmlDouble xgetUpperCornerLat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(UPPERCORNERLAT$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "upperCornerLat" element
     */
    public void setUpperCornerLat(double upperCornerLat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPPERCORNERLAT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UPPERCORNERLAT$6);
            }
            target.setDoubleValue(upperCornerLat);
        }
    }
    
    /**
     * Sets (as xml) the "upperCornerLat" element
     */
    public void xsetUpperCornerLat(org.apache.xmlbeans.XmlDouble upperCornerLat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(UPPERCORNERLAT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(UPPERCORNERLAT$6);
            }
            target.set(upperCornerLat);
        }
    }
}
