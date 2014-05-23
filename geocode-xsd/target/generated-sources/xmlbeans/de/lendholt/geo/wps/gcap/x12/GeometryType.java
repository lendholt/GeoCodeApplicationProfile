/*
 * XML Type:  geometryType
 * Namespace: http://lendholt.de/geo/wps/gcap/1.2
 * Java type: de.lendholt.geo.wps.gcap.x12.GeometryType
 *
 * Automatically generated - do not modify.
 */
package de.lendholt.geo.wps.gcap.x12;


/**
 * An XML geometryType(@http://lendholt.de/geo/wps/gcap/1.2).
 *
 * This is a complex type.
 */
public interface GeometryType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GeometryType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s69B72B270930B05B1DA6A63CC9E85F7E").resolveHandle("geometrytype3f89type");
    
    /**
     * Gets the "wkt" element
     */
    java.lang.String getWkt();
    
    /**
     * Gets (as xml) the "wkt" element
     */
    org.apache.xmlbeans.XmlString xgetWkt();
    
    /**
     * True if has "wkt" element
     */
    boolean isSetWkt();
    
    /**
     * Sets the "wkt" element
     */
    void setWkt(java.lang.String wkt);
    
    /**
     * Sets (as xml) the "wkt" element
     */
    void xsetWkt(org.apache.xmlbeans.XmlString wkt);
    
    /**
     * Unsets the "wkt" element
     */
    void unsetWkt();
    
    /**
     * Gets the "hexewkb" element
     */
    byte[] getHexewkb();
    
    /**
     * Gets (as xml) the "hexewkb" element
     */
    org.apache.xmlbeans.XmlHexBinary xgetHexewkb();
    
    /**
     * True if has "hexewkb" element
     */
    boolean isSetHexewkb();
    
    /**
     * Sets the "hexewkb" element
     */
    void setHexewkb(byte[] hexewkb);
    
    /**
     * Sets (as xml) the "hexewkb" element
     */
    void xsetHexewkb(org.apache.xmlbeans.XmlHexBinary hexewkb);
    
    /**
     * Unsets the "hexewkb" element
     */
    void unsetHexewkb();
    
    /**
     * Gets the "shapefile" element
     */
    byte[] getShapefile();
    
    /**
     * Gets (as xml) the "shapefile" element
     */
    org.apache.xmlbeans.XmlBase64Binary xgetShapefile();
    
    /**
     * True if has "shapefile" element
     */
    boolean isSetShapefile();
    
    /**
     * Sets the "shapefile" element
     */
    void setShapefile(byte[] shapefile);
    
    /**
     * Sets (as xml) the "shapefile" element
     */
    void xsetShapefile(org.apache.xmlbeans.XmlBase64Binary shapefile);
    
    /**
     * Unsets the "shapefile" element
     */
    void unsetShapefile();
    
    /**
     * Gets the "geojson" element
     */
    java.lang.String getGeojson();
    
    /**
     * Gets (as xml) the "geojson" element
     */
    org.apache.xmlbeans.XmlString xgetGeojson();
    
    /**
     * True if has "geojson" element
     */
    boolean isSetGeojson();
    
    /**
     * Sets the "geojson" element
     */
    void setGeojson(java.lang.String geojson);
    
    /**
     * Sets (as xml) the "geojson" element
     */
    void xsetGeojson(org.apache.xmlbeans.XmlString geojson);
    
    /**
     * Unsets the "geojson" element
     */
    void unsetGeojson();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static de.lendholt.geo.wps.gcap.x12.GeometryType newInstance() {
          return (de.lendholt.geo.wps.gcap.x12.GeometryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static de.lendholt.geo.wps.gcap.x12.GeometryType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (de.lendholt.geo.wps.gcap.x12.GeometryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static de.lendholt.geo.wps.gcap.x12.GeometryType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (de.lendholt.geo.wps.gcap.x12.GeometryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static de.lendholt.geo.wps.gcap.x12.GeometryType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.lendholt.geo.wps.gcap.x12.GeometryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static de.lendholt.geo.wps.gcap.x12.GeometryType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.lendholt.geo.wps.gcap.x12.GeometryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static de.lendholt.geo.wps.gcap.x12.GeometryType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.lendholt.geo.wps.gcap.x12.GeometryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static de.lendholt.geo.wps.gcap.x12.GeometryType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.lendholt.geo.wps.gcap.x12.GeometryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static de.lendholt.geo.wps.gcap.x12.GeometryType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.lendholt.geo.wps.gcap.x12.GeometryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static de.lendholt.geo.wps.gcap.x12.GeometryType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.lendholt.geo.wps.gcap.x12.GeometryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static de.lendholt.geo.wps.gcap.x12.GeometryType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.lendholt.geo.wps.gcap.x12.GeometryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static de.lendholt.geo.wps.gcap.x12.GeometryType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.lendholt.geo.wps.gcap.x12.GeometryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static de.lendholt.geo.wps.gcap.x12.GeometryType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.lendholt.geo.wps.gcap.x12.GeometryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static de.lendholt.geo.wps.gcap.x12.GeometryType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (de.lendholt.geo.wps.gcap.x12.GeometryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static de.lendholt.geo.wps.gcap.x12.GeometryType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.lendholt.geo.wps.gcap.x12.GeometryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static de.lendholt.geo.wps.gcap.x12.GeometryType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (de.lendholt.geo.wps.gcap.x12.GeometryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static de.lendholt.geo.wps.gcap.x12.GeometryType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.lendholt.geo.wps.gcap.x12.GeometryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static de.lendholt.geo.wps.gcap.x12.GeometryType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (de.lendholt.geo.wps.gcap.x12.GeometryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static de.lendholt.geo.wps.gcap.x12.GeometryType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (de.lendholt.geo.wps.gcap.x12.GeometryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
