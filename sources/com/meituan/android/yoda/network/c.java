package com.meituan.android.yoda.network;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements com.meituan.android.yoda.interfaces.e {
    public static ChangeQuickRedirect a;
    private final b b;

    public c(b bVar) {
        this.b = bVar;
    }

    @Override // com.meituan.android.yoda.interfaces.e
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd36ec92f34f5084599e8b32d4047a18", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd36ec92f34f5084599e8b32d4047a18");
        } else {
            this.b.c();
        }
    }
}
