package com.sankuai.waimai.store.shopcart;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.react.MRNRootView;
import com.facebook.react.bridge.WritableMap;
import com.meituan.android.neohybrid.core.config.KernelConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.store.base.SGCommonRNFragment;
import com.sankuai.waimai.store.mrn.shopcartbridge.SGMRNShopCartBridge;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGShopCartRNFragment extends SGCommonRNFragment implements com.sankuai.waimai.store.observers.a {
    public static ChangeQuickRedirect a;
    public boolean b;

    public SGShopCartRNFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "918b48655b71918773999460fa89286b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "918b48655b71918773999460fa89286b");
        } else {
            this.b = false;
        }
    }

    public static SGShopCartRNFragment s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bb430da24e9ae462660e7afa61d3ae04", RobustBitConfig.DEFAULT_VALUE) ? (SGShopCartRNFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bb430da24e9ae462660e7afa61d3ae04") : new SGShopCartRNFragment();
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment
    public final MRNRootView b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45f106357242721a701d5d21e0dfae44", RobustBitConfig.DEFAULT_VALUE) ? (MRNRootView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45f106357242721a701d5d21e0dfae44") : new a(context);
    }

    @Override // com.sankuai.waimai.store.base.SGCommonRNFragment, com.meituan.android.mrn.container.MRNBaseFragment
    public final Uri m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d33d490b2a35b2ba46310abf444ece93", RobustBitConfig.DEFAULT_VALUE)) {
            return (Uri) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d33d490b2a35b2ba46310abf444ece93");
        }
        Bundle arguments = getArguments();
        Uri.Builder builder = new Uri.Builder();
        builder.appendQueryParameter("mrn_biz", "supermarket").appendQueryParameter("mrn_entry", "flashbuy-shopcart-page").appendQueryParameter("mrn_component", "flashbuy-shopcart-page");
        if (arguments != null) {
            long j = arguments.getLong("poi_id", 0L);
            String string = arguments.getString(FoodDetailNetWorkPreLoader.URI_POI_STR);
            long j2 = arguments.getLong("spu_id", 0L);
            int i = arguments.getInt(KernelConfig.KEY_CONTAINER_TYPE, 0);
            String string2 = arguments.getString("cid", "");
            String string3 = arguments.getString("volley_tag", "");
            builder.appendQueryParameter("poi_id", String.valueOf(j));
            builder.appendQueryParameter(FoodDetailNetWorkPreLoader.URI_POI_STR, string);
            builder.appendQueryParameter("spu_id", String.valueOf(j2));
            builder.appendQueryParameter(KernelConfig.KEY_CONTAINER_TYPE, String.valueOf(i));
            builder.appendQueryParameter("cid", string2);
            builder.appendQueryParameter("volley_tag", string3);
            String string4 = arguments.getString("mrn_min_version", "");
            if (!t.a(string4)) {
                builder.appendQueryParameter("mrn_min_version", string4);
            }
        }
        return builder.build();
    }

    @Override // com.sankuai.waimai.store.base.SGCommonRNFragment, com.meituan.android.mrn.container.MRNBaseFragment
    public final View a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd87e7e13d5662d089bed65bf6086200", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd87e7e13d5662d089bed65bf6086200");
        }
        View view = new View(context);
        view.setBackgroundColor(com.sankuai.waimai.store.util.b.b(context, R.color.wm_st_common_transparent));
        return view;
    }

    @Override // com.sankuai.waimai.store.base.SGCommonRNFragment, com.meituan.android.mrn.container.MRNBaseFragment
    public final View c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1e8ba52bcaff7524f31c855d4f06db9", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1e8ba52bcaff7524f31c855d4f06db9");
        }
        View view = new View(context);
        view.setBackgroundColor(com.sankuai.waimai.store.util.b.b(context, R.color.wm_st_common_transparent));
        return view;
    }

    public final void a(@NonNull String str, WritableMap writableMap) {
        Object[] objArr = {str, writableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "984a43341b742b12eab2b9449966bbf8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "984a43341b742b12eab2b9449966bbf8");
        } else if (n() == null || l() == null || l().getCurrentReactContext() == null) {
        } else {
            if (writableMap != null) {
                writableMap.putInt("rootTag", t());
            }
            com.sankuai.waimai.store.mrn.shopcartbridge.a.a(l().getCurrentReactContext(), str, writableMap);
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64025d57dff8f9e0be8574d7d3025cc5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64025d57dff8f9e0be8574d7d3025cc5");
            return;
        }
        super.onDestroy();
        com.sankuai.waimai.store.order.a.e().b(this);
    }

    public final int t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc8e5bd6c143b295a80909adbd085a7c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc8e5bd6c143b295a80909adbd085a7c")).intValue();
        }
        if (b() != null) {
            return b().getRootViewTag();
        }
        return 0;
    }

    @Override // com.sankuai.waimai.store.observers.a
    public final void ba_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c74574443edb945d298852c966f32f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c74574443edb945d298852c966f32f9");
            return;
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            String a2 = com.sankuai.waimai.store.platform.domain.manager.poi.a.a(arguments.getString(FoodDetailNetWorkPreLoader.URI_POI_STR), arguments.getLong("poi_id", 0L));
            Object[] objArr2 = {a2};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "87283e86594b32249f8d2cf6616fe9bd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "87283e86594b32249f8d2cf6616fe9bd");
            } else if (this.b) {
                a("mrn_shopcart_update", SGMRNShopCartBridge.getMrnShopCartData(a2));
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a extends MRNRootView {
        public static ChangeQuickRedirect a;

        public a(Context context) {
            super(context);
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b60d6b0e3f763e1476d2d386540cb839", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b60d6b0e3f763e1476d2d386540cb839");
            }
        }

        @Override // com.facebook.react.ReactRootView, android.view.View
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            Object[] objArr = {motionEvent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6213538a22031a1f44157cc5607de7b8", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6213538a22031a1f44157cc5607de7b8")).booleanValue();
            }
            super.onTouchEvent(motionEvent);
            return false;
        }
    }

    @Override // com.sankuai.waimai.store.base.SGCommonRNFragment, android.support.v4.app.Fragment
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be3e3431aa0b53a51f679c8a8d1e5428", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be3e3431aa0b53a51f679c8a8d1e5428");
            return;
        }
        this.b = true;
        super.onStart();
    }

    @Override // com.sankuai.waimai.store.base.SGCommonRNFragment, com.meituan.android.mrn.container.MRNBaseFragment, android.support.v4.app.Fragment
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53ef0084220efa09b7d272248e6e3924", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53ef0084220efa09b7d272248e6e3924");
            return;
        }
        this.b = false;
        super.onStop();
    }
}
