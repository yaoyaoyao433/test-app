package com.sankuai.ehcore.module.core;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.plugins.skeleton.vg.a;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements a.b {
    public static ChangeQuickRedirect a;
    private final a b;

    public c(a aVar) {
        this.b = aVar;
    }

    @Override // com.sankuai.eh.plugins.skeleton.vg.a.b
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ff0a7646bee70fae68b83a646911220", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ff0a7646bee70fae68b83a646911220");
        } else {
            a.b(this.b);
        }
    }
}
