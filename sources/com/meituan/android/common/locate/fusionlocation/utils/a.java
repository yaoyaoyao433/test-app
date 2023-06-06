package com.meituan.android.common.locate.fusionlocation.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class a {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static double a(Object obj, double d) {
        Object[] objArr = {obj, Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3c947a2a71499ddeaac6a0bbc4a77ab1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3c947a2a71499ddeaac6a0bbc4a77ab1")).doubleValue();
        }
        if (obj == null) {
            return d;
        }
        try {
            return ((Double) obj).doubleValue();
        } catch (Exception unused) {
            return d;
        }
    }

    public static float a(Object obj, float f) {
        Object[] objArr = {obj, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5dd1a936e9325b21aa51d0e48e9128a5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5dd1a936e9325b21aa51d0e48e9128a5")).floatValue();
        }
        if (obj == null) {
            return f;
        }
        try {
            return ((Float) obj).floatValue();
        } catch (Exception unused) {
            return f;
        }
    }

    public static int a(Object obj, int i) {
        Object[] objArr = {obj, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9aba4bd51bc2be40a65714681b5a586b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9aba4bd51bc2be40a65714681b5a586b")).intValue();
        }
        if (obj == null) {
            return i;
        }
        try {
            return ((Integer) obj).intValue();
        } catch (Exception unused) {
            return i;
        }
    }

    public static long a(Object obj, long j) {
        Object[] objArr = {obj, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bc1b2235a2aae1ca17033532b84bf00a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bc1b2235a2aae1ca17033532b84bf00a")).longValue();
        }
        if (obj == null) {
            return j;
        }
        try {
            return ((Long) obj).longValue();
        } catch (Exception unused) {
            return j;
        }
    }

    public static String a(Double d) {
        Object[] objArr = {d};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e243c748ea7f95a90e4d36fed4c8883f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e243c748ea7f95a90e4d36fed4c8883f");
        }
        if (d == null) {
            return "";
        }
        try {
            return new DecimalFormat("#0.000000").format(d);
        } catch (Exception unused) {
            return String.valueOf(d);
        }
    }

    public static String a(Float f) {
        Object[] objArr = {f};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "faa399fe68dbb119998e06ffbfbfb656", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "faa399fe68dbb119998e06ffbfbfb656");
        }
        if (f == null) {
            return "";
        }
        try {
            return new DecimalFormat("#0.00").format(f);
        } catch (Exception unused) {
            return String.valueOf(f);
        }
    }

    public static String a(Object obj, String str) {
        return obj == null ? str : (String) obj;
    }

    public static String a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fc8af3e590f4543eb1636fcd1aad95d9", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fc8af3e590f4543eb1636fcd1aad95d9");
        }
        StringBuilder sb = new StringBuilder();
        Iterator<String> keys = jSONObject.keys();
        ArrayList arrayList = new ArrayList(Arrays.asList("clientTS", "点类型", "点序列", "时间间隔", "inputLocation", "isAllowHighQuality", "gpsStabilityResult", "GnssStatus状态", "gnssStatusIsOpen", "angleRange", "speedMean", "fusion_delay_time", "totalSateCnt", "usedSateCnt", "usedSateMaxSnr", "gnssScore", "pressureTs", "pressureValue", "主连wifi", "主连wifi名称", "主连wifi强度", "最大wifi名称", "最大wifi强度", "top5wifi平均强度", "光感值", "光感时间", "光感月份", "光感室内外", "服务端室内外", "融合室内外", "indoorReason", "总模型score", "光感score", "wifi_score", "gnss_score", "fusion_score", "动静", "前后点距离", "前后点速度", "mFusionMarsLat", "kfUpdateAndObserveDistance", "连续放点个数", "连续卡点个数", "当前点是否飘点", "判断原因", "outputLocation", "returnTS", "选点策略", "首点是否修正"));
        HashSet hashSet = new HashSet();
        hashSet.addAll(arrayList);
        while (keys.hasNext()) {
            try {
                String next = keys.next();
                String string = jSONObject.getString(next);
                if (hashSet.contains(next)) {
                    if ("indoorReason".equals(next)) {
                        next = "indRea";
                    }
                    if ("mFusionMarsLat".equals(next)) {
                        next = "mFusion";
                        string = string + CommonConstant.Symbol.COMMA + jSONObject.getString("mFusionMarsLon");
                    }
                    if ("kfUpdateAndObserveDistance".equals(next)) {
                        next = "kfDistance";
                    }
                    sb.append(next + CommonConstant.Symbol.COLON + string + "\n");
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return sb.toString();
    }

    public static boolean a(Object obj, boolean z) {
        Object[] objArr = {obj, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "08dcea274f0b264bea15d157471c1723", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "08dcea274f0b264bea15d157471c1723")).booleanValue();
        }
        if (obj == null) {
            return z;
        }
        try {
            return ((Boolean) obj).booleanValue();
        } catch (Exception unused) {
            return z;
        }
    }

    public static String b(Double d) {
        Object[] objArr = {d};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4935230681c9ae0e9df8628b8e508984", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4935230681c9ae0e9df8628b8e508984");
        }
        if (d == null) {
            return "";
        }
        try {
            return new DecimalFormat("#0.00").format(d);
        } catch (Exception unused) {
            return String.valueOf(d);
        }
    }
}
