package com.sankuai.waimai.store.widgets.filterbar.home;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.android.bus.annotation.Subscribe;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.platform.shop.model.SGSortModel;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.widgets.filterbar.home.controller.h;
import com.sankuai.waimai.store.widgets.filterbar.home.filter.d;
import com.sankuai.waimai.store.widgets.filterbar.home.filter.e;
import com.sankuai.waimai.store.widgets.filterbar.home.filter.j;
import com.sankuai.waimai.store.widgets.filterbar.home.model.BubbleInfoBean;
import com.sankuai.waimai.store.widgets.filterbar.home.model.FilterConditionResponse;
import com.sankuai.waimai.store.widgets.filterbar.home.model.SortItem;
import com.sankuai.waimai.store.widgets.filterbar.home.scene.c;
import com.sankuai.waimai.store.widgets.filterbar.home.scene.impl.DrugSpuBarStrategy;
import com.sankuai.waimai.store.widgets.filterbar.home.scene.impl.bean.QuickSortFilterBottomBean;
import com.sankuai.waimai.store.widgets.filterbar.home.scene.impl.bean.QuickSortFilterMiddleBean;
import com.sankuai.waimai.store.widgets.filterbar.home.scene.impl.bean.SpuFilterMiddleBean;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGSortFilterBarBlock extends com.sankuai.waimai.store.base.b implements h.b {
    public static ChangeQuickRedirect a;
    private final com.sankuai.waimai.store.widgets.filterbar.home.controller.a A;
    private View B;
    private boolean C;
    public ViewGroup b;
    public boolean c;
    public FrameLayout d;
    private final ViewGroup e;
    private final b f;
    private c g;
    private boolean h;
    private ViewGroup i;
    private int j;
    private d k;
    private com.sankuai.waimai.store.widgets.filterbar.home.sort.b l;
    private long m;
    private int n;
    private com.sankuai.waimai.store.widgets.filterbar.home.model.a o;
    private com.sankuai.waimai.store.widgets.filterbar.home.model.a p;
    private com.sankuai.waimai.store.widgets.filterbar.home.filter.a q;
    private com.sankuai.waimai.store.widgets.filterbar.home.filter.a r;
    private View.OnClickListener s;
    private com.sankuai.waimai.store.widgets.filterbar.home.scene.b t;
    private c u;
    private c v;
    private ViewGroup w;
    private ViewGroup x;
    private ViewGroup y;
    private com.sankuai.waimai.store.param.a z;

    public SGSortFilterBarBlock(boolean z, @NonNull Context context, @NonNull ViewGroup viewGroup, @NonNull b bVar, @NonNull com.sankuai.waimai.store.param.a aVar, @NonNull com.sankuai.waimai.store.widgets.filterbar.home.controller.a aVar2, int i) {
        super(context);
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), context, viewGroup, bVar, aVar, aVar2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "531cead141b0ad3e93b2a2058259ea3f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "531cead141b0ad3e93b2a2058259ea3f");
            return;
        }
        this.m = -1L;
        this.n = 0;
        this.c = false;
        this.s = new View.OnClickListener() { // from class: com.sankuai.waimai.store.widgets.filterbar.home.SGSortFilterBarBlock.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "606b695211bb9f460bc9189e143166ed", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "606b695211bb9f460bc9189e143166ed");
                } else {
                    SGSortFilterBarBlock.this.a(0);
                }
            }
        };
        this.t = new com.sankuai.waimai.store.widgets.filterbar.home.scene.b() { // from class: com.sankuai.waimai.store.widgets.filterbar.home.SGSortFilterBarBlock.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.widgets.filterbar.home.scene.b
            public final void a(int i2) {
                Object[] objArr2 = {0};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5b4862bbdd42e55f72e8bd5d2cb4125d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5b4862bbdd42e55f72e8bd5d2cb4125d");
                } else {
                    SGSortFilterBarBlock.this.a(0);
                }
            }

            @Override // com.sankuai.waimai.store.widgets.filterbar.home.scene.b
            public final int a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "83239449d987a51d264a74c31c6313de", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "83239449d987a51d264a74c31c6313de")).intValue() : SGSortFilterBarBlock.this.n;
            }

            @Override // com.sankuai.waimai.store.widgets.filterbar.home.scene.b
            public final void a(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ecea84211edbe216a0a930e987cf030e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ecea84211edbe216a0a930e987cf030e");
                } else {
                    SGSortFilterBarBlock.this.a(view);
                }
            }
        };
        this.C = false;
        this.A = aVar2;
        this.z = aVar;
        this.e = viewGroup;
        this.f = bVar;
        this.h = z;
        this.j = i;
    }

    @Subscribe
    public void onCategoryBackgroundChanged(com.sankuai.waimai.store.widgets.filterbar.event.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1c3c9a64a5ec2ca85fab4002d0fefc3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1c3c9a64a5ec2ca85fab4002d0fefc3");
        } else if (aVar == null || aVar.c != System.identityHashCode(this.mView.getContext())) {
        } else {
            this.C = aVar.a;
            if (aVar.a || (this.z.f() && aVar.b)) {
                this.mView.setBackgroundResource(R.color.wm_sg_color_FFFFFF);
                if (this.z.bg == 1) {
                    a(true, false);
                }
            } else if (this.z.be) {
                d(false);
            } else if (this.z.bg == 1) {
                a(false, false);
            } else {
                this.mView.setBackgroundColor(com.sankuai.shangou.stone.util.d.a(this.z.E, -657930));
            }
        }
    }

    public final void a(boolean z) {
        c cVar;
        c cVar2;
        int i;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "825e22875f153d3349edd15cfa574685", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "825e22875f153d3349edd15cfa574685");
            return;
        }
        this.h = z;
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_16);
        int dimensionPixelSize2 = getContext().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_28) + (this.z.bl ? d() : 0);
        getContext().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_8);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.e.getLayoutParams();
        if (z) {
            if (this.z.g()) {
                this.b.getLayoutParams().height = 0;
                marginLayoutParams.topMargin = 0;
            } else if (this.z.h()) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.b.getLayoutParams();
                marginLayoutParams2.height = dimensionPixelSize + dimensionPixelSize2;
                marginLayoutParams2.topMargin = com.sankuai.shangou.stone.util.h.a(getContext(), -8.0f);
                marginLayoutParams2.bottomMargin = com.sankuai.shangou.stone.util.h.a(getContext(), -4.0f);
                if (this.z.f == null || this.z.az.get(this.z.f) == null) {
                    i = 0;
                } else {
                    i = com.sankuai.shangou.stone.util.h.a(getContext(), this.z.az.get(this.z.f).booleanValue() ? 15.0f : -50.0f);
                }
                marginLayoutParams.topMargin = dimensionPixelSize + (dimensionPixelSize2 * 2) + i;
            } else {
                int i2 = dimensionPixelSize + dimensionPixelSize2;
                this.b.getLayoutParams().height = i2;
                marginLayoutParams.topMargin = i2;
            }
        } else {
            this.b.getLayoutParams().height = dimensionPixelSize2;
            marginLayoutParams.topMargin = dimensionPixelSize2;
        }
        if (this.A.a == 2 || this.A.a == 1) {
            Context context = this.mContext;
            ViewGroup viewGroup = this.e;
            b bVar = this.f;
            Object[] objArr2 = {context, viewGroup, bVar};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8c001513a5ce7862b0e39bad8e152fe8", RobustBitConfig.DEFAULT_VALUE)) {
                cVar = (c) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8c001513a5ce7862b0e39bad8e152fe8");
            } else if (this.z.g()) {
                Object[] objArr3 = {context, viewGroup, bVar};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b09827048e4ebf75939f3798d44a878e", RobustBitConfig.DEFAULT_VALUE)) {
                    cVar = (c) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b09827048e4ebf75939f3798d44a878e");
                } else {
                    if (this.u == null) {
                        this.u = new DrugSpuBarStrategy(viewGroup, context, bVar, this.t);
                        this.u.a(this.w);
                        this.u.b(this.x);
                        this.u.c(this.y);
                        int dimensionPixelSize3 = getContext().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_12);
                        this.x.setPadding(dimensionPixelSize3, 0, dimensionPixelSize3, dimensionPixelSize3 / 2);
                    }
                    cVar = this.u;
                }
            } else {
                if (this.u == null) {
                    this.u = new com.sankuai.waimai.store.widgets.filterbar.home.scene.impl.b(viewGroup, context, bVar, this.t);
                    this.u.a(this.w);
                    this.u.b(this.x);
                    this.u.c(this.y);
                    getContext().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_12);
                    this.x.setPadding(0, 0, 0, 0);
                }
                cVar = this.u;
            }
            this.g = cVar;
        } else {
            Context context2 = this.mContext;
            b bVar2 = this.f;
            Object[] objArr4 = {context2, bVar2};
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "d7504af2f6e1578cda47b464fe9841e3", RobustBitConfig.DEFAULT_VALUE)) {
                cVar2 = (c) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "d7504af2f6e1578cda47b464fe9841e3");
            } else {
                if (this.v == null) {
                    this.v = new com.sankuai.waimai.store.widgets.filterbar.home.scene.impl.a(context2, bVar2, this.t, this.z);
                    this.v.a(this.w);
                    this.v.b(this.x);
                    this.v.c(this.y);
                    int dimensionPixelSize4 = getContext().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_12);
                    this.x.setPadding(dimensionPixelSize4, 0, dimensionPixelSize4, dimensionPixelSize4 / 2);
                }
                cVar2 = this.v;
            }
            this.g = cVar2;
        }
        this.g.b();
        this.g.b(e());
        if (this.z.bg == 1) {
            a(this.C, true);
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d270e11a36cb89ff523f9add2fe5af0d", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d270e11a36cb89ff523f9add2fe5af0d");
        }
        if (this.A.a == 3 || this.A.a == 4) {
            return a(layoutInflater, viewGroup, R.layout.wm_sc_feed_list_filterbar_block_layout);
        }
        if (this.z.f()) {
            return a(layoutInflater, viewGroup, R.layout.wm_sc_flower_filterbar_home_block);
        }
        return a(layoutInflater, viewGroup, R.layout.wm_sc_filterbar_home_block);
    }

    private View a(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, int i) {
        Object[] objArr = {layoutInflater, viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23f06639354d8dbd550bca8e14292d7d", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23f06639354d8dbd550bca8e14292d7d");
        }
        if (!com.sankuai.waimai.store.manager.abtest.a.a(com.sankuai.waimai.store.pagingload.c.b).a() && com.sankuai.waimai.store.base.abtest.a.f() && this.z != null && this.z.bh != null) {
            return this.z.bh.a(this.mContext, i);
        }
        return layoutInflater.inflate(i, viewGroup, false);
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66146919e8e7a3b83ec298bc23ef55ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66146919e8e7a3b83ec298bc23ef55ef");
            return;
        }
        super.onViewCreated();
        this.b = (ViewGroup) findView(R.id.rl_filterbar_top_container);
        this.d = (FrameLayout) findView(R.id.ll_coupview_machview);
        this.B = findView(R.id.fl_empty_line);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0f6314decb52571412bb41802b57b0b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0f6314decb52571412bb41802b57b0b3");
        } else {
            ViewGroup viewGroup = (ViewGroup) findView(R.id.fl_sort_container);
            viewGroup.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.widgets.filterbar.home.SGSortFilterBarBlock.3
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "86294b0cf0e549dde08bea9aa8d1686d", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "86294b0cf0e549dde08bea9aa8d1686d");
                    } else {
                        SGSortFilterBarBlock.this.f.a(SGSortFilterBarBlock.this.n == 1);
                    }
                }
            });
            this.q = new com.sankuai.waimai.store.widgets.filterbar.home.filter.a(getContext());
            this.q.createAndReplaceView(viewGroup);
            this.q.a(0);
            this.q.c = e();
            com.sankuai.waimai.store.widgets.filterbar.home.filter.a aVar = this.q;
            com.sankuai.waimai.store.param.a aVar2 = this.z;
            Object[] objArr3 = {aVar2};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.widgets.filterbar.home.filter.a.a;
            if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "7d65eaf64c94c84309a5f7418c835f03", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "7d65eaf64c94c84309a5f7418c835f03");
            } else {
                aVar.d = aVar2;
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.store.widgets.filterbar.home.filter.a.a;
                if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "2279685f23c58ff130dd86c0b8fe6983", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "2279685f23c58ff130dd86c0b8fe6983");
                } else if (aVar.d != null && aVar.d.bg == 1) {
                    aVar.b.setTextSize(2, 12.0f);
                }
            }
            Object[] objArr5 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect5 = a;
            this.l = PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "d2f764d660f1384e44bbd2a405fecb15", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.widgets.filterbar.home.sort.b) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "d2f764d660f1384e44bbd2a405fecb15") : new com.sankuai.waimai.store.widgets.filterbar.home.sort.b(getContext(), this.z, new com.sankuai.waimai.store.widgets.filterbar.home.sort.c() { // from class: com.sankuai.waimai.store.widgets.filterbar.home.SGSortFilterBarBlock.4
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.widgets.filterbar.home.sort.c
                public final long a() {
                    Object[] objArr6 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "92df328b31c6203208c05b9289d1daf0", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Long) PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "92df328b31c6203208c05b9289d1daf0")).longValue();
                    }
                    SGSortFilterBarBlock.this.a(SGSortFilterBarBlock.this.h);
                    return SGSortFilterBarBlock.this.m;
                }

                @Override // com.sankuai.waimai.store.widgets.filterbar.home.sort.c
                public final void a(long j) {
                    Object[] objArr6 = {new Long(j)};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "3c658b758abb4acbb438ac7820cd181f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "3c658b758abb4acbb438ac7820cd181f");
                        return;
                    }
                    SGSortFilterBarBlock.this.f.a(j, false);
                    SGSortFilterBarBlock.this.a(0);
                }
            });
            this.l.createView(this.e);
        }
        Object[] objArr6 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect6 = a;
        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "d5da8e319b39adc610b0f1330671437e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "d5da8e319b39adc610b0f1330671437e");
        } else {
            this.w = (ViewGroup) findView(R.id.fl_bar_middle_container);
            this.x = (ViewGroup) findView(R.id.fl_quick_filter_container);
            this.y = (ViewGroup) findView(R.id.fl_coupon_filter_container);
        }
        Object[] objArr7 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect7 = a;
        if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "af770f96107b096762dc3cc9901db1f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "af770f96107b096762dc3cc9901db1f7");
        } else {
            this.i = (ViewGroup) findView(R.id.fl_filter_container);
            this.i.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.widgets.filterbar.home.SGSortFilterBarBlock.5
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr8 = {view};
                    ChangeQuickRedirect changeQuickRedirect8 = a;
                    if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "65e387045f7d5802833f9ef920e959cf", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "65e387045f7d5802833f9ef920e959cf");
                    } else {
                        SGSortFilterBarBlock.this.f.a(2, SGSortFilterBarBlock.this.n == 2);
                    }
                }
            });
            c(true);
            this.r = new com.sankuai.waimai.store.widgets.filterbar.home.filter.a(getContext());
            this.r.createAndReplaceView(this.i);
            this.r.setVisible(true);
            this.r.c = e();
            Object[] objArr8 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect8 = a;
            this.k = PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "0a9525fc05f79f761a3a704754a6cad5", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "0a9525fc05f79f761a3a704754a6cad5") : new d(getContext(), new e() { // from class: com.sankuai.waimai.store.widgets.filterbar.home.SGSortFilterBarBlock.6
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.widgets.filterbar.home.filter.e
                public final void a(boolean z, String str, boolean z2, String str2, BubbleInfoBean bubbleInfoBean) {
                    Object[] objArr9 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str, Byte.valueOf(z2 ? (byte) 1 : (byte) 0), str2, bubbleInfoBean};
                    ChangeQuickRedirect changeQuickRedirect9 = a;
                    if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "764ad3d7e08c09325273eb6573fc69b3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "764ad3d7e08c09325273eb6573fc69b3");
                    } else {
                        SGSortFilterBarBlock.this.f.a(2, z, str, z2, str2);
                    }
                }

                @Override // com.sankuai.waimai.store.widgets.filterbar.home.filter.e
                public final void a() {
                    Object[] objArr9 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect9 = a;
                    if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "038494e86fd077c22c615eb7a9e0ebb3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "038494e86fd077c22c615eb7a9e0ebb3");
                        return;
                    }
                    SGSortFilterBarBlock.this.f.c(2);
                    SGSortFilterBarBlock.this.a(0);
                }

                @Override // com.sankuai.waimai.store.widgets.filterbar.home.filter.e
                public final void b() {
                    Object[] objArr9 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect9 = a;
                    if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "fefc3fb3073bc2c24aa88679bb546c9b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "fefc3fb3073bc2c24aa88679bb546c9b");
                    } else {
                        SGSortFilterBarBlock.this.f.d(2);
                    }
                }

                @Override // com.sankuai.waimai.store.widgets.filterbar.home.filter.e
                public final void c() {
                    Object[] objArr9 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect9 = a;
                    if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "0db851ea226c9c36c1fa81f8f2ad4d7b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "0db851ea226c9c36c1fa81f8f2ad4d7b");
                    } else {
                        SGSortFilterBarBlock.this.a(0);
                    }
                }

                @Override // com.sankuai.waimai.store.widgets.filterbar.home.filter.e
                public final com.sankuai.waimai.store.widgets.filterbar.home.model.a d() {
                    Object[] objArr9 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect9 = a;
                    if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "7a1ec13d41523aab70acf177262b8fc6", RobustBitConfig.DEFAULT_VALUE)) {
                        return (com.sankuai.waimai.store.widgets.filterbar.home.model.a) PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "7a1ec13d41523aab70acf177262b8fc6");
                    }
                    com.sankuai.waimai.store.widgets.filterbar.home.model.a aVar3 = new com.sankuai.waimai.store.widgets.filterbar.home.model.a(SGSortFilterBarBlock.this.p);
                    aVar3.e = false;
                    return aVar3;
                }
            });
            this.k.createView(this.e);
        }
        a(0);
        if (this.z.W || (this.z.f() && this.z.X)) {
            this.mView.setBackgroundResource(R.color.wm_sg_color_FFFFFF);
        } else if (this.z.be) {
            this.mView.getLayoutParams().height = com.sankuai.shangou.stone.util.h.a(this.mContext, 30.0f);
            this.mView.setPadding(0, 2, 0, 0);
            d(false);
        } else if (this.z.bg == 1) {
            a(false, false);
        } else {
            this.mView.setBackgroundColor(com.sankuai.shangou.stone.util.d.a(this.z.E, -657930));
        }
        u.c(this.d);
        com.meituan.android.bus.a.a().a(this);
    }

    private void d(boolean z) {
        Object[] objArr = {(byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34dabf71be5bcc5c47e996fceef843fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34dabf71be5bcc5c47e996fceef843fa");
        } else if (this.mView == null || this.mContext == null) {
        } else {
            float a2 = com.sankuai.shangou.stone.util.h.a(this.mContext, 20.0f);
            e.a c = new e.a().c(com.sankuai.waimai.store.util.b.b(this.mContext, R.color.wm_sg_color_F5F5F6));
            c.a(a2, a2, 0.0f, 0.0f);
            this.mView.setBackground(c.a());
        }
    }

    private void a(boolean z, boolean z2) {
        Context context;
        float f;
        int a2;
        Context context2;
        Context context3;
        float f2;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7222617f60dc9bffcd640f7708542b0c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7222617f60dc9bffcd640f7708542b0c");
        } else if (this.b == null || this.mView == null || this.mContext == null) {
        } else {
            if (this.j == 2 && z && !this.z.bk && !z2) {
                u.c(this.mView);
            }
            if (this.z.bl) {
                u.c(this.mView, 0, z ? d() : 0, 0, 0);
            }
            this.mView.setPadding(0, (!this.z.O || z) ? com.sankuai.shangou.stone.util.h.a(this.mContext, 0.0f) : com.sankuai.shangou.stone.util.h.a(this.mContext, 10.5f), 0, 0);
            this.mView.setBackgroundResource(z ? R.color.wm_sg_color_FFFFFF : R.color.wm_sg_color_F5F5F6);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.b.getLayoutParams();
            if (this.z.bl) {
                if (z) {
                    context3 = this.mContext;
                    f2 = 29.0f;
                } else {
                    context3 = this.mContext;
                    f2 = 33.0f;
                }
                marginLayoutParams.height = com.sankuai.shangou.stone.util.h.a(context3, f2);
            } else {
                if (z) {
                    context = this.mContext;
                    f = 32.0f;
                } else {
                    context = this.mContext;
                    f = 35.0f;
                }
                marginLayoutParams.height = com.sankuai.shangou.stone.util.h.a(context, f);
            }
            int a3 = com.sankuai.shangou.stone.util.h.a(this.mContext, 12.0f);
            this.b.setPadding(a3, 0, a3, 0);
            int a4 = z ? com.sankuai.shangou.stone.util.h.a(this.mContext, 4.0f) : com.sankuai.shangou.stone.util.h.a(this.mContext, 12.0f);
            float f3 = -9.0f;
            if (this.z.bl) {
                if (z) {
                    context2 = this.mContext;
                    f3 = -4.0f;
                } else {
                    context2 = this.mContext;
                }
                a2 = com.sankuai.shangou.stone.util.h.a(context2, f3);
            } else {
                a2 = z ? 0 : com.sankuai.shangou.stone.util.h.a(this.mContext, -9.0f);
            }
            marginLayoutParams.setMargins(a4, 0, a4, a2);
            float a5 = z ? 0.0f : com.sankuai.shangou.stone.util.h.a(this.mContext, 12.0f);
            e.a aVar = new e.a();
            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
            int[] iArr = new int[2];
            iArr[0] = com.sankuai.shangou.stone.util.d.a("#FFFFFF", -1);
            iArr[1] = com.sankuai.shangou.stone.util.d.a(z ? "#FFFFFF" : "#F5F5F6", -1);
            e.a a6 = aVar.a(orientation, iArr);
            a6.a(a5, a5, 0.0f, 0.0f);
            this.b.setBackground(a6.a());
        }
    }

    private int d() {
        Context context;
        int i;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5076b3279820610eab65bb1466910d54", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5076b3279820610eab65bb1466910d54")).intValue();
        }
        if (this.z.bg != 1) {
            return 0;
        }
        int i2 = this.z.bn ? 29 : 0;
        if (this.z.P <= 1) {
            return com.sankuai.shangou.stone.util.h.a(this.mContext, i2 + 0);
        }
        if (this.z.P > 1 && this.z.P <= 4) {
            if (this.j == 2) {
                context = this.mContext;
                i = i2 + 10;
            } else {
                context = this.mContext;
                i = i2 + 13;
            }
            return com.sankuai.shangou.stone.util.h.a(context, i);
        } else if (this.z.P > 4 && this.z.P <= 8) {
            return com.sankuai.shangou.stone.util.h.a(this.mContext, i2 + 13);
        } else {
            return com.sankuai.shangou.stone.util.h.a(this.mContext, i2 + 5.5f);
        }
    }

    private int e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "200aea3a34c6b1676fddbdbea1aceb55", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "200aea3a34c6b1676fddbdbea1aceb55")).intValue() : (com.sankuai.shangou.stone.util.h.a(getContext()) - getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_68)) / 4;
    }

    public void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "258a19d69031fffbfccbc93619d1db4a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "258a19d69031fffbfccbc93619d1db4a");
            return;
        }
        if (this.n == 2) {
            this.f.b(2);
        } else if (this.n == 1) {
            this.f.b();
        } else if (this.n == 3) {
            this.f.b(0);
        } else if (this.n == 4) {
            this.f.b(1);
        }
        if (i == 0) {
            this.q.b(false);
            this.r.a(false);
            this.e.removeAllViews();
            this.e.setVisibility(8);
            if (this.g != null) {
                this.g.a(0);
            }
        } else if (i == 1) {
            this.q.b(true);
            this.r.a(false);
            a(this.l.getView());
            this.f.a();
            if (this.g != null) {
                this.g.a(0);
            }
        } else if (i == 2) {
            e(true);
            this.q.b(false);
            this.r.a(true);
            this.k.a();
            a(this.k.getView());
            this.f.a(2);
            if (this.g != null) {
                this.g.a(0);
            }
        } else {
            this.q.b(false);
            this.r.a(false);
            if (this.g != null) {
                this.g.a(i);
            }
        }
        if (i == 0 && !this.r.a()) {
            e(false);
        }
        this.q.c(true ^ this.c);
        this.n = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "268bc1b7fb6f5d3fe0b6851ce16365a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "268bc1b7fb6f5d3fe0b6851ce16365a6");
            return;
        }
        this.e.removeAllViews();
        this.e.addView(view);
        this.e.setVisibility(0);
        this.e.setOnClickListener(this.s);
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.h.b
    public final void a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "752dd8e18bd38c3d002b4fe92ce58973", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "752dd8e18bd38c3d002b4fe92ce58973");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.q.a(str);
        }
    }

    private void e(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e58308d06bb79d4ed74021099cfd43c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e58308d06bb79d4ed74021099cfd43c");
            return;
        }
        this.r.a(getContext().getResources().getString((this.o == null || this.o.d) ? R.string.wm_sc_common_filter : R.string.wm_sc_common_more));
        this.r.c(z);
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.h.b
    public final void a(long j, List<SortItem> list) {
        Object[] objArr = {new Long(j), list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00508b18fa19961d43f84906e66f7ce8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00508b18fa19961d43f84906e66f7ce8");
            return;
        }
        this.m = j;
        com.sankuai.waimai.store.widgets.filterbar.home.sort.b bVar = this.l;
        Object[] objArr2 = {list};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.widgets.filterbar.home.sort.b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "5cecab71122d1a86633ea931c4695042", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "5cecab71122d1a86633ea931c4695042");
        } else {
            bVar.b.b_(list);
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.h.b
    public final void b(long j, List<SGSortModel> list) {
        Object[] objArr = {new Long(j), list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0da5e6ab5ce92ff2cc1e96221a34feca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0da5e6ab5ce92ff2cc1e96221a34feca");
            return;
        }
        this.m = j;
        this.g.a(new QuickSortFilterMiddleBean(j, list));
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.h.b
    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89eb5866aacdd418a16e555ed4d90fd7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89eb5866aacdd418a16e555ed4d90fd7");
        } else if (z) {
            this.b.setVisibility(0);
            this.mView.setVisibility(0);
        } else {
            this.b.setVisibility(8);
            this.mView.setVisibility(8);
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.h.b
    public final void a(int i, int i2, List<String> list, List<FilterConditionResponse.FilterGroup> list2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), list, list2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f569f2126c7dfd176f4c559144c5e0ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f569f2126c7dfd176f4c559144c5e0ae");
        } else if (i != 2) {
            if (i2 == 0) {
                a(this.h);
                this.g.a(new SpuFilterMiddleBean(i, list, list2));
            }
        } else {
            switch (i2) {
                case 0:
                    this.k.a(list, list2);
                    return;
                case 1:
                    a(this.h);
                    d dVar = this.k;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = d.a;
                    if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "0947b04c942fbfbdce5f305ff9014e32", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "0947b04c942fbfbdce5f305ff9014e32");
                        return;
                    }
                    dVar.c.setVisibility(8);
                    dVar.d.setVisibility(8);
                    dVar.e.setVisibility(8);
                    dVar.f.setVisibility(0);
                    return;
                case 2:
                    d dVar2 = this.k;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = d.a;
                    if (PatchProxy.isSupport(objArr3, dVar2, changeQuickRedirect3, false, "60e2497db7ac82f7a1d381e895a3c9d4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, dVar2, changeQuickRedirect3, false, "60e2497db7ac82f7a1d381e895a3c9d4");
                        return;
                    }
                    dVar2.c.setVisibility(8);
                    dVar2.d.setVisibility(8);
                    dVar2.e.setVisibility(0);
                    dVar2.f.setVisibility(8);
                    return;
                case 3:
                    d dVar3 = this.k;
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = d.a;
                    if (PatchProxy.isSupport(objArr4, dVar3, changeQuickRedirect4, false, "d948dcadf4359cbe6969c2356cb1f492", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, dVar3, changeQuickRedirect4, false, "d948dcadf4359cbe6969c2356cb1f492");
                        return;
                    }
                    dVar3.c.setVisibility(8);
                    dVar3.d.setVisibility(0);
                    dVar3.e.setVisibility(8);
                    dVar3.f.setVisibility(8);
                    return;
                default:
                    return;
            }
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.h.b
    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7f11b030d7121377f22d2b2c5fba32b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7f11b030d7121377f22d2b2c5fba32b");
        } else if (i == 2) {
            if (this.z.f() && j.h) {
                this.r.a(i2 - 1);
            } else {
                this.r.a(i2);
            }
            if (i2 > 0) {
                e(true);
            } else if (this.n != 2) {
                e(false);
            }
        } else {
            this.g.a(i, i2);
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.h.b
    public final void a(boolean z, String str, List<String> list, List<FilterConditionResponse.FilterGroup.FilterItem> list2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str, list, list2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12e119fa8315e50c4ab5f5d3ee6047c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12e119fa8315e50c4ab5f5d3ee6047c2");
        } else {
            this.g.a(new QuickSortFilterBottomBean(z, str, list, list2));
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.h.b
    public final void a(BaseModuleDesc baseModuleDesc) {
        Object[] objArr = {baseModuleDesc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d25f106dd592175baf15663fbd0696ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d25f106dd592175baf15663fbd0696ac");
        } else {
            this.g.a(baseModuleDesc);
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.h.b
    public final void c(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04cd73ab6b82289a0f3936f709c52e7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04cd73ab6b82289a0f3936f709c52e7b");
        } else if (this.A.a == 3) {
            u.c(this.i);
        } else if (!this.h) {
            this.i.setVisibility(z ? 0 : 8);
        } else {
            this.i.setVisibility(0);
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.h.b
    public final void a(List<String> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d38351fea0b90743c6b2b869949d9bd7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d38351fea0b90743c6b2b869949d9bd7");
        } else {
            this.g.a(list);
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb38e2968c8bfc59fd9595320e1bbf50", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb38e2968c8bfc59fd9595320e1bbf50");
            return;
        }
        this.g.a(new QuickSortFilterBottomBean());
        a(0, 0);
        a(1, 0);
        a(2, 0);
        a(3, 0);
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2dc78f013164df549d7faa28534cf568", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2dc78f013164df549d7faa28534cf568");
        } else {
            a(0);
        }
    }

    public final View c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0f222d17bb441e2d5f8e32287a1d180", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0f222d17bb441e2d5f8e32287a1d180") : this.g.a();
    }

    public final void a(com.sankuai.waimai.store.widgets.filterbar.home.model.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8779512505ea611e9705c25c8e27a782", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8779512505ea611e9705c25c8e27a782");
            return;
        }
        this.g.a(aVar);
        this.p = aVar;
    }

    public final void b(com.sankuai.waimai.store.widgets.filterbar.home.model.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3051c6ea49eb7333a3e39deb8a310b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3051c6ea49eb7333a3e39deb8a310b6");
        } else if (this.o == null || !this.o.equals(aVar)) {
            this.o = aVar;
            this.g.b(aVar);
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "81b9a2278fa4b905f6192c6ef3ddffaf", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "81b9a2278fa4b905f6192c6ef3ddffaf");
            } else if (this.o == null) {
            } else {
                this.r.a(this.o);
                this.q.a(this.o);
                a((String) null, this.m >= 0);
                e(this.r.a());
                a(this.n);
            }
        }
    }

    public final void a(com.sankuai.waimai.store.base.statistic.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "794f1bc58aff5a9537ec2ee372a47e6e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "794f1bc58aff5a9537ec2ee372a47e6e");
        } else {
            this.g.a(aVar);
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7b299d38be36c09241ed980fd00cf3a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7b299d38be36c09241ed980fd00cf3a");
            return;
        }
        super.onDestroy();
        com.meituan.android.bus.a.a().b(this);
        if (this.v != null) {
            this.v.c();
        }
        if (this.u != null) {
            this.u.c();
        }
        if (this.k != null) {
            this.k.onDestroy();
        }
    }
}
