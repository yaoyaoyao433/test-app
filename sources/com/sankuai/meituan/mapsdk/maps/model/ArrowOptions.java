package com.sankuai.meituan.mapsdk.maps.model;

import android.graphics.Color;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.smtt.sdk.TbsListener;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class ArrowOptions {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<LatLng> a;
    private int b;
    private int c;
    private float d;
    private int e;
    private float f;
    private float g;
    private HeightUnit h;
    private float i;
    private boolean j;
    private int k;
    private float l;
    private boolean m;
    private boolean n;

    public ArrowOptions() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4be578305fe603d162371704d4d15e66", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4be578305fe603d162371704d4d15e66");
            return;
        }
        this.b = -1;
        this.c = Color.argb(1, 70, 124, (int) TbsListener.ErrorCode.NEEDDOWNLOAD_FALSE_1);
        this.d = 0.0f;
        this.e = Color.argb(1, 87, (int) TbsListener.ErrorCode.STARTDOWNLOAD_4, (int) TbsListener.ErrorCode.TPATCH_FAIL);
        this.f = 10.0f;
        this.g = 8.0f;
        this.h = HeightUnit.Pixel;
        this.i = 20.0f;
        this.j = true;
        this.k = 1;
        this.m = true;
        this.n = false;
    }

    public List<LatLng> getPoints() {
        return this.a;
    }

    public ArrowOptions points(List<LatLng> list) {
        this.a = list;
        return this;
    }

    public int getTopSurfaceColor() {
        return this.b;
    }

    public ArrowOptions topSurfaceColor(int i) {
        this.b = i;
        return this;
    }

    public int getOutlineColor() {
        return this.c;
    }

    public ArrowOptions outlineColor(int i) {
        this.c = i;
        return this;
    }

    public float getOutlineWidth() {
        return this.d;
    }

    public ArrowOptions outlineWidth(float f) {
        this.d = f;
        return this;
    }

    public int getColor() {
        return this.e;
    }

    public ArrowOptions color(int i) {
        this.e = i;
        return this;
    }

    public float getHeight() {
        return this.f;
    }

    public ArrowOptions height(float f, HeightUnit heightUnit) {
        Object[] objArr = {Float.valueOf(f), heightUnit};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7fdca7ee8b1805eb8e5e5a7427b1f876", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrowOptions) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7fdca7ee8b1805eb8e5e5a7427b1f876");
        }
        this.f = Math.abs(f);
        this.h = heightUnit;
        return this;
    }

    public HeightUnit getUnit() {
        return this.h;
    }

    public float getMinPitch() {
        return this.i;
    }

    public ArrowOptions minPitch(float f) {
        this.i = f;
        return this;
    }

    public float getWidth() {
        return this.g;
    }

    public ArrowOptions width(float f) {
        this.g = f;
        return this;
    }

    public boolean isVisible() {
        return this.j;
    }

    public ArrowOptions visible(boolean z) {
        this.j = z;
        return this;
    }

    public int getLevel() {
        return this.k;
    }

    public ArrowOptions setLevel(int i) {
        this.k = i;
        return this;
    }

    public float getZIndex() {
        return this.l;
    }

    public ArrowOptions zIndex(float f) {
        this.l = f;
        return this;
    }

    public boolean is3DModel() {
        return this.m;
    }

    public ArrowOptions set3DModel(boolean z) {
        this.m = z;
        return this;
    }

    public ArrowOptions avoidable(boolean z) {
        this.n = z;
        return this;
    }

    public boolean isAvoidable() {
        return this.n;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public enum HeightUnit {
        Meter,
        Pixel;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        HeightUnit() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7a1496e130af78849e0f2e15dd4d7446", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7a1496e130af78849e0f2e15dd4d7446");
            }
        }

        public static HeightUnit valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "69e9ceabffec2800cd21450792c4d37f", RobustBitConfig.DEFAULT_VALUE) ? (HeightUnit) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "69e9ceabffec2800cd21450792c4d37f") : (HeightUnit) Enum.valueOf(HeightUnit.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static HeightUnit[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9a9feb516ea4b7da3e645079b11383c7", RobustBitConfig.DEFAULT_VALUE) ? (HeightUnit[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9a9feb516ea4b7da3e645079b11383c7") : (HeightUnit[]) values().clone();
        }
    }
}
