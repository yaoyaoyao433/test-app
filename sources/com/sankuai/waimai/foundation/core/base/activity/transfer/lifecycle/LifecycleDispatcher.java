package com.sankuai.waimai.foundation.core.base.activity.transfer.lifecycle;

import android.annotation.SuppressLint;
import android.arch.lifecycle.GenericLifecycleObserver;
import android.arch.lifecycle.d;
import android.arch.lifecycle.f;
import android.os.Bundle;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.base.activity.transfer.TransferActivity;
/* compiled from: ProGuard */
@SuppressLint({"RestrictedApi"})
/* loaded from: classes4.dex */
public class LifecycleDispatcher implements GenericLifecycleObserver {
    public static ChangeQuickRedirect a;
    public final a b;
    public TransferActivity c;
    public Bundle d;

    public LifecycleDispatcher(TransferActivity transferActivity, a aVar, @Nullable Bundle bundle) {
        Object[] objArr = {transferActivity, aVar, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8d945cab1587541f086e2e916818f58", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8d945cab1587541f086e2e916818f58");
            return;
        }
        this.c = transferActivity;
        this.b = aVar;
        this.d = bundle;
    }

    @Override // android.arch.lifecycle.GenericLifecycleObserver
    public final void a(f fVar, d.a aVar) {
        Object[] objArr = {fVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6729ec3fc42bcb17835157c8786bc6ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6729ec3fc42bcb17835157c8786bc6ea");
            return;
        }
        switch (aVar) {
            case ON_CREATE:
                this.b.a(this.c, this.d);
                return;
            case ON_START:
                this.b.a(this.c);
                return;
            case ON_RESUME:
                this.b.d(this.c);
                return;
            case ON_PAUSE:
                this.b.e(this.c);
                return;
            case ON_STOP:
                this.b.b(this.c);
                return;
            case ON_DESTROY:
                this.b.c(this.c);
                return;
            default:
                return;
        }
    }
}
