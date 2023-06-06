package com.tencent.tencentmap.mapsdk.maps.model;

import android.graphics.Color;
import com.tencent.smtt.sdk.TbsListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class PolygonOptions {
    private static final int COLOR_DEFAULT_POLYGON = Color.argb(200, 0, (int) TbsListener.ErrorCode.STARTDOWNLOAD_4, 255);
    private List<Integer> pattern;
    private BitmapDescriptor texture;
    private int textureSpacing;
    private int iLevel = 2;
    private float fStrokeWidth = 1.0f;
    private int iStrokeColor = -16777216;
    private boolean mClickable = true;
    private int iFillColor = COLOR_DEFAULT_POLYGON;
    private int iZindex = 0;
    private boolean boIsVisble = true;
    private final List<LatLng> listPts = new ArrayList();

    public void setPoints(Iterable<LatLng> iterable) {
        this.listPts.clear();
        if (iterable == null) {
            return;
        }
        addAll(iterable);
    }

    public PolygonOptions add(LatLng latLng) {
        if (latLng != null) {
            this.listPts.add(latLng);
        }
        return this;
    }

    public PolygonOptions add(LatLng... latLngArr) {
        if (latLngArr != null) {
            this.listPts.addAll(Arrays.asList(latLngArr));
        }
        return this;
    }

    public PolygonOptions add(List<LatLng> list) {
        if (list != null) {
            this.listPts.addAll(list);
        }
        return this;
    }

    public PolygonOptions addAll(Iterable<LatLng> iterable) {
        if (iterable != null) {
            for (LatLng latLng : iterable) {
                this.listPts.add(latLng);
            }
        }
        return this;
    }

    public PolygonOptions strokeWidth(float f) {
        if (f < 0.0f) {
            this.fStrokeWidth = 1.0f;
        } else {
            this.fStrokeWidth = f;
        }
        return this;
    }

    public PolygonOptions strokeColor(int i) {
        this.iStrokeColor = i;
        this.texture = null;
        return this;
    }

    public PolygonOptions fillColor(int i) {
        this.iFillColor = i;
        return this;
    }

    public PolygonOptions zIndex(int i) {
        this.iZindex = i;
        return this;
    }

    public PolygonOptions visible(boolean z) {
        this.boIsVisble = z;
        return this;
    }

    public PolygonOptions clickable(boolean z) {
        this.mClickable = z;
        return this;
    }

    public List<LatLng> getPoints() {
        return this.listPts;
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

    public float getZIndex() {
        return this.iZindex;
    }

    public boolean isVisible() {
        return this.boIsVisble;
    }

    public boolean isClickable() {
        return this.mClickable;
    }

    public PolygonOptions level(int i) {
        if (i < 0 || i > 2) {
            return this;
        }
        this.iLevel = i;
        return this;
    }

    public int getLevel() {
        return this.iLevel;
    }

    public boolean isValid() {
        return this.listPts != null && this.listPts.size() > 2;
    }

    public List<Integer> getPattern() {
        return this.pattern;
    }

    public PolygonOptions pattern(List<Integer> list) {
        this.pattern = list;
        this.texture = null;
        return this;
    }

    public BitmapDescriptor getTexture() {
        return this.texture;
    }

    public PolygonOptions texture(BitmapDescriptor bitmapDescriptor) {
        this.texture = bitmapDescriptor;
        return this;
    }

    public int getTextureSpacing() {
        return this.textureSpacing;
    }

    public PolygonOptions textureSpacing(int i) {
        this.textureSpacing = i;
        return this;
    }
}
