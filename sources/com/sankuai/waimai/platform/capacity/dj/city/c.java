package com.sankuai.waimai.platform.capacity.dj.city;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c implements Serializable, Comparable<c> {
    public static ChangeQuickRedirect a = null;
    private static final int[] b = {16, 8, 4, 2, 1};
    private static final char[] c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'j', 'k', 'm', 'n', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    private static final Map<Character, Integer> d = new HashMap();
    private static final long serialVersionUID = 3743461830692281955L;
    private long e;
    private byte f;
    private final b g;
    private final a h;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(c cVar) {
        c cVar2 = cVar;
        Object[] objArr = {cVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d015109e39d008ae4ac5555814786a1c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d015109e39d008ae4ac5555814786a1c")).intValue();
        }
        int compareTo = Long.valueOf(this.e ^ Long.MIN_VALUE).compareTo(Long.valueOf(cVar2.e ^ Long.MIN_VALUE));
        return compareTo != 0 ? compareTo : Integer.valueOf(this.f).compareTo(Integer.valueOf(cVar2.f));
    }

    static {
        int length = c.length;
        for (int i = 0; i < length; i++) {
            d.put(Character.valueOf(c[i]), Integer.valueOf(i));
        }
    }

    public static c a(double d2, double d3, int i) {
        Object[] objArr = {Double.valueOf(d2), Double.valueOf(d3), 7};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "15e379d6f8edb900b928724e7774a87d", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "15e379d6f8edb900b928724e7774a87d");
        }
        a aVar = new a(d2, d3);
        Object[] objArr2 = {aVar, 7};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        return PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "8ba796b5b08dea2e82cd320cecef85e3", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "8ba796b5b08dea2e82cd320cecef85e3") : new c(aVar, 35);
    }

    private c(a aVar, int i) {
        Object[] objArr = {aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae5450c25e9b97c3b9584a1ae78bb6f6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae5450c25e9b97c3b9584a1ae78bb6f6");
            return;
        }
        this.e = 0L;
        this.f = (byte) 0;
        int min = Math.min(i, 64);
        double[] dArr = {-90.0d, 90.0d};
        double[] dArr2 = {-180.0d, 180.0d};
        boolean z = true;
        while (this.f < min) {
            if (z) {
                a(aVar.c, dArr2);
            } else {
                a(aVar.b, dArr);
            }
            z = !z;
        }
        this.h = new a((dArr[0] + dArr[1]) / 2.0d, (dArr2[0] + dArr2[1]) / 2.0d);
        this.g = new b(dArr[0], dArr2[0], dArr[1], dArr2[1]);
        this.e <<= 64 - min;
    }

    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d10d18e48e3cb5bd3d54e48450dbdb6", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d10d18e48e3cb5bd3d54e48450dbdb6");
        }
        if (this.f % 5 != 0) {
            throw new IllegalStateException("Cannot convert a geohash to base32 if the precision is not a multiple of 5.");
        }
        StringBuilder sb = new StringBuilder();
        long j = this.e;
        int ceil = (int) Math.ceil(this.f / 5.0d);
        for (int i = 0; i < ceil; i++) {
            sb.append(c[(int) (((-576460752303423488L) & j) >>> 59)]);
            j <<= 5;
        }
        return sb.toString();
    }

    private void a(double d2, double[] dArr) {
        Object[] objArr = {Double.valueOf(d2), dArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26d5e77a1cf6187a6effbb4c16d5d324", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26d5e77a1cf6187a6effbb4c16d5d324");
            return;
        }
        double d3 = (dArr[0] + dArr[1]) / 2.0d;
        if (d2 >= d3) {
            b();
            dArr[0] = d3;
            return;
        }
        c();
        dArr[1] = d3;
    }

    private final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9234c87d8dace47dcdd209bd684b145", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9234c87d8dace47dcdd209bd684b145");
            return;
        }
        this.f = (byte) (this.f + 1);
        this.e <<= 1;
        this.e |= 1;
    }

    private final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd7bb956ed7b9840086b3e9674e146e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd7bb956ed7b9840086b3e9674e146e7");
            return;
        }
        this.f = (byte) (this.f + 1);
        this.e <<= 1;
    }

    public final int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dfea7a3c2c1eeffe1387491385f2811e", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dfea7a3c2c1eeffe1387491385f2811e")).intValue() : ((((int) (this.e ^ (this.e >>> 32))) + 31) * 31) + this.f;
    }

    public final boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "effb6336a27c447adce8225bceda158c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "effb6336a27c447adce8225bceda158c")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            c cVar = (c) obj;
            return this.e == cVar.e && this.f == cVar.f;
        }
        return false;
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b69756ff4fe7a177b1f3734454589e8f", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b69756ff4fe7a177b1f3734454589e8f") : this.f % 5 == 0 ? String.format("%s -> %s -> %s", Long.toBinaryString(this.e), this.g, a()) : String.format("%s -> %s, bits: %d", Long.toBinaryString(this.e), this.g, Byte.valueOf(this.f));
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static final class a implements Serializable {
        public static ChangeQuickRedirect a = null;
        private static final long serialVersionUID = 6982596967538963620L;
        final double b;
        final double c;

        public a(double d, double d2) {
            Object[] objArr = {Double.valueOf(d), Double.valueOf(d2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cefa46b9dfdfbc322828b3f80ec10efc", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cefa46b9dfdfbc322828b3f80ec10efc");
            } else if (Math.abs(d) > 90.0d || Math.abs(d2) > 180.0d) {
                throw new IllegalArgumentException("Can't have lat/lon values out of (-90,90)/(-180/180)");
            } else {
                this.b = d;
                this.c = d2;
            }
        }

        public final String a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d5159214147bd50bab6be70c56c6872", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d5159214147bd50bab6be70c56c6872");
            }
            return NumberFormat.getNumberInstance().format(this.b) + CommonConstant.Symbol.COMMA + NumberFormat.getNumberInstance().format(this.c);
        }

        public final int hashCode() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd0237052c2dc2f88133f46b2ea4522c", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd0237052c2dc2f88133f46b2ea4522c")).intValue();
            }
            long doubleToLongBits = Double.doubleToLongBits(this.b);
            long doubleToLongBits2 = Double.doubleToLongBits(this.c);
            return ((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) ((doubleToLongBits2 >>> 32) ^ doubleToLongBits2));
        }

        public final boolean equals(Object obj) {
            Object[] objArr = {obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c51e49b308b6e226433eb3854730c064", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c51e49b308b6e226433eb3854730c064")).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                a aVar = (a) obj;
                return Double.doubleToLongBits(this.b) == Double.doubleToLongBits(aVar.b) && Double.doubleToLongBits(this.c) == Double.doubleToLongBits(aVar.c);
            }
            return false;
        }

        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53a81201d411db073e98d0da7a0bb6b1", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53a81201d411db073e98d0da7a0bb6b1");
            }
            return CommonConstant.Symbol.BRACKET_LEFT + this.b + CommonConstant.Symbol.COMMA + this.c + CommonConstant.Symbol.BRACKET_RIGHT;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static final class b implements Serializable {
        public static ChangeQuickRedirect a = null;
        private static final long serialVersionUID = -3785278961434383333L;
        private final double b;
        private final double c;
        private final double d;
        private final double e;

        public b(double d, double d2, double d3, double d4) {
            Object[] objArr = {Double.valueOf(d), Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66f7af08e82392270b70652888a289f1", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66f7af08e82392270b70652888a289f1");
                return;
            }
            this.b = Math.min(d2, d4);
            this.e = Math.max(d, d3);
            this.c = Math.max(d2, d4);
            this.d = Math.min(d, d3);
        }

        public final int hashCode() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b6919925d42e4660fda333b6025b2c3", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b6919925d42e4660fda333b6025b2c3")).intValue();
            }
            long doubleToLongBits = Double.doubleToLongBits(this.e);
            long doubleToLongBits2 = Double.doubleToLongBits(this.c);
            long doubleToLongBits3 = Double.doubleToLongBits(this.d);
            long doubleToLongBits4 = Double.doubleToLongBits(this.b);
            return ((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) ((doubleToLongBits4 >>> 32) ^ doubleToLongBits4));
        }

        public final boolean equals(Object obj) {
            Object[] objArr = {obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d3fb0d7679d9ce109e500ba9c077527", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d3fb0d7679d9ce109e500ba9c077527")).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                b bVar = (b) obj;
                return Double.doubleToLongBits(this.e) == Double.doubleToLongBits(bVar.e) && Double.doubleToLongBits(this.c) == Double.doubleToLongBits(bVar.c) && Double.doubleToLongBits(this.d) == Double.doubleToLongBits(bVar.d) && Double.doubleToLongBits(this.b) == Double.doubleToLongBits(bVar.b);
            }
            return false;
        }

        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26afcb29880b8cffa58a31a50b07a936", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26afcb29880b8cffa58a31a50b07a936");
            }
            return new a(this.e, this.b).a() + " --> " + new a(this.d, this.c).a();
        }
    }
}
