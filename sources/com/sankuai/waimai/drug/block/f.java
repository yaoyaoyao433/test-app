package com.sankuai.waimai.drug.block;

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
import com.sankuai.waimai.store.drug.goods.list.DrugPoiActivity;
import com.sankuai.waimai.store.shopping.cart.SCPageConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;
    com.sankuai.waimai.store.platform.domain.manager.poi.a b;
    Activity c;
    SCPageConfig d;
    String e;
    com.sankuai.waimai.drug.im.entrance.jump.a f;
    private View g;
    private TextView h;
    private View i;
    private ImageView j;
    private TextView k;

    public f(@NonNull Activity activity, com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, SCPageConfig sCPageConfig, String str) {
        super(activity);
        Object[] objArr = {activity, aVar, sCPageConfig, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a96bbbb2438d83b36a53add99ea0951", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a96bbbb2438d83b36a53add99ea0951");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b68619187f8267e25aa5fd2028764dcc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b68619187f8267e25aa5fd2028764dcc");
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
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "65ebfb2fe36ed200d730ae8e229bfdd3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "65ebfb2fe36ed200d730ae8e229bfdd3");
        } else if (this.b != null && !this.b.I()) {
            com.sankuai.waimai.store.manager.judas.b.b(this.d.d, com.sankuai.waimai.store.manager.judas.b.a((Object) this.c), "b_waimai_b1h3jsh5_mv").a("poi_id", this.b.d()).a("status", Integer.valueOf(this.b.G())).a("poi_status", Integer.valueOf(this.b.r())).a("tip", d()).a("stid", c()).a();
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5531b5aea6896310b6a83e1c3109f655", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5531b5aea6896310b6a83e1c3109f655");
        } else if (this.b.b()) {
            b();
            if (this.c.getApplication() != null) {
                this.c.getApplication().registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.sankuai.waimai.drug.block.f.3
                    public static ChangeQuickRedirect a;

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityCreated(Activity activity, Bundle bundle) {
                        Object[] objArr4 = {activity, bundle};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "d78dced4148e1b5cf8b4f3f49be4cf2c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "d78dced4148e1b5cf8b4f3f49be4cf2c");
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
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "4d292ed7cf216c0cf3d9fb69087c50ae", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "4d292ed7cf216c0cf3d9fb69087c50ae");
                        } else if (activity == f.this.c) {
                            f.this.b();
                        }
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityDestroyed(Activity activity) {
                        Object[] objArr4 = {activity};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "1cefdf039036725066c7ad4a3ea42dbc", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "1cefdf039036725066c7ad4a3ea42dbc");
                        } else if (activity != f.this.c || f.this.c.getApplication() == null) {
                        } else {
                            f.this.c.getApplication().unregisterActivityLifecycleCallbacks(this);
                        }
                    }
                });
            }
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24233c93988466a904c393490cdf80a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24233c93988466a904c393490cdf80a6");
        } else if (this.b == null) {
        } else {
            if (this.b.b()) {
                u.a(this.g);
                this.h.setText(this.b.b.bottomPoiImInfo.h.text);
                this.g.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.drug.block.f.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i;
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cb636f7d96f43eec81ace52f7932ee29", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cb636f7d96f43eec81ace52f7932ee29");
                            return;
                        }
                        if (f.this.f == null) {
                            f.this.f = new com.sankuai.waimai.drug.im.entrance.jump.a(f.this.c, f.this.d.d, f.this.e);
                        }
                        com.sankuai.waimai.drug.im.entrance.jump.a aVar = f.this.f;
                        f fVar = f.this;
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = f.a;
                        if (PatchProxy.isSupport(objArr3, fVar, changeQuickRedirect3, false, "d217fe9c732839c475dace30d407813b", RobustBitConfig.DEFAULT_VALUE)) {
                            i = ((Integer) PatchProxy.accessDispatch(objArr3, fVar, changeQuickRedirect3, false, "d217fe9c732839c475dace30d407813b")).intValue();
                        } else {
                            i = fVar.d.g;
                            if (i == -1) {
                                i = fVar.c instanceof DrugPoiActivity ? 30 : 0;
                            }
                        }
                        aVar.a(i, f.this.b.g(), f.this.b.h(), String.valueOf(f.this.d.c), false);
                        com.sankuai.waimai.store.manager.judas.b.a(f.this.d.d, AppUtil.generatePageInfoKey(f.this.c), ShopConstants.ImSource.b).a("new_message_badge", 0).a("cat_id", "-999").a("status", -999).a("stid", f.this.c()).a();
                    }
                });
            } else {
                u.c(this.g);
            }
            if (this.b.D()) {
                this.k.setTextColor(com.sankuai.waimai.store.util.b.b(this.mContext, R.color.wm_sg_color_c9c5c2));
                if (this.b.G() == 11) {
                    this.j.setImageResource(R.drawable.wm_drug_shop_cart_im_busy);
                } else if (this.b.G() == 10) {
                    if (this.b.C()) {
                        if (this.b.b()) {
                            this.j.setImageDrawable(com.sankuai.waimai.store.util.e.a(this.mContext, (int) R.drawable.wm_drug_shop_cart_im, -1));
                            this.k.setTextColor(-1);
                        } else {
                            this.j.setImageResource(R.drawable.wm_drug_shop_cart_im);
                            this.k.setTextColor(com.sankuai.waimai.store.util.b.b(this.mContext, R.color.wm_sg_color_ffd161));
                        }
                    } else {
                        this.j.setImageResource(R.drawable.wm_drug_shop_cart_im_online);
                    }
                } else if (this.b.b()) {
                    this.j.setImageDrawable(com.sankuai.waimai.store.util.e.a(this.mContext, (int) R.drawable.wm_drug_shop_cart_im, com.sankuai.waimai.store.util.b.b(this.mContext, R.color.wm_sg_color_999999)));
                    this.k.setTextColor(com.sankuai.waimai.store.util.b.b(this.mContext, R.color.wm_sg_color_999999));
                } else {
                    this.j.setImageResource(R.drawable.wm_drug_shop_cart_im);
                }
            } else {
                this.j.setImageResource(R.drawable.wm_drug_shop_cart_im_gray);
                this.k.setTextColor(com.sankuai.waimai.store.util.b.b(this.mContext, R.color.wm_sg_color_999999));
            }
            this.i.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.drug.block.f.2
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b2341170d3bd914fba2e4fbdbea260d8", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b2341170d3bd914fba2e4fbdbea260d8");
                        return;
                    }
                    com.sankuai.waimai.store.manager.judas.b.a(f.this.d.d, "b_waimai_b1h3jsh5_mc").a("poi_id", f.this.b.d()).a("status", Integer.valueOf(f.this.b.G())).a("poi_status", Integer.valueOf(f.this.b.r())).a("tip", f.this.d()).a("stid", f.this.c()).a();
                    com.sankuai.waimai.store.shopping.cart.util.d.a(f.this.c, f.this.b, f.this.d, f.this.e);
                }
            });
        }
    }

    void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79ccc64c593fc6c067d5475166f5491e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79ccc64c593fc6c067d5475166f5491e");
        } else {
            com.sankuai.waimai.store.manager.judas.b.b(this.d.d, AppUtil.generatePageInfoKey(this.c), ShopConstants.ImSource.a).a("new_message_badge", 0).a("cat_id", "-999").a("status", -999).a("stid", c()).a();
        }
    }

    String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d15554f2e6b5f48616ce57e75c21371e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d15554f2e6b5f48616ce57e75c21371e") : (this.b == null || this.b.b == null || this.b.b.abExpInfo == null) ? "-999" : this.b.b.abExpInfo;
    }

    String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57dbddf8ecf33b2eef56ba1a2044a971", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57dbddf8ecf33b2eef56ba1a2044a971") : (this.b == null || this.b.b == null || this.b.b.bottomPoiImInfo == null || this.b.b.bottomPoiImInfo.g == null || TextUtils.isEmpty(this.b.b.bottomPoiImInfo.g.shopCartIMPopTip)) ? "-999" : this.b.b.bottomPoiImInfo.g.shopCartIMPopTip;
    }
}
