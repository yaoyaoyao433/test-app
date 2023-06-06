package com.meituan.android.common.locate.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
/* loaded from: classes2.dex */
public final class Rectangle implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -3785278961434383333L;
    private final double max_latitude;
    private final double max_longitude;
    private final double min_latitude;
    private final double min_longitude;

    public Rectangle(double d, double d2, double d3, double d4) {
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e9df274b14e1bb56adf52abfa354fb5e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e9df274b14e1bb56adf52abfa354fb5e");
            return;
        }
        this.min_longitude = Math.min(d2, d4);
        this.max_latitude = Math.max(d, d3);
        this.max_longitude = Math.max(d2, d4);
        this.min_latitude = Math.min(d, d3);
    }

    public static boolean isInRectangle(Rectangle rectangle, Coordinate coordinate) {
        Object[] objArr = {rectangle, coordinate};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3aef9869de533c0a60f831361fc9392e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3aef9869de533c0a60f831361fc9392e")).booleanValue() : rectangle.min_longitude <= coordinate.getLongitude() && rectangle.max_longitude >= coordinate.getLongitude() && rectangle.max_latitude >= coordinate.getLatitude() && rectangle.min_latitude <= coordinate.getLatitude();
    }

    public final boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fa2a9159873a773b7057af0ff8901e69", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fa2a9159873a773b7057af0ff8901e69")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Rectangle rectangle = (Rectangle) obj;
            return Double.doubleToLongBits(this.max_latitude) == Double.doubleToLongBits(rectangle.max_latitude) && Double.doubleToLongBits(this.max_longitude) == Double.doubleToLongBits(rectangle.max_longitude) && Double.doubleToLongBits(this.min_latitude) == Double.doubleToLongBits(rectangle.min_latitude) && Double.doubleToLongBits(this.min_longitude) == Double.doubleToLongBits(rectangle.min_longitude);
        }
        return false;
    }

    public final double getMax_latitude() {
        return this.max_latitude;
    }

    public final double getMax_longitude() {
        return this.max_longitude;
    }

    public final double getMin_latitude() {
        return this.min_latitude;
    }

    public final double getMin_longitude() {
        return this.min_longitude;
    }

    public final int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "62af5a6dc06097c026f895e81edb3760", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "62af5a6dc06097c026f895e81edb3760")).intValue();
        }
        long doubleToLongBits = Double.doubleToLongBits(this.max_latitude);
        long doubleToLongBits2 = Double.doubleToLongBits(this.max_longitude);
        long doubleToLongBits3 = Double.doubleToLongBits(this.min_latitude);
        long doubleToLongBits4 = Double.doubleToLongBits(this.min_longitude);
        return ((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) ((doubleToLongBits4 >>> 32) ^ doubleToLongBits4));
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bc977a770f294f00f24e454e803303e6", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bc977a770f294f00f24e454e803303e6");
        }
        return new Coordinate(this.max_latitude, this.min_longitude).format() + " --> " + new Coordinate(this.min_latitude, this.max_longitude).format();
    }
}
