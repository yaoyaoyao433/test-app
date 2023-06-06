package com.sankuai.waimai.platform.bizdiagnosis;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.dianping.monitor.impl.m;
import com.meituan.android.common.statistics.ipc.RequestIDMap;
import com.meituan.android.singleton.b;
import com.meituan.android.singleton.i;
import com.meituan.hotel.android.hplus.diagnoseTool.DiagnoseLog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ar;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import com.sankuai.waimai.foundation.utils.p;
import com.sankuai.waimai.platform.net.util.f;
import com.sankuai.waimai.platform.utils.l;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a = null;
    public static String b = "BusinessErrDiagnosHelper";
    public static String c = "waimaiPageReachDelayTime";
    public static ArrayList<HashMap<String, String>> d = new ArrayList<>();
    public static ArrayList<HashMap<String, String>> e = new ArrayList<>();
    public static int f = 18;
    private static boolean g = false;
    private static boolean h = false;
    private static String i = "waimai_biz_exception_report";
    private static String j = "waimai_page_container_report";
    private static String k = "waimai_page_reach_delay";

    public static /* synthetic */ boolean a(boolean z) {
        g = false;
        return false;
    }

    public static /* synthetic */ void b(EnumC1038a enumC1038a, String str, String str2) {
        Object[] objArr = {enumC1038a, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ef617fcac9d07edbde05f89d1d23b008", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ef617fcac9d07edbde05f89d1d23b008");
            return;
        }
        String b2 = p.b(b.a);
        if (!p.a(b.a)) {
            if (b2.equals("Unavailable")) {
                if (d.size() <= f) {
                    HashMap<String, String> hashMap = new HashMap<>();
                    hashMap.put("biz", str2);
                    hashMap.put("page", str);
                    hashMap.put("pageType", enumC1038a.name());
                    d.add(hashMap);
                }
                com.sankuai.waimai.platform.capacity.persistent.sp.a.a(b.a, b, d);
                return;
            }
            return;
        }
        e();
        if (!a()) {
            a(enumC1038a, str2, str, 10001);
        } else if (!a("")) {
            a(enumC1038a, str2, str, 10002);
        } else if (!c()) {
            a(enumC1038a, str2, str, 10003);
        } else if (!b()) {
            a(enumC1038a, str2, str, 10004);
        } else if (!d()) {
            a(enumC1038a, str2, str, 10005);
        } else {
            a(enumC1038a, str2, str, 10006);
        }
    }

    public static /* synthetic */ boolean b(boolean z) {
        h = false;
        return false;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.platform.bizdiagnosis.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public enum EnumC1038a {
        Native,
        RN,
        FE;
        
        public static ChangeQuickRedirect a;

        EnumC1038a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55aebdb1beb43b8eb18a084011cefbab", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55aebdb1beb43b8eb18a084011cefbab");
            }
        }

        public static EnumC1038a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3d6226f8c88389426827ad96b199049b", RobustBitConfig.DEFAULT_VALUE) ? (EnumC1038a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3d6226f8c88389426827ad96b199049b") : (EnumC1038a) Enum.valueOf(EnumC1038a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static EnumC1038a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5a73db9356b77239c874bd1f08813c81", RobustBitConfig.DEFAULT_VALUE) ? (EnumC1038a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5a73db9356b77239c874bd1f08813c81") : (EnumC1038a[]) values().clone();
        }
    }

    public static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "864d188eb0d514ae4d000134132ce3b0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "864d188eb0d514ae4d000134132ce3b0")).booleanValue();
        }
        String[] strArr = {"www.baidu.com", "www.meituan.com"};
        for (int i2 = 0; i2 < 2; i2++) {
            if (!b(strArr[i2])) {
                return false;
            }
        }
        return true;
    }

    private static boolean b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b1abe08f625125f7cf2a4afbc6952503", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b1abe08f625125f7cf2a4afbc6952503")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        StringBuilder sb = new StringBuilder("ping -c 2 -w 3 ");
        sb.append(str);
        try {
            return Runtime.getRuntime().exec(sb.toString()).waitFor() == 0;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ec2f0e5b6539c177d1dbb12c768f3232", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ec2f0e5b6539c177d1dbb12c768f3232")).booleanValue() : com.sankuai.waimai.platform.net.netdiagnosis.a.a(str);
    }

    public static boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "29fb27be9183f01e3b332ab4e2a77790", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "29fb27be9183f01e3b332ab4e2a77790")).booleanValue();
        }
        String[] strArr = {"v.meituan.net", f.b};
        for (int i2 = 0; i2 < 2; i2++) {
            if (!c(strArr[i2])) {
                return false;
            }
        }
        return true;
    }

    private static boolean c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ed5662dc96659c617e469d3154ebbfb0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ed5662dc96659c617e469d3154ebbfb0")).booleanValue();
        }
        InetAddress[] inetAddressArr = new InetAddress[0];
        try {
            InetAddress[] allByName = InetAddress.getAllByName(str);
            String[] strArr = new String[allByName.length];
            for (int i2 = 0; i2 < allByName.length; i2++) {
                strArr[i2] = allByName[i2].getHostAddress();
            }
            return true;
        } catch (UnknownHostException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public static boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "32cf7d63cd909cbd9da8655651fea4eb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "32cf7d63cd909cbd9da8655651fea4eb")).booleanValue();
        }
        try {
            return ((IErrDiagnosis) new ar.a().a("https://api.meituan.com/").a(i.a("defaultokhttp")).a(com.sankuai.meituan.retrofit2.adapter.rxjava.f.a()).a(com.sankuai.meituan.retrofit2.converter.gson.a.a()).a().a(IErrDiagnosis.class)).check("https://api.meituan.com").a().b() == 200;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d0268c6a06be22125aa34c8ca0a5088a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d0268c6a06be22125aa34c8ca0a5088a")).booleanValue();
        }
        String[] strArr = {"http://p0.meituan.net/xianfu/87c794d86da3fa7b6411060a5b907d712048.png", "http://p1.meituan.net/xianfu/87c794d86da3fa7b6411060a5b907d712048.png"};
        for (int i2 = 0; i2 < 2; i2++) {
            if (!d(strArr[i2])) {
                return false;
            }
        }
        return true;
    }

    private static boolean d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "24f750a4993b68d9c60693ebca9ff691", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "24f750a4993b68d9c60693ebca9ff691")).booleanValue();
        }
        try {
            return ((IErrDiagnosis) new ar.a().a("https://catfront.dianping.com/").a(i.a("defaultokhttp")).a(com.sankuai.meituan.retrofit2.adapter.rxjava.f.a()).a(com.sankuai.meituan.retrofit2.converter.gson.a.a()).a().a(IErrDiagnosis.class)).check(str).a().b() == 200;
        } catch (Exception unused) {
            return false;
        }
    }

    public static void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "50ea5767bbfaa93a1eac7dab5f003c27", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "50ea5767bbfaa93a1eac7dab5f003c27");
        } else {
            a(EnumC1038a.Native, d(context), "waimai");
        }
    }

    public static void a(final EnumC1038a enumC1038a, final String str, final String str2) {
        Object[] objArr = {enumC1038a, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "701ef4ec4baeb24a03f1a145f57b2b3b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "701ef4ec4baeb24a03f1a145f57b2b3b");
        } else if (g) {
        } else {
            g = true;
            l.a(new l.a() { // from class: com.sankuai.waimai.platform.bizdiagnosis.a.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.utils.l.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ad7c6ee891e73d88874f4ad489a0cc9b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ad7c6ee891e73d88874f4ad489a0cc9b");
                    } else {
                        a.b(EnumC1038a.this, str, str2);
                    }
                }

                @Override // com.sankuai.waimai.platform.utils.l.a
                public final void b() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "231ef6bdb8686b98178509555942d527", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "231ef6bdb8686b98178509555942d527");
                        return;
                    }
                    super.b();
                    a.a(false);
                }
            }, b);
        }
    }

    public static void a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9675fb6fea001fbba7368635e8866f41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9675fb6fea001fbba7368635e8866f41");
        } else {
            a(str, d(context), 10007);
        }
    }

    public static void b(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c9f6732acd09ebf704c1fc547a4898f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c9f6732acd09ebf704c1fc547a4898f6");
        } else {
            a(str, d(context), (int) RequestIDMap.OP_TYPE_CHANNEL.OP_TYPE_EVENT);
        }
    }

    public static void b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a6e8c1c9fa1da1cee58a3cb88a652f83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a6e8c1c9fa1da1cee58a3cb88a652f83");
        } else {
            a("waimai", d(context), (int) RequestIDMap.OP_TYPE_CHANNEL.OP_TYPE_WRITE_AD_EVENT);
        }
    }

    public static void c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "525a7e7c4f183316198b567ea52dc9fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "525a7e7c4f183316198b567ea52dc9fc");
        } else {
            a("waimai", d(context), 10011);
        }
    }

    public static void a(EnumC1038a enumC1038a, String str, String str2, int i2) {
        Object[] objArr = {enumC1038a, str, str2, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7ae0677b35993dff910c2569228953bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7ae0677b35993dff910c2569228953bc");
        } else if (enumC1038a == EnumC1038a.Native) {
            a(str, str2, i2);
        } else if (enumC1038a == EnumC1038a.RN) {
            b(str, str2, i2);
        } else if (enumC1038a == EnumC1038a.FE) {
            c(str, str2, i2);
        }
    }

    private static void a(String str, String str2, int i2) {
        Object[] objArr = {str, str2, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e426700c41d6c7d9cae0bdad8a6e1b45", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e426700c41d6c7d9cae0bdad8a6e1b45");
        } else if (com.sankuai.waimai.foundation.core.utils.b.a(str2)) {
            com.dianping.monitor.impl.l a2 = new m(com.sankuai.waimai.config.a.a().d(), b.a, com.sankuai.waimai.platform.b.A().c()).a(i, Collections.singletonList(Float.valueOf(1.0f)));
            if (TextUtils.isEmpty(str)) {
                str = "waimai";
            }
            com.dianping.monitor.impl.l a3 = a2.a("biz", str).a("platform", "android").a("env", com.sankuai.waimai.foundation.core.a.b() ? "test" : "prod").a(AlitaMonitorCenter.AlitaMonitorConst.CommonEnv.TAG_KEY_APP_VERSION, f(b.a)).a("page_type", "native").a("native_page", str2);
            Context context = b.a;
            a3.a("city_name", "unknown").a("exception_code", String.valueOf(i2)).a();
        }
    }

    private static void b(String str, String str2, int i2) {
        Object[] objArr = {str, str2, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b2c901c27ceb0cf57370d9850cb1659f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b2c901c27ceb0cf57370d9850cb1659f");
            return;
        }
        com.dianping.monitor.impl.l a2 = new m(com.sankuai.waimai.config.a.a().d(), b.a, com.sankuai.waimai.platform.b.A().c()).a(i, Collections.singletonList(Float.valueOf(1.0f))).a("biz", str).a("platform", "android").a("env", com.sankuai.waimai.foundation.core.a.b() ? "test" : "prod").a(AlitaMonitorCenter.AlitaMonitorConst.CommonEnv.TAG_KEY_APP_VERSION, f(b.a)).a("page_type", DiagnoseLog.MRN);
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        com.dianping.monitor.impl.l a3 = a2.a("rn_page", str2).a("mrn_version", "3.1112.211");
        Context context = b.a;
        a3.a("city_name", "unknown").a("exception_code", String.valueOf(i2)).a();
    }

    private static void c(String str, String str2, int i2) {
        Object[] objArr = {str, str2, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5b47624fab0b7635e3c6548070122037", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5b47624fab0b7635e3c6548070122037");
            return;
        }
        com.dianping.monitor.impl.l a2 = new m(com.sankuai.waimai.config.a.a().d(), b.a, com.sankuai.waimai.platform.b.A().c()).a(i, Collections.singletonList(Float.valueOf(1.0f))).a("biz", str).a("platform", "android").a("env", com.sankuai.waimai.foundation.core.a.b() ? "test" : "prod").a(AlitaMonitorCenter.AlitaMonitorConst.CommonEnv.TAG_KEY_APP_VERSION, f(b.a)).a("page_type", "FE");
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        a2.a("fe_page", str2).a("city_name", "").a("exception_code", String.valueOf(i2)).a();
    }

    private static String f(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "83fc939a9d33b5aae8ce4d09ac974cbf", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "83fc939a9d33b5aae8ce4d09ac974cbf");
        }
        if (context == null) {
            return "";
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 16384).versionName;
        } catch (Exception unused) {
            return "";
        }
    }

    public static String d(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d5bf1ec90e22fdb506e062fb3bc37881", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d5bf1ec90e22fdb506e062fb3bc37881") : (context != null && (context instanceof Activity)) ? ((Activity) context).getLocalClassName() : "";
    }

    public static String e(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "719cf7779776747a1eb3e23ac91eb2d2", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "719cf7779776747a1eb3e23ac91eb2d2") : (context != null && (context instanceof Activity)) ? ((Activity) context).getClass().getSimpleName() : "";
    }

    public static void a(final String str, final EnumC1038a enumC1038a, Context context, final float f2) {
        Object[] objArr = {str, enumC1038a, context, Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0372e6cfcdddd3d7137933235828bbcd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0372e6cfcdddd3d7137933235828bbcd");
            return;
        }
        final String d2 = d(context);
        Object[] objArr2 = {str, enumC1038a, d2, Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "d56b3a215258897fe8ee2bdd6d0f0c3d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "d56b3a215258897fe8ee2bdd6d0f0c3d");
        } else if (p.f(b.a)) {
            if (h) {
                return;
            }
            h = true;
            l.a(new l.a() { // from class: com.sankuai.waimai.platform.bizdiagnosis.a.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.utils.l.a
                public final void a() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "724cc199713ec88fe8c8b14879a73318", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "724cc199713ec88fe8c8b14879a73318");
                        return;
                    }
                    a.b(str, enumC1038a, d2, f2);
                    a.f();
                }

                @Override // com.sankuai.waimai.platform.utils.l.a
                public final void b() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c22f57e2192598c596351b2a84211626", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c22f57e2192598c596351b2a84211626");
                        return;
                    }
                    super.b();
                    a.b(false);
                }
            }, c);
        } else {
            if (e.size() <= f) {
                HashMap<String, String> hashMap = new HashMap<>();
                hashMap.put("biz", str);
                hashMap.put("page", d2);
                hashMap.put("pageType", enumC1038a.name());
                hashMap.put("reachTime", String.valueOf(f2));
                e.add(hashMap);
            }
            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(b.a, c, e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, EnumC1038a enumC1038a, String str2, float f2) {
        Object[] objArr = {str, enumC1038a, str2, Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7f1f9eb662bc26a669f634696449b758", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7f1f9eb662bc26a669f634696449b758");
            return;
        }
        m mVar = new m(com.sankuai.waimai.config.a.a().d(), b.a, com.sankuai.waimai.platform.b.A().c());
        mVar.a(k, Collections.singletonList(Float.valueOf(f2))).a("biz", str).a("platform", "android").a("env", com.sankuai.waimai.foundation.core.a.b() ? "test" : "prod").a(AlitaMonitorCenter.AlitaMonitorConst.CommonEnv.TAG_KEY_APP_VERSION, f(b.a)).a("page_type", enumC1038a.name());
        if (enumC1038a == EnumC1038a.Native) {
            if (TextUtils.isEmpty(str2)) {
                str2 = "";
            }
            mVar.a("native_page", str2);
        } else if (enumC1038a == EnumC1038a.RN) {
            if (TextUtils.isEmpty(str2)) {
                str2 = "";
            }
            mVar.a("rn_page", str2);
        } else if (enumC1038a == EnumC1038a.FE) {
            if (TextUtils.isEmpty(str2)) {
                str2 = "";
            }
            mVar.a("fe_page", str2);
        }
        mVar.a();
    }

    public static void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "08c2e99447ffb3d9fb896e844337a741", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "08c2e99447ffb3d9fb896e844337a741");
            return;
        }
        ArrayList arrayList = (ArrayList) com.sankuai.waimai.platform.capacity.persistent.sp.a.a(b.a, b, (Class<Object>) ArrayList.class);
        if (arrayList == null || !p.f(b.a)) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof Map) {
                Map map = (Map) next;
                if ((map.get("biz") instanceof String) && (map.get("page") instanceof String) && (map.get("pageType") instanceof String)) {
                    a(EnumC1038a.valueOf((String) map.get("pageType")), (String) map.get("biz"), (String) map.get("page"), 10000);
                }
            }
        }
        com.sankuai.waimai.platform.capacity.persistent.sp.a.a(b.a, b, (Object) null);
        d.clear();
    }

    public static void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4c9268390d1c19d5cdf7eceec1856257", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4c9268390d1c19d5cdf7eceec1856257");
            return;
        }
        ArrayList arrayList = (ArrayList) com.sankuai.waimai.platform.capacity.persistent.sp.a.a(b.a, c, (Class<Object>) ArrayList.class);
        if (arrayList == null || !p.f(b.a)) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof Map) {
                Map map = (Map) next;
                if ((map.get("biz") instanceof String) && (map.get("page") instanceof String) && (map.get("pageType") instanceof String) && (map.get("reachTime") instanceof String)) {
                    b((String) map.get("biz"), EnumC1038a.valueOf((String) map.get("pageType")), (String) map.get("page"), Float.valueOf((String) map.get("reachTime")).floatValue());
                }
            }
        }
        com.sankuai.waimai.platform.capacity.persistent.sp.a.a(b.a, c, (Object) null);
        e.clear();
    }
}
