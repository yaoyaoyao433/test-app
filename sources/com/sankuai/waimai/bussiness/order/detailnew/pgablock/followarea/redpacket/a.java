package com.sankuai.waimai.bussiness.order.detailnew.pgablock.followarea.redpacket;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.ViewStub;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.detail.network.response.EnvelopeShareTip;
import com.sankuai.waimai.bussiness.order.detailnew.controller.orderpopup.IPushPopupWindowController;
import com.sankuai.waimai.bussiness.order.detailnew.controller.orderpopup.c;
import com.sankuai.waimai.bussiness.order.detailnew.pgablock.followarea.OrderFollowAreaInfo;
import com.sankuai.waimai.bussiness.order.detailnew.util.k;
import com.sankuai.waimai.bussiness.order.detailnew.util.l;
import com.sankuai.waimai.foundation.core.service.abtest.ABStrategy;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.capacity.abtest.ABTestManager;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.meituan.android.cube.pga.view.a {
    public static ChangeQuickRedirect d;
    public c e;
    public boolean f;
    public boolean g;
    public boolean h;
    l.d i;
    private IPushPopupWindowController j;
    private ImageView k;
    private com.sankuai.waimai.bussiness.order.detailnew.pgablock.fixedarea.animation.b l;
    private com.sankuai.waimai.bussiness.order.detailnew.controller.orderpopup.b m;
    private l.c n;
    private l.b o;

    @Override // com.meituan.android.cube.pga.view.a
    public final int d() {
        return R.layout.wm_order_detail_view_redpackt_float_area;
    }

    public static /* synthetic */ boolean a(a aVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "6d4d799f835178a1545c805a356ad84c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "6d4d799f835178a1545c805a356ad84c")).booleanValue() : Build.VERSION.SDK_INT >= 17 && ((Activity) aVar.c).isDestroyed();
    }

    public a(Context context, @Nullable ViewStub viewStub, l.d dVar, com.sankuai.waimai.bussiness.order.detailnew.pgablock.fixedarea.animation.b bVar, l.c cVar, l.b bVar2, com.sankuai.waimai.bussiness.order.detailnew.controller.orderpopup.b bVar3) {
        super(context, viewStub);
        Object[] objArr = {context, viewStub, dVar, bVar, cVar, bVar2, bVar3};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2de1a50d5deeb63afae200c4041771d5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2de1a50d5deeb63afae200c4041771d5");
            return;
        }
        this.i = dVar;
        this.l = bVar;
        this.n = cVar;
        this.o = bVar2;
        this.m = bVar3;
    }

    @Override // com.meituan.android.cube.pga.view.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cbee01ee3b5f2629a16fc79386764616", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cbee01ee3b5f2629a16fc79386764616");
            return;
        }
        super.b();
        this.k = (ImageView) this.b.findViewById(R.id.img_floating_hongbao);
        if (com.sankuai.waimai.foundation.core.a.d()) {
            this.j = (IPushPopupWindowController) com.sankuai.waimai.router.a.a(IPushPopupWindowController.class, "push_popup_window_controller", this.c);
        }
    }

    public final void a(final OrderFollowAreaInfo orderFollowAreaInfo) {
        boolean equalsIgnoreCase;
        Object[] objArr = {orderFollowAreaInfo};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c275242f97bde82ef9ad139031b3656f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c275242f97bde82ef9ad139031b3656f");
            return;
        }
        byte b = orderFollowAreaInfo != null ? orderFollowAreaInfo.shouldPopupHongbao ? 1 : 0 : (byte) 0;
        Object[] objArr2 = {orderFollowAreaInfo, Byte.valueOf(b)};
        ChangeQuickRedirect changeQuickRedirect2 = d;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dd774dae05ff7c882a4d2f0eb7025a58", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dd774dae05ff7c882a4d2f0eb7025a58");
        } else if ((b == 0 || !k.a(orderFollowAreaInfo)) && this.j != null) {
            Context context = this.c;
            Object[] objArr3 = {context};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.bussiness.order.base.abtest.a.a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "b44a5e5d4ba9cbea0177366236d03a5f", RobustBitConfig.DEFAULT_VALUE)) {
                equalsIgnoreCase = ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "b44a5e5d4ba9cbea0177366236d03a5f")).booleanValue();
            } else {
                ABStrategy strategy = ABTestManager.getInstance(context).getStrategy(com.sankuai.waimai.foundation.core.a.d() ? com.sankuai.waimai.bussiness.order.base.abtest.a.b : com.sankuai.waimai.bussiness.order.base.abtest.a.c, null);
                equalsIgnoreCase = (strategy == null || TextUtils.isEmpty(strategy.expName)) ? false : strategy.expName.equalsIgnoreCase("A");
            }
            if (equalsIgnoreCase) {
                this.j.showPermissionPop();
                this.g = this.j.hasPushPopShowed();
                this.h = this.j.isPushPopShowing();
            }
        }
        if ((this.j == null || !this.j.isPushPopShowing()) && orderFollowAreaInfo != null) {
            Object[] objArr4 = {orderFollowAreaInfo};
            ChangeQuickRedirect changeQuickRedirect4 = d;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "f13fac3645995ffd05cf06aa62206991", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "f13fac3645995ffd05cf06aa62206991");
                return;
            }
            if (this.e == null) {
                this.e = new c((Activity) this.c, this.k);
                this.e.t = this.l;
                this.e.u = this.m;
                this.e.a(this.n);
                this.e.a(this.o);
                this.e.a(new l.e() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.followarea.redpacket.a.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.bussiness.order.detailnew.util.l.e
                    public final void a(boolean z, EnvelopeShareTip envelopeShareTip, String str) {
                        Object[] objArr5 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), envelopeShareTip, str};
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "3defebd79512adf078c02087086f6300", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "3defebd79512adf078c02087086f6300");
                        } else if (a.this.e() || a.a(a.this)) {
                        } else {
                            a.this.f = true;
                            if (!z || envelopeShareTip == null || TextUtils.isEmpty(str)) {
                                return;
                            }
                            l.a((Activity) a.this.c, str, envelopeShareTip, "c_hgowsqb", new com.sankuai.waimai.foundation.core.service.share.listener.b() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.followarea.redpacket.a.1.1
                                public static ChangeQuickRedirect a;

                                @Override // com.sankuai.waimai.foundation.core.service.share.listener.b
                                public final void a(int i, int i2) {
                                    Object[] objArr6 = {Integer.valueOf(i), Integer.valueOf(i2)};
                                    ChangeQuickRedirect changeQuickRedirect6 = a;
                                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "0814c7b431e9a587fb71fb1626e42cd0", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "0814c7b431e9a587fb71fb1626e42cd0");
                                        return;
                                    }
                                    a.this.f = false;
                                    if (a.this.i != null) {
                                        a.this.i.N();
                                    }
                                }
                            });
                            if (TextUtils.isEmpty(orderFollowAreaInfo.orderId)) {
                                return;
                            }
                            JudasManualManager.a("b_SAAAL").a("orderid", orderFollowAreaInfo.orderId).a("channel_id", 2).a("c_hgowsqb").a(a.this.c).a();
                        }
                    }

                    @Override // com.sankuai.waimai.bussiness.order.detailnew.util.l.e
                    public final void a(int[] iArr, String str) {
                        Object[] objArr5 = {iArr, str};
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "7cfb5a5cb9277622686b3684a14f9475", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "7cfb5a5cb9277622686b3684a14f9475");
                        } else if (iArr != null && a.this.e != null) {
                            for (int i : iArr) {
                                a.this.e.a(i, str);
                            }
                        }
                    }
                });
            }
            if (this.h) {
                return;
            }
            this.e.a(orderFollowAreaInfo.shouldPopupHongbao);
            this.e.a(orderFollowAreaInfo, orderFollowAreaInfo.poiId, orderFollowAreaInfo.poiIdStr);
            this.i.O();
        }
    }

    public final boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e28ba04a908e95635713bdfca5a980b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e28ba04a908e95635713bdfca5a980b")).booleanValue() : ((Activity) this.c).isFinishing();
    }
}
