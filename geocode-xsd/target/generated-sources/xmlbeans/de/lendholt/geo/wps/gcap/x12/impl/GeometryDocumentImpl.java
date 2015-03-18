/*
 * An XML document type.
 * Localname: geometry
 * Namespace: http://lendholt.de/geo/wps/gcap/1.2
 * Java type: de.lendholt.geo.wps.gcap.x12.GeometryDocument
 *
 * Automatically generated - do not modify.
 */
package de.lendholt.geo.wps.gcap.x12.impl;
/**
 * A document containing one geometry(@http://lendholt.de/geo/wps/gcap/1.2) element.
 *
 * This is a complex type.
 */
public class GeometryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.lendholt.geo.wps.gcap.x12.GeometryDocument
{
    private static final long serialVersionUID = 1L;
    
    public GeometryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GEOMETRY$0 = 
        new javax.xml.namespace.QName("http://lendholt.de/geo/wps/gcap/1.2", "geometry");
    
    
    /**
     * Gets the "geometry" element
     */
    public de.lendholt.geo.wps.gcap.x12.GeometryType getGeometry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.lendholt.geo.wps.gcap.x12.GeometryType target = null;
            target = (de.lendholt.geo.wps.gcap.x12.GeometryType)get_store().find_element_user(GEOMETRY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "geometry" element
     */
    public void setGeometry(de.lendholt.geo.wps.gcap.x12.GeometryType geometry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.lendholt.geo.wps.gcap.x12.GeometryType target = null;
            target = (de.lendholt.geo.wps.gcap.x12.GeometryType)get_store().find_element_user(GEOMETRY$0, 0);
            if (target == null)
            {
                target = (de.lendholt.geo.wps.gcap.x12.GeometryType)get_store().add_element_user(GEOMETRY$0);
            }
            target.set(geometry);
        }
    }
    
    /**
     * Appends and returns a new empty "geometry" element
     */
    public de.lendholt.geo.wps.gcap.x12.GeometryType addNewGeometry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.lendholt.geo.wps.gcap.x12.GeometryType target = null;
            target = (de.lendholt.geo.wps.gcap.x12.GeometryType)get_store().add_element_user(GEOMETRY$0);
            return target;
        }
    }
}
