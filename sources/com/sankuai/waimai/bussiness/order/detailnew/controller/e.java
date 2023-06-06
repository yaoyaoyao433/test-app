package com.sankuai.waimai.bussiness.order.detailnew.controller;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Handler;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.dialog.RooAlertDialog;
import com.sankuai.waimai.business.order.api.model.g;
import com.sankuai.waimai.business.order.api.service.OrderApi;
import com.sankuai.waimai.bussiness.order.base.utils.i;
import com.sankuai.waimai.bussiness.order.detailnew.network.response.l;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.platform.widget.dial.presenter.DialContract;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e {
    public static ChangeQuickRedirect a;
    public Handler b;
    Activity c;
    public l d;
    public com.sankuai.waimai.bussiness.order.detailnew.pgablock.root.b e;
    a f;
    public Runnable g;
    private String h;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a();
    }

    public static /* synthetic */ DialogInterface.OnClickListener a(e eVar, int i, final String str, final int i2, final com.sankuai.waimai.bussiness.order.detailnew.pgablock.root.b bVar) {
        Object[] objArr = {Integer.valueOf(i), str, Integer.valueOf(i2), bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, eVar, changeQuickRedirect, false, "cdd6fea6378e11027ac9f369ff60c8ed", RobustBitConfig.DEFAULT_VALUE)) {
            return (DialogInterface.OnClickListener) PatchProxy.accessDispatch(objArr, eVar, changeQuickRedirect, false, "cdd6fea6378e11027ac9f369ff60c8ed");
        }
        switch (i) {
            case 1:
                return null;
            case 2:
                return new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.detailnew.controller.e.3
                    public static ChangeQuickRedirect a;

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i3) {
                        Object[] objArr2 = {dialogInterface, Integer.valueOf(i3)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "20a28885b037af747611f0dede1a3fe9", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "20a28885b037af747611f0dede1a3fe9");
                        } else if (e.a(e.this)) {
                            i.a(e.this.c, e.b(e.this), e.c(e.this), i2, bVar.w, bVar.x);
                        } else {
                            i.b(e.this.c, null, bVar.u, bVar.v);
                        }
                    }
                };
            case 3:
                return new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.detailnew.controller.e.4
                    public static ChangeQuickRedirect a;

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i3) {
                        Object[] objArr2 = {dialogInterface, Integer.valueOf(i3)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5223209b792066de8f129bf83a2a7b3d", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5223209b792066de8f129bf83a2a7b3d");
                        } else if (TextUtils.isEmpty(str)) {
                        } else {
                            if (e.a(e.this)) {
                                i.a(e.this.c, e.b(e.this), e.c(e.this), str, i2, (DialContract.a) null);
                            } else {
                                i.c(e.this.c, str);
                            }
                        }
                    }
                };
            case 4:
                return new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.detailnew.controller.e.5
                    public static ChangeQuickRedirect a;

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i3) {
                        Object[] objArr2 = {dialogInterface, Integer.valueOf(i3)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ee0cc145a17b8668384fb8c1815d0041", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ee0cc145a17b8668384fb8c1815d0041");
                        } else if (TextUtils.isEmpty(e.this.e.b)) {
                        } else {
                            e.this.a(e.this.e.b, 1, bVar);
                        }
                    }
                };
            default:
                return null;
        }
    }

    public e(Activity activity, String str, a aVar) {
        Object[] objArr = {activity, str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "374c8cf603b88d29b0d952d4b263e39e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "374c8cf603b88d29b0d952d4b263e39e");
            return;
        }
        this.b = new Handler();
        this.g = new Runnable() { // from class: com.sankuai.waimai.bussiness.order.detailnew.controller.e.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3f39ab44476054fb9c39b2e6c3e03dc4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3f39ab44476054fb9c39b2e6c3e03dc4");
                } else if (!e.this.a()) {
                    e.this.b.removeCallbacks(e.this.g);
                } else {
                    e.this.b();
                    e.this.b.postDelayed(e.this.g, 1000L);
                }
            }
        };
        this.c = activity;
        this.h = str;
        this.f = aVar;
    }

    public boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d37ca824a50b6e5ff088681bd5157f72", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d37ca824a50b6e5ff088681bd5157f72")).booleanValue() : this.d != null && this.d.b >= 0;
    }

    private boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4969d6cc07701ffeb1145b0fbf08978", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4969d6cc07701ffeb1145b0fbf08978")).booleanValue();
        }
        if (this.d.a != this.e.l.m) {
            return false;
        }
        long j = this.e.l.i + (this.d.c * 60);
        long b = com.meituan.android.time.c.b() / 1000;
        return b > j || b > this.e.l.m;
    }

    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be89559489a9115d56e5d1a40409b89d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be89559489a9115d56e5d1a40409b89d");
        } else if (this.d == null || this.f == null) {
        } else {
            if (this.d.b != 0) {
                c();
            }
            this.d.b--;
        }
    }

    public final void a(com.sankuai.waimai.bussiness.order.detailnew.pgablock.root.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68e2e840d18b7aedebd40c0e6915ca7f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68e2e840d18b7aedebd40c0e6915ca7f");
        } else if (this.e == null || this.e.l == null || this.d == null) {
            com.sankuai.waimai.platform.capacity.log.i.d(new com.sankuai.waimai.bussiness.order.base.log.a().a("order_status_btn_click").b("click_push_order").c("response_data_empty").b());
        } else {
            String str = this.e.b;
            long j = this.e.l.m;
            long j2 = this.d.a;
            if (this.d.b <= 0 || c()) {
                a(str, 0, bVar);
                return;
            }
            long j3 = this.e.l.i + (this.d.c * 60);
            if (j2 == j) {
                if (j < j3) {
                    ae.a(this.c, this.c.getString(R.string.wm_order_less_than_delivery_time_2));
                } else {
                    ae.a(this.c, this.c.getString(R.string.wm_order_status_can_not_urge_order_right_now, new Object[]{Long.valueOf(this.d.c)}));
                }
                JudasManualManager.a("b_Ad9EN").a("order_id", this.e.b).a("reminder_status", 1).a("c_hgowsqb").a(this.c).a();
                return;
            }
            ae.a(this.c, this.c.getString(R.string.wm_order_let_poi_rest_awhile));
        }
    }

    void a(String str, final int i, final com.sankuai.waimai.bussiness.order.detailnew.pgablock.root.b bVar) {
        Object[] objArr = {str, Integer.valueOf(i), bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c4c64f25d2f2d9da81717d637329cf8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c4c64f25d2f2d9da81717d637329cf8");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            final Dialog a2 = com.sankuai.waimai.platform.widget.dialog.a.a(this.c);
            com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((OrderApi) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) OrderApi.class)).onekeyremind(str, String.valueOf(i), 0), new b.AbstractC1042b<BaseResponse<g>>() { // from class: com.sankuai.waimai.bussiness.order.detailnew.controller.e.2
                public static ChangeQuickRedirect a;

                @Override // rx.e
                public final /* synthetic */ void onNext(Object obj) {
                    BaseResponse baseResponse = (BaseResponse) obj;
                    Object[] objArr2 = {baseResponse};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0cd7df6f28f9727f93913f5cebe3419f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0cd7df6f28f9727f93913f5cebe3419f");
                        return;
                    }
                    com.sankuai.waimai.platform.widget.dialog.a.b(a2);
                    e.this.f.a();
                    if (baseResponse.code == 0 && baseResponse.data != 0) {
                        if (com.sankuai.waimai.foundation.utils.f.a(e.this.c) || i == 1) {
                            return;
                        }
                        g gVar = (g) baseResponse.data;
                        String str2 = gVar.a;
                        JudasManualManager.a("b_Ad9EN").a("order_id", e.this.e.b).a("reminder_status", 2).a("c_hgowsqb").a(e.this.c).a();
                        if (gVar.b != null) {
                            RooAlertDialog.a a3 = new RooAlertDialog.a(new ContextThemeWrapper(e.this.c, 2131558962)).a(false);
                            if (gVar.b.size() == 1) {
                                g.a aVar = gVar.b.get(0);
                                a3.a(str2).a(aVar.a, e.a(e.this, aVar.b, aVar.c, gVar.c, bVar)).b();
                                return;
                            } else if (gVar.b.size() == 2) {
                                g.a aVar2 = gVar.b.get(0);
                                g.a aVar3 = gVar.b.get(1);
                                String str3 = aVar2.a;
                                a3.a(str2).a(str3, e.a(e.this, aVar2.b, aVar2.c, gVar.c, bVar)).b(aVar3.a, e.a(e.this, aVar3.b, aVar3.c, gVar.c, bVar)).b();
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    }
                    String str4 = baseResponse.msg;
                    if (TextUtils.isEmpty(str4)) {
                        ae.a(e.this.c, str4);
                    } else {
                        ae.a(e.this.c, e.this.c.getResources().getString(R.string.wm_order_push_failed));
                    }
                    e.this.f.a();
                }

                @Override // rx.e
                public final void onError(Throwable th) {
                    Object[] objArr2 = {th};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "75be72ebeb77cd4db2b63304571c18b1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "75be72ebeb77cd4db2b63304571c18b1");
                        return;
                    }
                    com.sankuai.waimai.platform.widget.dialog.a.b(a2);
                    ae.a(e.this.c, e.this.c.getString(R.string.wm_order_push_failed));
                    e.this.f.a();
                }
            }, this.h);
        }
    }

    public static /* synthetic */ boolean a(e eVar) {
        return eVar.e != null && eVar.e.l.p == 1;
    }

    public static /* synthetic */ String b(e eVar) {
        return eVar.e != null ? eVar.e.b : "";
    }

    public static /* synthetic */ String c(e eVar) {
        return eVar.e != null ? eVar.e.i : "";
    }
}
