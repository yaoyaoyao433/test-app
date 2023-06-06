package com.sankuai.waimai.bussiness.order.confirm.request.update;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.submit.SubmitOrderManager;
import com.sankuai.waimai.bussiness.order.base.utils.i;
import com.sankuai.waimai.bussiness.order.confirm.request.OrderResponse;
import com.sankuai.waimai.bussiness.order.confirm.request.b;
import com.sankuai.waimai.bussiness.order.confirm.request.update.a;
import com.sankuai.waimai.bussiness.order.confirm.submit.g;
import com.sankuai.waimai.foundation.core.service.user.a;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.platform.globalcart.biz.GlobalCartManager;
import com.sankuai.waimai.platform.mach.dialog.DynamicDialog;
import com.sankuai.waimai.platform.widget.dialog.CustomDialog;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e extends b {
    public static ChangeQuickRedirect n;

    public e(Activity activity, @NonNull b.C0904b c0904b, a.b bVar) {
        super(activity, c0904b, bVar);
        Object[] objArr = {activity, c0904b, bVar};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7254ffeea6770860141bbc550e4ab27c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7254ffeea6770860141bbc550e4ab27c");
        }
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.request.update.a.InterfaceC0906a
    public final boolean a(OrderResponse orderResponse) {
        boolean z;
        boolean z2;
        Object[] objArr = {orderResponse};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8adb9746c8c6e8703ae7ed65f4912f37", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8adb9746c8c6e8703ae7ed65f4912f37")).booleanValue();
        }
        if (c(orderResponse) || d(orderResponse) || g(orderResponse) || h(orderResponse) || i(orderResponse) || e(orderResponse) || j(orderResponse) || l(orderResponse) || k(orderResponse) || m(orderResponse)) {
            return true;
        }
        Object[] objArr2 = {orderResponse};
        ChangeQuickRedirect changeQuickRedirect2 = n;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "13caad61e91bcd50bdfc5dc259d1fae8", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "13caad61e91bcd50bdfc5dc259d1fae8")).booleanValue();
        } else if (orderResponse.e == 51 && orderResponse.r != null && orderResponse.r.isValid()) {
            g.a(this.b, orderResponse.r, null, this.d, this.e);
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        Object[] objArr3 = {orderResponse};
        ChangeQuickRedirect changeQuickRedirect3 = n;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ee9b9dd012b8f40e04532d552b8278e5", RobustBitConfig.DEFAULT_VALUE)) {
            z2 = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ee9b9dd012b8f40e04532d552b8278e5")).booleanValue();
        } else if (orderResponse.e != 66) {
            z2 = false;
        } else {
            if (!aa.a(orderResponse.m)) {
                com.sankuai.waimai.foundation.router.a.a(this.b, orderResponse.m);
            } else {
                a(orderResponse, !TextUtils.isEmpty(orderResponse.f) ? orderResponse.f : this.b.getString(R.string.wm_order_confirm_underage_restrictions_on_purchases));
            }
            z2 = true;
        }
        return z2;
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.request.update.b
    public final boolean c(OrderResponse orderResponse) {
        Object[] objArr = {orderResponse};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3684e1092f016a0ccbed470be0f206b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3684e1092f016a0ccbed470be0f206b")).booleanValue();
        }
        if (orderResponse.e != 3) {
            return false;
        }
        a(orderResponse, !TextUtils.isEmpty(orderResponse.f) ? orderResponse.f : this.b.getString(R.string.wm_order_confirm_lack_goods));
        return true;
    }

    private void a(final OrderResponse orderResponse, String str) {
        Object[] objArr = {orderResponse, str};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78ccf7ff1aa673393dbbe08736afdd9e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78ccf7ff1aa673393dbbe08736afdd9e");
            return;
        }
        JsonObject jsonObject = new JsonObject();
        try {
            Gson a = com.sankuai.waimai.mach.utils.b.a();
            jsonObject.add("missingfoods", a.toJsonTree(orderResponse.i));
            jsonObject.add("code", a.toJsonTree(Integer.valueOf(orderResponse.e)));
        } catch (Exception unused) {
        }
        if (jsonObject.has("missingfoods")) {
            com.sankuai.waimai.bussiness.order.confirm.request.dynamic.b.a(this.b).a("waimai_order_order_confirm_soldout_alert_style_1").a(jsonObject).a(new com.sankuai.waimai.bussiness.order.confirm.request.dynamic.a() { // from class: com.sankuai.waimai.bussiness.order.confirm.request.update.e.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.bussiness.order.confirm.request.dynamic.a
                public final void a(String str2, Map<String, Object> map, DynamicDialog dynamicDialog) {
                    Object[] objArr2 = {str2, map, dynamicDialog};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8f5011e127016759fa0a02cb4b211ac3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8f5011e127016759fa0a02cb4b211ac3");
                    } else if ("alert_confirm".equals(str2)) {
                        if (orderResponse.i != null) {
                            GlobalCartManager.getInstance().clearErrorFood(e.this.e, orderResponse.i, SubmitOrderManager.getInstance().getSourceType());
                        }
                        dynamicDialog.dismiss();
                        e.this.b.finish();
                    }
                }
            }).a();
        } else {
            a(this.b, orderResponse, str);
        }
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.request.update.b
    public final boolean d(OrderResponse orderResponse) {
        String string;
        Object[] objArr = {orderResponse};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c57030717ab5c496c506f7fc22b999d1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c57030717ab5c496c506f7fc22b999d1")).booleanValue();
        }
        if (orderResponse.e != 4) {
            return false;
        }
        if (!TextUtils.isEmpty(orderResponse.f)) {
            string = orderResponse.f;
        } else {
            string = this.b.getString(R.string.wm_order_base_poi_not_open);
        }
        new CustomDialog.a(this.b).c(R.string.wm_order_base_remind).b(string).a(R.style.WmOrderDialogWindow).a(R.string.wm_order_base_i_know, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.request.update.e.2
            public static ChangeQuickRedirect a;

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e213e9973e2669c37367136d1c2c7cf5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e213e9973e2669c37367136d1c2c7cf5");
                } else {
                    e.this.b.finish();
                }
            }
        }).b();
        return true;
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.request.update.b
    public final boolean e(OrderResponse orderResponse) {
        Object[] objArr = {orderResponse};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1468fe478057e62744dad284f6d57b25", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1468fe478057e62744dad284f6d57b25")).booleanValue();
        }
        if (orderResponse.e != 5) {
            return false;
        }
        new CustomDialog.a(this.b).b(orderResponse.f).a(R.style.WmOrderDialogWindow).a(R.string.known, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.request.update.e.3
            public static ChangeQuickRedirect a;

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "255c7c1bcdcc36bf4d7a49e670c6d31f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "255c7c1bcdcc36bf4d7a49e670c6d31f");
                } else {
                    e.this.b.finish();
                }
            }
        }).a(false).b();
        return true;
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.request.update.b
    public final boolean g(OrderResponse orderResponse) {
        Object[] objArr = {orderResponse};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "891c05bb5ddfb14c6747a88274e4262b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "891c05bb5ddfb14c6747a88274e4262b")).booleanValue();
        }
        if (orderResponse.e != 8) {
            return false;
        }
        this.l.a(orderResponse, orderResponse != null ? orderResponse.k : 0.0d);
        return true;
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.request.update.b
    public final boolean h(OrderResponse orderResponse) {
        Object[] objArr = {orderResponse};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "edcf7425f8954494013fd24ef61cfbd5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "edcf7425f8954494013fd24ef61cfbd5")).booleanValue();
        }
        if (orderResponse.e != 9) {
            return false;
        }
        new CustomDialog.a(this.b).b(orderResponse.f).a(R.style.WmOrderDialogWindow).a(R.string.wm_order_base_i_know, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.request.update.e.4
            public static ChangeQuickRedirect a;

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "279522f8a50fadb502fb457a35cfacb6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "279522f8a50fadb502fb457a35cfacb6");
                } else if (TextUtils.isEmpty(e.this.f)) {
                    dialogInterface.dismiss();
                } else {
                    if (e.this.d != -1 && e.this.j != null) {
                        SubmitOrderManager.getInstance().removeCartData(e.this.d, e.this.j);
                    }
                    SubmitOrderManager.getInstance().updateOrderStatus();
                    com.sankuai.waimai.platform.domain.manager.location.a.b(e.this.b);
                    i.a((Context) e.this.b, e.this.f, true, e.this.i, 0);
                }
            }
        }).a(false).b();
        return true;
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.request.update.b
    public final boolean i(OrderResponse orderResponse) {
        Object[] objArr = {orderResponse};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "244bb597668d34b3e158c7e0542558d4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "244bb597668d34b3e158c7e0542558d4")).booleanValue();
        }
        if (orderResponse.e != 10) {
            return false;
        }
        if (this.l != null) {
            this.l.b(true);
        }
        com.sankuai.waimai.platform.domain.manager.user.a.a((Context) this.b);
        return true;
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.request.update.b
    public final boolean j(OrderResponse orderResponse) {
        Object[] objArr = {orderResponse};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f37e42dac9c4afacf699f3dc29a6f5e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f37e42dac9c4afacf699f3dc29a6f5e")).booleanValue();
        }
        if (orderResponse.e != 14) {
            return false;
        }
        SubmitOrderManager.getInstance().showBindPhone(this.b, this.d, this.e, a.EnumC0947a.FROM_PRODUCT_LIST_PREORDER);
        return true;
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.request.update.b
    public final boolean m(OrderResponse orderResponse) {
        Object[] objArr = {orderResponse};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8bcea4ed92e92e4731fc7b5f5f2e4d2b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8bcea4ed92e92e4731fc7b5f5f2e4d2b")).booleanValue();
        }
        if (orderResponse.e == 44 && orderResponse.r != null && orderResponse.r.isValid()) {
            g.a(this.b, orderResponse.r, null, this.d, this.e);
            return true;
        }
        return false;
    }
}
