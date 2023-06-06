package com.sankuai.waimai.bussiness.order.crossconfirm.request;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.service.user.a;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.platform.widget.dialog.CustomDialog;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements b<CrossOrderResponse> {
    public static ChangeQuickRedirect a;
    static int b;
    public com.sankuai.waimai.business.order.api.submit.listener.a c;
    public com.sankuai.waimai.bussiness.order.transfer.base.c d;
    Context e;
    public int f;
    public a.EnumC0947a g;
    public String h;
    protected Dialog i;
    public String j;

    public a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83f05bd00e003a90861165b5ed6337f7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83f05bd00e003a90861165b5ed6337f7");
        } else {
            this.e = context;
        }
    }

    public final boolean a(CrossOrderResponse crossOrderResponse) {
        Object[] objArr = {crossOrderResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c9e16e4cada506056ce55325dd883a2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c9e16e4cada506056ce55325dd883a2")).booleanValue();
        }
        if (crossOrderResponse == null) {
            ae.a(this.e, (int) R.string.wm_order_refresh_success_error);
            return true;
        }
        try {
            new com.sankuai.waimai.platform.capacity.network.errorhanding.d().a(crossOrderResponse.a, crossOrderResponse.b);
            return false;
        } catch (com.sankuai.waimai.platform.capacity.network.errorhanding.e e) {
            com.sankuai.waimai.platform.capacity.network.errorhanding.f.a((Exception) e, (Activity) this.e);
            return true;
        }
    }

    @Override // com.sankuai.waimai.bussiness.order.crossconfirm.request.b
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6569a0677d7ad2670f404565e129be6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6569a0677d7ad2670f404565e129be6");
            return;
        }
        this.i = com.sankuai.waimai.platform.widget.dialog.a.a(this.e);
        com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((CrossOrderService) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) CrossOrderService.class)).crossOrderPreview(str), new b.AbstractC1042b<CrossOrderResponse>() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.request.a.1
            public static ChangeQuickRedirect a;

            /* JADX WARN: Removed duplicated region for block: B:115:0x0292  */
            /* JADX WARN: Removed duplicated region for block: B:124:0x02c8  */
            /* JADX WARN: Removed duplicated region for block: B:127:0x02d6  */
            /* JADX WARN: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
            @Override // rx.e
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final /* synthetic */ void onNext(java.lang.Object r20) {
                /*
                    Method dump skipped, instructions count: 748
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.bussiness.order.crossconfirm.request.a.AnonymousClass1.onNext(java.lang.Object):void");
            }

            @Override // rx.e
            public final void onError(Throwable th) {
                Object[] objArr2 = {th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c637eca111daed31923a7b8a63a74c92", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c637eca111daed31923a7b8a63a74c92");
                } else if (com.sankuai.waimai.foundation.utils.f.a(a.this.e)) {
                } else {
                    a.this.a();
                    a aVar = a.this;
                    Object[] objArr3 = {th};
                    ChangeQuickRedirect changeQuickRedirect3 = a.a;
                    if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "427eae0bfd4dbdca9a400952b18285c3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "427eae0bfd4dbdca9a400952b18285c3");
                    } else {
                        com.sankuai.waimai.platform.capacity.network.errorhanding.b.a(aVar.e, (Throwable) null);
                    }
                }
            }
        }, this.j);
    }

    void a(CharSequence charSequence) {
        Object[] objArr = {charSequence};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd61df380eba4abfccf6bd92b365b617", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd61df380eba4abfccf6bd92b365b617");
        } else {
            new CustomDialog.a(this.e).c(R.string.wm_order_base_remind).b(charSequence).a(R.string.wm_order_base_i_know, (DialogInterface.OnClickListener) null).b();
        }
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9941ddd0d520356e0318ca13e4bed910", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9941ddd0d520356e0318ca13e4bed910")).booleanValue();
        }
        com.sankuai.waimai.platform.widget.dialog.a.b(this.i);
        this.i = null;
        return true;
    }
}
