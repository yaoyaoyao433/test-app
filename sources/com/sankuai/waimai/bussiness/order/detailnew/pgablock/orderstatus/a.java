package com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.view.View;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.android.common.aidata.entity.DataConstants;
import com.meituan.android.common.mrn.analytics.library.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.bottomsheet.RooBottomSheetDialog;
import com.meituan.roodesign.widgets.button.RooButton;
import com.sankuai.waimai.business.order.api.again.AgainManager;
import com.sankuai.waimai.business.order.api.detail.model.RiderInfo;
import com.sankuai.waimai.business.order.api.model.ButtonItem;
import com.sankuai.waimai.business.order.api.model.OrderDeliveryPlanInfo;
import com.sankuai.waimai.business.order.api.store.IOrderBusinessService;
import com.sankuai.waimai.bussiness.order.base.utils.i;
import com.sankuai.waimai.bussiness.order.detailnew.controller.c;
import com.sankuai.waimai.bussiness.order.detailnew.controller.e;
import com.sankuai.waimai.bussiness.order.detailnew.controller.f;
import com.sankuai.waimai.bussiness.order.detailnew.network.response.l;
import com.sankuai.waimai.bussiness.order.detailnew.network.response.o;
import com.sankuai.waimai.bussiness.order.detailnew.network.response.q;
import com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.operation.a;
import com.sankuai.waimai.bussiness.order.detailnew.util.h;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.foundation.core.service.user.a;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.mach.dialog.DynamicDialog;
import com.sankuai.waimai.platform.widget.dial.presenter.DialContract;
import com.tencent.liteav.TXLiteAVCode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements a.InterfaceC0921a {
    public static ChangeQuickRedirect a = null;
    private static final String o = "waimai_order_order_status_im_aftersale_info_style_1";
    private static final String p = "supermarket_order_status_im_aftersale_info_sg_style_1";
    public Context b;
    public com.sankuai.waimai.bussiness.order.detailnew.controller.d c;
    public com.sankuai.waimai.bussiness.order.detailnew.controller.c d;
    public e e;
    public RooBottomSheetDialog f;
    public com.sankuai.waimai.bussiness.order.detailnew.controller.b g;
    public com.sankuai.waimai.bussiness.order.detailnew.pgablock.feedback.a h;
    com.sankuai.waimai.business.order.api.detail.block.a i;
    public h.a j;
    public OrderStatusButtonListInfo k;
    DynamicDialog l;
    DynamicDialog m;
    public int n;
    private f q;
    private List<ButtonItem> r;

    public a(Context context, com.sankuai.waimai.business.order.api.detail.block.a aVar) {
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46b61094a004c50c16db07e3537bf43e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46b61094a004c50c16db07e3537bf43e");
            return;
        }
        this.n = -1;
        this.b = context;
        this.i = aVar;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c224a67fcc4d4ca4760cc17378a8007d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c224a67fcc4d4ca4760cc17378a8007d");
            return;
        }
        this.c = new com.sankuai.waimai.bussiness.order.detailnew.controller.d((Activity) this.b, a());
        this.d = new com.sankuai.waimai.bussiness.order.detailnew.controller.c((Activity) this.b, a(), new c.a() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.c.a
            public final void a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "31b661a8cbc86542e9042e60e1c9ddbc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "31b661a8cbc86542e9042e60e1c9ddbc");
                } else {
                    a.this.i.b(false);
                }
            }

            @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.c.a
            public final void a(ButtonItem buttonItem) {
                Object[] objArr3 = {buttonItem};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "be26c88b1b595b25372af56d181be33e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "be26c88b1b595b25372af56d181be33e");
                } else {
                    a.this.a(buttonItem);
                }
            }
        });
        this.e = new e((Activity) this.b, a(), new e.a() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.a.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.e.a
            public final void a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1f0b1c86263a135eb92e652657be178a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1f0b1c86263a135eb92e652657be178a");
                } else {
                    a.this.i.b(false);
                }
            }
        });
        this.q = new f((Activity) this.b, a(), new f.a() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.a.4
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.f.a
            public final void a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "998f794069938e619c6940dad464cf9e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "998f794069938e619c6940dad464cf9e");
                } else {
                    a.this.i.b(false);
                }
            }
        });
        this.g = new com.sankuai.waimai.bussiness.order.detailnew.controller.b(this.b);
        this.g.c = "c_hgowsqb";
        this.g.b = new a.b() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.a.5
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.operation.a.b
            public final void a(ButtonItem buttonItem) {
                Object[] objArr3 = {buttonItem};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d84a3838955c2d297122e6566401e5f2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d84a3838955c2d297122e6566401e5f2");
                } else {
                    a.this.a(buttonItem);
                }
            }
        };
    }

    public final void a(OrderStatusButtonListInfo orderStatusButtonListInfo) {
        Object[] objArr = {orderStatusButtonListInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a7c44e92ca124ba8abb8cce52034047", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a7c44e92ca124ba8abb8cce52034047");
        } else if (orderStatusButtonListInfo == null) {
        } else {
            this.k = orderStatusButtonListInfo;
            if (orderStatusButtonListInfo.buttonList != null && !orderStatusButtonListInfo.buttonList.isEmpty()) {
                this.r = orderStatusButtonListInfo.buttonList;
            } else {
                this.k.buttonList = this.r;
            }
            Object[] objArr2 = {orderStatusButtonListInfo};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f0c3f1111b223b7bbdfbb8da36df80c4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f0c3f1111b223b7bbdfbb8da36df80c4");
                return;
            }
            e eVar = this.e;
            l lVar = orderStatusButtonListInfo.orderRemindInfo;
            com.sankuai.waimai.bussiness.order.detailnew.pgablock.root.b bVar = orderStatusButtonListInfo.logicInfo;
            Object[] objArr3 = {lVar, bVar};
            ChangeQuickRedirect changeQuickRedirect3 = e.a;
            if (PatchProxy.isSupport(objArr3, eVar, changeQuickRedirect3, false, "a440ddd664b8915dc8cf36b0fc297fba", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, eVar, changeQuickRedirect3, false, "a440ddd664b8915dc8cf36b0fc297fba");
                return;
            }
            eVar.d = lVar;
            eVar.e = bVar;
            eVar.b.removeCallbacks(eVar.g);
            if (eVar.a()) {
                eVar.b.post(eVar.g);
            } else {
                eVar.b();
            }
        }
    }

    public final void a(OrderStatusButtonListInfo orderStatusButtonListInfo, com.sankuai.waimai.bussiness.order.detailnew.pgablock.feedback.a aVar, h.a aVar2) {
        Object[] objArr = {orderStatusButtonListInfo, aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7cd53fe43bc12d7f9dbb0ec1d1b65a86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7cd53fe43bc12d7f9dbb0ec1d1b65a86");
            return;
        }
        this.h = aVar;
        this.j = aVar2;
        a(orderStatusButtonListInfo);
    }

    String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb0045e765327a4c01a44f932bb74f83", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb0045e765327a4c01a44f932bb74f83");
        }
        if (this.b instanceof BaseActivity) {
            return ((BaseActivity) this.b).w();
        }
        return getClass().getSimpleName() + System.currentTimeMillis();
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.operation.a.InterfaceC0921a
    public final void a(int i, boolean z) {
        Object[] objArr = {2048, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2da46251018d18de156181313e88114", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2da46251018d18de156181313e88114");
            return;
        }
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put("code", 2048);
        arrayMap.put(RemoteMessageConst.Notification.VISIBILITY, Boolean.valueOf(z));
        com.sankuai.waimai.bussiness.order.detailnew.pgablock.machcontainer.f.a().a("notification_button_visibility_event", arrayMap);
    }

    private boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08cde01f568a7559f8a97e4045133628", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08cde01f568a7559f8a97e4045133628")).booleanValue() : this.k != null && this.k.logicInfo.d();
    }

    private boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f7b28aaaa7622c83e48142d61253d45", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f7b28aaaa7622c83e48142d61253d45")).booleanValue() : this.k != null && this.k.logicInfo.e();
    }

    private void a(String str) {
        q qVar;
        q qVar2;
        int i = 0;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "511fec0771ad36898601929d4ebe12ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "511fec0771ad36898601929d4ebe12ec");
            return;
        }
        String str2 = "";
        if (!aa.a(this.k.trackingInfo) && (qVar2 = (q) com.sankuai.waimai.bussiness.order.detailnew.util.d.a().fromJson(this.k.trackingInfo, (Class<Object>) q.class)) != null && !aa.a(qVar2.c)) {
            str2 = qVar2.c;
        }
        String str3 = str2;
        if (this.k == null || this.k.logicInfo.l == null) {
            return;
        }
        JudasManualManager.a a2 = JudasManualManager.a(str).a("poi_id", i.a(this.k.logicInfo.c, this.k.logicInfo.d)).a("order_id", this.k.logicInfo.b).a("order_status", this.k.logicInfo.l.e).a("status_code", this.k.logicInfo.l.x).a("type", this.k.logicInfo.l.z).a("money", this.k.logicInfo.l.B);
        if (TextUtils.equals(str, "b_mlxAz")) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dbda218cd3b29b5d426f40ab6521b5ab", RobustBitConfig.DEFAULT_VALUE)) {
                i = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dbda218cd3b29b5d426f40ab6521b5ab")).intValue();
            } else if (!aa.a(this.k.trackingInfo) && (qVar = (q) com.sankuai.waimai.bussiness.order.detailnew.util.d.a().fromJson(this.k.trackingInfo, (Class<Object>) q.class)) != null) {
                i = qVar.b;
            }
            a2.a("food_safety", i);
        }
        if ("b_mlxAz".equals(str) || "b_yV6As".equals(str)) {
            a2.a("weather_type", this.k.logicInfo.l.d).a("rider_delivery_code", this.k.logicInfo.l.E).a("poi_prepare_code", this.k.logicInfo.l.F).a("support_care", str3);
        }
        a2.a("c_hgowsqb");
        a2.a(this.b).a();
    }

    private void a(String str, int i) {
        int i2;
        int i3 = 0;
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c73890ed45b48753c89d80f522a6d5c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c73890ed45b48753c89d80f522a6d5c");
            return;
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("new_message_badge", Integer.valueOf(i));
        hashMap.put("custom", hashMap2);
        if (this.k == null || this.k.logicInfo.l == null) {
            i2 = 0;
        } else {
            i3 = this.k.logicInfo.l.e;
            i2 = this.k.logicInfo.l.z;
        }
        JudasManualManager.a(str).a("order_id", this.k.logicInfo.b).a("poi_id", i.a(this.k.logicInfo.c, this.k.logicInfo.d)).a("order_status", i3).a("type", i2).a((Map<String, Object>) hashMap).a("c_hgowsqb").a(this.b).a();
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37956f44bbc461871c7e8fa290b786cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37956f44bbc461871c7e8fa290b786cd");
            return;
        }
        if (this.f != null && this.f.isShowing()) {
            this.f.dismiss();
        }
        final RooBottomSheetDialog rooBottomSheetDialog = new RooBottomSheetDialog(this.b);
        rooBottomSheetDialog.setContentView(R.layout.wm_order_detail_refund_appeal_tel_dialog);
        rooBottomSheetDialog.setTitle(R.string.wm_order_detail_refund_appeal_phone_dialog_title);
        View findViewById = rooBottomSheetDialog.findViewById(R.id.customer_service_container);
        if (findViewById != null) {
            findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.a.6
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9ba20d5026547c787261eb057c9b36ed", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9ba20d5026547c787261eb057c9b36ed");
                        return;
                    }
                    i.c(a.this.b, a.this.b.getString(R.string.wm_order_detail_customer_service_phone_number));
                    rooBottomSheetDialog.dismiss();
                }
            });
        }
        RooButton rooButton = (RooButton) rooBottomSheetDialog.findViewById(R.id.button_cancel);
        if (rooButton != null) {
            rooButton.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.a.7
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e0709628dcd62af8e9b2d7736308ee28", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e0709628dcd62af8e9b2d7736308ee28");
                    } else if (rooBottomSheetDialog.isShowing()) {
                        rooBottomSheetDialog.dismiss();
                    }
                }
            });
        }
        rooBottomSheetDialog.show();
        this.f = rooBottomSheetDialog;
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47db897fe277040546855c5a988a43a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47db897fe277040546855c5a988a43a9");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("fragment_id", 0);
        com.sankuai.waimai.foundation.router.a.a(this.b, com.sankuai.waimai.foundation.router.interfaces.c.B, bundle);
    }

    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78a4c2c955f0803e1302421456a4c7c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78a4c2c955f0803e1302421456a4c7c5");
        } else if (this.k == null || TextUtils.isEmpty(this.k.logicInfo.b)) {
            com.sankuai.waimai.platform.capacity.log.i.d(new com.sankuai.waimai.bussiness.order.base.log.a().a("order_status_btn_click").b("click_order_again").c("order_id_empty").b());
        } else {
            long j = 0;
            try {
                j = r.a(this.k.logicInfo.b, 0L);
            } catch (NumberFormatException e) {
                com.sankuai.waimai.foundation.utils.log.a.a(e);
                com.sankuai.waimai.platform.capacity.log.i.d(new com.sankuai.waimai.bussiness.order.base.log.a().a("order_status_btn_click").b("click_order_again").c("order_id_invalid").b());
            }
            com.sankuai.waimai.foundation.core.service.user.a.a = a.EnumC0947a.FROM_ORDER_DETAIL_PREORDER;
            AgainManager.getInstance().orderAgain(new AgainManager.b().a(this.b).a(String.valueOf(j)).b("0").a(this.k.logicInfo.c).c(this.k.logicInfo.d).d(this.k.logicInfo.e != null ? this.k.logicInfo.e : "").b);
        }
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6886ca4b1d99990fd7ebf30da371ab7d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6886ca4b1d99990fd7ebf30da371ab7d");
        } else if (this.k == null || this.k.logicInfo == null) {
        } else {
            if (this.k.logicInfo.j == null) {
                com.sankuai.waimai.platform.capacity.log.i.d(new com.sankuai.waimai.bussiness.order.base.log.a().a("order_status_btn_click").b("click_contact_poi_im").c("poi_empty").b());
            }
            Activity activity = (Activity) this.b;
            if (activity == null || activity.isFinishing()) {
                return;
            }
            com.sankuai.waimai.bussiness.order.detailnew.im.a.a(activity, 3, r.a(this.k.logicInfo.b, 0L), this.k.logicInfo.c, this.k.logicInfo.d, 0L, 10, a(), false, this.k.orderIMInfo, this.k.logicInfo);
        }
    }

    private void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a035e3a0f7f2543812105ac2cf4a2fe9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a035e3a0f7f2543812105ac2cf4a2fe9");
        } else if (this.k == null || this.k.logicInfo.k == null || this.k.logicInfo.k.i == null) {
            com.sankuai.waimai.platform.capacity.log.i.d(new com.sankuai.waimai.bussiness.order.base.log.a().a("order_status_btn_click").b("click_contact_rider_im").c("rider_contact_way_empty").b());
        } else {
            RiderInfo.b bVar = null;
            Iterator<RiderInfo.b> it = this.k.logicInfo.k.i.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                RiderInfo.b next = it.next();
                if (next.a == i.c) {
                    bVar = next;
                    break;
                }
            }
            Activity activity = (Activity) this.b;
            if (activity == null || activity.isFinishing() || bVar == null) {
                return;
            }
            com.sankuai.waimai.bussiness.order.detailnew.im.a.a(activity, r.a(this.k.logicInfo.b, 0L), bVar, a());
        }
    }

    private JsonObject b(ButtonItem buttonItem) {
        Object[] objArr = {buttonItem};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db3455df8f63b721fc970e633c988af4", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db3455df8f63b721fc970e633c988af4");
        }
        JsonObject jsonObject = this.k.logicInfo.y;
        try {
            Gson a2 = com.sankuai.waimai.bussiness.order.detailnew.util.d.a();
            if (buttonItem != null) {
                jsonObject.add("sub_label_list", a2.toJsonTree(buttonItem.mSubLabelList));
            }
        } catch (Exception unused) {
        }
        return jsonObject;
    }

    private void c(ButtonItem buttonItem) {
        boolean z = true;
        Object[] objArr = {buttonItem};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e188c32533d57d75f31464335769abd7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e188c32533d57d75f31464335769abd7");
        } else if (this.l == null || !this.l.isShowing()) {
            JsonObject b = b(buttonItem);
            b.add("pop_up_info", com.sankuai.waimai.bussiness.order.detailnew.util.d.a().toJsonTree(buttonItem.mPopUpInfo));
            b.addProperty("code", Integer.valueOf(buttonItem.code));
            b.addProperty("action", Integer.valueOf(buttonItem.action));
            com.sankuai.waimai.bussiness.order.confirm.request.dynamic.b a2 = com.sankuai.waimai.bussiness.order.confirm.request.dynamic.b.a((Activity) this.b);
            Object[] objArr2 = {buttonItem};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "94807bc5d767ef8cb4d51b7dc803922a", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "94807bc5d767ef8cb4d51b7dc803922a")).booleanValue();
            } else if (buttonItem.action != 1 && buttonItem.action != 2 && buttonItem.code != 3140) {
                z = false;
            }
            this.l = a2.a(z ? p : o).a(b).a(new com.sankuai.waimai.bussiness.order.confirm.request.dynamic.a((Activity) this.b) { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.a.9
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.bussiness.order.confirm.request.dynamic.a
                public final void a(String str, Map<String, Object> map, DynamicDialog dynamicDialog) {
                    char c;
                    Object[] objArr3 = {str, map, dynamicDialog};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "cd354fa994ab2025d7309b99af61eabe", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "cd354fa994ab2025d7309b99af61eabe");
                    } else if (map == null) {
                    } else {
                        String valueOf = String.valueOf(map.get(Constants.EventConstants.KEY_ORDER_ID));
                        boolean parseBoolean = Boolean.parseBoolean(String.valueOf(map.get("use_privacy")));
                        boolean e = a.this.k.logicInfo != null ? a.this.k.logicInfo.e() : false;
                        String valueOf2 = String.valueOf(map.get("user_phone"));
                        int hashCode = str.hashCode();
                        if (hashCode == -1122162742) {
                            if (str.equals("modify_address_event")) {
                                c = 2;
                            }
                            c = 65535;
                        } else if (hashCode != -530971608) {
                            if (hashCode == 1520273584 && str.equals("jump_im_event")) {
                                c = 0;
                            }
                            c = 65535;
                        } else {
                            if (str.equals("call_phone_event")) {
                                c = 1;
                            }
                            c = 65535;
                        }
                        switch (c) {
                            case 0:
                                dynamicDialog.dismiss();
                                int parseInt = Integer.parseInt(String.valueOf(map.get("type")));
                                if (parseInt == 1) {
                                    com.sankuai.waimai.bussiness.order.detailnew.im.a.a((Activity) a.this.b, r.a(a.this.k.logicInfo.b, 0L), a.this.k.logicInfo.k.i.get(0), a.this.a());
                                    return;
                                } else if (parseInt == 0) {
                                    com.sankuai.waimai.bussiness.order.detailnew.im.a.a((Activity) a.this.b, 3, r.a(a.this.k.logicInfo.b, 0L), a.this.k.logicInfo.c, a.this.k.logicInfo.d, 0L, 10, a.this.a(), false, a.this.k.orderIMInfo, a.this.k.logicInfo);
                                    return;
                                } else {
                                    return;
                                }
                            case 1:
                                dynamicDialog.dismiss();
                                int parseInt2 = Integer.parseInt(String.valueOf(map.get("type")));
                                if (parseInt2 == 0) {
                                    if (parseBoolean) {
                                        i.a(a.this.b, valueOf, valueOf2, 1, a.this.k.logicInfo != null ? a.this.k.logicInfo.w : null);
                                        return;
                                    } else {
                                        i.b((Activity) a.this.b, a.this.k.logicInfo != null ? a.this.k.logicInfo.u : null);
                                        return;
                                    }
                                } else if (parseInt2 != 1) {
                                    if (parseInt2 == 3) {
                                        String valueOf3 = map.containsKey("delivery_carrier_phone") ? String.valueOf(map.get("delivery_carrier_phone")) : "";
                                        if (TextUtils.isEmpty(valueOf3)) {
                                            return;
                                        }
                                        i.b(a.this.b, valueOf3);
                                        return;
                                    }
                                    return;
                                } else {
                                    String[] strArr = a.this.k.logicInfo != null ? a.this.k.logicInfo.x : null;
                                    String[] strArr2 = a.this.k.logicInfo != null ? a.this.k.logicInfo.v : null;
                                    if (e) {
                                        i.a(a.this.b, valueOf, valueOf2, 0, new DialContract.a() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.a.9.1
                                            public static ChangeQuickRedirect a;

                                            @Override // com.sankuai.waimai.platform.widget.dial.presenter.DialContract.a
                                            public final void a(String str2) {
                                                Object[] objArr4 = {str2};
                                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "b837d5e3ade4bad623234a9458eab5b8", RobustBitConfig.DEFAULT_VALUE)) {
                                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "b837d5e3ade4bad623234a9458eab5b8");
                                                } else {
                                                    i.b((Activity) a.this.b, new String[]{str2});
                                                }
                                            }
                                        }, strArr);
                                        return;
                                    } else if (parseBoolean) {
                                        i.a(a.this.b, valueOf, valueOf2, 0, strArr);
                                        return;
                                    } else {
                                        i.b((Activity) a.this.b, strArr2);
                                        return;
                                    }
                                }
                            case 2:
                                if (a.this.j != null) {
                                    a.this.j.q();
                                    return;
                                }
                                return;
                            default:
                                return;
                        }
                    }
                }
            }).a(new DialogInterface.OnDismissListener() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.a.8
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    Object[] objArr3 = {dialogInterface};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ef247956e7b3d35ddf8c82c1c8ddaf5f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ef247956e7b3d35ddf8c82c1c8ddaf5f");
                    } else {
                        a.this.l = null;
                    }
                }
            }).a();
        }
    }

    private void d(ButtonItem buttonItem) {
        Object[] objArr = {buttonItem};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce0512d2c809218dba820b89199a241f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce0512d2c809218dba820b89199a241f");
        } else if (this.m == null || !this.m.isShowing()) {
            this.m = com.sankuai.waimai.bussiness.order.confirm.request.dynamic.b.a((Activity) this.b).a("waimai_order_order_status_delivery_carrier_style_1").a(b(buttonItem)).a(new com.sankuai.waimai.bussiness.order.confirm.request.dynamic.a((Activity) this.b) { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.a.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.bussiness.order.confirm.request.dynamic.a
                public final void a(String str, Map<String, Object> map, DynamicDialog dynamicDialog) {
                    char c = 0;
                    Object[] objArr2 = {str, map, dynamicDialog};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "16a0c774fa1a39b7c4698f15a8d9197c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "16a0c774fa1a39b7c4698f15a8d9197c");
                    } else if (map == null) {
                    } else {
                        if (((str.hashCode() == -530971608 && str.equals("call_phone_event")) ? (char) 65535 : (char) 65535) != 0) {
                            return;
                        }
                        int a2 = map.containsKey("type") ? r.a(String.valueOf(map.get("type")), -1) : -1;
                        String valueOf = map.containsKey("delivery_carrier_phone") ? String.valueOf(map.get("delivery_carrier_phone")) : "";
                        if (a2 == 3) {
                            i.b(a.this.b, valueOf);
                        }
                    }
                }
            }).a(new DialogInterface.OnDismissListener() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.a.10
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    Object[] objArr2 = {dialogInterface};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "12daff6502361fa82ee983a177d67b42", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "12daff6502361fa82ee983a177d67b42");
                        return;
                    }
                    a.this.m = null;
                    ae.a();
                }
            }).a();
            if (this.m == null || this.m.getDialog() == null) {
                return;
            }
            ae.a(this.m.getDialog().getWindow());
        }
    }

    private void i() {
        int i;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "242d41c9d54f19a6921da893844a7a30", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "242d41c9d54f19a6921da893844a7a30");
            return;
        }
        JudasManualManager.a("b_waimai_sg_sik2emu9_mc").a("c_hgowsqb").a("poi_id", i.a(this.k.logicInfo.c, this.k.logicInfo.d)).a("order_id", this.k.logicInfo.b).a(this.b).a();
        String string = this.b.getString(R.string.wm_order_detail_pause_cycle_purchase_toast);
        if (this.k == null || this.k.deliveryPlan == null) {
            i = -1;
        } else {
            OrderDeliveryPlanInfo orderDeliveryPlanInfo = this.k.deliveryPlan;
            i = orderDeliveryPlanInfo.restPauseCount;
            if (!aa.a(orderDeliveryPlanInfo.restPauseCountToast)) {
                string = orderDeliveryPlanInfo.restPauseCountToast;
            }
        }
        if (i == 0) {
            ae.a(this.b, string);
        } else {
            ((IOrderBusinessService) com.sankuai.waimai.router.a.a(IOrderBusinessService.class, IOrderBusinessService.KEY_STORE_BUSINESS)).showPauseCyclePurchaseSheet(this.b, 400, this.k.logicInfo.b, String.valueOf(this.k.logicInfo.c), this.k.logicInfo.d);
        }
    }

    private RiderInfo.b j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea0a8820f28dcb4d06acb3d05dbcb4b8", RobustBitConfig.DEFAULT_VALUE)) {
            return (RiderInfo.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea0a8820f28dcb4d06acb3d05dbcb4b8");
        }
        if (this.k == null || this.k.logicInfo.k == null || this.k.logicInfo.k.i == null) {
            return null;
        }
        for (RiderInfo.b bVar : this.k.logicInfo.k.i) {
            if (bVar != null && bVar.a == i.b) {
                return bVar;
            }
        }
        return null;
    }

    public final void a(@Nullable ButtonItem buttonItem) {
        Object[] objArr = {buttonItem};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4ca98b84a8752f5dd4dd5baf3ba7c19", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4ca98b84a8752f5dd4dd5baf3ba7c19");
        } else {
            a(buttonItem, 0);
        }
    }

    public final void a(@Nullable ButtonItem buttonItem, int i) {
        q qVar;
        Object[] objArr = {buttonItem, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9abd7d4b3a86f7a6a9c778b643d3d4f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9abd7d4b3a86f7a6a9c778b643d3d4f");
        } else if (buttonItem == null || this.k == null) {
        } else {
            int i2 = buttonItem.code;
            switch (i2) {
                case 2001:
                    JudasManualManager.a("b_idOLh").a("c_hgowsqb").a(this.b).a();
                    this.c.a(true, this.k.logicInfo.b);
                    return;
                case 2002:
                    if (this.k.logicInfo.h == 4) {
                        this.d.b(this.k.logicInfo.b);
                    } else {
                        this.d.a(this.k.logicInfo, true, 2);
                    }
                    a("b_yV6As");
                    return;
                case 2003:
                    if (this.k.logicInfo.h == 4) {
                        this.d.b(this.k.logicInfo.b);
                    } else {
                        this.d.a(this.k.orderCancelInfo, this.k.logicInfo);
                    }
                    a("b_mlxAz");
                    return;
                case 2004:
                    if (this.e != null) {
                        this.e.a(this.k.logicInfo);
                        return;
                    }
                    return;
                case 2005:
                    i.a((Activity) this.b, a(), this.k.logicInfo.b, this.k.logicInfo.b(), this.k.logicInfo.f, String.valueOf(this.k.logicInfo.c), this.k.logicInfo.d);
                    a("b_BVTJe");
                    return;
                case 2006:
                    if (b()) {
                        i.a(this.b, this.k.logicInfo.b, this.k.getCallPhone(), 1, this.k.logicInfo.w);
                    } else {
                        i.b((Activity) this.b, this.k.logicInfo.u);
                    }
                    a("b_BtJvG");
                    return;
                case 2007:
                    this.q.a(this.k.logicInfo.b, buttonItem.title, buttonItem.subTitle);
                    a("b_wEtHd");
                    return;
                case 2008:
                    i.c((Activity) this.b, "");
                    a("b_lqDfw");
                    return;
                case 2009:
                    if (TextUtils.isEmpty(buttonItem.clickUrl)) {
                        return;
                    }
                    com.sankuai.waimai.foundation.router.a.a(this.b, buttonItem.clickUrl);
                    return;
                case 2010:
                    i.b((Activity) this.b, a(), this.k.logicInfo.b, String.valueOf(this.k.logicInfo.c), this.k.logicInfo.d);
                    if (i == 1) {
                        a("b_6HIqV");
                        return;
                    }
                    return;
                default:
                    switch (i2) {
                        case 2012:
                            if (TextUtils.isEmpty(buttonItem.clickUrl)) {
                                e();
                            } else {
                                com.sankuai.waimai.foundation.router.a.a(this.b, buttonItem.clickUrl);
                            }
                            a("b_kfKLV");
                            return;
                        case 2013:
                            String str = buttonItem.clickUrl;
                            if (!TextUtils.isEmpty(str)) {
                                if (com.sankuai.waimai.platform.capacity.abtest.f.a(this.b, "order_h5_refundstatus_android")) {
                                    com.sankuai.waimai.foundation.router.a.a(this.b, com.sankuai.waimai.platform.capacity.abtest.f.a() + "/c/refundstatus.html?order_view_id=" + this.k.logicInfo.b + "&poi_id=" + this.k.logicInfo.c + "&poi_id_str=" + this.k.logicInfo.d);
                                } else {
                                    com.sankuai.waimai.foundation.router.a.a(this.b, str);
                                }
                            } else {
                                com.sankuai.waimai.platform.capacity.log.i.d(new com.sankuai.waimai.bussiness.order.base.log.a().a("order_status_btn_click").b("click_refund").c("click_url_empty").b());
                            }
                            a("b_FI1Ui");
                            return;
                        case 2014:
                            JudasManualManager.a("b_Fa5vY").a("c_hgowsqb").a(this.b).a();
                            if (!TextUtils.isEmpty(buttonItem.clickUrl)) {
                                if (com.sankuai.waimai.platform.capacity.abtest.f.a(this.b, "order_h5_refundstatus_android")) {
                                    com.sankuai.waimai.foundation.router.a.a(this.b, com.sankuai.waimai.platform.capacity.abtest.f.a() + "/c/refundstatus.html?order_view_id=" + this.k.logicInfo.b + "&poi_id=" + this.k.logicInfo.c + "&poi_id_str=" + this.k.logicInfo.d);
                                    return;
                                }
                                com.sankuai.waimai.foundation.router.a.a(this.b, buttonItem.clickUrl);
                                return;
                            }
                            com.sankuai.waimai.platform.capacity.log.i.d(new com.sankuai.waimai.bussiness.order.base.log.a().a("order_status_btn_click").b("click_part_refund").c("click_url_empty").b());
                            return;
                        case 2015:
                            long a2 = r.a(this.k.logicInfo.b, 0L);
                            Bundle bundle = new Bundle();
                            bundle.putLong("order_view_id", a2);
                            com.sankuai.waimai.foundation.router.a.a(this.b, com.meituan.android.singleton.b.a.getString(R.string.wm_order_multi_person_bill_scheme), bundle);
                            return;
                        case 2016:
                            JudasManualManager.a("b_m8uig").a("c_hgowsqb").a(this.b).a();
                            if (!TextUtils.isEmpty(buttonItem.clickUrl)) {
                                com.sankuai.waimai.foundation.router.a.a(this.b, buttonItem.clickUrl);
                                return;
                            } else {
                                com.sankuai.waimai.platform.capacity.log.i.d(new com.sankuai.waimai.bussiness.order.base.log.a().a("order_status_btn_click").b("click_balance").c("click_url_empty").b());
                                return;
                            }
                        default:
                            switch (i2) {
                                case TXLiteAVCode.EVT_VOD_PLAY_SEEK_COMPLETE /* 2019 */:
                                    if (buttonItem.action == 1) {
                                        this.d.a(this.k.orderCancelInfo, this.k.logicInfo, buttonItem);
                                    } else {
                                        this.d.a(this.k.orderCancelInfo, buttonItem);
                                    }
                                    a("b_6r2b9lpe");
                                    return;
                                case 2020:
                                    if (!TextUtils.isEmpty(buttonItem.clickUrl)) {
                                        com.sankuai.waimai.foundation.router.a.a(this.b, buttonItem.clickUrl);
                                    } else {
                                        com.sankuai.waimai.platform.capacity.log.i.d(new com.sankuai.waimai.bussiness.order.base.log.a().a("order_status_btn_click").b("click_complain_rider").c("click_url_empty").b());
                                    }
                                    JudasManualManager.a a3 = JudasManualManager.a("b_o7narzr0").a("c_hgowsqb");
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(this.k.logicInfo.a());
                                    JudasManualManager.a a4 = a3.a("actual_delivery_type", sb.toString());
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(this.k.logicInfo.c());
                                    a4.a(DataConstants.CITY_ID, sb2.toString()).a("complain_status", "2020").a("complain_position", 0).a(this.b).a();
                                    return;
                                case 2021:
                                    String str2 = buttonItem.clickUrl;
                                    if (!TextUtils.isEmpty(str2)) {
                                        com.sankuai.waimai.foundation.router.a.a(this.b, str2);
                                    } else {
                                        com.sankuai.waimai.platform.capacity.log.i.d(new com.sankuai.waimai.bussiness.order.base.log.a().a("order_status_btn_click").b("click_complain_rider_progress").c("click_url_empty").b());
                                    }
                                    JudasManualManager.a a5 = JudasManualManager.a("b_o7narzr0").a("c_hgowsqb");
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append(this.k.logicInfo.a());
                                    JudasManualManager.a a6 = a5.a("actual_delivery_type", sb3.toString());
                                    StringBuilder sb4 = new StringBuilder();
                                    sb4.append(this.k.logicInfo.c());
                                    a6.a(DataConstants.CITY_ID, sb4.toString()).a("complain_status", "2021").a("complain_position", 0).a(this.b).a();
                                    return;
                                default:
                                    switch (i2) {
                                        case TXLiteAVCode.EVT_AUDIO_JITTER_STATE_FIRST_LOADING /* 2023 */:
                                            if (!TextUtils.isEmpty(buttonItem.clickUrl)) {
                                                com.sankuai.waimai.foundation.router.a.a(this.b, buttonItem.clickUrl);
                                                return;
                                            } else {
                                                com.sankuai.waimai.platform.capacity.log.i.d(new com.sankuai.waimai.bussiness.order.base.log.a().a("order_status_btn_click").b("click_award_rider").c("click_url_empty").b());
                                                return;
                                            }
                                        case TXLiteAVCode.EVT_AUDIO_JITTER_STATE_LOADING /* 2024 */:
                                            this.n = 0;
                                            if (!aa.a(buttonItem.clickUrl)) {
                                                com.sankuai.waimai.foundation.router.a.a(this.b, buttonItem.clickUrl);
                                            } else {
                                                g();
                                            }
                                            a("b_g1p67j2m", com.sankuai.waimai.bussiness.order.detailnew.pgablock.food.mach.b.e);
                                            return;
                                        case TXLiteAVCode.EVT_AUDIO_JITTER_STATE_PLAYING /* 2025 */:
                                            RiderInfo.b j = j();
                                            i.a(this.b, this.k.logicInfo.b, b(), c(), j != null ? j.c : null, this.k.getCallPhone());
                                            a("b_waimai_d2190ybm_mc");
                                            return;
                                        case TXLiteAVCode.EVT_AUDIO_JITTER_STATE_FIRST_PLAY /* 2026 */:
                                            this.n = 1;
                                            a("b_rnhq561h", com.sankuai.waimai.bussiness.order.detailnew.pgablock.food.mach.b.d);
                                            h();
                                            return;
                                        case TXLiteAVCode.EVT_MIC_START_SUCC /* 2027 */:
                                            a("b_mlxAz");
                                            c(buttonItem);
                                            return;
                                        default:
                                            switch (i2) {
                                                case 2040:
                                                    if (this.j != null) {
                                                        this.j.q();
                                                    }
                                                    JudasManualManager.a("b_htabvq4i").a("c_hgowsqb").a(this.b).a();
                                                    return;
                                                case 2041:
                                                    r.a(this.k.logicInfo.b, 0L);
                                                    JudasManualManager.a("b_vhd8te22").a("c_hgowsqb").a(this.b).a();
                                                    com.sankuai.waimai.bussiness.order.base.a.a((Activity) this.b, 23, this.k.logicInfo.b, this.k.logicInfo.c, this.k.logicInfo.d);
                                                    return;
                                                case 2042:
                                                    i.a((Activity) this.b, buttonItem.clickUrl, 114, this.k.logicInfo.b);
                                                    JudasManualManager.a("b_waimai_grg5sxlc_mc").a("c_hgowsqb").a("poi_id", i.a(this.k.logicInfo.c, this.k.logicInfo.d)).a(this.b).a();
                                                    return;
                                                default:
                                                    switch (i2) {
                                                        case 2052:
                                                            this.n = 2;
                                                            com.sankuai.waimai.bussiness.order.detailnew.im.a.a((Activity) this.b, r.a(this.k.logicInfo.b, 0L), this.k.logicInfo.c, this.k.logicInfo.d, 10, a(), false, com.sankuai.waimai.bussiness.order.detailnew.pgablock.food.mach.b.c, 0, this.i);
                                                            return;
                                                        case 2053:
                                                            o.a aVar = (o.a) com.sankuai.waimai.foundation.utils.b.a(this.k.logicInfo.o.c, 0);
                                                            if (aVar == null) {
                                                                return;
                                                            }
                                                            String str3 = aVar.d;
                                                            if (TextUtils.isEmpty(str3)) {
                                                                return;
                                                            }
                                                            com.sankuai.waimai.router.a.a(this.b, str3);
                                                            return;
                                                        default:
                                                            switch (i2) {
                                                                case 3111:
                                                                    if (!TextUtils.isEmpty(buttonItem.clickUrl)) {
                                                                        com.sankuai.waimai.foundation.router.a.a(this.b, buttonItem.clickUrl);
                                                                        return;
                                                                    } else {
                                                                        com.sankuai.waimai.platform.capacity.log.i.d(new com.sankuai.waimai.bussiness.order.base.log.a().a("order_status_btn_click").b("code_view_invoice").c("click_url_empty").b());
                                                                        return;
                                                                    }
                                                                case 3112:
                                                                    if (!TextUtils.isEmpty(buttonItem.clickUrl)) {
                                                                        HashMap hashMap = new HashMap();
                                                                        if (this.k != null) {
                                                                            String str4 = "-999";
                                                                            if (!aa.a(this.k.trackingInfo) && (qVar = (q) com.sankuai.waimai.bussiness.order.detailnew.util.d.a().fromJson(this.k.trackingInfo, (Class<Object>) q.class)) != null && !aa.a(qVar.a)) {
                                                                                str4 = qVar.a;
                                                                            }
                                                                            hashMap.put("stid", str4);
                                                                            hashMap.put("poi_id", this.k.logicInfo != null ? i.a(this.k.logicInfo.c, this.k.logicInfo.d) : "");
                                                                        }
                                                                        JudasManualManager.a("b_waimai_88scjqid_mc").a("c_hgowsqb").b(hashMap).a(this.b).a();
                                                                        com.sankuai.waimai.foundation.router.a.a(this.b, buttonItem.clickUrl);
                                                                        return;
                                                                    }
                                                                    com.sankuai.waimai.platform.capacity.log.i.d(new com.sankuai.waimai.bussiness.order.base.log.a().a("order_status_btn_click").b("code_drug_b2c_change_address").c("click_url_empty").b());
                                                                    return;
                                                                default:
                                                                    switch (i2) {
                                                                        case 1001:
                                                                            f();
                                                                            JudasManualManager.a("b_Y8pXD").a("poi_id", i.a(this.k.logicInfo.c, this.k.logicInfo.d)).a("button_code", buttonItem.code).a("c_hgowsqb").a(this.b).a();
                                                                            return;
                                                                        case TXLiteAVCode.EVT_AUDIO_DEVICE_ROUTE_CHANGED /* 2030 */:
                                                                            d();
                                                                            return;
                                                                        case 2045:
                                                                            this.d.a(this.k.logicInfo, false, 2);
                                                                            a("b_yV6As");
                                                                            return;
                                                                        case 2048:
                                                                            if (this.h != null) {
                                                                                this.h.a(false);
                                                                                return;
                                                                            }
                                                                            return;
                                                                        case 2050:
                                                                            f();
                                                                            JudasManualManager.a("b_waimai_snhfvikt_mc").a("page_type", "-999").a("poi_id", i.a(this.k.logicInfo.c, this.k.logicInfo.d)).a("button_name", buttonItem.title).a("status_code", buttonItem.code).a("c_hgowsqb").a(this.b).a();
                                                                            return;
                                                                        case 2060:
                                                                            i();
                                                                            return;
                                                                        case 3001:
                                                                            String str5 = buttonItem.clickUrl;
                                                                            if (!TextUtils.isEmpty(str5)) {
                                                                                com.sankuai.waimai.foundation.router.a.a(this.b, str5, "");
                                                                                return;
                                                                            } else {
                                                                                com.sankuai.waimai.platform.capacity.log.i.d(new com.sankuai.waimai.bussiness.order.base.log.a().a("order_status_btn_click").b("click_after_sale_service").c("click_url_empty").b());
                                                                                return;
                                                                            }
                                                                        case 3114:
                                                                            d(buttonItem);
                                                                            a("b_waimai_jyz30l8t_mc");
                                                                            return;
                                                                        case 3119:
                                                                            return;
                                                                        case 3132:
                                                                            JsonObject b = b(buttonItem);
                                                                            b.add("pop_up_info", com.sankuai.waimai.bussiness.order.detailnew.util.d.a().toJsonTree(buttonItem.mPopUpInfo));
                                                                            com.sankuai.waimai.foundation.router.a.a(this.b, Uri.parse(com.sankuai.waimai.foundation.router.interfaces.d.f(this.b)).buildUpon().path("/machalertview").appendQueryParameter("data", b.toString()).appendQueryParameter("cid", "c_hgowsqb").appendQueryParameter("template_id", "drug_order_confirm_extended_receipt_style-1").build().toString());
                                                                            return;
                                                                        case 3140:
                                                                            c(buttonItem);
                                                                            return;
                                                                        case 5001:
                                                                            IOrderBusinessService iOrderBusinessService = (IOrderBusinessService) com.sankuai.waimai.router.a.a(IOrderBusinessService.class, IOrderBusinessService.KEY_STORE_BUSINESS);
                                                                            HashMap hashMap2 = new HashMap();
                                                                            if (this.k != null) {
                                                                                hashMap2.put("orderViewId", this.k.logicInfo.b);
                                                                                hashMap2.put("poiId", String.valueOf(this.k.logicInfo.c));
                                                                                hashMap2.put("poi_id", i.a(this.k.logicInfo.c, this.k.logicInfo.d));
                                                                            }
                                                                            if (iOrderBusinessService != null) {
                                                                                iOrderBusinessService.showDialog((Activity) this.b, hashMap2, "image_viewer_dialog");
                                                                            }
                                                                            JudasManualManager.a("b_waimai_sg_med_nb822827_mc").a("c_hgowsqb").b(hashMap2).a(this.b).a();
                                                                            return;
                                                                        default:
                                                                            return;
                                                                    }
                                                            }
                                                    }
                                            }
                                    }
                            }
                    }
            }
        }
    }

    public final void a(int i, int i2) {
        Object[] objArr = {0, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a219799070d27fdf116decffafd7ffa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a219799070d27fdf116decffafd7ffa");
            return;
        }
        if (i2 == 2024) {
            com.sankuai.waimai.bussiness.order.detailnew.pgablock.food.mach.b.b.put("poi", 0);
        } else if (i2 != 2026) {
            switch (i2) {
                case 2052:
                    com.sankuai.waimai.bussiness.order.detailnew.pgablock.food.mach.b.b.put("group", 0);
                    break;
                case 2053:
                    com.sankuai.waimai.bussiness.order.detailnew.pgablock.food.mach.b.b.put("doctor", 0);
                    break;
            }
        } else {
            com.sankuai.waimai.bussiness.order.detailnew.pgablock.food.mach.b.b.put("rider", 0);
        }
        com.sankuai.waimai.bussiness.order.detailnew.pgablock.machcontainer.f.a().a("im_notification_response_event", com.sankuai.waimai.bussiness.order.detailnew.pgablock.food.mach.b.b);
    }
}
