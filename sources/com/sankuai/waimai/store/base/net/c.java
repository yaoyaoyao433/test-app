package com.sankuai.waimai.store.base.net;

import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class c {
    public static ChangeQuickRedirect a;
    private static final WeakHashMap<Object, List<d>> b = new WeakHashMap<>();

    private static boolean b(Object obj) {
        return obj != null;
    }

    public static void a(@Nullable Object obj, d dVar) {
        Object[] objArr = {obj, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5b25f7289c80bcc841f2a7e83d33bccb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5b25f7289c80bcc841f2a7e83d33bccb");
        } else if (b(obj)) {
            synchronized (c.class) {
                if (b.containsKey(obj)) {
                    List<d> list = b.get(obj);
                    if (!list.contains(dVar)) {
                        list.add(dVar);
                    }
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(dVar);
                    b.put(obj, arrayList);
                }
            }
        }
    }

    public static void a(@Nullable Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f36848ca9761679cc89131b63a1d80fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f36848ca9761679cc89131b63a1d80fa");
        } else if (b(obj)) {
            synchronized (c.class) {
                if (b.containsKey(obj)) {
                    List<d> list = b.get(obj);
                    for (int size = list.size() - 1; size >= 0; size += -1) {
                        d dVar = list.get(size);
                        if (dVar != null) {
                            dVar.b();
                            list.remove(dVar);
                        }
                        com.sankuai.shangou.stone.util.log.a.a("ApiLifeCycleManager", "remove cache from GLOBAL_API_MANAGER_CACHE  tag is " + obj.toString() + "GLOBAL_API_MANAGER_CACHE size is " + b.size(), new Object[0]);
                    }
                    b.remove(obj);
                }
            }
        }
    }

    @Nullable
    public static <T> T a(@Nullable Object obj, Class<T> cls) {
        Object[] objArr = {obj, cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "19744d2677d8dbdf8fb3933448ad7d67", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "19744d2677d8dbdf8fb3933448ad7d67");
        }
        if (b(obj)) {
            synchronized (c.class) {
                if (b.containsKey(obj)) {
                    List<d> list = b.get(obj);
                    for (int size = list.size() - 1; size >= 0; size--) {
                        T t = (T) list.get(size);
                        if (t != null && t.getClass().equals(cls)) {
                            return t;
                        }
                    }
                }
                return null;
            }
        }
        return null;
    }
}
