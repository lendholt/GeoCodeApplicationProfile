/*
 * XML Type:  hierarchyType
 * Namespace: http://lendholt.de/geo/wps/gcap/1.2
 * Java type: de.lendholt.geo.wps.gcap.x12.HierarchyType
 *
 * Automatically generated - do not modify.
 */
package de.lendholt.geo.wps.gcap.x12.impl;
/**
 * An XML hierarchyType(@http://lendholt.de/geo/wps/gcap/1.2).
 *
 * This is a complex type.
 */
public class HierarchyTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.lendholt.geo.wps.gcap.x12.HierarchyType
{
    private static final long serialVersionUID = 1L;
    
    public HierarchyTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HIERARCHYLEVEL$0 = 
        new javax.xml.namespace.QName("http://lendholt.de/geo/wps/gcap/1.2", "hierarchyLevel");
    
    
    /**
     * Gets array of all "hierarchyLevel" elements
     */
    public de.lendholt.geo.wps.gcap.x12.HierarchyLevelType[] getHierarchyLevelArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(HIERARCHYLEVEL$0, targetList);
            de.lendholt.geo.wps.gcap.x12.HierarchyLevelType[] result = new de.lendholt.geo.wps.gcap.x12.HierarchyLevelType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "hierarchyLevel" element
     */
    public de.lendholt.geo.wps.gcap.x12.HierarchyLevelType getHierarchyLevelArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.lendholt.geo.wps.gcap.x12.HierarchyLevelType target = null;
            target = (de.lendholt.geo.wps.gcap.x12.HierarchyLevelType)get_store().find_element_user(HIERARCHYLEVEL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "hierarchyLevel" element
     */
    public int sizeOfHierarchyLevelArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HIERARCHYLEVEL$0);
        }
    }
    
    /**
     * Sets array of all "hierarchyLevel" element
     */
    public void setHierarchyLevelArray(de.lendholt.geo.wps.gcap.x12.HierarchyLevelType[] hierarchyLevelArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(hierarchyLevelArray, HIERARCHYLEVEL$0);
        }
    }
    
    /**
     * Sets ith "hierarchyLevel" element
     */
    public void setHierarchyLevelArray(int i, de.lendholt.geo.wps.gcap.x12.HierarchyLevelType hierarchyLevel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.lendholt.geo.wps.gcap.x12.HierarchyLevelType target = null;
            target = (de.lendholt.geo.wps.gcap.x12.HierarchyLevelType)get_store().find_element_user(HIERARCHYLEVEL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(hierarchyLevel);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "hierarchyLevel" element
     */
    public de.lendholt.geo.wps.gcap.x12.HierarchyLevelType insertNewHierarchyLevel(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.lendholt.geo.wps.gcap.x12.HierarchyLevelType target = null;
            target = (de.lendholt.geo.wps.gcap.x12.HierarchyLevelType)get_store().insert_element_user(HIERARCHYLEVEL$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "hierarchyLevel" element
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
    
    /**
     * Removes the ith "hierarchyLevel" element
     */
    public void removeHierarchyLevel(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HIERARCHYLEVEL$0, i);
        }
    }
}
