package com.sankuai.waimai.bussiness.order.detailnew.pgablock.rocks;

import android.content.Intent;
import android.os.Handler;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.base.net.OrderApi;
import com.sankuai.waimai.bussiness.order.detailnew.network.response.e;
import com.sankuai.waimai.bussiness.order.detailnew.pgablock.followarea.OrderFollowAreaInfo;
import com.sankuai.waimai.bussiness.order.detailnew.util.l;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class j extends com.meituan.android.cube.pga.block.a<com.sankuai.waimai.bussiness.order.detailnew.pgablock.followarea.redpacket.a, com.sankuai.waimai.bussiness.order.detailnew.pgablock.followarea.redpacket.b, com.sankuai.waimai.bussiness.order.detailnew.a> implements com.sankuai.waimai.bussiness.order.detailnew.controller.orderpopup.b, com.sankuai.waimai.bussiness.order.detailnew.pgablock.fixedarea.animation.b, l.b, l.c, l.d {
    public static ChangeQuickRedirect r;
    private View s;
    private FrameLayout t;
    private boolean u;

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3982a559aef079b53c8eaf17b757fa8f", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.bussiness.order.detailnew.pgablock.followarea.redpacket.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3982a559aef079b53c8eaf17b757fa8f") : new com.sankuai.waimai.bussiness.order.detailnew.pgablock.followarea.redpacket.b();
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ com.sankuai.waimai.bussiness.order.detailnew.pgablock.followarea.redpacket.a z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b80b92b20b06496bfa96fa202f8cd082", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.bussiness.order.detailnew.pgablock.followarea.redpacket.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b80b92b20b06496bfa96fa202f8cd082") : new com.sankuai.waimai.bussiness.order.detailnew.pgablock.followarea.redpacket.a(m(), this.h, this, this, this, this, this);
    }

    public j(com.sankuai.waimai.bussiness.order.detailnew.a aVar, ViewStub viewStub) {
        super(aVar, viewStub);
        Object[] objArr = {aVar, viewStub};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90443b602fe98b2e5702983f2048c0cc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90443b602fe98b2e5702983f2048c0cc");
        } else {
            this.u = false;
        }
    }

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9fdadaeff33d62d7fbc3e09ac2b8e165", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9fdadaeff33d62d7fbc3e09ac2b8e165");
            return;
        }
        super.s();
        ((com.sankuai.waimai.bussiness.order.detailnew.a) F()).y.b = new com.meituan.android.cube.pga.action.d<ImageView>() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.rocks.j.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final /* synthetic */ ImageView a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9f70f6c34314ccd6ccc24f9af191afed", RobustBitConfig.DEFAULT_VALUE) ? (ImageView) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9f70f6c34314ccd6ccc24f9af191afed") : (ImageView) j.this.i();
            }
        };
        ((com.sankuai.waimai.bussiness.order.detailnew.a) F()).z.b = new com.meituan.android.cube.pga.action.d<Boolean>() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.rocks.j.4
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final /* synthetic */ Boolean a() {
                boolean z = false;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d29ca21afb12202d4f858a33c840a820", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d29ca21afb12202d4f858a33c840a820");
                }
                com.sankuai.waimai.bussiness.order.detailnew.pgablock.followarea.redpacket.a aVar = (com.sankuai.waimai.bussiness.order.detailnew.pgablock.followarea.redpacket.a) j.this.g;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.bussiness.order.detailnew.pgablock.followarea.redpacket.a.d;
                if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "cc6cb456ee866b4dfc835fa44bb63dc3", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "cc6cb456ee866b4dfc835fa44bb63dc3")).booleanValue();
                } else if (aVar.e != null) {
                    z = aVar.e.d();
                }
                return Boolean.valueOf(z);
            }
        };
        ((com.sankuai.waimai.bussiness.order.detailnew.a) F()).ak.b = new com.meituan.android.cube.pga.action.d<Boolean>() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.rocks.j.5
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final /* synthetic */ Boolean a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "577f9d5a2f521fb53f88eea61256e125", RobustBitConfig.DEFAULT_VALUE) ? (Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "577f9d5a2f521fb53f88eea61256e125") : Boolean.valueOf(((com.sankuai.waimai.bussiness.order.detailnew.pgablock.followarea.redpacket.a) j.this.g).f);
            }
        };
        ((com.sankuai.waimai.bussiness.order.detailnew.a) F()).w.b = new com.meituan.android.cube.pga.action.d<Boolean>() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.rocks.j.6
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final /* synthetic */ Boolean a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7f9cc4b06745f5fb0cc9c02979fa8346", RobustBitConfig.DEFAULT_VALUE) ? (Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7f9cc4b06745f5fb0cc9c02979fa8346") : Boolean.valueOf(((com.sankuai.waimai.bussiness.order.detailnew.pgablock.followarea.redpacket.a) j.this.g).h);
            }
        };
        ((com.sankuai.waimai.bussiness.order.detailnew.a) F()).x.b = new com.meituan.android.cube.pga.action.d<Boolean>() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.rocks.j.7
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final /* synthetic */ Boolean a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cdf1305b5197e5dc0a1731b074468aa0", RobustBitConfig.DEFAULT_VALUE) ? (Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cdf1305b5197e5dc0a1731b074468aa0") : Boolean.valueOf(((com.sankuai.waimai.bussiness.order.detailnew.pgablock.followarea.redpacket.a) j.this.g).g);
            }
        };
        ((com.sankuai.waimai.bussiness.order.detailnew.a) F()).aa.b = new com.meituan.android.cube.pga.action.d() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.rocks.j.8
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final Object a() {
                boolean z = false;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1fb36fce27e6264b0450076affb53d62", RobustBitConfig.DEFAULT_VALUE)) {
                    return PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1fb36fce27e6264b0450076affb53d62");
                }
                j jVar = j.this;
                OrderFollowAreaInfo e = ((com.sankuai.waimai.bussiness.order.detailnew.pgablock.followarea.redpacket.b) j.this.n).e();
                Object[] objArr3 = {e};
                ChangeQuickRedirect changeQuickRedirect3 = j.r;
                if (PatchProxy.isSupport(objArr3, jVar, changeQuickRedirect3, false, "807428053aa5ccf1fa854b7bed3899cc", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr3, jVar, changeQuickRedirect3, false, "807428053aa5ccf1fa854b7bed3899cc")).booleanValue();
                } else if (e != null && !TextUtils.isEmpty(e.couponShareInfo)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        };
        ((com.sankuai.waimai.bussiness.order.detailnew.a) F()).n.a(new com.meituan.android.cube.pga.action.b<Intent>() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.rocks.j.9
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(Intent intent) {
                Object[] objArr2 = {intent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ec78cf61665a204e0e73ef0728c1fff7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ec78cf61665a204e0e73ef0728c1fff7");
                } else if (j.this.g == null || ((com.sankuai.waimai.bussiness.order.detailnew.pgablock.followarea.redpacket.a) j.this.g).e == null) {
                } else {
                    ((com.sankuai.waimai.bussiness.order.detailnew.pgablock.followarea.redpacket.a) j.this.g).e.d(false);
                }
            }
        });
        ((com.sankuai.waimai.bussiness.order.detailnew.a) F()).m.a(new com.meituan.android.cube.pga.action.a() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.rocks.j.10
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a846c299ba67b94de76d2c332c1ff6c1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a846c299ba67b94de76d2c332c1ff6c1");
                } else {
                    j.this.Q();
                }
            }
        });
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void I() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "346cbee8fe2967fb4c74b890d1f67fa2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "346cbee8fe2967fb4c74b890d1f67fa2");
            return;
        }
        super.I();
        ((com.sankuai.waimai.bussiness.order.detailnew.pgablock.followarea.redpacket.a) this.g).a(((com.sankuai.waimai.bussiness.order.detailnew.pgablock.followarea.redpacket.b) this.n).e());
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.util.l.d
    public final void N() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1605ace113acf0d4d4584e4945f96b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1605ace113acf0d4d4584e4945f96b1");
        } else {
            ((com.sankuai.waimai.bussiness.order.detailnew.a) F()).am.a((com.meituan.android.cube.pga.common.b<Integer>) 1);
        }
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.util.l.d
    public final void O() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbf8c836c3beee102a0f586a264c45c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbf8c836c3beee102a0f586a264c45c1");
            return;
        }
        if (((com.sankuai.waimai.bussiness.order.detailnew.pgablock.followarea.redpacket.b) this.n).e() != null) {
            ((com.sankuai.waimai.bussiness.order.detailnew.pgablock.followarea.redpacket.b) this.n).e().shouldPopupHongbao = false;
        }
        ((com.sankuai.waimai.bussiness.order.detailnew.a) F()).ao.a((com.meituan.android.cube.pga.common.b<Boolean>) Boolean.FALSE);
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.pgablock.fixedarea.animation.b
    public final void M() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d368b5f6c3c9b7a4e0847de56a507028", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d368b5f6c3c9b7a4e0847de56a507028");
            return;
        }
        Boolean valueOf = Boolean.valueOf(com.sankuai.waimai.bussiness.order.detailnew.util.a.a(((com.sankuai.waimai.bussiness.order.detailnew.a) F()).aa.a().b));
        if (valueOf == null || !valueOf.booleanValue()) {
            return;
        }
        ((com.sankuai.waimai.bussiness.order.detailnew.a) F()).Z.a((com.meituan.android.cube.pga.common.b<Integer>) 0);
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.orderpopup.b
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ed0851fbaff0719acbfb5a530c69e8b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ed0851fbaff0719acbfb5a530c69e8b");
        } else {
            ((com.sankuai.waimai.bussiness.order.detailnew.a) F()).ap.a((com.meituan.android.cube.pga.common.b<Boolean>) Boolean.valueOf(z));
        }
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.util.l.c
    public final void a(Window window) {
        e.a aVar;
        Object[] objArr = {window};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f982198f14540ad2ef50f3c6b8abb7e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f982198f14540ad2ef50f3c6b8abb7e1");
            return;
        }
        OrderFollowAreaInfo e = ((com.sankuai.waimai.bussiness.order.detailnew.pgablock.followarea.redpacket.b) this.n).e();
        Object[] objArr2 = {window, e};
        ChangeQuickRedirect changeQuickRedirect2 = r;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0a1be233849c4a1d22925185346014b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0a1be233849c4a1d22925185346014b7");
        } else if (window == null || e == null || !e.shouldPopupHongbao || e.feedInfo == null || this.u) {
        } else {
            View decorView = window.getDecorView();
            if (decorView instanceof FrameLayout) {
                FrameLayout frameLayout = (FrameLayout) decorView;
                ae.a(window);
                com.sankuai.waimai.bussiness.order.detailnew.network.response.e eVar = e.feedInfo;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.bussiness.order.detailnew.network.response.e.a;
                String str = PatchProxy.isSupport(objArr3, eVar, changeQuickRedirect3, false, "536af08e17f63fae5f8e721abe9d6928", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, eVar, changeQuickRedirect3, false, "536af08e17f63fae5f8e721abe9d6928") : aa.a(eVar.b) ? "订单即将同步到饭小圈" : eVar.b;
                com.sankuai.waimai.bussiness.order.detailnew.network.response.e eVar2 = e.feedInfo;
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.bussiness.order.detailnew.network.response.e.a;
                if (PatchProxy.isSupport(objArr4, eVar2, changeQuickRedirect4, false, "1249b137ac607ecb8f34e5525a9c7081", RobustBitConfig.DEFAULT_VALUE)) {
                    aVar = (e.a) PatchProxy.accessDispatch(objArr4, eVar2, changeQuickRedirect4, false, "1249b137ac607ecb8f34e5525a9c7081");
                } else {
                    if (eVar2.c == null) {
                        eVar2.c = new e.a();
                        eVar2.c.b = "点击取消";
                    }
                    aVar = eVar2.c;
                }
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = e.a.a;
                a(frameLayout, str, PatchProxy.isSupport(objArr5, aVar, changeQuickRedirect5, false, "583bb53836e9cf2ba640d3d68ca703b8", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr5, aVar, changeQuickRedirect5, false, "583bb53836e9cf2ba640d3d68ca703b8") : aa.a(aVar.b) ? "点击取消" : aVar.b);
                JudasManualManager.b("b_waimai_3li21v3b_mv", "c_hgowsqb", AppUtil.generatePageInfoKey(m())).a();
                this.u = true;
            }
        }
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.util.l.c
    public final void P() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ede984f654d305b64b91fed7d6d24e1d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ede984f654d305b64b91fed7d6d24e1d");
            return;
        }
        com.sankuai.waimai.platform.capacity.network.retrofit.b.a("orderSync");
        Q();
    }

    public final void Q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7734cf1029e8bb8cec15fe77292a0a02", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7734cf1029e8bb8cec15fe77292a0a02");
            return;
        }
        ae.a();
        if (this.s != null && this.s.getParent() != null) {
            ((ViewGroup) this.s.getParent()).removeView(this.s);
        }
        this.t = null;
    }

    void a(FrameLayout frameLayout, String str, String str2) {
        Object[] objArr = {frameLayout, str, str2};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce03210ef242c71a5429d015fc9dae91", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce03210ef242c71a5429d015fc9dae91");
            return;
        }
        if (this.s != null && this.s.getParent() != null) {
            ((ViewGroup) this.s.getParent()).removeView(this.s);
        }
        if (this.t == null && frameLayout != null) {
            this.t = frameLayout;
        }
        if (this.t != null) {
            this.s = LayoutInflater.from(m()).inflate(R.layout.wm_order_detail_order_sync_tip, (ViewGroup) this.t, false);
            TextView textView = (TextView) this.s.findViewById(R.id.tv_cancel_btn);
            ah.a((TextView) this.s.findViewById(R.id.tv_tip_content), str);
            ah.a(textView, str2);
            if (textView.getVisibility() == 0) {
                textView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.rocks.j.2
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "60724f41145d91bd8d6b2a6ce46c2cad", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "60724f41145d91bd8d6b2a6ce46c2cad");
                            return;
                        }
                        JudasManualManager.a("b_waimai_3li21v3b_mc", "c_hgowsqb", AppUtil.generatePageInfoKey(j.this.m())).a();
                        j.this.R();
                    }
                });
            }
            this.t.addView(this.s);
        }
    }

    public final void R() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "330ec8d6fee29275cea09d858d2fda07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "330ec8d6fee29275cea09d858d2fda07");
        } else if (((com.sankuai.waimai.bussiness.order.detailnew.pgablock.followarea.redpacket.b) this.n).e() == null) {
        } else {
            try {
                com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((OrderApi) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) OrderApi.class)).cancelOrderSync(((com.sankuai.waimai.bussiness.order.detailnew.pgablock.followarea.redpacket.b) this.n).e().orderId, ((com.sankuai.waimai.bussiness.order.detailnew.pgablock.followarea.redpacket.b) this.n).e().statusTime), new b.AbstractC1042b<BaseResponse<com.sankuai.waimai.bussiness.order.detailnew.network.response.c>>() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.rocks.j.3
                    public static ChangeQuickRedirect a;

                    @Override // rx.e
                    public final /* synthetic */ void onNext(Object obj) {
                        String str;
                        BaseResponse baseResponse = (BaseResponse) obj;
                        Object[] objArr2 = {baseResponse};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0b4b8ad904dcad64735383ebda872425", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0b4b8ad904dcad64735383ebda872425");
                        } else if (baseResponse != null && baseResponse.code == 0 && baseResponse.data != 0) {
                            final j jVar = j.this;
                            com.sankuai.waimai.bussiness.order.detailnew.network.response.c cVar = (com.sankuai.waimai.bussiness.order.detailnew.network.response.c) baseResponse.data;
                            Object[] objArr3 = {cVar};
                            ChangeQuickRedirect changeQuickRedirect3 = j.r;
                            if (PatchProxy.isSupport(objArr3, jVar, changeQuickRedirect3, false, "fd5e5f1283690a3c5d5994459afce502", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, jVar, changeQuickRedirect3, false, "fd5e5f1283690a3c5d5994459afce502");
                                return;
                            }
                            ae.a();
                            if (cVar != null) {
                                Object[] objArr4 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.bussiness.order.detailnew.network.response.c.a;
                                if (PatchProxy.isSupport(objArr4, cVar, changeQuickRedirect4, false, "30bae3b19936491299bf180df3565010", RobustBitConfig.DEFAULT_VALUE)) {
                                    str = (String) PatchProxy.accessDispatch(objArr4, cVar, changeQuickRedirect4, false, "30bae3b19936491299bf180df3565010");
                                } else {
                                    str = aa.a(cVar.b) ? "已取消，订单信息不会同步到饭小圈" : cVar.b;
                                }
                                jVar.a((FrameLayout) null, str, (String) null);
                                new Handler().postDelayed(new Runnable() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.rocks.j.11
                                    public static ChangeQuickRedirect a;

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        Object[] objArr5 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect5 = a;
                                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "76a9241deeeb6debd69e8af169733193", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "76a9241deeeb6debd69e8af169733193");
                                        } else {
                                            j.this.Q();
                                        }
                                    }
                                }, MetricsAnrManager.ANR_THRESHOLD);
                            }
                        } else {
                            ae.b(j.this.m(), j.this.m().getString(R.string.wm_order_detail_cancel_order_sync_fail));
                        }
                    }

                    @Override // rx.e
                    public final void onError(Throwable th) {
                        Object[] objArr2 = {th};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f3093f62ae39c429aa0bfdcfdca11c51", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f3093f62ae39c429aa0bfdcfdca11c51");
                        } else {
                            ae.b(j.this.m(), j.this.m().getString(R.string.wm_order_detail_cancel_order_sync_fail));
                        }
                    }
                }, "orderSync");
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.util.l.b
    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45b3cce4bc1497bbf7a5dccf50178bde", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45b3cce4bc1497bbf7a5dccf50178bde");
        } else {
            ((com.sankuai.waimai.bussiness.order.detailnew.a) F()).an.a((com.meituan.android.cube.pga.common.b<String>) str);
        }
    }
}
