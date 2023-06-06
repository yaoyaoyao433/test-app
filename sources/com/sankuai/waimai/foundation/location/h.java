package com.sankuai.waimai.foundation.location;

import com.meituan.android.cipstorage.ah;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.e;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class h {
    public static ChangeQuickRedirect a;
    private static com.sankuai.waimai.foundation.utils.e<LocationSPKeys> b = new com.sankuai.waimai.foundation.utils.e<>("waimai_location_common_sp");

    public static long a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2003588fbdc68ca3fb688a7e44eac271", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2003588fbdc68ca3fb688a7e44eac271")).longValue() : b.b((com.sankuai.waimai.foundation.utils.e<LocationSPKeys>) LocationSPKeys.A_CITY_ID, 0L);
    }

    public static String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "27dc0fa7b81595a418cd03fc6928cb4c", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "27dc0fa7b81595a418cd03fc6928cb4c") : b.b((com.sankuai.waimai.foundation.utils.e<LocationSPKeys>) LocationSPKeys.A_CITY_NAME, "");
    }

    public static void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "802f23b05d69eab038794f1a55840d27", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "802f23b05d69eab038794f1a55840d27");
        } else {
            b.a((com.sankuai.waimai.foundation.utils.e<LocationSPKeys>) LocationSPKeys.A_CITY_ID, j);
        }
    }

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0ef365a55f4f063167d5c1fe397d25a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0ef365a55f4f063167d5c1fe397d25a9");
        } else {
            b.a((com.sankuai.waimai.foundation.utils.e<LocationSPKeys>) LocationSPKeys.A_CITY_NAME, str);
        }
    }

    public static String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "442519b138d8ce34a6a5cda7a401e6fd", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "442519b138d8ce34a6a5cda7a401e6fd") : b.b((com.sankuai.waimai.foundation.utils.e<LocationSPKeys>) LocationSPKeys.CITY_CODE, "");
    }

    public static String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1b46c18ab6865926a1a9b46812df3121", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1b46c18ab6865926a1a9b46812df3121") : b.b((com.sankuai.waimai.foundation.utils.e<LocationSPKeys>) LocationSPKeys.CITY_NAME, "");
    }

    public static void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "64a19093c9ce9a8237a639cc36e58309", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "64a19093c9ce9a8237a639cc36e58309");
        } else {
            b.a((com.sankuai.waimai.foundation.utils.e<LocationSPKeys>) LocationSPKeys.CITY_CODE, str);
        }
    }

    public static void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "97424d992c8a6b71c6ab1628a1dc4f58", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "97424d992c8a6b71c6ab1628a1dc4f58");
        } else {
            b.a((com.sankuai.waimai.foundation.utils.e<LocationSPKeys>) LocationSPKeys.CITY_NAME, str);
        }
    }

    public static void d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "94e694b7b31f4040db4bffe6a0e02c68", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "94e694b7b31f4040db4bffe6a0e02c68");
        } else {
            b.a((com.sankuai.waimai.foundation.utils.e<LocationSPKeys>) LocationSPKeys.REAL_CITY_CODE, str);
        }
    }

    public static void e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a4fc2c4a221677a0836d591d8ec463a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a4fc2c4a221677a0836d591d8ec463a1");
        } else {
            b.a((com.sankuai.waimai.foundation.utils.e<LocationSPKeys>) LocationSPKeys.REAL_CITY_NAME, str);
        }
    }

    public static String e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "abed2ee7755f0e58bffb22714796a2a8", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "abed2ee7755f0e58bffb22714796a2a8") : b.b((com.sankuai.waimai.foundation.utils.e<LocationSPKeys>) LocationSPKeys.POI_LOCATION, "");
    }

    public static void f(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d3bebed575e1baed7766193bbf108501", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d3bebed575e1baed7766193bbf108501");
        } else {
            b.a((com.sankuai.waimai.foundation.utils.e<LocationSPKeys>) LocationSPKeys.POI_LOCATION, str);
        }
    }

    public static void g(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4b91a0a9c19c745ebd8b320516c9d5e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4b91a0a9c19c745ebd8b320516c9d5e7");
        } else {
            b.a((com.sankuai.waimai.foundation.utils.e<LocationSPKeys>) LocationSPKeys.REAL_LOCATION, str);
        }
    }

    public static String f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "556eb442a185af4dbe98ccc811424455", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "556eb442a185af4dbe98ccc811424455") : b.b((com.sankuai.waimai.foundation.utils.e<LocationSPKeys>) LocationSPKeys.REAL_LOCATION, "");
    }

    public static void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "37f46318fb3d3c36a266ae3cb6bbe481", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "37f46318fb3d3c36a266ae3cb6bbe481");
        } else {
            b.a((com.sankuai.waimai.foundation.utils.e<LocationSPKeys>) LocationSPKeys.REAL_LOCATION_ACCURACY, i);
        }
    }

    public static int g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ba7e43aba2f324c0952cdffe746ee682", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ba7e43aba2f324c0952cdffe746ee682")).intValue() : b.b((com.sankuai.waimai.foundation.utils.e<LocationSPKeys>) LocationSPKeys.REAL_LOCATION_ACCURACY, 0);
    }

    public static String h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4d9f2b4b1f2fcdb6c6c52c2cd063f904", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4d9f2b4b1f2fcdb6c6c52c2cd063f904") : b.b((com.sankuai.waimai.foundation.utils.e<LocationSPKeys>) LocationSPKeys.HORN_LOCATION_CONFIG, "");
    }

    public static void a(final e.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c4e103fbf4666af97b7d0a21e298cd49", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c4e103fbf4666af97b7d0a21e298cd49");
            return;
        }
        final com.sankuai.waimai.foundation.utils.e<LocationSPKeys> eVar = b;
        Object[] objArr2 = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.foundation.utils.e.a;
        if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "5a3788dbfb675d02c1b1b4ae9c8f6e9e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "5a3788dbfb675d02c1b1b4ae9c8f6e9e");
        } else {
            eVar.b.a(new ah() { // from class: com.sankuai.waimai.foundation.utils.e.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cipstorage.ah
                public final void a(String str, com.meituan.android.cipstorage.u uVar, String str2) {
                    Object[] objArr3 = {str, uVar, str2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e24b15158f8ec14ab3ea2001ca8f2507", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e24b15158f8ec14ab3ea2001ca8f2507");
                    } else {
                        aVar.a(str, str2);
                    }
                }
            });
        }
    }

    public static double[] i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b876a6428e7a43b5ea5cc6cad181219f", RobustBitConfig.DEFAULT_VALUE) ? (double[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b876a6428e7a43b5ea5cc6cad181219f") : new double[]{b.b((com.sankuai.waimai.foundation.utils.e<LocationSPKeys>) LocationSPKeys.REAL_LAT_WITH_PERMISSION, 0.0d), b.b((com.sankuai.waimai.foundation.utils.e<LocationSPKeys>) LocationSPKeys.REAL_LNG_WITH_PERMISSION, 0.0d)};
    }

    public static void a(double d, double d2) {
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6fb61428bf22591eeac0da55e2fc1f4f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6fb61428bf22591eeac0da55e2fc1f4f");
            return;
        }
        b.a((com.sankuai.waimai.foundation.utils.e<LocationSPKeys>) LocationSPKeys.REAL_LAT_WITH_PERMISSION, d);
        b.a((com.sankuai.waimai.foundation.utils.e<LocationSPKeys>) LocationSPKeys.REAL_LNG_WITH_PERMISSION, d2);
    }
}
