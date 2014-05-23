/*
 * XML Type:  entityListType
 * Namespace: http://lendholt.de/geo/wps/gcap/1.2
 * Java type: de.lendholt.geo.wps.gcap.x12.EntityListType
 *
 * Automatically generated - do not modify.
 */
package de.lendholt.geo.wps.gcap.x12.impl;
/**
 * An XML entityListType(@http://lendholt.de/geo/wps/gcap/1.2).
 *
 * This is a complex type.
 */
public class EntityListTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.lendholt.geo.wps.gcap.x12.EntityListType
{
    private static final long serialVersionUID = 1L;
    
    public EntityListTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITY$0 = 
        new javax.xml.namespace.QName("http://lendholt.de/geo/wps/gcap/1.2", "entity");
    
    
    /**
     * Gets array of all "entity" elements
     */
    public de.lendholt.geo.wps.gcap.x12.EntityType[] getEntityArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ENTITY$0, targetList);
            de.lendholt.geo.wps.gcap.x12.EntityType[] result = new de.lendholt.geo.wps.gcap.x12.EntityType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "entity" element
     */
    public de.lendholt.geo.wps.gcap.x12.EntityType getEntityArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.lendholt.geo.wps.gcap.x12.EntityType target = null;
            target = (de.lendholt.geo.wps.gcap.x12.EntityType)get_store().find_element_user(ENTITY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "entity" element
     */
    public int sizeOfEntityArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENTITY$0);
        }
    }
    
    /**
     * Sets array of all "entity" element
     */
    public void setEntityArray(de.lendholt.geo.wps.gcap.x12.EntityType[] entityArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(entityArray, ENTITY$0);
        }
    }
    
    /**
     * Sets ith "entity" element
     */
    public void setEntityArray(int i, de.lendholt.geo.wps.gcap.x12.EntityType entity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.lendholt.geo.wps.gcap.x12.EntityType target = null;
            target = (de.lendholt.geo.wps.gcap.x12.EntityType)get_store().find_element_user(ENTITY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(entity);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "entity" element
     */
    public de.lendholt.geo.wps.gcap.x12.EntityType insertNewEntity(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.lendholt.geo.wps.gcap.x12.EntityType target = null;
            target = (de.lendholt.geo.wps.gcap.x12.EntityType)get_store().insert_element_user(ENTITY$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "entity" element
     */
    public de.lendholt.geo.wps.gcap.x12.EntityType addNewEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.lendholt.geo.wps.gcap.x12.EntityType target = null;
            target = (de.lendholt.geo.wps.gcap.x12.EntityType)get_store().add_element_user(ENTITY$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "entity" element
     */
    public void removeEntity(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENTITY$0, i);
        }
    }
}
