package com.sankuai.waimai.store.drug.coupons;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.store.base.BaseCustomLinearLayout;
import com.sankuai.waimai.store.base.SGCommonRNFragment;
import com.sankuai.waimai.store.platform.domain.core.poi.ActivityItem;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.platform.shop.model.CouponPoiCardInfo;
import com.sankuai.waimai.store.util.i;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class MRNCouponsDialogFragment extends CouponsBaseDialogFragment {
    public static ChangeQuickRedirect a;
    private com.sankuai.waimai.store.platform.domain.manager.poi.a b;
    private Poi.PoiCouponEntity d;
    private List<ActivityItem> e;
    private int f;

    @Override // com.sankuai.waimai.store.drug.coupons.a
    public final com.sankuai.waimai.store.platform.domain.manager.poi.a a() {
        return this.b;
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71b7b52ae2ab60dccae2a6f8f18e6301", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71b7b52ae2ab60dccae2a6f8f18e6301");
        } else {
            super.onActivityCreated(bundle);
        }
    }

    @Override // android.support.v4.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View decorView;
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f18552a93feba2923b7e63f02d7ff25a", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f18552a93feba2923b7e63f02d7ff25a");
        }
        Context context = getContext();
        if (context == null) {
            return super.onCreateView(layoutInflater, viewGroup, bundle);
        }
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dc4f36fd2a8ab0137ba1fa1930d97aab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dc4f36fd2a8ab0137ba1fa1930d97aab");
        } else {
            Window window = getDialog().getWindow();
            if (window != null && (decorView = window.getDecorView()) != null) {
                WindowManager.LayoutParams attributes = window.getAttributes();
                if (attributes != null) {
                    attributes.gravity = 80;
                    attributes.width = h.a(context);
                    attributes.height = -2;
                    window.setAttributes(attributes);
                }
                decorView.setPadding(0, 0, 0, 0);
                decorView.setBackgroundResource(R.color.transparent);
            }
        }
        BaseCustomLinearLayout baseCustomLinearLayout = (BaseCustomLinearLayout) layoutInflater.inflate(R.layout.wm_drug_new_common_mrn_coupons_view, viewGroup, false);
        baseCustomLinearLayout.setMinimumHeight((int) (h.b(context) * 0.8d));
        baseCustomLinearLayout.setMaximumHeight((int) (h.b(context) * 0.8d));
        baseCustomLinearLayout.setBackground(getResources().getDrawable(R.drawable.wm_drug_bg_poi_conpon));
        return baseCustomLinearLayout;
    }

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        Fragment fragment;
        boolean z = false;
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02a4838d0eb6b6fd8e94c5b68b3d1eec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02a4838d0eb6b6fd8e94c5b68b3d1eec");
            return;
        }
        super.onViewCreated(view, bundle);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2caf7042e4b1c7b364d95f9d3fe3a1c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2caf7042e4b1c7b364d95f9d3fe3a1c0");
            return;
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4300a4e10acd126dd666419d02edb1e6", RobustBitConfig.DEFAULT_VALUE)) {
            fragment = (Fragment) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4300a4e10acd126dd666419d02edb1e6");
        } else {
            SGCommonRNFragment b = SGCommonRNFragment.b("supermarket", "flashbuy-drug-info", "flashbuy-drug-discount");
            HashMap hashMap = new HashMap();
            hashMap.put("cid", com.sankuai.waimai.store.manager.judas.b.a(getContext()));
            if (this.b.b != null) {
                hashMap.put("wm_poi_id", String.valueOf(this.b.g()));
                hashMap.put(FoodDetailNetWorkPreLoader.URI_POI_STR, this.b.h());
                hashMap.put("stid", this.b.b.abExpInfo);
            }
            hashMap.put("selected_tab_type", String.valueOf(this.f));
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "c9b1fa1e8889fb719e0fadbddc0dfd02", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "c9b1fa1e8889fb719e0fadbddc0dfd02")).booleanValue();
            } else if (getActivity() != null && !t.a(getActivity().getClass().getName())) {
                z = getActivity().getClass().getName().contains("DrugGoodDetailActivity");
            }
            hashMap.put("page_source", z ? "1" : "0");
            hashMap.put("page_height", Double.toString(h.b(getContext()) * 0.7d));
            hashMap.put("extra_data_map", "");
            b.j = hashMap;
            fragment = b;
        }
        if (getChildFragmentManager() != null) {
            FragmentTransaction beginTransaction = getChildFragmentManager().beginTransaction();
            beginTransaction.replace(R.id.fl_mrn_container, fragment);
            beginTransaction.commit();
        }
    }

    @Override // android.support.v4.app.DialogFragment
    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba4562393f58724df6bed76edc370ac5", RobustBitConfig.DEFAULT_VALUE)) {
            return (Dialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba4562393f58724df6bed76edc370ac5");
        }
        setStyle(1, 0);
        return super.onCreateDialog(bundle);
    }

    @Override // com.sankuai.waimai.store.drug.coupons.a
    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28206a1ca920c475371e342c3e10d893", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28206a1ca920c475371e342c3e10d893");
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f40febb6152eb8f9287cf3888a6ca571", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f40febb6152eb8f9287cf3888a6ca571");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("poi_info", this.b.b);
        hashMap.put("activity_infos", this.e);
        hashMap.put("poi_discount_info", this.d);
        return i.a(hashMap);
    }

    @Override // com.sankuai.waimai.store.drug.coupons.a
    public final void a(Poi.PoiCouponEntity poiCouponEntity, long j, com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, List<ActivityItem> list, int i, boolean z, CouponPoiCardInfo couponPoiCardInfo, Poi.FriendAssistance friendAssistance, int i2, Poi.PoiCouponItem poiCouponItem) {
        Object[] objArr = {poiCouponEntity, new Long(j), aVar, list, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), couponPoiCardInfo, friendAssistance, Integer.valueOf(i2), null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20d6b73169b12d02cdf204350a1202ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20d6b73169b12d02cdf204350a1202ed");
            return;
        }
        this.d = poiCouponEntity;
        this.e = list;
        this.b = aVar;
        this.f = i;
    }
}
