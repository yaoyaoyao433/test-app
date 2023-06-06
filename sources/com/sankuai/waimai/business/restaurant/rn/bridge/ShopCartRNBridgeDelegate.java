package com.sankuai.waimai.business.restaurant.rn.bridge;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.view.ViewGroup;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.sankuai.waimai.business.restaurant.base.manager.order.g;
import com.sankuai.waimai.business.restaurant.base.manager.order.k;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.foundation.core.base.activity.transfer.BaseActivityDelegate;
import com.sankuai.waimai.foundation.core.base.activity.transfer.TransferActivity;
import com.sankuai.waimai.foundation.core.service.user.a;
import com.sankuai.waimai.foundation.core.service.user.b;
import com.sankuai.waimai.foundation.location.v2.WmAddress;
import com.sankuai.waimai.platform.domain.core.poi.Poi;
import com.sankuai.waimai.platform.domain.manager.observers.OrderGoodObserver;
import com.sankuai.waimai.platform.utils.f;
import com.sankuai.waimai.restaurant.shopcart.ui.ab;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class ShopCartRNBridgeDelegate extends BaseActivityDelegate implements c, com.sankuai.waimai.foundation.core.service.user.b, com.sankuai.waimai.foundation.location.v2.listener.c, OrderGoodObserver {
    public static ChangeQuickRedirect a;
    public ab b;
    public g c;
    public com.sankuai.waimai.restaurant.shopcart.config.a d;
    private boolean e;
    private ShopCartCommonRNFragment f;
    private g i;
    private Poi j;
    private int k;
    private boolean l;

    public ShopCartRNBridgeDelegate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db6d1d25a7555c46d6267b09dffea20e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db6d1d25a7555c46d6267b09dffea20e");
            return;
        }
        this.e = true;
        this.k = -1;
        this.l = false;
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.transfer.BaseActivityDelegate, com.sankuai.waimai.foundation.core.base.activity.transfer.lifecycle.a
    public final void a(TransferActivity transferActivity, @Nullable Bundle bundle) {
        Bundle extras;
        Object[] objArr = {transferActivity, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e91524f4ec5289ca4ea28c5a9977e33", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e91524f4ec5289ca4ea28c5a9977e33");
            return;
        }
        super.a(transferActivity, bundle);
        transferActivity.setContentView(R.layout.wm_restaurant_shopcart_bridge);
        Intent intent = this.h.getIntent();
        Object[] objArr2 = {intent};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cb2c206da1632f9f11c913562899616d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cb2c206da1632f9f11c913562899616d");
        } else if (intent != null && (extras = intent.getExtras()) != null) {
            this.k = extras.getInt("jump_from");
        }
        this.f = WMShopCartRNFragment.a(intent);
        if (this.f == null) {
            transferActivity.finish();
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "79fec69f5a8889a5d37c771e5183b691", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "79fec69f5a8889a5d37c771e5183b691");
        } else {
            Uri data = this.h.getIntent().getData();
            if (data != null && this.f != null) {
                Set<String> queryParameterNames = data.getQueryParameterNames();
                if (!com.sankuai.waimai.foundation.utils.b.b(queryParameterNames)) {
                    HashMap hashMap = new HashMap();
                    for (String str : queryParameterNames) {
                        hashMap.put(str, data.getQueryParameter(str));
                    }
                    this.f.c = hashMap;
                }
            }
        }
        try {
            this.i = (g) f.b(transferActivity.getIntent(), "arg_poi", (Serializable) null);
            if (this.i != null) {
                this.j = this.i.g;
            }
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
        }
        if (this.c == null) {
            if (this.i != null) {
                this.c = this.i;
            } else {
                this.c = new g();
            }
            this.c.m = com.sankuai.waimai.restaurant.shopcart.utils.c.a(intent);
        }
        if (this.b == null) {
            this.d = com.sankuai.waimai.restaurant.shopcart.config.a.a(f() ? 4 : 3, 55);
            this.b = new ab(transferActivity, this.c, this.d, "ProductSetOperationActivity");
        }
        this.b.b((ViewGroup) this.h.findViewById(R.id.layout_shop_cart));
        this.b.k.setVisibility(4);
        this.h.getSupportFragmentManager().beginTransaction().replace(R.id.fl_mrn_container, this.f).commitAllowingStateLoss();
        k.a().a(this);
        com.sankuai.waimai.platform.domain.manager.user.a.i().a(this);
        com.sankuai.waimai.foundation.location.v2.g.a().a(this, "Restaurant-LocateService");
    }

    @Override // com.sankuai.waimai.business.restaurant.rn.bridge.c
    public final boolean f() {
        return this.k == 1;
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.transfer.BaseActivityDelegate, com.sankuai.waimai.foundation.core.base.activity.transfer.lifecycle.a
    public final void a(TransferActivity transferActivity) {
        Object[] objArr = {transferActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e6dd68e2c3cd4ae6ba184382be22b03", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e6dd68e2c3cd4ae6ba184382be22b03");
            return;
        }
        super.a(transferActivity);
        this.e = true;
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.transfer.BaseActivityDelegate, com.sankuai.waimai.foundation.core.base.activity.transfer.lifecycle.a
    public final void b(TransferActivity transferActivity) {
        Object[] objArr = {transferActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "797611937a2fe36dc15ff563de72c33d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "797611937a2fe36dc15ff563de72c33d");
            return;
        }
        super.b(transferActivity);
        this.e = false;
    }

    @Override // com.sankuai.waimai.business.restaurant.rn.bridge.c
    public final g i() {
        return this.i;
    }

    @Override // com.sankuai.waimai.business.restaurant.rn.bridge.c
    public final Poi h() {
        return this.j;
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.transfer.BaseActivityDelegate, com.sankuai.waimai.foundation.core.base.activity.transfer.lifecycle.a
    public final void c(TransferActivity transferActivity) {
        Object[] objArr = {transferActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3a24c367033b3b3966cea123e36cfdb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3a24c367033b3b3966cea123e36cfdb");
            return;
        }
        super.c(transferActivity);
        k.a().b(this);
        com.sankuai.waimai.platform.domain.manager.user.a.i().b(this);
        com.sankuai.waimai.foundation.location.v2.g.a().b(this, "Restaurant-LocateService");
        if (this.b != null) {
            this.b.d();
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.transfer.BaseActivityDelegate, com.sankuai.waimai.foundation.core.base.activity.transfer.lifecycle.a
    public final void d(TransferActivity transferActivity) {
        Object[] objArr = {transferActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c286ad6de6f6a6e41f78338360efc35", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c286ad6de6f6a6e41f78338360efc35");
            return;
        }
        super.d(transferActivity);
        if (this.b != null) {
            this.b.c();
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.transfer.BaseActivityDelegate, com.sankuai.waimai.foundation.core.base.activity.transfer.lifecycle.a
    public final void e() {
        boolean z;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c3335ac66ecef61d03bc63c62c79a3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c3335ac66ecef61d03bc63c62c79a3c");
        } else if (g()) {
            TransferActivity transferActivity = this.h;
            Object[] objArr2 = {transferActivity};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "036f7159459ae803dc4d69edf0b7b5d0", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "036f7159459ae803dc4d69edf0b7b5d0")).booleanValue();
            } else {
                transferActivity.getSystemService(PushConstants.INTENT_ACTIVITY_NAME);
                String packageName = transferActivity.getPackageName();
                List<ActivityManager.RunningAppProcessInfo> a2 = Privacy.createActivityManager(transferActivity, "com.sankuai.waimai:restaurant-mt").a();
                if (a2 != null) {
                    for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : a2) {
                        if (runningAppProcessInfo.processName.equals(packageName) && runningAppProcessInfo.importance == 100) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
            }
            if (z) {
                Bundle bundle = new Bundle();
                bundle.putLong("poiId", com.sankuai.waimai.platform.domain.core.poi.b.a(this.c.f()));
                bundle.putString(FoodDetailNetWorkPreLoader.URI_POI_STR, this.c.f());
                bundle.putString("poiName", this.c.h());
                com.sankuai.waimai.foundation.router.a.a(this.h, com.sankuai.waimai.foundation.router.interfaces.c.b, bundle);
                this.h.overridePendingTransition(0, 0);
            }
        }
    }

    @Override // com.sankuai.waimai.foundation.core.service.user.b
    public void onChanged(b.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ba99ba23d80380b1e6edfded79a45ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ba99ba23d80380b1e6edfded79a45ba");
            return;
        }
        if (aVar == b.a.LOGIN && this.c != null && this.e) {
            this.b.q();
        }
        if (this.c != null) {
            k.a().n(this.c.f()).b();
        }
    }

    @Override // com.sankuai.waimai.foundation.core.service.user.b
    public void onAccountInfoUpdate(b.EnumC0948b enumC0948b) {
        Object[] objArr = {enumC0948b};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "520699628f2f5231e131dc093f889646", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "520699628f2f5231e131dc093f889646");
            return;
        }
        if (enumC0948b == b.EnumC0948b.PHONE && com.sankuai.waimai.foundation.core.service.user.a.a == a.EnumC0947a.FROM_PRODUCT_LIST_PREORDER && this.b != null && this.e) {
            this.b.p();
        }
        if (this.c != null) {
            k.a().n(this.c.f()).b();
        }
    }

    @Override // com.sankuai.waimai.platform.domain.manager.observers.OrderGoodObserver
    public final void aF_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f280ca8e2871a772d41a697526a1fdf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f280ca8e2871a772d41a697526a1fdf");
            return;
        }
        WritableMap createMap = Arguments.createMap();
        if (l() != null) {
            a.a(l(), "RefreshGoodsList", createMap);
        }
    }

    private ReactContext l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "378163cbc52fb37a66b778d19dd7d752", RobustBitConfig.DEFAULT_VALUE)) {
            return (ReactContext) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "378163cbc52fb37a66b778d19dd7d752");
        }
        if (this.f == null || this.f.l() == null) {
            return null;
        }
        return this.f.l().getCurrentReactContext();
    }

    @Override // com.sankuai.waimai.foundation.location.v2.listener.c
    public void onPoiChange(@Nullable WmAddress wmAddress, boolean z) {
        Object[] objArr = {wmAddress, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97affff33c7e72439624e14c654244a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97affff33c7e72439624e14c654244a4");
        } else {
            j();
        }
    }

    @Override // com.sankuai.waimai.business.restaurant.rn.bridge.c
    public final ab d() {
        return this.b;
    }

    @Override // com.sankuai.waimai.business.restaurant.rn.bridge.c
    public final g b() {
        return this.c;
    }

    @Override // com.sankuai.waimai.business.restaurant.rn.bridge.c
    public final void a(boolean z) {
        this.l = z;
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.transfer.BaseActivityDelegate
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9db4b85b225145ec6ec8fcce73c7b54f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9db4b85b225145ec6ec8fcce73c7b54f");
        } else if (this.l) {
            if (this.b == null || !this.b.s()) {
                if (this.f == null || !this.f.k()) {
                    super.a();
                }
            }
        } else {
            super.a();
        }
    }

    @Override // com.sankuai.waimai.business.restaurant.rn.bridge.c
    public final boolean g() {
        Bundle extras;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "159b73f3cfa86ae314755e93fa03e42e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "159b73f3cfa86ae314755e93fa03e42e")).booleanValue() : this.h.getIntent() != null && (extras = this.h.getIntent().getExtras()) != null && extras.containsKey("goods.set.jump.from") && "from.poi.list.filter.special.poi.card".equals(extras.getString("goods.set.jump.from"));
    }

    @Override // com.sankuai.waimai.business.restaurant.rn.bridge.c
    public final /* bridge */ /* synthetic */ Activity bB_() {
        return this.h;
    }
}
