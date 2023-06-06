package com.sankuai.waimai.platform.net.weaknetwork.strategy;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public long b;
    public long c;
    public long d;

    public c(com.sankuai.waimai.platform.net.weaknetwork.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0a9395672d78a20a3ddff31e9f45902", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0a9395672d78a20a3ddff31e9f45902");
            return;
        }
        this.b = 0L;
        this.c = 2L;
        this.d = 10L;
        Object[] objArr2 = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a946acad3e18a7c751bd593c901ec0b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a946acad3e18a7c751bd593c901ec0b0");
        } else if (aVar != null) {
            this.c = aVar.l;
            this.d = aVar.m;
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66f6f9f6fa991a3b49e0fce102ec6b0c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66f6f9f6fa991a3b49e0fce102ec6b0c");
        } else {
            this.b = 0L;
        }
    }
}
