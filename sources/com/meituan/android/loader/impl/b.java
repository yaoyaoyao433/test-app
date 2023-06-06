package com.meituan.android.loader.impl;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.meituan.android.cipstorage.q;
import com.meituan.android.loader.impl.bean.DynHornConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.resource.APKStructure;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.ProcessUtils;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    public static ChangeQuickRedirect a = null;
    public static String b = "dynlib";
    public static String c = "assets";
    public static String d = "dynlib.unzip.lock";
    public static String e = "dynlib.all.lock";
    public static String f = "dynlib.rename.lock";
    private static String g = "dynlib.list";
    private static String h = "dynlib.write.lock";
    private static Gson i = new Gson();

    public static void a(String str) {
        String str2;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d98e142d83d13de6844a9f8fa72325a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d98e142d83d13de6844a9f8fa72325a6");
            return;
        }
        String str3 = str + "dynlib" + File.separator;
        b = str3;
        d(str3);
        String str4 = b + APKStructure.Assets_Type;
        c = str4;
        d(str4);
        StringBuilder sb = new StringBuilder();
        sb.append(b);
        sb.append("dynlib.list");
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "f18b627eb5251d1ce64a4a4933b679e7", RobustBitConfig.DEFAULT_VALUE)) {
            str2 = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "f18b627eb5251d1ce64a4a4933b679e7");
        } else {
            String currentProcessName = ProcessUtils.getCurrentProcessName();
            if (currentProcessName.equals(a.e.getPackageName())) {
                str2 = "";
            } else {
                str2 = CommonConstant.Symbol.DOT + currentProcessName;
            }
        }
        sb.append(str2);
        String sb2 = sb.toString();
        g = sb2;
        Object[] objArr3 = {sb2};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "e87f77f7c349dba8362fc9e960f8d8b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "e87f77f7c349dba8362fc9e960f8d8b2");
        } else {
            try {
                new File(sb2).createNewFile();
            } catch (Exception unused) {
            }
        }
        d = b + "dynlib.unzip.lock";
        h = b + "dynlib.write.lock";
        e = b + "dynlib.all.lock";
        f = b + "dynlib.rename.lock";
    }

    public static String a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1c69e0caaccb52b106cd66f740f92b60", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1c69e0caaccb52b106cd66f740f92b60") : q.a(context, "mtplatform_app_version", 2).b(AlitaMonitorCenter.AlitaMonitorConst.CommonEnv.TAG_KEY_APP_VERSION, (String) null);
    }

    public static void a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ce385abecb85396106289b49cc8832d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ce385abecb85396106289b49cc8832d1");
        } else {
            q.a(context, "mtplatform_app_version", 2).a(AlitaMonitorCenter.AlitaMonitorConst.CommonEnv.TAG_KEY_APP_VERSION, str);
        }
    }

    public static String b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "015692d0357b29319c90b2a7c7cd1434", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "015692d0357b29319c90b2a7c7cd1434") : q.a(context, "mtplatform_covered_app_version", 2).b("covered_app_version", (String) null);
    }

    public static void b(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0a63cb502f292db5677a0daf6a81ab44", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0a63cb502f292db5677a0daf6a81ab44");
        } else {
            q.a(context, "mtplatform_covered_app_version", 2).a("covered_app_version", str);
        }
    }

    public static boolean a(Context context, DynHornConfig dynHornConfig) {
        Object[] objArr = {context, dynHornConfig};
        ChangeQuickRedirect changeQuickRedirect = a;
        String str = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0c38bc31a082863fad5d2f28a4a29bc2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0c38bc31a082863fad5d2f28a4a29bc2")).booleanValue();
        }
        q a2 = q.a(context, "mtplatform_dynlib_horn", 2);
        if (dynHornConfig != null) {
            try {
                str = i.toJson(dynHornConfig, DynHornConfig.class);
            } catch (Exception e2) {
                f.e("convertListToJsonString failed, errMsg:" + e2.toString());
                return false;
            }
        }
        a2.a("dynlib_horn", str);
        return true;
    }

    public static Set<DynFile> c(Context context) {
        HashSet<DynFile> b2;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "086bd2c6bdc38aaf62f3022d41867d91", RobustBitConfig.DEFAULT_VALUE)) {
            return (Set) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "086bd2c6bdc38aaf62f3022d41867d91");
        }
        String b3 = q.a(context, "mtplatform_dynlib", 2).b("dynlib", (String) null);
        if (TextUtils.isEmpty(b3) || (b2 = b(b3)) == null) {
            return null;
        }
        return Collections.synchronizedSet(b2);
    }

    public static void a(Context context, Set<DynFile> set) {
        Object[] objArr = {context, set};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dfd0fd708d7b82b577d5225fe9f9eefc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dfd0fd708d7b82b577d5225fe9f9eefc");
        } else {
            q.a(context, "mtplatform_dynlib", 2).a("dynlib", a(set));
        }
    }

    public static HashSet<DynFile> b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        HashSet<DynFile> hashSet = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "69b3a7be5f5a8ab09653667a8f5d131d", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashSet) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "69b3a7be5f5a8ab09653667a8f5d131d");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            DynFile[] dynFileArr = (DynFile[]) i.fromJson(str, (Class<Object>) DynFile[].class);
            if (dynFileArr == null || dynFileArr.length <= 0) {
                return null;
            }
            HashSet<DynFile> hashSet2 = new HashSet<>(dynFileArr.length);
            try {
                Collections.addAll(hashSet2, dynFileArr);
                return hashSet2;
            } catch (Exception e2) {
                e = e2;
                hashSet = hashSet2;
                f.e("parseJsonToList failed, errMsg:" + e.toString());
                return hashSet;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    private static String a(Set<DynFile> set) {
        Object[] objArr = {set};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "873eee846c925fd3432dc76ece1d34cb", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "873eee846c925fd3432dc76ece1d34cb");
        }
        if (set != null && set.size() > 0) {
            try {
                return i.toJson((DynFile[]) set.toArray(new DynFile[set.size()]), DynFile[].class);
            } catch (Exception e2) {
                f.e("convertListToJsonString failed, errMsg:" + e2.toString());
            }
        }
        return "";
    }

    public static boolean c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "566dd57ec0cc3b312119c5870eb00a92", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "566dd57ec0cc3b312119c5870eb00a92")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        File file = new File(str);
        if (file.exists()) {
            try {
                String str2 = h;
                Object[] objArr2 = {file, str2};
                ChangeQuickRedirect changeQuickRedirect2 = n.a;
                return PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "e7f3abaa93c2238cb087f53515bcff41", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "e7f3abaa93c2238cb087f53515bcff41")).booleanValue() : new k(file, str2).e().booleanValue();
            } catch (Exception e2) {
                e2.printStackTrace();
                return false;
            }
        }
        return false;
    }

    private static void d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0c6849317b2d4022debc36dc67b8d177", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0c6849317b2d4022debc36dc67b8d177");
            return;
        }
        File file = new File(str);
        if (file.exists()) {
            return;
        }
        file.mkdir();
    }
}
