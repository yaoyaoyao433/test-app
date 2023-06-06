package com.meituan.android.yoda.callbacks;

import com.meituan.android.yoda.IYodaVerifyListener;
import com.meituan.android.yoda.YodaResponseListener;
import com.meituan.android.yoda.retrofit.Error;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class g implements IYodaVerifyListener {
    public static ChangeQuickRedirect a;
    public YodaResponseListener b;

    @Override // com.meituan.android.yoda.IYodaVerifyListener
    public final void onFaceVerifyTerminal(String str, Error error, com.meituan.android.yoda.model.a[] aVarArr, String str2) {
    }

    public g(YodaResponseListener yodaResponseListener) {
        Object[] objArr = {yodaResponseListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06b04fce2878b89feb4e0bc0ca0ed679", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06b04fce2878b89feb4e0bc0ca0ed679");
        } else {
            this.b = yodaResponseListener;
        }
    }

    @Override // com.meituan.android.yoda.IYodaVerifyListener
    public final void onSuccess(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca378048a09dbea9a541a434d15a0e66", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca378048a09dbea9a541a434d15a0e66");
        } else if (this.b != null) {
            this.b.onYodaResponse(str, str2);
        }
    }

    @Override // com.meituan.android.yoda.IYodaVerifyListener
    public final void onCancel(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37378b6517625d02aa3cf668a14db7cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37378b6517625d02aa3cf668a14db7cf");
        } else if (this.b != null) {
            this.b.onCancel(str);
        }
    }

    @Override // com.meituan.android.yoda.IYodaVerifyListener
    public final void onError(String str, Error error) {
        Object[] objArr = {str, error};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec3c0ef0e6620c5367925b03ddb4fc27", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec3c0ef0e6620c5367925b03ddb4fc27");
        } else if (this.b != null) {
            this.b.onError(str, error);
        }
    }
}
