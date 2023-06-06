package com.tencent.tencentmap.mapsdk.maps.model;

import android.os.Parcel;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class CircleOptions {
    private boolean boVisible;
    private double dRadius;
    private float fStrokeWidth;
    private int iFillColor;
    private int iLevel;
    private int iStrokeColor;
    private int iZindex;
    private LatLng latlngCenter;
    private boolean mClickable;

    public CircleOptions() {
        this.iLevel = 2;
        this.latlngCenter = new LatLng(39.984253d, 116.307439d);
        this.dRadius = 1.0d;
        this.fStrokeWidth = 1.0f;
        this.iStrokeColor = -16777216;
        this.iFillColor = 0;
        this.iZindex = 0;
        this.boVisible = true;
    }

    CircleOptions(int i, LatLng latLng, double d, float f, int i2, int i3, int i4, boolean z) {
        this.iLevel = 2;
        this.latlngCenter = new LatLng(39.984253d, 116.307439d);
        this.dRadius = 1.0d;
        this.fStrokeWidth = 1.0f;
        this.iStrokeColor = -16777216;
        this.iFillColor = 0;
        this.boVisible = true;
        this.latlngCenter = latLng;
        this.dRadius = d;
        this.fStrokeWidth = f;
        this.iStrokeColor = i2;
        this.iFillColor = i3;
        this.iZindex = i4;
        this.boVisible = z;
    }

    public CircleOptions center(LatLng latLng) {
        this.latlngCenter = latLng;
        return this;
    }

    public CircleOptions radius(double d) {
        this.dRadius = d;
        return this;
    }

    public CircleOptions strokeWidth(float f) {
        if (f < 0.0f) {
            this.fStrokeWidth = 1.0f;
        } else {
            this.fStrokeWidth = f;
        }
        return this;
    }

    public CircleOptions strokeColor(int i) {
        this.iStrokeColor = i;
        return this;
    }

    public CircleOptions fillColor(int i) {
        this.iFillColor = i;
        return this;
    }

    public CircleOptions zIndex(int i) {
        this.iZindex = i;
        return this;
    }

    public CircleOptions visible(boolean z) {
        this.boVisible = z;
        return this;
    }

    public LatLng getCenter() {
        return this.latlngCenter;
    }

    public double getRadius() {
        return this.dRadius;
    }

    public float getStrokeWidth() {
        return this.fStrokeWidth;
    }

    public int getStrokeColor() {
        return this.iStrokeColor;
    }

    public int getFillColor() {
        return this.iFillColor;
    }

    public int getZIndex() {
        return this.iZindex;
    }

    public boolean isVisible() {
        return this.boVisible;
    }

    public CircleOptions clickable(boolean z) {
        this.mClickable = z;
        return this;
    }

    public boolean isClickable() {
        return this.mClickable;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (parcel == null) {
            return;
        }
        parcel.writeDouble(this.dRadius);
    }

    public CircleOptions level(int i) {
        if (i < 0 || i > 2) {
            return this;
        }
        this.iLevel = i;
        return this;
    }

    public int getLevel() {
        return this.iLevel;
    }
}
