package com.meituan.phoenix_okhttp;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.squareup.okhttp.t;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d implements com.meituan.phoenix.base_interface.b<t> {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.phoenix.base_interface.b
    public final /* synthetic */ t a(com.meituan.phoenix.core.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "698eb91d325cfefdf7ced7dfc93bfc4e", RobustBitConfig.DEFAULT_VALUE) ? (t) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "698eb91d325cfefdf7ced7dfc93bfc4e") : new e(com.meituan.phoenix.b.c, aVar);
    }
}
