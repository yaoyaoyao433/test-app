package com.sankuai.waimai.bussiness.order.base.pay;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private static c b;
    private List<d> c;

    public static c a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cdbaacda8c4050c8da5a428bde856eb3", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cdbaacda8c4050c8da5a428bde856eb3");
        }
        if (b == null) {
            b = new c();
        }
        return b;
    }

    public final void a(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c223afc5e1af315b2f150171b71e0a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c223afc5e1af315b2f150171b71e0a5");
            return;
        }
        if (this.c == null) {
            this.c = new ArrayList();
        }
        this.c.add(dVar);
    }

    public final void b(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b039d2a7c74dac06c7531062798f669", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b039d2a7c74dac06c7531062798f669");
        } else if (this.c == null || !this.c.contains(dVar)) {
        } else {
            this.c.remove(dVar);
        }
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec209cc7b126a1d0b6545fb562ac844a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec209cc7b126a1d0b6545fb562ac844a");
        } else if (this.c == null) {
        } else {
            Iterator<d> it = this.c.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }
}
