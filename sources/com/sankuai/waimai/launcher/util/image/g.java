package com.sankuai.waimai.launcher.util.image;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.meituan.mtmap.rendersdk.MapConstant;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.squareup.okhttp.s;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class g {
    public static ChangeQuickRedirect a;
    private static final String b = URLEncoder.encode("@");
    private static final String c = URLEncoder.encode(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
    private static String[] d = {"img.meituan.net", "p0.meituan.net", "p1.meituan.net"};
    private static f e;

    static {
        f fVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f.a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a9785e7fe782b234ee0f982cca491c0c", RobustBitConfig.DEFAULT_VALUE)) {
            fVar = (f) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a9785e7fe782b234ee0f982cca491c0c");
        } else {
            fVar = new f();
            fVar.b = "e";
            fVar.c = 1.3d;
            fVar.d = 1.8d;
            fVar.e = "com.sankuai.waimai.business.page.homepage.MainActivity,com.sankuai.waimai.business.restaurant.poicontainer.WMRestaurantActivity,com.sankuai.waimai.business.restaurant.goodsdetail.GoodDetailActivity";
            fVar.f = true;
            fVar.i = "85";
            fVar.j = "70";
            fVar.g = true;
            fVar.h = true;
        }
        e = fVar;
    }

    public static String a(String str, s sVar, com.sankuai.waimai.platform.net.a aVar, f fVar, View view) {
        Object[] objArr = {str, sVar, aVar, fVar, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "21f68b82cccb66afa3f3640f95cd1008", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "21f68b82cccb66afa3f3640f95cd1008");
        }
        if (sVar == null) {
            return str;
        }
        String a2 = a(fVar, a(str), str, sVar, view, aVar);
        return TextUtils.isEmpty(a2) ? str : a2;
    }

    public static List<String> b(String str, s sVar, com.sankuai.waimai.platform.net.a aVar, f fVar, View view) {
        Object[] objArr = {str, sVar, aVar, fVar, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f689a99c969f53421b28f5319210dd59", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f689a99c969f53421b28f5319210dd59");
        }
        if (aVar == com.sankuai.waimai.platform.net.a.EXCELLENT || sVar == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        if (aVar == com.sankuai.waimai.platform.net.a.POOR) {
            String a2 = a(fVar, a(str), str, sVar, view, com.sankuai.waimai.platform.net.a.GOOD);
            if (!TextUtils.isEmpty(a2)) {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }

    public static s a(String str, f fVar, Context context) {
        s d2;
        Object[] objArr = {str, fVar, context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a25a18cb6525c4cdb2ea0bdc8ece7d82", RobustBitConfig.DEFAULT_VALUE)) {
            return (s) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a25a18cb6525c4cdb2ea0bdc8ece7d82");
        }
        if (fVar.f && !TextUtils.isEmpty(str) && (d2 = s.d(str)) != null && a(d2.b, d)) {
            if (fVar.h || a(context.getClass().getName(), fVar.e.split(CommonConstant.Symbol.COMMA))) {
                return d2;
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01df A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String a(com.sankuai.waimai.launcher.util.image.f r22, boolean r23, java.lang.String r24, com.squareup.okhttp.s r25, android.view.View r26, com.sankuai.waimai.platform.net.a r27) {
        /*
            Method dump skipped, instructions count: 569
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.launcher.util.image.g.a(com.sankuai.waimai.launcher.util.image.f, boolean, java.lang.String, com.squareup.okhttp.s, android.view.View, com.sankuai.waimai.platform.net.a):java.lang.String");
    }

    private static boolean a(String str, String[] strArr) {
        Object[] objArr = {str, strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "08d3dda2a2be14f7df6c3b09d318d7e6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "08d3dda2a2be14f7df6c3b09d318d7e6")).booleanValue();
        }
        for (String str2 : strArr) {
            if (TextUtils.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d7ad16225a922e73f3f8ff75f8c19d9f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d7ad16225a922e73f3f8ff75f8c19d9f")).booleanValue() : str.contains(b) || str.contains("@");
    }

    private static String a(String str, com.sankuai.waimai.platform.net.a aVar, f fVar) {
        Object[] objArr = {str, aVar, fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4a4810f1606814b6653a084ab0aa4cf9", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4a4810f1606814b6653a084ab0aa4cf9");
        }
        double d2 = 1.0d;
        try {
            if (aVar == com.sankuai.waimai.platform.net.a.POOR) {
                d2 = fVar.d;
            } else if (aVar == com.sankuai.waimai.platform.net.a.GOOD) {
                d2 = fVar.c;
            }
            return Integer.toString((int) (Integer.parseInt(str) / d2));
        } catch (Exception unused) {
            return str;
        }
    }

    private static String b(String str, com.sankuai.waimai.platform.net.a aVar, f fVar) {
        Object[] objArr = {str, aVar, fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b30956409ba246428e6da1655c8c63f3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b30956409ba246428e6da1655c8c63f3");
        }
        try {
            String str2 = "100";
            if (aVar == com.sankuai.waimai.platform.net.a.POOR) {
                str2 = fVar.j;
            } else if (aVar == com.sankuai.waimai.platform.net.a.GOOD) {
                str2 = fVar.i;
            }
            return Integer.parseInt(str) > Integer.parseInt(str2) ? str2 : str;
        } catch (Exception unused) {
            return str;
        }
    }

    public static f a() {
        return e;
    }

    private static boolean a(s sVar) {
        Object[] objArr = {sVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1af86b0d92dff4c1a8ff4bc7ab95b4e0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1af86b0d92dff4c1a8ff4bc7ab95b4e0")).booleanValue();
        }
        List<String> list = sVar.d;
        if (list == null || list.size() < 2) {
            return false;
        }
        String str = list.get(0);
        return str.length() > 1 && Character.isDigit(str.charAt(0)) && str.matches("^\\d+(\\.\\d+){1,2}(\\.[ao])?$");
    }

    public static void a(boolean z, String str, int i, com.sankuai.waimai.platform.net.a aVar) {
        String str2;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str, Integer.valueOf(i), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "86b02e1121980c64a73a38221a5d9fd8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "86b02e1121980c64a73a38221a5d9fd8");
            return;
        }
        f fVar = e;
        if (fVar == null || !fVar.f || aVar == com.sankuai.waimai.platform.net.a.OFFLINE || aVar == com.sankuai.waimai.platform.net.a.EXCELLENT || TextUtils.isEmpty(str) || !str.contains("from=weak")) {
            return;
        }
        if (aVar == com.sankuai.waimai.platform.net.a.POOR) {
            str2 = "_1";
        } else if (aVar != com.sankuai.waimai.platform.net.a.GOOD) {
            return;
        } else {
            str2 = "_2";
        }
        String str3 = str2;
        int i2 = z ? MapConstant.LayerPropertyFlag_MarkerSpacing : MapConstant.LayerPropertyFlag_MarkerAvoidScreen;
        com.sankuai.waimai.platform.capacity.log.c a2 = com.sankuai.waimai.platform.capacity.log.c.a();
        a2.a(i2, i, "waimai_network_weak_pic_" + fVar.b + str3);
        com.sankuai.waimai.foundation.utils.log.a.c("WeakNetImageUtil", "reportCat url : %s , strategy : %s , code : %d ", str, fVar.b, Integer.valueOf(i2));
    }
}
