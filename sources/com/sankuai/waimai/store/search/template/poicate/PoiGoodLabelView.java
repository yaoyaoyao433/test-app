package com.sankuai.waimai.store.search.template.poicate;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.foundation.utils.ImageQualityUtil;
import com.sankuai.waimai.store.search.model.ProductItemEntity;
import com.sankuai.waimai.store.search.ui.SearchShareData;
import com.sankuai.waimai.store.search.view.StoreHandPriceView;
import com.sankuai.waimai.store.view.RoundedCornerImageView;
import com.sankuai.waimai.store.view.standard.FlashPrice;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class PoiGoodLabelView extends LinearLayout {
    public static ChangeQuickRedirect a;
    private RoundedCornerImageView b;
    private TextView c;
    private ViewGroup d;
    private FlashPrice e;
    private TextView f;
    private e g;
    private StoreHandPriceView h;

    public PoiGoodLabelView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4fcb283919edbd9719643dae2d07904a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4fcb283919edbd9719643dae2d07904a");
        }
    }

    public PoiGoodLabelView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07ad4e75183a67b7161a3226958cb36f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07ad4e75183a67b7161a3226958cb36f");
        }
    }

    public PoiGoodLabelView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a46c165397ea6317594026b620378a7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a46c165397ea6317594026b620378a7");
        }
    }

    public PoiGoodLabelView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51b081b1b277ef01bf922e67e554d8a5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51b081b1b277ef01bf922e67e554d8a5");
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6dfc1045b0e44d306738eb0000e24b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6dfc1045b0e44d306738eb0000e24b4");
            return;
        }
        super.onFinishInflate();
        this.b = (RoundedCornerImageView) findViewById(R.id.poi_list_layout_poi_product_img);
        this.c = (TextView) findViewById(R.id.search_poi_label_title);
        this.c.setLines(2);
        this.d = (ViewGroup) findViewById(R.id.search_poi_price_container);
        this.e = (FlashPrice) findViewById(R.id.search_poi_label_flash_price);
        this.f = (TextView) findViewById(R.id.poi_product_paotui_price_desc);
        this.h = (StoreHandPriceView) findViewById(R.id.search_result_spu_hand_price);
        this.g = new e(this);
    }

    public final void a(ProductItemEntity productItemEntity, int i, int i2) {
        Object[] objArr = {productItemEntity, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e83f5931797fbf1f645ea53dc78c1e63", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e83f5931797fbf1f645ea53dc78c1e63");
            return;
        }
        this.g.a(i2);
        this.g.a((e) productItemEntity);
        List<String> list = SearchShareData.a(getContext()).m;
        if (1 != i && !com.sankuai.waimai.foundation.utils.d.a(list)) {
            com.sankuai.waimai.store.search.common.util.g.a(getContext(), this.c, productItemEntity.productName, list);
        } else {
            this.c.setText(productItemEntity.productName);
        }
        String a2 = com.sankuai.waimai.foundation.utils.h.a(productItemEntity.price);
        String str = "";
        if (com.sankuai.waimai.foundation.utils.h.d(Double.valueOf(productItemEntity.oriPrice), Double.valueOf(0.0d)) && !com.sankuai.waimai.foundation.utils.h.a(Double.valueOf(productItemEntity.oriPrice), Double.valueOf(productItemEntity.price))) {
            str = com.sankuai.waimai.foundation.utils.h.a(productItemEntity.oriPrice);
        }
        if (this.h.a(productItemEntity.mHandPriceInfo, (getLayoutParams().width - getPaddingLeft()) - getPaddingRight())) {
            u.c(this.d);
        } else {
            u.a(this.d);
            if (!TextUtils.isEmpty(productItemEntity.startPriceText)) {
                this.e.setPrice(a2);
                this.e.setUnit(productItemEntity.startPriceText);
            } else {
                this.e.a(a2, str);
            }
            this.f.setText(productItemEntity.paotuiPriceDesc);
        }
        if (!TextUtils.isEmpty(productItemEntity.picture)) {
            b.C0608b a3 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
            a3.b = getContext();
            a3.c = productItemEntity.picture;
            a3.e = 1;
            a3.f = ImageQualityUtil.b();
            a3.i = R.drawable.wm_common_poi_circle_default_img;
            a3.j = R.drawable.wm_common_good_img_default;
            a3.l = true;
            a3.a((ImageView) this.b);
            return;
        }
        this.b.setImageResource(R.drawable.wm_common_good_img_default);
    }
}
