# simple-geopoint
A simple java class for adding certain amount of meters to Decimal Degrees(DD) format and returning the calculated coordinate in DD format.

### For example:

#### Case 1:
You have a point in DD format X (latitude: 39.91234,longitude: 40.12345). You want to get the point 1256 m to the north and 3000 m east of your point X in DD format.

#### Solution:

```

        GeoPoint initialPoint = new GeoPoint(39.91234,40.12345);

        // Prints the point 1256 m to the north and 3000 m east of initialPoint
        System.out.println(initialPoint.addMetersToCoordinate(3000.0,1256.0).toString());
        
```

#### Case 2:
You have a point in DD format X (latitude: 39.91234,longitude: 40.12345). You want to get the point 1256 m to the south and 3000 m west of your point X in DD format.

#### Solution:

```

        GeoPoint initialPoint = new GeoPoint(39.91234,40.12345);

        // Prints the point 1256 m to the north and 3000 m east of initialPoint
        System.out.println(initialPoint.addMetersToCoordinate(-3000.0,-1256.0).toString());
        
```

## License
MIT.
