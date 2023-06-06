package com.sankuai.waimai.business.page.kingkong.future.tabfeed.filter_category;

import android.app.Activity;
import android.arch.lifecycle.q;
import android.graphics.Color;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.cube.pga.action.d;
import com.meituan.android.cube.pga.common.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.common.category.a;
import com.sankuai.waimai.business.page.common.model.ChannelSubCategory;
import com.sankuai.waimai.business.page.common.model.KingkongInfo;
import com.sankuai.waimai.business.page.kingkong.KingKongActivity;
import com.sankuai.waimai.business.page.kingkong.future.tabfeed.view.a;
import com.sankuai.waimai.business.page.kingkong.viewmodel.KingKongViewModel;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.log.judas.StatisticsRecyclerView;
import com.sankuai.waimai.log.judas.f;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements com.sankuai.waimai.business.page.home.interfacer.b {
    public static ChangeQuickRedirect a;
    public static final int b = g.a(com.meituan.android.singleton.b.a, 40.0f);
    public static final int c;
    public static final int d;
    View e;
    StatisticsRecyclerView f;
    com.sankuai.waimai.business.page.kingkong.view.poilist.categorytabblock.a g;
    List<ChannelSubCategory> h;
    long i;
    SparseArray j;
    f k;
    int l;
    private final Activity m;
    private final com.sankuai.waimai.business.page.kingkong.a n;
    private float o;
    private KingKongViewModel p;
    private long q;
    private int r;
    private com.sankuai.waimai.rocks.expose.a s;
    private StatisticsRecyclerView.a t;
    private RecyclerView u;
    private int v;

    public static /* synthetic */ void a(a aVar, boolean z, View view) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "465a35512c7546d4959feb4203142de3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "465a35512c7546d4959feb4203142de3");
        } else if (view == null || view.getContext() == null || view.getContext().getResources() == null) {
        } else {
            int left = (view.getLeft() - (view.getContext().getResources().getDisplayMetrics().widthPixels / 2)) + (view.getWidth() / 2);
            if (z) {
                aVar.f.smoothScrollBy(left, 0);
            } else {
                aVar.f.scrollBy(left, 0);
            }
        }
    }

    public static /* synthetic */ boolean a(a aVar, int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "5fc8d204a2b0308a8c63532a05ec3801", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "5fc8d204a2b0308a8c63532a05ec3801")).booleanValue() : i >= 0 && aVar.h != null && i < aVar.h.size();
    }

    public static /* synthetic */ void b(a aVar, int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "57ecdb65804a461eea3573a6057c87a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "57ecdb65804a461eea3573a6057c87a7");
        } else if (aVar.f == null || aVar.g == null) {
        } else {
            aVar.g.b(i);
        }
    }

    public static /* synthetic */ void m(a aVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "5cb664409ac0213ca1d58f0caa92f259", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "5cb664409ac0213ca1d58f0caa92f259");
        } else if (ah.b(aVar.f)) {
            aVar.f.b();
        }
    }

    public a(com.sankuai.waimai.business.page.kingkong.a aVar, Activity activity, View view) {
        Object[] objArr = {aVar, activity, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ee38f3e26566f8689e23942421801fe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ee38f3e26566f8689e23942421801fe");
            return;
        }
        this.j = new SparseArray();
        this.t = new StatisticsRecyclerView.a() { // from class: com.sankuai.waimai.business.page.kingkong.future.tabfeed.filter_category.a.1
            public static ChangeQuickRedirect a;

            /* JADX WARN: Code restructure failed: missing block: B:51:0x01ec, code lost:
                if ((com.meituan.robust.PatchProxy.isSupport(r2, r0, r3, false, "e1758962a8bdbd0f993835c74461742a", com.meituan.robust.utils.RobustBitConfig.DEFAULT_VALUE) ? ((java.lang.Boolean) com.meituan.robust.PatchProxy.accessDispatch(r2, r0, r3, false, "e1758962a8bdbd0f993835c74461742a")).booleanValue() : com.sankuai.waimai.foundation.utils.d.a(r1.h)) == false) goto L45;
             */
            @Override // com.sankuai.waimai.log.judas.StatisticsRecyclerView.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void a(android.view.View r23, int r24) {
                /*
                    Method dump skipped, instructions count: 516
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.page.kingkong.future.tabfeed.filter_category.a.AnonymousClass1.a(android.view.View, int):void");
            }
        };
        this.l = 0;
        this.m = activity;
        this.e = view;
        this.n = aVar;
        this.p = (KingKongViewModel) q.a((FragmentActivity) ((KingKongActivity) this.m)).a(KingKongViewModel.class);
        KingkongInfo a2 = this.p.d.a();
        this.q = a2 != null ? a2.d : 0L;
        this.r = a2 != null ? a2.f : 0;
        this.i = a2 != null ? a2.g : 0L;
        if (com.meituan.android.singleton.b.a.getResources().getDisplayMetrics().density <= 2.0f) {
            this.o = 1.05f;
        } else {
            this.o = 1.08f;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4e332da6b211d6116fb88ce9d6a8c559", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4e332da6b211d6116fb88ce9d6a8c559");
        } else {
            this.f = (StatisticsRecyclerView) this.e.findViewById(R.id.category_recycler_view);
            if (com.sankuai.waimai.platform.privacy.a.a().b()) {
                this.f.setPadding(0, 0, 0, g.a(com.meituan.android.singleton.b.a, 5.0f));
            }
            this.f.setLayoutManager(new LinearLayoutManager(this.m, 0, false));
            this.g = new com.sankuai.waimai.business.page.kingkong.view.poilist.categorytabblock.a(this.m);
            this.f.setOnRecyclerViewItemClickListener(this.t);
            this.f.setOnLogReportListener(new f.b() { // from class: com.sankuai.waimai.business.page.kingkong.future.tabfeed.filter_category.a.4
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.log.judas.f.b
                public final void a(int i) {
                    Object[] objArr3 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e1e2a68783925b398eec5134d65c2dcd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e1e2a68783925b398eec5134d65c2dcd");
                    } else if (a.a(a.this, i) && a.this.j.get(i) == null) {
                        ChannelSubCategory channelSubCategory = (ChannelSubCategory) a.this.h.get(i);
                        JudasManualManager.a b2 = JudasManualManager.b("b_y8flufhi");
                        b2.b = AppUtil.generatePageInfoKey(a.this.m);
                        b2.a("c_i5kxn8l").a("category_code", a.this.q).a("resource_id", a.this.r).a("sub_category_code", channelSubCategory.code).a("sub_resource_id", channelSubCategory.resourceId).a("code", a.this.q).a("sub_code", channelSubCategory.code).a();
                        a.this.j.append(i, Integer.valueOf(i));
                    }
                }

                @Override // com.sankuai.waimai.log.judas.f.b
                public final void b(int i) {
                    Object[] objArr3 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a878586e8ac2371b97fdaf0ff7b2b1a5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a878586e8ac2371b97fdaf0ff7b2b1a5");
                    } else if (a.a(a.this, i)) {
                        ChannelSubCategory channelSubCategory = (ChannelSubCategory) a.this.h.get(i);
                        JudasManualManager.a a3 = JudasManualManager.a("b_LQk7g");
                        a3.b = AppUtil.generatePageInfoKey(a.this.m);
                        a3.a("c_i5kxn8l").a("navigate_type", a.this.q).a("resource_id", a.this.r).a("sub_category_code", channelSubCategory.code).a("status", com.sankuai.waimai.business.page.kingkong.view.poilist.categorytabblock.b.b ? 2 : 1).a("click_status", 0).a("sub_resource_id", channelSubCategory.resourceId).a("code", a.this.q).a("sub_code", channelSubCategory.code).a();
                    }
                }
            });
            this.f.setAdapter(this.g);
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "396049ab5efb3f2545a9b76adbe1be13", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "396049ab5efb3f2545a9b76adbe1be13");
        } else {
            this.n.I.b = new d() { // from class: com.sankuai.waimai.business.page.kingkong.future.tabfeed.filter_category.a.6
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cube.pga.action.d
                public final Object a() {
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "db740919b2a930a9fe9d4661731a56f5", RobustBitConfig.DEFAULT_VALUE)) {
                        return PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "db740919b2a930a9fe9d4661731a56f5");
                    }
                    return Boolean.valueOf(a.b - a.this.e.getHeight() <= 2);
                }
            };
            final int parseColor = Color.parseColor("#FFFFFF");
            final int color = this.m.getResources().getColor(R.color.wm_page_kingkong_common_bg);
            this.n.O.a(new com.meituan.android.cube.pga.action.b<Boolean>() { // from class: com.sankuai.waimai.business.page.kingkong.future.tabfeed.filter_category.a.7
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cube.pga.action.b
                public final /* synthetic */ void a(Boolean bool) {
                    Boolean bool2 = bool;
                    Object[] objArr4 = {bool2};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "0c968e10b288c6018d22438ad2471836", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "0c968e10b288c6018d22438ad2471836");
                    } else if (bool2 == null || a.this.e == null) {
                    } else {
                        if (bool2.booleanValue()) {
                            a.this.e.setBackgroundColor(parseColor);
                        } else {
                            a.this.e.setBackgroundColor(color);
                        }
                    }
                }
            }).a(a());
            this.n.U.a(new com.meituan.android.cube.pga.action.b<Integer>() { // from class: com.sankuai.waimai.business.page.kingkong.future.tabfeed.filter_category.a.8
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cube.pga.action.b
                public final /* synthetic */ void a(Integer num) {
                    Integer num2 = num;
                    Object[] objArr4 = {num2};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "911e605e2f19e748593a8b719fa89859", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "911e605e2f19e748593a8b719fa89859");
                    } else {
                        a.this.a(num2.intValue());
                    }
                }
            }).a(a());
        }
        aVar.A.b = new d() { // from class: com.sankuai.waimai.business.page.kingkong.future.tabfeed.filter_category.a.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final Object a() {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                return PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "73a3bd6000c93cfd0b1b8edc120f2900", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "73a3bd6000c93cfd0b1b8edc120f2900") : Integer.valueOf(a.this.e.getHeight());
            }
        };
        this.s = new C0808a();
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "4f559952f9e54436ff0c5a2649956ac1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "4f559952f9e54436ff0c5a2649956ac1");
        } else if (this.n != null) {
            this.n.W.a(new AnonymousClass3()).a(a());
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.page.kingkong.future.tabfeed.filter_category.a$3  reason: invalid class name */
    /* loaded from: classes4.dex */
    public class AnonymousClass3 implements com.meituan.android.cube.pga.action.b<com.sankuai.waimai.business.page.kingkong.future.tabfeed.view.a> {
        public static ChangeQuickRedirect a;

        public AnonymousClass3() {
        }

        @Override // com.meituan.android.cube.pga.action.b
        public final /* synthetic */ void a(com.sankuai.waimai.business.page.kingkong.future.tabfeed.view.a aVar) {
            com.sankuai.waimai.business.page.kingkong.future.tabfeed.view.a aVar2 = aVar;
            Object[] objArr = {aVar2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12cdbff8505aaaba036d6c5d6959dc59", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12cdbff8505aaaba036d6c5d6959dc59");
            } else if (aVar2 != null) {
                aVar2.e = new a.InterfaceC0810a() { // from class: com.sankuai.waimai.business.page.kingkong.future.tabfeed.filter_category.a.3.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.business.page.kingkong.future.tabfeed.view.a.InterfaceC0810a
                    public final void a(int i) {
                        Object[] objArr2 = {Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "59eb94f6a9bedaf169954e759c8574e6", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "59eb94f6a9bedaf169954e759c8574e6");
                        } else {
                            a.this.a(i);
                        }
                    }
                };
                a.this.u = aVar2.b;
                if (a.this.u != null) {
                    a.this.u.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.sankuai.waimai.business.page.kingkong.future.tabfeed.filter_category.a.3.2
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnLayoutChangeListener
                        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                            View findViewByPosition;
                            boolean z = true;
                            Object[] objArr2 = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5fc70b9547120b0ea819752c91724a1f", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5fc70b9547120b0ea819752c91724a1f");
                            } else if (i8 == i4) {
                            } else {
                                if (i5 == 0 && i6 == 0 && i7 == 0 && i8 == 0) {
                                    return;
                                }
                                a aVar3 = a.this;
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a.a;
                                if (PatchProxy.isSupport(objArr3, aVar3, changeQuickRedirect3, false, "55e6d2e3fd3c59f2e78f5a27051f143a", RobustBitConfig.DEFAULT_VALUE)) {
                                    z = ((Boolean) PatchProxy.accessDispatch(objArr3, aVar3, changeQuickRedirect3, false, "55e6d2e3fd3c59f2e78f5a27051f143a")).booleanValue();
                                } else if (aVar3.e == null || aVar3.e.getVisibility() == 8 || aVar3.e.getHeight() <= 0) {
                                    z = false;
                                }
                                if (!z || a.this.u == null || a.this.u.getLayoutManager() == null || (findViewByPosition = a.this.u.getLayoutManager().findViewByPosition(0)) == null) {
                                    return;
                                }
                                final int abs = Math.abs(findViewByPosition.getTop());
                                view.post(new Runnable() { // from class: com.sankuai.waimai.business.page.kingkong.future.tabfeed.filter_category.a.3.2.1
                                    public static ChangeQuickRedirect a;

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        Object[] objArr4 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect4 = a;
                                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "623d0945cb194bd2b2aebabbbdd7ccc9", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "623d0945cb194bd2b2aebabbbdd7ccc9");
                                        } else {
                                            a.this.a(abs);
                                        }
                                    }
                                });
                            }
                        }
                    });
                }
            }
        }
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91314e30016fcb9e18cf6a419baf87d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91314e30016fcb9e18cf6a419baf87d8");
        } else if (i == this.v) {
        } else {
            int abs = Math.abs(this.f.getTop());
            if (i < d || abs < d) {
                if (i >= 0 && i <= d) {
                    a(this.f, Integer.MIN_VALUE, i == 0 ? 0 : -i, Integer.MIN_VALUE, Integer.MIN_VALUE);
                    a(i / d);
                }
                if (i > d) {
                    a(this.f, Integer.MIN_VALUE, -d, Integer.MIN_VALUE, Integer.MIN_VALUE);
                    a(1.0f);
                }
                this.v = i;
            }
        }
    }

    private void a(final View view, int i, int i2, int i3, int i4) {
        Object[] objArr = {view, Integer.MIN_VALUE, Integer.valueOf(i2), Integer.MIN_VALUE, Integer.MIN_VALUE};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b639688d1badf2978a6d16dabb95407e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b639688d1badf2978a6d16dabb95407e");
        } else if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (i2 != Integer.MIN_VALUE) {
                    marginLayoutParams.topMargin = i2;
                }
                view.post(new Runnable() { // from class: com.sankuai.waimai.business.page.kingkong.future.tabfeed.filter_category.a.9
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0523f1bc7fa85ff7a0450764a244757b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0523f1bc7fa85ff7a0450764a244757b");
                            return;
                        }
                        view.setLayoutParams(marginLayoutParams);
                        ViewParent parent = view.getParent();
                        if (parent == null || !parent.isLayoutRequested()) {
                            return;
                        }
                        parent.requestLayout();
                    }
                });
            }
        }
    }

    private void a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7da880b663e1e2b6d1a236241de09d85", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7da880b663e1e2b6d1a236241de09d85");
            return;
        }
        a.C0757a c2 = c(this.g.a());
        double d2 = f;
        if (d2 > 0.5d) {
            this.g.e = 1.0f - f;
        } else {
            this.g.e = 1.0f;
        }
        if (d2 > 0.9d) {
            this.g.f = this.o;
            a(c2, true);
        } else {
            this.g.f = 1.0f;
            a(c2, false);
        }
        this.g.notifyDataSetChanged();
    }

    private a.C0757a c(int i) {
        View findViewByPosition;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d2793605f15e69087035aedef79444b", RobustBitConfig.DEFAULT_VALUE)) {
            return (a.C0757a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d2793605f15e69087035aedef79444b");
        }
        if (this.f == null || !(this.f.getLayoutManager() instanceof LinearLayoutManager) || (findViewByPosition = this.f.getLayoutManager().findViewByPosition(i)) == null) {
            return null;
        }
        RecyclerView.s childViewHolder = this.f.getChildViewHolder(findViewByPosition);
        if (childViewHolder instanceof a.C0757a) {
            return (a.C0757a) childViewHolder;
        }
        return null;
    }

    @Override // com.sankuai.waimai.business.page.home.interfacer.b
    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad893d4a95ed2ce1d6164feddd51cd03", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad893d4a95ed2ce1d6164feddd51cd03");
        } else if (i == 0) {
            this.s.b();
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.page.kingkong.future.tabfeed.filter_category.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class C0808a extends com.sankuai.waimai.rocks.expose.a {
        public static ChangeQuickRedirect a;

        private C0808a() {
            Object[] objArr = {a.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa3fac0ff56c185ec3b7c1ac182c8aa0", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa3fac0ff56c185ec3b7c1ac182c8aa0");
            }
        }

        @Override // com.sankuai.waimai.rocks.expose.a
        public final void b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46a4996332b498aa8daa2c736cf0237d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46a4996332b498aa8daa2c736cf0237d");
            } else {
                a.m(a.this);
            }
        }
    }

    private com.meituan.android.cube.pga.common.f a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b72f40af013bea840f8e084ccf63e82", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.cube.pga.common.f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b72f40af013bea840f8e084ccf63e82");
        }
        if (this.k == null) {
            this.k = new com.meituan.android.cube.pga.common.f();
        }
        return this.k;
    }

    private void a(a.C0757a c0757a, boolean z) {
        Object[] objArr = {c0757a, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28008a656ef424f18b01c0ed7884e798", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28008a656ef424f18b01c0ed7884e798");
        } else if (c0757a == null || c0757a.e == null) {
        } else {
            c0757a.e.setVisibility(z ? 0 : 4);
        }
    }

    static {
        int a2 = g.a(com.meituan.android.singleton.b.a, 84.0f);
        c = a2;
        d = a2 - b;
    }
}
