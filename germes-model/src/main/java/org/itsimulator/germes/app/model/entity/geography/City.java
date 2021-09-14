package org.itsimulator.germes.app.model.entity.geography;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import org.itsimulator.germes.app.infra.util.CommonUtil;
import org.itsimulator.germes.app.model.entity.base.AbstractEntity;

/**
 * Any locality that contains transport stations
 * @author Andrusca
 *
 */
public class City extends AbstractEntity {	
	private String name;
	
	/**
	 * Name of the district where city is placed
	 */
	private String district;
	
	/**
	 * Name of the region where district is located.
	 * Region is top-level area in the country
	 */
	private String region;
	

	/**
	 * Adds specified station to the city station list
	 * @param station
	 */
	  Set<Station> stations;



	/**
	 * Adds specified station to the city station list
	 * @param station
	 */
	public void addStation(final Station station) {
		Objects.requireNonNull(station, "station parameter is not initialized");
		if(stations == null) {
			stations = new HashSet<>();
		}
		stations.add(station);
		station.setCity(this);
	}



	/**
	 * Removes specified station from city station list
	 * @param station
	 */
	public void removeStation(Station station) {
		Objects.requireNonNull(station, "station parameter is not initialized");
		if(stations == null) {
			return;
		}
		stations.remove(station);
	}





     public  Set<Station> getStations(){
		return CommonUtil.getSafeSet(stations);
	 }




	/**
	 * Set of transport stations that is linked to this
	 * loyality
	 */

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

//	public Set<Station> setStations() {
//		return stations;
//	}

	public void setStations(Set<Station> stations) {
		this.stations = stations;
	}

}
