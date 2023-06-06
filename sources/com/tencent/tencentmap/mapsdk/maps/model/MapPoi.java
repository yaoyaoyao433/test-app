package com.tencent.tencentmap.mapsdk.maps.model;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class MapPoi {
    private double latitude;
    private double longitude;
    public String name;
    public String poiId;
    public LatLng position;

    public MapPoi() {
    }

    public MapPoi(double d, double d2) {
        this.latitude = d;
        this.longitude = d2;
        this.position = new LatLng(d, d2);
    }

    public MapPoi(double d, double d2, String str) {
        this(d, d2);
        this.name = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String getName() {
        return this.name;
    }

    public void setPosition(LatLng latLng) {
        this.position = latLng;
        this.latitude = latLng.getLatitude();
        this.longitude = latLng.getLongitude();
    }

    public LatLng getPosition() {
        return this.position;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public String getPoiId() {
        return this.poiId;
    }
}
