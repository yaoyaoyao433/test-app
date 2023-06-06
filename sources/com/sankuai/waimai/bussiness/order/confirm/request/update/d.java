package com.sankuai.waimai.bussiness.order.confirm.request.update;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.content.LocalBroadcastManager;
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
import com.sankuai.waimai.platform.globalcart.biz.GlobalCartManager;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d extends b {
    public static ChangeQuickRedirect n;

    public d(Activity activity, @NonNull b.C0904b c0904b, a.b bVar) {
        super(activity, c0904b, bVar);
        Object[] objArr = {activity, c0904b, bVar};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01cfd4496f3d691d9bf9f71ca300f99f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01cfd4496f3d691d9bf9f71ca300f99f");
        }
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.request.update.a.InterfaceC0906a
    public final boolean a(OrderResponse orderResponse) {
        String string;
        boolean z;
        String string2;
        boolean z2;
        String string3;
        boolean z3;
        boolean z4;
        Object[] objArr = {orderResponse};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87b1149291c380c73ddeb0a547e98d9d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87b1149291c380c73ddeb0a547e98d9d")).booleanValue();
        }
        if (b(orderResponse) || c(orderResponse) || d(orderResponse) || f(orderResponse) || g(orderResponse) || h(orderResponse) || i(orderResponse) || e(orderResponse) || j(orderResponse) || l(orderResponse) || k(orderResponse)) {
            return true;
        }
        Object[] objArr2 = {orderResponse};
        ChangeQuickRedirect changeQuickRedirect2 = n;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4a027a674889e9a45083c518535b5386", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4a027a674889e9a45083c518535b5386")).booleanValue();
        } else if (orderResponse.e != 36) {
            z = false;
        } else {
            if (!TextUtils.isEmpty(orderResponse.f)) {
                string = orderResponse.f;
            } else {
                string = this.b.getString(R.string.wm_order_base_new_customer_sale);
            }
            new RooAlertDialog.a(new ContextThemeWrapper(this.b, 2131558962)).a(R.string.wm_order_base_remind).b(string).a(R.string.wm_order_base_i_know, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.request.update.d.5
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Object[] objArr3 = {dialogInterface, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "105f682efe84593a2f09051bbf60c935", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "105f682efe84593a2f09051bbf60c935");
                    } else if (d.this.b != null) {
                        d.this.b.finish();
                        LocalBroadcastManager.getInstance(d.this.b).sendBroadcast(new Intent("com.sankuai.waimai.business.order.api.action.NEW_CUSTOM_REFRESH_WEB_PAGE"));
                    }
                }
            }).b();
            z = true;
        }
        if (z) {
            return true;
        }
        Object[] objArr3 = {orderResponse};
        ChangeQuickRedirect changeQuickRedirect3 = n;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "630591a88e1bebb102f8d91019d1afb0", RobustBitConfig.DEFAULT_VALUE)) {
            z2 = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "630591a88e1bebb102f8d91019d1afb0")).booleanValue();
        } else if (orderResponse.e != 50) {
            z2 = false;
        } else {
            if (!TextUtils.isEmpty(orderResponse.f)) {
                string2 = orderResponse.f;
            } else {
                string2 = this.b.getString(R.string.wm_order_base_common_sale);
            }
            new RooAlertDialog.a(new ContextThemeWrapper(this.b, 2131558962)).a(R.string.wm_order_base_remind).b(string2).a(R.string.wm_order_base_i_know, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.request.update.d.6
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Object[] objArr4 = {dialogInterface, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "e99bf657241868989365cfb7d4a91091", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "e99bf657241868989365cfb7d4a91091");
                    } else if (d.this.b != null) {
                        d.this.b.finish();
                        LocalBroadcastManager.getInstance(d.this.b).sendBroadcast(new Intent("com.sankuai.waimai.business.order.api.action.NEW_CUSTOM_REFRESH_WEB_PAGE"));
                    }
                }
            }).b();
            z2 = true;
        }
        if (!z2) {
            Object[] objArr4 = {orderResponse};
            ChangeQuickRedirect changeQuickRedirect4 = n;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "9609aefc808baab3f58178dbbf39b35e", RobustBitConfig.DEFAULT_VALUE)) {
                z3 = ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "9609aefc808baab3f58178dbbf39b35e")).booleanValue();
            } else if (orderResponse.e != 37) {
                z3 = false;
            } else {
                if (!TextUtils.isEmpty(orderResponse.f)) {
                    string3 = orderResponse.f;
                } else {
                    string3 = this.b.getString(R.string.wm_order_base_new_customer_not);
                }
                new RooAlertDialog.a(new ContextThemeWrapper(this.b, 2131558962)).a(R.string.wm_order_base_remind).b(string3).a(R.string.wm_order_base_i_know, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.request.update.d.7
                    public static ChangeQuickRedirect a;

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        Object[] objArr5 = {dialogInterface, Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "233248d825b219cff6fca2aad7c98d9f", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "233248d825b219cff6fca2aad7c98d9f");
                        } else {
                            com.sankuai.waimai.foundation.router.a.a(d.this.b, com.sankuai.waimai.foundation.router.interfaces.c.B);
                        }
                    }
                }).b();
                z3 = true;
            }
            if (!z3 && !m(orderResponse)) {
                Object[] objArr5 = {orderResponse};
                ChangeQuickRedirect changeQuickRedirect5 = n;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "fd2ad8c7c9129695592f4d404c4cadee", RobustBitConfig.DEFAULT_VALUE)) {
                    z4 = ((Boolean) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "fd2ad8c7c9129695592f4d404c4cadee")).booleanValue();
                } else if (orderResponse.e == 51 && orderResponse.r != null && orderResponse.r.isValid()) {
                    g.a(this.b, orderResponse.r, (com.sankuai.waimai.bussiness.order.confirm.submit.b) null, this.d, this.e, orderResponse.e);
                    z4 = true;
                } else {
                    z4 = false;
                }
                return z4;
            }
        }
        return true;
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.request.update.b
    public final boolean c(OrderResponse orderResponse) {
        Object[] objArr = {orderResponse};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33e54ff588a9c9afe8b0c7e5abd7c09e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33e54ff588a9c9afe8b0c7e5abd7c09e")).booleanValue();
        }
        if (orderResponse.e != 3) {
            return false;
        }
        new RooAlertDialog.a(new ContextThemeWrapper(this.b, 2131558962)).a(R.string.wm_order_base_remind).b(orderResponse.f).a(R.string.wm_order_base_i_know, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.request.update.d.1
            public static ChangeQuickRedirect a;

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d0eec6c10b7c562edac8541fe0719df7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d0eec6c10b7c562edac8541fe0719df7");
                    return;
                }
                d.this.b.finish();
                LocalBroadcastManager.getInstance(d.this.b).sendBroadcast(new Intent("com.sankuai.waimai.business.order.api.action.NEW_CUSTOM_REFRESH_WEB_PAGE"));
            }
        }).b();
        return true;
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.request.update.b
    public final boolean d(OrderResponse orderResponse) {
        Object[] objArr = {orderResponse};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b631c80564292163e7b7f7cacb346fc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b631c80564292163e7b7f7cacb346fc")).booleanValue();
        }
        if (orderResponse.e != 4) {
            return false;
        }
        new RooAlertDialog.a(new ContextThemeWrapper(this.b, 2131558962)).a(R.string.wm_order_base_remind).b(orderResponse.f).a(R.string.wm_order_base_i_know, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.request.update.d.2
            public static ChangeQuickRedirect a;

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "84361b1be6b7b7fa7e25d065dddc7d49", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "84361b1be6b7b7fa7e25d065dddc7d49");
                    return;
                }
                d.this.b.finish();
                LocalBroadcastManager.getInstance(d.this.b).sendBroadcast(new Intent("com.sankuai.waimai.business.order.api.action.NEW_CUSTOM_REFRESH_WEB_PAGE"));
            }
        }).b();
        return true;
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.request.update.b
    public final boolean g(OrderResponse orderResponse) {
        Object[] objArr = {orderResponse};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44286d166f5f8a55ca19666f4f52fe23", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44286d166f5f8a55ca19666f4f52fe23")).booleanValue();
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c15a1f59707e367311e6ee6a23058531", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c15a1f59707e367311e6ee6a23058531")).booleanValue();
        }
        if (orderResponse.e != 9) {
            return false;
        }
        new RooAlertDialog.a(new ContextThemeWrapper(this.b, 2131558962)).b(orderResponse.f).a(R.string.wm_order_base_i_know, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.request.update.d.3
            public static ChangeQuickRedirect a;

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3472e43c981ff17e8c81e308397d84d0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3472e43c981ff17e8c81e308397d84d0");
                } else if (TextUtils.isEmpty(d.this.f)) {
                    dialogInterface.dismiss();
                } else {
                    com.sankuai.waimai.platform.domain.manager.location.a.b(d.this.b);
                    i.a((Context) d.this.b, d.this.f, true, d.this.i, 0);
                    GlobalCartManager.getInstance().clearOrder(d.this.e, SubmitOrderManager.getInstance().getSourceType());
                    SubmitOrderManager.getInstance().clearOrder();
                }
            }
        }).a(false).b();
        return true;
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.request.update.b
    public final boolean k(OrderResponse orderResponse) {
        Object[] objArr = {orderResponse};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9726d10f1043fad8d5020cc348c76df8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9726d10f1043fad8d5020cc348c76df8")).booleanValue();
        }
        if (orderResponse.e != 17) {
            return false;
        }
        new RooAlertDialog.a(new ContextThemeWrapper(this.b, 2131558962)).a(R.string.wm_order_base_remind).b(orderResponse.f).a(R.string.wm_order_base_i_know, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.request.update.d.4
            public static ChangeQuickRedirect a;

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "85a6b7b28ea234866e5b627b075e25dc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "85a6b7b28ea234866e5b627b075e25dc");
                    return;
                }
                d.this.b.finish();
                LocalBroadcastManager.getInstance(d.this.b).sendBroadcast(new Intent("com.sankuai.waimai.business.order.api.action.NEW_CUSTOM_REFRESH_WEB_PAGE"));
            }
        }).b();
        return true;
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.request.update.b
    public final boolean m(OrderResponse orderResponse) {
        Object[] objArr = {orderResponse};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e540ddacb6a12e3aa58737c6b2e7351", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e540ddacb6a12e3aa58737c6b2e7351")).booleanValue();
        }
        if (orderResponse.e == 44 && orderResponse.r != null && orderResponse.r.isValid()) {
            g.a(this.b, orderResponse.r, (com.sankuai.waimai.bussiness.order.confirm.submit.b) null, this.d, this.e, orderResponse.e);
            return true;
        }
        return false;
    }
}
