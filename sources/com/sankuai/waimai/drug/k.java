package com.sankuai.waimai.drug;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.im.DrugImEntranceEntity;
import com.sankuai.waimai.store.shopping.cart.SCPageConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class k extends com.sankuai.waimai.store.base.b implements com.sankuai.waimai.store.im.entrance.drug.unread.I.a, com.sankuai.waimai.store.im.entrance.drug.view.d {
    public static ChangeQuickRedirect a;
    Activity b;
    com.sankuai.waimai.store.im.entrance.drug.unread.a c;
    SCPageConfig d;
    String e;
    View.OnClickListener f;
    DrugImEntranceEntity g;
    GoodsSpu h;
    private com.sankuai.waimai.store.im.entrance.drug.jump.I.a i;
    private ImageView j;
    private TextView k;
    private TextView l;
    private boolean m;

    public static /* synthetic */ void a(k kVar, com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, kVar, changeQuickRedirect, false, "e6cf19fa305b2a1962d6b304ee991ef0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, kVar, changeQuickRedirect, false, "e6cf19fa305b2a1962d6b304ee991ef0");
        } else {
            com.sankuai.waimai.store.manager.judas.b.a(kVar.d.d, com.sankuai.waimai.store.manager.judas.b.a((Object) kVar.b), z ? "b_waimai_i236qq9g_mc" : "b_waimai_7gy6i8w4_mc").a("poi_id", String.valueOf(kVar.a(aVar))).a("spu_id", Long.valueOf(kVar.h != null ? kVar.h.id : -999L)).a();
        }
    }

    public k(@NonNull Activity activity, @NonNull com.sankuai.waimai.store.shopping.cart.contract.a aVar, GoodsSpu goodsSpu) {
        super(activity);
        Object[] objArr = {activity, aVar, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e0ede35109878581f8b10e578e078e8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e0ede35109878581f8b10e578e078e8");
            return;
        }
        this.b = activity;
        this.d = aVar.h();
        this.e = aVar.l();
        this.h = goodsSpu;
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3d3fcffbb07aaac7b04c253b683ada0", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3d3fcffbb07aaac7b04c253b683ada0") : layoutInflater.inflate(R.layout.wm_sc_shopcart_b2c_im_pop_item_layout, viewGroup, false);
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2354ad0f31d6d887fcfcd253d9d1bab1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2354ad0f31d6d887fcfcd253d9d1bab1");
            return;
        }
        super.onViewCreated();
        this.j = (ImageView) findView(R.id.iv_im_item_icon);
        this.l = (TextView) findView(R.id.tv_im_item_red_dot);
        this.k = (TextView) findView(R.id.tv_im_item_text);
        this.l.setVisibility(8);
    }

    public final void a(final com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, boolean z) {
        String str;
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1545c63f87a6cc929d285355f7b91eac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1545c63f87a6cc929d285355f7b91eac");
            return;
        }
        this.m = z;
        if (z) {
            Object[] objArr2 = {aVar};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c23bd1794ba982ec6c983326b789f143", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c23bd1794ba982ec6c983326b789f143");
                return;
            }
            this.g = (aVar == null || aVar.F() == null) ? null : aVar.F().h;
            if (this.g != null) {
                this.k.setText(TextUtils.isEmpty(this.g.text) ? com.sankuai.waimai.store.util.b.a((int) R.string.wm_sc_common_contact_im) : this.g.text);
                this.k.setTextColor(com.sankuai.waimai.store.util.b.b(this.b, R.color.wm_sg_color_333333));
                this.j.setImageResource(R.drawable.wm_sc_drug_im_menu_icon);
            } else {
                this.k.setText(com.sankuai.waimai.store.util.b.a((int) R.string.wm_sc_common_contact_im));
                this.k.setTextColor(com.sankuai.waimai.store.util.b.b(this.b, R.color.wm_sg_color_858687));
                this.j.setImageDrawable(com.sankuai.waimai.store.util.e.a(this.mContext, (int) R.drawable.wm_sc_drug_im_menu_icon, com.sankuai.waimai.store.util.b.b(this.mContext, R.color.wm_sg_color_BCBCBD)));
            }
            this.mView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.drug.k.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String h;
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "66c37aa26f8f3bdc1db722cfeaf2fa0d", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "66c37aa26f8f3bdc1db722cfeaf2fa0d");
                        return;
                    }
                    k.a(k.this, aVar, true);
                    if (k.this.g == null) {
                        return;
                    }
                    if (k.this.f != null) {
                        k.this.f.onClick(view);
                    }
                    k kVar = k.this;
                    int i = k.this.d.e;
                    long a2 = k.this.a(aVar);
                    k kVar2 = k.this;
                    com.sankuai.waimai.store.platform.domain.manager.poi.a aVar2 = aVar;
                    Object[] objArr4 = {aVar2};
                    ChangeQuickRedirect changeQuickRedirect4 = k.a;
                    if (PatchProxy.isSupport(objArr4, kVar2, changeQuickRedirect4, false, "c00777df1e9b91ca2a9d5b6ee6e22bff", RobustBitConfig.DEFAULT_VALUE)) {
                        h = (String) PatchProxy.accessDispatch(objArr4, kVar2, changeQuickRedirect4, false, "c00777df1e9b91ca2a9d5b6ee6e22bff");
                    } else {
                        h = aVar2 != null ? aVar2.h() : "-1";
                    }
                    kVar.a(i, a2, h, String.valueOf(k.this.d.c));
                }
            });
            this.c = new com.sankuai.waimai.store.im.entrance.drug.unread.a(this);
            this.c.c();
            this.c.a();
            this.i = new com.sankuai.waimai.store.im.entrance.drug.jump.b(this.b, this.d.d, this.e);
            this.b.getApplication().registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.sankuai.waimai.drug.k.2
                public static ChangeQuickRedirect a;

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityCreated(Activity activity, Bundle bundle) {
                    Object[] objArr3 = {activity, bundle};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e1d801ba3740425f00e41cf9c1de5c79", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e1d801ba3740425f00e41cf9c1de5c79");
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityPaused(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityResumed(Activity activity) {
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
                public final void onActivityDestroyed(Activity activity) {
                    Object[] objArr3 = {activity};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "14c815aee8ff57bbf8550ec8d8b773f1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "14c815aee8ff57bbf8550ec8d8b773f1");
                    } else if (activity == k.this.b) {
                        if (k.this.c != null) {
                            k.this.c.b();
                        }
                        if (k.this.b != null) {
                            k.this.b.getApplication().unregisterActivityLifecycleCallbacks(this);
                        }
                    }
                }
            });
            return;
        }
        Object[] objArr3 = {aVar};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "84e21d02ff01236fc8f5bd172c4d94b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "84e21d02ff01236fc8f5bd172c4d94b9");
        } else if (aVar != null) {
            TextView textView = this.k;
            Object[] objArr4 = {aVar};
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "ef2872b44ef4e17fb4d1e24e3c06c321", RobustBitConfig.DEFAULT_VALUE)) {
                str = (String) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "ef2872b44ef4e17fb4d1e24e3c06c321");
            } else {
                str = aVar.F() != null ? aVar.F().j : "";
                if (TextUtils.isEmpty(str)) {
                    str = com.sankuai.waimai.store.util.b.a((int) R.string.wm_st_shop_cart_im);
                }
            }
            textView.setText(str);
            if (aVar.D()) {
                this.k.setTextColor(com.sankuai.waimai.store.util.b.b(this.mContext, R.color.wm_sg_color_333333));
                if (aVar.G() == 11) {
                    this.j.setImageResource(R.drawable.wm_sc_shop_cart_b2c_im_busy);
                } else {
                    this.j.setImageResource(R.drawable.wm_sc_shop_cart_b2c_im_enable);
                }
            } else {
                this.j.setImageResource(R.drawable.wm_sc_shop_cart_b2c_im_unable);
                this.k.setTextColor(com.sankuai.waimai.store.util.b.b(this.mContext, R.color.wm_sg_color_858687));
            }
            this.mView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.drug.k.3
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr5 = {view};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "712753a7bc6b96eda7856dc022fef3d1", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "712753a7bc6b96eda7856dc022fef3d1");
                        return;
                    }
                    if (k.this.f != null) {
                        k.this.f.onClick(view);
                    }
                    k.a(k.this, aVar, false);
                    com.sankuai.waimai.drug.util.a.a(k.this.b, aVar, k.this.h, k.this.d, k.this.e);
                }
            });
        }
    }

    long a(com.sankuai.waimai.store.platform.domain.manager.poi.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2b5640552d69a55ac40af78fdae5c5a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2b5640552d69a55ac40af78fdae5c5a")).longValue();
        }
        if (aVar != null) {
            return aVar.f();
        }
        return -1L;
    }

    @Override // com.sankuai.waimai.store.im.entrance.drug.view.d
    public final void a(int i, long j, String str, String str2) {
        Object[] objArr = {Integer.valueOf(i), new Long(j), str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b90cb21fd568ea65c93f6f3de6db926", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b90cb21fd568ea65c93f6f3de6db926");
        } else if (this.i != null) {
            this.i.a(i, j, str, str2, false);
        }
    }

    @Override // com.sankuai.waimai.store.im.entrance.drug.unread.I.a
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e79186927fa8b85d56ed105378889b11", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e79186927fa8b85d56ed105378889b11");
        } else if (!this.m || this.g == null) {
            u.c(this.l);
        } else if (this.l != null) {
            if (i <= 0) {
                u.c(this.l);
                return;
            }
            u.a(this.l);
            this.l.setText(i > 99 ? "99" : String.valueOf(i));
        }
    }
}
