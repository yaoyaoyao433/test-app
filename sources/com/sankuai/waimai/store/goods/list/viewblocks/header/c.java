package com.sankuai.waimai.store.goods.list.viewblocks.header;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.ImageQualityUtil;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.platform.capacity.imageloader.image.BlurTransformation;
import com.sankuai.waimai.store.platform.capacity.imageloader.image.FixedSizeTransform;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.util.m;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;
    private final com.sankuai.waimai.store.goods.list.delegate.d b;
    private ImageView c;
    private ImageView d;
    private FrameLayout e;
    private View f;
    private View g;
    private View h;

    public c(@NonNull Context context, com.sankuai.waimai.store.goods.list.delegate.d dVar) {
        super(context);
        Object[] objArr = {context, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c2911e781cb602e817e3221a11512ab", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c2911e781cb602e817e3221a11512ab");
        } else {
            this.b = dVar;
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7b8add8b86aacd615a398379f5fbbd6", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7b8add8b86aacd615a398379f5fbbd6") : layoutInflater.inflate(R.layout.wm_st_goods_list_market_layout_header_back, viewGroup, false);
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7815183dc11587fefcfb901c940c4a3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7815183dc11587fefcfb901c940c4a3c");
            return;
        }
        super.onViewCreated();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "69d467a715c402f5b2ad88dc267cd144", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "69d467a715c402f5b2ad88dc267cd144");
            return;
        }
        this.c = (ImageView) findView(R.id.shop_background_image);
        this.d = (ImageView) findView(R.id.img_poi_blurred_bg);
        this.e = (FrameLayout) findView(R.id.fl_video_container);
        this.f = findView(R.id.view_top_floating);
        this.g = findView(R.id.view_bottom_floating);
        this.h = findView(R.id.view_stop_float);
        this.f.setBackground(com.sankuai.waimai.store.util.e.b(getContext(), new int[]{R.color.wm_st_common_99000000, R.color.wm_st_common_00000000}, (int) R.dimen.wm_sc_common_dimen_0));
        this.g.setBackground(com.sankuai.waimai.store.util.e.b(getContext(), new int[]{R.color.wm_st_common_00000000, R.color.wm_st_common_222426}, (int) R.dimen.wm_sc_common_dimen_0));
        this.h.setBackground(com.sankuai.waimai.store.util.e.b(getContext(), new int[]{R.color.wm_st_common_80000000}, (int) R.dimen.wm_sc_common_dimen_0));
        this.f.setAlpha(0.0f);
        this.g.setAlpha(0.0f);
        this.h.setAlpha(1.0f);
    }

    public final void a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e51826d2e48b830d1cfdacbc066a3f51", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e51826d2e48b830d1cfdacbc066a3f51");
            return;
        }
        float f2 = 1.0f - f;
        this.f.setAlpha(f2);
        this.g.setAlpha(f2);
        this.h.setAlpha(f);
    }

    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ffc5d35df4f07f8483ee0f86161f79a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ffc5d35df4f07f8483ee0f86161f79a");
            return;
        }
        this.e.setVisibility(0);
        this.f.setVisibility(0);
        this.g.setVisibility(0);
        this.e.addView(view);
    }

    public final void a(Poi poi) {
        Object[] objArr = {poi};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3cd0934e2b68e251ade1fa5f77a68c98", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3cd0934e2b68e251ade1fa5f77a68c98");
        } else {
            b(poi);
        }
    }

    private void b(@NonNull Poi poi) {
        Object[] objArr = {poi};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eaa28c2aaabe4ef4b5bfa57a0d8ee0b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eaa28c2aaabe4ef4b5bfa57a0d8ee0b4");
            return;
        }
        String headPicUrl = poi.getHeadPicUrl();
        String promotionHeadPicUrl = poi.getPromotionHeadPicUrl();
        if (!TextUtils.isEmpty(promotionHeadPicUrl)) {
            m.a(promotionHeadPicUrl, this.c, (int) this.mContext.getResources().getDimension(R.dimen.wm_sc_common_dimen_171), ImageQualityUtil.b());
            this.d.setVisibility(8);
            com.sankuai.waimai.store.manager.judas.b.b(this.b.b(), "b_Jpgml").a();
            if (poi.mPromotionHeadPicHeight > 0) {
                u.c(this.h);
            }
        } else if (!TextUtils.isEmpty(headPicUrl)) {
            m.a(ImageQualityUtil.a(this.mContext, headPicUrl, 0, com.sankuai.shangou.stone.util.h.a(this.mContext)), this.c, (int) this.mContext.getResources().getDimension(R.dimen.wm_sc_common_dimen_153), ImageQualityUtil.b());
            this.d.setImageResource(R.drawable.wm_st_goods_list_header_blurred_bg);
            com.sankuai.waimai.store.manager.judas.b.b(this.b.b(), "b_Jpgml").a();
        } else {
            int a2 = com.sankuai.shangou.stone.util.h.a(this.mContext, 113.0f);
            int a3 = com.sankuai.shangou.stone.util.h.a(this.mContext, 85.0f);
            b.C0608b a4 = m.a(poi.getPicture());
            a4.b = this.mContext;
            a4.a(a2, a3).a(new FixedSizeTransform(a2, a3), BlurTransformation.a(this.mContext, 0.1f, 0.3f, 0.33f)).a(this.c);
            this.d.setBackgroundColor(1713513782);
            com.sankuai.waimai.store.manager.judas.b.b(this.b.b(), "b_Jpgml").a();
        }
    }
}
