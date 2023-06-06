package com.sankuai.waimai.bussiness.order.confirm.request.update;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.dialog.RooAlertDialog;
import com.sankuai.waimai.business.order.submit.SubmitOrderManager;
import com.sankuai.waimai.bussiness.order.base.utils.i;
import com.sankuai.waimai.bussiness.order.confirm.request.OrderResponse;
import com.sankuai.waimai.bussiness.order.confirm.request.b;
import com.sankuai.waimai.bussiness.order.confirm.request.update.a;
import com.sankuai.waimai.bussiness.order.confirm.submit.g;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.platform.globalcart.biz.GlobalCartManager;
import com.sankuai.waimai.platform.widget.dialog.CustomDialog;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends b {
    public static ChangeQuickRedirect n;

    public c(Activity activity, @NonNull b.C0904b c0904b, a.b bVar) {
        super(activity, c0904b, bVar);
        Object[] objArr = {activity, c0904b, bVar};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb04424172cbba73e2102ad9632e4342", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb04424172cbba73e2102ad9632e4342");
        }
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.request.update.a.InterfaceC0906a
    public final boolean a(OrderResponse orderResponse) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        Object[] objArr = {orderResponse};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "450dac58f432d270b1d8edba202a59c7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "450dac58f432d270b1d8edba202a59c7")).booleanValue();
        }
        if (b(orderResponse) || c(orderResponse) || d(orderResponse) || f(orderResponse) || g(orderResponse) || h(orderResponse) || i(orderResponse) || e(orderResponse) || j(orderResponse) || l(orderResponse) || k(orderResponse)) {
            return true;
        }
        Object[] objArr2 = {orderResponse};
        ChangeQuickRedirect changeQuickRedirect2 = n;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "05570f7cc760c65c80603645a97039cd", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "05570f7cc760c65c80603645a97039cd")).booleanValue();
        } else if (orderResponse.e != 54) {
            z = false;
        } else {
            String str = orderResponse.f;
            if (TextUtils.isEmpty(str)) {
                str = this.b.getString(R.string.wm_order_base_pre_sale_54);
            }
            new CustomDialog.a(this.b).b(str).a(R.style.WmOrderDialogWindow).a(R.string.wm_order_base_i_know, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.request.update.c.2
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Object[] objArr3 = {dialogInterface, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "aa5ad48ec83a82965d3c1831e567b199", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "aa5ad48ec83a82965d3c1831e567b199");
                        return;
                    }
                    dialogInterface.dismiss();
                    c.this.b.finish();
                    com.sankuai.waimai.platform.domain.manager.poi.a.a().a(c.this.e);
                }
            }).b();
            z = true;
        }
        if (z) {
            return true;
        }
        Object[] objArr3 = {orderResponse};
        ChangeQuickRedirect changeQuickRedirect3 = n;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "27857c2a6bc61593b99c079008e649d4", RobustBitConfig.DEFAULT_VALUE)) {
            z2 = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "27857c2a6bc61593b99c079008e649d4")).booleanValue();
        } else if (orderResponse.e != 56) {
            z2 = false;
        } else {
            String str2 = orderResponse.f;
            if (TextUtils.isEmpty(str2)) {
                str2 = this.b.getString(R.string.wm_order_base_pre_sale_56);
            }
            new CustomDialog.a(this.b).b(str2).a(R.style.WmOrderDialogWindow).a(R.string.wm_order_base_i_know, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.request.update.c.3
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Object[] objArr4 = {dialogInterface, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "22a652a4e3441442b34879dfa1538704", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "22a652a4e3441442b34879dfa1538704");
                        return;
                    }
                    dialogInterface.dismiss();
                    com.sankuai.waimai.platform.domain.manager.poi.a.a().a(c.this.e);
                    c.this.b.finish();
                }
            }).b();
            z2 = true;
        }
        if (z2) {
            return true;
        }
        Object[] objArr4 = {orderResponse};
        ChangeQuickRedirect changeQuickRedirect4 = n;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "2c342ff5d38f9a2f111754868d6a7c03", RobustBitConfig.DEFAULT_VALUE)) {
            z3 = ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "2c342ff5d38f9a2f111754868d6a7c03")).booleanValue();
        } else if (orderResponse.e != 55) {
            z3 = false;
        } else {
            String str3 = orderResponse.f;
            if (TextUtils.isEmpty(str3)) {
                str3 = this.b.getString(R.string.wm_order_base_pre_sale_55);
            }
            new CustomDialog.a(this.b).b(str3).a(R.style.WmOrderDialogWindow).a(R.string.wm_order_base_i_know, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.request.update.c.4
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Object[] objArr5 = {dialogInterface, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "9fa6d1b27f8d75141625ef0c3609bdc9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "9fa6d1b27f8d75141625ef0c3609bdc9");
                    } else {
                        dialogInterface.dismiss();
                    }
                }
            }).b();
            z3 = true;
        }
        if (z3) {
            return true;
        }
        Object[] objArr5 = {orderResponse};
        ChangeQuickRedirect changeQuickRedirect5 = n;
        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "e41264c6273de8ad5aa78abf78e322fc", RobustBitConfig.DEFAULT_VALUE)) {
            z4 = ((Boolean) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "e41264c6273de8ad5aa78abf78e322fc")).booleanValue();
        } else if (orderResponse.e != 57) {
            z4 = false;
        } else {
            String str4 = orderResponse.f;
            if (TextUtils.isEmpty(str4)) {
                str4 = this.b.getString(R.string.wm_order_base_pre_sale_57);
            }
            new CustomDialog.a(this.b).b(str4).a(R.style.WmOrderDialogWindow).a(R.string.wm_order_base_i_know, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.request.update.c.5
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Object[] objArr6 = {dialogInterface, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "185e2583f6d9ef69ca3eb03a94513beb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "185e2583f6d9ef69ca3eb03a94513beb");
                    } else {
                        dialogInterface.dismiss();
                    }
                }
            }).b();
            z4 = true;
        }
        if (z4 || m(orderResponse)) {
            return true;
        }
        Object[] objArr6 = {orderResponse};
        ChangeQuickRedirect changeQuickRedirect6 = n;
        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "afcaa0caeca636d1203c4ab8f3f55b4b", RobustBitConfig.DEFAULT_VALUE)) {
            z5 = ((Boolean) PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "afcaa0caeca636d1203c4ab8f3f55b4b")).booleanValue();
        } else if (orderResponse.e == 51 && orderResponse.r != null && orderResponse.r.isValid()) {
            g.a(this.b, orderResponse.r, (com.sankuai.waimai.bussiness.order.confirm.submit.b) null, this.d, this.e, orderResponse.e, this.m ? "from_multi_order" : "");
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            return true;
        }
        Object[] objArr7 = {orderResponse};
        ChangeQuickRedirect changeQuickRedirect7 = n;
        if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "e14644264d83cb5e4519764c1b5fe104", RobustBitConfig.DEFAULT_VALUE)) {
            z6 = ((Boolean) PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "e14644264d83cb5e4519764c1b5fe104")).booleanValue();
        } else if (orderResponse.e != 66) {
            z6 = false;
        } else {
            if (!aa.a(orderResponse.m)) {
                com.sankuai.waimai.foundation.router.a.a(this.b, orderResponse.m);
            } else {
                com.sankuai.waimai.business.order.submit.b.a(this.b, this.d, this.e, orderResponse.i, orderResponse.f, orderResponse.e, this.b.getString(R.string.wm_order_confirm_underage_restrictions_on_purchases), this.g, this.h, this.m);
            }
            z6 = true;
        }
        if (z6 || n(orderResponse)) {
            return true;
        }
        Object[] objArr8 = {orderResponse};
        ChangeQuickRedirect changeQuickRedirect8 = n;
        if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "c34f3c6c78e03481473ae77cf16b8d93", RobustBitConfig.DEFAULT_VALUE)) {
            z7 = ((Boolean) PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "c34f3c6c78e03481473ae77cf16b8d93")).booleanValue();
        } else {
            if ((orderResponse.e == 60 || orderResponse.e == 61 || orderResponse.e == 62 || orderResponse.e == 63) && this.l != null) {
                this.l.a(orderResponse.e);
            }
            z7 = false;
        }
        if (z7) {
            return true;
        }
        Object[] objArr9 = {orderResponse};
        ChangeQuickRedirect changeQuickRedirect9 = n;
        if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "21c4d82a59ea2bc88376f6a837873637", RobustBitConfig.DEFAULT_VALUE)) {
            z8 = ((Boolean) PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "21c4d82a59ea2bc88376f6a837873637")).booleanValue();
        } else if (orderResponse.e == 70 && orderResponse.r != null && orderResponse.r.isValid()) {
            g.a(this.b, orderResponse.r, (com.sankuai.waimai.bussiness.order.confirm.submit.b) null, this.d, this.e, orderResponse.e, this.m ? "from_multi_order" : "");
            z8 = true;
        } else {
            z8 = false;
        }
        return z8;
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.request.update.b
    public final boolean c(OrderResponse orderResponse) {
        Object[] objArr = {orderResponse};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f40902a4fe51b09952f12e8d750f4d7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f40902a4fe51b09952f12e8d750f4d7")).booleanValue();
        }
        if (orderResponse.e != 3) {
            return false;
        }
        com.sankuai.waimai.business.order.submit.b.a(this.b, this.d, this.e, orderResponse.i, orderResponse.f, orderResponse.e, this.b.getString(R.string.wm_order_confirm_lack_of_goods), this.g, this.h, this.m);
        return true;
    }

    private boolean n(OrderResponse orderResponse) {
        Object[] objArr = {orderResponse};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "680ae4258960d20cb710bebaa983069d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "680ae4258960d20cb710bebaa983069d")).booleanValue();
        }
        if (orderResponse.e != 71) {
            return false;
        }
        try {
            if (orderResponse.q != null) {
                com.sankuai.waimai.business.order.submit.b.a(this.b, orderResponse.q, orderResponse.o, orderResponse.p, this.e);
            }
        } catch (Exception unused) {
        }
        return true;
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.request.update.b
    public final boolean d(OrderResponse orderResponse) {
        Object[] objArr = {orderResponse};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66d9e6f7a7e32277873d674578d99a26", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66d9e6f7a7e32277873d674578d99a26")).booleanValue();
        }
        if (orderResponse.e != 4) {
            return false;
        }
        a(this.b, orderResponse, this.b.getString(R.string.wm_order_base_poi_not_open));
        this.b.finish();
        return true;
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.request.update.b
    public final boolean g(OrderResponse orderResponse) {
        Object[] objArr = {orderResponse};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e43e2d67891fa79195fbf75faa511ef", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e43e2d67891fa79195fbf75faa511ef")).booleanValue();
        }
        if (orderResponse.e != 8) {
            return false;
        }
        com.sankuai.waimai.platform.domain.manager.poi.a.a().a(this.e);
        super.g(orderResponse);
        return true;
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.request.update.b
    public final boolean h(OrderResponse orderResponse) {
        Object[] objArr = {orderResponse};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16e51ab1d973547be07fdf0f975cee4a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16e51ab1d973547be07fdf0f975cee4a")).booleanValue();
        }
        if (orderResponse.e != 9) {
            return false;
        }
        new RooAlertDialog.a(new ContextThemeWrapper(this.b, 2131558627)).b(orderResponse.f).a(R.string.wm_order_base_i_know, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.request.update.c.1
            public static ChangeQuickRedirect a;

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6e2871712993d80c204cf169bf1b334d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6e2871712993d80c204cf169bf1b334d");
                } else if (TextUtils.isEmpty(c.this.f)) {
                    dialogInterface.dismiss();
                } else {
                    com.sankuai.waimai.platform.domain.manager.location.a.b(c.this.b);
                    i.a((Context) c.this.b, c.this.f, true, c.this.i, 0);
                    GlobalCartManager.getInstance().clearOrder(c.this.e, SubmitOrderManager.getInstance().getSourceType());
                    SubmitOrderManager.getInstance().clearOrder();
                }
            }
        }).a(false).b();
        return true;
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.request.update.b
    public final boolean m(OrderResponse orderResponse) {
        Object[] objArr = {orderResponse};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8345d982acda4dd538b2cddfaa78985e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8345d982acda4dd538b2cddfaa78985e")).booleanValue();
        }
        if (orderResponse.e == 44 && orderResponse.r != null && orderResponse.r.isValid()) {
            g.a(this.b, orderResponse.r, (com.sankuai.waimai.bussiness.order.confirm.submit.b) null, this.d, this.e, orderResponse.e, this.m ? "from_multi_order" : "");
            return true;
        }
        return false;
    }
}
