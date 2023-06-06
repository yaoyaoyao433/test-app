package com.sankuai.waimai.store.search.ui.result.datamarket.inshop;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.common.statistics.entity.EventInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Iterator;
import java.util.LinkedList;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class c {
    public static ChangeQuickRedirect a;
    private static volatile c b;
    private final LinkedList<a> c;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10814cb1471bfd4fddd3a6c3dbfe449f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10814cb1471bfd4fddd3a6c3dbfe449f");
        } else {
            this.c = new LinkedList<>();
        }
    }

    public static c a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f35fd6ecb9452d60dc4c9423b4655cec", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f35fd6ecb9452d60dc4c9423b4655cec");
        }
        if (b == null) {
            synchronized (c.class) {
                if (b == null) {
                    b = new c();
                }
            }
        }
        return b;
    }

    public final void a(@NonNull EventInfo eventInfo) {
        boolean z = true;
        Object[] objArr = {eventInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b698aa53b3f3c3dfe6a886449152a8fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b698aa53b3f3c3dfe6a886449152a8fc");
            return;
        }
        Object obj = eventInfo.val_lab.get("poisearch_global_id");
        String str = obj instanceof String ? (String) obj : null;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        a(str);
        if (TextUtils.equals(eventInfo.val_bid, "b_bx5fhk5t")) {
            Object obj2 = eventInfo.val_lab.get("has_result");
            boolean z2 = (obj2 instanceof Number) && ((Number) obj2).intValue() == 1;
            z = ((obj2 instanceof String) && TextUtils.equals((String) obj2, "1")) ? false : false;
            if (z2 || z) {
                b(str);
            }
        }
    }

    private void a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9871910d766b4a37172866f1a2b382dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9871910d766b4a37172866f1a2b382dd");
            return;
        }
        Iterator<a> it = this.c.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(it.next().a, str)) {
                return;
            }
        }
        if (this.c.size() == 10) {
            this.c.removeLast();
        }
        this.c.addFirst(new a(str, true));
        com.sankuai.waimai.store.util.monitor.c.a(InShopChain.Denominator, null, null);
    }

    private void b(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5cf46c255de5200f44e438a75f4a2ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5cf46c255de5200f44e438a75f4a2ad");
            return;
        }
        Iterator<a> it = this.c.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (next.b && TextUtils.equals(next.a, str)) {
                next.b = false;
                com.sankuai.waimai.store.util.monitor.c.a(InShopChain.Molecule, null, null);
            }
        }
    }
}
