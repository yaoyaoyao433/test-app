package com.meituan.mmp.lib.api;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.Nullable;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class ServiceApi extends InternalApi {
    public static ChangeQuickRedirect k;

    public void h() {
    }

    public void i() {
    }

    @Override // com.meituan.mmp.lib.api.AbsApi
    public boolean isActivityApi() {
        return false;
    }

    @Override // com.meituan.mmp.lib.api.AbsApi
    public final void onActivityResult(int i, Intent intent, IApiCallback iApiCallback) {
    }

    @Override // com.meituan.mmp.lib.api.AbsApi
    public final void onCreate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac1b2b665692ef0e8ec183a2bccb14c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac1b2b665692ef0e8ec183a2bccb14c9");
        }
    }

    @Override // com.meituan.mmp.lib.api.AbsApi
    public final void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b73a1481f8daaef1be18bb74fe67e4cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b73a1481f8daaef1be18bb74fe67e4cb");
        }
    }

    @Nullable
    public final Activity a() {
        return this.g;
    }

    @Nullable
    public final com.meituan.mmp.lib.a f() {
        return this.f;
    }

    @Nullable
    public final com.meituan.mmp.lib.a g() {
        return this.f;
    }
}
