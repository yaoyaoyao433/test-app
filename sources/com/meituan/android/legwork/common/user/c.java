package com.meituan.android.legwork.common.user;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements rx.functions.a {
    public static ChangeQuickRedirect a;
    private final com.sankuai.waimai.kit.login.user.b b;

    public c(com.sankuai.waimai.kit.login.user.b bVar) {
        this.b = bVar;
    }

    @Override // rx.functions.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e660b7771397439d6e8d373a8b52423", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e660b7771397439d6e8d373a8b52423");
        } else {
            a.a(this.b);
        }
    }
}
