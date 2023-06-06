package com.sankuai.waimai.business.restaurant.poicontainer.helper;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.iconfont.RooIconFont;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.foundation.utils.ColorUtils;
import com.sankuai.waimai.platform.domain.core.goods.GoodsPromotion;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.platform.domain.core.goods.PoiFoodTag;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a(GoodsSpu goodsSpu);

        void a(GoodsSpu goodsSpu, View view);

        void b(GoodsSpu goodsSpu);

        void b(GoodsSpu goodsSpu, View view);
    }

    public static void a(TextView textView, GoodsSpu goodsSpu) {
        Object[] objArr = {textView, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c86a9ca8046d83cd9130e040f776a907", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c86a9ca8046d83cd9130e040f776a907");
        } else if (textView == null || goodsSpu == null) {
        } else {
            textView.setText(goodsSpu.getName());
        }
    }

    public static void a(ImageView imageView, GoodsPromotion goodsPromotion) {
        Object[] objArr = {imageView, goodsPromotion};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d4f4e8e3eb017a1a181c993114aeb617", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d4f4e8e3eb017a1a181c993114aeb617");
            return;
        }
        imageView.getLayoutParams().width = -2;
        imageView.getLayoutParams().height = com.sankuai.waimai.foundation.utils.g.a(imageView.getContext(), 15.0f);
        imageView.setAdjustViewBounds(true);
        b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
        a2.c = goodsPromotion.labelPic;
        a2.k = 4;
        a2.a(imageView);
    }

    public static boolean a(@NonNull GoodsSpu goodsSpu, int i) {
        Object[] objArr = {goodsSpu, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2a12a93765af2217e11eb824db73ba0c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2a12a93765af2217e11eb824db73ba0c")).booleanValue();
        }
        List<GoodsSku> skuList = goodsSpu.getSkuList();
        if (!goodsSpu.isManySku() && skuList != null && skuList.size() == 1 && i < skuList.get(0).getMinOrderCount()) {
            GoodsSku goodsSku = skuList.get(0);
            if (goodsSku.getMinOrderCount() > 1 && goodsSku.isMinOrderCountEnough()) {
                return true;
            }
        }
        return false;
    }

    public static int b(GoodsSpu goodsSpu, int i) {
        Object[] objArr = {goodsSpu, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dcdc3e9b70cc426edf92c1bd7ac3382a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dcdc3e9b70cc426edf92c1bd7ac3382a")).intValue();
        }
        List<GoodsSku> skuList = goodsSpu.getSkuList();
        if (skuList == null || skuList.size() != 1) {
            return i;
        }
        GoodsSku goodsSku = skuList.get(0);
        return (goodsSku.getStatus() <= 0 || i < goodsSku.getStock() || goodsSku.getStock() == -1) ? i : goodsSku.getStock();
    }

    public static boolean a(GoodsSpu goodsSpu, int i, com.sankuai.waimai.business.restaurant.base.manager.order.g gVar) {
        Object[] objArr = {goodsSpu, Integer.valueOf(i), gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ba26bfd069ee37b40557fa06b865c224", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ba26bfd069ee37b40557fa06b865c224")).booleanValue();
        }
        List<GoodsSku> skuList = goodsSpu.getSkuList();
        if (skuList != null && skuList.size() == 1) {
            GoodsSku goodsSku = skuList.get(0);
            if (goodsSku.getStatus() > 0) {
                goodsSku.getStock();
            }
        }
        boolean z = goodsSpu.getStatus() != 0;
        if (gVar.g.getState() == 3) {
            z = true;
        }
        if (gVar.a()) {
            return true;
        }
        return z;
    }

    public static View a(PoiFoodTag poiFoodTag, Context context, boolean z) {
        Object[] objArr = {poiFoodTag, context, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d42e319e739af82ecf4290a5e52cb18d", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d42e319e739af82ecf4290a5e52cb18d");
        }
        if (poiFoodTag == null || TextUtils.isEmpty(poiFoodTag.text)) {
            return null;
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.wm_restaurant_market_adapter_goods_decision_tag, (ViewGroup) null);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.ll_food_decision_tag);
        TextView textView = (TextView) inflate.findViewById(R.id.txt_food_decision_tag);
        RooIconFont rooIconFont = (RooIconFont) inflate.findViewById(R.id.img_food_decision_tag_icon);
        textView.setText(poiFoodTag.text);
        if (!TextUtils.isEmpty(poiFoodTag.textColor)) {
            textView.setTextColor(ColorUtils.a(poiFoodTag.textColor, -16777216));
        }
        if (!TextUtils.isEmpty(poiFoodTag.fontSize)) {
            try {
                int parseInt = Integer.parseInt(poiFoodTag.fontSize);
                if (parseInt > 0) {
                    textView.setTextSize(parseInt);
                }
            } catch (Exception unused) {
            }
        }
        if (!TextUtils.isEmpty(poiFoodTag.backgroundColor) && (linearLayout.getBackground() instanceof GradientDrawable)) {
            try {
                ((GradientDrawable) linearLayout.getBackground()).setColor(ColorUtils.a(poiFoodTag.backgroundColor, ColorUtils.a("#FFF8E1").intValue()));
            } catch (Exception unused2) {
            }
        }
        inflate.setOnClickListener(null);
        rooIconFont.setVisibility(8);
        return inflate;
    }
}
