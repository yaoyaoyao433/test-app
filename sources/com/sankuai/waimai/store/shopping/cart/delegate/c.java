package com.sankuai.waimai.store.shopping.cart.delegate;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.meituan.mmp.lib.engine.LaunchMode;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.mrn.d;
import com.sankuai.waimai.store.mrn.shopcartbridge.SGMRNShopCartBridge;
import com.sankuai.waimai.store.shopcart.SGShopCartRNFragment;
import com.sankuai.waimai.store.shopping.cart.SCPageConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends SCBaseShopCartDelegate {
    public static ChangeQuickRedirect i;
    private static SparseArray<SGShopCartRNFragment> o = new SparseArray<>();
    public int j;
    public SGShopCartRNFragment k;
    private Activity l;
    private ReactContext m;
    private ViewGroup n;
    private boolean p;

    @Override // com.sankuai.waimai.store.shopping.cart.delegate.SCBaseShopCartDelegate, com.sankuai.waimai.store.shopping.cart.delegate.b
    public final void e() {
    }

    private c(@NonNull Activity activity, @NonNull ReactContext reactContext, int i2, com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, View view, ViewGroup viewGroup, SCPageConfig sCPageConfig, String str, String str2) {
        Object[] objArr = {activity, reactContext, Integer.valueOf(i2), aVar, view, viewGroup, sCPageConfig, str, str2};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5df356f2fb6730a29c692da1d741cfb3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5df356f2fb6730a29c692da1d741cfb3");
            return;
        }
        this.p = false;
        this.l = activity;
        this.m = reactContext;
        this.j = i2;
        this.c = aVar;
        this.h = view;
        this.n = viewGroup;
        this.g = sCPageConfig;
        this.d = str;
        this.e = str2;
    }

    public static c a(@NonNull Activity activity, @NonNull ReactContext reactContext, int i2, com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, View view, ViewGroup viewGroup, SCPageConfig sCPageConfig, String str, String str2) {
        Object[] objArr = {activity, reactContext, Integer.valueOf(i2), aVar, view, viewGroup, sCPageConfig, str, str2};
        ChangeQuickRedirect changeQuickRedirect = i;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e507907915598b9c2fc2f337e4cfbee9", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e507907915598b9c2fc2f337e4cfbee9") : new c(activity, reactContext, i2, aVar, view, viewGroup, sCPageConfig, str, str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x01f2, code lost:
        if (r18.k.getView().getParent() == null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 543
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.shopping.cart.delegate.c.a(java.lang.String, java.lang.String):void");
    }

    @Override // com.sankuai.waimai.store.shopping.cart.delegate.SCBaseShopCartDelegate, com.sankuai.waimai.store.shopping.cart.delegate.b
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef88efbcea314c028b1f52710f3cf5eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef88efbcea314c028b1f52710f3cf5eb");
        } else {
            a("", "");
        }
    }

    @Override // com.sankuai.waimai.store.shopping.cart.delegate.SCBaseShopCartDelegate, com.sankuai.waimai.store.shopping.cart.delegate.b
    public final void a() {
        ViewParent parent;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f766aa0ee5786c2e9d544997cc8badf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f766aa0ee5786c2e9d544997cc8badf");
            return;
        }
        super.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = i;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a81fda9ae45b6b37515a74d5831c2af2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a81fda9ae45b6b37515a74d5831c2af2");
        } else if (l() && (parent = this.k.getView().getParent()) != null && (parent instanceof ViewGroup)) {
            if (this.p) {
                this.k.getView().setVisibility(4);
            } else {
                ((ViewGroup) parent).removeView(this.k.getView());
            }
        }
    }

    public static void a(@NonNull Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a6109b7fd5aac3da7917d103b77d00e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a6109b7fd5aac3da7917d103b77d00e9");
        } else {
            o.remove(activity.hashCode());
        }
    }

    private boolean l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97cddf8619ed7d7872534457c2d567d5", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97cddf8619ed7d7872534457c2d567d5")).booleanValue() : (this.k == null || this.k.getView() == null) ? false : true;
    }

    private void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa0428fe6c8f4ff2ad66f61e49b590d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa0428fe6c8f4ff2ad66f61e49b590d4");
        } else if (t.a(str)) {
        } else {
            try {
                JSONObject optJSONObject = new JSONObject(str).optJSONObject("forNative");
                if (optJSONObject != null) {
                    this.p = optJSONObject.optBoolean(LaunchMode.LAUNCH_MODE_REUSE, false);
                }
            } catch (Exception e) {
                com.dianping.judas.util.a.a(e);
            }
        }
    }

    @Override // com.sankuai.waimai.store.shopping.cart.delegate.b
    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f43687865c42b1fa0cffbf2d08469b6f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f43687865c42b1fa0cffbf2d08469b6f");
            return;
        }
        if (this.f != null) {
            this.f.b();
        }
        if (j()) {
            WritableMap mrnShopCartData = SGMRNShopCartBridge.getMrnShopCartData(this.c.d());
            Object[] objArr2 = {"mrn_shopcart_update", mrnShopCartData};
            ChangeQuickRedirect changeQuickRedirect2 = i;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "94972594c05261839a3a86cfda281285", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "94972594c05261839a3a86cfda281285");
            } else if (this.m != null) {
                if (mrnShopCartData != null) {
                    mrnShopCartData.putInt("rootTag", g());
                }
                com.sankuai.waimai.store.mrn.shopcartbridge.a.a(this.m, "mrn_shopcart_update", mrnShopCartData);
            }
        } else if (!k() || this.k == null) {
        } else {
            WritableMap mrnShopCartData2 = SGMRNShopCartBridge.getMrnShopCartData(this.c.d());
            if (this.k == null || !this.k.b) {
                return;
            }
            this.k.a("mrn_shopcart_update", mrnShopCartData2);
        }
    }

    @Override // com.sankuai.waimai.store.shopping.cart.delegate.b
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6bd84f2a0fedca8a1bcd8fd88e63dd7a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6bd84f2a0fedca8a1bcd8fd88e63dd7a");
            return;
        }
        if (this.f != null) {
            this.f.a(z);
        }
        if (!k() || this.k == null) {
            return;
        }
        this.k.a("mrn_show_shopcart_list", d.a());
    }

    @Override // com.sankuai.waimai.store.shopping.cart.delegate.b
    public final void b(boolean z) {
        boolean z2 = true;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e6d90a9e2c6570d901106bb66c82aeb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e6d90a9e2c6570d901106bb66c82aeb");
        } else if (this.f != null) {
            this.f.b((!z || j() || k()) ? false : false);
        }
    }

    @Override // com.sankuai.waimai.store.shopping.cart.delegate.a
    public final int g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "449c0c7c6de7e81f58b8c36477f53d67", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "449c0c7c6de7e81f58b8c36477f53d67")).intValue();
        }
        if (this.k != null) {
            return this.k.t();
        }
        return this.j;
    }

    @Override // com.sankuai.waimai.store.shopping.cart.delegate.a
    public final Activity i() {
        return this.l;
    }
}
