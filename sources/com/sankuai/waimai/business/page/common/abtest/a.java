package com.sankuai.waimai.business.page.common.abtest;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.service.abtest.ABStrategy;
import com.sankuai.waimai.monitor.model.ErrorCode;
import com.sankuai.waimai.platform.capacity.abtest.ABTestManager;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.sankuai.waimai.platform.capacity.abtest.a {
    public static ChangeQuickRedirect a = null;
    public static boolean b = false;

    public static String a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fd999c5f2a9ab610dbaecffdf4386fe2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fd999c5f2a9ab610dbaecffdf4386fe2");
        }
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        ABStrategy[] aBStrategyArr = {PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "d09be745f44916b79c69412fb49b5f28", RobustBitConfig.DEFAULT_VALUE) ? (ABStrategy) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "d09be745f44916b79c69412fb49b5f28") : ABTestManager.getInstance(context).getStrategy("poi_list_style_test", new ABStrategy("FRONT", "AB", "poi_list_style_test", ErrorCode.ERROR_TYPE_B, "X"))};
        Object[] objArr3 = {aBStrategyArr};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.platform.capacity.abtest.a.d;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "5f4a0c07913f797f91356907a1837cd8", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "5f4a0c07913f797f91356907a1837cd8");
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= 0; i++) {
            ABStrategy aBStrategy = aBStrategyArr[0];
            if (aBStrategy != null && !TextUtils.isEmpty(aBStrategy.getStid())) {
                sb.append(aBStrategy.getStid());
                sb.append(";");
            }
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    public static String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0f661dce2da8304222c43973ac2f4934", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0f661dce2da8304222c43973ac2f4934");
        }
        ABStrategy a2 = a("wm_location_failed", null);
        return (a2 == null || TextUtils.isEmpty(a2.expName)) ? "" : a2.expName;
    }

    public static String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "da31bdaef944275daecf629fa75cade5", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "da31bdaef944275daecf629fa75cade5");
        }
        ABStrategy a2 = a("wm_home_alert_address_recommend", null);
        return (a2 == null || TextUtils.isEmpty(a2.expName)) ? "" : a2.expName;
    }

    public static String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6440a8250e4ed85622a0ae7f6d0bb9ce", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6440a8250e4ed85622a0ae7f6d0bb9ce");
        }
        ABStrategy a2 = a("wm_homepage_mach_preload_download", null);
        return (a2 == null || TextUtils.isEmpty(a2.expName)) ? "" : a2.expName;
    }

    public static ABStrategy d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "65f6af065be45d654d545cb9835c61fc", RobustBitConfig.DEFAULT_VALUE) ? (ABStrategy) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "65f6af065be45d654d545cb9835c61fc") : a("mix_homepage_slip", null);
    }

    public static ABStrategy e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cc262b31790901ae3b872bcb02bf2769", RobustBitConfig.DEFAULT_VALUE) ? (ABStrategy) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cc262b31790901ae3b872bcb02bf2769") : a("poilist_dynamicPaging_exp", null);
    }

    public static ABStrategy f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6fcb44cba23d1d57b56d1e42947b46b5", RobustBitConfig.DEFAULT_VALUE) ? (ABStrategy) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6fcb44cba23d1d57b56d1e42947b46b5") : a("wm_weather_show_style_group1", null);
    }

    public static ABStrategy g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "970cc0fac7fe2f5f598cd30ab9979b43", RobustBitConfig.DEFAULT_VALUE) ? (ABStrategy) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "970cc0fac7fe2f5f598cd30ab9979b43") : a("wm_api_cache_strategy", null);
    }

    public static String h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "003857b45de77105da1f43fcfee11f87", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "003857b45de77105da1f43fcfee11f87");
        }
        ABStrategy a2 = a("wm_home_second_opening_rate_android", null);
        return a2 != null ? a2.expName : "";
    }

    public static boolean i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8ec02e8efdd81c917658a0c5a2600109", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8ec02e8efdd81c917658a0c5a2600109")).booleanValue() : TextUtils.equals(h(), ErrorCode.ERROR_TYPE_B) || TextUtils.equals(h(), "E");
    }

    public static boolean j() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9e8a6e751dbbac72c0fabc8b82426233", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9e8a6e751dbbac72c0fabc8b82426233")).booleanValue();
        }
        z = (TextUtils.equals(h(), "D") || TextUtils.equals(h(), "E")) ? true : true;
        b = z;
        return z;
    }
}
