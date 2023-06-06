package com.meituan.msi.api.extension.sgc.user;

import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.api.IMsiCustomApi;
import com.meituan.msi.api.j;
import com.meituan.msi.bean.MsiCustomContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class IUser implements IMsiCustomApi {
    public static ChangeQuickRedirect a;

    public abstract void a(MsiCustomContext msiCustomContext, j<UserStateResponse> jVar);

    @MsiApiMethod(isCallback = true, name = "onUserStateChange", response = UserStateResponse.class, scope = "sgc")
    public void onUserStateChange(MsiCustomContext msiCustomContext) {
    }

    @MsiApiMethod(name = "addUserStateChangeListener", scope = "sgc")
    public void msiAddUserStateChangeListener(final MsiCustomContext msiCustomContext) {
        Object[] objArr = {msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5200252a3196aa810f0930b339ad790f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5200252a3196aa810f0930b339ad790f");
        } else {
            a(msiCustomContext, new j<UserStateResponse>() { // from class: com.meituan.msi.api.extension.sgc.user.IUser.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.api.j
                public final /* synthetic */ void a(UserStateResponse userStateResponse) {
                    UserStateResponse userStateResponse2 = userStateResponse;
                    Object[] objArr2 = {userStateResponse2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8b1c95afd72948db55227857394e5110", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8b1c95afd72948db55227857394e5110");
                    } else {
                        msiCustomContext.dispatchEvent("sgc", "onUserStateChange", userStateResponse2);
                    }
                }
            });
        }
    }
}
