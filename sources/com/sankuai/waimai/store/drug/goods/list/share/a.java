package com.sankuai.waimai.store.drug.goods.list.share;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.d;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.waimai.store.drug.newwidgets.HorizontalFlowLayout;
import com.sankuai.waimai.store.drug.newwidgets.labelview.LabelView;
import com.sankuai.waimai.store.drug.newwidgets.labelview.c;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.share.b;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends b {
    public static ChangeQuickRedirect a;
    private FrameLayout b;
    private HorizontalFlowLayout c;

    @Override // com.sankuai.waimai.store.share.b
    public final int a() {
        return R.id.iv_share_good_list_picture;
    }

    public a(Context context, String str) {
        super(context, R.layout.wm_drug_goods_list_market_share_template, str);
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9198e34c31e8e625323390833870d1d3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9198e34c31e8e625323390833870d1d3");
        }
    }

    @Override // com.sankuai.waimai.store.share.b, com.sankuai.waimai.store.share.a
    public final void a(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e4cc00e97695ca6608f17466aa0493e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e4cc00e97695ca6608f17466aa0493e");
            return;
        }
        super.a(view);
        this.b = (FrameLayout) view.findViewById(R.id.fl_label_info);
        this.c = (HorizontalFlowLayout) view.findViewById(R.id.layout_share_good_list_activitytag);
    }

    public final void a(List<Poi.LabelInfoListItem> list) {
        LabelView labelView;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1cd1dd50fa22ea5e0e2f933224c950f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1cd1dd50fa22ea5e0e2f933224c950f");
        } else if (com.sankuai.shangou.stone.util.a.b(list)) {
            this.b.setVisibility(8);
        } else {
            this.c.removeAllViews();
            ArrayList arrayList = new ArrayList();
            for (Poi.LabelInfoListItem labelInfoListItem : list) {
                if (labelInfoListItem != null) {
                    int a2 = d.a(labelInfoListItem.contentColor, -307644);
                    int a3 = d.a(labelInfoListItem.labelFrameColor, -307644);
                    int a4 = d.a(labelInfoListItem.labelBackgroundColor, 0);
                    String str = labelInfoListItem.content;
                    Object[] objArr2 = {str, Integer.valueOf(a2), Integer.valueOf(a3), Integer.valueOf(a4)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6ee69988dff8b284d24dc54ff03f8e32", RobustBitConfig.DEFAULT_VALUE)) {
                        labelView = (LabelView) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6ee69988dff8b284d24dc54ff03f8e32");
                    } else {
                        labelView = (LabelView) LayoutInflater.from(this.g).inflate(R.layout.wm_drug_ui_list_poi_list_item_tag, (ViewGroup) null);
                        labelView.setBorderWidth(1);
                        labelView.setText(str);
                        labelView.setTextSize(1, 10.0f);
                        Object[] objArr3 = {Integer.valueOf(a2), null, null, null};
                        ChangeQuickRedirect changeQuickRedirect3 = LabelView.a;
                        if (PatchProxy.isSupport(objArr3, labelView, changeQuickRedirect3, false, "9fd79b33d7e0e3d89b12453e13886601", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, labelView, changeQuickRedirect3, false, "9fd79b33d7e0e3d89b12453e13886601");
                        } else {
                            c cVar = new c();
                            cVar.a(a2, null, null, null);
                            labelView.setTextColor(cVar);
                        }
                        labelView.getBorderColors().a(a3, null, null, null);
                        labelView.getSolidColors().a(a4, null, null, null);
                    }
                    arrayList.add(new HorizontalFlowLayout.c(labelView, labelInfoListItem.priority));
                }
            }
            if (com.sankuai.shangou.stone.util.a.b(arrayList)) {
                this.b.setVisibility(8);
                return;
            }
            this.b.setVisibility(0);
            this.c.a((List<HorizontalFlowLayout.c>) arrayList, false);
        }
    }

    @Override // com.sankuai.waimai.store.share.a
    public final int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f7c3c1081a0e1c09808b0ee775772df", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f7c3c1081a0e1c09808b0ee775772df")).intValue() : View.MeasureSpec.makeMeasureSpec(h.a(this.g, 200.0f), 1073741824);
    }

    @Override // com.sankuai.waimai.store.share.a
    public final int c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85da3ef6dd83500c73a67d926e78ee6e", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85da3ef6dd83500c73a67d926e78ee6e")).intValue() : View.MeasureSpec.makeMeasureSpec(h.a(this.g, 160.0f), 1073741824);
    }
}
