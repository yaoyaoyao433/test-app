package com.meituan.android.common.unionid.oneid.appid;

import android.os.Bundle;
import com.android.meituan.multiprocess.invoker.c;
import com.meituan.android.common.unionid.oneid.OneIdHandler;
import com.meituan.android.common.unionid.oneid.util.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class DeviceInfoInvoker implements c<Bundle, String> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.android.meituan.multiprocess.invoker.c
    public String invoke(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "17cafd46e6f5ccbf9b3ec53a85620df0", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "17cafd46e6f5ccbf9b3ec53a85620df0") : OneIdHandler.getContext() != null ? AppUtil.getAndroidId(OneIdHandler.getContext()) : "";
    }
}
