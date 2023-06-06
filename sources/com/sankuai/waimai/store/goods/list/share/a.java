package com.sankuai.waimai.store.goods.list.share;

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
import com.sankuai.waimai.store.newwidgets.HorizontalFlowLayout;
import com.sankuai.waimai.store.newwidgets.labelview.LabelView;
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
        super(context, R.layout.wm_sc_goods_list_market_share_template, str);
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e299567e096e8ecdb73f23195d0d5e2f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e299567e096e8ecdb73f23195d0d5e2f");
        }
    }

    @Override // com.sankuai.waimai.store.share.b, com.sankuai.waimai.store.share.a
    public final void a(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fdbc26a9484d4aafcddb09102d203ef5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fdbc26a9484d4aafcddb09102d203ef5");
            return;
        }
        super.a(view);
        this.b = (FrameLayout) view.findViewById(R.id.fl_label_info);
        this.c = (HorizontalFlowLayout) view.findViewById(R.id.layout_share_good_list_activitytag);
    }

    public final void a(List<Poi.LabelInfoListItem> list) {
        LabelView labelView;
        char c = 1;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03dac8d533385d331070783698529c36", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03dac8d533385d331070783698529c36");
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
                    Object[] objArr2 = new Object[4];
                    objArr2[0] = str;
                    objArr2[c] = Integer.valueOf(a2);
                    objArr2[2] = Integer.valueOf(a3);
                    objArr2[3] = Integer.valueOf(a4);
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6f9bb1803907ed06411a730a69b84d95", RobustBitConfig.DEFAULT_VALUE)) {
                        labelView = (LabelView) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6f9bb1803907ed06411a730a69b84d95");
                    } else {
                        labelView = (LabelView) LayoutInflater.from(this.g).inflate(R.layout.wm_st_ui_list_poi_list_item_tag, (ViewGroup) null);
                        labelView.setBorderWidth(1);
                        labelView.setText(str);
                        labelView.setTextSize(1, 10.0f);
                        labelView.a(a2, null, null, null);
                        labelView.getBorderColors().a(a3, null, null, null);
                        labelView.getSolidColors().a(a4, null, null, null);
                    }
                    arrayList.add(new HorizontalFlowLayout.c(labelView, labelInfoListItem.priority));
                    c = 1;
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e62b3c47d106ea1331372e5aa0c41d3f", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e62b3c47d106ea1331372e5aa0c41d3f")).intValue() : View.MeasureSpec.makeMeasureSpec(h.a(this.g, 200.0f), 1073741824);
    }

    @Override // com.sankuai.waimai.store.share.a
    public final int c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "701251cd0985db9c3d7ea8fe76916674", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "701251cd0985db9c3d7ea8fe76916674")).intValue() : View.MeasureSpec.makeMeasureSpec(h.a(this.g, 160.0f), 1073741824);
    }
}
