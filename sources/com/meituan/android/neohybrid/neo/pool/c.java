package com.meituan.android.neohybrid.neo.pool;

import com.meituan.android.neohybrid.core.config.NeoConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static void a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4798e8e4d2577f25dbfa60540e6b6fcb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4798e8e4d2577f25dbfa60540e6b6fcb");
        } else if (bVar == null || !bVar.a() || bVar.b == null) {
        } else {
            if (bVar.c == EnumC0308c.NORMAL) {
                com.meituan.android.neohybrid.neo.pool.b.a(bVar);
            } else if (bVar.c == EnumC0308c.PRELOAD) {
                d.a(bVar, com.meituan.android.neohybrid.neo.pool.b.a());
            } else if (bVar.c == EnumC0308c.NSR) {
                com.meituan.android.neohybrid.neo.pool.a.a(bVar, com.meituan.android.neohybrid.neo.pool.b.a());
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class b {
        public static ChangeQuickRedirect a;
        NeoConfig b;
        EnumC0308c c;
        long d;

        public static b a(EnumC0308c enumC0308c, NeoConfig neoConfig, long j) {
            Object[] objArr = {enumC0308c, neoConfig, new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7dc57d0283feeb0fc37841d4af868c1f", RobustBitConfig.DEFAULT_VALUE)) {
                return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7dc57d0283feeb0fc37841d4af868c1f");
            }
            b bVar = new b();
            bVar.b = neoConfig;
            bVar.c = enumC0308c;
            bVar.d = j;
            return bVar;
        }

        public final boolean a() {
            return (this.b == null || this.c == null || this.d < 0) ? false : true;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        String b;
        EnumC0308c c;

        public static a a(EnumC0308c enumC0308c, String str) {
            Object[] objArr = {enumC0308c, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "224b1067c958530cee4ec713d1990e78", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "224b1067c958530cee4ec713d1990e78");
            }
            a aVar = new a();
            aVar.c = enumC0308c;
            aVar.b = str;
            return aVar;
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.neohybrid.neo.pool.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public enum EnumC0308c {
        NORMAL,
        NSR,
        PRELOAD;
        
        public static ChangeQuickRedirect a;

        EnumC0308c() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc2ae6220b5d0f8dabe166fb1589128b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc2ae6220b5d0f8dabe166fb1589128b");
            }
        }

        public static EnumC0308c valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1f01417f63ee0c6a37234019c67a0b04", RobustBitConfig.DEFAULT_VALUE) ? (EnumC0308c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1f01417f63ee0c6a37234019c67a0b04") : (EnumC0308c) Enum.valueOf(EnumC0308c.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static EnumC0308c[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "63e993595932b4452bc55f267ef2ff48", RobustBitConfig.DEFAULT_VALUE) ? (EnumC0308c[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "63e993595932b4452bc55f267ef2ff48") : (EnumC0308c[]) values().clone();
        }
    }

    public static com.meituan.android.neohybrid.core.a a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c4eecfee24467df33c789b3c4c795ecc", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.neohybrid.core.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c4eecfee24467df33c789b3c4c795ecc");
        }
        if (aVar == null) {
            return null;
        }
        EnumC0308c enumC0308c = aVar.c;
        String str = aVar.b;
        switch (enumC0308c) {
            case NORMAL:
                return com.meituan.android.neohybrid.neo.pool.b.b();
            case NSR:
                return com.meituan.android.neohybrid.neo.pool.a.a(str, false);
            case PRELOAD:
                return d.a(str);
            default:
                return null;
        }
    }
}
