package com.meituan.android.pike.bean;

import android.content.Context;
import com.meituan.android.cipstorage.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PikeSharedPreference {
    public static final String CONFIG_DEFAULT_TIMEOUT = "defaultTimeout";
    public static final String CONFIG_MAXCONNECTINTERVAL = "maxConnectInterval";
    public static final String CONFIG_MAXCONNECTRETYR = "maxConnectRetry";
    public static final String CONFIG_MAXMESSAGERETRY = "maxMessageRetry";
    public static final String CONFIG_MAXTIMEOUT = "maxTimeout";
    public static final String CONFIG_MINTIMEOUT = "minTimeout";
    public static final String FILE_NAME = "customerservice_pike";
    public static final String HIGHT_URL = "hight_url";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void put(Context context, String str, Object obj) {
        Object[] objArr = {context, str, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "86d9a9a1532e93ff6f1ab3aee8a646c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "86d9a9a1532e93ff6f1ab3aee8a646c4");
        } else {
            put(context, FILE_NAME, str, obj);
        }
    }

    public static void put(Context context, String str, String str2, Object obj) {
        Object[] objArr = {context, str, str2, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e23761681e2af4fb587fd0a9e9dcd907", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e23761681e2af4fb587fd0a9e9dcd907");
            return;
        }
        q a = q.a(context, str, 1);
        if (obj instanceof String) {
            a.a(str2, (String) obj);
        } else if (obj instanceof Integer) {
            a.a(str2, ((Integer) obj).intValue());
        } else if (obj instanceof Boolean) {
            a.a(str2, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Float) {
            a.a(str2, ((Float) obj).floatValue());
        } else if (obj instanceof Long) {
            a.a(str2, ((Long) obj).longValue());
        } else {
            a.a(str2, obj.toString());
        }
    }

    public static Object get(Context context, String str, Object obj) {
        Object[] objArr = {context, str, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a268382fd2a0bb19976a0a01e0fe3e25", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a268382fd2a0bb19976a0a01e0fe3e25") : get(context, FILE_NAME, str, obj);
    }

    public static Object get(Context context, String str, String str2, Object obj) {
        Object[] objArr = {context, str, str2, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f6de64cc0bd707534afd1b12c8fc6576", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f6de64cc0bd707534afd1b12c8fc6576");
        }
        q a = q.a(context, str, 1);
        if (obj instanceof String) {
            return a.b(str2, (String) obj);
        }
        if (obj instanceof Integer) {
            return Integer.valueOf(a.b(str2, ((Integer) obj).intValue()));
        }
        if (obj instanceof Boolean) {
            return Boolean.valueOf(a.b(str2, ((Boolean) obj).booleanValue()));
        }
        if (obj instanceof Float) {
            return Float.valueOf(a.b(str2, ((Float) obj).floatValue()));
        }
        if (obj instanceof Long) {
            return Long.valueOf(a.b(str2, ((Long) obj).longValue()));
        }
        return null;
    }

    public static void remove(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9d3d1f75926dd08dc9a921e2d5839c8c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9d3d1f75926dd08dc9a921e2d5839c8c");
        } else {
            remove(context, FILE_NAME, str);
        }
    }

    public static void remove(Context context, String str, String str2) {
        Object[] objArr = {context, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "72986378cd9398956b10785ac2ba1cf4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "72986378cd9398956b10785ac2ba1cf4");
        } else {
            q.a(context, str, 1).b(str2);
        }
    }

    public static void clear(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3c19f958f7529624151abbb880836c61", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3c19f958f7529624151abbb880836c61");
        } else {
            clear(context, FILE_NAME);
        }
    }

    public static void clear(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1a4906f89aada740ad85b5c1dfe61e9a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1a4906f89aada740ad85b5c1dfe61e9a");
        } else {
            q.a(context, str, 1).c();
        }
    }

    public static boolean contains(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "649f21381976b4c9a03fbb47e1a3ffd7", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "649f21381976b4c9a03fbb47e1a3ffd7")).booleanValue() : contains(context, FILE_NAME, str);
    }

    public static boolean contains(Context context, String str, String str2) {
        Object[] objArr = {context, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "18c0b313d6f5d80d27b131e740cf7bb7", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "18c0b313d6f5d80d27b131e740cf7bb7")).booleanValue() : q.a(context, str, 1).a(str2);
    }

    public static Map<String, ?> getAll(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a66d4aceec4b8036337c24dcebdf8c58", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a66d4aceec4b8036337c24dcebdf8c58") : getAll(context, FILE_NAME);
    }

    public static Map<String, ?> getAll(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d795c52cd309fd78c23b10c4b24fc9cc", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d795c52cd309fd78c23b10c4b24fc9cc") : q.a(context, str, 1).b();
    }
}
