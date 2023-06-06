package com.meituan.android.mrn.utils;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class aa {
    public static ChangeQuickRedirect a;

    public static Intent a(Context context, Uri uri, String str, String str2, String str3, String str4, String str5, Map<String, Object> map) {
        Object[] objArr = {context, uri, str, str2, str3, str4, str5, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8055d98211c2f888e7cb9bdec6acb86f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Intent) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8055d98211c2f888e7cb9bdec6acb86f");
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        if (!TextUtils.isEmpty(str)) {
            intent.setAction(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            intent.addCategory(str2);
        } else {
            intent.addCategory("android.intent.category.DEFAULT");
        }
        if (!TextUtils.isEmpty(str4)) {
            intent.setPackage(str4);
        }
        if (!TextUtils.isEmpty(str3)) {
            if (!TextUtils.isEmpty(str4)) {
                intent.setClassName(str4, str3);
            } else {
                intent.setClassName(context, str3);
            }
        }
        if (!TextUtils.isEmpty(str5)) {
            intent.setType(str5);
        }
        if (uri != null) {
            if (!TextUtils.isEmpty(str5)) {
                intent.setDataAndType(uri, str5);
            } else {
                intent.setData(uri);
            }
        }
        if (map != null) {
            intent.putExtras(g.a(map));
        }
        if (context != null) {
            String packageName = context.getPackageName();
            ComponentName resolveActivity = intent.resolveActivity(context.getPackageManager());
            if (!packageName.equals(resolveActivity != null ? resolveActivity.getPackageName() : "")) {
                intent.addFlags(com.tencent.mapsdk.internal.y.a);
            }
        }
        return intent;
    }

    public static Uri a(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2e9e7193447542007d5d00b532771839", RobustBitConfig.DEFAULT_VALUE) ? (Uri) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2e9e7193447542007d5d00b532771839") : a(str, map, false);
    }

    public static Uri a(String str, Map<String, Object> map, boolean z) {
        int indexOf;
        int i;
        Object[] objArr = {str, map, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        Map<String, Object> map2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e4c9da54932ae56f41228145ae9fa189", RobustBitConfig.DEFAULT_VALUE)) {
            return (Uri) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e4c9da54932ae56f41228145ae9fa189");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (z && (indexOf = str.indexOf(63)) >= 0) {
            int indexOf2 = str.indexOf(35, indexOf);
            if (indexOf2 < 0) {
                indexOf2 = str.length();
            }
            map2 = a(str.substring(indexOf + 1, indexOf2));
            str = str.substring(0, i) + str.substring(indexOf2);
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        a(buildUpon, map2, z);
        a(buildUpon, map, z);
        return buildUpon.build();
    }

    private static void a(Uri.Builder builder, Map<String, Object> map, boolean z) {
        Object value;
        boolean z2 = false;
        Object[] objArr = {builder, map, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0c1bf2df72182ec8b9031ad58e70abb6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0c1bf2df72182ec8b9031ad58e70abb6");
        } else if (map != null && map.size() > 0) {
            if (z && !a(map)) {
                z2 = true;
            }
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                if (!TextUtils.isEmpty(key) && (value = entry.getValue()) != null) {
                    if (z2) {
                        key = Uri.decode(key);
                    }
                    if (value instanceof List) {
                        for (Object obj : (List) value) {
                            String valueOf = String.valueOf(obj);
                            if (z2) {
                                valueOf = Uri.decode(valueOf);
                            }
                            builder.appendQueryParameter(key, valueOf);
                        }
                    } else {
                        String valueOf2 = String.valueOf(value);
                        if (z2) {
                            valueOf2 = Uri.decode(valueOf2);
                        }
                        builder.appendQueryParameter(key, valueOf2);
                    }
                }
            }
        }
    }

    private static Map<String, Object> a(String str) {
        String[] split;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4cd40300c21dbef7d1d5a213c4afdd53", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4cd40300c21dbef7d1d5a213c4afdd53");
        }
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(str)) {
            return hashMap;
        }
        for (String str2 : str.split("&")) {
            int indexOf = str2.indexOf(61);
            if (indexOf >= 0) {
                String substring = str2.substring(0, indexOf);
                String substring2 = str2.substring(indexOf + 1);
                Object obj = hashMap.get(substring);
                if (obj == null) {
                    hashMap.put(substring, substring2);
                } else if (obj instanceof List) {
                    ((List) obj).add(substring2);
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(obj);
                    arrayList.add(substring2);
                    hashMap.put(substring, arrayList);
                }
            }
        }
        return hashMap;
    }

    private static boolean a(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d6c0102562e4ae376151b7b6deea5aa2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d6c0102562e4ae376151b7b6deea5aa2")).booleanValue();
        }
        if (map == null || map.size() <= 0) {
            return false;
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            if (!TextUtils.isEmpty(key)) {
                if (!a(key, true)) {
                    return true;
                }
                Object value = entry.getValue();
                if (value == null) {
                    continue;
                } else if (value instanceof List) {
                    for (Object obj : (List) value) {
                        if (!a(String.valueOf(obj), true)) {
                            return true;
                        }
                    }
                    continue;
                } else if (!a(String.valueOf(value), true)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean a(String str, boolean z) {
        int i;
        Object[] objArr = {str, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "938040110b00847bf5a6c6974f279f3b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "938040110b00847bf5a6c6974f279f3b")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        char[] charArray = str.toCharArray();
        boolean z2 = false;
        for (int i2 = 0; i2 < charArray.length; i2++) {
            char c = charArray[i2];
            if ((c < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && ((c < '0' || c > '9') && "_-!.~'()*".indexOf(c) < 0))) {
                if (c != '%' || (i = i2 + 2) >= charArray.length) {
                    return false;
                }
                for (int i3 = i2 + 1; i3 <= i; i3++) {
                    char c2 = charArray[i3];
                    if ((c2 < 'A' || c2 > 'F') && ((c2 < 'a' || c2 > 'f') && (c2 < '0' || c2 > '9'))) {
                        return false;
                    }
                }
                z2 = true;
            }
        }
        return z2 ? true : true;
    }

    public static void a(Context context, Intent intent, int i, Bundle bundle) {
        Object[] objArr = {context, intent, Integer.valueOf(i), null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0760f4eea9c0e0a2c4d3356429811547", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0760f4eea9c0e0a2c4d3356429811547");
        } else if (context == null || intent == null) {
        } else {
            if (context instanceof Activity) {
                ((Activity) context).startActivityForResult(intent, i, null);
                return;
            }
            intent.addFlags(com.tencent.mapsdk.internal.y.a);
            context.startActivity(intent);
        }
    }

    public static void a(Context context, Intent intent) {
        Object[] objArr = {context, intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "99db87cdcebc66535da371cca36c2489", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "99db87cdcebc66535da371cca36c2489");
        } else if (context == null || intent == null) {
        } else {
            if (!(context instanceof Activity)) {
                intent.addFlags(com.tencent.mapsdk.internal.y.a);
            }
            context.startActivity(intent);
        }
    }
}
