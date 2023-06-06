package com.meituan.msi.api.extension.medicine.shopcart;

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
public abstract class IShopcart implements IMsiCustomApi {
    public static ChangeQuickRedirect a;

    public abstract void a(MsiCustomContext msiCustomContext, AddNotifyNativeShopCartChangeListenerParam addNotifyNativeShopCartChangeListenerParam, j<NotifyNativeShopCartChangeResponse> jVar);

    public abstract void a(MsiCustomContext msiCustomContext, GetNativeShopCartDataParam getNativeShopCartDataParam, i<GetNativeShopCartDataResponse> iVar);

    public abstract void a(MsiCustomContext msiCustomContext, GetShopCartDataParam getShopCartDataParam, i<GetShopCartDataResponse> iVar);

    public abstract void a(MsiCustomContext msiCustomContext, JumpToPoiChatPageParam jumpToPoiChatPageParam, i<EmptyResponse> iVar);

    public abstract void a(MsiCustomContext msiCustomContext, PurchaseNowForSkuParam purchaseNowForSkuParam, i<EmptyResponse> iVar);

    public abstract void a(MsiCustomContext msiCustomContext, PurchaseNowParam purchaseNowParam, i<EmptyResponse> iVar);

    public abstract void a(MsiCustomContext msiCustomContext, SubmitOrderParam submitOrderParam, i<EmptyResponse> iVar);

    public abstract void a(MsiCustomContext msiCustomContext, UpdateNativeShopCartDataParam updateNativeShopCartDataParam, i<EmptyResponse> iVar);

    @MsiApiMethod(isCallback = true, name = "notifyNativeShopCartChange", onUiThread = true, response = NotifyNativeShopCartChangeResponse.class, scope = "medicine")
    public void notifyNativeShopCartChange(MsiCustomContext msiCustomContext) {
    }

