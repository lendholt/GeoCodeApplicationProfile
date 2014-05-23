/*
 * An XML document type.
 * Localname: entityList
 * Namespace: http://lendholt.de/geo/wps/gcap/1.2
 * Java type: de.lendholt.geo.wps.gcap.x12.EntityListDocument
 *
 * Automatically generated - do not modify.
 */
package de.lendholt.geo.wps.gcap.x12.impl;
/**
 * A document containing one entityList(@http://lendholt.de/geo/wps/gcap/1.2) element.
 *
 * This is a complex type.
 */
public class EntityListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.lendholt.geo.wps.gcap.x12.EntityListDocument
{
    private static final long serialVersionUID = 1L;
    
    public EntityListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITYLIST$0 = 
        new javax.xml.namespace.QName("http://lendholt.de/geo/wps/gcap/1.2", "entityList");
    
    
    /**
     * Gets the "entityList" element
     */
    public de.lendholt.geo.wps.gcap.x12.EntityListType getEntityList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.lendholt.geo.wps.gcap.x12.EntityListType target = null;
            target = (de.lendholt.geo.wps.gcap.x12.EntityListType)get_store().find_element_user(ENTITYLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "entityList" element
     */
    public void setEntityList(de.lendholt.geo.wps.gcap.x12.EntityListType entityList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.lendholt.geo.wps.gcap.x12.EntityListType target = null;
            target = (de.lendholt.geo.wps.gcap.x12.EntityListType)get_store().find_element_user(ENTITYLIST$0, 0);
            if (target == null)
            {
                target = (de.lendholt.geo.wps.gcap.x12.EntityListType)get_store().add_element_user(ENTITYLIST$0);
            }
            target.set(entityList);
        }
    }
    
    /**
     * Appends and returns a new empty "entityList" element
     */
    public de.lendholt.geo.wps.gcap.x12.EntityListType addNewEntityList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.lendholt.geo.wps.gcap.x12.EntityListType target = null;
            target = (de.lendholt.geo.wps.gcap.x12.EntityListType)get_store().add_element_user(ENTITYLIST$0);
            return target;
        }
    }
}
