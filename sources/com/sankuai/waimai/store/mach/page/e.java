package com.sankuai.waimai.store.mach.page;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.meituan.metrics.Metrics;
import com.meituan.metrics.traffic.report.BusinessCodeUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.ImageQualityUtil;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.foundation.utils.ColorUtils;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.mach.page.a;
import com.sankuai.waimai.store.mach.page.b;
import com.sankuai.waimai.store.mach.page.d;
import com.sankuai.waimai.store.mach.page.mach.MachCommonData;
import com.sankuai.waimai.store.mach.page.mach.SimpleFragment;
import com.sankuai.waimai.store.mach.page.mach.h;
import com.sankuai.waimai.store.mach.page.widget.MyRecyclerView;
import com.sankuai.waimai.store.mach.page.widget.NestedScrollLayout;
import com.sankuai.waimai.store.mach.page.widget.SlidingTabLayout;
import com.sankuai.waimai.store.newwidgets.NetInfoLoadView;
import com.sankuai.waimai.store.newwidgets.list.LoadingFooterView;
import com.sankuai.waimai.store.newwidgets.list.o;
import com.sankuai.waimai.store.newwidgets.pullrefresh.SCNestedPullRefreshView;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.repository.model.MachBackgroundConfig;
import com.sankuai.waimai.store.util.al;
import com.sankuai.waimai.store.util.m;
import com.sankuai.waimai.store.widgets.recycler.l;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e extends com.sankuai.waimai.store.base.vessel.impl.a implements b.InterfaceC1220b {
    public static ChangeQuickRedirect a;
    private View A;
    private int B;
    private a C;
    final b.a d;
    com.sankuai.waimai.store.mach.page.a e;
    MyRecyclerView f;
    h g;
    RecyclerView h;
    SlidingTabLayout i;
    protected LoadingFooterView j;
    int k;
    int l;
    LinearLayoutManager m;
    ArrayList<Fragment> n;
    ArrayList<String> o;
    public List<d<MachCommonData>> p;
    private NetInfoLoadView q;
    private FrameLayout r;
    private SCNestedPullRefreshView s;
    private LinearLayout t;
    private c u;
    private c v;
    private int w;
    private LinearLayout x;
    private ImageView y;
    private NestedScrollLayout z;

    public e(@NonNull SCBaseActivity sCBaseActivity) {
        super(sCBaseActivity);
        Object[] objArr = {sCBaseActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87782812caeb563967fbcc36ab3d1bb0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87782812caeb563967fbcc36ab3d1bb0");
            return;
        }
        this.w = 0;
        this.B = 0;
        this.n = new ArrayList<>();
        this.o = new ArrayList<>();
        this.d = new MachTilePresenter(this);
    }

    @Override // com.sankuai.waimai.store.base.vessel.impl.a, com.sankuai.waimai.store.base.vessel.a
    public final void a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8579bf4cbb95320f94f9318005e696ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8579bf4cbb95320f94f9318005e696ce");
            return;
        }
        super.a(bundle);
        a(R.layout.wm_sc_common_mach_tile_container_new);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b6192bd4ccccd34dcda71e20fd7178c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b6192bd4ccccd34dcda71e20fd7178c3");
        } else {
            this.q = (NetInfoLoadView) b(R.id.wm_sc_mach_tile_net_info);
            this.q.setReloadClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.mach.page.e.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2c0d94ff7bac8c66e307d63788056674", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2c0d94ff7bac8c66e307d63788056674");
                    } else {
                        e.this.d.d();
                    }
                }
            });
            this.e = new com.sankuai.waimai.store.mach.page.a(n(), new a.InterfaceC1219a() { // from class: com.sankuai.waimai.store.mach.page.e.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.mach.page.a.InterfaceC1219a
                public final void a() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8746cdd19c327d5d61938f0ef20124d2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8746cdd19c327d5d61938f0ef20124d2");
                    } else {
                        e.this.m();
                    }
                }
            });
            this.e.bindView(b(R.id.wm_sc_mach_tile_action_bar));
            this.r = (FrameLayout) b(R.id.wm_sc_mach_tile_action_bar2);
            this.r.setVisibility(8);
            this.t = (LinearLayout) b(R.id.wm_sc_mach_tile_content_container);
            this.x = (LinearLayout) b(R.id.wm_sc_mach_bg_container);
            this.y = (ImageView) b(R.id.wm_sc_mach_bg_image);
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "40802f777068b8c231071b32dc89b586", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "40802f777068b8c231071b32dc89b586");
            } else {
                this.s = (SCNestedPullRefreshView) b(R.id.wm_sc_mach_tile_pulltorefresh);
                this.s.setHeaderPullRefreshEnable(false);
                this.v = new c(n());
                this.u = new c(n());
                this.h = (RecyclerView) b(R.id.rec);
                this.f = (MyRecyclerView) b(R.id.head);
                this.f.setLayoutManager(new LinearLayoutManager(n()));
                this.f.setAdapter(new l(this.v));
                this.h.setLayoutManager(new LinearLayoutManager(n()));
                this.i = (SlidingTabLayout) b(R.id.tablayout2);
                this.z = (NestedScrollLayout) b(R.id.smooth);
                this.A = b(R.id.no_data);
                if (Build.VERSION.SDK_INT >= 23) {
                    this.z.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.sankuai.waimai.store.mach.page.e.5
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnScrollChangeListener
                        public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
                            Object[] objArr4 = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "1a742ecbf240ac097e6063a0ef05c056", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "1a742ecbf240ac097e6063a0ef05c056");
                                return;
                            }
                            if (e.this.e != null) {
                                com.sankuai.waimai.store.mach.page.a aVar = e.this.e;
                                Object[] objArr5 = {Integer.valueOf(i2)};
                                ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.store.mach.page.a.a;
                                if (PatchProxy.isSupport(objArr5, aVar, changeQuickRedirect5, false, "eb3e046a04c060f02aa2a46478fc8f9f", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, aVar, changeQuickRedirect5, false, "eb3e046a04c060f02aa2a46478fc8f9f");
                                } else if (aVar.e > 0) {
                                    if (i2 >= aVar.e) {
                                        aVar.d.setAlpha(1.0f);
                                    } else {
                                        aVar.d.setAlpha((i2 * 1.0f) / aVar.e);
                                    }
                                }
                            }
                            if (com.sankuai.waimai.foundation.utils.b.a(e.this.p) && e.this.g != null && e.this.g.e != null && e.this.g.e.l() != null) {
                                HashMap hashMap = new HashMap();
                                hashMap.put("offsetY", Integer.valueOf(i2));
                                e.this.g.e.l().sendJsEvent("nativeDidScroll", hashMap);
                            }
                            if (i2 >= e.this.f.getHeight()) {
                                e.this.i.setBackgroundResource(R.drawable.takeout_transparent_20);
                                e.this.i.setBackgroundColor(e.this.n().getResources().getColor(R.color.wm_sg_color_DB4E46));
                                e.this.i.setTextSelectColor(e.this.n().getResources().getColor(R.color.wm_sg_color_FFFFFF));
                                e.this.i.setTextUnselectColor(e.this.n().getResources().getColor(R.color.wm_sg_color_FFFFFE));
                                return;
                            }
                            e.this.i.setBackgroundColor(0);
                            e.this.i.setBackgroundResource(R.drawable.wm_sc_mach_tab_bg);
                            e.this.i.setTextUnselectColor(e.this.n().getResources().getColor(R.color.wm_sc_color_222426));
                            e.this.i.setTextSelectColor(e.this.n().getResources().getColor(R.color.wm_sg_color_333333));
                        }
                    });
                }
                this.h.addOnScrollListener(new RecyclerView.k() { // from class: com.sankuai.waimai.store.mach.page.e.6
                    public static ChangeQuickRedirect a;

                    @Override // android.support.v7.widget.RecyclerView.k
                    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                        Object[] objArr4 = {recyclerView, Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "d2d46e762cc69c0920a0ec70dafce91b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "d2d46e762cc69c0920a0ec70dafce91b");
                            return;
                        }
                        super.onScrollStateChanged(recyclerView, i);
                        if (i == 0) {
                            Metrics.getInstance().stopCustomFPS("activity_data_brand_scroll_fps");
                        } else if (i == 1) {
                            Metrics.getInstance().startCustomFPS("activity_data_brand_scroll_fps");
                        }
                    }

                    @Override // android.support.v7.widget.RecyclerView.k
                    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                        Object[] objArr4 = {recyclerView, Integer.valueOf(i), Integer.valueOf(i2)};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "c158148a2dfaca0c2a4cfd2b96378d92", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "c158148a2dfaca0c2a4cfd2b96378d92");
                            return;
                        }
                        super.onScrolled(recyclerView, i, i2);
                        if (e.this.h.getLayoutManager() instanceof LinearLayoutManager) {
                            e.this.m = (LinearLayoutManager) e.this.h.getLayoutManager();
                            e.this.k = e.this.m.getItemCount();
                            e.this.l = e.this.m.findLastCompletelyVisibleItemPosition();
                            if (e.this.l == e.this.k - 1) {
                                e.this.q();
                            }
                        }
                    }
                });
                this.j = new LoadingFooterView(n());
                this.j.setNoMoreViewHeight(R.dimen.wm_sc_common_dimen_60);
                this.j.a();
                this.u.d(this.j);
                this.h.setAdapter(new l(this.u));
            }
        }
        this.d.a();
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "fdc682c77ea50a74c8ff20bc3c622838", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "fdc682c77ea50a74c8ff20bc3c622838");
        } else if (o.h()) {
            final com.sankuai.waimai.mach.recycler.b bVar = new com.sankuai.waimai.mach.recycler.b("supermarket");
            al.a(new al.a() { // from class: com.sankuai.waimai.store.mach.page.e.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.util.al.a
                public final void a() {
                    Object[] objArr5 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "e3a0f53407daa361b78d0855cb26970f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "e3a0f53407daa361b78d0855cb26970f");
                    } else if (bVar != null) {
                        bVar.a("supermarket_brand_kingkong_spuitemspecial", "supermarket_brand_kingkong_spuitemspecial", "sg-mach-container", 500);
                    }
                }
            }, p());
            final com.sankuai.waimai.mach.recycler.b bVar2 = new com.sankuai.waimai.mach.recycler.b("supermarket");
            al.a(new al.a() { // from class: com.sankuai.waimai.store.mach.page.e.4
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.util.al.a
                public final void a() {
                    Object[] objArr5 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "9bc0bc27450c184f4a888e7db30c0fd7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "9bc0bc27450c184f4a888e7db30c0fd7");
                    } else if (bVar2 != null) {
                        bVar2.a("supermarket_brand_kingkong_spuitem", "supermarket_brand_kingkong_spuitem", "sg-mach-container", 500);
                    }
                }
            }, p());
        }
        com.sankuai.waimai.store.manager.judas.d.a(n(), d());
    }

    @Override // com.sankuai.waimai.store.base.vessel.impl.a, com.sankuai.waimai.store.base.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67a9bb70c5710017c0137112cf13c30c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67a9bb70c5710017c0137112cf13c30c");
            return;
        }
        super.c();
        this.d.b();
    }

    @Override // com.sankuai.waimai.store.base.vessel.impl.a, com.sankuai.waimai.store.base.a
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc21c1104cf2be063d04be7198854a28", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc21c1104cf2be063d04be7198854a28");
            return;
        }
        super.g();
        Metrics.getInstance().startCustomFPS("activity_data_brand_page_fps");
    }

    @Override // com.sankuai.waimai.store.base.vessel.impl.a, com.sankuai.waimai.store.base.a
    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15be922eabe6519ea5458123facc9a4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15be922eabe6519ea5458123facc9a4b");
            return;
        }
        super.h();
        Metrics.getInstance().stopCustomFPS("activity_data_brand_page_fps");
    }

    @Override // com.sankuai.waimai.store.base.vessel.a
    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e85f1e1c1c5624957b528464740f1be2", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e85f1e1c1c5624957b528464740f1be2")).booleanValue() : this.d.h();
    }

    @Override // com.sankuai.waimai.store.base.vessel.a
    public final String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1384d01b6904f9ce62b5eab197e8243", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1384d01b6904f9ce62b5eab197e8243") : this.d.c();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static final class b extends com.sankuai.waimai.store.base.vessel.impl.b {
        public static ChangeQuickRedirect a;

        @Override // com.sankuai.waimai.store.base.vessel.b
        @NonNull
        public final /* synthetic */ com.sankuai.waimai.store.base.vessel.a a(@NonNull SCBaseActivity sCBaseActivity) {
            Object[] objArr = {sCBaseActivity};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b7fc2ae331c87dae378b5f35c723b3f", RobustBitConfig.DEFAULT_VALUE) ? (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b7fc2ae331c87dae378b5f35c723b3f") : new e(sCBaseActivity);
        }

        @Override // com.sankuai.waimai.store.base.vessel.impl.b, com.sankuai.waimai.store.base.vessel.b
        public final void b(@NonNull SCBaseActivity sCBaseActivity) {
            Object[] objArr = {sCBaseActivity};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efa510d0a8cdd054b843ca870e07b832", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efa510d0a8cdd054b843ca870e07b832");
                return;
            }
            if (MachTilePresenter.e) {
                sCBaseActivity.a(true, true);
                if (sCBaseActivity.getWindow() != null) {
                    sCBaseActivity.getWindow().setSoftInputMode(3);
                }
            }
            Object[] objArr2 = {sCBaseActivity};
            ChangeQuickRedirect changeQuickRedirect2 = e.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "f63b1e823532c28ea80d59e7bf87a1f4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "f63b1e823532c28ea80d59e7bf87a1f4");
                return;
            }
            try {
                Activity.class.getDeclaredMethod("getActivityOptions", new Class[0]).setAccessible(true);
                Method declaredMethod = Activity.class.getDeclaredMethod("convertFromTranslucent", new Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(sCBaseActivity, new Object[0]);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3da6def94a6a5312a8c475bd33932aee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3da6def94a6a5312a8c475bd33932aee");
            return;
        }
        if (this.B == 2) {
            ae.a((Activity) n(), (int) R.string.wm_common_no_more);
        }
        if (this.B == 1) {
            this.j.d();
            this.d.e();
        } else if (this.B == 2) {
            this.j.b();
        }
    }

    @Override // com.sankuai.waimai.store.mach.page.b.InterfaceC1220b
    public final void a(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3885b9b986f7570caeffd6fcc9d939f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3885b9b986f7570caeffd6fcc9d939f");
        } else {
            this.q.a(i, str);
        }
    }

    @Override // com.sankuai.waimai.store.mach.page.b.InterfaceC1220b
    public final void a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d98fc68d28b7bb2b6e17618be203bda2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d98fc68d28b7bb2b6e17618be203bda2");
            return;
        }
        if (this.e != null) {
            com.sankuai.waimai.store.mach.page.a aVar = this.e;
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.mach.page.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "ec687524e5bc5457520257d05a9ccb1f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "ec687524e5bc5457520257d05a9ccb1f");
            } else {
                aVar.c.setText(str);
            }
            com.sankuai.waimai.store.mach.page.a aVar2 = this.e;
            Object[] objArr3 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.mach.page.a.a;
            if (PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect3, false, "17dbc8364deb3c548891130e0f257972", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect3, false, "17dbc8364deb3c548891130e0f257972");
            } else {
                aVar2.e = i;
                if (i > 0) {
                    aVar2.d.setAlpha(0.0f);
                } else {
                    aVar2.d.setAlpha(1.0f);
                }
            }
        }
        if (i > 0) {
            this.t.setPadding(0, 0, 0, 0);
        } else {
            this.t.setPadding(0, n().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_50), 0, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class a extends FragmentPagerAdapter {
        public static ChangeQuickRedirect a;

        public a(FragmentManager fragmentManager) {
            super(fragmentManager);
            Object[] objArr = {e.this, fragmentManager};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5d8d730c85be1f72343b8e6cd23d06a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5d8d730c85be1f72343b8e6cd23d06a");
            }
        }

        @Override // android.support.v4.view.PagerAdapter
        public final int getCount() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6674d0975be38b43224bb2a49a992c20", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6674d0975be38b43224bb2a49a992c20")).intValue() : e.this.n.size();
        }

        @Override // android.support.v4.view.PagerAdapter
        public final CharSequence getPageTitle(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78064447b2f5ed465924f49315c9dc71", RobustBitConfig.DEFAULT_VALUE) ? (CharSequence) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78064447b2f5ed465924f49315c9dc71") : e.this.o.get(i);
        }

        @Override // android.support.v4.app.FragmentPagerAdapter
        public final Fragment getItem(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "479adf2f187caf5093bba189da1393c9", RobustBitConfig.DEFAULT_VALUE) ? (Fragment) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "479adf2f187caf5093bba189da1393c9") : e.this.n.get(i);
        }
    }

    @Override // com.sankuai.waimai.store.mach.page.b.InterfaceC1220b
    public final void a(d<d.a> dVar, d<MachCommonData> dVar2, MachBackgroundConfig machBackgroundConfig, List<d<MachCommonData>> list, List<d<MachCommonData>> list2, boolean z, boolean z2) {
        char c;
        Object[] objArr = {dVar, dVar2, machBackgroundConfig, list, list2, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f4cff6ad488d257f156516c1dc959d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f4cff6ad488d257f156516c1dc959d6");
            return;
        }
        this.s.setFooterPullRefreshEnable(z);
        if (!z) {
            this.B = 2;
        } else {
            this.B = 1;
        }
        if (com.sankuai.waimai.foundation.utils.b.b(list2)) {
            this.A.setVisibility(0);
        } else {
            this.A.setVisibility(8);
        }
        this.p = list;
        if (com.sankuai.waimai.foundation.utils.b.a(list)) {
            this.v.a(new ArrayList<>(list));
        }
        a(dVar);
        this.u.a(new ArrayList<>(list2));
        Object[] objArr2 = {dVar2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "28df9af0eaaa8ac3f727424e10dde243", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "28df9af0eaaa8ac3f727424e10dde243");
        } else if (dVar2 != null && dVar2.d != null && !t.a(dVar2.c)) {
            if (this.e != null) {
                u.a(this.e.mView, 8);
            }
            this.e = null;
            this.r.setVisibility(0);
            this.r.removeAllViews();
            if (this.g == null) {
                this.g = new h(n());
                h hVar = this.g;
                long f = this.d.f();
                Object[] objArr3 = {new Long(f)};
                ChangeQuickRedirect changeQuickRedirect3 = h.a;
                if (PatchProxy.isSupport(objArr3, hVar, changeQuickRedirect3, false, "f434fdf2f8053d6feae4f1b0ae811483", RobustBitConfig.DEFAULT_VALUE)) {
                    c = 0;
                    PatchProxy.accessDispatch(objArr3, hVar, changeQuickRedirect3, false, "f434fdf2f8053d6feae4f1b0ae811483");
                } else {
                    c = 0;
                    hVar.b = f;
                }
                h hVar2 = this.g;
                long g = this.d.g();
                Object[] objArr4 = new Object[1];
                objArr4[c] = new Long(g);
                ChangeQuickRedirect changeQuickRedirect4 = h.a;
                if (PatchProxy.isSupport(objArr4, hVar2, changeQuickRedirect4, false, "75fd805aa0b41d497c6a9796d2b28548", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, hVar2, changeQuickRedirect4, false, "75fd805aa0b41d497c6a9796d2b28548");
                } else {
                    hVar2.c = g;
                }
            }
            this.g.a(this.r);
            this.g.a(BusinessCodeUtil.CODE_JSON_GZIP_FAIL, dVar2.d, dVar2.e);
            this.r.addView(this.g.d);
        }
        Object[] objArr5 = {machBackgroundConfig};
        ChangeQuickRedirect changeQuickRedirect5 = a;
        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "d50312790135313aabdc181043581f3e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "d50312790135313aabdc181043581f3e");
        } else if (machBackgroundConfig != null) {
            u.a((View) this.x, 0);
            if (!t.a(machBackgroundConfig.backgroundImage)) {
                u.a((View) this.y, 0);
                b.C0608b a2 = m.a(machBackgroundConfig.backgroundImage, ImageQualityUtil.a());
                a2.b = n();
                a2.a(this.y);
                ViewGroup.LayoutParams layoutParams = this.y.getLayoutParams();
                layoutParams.width = com.sankuai.shangou.stone.util.h.a((Context) n());
                this.y.setLayoutParams(layoutParams);
            } else {
                u.a((View) this.y, 8);
            }
            this.x.setBackgroundColor(ColorUtils.a(machBackgroundConfig.backgroundColor, 0));
        } else {
            u.a((View) this.x, 8);
        }
        com.sankuai.meituan.takeoutnew.util.aop.h.a(n().s().recordStep("activity_data_ready_brand"));
    }

    private void a(d<d.a> dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "213c1bae945a9e4df9b328c7cbf8a9c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "213c1bae945a9e4df9b328c7cbf8a9c1");
        } else if (dVar != null && dVar.d != null && !com.sankuai.waimai.foundation.utils.b.a(dVar.d.a)) {
            this.i.setVisibility(0);
            ViewPager viewPager = (ViewPager) b(R.id.vp);
            this.C = new a(n().getSupportFragmentManager());
            this.n.clear();
            this.o.clear();
            for (int i = 0; i < dVar.d.a.length; i++) {
                this.o.add(dVar.d.a[i].toString());
            }
            Iterator<String> it = this.o.iterator();
            while (it.hasNext()) {
                it.next();
                this.n.add(SimpleFragment.a());
            }
            viewPager.setAdapter(this.C);
            this.i.setViewPager(viewPager);
            this.i.setCurrentTab(0);
            this.i.setOnTabSelectListener(new com.sankuai.waimai.store.mach.page.widget.b() { // from class: com.sankuai.waimai.store.mach.page.e.7
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.mach.page.widget.b
                public final void a(int i2) {
                    Object[] objArr2 = {Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "912cd9bb2060aea4a546d647ffd7a531", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "912cd9bb2060aea4a546d647ffd7a531");
                        return;
                    }
                    e.this.j.a();
                    e.this.d.a(i2);
                }

                @Override // com.sankuai.waimai.store.mach.page.widget.b
                public final void b(int i2) {
                    Object[] objArr2 = {Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "25193f5d77e3d4630084771a21ccecf7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "25193f5d77e3d4630084771a21ccecf7");
                    } else {
                        e.this.j.a();
                    }
                }
            });
            if (com.sankuai.waimai.foundation.utils.b.b(this.p)) {
                this.i.setBackgroundResource(R.drawable.takeout_transparent_20);
                this.i.setBackgroundColor(n().getResources().getColor(R.color.wm_sg_color_DB4E46));
                this.i.setTextSelectColor(n().getResources().getColor(R.color.wm_sg_color_FFFFFF));
                this.i.setTextUnselectColor(n().getResources().getColor(R.color.wm_sg_color_FFFFFE));
                return;
            }
            this.i.setBackgroundColor(0);
            this.i.setBackgroundResource(R.drawable.wm_sc_mach_tab_bg);
            this.i.setTextSelectColor(n().getResources().getColor(R.color.wm_sg_color_333333));
            this.i.setTextUnselectColor(n().getResources().getColor(R.color.wm_sc_color_222426));
        } else {
            this.i.setVisibility(8);
        }
    }

    @Override // com.sankuai.waimai.store.mach.page.b.InterfaceC1220b
    public final void a(int i, Object obj) {
        Object[] objArr = {Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "797bd545db978825e6ef20cf12f08d71", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "797bd545db978825e6ef20cf12f08d71");
        } else {
            this.u.b(i, 1);
        }
    }

    @Override // com.sankuai.waimai.store.mach.page.b.InterfaceC1220b
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60c98169fbf975d16edba5555a434db5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60c98169fbf975d16edba5555a434db5");
            return;
        }
        this.s.setFooterPullRefreshEnable(false);
        if (z) {
            this.A.setVisibility(0);
            return;
        }
        this.A.setVisibility(8);
        ae.a((Activity) n(), (int) R.string.wm_common_no_more);
    }

    @Override // com.sankuai.waimai.store.mach.page.b.InterfaceC1220b
    public final void a(Poi.PoiCouponItem poiCouponItem) {
        MachCommonData machCommonData;
        Object[] objArr = {poiCouponItem};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "266d11d5b3b1ba90ba6c1b685e2c2385", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "266d11d5b3b1ba90ba6c1b685e2c2385");
        } else if (this.u != null && poiCouponItem != null) {
            for (int i = 0; i < this.u.k(); i++) {
                d<?> b2 = this.u.b(i);
                if (b2 != null && (b2.d instanceof MachCommonData) && (machCommonData = (MachCommonData) b2.d) != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("coupon_id", Long.valueOf(poiCouponItem.mCouponId));
                    machCommonData.mItem.l().sendJsEvent("on_coupon_received", hashMap);
                }
            }
        }
    }

    @Override // com.sankuai.waimai.store.mach.page.b.InterfaceC1220b
    public final SlidingTabLayout e() {
        return this.i;
    }

    @Override // com.sankuai.waimai.store.mach.page.b.InterfaceC1220b
    public final void bz_() {
        this.B = 0;
    }

    @Override // com.sankuai.waimai.store.mach.page.b.InterfaceC1220b
    public final void a(List<d<MachCommonData>> list, boolean z) {
        Object[] objArr = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c3b4af85c79135d2fcb8b8ad64d6374", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c3b4af85c79135d2fcb8b8ad64d6374");
            return;
        }
        this.A.setVisibility(8);
        if (list != null) {
            this.u.a(new ArrayList<>(list));
            if (!z) {
                this.B = 2;
                return;
            } else {
                this.B = 1;
                return;
            }
        }
        this.u.a(new ArrayList<>());
    }

    @Override // com.sankuai.waimai.store.mach.page.b.InterfaceC1220b
    public final void b(List<d<MachCommonData>> list, boolean z) {
        Object[] objArr = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8502bb6c17d4dbf39311f157ac6b4af7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8502bb6c17d4dbf39311f157ac6b4af7");
            return;
        }
        this.s.setFooterPullRefreshEnable(z);
        this.A.setVisibility(8);
        c cVar = this.u;
        ArrayList arrayList = new ArrayList(list);
        Object[] objArr2 = {arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "bd6ab356258e2d938721ce0229464458", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "bd6ab356258e2d938721ce0229464458");
        } else if (!com.sankuai.shangou.stone.util.a.b(arrayList)) {
            cVar.b.addAll(arrayList);
            cVar.m();
        }
        if (!z) {
            this.B = 2;
        } else {
            this.B = 1;
        }
    }

    @Override // com.sankuai.waimai.store.mach.page.b.InterfaceC1220b
    public final void bA_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85160d1fa45a62d9ae310c9980374502", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85160d1fa45a62d9ae310c9980374502");
        } else if (this.s.b() || this.s.d()) {
            this.s.a();
        }
    }
}
