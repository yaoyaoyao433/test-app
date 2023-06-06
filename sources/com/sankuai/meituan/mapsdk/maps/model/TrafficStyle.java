package com.sankuai.meituan.mapsdk.maps.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class TrafficStyle {
    public static ChangeQuickRedirect changeQuickRedirect;
    private Integer a;
    private Integer b;
    private Integer c;
    private Integer d;
    private Integer e;
    private Integer f;
    private Integer g;
    private Integer h;
    private Integer i;
    private Integer j;
    private Boolean k;
    private String l;
    private Integer m;
    private Integer n;
    private float o;
    private int p;

    public TrafficStyle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5e8d51d4370f316b30e28e63376b02c3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5e8d51d4370f316b30e28e63376b02c3");
            return;
        }
        this.o = 0.8f;
        this.p = -1;
    }

    public Boolean isShowRoadStyle() {
        return this.k;
    }

    public void setShowRoadStyle(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ce6c31cddb162445089b7cf1b50c8042", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ce6c31cddb162445089b7cf1b50c8042");
        } else {
            this.k = Boolean.valueOf(z);
        }
    }

    public String getTrafficStyleUrl() {
        return this.l;
    }

    public void setTrafficStyleUrl(String str) {
        this.l = str;
    }

    public Integer getRoadBackgroundColor() {
        return this.m;
    }

    public void setRoadBackgroundColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2e6a844defea2c0a681727956fa569b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2e6a844defea2c0a681727956fa569b0");
        } else {
            this.m = Integer.valueOf(i);
        }
    }

    public Integer getRoadCasingColor() {
        return this.n;
    }

    public void setRoadCasingColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0c75a0bef90ecdf7077d53fcf988a16f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0c75a0bef90ecdf7077d53fcf988a16f");
        } else {
            this.n = Integer.valueOf(i);
        }
    }

    public Integer getWidth() {
        return this.j;
    }

    public void setWidth(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4ac8c87c6a481362caef5edc2dbb2331", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4ac8c87c6a481362caef5edc2dbb2331");
        } else {
            this.j = Integer.valueOf(i);
        }
    }

    public Integer getStrokeWidth() {
        return this.i;
    }

    public void setStrokeWidth(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b7781cbe725dfd3d0c2793436a9d4d38", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b7781cbe725dfd3d0c2793436a9d4d38");
        } else {
            this.i = Integer.valueOf(i);
        }
    }

    public Integer getSmoothColor() {
        return this.a;
    }

    public void setSmoothColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "55b26e7f4aa0687eac3c475419983dea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "55b26e7f4aa0687eac3c475419983dea");
        } else {
            this.a = Integer.valueOf(i);
        }
    }

    public Integer getSmoothStrokeColor() {
        return this.b;
    }

    public void setSmoothStrokeColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "45c493ac82f6f46dacb02bad81e247ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "45c493ac82f6f46dacb02bad81e247ac");
        } else {
            this.b = Integer.valueOf(i);
        }
    }

    public Integer getSlowColor() {
        return this.c;
    }

    public void setSlowStrokeColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fa4addc2f9ef5f4cf21d852c215d9552", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fa4addc2f9ef5f4cf21d852c215d9552");
        } else {
            this.d = Integer.valueOf(i);
        }
    }

    public Integer getSlowStrokeColor() {
        return this.d;
    }

    public void setSlowColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "be0b859f26c28e1653d741feec656599", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "be0b859f26c28e1653d741feec656599");
        } else {
            this.c = Integer.valueOf(i);
        }
    }

    public Integer getCongestedColor() {
        return this.e;
    }

    public void setCongestedColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "878b90fcf6923b9b262a43d4963daf97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "878b90fcf6923b9b262a43d4963daf97");
        } else {
            this.e = Integer.valueOf(i);
        }
    }

    public Integer getCongestedStrokeColor() {
        return this.f;
    }

    public void setCongestedStrokeColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c48c7e5671737e39ad18da8179e8f631", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c48c7e5671737e39ad18da8179e8f631");
        } else {
            this.f = Integer.valueOf(i);
        }
    }

    public Integer getSeriousCongestedColor() {
        return this.g;
    }

    public void setSeriousCongestedStrokeColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4edf096100b75dec53ada67c27e59238", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4edf096100b75dec53ada67c27e59238");
        } else {
            this.h = Integer.valueOf(i);
        }
    }

    public Integer getSeriousCongestedStrokeColor() {
        return this.h;
    }

    public void setSeriousCongestedColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "46c1b231ab3eefdbb87d5df38259c1a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "46c1b231ab3eefdbb87d5df38259c1a9");
        } else {
            this.g = Integer.valueOf(i);
        }
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c05223580eb45184855a188bb4253dfc", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c05223580eb45184855a188bb4253dfc");
        }
        return "TrafficStyle{mSmoothColor=" + this.a + ", mSmoothStrokeColor=" + this.b + ", mSlowColor=" + this.c + ", mSlowStrokeColor=" + this.d + ", mCongestedColor=" + this.e + ", mCongestedStrokeColor=" + this.f + ", mSeriousCongestedColor=" + this.g + ", mSeriousCongestedStrokeColor=" + this.h + ", mRatio=" + this.o + ", mTrafficRoadBackgroundColor=" + this.p + ", mStrokeWidth=" + this.i + ", mWidth=" + this.j + '}';
    }

    @Deprecated
    public float getRatio() {
        return this.o;
    }

    @Deprecated
    public void setRatio(float f) {
        this.o = f;
    }

    @Deprecated
    public int getTrafficRoadBackgroundColor() {
        return this.p;
    }

    @Deprecated
    public void setTrafficRoadBackgroundColor(int i) {
        this.p = i;
    }
}
