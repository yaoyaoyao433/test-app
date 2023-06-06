package com.meituan.msi.api.extension.sgc.common;

import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.api.IMsiCustomApi;
import com.meituan.msi.api.i;
import com.meituan.msi.api.j;
import com.meituan.msi.bean.EmptyResponse;
import com.meituan.msi.bean.MsiCustomContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class ICommon implements IMsiCustomApi {
    public static ChangeQuickRedirect a;

    public abstract void a(MsiCustomContext msiCustomContext, AddPoiShortcutParam addPoiShortcutParam, i<EmptyResponse> iVar);

    public abstract void a(MsiCustomContext msiCustomContext, CollectPoiParam collectPoiParam, i<EmptyResponse> iVar);

    public abstract void a(MsiCustomContext msiCustomContext, GetWMAddressWithBusinessIDParam getWMAddressWithBusinessIDParam, i<GetWMAddressWithBusinessIDResponse> iVar);

    public abstract void a(MsiCustomContext msiCustomContext, SyncPoiInfoParam syncPoiInfoParam, i<EmptyResponse> iVar);

    public abstract void a(MsiCustomContext msiCustomContext, j<OnStoreStatusChangeResponse> jVar);

    @MsiApiMethod(isCallback = true, name = "onStoreStatusChange", response = OnStoreStatusChangeResponse.class, scope = "sgc")
    public void onStoreStatusChange(MsiCustomContext msiCustomContext) {
    }

    @MsiApiMethod(name = "collectPoi", request = CollectPoiParam.class, scope = "sgc")
    public void msiCollectPoi(CollectPoiParam collectPoiParam, final MsiCustomContext msiCustomContext) {
        Object[] objArr = {collectPoiParam, msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6ee57f4e3b1b36a856aae1c22649931", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6ee57f4e3b1b36a856aae1c22649931");
        } else {
            a(msiCustomContext, collectPoiParam, new i<EmptyResponse>() { // from class: com.meituan.msi.api.extension.sgc.common.ICommon.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.api.i
                public final /* synthetic */ void a(EmptyResponse emptyResponse) {
                    EmptyResponse emptyResponse2 = emptyResponse;
                    Object[] objArr2 = {emptyResponse2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "611d391bff3ebc796e4a5d7bc2ad13f9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "611d391bff3ebc796e4a5d7bc2ad13f9");
                    } else {
                        msiCustomContext.onSuccess(emptyResponse2);
                    }
                }

                @Override // com.meituan.msi.api.i
                public final void a(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9ea3815f2af88a5711aae4338c31bc99", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9ea3815f2af88a5711aae4338c31bc99");
                    } else {
                        msiCustomContext.onError(i, str);
                    }
                }
            });
        }
    }

    @MsiApiMethod(name = "addPoiShortcut", request = AddPoiShortcutParam.class, scope = "sgc")
    public void msiAddPoiShortcut(AddPoiShortcutParam addPoiShortcutParam, final MsiCustomContext msiCustomContext) {
        Object[] objArr = {addPoiShortcutParam, msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4555d44e2cbc01dd5957d64690577ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4555d44e2cbc01dd5957d64690577ad");
        } else {
            a(msiCustomContext, addPoiShortcutParam, new i<EmptyResponse>() { // from class: com.meituan.msi.api.extension.sgc.common.ICommon.2
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.api.i
                public final /* synthetic */ void a(EmptyResponse emptyResponse) {
                    EmptyResponse emptyResponse2 = emptyResponse;
                    Object[] objArr2 = {emptyResponse2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "085023059c2867ba73193bc075c9d80b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "085023059c2867ba73193bc075c9d80b");
                    } else {
                        msiCustomContext.onSuccess(emptyResponse2);
                    }
                }

                @Override // com.meituan.msi.api.i
                public final void a(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "568d0b8bc59a2c27db056d79a8aa1995", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "568d0b8bc59a2c27db056d79a8aa1995");
                    } else {
                        msiCustomContext.onError(i, str);
                    }
                }
            });
        }
    }

    @MsiApiMethod(name = "syncPoiInfo", request = SyncPoiInfoParam.class, scope = "sgc")
    public void msiSyncPoiInfo(SyncPoiInfoParam syncPoiInfoParam, final MsiCustomContext msiCustomContext) {
        Object[] objArr = {syncPoiInfoParam, msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "611ce52dbfdaf8b0ddbbf6c267d9e2e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "611ce52dbfdaf8b0ddbbf6c267d9e2e7");
        } else {
            a(msiCustomContext, syncPoiInfoParam, new i<EmptyResponse>() { // from class: com.meituan.msi.api.extension.sgc.common.ICommon.3
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.api.i
                public final /* synthetic */ void a(EmptyResponse emptyResponse) {
                    EmptyResponse emptyResponse2 = emptyResponse;
                    Object[] objArr2 = {emptyResponse2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "371ea180c64cc93671ab3a44eba61a0f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "371ea180c64cc93671ab3a44eba61a0f");
                    } else {
                        msiCustomContext.onSuccess(emptyResponse2);
                    }
                }

                @Override // com.meituan.msi.api.i
                public final void a(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0d7143a58247f4a192f588d0648dc896", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0d7143a58247f4a192f588d0648dc896");
                    } else {
                        msiCustomContext.onError(i, str);
                    }
                }
            });
        }
    }

    @MsiApiMethod(name = "addStoreStatusChangeListener", scope = "sgc")
    public void msiAddStoreStatusChangeListener(final MsiCustomContext msiCustomContext) {
        Object[] objArr = {msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8383fd2587ec5797aab577784aaaaa1f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8383fd2587ec5797aab577784aaaaa1f");
            return;
        }
        a(msiCustomContext, new j<OnStoreStatusChangeResponse>() { // from class: com.meituan.msi.api.extension.sgc.common.ICommon.4
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msi.api.j
            public final /* synthetic */ void a(OnStoreStatusChangeResponse onStoreStatusChangeResponse) {
                OnStoreStatusChangeResponse onStoreStatusChangeResponse2 = onStoreStatusChangeResponse;
                Object[] objArr2 = {onStoreStatusChangeResponse2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "67de33416778744552f30bc7b0a400e4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "67de33416778744552f30bc7b0a400e4");
                } else {
                    msiCustomContext.dispatchEvent("sgc", "onStoreStatusChange", onStoreStatusChangeResponse2);
                }
            }
        });
        msiCustomContext.onSuccess("");
    }

    @MsiApiMethod(name = "getWMAddressWithBusinessID", request = GetWMAddressWithBusinessIDParam.class, response = GetWMAddressWithBusinessIDResponse.class, scope = "sgc")
    public void msiGetWMAddressWithBusinessID(GetWMAddressWithBusinessIDParam getWMAddressWithBusinessIDParam, final MsiCustomContext msiCustomContext) {
        Object[] objArr = {getWMAddressWithBusinessIDParam, msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "779e3b5babd9e524b7c9dd627efba79d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "779e3b5babd9e524b7c9dd627efba79d");
        } else {
            a(msiCustomContext, getWMAddressWithBusinessIDParam, new i<GetWMAddressWithBusinessIDResponse>() { // from class: com.meituan.msi.api.extension.sgc.common.ICommon.5
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.api.i
                public final /* synthetic */ void a(GetWMAddressWithBusinessIDResponse getWMAddressWithBusinessIDResponse) {
                    GetWMAddressWithBusinessIDResponse getWMAddressWithBusinessIDResponse2 = getWMAddressWithBusinessIDResponse;
                    Object[] objArr2 = {getWMAddressWithBusinessIDResponse2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "aec2df94cee095c59678488cf962a769", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "aec2df94cee095c59678488cf962a769");
                    } else {
                        msiCustomContext.onSuccess(getWMAddressWithBusinessIDResponse2);
                    }
                }

                @Override // com.meituan.msi.api.i
                public final void a(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0769f817564b3f631c2751dfb64b9050", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0769f817564b3f631c2751dfb64b9050");
                    } else {
                        msiCustomContext.onError(i, str);
                    }
                }
            });
        }
    }
}
