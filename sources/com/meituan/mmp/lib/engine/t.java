package com.meituan.mmp.lib.engine;

import android.text.TextUtils;
import com.dianping.titans.js.JsBridgeResult;
import com.meituan.android.common.sniffer.db.SnifferDBHelper;
import com.meituan.mmp.lib.DebugHelper;
import com.meituan.mmp.lib.update.MMPAppProp;
import com.meituan.mmp.lib.update.MMPPackageInfo;
import com.meituan.mmp.lib.utils.bb;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class t {
    public static ChangeQuickRedirect a;

    public static void a(com.meituan.mmp.lib.trace.h hVar, MMPAppProp mMPAppProp, List<MMPPackageInfo> list) {
        String str;
        Object[] objArr = {hVar, mMPAppProp, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d327af9ef66171514d591d6c38882ab1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d327af9ef66171514d591d6c38882ab1");
            return;
        }
        MMPPackageInfo mMPPackageInfo = com.meituan.mmp.lib.utils.h.a((List) list) ? null : list.get(0);
        boolean z = mMPAppProp.mmpSdk.a() || mMPAppProp.mainPackage.a() || (mMPPackageInfo != null && mMPPackageInfo.a());
        hVar.a("pkgMode", (Object) (z ? "network" : "cache"));
        Object[] objArr2 = new Object[3];
        objArr2[0] = Integer.valueOf(mMPAppProp.mmpSdk.s);
        objArr2[1] = Integer.valueOf(mMPAppProp.mainPackage.s);
        objArr2[2] = Integer.valueOf(mMPPackageInfo != null ? mMPPackageInfo.s : 0);
        hVar.a("networkDetail", (Object) String.format("%s%s%s", objArr2));
        Object[] objArr3 = new Object[3];
        objArr3[0] = Integer.valueOf(mMPAppProp.mmpSdk.j);
        objArr3[1] = Integer.valueOf(mMPAppProp.mainPackage.j);
        objArr3[2] = Integer.valueOf(mMPPackageInfo != null ? mMPPackageInfo.j : 0);
        hVar.a("pkgSource", (Object) String.format("%s%s%s", objArr3));
        Map<String, Object> b = hVar.b();
        if (!b.containsKey(JsBridgeResult.ARG_KEY_LOCATION_MODE)) {
            if (z) {
                str = "network";
            } else {
                str = mMPAppProp.loadType == 0 ? "cache" : "networkWithoutDownload";
            }
            hVar.a(JsBridgeResult.ARG_KEY_LOCATION_MODE, (Object) str);
            hVar.a("modeV2", LaunchMode.LAUNCH_MODE_COLD_LAUNCH);
        } else {
            hVar.a("modeV2", b.get(JsBridgeResult.ARG_KEY_LOCATION_MODE));
        }
        hVar.a("foundationVersion", (Object) mMPAppProp.mmpSdk.d);
        hVar.a("mmpVersion", (Object) mMPAppProp.getPublishId());
        hVar.a("packageVersion", (Object) mMPAppProp.getVersion());
        com.meituan.mmp.lib.trace.b.b("reportUtils", "mmpVersion :" + mMPAppProp.getPublishId());
        com.meituan.mmp.lib.trace.b.b("reportUtils", "packageVersion :" + mMPAppProp.getVersion());
    }

    public static HashMap<String, Object> a(MMPPackageInfo mMPPackageInfo) {
        Object[] objArr = {mMPPackageInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4e4f9bdf4c93f87e242f6fbe961f2612", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4e4f9bdf4c93f87e242f6fbe961f2612");
        }
        if (mMPPackageInfo.d()) {
            return com.meituan.mmp.lib.utils.v.a("foundationVersion", mMPPackageInfo.d, "state", "success");
        }
        return com.meituan.mmp.lib.utils.v.a("pkgType", mMPPackageInfo.b(), "pkgRoot", mMPPackageInfo.o, "state", "success");
    }

    public static HashMap<String, Object> a(MMPPackageInfo mMPPackageInfo, String str) {
        Object[] objArr = {mMPPackageInfo, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4606d46e436a9fa946da132d827d73c0", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4606d46e436a9fa946da132d827d73c0");
        }
        if (mMPPackageInfo.d()) {
            return com.meituan.mmp.lib.utils.v.a("foundationVersion", mMPPackageInfo.d, "state", "fail", "message", str);
        }
        return com.meituan.mmp.lib.utils.v.a("pkgType", mMPPackageInfo.b(), "pkgRoot", mMPPackageInfo.o, "state", "fail", "message", str);
    }

    public static HashMap<String, Object> a(MMPPackageInfo mMPPackageInfo, boolean z, String str, boolean z2) {
        Object[] objArr = {mMPPackageInfo, Byte.valueOf(z ? (byte) 1 : (byte) 0), str, Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bded5fd9e7f9eef59470bd99daff7c7e", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bded5fd9e7f9eef59470bd99daff7c7e");
        }
        return com.meituan.mmp.lib.utils.v.a("packageName", mMPPackageInfo.g, "state", z ? "success" : "fail", "error", str, "url", mMPPackageInfo.e, "type", Integer.valueOf(mMPPackageInfo.r - 1), "source", Integer.valueOf(mMPPackageInfo.j), "appState", z2 ? "foreground" : "background");
    }

    public static HashMap<String, Object> b(MMPPackageInfo mMPPackageInfo, boolean z, String str, boolean z2) {
        Object[] objArr = {mMPPackageInfo, Byte.valueOf(z ? (byte) 1 : (byte) 0), null, Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "05819028b69e683abc6bf088e5adc7f6", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "05819028b69e683abc6bf088e5adc7f6");
        }
        return com.meituan.mmp.lib.utils.v.a("packageName", mMPPackageInfo.g, "state", z ? "success" : "fail", "error", null, "type", Integer.valueOf(mMPPackageInfo.r - 1), "source", Integer.valueOf(mMPPackageInfo.j), "appState", z2 ? "foreground" : "background");
    }

    public static void a(com.meituan.mmp.lib.trace.h hVar, String str, String str2, String str3) {
        String str4;
        Object[] objArr = {hVar, str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2ad4775397d53b0cf2421e1cf6d2a7a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2ad4775397d53b0cf2421e1cf6d2a7a5");
            return;
        }
        com.meituan.mmp.lib.trace.b.d("onH5Error:", str2 + StringUtil.SPACE + str);
        if (DebugHelper.b() && DebugHelper.e) {
            if (str.length() < 300) {
                str4 = str;
            } else {
                str4 = str.substring(0, 300) + "…";
            }
            bb.a(str4, new Object[0]);
        }
        HashMap hashMap = new HashMap();
        if (str3 != null) {
            hashMap.put("mmp_pagePath", str3);
        }
        hashMap.put("from", str2);
        String str5 = "";
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if ("message".equals(next)) {
                    String optString = jSONObject.optString(next);
                    if (!TextUtils.isEmpty(optString)) {
                        int indexOf = optString.indexOf("\n");
                        str5 = indexOf > 0 ? optString.substring(0, indexOf) : optString;
                        hashMap.put("message", str5);
                        hashMap.put(SnifferDBHelper.COLUMN_LOG, optString);
                    } else {
                        String optString2 = jSONObject.optString("type");
                        try {
                            hashMap.put("message", optString2);
                            hashMap.put(SnifferDBHelper.COLUMN_LOG, str);
                            str5 = optString2;
                        } catch (JSONException e) {
                            e = e;
                            str5 = optString2;
                            e.printStackTrace();
                            hashMap.put("pageStack", hVar.d());
                            hashMap.put("pageNavigation", hVar.e());
                            hVar.e(str5);
                            hVar.b("mmp.stability.count.js.error", (Map<String, Object>) hashMap);
                        }
                    }
                } else {
                    hashMap.put(next, jSONObject.optString(next));
                }
            }
        } catch (JSONException e2) {
            e = e2;
        }
        hashMap.put("pageStack", hVar.d());
        hashMap.put("pageNavigation", hVar.e());
        hVar.e(str5);
        hVar.b("mmp.stability.count.js.error", (Map<String, Object>) hashMap);
    }
}
