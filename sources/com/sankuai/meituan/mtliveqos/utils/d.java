package com.sankuai.meituan.mtliveqos.utils;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.text.TextUtils;
import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtliveqos.common.c;
import java.net.URL;
import java.text.NumberFormat;
import java.util.HashSet;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d {
    public static ChangeQuickRedirect a;
    private static HashSet<String> b;

    public static float a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ad626941d40dc3368d3ef1ff8211a19b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ad626941d40dc3368d3ef1ff8211a19b")).floatValue();
        }
        try {
            NumberFormat numberInstance = NumberFormat.getNumberInstance();
            numberInstance.setMaximumFractionDigits(2);
            return Float.parseFloat(numberInstance.format(f));
        } catch (Exception e) {
            Log.e("ReportUtils", "formatDecimalTwo: ", e);
            return f;
        }
    }

    public static boolean a(Map<String, String> map) {
        String[] split;
        int length;
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "01fcbc4f64f05a6654c32de72cae6a59", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "01fcbc4f64f05a6654c32de72cae6a59")).booleanValue();
        }
        if (map == null || map.isEmpty()) {
            return false;
        }
        String str = map.get("MTLIVE_STREAM_URL");
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            URL url = new URL(str);
            String host = url.getHost();
            String path = url.getPath();
            if (TextUtils.isEmpty(host) || TextUtils.isEmpty(path) || (length = (split = path.split("/")).length) < 2) {
                return false;
            }
            int i = length - 1;
            int lastIndexOf = split[i].lastIndexOf(CommonConstant.Symbol.DOT);
            String str2 = split[i];
            if (lastIndexOf > 0) {
                str2 = split[i].substring(0, lastIndexOf);
            }
            map.put("MTLIVE_HOST", host);
            map.put("MTLIVE_APP_NAME", split[length - 2]);
            map.put("MTLIVE_STREAM_ID", str2);
            a(map, str2);
            return true;
        } catch (Exception e) {
            Log.e("ReportUtils", "splitStreamUrl: ", e);
            return a(str, map);
        }
    }

    private static boolean a(String str, Map<String, String> map) {
        String str2;
        String str3;
        String str4 = str;
        Object[] objArr = {str4, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fb50417b4b3dc37d118f8b12cea6a368", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fb50417b4b3dc37d118f8b12cea6a368")).booleanValue();
        }
        try {
            int indexOf = str4.indexOf(CommonConstant.Symbol.QUESTION_MARK);
            if (indexOf > 0) {
                str4 = str4.substring(0, indexOf);
            }
            String[] split = str4.split("/");
            int length = split.length;
            if (length < 2) {
                return false;
            }
            int i = length - 1;
            int lastIndexOf = split[i].lastIndexOf(CommonConstant.Symbol.DOT);
            String str5 = split[i];
            if (lastIndexOf > 0) {
                str5 = split[i].substring(0, lastIndexOf);
            }
            Object[] objArr2 = {split};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "4be4d63dcc7d608f6bd81659d61d8196", RobustBitConfig.DEFAULT_VALUE)) {
                str3 = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "4be4d63dcc7d608f6bd81659d61d8196");
            } else {
                int i2 = 1;
                do {
                    str2 = split[i2];
                    i2++;
                } while (TextUtils.isEmpty(str2));
                str3 = str2;
            }
            map.put("MTLIVE_HOST", str3);
            map.put("MTLIVE_APP_NAME", split[length - 2]);
            map.put("MTLIVE_STREAM_ID", str5);
            a(map, str5);
            return true;
        } catch (Exception e) {
            Log.e("ReportUtils", "getOtherSplitStreamUrl: ", e);
            return false;
        }
    }

    private static void a(Map<String, String> map, String str) {
        Object[] objArr = {map, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e70b21e9e6cf486b595c897c47d51f5d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e70b21e9e6cf486b595c897c47d51f5d");
            return;
        }
        if (b == null) {
            HashSet<String> hashSet = new HashSet<>();
            b = hashSet;
            hashSet.add("HD");
            b.add("SD");
            b.add("LD");
            b.add("720P");
            b.add("480P");
            b.add("360P");
        }
        try {
            String substring = str.substring(str.lastIndexOf(CommonConstant.Symbol.UNDERLINE) + 1);
            if (b.contains(substring.toUpperCase())) {
                map.put("MTLIVE_VIDEO_QUALITY", substring.toUpperCase());
            } else {
                map.put("MTLIVE_VIDEO_QUALITY", "none");
            }
        } catch (Exception unused) {
            map.put("MTLIVE_VIDEO_QUALITY", "none");
        }
    }

    public static String a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "45f06c820582734a23d1859592a967d3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "45f06c820582734a23d1859592a967d3");
        }
        try {
            return c.e.valuesCustom()[i + 2].j;
        } catch (Exception e) {
            Log.e("ReportUtils", "getNetWorkType: ", e);
            return c.e.NETWORK_UNKNOWN.j;
        }
    }

    public static String a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        Activity activity = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6b74d2d688654129ca06fd8e2b090836", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6b74d2d688654129ca06fd8e2b090836");
        }
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "fd76eb7eb810bbef5d0cad78562be3af", RobustBitConfig.DEFAULT_VALUE)) {
            activity = (Activity) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "fd76eb7eb810bbef5d0cad78562be3af");
        } else if (context != null) {
            if (context instanceof Activity) {
                activity = (Activity) context;
            } else if (context instanceof ContextWrapper) {
                Context baseContext = ((ContextWrapper) context).getBaseContext();
                if (baseContext instanceof Activity) {
                    activity = (Activity) baseContext;
                }
            }
        }
        return activity != null ? activity.getClass().getName() : "";
    }
}
