package com.sankuai.waimai.business.restaurant.poicontainer.comment;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.domain.core.comment.BasePoiCommentResponse;
import com.sankuai.waimai.platform.domain.core.comment.PoiCommentTab;
import com.sankuai.waimai.platform.widget.labelview.LabelImageView;
import com.sankuai.waimai.platform.widget.labelview.LabelLinearLayout;
import com.sankuai.waimai.platform.widget.labelview.LabelView;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class g extends com.sankuai.waimai.platform.base.b {
    public static ChangeQuickRedirect a;
    final com.sankuai.waimai.log.judas.b b;
    a c;
    com.sankuai.waimai.business.restaurant.base.manager.order.g d;
    private ViewGroup e;
    private View f;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a(View view, int i, @NonNull PoiCommentTab poiCommentTab);
    }

    public g(@NonNull Context context, com.sankuai.waimai.business.restaurant.base.manager.order.g gVar) {
        super(context);
        Object[] objArr = {context, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8527d468a403361d39ebc1353457fc68", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8527d468a403361d39ebc1353457fc68");
            return;
        }
        this.b = new com.sankuai.waimai.log.judas.b();
        this.d = gVar;
    }

    @Override // com.sankuai.waimai.platform.base.b
    public final View a(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b1dad8836852823e94cc93aa460445c", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b1dad8836852823e94cc93aa460445c");
        }
        this.f = layoutInflater.inflate(R.layout.wm_comment_poi_layout_tabs, viewGroup, false);
        this.e = (ViewGroup) this.f.findViewById(R.id.container_tabs);
        return this.f;
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c71f0c650df12d76d3b908785e93521", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c71f0c650df12d76d3b908785e93521");
            return;
        }
        int childCount = this.e.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.e.getChildAt(i2);
            if (childAt != null) {
                childAt.setSelected(i == i2);
            }
            i2++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v3 */
    public final void a(@NonNull BasePoiCommentResponse basePoiCommentResponse, com.sankuai.waimai.business.restaurant.poicontainer.helper.g gVar) {
        String str;
        int i;
        int i2;
        View view;
        ?? r12 = 0;
        Object[] objArr = {basePoiCommentResponse, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f812dfd4c8c692e472610efb9ff1d933", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f812dfd4c8c692e472610efb9ff1d933");
            return;
        }
        this.e.removeAllViews();
        int a2 = com.sankuai.waimai.foundation.utils.g.a(this.y) - com.sankuai.waimai.foundation.utils.g.a(this.y, 30.0f);
        List<PoiCommentTab> list = basePoiCommentResponse.tabs;
        Object[] objArr2 = {list};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7368d7ba9119cb216c60b8834a72acb8", RobustBitConfig.DEFAULT_VALUE)) {
            list = (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7368d7ba9119cb216c60b8834a72acb8");
        } else {
            if (com.sankuai.waimai.foundation.utils.b.a(list)) {
                if (list.size() == 1) {
                    if (list.get(0).commentScoreType == 21) {
                        ArrayList arrayList = new ArrayList();
                        PoiCommentTab poiCommentTab = new PoiCommentTab();
                        poiCommentTab.commentScoreType = 0;
                        poiCommentTab.commentScoreTitle = this.y.getString(R.string.wm_restaurant_comment_waimai_non);
                        poiCommentTab.totalCount = 0;
                        arrayList.add(poiCommentTab);
                        arrayList.add(list.get(0));
                        list = arrayList;
                    }
                }
            }
            list = null;
        }
        if (basePoiCommentResponse.commentsDianping != null) {
            double d = basePoiCommentResponse.commentsDianping.commentScore;
            Object[] objArr3 = {Double.valueOf(d)};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.foundation.utils.h.a;
            str = PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "b2121f6ddcf7127fcab99394cab3936c", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "b2121f6ddcf7127fcab99394cab3936c") : new DecimalFormat("0.#").format(d);
        } else {
            str = "";
        }
        final String str2 = str;
        if (com.sankuai.waimai.foundation.utils.b.a(list)) {
            int size = list.size();
            int i3 = gVar.d;
            int i4 = i3 != 21 ? 0 : i3;
            int i5 = 0;
            while (i5 < size) {
                final PoiCommentTab poiCommentTab2 = list.get(i5);
                if (poiCommentTab2 != null) {
                    byte b = i5 == 0 ? (byte) 1 : (byte) 0;
                    byte b2 = i5 == size + (-1) ? (byte) 1 : (byte) 0;
                    byte b3 = i4 == poiCommentTab2.commentScoreType ? 1 : 0;
                    Object[] objArr4 = new Object[6];
                    objArr4[r12] = poiCommentTab2;
                    objArr4[1] = Integer.valueOf(i5);
                    objArr4[2] = Byte.valueOf(b);
                    objArr4[3] = Byte.valueOf(b2);
                    objArr4[4] = Byte.valueOf(b3);
                    objArr4[5] = str2;
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    boolean z = b3;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "c1bb032502e320629d1706f33f298567", RobustBitConfig.DEFAULT_VALUE)) {
                        view = (View) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, r12, "c1bb032502e320629d1706f33f298567");
                        i = i4;
                        i2 = size;
                    } else {
                        View inflate = g().inflate(R.layout.wm_comment_poi_view_tab, this.e, (boolean) r12);
                        LabelLinearLayout labelLinearLayout = (LabelLinearLayout) inflate.findViewById(R.id.layout_tab);
                        LabelView labelView = (LabelView) inflate.findViewById(R.id.txt_tab);
                        LabelImageView labelImageView = (LabelImageView) inflate.findViewById(R.id.icon_tab_dianping);
                        LabelImageView labelImageView2 = (LabelImageView) inflate.findViewById(R.id.icon_tab_waimai);
                        inflate.setSelected(z);
                        int dimensionPixelSize = this.y.getResources().getDimensionPixelSize(R.dimen.wm_restaurant_comment_poi_tab_radius);
                        float f = b != 0 ? dimensionPixelSize : 0.0f;
                        float f2 = b2 != 0 ? dimensionPixelSize : 0.0f;
                        Object[] objArr5 = new Object[4];
                        objArr5[r12] = Float.valueOf(f);
                        objArr5[1] = Float.valueOf(f2);
                        objArr5[2] = Float.valueOf(f2);
                        objArr5[3] = Float.valueOf(f);
                        ChangeQuickRedirect changeQuickRedirect5 = LabelLinearLayout.a;
                        i = i4;
                        if (PatchProxy.isSupport(objArr5, labelLinearLayout, changeQuickRedirect5, false, "61e8aa2985c3917a1ae7e0e0f0fc7b4b", RobustBitConfig.DEFAULT_VALUE)) {
                            i2 = size;
                            PatchProxy.accessDispatch(objArr5, labelLinearLayout, changeQuickRedirect5, false, "61e8aa2985c3917a1ae7e0e0f0fc7b4b");
                        } else {
                            i2 = size;
                            labelLinearLayout.b.a(f, f2, f2, f);
                        }
                        labelLinearLayout.setBorderWidth(1);
                        boolean z2 = poiCommentTab2.commentScoreType == 21;
                        labelImageView.setVisibility(z2 ? 0 : 8);
                        labelImageView2.setVisibility(z2 ? 8 : 0);
                        labelView.setText(poiCommentTab2.commentScoreTitle == null ? "" : poiCommentTab2.commentScoreTitle);
                        if (com.sankuai.waimai.business.restaurant.poicontainer.b.P()) {
                            ViewGroup.LayoutParams layoutParams = labelLinearLayout.getLayoutParams();
                            layoutParams.height = com.sankuai.waimai.foundation.utils.g.a(this.y, 44.0f);
                            labelLinearLayout.setLayoutParams(layoutParams);
                            labelView.setTextSize(16.0f);
                        }
                        final int i6 = poiCommentTab2.commentScoreType;
                        final boolean z3 = z2;
                        final int i7 = i5;
                        inflate.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.comment.g.1
                            public static ChangeQuickRedirect a;

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                Object[] objArr6 = {view2};
                                ChangeQuickRedirect changeQuickRedirect6 = a;
                                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "e54c0cc04cf17c6eb2e38822a184391b", 4611686018427387906L)) {
                                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "e54c0cc04cf17c6eb2e38822a184391b");
                                    return;
                                }
                                if (!view2.isSelected()) {
                                    JudasManualManager.a a3 = JudasManualManager.a("b_z0cks95o").a("poi_id", g.this.d.f()).a("dim_labelid", "").a("dp_score", z3 ? str2 : "").a("label_index", "").a("tag_type", String.valueOf(i6));
                                    a3.b = AppUtil.generatePageInfoKey(g.this.y);
                                    a3.a("c_CijEL").a();
                                }
                                if (g.this.c != null) {
                                    g.this.c.a(view2, i7, poiCommentTab2);
                                }
                            }
                        });
                        view = inflate;
                    }
                    this.e.addView(view);
                } else {
                    i = i4;
                    i2 = size;
                }
                i5++;
                i4 = i;
                size = i2;
                r12 = 0;
            }
        }
        ah.a(this.e, a2, 0);
        boolean z4 = this.e.getChildCount() > 0;
        this.f.setVisibility(z4 ? 0 : 8);
        if (z4) {
            this.b.a();
        }
    }
}
