package com.meituan.msc.modules.api;

import android.content.Intent;
import com.meituan.msc.extern.IApiCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class ServiceApi extends InternalApi {
    public static ChangeQuickRedirect e;

    @Override // com.meituan.msc.modules.api.AbsApi
    public boolean isActivityApi() {
        return false;
    }

    @Override // com.meituan.msc.modules.api.AbsApi
    public final void onActivityResult(int i, Intent intent, IApiCallback iApiCallback) {
    }

    @Override // com.meituan.msc.modules.api.AbsApi
    public final void onCreate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "094dff7df827b46b00c4bafb0c4bfda9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "094dff7df827b46b00c4bafb0c4bfda9");
        }
    }

    @Override // com.meituan.msc.modules.api.AbsApi
    public final void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77b743c0490c789030a84822749883df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77b743c0490c789030a84822749883df");
        }
    }
}
