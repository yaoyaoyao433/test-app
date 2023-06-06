package com.sankuai.meituan.mapsdk.maps.model;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.mapcore.utils.c;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class LatLngBounds {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final LatLng northeast;
    public final LatLng southwest;

    /* JADX INFO: Access modifiers changed from: private */
    public static double a(double d, double d2) {
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3cff9acc86748623e2a53a4bc8ed0070", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3cff9acc86748623e2a53a4bc8ed0070")).doubleValue() : ((d - d2) + 360.0d) % 360.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double b(double d, double d2) {
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4d843cd9b167ebf2cdfc183ceec0b6b8", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4d843cd9b167ebf2cdfc183ceec0b6b8")).doubleValue() : ((d2 - d) + 360.0d) % 360.0d;
    }

    public LatLngBounds(@NonNull LatLng latLng, @NonNull LatLng latLng2) {
        Object[] objArr = {latLng, latLng2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f840629c5b19757400fb0a9aa786dae6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f840629c5b19757400fb0a9aa786dae6");
            return;
        }
        Builder include = new Builder().include(latLng).include(latLng2);
        this.southwest = new LatLng(include.mSouth, include.mWest);
        this.northeast = new LatLng(include.mNorth, include.mEast);
    }

    public static Builder builder() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "94bb773eca88ee44dbb571b9277044f3", RobustBitConfig.DEFAULT_VALUE) ? (Builder) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "94bb773eca88ee44dbb571b9277044f3") : new Builder();
    }

    public boolean contains(@NonNull LatLng latLng) {
        boolean z;
        Object[] objArr = {latLng};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1da25cb28c9b96c4c97a1de67f3696e2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1da25cb28c9b96c4c97a1de67f3696e2")).booleanValue();
        }
        double d = latLng.latitude;
        Object[] objArr2 = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "40c876fdff99706d40e7bfff1c74f8e3", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "40c876fdff99706d40e7bfff1c74f8e3")).booleanValue();
        } else {
            z = this.southwest.latitude <= d && d <= this.northeast.latitude;
        }
        return z && a(latLng.longitude);
    }

    public boolean contains(LatLngBounds latLngBounds) {
        Object[] objArr = {latLngBounds};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bc3dfa4ca7faf9339bb0279f9cea3408", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bc3dfa4ca7faf9339bb0279f9cea3408")).booleanValue() : latLngBounds != null && contains(latLngBounds.southwest) && contains(latLngBounds.northeast);
    }

    public boolean intersects(LatLngBounds latLngBounds) {
        Object[] objArr = {latLngBounds};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b4700f63b5db052c0d368b459e020489", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b4700f63b5db052c0d368b459e020489")).booleanValue() : latLngBounds != null && (intersect(latLngBounds) || latLngBounds.intersect(this));
    }

    public boolean intersect(LatLngBounds latLngBounds) {
        Object[] objArr = {latLngBounds};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "64342d7cbe8cab4ca8d55893ae9fb633", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "64342d7cbe8cab4ca8d55893ae9fb633")).booleanValue();
        }
        if (latLngBounds == null || latLngBounds.northeast == null || latLngBounds.southwest == null || this.northeast == null || this.southwest == null) {
            return false;
        }
        return Math.abs(((latLngBounds.northeast.longitude + latLngBounds.southwest.longitude) - this.northeast.longitude) - this.southwest.longitude) < ((this.northeast.longitude - this.southwest.longitude) + latLngBounds.northeast.longitude) - latLngBounds.southwest.longitude && Math.abs(((latLngBounds.northeast.latitude + latLngBounds.southwest.latitude) - this.northeast.latitude) - this.southwest.latitude) < ((this.northeast.latitude - this.southwest.latitude) + latLngBounds.northeast.latitude) - latLngBounds.southwest.latitude;
    }

    public LatLngBounds including(LatLng latLng) {
        Object[] objArr = {latLng};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7bc1c07901ba453a1a0bd9bcd43ec02f", RobustBitConfig.DEFAULT_VALUE)) {
            return (LatLngBounds) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7bc1c07901ba453a1a0bd9bcd43ec02f");
        }
        double min = Math.min(this.southwest.latitude, latLng.latitude);
        double max = Math.max(this.northeast.latitude, latLng.latitude);
        double d = this.northeast.longitude;
        double d2 = this.southwest.longitude;
        double d3 = latLng.longitude;
        if (!a(d3)) {
            if (a(d2, d3) < b(d, d3)) {
                d2 = d3;
            } else {
                d = d3;
            }
        }
        return new LatLngBounds(new LatLng(min, d2), new LatLng(max, d));
    }

    private boolean a(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c20b508056f06947257bf7dce7f7aaa0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c20b508056f06947257bf7dce7f7aaa0")).booleanValue() : this.southwest.longitude <= this.northeast.longitude ? this.southwest.longitude <= d && d <= this.northeast.longitude : this.southwest.longitude <= d || d <= this.northeast.longitude;
    }

    public LatLng getCenter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a00017cd8507fb9d29552a79f4a062b7", RobustBitConfig.DEFAULT_VALUE) ? (LatLng) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a00017cd8507fb9d29552a79f4a062b7") : new LatLng((this.southwest.latitude + this.northeast.latitude) / 2.0d, (this.southwest.longitude + this.northeast.longitude) / 2.0d);
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b9700085bba653949754cf908d7396bc", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b9700085bba653949754cf908d7396bc");
        }
        if (this.southwest == null || this.northeast == null) {
            return "";
        }
        return this.southwest + CommonConstant.Symbol.COMMA + this.northeast;
    }

    public boolean isValid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "386784cad16f8d8d38919ecbb75be824", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "386784cad16f8d8d38919ecbb75be824")).booleanValue() : this.southwest != null && this.southwest.isValid() && this.northeast != null && this.northeast.isValid();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static final class Builder {
        public static ChangeQuickRedirect changeQuickRedirect;
        public double mEast;
        public double mNorth;
        public double mSouth;
        public double mWest;

        public Builder() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6ba6de58a79acb92888155a7022148a0", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6ba6de58a79acb92888155a7022148a0");
                return;
            }
            this.mSouth = Double.POSITIVE_INFINITY;
            this.mNorth = Double.NEGATIVE_INFINITY;
            this.mWest = Double.NaN;
            this.mEast = Double.NaN;
        }

        public final Builder include(LatLng latLng) {
            boolean z = true;
            Object[] objArr = {latLng};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "da36bc001741c11b30aecf8d67ac45ee", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "da36bc001741c11b30aecf8d67ac45ee");
            }
            if (latLng == null) {
                c.e("LatLngBounds.Builder include point cannot be null!");
                return this;
            }
            this.mSouth = Math.min(this.mSouth, latLng.latitude);
            this.mNorth = Math.max(this.mNorth, latLng.latitude);
            double d = latLng.longitude;
            if (Double.isNaN(this.mWest)) {
                this.mWest = d;
            } else {
                Object[] objArr2 = {Double.valueOf(d)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "40379611b47372570c950fbaf93d9d1e", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "40379611b47372570c950fbaf93d9d1e")).booleanValue();
                } else if (this.mWest > this.mEast ? !(this.mWest <= d || d <= this.mEast) : !(this.mWest <= d && d <= this.mEast)) {
                    z = false;
                }
                if (z) {
                    return this;
                }
                if (LatLngBounds.a(this.mWest, d) < LatLngBounds.b(this.mEast, d)) {
                    this.mWest = d;
                    return this;
                }
            }
            this.mEast = d;
            return this;
        }

        public final LatLngBounds build() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "67e60371981cca3e83dc2a89e95fd019", RobustBitConfig.DEFAULT_VALUE) ? (LatLngBounds) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "67e60371981cca3e83dc2a89e95fd019") : new LatLngBounds(new LatLng(this.mSouth, this.mWest), new LatLng(this.mNorth, this.mEast));
        }
    }
}
