package com.meituan.msc.modules.api.network;

import com.meituan.msc.extern.MSCEnvHelper;
import com.meituan.msc.modules.api.msi.MSCApi;
import com.meituan.msi.annotations.MsiApiEnv;
import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.bean.ContainerInfo;
import com.meituan.msi.bean.MsiContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@MsiApiEnv(name = ContainerInfo.ENV_MSC)
/* loaded from: classes3.dex */
public class RequestPrefetchApi extends MSCApi {
    public static ChangeQuickRedirect a;

    @MsiApiMethod(name = "getBackgroundFetchData", request = FetchDataParam.class, response = FetchTokenResponse.class)
    public void getBackgroundFetchData(FetchDataParam fetchDataParam, final MsiContext msiContext) {
        Object[] objArr = {fetchDataParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "886b75c4ea8ce1664c7dc759e311a35d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "886b75c4ea8ce1664c7dc759e311a35d");
        } else if ("pre".equals(fetchDataParam.fetchType)) {
            this.c.h.a(new com.meituan.msc.common.framework.a<FetchTokenResponse>() { // from class: com.meituan.msc.modules.api.network.RequestPrefetchApi.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msc.common.framework.a
                public final /* synthetic */ void a(FetchTokenResponse fetchTokenResponse) {
                    FetchTokenResponse fetchTokenResponse2 = fetchTokenResponse;
                    Object[] objArr2 = {fetchTokenResponse2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a47b441aefecec01cf36823e0612ed61", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a47b441aefecec01cf36823e0612ed61");
                    } else {
                        msiContext.onSuccess(fetchTokenResponse2);
                    }
                }

                @Override // com.meituan.msc.common.framework.a
                public final void a(String str, Exception exc) {
                    Object[] objArr2 = {str, exc};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "35b8baa62b5dc15b3450696a8d1e0f6d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "35b8baa62b5dc15b3450696a8d1e0f6d");
                    } else {
                        msiContext.onError(str);
                    }
                }

                @Override // com.meituan.msc.common.framework.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "62c2960afe54d305d958130171fd7b74", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "62c2960afe54d305d958130171fd7b74");
                    } else {
                        msiContext.onError("cancel");
                    }
                }
            });
        } else {
            msiContext.onError(-1, "fetchType + " + fetchDataParam.fetchType + " not supported");
        }
    }

    @MsiApiMethod(name = "setBackgroundFetchToken", request = FetchTokenParam.class)
    public void setBackgroundFetchToken(FetchTokenParam fetchTokenParam, MsiContext msiContext) {
        Object[] objArr = {fetchTokenParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c6eddfb30a096550d7a5b8392bf36a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c6eddfb30a096550d7a5b8392bf36a3");
            return;
        }
        MSCEnvHelper.getSharedPreferences(a.a(this.c.r)).edit().putString("request_prefetch_token", fetchTokenParam.token).apply();
        msiContext.onSuccess(null);
    }
}
