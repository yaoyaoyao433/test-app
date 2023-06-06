package com.meituan.android.neohybrid.neo.pool;

import android.text.TextUtils;
import com.meituan.android.neohybrid.core.config.NeoConfig;
import com.meituan.android.neohybrid.neo.pool.c;
import com.meituan.android.neohybrid.neo.pool.persist.e;
import com.meituan.android.paybase.utils.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedList;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class d {
    public static ChangeQuickRedirect a;
    private static final LinkedHashMap<String, LinkedList<e>> b = new LinkedHashMap<>();

    public static void a(c.b bVar, com.meituan.android.neohybrid.neo.pool.persist.c cVar) {
        e eVar;
        Object[] objArr = {bVar, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "24d97bb418c72727e753d2c59326a6c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "24d97bb418c72727e753d2c59326a6c0");
        } else if (bVar == null || !bVar.a()) {
        } else {
            NeoConfig neoConfig = bVar.b;
            String url = neoConfig.getUrl();
            if (TextUtils.isEmpty(url)) {
                return;
            }
            LinkedList<e> linkedList = b.get(url);
            if (linkedList == null) {
                linkedList = new LinkedList<>();
                b.put(url, linkedList);
            }
            if (linkedList.size() > 0) {
                return;
            }
            long j = bVar.d;
            Object[] objArr2 = {neoConfig, cVar, new Long(j)};
            ChangeQuickRedirect changeQuickRedirect2 = e.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "728baf2d13eb536998099a53c945136f", RobustBitConfig.DEFAULT_VALUE)) {
                eVar = (e) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "728baf2d13eb536998099a53c945136f");
            } else {
                eVar = new e(neoConfig);
                eVar.a(j);
                eVar.b(cVar);
            }
            linkedList.add(eVar);
        }
    }

    public static com.meituan.android.neohybrid.core.a a(String str) {
        e poll;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b2d0cfa1a1c0c6acfca3b6ea9ef738b0", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.neohybrid.core.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b2d0cfa1a1c0c6acfca3b6ea9ef738b0");
        }
        LinkedList<e> linkedList = b.get(str);
        if (i.a((Collection) linkedList) || (poll = linkedList.poll()) == null || !poll.d()) {
            return null;
        }
        return poll.c();
    }
}
