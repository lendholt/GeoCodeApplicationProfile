/*
 * An XML document type.
 * Localname: entity
 * Namespace: http://lendholt.de/geo/wps/gcap/1.2
 * Java type: de.lendholt.geo.wps.gcap.x12.EntityDocument
 *
 * Automatically generated - do not modify.
 */
package de.lendholt.geo.wps.gcap.x12.impl;
/**
 * A document containing one entity(@http://lendholt.de/geo/wps/gcap/1.2) element.
 *
 * This is a complex type.
 */
public class EntityDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.lendholt.geo.wps.gcap.x12.EntityDocument
{
    private static final long serialVersionUID = 1L;
    
    public EntityDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITY$0 = 
        new javax.xml.namespace.QName("http://lendholt.de/geo/wps/gcap/1.2", "entity");
    
    
    /**
     * Gets the "entity" element
     */
    public de.lendholt.geo.wps.gcap.x12.EntityType getEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.lendholt.geo.wps.gcap.x12.EntityType target = null;
            target = (de.lendholt.geo.wps.gcap.x12.EntityType)get_store().find_element_user(ENTITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "entity" element
     */
    public void setEntity(de.lendholt.geo.wps.gcap.x12.EntityType entity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.lendholt.geo.wps.gcap.x12.EntityType target = null;
            target = (de.lendholt.geo.wps.gcap.x12.EntityType)get_store().find_element_user(ENTITY$0, 0);
            if (target == null)
            {
                target = (de.lendholt.geo.wps.gcap.x12.EntityType)get_store().add_element_user(ENTITY$0);
            }
            target.set(entity);
        }
    }
    
    /**
     * Appends and returns a new empty "entity" element
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
}
