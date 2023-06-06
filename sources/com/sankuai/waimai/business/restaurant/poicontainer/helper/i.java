package com.sankuai.waimai.business.restaurant.poicontainer.helper;

import android.app.Activity;
import android.app.Dialog;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.util.LruCache;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.model.RecommendPackageFloatResponse;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.platform.utils.listid.ListIDHelper;
import com.sankuai.waimai.restaurant.shopcart.ui.ab;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class i {
    public static ChangeQuickRedirect a;
    LruCache<String, RecommendPackageFloatResponse> b;
    ViewGroup c;
    com.sankuai.waimai.business.restaurant.base.ui.f d;
    private View e;
    private View f;
    private TranslateAnimation g;
    private TranslateAnimation h;
    private Activity i;
    private String j;
    private com.sankuai.waimai.business.restaurant.base.manager.order.g k;

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6d9400830ee8b3a00f3b70ea86f8684", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6d9400830ee8b3a00f3b70ea86f8684");
        }
    }

    public static /* synthetic */ void a(i iVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, iVar, changeQuickRedirect, false, "4097a7b10433b161f867c7d80afd4d47", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, iVar, changeQuickRedirect, false, "4097a7b10433b161f867c7d80afd4d47");
        } else {
            ae.a(iVar.i, iVar.i.getResources().getString(R.string.wm_restaurant_net_request_failed_retry));
        }
    }

    public i(@NonNull Activity activity, String str, com.sankuai.waimai.business.restaurant.base.manager.order.g gVar, ab abVar, View view) {
        Object[] objArr = {activity, str, gVar, abVar, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cde7af0988d7046add82ce4f084eb91d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cde7af0988d7046add82ce4f084eb91d");
            return;
        }
        this.b = new LruCache<>(10);
        this.i = activity;
        this.j = str;
        this.e = view;
        this.k = gVar;
        this.d = new com.sankuai.waimai.business.restaurant.base.ui.f(activity, gVar, abVar, true);
    }

    public final void a(String str, GoodsSpu goodsSpu, String str2, String str3, long j, int i) {
        char c;
        long j2;
        long j3;
        final String str4;
        Object[] objArr = {str, goodsSpu, str2, str3, new Long(j), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c7e6bf58844d43ba00ba9ee8b427524", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c7e6bf58844d43ba00ba9ee8b427524");
            return;
        }
        if (this.c == null) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "87f8fa7a0422e0b8840da20c0ed2bc7b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "87f8fa7a0422e0b8840da20c0ed2bc7b");
            } else {
                this.c = (ViewGroup) ((ViewStub) this.e.findViewById(R.id.view_stub_recommend_package)).inflate().findViewById(R.id.layout_recommend_package);
                this.f = this.c.findViewById(R.id.recommend_package_real);
                this.d.a(this.c);
                this.d.d = new View.OnClickListener() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.helper.i.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr3 = {view};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f017425e1a62c46dd43ba586b8de78b1", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f017425e1a62c46dd43ba586b8de78b1");
                        } else {
                            i.this.a();
                        }
                    }
                };
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "bd2c696ee59616d09e8788ac2e9e68ba", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "bd2c696ee59616d09e8788ac2e9e68ba");
                } else {
                    this.g = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
                    this.g.setDuration(300L);
                    this.h = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
                    this.h.setDuration(300L);
                    this.h.setAnimationListener(new Animation.AnimationListener() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.helper.i.3
                        public static ChangeQuickRedirect a;

                        @Override // android.view.animation.Animation.AnimationListener
                        public final void onAnimationRepeat(Animation animation) {
                        }

                        @Override // android.view.animation.Animation.AnimationListener
                        public final void onAnimationStart(Animation animation) {
                        }

                        @Override // android.view.animation.Animation.AnimationListener
                        public final void onAnimationEnd(Animation animation) {
                            Object[] objArr4 = {animation};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "a474aa8a86ac582d9c46d2b88922ae0d", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "a474aa8a86ac582d9c46d2b88922ae0d");
                            } else {
                                i.this.c.setVisibility(8);
                            }
                        }
                    });
                }
            }
        }
        if (goodsSpu != null) {
            c = 0;
            j3 = goodsSpu.getId();
            j2 = goodsSpu.getSkuList().get(0).getSkuId();
        } else {
            c = 0;
            j2 = -1;
            j3 = -1;
        }
        this.k.f = i;
        Object[] objArr4 = new Object[4];
        objArr4[c] = str;
        objArr4[1] = new Long(j3);
        objArr4[2] = new Long(j2);
        objArr4[3] = new Long(j);
        ChangeQuickRedirect changeQuickRedirect4 = a;
        long j4 = j2;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "ce1ed001ad38b0d76547420d14fa04d1", RobustBitConfig.DEFAULT_VALUE)) {
            str4 = (String) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "ce1ed001ad38b0d76547420d14fa04d1");
        } else {
            str4 = "wm_poi_id=" + str + "&spu_id=" + j3 + "&sku_id=" + j4 + "&package_id=" + j;
        }
        RecommendPackageFloatResponse recommendPackageFloatResponse = this.b.get(str4);
        if (a(recommendPackageFloatResponse)) {
            this.d.a(recommendPackageFloatResponse, 0, recommendPackageFloatResponse.f);
            a(recommendPackageFloatResponse.f);
            return;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("wm_poi_id", String.valueOf(com.sankuai.waimai.platform.domain.core.poi.b.a(str)));
        hashMap.put(FoodDetailNetWorkPreLoader.URI_POI_STR, str);
        if (j3 > 0) {
            hashMap.put("spu_id", String.valueOf(j3));
        }
        if (j4 > 0) {
            hashMap.put("sku_id", String.valueOf(j4));
        }
        hashMap.put("rank_list_id", ListIDHelper.a.a.a("restaurant", "restaurant_page_blcok"));
        hashMap.put("ref_list_id", ListIDHelper.a.a.a("restaurant", "restaurant_page_blcok_ref"));
        if (!aa.a(str2)) {
            hashMap.put("exposed_info", str2);
        }
        if (!aa.a(str3)) {
            hashMap.put("cart_info", str3);
        }
        if (j > 0) {
            hashMap.put("click_package_id", String.valueOf(j));
        }
        hashMap.put("type", String.valueOf(i));
        final Dialog a2 = com.sankuai.waimai.platform.widget.dialog.a.a(this.i);
        com.sankuai.waimai.business.restaurant.base.repository.b.a(this.j).a(hashMap, new com.sankuai.waimai.business.restaurant.base.repository.net.c<RecommendPackageFloatResponse>() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.helper.i.2
            public static ChangeQuickRedirect b;

            @Override // com.sankuai.waimai.business.restaurant.base.repository.net.c, com.sankuai.waimai.business.restaurant.base.repository.net.b
            public final /* synthetic */ void a(Object obj) {
                RecommendPackageFloatResponse recommendPackageFloatResponse2 = (RecommendPackageFloatResponse) obj;
                Object[] objArr5 = {recommendPackageFloatResponse2};
                ChangeQuickRedirect changeQuickRedirect5 = b;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "e934f658f8e0ff0693247828528ff8f2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "e934f658f8e0ff0693247828528ff8f2");
                    return;
                }
                com.sankuai.waimai.platform.widget.dialog.a.b(a2);
                if (i.this.a(recommendPackageFloatResponse2)) {
                    recommendPackageFloatResponse2.f = ListIDHelper.a.a.a();
                    i.this.b.put(str4, recommendPackageFloatResponse2);
                    i.this.d.a(recommendPackageFloatResponse2, 0, recommendPackageFloatResponse2.f);
                    i.this.a(recommendPackageFloatResponse2.f);
                    return;
                }
                i.a(i.this);
            }

            @Override // com.sankuai.waimai.business.restaurant.base.repository.net.c, com.sankuai.waimai.business.restaurant.base.repository.net.b
            public final void a(com.sankuai.waimai.platform.modular.network.error.a aVar) {
                Object[] objArr5 = {aVar};
                ChangeQuickRedirect changeQuickRedirect5 = b;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "9f6a20e8b90f129f347264c933d6b77d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "9f6a20e8b90f129f347264c933d6b77d");
                    return;
                }
                super.a(aVar);
                com.sankuai.waimai.platform.widget.dialog.a.b(a2);
                i.a(i.this);
            }
        });
    }

    boolean a(RecommendPackageFloatResponse recommendPackageFloatResponse) {
        Object[] objArr = {recommendPackageFloatResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b15659e457d4ce136a95eb473a58392", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b15659e457d4ce136a95eb473a58392")).booleanValue() : (recommendPackageFloatResponse == null || recommendPackageFloatResponse.c == null || !com.sankuai.waimai.foundation.utils.b.a(recommendPackageFloatResponse.c.recommendItemList)) ? false : true;
    }

    void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "297352987bdc72423eae7e1f9e30a4f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "297352987bdc72423eae7e1f9e30a4f0");
        } else if (b()) {
        } else {
            this.c.setVisibility(0);
            this.f.startAnimation(this.g);
            JudasManualManager.a a2 = JudasManualManager.b("b_waimai_ezwvsb0r_mv").a("c_CijEL");
            a2.b = AppUtil.generatePageInfoKey(this.i);
            a2.a("ref_list_id", ListIDHelper.a.a.a("restaurant", "restaurant_page_blcok")).a("rank_list_id", str).a();
        }
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b06e54ea0ca16ba2a3d698bc636cdb04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b06e54ea0ca16ba2a3d698bc636cdb04");
        } else if (b()) {
            this.f.startAnimation(this.h);
            if (this.d != null) {
                this.d.a();
            }
        }
    }

    public boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b35d599901faba1be26c4a8e02de4a74", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b35d599901faba1be26c4a8e02de4a74")).booleanValue() : this.c != null && this.c.getVisibility() == 0;
    }

    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a63464b09463f4234893809432ee69a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a63464b09463f4234893809432ee69a5");
        } else if (this.d != null) {
            com.sankuai.waimai.business.restaurant.base.ui.f fVar = this.d;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.restaurant.base.ui.f.a;
            if (PatchProxy.isSupport(objArr2, fVar, changeQuickRedirect2, false, "a2885b788f8c0a12e80b7f5f64c0279b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, fVar, changeQuickRedirect2, false, "a2885b788f8c0a12e80b7f5f64c0279b");
                return;
            }
            if (fVar.c != null) {
                fVar.c.a();
            }
            fVar.a();
        }
    }

    public void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5f8cbd9638bb1d6acf9b9ba0a08aabb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5f8cbd9638bb1d6acf9b9ba0a08aabb");
        } else if (this.d != null) {
            com.sankuai.waimai.business.restaurant.base.ui.f fVar = this.d;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.restaurant.base.ui.f.a;
            if (PatchProxy.isSupport(objArr2, fVar, changeQuickRedirect2, false, "a80690fbf0d8e4af31781cf0d82e568a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, fVar, changeQuickRedirect2, false, "a80690fbf0d8e4af31781cf0d82e568a");
            } else if (fVar.b != null) {
                fVar.b.b();
            }
        }
    }
}
