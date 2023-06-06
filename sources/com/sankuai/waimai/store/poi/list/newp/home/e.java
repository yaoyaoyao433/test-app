package com.sankuai.waimai.store.poi.list.newp.home;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.meituan.metrics.Metrics;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.foundation.utils.ImageQualityUtil;
import com.sankuai.waimai.store.assembler.component.PageEventHandler;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.newwidgets.NetInfoLoadView;
import com.sankuai.waimai.store.newwidgets.list.LoadingFooterView;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.poi.list.newp.block.rxevent.i;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.util.m;
import com.sankuai.waimai.store.util.p;
import com.sankuai.waimai.store.widgets.layoutmanager.FixedStaggeredGridLayoutManager;
import com.sankuai.waimai.store.widgets.recycler.j;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e extends com.sankuai.waimai.store.base.b implements com.meituan.android.cube.core.pager.a {
    public static ChangeQuickRedirect a;
    public NetInfoLoadView b;
    public RecyclerView c;
    public c d;
    int e;
    public g f;
    int g;
    public LoadingFooterView h;
    com.sankuai.waimai.store.poi.list.newp.home.callback.b i;
    public boolean j;
    public boolean k;
    public boolean l;
    public com.sankuai.waimai.store.poi.list.newp.home.model.a m;
    int n;
    public LinearLayout o;
    public BaseModuleDesc p;
    int q;
    int r;
    public com.sankuai.waimai.store.poi.list.newp.home.callback.c s;
    private FixedStaggeredGridLayoutManager t;
    private com.sankuai.waimai.store.param.a u;
    private ImageView v;
    private Button w;

    @Override // com.meituan.android.cube.core.pager.a
    public final void a(boolean z) {
    }

    public e(@NonNull Context context, com.sankuai.waimai.store.param.a aVar, com.sankuai.waimai.store.poi.list.newp.home.model.a aVar2, com.sankuai.waimai.store.poi.list.newp.home.callback.b bVar) {
        super(context);
        Object[] objArr = {context, aVar, aVar2, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7cadb987f530474ce53b02443573496", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7cadb987f530474ce53b02443573496");
            return;
        }
        this.l = false;
        this.n = 0;
        this.s = new com.sankuai.waimai.store.poi.list.newp.home.callback.c() { // from class: com.sankuai.waimai.store.poi.list.newp.home.e.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.poi.list.newp.home.callback.c
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2b8f6fc881e0f652c862cfe95d34e678", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2b8f6fc881e0f652c862cfe95d34e678");
                    return;
                }
                if (e.this.h != null) {
                    if (e.this.c != null) {
                        e.this.c.scrollBy(e.this.q, com.sankuai.shangou.stone.util.h.a(e.this.a(), 30.0f));
                    }
                    e.this.h.e();
                }
                e.this.k = false;
            }

            @Override // com.sankuai.waimai.store.poi.list.newp.home.callback.c
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "44c4bdf173d5bb5484be1d5dad789e56", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "44c4bdf173d5bb5484be1d5dad789e56");
                    return;
                }
                e.this.j = true;
                e.this.k = false;
                if (e.this.h != null) {
                    e.this.h.e();
                    new Handler().postDelayed(new Runnable() { // from class: com.sankuai.waimai.store.poi.list.newp.home.e.1.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "63c69178162d89aef62d104dcd670194", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "63c69178162d89aef62d104dcd670194");
                            } else {
                                e.this.h.b();
                            }
                        }
                    }, 500L);
                }
                e.this.b();
            }
        };
        this.u = aVar;
        this.i = bVar;
        this.m = aVar2;
        if (this.m != null) {
            this.g = aVar2.g;
        }
    }

    public final SCBaseActivity a() {
        return (SCBaseActivity) this.mContext;
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6163d78e6e0f3dc339516de8fef34a03", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6163d78e6e0f3dc339516de8fef34a03") : layoutInflater.inflate(R.layout.wm_sc_common_container_list, viewGroup, false);
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6d3c932a7017f9aba883768d8d78e2d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6d3c932a7017f9aba883768d8d78e2d");
            return;
        }
        super.onViewCreated();
        Metrics.getInstance().setScrollCustom((SCBaseActivity) this.mContext);
        this.f = new g((SCBaseActivity) this.mContext, this.u, this.m);
        this.d = new c((SCBaseActivity) this.mContext, this.u, this.f, this.m);
        this.c = (RecyclerView) this.mView.findViewById(R.id.rec);
        this.o = (LinearLayout) this.mView.findViewById(R.id.convenient_landing_no_filter_data_layout);
        this.v = (ImageView) this.mView.findViewById(R.id.convenient_landing_no_filter_data_img);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4f54639c0265f4d5d81de3dc1879da54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4f54639c0265f4d5d81de3dc1879da54");
        } else {
            b.C0608b a2 = m.a("http://p0.meituan.net/scarlett/7c1b33d115e733f39685338d95a2a41a9128.png", com.sankuai.shangou.stone.util.h.a(this.mContext), ImageQualityUtil.a());
            a2.g = false;
            a2.k = 4;
            a2.a(this.v);
        }
        this.w = (Button) this.mView.findViewById(R.id.convenient_landing_filter_reset_button);
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "644cfb25d65e17bf99a2915bc8879ce5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "644cfb25d65e17bf99a2915bc8879ce5");
        } else if (this.w != null) {
            this.w.setBackground(new e.a().a(com.sankuai.shangou.stone.util.h.a(getContext(), 6.0f)).a(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{ContextCompat.getColor(getContext(), R.color.wm_sg_color_FFE14D), ContextCompat.getColor(getContext(), R.color.wm_sg_color_FFC34D)}).a());
            this.w.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.poi.list.newp.home.e.8
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr4 = {view};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "cdb8c9591294b1a4c213d029be9183dd", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "cdb8c9591294b1a4c213d029be9183dd");
                        return;
                    }
                    com.meituan.android.bus.a.a().c(new com.sankuai.waimai.store.convenient.landing.a(-99, ""));
                    if (e.this.a() == null || e.this.a().d == null || e.this.p == null) {
                        return;
                    }
                    e.this.a().d.a(e.this.p, "convenient_landing_filter_reset", new HashMap());
                }
            });
        }
        this.t = new FixedStaggeredGridLayoutManager(this.g, 1);
        this.c.setPadding(this.m.k, 0, this.m.k, 0);
        this.c.setLayoutManager(this.t);
        this.b = (NetInfoLoadView) this.mView.findViewById(R.id.wm_sc_mach_tile_net_info);
        this.b.setReloadClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.poi.list.newp.home.e.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr4 = {view};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "9c204de01a1fa91c2d95784fc3be1cbc", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "9c204de01a1fa91c2d95784fc3be1cbc");
                }
            }
        });
        this.b.setVisibility(8);
        this.c.addOnScrollListener(new RecyclerView.k() { // from class: com.sankuai.waimai.store.poi.list.newp.home.e.3
            public static ChangeQuickRedirect a;

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                Object[] objArr4 = {recyclerView, Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "46454217086028d527c8850b8a42a5c5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "46454217086028d527c8850b8a42a5c5");
                    return;
                }
                super.onScrolled(recyclerView, i, i2);
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                if (e.this.g > 0) {
                    e.this.e = p.a(layoutManager, e.this.g);
                }
                if (recyclerView.canScrollVertically(-1)) {
                    e.this.m.q.a((PageEventHandler) new i(100));
                } else {
                    e.this.m.q.a((PageEventHandler) new i(200));
                }
                e.this.q = i;
                e.this.r = i2;
            }

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                Object[] objArr4 = {recyclerView, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "21e6cb503fb2f8b3d1a2846ba47ac87b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "21e6cb503fb2f8b3d1a2846ba47ac87b");
                    return;
                }
                super.onScrollStateChanged(recyclerView, i);
                if (e.this.n != i) {
                    e.this.m.q.a((PageEventHandler) new i(i));
                    e.this.n = i;
                }
                int a3 = e.this.d.a();
                if (e.this.e != -1 && e.this.e >= a3 - 2 && !e.this.k) {
                    e.this.k = true;
                    e eVar = e.this;
                    Object[] objArr5 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect5 = e.a;
                    if (PatchProxy.isSupport(objArr5, eVar, changeQuickRedirect5, false, "bd669a5c6c09cfad1dbe7c8ddedae9a7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, eVar, changeQuickRedirect5, false, "bd669a5c6c09cfad1dbe7c8ddedae9a7");
                    } else {
                        Log.e("asd", "loadToBottom : ");
                        if (eVar.j) {
                            eVar.h.e();
                            eVar.h.b();
                        } else {
                            eVar.h.d();
                            Object[] objArr6 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect6 = e.a;
                            if (PatchProxy.isSupport(objArr6, eVar, changeQuickRedirect6, false, "ad04eebc474b155f584e08b0b328d0e0", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr6, eVar, changeQuickRedirect6, false, "ad04eebc474b155f584e08b0b328d0e0");
                            } else if (eVar.i != null) {
                                eVar.i.a(eVar.s);
                            }
                        }
                    }
                }
                if (i == 0) {
                    Metrics.getInstance().stopCustomFPS(e.this.m.p);
                } else if (i == 1) {
                    Metrics.getInstance().startCustomFPS(e.this.m.p);
                }
            }
        });
        RecyclerView recyclerView = this.c;
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = a;
        recyclerView.setAdapter(PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "1c35740bfa39343bb4782960b6733393", RobustBitConfig.DEFAULT_VALUE) ? (j) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "1c35740bfa39343bb4782960b6733393") : new j<com.sankuai.waimai.store.widgets.recycler.e>(this.d) { // from class: com.sankuai.waimai.store.poi.list.newp.home.e.5
            public static ChangeQuickRedirect a;

            @Override // android.support.v7.widget.RecyclerView.a
            public final /* synthetic */ void onViewAttachedToWindow(RecyclerView.s sVar) {
                com.sankuai.waimai.store.widgets.recycler.e eVar = (com.sankuai.waimai.store.widgets.recycler.e) sVar;
                Object[] objArr5 = {eVar};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "f72d65da96e1bad465341e966511b2c0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "f72d65da96e1bad465341e966511b2c0");
                    return;
                }
                ViewGroup.LayoutParams layoutParams = eVar.itemView.getLayoutParams();
                if (layoutParams instanceof StaggeredGridLayoutManager.b) {
                    StaggeredGridLayoutManager.b bVar = (StaggeredGridLayoutManager.b) layoutParams;
                    int itemViewType = eVar.getItemViewType();
                    if (itemViewType == -2147483647 || itemViewType == -2147483646 || itemViewType == 30) {
                        bVar.b = true;
                    } else {
                        bVar.b = false;
                    }
                }
            }
        });
        this.h = new LoadingFooterView(this.mContext);
        this.h.setNoMoreViewHeight(R.dimen.wm_sc_common_dimen_60);
        this.h.a();
        RecyclerView recyclerView2 = this.c;
        Object[] objArr5 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect5 = a;
        recyclerView2.addItemDecoration(PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "bdfdb541cf0559e2c1d5530683485415", RobustBitConfig.DEFAULT_VALUE) ? (RecyclerView.f) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "bdfdb541cf0559e2c1d5530683485415") : new RecyclerView.f() { // from class: com.sankuai.waimai.store.poi.list.newp.home.e.4
            public static ChangeQuickRedirect a;
            public int b;

            {
                this.b = e.this.a().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_4);
            }

            @Override // android.support.v7.widget.RecyclerView.f
            public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView3, RecyclerView.State state) {
                Object[] objArr6 = {rect, view, recyclerView3, state};
                ChangeQuickRedirect changeQuickRedirect6 = a;
                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "e738fb18f10f910bca6c97555bf47425", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "e738fb18f10f910bca6c97555bf47425");
                } else if (recyclerView3.getLayoutManager() instanceof StaggeredGridLayoutManager) {
                    if (((StaggeredGridLayoutManager.b) view.getLayoutParams()).b) {
                        rect.top = 0;
                        rect.bottom = 0;
                    }
                    rect.left = e.this.m.m;
                    rect.right = e.this.m.m;
                }
            }
        });
        this.d.d(this.h);
        if (this.m.n != -1) {
            this.h.setNoMoreView(this.m.n);
        }
        if (this.m.l != -1) {
            this.c.setBackgroundColor(((SCBaseActivity) this.mContext).getResources().getColor(this.m.l));
        }
    }

    public final void a(List<BaseModuleDesc> list, com.sankuai.waimai.store.convenient.base.b bVar) {
        Object[] objArr = {list, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83a28e160ec37c8f66f5f096428bc6b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83a28e160ec37c8f66f5f096428bc6b7");
        } else if (com.sankuai.shangou.stone.util.a.b(list)) {
            b();
        } else {
            this.l = true;
            new d().a(list, this.f, getClass().getName(), 0, this.m, new com.sankuai.waimai.store.poi.list.newp.home.callback.a() { // from class: com.sankuai.waimai.store.poi.list.newp.home.e.6
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.poi.list.newp.home.callback.a
                public final void a(List<com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc>> list2) {
                    Object[] objArr2 = {list2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0fa63809ae67057d07c58d2c88a74758", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0fa63809ae67057d07c58d2c88a74758");
                    } else if (list2 == null) {
                    } else {
                        e.this.m.s = "Success";
                        if (e.this.d != null) {
                            c cVar = e.this.d;
                            Object[] objArr3 = {list2};
                            ChangeQuickRedirect changeQuickRedirect3 = c.a;
                            if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "fd264ef384068be6041eccee8507204c", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "fd264ef384068be6041eccee8507204c");
                            } else {
                                cVar.b.clear();
                                if (!com.sankuai.shangou.stone.util.a.b(list2)) {
                                    cVar.b.addAll(list2);
                                }
                                cVar.m();
                            }
                        }
                        e.this.b();
                        if (!e.this.j || e.this.s == null) {
                            return;
                        }
                        e.this.s.b();
                    }
                }
            });
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8861c5d5d764ae09606661d45c3f23f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8861c5d5d764ae09606661d45c3f23f");
        } else {
            a(3, "");
        }
    }

    private void a(int i, String str) {
        Object[] objArr = {3, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "283b84889d66898295d9fd71e83ec936", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "283b84889d66898295d9fd71e83ec936");
        } else if (this.b != null) {
            this.b.a(3, str);
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ece36e6f5fd1c04d87b5a3d488861c4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ece36e6f5fd1c04d87b5a3d488861c4b");
        } else if (this.h != null) {
            this.h.e();
        }
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de62f14a7a744958357e0f51ee6d1db5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de62f14a7a744958357e0f51ee6d1db5");
        } else if (this.c != null) {
            this.c.scrollToPosition(0);
        }
    }
}
