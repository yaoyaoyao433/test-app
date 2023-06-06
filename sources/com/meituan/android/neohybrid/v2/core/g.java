package com.meituan.android.neohybrid.v2.core;

import android.view.View;
import com.meituan.android.neohybrid.v2.core.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class g implements a.InterfaceC0311a {
    public static ChangeQuickRedirect a;
    private final View b;

    public g(View view) {
        this.b = view;
    }

    @Override // com.meituan.android.neohybrid.v2.core.a.InterfaceC0311a
    public final boolean a(com.meituan.android.neohybrid.core.listener.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9e1a0b58fb727cf557bfc530583765e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9e1a0b58fb727cf557bfc530583765e")).booleanValue() : a.a(this.b, aVar);
    }
}
