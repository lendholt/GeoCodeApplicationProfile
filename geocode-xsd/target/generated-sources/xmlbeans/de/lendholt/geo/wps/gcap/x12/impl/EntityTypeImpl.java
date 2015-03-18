/*
 * XML Type:  entityType
 * Namespace: http://lendholt.de/geo/wps/gcap/1.2
 * Java type: de.lendholt.geo.wps.gcap.x12.EntityType
 *
 * Automatically generated - do not modify.
 */
package de.lendholt.geo.wps.gcap.x12.impl;
/**
 * An XML entityType(@http://lendholt.de/geo/wps/gcap/1.2).
 *
 * This is a complex type.
 */
public class EntityTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.lendholt.geo.wps.gcap.x12.EntityType
{
    private static final long serialVersionUID = 1L;
    
    public EntityTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRIMARYGEOCODE$0 = 
        new javax.xml.namespace.QName("http://lendholt.de/geo/wps/gcap/1.2", "primaryGeocode");
    private static final javax.xml.namespace.QName GEOCODE$2 = 
        new javax.xml.namespace.QName("http://lendholt.de/geo/wps/gcap/1.2", "geocode");
    
    
    /**
     * Gets the "primaryGeocode" element
     */
    public de.lendholt.geo.wps.gcap.x12.GeocodeType getPrimaryGeocode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.lendholt.geo.wps.gcap.x12.GeocodeType target = null;
            target = (de.lendholt.geo.wps.gcap.x12.GeocodeType)get_store().find_element_user(PRIMARYGEOCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "primaryGeocode" element
     */
    public boolean isSetPrimaryGeocode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRIMARYGEOCODE$0) != 0;
        }
    }
    
    /**
     * Sets the "primaryGeocode" element
     */
    public void setPrimaryGeocode(de.lendholt.geo.wps.gcap.x12.GeocodeType primaryGeocode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.lendholt.geo.wps.gcap.x12.GeocodeType target = null;
            target = (de.lendholt.geo.wps.gcap.x12.GeocodeType)get_store().find_element_user(PRIMARYGEOCODE$0, 0);
            if (target == null)
            {
                target = (de.lendholt.geo.wps.gcap.x12.GeocodeType)get_store().add_element_user(PRIMARYGEOCODE$0);
            }
            target.set(primaryGeocode);
        }
    }
    
    /**
     * Appends and returns a new empty "primaryGeocode" element
     */
    public de.lendholt.geo.wps.gcap.x12.GeocodeType addNewPrimaryGeocode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.lendholt.geo.wps.gcap.x12.GeocodeType target = null;
            target = (de.lendholt.geo.wps.gcap.x12.GeocodeType)get_store().add_element_user(PRIMARYGEOCODE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "primaryGeocode" element
     */
    public void unsetPrimaryGeocode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRIMARYGEOCODE$0, 0);
        }
    }
    
    /**
     * Gets array of all "geocode" elements
     */
    public de.lendholt.geo.wps.gcap.x12.GeocodeType[] getGeocodeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GEOCODE$2, targetList);
            de.lendholt.geo.wps.gcap.x12.GeocodeType[] result = new de.lendholt.geo.wps.gcap.x12.GeocodeType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "geocode" element
     */
    public de.lendholt.geo.wps.gcap.x12.GeocodeType getGeocodeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.lendholt.geo.wps.gcap.x12.GeocodeType target = null;
            target = (de.lendholt.geo.wps.gcap.x12.GeocodeType)get_store().find_element_user(GEOCODE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "geocode" element
     */
    public int sizeOfGeocodeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GEOCODE$2);
        }
    }
    
    /**
     * Sets array of all "geocode" element
     */
    public void setGeocodeArray(de.lendholt.geo.wps.gcap.x12.GeocodeType[] geocodeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(geocodeArray, GEOCODE$2);
        }
    }
    
    /**
     * Sets ith "geocode" element
     */
    public void setGeocodeArray(int i, de.lendholt.geo.wps.gcap.x12.GeocodeType geocode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.lendholt.geo.wps.gcap.x12.GeocodeType target = null;
            target = (de.lendholt.geo.wps.gcap.x12.GeocodeType)get_store().find_element_user(GEOCODE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(geocode);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "geocode" element
     */
    public de.lendholt.geo.wps.gcap.x12.GeocodeType insertNewGeocode(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.lendholt.geo.wps.gcap.x12.GeocodeType target = null;
            target = (de.lendholt.geo.wps.gcap.x12.GeocodeType)get_store().insert_element_user(GEOCODE$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "geocode" element
     */
    public de.lendholt.geo.wps.gcap.x12.GeocodeType addNewGeocode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.lendholt.geo.wps.gcap.x12.GeocodeType target = null;
            target = (de.lendholt.geo.wps.gcap.x12.GeocodeType)get_store().add_element_user(GEOCODE$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "geocode" element
     */
    public void removeGeocode(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GEOCODE$2, i);
        }
    }
}
