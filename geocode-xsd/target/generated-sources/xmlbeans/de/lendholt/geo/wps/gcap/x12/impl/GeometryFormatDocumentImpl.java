/*
 * An XML document type.
 * Localname: geometryFormat
 * Namespace: http://lendholt.de/geo/wps/gcap/1.2
 * Java type: de.lendholt.geo.wps.gcap.x12.GeometryFormatDocument
 *
 * Automatically generated - do not modify.
 */
package de.lendholt.geo.wps.gcap.x12.impl;
/**
 * A document containing one geometryFormat(@http://lendholt.de/geo/wps/gcap/1.2) element.
 *
 * This is a complex type.
 */
public class GeometryFormatDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.lendholt.geo.wps.gcap.x12.GeometryFormatDocument
{
    private static final long serialVersionUID = 1L;
    
    public GeometryFormatDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GEOMETRYFORMAT$0 = 
        new javax.xml.namespace.QName("http://lendholt.de/geo/wps/gcap/1.2", "geometryFormat");
    
    
    /**
     * Gets the "geometryFormat" element
     */
    public de.lendholt.geo.wps.gcap.x12.GeometryFormatType.Enum getGeometryFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GEOMETRYFORMAT$0, 0);
            if (target == null)
            {
                return null;
            }
            return (de.lendholt.geo.wps.gcap.x12.GeometryFormatType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "geometryFormat" element
     */
    public de.lendholt.geo.wps.gcap.x12.GeometryFormatType xgetGeometryFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.lendholt.geo.wps.gcap.x12.GeometryFormatType target = null;
            target = (de.lendholt.geo.wps.gcap.x12.GeometryFormatType)get_store().find_element_user(GEOMETRYFORMAT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "geometryFormat" element
     */
    public void setGeometryFormat(de.lendholt.geo.wps.gcap.x12.GeometryFormatType.Enum geometryFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GEOMETRYFORMAT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GEOMETRYFORMAT$0);
            }
            target.setEnumValue(geometryFormat);
        }
    }
    
    /**
     * Sets (as xml) the "geometryFormat" element
     */
    public void xsetGeometryFormat(de.lendholt.geo.wps.gcap.x12.GeometryFormatType geometryFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.lendholt.geo.wps.gcap.x12.GeometryFormatType target = null;
            target = (de.lendholt.geo.wps.gcap.x12.GeometryFormatType)get_store().find_element_user(GEOMETRYFORMAT$0, 0);
            if (target == null)
            {
                target = (de.lendholt.geo.wps.gcap.x12.GeometryFormatType)get_store().add_element_user(GEOMETRYFORMAT$0);
            }
            target.set(geometryFormat);
        }
    }
}
