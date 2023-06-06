package com.sankuai.waimai.store.shopping.cart;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d {
    public static ChangeQuickRedirect a;
    private final CopyOnWriteArrayList<b> b;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "479ad646f43482c02089cefc178aa242", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "479ad646f43482c02089cefc178aa242");
        } else {
            this.b = new CopyOnWriteArrayList<>();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        private static final d a = new d();
    }

    public static d a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "45009823ce44807cd00de248946e1ca1", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "45009823ce44807cd00de248946e1ca1") : a.a;
    }

    public final void a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "345b539883b38d70ac469be57d52bc39", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "345b539883b38d70ac469be57d52bc39");
        } else if (this.b.contains(bVar)) {
        } else {
            this.b.add(bVar);
        }
    }

    public final void b(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de7b290bb70e02f3b72a497ef481cde2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de7b290bb70e02f3b72a497ef481cde2");
        } else {
            this.b.remove(bVar);
        }
    }

    public final void a(@NonNull String str, JSONObject jSONObject) {
        Object[] objArr = {str, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "713d713b3f980fa3f0484bd4c223a997", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "713d713b3f980fa3f0484bd4c223a997");
            return;
        }
        Iterator<b> it = this.b.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next != null && str.equals(next.bg_())) {
                try {
                    next.a(jSONObject);
                } catch (Exception e) {
                    com.sankuai.waimai.store.base.log.a.a(e);
                }
            }
        }
    }
}
