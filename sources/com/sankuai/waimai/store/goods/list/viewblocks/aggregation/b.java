package com.sankuai.waimai.store.goods.list.viewblocks.aggregation;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.d;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.newwidgets.HorizontalFlowLayout;
import com.sankuai.waimai.store.newwidgets.labelview.LabelView;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.util.m;
import com.sankuai.waimai.store.view.a;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    HorizontalFlowLayout l;
    RelativeLayout m;
    FrameLayout n;
    ImageView o;
    ImageView p;
    TextView q;
    HorizontalFlowLayout r;
    private View s;
    private ImageView t;

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a(int i, int i2, float f) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc2fe3c876756382c66208177b5086ca", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc2fe3c876756382c66208177b5086ca")).intValue() : i2 + ((int) ((i - i2) * f));
    }

    public b(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00cada602871784c80b1c7d17cf1b79f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00cada602871784c80b1c7d17cf1b79f");
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8fe9c921223e7d3cec3915451b5d4d8", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8fe9c921223e7d3cec3915451b5d4d8") : layoutInflater.inflate(R.layout.wm_st_goods_list_layout_aggregation_header_container, viewGroup);
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63257668b086996f8b8e36338c9c298d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63257668b086996f8b8e36338c9c298d");
            return;
        }
        super.onViewCreated();
        this.m = (RelativeLayout) findView(R.id.rl_head_animate_container);
        this.n = (FrameLayout) findView(R.id.fl_poi_head_container);
        this.o = (ImageView) findView(R.id.img_poi_image);
        this.p = (ImageView) findView(R.id.img_poi_icon);
        this.q = (TextView) findView(R.id.txt_poi_name);
        this.r = (HorizontalFlowLayout) findView(R.id.shop_impression_layout);
        this.l = (HorizontalFlowLayout) findView(R.id.preferential_activity);
        this.s = findView(R.id.ll_check_poi_container);
        this.t = (ImageView) findView(R.id.iv_arrow_right);
        float dimensionPixelOffset = getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_4);
        this.s.setBackground(e.a().a(new int[]{-16842910}, new e.a().c(ContextCompat.getColor(getContext(), R.color.wm_sg_color_BCBCBD)).a(dimensionPixelOffset).a()).a(new int[]{16842919}, new e.a().a(GradientDrawable.Orientation.TL_BR, new int[]{ContextCompat.getColor(getContext(), R.color.wm_sg_color_9AFFE14D), ContextCompat.getColor(getContext(), R.color.wm_sg_color_9AFFC34D)}).a(dimensionPixelOffset).a()).a(new e.a().a(GradientDrawable.Orientation.TL_BR, new int[]{ContextCompat.getColor(getContext(), R.color.wm_sg_color_FFE14D), ContextCompat.getColor(getContext(), R.color.wm_sg_color_FFC34D)}).a(dimensionPixelOffset).a()).b);
        this.t.setImageDrawable(com.sankuai.waimai.store.view.a.a(getContext(), R.dimen.wm_sc_common_dimen_6, R.dimen.wm_sc_common_dimen_8, R.color.wm_sg_color_222426, R.dimen.wm_sc_common_dimen_1_half, a.EnumC1338a.RIGHT));
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "00040db31635f9b4fabf2a99f6d34315", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "00040db31635f9b4fabf2a99f6d34315");
            return;
        }
        this.j = h.a(getContext(), 83.0f);
        this.k = h.a(getContext(), 46.0f);
        this.b = 0;
        this.c = h.a(getContext(), 37.0f);
        this.d = h.a(getContext(), 12.0f);
        this.e = h.a(getContext(), 6.0f);
        this.f = h.a(getContext(), 80.0f);
        this.g = h.a(getContext(), 60.0f);
        this.h = h.a(getContext(), 48.0f);
        this.i = h.a(getContext(), 36.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public View a(ViewGroup viewGroup, Poi.PoiImpressLabel poiImpressLabel) {
        Object[] objArr = {viewGroup, poiImpressLabel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "235f6e706e6dfacd46f9bd2058544fb1", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "235f6e706e6dfacd46f9bd2058544fb1");
        }
        View inflate = LayoutInflater.from(this.mContext).inflate(R.layout.wm_sc_goods_list_market_shop_header_impress_new, viewGroup, false);
        inflate.setBackgroundColor(com.sankuai.waimai.store.util.b.b(this.mContext, R.color.transparent));
        ImageView imageView = (ImageView) inflate.findViewById(R.id.shop_impress_icon);
        TextView textView = (TextView) inflate.findViewById(R.id.shop_impress_desc);
        textView.setText(poiImpressLabel.mLabelText);
        if (!TextUtils.isEmpty(poiImpressLabel.mLabelUrl)) {
            imageView.setVisibility(0);
            b.C0608b a2 = m.a(poiImpressLabel.mLabelUrl);
            a2.b = this.mContext;
            a2.a(imageView);
        } else {
            imageView.setVisibility(8);
        }
        textView.setTextColor(com.sankuai.waimai.store.util.b.b(this.mContext, R.color.wm_sg_color_575859));
        return inflate;
    }

    public final void a(Poi poi) {
        Object[] objArr = {poi};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "505f0879eae6b31efbdfff258b689a0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "505f0879eae6b31efbdfff258b689a0f");
            return;
        }
        String str = poi.poiTypeIcon;
        if (TextUtils.isEmpty(str)) {
            u.c(this.p);
            return;
        }
        u.a(this.p);
        m.a(str, this.p, (int) this.mContext.getResources().getDimension(R.dimen.wm_sc_common_dimen_30));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View a(HorizontalFlowLayout horizontalFlowLayout, Poi.LabelInfoListItem labelInfoListItem) {
        Object[] objArr = {horizontalFlowLayout, labelInfoListItem};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca17ea2b56bbb149eb9efc730cd1b3f3", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca17ea2b56bbb149eb9efc730cd1b3f3");
        }
        if (labelInfoListItem != null) {
            try {
                LabelView labelView = (LabelView) LayoutInflater.from(getContext()).inflate(R.layout.wm_sc_shop_header_preferential_activity, (ViewGroup) horizontalFlowLayout, false);
                String str = labelInfoListItem.content;
                int a2 = d.a(labelInfoListItem.contentColor, -307644);
                int a3 = d.a(labelInfoListItem.labelFrameColor, 1526419012);
                int a4 = d.a(labelInfoListItem.labelBackgroundColor, 0);
                labelView.setText(str);
                labelView.a(a2, null, null, null);
                labelView.getBorderColors().a(a3, null, null, null);
                labelView.getSolidColors().a(a4, null, null, null);
                return labelView;
            } catch (Exception e) {
                com.sankuai.shangou.stone.util.log.a.a(e);
            }
        }
        return null;
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "619318521a9ec3e95d4e876613ad783e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "619318521a9ec3e95d4e876613ad783e");
        } else {
            super.onDestroy();
        }
    }
}
