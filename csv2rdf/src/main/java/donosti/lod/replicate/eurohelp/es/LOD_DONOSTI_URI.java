package donosti.lod.replicate.eurohelp.es;

public enum LOD_DONOSTI_URI {
	base("http://lod.eurohelp.es/"),
	id(LOD_DONOSTI_URI.base.getUri() + "id/"),
	def(LOD_DONOSTI_URI.base.getUri() + "def/"),
	parking(LOD_DONOSTI_URI.id.getUri() + "parking/"),
	fare(LOD_DONOSTI_URI.id.getUri() + "fare/"),
	schema_parking_facility("http://schema.org/ParkingFacility"),
	schema_offers("http://schema.org/offers"),
	schema_price("http://schema.org/price"),
	schema_currency("http://schema.org/priceCurrency"),
	PlazasRotatorias(LOD_DONOSTI_URI.def.getUri() + "plazasrotatorias"),
	PlazasResidentes(LOD_DONOSTI_URI.def.getUri() + "plazasresidentes"),
	PlazasTotales(LOD_DONOSTI_URI.def.getUri() + "plazastotales"),
	PlazasResidentesLibres(LOD_DONOSTI_URI.def.getUri() + "plazasresidenteslibres"),
	PlazasRotatoriasLibres(LOD_DONOSTI_URI.def.getUri() + "plazasrotatoriaslibres"),
	tipo_parking_rotatorio(LOD_DONOSTI_URI.def.getUri() + "parkingrotatorio"),
	tipo_parking_mixto(LOD_DONOSTI_URI.def.getUri() + "parkingmixto"),
	lat_wgs84("http://www.w3.org/2003/01/geo/wgs84_pos#lat"),
	long_wgs84("http://www.w3.org/2003/01/geo/wgs84_pos#long"),
	time_minutes("http://www.w3.org/2006/time#minutes")
	;
	
	private String uri;

	private LOD_DONOSTI_URI(String uri) {
		this.uri = uri;
	}
	public final String getUri() {
		return uri;
	}
}
