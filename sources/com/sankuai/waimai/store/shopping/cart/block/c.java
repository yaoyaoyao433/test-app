package com.sankuai.waimai.store.shopping.cart.block;

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
/* loaded from: classes5.dex */
public final class c extends com.sankuai.waimai.store.shopping.cart.ui.d {
    public static ChangeQuickRedirect a;
    protected View b;
    private final int d;
    private final boolean e;
    private com.sankuai.waimai.store.order.a f;
    private com.sankuai.waimai.store.platform.domain.manager.poi.a g;
    private ImageView h;
    private TextView i;
    private GoodDetailResponse j;

    public c(@NonNull Context context, com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, int i, boolean z, GoodDetailResponse goodDetailResponse) {
        super(context);
        Object[] objArr = {context, aVar, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), goodDetailResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f48d9c7558e25deaa4d9ec1d985c463", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f48d9c7558e25deaa4d9ec1d985c463");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63fe3a698cc072569961f0dae0470b7e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63fe3a698cc072569961f0dae0470b7e");
            return;
        }
        super.onViewCreated();
        this.i = (TextView) findView(R.id.txt_food_num);
        this.h = (ImageView) findView(R.id.img_shop_cart);
        this.b = findView(R.id.layout_food_count);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f1751c0096f88319630d8a5479f5575c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f1751c0096f88319630d8a5479f5575c");
        } else {
            this.b.setVisibility(0);
            com.sankuai.waimai.store.shopping.cart.f.a().a(this.h, this.g);
        }
        a();
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0acce6f94bd815c1ba6c84f6b2c00b22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0acce6f94bd815c1ba6c84f6b2c00b22");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "581bce5e410dd91e1dd87da633448531", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "581bce5e410dd91e1dd87da633448531");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13a0d6bc58b143785d1346e22925b758", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13a0d6bc58b143785d1346e22925b758");
        } else if (this.g.y() || (this.j != null && this.j.poiInformation != null && this.j.poiInformation.mBuzType == 143)) {
            this.h.setImageResource(!this.f.r(this.g.d()) ? R.drawable.wm_sc_shopcart_caidaquan_animation : R.drawable.wm_sc_shopcart_mt_delivery_caidaquan_disable);
        } else {
            this.h.setImageResource(!this.f.r(this.g.d()) ? R.drawable.wm_sc_shopcart_divivery_animation : R.drawable.wm_sc_shopcart_mt_delivery_new_disable);
        }
    }

    @Override // com.sankuai.waimai.store.shopping.cart.ui.d
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ea0c1994ae6c6bbb348af2d6f70550e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ea0c1994ae6c6bbb348af2d6f70550e");
        } else if (this.h.getAnimation() != null) {
            this.h.clearAnimation();
        }
    }
}
