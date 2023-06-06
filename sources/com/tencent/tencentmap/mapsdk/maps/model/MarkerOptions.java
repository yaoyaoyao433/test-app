package com.tencent.tencentmap.mapsdk.maps.model;

import android.os.Parcel;
import android.support.annotation.NonNull;
import com.tencent.tencentmap.mapsdk.maps.interfaces.Collision;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class MarkerOptions {
    private boolean bFlat;
    private BitmapDescriptor bitmapDesctor;
    private boolean boDragable;
    private boolean boInfoWindowEnable;
    private boolean boVisible;
    private String contentDescription;
    private float fAlpha;
    private float fAngle;
    private float fanchorU;
    private float fanchorV;
    private int iLevel;
    private boolean mClockwise;
    private Collision[] mCollisions;
    private int mIconLooperDuration;
    private boolean mIconLooperEnable;
    private IndoorInfo mIndoorInfo;
    private float mInfowindowAnchorU;
    private float mInfowindowAnchorV;
    private int mInfowindowOffsetX;
    private int mInfowindowOffsetY;
    private boolean mIsFastLoad;
    private boolean mIsViewInfowindow;
    private Object mTag;
    private LatLng mlatlng;
    private String strSnippet;
    private String strtitle;
    private float zIndex;

    public MarkerOptions(@NonNull LatLng latLng) {
        this.strtitle = "";
        this.fAngle = 0.0f;
        this.fAlpha = 1.0f;
        this.zIndex = 0.0f;
        this.boInfoWindowEnable = true;
        this.bFlat = false;
        this.mClockwise = true;
        this.mInfowindowAnchorU = 0.5f;
        this.mInfowindowAnchorV = 1.0f;
        this.mInfowindowOffsetX = 0;
        this.mInfowindowOffsetY = 0;
        this.mIsFastLoad = true;
        this.mIsViewInfowindow = false;
        this.iLevel = 2;
        this.mIconLooperDuration = 500;
        this.mCollisions = new Collision[0];
        this.fanchorU = 0.5f;
        this.fanchorV = 0.5f;
        this.boVisible = true;
        this.mlatlng = latLng;
    }

    @Deprecated
    public MarkerOptions() {
        this.strtitle = "";
        this.fAngle = 0.0f;
        this.fAlpha = 1.0f;
        this.zIndex = 0.0f;
        this.boInfoWindowEnable = true;
        this.bFlat = false;
        this.mClockwise = true;
        this.mInfowindowAnchorU = 0.5f;
        this.mInfowindowAnchorV = 1.0f;
        this.mInfowindowOffsetX = 0;
        this.mInfowindowOffsetY = 0;
        this.mIsFastLoad = true;
        this.mIsViewInfowindow = false;
        this.iLevel = 2;
        this.mIconLooperDuration = 500;
        this.mCollisions = new Collision[0];
        this.fanchorU = 0.5f;
        this.fanchorV = 0.5f;
        this.boVisible = true;
    }

    public MarkerOptions position(LatLng latLng) {
        this.mlatlng = latLng;
        return this;
    }

    public MarkerOptions infoWindowEnable(boolean z) {
        this.boInfoWindowEnable = z;
        return this;
    }

    public MarkerOptions icon(BitmapDescriptor bitmapDescriptor) {
        this.bitmapDesctor = bitmapDescriptor;
        return this;
    }

    public MarkerOptions iconLooper(boolean z) {
        this.mIconLooperEnable = z;
        return this;
    }

    public MarkerOptions iconLooper(boolean z, int i) {
        this.mIconLooperEnable = z;
        this.mIconLooperDuration = i;
        return this;
    }

    public boolean isIconLooperEnable() {
        return this.mIconLooperEnable;
    }

    public int getIconLooperDuration() {
        return this.mIconLooperDuration;
    }

    public MarkerOptions anchor(float f, float f2) {
        this.fanchorU = f;
        this.fanchorV = f2;
        return this;
    }

    public MarkerOptions title(String str) {
        this.strtitle = str;
        return this;
    }

    public MarkerOptions rotation(float f) {
        this.fAngle = f;
        return this;
    }

    public MarkerOptions snippet(String str) {
        this.strSnippet = str;
        return this;
    }

    public MarkerOptions draggable(boolean z) {
        this.boDragable = z;
        return this;
    }

    public MarkerOptions alpha(float f) {
        this.fAlpha = f;
        return this;
    }

    public MarkerOptions visible(boolean z) {
        this.boVisible = z;
        return this;
    }

    public MarkerOptions flat(boolean z) {
        this.bFlat = z;
        return this;
    }

    public MarkerOptions zIndex(float f) {
        this.zIndex = f;
        return this;
    }

    public MarkerOptions indoorInfo(IndoorInfo indoorInfo) {
        this.mIndoorInfo = indoorInfo;
        return this;
    }

    public MarkerOptions tag(Object obj) {
        this.mTag = obj;
        return this;
    }

    public MarkerOptions collisionBy(MarkerCollisionItem... markerCollisionItemArr) {
        this.mCollisions = markerCollisionItemArr;
        return this;
    }

    public Collision[] getCollisions() {
        return this.mCollisions;
    }

    public LatLng getPosition() {
        return this.mlatlng;
    }

    public String getTitle() {
        return this.strtitle;
    }

    public String getSnippet() {
        return this.strSnippet;
    }

    public BitmapDescriptor getIcon() {
        return this.bitmapDesctor;
    }

    public float getAnchorU() {
        return this.fanchorU;
    }

    public float getAnchorV() {
        return this.fanchorV;
    }

    public boolean isDraggable() {
        return this.boDragable;
    }

    public boolean isVisible() {
        return this.boVisible;
    }

    public boolean isInfoWindowEnable() {
        return this.boInfoWindowEnable;
    }

    public float getAlpha() {
        return this.fAlpha;
    }

    public float getZIndex() {
        return this.zIndex;
    }

    public IndoorInfo getIndoorInfo() {
        return this.mIndoorInfo;
    }

    public boolean isFlat() {
        return this.bFlat;
    }

    public float getRotation() {
        return this.fAngle;
    }

    public MarkerOptions clockwise(boolean z) {
        this.mClockwise = z;
        return this;
    }

    public boolean isClockwise() {
        return this.mClockwise;
    }

    public MarkerOptions infoWindowAnchor(float f, float f2) {
        this.mInfowindowAnchorU = f;
        this.mInfowindowAnchorV = f2;
        return this;
    }

    public float getInfoWindowAnchorU() {
        return this.mInfowindowAnchorU;
    }

    public float getInfoWindowAnchorV() {
        return this.mInfowindowAnchorV;
    }

    public MarkerOptions infoWindowOffset(int i, int i2) {
        this.mInfowindowOffsetX = i;
        this.mInfowindowOffsetY = i2;
        return this;
    }

    public int getInfoWindowOffsetX() {
        return this.mInfowindowOffsetX;
    }

    public int getInfowindowOffsetY() {
        return this.mInfowindowOffsetY;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (parcel == null || this.mlatlng == null) {
            return;
        }
        parcel.writeString(this.mlatlng.toString());
    }

    public Object getTag() {
        return this.mTag;
    }

    public boolean isFastLoad() {
        return this.mIsFastLoad;
    }

    public MarkerOptions fastLoad(boolean z) {
        this.mIsFastLoad = z;
        return this;
    }

    public MarkerOptions contentDescription(String str) {
        this.contentDescription = str;
        return this;
    }

    public String getContentDescription() {
        return this.contentDescription;
    }

    public MarkerOptions level(int i) {
        if (i < 0 || i > 2) {
            return this;
        }
        this.iLevel = i;
        return this;
    }

    public int getLevel() {
        return this.iLevel;
    }

    public MarkerOptions viewInfoWindow(boolean z) {
        this.mIsViewInfowindow = z;
        return this;
    }

    public boolean isViewInfowindow() {
        return this.mIsViewInfowindow;
    }
}
