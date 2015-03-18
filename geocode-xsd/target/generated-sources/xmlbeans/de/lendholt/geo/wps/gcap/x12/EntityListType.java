/*
 * XML Type:  entityListType
 * Namespace: http://lendholt.de/geo/wps/gcap/1.2
 * Java type: de.lendholt.geo.wps.gcap.x12.EntityListType
 *
 * Automatically generated - do not modify.
 */
package de.lendholt.geo.wps.gcap.x12;


/**
 * An XML entityListType(@http://lendholt.de/geo/wps/gcap/1.2).
 *
 * This is a complex type.
 */
public interface EntityListType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EntityListType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s69B72B270930B05B1DA6A63CC9E85F7E").resolveHandle("entitylisttype84f8type");
    
    /**
     * Gets array of all "entity" elements
     */
    de.lendholt.geo.wps.gcap.x12.EntityType[] getEntityArray();
    
    /**
     * Gets ith "entity" element
     */
    de.lendholt.geo.wps.gcap.x12.EntityType getEntityArray(int i);
    
    /**
     * Returns number of "entity" element
     */
    int sizeOfEntityArray();
    
    /**
     * Sets array of all "entity" element
     */
    void setEntityArray(de.lendholt.geo.wps.gcap.x12.EntityType[] entityArray);
    
    /**
     * Sets ith "entity" element
     */
    void setEntityArray(int i, de.lendholt.geo.wps.gcap.x12.EntityType entity);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "entity" element
     */
    de.lendholt.geo.wps.gcap.x12.EntityType insertNewEntity(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "entity" element
     */
    de.lendholt.geo.wps.gcap.x12.EntityType addNewEntity();
    
    /**
     * Removes the ith "entity" element
     */
    void removeEntity(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static de.lendholt.geo.wps.gcap.x12.EntityListType newInstance() {
          return (de.lendholt.geo.wps.gcap.x12.EntityListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static de.lendholt.geo.wps.gcap.x12.EntityListType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (de.lendholt.geo.wps.gcap.x12.EntityListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static de.lendholt.geo.wps.gcap.x12.EntityListType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (de.lendholt.geo.wps.gcap.x12.EntityListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static de.lendholt.geo.wps.gcap.x12.EntityListType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.lendholt.geo.wps.gcap.x12.EntityListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static de.lendholt.geo.wps.gcap.x12.EntityListType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.lendholt.geo.wps.gcap.x12.EntityListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static de.lendholt.geo.wps.gcap.x12.EntityListType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.lendholt.geo.wps.gcap.x12.EntityListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static de.lendholt.geo.wps.gcap.x12.EntityListType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.lendholt.geo.wps.gcap.x12.EntityListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static de.lendholt.geo.wps.gcap.x12.EntityListType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.lendholt.geo.wps.gcap.x12.EntityListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static de.lendholt.geo.wps.gcap.x12.EntityListType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.lendholt.geo.wps.gcap.x12.EntityListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static de.lendholt.geo.wps.gcap.x12.EntityListType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.lendholt.geo.wps.gcap.x12.EntityListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static de.lendholt.geo.wps.gcap.x12.EntityListType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.lendholt.geo.wps.gcap.x12.EntityListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static de.lendholt.geo.wps.gcap.x12.EntityListType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.lendholt.geo.wps.gcap.x12.EntityListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static de.lendholt.geo.wps.gcap.x12.EntityListType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (de.lendholt.geo.wps.gcap.x12.EntityListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static de.lendholt.geo.wps.gcap.x12.EntityListType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.lendholt.geo.wps.gcap.x12.EntityListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static de.lendholt.geo.wps.gcap.x12.EntityListType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (de.lendholt.geo.wps.gcap.x12.EntityListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static de.lendholt.geo.wps.gcap.x12.EntityListType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.lendholt.geo.wps.gcap.x12.EntityListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static de.lendholt.geo.wps.gcap.x12.EntityListType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (de.lendholt.geo.wps.gcap.x12.EntityListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static de.lendholt.geo.wps.gcap.x12.EntityListType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (de.lendholt.geo.wps.gcap.x12.EntityListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}