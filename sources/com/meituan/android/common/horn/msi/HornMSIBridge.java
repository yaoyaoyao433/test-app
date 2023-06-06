package com.meituan.android.common.horn.msi;

import com.meituan.android.common.horn.Horn;
import com.meituan.msi.api.i;
import com.meituan.msi.bean.EmptyResponse;
import com.meituan.msi.bean.MsiCustomContext;
import com.meituan.msi.horn.base.GetHornCacheAsyncParam;
import com.meituan.msi.horn.base.GetHornCacheAsyncResponse;
import com.meituan.msi.horn.base.GetHornCacheSyncParam;
import com.meituan.msi.horn.base.GetHornCacheSyncResponse;
import com.meituan.msi.horn.base.IBaseBizAdaptor;
import com.meituan.msi.horn.base.RegisterHornConfigParam;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HornMSIBridge extends IBaseBizAdaptor {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.meituan.msi.horn.base.IBaseBizAdaptor
    public GetHornCacheSyncResponse getHornCacheSync(MsiCustomContext msiCustomContext, GetHornCacheSyncParam getHornCacheSyncParam) {
        Object[] objArr = {msiCustomContext, getHornCacheSyncParam};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3fba0a4c45c2f2b3f6971568da741087", 6917529027641081856L)) {
            return (GetHornCacheSyncResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3fba0a4c45c2f2b3f6971568da741087");
        }
        GetHornCacheSyncResponse getHornCacheSyncResponse = new GetHornCacheSyncResponse();
        getHornCacheSyncResponse.content = Horn.accessCache(getHornCacheSyncParam.type);
        return getHornCacheSyncResponse;
    }

    @Override // com.meituan.msi.horn.base.IBaseBizAdaptor
    public void registerHornConfig(MsiCustomContext msiCustomContext, RegisterHornConfigParam registerHornConfigParam, i<EmptyResponse> iVar) {
        Object[] objArr = {msiCustomContext, registerHornConfigParam, iVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b5b6ccabc52c854c6b5b9290b37db65a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b5b6ccabc52c854c6b5b9290b37db65a");
        } else if (registerHornConfigParam.params == null || (registerHornConfigParam.params instanceof Map)) {
            HornRegistry.getInstance().register(registerHornConfigParam.type, msiCustomContext, (Map) registerHornConfigParam.params);
            iVar.a(EmptyResponse.INSTANCE);
        } else {
            iVar.a(1400, "params type is not HashMap or null");
        }
    }

    @Override // com.meituan.msi.horn.base.IBaseBizAdaptor
    public void getHornCacheAsync(MsiCustomContext msiCustomContext, GetHornCacheAsyncParam getHornCacheAsyncParam, i<GetHornCacheAsyncResponse> iVar) {
        Object[] objArr = {msiCustomContext, getHornCacheAsyncParam, iVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eb07911a4c1db30ecc68ca7847c63123", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eb07911a4c1db30ecc68ca7847c63123");
            return;
        }
        GetHornCacheAsyncResponse getHornCacheAsyncResponse = new GetHornCacheAsyncResponse();
        getHornCacheAsyncResponse.content = Horn.accessCache(getHornCacheAsyncParam.type);
        iVar.a(getHornCacheAsyncResponse);
    }
}
