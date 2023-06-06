package com.sankuai.waimai.store.drug.goods.list.viewblocks.header;

import android.app.Activity;
import android.content.Context;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.ImageQualityUtil;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.k;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.platform.capacity.imageloader.image.BlurTransformation;
import com.sankuai.waimai.platform.capacity.imageloader.image.FixedSizeTransform;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.util.m;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;
    ImageView b;
    ImageView c;
    private final Activity d;
    private final String e;

    public c(Activity activity, String str) {
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f092f72eb002c41ed5d820e88303d194", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f092f72eb002c41ed5d820e88303d194");
            return;
        }
        this.e = str;
        this.d = activity;
    }

    public final void a(Poi poi) {
        Object[] objArr = {poi};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a84406d6af778102fb1ea3c60f773a71", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a84406d6af778102fb1ea3c60f773a71");
        } else if (this.b == null || this.c == null || poi == null) {
        } else {
            if (k.b(this.d)) {
                float a2 = u.a(this.d);
                ViewGroup.LayoutParams layoutParams = this.c.getLayoutParams();
                layoutParams.height = (int) (layoutParams.height + a2);
                this.c.setLayoutParams(layoutParams);
                ViewGroup.LayoutParams layoutParams2 = this.b.getLayoutParams();
                layoutParams2.height = (int) (layoutParams2.height + a2);
                this.c.setLayoutParams(layoutParams);
                this.b.setLayoutParams(layoutParams2);
            }
            String headPicUrl = poi.getHeadPicUrl();
            String promotionHeadPicUrl = poi.getPromotionHeadPicUrl();
            if (!TextUtils.isEmpty(promotionHeadPicUrl)) {
                m.a(promotionHeadPicUrl, this.c, (int) this.d.getResources().getDimension(R.dimen.wm_sc_common_dimen_153), ImageQualityUtil.b());
                this.b.setImageResource(R.drawable.wm_st_goods_list_header_blurred_bg);
                if (poi.mPromotionHeadPicHeight > 0) {
                    ViewGroup.LayoutParams layoutParams3 = this.c.getLayoutParams();
                    layoutParams3.height = h.a(this.d, 137.0f);
                    this.c.setLayoutParams(layoutParams3);
                    u.c(this.b);
                }
            } else if (!TextUtils.isEmpty(headPicUrl)) {
                m.a(ImageQualityUtil.a(this.d, headPicUrl, 0, h.a((Context) this.d)), this.c, (int) this.d.getResources().getDimension(R.dimen.wm_sc_common_dimen_153), ImageQualityUtil.b());
                if (!poi.selfSellPoi) {
                    this.b.setImageResource(R.drawable.wm_st_goods_list_header_blurred_bg);
                }
            } else {
                int a3 = h.a(this.d, 113.0f);
                int a4 = h.a(this.d, 85.0f);
                b.C0608b a5 = m.a(poi.getPicture());
                a5.b = this.d;
                a5.a(a3, a4).a(new FixedSizeTransform(a3, a4), BlurTransformation.a(this.d, 0.1f, 0.3f, 0.33f)).a(this.c);
                this.b.setBackgroundColor(1713513782);
            }
            com.sankuai.waimai.store.manager.judas.b.b(this.e, "b_Jpgml").a();
        }
    }
}
