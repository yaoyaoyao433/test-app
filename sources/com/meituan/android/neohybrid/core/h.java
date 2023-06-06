package com.meituan.android.neohybrid.core;

import android.view.View;
import com.meituan.android.neohybrid.core.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class h implements a.InterfaceC0302a {
    public static ChangeQuickRedirect a;
    private final View b;
    private final boolean c;
    private final boolean d;

    public h(View view, boolean z, boolean z2) {
        this.b = view;
        this.c = z;
        this.d = z2;
    }

    @Override // com.meituan.android.neohybrid.core.a.InterfaceC0302a
    public final boolean a(com.meituan.android.neohybrid.core.listener.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43c32ff4ea3ea877b44a363703413354", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43c32ff4ea3ea877b44a363703413354")).booleanValue() : a.a(this.b, this.c, this.d, aVar);
    }
}
