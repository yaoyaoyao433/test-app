package com.meituan.msi.horn.base;

import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.api.IMsiCustomApi;
import com.meituan.msi.api.i;
import com.meituan.msi.bean.EmptyResponse;
import com.meituan.msi.bean.MsiCustomContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class IBaseBizAdaptor implements IMsiCustomApi {
    public static ChangeQuickRedirect changeQuickRedirect;

    public abstract void getHornCacheAsync(MsiCustomContext msiCustomContext, GetHornCacheAsyncParam getHornCacheAsyncParam, i<GetHornCacheAsyncResponse> iVar);

    public abstract GetHornCacheSyncResponse getHornCacheSync(MsiCustomContext msiCustomContext, GetHornCacheSyncParam getHornCacheSyncParam);

    public abstract void registerHornConfig(MsiCustomContext msiCustomContext, RegisterHornConfigParam registerHornConfigParam, i<EmptyResponse> iVar);

    @MsiApiMethod(name = "getHornCacheSync", request = GetHornCacheSyncParam.class, response = GetHornCacheSyncResponse.class, scope = "horn")
    public GetHornCacheSyncResponse msiGetHornCacheSync(GetHornCacheSyncParam getHornCacheSyncParam, MsiCustomContext msiCustomContext) {
        Object[] objArr = {getHornCacheSyncParam, msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "09ba4af1d2f3186a5c16a3ea2e8f89b4", RobustBitConfig.DEFAULT_VALUE) ? (GetHornCacheSyncResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "09ba4af1d2f3186a5c16a3ea2e8f89b4") : getHornCacheSync(msiCustomContext, getHornCacheSyncParam);
    }

    @MsiApiMethod(name = "registerHornConfig", request = RegisterHornConfigParam.class, scope = "horn")
    public void msiRegisterHornConfig(RegisterHornConfigParam registerHornConfigParam, final MsiCustomContext msiCustomContext) {
        Object[] objArr = {registerHornConfigParam, msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a3a9bf708e3cbdb7bf91d5cb28278dc3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a3a9bf708e3cbdb7bf91d5cb28278dc3");
        } else {
            registerHornConfig(msiCustomContext, registerHornConfigParam, new i<EmptyResponse>() { // from class: com.meituan.msi.horn.base.IBaseBizAdaptor.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.api.i
                public final /* synthetic */ void a(EmptyResponse emptyResponse) {
                    EmptyResponse emptyResponse2 = emptyResponse;
                    Object[] objArr2 = {emptyResponse2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0c18fb8c9e88dff274b92e3b3c6b2b42", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0c18fb8c9e88dff274b92e3b3c6b2b42");
                    } else {
                        msiCustomContext.onSuccess(emptyResponse2);
                    }
                }

                @Override // com.meituan.msi.api.i
                public final void a(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "27d6ae751e4b2fff018594d555ac6f4c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "27d6ae751e4b2fff018594d555ac6f4c");
                    } else {
                        msiCustomContext.onError(i, str);
                    }
                }
            });
        }
    }

    @MsiApiMethod(name = "getHornCacheAsync", request = GetHornCacheAsyncParam.class, response = GetHornCacheAsyncResponse.class, scope = "horn")
    public void msiGetHornCacheAsync(GetHornCacheAsyncParam getHornCacheAsyncParam, final MsiCustomContext msiCustomContext) {
        Object[] objArr = {getHornCacheAsyncParam, msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6a19b3f815335f5d523efea60b8f2f20", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6a19b3f815335f5d523efea60b8f2f20");
        } else {
            getHornCacheAsync(msiCustomContext, getHornCacheAsyncParam, new i<GetHornCacheAsyncResponse>() { // from class: com.meituan.msi.horn.base.IBaseBizAdaptor.2
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.api.i
                public final /* synthetic */ void a(GetHornCacheAsyncResponse getHornCacheAsyncResponse) {
                    GetHornCacheAsyncResponse getHornCacheAsyncResponse2 = getHornCacheAsyncResponse;
                    Object[] objArr2 = {getHornCacheAsyncResponse2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2586ede448b87ad3e7ac717593b4c24c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2586ede448b87ad3e7ac717593b4c24c");
                    } else {
                        msiCustomContext.onSuccess(getHornCacheAsyncResponse2);
                    }
                }

                @Override // com.meituan.msi.api.i
                public final void a(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1ce6eb8ca44eb66e7a93d0e083f5422a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1ce6eb8ca44eb66e7a93d0e083f5422a");
                    } else {
                        msiCustomContext.onError(i, str);
                    }
                }
            });
        }
    }
}
