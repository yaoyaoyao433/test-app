package com.meituan.msi.api.caniuse;

import android.text.TextUtils;
import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.api.IMsiApi;
import com.meituan.msi.api.e;
import com.meituan.msi.bean.MsiContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class CanIUseApi implements IMsiApi {
    public static ChangeQuickRedirect a;

    @MsiApiMethod(name = "canIUse", request = CanIUseApiParam.class, response = CanIUseApiResponse.class)
    public CanIUseApiResponse canIUse(CanIUseApiParam canIUseApiParam, MsiContext msiContext) {
        Object[] objArr = {canIUseApiParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99a1d61a316fe8c91c87439634e7d902", RobustBitConfig.DEFAULT_VALUE)) {
            return (CanIUseApiResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99a1d61a316fe8c91c87439634e7d902");
        }
        CanIUseApiResponse canIUseApiResponse = new CanIUseApiResponse();
        if (TextUtils.isEmpty(canIUseApiParam.schema)) {
            return canIUseApiResponse;
        }
        canIUseApiResponse.result = e.a(msiContext.request, canIUseApiParam.scope, canIUseApiParam.schema);
        return canIUseApiResponse;
    }
}
