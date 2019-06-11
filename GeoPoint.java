class GeoPoint{
    private static final int R = 6378137;

    double lat;
    double lng;

    public GeoPoint(double lat, double lng){
        this.lat = lat;
        this.lng = lng;
    }

    /**
    *   Adds given offsets to the coordinate. For example if you want to get a point 10km to the north of this point
    *   call geoPoint.addMetersToCoordinate(0.0,10000.0). If you want to get a point 10km to the south call
    *   geoPoint.addMetersToCoordinate(0.0,-10000.0)
    */
    public GeoPoint addMetersToCoordinate(double xMeters, double yMeters ){
        //Coordinate offsets in radians
        double dLat = yMeters / R;
        double dLng = xMeters/(R*Math.cos(Math.PI*lat/180));

        //OffsetPosition, decimal degrees
        double newLat = lat + dLat * 180/Math.PI;
        double newLng =  lng + dLng * 180/Math.PI;

        return new GeoPoint(newLat,newLng);
    }

    @Override
    public String toString(){
        return "Lat: "+this.lat+ " Lng: "+this.lng;
    }

    public static void main(String[] args){
        GeoPoint initialPoint = new GeoPoint(39.915328,32.814290);

        // Prints the point 25km to north of initialPoint
        System.out.println(initialPoint.addMetersToCoordinate(0.0,25000.0).toString());
        
        
        // Prints the point 900m to west of initialPoint
        System.out.println(initialPoint.addMetersToCoordinate(-900.0,0.0).toString());
    }

}
