package com.meituan.android.neohybrid.neo.pool;

import android.text.TextUtils;
import com.meituan.android.neohybrid.core.config.NeoConfig;
import com.meituan.android.neohybrid.neo.pool.c;
import com.meituan.android.paybase.utils.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static final LinkedHashMap<String, List<com.meituan.android.neohybrid.neo.pool.persist.a>> b = new LinkedHashMap<>();

    public static com.meituan.android.neohybrid.core.a a(String str, boolean z) {
        Object[] objArr = {str, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ca4032a0c16308cd39825d6e8ae7c642", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.neohybrid.core.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ca4032a0c16308cd39825d6e8ae7c642");
        }
        List<com.meituan.android.neohybrid.neo.pool.persist.a> list = b.get(str);
        com.meituan.android.neohybrid.core.a a2 = a(list, false);
        if (a2 == null || list == null) {
            return null;
        }
        list.clear();
        a2.d(str);
        return a2;
    }

    private static com.meituan.android.neohybrid.core.a a(List<com.meituan.android.neohybrid.neo.pool.persist.a> list, boolean z) {
        Object[] objArr = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1489e84d7ef8cde3cfbdf2677c9ffb63", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.neohybrid.core.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1489e84d7ef8cde3cfbdf2677c9ffb63");
        }
        if (i.a((Collection) list)) {
            return null;
        }
        ListIterator<com.meituan.android.neohybrid.neo.pool.persist.a> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            com.meituan.android.neohybrid.core.a a2 = listIterator.previous().a(z);
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }

    public static void a(c.b bVar, com.meituan.android.neohybrid.neo.pool.persist.c cVar) {
        com.meituan.android.neohybrid.neo.pool.persist.a aVar;
        Object[] objArr = {bVar, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "86e0a69f9c56e5043d97ec43cf8ce85c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "86e0a69f9c56e5043d97ec43cf8ce85c");
        } else if (bVar == null || !bVar.a()) {
        } else {
            NeoConfig neoConfig = bVar.b;
            String url = neoConfig.getUrl();
            if (TextUtils.isEmpty(url)) {
                return;
            }
            List<com.meituan.android.neohybrid.neo.pool.persist.a> list = b.get(url);
            if (list == null) {
                list = new LinkedList<>();
                b.put(url, list);
            }
            if (list.size() > 0) {
                return;
            }
            long j = bVar.d;
            Object[] objArr2 = {neoConfig, cVar, new Long(j)};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.neohybrid.neo.pool.persist.a.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "a55472e2c695c04bb2ab9c3d850eca69", RobustBitConfig.DEFAULT_VALUE)) {
                aVar = (com.meituan.android.neohybrid.neo.pool.persist.a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "a55472e2c695c04bb2ab9c3d850eca69");
            } else {
                aVar = new com.meituan.android.neohybrid.neo.pool.persist.a(neoConfig);
                aVar.a(j);
                aVar.b(cVar);
            }
            list.add(aVar);
        }
    }
}
