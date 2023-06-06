package com.sankuai.waimai.business.restaurant.poicontainer.modules.tab;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.neohybrid.core.config.KernelConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.business.restaurant.base.manager.order.g;
import com.sankuai.waimai.business.restaurant.poicontainer.helper.b;
import com.sankuai.waimai.business.restaurant.poicontainer.helper.f;
import com.sankuai.waimai.business.restaurant.poicontainer.views.ShopTabLayoutNew;
import com.sankuai.waimai.foundation.core.service.user.a;
import com.sankuai.waimai.foundation.utils.o;
import com.sankuai.waimai.log.judas.JudasManualManager;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends a {
    public static ChangeQuickRedirect c;
    final Activity d;
    final g e;
    public ShopTabLayoutNew f;
    TextView g;
    private final int h;
    private final int i;
    private String[] j;
    private final g.a k;
    private View l;
    private boolean m;

    public b(Activity activity, g gVar, g.a aVar, com.sankuai.waimai.business.restaurant.poicontainer.helper.b bVar) {
        super(activity);
        Object[] objArr = {activity, gVar, aVar, bVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ead124ce30e7560dcf560944be00885", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ead124ce30e7560dcf560944be00885");
            return;
        }
        this.h = 3;
        this.i = 4;
        this.d = activity;
        this.e = gVar;
        this.m = false;
        this.k = aVar;
        this.j = this.k.e();
        bVar.a(new b.a() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.modules.tab.b.1
        });
    }

    @Override // com.sankuai.waimai.business.restaurant.poicontainer.modules.tab.a
    public final String[] a() {
        return this.j;
    }

    @Override // com.sankuai.waimai.business.restaurant.poicontainer.modules.tab.a
    public final View a(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d2796daca98c4b96ca8dd2437b6bf68", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d2796daca98c4b96ca8dd2437b6bf68");
        }
        View inflate = layoutInflater.inflate(R.layout.wm_restaurant_layout_content_tab_new, viewGroup, false);
        this.l = inflate;
        this.f = (ShopTabLayoutNew) inflate.findViewById(R.id.shop_tab_layout);
        if (this.m) {
            this.f.getLayoutParams().width = com.sankuai.waimai.foundation.utils.g.a(this.b, 260.0f);
        }
        this.g = (TextView) inflate.findViewById(R.id.shop_tab_layout_multi);
        this.g.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.modules.tab.b.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "22d08e396dc484fd6d2a89be7aee1ac2", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "22d08e396dc484fd6d2a89be7aee1ac2");
                    return;
                }
                final Context context = b.this.b;
                final g gVar = b.this.e;
                Object[] objArr3 = {context, gVar};
                ChangeQuickRedirect changeQuickRedirect3 = f.a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "7c254293360378e5841b62a00c5161ab", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "7c254293360378e5841b62a00c5161ab");
                    return;
                }
                if (!com.sankuai.waimai.platform.domain.manager.user.a.i().a()) {
                    com.sankuai.waimai.foundation.core.service.user.a.a = a.EnumC0947a.FROM_COMPOSE_ORDER;
                }
                com.sankuai.waimai.platform.domain.manager.user.a.a(context, new Runnable() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.helper.f.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "436fb1e0b00e4b5e3fa63601365086ee", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "436fb1e0b00e4b5e3fa63601365086ee");
                        } else {
                            com.sankuai.waimai.business.restaurant.composeorder.a.a(gVar.f(), gVar.g(), (Activity) context, 0);
                        }
                    }
                });
                HashMap hashMap = new HashMap();
                hashMap.put("poi_id", gVar.f());
                hashMap.put(KernelConfig.KEY_CONTAINER_TYPE, Integer.valueOf(gVar.s()));
                hashMap.put("stid", gVar.n);
                JudasManualManager.a a2 = JudasManualManager.a("b_XguMI").a("c_CijEL");
                a2.b = AppUtil.generatePageInfoKey(context);
                a2.b(hashMap).a();
            }
        });
        return inflate;
    }

    @Override // com.sankuai.waimai.business.restaurant.poicontainer.modules.tab.a
    public final void a(final ViewPager viewPager) {
        String valueOf;
        Object[] objArr = {viewPager};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ab8a5228339be4e5ad9f1957ca252d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ab8a5228339be4e5ad9f1957ca252d3");
            return;
        }
        this.f.setupWithViewPager(viewPager);
        if (viewPager.getCurrentItem() > 0) {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.modules.tab.b.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4892b13be7b8cb18fcc379f1998f4210", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4892b13be7b8cb18fcc379f1998f4210");
                    } else if (b.this.d.isFinishing()) {
                    } else {
                        b.this.f.setCurrentSelectItem(viewPager.getCurrentItem());
                    }
                }
            }, 32L);
        } else {
            this.f.setCurrentSelectItem(viewPager.getCurrentItem());
        }
        long commentNumber = this.e.g.getCommentNumber();
        if (commentNumber <= 0) {
            valueOf = "";
        } else {
            valueOf = commentNumber > 9999 ? "9999+" : String.valueOf(commentNumber);
        }
        this.f.a(valueOf, this.k.c());
    }

    @Override // com.sankuai.waimai.business.restaurant.poicontainer.modules.tab.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56cbfb03d551d7337d2be5963cfcbae1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56cbfb03d551d7337d2be5963cfcbae1");
        } else {
            this.f.a(this.k.d());
        }
    }

    @Override // com.sankuai.waimai.business.restaurant.poicontainer.modules.tab.a
    public final void a(int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f952c944dc014a0d145b89785bbc99ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f952c944dc014a0d145b89785bbc99ce");
            return;
        }
        int a = (int) (255.0f - (o.a(i, i2, i3) * 5.0f));
        this.l.setBackgroundColor(Color.rgb(a, a, a));
    }

    @Override // com.sankuai.waimai.business.restaurant.poicontainer.modules.tab.a
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b270b352bb8227c1a8b1d5ed60f4e60b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b270b352bb8227c1a8b1d5ed60f4e60b");
        } else {
            this.f.a(this.k.d(), str);
        }
    }

    @Override // com.sankuai.waimai.business.restaurant.poicontainer.modules.tab.a
    public final void a(com.sankuai.waimai.business.restaurant.poicontainer.modules.paged.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d46240156407b51fbd99807e1402ae3f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d46240156407b51fbd99807e1402ae3f");
            return;
        }
        String string = this.d.getString(R.string.wm_restaurant_tab_food_menu);
        String[] e = this.k.e();
        if (this.j.length != e.length) {
            this.j = e;
        }
        this.j[this.k.b()] = string;
        String str = aVar.i;
        String str2 = aVar.h != null ? aVar.h.iconUrl : null;
        if ((this.e.w() && !this.e.H) || this.e.i || this.e.t()) {
            this.g.setVisibility(8);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.g.setVisibility(8);
        } else {
            this.g.setVisibility(0);
            this.g.setText(str);
            if (TextUtils.isEmpty(str2)) {
                this.g.setCompoundDrawables(null, null, null, null);
            } else {
                b.C0608b a = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                a.c = str2;
                a.a(new com.sankuai.meituan.mtimageloader.utils.b() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.modules.tab.b.4
                    public static ChangeQuickRedirect a;

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.sankuai.meituan.mtimageloader.utils.b, com.sankuai.meituan.mtimageloader.utils.d
                    public final void a(Drawable drawable) {
                        Object[] objArr2 = {drawable};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0684c17decfdd957759e16049ec6eb3f", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0684c17decfdd957759e16049ec6eb3f");
                            return;
                        }
                        int a2 = com.sankuai.waimai.foundation.utils.g.a(com.meituan.android.singleton.b.a, 14.0f);
                        drawable.setBounds(0, 0, a2, a2);
                        b.this.g.setCompoundDrawables(null, null, drawable, null);
                    }
                });
            }
        }
        Activity activity = this.d;
        g gVar = this.e;
        Object[] objArr2 = {activity, gVar};
        ChangeQuickRedirect changeQuickRedirect2 = f.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "f1eaeb13d6a19d6db48282730afd5b61", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "f1eaeb13d6a19d6db48282730afd5b61");
            return;
        }
        JudasManualManager.a a2 = JudasManualManager.b("b_5k9oS").a("c_CijEL");
        a2.b = AppUtil.generatePageInfoKey(activity);
        a2.a("poi_id", gVar.f()).a(KernelConfig.KEY_CONTAINER_TYPE, gVar.s()).a("stid", gVar.n).a();
    }

    @Override // com.sankuai.waimai.business.restaurant.poicontainer.modules.tab.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5a39d7c20c82bcca2add1fa554225da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5a39d7c20c82bcca2add1fa554225da");
        } else {
            this.f.setTabBackToTopIconVisible(this.k.b());
        }
    }

    @Override // com.sankuai.waimai.business.restaurant.poicontainer.modules.tab.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45a104631ee8cb2c7c668e050112e025", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45a104631ee8cb2c7c668e050112e025");
        } else {
            this.f.setTabBackToTopIconGone(this.k.b());
        }
    }
}
