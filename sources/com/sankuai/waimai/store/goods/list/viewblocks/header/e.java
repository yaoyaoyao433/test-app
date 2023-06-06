package com.sankuai.waimai.store.goods.list.viewblocks.header;

import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.store.newwidgets.HorizontalFlowLayout;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.util.m;
import com.sankuai.waimai.store.util.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e extends com.sankuai.waimai.store.goods.list.base.d {
    public static ChangeQuickRedirect c;
    private HorizontalFlowLayout d;

    public e(com.sankuai.waimai.store.goods.list.delegate.d dVar) {
        super(dVar);
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b7f9a7e5b55350d3ccade092c2f0f58", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b7f9a7e5b55350d3ccade092c2f0f58");
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ca8431742f4de794efb178bd9f14fbd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ca8431742f4de794efb178bd9f14fbd");
            return;
        }
        super.onViewCreated();
        this.d = (HorizontalFlowLayout) this.mView.findViewById(R.id.shop_impression_layout);
    }

    public final void a(Poi poi) {
        View inflate;
        char c2 = 1;
        Object[] objArr = {poi};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a8e8d3ad3c11838020163f970de3d45", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a8e8d3ad3c11838020163f970de3d45");
            return;
        }
        Poi.PoiLabel newPoiLabels = poi.getNewPoiLabels();
        ArrayList<Poi.PoiImpressLabel> arrayList = newPoiLabels == null ? null : newPoiLabels.labels;
        if (com.sankuai.shangou.stone.util.a.a((Collection<?>) arrayList)) {
            this.d.removeAllViews();
            this.d.setVisibility(0);
            Iterator<Poi.PoiImpressLabel> it = arrayList.iterator();
            while (it.hasNext()) {
                Poi.PoiImpressLabel next = it.next();
                if (next != null && !TextUtils.isEmpty(next.mLabelText)) {
                    HorizontalFlowLayout horizontalFlowLayout = this.d;
                    HorizontalFlowLayout horizontalFlowLayout2 = this.d;
                    Object[] objArr2 = new Object[2];
                    objArr2[0] = horizontalFlowLayout2;
                    objArr2[c2] = next;
                    ChangeQuickRedirect changeQuickRedirect2 = c;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ce0566346696dc96c5ef708c09ec7771", RobustBitConfig.DEFAULT_VALUE)) {
                        inflate = (View) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ce0566346696dc96c5ef708c09ec7771");
                    } else {
                        inflate = LayoutInflater.from(this.mContext).inflate(R.layout.wm_sc_goods_list_market_shop_header_impress_new, (ViewGroup) horizontalFlowLayout2, false);
                        inflate.setBackgroundColor(com.sankuai.waimai.store.util.b.b(this.mContext, R.color.transparent));
                        ImageView imageView = (ImageView) inflate.findViewById(R.id.shop_impress_icon);
                        TextView textView = (TextView) inflate.findViewById(R.id.shop_impress_desc);
                        textView.setText(next.mLabelText);
                        if (w.c(this.b.b)) {
                            textView.setTextColor(com.sankuai.waimai.store.util.b.b(this.mContext, R.color.wm_sg_color_000000));
                        } else {
                            textView.setTextColor(com.sankuai.waimai.store.util.b.b(this.mContext, R.color.wm_sg_color_FFFFFF));
                        }
                        if (!TextUtils.isEmpty(next.mLabelUrl)) {
                            imageView.setVisibility(0);
                            b.C0608b a = m.a(next.mLabelUrl);
                            a.b = this.mContext;
                            a.a(imageView);
                        } else {
                            imageView.setVisibility(8);
                        }
                    }
                    horizontalFlowLayout.addView(inflate);
                    c2 = 1;
                }
            }
            return;
        }
        this.d.setVisibility(4);
    }
}
