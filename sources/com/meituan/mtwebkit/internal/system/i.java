package com.meituan.mtwebkit.internal.system;

import android.webkit.SslErrorHandler;
import com.meituan.mtwebkit.MTSslErrorHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class i extends MTSslErrorHandler {
    public static ChangeQuickRedirect a;
    private SslErrorHandler b;

    public i(SslErrorHandler sslErrorHandler) {
        Object[] objArr = {sslErrorHandler};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c0644d5f10375d9e1d66a361dd9ca56", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c0644d5f10375d9e1d66a361dd9ca56");
        } else {
            this.b = sslErrorHandler;
        }
    }

    @Override // com.meituan.mtwebkit.MTSslErrorHandler
    public final void proceed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "643e35ef5b7f087c599382f55a91a9d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "643e35ef5b7f087c599382f55a91a9d4");
        } else {
            this.b.proceed();
        }
    }

    @Override // com.meituan.mtwebkit.MTSslErrorHandler
    public final void cancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1192a51f3ae4bd362f977a1d7f799d0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1192a51f3ae4bd362f977a1d7f799d0a");
        } else {
            this.b.cancel();
        }
    }
}
