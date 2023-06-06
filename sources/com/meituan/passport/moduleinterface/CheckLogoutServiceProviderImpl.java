package com.meituan.passport.moduleinterface;

import android.text.TextUtils;
import com.meituan.passport.api.CheckLogoutServiceProvider;
import com.meituan.passport.api.ICallbackBase;
import com.meituan.passport.pojo.LogoutInfo;
import com.meituan.passport.pojo.LogoutResult;
import com.meituan.passport.utils.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.Response;
import com.sankuai.meituan.retrofit2.f;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class CheckLogoutServiceProviderImpl implements CheckLogoutServiceProvider {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.passport.api.CheckLogoutServiceProvider
    public void canLogoutAsync(String str, LogoutInfo logoutInfo, final ICallbackBase<LogoutResult> iCallbackBase) {
        Object[] objArr = {str, logoutInfo, iCallbackBase};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3c1bcf7ba9fc78ae7d635937b9df6b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3c1bcf7ba9fc78ae7d635937b9df6b2");
        } else if (logoutInfo == null || TextUtils.isEmpty(str)) {
            if (iCallbackBase != null) {
                iCallbackBase.onFailed(null);
            }
        } else {
            Call<LogoutResult> logoutCheckV1 = s.e().logoutCheckV1(str, logoutInfo.getComponentName(), logoutInfo.getLogoutScene(), logoutInfo.getLogoutExtraInfo());
            if (logoutCheckV1 != null) {
                logoutCheckV1.a(new f<LogoutResult>() { // from class: com.meituan.passport.moduleinterface.CheckLogoutServiceProviderImpl.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.meituan.retrofit2.f
                    public final void onResponse(Call<LogoutResult> call, Response<LogoutResult> response) {
                        Object[] objArr2 = {call, response};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "47add30118c859394741df9e3e8335b1", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "47add30118c859394741df9e3e8335b1");
                            return;
                        }
                        LogoutResult e = response != null ? response.e() : null;
                        if (iCallbackBase != null) {
                            if (e != null) {
                                iCallbackBase.onSuccess(e);
                            } else {
                                iCallbackBase.onFailed(null);
                            }
                        }
                    }

                    @Override // com.sankuai.meituan.retrofit2.f
                    public final void onFailure(Call<LogoutResult> call, Throwable th) {
                        Object[] objArr2 = {call, th};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f6807ac074ba262b40c754084d05935b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f6807ac074ba262b40c754084d05935b");
                        } else if (iCallbackBase != null) {
                            iCallbackBase.onFailed(th);
                        }
                    }
                });
            }
        }
    }
}
