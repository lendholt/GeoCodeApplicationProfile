/*
 * XML Type:  geometryFormatType
 * Namespace: http://lendholt.de/geo/wps/gcap/1.2
 * Java type: de.lendholt.geo.wps.gcap.x12.GeometryFormatType
 *
 * Automatically generated - do not modify.
 */
package de.lendholt.geo.wps.gcap.x12;


/**
 * An XML geometryFormatType(@http://lendholt.de/geo/wps/gcap/1.2).
 *
 * This is an atomic type that is a restriction of de.lendholt.geo.wps.gcap.x12.GeometryFormatType.
 */
public interface GeometryFormatType extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GeometryFormatType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s69B72B270930B05B1DA6A63CC9E85F7E").resolveHandle("geometryformattype3060type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum GML = Enum.forString("gml");
    static final Enum WKT = Enum.forString("wkt");
    static final Enum HEXEWKB = Enum.forString("hexewkb");
    static final Enum SHAPEFILE = Enum.forString("shapefile");
    static final Enum GEOJSON = Enum.forString("geojson");
    
    static final int INT_GML = Enum.INT_GML;
    static final int INT_WKT = Enum.INT_WKT;
    static final int INT_HEXEWKB = Enum.INT_HEXEWKB;
    static final int INT_SHAPEFILE = Enum.INT_SHAPEFILE;
    static final int INT_GEOJSON = Enum.INT_GEOJSON;
    
    /**
     * Enumeration value class for de.lendholt.geo.wps.gcap.x12.GeometryFormatType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_GML
     * Enum.forString(s); // returns the enum value for a string
     * Enum.forInt(i); // returns the enum value for an int
     * </pre>
     * Enumeration objects are immutable singleton objects that
     * can be compared using == object equality. They have no
     * public constructor. See the constants defined within this
     * class for all the valid values.
     */
    static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
    {
        /**
         * Returns the enum value for a string, or null if none.
         */
        public static Enum forString(java.lang.String s)
            { return (Enum)table.forString(s); }
        /**
         * Returns the enum value corresponding to an int, or null if none.
         */
        public static Enum forInt(int i)
            { return (Enum)table.forInt(i); }
        
        private Enum(java.lang.String s, int i)
            { super(s, i); }
        
        static final int INT_GML = 1;
        static final int INT_WKT = 2;
        static final int INT_HEXEWKB = 3;
        static final int INT_SHAPEFILE = 4;
        static final int INT_GEOJSON = 5;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("gml", INT_GML),
                new Enum("wkt", INT_WKT),
                new Enum("hexewkb", INT_HEXEWKB),
                new Enum("shapefile", INT_SHAPEFILE),
                new Enum("geojson", INT_GEOJSON),
            }
        );
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() { return forInt(intValue()); } 
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static de.lendholt.geo.wps.gcap.x12.GeometryFormatType newValue(java.lang.Object obj) {
          return (de.lendholt.geo.wps.gcap.x12.GeometryFormatType) type.newValue( obj ); }
        
        public static de.lendholt.geo.wps.gcap.x12.GeometryFormatType newInstance() {
          return (de.lendholt.geo.wps.gcap.x12.GeometryFormatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static de.lendholt.geo.wps.gcap.x12.GeometryFormatType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (de.lendholt.geo.wps.gcap.x12.GeometryFormatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static de.lendholt.geo.wps.gcap.x12.GeometryFormatType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (de.lendholt.geo.wps.gcap.x12.GeometryFormatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static de.lendholt.geo.wps.gcap.x12.GeometryFormatType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.lendholt.geo.wps.gcap.x12.GeometryFormatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static de.lendholt.geo.wps.gcap.x12.GeometryFormatType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.lendholt.geo.wps.gcap.x12.GeometryFormatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static de.lendholt.geo.wps.gcap.x12.GeometryFormatType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.lendholt.geo.wps.gcap.x12.GeometryFormatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static de.lendholt.geo.wps.gcap.x12.GeometryFormatType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.lendholt.geo.wps.gcap.x12.GeometryFormatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static de.lendholt.geo.wps.gcap.x12.GeometryFormatType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.lendholt.geo.wps.gcap.x12.GeometryFormatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static de.lendholt.geo.wps.gcap.x12.GeometryFormatType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.lendholt.geo.wps.gcap.x12.GeometryFormatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static de.lendholt.geo.wps.gcap.x12.GeometryFormatType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.lendholt.geo.wps.gcap.x12.GeometryFormatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static de.lendholt.geo.wps.gcap.x12.GeometryFormatType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.lendholt.geo.wps.gcap.x12.GeometryFormatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static de.lendholt.geo.wps.gcap.x12.GeometryFormatType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.lendholt.geo.wps.gcap.x12.GeometryFormatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static de.lendholt.geo.wps.gcap.x12.GeometryFormatType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (de.lendholt.geo.wps.gcap.x12.GeometryFormatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static de.lendholt.geo.wps.gcap.x12.GeometryFormatType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.lendholt.geo.wps.gcap.x12.GeometryFormatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static de.lendholt.geo.wps.gcap.x12.GeometryFormatType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (de.lendholt.geo.wps.gcap.x12.GeometryFormatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static de.lendholt.geo.wps.gcap.x12.GeometryFormatType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.lendholt.geo.wps.gcap.x12.GeometryFormatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static de.lendholt.geo.wps.gcap.x12.GeometryFormatType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (de.lendholt.geo.wps.gcap.x12.GeometryFormatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static de.lendholt.geo.wps.gcap.x12.GeometryFormatType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (de.lendholt.geo.wps.gcap.x12.GeometryFormatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
