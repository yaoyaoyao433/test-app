package com.sankuai.waimai.store.shopping.cart.delegate;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import com.facebook.react.bridge.WritableMap;
import com.meituan.android.bus.annotation.Subscribe;
import com.meituan.android.neohybrid.core.config.KernelConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.store.mrn.d;
import com.sankuai.waimai.store.mrn.shopcartbridge.SGMRNShopCartBridge;
import com.sankuai.waimai.store.mrn.shopcartbridge.event.h;
import com.sankuai.waimai.store.repository.model.GoodDetailResponse;
import com.sankuai.waimai.store.shopcart.SGShopCartRNFragment;
import com.sankuai.waimai.store.shopping.cart.SCPageConfig;
import com.sankuai.waimai.store.util.am;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SCShopCartDelegate extends SCBaseShopCartDelegate {
    public static ChangeQuickRedirect i;
    private final String j;
    private FragmentActivity k;
    private SGShopCartRNFragment l;
    private int m;
    private View n;
    private com.sankuai.waimai.store.shopping.cart.a o;
    private GoodDetailResponse p;

    public static SCShopCartDelegate a(@NonNull FragmentActivity fragmentActivity, com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, int i2, View view, SCPageConfig sCPageConfig, String str, String str2) {
        Object[] objArr = {fragmentActivity, aVar, Integer.valueOf((int) R.id.mrn_shopcart_layout), view, sCPageConfig, str, str2};
        ChangeQuickRedirect changeQuickRedirect = i;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "14bdffe6066d38d07e56990b35c697fc", RobustBitConfig.DEFAULT_VALUE) ? (SCShopCartDelegate) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "14bdffe6066d38d07e56990b35c697fc") : a(fragmentActivity, aVar, R.id.mrn_shopcart_layout, view, sCPageConfig, str, str2, null, null);
    }

    public static SCShopCartDelegate a(@NonNull FragmentActivity fragmentActivity, com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, int i2, View view, SCPageConfig sCPageConfig, String str, String str2, com.sankuai.waimai.store.shopping.cart.a aVar2, GoodDetailResponse goodDetailResponse) {
        Object[] objArr = {fragmentActivity, aVar, Integer.valueOf(i2), view, sCPageConfig, str, str2, null, goodDetailResponse};
        ChangeQuickRedirect changeQuickRedirect = i;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6dc5a8fd7032eb331ecdff46218e2d3b", RobustBitConfig.DEFAULT_VALUE) ? (SCShopCartDelegate) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6dc5a8fd7032eb331ecdff46218e2d3b") : new SCShopCartDelegate(fragmentActivity, aVar, i2, view, sCPageConfig, str, str2, null, goodDetailResponse);
    }

    private SCShopCartDelegate(@NonNull FragmentActivity fragmentActivity, com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, int i2, View view, SCPageConfig sCPageConfig, String str, String str2, com.sankuai.waimai.store.shopping.cart.a aVar2, GoodDetailResponse goodDetailResponse) {
        Object[] objArr = {fragmentActivity, aVar, Integer.valueOf(i2), view, sCPageConfig, str, str2, aVar2, goodDetailResponse};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ca4eba9d420c15c080177a440fe1c77", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ca4eba9d420c15c080177a440fe1c77");
            return;
        }
        this.j = "shopcart";
        this.k = fragmentActivity;
        this.c = aVar;
        this.m = i2;
        this.n = fragmentActivity.findViewById(this.m);
        this.h = view;
        this.g = sCPageConfig;
        this.d = str;
        this.e = str2;
        this.o = aVar2;
        this.p = goodDetailResponse;
    }

    @Override // com.sankuai.waimai.store.shopping.cart.delegate.SCBaseShopCartDelegate, com.sankuai.waimai.store.shopping.cart.delegate.b
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14e98d614b40ff6fd816fde21fac4f15", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14e98d614b40ff6fd816fde21fac4f15");
        } else if (this.l != null) {
            if (j() || k()) {
                FragmentTransaction beginTransaction = this.k.getSupportFragmentManager().beginTransaction();
                beginTransaction.remove(this.l);
                beginTransaction.commitNowAllowingStateLoss();
            }
        }
    }

    @Override // com.sankuai.waimai.store.shopping.cart.delegate.SCBaseShopCartDelegate, com.sankuai.waimai.store.shopping.cart.delegate.b
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "858493e486a865a6a7184c1e628b3415", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "858493e486a865a6a7184c1e628b3415");
            return;
        }
        super.f();
        if (this.f != null) {
            this.f.a();
            com.sankuai.waimai.store.shopping.cart.ui.b bVar = this.f;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.shopping.cart.ui.b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "6d4ba193b3de67209ff7bafc282ad7a0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "6d4ba193b3de67209ff7bafc282ad7a0");
            } else {
                bVar.c.hide();
            }
        }
        this.f = new com.sankuai.waimai.store.shopping.cart.ui.b(this.k, this.h, this.c, this.g, this.e, this.o, this.p);
        this.f.b();
        if (j() || k()) {
            this.f.b(false);
            this.l = SGShopCartRNFragment.s();
            Bundle bundle = new Bundle();
            bundle.putLong("poi_id", this.c.f());
            bundle.putString(FoodDetailNetWorkPreLoader.URI_POI_STR, this.c.h());
            bundle.putLong("spu_id", this.g.c);
            bundle.putInt(KernelConfig.KEY_CONTAINER_TYPE, this.c.v());
            bundle.putString("cid", this.d);
            bundle.putString("volley_tag", this.e);
            this.l.setArguments(bundle);
            if (!this.l.isVisible()) {
                FragmentTransaction beginTransaction = this.k.getSupportFragmentManager().beginTransaction();
                beginTransaction.add(this.m, this.l, "shopcart");
                beginTransaction.show(this.l);
                beginTransaction.commitNowAllowingStateLoss();
            }
            if (this.n != null) {
                this.n.setVisibility(0);
                return;
            }
            return;
        }
        this.f.b(true);
    }

    @Override // com.sankuai.waimai.store.shopping.cart.delegate.b
    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24a6ffc7d4b25a75772b25407d5d2019", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24a6ffc7d4b25a75772b25407d5d2019");
            return;
        }
        if (this.f != null) {
            this.f.b();
        }
        if (j() || k()) {
            WritableMap mrnShopCartData = SGMRNShopCartBridge.getMrnShopCartData(this.c.d());
            if (this.l == null || !this.l.b) {
                return;
            }
            a("mrn_shopcart_update", mrnShopCartData);
        }
    }

    @Override // com.sankuai.waimai.store.shopping.cart.delegate.b
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83c0c6cec8caf33383579dbcf5029063", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83c0c6cec8caf33383579dbcf5029063");
            return;
        }
        if (this.f != null) {
            this.f.a(z);
        }
        if (z) {
            if (j() || k()) {
                a("mrn_show_shopcart_list", d.a());
            }
        }
    }

    @Override // com.sankuai.waimai.store.shopping.cart.delegate.b
    public final void b(boolean z) {
        boolean z2 = true;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef6ff72502d3a11f376d33b90f467cc4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef6ff72502d3a11f376d33b90f467cc4");
            return;
        }
        if (this.f != null) {
            this.f.b((!z || j() || k()) ? false : false);
        }
        if (this.n != null) {
            this.n.setVisibility(((j() || k()) && z) ? 0 : 8);
        }
    }

    @Override // com.sankuai.waimai.store.shopping.cart.delegate.a
    public final int g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce5d5beeee28867ebce623152a631d77", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce5d5beeee28867ebce623152a631d77")).intValue();
        }
        if (this.l != null) {
            return this.l.t();
        }
        return 0;
    }

    @Override // com.sankuai.waimai.store.shopping.cart.delegate.a
    public final Activity i() {
        return this.k;
    }

    private void a(String str, WritableMap writableMap) {
        Object[] objArr = {str, writableMap};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37ca126642ff977b172a444209f838eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37ca126642ff977b172a444209f838eb");
        } else if (this.l != null) {
            this.l.a(str, writableMap);
        }
    }

    @Subscribe
    public void onMRNShowShopCarPopEvent(h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b482f8b12d34870d07c1c8ba14df3d80", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b482f8b12d34870d07c1c8ba14df3d80");
            return;
        }
        am.a((Activity) this.k, "请在购物车内修改数量");
        a(true);
    }
}
