/*
 * XML Type:  hierarchyLevelType
 * Namespace: http://lendholt.de/geo/wps/gcap/1.2
 * Java type: de.lendholt.geo.wps.gcap.x12.HierarchyLevelType
 *
 * Automatically generated - do not modify.
 */
package de.lendholt.geo.wps.gcap.x12.impl;
/**
 * An XML hierarchyLevelType(@http://lendholt.de/geo/wps/gcap/1.2).
 *
 * This is a complex type.
 */
public class HierarchyLevelTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.lendholt.geo.wps.gcap.x12.HierarchyLevelType
{
    private static final long serialVersionUID = 1L;
    
    public HierarchyLevelTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REALNAME$0 = 
        new javax.xml.namespace.QName("http://lendholt.de/geo/wps/gcap/1.2", "realName");
    private static final javax.xml.namespace.QName PRIMARYGEOCODESTANDARD$2 = 
        new javax.xml.namespace.QName("http://lendholt.de/geo/wps/gcap/1.2", "primaryGeocodeStandard");
    private static final javax.xml.namespace.QName GEOCODESTANDARD$4 = 
        new javax.xml.namespace.QName("http://lendholt.de/geo/wps/gcap/1.2", "geocodeStandard");
    private static final javax.xml.namespace.QName LEVEL$6 = 
        new javax.xml.namespace.QName("", "level");
    private static final javax.xml.namespace.QName NAME$8 = 
        new javax.xml.namespace.QName("", "name");
    
    
    /**
     * Gets the "realName" element
     */
    public java.lang.String getRealName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REALNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "realName" element
     */
    public de.lendholt.geo.wps.gcap.x12.NotEmptyNMTOKEN xgetRealName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.lendholt.geo.wps.gcap.x12.NotEmptyNMTOKEN target = null;
            target = (de.lendholt.geo.wps.gcap.x12.NotEmptyNMTOKEN)get_store().find_element_user(REALNAME$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "realName" element
     */
    public boolean isSetRealName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REALNAME$0) != 0;
        }
    }
    
    /**
     * Sets the "realName" element
     */
    public void setRealName(java.lang.String realName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REALNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REALNAME$0);
            }
            target.setStringValue(realName);
        }
    }
    
    /**
     * Sets (as xml) the "realName" element
     */
    public void xsetRealName(de.lendholt.geo.wps.gcap.x12.NotEmptyNMTOKEN realName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.lendholt.geo.wps.gcap.x12.NotEmptyNMTOKEN target = null;
            target = (de.lendholt.geo.wps.gcap.x12.NotEmptyNMTOKEN)get_store().find_element_user(REALNAME$0, 0);
            if (target == null)
            {
                target = (de.lendholt.geo.wps.gcap.x12.NotEmptyNMTOKEN)get_store().add_element_user(REALNAME$0);
            }
            target.set(realName);
        }
    }
    
    /**
     * Unsets the "realName" element
     */
    public void unsetRealName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REALNAME$0, 0);
        }
    }
    
    /**
     * Gets the "primaryGeocodeStandard" element
     */
    public java.lang.String getPrimaryGeocodeStandard()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIMARYGEOCODESTANDARD$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "primaryGeocodeStandard" element
     */
    public de.lendholt.geo.wps.gcap.x12.NotEmptyNMTOKEN xgetPrimaryGeocodeStandard()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.lendholt.geo.wps.gcap.x12.NotEmptyNMTOKEN target = null;
            target = (de.lendholt.geo.wps.gcap.x12.NotEmptyNMTOKEN)get_store().find_element_user(PRIMARYGEOCODESTANDARD$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "primaryGeocodeStandard" element
     */
    public boolean isSetPrimaryGeocodeStandard()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRIMARYGEOCODESTANDARD$2) != 0;
        }
    }
    
    /**
     * Sets the "primaryGeocodeStandard" element
     */
    public void setPrimaryGeocodeStandard(java.lang.String primaryGeocodeStandard)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIMARYGEOCODESTANDARD$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRIMARYGEOCODESTANDARD$2);
            }
            target.setStringValue(primaryGeocodeStandard);
        }
    }
    
    /**
     * Sets (as xml) the "primaryGeocodeStandard" element
     */
    public void xsetPrimaryGeocodeStandard(de.lendholt.geo.wps.gcap.x12.NotEmptyNMTOKEN primaryGeocodeStandard)
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.lendholt.geo.wps.gcap.x12.NotEmptyNMTOKEN target = null;
            target = (de.lendholt.geo.wps.gcap.x12.NotEmptyNMTOKEN)get_store().find_element_user(PRIMARYGEOCODESTANDARD$2, 0);
            if (target == null)
            {
                target = (de.lendholt.geo.wps.gcap.x12.NotEmptyNMTOKEN)get_store().add_element_user(PRIMARYGEOCODESTANDARD$2);
            }
            target.set(primaryGeocodeStandard);
        }
    }
    
    /**
     * Unsets the "primaryGeocodeStandard" element
     */
    public void unsetPrimaryGeocodeStandard()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRIMARYGEOCODESTANDARD$2, 0);
        }
    }
    
    /**
     * Gets array of all "geocodeStandard" elements
     */
    public java.lang.String[] getGeocodeStandardArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GEOCODESTANDARD$4, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "geocodeStandard" element
     */
    public java.lang.String getGeocodeStandardArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GEOCODESTANDARD$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "geocodeStandard" elements
     */
    public de.lendholt.geo.wps.gcap.x12.NotEmptyNMTOKEN[] xgetGeocodeStandardArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GEOCODESTANDARD$4, targetList);
            de.lendholt.geo.wps.gcap.x12.NotEmptyNMTOKEN[] result = new de.lendholt.geo.wps.gcap.x12.NotEmptyNMTOKEN[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "geocodeStandard" element
     */
    public de.lendholt.geo.wps.gcap.x12.NotEmptyNMTOKEN xgetGeocodeStandardArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.lendholt.geo.wps.gcap.x12.NotEmptyNMTOKEN target = null;
            target = (de.lendholt.geo.wps.gcap.x12.NotEmptyNMTOKEN)get_store().find_element_user(GEOCODESTANDARD$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (de.lendholt.geo.wps.gcap.x12.NotEmptyNMTOKEN)target;
        }
    }
    
    /**
     * Returns number of "geocodeStandard" element
     */
    public int sizeOfGeocodeStandardArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GEOCODESTANDARD$4);
        }
    }
    
    /**
     * Sets array of all "geocodeStandard" element
     */
    public void setGeocodeStandardArray(java.lang.String[] geocodeStandardArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(geocodeStandardArray, GEOCODESTANDARD$4);
        }
    }
    
    /**
     * Sets ith "geocodeStandard" element
     */
    public void setGeocodeStandardArray(int i, java.lang.String geocodeStandard)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GEOCODESTANDARD$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(geocodeStandard);
        }
    }
    
    /**
     * Sets (as xml) array of all "geocodeStandard" element
     */
    public void xsetGeocodeStandardArray(de.lendholt.geo.wps.gcap.x12.NotEmptyNMTOKEN[]geocodeStandardArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(geocodeStandardArray, GEOCODESTANDARD$4);
        }
    }
    
    /**
     * Sets (as xml) ith "geocodeStandard" element
     */
    public void xsetGeocodeStandardArray(int i, de.lendholt.geo.wps.gcap.x12.NotEmptyNMTOKEN geocodeStandard)
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.lendholt.geo.wps.gcap.x12.NotEmptyNMTOKEN target = null;
            target = (de.lendholt.geo.wps.gcap.x12.NotEmptyNMTOKEN)get_store().find_element_user(GEOCODESTANDARD$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(geocodeStandard);
        }
    }
    
    /**
     * Inserts the value as the ith "geocodeStandard" element
     */
    public void insertGeocodeStandard(int i, java.lang.String geocodeStandard)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(GEOCODESTANDARD$4, i);
            target.setStringValue(geocodeStandard);
        }
    }
    
    /**
     * Appends the value as the last "geocodeStandard" element
     */
    public void addGeocodeStandard(java.lang.String geocodeStandard)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GEOCODESTANDARD$4);
            target.setStringValue(geocodeStandard);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "geocodeStandard" element
     */
    public de.lendholt.geo.wps.gcap.x12.NotEmptyNMTOKEN insertNewGeocodeStandard(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.lendholt.geo.wps.gcap.x12.NotEmptyNMTOKEN target = null;
            target = (de.lendholt.geo.wps.gcap.x12.NotEmptyNMTOKEN)get_store().insert_element_user(GEOCODESTANDARD$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "geocodeStandard" element
     */
    public de.lendholt.geo.wps.gcap.x12.NotEmptyNMTOKEN addNewGeocodeStandard()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.lendholt.geo.wps.gcap.x12.NotEmptyNMTOKEN target = null;
            target = (de.lendholt.geo.wps.gcap.x12.NotEmptyNMTOKEN)get_store().add_element_user(GEOCODESTANDARD$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "geocodeStandard" element
     */
    public void removeGeocodeStandard(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GEOCODESTANDARD$4, i);
        }
    }
    
    /**
     * Gets the "level" attribute
     */
    public byte getLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LEVEL$6);
            if (target == null)
            {
                return 0;
            }
            return target.getByteValue();
        }
    }
    
    /**
     * Gets (as xml) the "level" attribute
     */
    public de.lendholt.geo.wps.gcap.x12.GeocodeLevelType xgetLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.lendholt.geo.wps.gcap.x12.GeocodeLevelType target = null;
            target = (de.lendholt.geo.wps.gcap.x12.GeocodeLevelType)get_store().find_attribute_user(LEVEL$6);
            return target;
        }
    }
    
    /**
     * Sets the "level" attribute
     */
    public void setLevel(byte level)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LEVEL$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LEVEL$6);
            }
            target.setByteValue(level);
        }
    }
    
    /**
     * Sets (as xml) the "level" attribute
     */
    public void xsetLevel(de.lendholt.geo.wps.gcap.x12.GeocodeLevelType level)
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.lendholt.geo.wps.gcap.x12.GeocodeLevelType target = null;
            target = (de.lendholt.geo.wps.gcap.x12.GeocodeLevelType)get_store().find_attribute_user(LEVEL$6);
            if (target == null)
            {
                target = (de.lendholt.geo.wps.gcap.x12.GeocodeLevelType)get_store().add_attribute_user(LEVEL$6);
            }
            target.set(level);
        }
    }
    
    /**
     * Gets the "name" attribute
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" attribute
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$8);
            return target;
        }
    }
    
    /**
     * Sets the "name" attribute
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$8);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" attribute
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$8);
            }
            target.set(name);
        }
    }
}
