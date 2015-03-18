/*
 * An XML document type.
 * Localname: hierarchyLevel
 * Namespace: http://lendholt.de/geo/wps/gcap/1.2
 * Java type: de.lendholt.geo.wps.gcap.x12.HierarchyLevelDocument
 *
 * Automatically generated - do not modify.
 */
package de.lendholt.geo.wps.gcap.x12.impl;
/**
 * A document containing one hierarchyLevel(@http://lendholt.de/geo/wps/gcap/1.2) element.
 *
 * This is a complex type.
 */
public class HierarchyLevelDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.lendholt.geo.wps.gcap.x12.HierarchyLevelDocument
{
    private static final long serialVersionUID = 1L;
    
    public HierarchyLevelDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HIERARCHYLEVEL$0 = 
        new javax.xml.namespace.QName("http://lendholt.de/geo/wps/gcap/1.2", "hierarchyLevel");
    
    
    /**
     * Gets the "hierarchyLevel" element
     */
    public de.lendholt.geo.wps.gcap.x12.HierarchyLevelType getHierarchyLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.lendholt.geo.wps.gcap.x12.HierarchyLevelType target = null;
            target = (de.lendholt.geo.wps.gcap.x12.HierarchyLevelType)get_store().find_element_user(HIERARCHYLEVEL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "hierarchyLevel" element
     */
    public void setHierarchyLevel(de.lendholt.geo.wps.gcap.x12.HierarchyLevelType hierarchyLevel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.lendholt.geo.wps.gcap.x12.HierarchyLevelType target = null;
            target = (de.lendholt.geo.wps.gcap.x12.HierarchyLevelType)get_store().find_element_user(HIERARCHYLEVEL$0, 0);
            if (target == null)
            {
                target = (de.lendholt.geo.wps.gcap.x12.HierarchyLevelType)get_store().add_element_user(HIERARCHYLEVEL$0);
            }
            target.set(hierarchyLevel);
        }
    }
    
    /**
     * Appends and returns a new empty "hierarchyLevel" element
     */
    public de.lendholt.geo.wps.gcap.x12.HierarchyLevelType addNewHierarchyLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.lendholt.geo.wps.gcap.x12.HierarchyLevelType target = null;
            target = (de.lendholt.geo.wps.gcap.x12.HierarchyLevelType)get_store().add_element_user(HIERARCHYLEVEL$0);
            return target;
        }
    }
}
