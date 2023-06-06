package com.sankuai.waimai.store.widgets.filterbar.home.scene.impl;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.meituan.android.bus.annotation.Subscribe;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.widgets.filterbar.home.filter.b;
import com.sankuai.waimai.store.widgets.filterbar.home.filter.d;
import com.sankuai.waimai.store.widgets.filterbar.home.filter.e;
import com.sankuai.waimai.store.widgets.filterbar.home.model.BubbleInfoBean;
import com.sankuai.waimai.store.widgets.filterbar.home.model.FilterConditionResponse;
import com.sankuai.waimai.store.widgets.filterbar.home.scene.impl.bean.QuickSortFilterBottomBean;
import com.sankuai.waimai.store.widgets.filterbar.home.scene.impl.bean.SpuFilterMiddleBean;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class DrugSpuBarStrategy extends com.sankuai.waimai.store.widgets.filterbar.home.scene.a {
    public static ChangeQuickRedirect e;
    private final com.sankuai.waimai.store.widgets.filterbar.home.filter.b f;
    private final ViewGroup g;
    private final d h;
    private final com.sankuai.waimai.store.widgets.filterbar.home.filter.a i;
    private final d j;
    private final com.sankuai.waimai.store.widgets.filterbar.home.filter.a k;
    private ViewGroup l;
    private ViewGroup m;
    private com.sankuai.waimai.store.widgets.filterbar.home.model.a n;

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.scene.c
    public final void c(ViewGroup viewGroup) {
    }

    public DrugSpuBarStrategy(@NonNull ViewGroup viewGroup, @NonNull Context context, @NonNull com.sankuai.waimai.store.widgets.filterbar.home.b bVar, @NonNull com.sankuai.waimai.store.widgets.filterbar.home.scene.b bVar2) {
        super(context, bVar, bVar2);
        Object[] objArr = {viewGroup, context, bVar, bVar2};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d210667c789a6dc098c4f7878f1fb4b2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d210667c789a6dc098c4f7878f1fb4b2");
            return;
        }
        this.g = viewGroup;
        this.i = new com.sankuai.waimai.store.widgets.filterbar.home.filter.a(this.b);
        this.k = new com.sankuai.waimai.store.widgets.filterbar.home.filter.a(this.b);
        this.h = new d(this.b, new a(0));
        this.h.createView(this.g);
        this.j = new d(this.b, new a(1));
        this.j.createView(this.g);
        this.f = new com.sankuai.waimai.store.widgets.filterbar.home.filter.b(this.b);
        com.meituan.android.bus.a.a().a(this);
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.scene.c
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02f3ae874259a7b4a8efcd7b6dedc610", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02f3ae874259a7b4a8efcd7b6dedc610");
            return;
        }
        if (this.h != null) {
            this.h.onDestroy();
        }
        if (this.j != null) {
            this.j.onDestroy();
        }
        com.meituan.android.bus.a.a().b(this);
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.scene.c
    public final void a(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ad739be63321e525036fe3a54127239", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ad739be63321e525036fe3a54127239");
            return;
        }
        this.l = viewGroup;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        layoutParams.gravity = 5;
        viewGroup.setLayoutParams(layoutParams);
        viewGroup.removeAllViews();
        int dimensionPixelOffset = this.b.getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_27);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        viewGroup.getLayoutParams().height = dimensionPixelOffset;
        marginLayoutParams.rightMargin = this.b.getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_25);
        this.i.createView(viewGroup);
        viewGroup.addView(this.i.getView(), marginLayoutParams);
        this.i.a(0);
        this.i.getView().setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.widgets.filterbar.home.scene.impl.DrugSpuBarStrategy.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d4cf2f6fd6d9233b1d3d709e2303fe22", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d4cf2f6fd6d9233b1d3d709e2303fe22");
                } else {
                    DrugSpuBarStrategy.this.c.a(0, DrugSpuBarStrategy.this.d.a() == 3);
                }
            }
        });
        this.i.setVisible(false);
        this.k.createView(viewGroup);
        viewGroup.addView(this.k.getView(), marginLayoutParams);
        this.k.a(0);
        this.k.getView().setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.widgets.filterbar.home.scene.impl.DrugSpuBarStrategy.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5613f736198ad8467f6b91b08e461117", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5613f736198ad8467f6b91b08e461117");
                } else {
                    DrugSpuBarStrategy.this.c.a(1, DrugSpuBarStrategy.this.d.a() == 4);
                }
            }
        });
        this.k.setVisible(false);
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.scene.c
    public final void b(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8614ff454a59d275e0f223618764969d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8614ff454a59d275e0f223618764969d");
            return;
        }
        this.m = viewGroup;
        this.f.createAndReplaceView(this.m);
        this.f.h = new b.InterfaceC1341b() { // from class: com.sankuai.waimai.store.widgets.filterbar.home.scene.impl.DrugSpuBarStrategy.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.widgets.filterbar.home.filter.b.InterfaceC1341b
            public final void a(View view, boolean z, String str, boolean z2, String str2, boolean z3) {
                Object[] objArr2 = {view, Byte.valueOf(z ? (byte) 1 : (byte) 0), str, Byte.valueOf(z2 ? (byte) 1 : (byte) 0), str2, Byte.valueOf(z3 ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a0334d5cf38f8c559bb45e99631950e6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a0334d5cf38f8c559bb45e99631950e6");
                } else if (z3) {
                    DrugSpuBarStrategy.this.c.a(view, z, str, z2, str2, null);
                } else {
                    DrugSpuBarStrategy.this.c.b(view, z, str, z2, str2, null);
                }
            }
        };
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.scene.a, com.sankuai.waimai.store.widgets.filterbar.home.scene.c
    public final void a(List<String> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f792a8669fcea232149f86c64f1d61d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f792a8669fcea232149f86c64f1d61d2");
            return;
        }
        super.a(list);
        String str = (String) com.sankuai.shangou.stone.util.a.a((List<Object>) list, 0);
        String str2 = (String) com.sankuai.shangou.stone.util.a.a((List<Object>) list, 1);
        if (!TextUtils.isEmpty(str)) {
            this.i.a(str);
            this.i.setVisible(true);
        } else {
            this.i.setVisible(false);
        }
        if (!TextUtils.isEmpty(str2)) {
            this.k.a(str2);
            this.k.setVisible(true);
            return;
        }
        this.k.setVisible(false);
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.scene.a, com.sankuai.waimai.store.widgets.filterbar.home.scene.c
    public final void a(SpuFilterMiddleBean spuFilterMiddleBean) {
        Object[] objArr = {spuFilterMiddleBean};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b81216be73b2b6fc23412ba498d45757", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b81216be73b2b6fc23412ba498d45757");
            return;
        }
        int i = spuFilterMiddleBean.index;
        FilterConditionResponse.FilterGroup filterGroup = (FilterConditionResponse.FilterGroup) com.sankuai.shangou.stone.util.a.a((List<Object>) spuFilterMiddleBean.groupList, 0);
        FilterConditionResponse.FilterGroup filterGroup2 = (FilterConditionResponse.FilterGroup) com.sankuai.shangou.stone.util.a.a((List<Object>) spuFilterMiddleBean.groupList, 1);
        if (filterGroup != null && i == 0) {
            this.h.a(spuFilterMiddleBean.selectCodeList, filterGroup);
        }
        if (filterGroup2 == null || i != 1) {
            return;
        }
        this.j.a(spuFilterMiddleBean.selectCodeList, filterGroup2);
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.scene.a, com.sankuai.waimai.store.widgets.filterbar.home.scene.c
    public final void a(@NonNull QuickSortFilterBottomBean quickSortFilterBottomBean) {
        Object[] objArr = {quickSortFilterBottomBean};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c29467ca76f455ffb4f22a106575ebe6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c29467ca76f455ffb4f22a106575ebe6");
        } else if (com.sankuai.shangou.stone.util.a.b(quickSortFilterBottomBean.filterList)) {
            u.c(this.m);
        } else {
            u.a(this.m);
            com.sankuai.waimai.store.widgets.filterbar.home.filter.b bVar = this.f;
            Object[] objArr2 = {quickSortFilterBottomBean};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.widgets.filterbar.home.filter.b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "1e2af848d21afee7a93600a9437aff7a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "1e2af848d21afee7a93600a9437aff7a");
                return;
            }
            if (!TextUtils.equals(bVar.e.group, quickSortFilterBottomBean.group)) {
                bVar.b.scrollToPosition(0);
            }
            if (!com.sankuai.shangou.stone.util.a.b(quickSortFilterBottomBean.filterList)) {
                if (!TextUtils.equals(bVar.e.group, quickSortFilterBottomBean.group) || quickSortFilterBottomBean.selectCodeList.size() == 0) {
                    quickSortFilterBottomBean.selectCodeList.add(quickSortFilterBottomBean.filterList.get(0).code);
                    if (bVar.h != null) {
                        bVar.h.a(bVar.getView(), bVar.e.canMultiSelect, quickSortFilterBottomBean.group, true, quickSortFilterBottomBean.filterList.get(0).code, false);
                    }
                }
                bVar.e = quickSortFilterBottomBean;
            }
            bVar.d.notifyDataSetChanged();
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.scene.c
    public final View a() {
        return this.m;
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.scene.c
    public final void a(com.sankuai.waimai.store.widgets.filterbar.home.model.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd021ffbc959660beff10ff89c7be1f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd021ffbc959660beff10ff89c7be1f1");
            return;
        }
        this.n = aVar;
        this.f.a(aVar);
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.scene.c
    public final void b(com.sankuai.waimai.store.widgets.filterbar.home.model.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71e11bcd7318f75154ea852bb8f78bba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71e11bcd7318f75154ea852bb8f78bba");
            return;
        }
        if (this.k != null) {
            this.k.a(aVar);
        }
        if (this.i != null) {
            this.i.a(aVar);
        }
        if (this.f != null) {
            this.f.a(aVar);
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.scene.a, com.sankuai.waimai.store.widgets.filterbar.home.scene.c
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a7329c560dee29c3fc35f8656b217a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a7329c560dee29c3fc35f8656b217a1");
            return;
        }
        super.a(i);
        if (i == 0) {
            this.i.a(false);
            this.k.a(false);
            return;
        }
        View view = null;
        if (i == 3) {
            this.i.a(true);
            this.k.a(false);
            this.h.a();
            view = this.h.getView();
            this.c.a(0);
        } else if (i == 4) {
            this.i.a(false);
            this.k.a(true);
            this.j.a();
            view = this.j.getView();
            this.c.a(1);
        }
        if (view != null) {
            this.d.a(view);
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.scene.a, com.sankuai.waimai.store.widgets.filterbar.home.scene.c
    public final void a(com.sankuai.waimai.store.base.statistic.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a3c0a76942426a6de3fdea4a86afbec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a3c0a76942426a6de3fdea4a86afbec");
        } else {
            this.f.g = aVar;
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.scene.c
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "183727db90392213e5b893048df4e821", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "183727db90392213e5b893048df4e821");
            return;
        }
        if (this.l != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.l.getLayoutParams();
            layoutParams.gravity = 5;
            this.l.setLayoutParams(layoutParams);
            this.l.removeAllViews();
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.rightMargin = this.b.getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_25);
            layoutParams2.gravity = 5;
            this.l.addView(this.i.getView(), layoutParams2);
            this.l.addView(this.k.getView(), layoutParams2);
        }
        if (this.m != null) {
            this.m.removeAllViews();
            this.m.addView(this.f.getView());
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.scene.a, com.sankuai.waimai.store.widgets.filterbar.home.scene.c
    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee882ba26a6a3e8010582667aee453cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee882ba26a6a3e8010582667aee453cf");
            return;
        }
        this.i.c = i;
        this.k.c = i;
    }

    @Subscribe
    public void onCategoryBackgroundChanged(com.sankuai.waimai.store.widgets.filterbar.event.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "695b9073585ffd145181e11b1e1c0633", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "695b9073585ffd145181e11b1e1c0633");
        } else if (aVar == null || aVar.c != System.identityHashCode(this.b)) {
        } else {
            com.sankuai.waimai.store.widgets.filterbar.home.filter.b bVar = this.f;
            boolean z = aVar.a;
            Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.widgets.filterbar.home.filter.b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "a19c002ff6ffcb69de1c0f58f6094f25", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "a19c002ff6ffcb69de1c0f58f6094f25");
                return;
            }
            bVar.i = z;
            if (bVar.d != null) {
                bVar.d.notifyDataSetChanged();
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    class a implements e {
        public static ChangeQuickRedirect a;
        private int c;

        public a(int i) {
            Object[] objArr = {DrugSpuBarStrategy.this, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02274436959ea977fc508070f01f1b7f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02274436959ea977fc508070f01f1b7f");
            } else {
                this.c = i;
            }
        }

        @Override // com.sankuai.waimai.store.widgets.filterbar.home.filter.e
        public final void a(boolean z, String str, boolean z2, String str2, BubbleInfoBean bubbleInfoBean) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str, Byte.valueOf(z2 ? (byte) 1 : (byte) 0), str2, bubbleInfoBean};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "552a23562a3a0386bd7bd5b0cc56b9d5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "552a23562a3a0386bd7bd5b0cc56b9d5");
            } else {
                DrugSpuBarStrategy.this.c.a(this.c, z, str, z2, str2);
            }
        }

        @Override // com.sankuai.waimai.store.widgets.filterbar.home.filter.e
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a74f085ba65821ed3049a2659c3393c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a74f085ba65821ed3049a2659c3393c");
                return;
            }
            DrugSpuBarStrategy.this.c.c(this.c);
            DrugSpuBarStrategy.this.d.a(0);
        }

        @Override // com.sankuai.waimai.store.widgets.filterbar.home.filter.e
        public final void b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0882616413aaa0ba7a444305e8ff1c4c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0882616413aaa0ba7a444305e8ff1c4c");
            } else {
                DrugSpuBarStrategy.this.c.d(this.c);
            }
        }

        @Override // com.sankuai.waimai.store.widgets.filterbar.home.filter.e
        public final void c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94cff639d429d6773b60a1db271e8ae4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94cff639d429d6773b60a1db271e8ae4");
            } else {
                DrugSpuBarStrategy.this.d.a(0);
            }
        }

        @Override // com.sankuai.waimai.store.widgets.filterbar.home.filter.e
        public final com.sankuai.waimai.store.widgets.filterbar.home.model.a d() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "695a48d327b650ebbbe6da941f547e64", RobustBitConfig.DEFAULT_VALUE)) {
                return (com.sankuai.waimai.store.widgets.filterbar.home.model.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "695a48d327b650ebbbe6da941f547e64");
            }
            if (DrugSpuBarStrategy.this.n != null) {
                com.sankuai.waimai.store.widgets.filterbar.home.model.a aVar = new com.sankuai.waimai.store.widgets.filterbar.home.model.a(DrugSpuBarStrategy.this.n);
                aVar.f = R.drawable.wm_sc_filter_checked;
                aVar.e = true;
                aVar.g = -1;
                aVar.h = -1;
                return aVar;
            }
            return null;
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.scene.a, com.sankuai.waimai.store.widgets.filterbar.home.scene.c
    public final void a(int i, int i2) {
        com.sankuai.waimai.store.widgets.filterbar.home.filter.a aVar;
        int i3;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a6325b9c2ef8fb2db7c092479e27970", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a6325b9c2ef8fb2db7c092479e27970");
        } else if (i == 0 || i == 1) {
            int a2 = this.d.a();
            if (i == 0) {
                aVar = this.i;
                i3 = 3;
            } else {
                aVar = this.k;
                i3 = 4;
            }
            aVar.a(i2);
            if (i2 > 0) {
                aVar.c(true);
            } else if (a2 != i3) {
                aVar.c(false);
            }
        }
    }
}
