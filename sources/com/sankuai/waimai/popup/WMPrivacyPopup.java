package com.sankuai.waimai.popup;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.homepage.privacyPolicy.WMPrivacyPolicyDialog;
import com.sankuai.waimai.platform.popup.WMBasePopup;
import com.sankuai.waimai.platform.popup.b;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class WMPrivacyPopup extends WMBasePopup {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.platform.popup.WMBasePopup
    public void preparePopupData(WMBasePopup.b bVar, b.InterfaceC1075b interfaceC1075b) {
        Object[] objArr = {bVar, interfaceC1075b};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e5741e0fd9cb467078cdc837a20eee6e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e5741e0fd9cb467078cdc837a20eee6e");
        } else {
            interfaceC1075b.a(true, bVar);
        }
    }

    @Override // com.sankuai.waimai.platform.popup.WMBasePopup
    public void prepareToShow(WMBasePopup.b bVar, b.InterfaceC1075b interfaceC1075b) {
        Object[] objArr = {bVar, interfaceC1075b};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "137f15c5357674fca56fc5f5e7f5e2f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "137f15c5357674fca56fc5f5e7f5e2f3");
        } else {
            interfaceC1075b.a(true, bVar);
        }
    }

    @Override // com.sankuai.waimai.platform.popup.WMBasePopup
    public boolean shouldHandle(WMBasePopup.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b68ee1040a0f2732b5c6327befd27836", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b68ee1040a0f2732b5c6327befd27836")).booleanValue();
        }
        Activity activity = getContext().a.get();
        if (activity == null) {
            return super.shouldHandle(bVar);
        }
        return e.a((Context) activity);
    }

    @Override // com.sankuai.waimai.platform.popup.WMBasePopup
    public void show(WMBasePopup.b bVar, final b.a aVar) {
        boolean z = false;
        Object[] objArr = {bVar, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "24ccd3260ba2c11b1499c78b56b97779", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "24ccd3260ba2c11b1499c78b56b97779");
            return;
        }
        Activity activity = getContext().a.get();
        if (activity == null) {
            return;
        }
        Object[] objArr2 = {activity};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.page.homepage.privacyPolicy.a.a;
        final com.sankuai.waimai.business.page.homepage.privacyPolicy.a aVar2 = PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "7b0b35ff08219e961587f51ec5c89729", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.business.page.homepage.privacyPolicy.a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "7b0b35ff08219e961587f51ec5c89729") : new com.sankuai.waimai.business.page.homepage.privacyPolicy.a(activity.getApplicationContext());
        FragmentManager supportFragmentManager = ((FragmentActivity) activity).getSupportFragmentManager();
        WMPrivacyPolicyDialog.a aVar3 = new WMPrivacyPolicyDialog.a() { // from class: com.sankuai.waimai.popup.WMPrivacyPopup.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.page.homepage.privacyPolicy.WMPrivacyPolicyDialog.a
            public final void a(DialogInterface dialogInterface) {
                Object[] objArr3 = {dialogInterface};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "9eb0c310b161c764b1ebce344765a1c0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "9eb0c310b161c764b1ebce344765a1c0");
                    return;
                }
                com.sankuai.waimai.business.page.home.e.h = true;
                aVar.a(false);
                com.sankuai.waimai.touchmatrix.views.b.a().a(dialogInterface);
            }

            @Override // com.sankuai.waimai.business.page.homepage.privacyPolicy.WMPrivacyPolicyDialog.a
            public final void b(DialogInterface dialogInterface) {
                Object[] objArr3 = {dialogInterface};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "a6787696eed0709fc36394042ad267e9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "a6787696eed0709fc36394042ad267e9");
                    return;
                }
                com.sankuai.waimai.touchmatrix.views.b.a().b(dialogInterface);
                cancel();
            }

            @Override // com.sankuai.waimai.business.page.homepage.privacyPolicy.WMPrivacyPolicyDialog.a
            public final void cancel() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "d6ceae7b65568919880f9feafb0be646", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "d6ceae7b65568919880f9feafb0be646");
                    return;
                }
                com.sankuai.waimai.business.page.home.e.h = false;
                aVar.a(true);
            }
        };
        Object[] objArr3 = {supportFragmentManager, (byte) 0, aVar3};
        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.business.page.homepage.privacyPolicy.a.a;
        if (PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect4, false, "33999bbf60d1683acb0d0ce3f0e7722c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect4, false, "33999bbf60d1683acb0d0ce3f0e7722c");
            return;
        }
        if (!aVar2.a() && aVar2.b.isLogin()) {
            z = true;
        }
        if (z) {
            if (aVar2.c == null) {
                aVar2.c = new WMPrivacyPolicyDialog();
            }
            aVar2.c.b = new DialogInterface.OnDismissListener() { // from class: com.sankuai.waimai.business.page.homepage.privacyPolicy.a.1
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    Object[] objArr4 = {dialogInterface};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect5, false, "d72f24949b7156fe97e1630e0d0157ed", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect5, false, "d72f24949b7156fe97e1630e0d0157ed");
                        return;
                    }
                    aVar2.b.logout();
                    dialogInterface.dismiss();
                }
            };
            aVar2.c.d = aVar3;
            if (aVar2.c.isAdded()) {
                return;
            }
            aVar2.c.show(supportFragmentManager, "policyDialog");
            return;
        }
        aVar3.cancel();
    }

    @Override // com.sankuai.waimai.platform.popup.WMBasePopup
    public boolean shouldSendToNext(WMBasePopup.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "96b44873e05ff9ab5b6fb3b7f8648475", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "96b44873e05ff9ab5b6fb3b7f8648475")).booleanValue();
        }
        com.sankuai.waimai.platform.popup.d a = com.sankuai.waimai.platform.popup.d.a();
        StringBuilder sb = new StringBuilder("privacy popup shouldSendToNext:");
        sb.append(!com.sankuai.waimai.business.page.home.e.h);
        a.b(sb.toString());
        return !com.sankuai.waimai.business.page.home.e.h;
    }
}
