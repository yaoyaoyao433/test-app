package com.meituan.msi.addapter.update;

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
public abstract class IUpdateHost implements IMsiCustomApi {
    public static ChangeQuickRedirect a;

    public abstract void a(MsiCustomContext msiCustomContext, UpdateHostAppParam updateHostAppParam, i<EmptyResponse> iVar);

    @MsiApiMethod(name = "updateHostApp", request = UpdateHostAppParam.class)
    public void msiUpdate(UpdateHostAppParam updateHostAppParam, final MsiCustomContext msiCustomContext) {
        Object[] objArr = {updateHostAppParam, msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1545171ed3391a5359fd568fac5a415f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1545171ed3391a5359fd568fac5a415f");
        } else {
            a(msiCustomContext, updateHostAppParam, new i<EmptyResponse>() { // from class: com.meituan.msi.addapter.update.IUpdateHost.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.api.i
                public final /* synthetic */ void a(EmptyResponse emptyResponse) {
                    EmptyResponse emptyResponse2 = emptyResponse;
                    Object[] objArr2 = {emptyResponse2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9955d2db26aafdd25176379d52d91ae0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9955d2db26aafdd25176379d52d91ae0");
                    } else {
                        msiCustomContext.onSuccess(emptyResponse2);
                    }
                }

                @Override // com.meituan.msi.api.i
                public final void a(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "134e8e0e2394d4a176daaa46d3688580", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "134e8e0e2394d4a176daaa46d3688580");
                    } else {
                        msiCustomContext.onError(i, str);
                    }
                }
            });
        }
    }
}
