package com.sankuai.waimai.ad;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.gson.GsonBuilder;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.cube.annotation.DynamicBinder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.ad.b;
import com.sankuai.waimai.foundation.core.service.abtest.ABStrategy;
import com.sankuai.waimai.foundation.location.v2.WmAddress;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.foundation.utils.k;
import com.sankuai.waimai.mach.utils.GsonTypeAdapter;
import com.sankuai.waimai.pouch.a;
import com.sankuai.waimai.pouch.model.PouchDynamicAd;
import com.sankuai.waimai.pouch.model.c;
import com.sankuai.waimai.rocks.model.RocksServerModel;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
@DynamicBinder(modelType = PouchDynamicAd.class, nativeId = {"wm_pouch_common_element"}, viewModel = a.class)
/* loaded from: classes4.dex */
public class c extends com.sankuai.waimai.rocks.view.block.b<PouchDynamicAd> implements a.b, c.a {
    public static ChangeQuickRedirect r;
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private b.c w;
    private Rect x;
    private boolean y;
    private com.sankuai.waimai.pouch.a z;

    /* JADX WARN: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0292  */
    /* JADX WARN: Type inference failed for: r1v40, types: [com.meituan.android.cube.pga.viewmodel.a] */
    /* JADX WARN: Type inference failed for: r1v43, types: [com.meituan.android.cube.pga.viewmodel.a] */
    @Override // com.sankuai.waimai.rocks.view.block.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void d(com.sankuai.waimai.pouch.model.PouchDynamicAd r26) {
        /*
            Method dump skipped, instructions count: 859
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.ad.c.d(java.lang.Object):void");
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [com.meituan.android.cube.pga.viewmodel.a] */
    /* JADX WARN: Type inference failed for: r0v19, types: [com.meituan.android.cube.pga.viewmodel.a] */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.meituan.android.cube.pga.viewmodel.a] */
    public static /* synthetic */ void a(c cVar, int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "a03451e4fbe316a02bdf1e98d23b53b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "a03451e4fbe316a02bdf1e98d23b53b5");
        } else if (cVar.u != null) {
            ViewGroup.LayoutParams layoutParams = cVar.u.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.leftMargin = g.a(cVar.t, i) * (-1);
                marginLayoutParams.rightMargin = g.a(cVar.t, i2) * (-1);
                Object[] objArr2 = {marginLayoutParams};
                ChangeQuickRedirect changeQuickRedirect2 = r;
                if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "09ec679aff60d0e52f9115fc29f3e41a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "09ec679aff60d0e52f9115fc29f3e41a");
                } else if (cVar.G() != 0 && cVar.G().j() != null) {
                    int i3 = cVar.G().j().a;
                    int i4 = cVar.G().j().b;
                    com.sankuai.waimai.pouch.a Q = cVar.Q();
                    if (Q != null && Q.b() != null && Q.b().getRootNode() != null) {
                        int t = Q.b().getRootNode().t();
                        if (i3 != 0) {
                            if (t <= g.a(cVar.t, 1.0f)) {
                                marginLayoutParams.topMargin = 0;
                            } else {
                                marginLayoutParams.topMargin = g.a(cVar.t, i3);
                            }
                        }
                        if (i4 != 0) {
                            if (t <= g.a(cVar.t, 1.0f)) {
                                marginLayoutParams.bottomMargin = 0;
                            } else {
                                marginLayoutParams.bottomMargin = g.a(cVar.t, i4);
                            }
                        }
                    } else {
                        marginLayoutParams.topMargin = g.a(cVar.t, i3);
                        marginLayoutParams.bottomMargin = g.a(cVar.t, i4);
                    }
                }
                cVar.u.setLayoutParams(layoutParams);
            }
        }
    }

    public static /* synthetic */ void a(c cVar, Boolean bool) {
        Object[] objArr = {bool};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "53b202a2dfcaf4eb55d071bbccc22e8a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "53b202a2dfcaf4eb55d071bbccc22e8a");
            return;
        }
        com.sankuai.waimai.pouch.a Q = cVar.Q();
        if (Q == null || bool == null) {
            return;
        }
        if (bool.booleanValue()) {
            Object[] objArr2 = new Object[1];
            objArr2[0] = Integer.valueOf(cVar.v != 0 ? ((PouchDynamicAd) cVar.v).index : -1);
            com.sankuai.waimai.foundation.utils.log.a.b("RocksAdPouchBlock", "clear by change tab: %d", objArr2);
            Q.c();
            Q.e();
            cVar.y = false;
            return;
        }
        cVar.y = true;
        Q.i = "change_tab";
        if (cVar.N()) {
            Object[] objArr3 = new Object[1];
            objArr3[0] = Integer.valueOf(cVar.v != 0 ? ((PouchDynamicAd) cVar.v).index : -1);
            com.sankuai.waimai.foundation.utils.log.a.b("RocksAdPouchBlock", "expose by change tab: %d", objArr3);
            if (!cVar.O()) {
                Q.a();
            }
            Q.d();
        }
    }

    public static /* synthetic */ boolean c(c cVar, boolean z) {
        cVar.A = true;
        return true;
    }

    public static /* synthetic */ void k(c cVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "986b7096718ae0549b2e244f69c1d1e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "986b7096718ae0549b2e244f69c1d1e3");
        } else if (cVar.i() != null) {
            cVar.i().post(new Runnable() { // from class: com.sankuai.waimai.ad.c.9
                public static ChangeQuickRedirect a;

                /* JADX WARN: Type inference failed for: r2v28, types: [com.meituan.android.cube.pga.viewmodel.a] */
                /* JADX WARN: Type inference failed for: r2v31, types: [com.meituan.android.cube.pga.viewmodel.a] */
                /* JADX WARN: Type inference failed for: r3v6, types: [com.meituan.android.cube.pga.viewmodel.a] */
                @Override // java.lang.Runnable
                public final void run() {
                    int i;
                    int i2;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a1d5d3415683f6674d2796a65c0601dc", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a1d5d3415683f6674d2796a65c0601dc");
                        return;
                    }
                    ViewGroup.LayoutParams layoutParams = c.this.i().getLayoutParams();
                    if (layoutParams instanceof RecyclerView.g) {
                        int x = (int) c.this.i().getX();
                        if (x != 0) {
                            RecyclerView.g gVar = (RecyclerView.g) layoutParams;
                            gVar.leftMargin = x * (-1);
                            gVar.rightMargin = ((int) ((g.a(c.this.m()) - c.this.i().getWidth()) - c.this.i().getX())) * (-1);
                        }
                        if (c.this.G() == 0 || c.this.G().j() == null) {
                            i = 0;
                            i2 = 0;
                        } else {
                            i = c.this.G().j().a;
                            i2 = c.this.G().j().b;
                        }
                        com.sankuai.waimai.pouch.a Q = c.this.Q();
                        if (Q != null && Q.b() != null && Q.b().getRootNode() != null) {
                            int t = Q.b().getRootNode().t();
                            if (i != 0) {
                                if (t > g.a(c.this.t, 1.0f)) {
                                    ((RecyclerView.g) layoutParams).topMargin = g.a(c.this.t, i);
                                } else {
                                    ((RecyclerView.g) layoutParams).topMargin = 0;
                                }
                            }
                            if (i2 != 0) {
                                if (t > g.a(c.this.t, 1.0f)) {
                                    ((RecyclerView.g) layoutParams).bottomMargin = g.a(c.this.t, i2);
                                } else {
                                    ((RecyclerView.g) layoutParams).bottomMargin = 0;
                                }
                            }
                        } else {
                            RecyclerView.g gVar2 = (RecyclerView.g) layoutParams;
                            gVar2.topMargin = g.a(c.this.t, i);
                            gVar2.bottomMargin = g.a(c.this.t, i2);
                        }
                        c.this.i().setLayoutParams(layoutParams);
                    }
                }
            });
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.meituan.android.cube.pga.type.a] */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.meituan.android.cube.pga.type.a] */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.meituan.android.cube.pga.type.a] */
    public c(com.meituan.android.cube.pga.type.a aVar) {
        super(aVar);
        boolean z = true;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23080fc65c2b30b5c5b36dd56fd2f590", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23080fc65c2b30b5c5b36dd56fd2f590");
            return;
        }
        this.y = true;
        this.A = false;
        this.D = false;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = r;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "59c14553b19e6831f526a19a1523c4bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "59c14553b19e6831f526a19a1523c4bf");
        } else {
            F().d().a(new com.meituan.android.cube.pga.action.b<Boolean>() { // from class: com.sankuai.waimai.ad.c.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cube.pga.action.b
                public final /* synthetic */ void a(Boolean bool) {
                    Boolean bool2 = bool;
                    Object[] objArr3 = {bool2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7d5306aafaccf03d057cb5117c2559f3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7d5306aafaccf03d057cb5117c2559f3");
                        return;
                    }
                    com.sankuai.waimai.pouch.a Q = c.this.Q();
                    if (bool2.booleanValue() && Q != null && c.this.N()) {
                        Q.d();
                        if (c.this.O()) {
                            return;
                        }
                        b.c P = c.this.P();
                        if (P == null || P.g) {
                            Object[] objArr4 = new Object[1];
                            objArr4[0] = Integer.valueOf(c.this.v != 0 ? ((PouchDynamicAd) c.this.v).index : -1);
                            com.sankuai.waimai.foundation.utils.log.a.b("RocksAdPouchBlock", "activity resume, expose: %d", objArr4);
                            Q.i = "background_to_foreground";
                            Q.a();
                        }
                    }
                }
            });
            F().e().a(new com.meituan.android.cube.pga.action.b<Boolean>() { // from class: com.sankuai.waimai.ad.c.2
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cube.pga.action.b
                public final /* synthetic */ void a(Boolean bool) {
                    Boolean bool2 = bool;
                    Object[] objArr3 = {bool2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c1bc690e498a52cc9c769f3acc3d2d43", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c1bc690e498a52cc9c769f3acc3d2d43");
                        return;
                    }
                    com.sankuai.waimai.pouch.a Q = c.this.Q();
                    if (!bool2.booleanValue() || Q == null) {
                        return;
                    }
                    com.sankuai.waimai.foundation.utils.log.a.b("RocksAdPouchBlock", "activity stop.", new Object[0]);
                    Q.e();
                    b.c P = c.this.P();
                    if (P == null || P.g) {
                        Object[] objArr4 = new Object[1];
                        objArr4[0] = Integer.valueOf(c.this.v != 0 ? ((PouchDynamicAd) c.this.v).index : -1);
                        com.sankuai.waimai.foundation.utils.log.a.b("RocksAdPouchBlock", "clear by activity stop: %d", objArr4);
                        Q.c();
                    }
                }
            });
            F().f().a(new com.meituan.android.cube.pga.action.a() { // from class: com.sankuai.waimai.ad.c.3
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cube.pga.action.a
                public final void a() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "47efbec4022ee552c05577caaec0e25a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "47efbec4022ee552c05577caaec0e25a");
                        return;
                    }
                    com.sankuai.waimai.foundation.utils.log.a.b("RocksAdPouchBlock", "activity destroy", new Object[0]);
                    com.sankuai.waimai.pouch.a Q = c.this.Q();
                    if (Q != null) {
                        Q.f();
                        Q.f = null;
                    }
                }
            });
            b.c P = P();
            if (P != null && P.k != null) {
                P.k.a(new com.meituan.android.cube.pga.action.b<Boolean>() { // from class: com.sankuai.waimai.ad.c.4
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.cube.pga.action.b
                    public final /* synthetic */ void a(Boolean bool) {
                        Boolean bool2 = bool;
                        Object[] objArr3 = {bool2};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "21e3b3e00369ba0b101177e548e7e722", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "21e3b3e00369ba0b101177e548e7e722");
                        } else if (bool2 != null) {
                            c.a(c.this, bool2);
                        }
                    }
                });
            }
            if (F() instanceof b) {
                ((b) F()).au_().a(new com.meituan.android.cube.pga.action.b<Integer>() { // from class: com.sankuai.waimai.ad.c.5
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.cube.pga.action.b
                    public final /* synthetic */ void a(Integer num) {
                        com.sankuai.waimai.pouch.a Q;
                        Integer num2 = num;
                        Object[] objArr3 = {num2};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "dcf7736f24679b34150615cbe332e847", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "dcf7736f24679b34150615cbe332e847");
                        } else if (num2.intValue() != 0 || (Q = c.this.Q()) == null) {
                        } else {
                            boolean N = c.this.N();
                            if (!N || c.this.C) {
                                if (!N && c.this.C) {
                                    Object[] objArr4 = new Object[1];
                                    objArr4[0] = Integer.valueOf(c.this.v != 0 ? ((PouchDynamicAd) c.this.v).index : -1);
                                    com.sankuai.waimai.foundation.utils.log.a.b("RocksAdPouchBlock", "in screen -> out: %d", objArr4);
                                    Q.e();
                                }
                            } else {
                                Object[] objArr5 = new Object[1];
                                objArr5[0] = Integer.valueOf(c.this.v != 0 ? ((PouchDynamicAd) c.this.v).index : -1);
                                com.sankuai.waimai.foundation.utils.log.a.b("RocksAdPouchBlock", "out of screen -> enter: %d", objArr5);
                                Q.d();
                                if (!c.this.O() && c.this.B) {
                                    Q.a();
                                    c.this.B = false;
                                }
                            }
                            c.this.C = N;
                        }
                    }
                });
            }
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.ad.gray.a.a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "1baf994b7aa5eef0c2a747351a883fbb", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "1baf994b7aa5eef0c2a747351a883fbb")).booleanValue();
        } else {
            String str = "ad_rocks_expose_strategy";
            if (com.sankuai.waimai.foundation.core.a.e()) {
                str = "ad_rocks_expose_strategy_mt";
            } else if (com.sankuai.waimai.foundation.core.a.f()) {
                str = "ad_rocks_expose_strategy_dp";
            }
            ABStrategy a = com.sankuai.waimai.ad.gray.a.a(str, null);
            if (a == null || !TextUtils.equals("A", a.expName)) {
                z = false;
            }
        }
        this.D = z;
    }

    @Override // com.sankuai.waimai.rocks.view.block.b, com.meituan.android.cube.pga.block.a
    public final View a(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ba6957006319ab2bb582bb113b5f910", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ba6957006319ab2bb582bb113b5f910");
        }
        FrameLayout frameLayout = new FrameLayout(this.t);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        frameLayout.setTag("ignore_rocks_margin");
        return frameLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean N() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c4ff51bb878584a2d4b95a5ec34f8e6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c4ff51bb878584a2d4b95a5ec34f8e6")).booleanValue();
        }
        if (i() == null || P() == null || !this.y || this.x == null) {
            return false;
        }
        int[] iArr = new int[2];
        i().getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        if (i == 0 && i2 == 0) {
            return false;
        }
        return Rect.intersects(new Rect(i, i2, i().getWidth() + i, i().getHeight() + i2), this.x);
    }

    @Override // com.sankuai.waimai.rocks.view.block.b, com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void a(com.meituan.android.cube.pga.viewmodel.a aVar) {
        com.sankuai.waimai.pouch.a aVar2;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3d8d734550ac20d0f1672162d631724", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3d8d734550ac20d0f1672162d631724");
        } else if (aVar == G() || !(aVar instanceof a)) {
        } else {
            if ((G() instanceof a) && (aVar2 = ((a) G()).q) != null && aVar2.g() != null) {
                try {
                    aVar2.g().v();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            super.a(aVar);
        }
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final void y() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb3347913cd86748fe8cf0ff7bd13485", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb3347913cd86748fe8cf0ff7bd13485");
            return;
        }
        super.y();
        com.sankuai.waimai.pouch.a Q = Q();
        if (Q == null) {
            Object[] objArr2 = new Object[1];
            objArr2[0] = Integer.valueOf(this.v != 0 ? ((PouchDynamicAd) this.v).index : -1);
            com.sankuai.waimai.foundation.utils.log.a.b("RocksAdPouchBlock", "expose failed: %d", objArr2);
        } else if (O()) {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.pouch.a.a;
            if (PatchProxy.isSupport(objArr3, Q, changeQuickRedirect2, false, "90e271a0db45206a54e36728b19169bd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, Q, changeQuickRedirect2, false, "90e271a0db45206a54e36728b19169bd");
            } else if (Q.b != null) {
                Q.b.j();
            }
            Q.d();
            com.sankuai.waimai.foundation.utils.log.a.b("RocksAdPouchBlock", "expose directly", new Object[0]);
        } else {
            Object[] objArr4 = new Object[1];
            objArr4[0] = Integer.valueOf(this.v != 0 ? ((PouchDynamicAd) this.v).index : -1);
            com.sankuai.waimai.foundation.utils.log.a.b("RocksAdPouchBlock", "expose by expose: %d", objArr4);
            if (Q.i == null) {
                Q.i = "first_show";
            }
            if (N()) {
                Q.a();
                Q.d();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public b.c P() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7715381f6c3a74939ee9394a4ba384b", RobustBitConfig.DEFAULT_VALUE)) {
            return (b.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7715381f6c3a74939ee9394a4ba384b");
        }
        if (this.w != null) {
            return this.w;
        }
        if (F() instanceof b) {
            this.w = ((b) F()).at_();
        }
        return this.w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Object> a(b.EnumC0675b enumC0675b) {
        b.c P;
        com.meituan.android.cube.pga.common.d<Map<String, Object>> dVar;
        Map<String, Object> map;
        Object[] objArr = {enumC0675b};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6085b0dabc14c5895e7a1e761d61f3c4", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6085b0dabc14c5895e7a1e761d61f3c4");
        }
        if (!(F() instanceof b) || enumC0675b == null || (P = P()) == null || P.i == null) {
            return null;
        }
        b.a aVar = new b.a();
        aVar.a = enumC0675b;
        com.sankuai.waimai.pouch.a Q = Q();
        if (Q != null && Q.b() != null) {
            aVar.b = Q.b().getRootNode();
        }
        if (this.v != 0) {
            aVar.c = ((PouchDynamicAd) this.v).index;
        }
        if (this.n != 0) {
            aVar.d = this.n.h;
        }
        try {
            dVar = P.i.a(aVar);
        } catch (Exception unused) {
            dVar = null;
        }
        if (dVar == null || (map = dVar.b) == null || map.isEmpty()) {
            return null;
        }
        if (enumC0675b != b.EnumC0675b.INITIAL && Q != null && Q.b() != null) {
            Q.b().synchronizeEnvironment(map);
            if (Q.d != null) {
                Q.d.putAll(map);
            } else {
                Q.d = map;
            }
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.sankuai.waimai.pouch.a Q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "afdfed8c35713a77737369e3ef11f49f", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.pouch.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "afdfed8c35713a77737369e3ef11f49f");
        }
        if (this.n == 0 || !(this.n instanceof a)) {
            return null;
        }
        com.sankuai.waimai.pouch.a aVar = ((a) this.n).q;
        return aVar == null ? this.z : aVar;
    }

    @Override // com.sankuai.waimai.pouch.model.c.a
    public final Map<String, Map<String, Object>> M() {
        com.sankuai.waimai.pouch.a Q;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a46b0808948c17097644b98d2436c17", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a46b0808948c17097644b98d2436c17");
        }
        try {
            b.c P = P();
            Statistics.getChannel("waimai").writeSystemCheck(null, "b_waimai_vgiho2av_sc", null, P != null ? P.b : null);
        } catch (Exception e) {
            e.printStackTrace();
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        b.c P2 = P();
        if (P2 != null && P2.p != null && (Q = Q()) != null && Q.b() != null) {
            List<String> list = P2.p.a(Q.b().getRootNode()).b;
            if (list == null || list.isEmpty()) {
                HashMap hashMap3 = new HashMap();
                hashMap3.put("exception_desc", "poi_id_list empty");
                b.c P3 = P();
                Statistics.getChannel("waimai").writeSystemCheck(null, "b_waimai_xvs5sgmh_sc", hashMap3, P3 != null ? P3.b : null);
            } else {
                hashMap2.put("poi_id_list", k.a().toJson(list));
            }
        }
        String str = "";
        WmAddress k = com.sankuai.waimai.foundation.location.v2.g.a().k();
        if (k != null && k.hasAddress()) {
            str = k.getAddress();
        }
        hashMap2.put("address_plaintext", str);
        hashMap.put("alita-intention", hashMap2);
        return hashMap;
    }

    @Override // com.sankuai.waimai.pouch.a.b
    public final void a(Map<String, Object> map) {
        Map<String, Object> b;
        String str;
        Map<String, Object> b2;
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8613bae0e63ebc338078f95b9cb4bb5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8613bae0e63ebc338078f95b9cb4bb5");
            return;
        }
        try {
            if (map != null) {
                if (map.containsKey("code")) {
                    Object obj = map.get("code");
                    if (obj instanceof Number) {
                        if (((Number) obj).intValue() == 0) {
                            if (map.containsKey("data")) {
                                Object obj2 = map.get("data");
                                if (obj2 instanceof Map) {
                                    RocksServerModel rocksServerModel = (RocksServerModel) new GsonBuilder().registerTypeAdapter(Map.class, new GsonTypeAdapter()).create().fromJson(com.sankuai.waimai.pouch.util.c.a((Map) obj2), (Class<Object>) RocksServerModel.class);
                                    if (rocksServerModel != null) {
                                        if (rocksServerModel.stringData != null && (b = com.sankuai.waimai.pouch.util.c.b(rocksServerModel.stringData)) != null && (b.get("string_data") instanceof String) && (str = (String) b.get("string_data")) != null && (b2 = com.sankuai.waimai.pouch.util.c.b(str)) != null) {
                                            b2.put("data_id", rocksServerModel.dataId);
                                            b.put("string_data", com.sankuai.waimai.pouch.util.c.a(b2));
                                            rocksServerModel.stringData = com.sankuai.waimai.pouch.util.c.a(b);
                                        }
                                        com.sankuai.waimai.pouch.a Q = Q();
                                        if (Q == null || Q.b() == null) {
                                            return;
                                        }
                                        this.w.j.a(new Pair<>(Q.b().getRootNode(), rocksServerModel));
                                        return;
                                    }
                                    return;
                                }
                                b("response_data illegal");
                                return;
                            }
                            b("response_data is empty");
                            return;
                        }
                        b("status code fail, is " + obj);
                        com.sankuai.waimai.pouch.monitor.c.a("AlitaIntentionPlugin", "response_error", String.valueOf(map), true);
                        return;
                    }
                    b("status code fail, is " + obj);
                    com.sankuai.waimai.pouch.monitor.c.a("AlitaIntentionPlugin", "response_error", String.valueOf(map), true);
                    return;
                }
                return;
            }
            b("response is null");
        } catch (Exception e) {
            b(e.getMessage());
            com.sankuai.waimai.pouch.monitor.c.a("AlitaIntentionPlugin", "response_error", e.getMessage(), true);
            e.printStackTrace();
        }
    }

    private void b(String str) {
        HashMap hashMap;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07a70b5d4538d5000334cf86f27a6017", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07a70b5d4538d5000334cf86f27a6017");
            return;
        }
        if (str != null) {
            hashMap = new HashMap();
            hashMap.put("exception_desc", str);
        } else {
            hashMap = null;
        }
        b.c P = P();
        Statistics.getChannel("waimai").writeSystemCheck(null, "b_waimai_2if9uvx7_sc", hashMap, P != null ? P.b : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean O() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "afa942bb4c8c4003f382f29060b36b1d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "afa942bb4c8c4003f382f29060b36b1d")).booleanValue();
        }
        if (this.v == 0) {
            return this.D;
        }
        if (TextUtils.equals(((PouchDynamicAd) this.v).businessName, "order_crossshop")) {
            return false;
        }
        return this.D;
    }
}
