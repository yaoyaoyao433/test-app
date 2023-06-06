package com.meituan.android.common.locate.track;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
@Deprecated
/* loaded from: classes2.dex */
public class SmoothLocModel {
    public static ChangeQuickRedirect changeQuickRedirect;
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;
    private double g;

    public SmoothLocModel(double d, double d2, double d3, double d4, double d5, double d6, double d7) {
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4), Double.valueOf(d5), Double.valueOf(d6), Double.valueOf(d7)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c9aef6abf85927155096eacdab3b5ad8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c9aef6abf85927155096eacdab3b5ad8");
            return;
        }
        this.a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
        this.e = d5;
        this.g = d7;
        this.f = d6;
    }

    public double getFilterAcc() {
        return this.c;
    }

    public double getFilterConfidence() {
        return this.d;
    }

    public double getFilterLat() {
        return this.a;
    }

    public double getFilterLng() {
        return this.b;
    }

    public double getRawYaw() {
        return this.e;
    }

    public double getReckonYaw() {
        return this.f;
    }

    public double getReckonyawConf() {
        return this.g;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6c5cfa10b0224cf6aa9c9aa80529a468", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6c5cfa10b0224cf6aa9c9aa80529a468");
        }
        return "SmoothLocModel{filterLat=" + this.a + ", filterLng=" + this.b + ", filterAcc=" + this.c + ", filterConfidence=" + this.d + ",rawYaw=" + this.e + ",reckonYaw=" + this.f + ",reckonyawConf=" + this.g + '}';
    }
}
