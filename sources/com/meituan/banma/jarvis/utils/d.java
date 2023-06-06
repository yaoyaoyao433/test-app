package com.meituan.banma.jarvis.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d {
    public static ChangeQuickRedirect a;

    public static String a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7e9aac93ac99665fced3343ccbfbb189", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7e9aac93ac99665fced3343ccbfbb189") : a(str, str2, "");
    }

    public static String a(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "48075dcaf55f4924b161e1427e5700f7", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "48075dcaf55f4924b161e1427e5700f7") : (String) a(str, str2, str3, (byte) 4);
    }

    private static <T> T a(JSONObject jSONObject, String str, T t, byte b) {
        Object[] objArr = {jSONObject, str, t, Byte.valueOf(b)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bce146eea8d930d855699321a9523907", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bce146eea8d930d855699321a9523907");
        }
        if (str == null || str.length() == 0) {
            return t;
        }
        try {
            if (b == 0) {
                return (T) Boolean.valueOf(jSONObject.getBoolean(str));
            }
            if (b == 1) {
                return (T) Integer.valueOf(jSONObject.getInt(str));
            }
            if (b == 2) {
                return (T) Long.valueOf(jSONObject.getLong(str));
            }
            if (b == 3) {
                return (T) Double.valueOf(jSONObject.getDouble(str));
            }
            if (b == 4) {
                return (T) jSONObject.getString(str);
            }
            if (b == 5) {
                return (T) jSONObject.getJSONObject(str);
            }
            return b == 6 ? (T) jSONObject.getJSONArray(str) : t;
        } catch (JSONException e) {
            e.printStackTrace();
            return t;
        }
    }

    public static <T> T a(String str, String str2, T t, byte b) {
        Object[] objArr = {str, str2, t, Byte.valueOf(b)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "255f74db01e18aed95db41c4f7208793", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "255f74db01e18aed95db41c4f7208793");
        }
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
            return t;
        }
        try {
            return (T) a(new JSONObject(str), str2, t, b);
        } catch (JSONException e) {
            e.printStackTrace();
            return t;
        }
    }
}
