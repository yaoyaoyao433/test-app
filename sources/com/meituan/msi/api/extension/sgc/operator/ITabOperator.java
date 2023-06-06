package com.meituan.msi.api.extension.sgc.operator;

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
public abstract class ITabOperator implements IMsiCustomApi {
    public static ChangeQuickRedirect a;

    @MsiApiMethod(name = "selectTabByIndex", request = SelectTabParam.class, scope = "sgc")
    public void msiSelectTabByIndex(SelectTabParam selectTabParam, final MsiCustomContext msiCustomContext) {
        Object[] objArr = {selectTabParam, msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47294bc52e350208802cb480fe48d9ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47294bc52e350208802cb480fe48d9ac");
        } else {
            new i<EmptyResponse>() { // from class: com.meituan.msi.api.extension.sgc.operator.ITabOperator.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.api.i
                public final /* synthetic */ void a(EmptyResponse emptyResponse) {
                    EmptyResponse emptyResponse2 = emptyResponse;
                    Object[] objArr2 = {emptyResponse2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2998975029c2bf40cfc884a5904d97c3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2998975029c2bf40cfc884a5904d97c3");
                    } else {
                        msiCustomContext.onSuccess(emptyResponse2);
                    }
                }

                @Override // com.meituan.msi.api.i
                public final void a(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5ce0cc12ea5a6fcf0dc591c12bac6011", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5ce0cc12ea5a6fcf0dc591c12bac6011");
                    } else {
                        msiCustomContext.onError(i, str);
                    }
                }
            };
        }
    }
}
