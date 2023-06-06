package com.tencent.mapsdk.internal;

import android.location.Location;
import com.tencent.tencentmap.mapsdk.maps.LocationSource;
import com.tencent.tencentmap.mapsdk.maps.model.MyLocationStyle;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class ac {
    public ai a;

    public ac(ai aiVar) {
        this.a = null;
        this.a = aiVar;
    }

    private void a() {
        if (this.a != null) {
            this.a = null;
        }
    }

    private Location b() {
        if (this.a != null) {
            return this.a.e();
        }
        return null;
    }

    private void a(LocationSource locationSource) {
        if (this.a != null) {
            this.a.a(locationSource);
        }
    }

    private void c() {
        if (this.a != null) {
            this.a.a();
        }
    }

    private void d() {
        if (this.a != null) {
            this.a.b();
        }
    }

    private void e() {
        if (this.a != null) {
            this.a.c();
        }
    }

    private boolean f() {
        if (this.a != null) {
            return this.a.d();
        }
        return false;
    }

    private void a(MyLocationStyle myLocationStyle) {
        if (this.a != null) {
            this.a.a(myLocationStyle);
        }
    }
}
