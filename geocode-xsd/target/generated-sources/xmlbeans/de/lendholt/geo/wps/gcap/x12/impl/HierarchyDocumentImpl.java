/*
 * An XML document type.
 * Localname: hierarchy
 * Namespace: http://lendholt.de/geo/wps/gcap/1.2
 * Java type: de.lendholt.geo.wps.gcap.x12.HierarchyDocument
 *
 * Automatically generated - do not modify.
 */
package de.lendholt.geo.wps.gcap.x12.impl;
/**
 * A document containing one hierarchy(@http://lendholt.de/geo/wps/gcap/1.2) element.
 *
 * This is a complex type.
 */
public class HierarchyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.lendholt.geo.wps.gcap.x12.HierarchyDocument
{
    private static final long serialVersionUID = 1L;
    
    public HierarchyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HIERARCHY$0 = 
        new javax.xml.namespace.QName("http://lendholt.de/geo/wps/gcap/1.2", "hierarchy");
    
    
    /**
     * Gets the "hierarchy" element
     */
    public de.lendholt.geo.wps.gcap.x12.HierarchyType getHierarchy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.lendholt.geo.wps.gcap.x12.HierarchyType target = null;
            target = (de.lendholt.geo.wps.gcap.x12.HierarchyType)get_store().find_element_user(HIERARCHY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "hierarchy" element
     */
    public void setHierarchy(de.lendholt.geo.wps.gcap.x12.HierarchyType hierarchy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.lendholt.geo.wps.gcap.x12.HierarchyType target = null;
            target = (de.lendholt.geo.wps.gcap.x12.HierarchyType)get_store().find_element_user(HIERARCHY$0, 0);
            if (target == null)
            {
                target = (de.lendholt.geo.wps.gcap.x12.HierarchyType)get_store().add_element_user(HIERARCHY$0);
            }
            target.set(hierarchy);
        }
    }
    
    /**
     * Appends and returns a new empty "hierarchy" element
     */
    public de.lendholt.geo.wps.gcap.x12.HierarchyType addNewHierarchy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.lendholt.geo.wps.gcap.x12.HierarchyType target = null;
            target = (de.lendholt.geo.wps.gcap.x12.HierarchyType)get_store().add_element_user(HIERARCHY$0);
            return target;
        }
    }
}
