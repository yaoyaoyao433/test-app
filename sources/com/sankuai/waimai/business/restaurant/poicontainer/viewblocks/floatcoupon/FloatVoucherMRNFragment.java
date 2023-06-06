package com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.floatcoupon;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.i;
import com.facebook.react.uimanager.ViewManager;
import com.meituan.android.mrn.container.MRNBaseFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.foundation.utils.ae;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class FloatVoucherMRNFragment extends MRNBaseFragment {
    public static ChangeQuickRedirect a;
    public static long b;
    public static String c;
    public static WeakReference<Context> g;

    public static FloatVoucherMRNFragment a(long j, String str, int i) {
        Object[] objArr = {new Long(j), str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0ba0967040b888b82ee6e0cd4691acda", RobustBitConfig.DEFAULT_VALUE)) {
            return (FloatVoucherMRNFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0ba0967040b888b82ee6e0cd4691acda");
        }
        com.sankuai.waimai.foundation.utils.log.a.c("member_log", "[FloatVoucherMRNFragment-newInstance] poiIdStr：" + str, new Object[0]);
        FloatVoucherMRNFragment floatVoucherMRNFragment = new FloatVoucherMRNFragment();
        Bundle bundle = new Bundle();
        bundle.putLong("poi_id", j);
        bundle.putString(FoodDetailNetWorkPreLoader.URI_POI_STR, str);
        bundle.putString("coupon_type", String.valueOf(i));
        floatVoucherMRNFragment.setArguments(bundle);
        return floatVoucherMRNFragment;
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment
    public final Uri m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "234b3993f8882f3531fcb5a0d9875288", RobustBitConfig.DEFAULT_VALUE)) {
            return (Uri) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "234b3993f8882f3531fcb5a0d9875288");
        }
        Uri.Builder builder = new Uri.Builder();
        builder.appendQueryParameter("mrn_biz", "waimai").appendQueryParameter("mrn_entry", "restaurant-discount-coupon").appendQueryParameter("mrn_component", "restaurant-discount-coupon");
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString(FoodDetailNetWorkPreLoader.URI_POI_STR);
            com.sankuai.waimai.foundation.utils.log.a.c("member_log", "[FloatVoucherMRNFragment-getFragmentUri] poiIdStr：" + string, new Object[0]);
            builder.appendQueryParameter("poi_id", String.valueOf(arguments.getLong("poi_id")));
            builder.appendQueryParameter(FoodDetailNetWorkPreLoader.URI_POI_STR, string);
            builder.appendQueryParameter("coupon_type", arguments.getString("coupon_type"));
        }
        return builder.build();
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment, android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "340757a49e6074f1193afbce93c9731c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "340757a49e6074f1193afbce93c9731c");
            return;
        }
        super.onResume();
        Bundle arguments = getArguments();
        if (arguments != null) {
            b = arguments.getLong("poi_id");
            c = arguments.getString(FoodDetailNetWorkPreLoader.URI_POI_STR);
        }
        g = new WeakReference<>(getContext());
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment, com.meituan.android.mrn.container.b
    public final List<i> d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf218a46b79c7d0cddb1435f85b55664", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf218a46b79c7d0cddb1435f85b55664");
        }
        getArguments();
        List<i> d = super.d();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a());
        if (d != null) {
            arrayList.addAll(d);
        }
        return arrayList;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a implements i {
        public static ChangeQuickRedirect a;

        @Override // com.facebook.react.i
        @NonNull
        public final List<NativeModule> createNativeModules(@NonNull ReactApplicationContext reactApplicationContext) {
            Object[] objArr = {reactApplicationContext};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c27021bfd43877e6683d2a66b86ca149", RobustBitConfig.DEFAULT_VALUE)) {
                return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c27021bfd43877e6683d2a66b86ca149");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(new FloatVoucherMoudle());
            return arrayList;
        }

        @Override // com.facebook.react.i
        @NonNull
        public final List<ViewManager> createViewManagers(@NonNull ReactApplicationContext reactApplicationContext) {
            Object[] objArr = {reactApplicationContext};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9538ec4a119bffe360bcf548b8843a5", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9538ec4a119bffe360bcf548b8843a5") : Collections.emptyList();
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    static class FloatVoucherMoudle extends ReactContextBaseJavaModule {
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // com.facebook.react.bridge.NativeModule
        @NonNull
        public String getName() {
            return "WMRNRestaurantDiscountCouponModule";
        }

        public FloatVoucherMoudle() {
        }

        @ReactMethod
        public void refreshPoiList() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e2fc340168f8fa2c95ecee9aa713cbaf", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e2fc340168f8fa2c95ecee9aa713cbaf");
            } else {
                com.sankuai.waimai.platform.domain.manager.poi.a.a().a(FloatVoucherMRNFragment.c);
            }
        }

        @ReactMethod
        public void showToast(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5a295dbba3ef55d381dc7a5888632888", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5a295dbba3ef55d381dc7a5888632888");
            } else if (FloatVoucherMRNFragment.g != null) {
                Context context = FloatVoucherMRNFragment.g.get();
                if (TextUtils.isEmpty(str) || context == null) {
                    return;
                }
                ae.a(context, str);
            }
        }
    }
}
