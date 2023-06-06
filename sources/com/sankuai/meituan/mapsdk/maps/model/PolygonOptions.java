package com.sankuai.meituan.mapsdk.maps.model;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class PolygonOptions {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int a;
    private int b;
    private final List<LatLng> c;
    private float d;
    private boolean e;
    private int f;
    private float g;
    private boolean h;
    private BitmapDescriptor i;
    private List<HoleOptions> j;
    private boolean k;
    private Object l;
    private int[] m;

    public PolygonOptions() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5d549c3d70281bce5cc3bd33850a8eda", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5d549c3d70281bce5cc3bd33850a8eda");
            return;
        }
        this.a = -7829368;
        this.b = -16711936;
        this.c = new ArrayList();
        this.d = 10.0f;
        this.e = true;
        this.f = 1;
        this.g = 0.0f;
        this.h = false;
        this.j = new ArrayList();
        this.k = false;
        this.m = new int[]{0, 0};
    }

    public final boolean isDottedLine() {
        return this.k;
    }

    public final PolygonOptions dottedLine(boolean z) {
        this.k = z;
        return this;
    }

    public final PolygonOptions dashArray(int[] iArr) {
        this.m = iArr;
        return this;
    }

    public final int[] getDashArray() {
        return this.m;
    }

    public final PolygonOptions add(@NonNull LatLng latLng) {
        Object[] objArr = {latLng};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c02cef122688e758c63840685b9ed1f9", RobustBitConfig.DEFAULT_VALUE)) {
            return (PolygonOptions) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c02cef122688e758c63840685b9ed1f9");
        }
        this.c.add(latLng);
        return this;
    }

    public final PolygonOptions addAll(@NonNull Iterable<LatLng> iterable) {
        Object[] objArr = {iterable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "796424deadf7409b2cbc4b02988641fa", RobustBitConfig.DEFAULT_VALUE)) {
            return (PolygonOptions) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "796424deadf7409b2cbc4b02988641fa");
        }
        ArrayList arrayList = new ArrayList();
        for (LatLng latLng : iterable) {
            arrayList.add(latLng);
        }
        this.c.addAll(arrayList);
        return this;
    }

    public final PolygonOptions strokeWidth(float f) {
        this.d = f;
        return this;
    }

    public final PolygonOptions strokeColor(int i) {
        this.a = i;
        return this;
    }

    public final PolygonOptions fillColor(int i) {
        this.b = i;
        return this;
    }

    public final int getLevel() {
        return this.f;
    }

    @Deprecated
    public final void setLevel(int i) {
        this.f = i;
    }

    public final PolygonOptions level(int i) {
        this.f = i;
        return this;
    }

    public final PolygonOptions zIndex(float f) {
        this.g = f;
        return this;
    }

    public final PolygonOptions visible(boolean z) {
        this.e = z;
        return this;
    }

    public final PolygonOptions clickable(boolean z) {
        this.h = z;
        return this;
    }

    public final List<LatLng> getPoints() {
        return this.c;
    }

    public final float getStrokeWidth() {
        return this.d;
    }

    public final int getStrokeColor() {
        return this.a;
    }

    public final int getFillColor() {
        return this.b;
    }

    public final float getZIndex() {
        return this.g;
    }

    public final boolean isVisible() {
        return this.e;
    }

    public final boolean isClickable() {
        return this.h;
    }

    public final PolygonOptions addHole(HoleOptions holeOptions) {
        Object[] objArr = {holeOptions};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "15a47f880c5a7fe9526838876bc571c1", RobustBitConfig.DEFAULT_VALUE)) {
            return (PolygonOptions) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "15a47f880c5a7fe9526838876bc571c1");
        }
        this.j.add(holeOptions);
        return this;
    }

    public final PolygonOptions addHoles(List<HoleOptions> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "606556c7c9ce0e4cbeef3a70229a1ad4", RobustBitConfig.DEFAULT_VALUE)) {
            return (PolygonOptions) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "606556c7c9ce0e4cbeef3a70229a1ad4");
        }
        for (HoleOptions holeOptions : list) {
            this.j.add(holeOptions);
        }
        return this;
    }

    public final List<HoleOptions> getHoles() {
        return this.j;
    }

    public final PolygonOptions fillTexture(BitmapDescriptor bitmapDescriptor) {
        this.i = bitmapDescriptor;
        return this;
    }

    public final PolygonOptions tag(Object obj) {
        this.l = obj;
        return this;
    }

    public final Object getTag() {
        return this.l;
    }

    public final BitmapDescriptor getFillTexture() {
        return this.i;
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ec1037fc87ad19e8e8b2dd8a3c17ec27", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ec1037fc87ad19e8e8b2dd8a3c17ec27");
        }
        return "PolygonOptions{strokeColor=" + this.a + ", fillColor=" + this.b + ", points=" + this.c + ", strokeWidth=" + this.d + ", isVisible=" + this.e + ", level=" + this.f + ", tag=" + this.l + ", zIndex=" + this.g + ", clickable=" + this.h + ", isDottedLine=" + this.k + ", dottedLineArray=" + this.m[0] + CommonConstant.Symbol.COMMA + this.m[1] + '}';
    }
}
