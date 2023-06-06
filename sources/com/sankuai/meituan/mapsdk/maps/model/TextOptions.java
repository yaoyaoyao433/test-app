package com.sankuai.meituan.mapsdk.maps.model;

import android.graphics.Typeface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class TextOptions {
    public static ChangeQuickRedirect changeQuickRedirect;
    private LatLng a;
    private String b;
    private Typeface c;
    private float d;
    private int e;
    private int f;
    private Object g;
    private int h;
    private float i;
    private boolean j;
    private float k;
    private float l;

    public TextOptions() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "36c45e99d6d2a301eea378d90119113a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "36c45e99d6d2a301eea378d90119113a");
            return;
        }
        this.k = 0.5f;
        this.l = 0.5f;
        this.c = Typeface.DEFAULT;
        this.e = -1;
        this.f = -16777216;
        this.h = 20;
        this.i = 0.0f;
        this.j = true;
    }

    public final float getAlignX() {
        return this.k;
    }

    public final float getAlignY() {
        return this.l;
    }

    public final TextOptions align(float f, float f2) {
        this.k = f;
        this.l = f2;
        return this;
    }

    public final TextOptions position(LatLng latLng) {
        this.a = latLng;
        return this;
    }

    public final TextOptions text(String str) {
        this.b = str;
        return this;
    }

    public final TextOptions typeface(Typeface typeface) {
        if (typeface != null) {
            this.c = typeface;
        }
        return this;
    }

    public final TextOptions visible(boolean z) {
        this.j = z;
        return this;
    }

    public final TextOptions zIndex(float f) {
        this.i = f;
        return this;
    }

    public final TextOptions rotate(float f) {
        this.d = f;
        return this;
    }

    public final TextOptions backgroundColor(int i) {
        this.e = i;
        return this;
    }

    public final TextOptions setObject(Object obj) {
        this.g = obj;
        return this;
    }

    public final TextOptions fontColor(int i) {
        this.f = i;
        return this;
    }

    public final TextOptions fontSize(int i) {
        this.h = i;
        return this;
    }

    public final LatLng getPosition() {
        return this.a;
    }

    public final String getText() {
        return this.b;
    }

    public final Typeface getTypeface() {
        return this.c;
    }

    public final float getRotate() {
        return this.d;
    }

    public final int getBackgroundColor() {
        return this.e;
    }

    public final int getFontColor() {
        return this.f;
    }

    public final Object getObject() {
        return this.g;
    }

    public final int getFontSize() {
        return this.h;
    }

    public final float getZIndex() {
        return this.i;
    }

    public final boolean isVisible() {
        return this.j;
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "501048e702d3de98e18e6454c837d994", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "501048e702d3de98e18e6454c837d994");
        }
        return "TextOptions{position=" + this.a + ", text='" + this.b + "', typeface=" + this.c + ", rotate=" + this.d + ", backgroundColor=" + this.e + ", fontColor=" + this.f + ", object=" + this.g + ", fontSize=" + this.h + ", zIndex=" + this.i + ", visible=" + this.j + '}';
    }
}
