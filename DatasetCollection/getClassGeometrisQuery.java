  //Getting Class geometries query
    public static String getClassGeometiesQuery(String type,int ontology){
		String query="";
		switch (ontology){
		//W3C Basic Geo
		case 1: query="SELECT  ?x ?y  WHERE {?s <http://www.w3.org/2003/01/geo/wgs84_pos#long> ?x. ?s <http://www.w3.org/2003/01/geo/wgs84_pos#lat> ?y. ?s <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <"+type+">}"; break;
		//NeoGeo
		case 2: query="SELECT  ?x ?y WHERE {?o <http://www.w3.org/2003/01/geo/wgs84_pos#long> ?x. ?o <http://www.w3.org/2003/01/geo/wgs84_pos#lat> ?y. ?s <http://geovocab.org/geometry#geometry> ?o . ?s <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <"+type+">}"; break;
		//GeoSparql
		case 3: query="SELECT ?wkt WHERE {?s <http://www.opengis.net/ont/geosparql#hasGeometry> ?o. ?o <http://www.opengis.net/ont/geosparql#asWKT> ?wkt. ?s <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <"+type+">.} "; break;
		//StSparql
		case 4: query=""; break;
		//GML
		case 5: query="SELECT  ?pos WHERE {?s <http://www.opengis.net/gml/Point> ?o. ?o <http://www.opengis.net/gml/pos> ?pos. ?s <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <"+type+">} "; break;
		//Geonames
		case 7: query="SELECT  ?x ?y  WHERE {?s <http://www.w3.org/2003/01/geo/wgs84_pos#long> ?x. ?s <http://www.w3.org/2003/01/geo/wgs84_pos#lat> ?y. ?s <http://www.geonames.org/ontology#featureClass> <"+type+">} "; break;
		//OrdanceSurvey
		case 9: query="SELECT  ?gml WHERE {?s <http://data.ordnancesurvey.co.uk/ontology/geometry/extent> ?o. ?o <http://data.ordnancesurvey.co.uk/ontology/geometry/asGML> ?gml. ?o a <"+type+">} "; break;
		//GeoRSS
		case 10: query="SELECT ?pos WHERE {?s <http://www.georss.org/georss/point> ?pos. ?s <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <"+type+">} "; break;
		//ISA
		case 11: query=""; break;
		//W3C Basic Geo Geometry
    	case 16: query="SELECT  ?x ?y WHERE {?g <http://www.w3.org/2003/01/geo/wgs84_pos#long> ?x. ?g <http://www.w3.org/2003/01/geo/wgs84_pos#lat> ?y. ?s <http://www.w3.org/2003/01/geo/wgs84_pos#geometry> ?g. ?s a <"+type+">} "; break;		
		
		}	
		return query;
	}
