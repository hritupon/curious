package com.curious.ingestion.utils;
import org.locationtech.spatial4j.io.GeohashUtils;

/**
 * Created by hritupon on 2/2/20.
 */
public class GeoHash {
    public static String getGeoHash(double longitude, double latitude) {
        return GeohashUtils.encodeLatLon(latitude, longitude);
    }
    public static String getGeoHash(double longitude, double latitude, int precission) {
        return GeohashUtils.encodeLatLon(latitude, longitude, precission);
    }
}
