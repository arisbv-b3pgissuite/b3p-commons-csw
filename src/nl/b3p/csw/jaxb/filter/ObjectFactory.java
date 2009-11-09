//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.11.06 at 09:10:32 PM CET 
//


package nl.b3p.csw.jaxb.filter;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the nl.b3p.csw.jaxb.filter package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Function_QNAME = new QName("http://www.opengis.net/ogc", "Function");
    private final static QName _FeatureId_QNAME = new QName("http://www.opengis.net/ogc", "FeatureId");
    private final static QName _Filter_QNAME = new QName("http://www.opengis.net/ogc", "Filter");
    private final static QName _Sub_QNAME = new QName("http://www.opengis.net/ogc", "Sub");
    private final static QName _Add_QNAME = new QName("http://www.opengis.net/ogc", "Add");
    private final static QName _Expression_QNAME = new QName("http://www.opengis.net/ogc", "expression");
    private final static QName _Div_QNAME = new QName("http://www.opengis.net/ogc", "Div");
    private final static QName _Literal_QNAME = new QName("http://www.opengis.net/ogc", "Literal");
    private final static QName _Mul_QNAME = new QName("http://www.opengis.net/ogc", "Mul");
    private final static QName _AbstractId_QNAME = new QName("http://www.opengis.net/ogc", "AbstractId");
    private final static QName _SortBy_QNAME = new QName("http://www.opengis.net/ogc", "SortBy");
    private final static QName _GmlObjectId_QNAME = new QName("http://www.opengis.net/ogc", "GmlObjectId");
    private final static QName _PropertyName_QNAME = new QName("http://www.opengis.net/ogc", "PropertyName");
    private final static QName _BinaryLogicOpTypeIntersects_QNAME = new QName("http://www.opengis.net/ogc", "Intersects");
    private final static QName _BinaryLogicOpTypePropertyIsEqualTo_QNAME = new QName("http://www.opengis.net/ogc", "PropertyIsEqualTo");
    private final static QName _BinaryLogicOpTypeOr_QNAME = new QName("http://www.opengis.net/ogc", "Or");
    private final static QName _BinaryLogicOpTypeOverlaps_QNAME = new QName("http://www.opengis.net/ogc", "Overlaps");
    private final static QName _BinaryLogicOpTypeEquals_QNAME = new QName("http://www.opengis.net/ogc", "Equals");
    private final static QName _BinaryLogicOpTypePropertyIsBetween_QNAME = new QName("http://www.opengis.net/ogc", "PropertyIsBetween");
    private final static QName _BinaryLogicOpTypeBeyond_QNAME = new QName("http://www.opengis.net/ogc", "Beyond");
    private final static QName _BinaryLogicOpTypeAnd_QNAME = new QName("http://www.opengis.net/ogc", "And");
    private final static QName _BinaryLogicOpTypeDWithin_QNAME = new QName("http://www.opengis.net/ogc", "DWithin");
    private final static QName _BinaryLogicOpTypePropertyIsNull_QNAME = new QName("http://www.opengis.net/ogc", "PropertyIsNull");
    private final static QName _BinaryLogicOpTypePropertyIsGreaterThan_QNAME = new QName("http://www.opengis.net/ogc", "PropertyIsGreaterThan");
    private final static QName _BinaryLogicOpTypeBBOX_QNAME = new QName("http://www.opengis.net/ogc", "BBOX");
    private final static QName _BinaryLogicOpTypePropertyIsLessThan_QNAME = new QName("http://www.opengis.net/ogc", "PropertyIsLessThan");
    private final static QName _BinaryLogicOpTypeCrosses_QNAME = new QName("http://www.opengis.net/ogc", "Crosses");
    private final static QName _BinaryLogicOpTypePropertyIsNotEqualTo_QNAME = new QName("http://www.opengis.net/ogc", "PropertyIsNotEqualTo");
    private final static QName _BinaryLogicOpTypePropertyIsLessThanOrEqualTo_QNAME = new QName("http://www.opengis.net/ogc", "PropertyIsLessThanOrEqualTo");
    private final static QName _BinaryLogicOpTypeTouches_QNAME = new QName("http://www.opengis.net/ogc", "Touches");
    private final static QName _BinaryLogicOpTypePropertyIsGreaterThanOrEqualTo_QNAME = new QName("http://www.opengis.net/ogc", "PropertyIsGreaterThanOrEqualTo");
    private final static QName _BinaryLogicOpTypeWithin_QNAME = new QName("http://www.opengis.net/ogc", "Within");
    private final static QName _BinaryLogicOpTypePropertyIsLike_QNAME = new QName("http://www.opengis.net/ogc", "PropertyIsLike");
    private final static QName _BinaryLogicOpTypeNot_QNAME = new QName("http://www.opengis.net/ogc", "Not");
    private final static QName _BinaryLogicOpTypeDisjoint_QNAME = new QName("http://www.opengis.net/ogc", "Disjoint");
    private final static QName _BinaryLogicOpTypeContains_QNAME = new QName("http://www.opengis.net/ogc", "Contains");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: nl.b3p.csw.jaxb.filter
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FeatureIdType }
     * 
     */
    public FeatureIdType createFeatureIdType() {
        return new FeatureIdType();
    }

    /**
     * Create an instance of {@link FilterType }
     * 
     */
    public FilterType createFilterType() {
        return new FilterType();
    }

    /**
     * Create an instance of {@link BBOXType }
     * 
     */
    public BBOXType createBBOXType() {
        return new BBOXType();
    }

    /**
     * Create an instance of {@link FunctionType }
     * 
     */
    public FunctionType createFunctionType() {
        return new FunctionType();
    }

    /**
     * Create an instance of {@link LogicalOperators }
     * 
     */
    public LogicalOperators createLogicalOperators() {
        return new LogicalOperators();
    }

    /**
     * Create an instance of {@link PropertyNameType }
     * 
     */
    public PropertyNameType createPropertyNameType() {
        return new PropertyNameType();
    }

    /**
     * Create an instance of {@link FunctionNamesType }
     * 
     */
    public FunctionNamesType createFunctionNamesType() {
        return new FunctionNamesType();
    }

    /**
     * Create an instance of {@link FunctionsType }
     * 
     */
    public FunctionsType createFunctionsType() {
        return new FunctionsType();
    }

    /**
     * Create an instance of {@link ArithmeticOperatorsType }
     * 
     */
    public ArithmeticOperatorsType createArithmeticOperatorsType() {
        return new ArithmeticOperatorsType();
    }

    /**
     * Create an instance of {@link PropertyIsNullType }
     * 
     */
    public PropertyIsNullType createPropertyIsNullType() {
        return new PropertyIsNullType();
    }

    /**
     * Create an instance of {@link FilterCapabilities }
     * 
     */
    public FilterCapabilities createFilterCapabilities() {
        return new FilterCapabilities();
    }

    /**
     * Create an instance of {@link ScalarCapabilitiesType }
     * 
     */
    public ScalarCapabilitiesType createScalarCapabilitiesType() {
        return new ScalarCapabilitiesType();
    }

    /**
     * Create an instance of {@link IdCapabilitiesType }
     * 
     */
    public IdCapabilitiesType createIdCapabilitiesType() {
        return new IdCapabilitiesType();
    }

    /**
     * Create an instance of {@link DistanceBufferType }
     * 
     */
    public DistanceBufferType createDistanceBufferType() {
        return new DistanceBufferType();
    }

    /**
     * Create an instance of {@link SortByType }
     * 
     */
    public SortByType createSortByType() {
        return new SortByType();
    }

    /**
     * Create an instance of {@link FunctionNameType }
     * 
     */
    public FunctionNameType createFunctionNameType() {
        return new FunctionNameType();
    }

    /**
     * Create an instance of {@link ComparisonOperatorsType }
     * 
     */
    public ComparisonOperatorsType createComparisonOperatorsType() {
        return new ComparisonOperatorsType();
    }

    /**
     * Create an instance of {@link FID }
     * 
     */
    public FID createFID() {
        return new FID();
    }

    /**
     * Create an instance of {@link PropertyIsLikeType }
     * 
     */
    public PropertyIsLikeType createPropertyIsLikeType() {
        return new PropertyIsLikeType();
    }

    /**
     * Create an instance of {@link BinaryComparisonOpType }
     * 
     */
    public BinaryComparisonOpType createBinaryComparisonOpType() {
        return new BinaryComparisonOpType();
    }

    /**
     * Create an instance of {@link GeometryOperandsType }
     * 
     */
    public GeometryOperandsType createGeometryOperandsType() {
        return new GeometryOperandsType();
    }

    /**
     * Create an instance of {@link DistanceType }
     * 
     */
    public DistanceType createDistanceType() {
        return new DistanceType();
    }

    /**
     * Create an instance of {@link LiteralType }
     * 
     */
    public LiteralType createLiteralType() {
        return new LiteralType();
    }

    /**
     * Create an instance of {@link BinaryLogicOpType }
     * 
     */
    public BinaryLogicOpType createBinaryLogicOpType() {
        return new BinaryLogicOpType();
    }

    /**
     * Create an instance of {@link SpatialCapabilitiesType }
     * 
     */
    public SpatialCapabilitiesType createSpatialCapabilitiesType() {
        return new SpatialCapabilitiesType();
    }

    /**
     * Create an instance of {@link GmlObjectIdType }
     * 
     */
    public GmlObjectIdType createGmlObjectIdType() {
        return new GmlObjectIdType();
    }

    /**
     * Create an instance of {@link UpperBoundaryType }
     * 
     */
    public UpperBoundaryType createUpperBoundaryType() {
        return new UpperBoundaryType();
    }

    /**
     * Create an instance of {@link SortPropertyType }
     * 
     */
    public SortPropertyType createSortPropertyType() {
        return new SortPropertyType();
    }

    /**
     * Create an instance of {@link LowerBoundaryType }
     * 
     */
    public LowerBoundaryType createLowerBoundaryType() {
        return new LowerBoundaryType();
    }

    /**
     * Create an instance of {@link BinarySpatialOpType }
     * 
     */
    public BinarySpatialOpType createBinarySpatialOpType() {
        return new BinarySpatialOpType();
    }

    /**
     * Create an instance of {@link PropertyIsBetweenType }
     * 
     */
    public PropertyIsBetweenType createPropertyIsBetweenType() {
        return new PropertyIsBetweenType();
    }

    /**
     * Create an instance of {@link SpatialOperatorType }
     * 
     */
    public SpatialOperatorType createSpatialOperatorType() {
        return new SpatialOperatorType();
    }

    /**
     * Create an instance of {@link BinaryOperatorType }
     * 
     */
    public BinaryOperatorType createBinaryOperatorType() {
        return new BinaryOperatorType();
    }

    /**
     * Create an instance of {@link SimpleArithmetic }
     * 
     */
    public SimpleArithmetic createSimpleArithmetic() {
        return new SimpleArithmetic();
    }

    /**
     * Create an instance of {@link EID }
     * 
     */
    public EID createEID() {
        return new EID();
    }

    /**
     * Create an instance of {@link UnaryLogicOpType }
     * 
     */
    public UnaryLogicOpType createUnaryLogicOpType() {
        return new UnaryLogicOpType();
    }

    /**
     * Create an instance of {@link SpatialOperatorsType }
     * 
     */
    public SpatialOperatorsType createSpatialOperatorsType() {
        return new SpatialOperatorsType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FunctionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/ogc", name = "Function", substitutionHeadNamespace = "http://www.opengis.net/ogc", substitutionHeadName = "expression")
    public JAXBElement<FunctionType> createFunction(FunctionType value) {
        return new JAXBElement<FunctionType>(_Function_QNAME, FunctionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FeatureIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/ogc", name = "FeatureId", substitutionHeadNamespace = "http://www.opengis.net/ogc", substitutionHeadName = "AbstractId")
    public JAXBElement<FeatureIdType> createFeatureId(FeatureIdType value) {
        return new JAXBElement<FeatureIdType>(_FeatureId_QNAME, FeatureIdType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/ogc", name = "Filter")
    public JAXBElement<FilterType> createFilter(FilterType value) {
        return new JAXBElement<FilterType>(_Filter_QNAME, FilterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BinaryOperatorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/ogc", name = "Sub", substitutionHeadNamespace = "http://www.opengis.net/ogc", substitutionHeadName = "expression")
    public JAXBElement<BinaryOperatorType> createSub(BinaryOperatorType value) {
        return new JAXBElement<BinaryOperatorType>(_Sub_QNAME, BinaryOperatorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BinaryOperatorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/ogc", name = "Add", substitutionHeadNamespace = "http://www.opengis.net/ogc", substitutionHeadName = "expression")
    public JAXBElement<BinaryOperatorType> createAdd(BinaryOperatorType value) {
        return new JAXBElement<BinaryOperatorType>(_Add_QNAME, BinaryOperatorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExpressionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/ogc", name = "expression")
    public JAXBElement<ExpressionType> createExpression(ExpressionType value) {
        return new JAXBElement<ExpressionType>(_Expression_QNAME, ExpressionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BinaryOperatorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/ogc", name = "Div", substitutionHeadNamespace = "http://www.opengis.net/ogc", substitutionHeadName = "expression")
    public JAXBElement<BinaryOperatorType> createDiv(BinaryOperatorType value) {
        return new JAXBElement<BinaryOperatorType>(_Div_QNAME, BinaryOperatorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LiteralType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/ogc", name = "Literal", substitutionHeadNamespace = "http://www.opengis.net/ogc", substitutionHeadName = "expression")
    public JAXBElement<LiteralType> createLiteral(LiteralType value) {
        return new JAXBElement<LiteralType>(_Literal_QNAME, LiteralType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BinaryOperatorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/ogc", name = "Mul", substitutionHeadNamespace = "http://www.opengis.net/ogc", substitutionHeadName = "expression")
    public JAXBElement<BinaryOperatorType> createMul(BinaryOperatorType value) {
        return new JAXBElement<BinaryOperatorType>(_Mul_QNAME, BinaryOperatorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/ogc", name = "AbstractId")
    public JAXBElement<AbstractIdType> createAbstractId(AbstractIdType value) {
        return new JAXBElement<AbstractIdType>(_AbstractId_QNAME, AbstractIdType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SortByType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/ogc", name = "SortBy")
    public JAXBElement<SortByType> createSortBy(SortByType value) {
        return new JAXBElement<SortByType>(_SortBy_QNAME, SortByType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GmlObjectIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/ogc", name = "GmlObjectId", substitutionHeadNamespace = "http://www.opengis.net/ogc", substitutionHeadName = "AbstractId")
    public JAXBElement<GmlObjectIdType> createGmlObjectId(GmlObjectIdType value) {
        return new JAXBElement<GmlObjectIdType>(_GmlObjectId_QNAME, GmlObjectIdType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PropertyNameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/ogc", name = "PropertyName", substitutionHeadNamespace = "http://www.opengis.net/ogc", substitutionHeadName = "expression")
    public JAXBElement<PropertyNameType> createPropertyName(PropertyNameType value) {
        return new JAXBElement<PropertyNameType>(_PropertyName_QNAME, PropertyNameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BinarySpatialOpType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/ogc", name = "Intersects", scope = BinaryLogicOpType.class)
    public JAXBElement<BinarySpatialOpType> createBinaryLogicOpTypeIntersects(BinarySpatialOpType value) {
        return new JAXBElement<BinarySpatialOpType>(_BinaryLogicOpTypeIntersects_QNAME, BinarySpatialOpType.class, BinaryLogicOpType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BinaryComparisonOpType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/ogc", name = "PropertyIsEqualTo", scope = BinaryLogicOpType.class)
    public JAXBElement<BinaryComparisonOpType> createBinaryLogicOpTypePropertyIsEqualTo(BinaryComparisonOpType value) {
        return new JAXBElement<BinaryComparisonOpType>(_BinaryLogicOpTypePropertyIsEqualTo_QNAME, BinaryComparisonOpType.class, BinaryLogicOpType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BinaryLogicOpType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/ogc", name = "Or", scope = BinaryLogicOpType.class)
    public JAXBElement<BinaryLogicOpType> createBinaryLogicOpTypeOr(BinaryLogicOpType value) {
        return new JAXBElement<BinaryLogicOpType>(_BinaryLogicOpTypeOr_QNAME, BinaryLogicOpType.class, BinaryLogicOpType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BinarySpatialOpType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/ogc", name = "Overlaps", scope = BinaryLogicOpType.class)
    public JAXBElement<BinarySpatialOpType> createBinaryLogicOpTypeOverlaps(BinarySpatialOpType value) {
        return new JAXBElement<BinarySpatialOpType>(_BinaryLogicOpTypeOverlaps_QNAME, BinarySpatialOpType.class, BinaryLogicOpType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BinarySpatialOpType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/ogc", name = "Equals", scope = BinaryLogicOpType.class)
    public JAXBElement<BinarySpatialOpType> createBinaryLogicOpTypeEquals(BinarySpatialOpType value) {
        return new JAXBElement<BinarySpatialOpType>(_BinaryLogicOpTypeEquals_QNAME, BinarySpatialOpType.class, BinaryLogicOpType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PropertyIsBetweenType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/ogc", name = "PropertyIsBetween", scope = BinaryLogicOpType.class)
    public JAXBElement<PropertyIsBetweenType> createBinaryLogicOpTypePropertyIsBetween(PropertyIsBetweenType value) {
        return new JAXBElement<PropertyIsBetweenType>(_BinaryLogicOpTypePropertyIsBetween_QNAME, PropertyIsBetweenType.class, BinaryLogicOpType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DistanceBufferType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/ogc", name = "Beyond", scope = BinaryLogicOpType.class)
    public JAXBElement<DistanceBufferType> createBinaryLogicOpTypeBeyond(DistanceBufferType value) {
        return new JAXBElement<DistanceBufferType>(_BinaryLogicOpTypeBeyond_QNAME, DistanceBufferType.class, BinaryLogicOpType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BinaryLogicOpType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/ogc", name = "And", scope = BinaryLogicOpType.class)
    public JAXBElement<BinaryLogicOpType> createBinaryLogicOpTypeAnd(BinaryLogicOpType value) {
        return new JAXBElement<BinaryLogicOpType>(_BinaryLogicOpTypeAnd_QNAME, BinaryLogicOpType.class, BinaryLogicOpType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DistanceBufferType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/ogc", name = "DWithin", scope = BinaryLogicOpType.class)
    public JAXBElement<DistanceBufferType> createBinaryLogicOpTypeDWithin(DistanceBufferType value) {
        return new JAXBElement<DistanceBufferType>(_BinaryLogicOpTypeDWithin_QNAME, DistanceBufferType.class, BinaryLogicOpType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PropertyIsNullType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/ogc", name = "PropertyIsNull", scope = BinaryLogicOpType.class)
    public JAXBElement<PropertyIsNullType> createBinaryLogicOpTypePropertyIsNull(PropertyIsNullType value) {
        return new JAXBElement<PropertyIsNullType>(_BinaryLogicOpTypePropertyIsNull_QNAME, PropertyIsNullType.class, BinaryLogicOpType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BinaryComparisonOpType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/ogc", name = "PropertyIsGreaterThan", scope = BinaryLogicOpType.class)
    public JAXBElement<BinaryComparisonOpType> createBinaryLogicOpTypePropertyIsGreaterThan(BinaryComparisonOpType value) {
        return new JAXBElement<BinaryComparisonOpType>(_BinaryLogicOpTypePropertyIsGreaterThan_QNAME, BinaryComparisonOpType.class, BinaryLogicOpType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BBOXType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/ogc", name = "BBOX", scope = BinaryLogicOpType.class)
    public JAXBElement<BBOXType> createBinaryLogicOpTypeBBOX(BBOXType value) {
        return new JAXBElement<BBOXType>(_BinaryLogicOpTypeBBOX_QNAME, BBOXType.class, BinaryLogicOpType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BinaryComparisonOpType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/ogc", name = "PropertyIsLessThan", scope = BinaryLogicOpType.class)
    public JAXBElement<BinaryComparisonOpType> createBinaryLogicOpTypePropertyIsLessThan(BinaryComparisonOpType value) {
        return new JAXBElement<BinaryComparisonOpType>(_BinaryLogicOpTypePropertyIsLessThan_QNAME, BinaryComparisonOpType.class, BinaryLogicOpType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BinarySpatialOpType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/ogc", name = "Crosses", scope = BinaryLogicOpType.class)
    public JAXBElement<BinarySpatialOpType> createBinaryLogicOpTypeCrosses(BinarySpatialOpType value) {
        return new JAXBElement<BinarySpatialOpType>(_BinaryLogicOpTypeCrosses_QNAME, BinarySpatialOpType.class, BinaryLogicOpType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BinaryComparisonOpType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/ogc", name = "PropertyIsNotEqualTo", scope = BinaryLogicOpType.class)
    public JAXBElement<BinaryComparisonOpType> createBinaryLogicOpTypePropertyIsNotEqualTo(BinaryComparisonOpType value) {
        return new JAXBElement<BinaryComparisonOpType>(_BinaryLogicOpTypePropertyIsNotEqualTo_QNAME, BinaryComparisonOpType.class, BinaryLogicOpType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BinaryComparisonOpType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/ogc", name = "PropertyIsLessThanOrEqualTo", scope = BinaryLogicOpType.class)
    public JAXBElement<BinaryComparisonOpType> createBinaryLogicOpTypePropertyIsLessThanOrEqualTo(BinaryComparisonOpType value) {
        return new JAXBElement<BinaryComparisonOpType>(_BinaryLogicOpTypePropertyIsLessThanOrEqualTo_QNAME, BinaryComparisonOpType.class, BinaryLogicOpType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BinarySpatialOpType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/ogc", name = "Touches", scope = BinaryLogicOpType.class)
    public JAXBElement<BinarySpatialOpType> createBinaryLogicOpTypeTouches(BinarySpatialOpType value) {
        return new JAXBElement<BinarySpatialOpType>(_BinaryLogicOpTypeTouches_QNAME, BinarySpatialOpType.class, BinaryLogicOpType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BinaryComparisonOpType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/ogc", name = "PropertyIsGreaterThanOrEqualTo", scope = BinaryLogicOpType.class)
    public JAXBElement<BinaryComparisonOpType> createBinaryLogicOpTypePropertyIsGreaterThanOrEqualTo(BinaryComparisonOpType value) {
        return new JAXBElement<BinaryComparisonOpType>(_BinaryLogicOpTypePropertyIsGreaterThanOrEqualTo_QNAME, BinaryComparisonOpType.class, BinaryLogicOpType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BinarySpatialOpType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/ogc", name = "Within", scope = BinaryLogicOpType.class)
    public JAXBElement<BinarySpatialOpType> createBinaryLogicOpTypeWithin(BinarySpatialOpType value) {
        return new JAXBElement<BinarySpatialOpType>(_BinaryLogicOpTypeWithin_QNAME, BinarySpatialOpType.class, BinaryLogicOpType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PropertyIsLikeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/ogc", name = "PropertyIsLike", scope = BinaryLogicOpType.class)
    public JAXBElement<PropertyIsLikeType> createBinaryLogicOpTypePropertyIsLike(PropertyIsLikeType value) {
        return new JAXBElement<PropertyIsLikeType>(_BinaryLogicOpTypePropertyIsLike_QNAME, PropertyIsLikeType.class, BinaryLogicOpType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnaryLogicOpType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/ogc", name = "Not", scope = BinaryLogicOpType.class)
    public JAXBElement<UnaryLogicOpType> createBinaryLogicOpTypeNot(UnaryLogicOpType value) {
        return new JAXBElement<UnaryLogicOpType>(_BinaryLogicOpTypeNot_QNAME, UnaryLogicOpType.class, BinaryLogicOpType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BinarySpatialOpType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/ogc", name = "Disjoint", scope = BinaryLogicOpType.class)
    public JAXBElement<BinarySpatialOpType> createBinaryLogicOpTypeDisjoint(BinarySpatialOpType value) {
        return new JAXBElement<BinarySpatialOpType>(_BinaryLogicOpTypeDisjoint_QNAME, BinarySpatialOpType.class, BinaryLogicOpType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BinarySpatialOpType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/ogc", name = "Contains", scope = BinaryLogicOpType.class)
    public JAXBElement<BinarySpatialOpType> createBinaryLogicOpTypeContains(BinarySpatialOpType value) {
        return new JAXBElement<BinarySpatialOpType>(_BinaryLogicOpTypeContains_QNAME, BinarySpatialOpType.class, BinaryLogicOpType.class, value);
    }

}