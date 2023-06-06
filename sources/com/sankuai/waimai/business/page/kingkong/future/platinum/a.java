package com.sankuai.waimai.business.page.kingkong.future.platinum;

import android.arch.lifecycle.d;
import android.arch.lifecycle.k;
import android.arch.lifecycle.l;
import android.arch.lifecycle.q;
import android.graphics.Rect;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.widget.Space;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.cube.annotation.DynamicBinder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.common.model.KingkongInfo;
import com.sankuai.waimai.business.page.kingkong.viewmodel.KingKongViewModel;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.pouch.a;
import com.sankuai.waimai.pouch.model.PouchDynamicAd;
import com.sankuai.waimai.pouch.model.c;
import com.sankuai.waimai.rocks.expose.e;
import com.sankuai.waimai.rocks.view.block.b;
import com.sankuai.waimai.store.repository.model.ConfigInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@DynamicBinder(modelType = com.sankuai.waimai.business.page.home.list.future.ad.a.class, nativeId = {"waimai_kingkong_platinum_native"}, viewModel = com.sankuai.waimai.business.page.kingkong.view.platinum.a.class)
/* loaded from: classes4.dex */
public class a extends b<com.sankuai.waimai.business.page.home.list.future.ad.a> {
    public static ChangeQuickRedirect r;
    private Space A;
    private com.sankuai.waimai.pouch.a B;
    private boolean C;
    private boolean D;
    private Rect E;
    private com.sankuai.waimai.business.page.home.head.platinumbanner.a F;
    private e G;
    private ArrayMap<String, Long> H;
    private c I;
    private com.sankuai.waimai.business.page.kingkong.a w;
    private KingkongInfo x;
    private long y;
    private KingKongViewModel z;

