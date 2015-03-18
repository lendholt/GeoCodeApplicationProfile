/*
 * XML Type:  hierarchyLevelType
 * Namespace: http://lendholt.de/geo/wps/gcap/1.2
 * Java type: de.lendholt.geo.wps.gcap.x12.HierarchyLevelType
 *
 * Automatically generated - do not modify.
 */
package de.lendholt.geo.wps.gcap.x12;


/**
 * An XML hierarchyLevelType(@http://lendholt.de/geo/wps/gcap/1.2).
 *
 * This is a complex type.
 */
public interface HierarchyLevelType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(HierarchyLevelType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s69B72B270930B05B1DA6A63CC9E85F7E").resolveHandle("hierarchyleveltyped5a6type");
    
    /**
     * Gets the "realName" element
     */
    java.lang.String getRealName();
    
    /**
     * Gets (as xml) the "realName" element
     */
    de.lendholt.geo.wps.gcap.x12.NotEmptyNMTOKEN xgetRealName();
    
    /**
     * True if has "realName" element
     */
    boolean isSetRealName();
    
    /**
     * Sets the "realName" element
     */
    void setRealName(java.lang.String realName);
    
    /**
     * Sets (as xml) the "realName" element
     */
    void xsetRealName(de.lendholt.geo.wps.gcap.x12.NotEmptyNMTOKEN realName);
    
    /**
     * Unsets the "realName" element
     */
    void unsetRealName();
    
    /**
     * Gets the "primaryGeocodeStandard" element
     */
    java.lang.String getPrimaryGeocodeStandard();
    
    /**
     * Gets (as xml) the "primaryGeocodeStandard" element
     */
    de.lendholt.geo.wps.gcap.x12.NotEmptyNMTOKEN xgetPrimaryGeocodeStandard();
    
    /**
     * True if has "primaryGeocodeStandard" element
     */
    boolean isSetPrimaryGeocodeStandard();
    
    /**
     * Sets the "primaryGeocodeStandard" element
     */
    void setPrimaryGeocodeStandard(java.lang.String primaryGeocodeStandard);
    
    /**
     * Sets (as xml) the "primaryGeocodeStandard" element
     */
    void xsetPrimaryGeocodeStandard(de.lendholt.geo.wps.gcap.x12.NotEmptyNMTOKEN primaryGeocodeStandard);
    
    /**
     * Unsets the "primaryGeocodeStandard" element
     */
    void unsetPrimaryGeocodeStandard();
    
    /**
     * Gets array of all "geocodeStandard" elements
     */
    java.lang.String[] getGeocodeStandardArray();
    
    /**
     * Gets ith "geocodeStandard" element
     */
    java.lang.String getGeocodeStandardArray(int i);
    
    /**
     * Gets (as xml) array of all "geocodeStandard" elements
     */
    de.lendholt.geo.wps.gcap.x12.NotEmptyNMTOKEN[] xgetGeocodeStandardArray();
    
    /**
     * Gets (as xml) ith "geocodeStandard" element
     */
    de.lendholt.geo.wps.gcap.x12.NotEmptyNMTOKEN xgetGeocodeStandardArray(int i);
    
    /**
     * Returns number of "geocodeStandard" element
     */
    int sizeOfGeocodeStandardArray();
    
    /**
     * Sets array of all "geocodeStandard" element
     */
    void setGeocodeStandardArray(java.lang.String[] geocodeStandardArray);
    
    /**
     * Sets ith "geocodeStandard" element
     */
    void setGeocodeStandardArray(int i, java.lang.String geocodeStandard);
    
    /**
     * Sets (as xml) array of all "geocodeStandard" element
     */
    void xsetGeocodeStandardArray(de.lendholt.geo.wps.gcap.x12.NotEmptyNMTOKEN[] geocodeStandardArray);
    
    /**
     * Sets (as xml) ith "geocodeStandard" element
     */
    void xsetGeocodeStandardArray(int i, de.lendholt.geo.wps.gcap.x12.NotEmptyNMTOKEN geocodeStandard);
    
    /**
     * Inserts the value as the ith "geocodeStandard" element
     */
    void insertGeocodeStandard(int i, java.lang.String geocodeStandard);
    
    /**
     * Appends the value as the last "geocodeStandard" element
     */
    void addGeocodeStandard(java.lang.String geocodeStandard);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "geocodeStandard" element
     */
    de.lendholt.geo.wps.gcap.x12.NotEmptyNMTOKEN insertNewGeocodeStandard(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "geocodeStandard" element
     */
    de.lendholt.geo.wps.gcap.x12.NotEmptyNMTOKEN addNewGeocodeStandard();
    
    /**
     * Removes the ith "geocodeStandard" element
     */
    void removeGeocodeStandard(int i);
    
    /**
     * Gets the "level" attribute
     */
    byte getLevel();
    
    /**
     * Gets (as xml) the "level" attribute
     */
    de.lendholt.geo.wps.gcap.x12.GeocodeLevelType xgetLevel();
    
    /**
     * Sets the "level" attribute
     */
    void setLevel(byte level);
    
    /**
     * Sets (as xml) the "level" attribute
     */
    void xsetLevel(de.lendholt.geo.wps.gcap.x12.GeocodeLevelType level);
    
    /**
     * Gets the "name" attribute
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "name" attribute
     */
    org.apache.xmlbeans.XmlString xgetName();
    
    /**
     * Sets the "name" attribute
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "name" attribute
     */
    void xsetName(org.apache.xmlbeans.XmlString name);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static de.lendholt.geo.wps.gcap.x12.HierarchyLevelType newInstance() {
          return (de.lendholt.geo.wps.gcap.x12.HierarchyLevelType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static de.lendholt.geo.wps.gcap.x12.HierarchyLevelType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (de.lendholt.geo.wps.gcap.x12.HierarchyLevelType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static de.lendholt.geo.wps.gcap.x12.HierarchyLevelType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (de.lendholt.geo.wps.gcap.x12.HierarchyLevelType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static de.lendholt.geo.wps.gcap.x12.HierarchyLevelType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.lendholt.geo.wps.gcap.x12.HierarchyLevelType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static de.lendholt.geo.wps.gcap.x12.HierarchyLevelType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.lendholt.geo.wps.gcap.x12.HierarchyLevelType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static de.lendholt.geo.wps.gcap.x12.HierarchyLevelType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.lendholt.geo.wps.gcap.x12.HierarchyLevelType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static de.lendholt.geo.wps.gcap.x12.HierarchyLevelType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.lendholt.geo.wps.gcap.x12.HierarchyLevelType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static de.lendholt.geo.wps.gcap.x12.HierarchyLevelType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.lendholt.geo.wps.gcap.x12.HierarchyLevelType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static de.lendholt.geo.wps.gcap.x12.HierarchyLevelType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.lendholt.geo.wps.gcap.x12.HierarchyLevelType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static de.lendholt.geo.wps.gcap.x12.HierarchyLevelType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.lendholt.geo.wps.gcap.x12.HierarchyLevelType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static de.lendholt.geo.wps.gcap.x12.HierarchyLevelType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.lendholt.geo.wps.gcap.x12.HierarchyLevelType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static de.lendholt.geo.wps.gcap.x12.HierarchyLevelType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.lendholt.geo.wps.gcap.x12.HierarchyLevelType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static de.lendholt.geo.wps.gcap.x12.HierarchyLevelType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (de.lendholt.geo.wps.gcap.x12.HierarchyLevelType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static de.lendholt.geo.wps.gcap.x12.HierarchyLevelType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.lendholt.geo.wps.gcap.x12.HierarchyLevelType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static de.lendholt.geo.wps.gcap.x12.HierarchyLevelType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (de.lendholt.geo.wps.gcap.x12.HierarchyLevelType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static de.lendholt.geo.wps.gcap.x12.HierarchyLevelType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.lendholt.geo.wps.gcap.x12.HierarchyLevelType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static de.lendholt.geo.wps.gcap.x12.HierarchyLevelType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (de.lendholt.geo.wps.gcap.x12.HierarchyLevelType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static de.lendholt.geo.wps.gcap.x12.HierarchyLevelType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (de.lendholt.geo.wps.gcap.x12.HierarchyLevelType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
