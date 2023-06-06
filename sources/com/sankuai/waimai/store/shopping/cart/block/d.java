package com.sankuai.waimai.store.shopping.cart.block;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.constants.ShopConstants;
import com.sankuai.waimai.store.goods.detail.SGNewGoodDetailActivity;
import com.sankuai.waimai.store.goods.list.SCSuperMarketActivity;
import com.sankuai.waimai.store.shopping.cart.SCPageConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;
    com.sankuai.waimai.store.platform.domain.manager.poi.a b;
    Activity c;
    SCPageConfig d;
    String e;
    com.sankuai.waimai.store.im.entrance.drug.jump.c f;
    private View g;
    private TextView h;
    private View i;
    private ImageView j;
    private TextView k;

    public d(@NonNull Activity activity, com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, SCPageConfig sCPageConfig, String str) {
        super(activity);
        Object[] objArr = {activity, aVar, sCPageConfig, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c413751740a2dafa517583dadfa81231", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c413751740a2dafa517583dadfa81231");
            return;
        }
        this.c = activity;
        this.b = aVar;
        this.d = sCPageConfig;
        this.e = str;
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "647e220a4ab202e368b2ffa71352166d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "647e220a4ab202e368b2ffa71352166d");
            return;
        }
        super.onViewCreated();
        this.g = findView(R.id.rl_medicine_consult);
        this.h = (TextView) findView(R.id.txt_medicine_consult_name);
        this.i = findView(R.id.rl_shop_im);
        this.j = (ImageView) findView(R.id.iv_shop_cart_im_icon);
        this.k = (TextView) findView(R.id.txt_shop_cart_im);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "93f3fbd75349e87967249c58f97c7b29", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "93f3fbd75349e87967249c58f97c7b29");
        } else if (this.b != null && !this.b.I()) {
            com.sankuai.waimai.store.manager.judas.b.b(this.d.d, com.sankuai.waimai.store.manager.judas.b.a((Object) this.c), "b_waimai_b1h3jsh5_mv").a("poi_id", this.b.d()).a("status", Integer.valueOf(this.b.G())).a("poi_status", Integer.valueOf(this.b.r())).a("tip", d()).a("stid", c()).a();
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8825fe83a16adb3fb9888261a637dfb1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8825fe83a16adb3fb9888261a637dfb1");
        } else if (this.b.b()) {
            b();
            if (this.c.getApplication() != null) {
                this.c.getApplication().registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.sankuai.waimai.store.shopping.cart.block.d.3
                    public static ChangeQuickRedirect a;

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityCreated(Activity activity, Bundle bundle) {
                        Object[] objArr4 = {activity, bundle};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "ce4734e2175ce1b522ea7fbb213f91ac", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "ce4734e2175ce1b522ea7fbb213f91ac");
                        }
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityPaused(Activity activity) {
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityStarted(Activity activity) {
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityStopped(Activity activity) {
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityResumed(Activity activity) {
                        Object[] objArr4 = {activity};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "9110128fd7f5bc927568808c49318019", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "9110128fd7f5bc927568808c49318019");
                        } else if (activity == d.this.c) {
                            d.this.b();
                        }
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityDestroyed(Activity activity) {
                        Object[] objArr4 = {activity};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "11856e994f3e8136bc4495d03d8a94b4", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "11856e994f3e8136bc4495d03d8a94b4");
                        } else if (activity != d.this.c || d.this.c.getApplication() == null) {
                        } else {
                            d.this.c.getApplication().unregisterActivityLifecycleCallbacks(this);
                        }
                    }
                });
            }
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23945b388c91ea4c0e83df6ff2bfb57c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23945b388c91ea4c0e83df6ff2bfb57c");
        } else if (this.b == null) {
        } else {
            if (this.b.b()) {
                u.a(this.g);
                this.h.setText(this.b.b.bottomPoiImInfo.h.text);
                this.g.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.shopping.cart.block.d.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i;
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4bf9f9a736522a999cc58a23753c8e8f", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4bf9f9a736522a999cc58a23753c8e8f");
                            return;
                        }
                        if (d.this.f == null) {
                            d.this.f = new com.sankuai.waimai.store.im.entrance.drug.jump.c(d.this.c, d.this.d.d, d.this.e);
                        }
                        com.sankuai.waimai.store.im.entrance.drug.jump.c cVar = d.this.f;
                        d dVar = d.this;
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = d.a;
                        if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "85053b9209e380e7ec6cc7053903165a", RobustBitConfig.DEFAULT_VALUE)) {
                            i = ((Integer) PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "85053b9209e380e7ec6cc7053903165a")).intValue();
                        } else {
                            i = dVar.d.g;
                            if (i == -1) {
                                i = dVar.c instanceof SGNewGoodDetailActivity ? 40 : dVar.c instanceof SCSuperMarketActivity ? 30 : 0;
                            }
                        }
                        cVar.a(i, d.this.b.f(), d.this.b.d(), String.valueOf(d.this.d.c), false);
                        com.sankuai.waimai.store.manager.judas.b.a(d.this.d.d, AppUtil.generatePageInfoKey(d.this.c), ShopConstants.ImSource.b).a("new_message_badge", 0).a("cat_id", "-999").a("status", -999).a("stid", d.this.c()).a();
                    }
                });
            } else {
                u.c(this.g);
            }
            if (this.b.D()) {
                this.k.setTextColor(com.sankuai.waimai.store.util.b.b(this.mContext, R.color.wm_sg_color_c9c5c2));
                if (this.b.G() == 11) {
                    this.j.setImageResource(R.drawable.wm_sc_shop_cart_im_busy);
                } else if (this.b.G() == 10) {
                    if (this.b.C()) {
                        if (this.b.b()) {
                            this.j.setImageDrawable(com.sankuai.waimai.store.util.e.a(this.mContext, (int) R.drawable.wm_sc_shop_cart_im, -1));
                            this.k.setTextColor(-1);
                        } else {
                            this.j.setImageResource(R.drawable.wm_sc_shop_cart_im);
                            this.k.setTextColor(com.sankuai.waimai.store.util.b.b(this.mContext, R.color.wm_sg_color_ffd161));
                        }
                    } else {
                        this.j.setImageResource(R.drawable.wm_sc_shop_cart_im_online);
                    }
                } else if (this.b.b()) {
                    this.j.setImageDrawable(com.sankuai.waimai.store.util.e.a(this.mContext, (int) R.drawable.wm_sc_shop_cart_im, com.sankuai.waimai.store.util.b.b(this.mContext, R.color.wm_sg_color_999999)));
                    this.k.setTextColor(com.sankuai.waimai.store.util.b.b(this.mContext, R.color.wm_sg_color_999999));
                } else {
                    this.j.setImageResource(R.drawable.wm_sc_shop_cart_im);
                }
            } else {
                this.j.setImageResource(R.drawable.wm_sc_shop_cart_im_gray);
                this.k.setTextColor(com.sankuai.waimai.store.util.b.b(this.mContext, R.color.wm_sg_color_999999));
            }
            this.i.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.shopping.cart.block.d.2
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "500091fde866817a7056ce5bc841b572", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "500091fde866817a7056ce5bc841b572");
                        return;
                    }
                    com.sankuai.waimai.store.manager.judas.b.a(d.this.d.d, "b_waimai_b1h3jsh5_mc").a("poi_id", d.this.b.d()).a("status", Integer.valueOf(d.this.b.G())).a("poi_status", Integer.valueOf(d.this.b.r())).a("tip", d.this.d()).a("stid", d.this.c()).a();
                    com.sankuai.waimai.store.shopping.cart.util.d.a(d.this.c, d.this.b, d.this.d, d.this.e);
                }
            });
        }
    }

    void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b542cef949fc46e7418e4c3c957009e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b542cef949fc46e7418e4c3c957009e3");
        } else {
            com.sankuai.waimai.store.manager.judas.b.b(this.d.d, AppUtil.generatePageInfoKey(this.c), ShopConstants.ImSource.a).a("new_message_badge", 0).a("cat_id", "-999").a("status", -999).a("stid", c()).a();
        }
    }

    String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40e20104ef4c7c573c694bd7222c8e84", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40e20104ef4c7c573c694bd7222c8e84") : (this.b == null || this.b.b == null || this.b.b.abExpInfo == null) ? "-999" : this.b.b.abExpInfo;
    }

    String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c699535b01a7b6a3948b957b5e84ee49", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c699535b01a7b6a3948b957b5e84ee49") : (this.b == null || this.b.b == null || this.b.b.bottomPoiImInfo == null || this.b.b.bottomPoiImInfo.g == null || TextUtils.isEmpty(this.b.b.bottomPoiImInfo.g.shopCartIMPopTip)) ? "-999" : this.b.b.bottomPoiImInfo.g.shopCartIMPopTip;
    }
}
