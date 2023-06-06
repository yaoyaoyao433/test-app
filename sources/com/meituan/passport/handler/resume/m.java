package com.meituan.passport.handler.resume;

import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.meituan.android.yoda.YodaConfirm;
import com.meituan.android.yoda.YodaResponseListener;
import com.meituan.android.yoda.retrofit.Error;
import com.meituan.passport.UserCenter;
import com.meituan.passport.exception.ApiException;
import com.meituan.passport.handler.exception.g;
import com.meituan.passport.utils.n;
import com.meituan.passport.utils.p;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class m implements g.a {
    public static ChangeQuickRedirect a;
    private final l b;
    private final ApiException c;
    private final FragmentActivity d;

    public m(l lVar, ApiException apiException, FragmentActivity fragmentActivity) {
        this.b = lVar;
        this.c = apiException;
        this.d = fragmentActivity;
    }

    @Override // com.meituan.passport.handler.exception.g.a
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc6552ec1d01b662225262d883aeb366", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc6552ec1d01b662225262d883aeb366");
            return;
        }
        final l lVar = this.b;
        ApiException apiException = this.c;
        final FragmentActivity fragmentActivity = this.d;
        Object[] objArr2 = {lVar, apiException, fragmentActivity, str};
        ChangeQuickRedirect changeQuickRedirect2 = l.b;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "38126001184584e0b5a8db17aa0fc657", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "38126001184584e0b5a8db17aa0fc657");
        } else if (TextUtils.isEmpty(str)) {
            lVar.e.onCompleted();
        } else {
            com.meituan.passport.exception.monitor.b.a().a(apiException);
            if (lVar.i) {
                p.a().a(fragmentActivity, lVar.h, lVar.g, apiException != null ? apiException.code : -999);
            }
            if (lVar.i && TextUtils.equals(UserCenter.OAUTH_TYPE_ACCOUNT, lVar.h)) {
                p.a().c(fragmentActivity, lVar.h, lVar.g, apiException != null ? apiException.code : -999);
            }
            try {
                YodaConfirm.getInstance(fragmentActivity, new YodaResponseListener() { // from class: com.meituan.passport.handler.resume.l.1
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.yoda.YodaResponseListener
                    public final void onYodaResponse(String str2, String str3) {
                        Object[] objArr3 = {str2, str3};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c919a3bf017e1ffbc796304a6130e5a0", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c919a3bf017e1ffbc796304a6130e5a0");
                            return;
                        }
                        if (!TextUtils.isEmpty(str2)) {
                            if (lVar.f != null) {
                                lVar.f.a(str2, str3).a((rx.e) lVar.e);
                            }
                            if (lVar.i) {
                                p.a().a(fragmentActivity, lVar.h, lVar.g, 1);
                            }
                        }
                        n.a("YodaConfirmSDKErrorResumeHandler.errorResume", "onYodaResponse", "requestCode is : " + str2);
                    }

                    @Override // com.meituan.android.yoda.YodaResponseListener
                    public final void onCancel(String str2) {
                        Object[] objArr3 = {str2};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7ee6443ece04a2762064b4baef7de06b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7ee6443ece04a2762064b4baef7de06b");
                            return;
                        }
                        lVar.e.onError(new ApiException("", 2, ""));
                        n.a("YodaConfirmSDKErrorResumeHandler.errorResume", "onCancel", "requestCode is : " + str2);
                    }

                    @Override // com.meituan.android.yoda.YodaResponseListener
                    public final void onError(String str2, Error error) {
                        Object[] objArr3 = {str2, error};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "df33f1248e97065a4de1b13e70db23be", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "df33f1248e97065a4de1b13e70db23be");
                            return;
                        }
                        lVar.e.onError(new ApiException("", 3, ""));
                        if (lVar.i) {
                            p.a().a(fragmentActivity, lVar.h, lVar.g, error != null ? error.code : -999);
                        }
                        StringBuilder sb = new StringBuilder("requestCode is : ");
                        sb.append(str2);
                        sb.append(", , error code is : ");
                        sb.append(error != null ? Integer.valueOf(error.code) : "error is null");
                        n.a("YodaConfirmSDKErrorResumeHandler.errorResume", "onError", sb.toString());
                    }
                }).startConfirm(str);
            } catch (Exception e) {
                com.meituan.passport.utils.m.a(e);
            }
        }
    }
}
