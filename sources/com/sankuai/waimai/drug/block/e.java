package com.sankuai.waimai.drug.block;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.repository.model.GoodDetailResponse;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e extends com.sankuai.waimai.store.shopping.cart.ui.d {
    public static ChangeQuickRedirect a;
    protected View b;
    private final int d;
    private final boolean e;
    private com.sankuai.waimai.store.order.a f;
    private com.sankuai.waimai.store.platform.domain.manager.poi.a g;
    private ImageView h;
    private TextView i;
    private GoodDetailResponse j;

    public e(@NonNull Context context, com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, int i, boolean z, GoodDetailResponse goodDetailResponse) {
        super(context);
        Object[] objArr = {context, aVar, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), goodDetailResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e66a389210b0fd848d5ed0a2e991074", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e66a389210b0fd848d5ed0a2e991074");
            return;
        }
        this.g = aVar;
        this.d = i;
        this.e = z;
        this.j = goodDetailResponse;
        this.f = com.sankuai.waimai.store.order.a.e();
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        float f;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "169c71498a534e085c9819c4cbfd460f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "169c71498a534e085c9819c4cbfd460f");
            return;
        }
        super.onViewCreated();
        this.i = (TextView) findView(R.id.txt_food_num);
        this.h = (ImageView) findView(R.id.img_shop_cart);
        this.b = findView(R.id.layout_food_count);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1e01a9475b4d6e9c6487fec592fcbfb3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1e01a9475b4d6e9c6487fec592fcbfb3");
        } else {
            this.b.setVisibility(0);
            com.sankuai.waimai.store.shopping.cart.f.a().a(this.h, this.g);
        }
        a();
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6aba2f4f88d5797a6db6f2dd9307c0cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6aba2f4f88d5797a6db6f2dd9307c0cf");
            return;
        }
        this.b.setVisibility(this.g.z() ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = this.i.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = this.b.getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.width = com.sankuai.shangou.stone.util.h.a(this.mContext, 44.0f);
            layoutParams2.height = com.sankuai.shangou.stone.util.h.a(this.mContext, 62.0f);
        }
        View view = this.b;
        Context context = this.mContext;
        if (this.e) {
            f = this.g.b() ? 135.0f : 86.0f;
        } else {
            f = 30.0f;
        }
        u.c(view, com.sankuai.shangou.stone.util.h.a(context, f), 0, 0, com.sankuai.shangou.stone.util.h.a(this.mContext, 7.0f));
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            u.c(this.i, marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, com.sankuai.shangou.stone.util.h.a(this.mContext, 19.0f));
        }
    }

    @Override // com.sankuai.waimai.store.shopping.cart.ui.d
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a6ab42d4cdabe213bc7196aff941e11", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a6ab42d4cdabe213bc7196aff941e11");
        } else if (this.g.z()) {
            this.i.setVisibility(8);
        } else {
            int j = this.f.j(this.g.d());
            if (j > 99) {
                this.i.setTextSize(2, 8.0f);
            } else {
                this.i.setTextSize(2, 11.0f);
            }
            this.i.setText(String.valueOf(j));
            this.i.setVisibility(j <= 0 ? 8 : 0);
            c();
        }
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8947cf8136e7eb527eca8110847e2c0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8947cf8136e7eb527eca8110847e2c0f");
        } else {
            this.h.setImageResource(!this.f.r(this.g.d()) ? R.drawable.wm_drug_shopcart_drug_icon_animation : R.drawable.wm_drug_shopcart_mt_delivery_drug_disable);
        }
    }

    @Override // com.sankuai.waimai.store.shopping.cart.ui.d
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c8335eaa3b10e4e327794fdd1b3f1f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c8335eaa3b10e4e327794fdd1b3f1f2");
        } else if (this.h.getAnimation() != null) {
            this.h.clearAnimation();
        }
    }
}
