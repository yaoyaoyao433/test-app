package com.sankuai.waimai.restaurant.shopcart.ui;

import android.app.Activity;
import android.support.constraint.R;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.iconfont.RooIconFont;
import com.sankuai.waimai.platform.domain.core.poi.Poi;
import com.sankuai.waimai.platform.domain.core.poi.RestRecommendPoi;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class h {
    public static ChangeQuickRedirect a;
    public final com.sankuai.waimai.business.restaurant.base.manager.order.g b;
    FrameLayout c;
    FrameLayout d;
    public Activity e;
    public boolean f;
    TextView g;
    TextView h;
    RooIconFont i;
    a j;
    private com.sankuai.waimai.restaurant.shopcart.config.a k;
    private String l;
    private int m;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a(Poi poi, RestRecommendPoi restRecommendPoi, boolean z);
    }

    public h(com.sankuai.waimai.business.restaurant.base.manager.order.g gVar, Activity activity, com.sankuai.waimai.restaurant.shopcart.config.a aVar, a aVar2, String str) {
        Object[] objArr = {gVar, activity, aVar, aVar2, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30478287d446ea19d5075ed7e3f32184", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30478287d446ea19d5075ed7e3f32184");
            return;
        }
        this.m = 0;
        this.b = gVar;
        this.e = activity;
        this.l = str;
        this.k = aVar;
        this.j = aVar2;
    }

    public final void a() {
        Activity activity;
        int i;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73ba861417fd00d396ae79de38316f98", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73ba861417fd00d396ae79de38316f98");
        } else if (this.b.u() && !this.b.a()) {
            this.c.setVisibility(8);
            this.d.setVisibility(8);
        } else if (com.sankuai.waimai.platform.model.c.a().b() == 3) {
            this.c.setVisibility(8);
            this.d.setVisibility(0);
        } else {
            this.c.setVisibility(0);
            this.d.setVisibility(8);
            this.f = false;
            if (this.b.u()) {
                activity = this.e;
                i = R.string.wm_shopcart_out_of_delivery_range;
            } else {
                activity = this.e;
                i = R.string.wm_shopcart_rest;
            }
            String string = activity.getString(i);
            if (!TextUtils.isEmpty(this.b.v())) {
                string = this.b.v();
            }
            this.h.setText(string);
            int i2 = this.e.getResources().getDisplayMetrics().widthPixels;
            if (!(this.m != 0) || this.h.getPaint().measureText(string) <= i2 / 2) {
                return;
            }
            this.g.post(new Runnable() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.h.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "faf0e728288828461b91cd4408348074", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "faf0e728288828461b91cd4408348074");
                    } else if (!com.sankuai.waimai.business.restaurant.poicontainer.b.P()) {
                        h.this.h.setTextSize(12.0f);
                        h.this.h.setPadding(32, 0, h.this.g.getWidth() + 12, 0);
                        h.this.h.setGravity(19);
                    } else {
                        h.this.h.setPadding(com.sankuai.waimai.foundation.utils.g.a(h.this.g.getContext(), 25.0f), 0, h.this.g.getWidth() + 12, 0);
                        h.this.h.setGravity(19);
                    }
                }
            });
        }
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "366bbbd4d8490cb9f036a4d1d1025adc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "366bbbd4d8490cb9f036a4d1d1025adc");
            return;
        }
        this.m = i;
        this.g.setVisibility(0);
        this.i.setVisibility(0);
        if (i == 1) {
            this.g.setText(this.e.getResources().getString(R.string.wm_restaurant_rest_recommend_shop));
        } else {
            this.g.setText(this.e.getResources().getString(R.string.wm_restaurant_rest_change_address));
        }
        a();
    }

    public String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40eb1b3dc08f99d73400dc8ec44366f4", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40eb1b3dc08f99d73400dc8ec44366f4") : this.k != null ? this.k.b() ? "c_u4fk4kw" : this.k.e() ? "c_1b9anm4" : this.k.d() ? "c_5y4tc0m" : "c_CijEL" : "c_CijEL";
    }
}
