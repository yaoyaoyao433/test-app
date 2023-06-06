package com.sankuai.waimai.bussiness.order.crossconfirm.block.root;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Build;
import android.support.constraint.R;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.detailnew.widget.ObservableScrollView;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class g extends com.meituan.android.cube.pga.block.a<i, j, com.sankuai.waimai.bussiness.order.crossconfirm.a> {
    public static ChangeQuickRedirect r;
    private com.sankuai.waimai.bussiness.order.crossconfirm.block.crossorder.a s;
    private boolean t;
    private Rect u;
    private Rect v;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v2 */
    public static /* synthetic */ void a(g gVar, ScrollView scrollView) {
        ArrayList<com.meituan.android.cube.pga.block.a> arrayList;
        Rect rect;
        int i = 0;
        Object[] objArr = {scrollView};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, gVar, changeQuickRedirect, false, "3636ae40a9f7cff26a56d308b8079ea7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, gVar, changeQuickRedirect, false, "3636ae40a9f7cff26a56d308b8079ea7");
            return;
        }
        ArrayList<com.meituan.android.cube.pga.block.a> q = gVar.s.q();
        int i2 = 0;
        while (i2 < q.size()) {
            com.meituan.android.cube.pga.block.a aVar = q.get(i2);
            if (aVar instanceof com.sankuai.waimai.bussiness.order.crossconfirm.block.singlestoreorder.a) {
                View i3 = aVar.i();
                Object[] objArr2 = new Object[i];
                ChangeQuickRedirect changeQuickRedirect2 = r;
                if (PatchProxy.isSupport(objArr2, gVar, changeQuickRedirect2, false, "1e09ebe1d100c63018483cd765b2f4df", RobustBitConfig.DEFAULT_VALUE)) {
                    rect = (Rect) PatchProxy.accessDispatch(objArr2, gVar, changeQuickRedirect2, i, "1e09ebe1d100c63018483cd765b2f4df");
                    arrayList = q;
                } else {
                    if (gVar.u == null) {
                        int i4 = gVar.m().getResources().getDisplayMetrics().widthPixels;
                        int i5 = gVar.m().getResources().getDisplayMetrics().heightPixels;
                        Object[] objArr3 = new Object[i];
                        ChangeQuickRedirect changeQuickRedirect3 = r;
                        arrayList = q;
                        gVar.u = new Rect(0, (PatchProxy.isSupport(objArr3, gVar, changeQuickRedirect3, false, "26d5dccf4249d6ba5dab835a91a443e5", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr3, gVar, changeQuickRedirect3, false, "26d5dccf4249d6ba5dab835a91a443e5")).intValue() : com.sankuai.waimai.foundation.utils.g.a(com.meituan.android.singleton.b.a, 100.0f)) + (com.sankuai.waimai.platform.capacity.immersed.a.a((Activity) gVar.l()) ? com.sankuai.waimai.foundation.utils.g.e(gVar.l()) : 0), i4, i5 - gVar.M());
                    } else {
                        arrayList = q;
                    }
                    rect = gVar.u;
                }
                if (com.meituan.android.cube.util.a.a(i3, rect)) {
                    ((com.sankuai.waimai.bussiness.order.crossconfirm.a) gVar.F()).S.a((com.meituan.android.cube.pga.common.j<Integer>) Integer.valueOf(((j) gVar.n).a(((com.sankuai.waimai.bussiness.order.crossconfirm.block.singlestoreorder.e) ((com.sankuai.waimai.bussiness.order.crossconfirm.block.singlestoreorder.a) aVar).G()).e())));
                    return;
                }
            } else {
                arrayList = q;
            }
            i2++;
            q = arrayList;
            i = 0;
        }
    }

    public static /* synthetic */ void a(g gVar, final com.meituan.android.cube.pga.block.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, gVar, changeQuickRedirect, false, "dfff9ef32e4b14d406aeac8a96be002f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, gVar, changeQuickRedirect, false, "dfff9ef32e4b14d406aeac8a96be002f");
            return;
        }
        final ObservableScrollView a = ((i) gVar.g).a();
        if (a != null) {
            a.post(new Runnable() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.root.g.7
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fd79f3bfe81c7f90115b994d5d3f0d05", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fd79f3bfe81c7f90115b994d5d3f0d05");
                    } else {
                        a.smoothScrollTo(0, aVar.i().getTop());
                    }
                }
            });
        }
    }

    public static /* synthetic */ Rect c(g gVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, gVar, changeQuickRedirect, false, "e4ce1b1626df7189efcb93fe626024a8", RobustBitConfig.DEFAULT_VALUE)) {
            return (Rect) PatchProxy.accessDispatch(objArr, gVar, changeQuickRedirect, false, "e4ce1b1626df7189efcb93fe626024a8");
        }
        if (gVar.v == null) {
            gVar.v = new Rect(0, 0, gVar.m().getResources().getDisplayMetrics().widthPixels, gVar.m().getResources().getDisplayMetrics().heightPixels);
            if (com.sankuai.waimai.platform.capacity.immersed.a.a((Activity) gVar.l())) {
                com.sankuai.waimai.foundation.utils.g.e(gVar.l());
            }
            gVar.v.bottom -= gVar.M();
        }
        return gVar.v;
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d491dbe3b5e1d51aba79f30204fbd39", RobustBitConfig.DEFAULT_VALUE) ? (j) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d491dbe3b5e1d51aba79f30204fbd39") : new j();
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ i z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95dcd2617dc04e860095fb00aa1cef2a", RobustBitConfig.DEFAULT_VALUE) ? (i) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95dcd2617dc04e860095fb00aa1cef2a") : new i(m(), this.h);
    }

    public g(com.sankuai.waimai.bussiness.order.crossconfirm.a aVar, ViewStub viewStub) {
        super(aVar, viewStub);
        Object[] objArr = {aVar, viewStub};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae598c90781d286e5d3689332e5eee2b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae598c90781d286e5d3689332e5eee2b");
        } else {
            this.t = false;
        }
    }

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad7a32adedd03f8852f537435582e927", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad7a32adedd03f8852f537435582e927");
            return;
        }
        super.s();
        ObservableScrollView observableScrollView = (ObservableScrollView) i();
        ((com.sankuai.waimai.bussiness.order.crossconfirm.a) F()).N.b = new com.meituan.android.cube.pga.action.d() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.root.g.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final Object a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "787bc9e3e2e3f05e826658746a9ddba0", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "787bc9e3e2e3f05e826658746a9ddba0") : g.this.i();
            }
        };
        ((com.sankuai.waimai.bussiness.order.crossconfirm.a) F()).O.b = new com.meituan.android.cube.pga.action.d() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.root.g.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final Object a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "40d9b0daf0fc130c9e1f69d2204f81ce", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "40d9b0daf0fc130c9e1f69d2204f81ce") : g.this.i().findViewById(R.id.bg_head_title);
            }
        };
        ((com.sankuai.waimai.bussiness.order.crossconfirm.a) F()).Q.a(new com.meituan.android.cube.pga.action.b<Integer>() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.root.g.3
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(Integer num) {
                Integer num2 = num;
                Object[] objArr2 = {num2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a5e8d20692e8716d5779d501fa9b60db", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a5e8d20692e8716d5779d501fa9b60db");
                    return;
                }
                ArrayList<com.meituan.android.cube.pga.block.a> q = g.this.s.q();
                for (int i = 0; i < q.size() && num2.intValue() >= 0; i++) {
                    com.meituan.android.cube.pga.block.a aVar = q.get(i);
                    if (aVar instanceof com.sankuai.waimai.bussiness.order.crossconfirm.block.singlestoreorder.a) {
                        if (num2.intValue() == 0) {
                            g.a(g.this, aVar);
                            return;
                        }
                        num2 = Integer.valueOf(num2.intValue() - 1);
                    }
                }
            }
        });
        ((com.sankuai.waimai.bussiness.order.crossconfirm.a) F()).R.a(new com.meituan.android.cube.pga.action.b<Integer>() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.root.g.4
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(Integer num) {
                Integer num2 = num;
                Object[] objArr2 = {num2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2350c0a27f175fe9d19f6d0eaef6b992", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2350c0a27f175fe9d19f6d0eaef6b992");
                    return;
                }
                ArrayList<com.meituan.android.cube.pga.block.a> q = g.this.s.q();
                for (int i = 0; i < q.size(); i++) {
                    com.meituan.android.cube.pga.block.a aVar = q.get(i);
                    if ((aVar instanceof com.sankuai.waimai.bussiness.order.crossconfirm.block.singlestoreorder.a) && ((com.sankuai.waimai.bussiness.order.crossconfirm.block.singlestoreorder.e) ((com.sankuai.waimai.bussiness.order.crossconfirm.block.singlestoreorder.a) aVar).G()).e().poiInfo.poiId == num2.intValue()) {
                        g.a(g.this, aVar);
                        return;
                    }
                }
            }
        });
        final int e = N() ? com.sankuai.waimai.foundation.utils.g.e(com.meituan.android.singleton.b.a) : 0;
        final int dimensionPixelSize = com.meituan.android.singleton.b.a.getResources().getDimensionPixelSize(R.dimen.wm_order_cross_confirm_title_change_height);
        ((i) this.g).a().setOnScrollListener(new ObservableScrollView.b() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.root.g.5
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.bussiness.order.detailnew.widget.ObservableScrollView.b
            public final void a(ObservableScrollView observableScrollView2, int i) {
                Object[] objArr2 = {observableScrollView2, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a81721e68ae25e9a8d26d3c38e221695", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a81721e68ae25e9a8d26d3c38e221695");
                    return;
                }
                if (i == 1) {
                    g.this.t = true;
                }
                if (i == 0) {
                    g.this.t = false;
                }
                com.sankuai.waimai.foundation.utils.log.a.b("Scroll State:", String.valueOf(i), new Object[0]);
            }

            /* JADX WARN: Code restructure failed: missing block: B:20:0x0074, code lost:
                if (r13 > r11) goto L16;
             */
            /* JADX WARN: Removed duplicated region for block: B:25:0x00aa  */
            /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
            @Override // com.sankuai.waimai.bussiness.order.detailnew.widget.ObservableScrollView.b
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void a(com.sankuai.waimai.bussiness.order.detailnew.widget.ObservableScrollView r10, boolean r11, int r12, int r13, int r14, int r15) {
                /*
                    r9 = this;
                    r0 = 6
                    java.lang.Object[] r0 = new java.lang.Object[r0]
                    r8 = 0
                    r0[r8] = r10
                    java.lang.Byte r11 = java.lang.Byte.valueOf(r11)
                    r1 = 1
                    r0[r1] = r11
                    java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
                    r12 = 2
                    r0[r12] = r11
                    java.lang.Integer r11 = java.lang.Integer.valueOf(r13)
                    r12 = 3
                    r0[r12] = r11
                    java.lang.Integer r11 = java.lang.Integer.valueOf(r14)
                    r12 = 4
                    r0[r12] = r11
                    java.lang.Integer r11 = java.lang.Integer.valueOf(r15)
                    r12 = 5
                    r0[r12] = r11
                    com.meituan.robust.ChangeQuickRedirect r11 = com.sankuai.waimai.bussiness.order.crossconfirm.block.root.g.AnonymousClass5.a
                    java.lang.String r12 = "83c0af93965f5d34ac407c1b3d626ae9"
                    r4 = 0
                    r6 = 4611686018427387904(0x4000000000000000, double:2.0)
                    r1 = r0
                    r2 = r9
                    r3 = r11
                    r5 = r12
                    boolean r14 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
                    if (r14 == 0) goto L3e
                    com.meituan.robust.PatchProxy.accessDispatch(r0, r9, r11, r8, r12)
                    return
                L3e:
                    int r11 = r2
                    int r12 = r3
                    int r11 = r11 + r12
                    r12 = 1065353216(0x3f800000, float:1.0)
                    r14 = 0
                    if (r13 < 0) goto L50
                    int r15 = r13 * 3
                    if (r15 > r11) goto L50
                    float r15 = (float) r15
                    float r0 = (float) r11
                    float r15 = r15 / r0
                    goto L58
                L50:
                    int r15 = r13 * 3
                    if (r15 <= r11) goto L57
                    r15 = 1065353216(0x3f800000, float:1.0)
                    goto L58
                L57:
                    r15 = 0
                L58:
                    com.sankuai.waimai.bussiness.order.crossconfirm.block.root.g r0 = com.sankuai.waimai.bussiness.order.crossconfirm.block.root.g.this
                    com.meituan.android.cube.pga.type.a r0 = r0.F()
                    com.sankuai.waimai.bussiness.order.crossconfirm.a r0 = (com.sankuai.waimai.bussiness.order.crossconfirm.a) r0
                    com.meituan.android.cube.pga.common.g<java.lang.Integer> r0 = r0.D
                    com.meituan.android.cube.pga.common.d r0 = r0.a()
                    int r0 = r0.c()
                    if (r0 != 0) goto L77
                    if (r13 < 0) goto L74
                    if (r13 > r11) goto L74
                    float r12 = (float) r13
                    float r11 = (float) r11
                    float r12 = r12 / r11
                    goto L78
                L74:
                    if (r13 <= r11) goto L77
                    goto L78
                L77:
                    r12 = 0
                L78:
                    com.sankuai.waimai.bussiness.order.crossconfirm.block.root.g r11 = com.sankuai.waimai.bussiness.order.crossconfirm.block.root.g.this
                    com.meituan.android.cube.pga.type.a r11 = r11.F()
                    com.sankuai.waimai.bussiness.order.crossconfirm.a r11 = (com.sankuai.waimai.bussiness.order.crossconfirm.a) r11
                    com.meituan.android.cube.pga.common.b<com.meituan.android.cube.pga.common.i$c<java.lang.Float, java.lang.Float>> r11 = r11.V
                    java.lang.Float r13 = java.lang.Float.valueOf(r15)
                    java.lang.Float r14 = java.lang.Float.valueOf(r12)
                    com.meituan.android.cube.pga.common.i$c r13 = com.meituan.android.cube.pga.common.i.a(r13, r14)
                    r11.a(r13)
                    com.sankuai.waimai.bussiness.order.crossconfirm.block.root.g r11 = com.sankuai.waimai.bussiness.order.crossconfirm.block.root.g.this
                    com.meituan.android.cube.pga.type.a r11 = r11.F()
                    com.sankuai.waimai.bussiness.order.crossconfirm.a r11 = (com.sankuai.waimai.bussiness.order.crossconfirm.a) r11
                    com.meituan.android.cube.pga.common.b<java.lang.Float> r11 = r11.W
                    java.lang.Float r12 = java.lang.Float.valueOf(r12)
                    r11.a(r12)
                    com.sankuai.waimai.bussiness.order.crossconfirm.block.root.g r11 = com.sankuai.waimai.bussiness.order.crossconfirm.block.root.g.this
                    boolean r11 = com.sankuai.waimai.bussiness.order.crossconfirm.block.root.g.b(r11)
                    if (r11 == 0) goto Laf
                    com.sankuai.waimai.bussiness.order.crossconfirm.block.root.g r11 = com.sankuai.waimai.bussiness.order.crossconfirm.block.root.g.this
                    com.sankuai.waimai.bussiness.order.crossconfirm.block.root.g.a(r11, r10)
                Laf:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.bussiness.order.crossconfirm.block.root.g.AnonymousClass5.a(com.sankuai.waimai.bussiness.order.detailnew.widget.ObservableScrollView, boolean, int, int, int, int):void");
            }
        });
        observableScrollView.setOnExposeListener(new ObservableScrollView.a() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.root.g.6
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.bussiness.order.detailnew.widget.ObservableScrollView.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "221711820c5d458227ea0af05a7eca9b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "221711820c5d458227ea0af05a7eca9b");
                } else {
                    g.this.a(g.c(g.this));
                }
            }
        });
        ViewStub viewStub = (ViewStub) i().findViewById(R.id.cross_order_scroll_container);
        Object[] objArr2 = {viewStub};
        ChangeQuickRedirect changeQuickRedirect2 = r;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "275e6989f0e2447c1580c99a8a0ced9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "275e6989f0e2447c1580c99a8a0ced9c");
        } else if (viewStub != null && N()) {
            int e2 = com.sankuai.waimai.foundation.utils.g.e(com.meituan.android.singleton.b.a);
            int dimensionPixelSize2 = com.meituan.android.singleton.b.a.getResources().getDimensionPixelSize(R.dimen.actionbar_height);
            ViewGroup.LayoutParams layoutParams = viewStub.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = e2 + dimensionPixelSize2;
                viewStub.setLayoutParams(marginLayoutParams);
            }
        }
        this.s = new com.sankuai.waimai.bussiness.order.crossconfirm.block.crossorder.a((com.sankuai.waimai.bussiness.order.crossconfirm.a) F(), viewStub);
        a((com.meituan.android.cube.pga.block.a) this.s);
    }

    private int M() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "569c3f07a1a215faafe093d1ee8ba06f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "569c3f07a1a215faafe093d1ee8ba06f")).intValue();
        }
        LinearLayout linearLayout = ((com.sankuai.waimai.bussiness.order.crossconfirm.a) F()).ae.a().b;
        if (linearLayout == null || linearLayout.getVisibility() != 0) {
            return 0;
        }
        return linearLayout.getHeight();
    }

    private static boolean N() {
        return Build.VERSION.SDK_INT >= 23;
    }
}