    @MsiApiMethod(name = "purchaseNow", onUiThread = true, request = PurchaseNowParam.class, scope = "medicine")
    public void msiPurchaseNow(PurchaseNowParam purchaseNowParam, final MsiCustomContext msiCustomContext) {
        Object[] objArr = {purchaseNowParam, msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a3363167e5614d9ccde8278c1fd13c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a3363167e5614d9ccde8278c1fd13c0");
        } else {
            a(msiCustomContext, purchaseNowParam, new i<EmptyResponse>() { // from class: com.meituan.msi.api.extension.medicine.shopcart.IShopcart.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.api.i
                public final /* synthetic */ void a(EmptyResponse emptyResponse) {
                    EmptyResponse emptyResponse2 = emptyResponse;
                    Object[] objArr2 = {emptyResponse2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f8d43214e3e31b4c62efd9f22bf8c909", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f8d43214e3e31b4c62efd9f22bf8c909");
                    } else {
                        msiCustomContext.onSuccess(emptyResponse2);
                    }
                }

                @Override // com.meituan.msi.api.i
                public final void a(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7f01b6331e7bd0f3f0fddf8284994763", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7f01b6331e7bd0f3f0fddf8284994763");
                    } else {
                        msiCustomContext.onError(i, str);
                    }
                }
            });
        }
    }

    @MsiApiMethod(name = "submitOrder", onUiThread = true, request = SubmitOrderParam.class, scope = "medicine")
    public void msiSubmitOrder(SubmitOrderParam submitOrderParam, final MsiCustomContext msiCustomContext) {
        Object[] objArr = {submitOrderParam, msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b22465fbe63f01e91ffbf035c3d61e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b22465fbe63f01e91ffbf035c3d61e1");
        } else {
            a(msiCustomContext, submitOrderParam, new i<EmptyResponse>() { // from class: com.meituan.msi.api.extension.medicine.shopcart.IShopcart.2
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.api.i
                public final /* synthetic */ void a(EmptyResponse emptyResponse) {
                    EmptyResponse emptyResponse2 = emptyResponse;
                    Object[] objArr2 = {emptyResponse2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "39419f571b1d29b60beb742484cdccfb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "39419f571b1d29b60beb742484cdccfb");
                    } else {
                        msiCustomContext.onSuccess(emptyResponse2);
                    }
                }

                @Override // com.meituan.msi.api.i
                public final void a(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bc09c080fcb2e790ded596f70694ffaa", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bc09c080fcb2e790ded596f70694ffaa");
                    } else {
                        msiCustomContext.onError(i, str);
                    }
                }
            });
        }
    }

    @MsiApiMethod(name = "purchaseNowForSku", onUiThread = true, request = PurchaseNowForSkuParam.class, scope = "medicine")
    public void msiPurchaseNowForSku(PurchaseNowForSkuParam purchaseNowForSkuParam, final MsiCustomContext msiCustomContext) {
        Object[] objArr = {purchaseNowForSkuParam, msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c894829493b71215eb73fadb3db9478d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c894829493b71215eb73fadb3db9478d");
        } else {
            a(msiCustomContext, purchaseNowForSkuParam, new i<EmptyResponse>() { // from class: com.meituan.msi.api.extension.medicine.shopcart.IShopcart.3
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.api.i
                public final /* synthetic */ void a(EmptyResponse emptyResponse) {
                    EmptyResponse emptyResponse2 = emptyResponse;
                    Object[] objArr2 = {emptyResponse2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "21ea78c6d819072581296979aa788dbf", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "21ea78c6d819072581296979aa788dbf");
                    } else {
                        msiCustomContext.onSuccess(emptyResponse2);
                    }
                }

                @Override // com.meituan.msi.api.i
                public final void a(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ab5b74aff3751b883acf1170e38baa91", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ab5b74aff3751b883acf1170e38baa91");
                    } else {
                        msiCustomContext.onError(i, str);
                    }
                }
            });
        }
    }

    @MsiApiMethod(name = "updateNativeShopCartData", onUiThread = true, request = UpdateNativeShopCartDataParam.class, scope = "medicine")
    public void msiUpdateNativeShopCartData(UpdateNativeShopCartDataParam updateNativeShopCartDataParam, final MsiCustomContext msiCustomContext) {
        Object[] objArr = {updateNativeShopCartDataParam, msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6783b47daf87ab3f013b10affcc9fad4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6783b47daf87ab3f013b10affcc9fad4");
        } else {
            a(msiCustomContext, updateNativeShopCartDataParam, new i<EmptyResponse>() { // from class: com.meituan.msi.api.extension.medicine.shopcart.IShopcart.4
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.api.i
                public final /* synthetic */ void a(EmptyResponse emptyResponse) {
                    EmptyResponse emptyResponse2 = emptyResponse;
                    Object[] objArr2 = {emptyResponse2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8c088cdf55d9f5397580ba71c9e9df40", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8c088cdf55d9f5397580ba71c9e9df40");
                    } else {
                        msiCustomContext.onSuccess(emptyResponse2);
                    }
                }

                @Override // com.meituan.msi.api.i
                public final void a(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "89cb686b5652ac015e553b969482f1c9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "89cb686b5652ac015e553b969482f1c9");
                    } else {
                        msiCustomContext.onError(i, str);
                    }
                }
            });
        }
    }

    @MsiApiMethod(name = "addNotifyNativeShopCartChangeListener", onUiThread = true, request = AddNotifyNativeShopCartChangeListenerParam.class, scope = "medicine")
    public void msiAddNotifyNativeShopCartChangeListener(AddNotifyNativeShopCartChangeListenerParam addNotifyNativeShopCartChangeListenerParam, final MsiCustomContext msiCustomContext) {
        Object[] objArr = {addNotifyNativeShopCartChangeListenerParam, msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea453007e720b004ad505b40400ea005", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea453007e720b004ad505b40400ea005");
            return;
        }
        a(msiCustomContext, addNotifyNativeShopCartChangeListenerParam, new j<NotifyNativeShopCartChangeResponse>() { // from class: com.meituan.msi.api.extension.medicine.shopcart.IShopcart.5
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msi.api.j
            public final /* synthetic */ void a(NotifyNativeShopCartChangeResponse notifyNativeShopCartChangeResponse) {
                NotifyNativeShopCartChangeResponse notifyNativeShopCartChangeResponse2 = notifyNativeShopCartChangeResponse;
                Object[] objArr2 = {notifyNativeShopCartChangeResponse2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b656213f1ac57370c382af665d8d2502", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b656213f1ac57370c382af665d8d2502");
                } else {
                    msiCustomContext.dispatchEvent("medicine", "notifyNativeShopCartChange", notifyNativeShopCartChangeResponse2);
                }
            }
        });
        msiCustomContext.onSuccess("");
    }

    @MsiApiMethod(name = "getNativeShopCartData", onUiThread = true, request = GetNativeShopCartDataParam.class, response = GetNativeShopCartDataResponse.class, scope = "medicine")
    public void msiGetNativeShopCartData(GetNativeShopCartDataParam getNativeShopCartDataParam, final MsiCustomContext msiCustomContext) {
        Object[] objArr = {getNativeShopCartDataParam, msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d712970079542634a9f5c0ea04166059", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d712970079542634a9f5c0ea04166059");
        } else {
            a(msiCustomContext, getNativeShopCartDataParam, new i<GetNativeShopCartDataResponse>() { // from class: com.meituan.msi.api.extension.medicine.shopcart.IShopcart.6
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.api.i
                public final /* synthetic */ void a(GetNativeShopCartDataResponse getNativeShopCartDataResponse) {
                    GetNativeShopCartDataResponse getNativeShopCartDataResponse2 = getNativeShopCartDataResponse;
                    Object[] objArr2 = {getNativeShopCartDataResponse2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9b4a6e51bdc88c679a125ae77b5c3660", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9b4a6e51bdc88c679a125ae77b5c3660");
                    } else {
                        msiCustomContext.onSuccess(getNativeShopCartDataResponse2);
                    }
                }

                @Override // com.meituan.msi.api.i
                public final void a(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b72edb036da7b35a0ab519cba4468872", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b72edb036da7b35a0ab519cba4468872");
                    } else {
                        msiCustomContext.onError(i, str);
                    }
                }
            });
        }
    }

    @MsiApiMethod(name = "getShopCartData", onUiThread = true, request = GetShopCartDataParam.class, response = GetShopCartDataResponse.class, scope = "medicine")
    public void msiGetShopCartData(GetShopCartDataParam getShopCartDataParam, final MsiCustomContext msiCustomContext) {
        Object[] objArr = {getShopCartDataParam, msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26001bb4ec6b8edaa1da19c7f9505fae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26001bb4ec6b8edaa1da19c7f9505fae");
        } else {
            a(msiCustomContext, getShopCartDataParam, new i<GetShopCartDataResponse>() { // from class: com.meituan.msi.api.extension.medicine.shopcart.IShopcart.7
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.api.i
                public final /* synthetic */ void a(GetShopCartDataResponse getShopCartDataResponse) {
                    GetShopCartDataResponse getShopCartDataResponse2 = getShopCartDataResponse;
                    Object[] objArr2 = {getShopCartDataResponse2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a3495dd94ea1e81973049862313a5fef", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a3495dd94ea1e81973049862313a5fef");
                    } else {
                        msiCustomContext.onSuccess(getShopCartDataResponse2);
                    }
                }

                @Override // com.meituan.msi.api.i
                public final void a(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2e595e4d113368dbed9c1a5b6fdb5cab", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2e595e4d113368dbed9c1a5b6fdb5cab");
                    } else {
                        msiCustomContext.onError(i, str);
                    }
                }
            });
        }
    }

    @MsiApiMethod(name = "jumpToPoiChatPage", onUiThread = true, request = JumpToPoiChatPageParam.class, scope = "medicine")
    public void msiJumpToPoiChatPage(JumpToPoiChatPageParam jumpToPoiChatPageParam, final MsiCustomContext msiCustomContext) {
        Object[] objArr = {jumpToPoiChatPageParam, msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b33ba83705ca65a94735c90eadc5bd5f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b33ba83705ca65a94735c90eadc5bd5f");
        } else {
            a(msiCustomContext, jumpToPoiChatPageParam, new i<EmptyResponse>() { // from class: com.meituan.msi.api.extension.medicine.shopcart.IShopcart.8
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.api.i
                public final /* synthetic */ void a(EmptyResponse emptyResponse) {
                    EmptyResponse emptyResponse2 = emptyResponse;
                    Object[] objArr2 = {emptyResponse2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "34148b560e0cdd01dcbf78f27dacb1fb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "34148b560e0cdd01dcbf78f27dacb1fb");
                    } else {
                        msiCustomContext.onSuccess(emptyResponse2);
                    }
                }

                @Override // com.meituan.msi.api.i
                public final void a(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0ee84bbf8e0e19e9011d788553773143", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0ee84bbf8e0e19e9011d788553773143");
                    } else {
                        msiCustomContext.onError(i, str);
                    }
                }
            });
        }
    }
}
