package com.meituan.android.neohybrid.core;

import android.view.View;
import com.meituan.android.neohybrid.core.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class g implements a.InterfaceC0302a {
    public static ChangeQuickRedirect a;
    private final View b;

    public g(View view) {
        this.b = view;
    }

    @Override // com.meituan.android.neohybrid.core.a.InterfaceC0302a
    public final boolean a(com.meituan.android.neohybrid.core.listener.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a68af85f62a23b5d61139ac771d15ab5", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a68af85f62a23b5d61139ac771d15ab5")).booleanValue() : a.a(this.b, aVar);
    }
}