    public static /* synthetic */ void a(a aVar, int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "0cb3ed1431b15a551a5b13ee10f29213", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "0cb3ed1431b15a551a5b13ee10f29213");
        } else if (i != -1) {
            com.sankuai.waimai.foundation.utils.log.a.b("FKKPlatinumBannerBlock", "disappear pouch, stop video way: " + i, new Object[0]);
            if (aVar.B != null) {
                aVar.B.e();
            }
        }
    }

    public static /* synthetic */ boolean e(a aVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "97818b63b5bc0a7e0d6fb39ecaa3d2ba", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "97818b63b5bc0a7e0d6fb39ecaa3d2ba")).booleanValue();
        }
        if (aVar.i() == null || aVar.E == null) {
            return false;
        }
        int[] iArr = new int[2];
        aVar.i().getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        if (i == 0 && i2 == 0) {
            return false;
        }
        return Rect.intersects(new Rect(i, i2, aVar.i().getWidth() + i, aVar.i().getHeight() + i2), aVar.E);
    }

    public static /* synthetic */ void j(a aVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "317292a782eb2fbb277995c0769d8d93", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "317292a782eb2fbb277995c0769d8d93");
            return;
        }
        try {
            ViewGroup.LayoutParams layoutParams = aVar.i().getLayoutParams();
            int x = (int) aVar.i().getX();
            if (x == 0 || !(layoutParams instanceof RecyclerView.g)) {
                return;
            }
            ((RecyclerView.g) layoutParams).leftMargin = x * (-1);
            ((RecyclerView.g) layoutParams).rightMargin = ((int) ((g.a(aVar.t) - aVar.i().getWidth()) - aVar.i().getX())) * (-1);
            aVar.i().setLayoutParams(layoutParams);
        } catch (Exception unused) {
        }
    }

    public a(com.meituan.android.cube.pga.type.a aVar) {
        super(aVar);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65b327e164e553c30442c22fee62b14e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65b327e164e553c30442c22fee62b14e");
            return;
        }
        this.C = false;
        this.D = false;
        if (aVar instanceof com.sankuai.waimai.business.page.kingkong.a) {
            this.w = (com.sankuai.waimai.business.page.kingkong.a) aVar;
            this.x = this.w.w.a().b;
            if (this.x != null) {
                this.y = this.x.b;
            }
            this.w.bH.a(new com.meituan.android.cube.pga.action.b<Void>() { // from class: com.sankuai.waimai.business.page.kingkong.future.platinum.a.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cube.pga.action.b
                public final /* synthetic */ void a(Void r11) {
                    Object[] objArr2 = {r11};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "67720279e7d8c8af23aa00baaa8e4787", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "67720279e7d8c8af23aa00baaa8e4787");
                    } else {
                        new Handler().postDelayed(new Runnable() { // from class: com.sankuai.waimai.business.page.kingkong.future.platinum.a.1.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "acc2171b16ed2833e507f4a48b6bf534", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "acc2171b16ed2833e507f4a48b6bf534");
                                } else {
                                    a.this.y();
                                }
                            }
                        }, 100L);
                    }
                }
            });
        }
    }

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7001a6099b62e9d0f8853b575da35874", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7001a6099b62e9d0f8853b575da35874");
        } else {
            super.s();
        }
    }

    @Override // com.sankuai.waimai.rocks.view.block.b, com.meituan.android.cube.pga.block.a
    public final View a(ViewGroup viewGroup) {
        String w;
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e71d13fc631b1e1ab9b3d6b9631166fd", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e71d13fc631b1e1ab9b3d6b9631166fd");
        }
        this.u = LayoutInflater.from(this.t).inflate(R.layout.wm_page_kingkong_platinum_banner_layout, viewGroup, false);
        this.u.setTag("ignore_rocks_margin");
        this.A = (Space) this.u.findViewById(R.id.space_no_food);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = r;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f611d9649a822ef2c904c982b2865b01", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f611d9649a822ef2c904c982b2865b01");
        } else {
            this.H = new ArrayMap<>();
            this.H.put(com.sankuai.waimai.business.page.kingkong.log.a.a, Long.valueOf(this.y));
            if (this.x != null) {
                this.H.put(com.sankuai.waimai.business.page.kingkong.log.a.b, Long.valueOf(this.x.g));
            }
            this.H.put(com.sankuai.waimai.business.page.kingkong.log.a.c, Long.valueOf(this.y));
            this.F = new com.sankuai.waimai.business.page.home.head.platinumbanner.a();
            com.sankuai.waimai.business.page.home.head.platinumbanner.a aVar = this.F;
            View view = this.u;
            Object[] objArr3 = {view};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.page.home.head.platinumbanner.a.v;
            if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "fd1d47207487ad7308bbaf8e44c721cc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "fd1d47207487ad7308bbaf8e44c721cc");
            } else {
                aVar.w = view.findViewById(R.id.ly_platinum_empty_view);
            }
            this.G = new e(new com.sankuai.waimai.rocks.expose.b() { // from class: com.sankuai.waimai.business.page.kingkong.future.platinum.a.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.rocks.expose.c
                public final void a(int i) {
                }

                @Override // com.sankuai.waimai.rocks.expose.c
                public final void b(int i) {
                }

                @Override // com.sankuai.waimai.rocks.expose.b
                public final void a() {
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "71704fdd53ddf17a8d5b4b4f3fce7ef3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "71704fdd53ddf17a8d5b4b4f3fce7ef3");
                    } else if (a.this.F != null) {
                        com.sankuai.waimai.business.page.home.head.platinumbanner.a aVar2 = a.this.F;
                        ArrayMap arrayMap = a.this.H;
                        String generatePageInfoKey = AppUtil.generatePageInfoKey(a.this.bC_().b());
                        Object[] objArr5 = {arrayMap, generatePageInfoKey};
                        ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.business.page.home.head.platinumbanner.a.v;
                        if (PatchProxy.isSupport(objArr5, aVar2, changeQuickRedirect5, false, "e2886cd45e581af369c5d4a41c007e0b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, aVar2, changeQuickRedirect5, false, "e2886cd45e581af369c5d4a41c007e0b");
                        } else if (aVar2.w == null || arrayMap == null || aVar2.w.getVisibility() != 0 || !ah.a(aVar2.w, aVar2.x)) {
                        } else {
                            com.dianping.judas.util.a.a("PlatinumBannerKingKongStatisticsBlock", "statistic block expose.");
                            JudasManualManager.a a2 = JudasManualManager.b("b_gu7hjsyw").a("c_i5kxn8l");
                            a2.b = generatePageInfoKey;
                            a2.a(com.sankuai.waimai.business.page.kingkong.log.a.a, ((Long) arrayMap.get(com.sankuai.waimai.business.page.kingkong.log.a.a)).longValue()).a(com.sankuai.waimai.business.page.kingkong.log.a.b, ((Long) arrayMap.get(com.sankuai.waimai.business.page.kingkong.log.a.b)).longValue()).a(com.sankuai.waimai.business.page.kingkong.log.a.c, ((Long) arrayMap.get(com.sankuai.waimai.business.page.kingkong.log.a.c)).longValue()).a();
                        }
                    }
                }
            });
            if (this.F != null) {
                this.G.a(this.F.w);
            }
            this.G.b = 0;
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = r;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "6b9da14b1795ef44987900779c035b57", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "6b9da14b1795ef44987900779c035b57");
        } else {
            this.I = new c();
            this.I.b = "c_i5kxn8l";
            if (this.x != null) {
                c cVar = this.I;
                cVar.c = this.x.c + CommonConstant.Symbol.UNDERLINE + this.x.b;
            }
            this.I.a = AppUtil.generatePageInfoKey(bC_().b());
            c cVar2 = this.I;
            Object[] objArr5 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect5 = r;
            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "d99f06ca867a27b213bfb4dbe733c2fc", RobustBitConfig.DEFAULT_VALUE)) {
                w = (String) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "d99f06ca867a27b213bfb4dbe733c2fc");
            } else {
                w = bC_().b() instanceof BaseActivity ? ((BaseActivity) bC_().b()).w() : null;
            }
            cVar2.d = w;
            HashMap hashMap = new HashMap();
            hashMap.put("position", ConfigInfo.MODULE_KING_KONG);
            if (this.x != null) {
                hashMap.put(com.sankuai.waimai.business.page.kingkong.log.a.c, Long.valueOf(this.x.b));
                hashMap.put(com.sankuai.waimai.business.page.kingkong.log.a.a, Long.valueOf(this.x.b));
                hashMap.put(com.sankuai.waimai.business.page.kingkong.log.a.b, Long.valueOf(this.x.g));
                hashMap.put("category_text", this.x.c);
            }
            this.I.h = hashMap;
            this.I.e = "kingkongPlatinum";
            ArrayList arrayList = new ArrayList();
            arrayList.add("waimai_platinum_report_procedure");
            com.sankuai.waimai.pouch.plugin.b bVar = new com.sankuai.waimai.pouch.plugin.b();
            bVar.b = arrayList;
            a.C1112a c1112a = new a.C1112a();
            c1112a.c = (ViewGroup) this.u.findViewById(R.id.layout_platinum_banner_container);
            c1112a.b = this.t;
            c1112a.d = this.I;
            c1112a.g = bVar;
            this.B = c1112a.a();
            this.B.k = true;
            this.B.f = new com.sankuai.waimai.pouch.view.c() { // from class: com.sankuai.waimai.business.page.kingkong.future.platinum.a.6
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.pouch.view.c
                public final void a() {
                    Object[] objArr6 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "5eded3be4bf4b7c3ea46712b164a0c8a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "5eded3be4bf4b7c3ea46712b164a0c8a");
                        return;
                    }
                    a.j(a.this);
                    a.this.a(false);
                    if (a.this.F != null) {
                        com.sankuai.waimai.business.page.home.head.platinumbanner.a aVar2 = a.this.F;
                        ArrayMap arrayMap = a.this.H;
                        String generatePageInfoKey = AppUtil.generatePageInfoKey(a.this.bC_().b());
                        Object[] objArr7 = {arrayMap, generatePageInfoKey};
                        ChangeQuickRedirect changeQuickRedirect7 = com.sankuai.waimai.business.page.home.head.platinumbanner.a.v;
                        if (PatchProxy.isSupport(objArr7, aVar2, changeQuickRedirect7, false, "c89159fe3294cd45a8afdcab9cdf2a57", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr7, aVar2, changeQuickRedirect7, false, "c89159fe3294cd45a8afdcab9cdf2a57");
                            return;
                        }
                        com.dianping.judas.util.a.a("PlatinumBannerKingKongStatisticsBlock", "statistic block expose anyway");
                        JudasManualManager.a a2 = JudasManualManager.b("b_gu7hjsyw").a("c_i5kxn8l");
                        a2.b = generatePageInfoKey;
                        a2.a("report_type", "pouch").a(com.sankuai.waimai.business.page.kingkong.log.a.a, arrayMap == null ? -1L : ((Long) arrayMap.get(com.sankuai.waimai.business.page.kingkong.log.a.a)).longValue()).a(com.sankuai.waimai.business.page.kingkong.log.a.b, arrayMap == null ? -1L : ((Long) arrayMap.get(com.sankuai.waimai.business.page.kingkong.log.a.b)).longValue()).a(com.sankuai.waimai.business.page.kingkong.log.a.c, arrayMap != null ? ((Long) arrayMap.get(com.sankuai.waimai.business.page.kingkong.log.a.c)).longValue() : -1L).a();
                    }
                }

                @Override // com.sankuai.waimai.pouch.view.c
                public final void b() {
                    Object[] objArr6 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "da6aefc17d398638a8a2a204ee578f14", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "da6aefc17d398638a8a2a204ee578f14");
                    } else {
                        a.this.a(true);
                    }
                }

                @Override // com.sankuai.waimai.pouch.view.c
                public final void c() {
                    Object[] objArr6 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "6afac57348f616670dd9b5a75d1f40fa", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "6afac57348f616670dd9b5a75d1f40fa");
                        return;
                    }
                    a.this.C = true;
                    if (!a.e(a.this)) {
                        a.this.D = true;
                    } else {
                        com.sankuai.waimai.foundation.utils.log.a.b("FKKPlatinumBannerBlock", "expose by attach", new Object[0]);
                        if (a.this.B != null) {
                            a.this.B.i = "first_show";
                            a.this.B.a();
                            a.this.B.d();
                        }
                    }
                    if (a.this.z != null) {
                        KingKongViewModel kingKongViewModel = a.this.z;
                        Object[] objArr7 = {(byte) 1};
                        ChangeQuickRedirect changeQuickRedirect7 = KingKongViewModel.a;
                        if (PatchProxy.isSupport(objArr7, kingKongViewModel, changeQuickRedirect7, false, "625be23beaad1fff3d768522abecf1ce", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr7, kingKongViewModel, changeQuickRedirect7, false, "625be23beaad1fff3d768522abecf1ce");
                        } else {
                            kingKongViewModel.g.b((k<Boolean>) Boolean.TRUE);
                        }
                    }
                }
            };
        }
        Object[] objArr6 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect6 = r;
        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "b909ff3f4ec59e43dce1554fe1f54d76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "b909ff3f4ec59e43dce1554fe1f54d76");
        } else {
            this.z = (KingKongViewModel) q.a(l()).a(KingKongViewModel.class);
            this.z.c.a(new l<d.a>() { // from class: com.sankuai.waimai.business.page.kingkong.future.platinum.a.4
                public static ChangeQuickRedirect a;

                @Override // android.arch.lifecycle.l
                public final /* synthetic */ void a(@Nullable d.a aVar2) {
                    d.a aVar3 = aVar2;
                    Object[] objArr7 = {aVar3};
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "6b55279c4ed7840818d6481deb5a5815", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "6b55279c4ed7840818d6481deb5a5815");
                    } else if (aVar3 == d.a.ON_RESUME) {
                        a.this.B.c();
                        if (a.e(a.this)) {
                            com.sankuai.waimai.foundation.utils.log.a.b("FKKPlatinumBannerBlock", "expose by resume", new Object[0]);
                            a.this.B.a();
                        }
                    } else if (aVar3 == d.a.ON_STOP) {
                        if (com.sankuai.waimai.foundation.core.lifecycle.b.a().a(a.this.t.hashCode())) {
                            a.a(a.this, 2);
                        } else {
                            a.a(a.this, 1);
                        }
                    } else if (aVar3 == d.a.ON_DESTROY) {
                        if (a.this.B != null) {
                            a.this.B.f();
                            a.this.B.f = null;
                        }
                        a.this.z.c.b(this);
                    }
                }
            });
            this.w.bJ.a(new com.meituan.android.cube.pga.action.b<Integer>() { // from class: com.sankuai.waimai.business.page.kingkong.future.platinum.a.5
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cube.pga.action.b
                public final /* synthetic */ void a(Integer num) {
                    Integer num2 = num;
                    Object[] objArr7 = {num2};
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "a79700ce904dc764ade1b4a0c34c8bc5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "a79700ce904dc764ade1b4a0c34c8bc5");
                    } else if (num2 == null || num2.intValue() != 0) {
                    } else {
                        boolean e = a.e(a.this);
                        if (!e || a.this.C) {
                            if (!e && a.this.C) {
                                com.sankuai.waimai.foundation.utils.log.a.b("FKKPlatinumBannerBlock", "in screen -> out", new Object[0]);
                                a.a(a.this, 0);
                            }
                        } else {
                            com.sankuai.waimai.foundation.utils.log.a.b("FKKPlatinumBannerBlock", "out of screen -> enter", new Object[0]);
                            if (a.this.B != null) {
                                a.this.B.d();
                            }
                            if (a.this.D) {
                                if (a.this.B != null) {
                                    a.this.B.a();
                                }
                                a.this.D = false;
                            }
                        }
                        a.this.C = e;
                    }
                }
            });
        }
        return this.u;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        View view;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e424ba2966e348d9daf4244ed49c163b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e424ba2966e348d9daf4244ed49c163b");
        } else if (this.F == null || (view = this.F.w) == null) {
        } else {
            view.setVisibility(z ? 0 : 8);
            if (z) {
                view.post(new Runnable() { // from class: com.sankuai.waimai.business.page.kingkong.future.platinum.a.3
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e056fa81547583db6bf3be9aaf0069c7", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e056fa81547583db6bf3be9aaf0069c7");
                        } else if (a.this.G != null) {
                            a.this.G.b();
                        }
                    }
                });
            }
        }
    }

    @Override // com.sankuai.waimai.rocks.view.block.b, com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void a(com.meituan.android.cube.pga.viewmodel.a aVar) {
        View findViewById;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "083e5565147640ca52b03a87e1b52a3a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "083e5565147640ca52b03a87e1b52a3a");
            return;
        }
        super.a(aVar);
        com.sankuai.waimai.business.page.home.list.future.ad.a e = aVar instanceof com.sankuai.waimai.business.page.kingkong.view.platinum.a ? ((com.sankuai.waimai.business.page.kingkong.view.platinum.a) aVar).e() : null;
        if (e != null) {
            this.G.a(false);
            this.B.c();
            a(false);
            PouchDynamicAd a = new com.sankuai.waimai.pouch.model.a<com.sankuai.waimai.business.page.home.list.future.ad.a>() { // from class: com.sankuai.waimai.business.page.kingkong.future.platinum.a.7
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.pouch.model.a
                public final /* synthetic */ PouchDynamicAd a(com.sankuai.waimai.business.page.home.list.future.ad.a aVar2) {
                    com.sankuai.waimai.business.page.home.list.future.ad.a aVar3 = aVar2;
                    Object[] objArr2 = {aVar3};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bb7165cc3bf2fa744367f581ce44af8d", RobustBitConfig.DEFAULT_VALUE)) {
                        return (PouchDynamicAd) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bb7165cc3bf2fa744367f581ce44af8d");
                    }
                    if (aVar3 == null) {
                        return null;
                    }
                    com.sankuai.waimai.business.page.kingkong.future.network.preload.a.a().e = true ^ TextUtils.isEmpty(aVar3.adTemplateId);
                    PouchDynamicAd pouchDynamicAd = new PouchDynamicAd();
                    pouchDynamicAd.stringData = aVar3.a;
                    pouchDynamicAd.adTemplateId = aVar3.adTemplateId;
                    pouchDynamicAd.defaultAdContainerId = PouchDynamicAd.CONTAINER_ID_POUCH_COMMON;
                    pouchDynamicAd.adContainerId = PouchDynamicAd.CONTAINER_ID_WM_COMMON;
                    pouchDynamicAd.businessName = "channel_platinum";
                    return pouchDynamicAd;
                }
            }.a(e);
            if (a != null && !TextUtils.isEmpty(a.adTemplateId) && !TextUtils.isEmpty(a.stringData)) {
                this.B.a(a);
            } else {
                if (i() != null && (findViewById = i().findViewById(R.id.layout_platinum_banner_container)) != null) {
                    findViewById.setVisibility(8);
                }
                a(true);
                JSONObject jSONObject = new JSONObject();
                try {
                    if (a == null) {
                        jSONObject.put("fail_reason", "data is null.");
                    } else {
                        jSONObject.put("template_id", a.adTemplateId);
                        jSONObject.put("fail_reason", "data error.");
                    }
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
                com.sankuai.waimai.pouch.monitor.e.a(new com.sankuai.waimai.pouch.monitor.d().a("kingkongPlatinum").b("data_error").d(jSONObject.toString()).a(true).b(), (Map<String, String>) null);
            }
            Map<String, Object> a2 = com.sankuai.waimai.mach.utils.b.a(e.a);
            if (a2 != null && a2.containsKey("adType")) {
                com.sankuai.waimai.platform.mach.monitor.d.a(1, ((Long) a2.get("adType")).intValue(), String.valueOf(this.y), "channel/rcmdboard");
            }
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = r;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dc2f0d701b789707a234a85377597fe8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dc2f0d701b789707a234a85377597fe8");
            } else if (this.A == null || this.x == null) {
            } else {
                if (com.sankuai.waimai.business.page.kingkong.b.a(this.x) == com.sankuai.waimai.business.page.kingkong.b.FOOD) {
                    this.A.setVisibility(8);
                } else {
                    this.A.setVisibility(0);
                }
            }
        }
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final void y() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f5ef4cdec49a1f6876a2ae1713bb863", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f5ef4cdec49a1f6876a2ae1713bb863");
            return;
        }
        super.y();
        com.sankuai.waimai.foundation.utils.log.a.b("FKKPlatinumBannerBlock", "expose", new Object[0]);
        DisplayMetrics displayMetrics = m().getResources().getDisplayMetrics();
        this.E = new Rect(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
        this.B.a(this.E);
        this.G.c = this.E;
        this.F.a(this.E);
        if (this.B.i == null) {
            this.B.i = "first_show";
        }
        com.sankuai.waimai.foundation.utils.log.a.b("FKKPlatinumBannerBlock", "expose by expose", new Object[0]);
        this.B.a();
        this.B.d();
    }
}
