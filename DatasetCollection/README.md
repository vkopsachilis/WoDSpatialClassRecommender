# Dataset Collection


Available Datasets (SPARQL Endpoints) were identified by parsing datahub.io using the CKAN API. Then, (using JENA API) we issued:
a) ASK SPARQL Queries to each Endpoint (Dataset)  to identify datasets that use geo-ontologies i.e. spatial datasets (IdentifySpatialDatasets.java) and 
b) SELECT SPARQL Queries to each spatial dataset to retrieve the list of classes that contain spatial instances i.e. instances that use predicates for the following geoontologies (GetSpatialClasses.java):
- W3C Basic Geo
- NeoGeo
- GeoSPARQL
- GeoNames
- GeoRSS
- OrdnanceSurvey

The SPARQL queries for retrieving instances location for classes for each ontology listed in GetClassGeometries.java

The following files summarize the output of the DatasetCollection step:
- ListOfParsedDatasets.csv --> A list of all datasets (SPARQL Endpoints) that were discovered. The status column gives additional information such as server error, spatial (use of geo-ontologies), no spatial (no use of geo-ontologies)
- ListOfParsedSpatialDatasets.csv --> A list of LD datasets that contain spatial entities
- ListOfParsedSpatialClasses.csv --> A list of the parsed spatial classes along with the dataset they belong and the geo_ontology they use


