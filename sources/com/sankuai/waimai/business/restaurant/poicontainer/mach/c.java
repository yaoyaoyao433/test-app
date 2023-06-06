package com.sankuai.waimai.business.restaurant.poicontainer.mach;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.meituan.android.cube.annotation.DynamicBinder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.manager.order.g;
import com.sankuai.waimai.business.restaurant.base.repository.model.VipCardResponse;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.mach.common.j;
import com.sankuai.waimai.platform.mach.a;
import java.util.Map;
/* compiled from: ProGuard */
@DynamicBinder(modelType = com.sankuai.waimai.business.restaurant.poicontainer.mach.a.class, nativeId = {"wm_r_menber_card"}, viewModel = com.meituan.android.cube.pga.viewmodel.a.class)
/* loaded from: classes4.dex */
public class c extends com.sankuai.waimai.business.restaurant.base.config.b<d, com.meituan.android.cube.pga.viewmodel.a<com.sankuai.waimai.business.restaurant.poicontainer.mach.a>, com.sankuai.waimai.business.restaurant.poicontainer.pga.b> implements j {
    public static ChangeQuickRedirect t;
    private String A;
    private boolean B;
    private long C;
    private String D;
    public BroadcastReceiver u;
    private final String v;
    private final String w;
    private final String x;
    private b y;
    private String z;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a();
    }

    @Override // com.sankuai.waimai.mach.common.j
    public final void M() {
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ com.meituan.android.cube.pga.view.a z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07b5b62c05b7c0591041e06ea136eea1", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07b5b62c05b7c0591041e06ea136eea1") : new d(m());
    }

    public c(com.sankuai.waimai.business.restaurant.poicontainer.pga.b bVar) {
        super(bVar);
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1bb92c39b389ac799f1ed3346ff9db46", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1bb92c39b389ac799f1ed3346ff9db46");
            return;
        }
        this.v = "restaurant_vip_card";
        this.w = "waimai_ad_platinum_brand_vip_card";
        this.x = "openBKCVipSuccess";
    }

    @Override // com.sankuai.waimai.mach.common.j
    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a146e376fffe0bdb310209d83d150004", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a146e376fffe0bdb310209d83d150004");
        } else {
            O();
        }
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "107dcb1689c4d41431ea55435c4a7865", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.cube.pga.viewmodel.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "107dcb1689c4d41431ea55435c4a7865") : new com.meituan.android.cube.pga.viewmodel.a();
    }

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "271131fc46e98819b6303361394c2873", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "271131fc46e98819b6303361394c2873");
            return;
        }
        super.s();
        g gVar = ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).u.a().b;
        if (gVar != null) {
            this.B = false;
            this.C = com.sankuai.waimai.platform.domain.core.poi.b.a(gVar.f());
            this.D = ((BaseActivity) l()).w();
            ((d) this.g).a(this.B);
        }
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void I() {
        boolean z;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf8ca6277880b67097d41c440de7a9fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf8ca6277880b67097d41c440de7a9fb");
            return;
        }
        super.I();
        com.sankuai.waimai.business.restaurant.poicontainer.mach.a aVar = (com.sankuai.waimai.business.restaurant.poicontainer.mach.a) this.n.e();
        if (aVar != null) {
            VipCardResponse vipCardResponse = aVar.a;
            Object[] objArr2 = {vipCardResponse};
            ChangeQuickRedirect changeQuickRedirect2 = t;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fb9d3175b3a5acddd5cec990336eb4d8", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fb9d3175b3a5acddd5cec990336eb4d8")).booleanValue();
            } else {
                z = (vipCardResponse == null || TextUtils.isEmpty(vipCardResponse.templateId) || TextUtils.isEmpty(vipCardResponse.templateData)) ? false : true;
            }
            if (z) {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = t;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c340e9c0ed6c512932e849c00f48a95b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c340e9c0ed6c512932e849c00f48a95b");
                } else if (this.y == null) {
                    this.y = new b(l(), "c_CijEL", this.D, new a() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.mach.c.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.business.restaurant.poicontainer.mach.c.a
                        public final void a() {
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "91cff5aff9cdeae48367364329f7630a", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "91cff5aff9cdeae48367364329f7630a");
                            } else {
                                c.this.N();
                            }
                        }
                    });
                    String str = "restaurant_vip_card";
                    if (this.B) {
                        str = "waimai_ad_platinum_brand_vip_card";
                        this.y.a("poi_id", Long.valueOf(this.C));
                    }
                    this.y.a((ViewGroup) ((d) this.g).e, str, "waimai");
                    this.y.a(this);
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = t;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "510a40c2ff1f917aa0edf6c5052961a5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "510a40c2ff1f917aa0edf6c5052961a5");
                    } else {
                        IntentFilter intentFilter = new IntentFilter("openBKCVipSuccess");
                        if (this.u == null) {
                            this.u = new BroadcastReceiver() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.mach.RestaurantVipCardBlock$3
                                public static ChangeQuickRedirect a;

                                @Override // android.content.BroadcastReceiver
                                public void onReceive(Context context, Intent intent) {
                                    Object[] objArr5 = {context, intent};
                                    ChangeQuickRedirect changeQuickRedirect5 = a;
                                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "d1293cd11cfd7a4809605b2f63a23b8c", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "d1293cd11cfd7a4809605b2f63a23b8c");
                                    } else {
                                        c.this.O();
                                    }
                                }
                            };
                        }
                        l().registerReceiver(this.u, intentFilter);
                    }
                }
                String str2 = aVar.a.templateId;
                String str3 = aVar.a.templateData;
                i().setVisibility(0);
                if (TextUtils.equals(str2, this.z) && TextUtils.equals(str3, this.A)) {
                    return;
                }
                this.z = str2;
                this.A = str3;
                try {
                    Map<String, Object> a2 = com.sankuai.waimai.mach.utils.b.a(this.A);
                    if (a2 != null) {
                        this.y.a(this.z, a2, new a.InterfaceC1053a() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.mach.c.2
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.platform.mach.a.InterfaceC1053a
                            public final void a() {
                                Object[] objArr5 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "04a7d5fd1f2645beedba70ca779417ca", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "04a7d5fd1f2645beedba70ca779417ca");
                                    return;
                                }
                                c.this.i().setVisibility(8);
                                c.this.N();
                            }
                        });
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
        }
        i().setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8df900c318d76aa58f2254eddce659bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8df900c318d76aa58f2254eddce659bd");
        } else {
            ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).I.a.a((com.meituan.android.cube.pga.common.b<Boolean>) Boolean.FALSE);
        }
    }

    public final void N() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2827e8a57e7db28f7ee6caa4716b176e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2827e8a57e7db28f7ee6caa4716b176e");
        } else if (i() != null) {
            i().post(new Runnable() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.mach.c.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    int i = 0;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "db5cb8b803c7c222b14ed40b84f99a62", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "db5cb8b803c7c222b14ed40b84f99a62");
                        return;
                    }
                    com.meituan.android.cube.pga.common.b<Integer> bVar = ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) c.this.F()).t;
                    c cVar = c.this;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = c.t;
                    if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "fef4b84902f7b3483bf27134d5dfd62d", RobustBitConfig.DEFAULT_VALUE)) {
                        i = ((Integer) PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "fef4b84902f7b3483bf27134d5dfd62d")).intValue();
                    } else if (cVar.i() != null && cVar.i().getVisibility() != 8) {
                        i = cVar.i().getHeight();
                    }
                    bVar.a((com.meituan.android.cube.pga.common.b<Integer>) Integer.valueOf(i));
                }
            });
        }
    }

    @Override // com.sankuai.waimai.business.restaurant.framework.g, com.meituan.android.cube.core.f
    public final void bE_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2752f4e0f307bd07e6fdd8831a6c0cc9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2752f4e0f307bd07e6fdd8831a6c0cc9");
            return;
        }
        super.bE_();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = t;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ffe2cb5982083329a826ed15a1264a27", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ffe2cb5982083329a826ed15a1264a27");
        } else if (this.u == null || l() == null) {
        } else {
            l().unregisterReceiver(this.u);
        }
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final void y() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "658ad6f4067677f0dd9ed2fce54b8b6c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "658ad6f4067677f0dd9ed2fce54b8b6c");
        } else if (this.y.w) {
            this.y.b();
            this.y.b = true;
        } else {
            this.y.b = false;
        }
    }
}
