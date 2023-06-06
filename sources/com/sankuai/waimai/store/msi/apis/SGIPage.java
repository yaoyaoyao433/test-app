package com.sankuai.waimai.store.msi.apis;

import android.app.Activity;
import com.meituan.android.mrn.engine.u;
import com.meituan.msi.api.extension.sgc.page.IPage;
import com.meituan.msi.api.extension.sgc.page.SgPageCreateParam;
import com.meituan.msi.api.extension.sgc.page.SgPageDestroyParam;
import com.meituan.msi.api.i;
import com.meituan.msi.bean.EmptyResponse;
import com.meituan.msi.bean.MsiCustomContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.k;
import com.sankuai.waimai.store.msi.SGMSCContextManager;
import com.sankuai.waimai.store.msi.view.b;
import com.sankuai.waimai.store.newwidgets.pullrefresh.DefaultHeaderService;
import com.sankuai.waimai.store.util.ae;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGIPage extends IPage {
    public static ChangeQuickRedirect b;

    @Override // com.meituan.msi.api.extension.sgc.page.IPage
    public final void a(final MsiCustomContext msiCustomContext, final SgPageCreateParam sgPageCreateParam, final i<EmptyResponse> iVar) {
        Object[] objArr = {msiCustomContext, sgPageCreateParam, iVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c54a48e70fc713140f014d24b8eaad9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c54a48e70fc713140f014d24b8eaad9");
        } else if (a.a(msiCustomContext)) {
            iVar.a(1000, "sgPageCreate msiCustomContext.getActivity() is dead or null");
        } else {
            b.a(msiCustomContext.getActivity(), new Runnable() { // from class: com.sankuai.waimai.store.msi.apis.SGIPage.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    SGMSCContextManager.a aVar;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fa5e06c8506335a7aa778c66095a5e6b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fa5e06c8506335a7aa778c66095a5e6b");
                        return;
                    }
                    try {
                        SGMSCContextManager a2 = SGMSCContextManager.a();
                        MsiCustomContext msiCustomContext2 = msiCustomContext;
                        String str = sgPageCreateParam.pageType;
                        SgPageCreateParam sgPageCreateParam2 = sgPageCreateParam;
                        Object[] objArr3 = {msiCustomContext2, str, sgPageCreateParam2};
                        ChangeQuickRedirect changeQuickRedirect3 = SGMSCContextManager.a;
                        if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "3afeb8e36a9f18bd57b96138926ec0a2", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "3afeb8e36a9f18bd57b96138926ec0a2");
                        } else {
                            Activity activity = msiCustomContext2.getActivity();
                            if (!com.sankuai.waimai.store.util.b.a(activity) && (aVar = SGMSCContextManager.b.get(Integer.valueOf(activity.hashCode()))) == null) {
                                Object[] objArr4 = {msiCustomContext2.getActivity()};
                                ChangeQuickRedirect changeQuickRedirect4 = SGMSCContextManager.a;
                                if (PatchProxy.isSupport(objArr4, a2, changeQuickRedirect4, false, "cb4ca0737c25e904846d713193a86ce1", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, a2, changeQuickRedirect4, false, "cb4ca0737c25e904846d713193a86ce1");
                                }
                                if (!com.sankuai.waimai.globalcart.biz.a.b && com.sankuai.waimai.store.manager.user.a.a().b()) {
                                    com.sankuai.waimai.globalcart.biz.a.a().b();
                                } else {
                                    com.sankuai.waimai.store.shopping.cart.data.a.a(msiCustomContext2.getActivity(), false);
                                }
                                k.a(msiCustomContext2.getActivity(), true);
                                if (DefaultHeaderService.KEY_STORE.equals(str)) {
                                    try {
                                        u.a(msiCustomContext2.getActivity().getApplicationContext(), "rn_supermarket_flashbuy-shopcart-page", null, null);
                                    } catch (Exception unused) {
                                        ae.a("msc_report_preload_shopcart", "pageType=" + str);
                                    }
                                    aVar = new com.sankuai.waimai.store.msi.a(msiCustomContext2, sgPageCreateParam2);
                                    aVar.a();
                                }
                                if (aVar != null) {
                                    SGMSCContextManager.b.put(Integer.valueOf(activity.hashCode()), aVar);
                                }
                            }
                        }
                        iVar.a(EmptyResponse.INSTANCE);
                    } catch (Exception e) {
                        i iVar2 = iVar;
                        iVar2.a(1000, "sgPageCreate " + e.getMessage());
                    }
                }
            });
        }
    }

    @Override // com.meituan.msi.api.extension.sgc.page.IPage
    public final void a(final MsiCustomContext msiCustomContext, final SgPageDestroyParam sgPageDestroyParam, final i<EmptyResponse> iVar) {
        Object[] objArr = {msiCustomContext, sgPageDestroyParam, iVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18a8211ff38a50e6988eae01ea8d1ae9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18a8211ff38a50e6988eae01ea8d1ae9");
        } else if (a.a(msiCustomContext)) {
            iVar.a(1000, "sgPageDestroy msiCustomContext.getActivity() is dead or null");
        } else {
            b.a(msiCustomContext.getActivity(), new Runnable() { // from class: com.sankuai.waimai.store.msi.apis.SGIPage.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a25719d0b990a0c93e2a1f9fa320b2bf", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a25719d0b990a0c93e2a1f9fa320b2bf");
                        return;
                    }
                    try {
                        SGMSCContextManager a2 = SGMSCContextManager.a();
                        MsiCustomContext msiCustomContext2 = msiCustomContext;
                        Object[] objArr3 = {msiCustomContext2, sgPageDestroyParam};
                        ChangeQuickRedirect changeQuickRedirect3 = SGMSCContextManager.a;
                        if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "6243b7ded07e5e5ceb31deb29a6bce46", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "6243b7ded07e5e5ceb31deb29a6bce46");
                        } else {
                            com.sankuai.waimai.store.shopping.cart.data.a.a(msiCustomContext2.getActivity());
                        }
                        iVar.a(EmptyResponse.INSTANCE);
                    } catch (Exception e) {
                        i iVar2 = iVar;
                        iVar2.a(1000, "sgPageDestroy " + e.getMessage());
                    }
                }
            });
        }
    }
}
