package com.meituan.msi.api.extension.sgc.floatlayer;

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
public abstract class IFloatlayer implements IMsiCustomApi {
    public static ChangeQuickRedirect a;

    public abstract void a(MsiCustomContext msiCustomContext, ShowFloatLayerParam showFloatLayerParam, i<EmptyResponse> iVar);

    public abstract void a(MsiCustomContext msiCustomContext, ShowOperationFloatLayerParam showOperationFloatLayerParam, i<EmptyResponse> iVar);

    @MsiApiMethod(name = "showFloatLayer", onUiThread = true, request = ShowFloatLayerParam.class, scope = "sgc")
    public void msiShowFloatLayer(ShowFloatLayerParam showFloatLayerParam, final MsiCustomContext msiCustomContext) {
        Object[] objArr = {showFloatLayerParam, msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1fa50e0bf7d085d02cfe76a04587ac2a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1fa50e0bf7d085d02cfe76a04587ac2a");
        } else {
            a(msiCustomContext, showFloatLayerParam, new i<EmptyResponse>() { // from class: com.meituan.msi.api.extension.sgc.floatlayer.IFloatlayer.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.api.i
                public final /* synthetic */ void a(EmptyResponse emptyResponse) {
                    EmptyResponse emptyResponse2 = emptyResponse;
                    Object[] objArr2 = {emptyResponse2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7a57b7dafd12c46467304cb463c3ed28", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7a57b7dafd12c46467304cb463c3ed28");
                    } else {
                        msiCustomContext.onSuccess(emptyResponse2);
                    }
                }

                @Override // com.meituan.msi.api.i
                public final void a(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "33991f6d8e7b9010a136704446dcb949", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "33991f6d8e7b9010a136704446dcb949");
                    } else {
                        msiCustomContext.onError(i, str);
                    }
                }
            });
        }
    }

    @MsiApiMethod(name = "showOperationFloatLayer", request = ShowOperationFloatLayerParam.class, scope = "sgc")
    public void msiShowOperationFloatLayer(ShowOperationFloatLayerParam showOperationFloatLayerParam, final MsiCustomContext msiCustomContext) {
        Object[] objArr = {showOperationFloatLayerParam, msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fee4fdb6ebe1383bcaced6576dd456f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fee4fdb6ebe1383bcaced6576dd456f5");
        } else {
            a(msiCustomContext, showOperationFloatLayerParam, new i<EmptyResponse>() { // from class: com.meituan.msi.api.extension.sgc.floatlayer.IFloatlayer.2
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.api.i
                public final /* synthetic */ void a(EmptyResponse emptyResponse) {
                    EmptyResponse emptyResponse2 = emptyResponse;
                    Object[] objArr2 = {emptyResponse2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "40fc87736bc60f8ef02fff8f56f5d89a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "40fc87736bc60f8ef02fff8f56f5d89a");
                    } else {
                        msiCustomContext.onSuccess(emptyResponse2);
                    }
                }

                @Override // com.meituan.msi.api.i
                public final void a(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "704718dd6647c65b75fd797c390a0075", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "704718dd6647c65b75fd797c390a0075");
                    } else {
                        msiCustomContext.onError(i, str);
                    }
                }
            });
        }
    }
}
