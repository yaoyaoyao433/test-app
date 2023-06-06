package com.sankuai.waimai.irmo.mach;

import android.content.Context;
import com.dianping.monitor.impl.m;
import com.meituan.android.common.aidata.mrn.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.uuid.GetUUID;
import com.sankuai.waimai.irmo.mach.vap.e;
import com.sankuai.waimai.irmo.mach.vap.g;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static void a(boolean z, String str, int i, String str2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str, Integer.valueOf(i), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "159977497ac27a08106189eb451d21ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "159977497ac27a08106189eb451d21ab");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("EffectResPreloadResult", Integer.valueOf(z ? 1 : 0));
        HashMap hashMap2 = new HashMap();
        hashMap2.put(Constants.JSBundleConstants.KEY_BUNDLE_ID, str);
        hashMap2.put("code", String.valueOf(i));
        hashMap2.put("effectType", str2);
        a(hashMap, hashMap2);
    }

    public static void b(boolean z, String str, int i, String str2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str, Integer.valueOf(i), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3ebad4c0820354c290a2c05c43901334", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3ebad4c0820354c290a2c05c43901334");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("EffectFetchResult", Integer.valueOf(z ? 1 : 0));
        HashMap hashMap2 = new HashMap();
        hashMap2.put("url", str);
        hashMap2.put("code", String.valueOf(i));
        hashMap2.put("effectType", str2);
        a(hashMap, hashMap2);
    }

    public static void a(float f, String str, boolean z) {
        Object[] objArr = {Float.valueOf(f), str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "36408c133cc6a6f9209309fa0f2c3960", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "36408c133cc6a6f9209309fa0f2c3960");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("EffectResDownloadTime", Float.valueOf(f));
        HashMap hashMap2 = new HashMap();
        hashMap2.put("url", str);
        hashMap2.put("success", z ? "1" : "0");
        a(hashMap, hashMap2);
    }

    public static void a(String str, String str2, Number number, String str3, boolean z) {
        Object[] objArr = {str, str2, number, str3, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1b3a008e5d8db80dae17ba168636d5a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1b3a008e5d8db80dae17ba168636d5a2");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(str2, number);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("vapType", "1");
        hashMap2.put("effectType", "1000");
        hashMap2.put("errorType", str3);
        hashMap2.put("templateId", g.a().b);
        hashMap2.put("url", str);
        hashMap2.put("resLoadType", z ? "usePreload" : "useUrl");
        a(hashMap, hashMap2);
    }

    public static void a(String str, int i, String str2, String str3, String str4) {
        Object[] objArr = {str, Integer.valueOf(i), str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8cda2507807a1f5489ce6ea3bf983115", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8cda2507807a1f5489ce6ea3bf983115");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(str, 1);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("moduleID", str2);
        hashMap2.put("effectType", String.valueOf(i));
        hashMap2.put(Constants.JSBundleConstants.KEY_BUNDLE_ID, str3);
        hashMap2.put("url", str4);
        a(hashMap, hashMap2);
    }

    public static void a(String str, int i, String str2, Number number, boolean z) {
        Object[] objArr = {str, 1, str2, number, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "78d8c0a882faa2fc74df6bee818009f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "78d8c0a882faa2fc74df6bee818009f2");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(str2, number);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("effectType", "1000");
        hashMap2.put("vapType", "1");
        hashMap2.put("templateId", g.a().b);
        hashMap2.put("url", str);
        hashMap2.put("resLoadType", z ? "usePreload" : "useUrl");
        a(hashMap, hashMap2);
    }

    public static void a(String str, String str2, Number number) {
        Object[] objArr = {str, str2, number};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "beba117144833d98d7898f422ad86fe0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "beba117144833d98d7898f422ad86fe0");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(str2, number);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("effectType", "1005");
        hashMap2.put("templateId", g.a().b);
        hashMap2.put("url", str);
        a(hashMap, hashMap2);
    }

    public static void a(String str, com.sankuai.waimai.mach.manager.cache.c cVar, int i, String str2) {
        Object[] objArr = {str, cVar, Integer.valueOf(i), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5e8555211ea43a4c3e93ff9de53882aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5e8555211ea43a4c3e93ff9de53882aa");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(str, Integer.valueOf(i == 0 ? 1 : 0));
        HashMap hashMap2 = new HashMap();
        hashMap2.put(Constants.JSBundleConstants.KEY_BUNDLE_ID, cVar != null ? cVar.d : "unknown");
        hashMap2.put("bundleVersion", cVar != null ? cVar.e : "unknown");
        hashMap2.put("errorType", String.valueOf(i));
        hashMap2.put("errorMsg", str2);
        a(hashMap, hashMap2);
    }

    public static int a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6f929eafda1996108efea6b578210c1f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6f929eafda1996108efea6b578210c1f")).intValue();
        }
        String packageName = context.getPackageName();
        if ("com.sankuai.meituan.takeoutnew".equals(packageName)) {
            return 11;
        }
        return (!"com.sankuai.meituan".equals(packageName) && "com.dianping.v1".equals(packageName)) ? 1 : 10;
    }

    public static String a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9c26e62fa676436714950586666f2d5e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9c26e62fa676436714950586666f2d5e");
        }
        if (aVar == null) {
            return "";
        }
        if (aVar instanceof e) {
            return ((e) aVar).m;
        }
        return aVar instanceof com.sankuai.waimai.irmo.mach.video.c ? ((com.sankuai.waimai.irmo.mach.video.c) aVar).k : "";
    }

    public static void a(boolean z, String str, String str2, String str3, int i) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str, str2, str3, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e46359076a5c4aa52b97bedf6216b4e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e46359076a5c4aa52b97bedf6216b4e4");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("EffectPlaySuccess", Integer.valueOf(z ? 1 : 0));
        HashMap hashMap2 = new HashMap();
        hashMap2.put("moduleID", str);
        hashMap2.put(Constants.JSBundleConstants.KEY_BUNDLE_ID, str2);
        hashMap2.put("url", str3);
        hashMap2.put("errorType", String.valueOf(i));
        a(hashMap, hashMap2);
    }

    public static void a(Map<String, Number> map, Map<String, String> map2) {
        Object[] objArr = {map, map2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "60c270d6d60d32d2c2ffb954fdbb9d43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "60c270d6d60d32d2c2ffb954fdbb9d43");
            return;
        }
        Context context = com.meituan.android.singleton.b.a;
        m mVar = new m(a(context), context, GetUUID.getInstance().getSyncUUID(context, null));
        if (map.size() > 0) {
            for (Map.Entry<String, Number> entry : map.entrySet()) {
                mVar.a(entry.getKey(), Collections.singletonList(Float.valueOf(entry.getValue().floatValue())));
            }
        }
        if (map2.size() > 0) {
            for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                mVar.a(entry2.getKey(), entry2.getValue());
            }
        }
        mVar.a();
    }
}
