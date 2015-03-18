/*
 * XML Type:  entityWithChildrenType
 * Namespace: http://lendholt.de/geo/wps/gcap/1.2
 * Java type: de.lendholt.geo.wps.gcap.x12.EntityWithChildrenType
 *
 * Automatically generated - do not modify.
 */
package de.lendholt.geo.wps.gcap.x12.impl;
/**
 * An XML entityWithChildrenType(@http://lendholt.de/geo/wps/gcap/1.2).
 *
 * This is a complex type.
 */
public class EntityWithChildrenTypeImpl extends de.lendholt.geo.wps.gcap.x12.impl.EntityTypeImpl implements de.lendholt.geo.wps.gcap.x12.EntityWithChildrenType
{
    private static final long serialVersionUID = 1L;
    
    public EntityWithChildrenTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CHILDREN$0 = 
        new javax.xml.namespace.QName("http://lendholt.de/geo/wps/gcap/1.2", "children");
    
    
    /**
     * Gets the "children" element
     */
    public de.lendholt.geo.wps.gcap.x12.EntityWithChildrenType.Children getChildren()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.lendholt.geo.wps.gcap.x12.EntityWithChildrenType.Children target = null;
            target = (de.lendholt.geo.wps.gcap.x12.EntityWithChildrenType.Children)get_store().find_element_user(CHILDREN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "children" element
     */
    public void setChildren(de.lendholt.geo.wps.gcap.x12.EntityWithChildrenType.Children children)
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.lendholt.geo.wps.gcap.x12.EntityWithChildrenType.Children target = null;
            target = (de.lendholt.geo.wps.gcap.x12.EntityWithChildrenType.Children)get_store().find_element_user(CHILDREN$0, 0);
            if (target == null)
            {
                target = (de.lendholt.geo.wps.gcap.x12.EntityWithChildrenType.Children)get_store().add_element_user(CHILDREN$0);
            }
            target.set(children);
        }
    }
    
    /**
     * Appends and returns a new empty "children" element
     */
    public de.lendholt.geo.wps.gcap.x12.EntityWithChildrenType.Children addNewChildren()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.lendholt.geo.wps.gcap.x12.EntityWithChildrenType.Children target = null;
            target = (de.lendholt.geo.wps.gcap.x12.EntityWithChildrenType.Children)get_store().add_element_user(CHILDREN$0);
            return target;
        }
    }
    /**
     * An XML children(@http://lendholt.de/geo/wps/gcap/1.2).
     *
     * This is a complex type.
     */
    public static class ChildrenImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.lendholt.geo.wps.gcap.x12.EntityWithChildrenType.Children
    {
        private static final long serialVersionUID = 1L;
        
        public ChildrenImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CHILD$0 = 
            new javax.xml.namespace.QName("http://lendholt.de/geo/wps/gcap/1.2", "child");
        
        
        /**
         * Gets array of all "child" elements
         */
        public de.lendholt.geo.wps.gcap.x12.EntityWithChildrenType[] getChildArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CHILD$0, targetList);
                de.lendholt.geo.wps.gcap.x12.EntityWithChildrenType[] result = new de.lendholt.geo.wps.gcap.x12.EntityWithChildrenType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "child" element
         */
        public de.lendholt.geo.wps.gcap.x12.EntityWithChildrenType getChildArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.lendholt.geo.wps.gcap.x12.EntityWithChildrenType target = null;
                target = (de.lendholt.geo.wps.gcap.x12.EntityWithChildrenType)get_store().find_element_user(CHILD$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "child" element
         */
        public int sizeOfChildArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CHILD$0);
            }
        }
        
        /**
         * Sets array of all "child" element
         */
        public void setChildArray(de.lendholt.geo.wps.gcap.x12.EntityWithChildrenType[] childArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(childArray, CHILD$0);
            }
        }
        
        /**
         * Sets ith "child" element
         */
        public void setChildArray(int i, de.lendholt.geo.wps.gcap.x12.EntityWithChildrenType child)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.lendholt.geo.wps.gcap.x12.EntityWithChildrenType target = null;
                target = (de.lendholt.geo.wps.gcap.x12.EntityWithChildrenType)get_store().find_element_user(CHILD$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(child);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "child" element
         */
        public de.lendholt.geo.wps.gcap.x12.EntityWithChildrenType insertNewChild(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.lendholt.geo.wps.gcap.x12.EntityWithChildrenType target = null;
                target = (de.lendholt.geo.wps.gcap.x12.EntityWithChildrenType)get_store().insert_element_user(CHILD$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "child" element
         */
        public de.lendholt.geo.wps.gcap.x12.EntityWithChildrenType addNewChild()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.lendholt.geo.wps.gcap.x12.EntityWithChildrenType target = null;
                target = (de.lendholt.geo.wps.gcap.x12.EntityWithChildrenType)get_store().add_element_user(CHILD$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "child" element
         */
        public void removeChild(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CHILD$0, i);
            }
        }
    }
}
