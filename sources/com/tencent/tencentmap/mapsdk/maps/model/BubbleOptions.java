package com.tencent.tencentmap.mapsdk.maps.model;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class BubbleOptions {
    private String mContent;
    private View mContentView;
    private Marker mMarker;
    private LatLng mPosition;
    private int mMarkerWidth = 0;
    private int mMarkerHeight = 0;
    private float mMarkerAnchorU = 0.5f;
    private float mMarkerAnchorV = 0.5f;
    private int mDisplayLevel = 0;
    private Drawable[] mBackground = null;
    private boolean mOnTapHidden = false;

    public BubbleOptions marker(Marker marker) {
        this.mMarker = marker;
        position(marker.getPosition());
        markerAnchor(marker.getAnchorU(), marker.getAnchorV());
        return this;
    }

    public Marker getMarker() {
        return this.mMarker;
    }

    public BubbleOptions markerSize(int i, int i2) {
        this.mMarkerWidth = i;
        this.mMarkerHeight = i2;
        return this;
    }

    public int getMarkerWidth() {
        return this.mMarkerWidth;
    }

    public int getMarkerHeight() {
        return this.mMarkerHeight;
    }

    public BubbleOptions markerAnchor(float f, float f2) {
        this.mMarkerAnchorU = f;
        this.mMarkerAnchorV = f2;
        return this;
    }

    public float getMarkerAnchorU() {
        return this.mMarkerAnchorU;
    }

    public float getMarkerAnchorV() {
        return this.mMarkerAnchorV;
    }

    public BubbleOptions content(String str) {
        this.mContent = str;
        return this;
    }

    public String getContent() {
        return this.mContent;
    }

    public BubbleOptions position(LatLng latLng) {
        this.mPosition = latLng;
        return this;
    }

    public LatLng getPosition() {
        return this.mPosition;
    }

    public BubbleOptions displayLevel(int i) {
        if (i < 0) {
            i = 0;
        }
        this.mDisplayLevel = i;
        return this;
    }

    public int getDisplayLevel() {
        return this.mDisplayLevel;
    }

    public BubbleOptions contentView(View view) {
        this.mContentView = view;
        return this;
    }

    public View getContentView() {
        return this.mContentView;
    }

    public BubbleOptions background(Drawable[] drawableArr) {
        this.mBackground = drawableArr;
        return this;
    }

    public BubbleOptions background(Bitmap[] bitmapArr) {
        if (bitmapArr != null) {
            this.mBackground = new Drawable[4];
            int length = bitmapArr.length;
            for (int i = 0; i < length; i++) {
                this.mBackground[i] = new BitmapDrawable(bitmapArr[i]);
            }
        }
        return this;
    }

    public Drawable[] getBackground() {
        return this.mBackground;
    }

    public BubbleOptions setOnTapHidden(boolean z) {
        this.mOnTapHidden = z;
        return this;
    }

    public boolean getOnTapHidden() {
        return this.mOnTapHidden;
    }
}
