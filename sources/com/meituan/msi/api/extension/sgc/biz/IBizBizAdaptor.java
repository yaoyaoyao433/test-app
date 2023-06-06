package com.meituan.msi.api.extension.sgc.biz;

import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.api.IMsiCustomApi;
import com.meituan.msi.api.i;
import com.meituan.msi.api.j;
import com.meituan.msi.bean.MsiCustomContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class IBizBizAdaptor implements IMsiCustomApi {
    public static ChangeQuickRedirect a;

    @MsiApiMethod(isCallback = true, name = "onSyncFromNativeCart", response = OnSyncFromNativeCartResponse.class, scope = "sgc")
    public void onSyncFromNativeCart(MsiCustomContext msiCustomContext) {
    }

    @MsiApiMethod(name = "addSyncFromNativeCartListener", request = AddSyncFromNativeCartListenerParam.class, scope = "sgc")
    public void msiAddSyncFromNativeCartListener(AddSyncFromNativeCartListenerParam addSyncFromNativeCartListenerParam, final MsiCustomContext msiCustomContext) {
        Object[] objArr = {addSyncFromNativeCartListenerParam, msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0dbdcffaec961f1d645e92b880a571a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0dbdcffaec961f1d645e92b880a571a");
            return;
        }
        new j<OnSyncFromNativeCartResponse>() { // from class: com.meituan.msi.api.extension.sgc.biz.IBizBizAdaptor.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msi.api.j
            public final /* synthetic */ void a(OnSyncFromNativeCartResponse onSyncFromNativeCartResponse) {
                OnSyncFromNativeCartResponse onSyncFromNativeCartResponse2 = onSyncFromNativeCartResponse;
                Object[] objArr2 = {onSyncFromNativeCartResponse2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "87fc3beac5403d89c894058685786526", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "87fc3beac5403d89c894058685786526");
                } else {
                    msiCustomContext.dispatchEvent("sgc", "onSyncFromNativeCart", onSyncFromNativeCartResponse2);
                }
            }
        };
        msiCustomContext.onSuccess("");
    }

    @MsiApiMethod(name = "syncFromMscCart", request = SyncFromMscCartParam.class, response = SyncFromMscCartResponse.class, scope = "sgc")
    public void msiSyncFromMscCart(SyncFromMscCartParam syncFromMscCartParam, final MsiCustomContext msiCustomContext) {
        Object[] objArr = {syncFromMscCartParam, msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4996e1c4acddddb45d1f08015239279", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4996e1c4acddddb45d1f08015239279");
        } else {
            new i<SyncFromMscCartResponse>() { // from class: com.meituan.msi.api.extension.sgc.biz.IBizBizAdaptor.2
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.api.i
                public final /* synthetic */ void a(SyncFromMscCartResponse syncFromMscCartResponse) {
                    SyncFromMscCartResponse syncFromMscCartResponse2 = syncFromMscCartResponse;
                    Object[] objArr2 = {syncFromMscCartResponse2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0b86a715212a3992691f6fd1e51363d9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0b86a715212a3992691f6fd1e51363d9");
                    } else {
                        msiCustomContext.onSuccess(syncFromMscCartResponse2);
                    }
                }

                @Override // com.meituan.msi.api.i
                public final void a(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1818a4bfeffd58adb7707a8dcf153970", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1818a4bfeffd58adb7707a8dcf153970");
                    } else {
                        msiCustomContext.onError(i, str);
                    }
                }
            };
        }
    }
}
