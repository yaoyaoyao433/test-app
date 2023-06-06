package com.sankuai.waimai.store.drug.home.refactor.card.float_card;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private static c e = new c();
    public com.sankuai.waimai.store.drug.home.refactor.card.float_card.a b;
    g c;
    public List<a> d;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public String a;
        public com.sankuai.waimai.store.manager.marketing.action.d b;
    }

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36532633086303faa6d7eebc9e9d9c32", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36532633086303faa6d7eebc9e9d9c32");
        } else {
            this.d = new ArrayList();
        }
    }

    public static c a() {
        return e;
    }
}
