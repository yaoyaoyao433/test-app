package com.sankuai.waimai.bussiness.order.detailnew.controller.orderpopup;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.widget.ImageView;
import com.meituan.android.common.mrn.analytics.library.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.detail.common.IDynamicDialogCallback;
import com.sankuai.waimai.business.order.api.detail.common.IDynamicDialogController;
import com.sankuai.waimai.business.order.api.detail.network.response.ActivityDialogInfo;
import com.sankuai.waimai.business.order.api.detail.network.response.EnvelopeShareTip;
import com.sankuai.waimai.business.order.api.store.IOrderBusinessService;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.bussiness.order.detailnew.controller.DynamicActivityDialog;
import com.sankuai.waimai.bussiness.order.detailnew.controller.DynamicRedpacketDialog;
import com.sankuai.waimai.bussiness.order.detailnew.network.response.h;
import com.sankuai.waimai.bussiness.order.detailnew.pgablock.followarea.OrderFollowAreaInfo;
import com.sankuai.waimai.bussiness.order.detailnew.util.k;
import com.sankuai.waimai.bussiness.order.detailnew.util.l;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.mach.dialog.AlertInfo;
import com.sankuai.waimai.platform.mach.dialog.DynamicDialog;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class a {
    public static ChangeQuickRedirect a;
    protected String b;
    protected long c;
    protected String d;
    protected ImageView e;
    protected Activity f;
    protected boolean g;
    protected EnvelopeShareTip h;
    protected ActivityDialogInfo i;
    protected int j;
    protected boolean k;
    protected boolean l;
    protected boolean m;
    protected AlertInfo n;
    protected OrderFollowAreaInfo o;
    protected IDynamicDialogController p;
    protected l.e q;
    protected l.c r;
    protected l.b s;
    public com.sankuai.waimai.bussiness.order.detailnew.pgablock.fixedarea.animation.b t;
    public b u;
    protected Handler v;
    private boolean w;
    private IDynamicDialogCallback x;

    public abstract void d(boolean z);

    public static /* synthetic */ void a(a aVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "25562ac52033377cf56f7438cd389c57", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "25562ac52033377cf56f7438cd389c57");
        } else if (aVar.e != null) {
            aVar.e.setEnabled(true);
        }
    }

    public a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f520d12b679bd384ccb9f16cdc0b8448", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f520d12b679bd384ccb9f16cdc0b8448");
            return;
        }
        this.d = "";
        this.l = false;
        this.m = false;
        this.p = null;
        this.w = true;
        this.v = new Handler(new Handler.Callback() { // from class: com.sankuai.waimai.bussiness.order.detailnew.controller.orderpopup.a.1
            public static ChangeQuickRedirect a;

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                Object[] objArr2 = {message};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "08d595e4aac94dd51c38dbcecc13f869", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "08d595e4aac94dd51c38dbcecc13f869")).booleanValue();
                }
                if (message.what == 32631) {
                    a.a(a.this);
                }
                return true;
            }
        });
        this.x = new IDynamicDialogCallback() { // from class: com.sankuai.waimai.bussiness.order.detailnew.controller.orderpopup.a.2
            public static ChangeQuickRedirect a;

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            @Override // com.sankuai.waimai.business.order.api.detail.common.IDynamicDialogCallback
            public final <T> void failedWithParam(T t, T t2) {
                boolean z;
                Object[] objArr2 = {t, t2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b36dddf1dbc21dea1fdbe65ff48be85f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b36dddf1dbc21dea1fdbe65ff48be85f");
                    return;
                }
                switch (a.this.j) {
                    case 4:
                        a.this.i = (ActivityDialogInfo) t;
                        z = false;
                        break;
                    case 5:
                        a.this.h = (EnvelopeShareTip) t;
                        z = ((Boolean) t2).booleanValue();
                        break;
                    default:
                        z = false;
                        break;
                }
                if (z) {
                    a.this.d(true);
                } else {
                    a.this.d(false);
                }
                a.this.c(false);
            }

            @Override // com.sankuai.waimai.business.order.api.detail.common.IDynamicDialogCallback
            public final <T> void successWithParam(T t, T t2) {
                Object[] objArr2 = {t, t2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "72d9d84c6007d2f9ecb9395bbe5b49eb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "72d9d84c6007d2f9ecb9395bbe5b49eb");
                    return;
                }
                switch (a.this.j) {
                    case 4:
                        a.this.i = (ActivityDialogInfo) t;
                        break;
                    case 5:
                        a.this.h = (EnvelopeShareTip) t;
                        if (((Boolean) t2).booleanValue()) {
                            a.this.d(true);
                            break;
                        } else {
                            a.this.d(false);
                            break;
                        }
                }
                a.this.g = false;
                a.this.s.b("1");
            }

            @Override // com.sankuai.waimai.business.order.api.detail.common.IDynamicDialogCallback
            public final <T> void onDismiss(T t) {
                Object[] objArr2 = {t};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7231f2e2c1a9c5366b46dc4e4261c9f8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7231f2e2c1a9c5366b46dc4e4261c9f8");
                    return;
                }
                switch (a.this.j) {
                    case 4:
                        a.this.d(false);
                        break;
                    case 5:
                        EnvelopeShareTip envelopeShareTip = (EnvelopeShareTip) t;
                        if (a.this.q != null && envelopeShareTip != null) {
                            a.this.q.a(false, envelopeShareTip, a.this.b);
                            break;
                        }
                        break;
                }
                a.this.c(false);
                if (a.this.m) {
                    return;
                }
                a.this.c();
            }
        };
        this.f = activity;
    }

    public final void a(boolean z) {
        this.g = z;
    }

    public final void a(@NonNull OrderFollowAreaInfo orderFollowAreaInfo, long j, String str) {
        boolean z;
        boolean z2;
        DynamicDialog dialog;
        boolean z3 = false;
        Object[] objArr = {orderFollowAreaInfo, new Long(j), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3c49856a5d21720a75c825a22f2d150", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3c49856a5d21720a75c825a22f2d150");
            return;
        }
        this.b = orderFollowAreaInfo.orderId;
        this.c = j;
        this.d = str;
        this.o = orderFollowAreaInfo;
        h navigateBarInfo = orderFollowAreaInfo.getNavigateBarInfo(3);
        this.h = navigateBarInfo != null ? navigateBarInfo.e : null;
        h navigateBarInfo2 = orderFollowAreaInfo.getNavigateBarInfo(4);
        this.i = navigateBarInfo2 != null ? navigateBarInfo2.f : null;
        Object[] objArr2 = {orderFollowAreaInfo};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d2c94f383091108352ffea608bf5e76c", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d2c94f383091108352ffea608bf5e76c")).booleanValue();
        } else {
            ActivityDialogInfo a2 = k.a(k.b(orderFollowAreaInfo));
            if (a2 != null) {
                this.i = a2;
            }
            if (this.i == null || this.i.activityType != 3 || this.i.couponCollectionTip == null) {
                z = false;
            } else {
                this.h = k.c(orderFollowAreaInfo);
                IOrderBusinessService iOrderBusinessService = (IOrderBusinessService) com.sankuai.waimai.router.a.a(IOrderBusinessService.class, IOrderBusinessService.KEY_STORE_BUSINESS);
                if (iOrderBusinessService != null && this.g) {
                    this.g = false;
                    Map<String, Object> map = this.i.couponCollectionTip;
                    map.put("order_id", this.b);
                    iOrderBusinessService.showNewCustomImageDialog(this.f, com.sankuai.waimai.foundation.utils.k.a().toJson(map));
                }
                this.j = 3;
                d(false);
                z = true;
            }
        }
        if (z) {
            c(true);
        } else if (com.sankuai.waimai.bussiness.order.detailnew.util.c.a(orderFollowAreaInfo.couponShareInfo)) {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ea3e985120185da915ff7963a034bbd3", RobustBitConfig.DEFAULT_VALUE)) {
                z3 = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ea3e985120185da915ff7963a034bbd3")).booleanValue();
            } else if (this.p == null || this.p.getDialog() == null || !this.p.getDialog().isShowing()) {
                z3 = true;
            }
            if (z3) {
                a(orderFollowAreaInfo, true);
            }
        } else {
            if (this.p != null && (dialog = this.p.getDialog()) != null && dialog.isShowing()) {
                dialog.dismiss();
            }
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "cee01f0588f5c7026a033ed6f707c129", RobustBitConfig.DEFAULT_VALUE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "cee01f0588f5c7026a033ed6f707c129")).booleanValue();
            } else {
                z2 = (this.i == null || TextUtils.isEmpty(this.i.clickUrl)) ? false : true;
            }
            if (z2) {
                this.j = 2;
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "ee4d456939ad714bb04df40cbe31f4d9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "ee4d456939ad714bb04df40cbe31f4d9");
                    return;
                } else if (TextUtils.isEmpty(this.i.clickUrl) || this.i.autoPopup == 0 || !this.g) {
                    d(false);
                    return;
                } else {
                    return;
                }
            }
            if (this.h != null) {
                this.j = 1;
                Object[] objArr6 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect6 = a;
                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "72aa482bf4f8cdadc8af83cf7f471d8e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "72aa482bf4f8cdadc8af83cf7f471d8e");
                    return;
                }
                if (this.g) {
                    b(true);
                    this.s.b("1");
                    this.g = false;
                }
                d(false);
                return;
            }
            this.j = 0;
            d(false);
        }
    }

    public final void a(@NonNull OrderFollowAreaInfo orderFollowAreaInfo, boolean z) {
        boolean z2;
        Object[] objArr = {orderFollowAreaInfo, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8fd29b28af05456789e6de843eeceb1d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8fd29b28af05456789e6de843eeceb1d");
            return;
        }
        try {
            this.n = (AlertInfo) com.sankuai.waimai.foundation.utils.k.a().fromJson(orderFollowAreaInfo.couponShareInfo, (Class<Object>) AlertInfo.class);
            AlertInfo alertInfo = this.n;
            Object[] objArr2 = {alertInfo};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7293d1476d609b024fc0bf5a14f66eff", RobustBitConfig.DEFAULT_VALUE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7293d1476d609b024fc0bf5a14f66eff")).booleanValue();
            } else {
                if (alertInfo != null && alertInfo.modules != null && alertInfo.modules.size() > 0) {
                    z2 = false;
                }
                z2 = true;
            }
            if (z2) {
                d(true);
                throw new Exception("order detail dynamic data error");
            }
            for (AlertInfo.Module module : this.n.modules) {
                String str = module.moduleId;
                char c = 65535;
                int hashCode = str.hashCode();
                if (hashCode != -1841412368) {
                    if (hashCode != -1662706763) {
                        if (hashCode == 2131710316 && str.equals("wm_orderdetail_activity_task")) {
                            c = 0;
                        }
                    } else if (str.equals("wm_orderdetail_shangou_floating_layer")) {
                        c = 2;
                    }
                } else if (str.equals("wm_orderdetail_share_redpacket")) {
                    c = 1;
                }
                switch (c) {
                    case 0:
                        this.j = 4;
                        this.p = new DynamicActivityDialog(this.f, this.n, this.i, com.sankuai.waimai.bussiness.order.detailnew.util.c.a(module), this.x, this.g, d());
                        break;
                    case 1:
                        this.j = 5;
                        this.p = new DynamicRedpacketDialog(this.f, this.n, this.b, this.h, com.sankuai.waimai.bussiness.order.detailnew.util.c.a(module), this.q, this.x, this.g, z, d());
                        ((DynamicRedpacketDialog) this.p).setOnDyRedPacketDialogStatusListener(this.r);
                        break;
                    case 2:
                        this.j = 7;
                        IOrderBusinessService iOrderBusinessService = (IOrderBusinessService) com.sankuai.waimai.router.a.a(IOrderBusinessService.class, IOrderBusinessService.KEY_STORE_BUSINESS);
                        if (iOrderBusinessService != null) {
                            HashMap hashMap = new HashMap();
                            hashMap.put(Constants.EventConstants.KEY_ORDER_ID, this.b);
                            hashMap.put("poi_id", Long.valueOf(this.c));
                            hashMap.put(FoodDetailNetWorkPreLoader.URI_POI_STR, this.d);
                            hashMap.put("isFirstShow", Boolean.valueOf(this.w));
                            this.p = iOrderBusinessService.createDynamicDialog(this.f, this.n, hashMap, this.g, this.x);
                        }
                        this.w = false;
                        this.g = false;
                        d(false);
                        break;
                }
            }
            if (this.p != null) {
                c(true);
                this.p.showDialog();
            }
        } catch (Exception e) {
            c(false);
            com.dianping.judas.util.a.a("order detail dynamic dialog error", e.getMessage());
        }
    }

    private static boolean d() {
        return Build.VERSION.SDK_INT >= 23;
    }

    public final void b(final boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91abad5073e9263738a07ab14ca2cf9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91abad5073e9263738a07ab14ca2cf9f");
        } else if (this.h == null || this.f == null || this.f.isFinishing()) {
        } else {
            c(true);
            l.a(this.f, this.h, this.v, this.b, z, this.q, new l.a() { // from class: com.sankuai.waimai.bussiness.order.detailnew.controller.orderpopup.a.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.bussiness.order.detailnew.util.l.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1c4bfe050908d7958a0b4260cdec5471", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1c4bfe050908d7958a0b4260cdec5471");
                        return;
                    }
                    a.this.c(false);
                    if (!z || a.this.m) {
                        return;
                    }
                    a.this.c();
                }
            });
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "510a1016f30b223adf84b39fb9f2bbdd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "510a1016f30b223adf84b39fb9f2bbdd");
        } else if (this.j == 2 || this.j == 4 || this.j == 3) {
            JudasManualManager.a("b_q2uqika6").a("activity_type", this.i.activityType).a("c_hgowsqb").a(this.f).a();
        } else {
            JudasManualManager.a a2 = JudasManualManager.a("b_KH3VP").a("orderid", this.b).a("page_type", l.a(this.h));
            EnvelopeShareTip envelopeShareTip = this.h;
            a2.a((Map<String, Object>) (envelopeShareTip != null ? envelopeShareTip.logData : null)).a("c_hgowsqb").a(this.f).a();
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddeb4bcba9b1a3c494992a265e860262", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddeb4bcba9b1a3c494992a265e860262");
        } else if ((this.j == 2 || this.j == 4 || this.j == 3) && !this.k) {
            JudasManualManager.b("b_o2t8dykl").a("activity_type", this.i.activityType).a("c_hgowsqb").a(this.f).a();
            this.k = true;
        }
    }

    public final void a(l.e eVar) {
        this.q = eVar;
    }

    public final void a(l.c cVar) {
        this.r = cVar;
    }

    public final void a(l.b bVar) {
        this.s = bVar;
    }

    public final void c(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48de9c9a2a48a108e346cabe9e7ceec5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48de9c9a2a48a108e346cabe9e7ceec5");
            return;
        }
        this.l = z;
        if (this.u != null) {
            this.u.a(z);
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b801dbc6b627a22b409bf56416f34db9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b801dbc6b627a22b409bf56416f34db9");
        } else if (this.t != null) {
            this.t.M();
        }
    }
}
