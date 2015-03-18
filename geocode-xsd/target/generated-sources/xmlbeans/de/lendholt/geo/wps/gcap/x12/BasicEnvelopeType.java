/*
 * XML Type:  basicEnvelopeType
 * Namespace: http://lendholt.de/geo/wps/gcap/1.2
 * Java type: de.lendholt.geo.wps.gcap.x12.BasicEnvelopeType
 *
 * Automatically generated - do not modify.
 */
package de.lendholt.geo.wps.gcap.x12;


/**
 * An XML basicEnvelopeType(@http://lendholt.de/geo/wps/gcap/1.2).
 *
 * This is a complex type.
 */
public interface BasicEnvelopeType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BasicEnvelopeType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s69B72B270930B05B1DA6A63CC9E85F7E").resolveHandle("basicenvelopetype4603type");
    
    /**
     * Gets the "lowerCornerLon" element
     */
    double getLowerCornerLon();
    
    /**
     * Gets (as xml) the "lowerCornerLon" element
     */
    org.apache.xmlbeans.XmlDouble xgetLowerCornerLon();
    
    /**
     * Sets the "lowerCornerLon" element
     */
    void setLowerCornerLon(double lowerCornerLon);
    
    /**
     * Sets (as xml) the "lowerCornerLon" element
     */
    void xsetLowerCornerLon(org.apache.xmlbeans.XmlDouble lowerCornerLon);
    
    /**
     * Gets the "lowerCornerLat" element
     */
    double getLowerCornerLat();
    
    /**
     * Gets (as xml) the "lowerCornerLat" element
     */
    org.apache.xmlbeans.XmlDouble xgetLowerCornerLat();
    
    /**
     * Sets the "lowerCornerLat" element
     */
    void setLowerCornerLat(double lowerCornerLat);
    
    /**
     * Sets (as xml) the "lowerCornerLat" element
     */
    void xsetLowerCornerLat(org.apache.xmlbeans.XmlDouble lowerCornerLat);
    
    /**
     * Gets the "upperCornerLon" element
     */
    double getUpperCornerLon();
    
    /**
     * Gets (as xml) the "upperCornerLon" element
     */
    org.apache.xmlbeans.XmlDouble xgetUpperCornerLon();
    
    /**
     * Sets the "upperCornerLon" element
     */
    void setUpperCornerLon(double upperCornerLon);
    
    /**
     * Sets (as xml) the "upperCornerLon" element
     */
    void xsetUpperCornerLon(org.apache.xmlbeans.XmlDouble upperCornerLon);
    
    /**
     * Gets the "upperCornerLat" element
     */
    double getUpperCornerLat();
    
    /**
     * Gets (as xml) the "upperCornerLat" element
     */
    org.apache.xmlbeans.XmlDouble xgetUpperCornerLat();
    
    /**
     * Sets the "upperCornerLat" element
     */
    void setUpperCornerLat(double upperCornerLat);
    
    /**
     * Sets (as xml) the "upperCornerLat" element
     */
    void xsetUpperCornerLat(org.apache.xmlbeans.XmlDouble upperCornerLat);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static de.lendholt.geo.wps.gcap.x12.BasicEnvelopeType newInstance() {
          return (de.lendholt.geo.wps.gcap.x12.BasicEnvelopeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static de.lendholt.geo.wps.gcap.x12.BasicEnvelopeType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (de.lendholt.geo.wps.gcap.x12.BasicEnvelopeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static de.lendholt.geo.wps.gcap.x12.BasicEnvelopeType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (de.lendholt.geo.wps.gcap.x12.BasicEnvelopeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static de.lendholt.geo.wps.gcap.x12.BasicEnvelopeType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.lendholt.geo.wps.gcap.x12.BasicEnvelopeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static de.lendholt.geo.wps.gcap.x12.BasicEnvelopeType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.lendholt.geo.wps.gcap.x12.BasicEnvelopeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static de.lendholt.geo.wps.gcap.x12.BasicEnvelopeType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.lendholt.geo.wps.gcap.x12.BasicEnvelopeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static de.lendholt.geo.wps.gcap.x12.BasicEnvelopeType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.lendholt.geo.wps.gcap.x12.BasicEnvelopeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static de.lendholt.geo.wps.gcap.x12.BasicEnvelopeType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.lendholt.geo.wps.gcap.x12.BasicEnvelopeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static de.lendholt.geo.wps.gcap.x12.BasicEnvelopeType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.lendholt.geo.wps.gcap.x12.BasicEnvelopeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static de.lendholt.geo.wps.gcap.x12.BasicEnvelopeType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.lendholt.geo.wps.gcap.x12.BasicEnvelopeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static de.lendholt.geo.wps.gcap.x12.BasicEnvelopeType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.lendholt.geo.wps.gcap.x12.BasicEnvelopeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static de.lendholt.geo.wps.gcap.x12.BasicEnvelopeType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.lendholt.geo.wps.gcap.x12.BasicEnvelopeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static de.lendholt.geo.wps.gcap.x12.BasicEnvelopeType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (de.lendholt.geo.wps.gcap.x12.BasicEnvelopeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static de.lendholt.geo.wps.gcap.x12.BasicEnvelopeType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.lendholt.geo.wps.gcap.x12.BasicEnvelopeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static de.lendholt.geo.wps.gcap.x12.BasicEnvelopeType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (de.lendholt.geo.wps.gcap.x12.BasicEnvelopeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static de.lendholt.geo.wps.gcap.x12.BasicEnvelopeType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.lendholt.geo.wps.gcap.x12.BasicEnvelopeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static de.lendholt.geo.wps.gcap.x12.BasicEnvelopeType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (de.lendholt.geo.wps.gcap.x12.BasicEnvelopeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static de.lendholt.geo.wps.gcap.x12.BasicEnvelopeType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (de.lendholt.geo.wps.gcap.x12.BasicEnvelopeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
