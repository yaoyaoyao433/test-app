package com.meituan.android.common.unionid.oneid.appid;

import com.android.meituan.multiprocess.IPCBaseContentProvider;
import com.meituan.android.common.unionid.oneid.OneIdHandler;
import com.meituan.android.common.unionid.oneid.util.LogUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class AppIdProvider extends IPCBaseContentProvider {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.android.meituan.multiprocess.IPCBaseContentProvider
    public final String getProcessName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d42685eff8e2c3551f175473a8679e7f", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d42685eff8e2c3551f175473a8679e7f") : getContext().getPackageName();
    }

    @Override // com.android.meituan.multiprocess.IPCBaseContentProvider
    public final boolean startAfterInit() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d0b85b5a2fc9d8f4e3594bb43fa3ed4f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d0b85b5a2fc9d8f4e3594bb43fa3ed4f")).booleanValue();
        }
        if (getContext() != null) {
            LogUtils.i("AppUtil", "startAfterInit:" + OneIdHandler.getInstance(getContext()).isStartAfterInit());
            return OneIdHandler.getInstance(getContext()).isStartAfterInit();
        }
        return false;
    }
}
