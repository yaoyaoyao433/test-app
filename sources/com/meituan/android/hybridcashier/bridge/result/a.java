package com.meituan.android.hybridcashier.bridge.result;

import com.meituan.android.paybase.utils.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements f.InterfaceC0337f {
    public static ChangeQuickRedirect a;
    private final NotifyHybridProcessResultHandler b;
    private final com.meituan.android.neohybrid.neo.bridge.a c;
    private final PayResultBean d;

    public a(NotifyHybridProcessResultHandler notifyHybridProcessResultHandler, com.meituan.android.neohybrid.neo.bridge.a aVar, PayResultBean payResultBean) {
        this.b = notifyHybridProcessResultHandler;
        this.c = aVar;
        this.d = payResultBean;
    }

    @Override // com.meituan.android.paybase.utils.f.InterfaceC0337f
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c08ae1ca110cc7ebad988eb1062b6a8a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c08ae1ca110cc7ebad988eb1062b6a8a");
        } else {
            NotifyHybridProcessResultHandler.a(this.b, this.c, this.d, z);
        }
    }
}
