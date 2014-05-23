/*
 * An XML document type.
 * Localname: geocodeHierarchy
 * Namespace: http://lendholt.de/geo/wps/gcap/geocodeHierarchy/1.2
 * Java type: de.lendholt.geo.wps.gcap.geocodeHierarchy.x12.GeocodeHierarchyDocument
 *
 * Automatically generated - do not modify.
 */
package de.lendholt.geo.wps.gcap.geocodeHierarchy.x12.impl;
/**
 * A document containing one geocodeHierarchy(@http://lendholt.de/geo/wps/gcap/geocodeHierarchy/1.2) element.
 *
 * This is a complex type.
 */
public class GeocodeHierarchyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.lendholt.geo.wps.gcap.geocodeHierarchy.x12.GeocodeHierarchyDocument
{
    private static final long serialVersionUID = 1L;
    
    public GeocodeHierarchyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GEOCODEHIERARCHY$0 = 
        new javax.xml.namespace.QName("http://lendholt.de/geo/wps/gcap/geocodeHierarchy/1.2", "geocodeHierarchy");
    
    
    /**
     * Gets the "geocodeHierarchy" element
     */
    public de.lendholt.geo.wps.gcap.x12.HierarchyType getGeocodeHierarchy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.lendholt.geo.wps.gcap.x12.HierarchyType target = null;
            target = (de.lendholt.geo.wps.gcap.x12.HierarchyType)get_store().find_element_user(GEOCODEHIERARCHY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "geocodeHierarchy" element
     */
    public void setGeocodeHierarchy(de.lendholt.geo.wps.gcap.x12.HierarchyType geocodeHierarchy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.lendholt.geo.wps.gcap.x12.HierarchyType target = null;
            target = (de.lendholt.geo.wps.gcap.x12.HierarchyType)get_store().find_element_user(GEOCODEHIERARCHY$0, 0);
            if (target == null)
            {
                target = (de.lendholt.geo.wps.gcap.x12.HierarchyType)get_store().add_element_user(GEOCODEHIERARCHY$0);
            }
            target.set(geocodeHierarchy);
        }
    }
    
    /**
     * Appends and returns a new empty "geocodeHierarchy" element
     */
    public de.lendholt.geo.wps.gcap.x12.HierarchyType addNewGeocodeHierarchy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.lendholt.geo.wps.gcap.x12.HierarchyType target = null;
            target = (de.lendholt.geo.wps.gcap.x12.HierarchyType)get_store().add_element_user(GEOCODEHIERARCHY$0);
            return target;
        }
    }
}
