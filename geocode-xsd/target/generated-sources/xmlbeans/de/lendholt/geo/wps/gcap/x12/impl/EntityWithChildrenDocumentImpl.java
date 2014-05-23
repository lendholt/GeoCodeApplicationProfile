/*
 * An XML document type.
 * Localname: entityWithChildren
 * Namespace: http://lendholt.de/geo/wps/gcap/1.2
 * Java type: de.lendholt.geo.wps.gcap.x12.EntityWithChildrenDocument
 *
 * Automatically generated - do not modify.
 */
package de.lendholt.geo.wps.gcap.x12.impl;
/**
 * A document containing one entityWithChildren(@http://lendholt.de/geo/wps/gcap/1.2) element.
 *
 * This is a complex type.
 */
public class EntityWithChildrenDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.lendholt.geo.wps.gcap.x12.EntityWithChildrenDocument
{
    private static final long serialVersionUID = 1L;
    
    public EntityWithChildrenDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITYWITHCHILDREN$0 = 
        new javax.xml.namespace.QName("http://lendholt.de/geo/wps/gcap/1.2", "entityWithChildren");
    
    
    /**
     * Gets the "entityWithChildren" element
     */
    public de.lendholt.geo.wps.gcap.x12.EntityWithChildrenType getEntityWithChildren()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.lendholt.geo.wps.gcap.x12.EntityWithChildrenType target = null;
            target = (de.lendholt.geo.wps.gcap.x12.EntityWithChildrenType)get_store().find_element_user(ENTITYWITHCHILDREN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "entityWithChildren" element
     */
    public void setEntityWithChildren(de.lendholt.geo.wps.gcap.x12.EntityWithChildrenType entityWithChildren)
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.lendholt.geo.wps.gcap.x12.EntityWithChildrenType target = null;
            target = (de.lendholt.geo.wps.gcap.x12.EntityWithChildrenType)get_store().find_element_user(ENTITYWITHCHILDREN$0, 0);
            if (target == null)
            {
                target = (de.lendholt.geo.wps.gcap.x12.EntityWithChildrenType)get_store().add_element_user(ENTITYWITHCHILDREN$0);
            }
            target.set(entityWithChildren);
        }
    }
    
    /**
     * Appends and returns a new empty "entityWithChildren" element
     */
    public de.lendholt.geo.wps.gcap.x12.EntityWithChildrenType addNewEntityWithChildren()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.lendholt.geo.wps.gcap.x12.EntityWithChildrenType target = null;
            target = (de.lendholt.geo.wps.gcap.x12.EntityWithChildrenType)get_store().add_element_user(ENTITYWITHCHILDREN$0);
            return target;
        }
    }
}
