package com.meituan.passport.pojo;

import android.support.annotation.RestrictTo;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.pay.model.OtherVerifyTypeConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class YodaCodeInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName(alternate = {OtherVerifyTypeConstants.RESPONSE_CODE}, value = OtherVerifyTypeConstants.REQUEST_CODE_IDENTITY)
    public String code;

    public boolean isValid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d51418c52a0f1caf745949a9aecb40d1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d51418c52a0f1caf745949a9aecb40d1")).booleanValue() : !TextUtils.isEmpty(this.code);
    }
}
