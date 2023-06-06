package com.sankuai.waimai.globalcart.rn;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.ViewGroup;
import com.meituan.android.recce.props.gens.MinHeight;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.base.activity.transfer.BaseActivityDelegate;
import com.sankuai.waimai.foundation.core.base.activity.transfer.TransferActivity;
import com.sankuai.waimai.globalcart.rn.a;
import com.sankuai.waimai.platform.b;
import com.sankuai.waimai.platform.utils.f;
import com.sankuai.waimai.platform.widget.popup.a;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class CouponPopupContainer extends BaseActivityDelegate {
    public static ChangeQuickRedirect a;
    private a b;

    @Override // com.sankuai.waimai.foundation.core.base.activity.transfer.BaseActivityDelegate, com.sankuai.waimai.foundation.core.base.activity.transfer.lifecycle.a
    public final void b(TransferActivity transferActivity, @Nullable Bundle bundle) {
        Object[] objArr = {transferActivity, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58ac5f30f658d28d8f77069e1cb22fca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58ac5f30f658d28d8f77069e1cb22fca");
        } else {
            transferActivity.setTheme(2131558605);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.transfer.BaseActivityDelegate, com.sankuai.waimai.foundation.core.base.activity.transfer.lifecycle.a
    public final void a(final TransferActivity transferActivity, @Nullable Bundle bundle) {
        Object[] objArr = {transferActivity, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd01053f213386a16010be8de0f45a98", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd01053f213386a16010be8de0f45a98");
            return;
        }
        super.a(transferActivity, bundle);
        Intent intent = transferActivity.getIntent();
        a.C0953a c0953a = new a.C0953a();
        c0953a.b = f.a(intent, MinHeight.LOWER_CASE_NAME, (b.A().m() * 2) / 3);
        c0953a.a = f.a(intent, "maxHeight", (b.A().m() * 2) / 3);
        c0953a.c = f.a(intent, "topCorner", 0);
        c0953a.d = f.a(intent, "maskColor", -870177754);
        Bundle bundle2 = new Bundle();
        Uri parse = Uri.parse(f.a(intent, "mrnURLString"));
        if (parse != null && parse.getQueryParameterNames() != null) {
            c0953a.e = parse.getQueryParameter("mrn_biz");
            c0953a.g = parse.getQueryParameter("mrn_component");
            c0953a.f = parse.getQueryParameter("mrn_entry");
            for (String str : parse.getQueryParameterNames()) {
                bundle2.putString(str, parse.getQueryParameter(str));
            }
        }
        bundle2.putString("innerPageKey", f.a(intent, CouponPopupModule.EXTRA_EVENT_NAME));
        c0953a.h = bundle2;
        this.b = new a(this.h, c0953a);
        a aVar = this.b;
        TransferActivity transferActivity2 = this.h;
        Object[] objArr2 = {transferActivity2};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.platform.widget.popup.a.b;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "5fa8936421b9478db72bf42213ea9cbc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "5fa8936421b9478db72bf42213ea9cbc");
        } else if (!com.sankuai.waimai.foundation.utils.f.a(transferActivity2) && aVar.e != null) {
            ViewGroup viewGroup = (ViewGroup) transferActivity2.getWindow().getDecorView().findViewById(16908290);
            aVar.p.removeCallbacksAndMessages(null);
            aVar.m();
            Object[] objArr3 = {0};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.platform.widget.popup.a.b;
            if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "c55ecc2317cdf990a8568c7096dc7018", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "c55ecc2317cdf990a8568c7096dc7018");
            } else {
                if (aVar.q != null) {
                    aVar.q.setVisibility(0);
                }
                if (aVar.e != null) {
                    aVar.e.setVisibility(0);
                }
            }
            viewGroup.addView(aVar.e, new ViewGroup.LayoutParams(-1, -1));
            aVar.n();
        }
        this.b.d = new a.InterfaceC1097a() { // from class: com.sankuai.waimai.globalcart.rn.CouponPopupContainer.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.widget.popup.a.InterfaceC1097a
            public final void a() {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "84e2bfa214a2dbb3a028bbb6e2b3d195", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "84e2bfa214a2dbb3a028bbb6e2b3d195");
                } else if (com.sankuai.waimai.foundation.utils.f.a(CouponPopupContainer.this.h)) {
                } else {
                    if (CouponPopupContainer.this.h.getIntent() != null ? f.a(CouponPopupContainer.this.h.getIntent(), "didCancel", true) : true) {
                        Intent intent2 = new Intent();
                        try {
                            intent2.putExtra(CouponPopupModule.EXTRA_EVENT_NAME, f.a(transferActivity.getIntent(), CouponPopupModule.EXTRA_EVENT_NAME));
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("didCancel", true);
                            jSONObject.put("result", new JSONObject());
                            intent2.putExtra("resultData", jSONObject.toString());
                        } catch (Exception unused) {
                        }
                        CouponPopupContainer.this.h.setResult(-1, intent2);
                    }
                    CouponPopupContainer.this.h.d();
                    CouponPopupContainer.this.h.overridePendingTransition(0, 0);
                }
            }
        };
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.transfer.BaseActivityDelegate
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eaa7fa3688907f52c16df414ae48ae28", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eaa7fa3688907f52c16df414ae48ae28");
        } else {
            this.b.l();
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.transfer.BaseActivityDelegate
    public final void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d61ff50a361b0b1609f95d96199cdf9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d61ff50a361b0b1609f95d96199cdf9f");
        } else {
            this.b.l();
        }
    }
}
