package com.sankuai.waimai.business.restaurant.poicontainer.machpro.poitip;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.android.singleton.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.business.restaurant.poicontainer.machpro.base.MPPopupFragment;
import com.sankuai.waimai.foundation.location.v2.WmAddress;
import com.sankuai.waimai.foundation.location.v2.g;
import com.sankuai.waimai.machpro.base.MachMap;
import com.sankuai.waimai.machpro.h;
import com.sankuai.waimai.restaurant.shopcart.popup.c;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class PoiTipPopupFragment extends MPPopupFragment implements h {
    public static ChangeQuickRedirect f;
    boolean g;
    DialogInterface.OnDismissListener h;
    String i;
    private long j;

    @Override // com.sankuai.waimai.business.restaurant.poicontainer.machpro.base.MPPopupFragment
    public final String p() {
        return "poi_tip_popup_view";
    }

    public static PoiTipPopupFragment q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ebfbfbfeace104506f60a10dde808609", RobustBitConfig.DEFAULT_VALUE)) {
            return (PoiTipPopupFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ebfbfbfeace104506f60a10dde808609");
        }
        PoiTipPopupFragment poiTipPopupFragment = new PoiTipPopupFragment();
        Bundle bundle = new Bundle();
        bundle.putString("bundle_name", "mach_pro_waimai_restaurant_rest_pop_view");
        bundle.putString("biz", "waimai");
        poiTipPopupFragment.setArguments(bundle);
        return poiTipPopupFragment;
    }

    @Override // com.sankuai.waimai.business.restaurant.poicontainer.machpro.base.MPPopupFragment, com.sankuai.waimai.business.restaurant.poicontainer.machpro.base.MPBaseDialogFragment, android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef9aefeb0dfabb20255eca08d9a6d740", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef9aefeb0dfabb20255eca08d9a6d740");
            return;
        }
        super.onCreate(bundle);
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = MPPopupFragment.e;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bb6c2e9e553c87bfab06d7a737fbc773", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bb6c2e9e553c87bfab06d7a737fbc773");
            return;
        }
        com.sankuai.waimai.machpro.container.a aVar = this.b;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    @Override // com.sankuai.waimai.business.restaurant.poicontainer.machpro.base.MPPopupFragment, com.sankuai.waimai.business.restaurant.poicontainer.machpro.base.MPBaseDialogFragment, android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "922a65c814d572793d64fa71e65ece7f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "922a65c814d572793d64fa71e65ece7f");
            return;
        }
        super.onStart();
        if (this.h != null) {
            getDialog().setOnDismissListener(this.h);
        }
    }

    @Override // com.sankuai.waimai.business.restaurant.poicontainer.machpro.base.MPBaseDialogFragment, android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ecbb19d12e06a94fa5aa5fb31de36a41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ecbb19d12e06a94fa5aa5fb31de36a41");
            return;
        }
        super.onDestroy();
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = MPPopupFragment.e;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b7600620dd6b7c9c655f6b66fd965bba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b7600620dd6b7c9c655f6b66fd965bba");
            return;
        }
        com.sankuai.waimai.machpro.container.a aVar = this.b;
        if (aVar != null) {
            aVar.b(this);
        }
    }

    @Override // com.sankuai.waimai.business.restaurant.poicontainer.machpro.base.MPPopupFragment
    public final int[] n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d672ea282039c97a4c0c1a5237dc57d8", RobustBitConfig.DEFAULT_VALUE) ? (int[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d672ea282039c97a4c0c1a5237dc57d8") : new int[]{0, 0, 0, 0};
    }

    @Override // com.sankuai.waimai.business.restaurant.poicontainer.machpro.base.MPPopupFragment
    public final c o() {
        return c.BOTTOM_UP;
    }

    @Override // com.sankuai.waimai.business.restaurant.poicontainer.machpro.base.MPBaseDialogFragment
    public final MachMap e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83356624bdd35227ba37cbafba723344", RobustBitConfig.DEFAULT_VALUE)) {
            return (MachMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83356624bdd35227ba37cbafba723344");
        }
        MachMap e = super.e();
        if (e == null) {
            e = new MachMap();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", this.g ? "typeRest" : "typeOutOfRange");
            if (!this.g) {
                WmAddress k = g.a().k();
                jSONObject.put(GearsLocator.ADDRESS, k != null ? k.getAddress() : "");
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.j);
            jSONObject.put("poi_id", sb.toString());
            if (!TextUtils.isEmpty(this.i)) {
                jSONObject.put(FoodDetailNetWorkPreLoader.URI_POI_STR, this.i);
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        e.put("data", jSONObject.toString());
        return e;
    }

    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b68cc7ed40485a45ad9632cb248e07f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b68cc7ed40485a45ad9632cb248e07f");
        } else {
            this.j = j;
        }
    }

    @Override // com.sankuai.waimai.machpro.h
    public final void a(String str, MachMap machMap) {
        Object[] objArr = {str, machMap};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4cc73e5d4529e18c67d753553c07c90d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4cc73e5d4529e18c67d753553c07c90d");
        } else if ("closePopupViewEvent".equalsIgnoreCase(str)) {
            dismiss();
        } else if ("changeLocationEvent".equalsIgnoreCase(str)) {
            com.sankuai.waimai.foundation.router.a.a(getActivity(), com.sankuai.waimai.foundation.router.interfaces.c.D);
            dismiss();
        }
    }

    @Override // com.sankuai.waimai.business.restaurant.poicontainer.machpro.base.MPPopupFragment
    public final int m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69a0d20e89719a90aad482efb4182b87", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69a0d20e89719a90aad482efb4182b87")).intValue() : com.sankuai.waimai.foundation.utils.g.b(b.a) - com.sankuai.waimai.foundation.utils.g.a(getContext(), 100.0f);
    }
}
