package com.sankuai.waimai.bussiness.order.detailnew.pgablock.actionbar;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.gson.JsonObject;
import com.meituan.android.common.mrn.analytics.library.Constants;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.android.cube.pga.common.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.iconfont.RooIconFont;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.business.im.api.msgcenter.a;
import com.sankuai.waimai.bussiness.order.base.net.OrderApi;
import com.sankuai.waimai.bussiness.order.base.utils.i;
import com.sankuai.waimai.bussiness.order.detailnew.network.response.h;
import com.sankuai.waimai.bussiness.order.detailnew.pgablock.root.e;
import com.sankuai.waimai.foundation.location.v2.City;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.mach.dialog.DynamicDialog;
import com.sankuai.waimai.platform.widget.dial.presenter.DialContract;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import rx.k;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends com.meituan.android.cube.pga.view.a implements a.b {
    private static int J = 30;
    public static ChangeQuickRedirect d;
    private TextView A;
    private TextView B;
    private TextView C;
    private h D;
    private h E;
    private h F;
    private int G;
    private b H;
    private com.sankuai.waimai.business.order.api.detail.block.a I;
    private int K;
    private boolean L;
    private DynamicDialog M;
    public View e;
    public FrameLayout f;
    public View g;
    public View h;
    public View i;
    public ViewGroup j;
    public int k;
    public int l;
    public k m;
    public com.sankuai.waimai.bussiness.order.detailnew.pgablock.root.b n;
    public g<e> o;
    private View p;
    private View q;
    private RooIconFont r;
    private FrameLayout s;
    private FrameLayout t;
    private ImageView u;
    private ImageView v;
    private ImageView w;
    private ImageView x;
    private TextView y;
    private TextView z;

    @Override // com.meituan.android.cube.pga.view.a
    public final int d() {
        return R.layout.wm_order_detail_child_action_bar_block;
    }

    public static /* synthetic */ void a(c cVar, com.sankuai.waimai.bussiness.order.detailnew.network.response.k kVar) {
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "4b27a4d01d3ad632204da52d1d380a61", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "4b27a4d01d3ad632204da52d1d380a61");
            return;
        }
        com.sankuai.waimai.business.im.api.msgcenter.a.a().refreshMsgCenterUnReadCount();
        Object[] objArr2 = {kVar};
        ChangeQuickRedirect changeQuickRedirect2 = d;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "68961bfa928ec75f09f248c38c9eb5c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "68961bfa928ec75f09f248c38c9eb5c2");
        } else if (kVar == null || kVar.a <= 0) {
            cVar.y.setVisibility(8);
        } else {
            if (kVar.a > 99) {
                cVar.y.setText("99");
            } else {
                cVar.y.setText(String.valueOf(kVar.a));
            }
            cVar.y.setVisibility(0);
        }
    }

    public static /* synthetic */ void o(c cVar) {
        Map hashMap;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "6da5592c4b27de89fc9561411af3c268", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "6da5592c4b27de89fc9561411af3c268");
        } else if (cVar.D == null || TextUtils.isEmpty(cVar.D.d)) {
        } else {
            JudasManualManager.a("b_rHxxq").a("order_id", cVar.H.b).a("poi_id", i.a(cVar.H.d, cVar.H.e)).a("weather_type", cVar.H.l).a("rider_delivery_code", cVar.H.n).a("poi_prepare_code", cVar.H.o).a("support_care", cVar.H.p != null ? cVar.H.p.c : "0").a("order_id", cVar.H.b).a("status_code", cVar.H.m).a("order_status", cVar.H.f).a("type", cVar.H.g).a("c_hgowsqb").a(cVar.c).a();
            String str = cVar.D.d;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = d;
            if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "75d88feac01cd7a33a7347c469797329", RobustBitConfig.DEFAULT_VALUE)) {
                hashMap = (Map) PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "75d88feac01cd7a33a7347c469797329");
            } else {
                hashMap = new HashMap();
                if (com.sankuai.waimai.platform.domain.manager.user.a.i().a()) {
                    hashMap.put(DeviceInfo.USER_ID, String.valueOf(com.sankuai.waimai.platform.domain.manager.user.a.i().d()));
                }
                hashMap.put("sysName", com.sankuai.waimai.platform.b.A().o());
                hashMap.put("sysVer", Build.VERSION.RELEASE);
                hashMap.put("appName", cVar.c.getString(R.string.app_name));
                hashMap.put("appVer", com.sankuai.waimai.platform.b.A().i());
                City n = com.sankuai.waimai.foundation.location.v2.g.a().n();
                String cityName = n == null ? "" : n.getCityName();
                hashMap.put("locCity", com.sankuai.waimai.foundation.location.g.b() + CommonConstant.Symbol.UNDERLINE + cityName);
                hashMap.put(Constants.EventConstants.KEY_ORDER_ID, cVar.H.b);
                hashMap.put("orderStatus", String.valueOf(cVar.H.f));
                hashMap.put("buExt", cVar.f());
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            com.sankuai.waimai.foundation.router.a.a(cVar.c, str, hashMap);
        }
    }

    public c(Context context, @Nullable ViewStub viewStub, com.sankuai.waimai.business.order.api.detail.block.a aVar) {
        super(context, viewStub);
        Object[] objArr = {context, viewStub, aVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06ecc4729abd934a8ecac53f72f12450", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06ecc4729abd934a8ecac53f72f12450");
            return;
        }
        this.G = 0;
        this.K = J;
        this.I = aVar;
    }

    @Override // com.meituan.android.cube.pga.view.a
    public final void b() {
        int b;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30a415011866770799a675cc92ad3a1b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30a415011866770799a675cc92ad3a1b");
            return;
        }
        super.b();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = d;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ba3c12f85014a1e96bafc07a3bb8a1e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ba3c12f85014a1e96bafc07a3bb8a1e9");
        } else {
            this.l = com.sankuai.waimai.foundation.utils.g.a(this.c, 10.0f);
            this.k = com.sankuai.waimai.foundation.utils.g.a(this.c, 45.0f);
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = d;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "473305ea079465480eca6c4fc1c5a9e4", RobustBitConfig.DEFAULT_VALUE)) {
                b = ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "473305ea079465480eca6c4fc1c5a9e4")).intValue();
            } else {
                b = com.sankuai.waimai.platform.capacity.persistent.sp.a.b(this.c, "order_refresh_interval", 30);
                if (b < 30) {
                    b = 30;
                }
            }
            this.K = b;
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = d;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "177af188aa8ff39702c3887f82e7d456", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "177af188aa8ff39702c3887f82e7d456");
            } else {
                com.sankuai.waimai.business.im.api.msgcenter.a.a().registerMsgCenterUnreadChangeListener(this);
            }
        }
        ContentViewType contentviewtype = this.b;
        Object[] objArr5 = {contentviewtype};
        ChangeQuickRedirect changeQuickRedirect5 = d;
        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "23825590299cc7d9a68a2858f139a7c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "23825590299cc7d9a68a2858f139a7c7");
            return;
        }
        this.e = contentviewtype;
        this.p = contentviewtype.findViewById(R.id.rl_header);
        this.q = contentviewtype.findViewById(R.id.v_order_detail_actionbar);
        this.r = (RooIconFont) contentviewtype.findViewById(R.id.img_order_detail_back);
        this.s = (FrameLayout) contentviewtype.findViewById(R.id.img_order_detail_custom_layout);
        this.j = (ViewGroup) contentviewtype.findViewById(R.id.order_detail_custom_layout);
        this.v = (ImageView) contentviewtype.findViewById(R.id.img_order_detail_custom);
        this.y = (TextView) contentviewtype.findViewById(R.id.img_order_detail_custom_feedback_count);
        this.r.setOnClickListener(d.a(this));
        this.s.setOnClickListener(new AnonymousClass1());
        this.t = (FrameLayout) contentviewtype.findViewById(R.id.img_order_detail_msg_center_layout);
        this.w = (ImageView) contentviewtype.findViewById(R.id.img_order_detail_msg_center);
        this.z = (TextView) contentviewtype.findViewById(R.id.img_order_detail_msg_center_count);
        this.x = (ImageView) contentviewtype.findViewById(R.id.img_order_detail_msg_center_red_point);
        this.t.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.actionbar.c.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr6 = {view};
                ChangeQuickRedirect changeQuickRedirect6 = a;
                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "55b4ab4c23a9c6d2ba67a1d85a01c783", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "55b4ab4c23a9c6d2ba67a1d85a01c783");
                    return;
                }
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                hashMap2.put("new_message_badge", Integer.valueOf(c.this.G));
                hashMap.put("custom", hashMap2);
                JudasManualManager.a("b_d02c094u").a("order_id", c.this.H.b).a((Map<String, Object>) hashMap).a("c_hgowsqb").a(c.this.c).a();
                com.sankuai.waimai.business.im.api.msgcenter.a.a().clickMsgCenter((Activity) c.this.c);
            }
        });
        this.g = contentviewtype.findViewById(R.id.img_order_detail_msg_bg);
        this.h = contentviewtype.findViewById(R.id.img_order_detail_contact_bg);
        this.i = contentviewtype.findViewById(R.id.wm_order_detail_back_bg);
        this.B = (TextView) contentviewtype.findViewById(R.id.text_order_detail_contact);
        this.C = (TextView) contentviewtype.findViewById(R.id.text_order_detail_msg);
        this.u = (ImageView) contentviewtype.findViewById(R.id.img_order_detail_refresh);
        this.f = (FrameLayout) contentviewtype.findViewById(R.id.img_order_detail_refresh_layout);
        this.A = (TextView) contentviewtype.findViewById(R.id.text_order_detail_refresh);
        this.A.getPaint().setFakeBoldText(true);
        this.f.setOnClickListener(new com.sankuai.waimai.bussiness.order.detailnew.widget.a() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.actionbar.c.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.bussiness.order.detailnew.widget.a
            public final void a(View view) {
                Object[] objArr6 = {view};
                ChangeQuickRedirect changeQuickRedirect6 = a;
                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "58b9d6860fb9f2140bdbdda4e910e897", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "58b9d6860fb9f2140bdbdda4e910e897");
                    return;
                }
                JudasManualManager.a("b_zivbxuwh").a("business_type", c.this.H.c).a("c_hgowsqb").a(c.this.c).a();
                c.this.I.b(true);
                c.this.e();
            }
        });
        Object[] objArr6 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect6 = d;
        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "5adf6572e94d3db93d1d84debb233876", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "5adf6572e94d3db93d1d84debb233876");
        } else if (Build.VERSION.SDK_INT >= 23) {
            int e = com.sankuai.waimai.foundation.utils.g.e(com.meituan.android.singleton.b.a);
            int dimensionPixelSize = com.meituan.android.singleton.b.a.getResources().getDimensionPixelSize(R.dimen.actionbar_height);
            ah.a(this.p, Integer.MIN_VALUE, e, Integer.MIN_VALUE, Integer.MIN_VALUE);
            int i = dimensionPixelSize + e;
            ah.b(this.q, Integer.MIN_VALUE, i);
            ah.b(this.e, Integer.MIN_VALUE, i);
            if (this.e != null) {
                this.e.getParent();
            }
        }
    }

    public static /* synthetic */ void a(c cVar, View view) {
        Object[] objArr = {cVar, view};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bce4f4a71a5650e338734d21c50f0e30", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bce4f4a71a5650e338734d21c50f0e30");
        } else {
            cVar.I.aS_();
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.bussiness.order.detailnew.pgablock.actionbar.c$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public static ChangeQuickRedirect a;

        public AnonymousClass1() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "139a68d8c481cf13761c737875b8e4ef", 4611686018427387906L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "139a68d8c481cf13761c737875b8e4ef");
            } else if (c.this.D.h != null && ((Double) c.this.D.h.get("style")).doubleValue() == 1.0d) {
                if (c.this.M == null || !c.this.M.isShowing()) {
                    JsonObject jsonObject = c.this.n.y;
                    jsonObject.add("pop_up_info", com.sankuai.waimai.bussiness.order.detailnew.util.d.a().toJsonTree(c.this.D.h));
                    final e eVar = (e) c.this.o.a().b;
                    c.this.M = com.sankuai.waimai.bussiness.order.confirm.request.dynamic.b.a((Activity) c.this.c).a("waimai_order_order_status_im_aftersale_info_style_1").a(jsonObject).a(new com.sankuai.waimai.bussiness.order.confirm.request.dynamic.a((Activity) c.this.c) { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.actionbar.c.1.2
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.bussiness.order.confirm.request.dynamic.a
                        public final void a(String str, Map<String, Object> map, DynamicDialog dynamicDialog) {
                            char c;
                            Object[] objArr2 = {str, map, dynamicDialog};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e213170a443a5a0142e84321943e9d5e", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e213170a443a5a0142e84321943e9d5e");
                            } else if (map == null) {
                            } else {
                                String valueOf = String.valueOf(map.get(Constants.EventConstants.KEY_ORDER_ID));
                                boolean parseBoolean = Boolean.parseBoolean(String.valueOf(map.get("use_privacy")));
                                boolean e = c.this.n != null ? c.this.n.e() : false;
                                String valueOf2 = String.valueOf(map.get("user_phone"));
                                int hashCode = str.hashCode();
                                if (hashCode == -530971608) {
                                    if (str.equals("call_phone_event")) {
                                        c = 1;
                                    }
                                    c = 65535;
                                } else if (hashCode != 42595567) {
                                    if (hashCode == 1520273584 && str.equals("jump_im_event")) {
                                        c = 0;
                                    }
                                    c = 65535;
                                } else {
                                    if (str.equals("on_line_event")) {
                                        c = 2;
                                    }
                                    c = 65535;
                                }
                                switch (c) {
                                    case 0:
                                        dynamicDialog.dismiss();
                                        int parseInt = Integer.parseInt(String.valueOf(map.get("type")));
                                        if (parseInt == 1) {
                                            com.sankuai.waimai.bussiness.order.detailnew.im.a.a((Activity) c.this.c, r.a(c.this.n.b, 0L), c.this.n.k.i.get(0), com.sankuai.waimai.bussiness.order.base.feedback.i.a());
                                            return;
                                        } else if (parseInt == 0) {
                                            com.sankuai.waimai.bussiness.order.detailnew.im.a.a((Activity) c.this.c, 3, r.a(c.this.n.b, 0L), c.this.n.c, c.this.n.d, 0L, 10, com.sankuai.waimai.bussiness.order.base.feedback.i.a(), false, eVar, c.this.n);
                                            return;
                                        } else {
                                            return;
                                        }
                                    case 1:
                                        dynamicDialog.dismiss();
                                        int parseInt2 = Integer.parseInt(String.valueOf(map.get("type")));
                                        if (parseInt2 == 0) {
                                            if (parseBoolean) {
                                                i.a(c.this.c, valueOf, valueOf2, 1, c.this.n.b != null ? c.this.n.w : null);
                                                return;
                                            } else {
                                                i.b((Activity) c.this.c, c.this.n != null ? c.this.n.u : null);
                                                return;
                                            }
                                        } else if (parseInt2 != 1) {
                                            if (parseInt2 == 3) {
                                                String valueOf3 = map.containsKey("delivery_carrier_phone") ? String.valueOf(map.get("delivery_carrier_phone")) : "";
                                                if (TextUtils.isEmpty(valueOf3)) {
                                                    return;
                                                }
                                                i.b(c.this.c, valueOf3);
                                                return;
                                            }
                                            return;
                                        } else {
                                            String[] strArr = c.this.n != null ? c.this.n.x : null;
                                            String[] strArr2 = c.this.n != null ? c.this.n.v : null;
                                            if (e) {
                                                i.a(c.this.c, valueOf, valueOf2, 0, new DialContract.a() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.actionbar.c.1.2.1
                                                    public static ChangeQuickRedirect a;

                                                    @Override // com.sankuai.waimai.platform.widget.dial.presenter.DialContract.a
                                                    public final void a(String str2) {
                                                        Object[] objArr3 = {str2};
                                                        ChangeQuickRedirect changeQuickRedirect3 = a;
                                                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7aec02ace408858a389df707da1be37c", RobustBitConfig.DEFAULT_VALUE)) {
                                                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7aec02ace408858a389df707da1be37c");
                                                        } else {
                                                            i.b((Activity) c.this.c, new String[]{str2});
                                                        }
                                                    }
                                                }, strArr);
                                                return;
                                            } else if (parseBoolean) {
                                                i.a(c.this.c, valueOf, valueOf2, 0, strArr);
                                                return;
                                            } else {
                                                i.b((Activity) c.this.c, strArr2);
                                                return;
                                            }
                                        }
                                    case 2:
                                        c.o(c.this);
                                        return;
                                    default:
                                        return;
                                }
                            }
                        }
                    }).a(new DialogInterface.OnDismissListener() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.actionbar.c.1.1
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                        }
                    }).a();
                }
            } else {
                c.o(c.this);
            }
        }
    }

    public void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae2c3c2ceb621b218a95d2fe7851513b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae2c3c2ceb621b218a95d2fe7851513b");
            return;
        }
        if (this.m != null && !this.m.isUnsubscribed()) {
            this.m.unsubscribe();
        }
        this.m = rx.d.a(new com.sankuai.waimai.platform.capacity.network.rxsupport.b<com.sankuai.waimai.bussiness.order.detailnew.network.response.k>() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.actionbar.c.4
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.capacity.network.rxsupport.b
            public final /* synthetic */ void a(com.sankuai.waimai.bussiness.order.detailnew.network.response.k kVar) {
                com.sankuai.waimai.bussiness.order.detailnew.network.response.k kVar2 = kVar;
                Object[] objArr2 = {kVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c78175f48c69786443aeddb60382d400", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c78175f48c69786443aeddb60382d400");
                } else if (kVar2 != null) {
                    c.a(c.this, kVar2);
                }
            }

            @Override // com.sankuai.waimai.platform.capacity.network.rxsupport.b
            public final void a(com.sankuai.waimai.platform.modular.network.error.a aVar) {
                String message;
                Object[] objArr2 = {aVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f8d80e832a3802fbd602ab07281010d9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f8d80e832a3802fbd602ab07281010d9");
                    return;
                }
                if (aVar != null && aVar.d() != null && !TextUtils.isEmpty(aVar.d().getMessage())) {
                    message = aVar.d().getMessage();
                } else {
                    message = (aVar == null || TextUtils.isEmpty(aVar.getMessage())) ? "order_feedback_occur_apiException" : aVar.getMessage();
                }
                com.sankuai.waimai.platform.capacity.log.i.d(new com.sankuai.waimai.bussiness.order.base.log.a().a("order_status_detail_page_error").b(com.sankuai.waimai.platform.widget.emptylayout.c.a(aVar)).c("order_status_feedback_fail").d(message).b());
            }
        }, rx.d.a(0L, this.K, TimeUnit.SECONDS).i(new rx.functions.g<Long, Boolean>() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.actionbar.c.6
            public static ChangeQuickRedirect a;

            @Override // rx.functions.g
            public final /* synthetic */ Boolean call(Long l) {
                Long l2 = l;
                Object[] objArr2 = {l2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "736558f2d6635574bbe31b8b7e13e130", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "736558f2d6635574bbe31b8b7e13e130");
                }
                return Boolean.valueOf(com.sankuai.waimai.bussiness.order.detailnew.util.a.a(l2) < 100);
            }
        }).c(new rx.functions.g<Long, rx.d<com.sankuai.waimai.bussiness.order.detailnew.network.response.k>>() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.actionbar.c.5
            public static ChangeQuickRedirect a;

            @Override // rx.functions.g
            public final /* synthetic */ rx.d<com.sankuai.waimai.bussiness.order.detailnew.network.response.k> call(Long l) {
                Object[] objArr2 = {l};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5ef7dc609ef68f5d1c17a4f3fe00e0a8", RobustBitConfig.DEFAULT_VALUE) ? (rx.d) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5ef7dc609ef68f5d1c17a4f3fe00e0a8") : ((OrderApi) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) OrderApi.class)).getFeedbackNum().a(com.sankuai.waimai.platform.capacity.network.rxsupport.c.a(c.this.c));
            }
        }));
    }

    public final void a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b72dab1355d3f6428fbe10816ece2aaf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b72dab1355d3f6428fbe10816ece2aaf");
            return;
        }
        this.H = bVar;
        if (this.H == null) {
            return;
        }
        this.D = this.H.a(1);
        if (this.D != null) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = d;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "70b09b8f02774e2edc0659e4daad0a0e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "70b09b8f02774e2edc0659e4daad0a0e");
            } else if (!this.L && this.H != null) {
                JudasManualManager.b("b_waimai_b_rHxxq_mv").a("order_id", this.H.b).a("status_code", this.H.m).a("weather_type", this.H.l).a("business_type", this.H.c).a("support_care", this.H.p != null ? this.H.p.c : "0").a("rider_delivery_code", this.H.n).a("poi_prepare_code", this.H.o).a("c_hgowsqb").a(this.c).a();
                this.L = true;
            }
            this.s.setVisibility(0);
            b.C0608b a = com.sankuai.waimai.platform.capacity.imageloader.a.a();
            a.c = this.D.b;
            a.i = R.drawable.wm_order_detail_custom_ic_dark;
            a.a(this.v);
            if (!TextUtils.isEmpty(this.D.c)) {
                this.B.setVisibility(0);
                this.B.setText(this.D.c);
                this.B.getPaint().setFakeBoldText(true);
            } else {
                this.B.setVisibility(8);
            }
        } else {
            this.s.setVisibility(8);
        }
        this.E = this.H.a(5);
        if (this.E != null) {
            b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
            a2.c = this.E.b;
            a2.i = R.drawable.wm_order_detail_refresh_icon;
            a2.a(this.u);
            if (!TextUtils.isEmpty(this.E.c)) {
                this.A.setVisibility(0);
                this.A.setText(this.E.c);
                this.A.getPaint().setFakeBoldText(true);
            } else {
                this.A.setVisibility(8);
            }
        }
        this.F = this.H.a(2);
        if (this.F != null && !this.H.h) {
            this.t.setVisibility(0);
            b.C0608b a3 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
            a3.c = this.F.b;
            a3.a(new com.sankuai.meituan.mtimageloader.utils.b() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.actionbar.c.7
                public static ChangeQuickRedirect a;

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.sankuai.meituan.mtimageloader.utils.b, com.sankuai.meituan.mtimageloader.utils.d
                public final void a(Drawable drawable) {
                    Object[] objArr3 = {drawable};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "889caf5eb6045d8a31dba015372dcacc", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "889caf5eb6045d8a31dba015372dcacc");
                        return;
                    }
                    super.a(drawable);
                    if (drawable == null || c.this.w == null) {
                        return;
                    }
                    c.this.w.setImageDrawable(drawable);
                }

                @Override // com.sankuai.meituan.mtimageloader.utils.b, com.sankuai.meituan.mtimageloader.utils.d
                public final void a() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "05db057586a6acf8308d0f12d901741a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "05db057586a6acf8308d0f12d901741a");
                        return;
                    }
                    super.a();
                    String a4 = com.sankuai.waimai.bussiness.order.base.config.a.a().a("wm_order_detail_msg_icon");
                    if (a4 != null) {
                        b.C0608b a5 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                        a5.b = c.this.c;
                        a5.c = a4;
                        a5.a(c.this.w);
                    }
                }
            });
            if (!TextUtils.isEmpty(this.D.c)) {
                this.C.setVisibility(0);
                this.C.setText(this.D.c);
            } else {
                this.C.setVisibility(8);
            }
        } else {
            this.t.setVisibility(8);
        }
        this.f.setVisibility(0);
    }

    private String f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af38b4e6893910c2f19ab4debf0bd989", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af38b4e6893910c2f19ab4debf0bd989");
        }
        try {
            return new JSONObject().put("payStatus", this.H.i).put("logisticsStatus", this.H.j).put("deliveryType", this.H.k).toString();
        } catch (Exception e) {
            String simpleName = getClass().getSimpleName();
            com.sankuai.waimai.foundation.utils.log.a.e(simpleName, e.getMessage(), new Object[0]);
            return "";
        }
    }

    @Override // com.sankuai.waimai.business.im.api.msgcenter.a.b
    public final void a(boolean z, boolean z2, int i) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe32416833f15ca38f517a4908bb04fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe32416833f15ca38f517a4908bb04fc");
            return;
        }
        this.G = z2 ? 1 : i > 0 ? 2 : 0;
        this.x.setVisibility(z2 ? 0 : 8);
        this.z.setVisibility(i > 0 ? 0 : 8);
        if (i > 99) {
            this.z.setText("99");
        } else {
            this.z.setText(String.valueOf(i));
        }
    }
}
