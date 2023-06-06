package com.sankuai.waimai.store.widgets.filterbar.home.scene.impl;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.widgets.filterbar.home.filter.d;
import com.sankuai.waimai.store.widgets.filterbar.home.filter.e;
import com.sankuai.waimai.store.widgets.filterbar.home.filter.j;
import com.sankuai.waimai.store.widgets.filterbar.home.model.BubbleInfoBean;
import com.sankuai.waimai.store.widgets.filterbar.home.model.FilterConditionResponse;
import com.sankuai.waimai.store.widgets.filterbar.home.scene.impl.bean.QuickSortFilterBottomBean;
import com.sankuai.waimai.store.widgets.filterbar.home.scene.impl.bean.SpuFilterMiddleBean;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends com.sankuai.waimai.store.widgets.filterbar.home.scene.a {
    public static ChangeQuickRedirect e;
    com.sankuai.waimai.store.widgets.filterbar.home.model.a f;
    private final j g;
    private final ViewGroup h;
    private final d i;
    private final com.sankuai.waimai.store.widgets.filterbar.home.filter.a j;
    private final d k;
    private final com.sankuai.waimai.store.widgets.filterbar.home.filter.a l;
    private ViewGroup m;
    private ViewGroup n;
    private ViewGroup o;

    public b(@NonNull ViewGroup viewGroup, @NonNull Context context, @NonNull com.sankuai.waimai.store.widgets.filterbar.home.b bVar, @NonNull com.sankuai.waimai.store.widgets.filterbar.home.scene.b bVar2) {
        super(context, bVar, bVar2);
        Object[] objArr = {viewGroup, context, bVar, bVar2};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da4f08fd36c35bf85b2829d35076b7f9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da4f08fd36c35bf85b2829d35076b7f9");
            return;
        }
        this.h = viewGroup;
        this.j = new com.sankuai.waimai.store.widgets.filterbar.home.filter.a(this.b);
        this.l = new com.sankuai.waimai.store.widgets.filterbar.home.filter.a(this.b);
        this.i = new d(this.b, new a(0));
        this.i.createView(this.h);
        this.k = new d(this.b, new a(1));
        this.k.createView(this.h);
        this.g = new j(this.b);
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.scene.c
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9d78014976df00b472d34916033e178", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9d78014976df00b472d34916033e178");
            return;
        }
        if (this.i != null) {
            this.i.onDestroy();
        }
        if (this.k != null) {
            this.k.onDestroy();
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.scene.c
    public final void a(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04aad62f70f20bd3bb7f84e98e818d7f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04aad62f70f20bd3bb7f84e98e818d7f");
            return;
        }
        this.m = viewGroup;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        layoutParams.gravity = 5;
        viewGroup.setLayoutParams(layoutParams);
        viewGroup.removeAllViews();
        int dimensionPixelOffset = this.b.getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_27);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        viewGroup.getLayoutParams().height = dimensionPixelOffset;
        marginLayoutParams.rightMargin = this.b.getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_25);
        marginLayoutParams.topMargin = this.b.getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_0);
        marginLayoutParams.bottomMargin = this.b.getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_0);
        this.j.createView(viewGroup);
        viewGroup.addView(this.j.getView(), marginLayoutParams);
        this.j.a(0);
        this.j.getView().setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.widgets.filterbar.home.scene.impl.b.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9ae914ff088b7a782962d6553c829dbf", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9ae914ff088b7a782962d6553c829dbf");
                } else {
                    b.this.c.a(0, b.this.d.a() == 3);
                }
            }
        });
        this.j.setVisible(false);
        this.l.createView(viewGroup);
        viewGroup.addView(this.l.getView(), marginLayoutParams);
        this.l.a(0);
        this.l.getView().setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.widgets.filterbar.home.scene.impl.b.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9af29073def44874ab51c62fb1af34d1", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9af29073def44874ab51c62fb1af34d1");
                } else {
                    b.this.c.a(1, b.this.d.a() == 4);
                }
            }
        });
        this.l.setVisible(false);
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.scene.c
    public final void b(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f8addef243296bdeb9a22a5be87d46d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f8addef243296bdeb9a22a5be87d46d");
            return;
        }
        this.n = viewGroup;
        this.g.createAndReplaceView(this.n);
        this.g.g = new j.b() { // from class: com.sankuai.waimai.store.widgets.filterbar.home.scene.impl.b.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.widgets.filterbar.home.filter.j.b
            public final void a(View view, boolean z, String str, boolean z2, String str2) {
                Object[] objArr2 = {view, (byte) 0, str, Byte.valueOf(z2 ? (byte) 1 : (byte) 0), str2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "eb93752cbba545999a00b15e13c2a8bf", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "eb93752cbba545999a00b15e13c2a8bf");
                } else {
                    b.this.c.a(view, false, str, z2, str2, null);
                }
            }
        };
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.scene.c
    public final void c(ViewGroup viewGroup) {
        this.o = viewGroup;
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.scene.a, com.sankuai.waimai.store.widgets.filterbar.home.scene.c
    public final void a(List<String> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b931faa3b52615060a1ef7bce9c822f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b931faa3b52615060a1ef7bce9c822f");
            return;
        }
        super.a(list);
        String str = (String) com.sankuai.shangou.stone.util.a.a((List<Object>) list, 0);
        String str2 = (String) com.sankuai.shangou.stone.util.a.a((List<Object>) list, 1);
        if (!TextUtils.isEmpty(str)) {
            this.j.a(str);
            this.j.setVisible(true);
        } else {
            this.j.setVisible(false);
        }
        if (!TextUtils.isEmpty(str2)) {
            this.l.a(str2);
            this.l.setVisible(true);
            return;
        }
        this.l.setVisible(false);
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.scene.a, com.sankuai.waimai.store.widgets.filterbar.home.scene.c
    public final void a(SpuFilterMiddleBean spuFilterMiddleBean) {
        Object[] objArr = {spuFilterMiddleBean};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a59199c0e84d6d03da3473db4cddaad9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a59199c0e84d6d03da3473db4cddaad9");
            return;
        }
        int i = spuFilterMiddleBean.index;
        FilterConditionResponse.FilterGroup filterGroup = (FilterConditionResponse.FilterGroup) com.sankuai.shangou.stone.util.a.a((List<Object>) spuFilterMiddleBean.groupList, 0);
        FilterConditionResponse.FilterGroup filterGroup2 = (FilterConditionResponse.FilterGroup) com.sankuai.shangou.stone.util.a.a((List<Object>) spuFilterMiddleBean.groupList, 1);
        if (filterGroup != null && i == 0) {
            this.i.a(spuFilterMiddleBean.selectCodeList, filterGroup);
        }
        if (filterGroup2 == null || i != 1) {
            return;
        }
        this.k.a(spuFilterMiddleBean.selectCodeList, filterGroup2);
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.scene.a, com.sankuai.waimai.store.widgets.filterbar.home.scene.c
    public final void a(@NonNull QuickSortFilterBottomBean quickSortFilterBottomBean) {
        Object[] objArr = {quickSortFilterBottomBean};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e526531c77193d010c3a45ca70bdd5a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e526531c77193d010c3a45ca70bdd5a4");
        } else if (com.sankuai.shangou.stone.util.a.b(quickSortFilterBottomBean.filterList)) {
            u.c(this.n);
        } else {
            u.a(this.n);
            j jVar = this.g;
            Object[] objArr2 = {quickSortFilterBottomBean};
            ChangeQuickRedirect changeQuickRedirect2 = j.a;
            if (PatchProxy.isSupport(objArr2, jVar, changeQuickRedirect2, false, "0913a3678f2ecd07a69a691b2ecdd89b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, jVar, changeQuickRedirect2, false, "0913a3678f2ecd07a69a691b2ecdd89b");
                return;
            }
            if (!TextUtils.equals(jVar.d.group, quickSortFilterBottomBean.group)) {
                jVar.b.scrollToPosition(0);
            }
            if (!com.sankuai.shangou.stone.util.a.b(quickSortFilterBottomBean.filterList)) {
                jVar.d = quickSortFilterBottomBean;
            }
            jVar.c.notifyDataSetChanged();
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.scene.a, com.sankuai.waimai.store.widgets.filterbar.home.scene.c
    public final void a(BaseModuleDesc baseModuleDesc) {
        Object[] objArr = {baseModuleDesc};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00d23282a63c6280fd69aa3b04139beb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00d23282a63c6280fd69aa3b04139beb");
        } else {
            super.a(baseModuleDesc);
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.scene.c
    public final View a() {
        return this.n;
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.scene.c
    public final void a(com.sankuai.waimai.store.widgets.filterbar.home.model.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3653f3cdc01b75cb648daafcadf97ed4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3653f3cdc01b75cb648daafcadf97ed4");
            return;
        }
        this.f = aVar;
        com.sankuai.waimai.store.widgets.filterbar.home.model.a aVar2 = new com.sankuai.waimai.store.widgets.filterbar.home.model.a(aVar);
        aVar2.g = this.b.getResources().getColor(R.color.wm_sg_color_FFF9FA);
        aVar2.h = this.b.getResources().getColor(R.color.wm_sg_color_FFF9FA);
        aVar2.b = this.b.getResources().getColor(R.color.wm_sg_color_666460);
        if (aVar2.m != null && aVar2.m.buttonArea != null && !t.a(aVar2.m.buttonArea.endColor)) {
            aVar2.c = com.sankuai.shangou.stone.util.d.a(aVar2.m.buttonArea.endColor, -1430688);
        } else {
            aVar2.c = this.b.getResources().getColor(R.color.wm_sg_color_EA2B60);
        }
        j jVar = this.g;
        Object[] objArr2 = {aVar2};
        ChangeQuickRedirect changeQuickRedirect2 = j.a;
        if (PatchProxy.isSupport(objArr2, jVar, changeQuickRedirect2, false, "25e7919a2856694382e552ae18eac751", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, jVar, changeQuickRedirect2, false, "25e7919a2856694382e552ae18eac751");
            return;
        }
        jVar.e = aVar2;
        if (jVar.c != null) {
            jVar.c.notifyDataSetChanged();
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.scene.c
    public final void b(com.sankuai.waimai.store.widgets.filterbar.home.model.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d3459d48b2982fbe734222eeb124d26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d3459d48b2982fbe734222eeb124d26");
            return;
        }
        if (this.l != null) {
            this.l.a(aVar);
        }
        if (this.j != null) {
            this.j.a(aVar);
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.scene.a, com.sankuai.waimai.store.widgets.filterbar.home.scene.c
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc105d5a407e63e0a34f2c303ba48e24", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc105d5a407e63e0a34f2c303ba48e24");
            return;
        }
        super.a(i);
        if (i == 0) {
            this.j.a(false);
            this.l.a(false);
            return;
        }
        View view = null;
        if (i == 3) {
            this.j.a(true);
            this.l.a(false);
            this.i.a();
            view = this.i.getView();
            this.c.a(0);
        } else if (i == 4) {
            this.j.a(false);
            this.l.a(true);
            this.k.a();
            view = this.k.getView();
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44605180cc9874b24cf218c77bf03797", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44605180cc9874b24cf218c77bf03797");
        } else {
            this.g.f = aVar;
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.scene.c
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d63d3762ecd552dd54f5ec707a4a134", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d63d3762ecd552dd54f5ec707a4a134");
            return;
        }
        if (this.m != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.m.getLayoutParams();
            layoutParams.gravity = 5;
            this.m.setLayoutParams(layoutParams);
            this.m.removeAllViews();
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.rightMargin = this.b.getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_25);
            layoutParams2.gravity = 5;
            this.m.addView(this.j.getView(), layoutParams2);
            this.m.addView(this.l.getView(), layoutParams2);
        }
        if (this.n != null) {
            this.n.removeAllViews();
            this.n.addView(this.g.getView());
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.scene.a, com.sankuai.waimai.store.widgets.filterbar.home.scene.c
    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84eb485415ba3d4e19c261d50e186dba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84eb485415ba3d4e19c261d50e186dba");
            return;
        }
        this.j.c = i;
        this.l.c = i;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class a implements e {
        public static ChangeQuickRedirect a;
        private int c;

        public a(int i) {
            Object[] objArr = {b.this, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1688ec2cc75a43f8f2a0166d6231b31", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1688ec2cc75a43f8f2a0166d6231b31");
            } else {
                this.c = i;
            }
        }

        @Override // com.sankuai.waimai.store.widgets.filterbar.home.filter.e
        public final void a(boolean z, String str, boolean z2, String str2, BubbleInfoBean bubbleInfoBean) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str, Byte.valueOf(z2 ? (byte) 1 : (byte) 0), str2, bubbleInfoBean};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80a8a01c11ce41640fcd02b8905fd70a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80a8a01c11ce41640fcd02b8905fd70a");
            } else {
                b.this.c.a(this.c, z, str, z2, str2);
            }
        }

        @Override // com.sankuai.waimai.store.widgets.filterbar.home.filter.e
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6f927aa90498f8689eae1f4f7dd8e84", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6f927aa90498f8689eae1f4f7dd8e84");
                return;
            }
            b.this.c.c(this.c);
            b.this.d.a(0);
        }

        @Override // com.sankuai.waimai.store.widgets.filterbar.home.filter.e
        public final void b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5d53555408e230749cefaead7d49f7a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5d53555408e230749cefaead7d49f7a");
            } else {
                b.this.c.d(this.c);
            }
        }

        @Override // com.sankuai.waimai.store.widgets.filterbar.home.filter.e
        public final void c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e7cfae33bc82a1c760bd6dc3987e696", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e7cfae33bc82a1c760bd6dc3987e696");
            } else {
                b.this.d.a(0);
            }
        }

        @Override // com.sankuai.waimai.store.widgets.filterbar.home.filter.e
        public final com.sankuai.waimai.store.widgets.filterbar.home.model.a d() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be6aa3530f0dfaec50951e2afa987a57", RobustBitConfig.DEFAULT_VALUE)) {
                return (com.sankuai.waimai.store.widgets.filterbar.home.model.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be6aa3530f0dfaec50951e2afa987a57");
            }
            if (b.this.f != null) {
                com.sankuai.waimai.store.widgets.filterbar.home.model.a aVar = new com.sankuai.waimai.store.widgets.filterbar.home.model.a(b.this.f);
                aVar.f = R.drawable.wm_sc_filter_checked;
                aVar.e = true;
                aVar.l = true;
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0484f891c6982603ea5deaadc9c82bda", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0484f891c6982603ea5deaadc9c82bda");
        } else if (i == 0 || i == 1) {
            int a2 = this.d.a();
            if (i == 0) {
                aVar = this.j;
                i3 = 3;
            } else {
                aVar = this.l;
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
