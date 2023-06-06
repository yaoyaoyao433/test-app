package com.sankuai.waimai.bussiness.order.confirm.pgablock.quickpayment.rock;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.inputmethod.InputMethodManager;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.meituan.android.paycommon.lib.VersionInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.bussiness.order.confirm.helper.f;
import com.sankuai.waimai.bussiness.order.confirm.model.PaymentTemplate;
import com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.mach.dialog.DynamicDialog;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    f f;
    public a g;
    private long h;
    private String i;
    private Context j;
    private String k;
    private com.sankuai.waimai.bussiness.order.confirm.request.dynamic.b l;
    private boolean m;

    public b(Context context, f fVar, a aVar) {
        Object[] objArr = {context, fVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f07c48f0c1cde3ba9953bb0ef50656e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f07c48f0c1cde3ba9953bb0ef50656e");
            return;
        }
        this.c = false;
        this.d = false;
        this.e = false;
        this.j = context;
        this.g = aVar;
        this.f = fVar;
        this.l = com.sankuai.waimai.bussiness.order.confirm.request.dynamic.b.a((Activity) context);
    }

    public final void a(com.sankuai.waimai.bussiness.order.confirm.pgablock.quickpayment.a aVar, long j, String str) {
        boolean z;
        PaymentTemplate paymentTemplate;
        Object[] objArr = {aVar, new Long(j), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6c9e45ca3b6a3c311a35d94aa17942a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6c9e45ca3b6a3c311a35d94aa17942a");
            return;
        }
        PaymentTemplate paymentTemplate2 = aVar.d;
        if (paymentTemplate2 == null) {
            d.a("order_pay_type", 2);
            d.b(false, false, "payment_type", 2);
            d.b(false, true, "pay_sdk_version", VersionInfo.getVersion());
            return;
        }
        Object[] objArr2 = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8378f2121b665789875e6143378445f4", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8378f2121b665789875e6143378445f4")).booleanValue();
        } else {
            z = (aVar == null || (paymentTemplate = aVar.d) == null || paymentTemplate.morePaymentTypeVoList == null || paymentTemplate.morePaymentTypeVoList.size() <= 0) ? false : true;
        }
        this.m = z;
        this.h = j;
        this.i = str;
        this.b = com.sankuai.waimai.platform.capacity.persistent.sp.a.b(this.j, "wm_order_quick_pay_type", 0);
        d.a("pay_serial_code", paymentTemplate2.paySerailCode);
        d.a("pre_cashier_info", paymentTemplate2.preCashierInfo);
        a(this.b);
        if (paymentTemplate2 == null || paymentTemplate2.morePaymentTypeVoList == null || paymentTemplate2.morePaymentTypeVoList.size() <= 0) {
            return;
        }
        PaymentTemplate.a aVar2 = null;
        Iterator<PaymentTemplate.a> it = paymentTemplate2.morePaymentTypeVoList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            PaymentTemplate.a next = it.next();
            if (next.d == 1) {
                aVar2 = next;
                break;
            }
        }
        if (aVar2 == null) {
            aVar2 = paymentTemplate2.morePaymentTypeVoList.get(0);
        }
        this.b = aVar2.a;
        a(this.b);
    }

    public final void a(@NonNull String str, @Nullable Map<String, Object> map) {
        int i;
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8952da2ad00362d80e87843a93e5421", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8952da2ad00362d80e87843a93e5421");
        } else if ("choose_payment_type_event".equals(str)) {
            Activity activity = (Activity) this.j;
            Object[] objArr2 = {activity};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9b0c7092fa09a86b09e7f24b1db81a68", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9b0c7092fa09a86b09e7f24b1db81a68");
            } else {
                InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
                if (inputMethodManager != null) {
                    inputMethodManager.hideSoftInputFromWindow(activity.getWindow().getDecorView().getWindowToken(), 0);
                }
            }
            try {
                PaymentTemplate paymentTemplate = (PaymentTemplate) com.sankuai.waimai.bussiness.order.base.utils.b.a().fromJson(String.valueOf(map.get("payment_template")), (Class<Object>) PaymentTemplate.class);
                this.k = String.valueOf(map.get("payment_template"));
                if (paymentTemplate != null) {
                    List<PaymentTemplate.a> list = paymentTemplate.morePaymentTypeVoList;
                    JudasManualManager.MPTBuilder a2 = JudasManualManager.a("c_waimai_sfp20kxu", 0, Dialog.class);
                    Object[] objArr3 = {list};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "de209e9578c083a87ed37db955eadce6", RobustBitConfig.DEFAULT_VALUE)) {
                        i = ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "de209e9578c083a87ed37db955eadce6")).intValue();
                    } else {
                        if (!com.sankuai.waimai.foundation.utils.d.a(list)) {
                            for (PaymentTemplate.a aVar : list) {
                                if (aVar.d == 1) {
                                    i = aVar.a;
                                    break;
                                }
                            }
                        }
                        i = 0;
                    }
                    Object[] objArr4 = {"default_type", Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect4 = JudasManualManager.MPTBuilder.a;
                    if (PatchProxy.isSupport(objArr4, a2, changeQuickRedirect4, false, "205bea53e2a44603a4875099e327c691", RobustBitConfig.DEFAULT_VALUE)) {
                        a2 = (JudasManualManager.MPTBuilder) PatchProxy.accessDispatch(objArr4, a2, changeQuickRedirect4, false, "205bea53e2a44603a4875099e327c691");
                    } else {
                        a2.a().put("default_type", String.valueOf(i));
                    }
                    a2.b();
                    Object[] objArr5 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "d8f81aa9b63dd1be97158f675a17add1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "d8f81aa9b63dd1be97158f675a17add1");
                        return;
                    }
                    JsonObject asJsonObject = new JsonParser().parse(this.k).getAsJsonObject();
                    asJsonObject.add("poi_id", new JsonParser().parse(new Gson().toJson(Long.valueOf(this.h))));
                    asJsonObject.add(FoodDetailNetWorkPreLoader.URI_POI_STR, new JsonParser().parse(this.i));
                    this.l.a("waimai_order_order_confirm_pay_dialog_style_1").a(asJsonObject).b("c_waimai_sfp20kxu").a(new com.sankuai.waimai.bussiness.order.confirm.request.dynamic.a((Activity) this.j) { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.quickpayment.rock.b.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.bussiness.order.confirm.request.dynamic.a
                        public final void a(String str2, Map<String, Object> map2, DynamicDialog dynamicDialog) {
                            Object[] objArr6 = {str2, map2, dynamicDialog};
                            ChangeQuickRedirect changeQuickRedirect6 = a;
                            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "ee196998037f6686caeb49d19126e602", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "ee196998037f6686caeb49d19126e602");
                            } else if ("wm_order_pay_update_event".equals(str2)) {
                                b.this.b = r.a(String.valueOf(map2.get("pay_type")), 0);
                                b.this.a(b.this.b);
                                b bVar = b.this;
                                Object[] objArr7 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect7 = b.a;
                                if (PatchProxy.isSupport(objArr7, bVar, changeQuickRedirect7, false, "ffbfddb4c173db6923a3de30e4a47aa7", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr7, bVar, changeQuickRedirect7, false, "ffbfddb4c173db6923a3de30e4a47aa7");
                                } else {
                                    bVar.f.a(2);
                                }
                            }
                        }
                    }).a();
                }
            } catch (Exception unused) {
            }
        }
    }

    public void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e39c637ebfbf6316f98dcadbf1bbc23", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e39c637ebfbf6316f98dcadbf1bbc23");
            return;
        }
        if (this.m) {
            d.b(false, false, "payment_type", Integer.valueOf(i));
            d.a("order_pay_type", Integer.valueOf(i));
        } else {
            d.b(false, false, "payment_type", 2);
            d.a("order_pay_type", 2);
        }
        d.d("pay_type", Integer.valueOf(i));
        d.b(false, true, "pay_sdk_version", VersionInfo.getVersion());
    }
}
