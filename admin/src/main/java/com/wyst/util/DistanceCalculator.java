package com.wyst.util;

public class DistanceCalculator {

    private static final double EARTH_RADIUS_MILES = 3958.8; // radius of the Earth in miles
    private static final double EARTH_RADIUS_KM = 6371.0; // radius of the Earth in kilometers
    
    public static double distance(double lat1, double lon1, double lat2, double lon2, String unit) {
        double dLat = Math.toRadians(lat2 - lat1);
        double dLon = Math.toRadians(lon2 - lon1);
        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) +
                    Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) *
                    Math.sin(dLon / 2) * Math.sin(dLon / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double distance;
        if (unit.equalsIgnoreCase("k")) {
            distance = EARTH_RADIUS_KM * c;
        } else {
            distance = EARTH_RADIUS_MILES * c;
        }
        return distance;
    }
}
