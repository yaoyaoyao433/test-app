package com.meituan.msi.api.extension.sgc.page;

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
public abstract class IPage implements IMsiCustomApi {
    public static ChangeQuickRedirect a;

    public abstract void a(MsiCustomContext msiCustomContext, SgPageCreateParam sgPageCreateParam, i<EmptyResponse> iVar);

    public abstract void a(MsiCustomContext msiCustomContext, SgPageDestroyParam sgPageDestroyParam, i<EmptyResponse> iVar);

    @MsiApiMethod(name = "sgPageDestroy", request = SgPageDestroyParam.class, scope = "sgc")
    public void msiSgPageDestroy(SgPageDestroyParam sgPageDestroyParam, final MsiCustomContext msiCustomContext) {
        Object[] objArr = {sgPageDestroyParam, msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97afedb349b6f3edf80d9a3740c04304", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97afedb349b6f3edf80d9a3740c04304");
        } else {
            a(msiCustomContext, sgPageDestroyParam, new i<EmptyResponse>() { // from class: com.meituan.msi.api.extension.sgc.page.IPage.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.api.i
                public final /* synthetic */ void a(EmptyResponse emptyResponse) {
                    EmptyResponse emptyResponse2 = emptyResponse;
                    Object[] objArr2 = {emptyResponse2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b78f65a850bec348659bd3b9a6c83f1f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b78f65a850bec348659bd3b9a6c83f1f");
                    } else {
                        msiCustomContext.onSuccess(emptyResponse2);
                    }
                }

                @Override // com.meituan.msi.api.i
                public final void a(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d50c63e9879f79aff6b766269c91d6b1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d50c63e9879f79aff6b766269c91d6b1");
                    } else {
                        msiCustomContext.onError(i, str);
                    }
                }
            });
        }
    }

    @MsiApiMethod(name = "sgPageCreate", request = SgPageCreateParam.class, scope = "sgc")
    public void msiSgPageCreate(SgPageCreateParam sgPageCreateParam, final MsiCustomContext msiCustomContext) {
        Object[] objArr = {sgPageCreateParam, msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e16293e87d20014630601d593a666e7e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e16293e87d20014630601d593a666e7e");
        } else {
            a(msiCustomContext, sgPageCreateParam, new i<EmptyResponse>() { // from class: com.meituan.msi.api.extension.sgc.page.IPage.2
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.api.i
                public final /* synthetic */ void a(EmptyResponse emptyResponse) {
                    EmptyResponse emptyResponse2 = emptyResponse;
                    Object[] objArr2 = {emptyResponse2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4cb47722726d1a072991e267cd8958ee", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4cb47722726d1a072991e267cd8958ee");
                    } else {
                        msiCustomContext.onSuccess(emptyResponse2);
                    }
                }

                @Override // com.meituan.msi.api.i
                public final void a(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d96540144c3fd5b66463d8a5597444f6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d96540144c3fd5b66463d8a5597444f6");
                    } else {
                        msiCustomContext.onError(i, str);
                    }
                }
            });
        }
    }
}
