package com.sankuai.waimai.foundation.location.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public static final b b = new b();
    public final double c;
    public final double d;

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efa202a5bb80c21110a4dbabae23cae3", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efa202a5bb80c21110a4dbabae23cae3") : new a(this.c, this.d);
    }

    public a(double d, double d2) {
        this(d, d2, true);
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00cfd99bafc7e7f959ed33111a7762f5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00cfd99bafc7e7f959ed33111a7762f5");
        }
    }

    private a(double d, double d2, boolean z) {
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2), (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e122fb9c22d1f7e4d9d59fc5db402388", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e122fb9c22d1f7e4d9d59fc5db402388");
            return;
        }
        if (-180.0d <= d2 && d2 < 180.0d) {
            this.d = d2;
        } else {
            this.d = ((((d2 - 180.0d) % 360.0d) + 360.0d) % 360.0d) - 180.0d;
        }
        if (d < -90.0d || d > 90.0d) {
            try {
                throw new Exception("非法坐标值");
            } catch (Exception e) {
                com.sankuai.waimai.foundation.location.utils.b.a(e);
            }
        }
        this.c = Math.max(-90.0d, Math.min(90.0d, d));
    }

    public final int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24bec10b93c51b848e1c2fc6245e9b17", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24bec10b93c51b848e1c2fc6245e9b17")).intValue();
        }
        long doubleToLongBits = Double.doubleToLongBits(this.c);
        long doubleToLongBits2 = Double.doubleToLongBits(this.d);
        return ((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) ((doubleToLongBits2 >>> 32) ^ doubleToLongBits2));
    }

    public final boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4b2dd03a287fc527a80988d27120498", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4b2dd03a287fc527a80988d27120498")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return Double.doubleToLongBits(this.c) == Double.doubleToLongBits(aVar.c) && Double.doubleToLongBits(this.d) == Double.doubleToLongBits(aVar.d);
        }
        return false;
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fcbd2eadc675c2d51c4ad25d24f3e50", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fcbd2eadc675c2d51c4ad25d24f3e50");
        }
        return "lat/lng: (" + this.c + CommonConstant.Symbol.COMMA + this.d + CommonConstant.Symbol.BRACKET_RIGHT;
    }
}
