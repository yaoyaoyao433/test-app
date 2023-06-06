package com.sankuai.waimai.store.goods.list.viewblocks.header;

import android.app.Activity;
import android.content.Context;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
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
public final class i {
    public static ChangeQuickRedirect a;
    private final Activity b;
    private final String c;
    private ImageView d;
    private ImageView e;

    public i(Activity activity, String str) {
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2417bb7fedf06671a66d50fc61345315", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2417bb7fedf06671a66d50fc61345315");
            return;
        }
        this.c = str;
        this.b = activity;
    }

    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7ef1cca1956d1f00579b66f7131df43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7ef1cca1956d1f00579b66f7131df43");
            return;
        }
        this.d = (ImageView) view.findViewById(R.id.img_poi_blurred_bg);
        this.e = (ImageView) view.findViewById(R.id.shop_background_image);
    }

    public final void a(Poi poi) {
        Object[] objArr = {poi};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f525e1a2bf1b69f8d5dfd8e92187b19", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f525e1a2bf1b69f8d5dfd8e92187b19");
        } else if (this.d == null || this.e == null || poi == null) {
        } else {
            if (com.sankuai.shangou.stone.util.k.b(this.b)) {
                float a2 = u.a(this.b);
                ViewGroup.LayoutParams layoutParams = this.e.getLayoutParams();
                layoutParams.height = (int) (layoutParams.height + a2);
                this.e.setLayoutParams(layoutParams);
                ViewGroup.LayoutParams layoutParams2 = this.d.getLayoutParams();
                layoutParams2.height = (int) (layoutParams2.height + a2);
                this.e.setLayoutParams(layoutParams);
                this.d.setLayoutParams(layoutParams2);
            }
            String headPicUrl = poi.getHeadPicUrl();
            String promotionHeadPicUrl = poi.getPromotionHeadPicUrl();
            if (!TextUtils.isEmpty(promotionHeadPicUrl)) {
                m.a(promotionHeadPicUrl, this.e, (int) this.b.getResources().getDimension(R.dimen.wm_sc_common_dimen_153), ImageQualityUtil.b());
                this.d.setImageResource(R.drawable.wm_st_goods_list_header_blurred_bg);
                if (poi.mPromotionHeadPicHeight > 0) {
                    ViewGroup.LayoutParams layoutParams3 = this.e.getLayoutParams();
                    layoutParams3.height = com.sankuai.shangou.stone.util.h.a(this.b, 165.0f);
                    this.e.setLayoutParams(layoutParams3);
                    u.c(this.d);
                }
            } else if (!TextUtils.isEmpty(headPicUrl)) {
                m.a(ImageQualityUtil.a(this.b, headPicUrl, 0, com.sankuai.shangou.stone.util.h.a((Context) this.b)), this.e, (int) this.b.getResources().getDimension(R.dimen.wm_sc_common_dimen_153), ImageQualityUtil.b());
                this.d.setImageResource(R.drawable.wm_st_goods_list_header_blurred_bg);
            } else {
                int a3 = com.sankuai.shangou.stone.util.h.a(this.b, 113.0f);
                int a4 = com.sankuai.shangou.stone.util.h.a(this.b, 85.0f);
                b.C0608b a5 = m.a(poi.getPicture());
                a5.b = this.b;
                a5.a(a3, a4).a(new FixedSizeTransform(a3, a4), BlurTransformation.a(this.b, 0.1f, 0.3f, 0.33f)).a(this.e);
                this.d.setBackgroundColor(1713513782);
            }
            com.sankuai.waimai.store.manager.judas.b.b(this.c, "b_Jpgml").a();
        }
    }
}
