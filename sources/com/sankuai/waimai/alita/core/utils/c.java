package com.sankuai.waimai.alita.core.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.utils.b;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private static volatile CopyOnWriteArraySet<Object> b = new CopyOnWriteArraySet<>();
    private static volatile CopyOnWriteArraySet<Object> c = new CopyOnWriteArraySet<>();

    public static void b(String str) {
    }

    public static void d(String str) {
    }

    public static void e(String str) {
    }

    public static void f(String str) {
    }

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1d9ec320ad673b095d8f681897bfb91e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1d9ec320ad673b095d8f681897bfb91e");
        } else {
            a("Alita", str);
        }
    }

    public static void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "31148f5abab1ff9a688bb366c146341a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "31148f5abab1ff9a688bb366c146341a");
        } else if (str2 == null || !com.sankuai.waimai.alita.platform.debug.a.a().b()) {
        } else {
            PrintStream printStream = System.out;
            printStream.println(str + ": " + str2);
        }
    }

    public static void a(String str, String str2, String str3, Map<String, Object> map) {
        Object[] objArr = {str, str2, str3, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4ec2af2c93baf1d31d2bca72b8135ba9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4ec2af2c93baf1d31d2bca72b8135ba9");
            return;
        }
        b a2 = new b.a().a(str).c(str2).a(b.EnumC0714b.VERBOSE).b(str3).a();
        if (map.size() > 0) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                a2.a(entry.getKey(), entry.getValue());
            }
        }
        a("Alita", a2.toString());
    }

    public static void b(String str, String str2, String str3, Map<String, Object> map) {
        Object[] objArr = {str, null, str3, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d90f62ebcf12ab6de4a4e04c7490281b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d90f62ebcf12ab6de4a4e04c7490281b");
            return;
        }
        b a2 = new b.a().a(str).c(null).a(b.EnumC0714b.DEBUG).b(str3).a();
        if (map != null && map.size() > 0) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                a2.a(entry.getKey(), entry.getValue());
            }
        }
        a(a2);
    }

    public static void a(String str, String str2, String str3, HashMap<String, Object> hashMap) {
        Object[] objArr = {str, str2, str3, hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2fb21bebc07055e69617b1f83a03e5b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2fb21bebc07055e69617b1f83a03e5b0");
            return;
        }
        b a2 = new b.a().a(str).c(str2).a(b.EnumC0714b.INFO).b(str3).a();
        if (hashMap != null && hashMap.size() > 0) {
            for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
                a2.a(entry.getKey(), entry.getValue());
            }
        }
        a(a2);
    }

    public static void b(String str, String str2, String str3, HashMap<String, Object> hashMap) {
        Object[] objArr = {str, null, str3, hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a48a0deabad993b4318078c6012491be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a48a0deabad993b4318078c6012491be");
            return;
        }
        b a2 = new b.a().a(str).c(null).a(b.EnumC0714b.ERROR).b(str3).a();
        if (hashMap.size() > 0) {
            for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
                a2.a(entry.getKey(), entry.getValue());
            }
        }
        a(a2);
    }

    public static void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4091d2b66e40e1cdd8a5dbc4d8e7a98d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4091d2b66e40e1cdd8a5dbc4d8e7a98d");
        } else if (!com.sankuai.waimai.alita.platform.debug.a.a().b() || str == null) {
        } else {
            PrintStream printStream = System.out;
            printStream.println("AlitaJS: " + str);
            g(str);
        }
    }

    private static void g(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7c783446808aa2b6b5a4d5104e3d28b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7c783446808aa2b6b5a4d5104e3d28b5");
        } else if (b == null) {
        } else {
            Iterator<Object> it = b.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    private static void a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0012e0598a3098c85089cffd78cf452f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0012e0598a3098c85089cffd78cf452f");
        } else if (c == null) {
        } else {
            Iterator<Object> it = c.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public static void a(b bVar) {
        b.EnumC0714b enumC0714b;
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "384b19af27d9e8fd158ded1d3430212e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "384b19af27d9e8fd158ded1d3430212e");
        } else if (bVar == null || (enumC0714b = bVar.e) == null) {
        } else {
            switch (enumC0714b) {
                case VERBOSE:
                    if (com.sankuai.waimai.alita.platform.debug.a.a().b()) {
                        PrintStream printStream = System.out;
                        printStream.println("Alita: " + bVar.toString());
                        return;
                    }
                    return;
                case DEBUG:
                    if (com.sankuai.waimai.alita.platform.debug.a.a().b()) {
                        PrintStream printStream2 = System.out;
                        printStream2.println("Alita: " + bVar.toString());
                    }
                    a(bVar.b());
                    return;
                case INFO:
                    if (com.sankuai.waimai.alita.platform.debug.a.a().b()) {
                        PrintStream printStream3 = System.out;
                        printStream3.println("Alita: " + bVar.toString());
                    }
                    a(bVar.b());
                    d.a(bVar);
                    return;
                case ERROR:
                    if (com.sankuai.waimai.alita.platform.debug.a.a().b()) {
                        PrintStream printStream4 = System.out;
                        printStream4.println("Alita: " + bVar.toString());
                    }
                    a(bVar.b());
                    d.b(bVar);
                    return;
                default:
                    return;
            }
        }
    }
}
