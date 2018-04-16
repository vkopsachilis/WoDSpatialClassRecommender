  	public static String getWGS84Classes		="SELECT DISTINCT ?t WHERE {?s <http://www.w3.org/2003/01/geo/wgs84_pos#long> ?x. ?s <http://www.w3.org/2003/01/geo/wgs84_pos#lat> ?y. ?s a ?t}";
	public static String getWGS84GeomClasses	="SELECT DISTINCT ?t WHERE {?s <http://www.w3.org/2003/01/geo/wgs84_pos#geometry> ?g. ?g <http://www.w3.org/2003/01/geo/wgs84_pos#long> ?l. ?s a ?t}";
  	public static String getNeoGeoClasses		="SELECT DISTINCT ?t WHERE {?s <http://geovocab.org/geometry#geometry> ?o. ?o <http://www.w3.org/2003/01/geo/wgs84_pos#long> ?x. ?s a ?t}";
	public static String getGeoSparqlClasses	="SELECT DISTINCT ?t WHERE {?s <http://www.opengis.net/ont/geosparql#hasGeometry> ?o. ?o <http://www.opengis.net/ont/geosparql#asWKT> ?wkt. ?s a ?t. filter(regex(lcase(?wkt), 'point' ))}";
	public static String getGeonamesClasses		="SELECT DISTINCT ?t WHERE {?s <http://www.w3.org/2003/01/geo/wgs84_pos#long> ?x. ?s <http://www.w3.org/2003/01/geo/wgs84_pos#lat> ?y. ?s <http://www.geonames.org/ontology#featureClass> ?t}";
	public static String getOSClasses			="SELECT DISTINCT ?t WHERE {?s <http://data.ordnancesurvey.co.uk/ontology/geometry/extent> ?o. ?o <http://data.ordnancesurvey.co.uk/ontology/geometry/asGML> ?gml. ?o a ?t}";
	public static String getGeoRSSClasses		="SELECT DISTINCT ?t WHERE {?s <http://www.georss.org/georss/point> ?o. ?s a ?t}";

	
	
