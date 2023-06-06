package com.meituan.android.httpdns;

import com.google.gson.Gson;
import com.meituan.passport.api.AbsApiFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class z {
    public static ChangeQuickRedirect a;
    static a b;
    private static Executor c;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
        Executor a();
    }

    public static void a(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "71628aa0f99a03e44b16553ecee3fc3e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "71628aa0f99a03e44b16553ecee3fc3e");
            return;
        }
        if (c == null) {
            if (b != null) {
                c = b.a();
                System.out.println("httpdns 使用自定义线程池");
            }
            if (c == null) {
                c = Executors.newCachedThreadPool();
                System.out.println("httpdns 使用默认线程池");
            }
        }
        com.sankuai.waimai.launcher.util.aop.b.a(c, runnable);
    }

    public static boolean a(Collection collection) {
        Object[] objArr = {collection};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e6ab3c33d3648af2e9ae4f4ce7b5cd57", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e6ab3c33d3648af2e9ae4f4ce7b5cd57")).booleanValue() : collection == null || collection.isEmpty();
    }

    public static boolean a(String str, Collection<String> collection) {
        Object[] objArr = {str, collection};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e09366d6543f19388cc317c2c9e553ee", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e09366d6543f19388cc317c2c9e553ee")).booleanValue();
        }
        if (str != null && collection != null && collection.size() > 0) {
            for (String str2 : collection) {
                if (str.endsWith(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void a(Object... objArr) {
        Object[] objArr2 = {objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "068a55b2eb2e204e65e786e1613b9e94", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "068a55b2eb2e204e65e786e1613b9e94");
        } else if (objArr.length != 0 && h.a().e) {
            StringBuilder sb = new StringBuilder("HttpDnsService:");
            Gson gson = new Gson();
            for (Object obj : objArr) {
                String name = obj.getClass().getName();
                if (name.contains(AbsApiFactory.PASSPORT_ONLINE_URL) || name.contains("List") || name.contains("Map")) {
                    sb.append(gson.toJson(obj));
                } else if (obj instanceof Throwable) {
                    ((Throwable) obj).printStackTrace();
                } else {
                    sb.append(obj);
                }
            }
            System.out.println(sb.toString());
        }
    }
}
