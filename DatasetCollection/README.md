# Dataset Collection

- ListOfParsedSpatialDatasets.csv --> A list of LD datasets that contain spatial entities
- ListOfParsedSpatialClasses.csv --> A list of the parsed spatial classes along with the dataset they belong and the geo_ontology they use

Available Datasets (SPARQL Endpoints) were identified by parsing datahub.io using the CKAN API. Then, based on JENA API we issued a) ASK SPARQL Queries to each Endpoint (Dataset)  to identify datasets that use geo-ontologies i.e. spatial datasets (IdentifySpatialDatasets.java) and b) SELECT SPARQL Queries to each spatial dataset to retrieve the list of classes that contain spatial instances i.e. instances that use predicates for the following geoontologies (ListSpatialClasses.java):
- W3C Basic Geo
- NeoGeo
- GeoSPARQL
- GeoNames
- GeoRSS
- OrdnanceSurvey



