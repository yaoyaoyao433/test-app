package com.sankuai.waimai.business.restaurant.base.shopcart.calculator;

import android.app.Activity;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.RestaurantSP;
import com.sankuai.waimai.business.restaurant.goodsdetail.GoodDetailActivity;
import com.sankuai.waimai.business.restaurant.rn.bridge.WMShopCartRNFragment;
import com.sankuai.waimai.foundation.core.base.activity.transfer.TransferActivity;
import com.sankuai.waimai.foundation.core.service.abtest.ABStrategy;
import com.sankuai.waimai.foundation.utils.p;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.monitor.model.ErrorCode;
import com.sankuai.waimai.reactnative.WmRNActivity;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class h {
    public static ChangeQuickRedirect a;
    public final String b;
    public final String c;
    boolean d;
    public boolean e;
    public boolean f;

    public h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c365e2d8d044b8000b5c58cb40637d54", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c365e2d8d044b8000b5c58cb40637d54");
            return;
        }
        this.b = "A";
        this.c = ErrorCode.ERROR_TYPE_B;
        this.d = false;
        this.e = false;
        this.f = false;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2652b2aad434bbf99643a214ab30a255", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2652b2aad434bbf99643a214ab30a255");
            return;
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "49207a934ef518d15765a78d56c07ae2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "49207a934ef518d15765a78d56c07ae2");
        } else {
            this.f = RestaurantSP.b();
        }
    }

    public static h a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3c0dfbc10285b22867426427adb5f8be", RobustBitConfig.DEFAULT_VALUE) ? (h) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3c0dfbc10285b22867426427adb5f8be") : a.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        private static final h a = new h();
    }

    public final void a(Activity activity, String str, long j, double d, com.sankuai.waimai.business.restaurant.base.shopcart.b bVar, boolean z) {
        int i;
        com.sankuai.waimai.business.restaurant.base.shopcart.calculator.vo.d dVar;
        JSONObject jSONObject;
        Object[] objArr = {activity, str, new Long(j), Double.valueOf(d), bVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b39215449418857c5d592fac7af844fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b39215449418857c5d592fac7af844fa");
            return;
        }
        String a2 = a(activity);
        if (bVar != null && (dVar = bVar.y) != null) {
            try {
                jSONObject = new JSONObject(dVar.a);
            } catch (JSONException e) {
                com.sankuai.waimai.foundation.utils.log.a.a(e);
            }
            if (jSONObject.has("wmCouponDiscountType")) {
                i = jSONObject.optInt("wmCouponDiscountType", -1);
                HashMap hashMap = new HashMap();
                hashMap.put("poi_id", str);
                hashMap.put("tag_type", Integer.valueOf(i));
                hashMap.put("brand_id", Long.valueOf(j));
                if (bVar != null || bVar.e == null) {
                }
                double d2 = bVar.e.mTotalAndBoxPrice;
                hashMap.put("shopcart_orig_price", Double.valueOf(d2));
                hashMap.put("is_meet_min_price", Integer.valueOf(d <= d2 ? 1 : 0));
                hashMap.put("status", Integer.valueOf(!z ? 1 : 0));
                hashMap.put("tag_id", Integer.valueOf(bVar.u));
                bVar.u = -1;
                JudasManualManager.b("b_waimai_xquyc05a_mv", a2, AppUtil.generatePageInfoKey(activity)).a((Map<String, Object>) hashMap).a();
                return;
            }
        }
        i = -1;
        HashMap hashMap2 = new HashMap();
        hashMap2.put("poi_id", str);
        hashMap2.put("tag_type", Integer.valueOf(i));
        hashMap2.put("brand_id", Long.valueOf(j));
        if (bVar != null) {
        }
    }

    private String a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8110d6db7361c1879dc7aa6a04716563", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8110d6db7361c1879dc7aa6a04716563");
        }
        if (activity instanceof GoodDetailActivity) {
            return "c_u4fk4kw";
        }
        if (!(activity instanceof TransferActivity)) {
            return ((activity instanceof WmRNActivity) && "multi-person".equals(((WmRNActivity) activity).m())) ? "c_rdo54kf" : "c_CijEL";
        }
        List<Fragment> fragments = ((TransferActivity) activity).getSupportFragmentManager().getFragments();
        if (com.sankuai.waimai.foundation.utils.b.b(fragments)) {
            return "c_CijEL";
        }
        Fragment fragment = fragments.get(0);
        if (fragment instanceof WMShopCartRNFragment) {
            String p = ((WMShopCartRNFragment) fragment).p();
            return "restaurant-search".equals(p) ? "c_1b9anm4" : "goodscollection".equals(p) ? "c_5y4tc0m" : "c_CijEL";
        }
        return "c_CijEL";
    }

    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8aca4d02269154ece0fc8a1b9ef96ab1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8aca4d02269154ece0fc8a1b9ef96ab1")).booleanValue();
        }
        if (com.sankuai.waimai.foundation.router.interfaces.d.c(com.meituan.android.singleton.b.a)) {
            return !this.d;
        }
        ABStrategy a2 = com.sankuai.waimai.business.restaurant.base.abtest.a.a();
        return "A".equals(a2 == null ? ErrorCode.ERROR_TYPE_B : a2.expName) && !this.d;
    }

    public final void c() throws com.sankuai.waimai.platform.domain.manager.exceptions.a {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "400c106c3b84e5096d93175e10c5c6a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "400c106c3b84e5096d93175e10c5c6a4");
        } else if (!p.a(com.meituan.android.singleton.b.a)) {
            throw new com.sankuai.waimai.platform.domain.manager.exceptions.a(com.meituan.android.singleton.b.a.getString(R.string.wm_restaurant_bad_net_retry_later_1));
        } else {
            if (b() && this.e) {
                throw new com.sankuai.waimai.platform.domain.manager.exceptions.a("");
            }
        }
    }
}
