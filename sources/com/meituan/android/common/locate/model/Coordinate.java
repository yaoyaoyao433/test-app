package com.meituan.android.common.locate.model;

import com.meituan.android.common.locate.util.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
/* loaded from: classes2.dex */
public final class Coordinate implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 6982596967538963620L;
    private final double latitude;
    private final double longitude;

    public Coordinate(double d, double d2) {
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "05cbd6bc9da7ffc16b5cb321b975f38f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "05cbd6bc9da7ffc16b5cb321b975f38f");
        } else if (Math.abs(d) > 90.0d || Math.abs(d2) > 180.0d) {
            throw new IllegalArgumentException("Can't have lat/lon values out of (-90,90)/(-180/180)");
        } else {
            this.latitude = d;
            this.longitude = d2;
        }
    }

    public final boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2779283803a549000ce1386b7f039ea1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2779283803a549000ce1386b7f039ea1")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Coordinate coordinate = (Coordinate) obj;
            return Double.doubleToLongBits(this.latitude) == Double.doubleToLongBits(coordinate.latitude) && Double.doubleToLongBits(this.longitude) == Double.doubleToLongBits(coordinate.longitude);
        }
        return false;
    }

    public final String format() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "630bcaaf0892665d40ac1b4ef59ed3ad", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "630bcaaf0892665d40ac1b4ef59ed3ad") : d.a(this);
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public final int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f923aef82b396382a65f87fe8cb5ec14", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f923aef82b396382a65f87fe8cb5ec14")).intValue();
        }
        long doubleToLongBits = Double.doubleToLongBits(this.latitude);
        long doubleToLongBits2 = Double.doubleToLongBits(this.longitude);
        return ((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) ((doubleToLongBits2 >>> 32) ^ doubleToLongBits2));
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1e08c3c08e0a72e45d0d67b684320bbd", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1e08c3c08e0a72e45d0d67b684320bbd");
        }
        return CommonConstant.Symbol.BRACKET_LEFT + this.latitude + CommonConstant.Symbol.COMMA + this.longitude + CommonConstant.Symbol.BRACKET_RIGHT;
    }
}
