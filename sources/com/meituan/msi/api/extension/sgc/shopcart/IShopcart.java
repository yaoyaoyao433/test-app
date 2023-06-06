package com.meituan.msi.api.extension.sgc.shopcart;

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

    public abstract void a(MsiCustomContext msiCustomContext, AddShopcartChangeListenerParam addShopcartChangeListenerParam, j<OnShopcartStatusChangeResponse> jVar);

    public abstract void a(MsiCustomContext msiCustomContext, ShowShopcartParam showShopcartParam, i<EmptyResponse> iVar);

    public abstract void a(MsiCustomContext msiCustomContext, i<EmptyResponse> iVar);

    @MsiApiMethod(isCallback = true, name = "onShopcartStatusChange", response = OnShopcartStatusChangeResponse.class, scope = "sgc")
    public void onShopcartStatusChange(MsiCustomContext msiCustomContext) {
    }

    @MsiApiMethod(name = "openWMGlobalShopcart", scope = "sgc")
    public void msiOpenWMGlobalShopcart(final MsiCustomContext msiCustomContext) {
        Object[] objArr = {msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6357d393838364c914f8bd53ffbb979", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6357d393838364c914f8bd53ffbb979");
        } else {
            a(msiCustomContext, new i<EmptyResponse>() { // from class: com.meituan.msi.api.extension.sgc.shopcart.IShopcart.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.api.i
                public final /* synthetic */ void a(EmptyResponse emptyResponse) {
                    EmptyResponse emptyResponse2 = emptyResponse;
                    Object[] objArr2 = {emptyResponse2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bf6a69c24e1ce47bab7dc54e7d0f4882", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bf6a69c24e1ce47bab7dc54e7d0f4882");
                    } else {
                        msiCustomContext.onSuccess(emptyResponse2);
                    }
                }

                @Override // com.meituan.msi.api.i
                public final void a(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e5096f3fffd84aebcac72170803174c6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e5096f3fffd84aebcac72170803174c6");
                    } else {
                        msiCustomContext.onError(i, str);
                    }
                }
            });
        }
    }

    @MsiApiMethod(name = "addShopcartChangeListener", request = AddShopcartChangeListenerParam.class, scope = "sgc")
    public void msiAddShopcartChangeListener(AddShopcartChangeListenerParam addShopcartChangeListenerParam, final MsiCustomContext msiCustomContext) {
        Object[] objArr = {addShopcartChangeListenerParam, msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4df8cbc87b7c1180b5e1de5bc8176352", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4df8cbc87b7c1180b5e1de5bc8176352");
            return;
        }
        a(msiCustomContext, addShopcartChangeListenerParam, new j<OnShopcartStatusChangeResponse>() { // from class: com.meituan.msi.api.extension.sgc.shopcart.IShopcart.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msi.api.j
            public final /* synthetic */ void a(OnShopcartStatusChangeResponse onShopcartStatusChangeResponse) {
                OnShopcartStatusChangeResponse onShopcartStatusChangeResponse2 = onShopcartStatusChangeResponse;
                Object[] objArr2 = {onShopcartStatusChangeResponse2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "52dac04ad7382150ca6462598412494a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "52dac04ad7382150ca6462598412494a");
                } else {
                    msiCustomContext.dispatchEvent("sgc", "onShopcartStatusChange", onShopcartStatusChangeResponse2);
                }
            }
        });
        msiCustomContext.onSuccess("");
    }

    @MsiApiMethod(name = "showShopcart", request = ShowShopcartParam.class, scope = "sgc")
    public void msiShowShopcart(ShowShopcartParam showShopcartParam, final MsiCustomContext msiCustomContext) {
        Object[] objArr = {showShopcartParam, msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8246cda9bf2e9f096810c3f68693511b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8246cda9bf2e9f096810c3f68693511b");
        } else {
            a(msiCustomContext, showShopcartParam, new i<EmptyResponse>() { // from class: com.meituan.msi.api.extension.sgc.shopcart.IShopcart.3
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.api.i
                public final /* synthetic */ void a(EmptyResponse emptyResponse) {
                    EmptyResponse emptyResponse2 = emptyResponse;
                    Object[] objArr2 = {emptyResponse2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "62b477e2eae0d4ccde55c4360ed52da2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "62b477e2eae0d4ccde55c4360ed52da2");
                    } else {
                        msiCustomContext.onSuccess(emptyResponse2);
                    }
                }

                @Override // com.meituan.msi.api.i
                public final void a(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9db26305f5a6e743fb8f8cf364e1521f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9db26305f5a6e743fb8f8cf364e1521f");
                    } else {
                        msiCustomContext.onError(i, str);
                    }
                }
            });
        }
    }

    @MsiApiMethod(name = "goodsCountInShoppingCartWithPoiIds", request = GoodsCountInShoppingCartWithPoiIdsParam.class, response = GoodsCountInShoppingCartWithPoiIdsResponse.class, scope = "sgc")
    public void msiGoodsCountInShoppingCartWithPoiIds(GoodsCountInShoppingCartWithPoiIdsParam goodsCountInShoppingCartWithPoiIdsParam, final MsiCustomContext msiCustomContext) {
        Object[] objArr = {goodsCountInShoppingCartWithPoiIdsParam, msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51d229026cd020ff73482d8ac17d308d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51d229026cd020ff73482d8ac17d308d");
        } else {
            new i<GoodsCountInShoppingCartWithPoiIdsResponse>() { // from class: com.meituan.msi.api.extension.sgc.shopcart.IShopcart.4
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.api.i
                public final /* synthetic */ void a(GoodsCountInShoppingCartWithPoiIdsResponse goodsCountInShoppingCartWithPoiIdsResponse) {
                    GoodsCountInShoppingCartWithPoiIdsResponse goodsCountInShoppingCartWithPoiIdsResponse2 = goodsCountInShoppingCartWithPoiIdsResponse;
                    Object[] objArr2 = {goodsCountInShoppingCartWithPoiIdsResponse2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8eb49d37c5fb6490cd9ef229bc9263b2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8eb49d37c5fb6490cd9ef229bc9263b2");
                    } else {
                        msiCustomContext.onSuccess(goodsCountInShoppingCartWithPoiIdsResponse2);
                    }
                }

                @Override // com.meituan.msi.api.i
                public final void a(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c06d15110149f86b28a4bf48611a58b1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c06d15110149f86b28a4bf48611a58b1");
                    } else {
                        msiCustomContext.onError(i, str);
                    }
                }
            };
        }
    }
}
