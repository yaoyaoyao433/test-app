package com.sankuai.eh.component.service.utils;

import android.os.Build;
import android.text.TextUtils;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.uuid.GetUUID;
import com.sankuai.eh.component.service.tools.a;
import com.sankuai.eh.component.service.tools.d;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class f {
    public static ChangeQuickRedirect a;

    public static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f10b54cc1882ddb56e3fb81f9b91d916", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f10b54cc1882ddb56e3fb81f9b91d916")).booleanValue();
        }
        try {
            if (com.sankuai.eh.component.service.a.b() != null) {
                return (com.sankuai.eh.component.service.a.b().getApplicationInfo().flags & 2) != 0;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f106353f028c9edd954b66d56ac7571d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f106353f028c9edd954b66d56ac7571d")).booleanValue() : a();
    }

    public static String a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5958e963b858fe5f4582f20da95a49d3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5958e963b858fe5f4582f20da95a49d3");
        }
        if (obj == null) {
            return "";
        }
        return obj.getClass().getSimpleName() + obj.hashCode();
    }

    public static String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "87836ae3bbe7031fa2b7689ebe8d94b4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "87836ae3bbe7031fa2b7689ebe8d94b4");
        }
        try {
            return com.sankuai.eh.component.service.a.b().getPackageName();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f6efa41f619f782f833ac201f11f9d6e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f6efa41f619f782f833ac201f11f9d6e");
        }
        try {
            return com.sankuai.eh.component.service.a.b().getPackageManager().getPackageInfo(com.sankuai.eh.component.service.a.b().getPackageName(), 16384).versionName;
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2bb3d7c96b9c88c216b55c00efc29bb1", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2bb3d7c96b9c88c216b55c00efc29bb1");
        }
        try {
            return GetUUID.getInstance().getSyncUUID(com.sankuai.eh.component.service.a.b(), null);
        } catch (Exception e) {
            com.sankuai.eh.component.service.tools.d.a(e);
            return "";
        }
    }

    public static long a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "58b43edc37726882a5bc4666f1c74c6b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "58b43edc37726882a5bc4666f1c74c6b")).longValue();
        }
        if (j == 0) {
            return 0L;
        }
        return System.currentTimeMillis() - j;
    }

    public static boolean a(String[] strArr, String[] strArr2) {
        Object[] objArr = {strArr, strArr2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "89788e1b5b4d2836b650c84521bb9697", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "89788e1b5b4d2836b650c84521bb9697")).booleanValue();
        }
        if (strArr == null && strArr2 == null) {
            return true;
        }
        if (strArr == null || strArr2 == null || strArr.length != strArr2.length) {
            return false;
        }
        for (String str : strArr) {
            if (!a(strArr2, str)) {
                return false;
            }
        }
        return true;
    }

    public static boolean a(String[] strArr, String str) {
        Object[] objArr = {strArr, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8a7d6797f04d6bc00cb9e6a3eb5f69b9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8a7d6797f04d6bc00cb9e6a3eb5f69b9")).booleanValue();
        }
        if (strArr == null || TextUtils.isEmpty(str)) {
            return false;
        }
        for (String str2 : strArr) {
            if (str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bf2c97e206886d7cf5608b7351e7c011", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bf2c97e206886d7cf5608b7351e7c011")).booleanValue();
        }
        if (obj == null) {
            return true;
        }
        return (obj instanceof String[]) && ((String[]) obj).length <= 0;
    }

    public static boolean a(JsonArray jsonArray) {
        Object[] objArr = {jsonArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "067f91a2dedb90d7fb05fcc30118a98c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "067f91a2dedb90d7fb05fcc30118a98c")).booleanValue();
        }
        if (jsonArray.size() > 0) {
            int b = a.C0548a.a.b();
            return b >= 0 && b >= b.a(jsonArray.get(0), 0) && b <= b.a(jsonArray.get(jsonArray.size() - 1), 0);
        }
        return true;
    }

    public static boolean a(JsonElement jsonElement) {
        Object[] objArr = {jsonElement};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "910eb340e445b0077f5298ac96ada1a1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "910eb340e445b0077f5298ac96ada1a1")).booleanValue();
        }
        JsonElement c = b.c(jsonElement, "ab");
        if (c instanceof JsonPrimitive) {
            return a(b.a(c, Integer.MAX_VALUE));
        }
        if (c instanceof JsonArray) {
            return a(b.b(c));
        }
        return true;
    }

    public static boolean b(JsonElement jsonElement) {
        Object[] objArr = {jsonElement};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d59f50f134569beeb35d39f7d609e7c0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d59f50f134569beeb35d39f7d609e7c0")).booleanValue();
        }
        if (b.d(jsonElement)) {
            if (jsonElement == null || b.c(jsonElement, "ab") == null) {
                return true;
            }
            JsonElement c = b.c(jsonElement, "ab");
            if (b(b.b(b.c(c, "blackList")))) {
                return false;
            }
            if (b(b.b(b.c(c, "whiteList")))) {
                return true;
            }
            JsonArray b = b.b(b.c(c, "range"));
            if (b.size() > 0) {
                Iterator<JsonElement> it = b.iterator();
                while (it.hasNext()) {
                    if (a(b.b(it.next()))) {
                        return true;
                    }
                }
                return false;
            }
            return true;
        }
        return false;
    }

    private static boolean b(JsonArray jsonArray) {
        Object[] objArr = {jsonArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4605ab3caa7a8970201721f92564d7c6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4605ab3caa7a8970201721f92564d7c6")).booleanValue();
        }
        return b.a(jsonArray, com.sankuai.eh.component.service.a.c().d(), false) || b.a(jsonArray, com.sankuai.eh.component.service.a.c().f(), false);
    }

    public static String f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "828854b7c3095fd16a1de376a7078977", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "828854b7c3095fd16a1de376a7078977");
        }
        return com.sankuai.eh.component.service.env.a.b + " MeituanGroup/" + com.sankuai.eh.component.service.a.c().i();
    }

    public static String a(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d6dad0843cb0f4ac8d47a75aebcee18b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d6dad0843cb0f4ac8d47a75aebcee18b");
        }
        return str + CommonConstant.Symbol.DOT + str2 + CommonConstant.Symbol.DOT + str3;
    }

    public static Map<String, Object> g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "49a9a66ec634697d79bbe10c43a0c8e3", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "49a9a66ec634697d79bbe10c43a0c8e3") : new d.b().a("os", "android").a("osVersion", Build.VERSION.RELEASE).a("appVersion", d()).a("packageName", c()).a("deviceType", Build.MODEL).a("uuid", com.sankuai.eh.component.service.a.c().f()).b;
    }

    private static Map<String, Object> i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cab3338615a612963271c39ec949f038", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cab3338615a612963271c39ec949f038") : new d.b().a(DeviceInfo.USER_ID, com.sankuai.eh.component.service.a.c().d()).a("token", com.sankuai.eh.component.service.a.c().e()).b;
    }

    private static Map<String, Object> j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "404b1130c7e547dca5b7f553692caf7e", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "404b1130c7e547dca5b7f553692caf7e") : new d.b().a("ehcVersion", "3.12.0").a("ehcVersionCode", com.sankuai.eh.component.service.env.a.a).b;
    }

    public static Map<String, Object> h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f65471fec5261600ea5a581cb5d4ef09", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f65471fec5261600ea5a581cb5d4ef09") : new d.b().a(g()).a(i()).a(j()).b;
    }

    public static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "84a5f055d48d6128a5de0197c70d56ac", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "84a5f055d48d6128a5de0197c70d56ac");
        }
        if (str != null) {
            try {
                if (str.startsWith("http")) {
                    StringBuilder sb = new StringBuilder();
                    com.sankuai.eh.component.service.a.c();
                    sb.append("imeituan://www.meituan.com/web?url=");
                    sb.append(URLEncoder.encode(str, "utf-8"));
                    return sb.toString();
                }
            } catch (Exception e) {
                com.sankuai.eh.component.service.tools.d.a(e);
                return str;
            }
        }
        return str;
    }

    public static int a(String str, int i) {
        Object[] objArr = {str, 99};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e41fc89b5eea6fcd930305d47c860173", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e41fc89b5eea6fcd930305d47c860173")).intValue();
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            com.sankuai.eh.component.service.tools.d.a(e);
            return 99;
        }
    }

    public static Map<String, Object> c(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1172fc8cf1eed1fdb1fff067c14ae7b3", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1172fc8cf1eed1fdb1fff067c14ae7b3");
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            try {
                Map<String, Object> map = (Map) b.a(str, new TypeToken<Map<String, Object>>() { // from class: com.sankuai.eh.component.service.utils.f.1
                }.getType());
                if (map != null && map.containsKey("handlerId")) {
                    map.remove("handlerId");
                }
                return map;
            } catch (Throwable unused) {
                return null;
            }
        }
        return null;
    }

    public static boolean a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4ef5972e8c7017c8c3e56af1973b3f9b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4ef5972e8c7017c8c3e56af1973b3f9b")).booleanValue();
        }
        int b = a.C0548a.a.b();
        return b >= 0 && b < i;
    }
}
