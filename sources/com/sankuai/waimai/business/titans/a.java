package com.sankuai.waimai.business.titans;

import com.dianping.networklog.c;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.singleton.k;
import com.meituan.passport.UserCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.base.Titans;
import com.sankuai.titans.protocol.services.ICookieService;
import com.sankuai.titans.protocol.utils.NetworkUtils;
import com.sankuai.titans.result.privacy.PrivacyTitansManager;
import com.sankuai.waimai.foundation.location.v2.City;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.foundation.location.v2.g;
import java.util.HashSet;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements ICookieService {
    public static ChangeQuickRedirect a;
    private static final Set<String> b = new HashSet<String>() { // from class: com.sankuai.waimai.business.titans.a.1
        {
            add(Constants.Environment.KEY_CITYID);
            add("network");
            add("latlng");
            add("token");
            add("uuid");
            add("mt_c_token");
        }
    };
    private static final Set<String> c = new HashSet<String>() { // from class: com.sankuai.waimai.business.titans.a.2
        {
            add(".meituan.com");
            add(".maoyan.com");
            add(".sankuai.com");
            add(".dianping.com");
            add(".51ping.com");
            add(".sankuai.info");
            add(".alpha.com");
            add(".mobike.com");
            add(".ipeen.com.tw");
            add(".dper.com");
            add(".jchunuo.com");
        }
    };

    @Override // com.sankuai.titans.protocol.services.ICookieService
    public final Set<String> getSupportKeys() {
        return b;
    }

    @Override // com.sankuai.titans.protocol.services.ICookieService
    public final Set<String> getSupportDomains(String str) {
        return c;
    }

    @Override // com.sankuai.titans.protocol.services.ICookieService
    public final String getCookieValue(String str) {
        String valueOf;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5db29dadd914e12f1abdb42764544104", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5db29dadd914e12f1abdb42764544104");
        }
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1360136250:
                if (str.equals(Constants.Environment.KEY_CITYID)) {
                    c2 = 0;
                    break;
                }
                break;
            case -1109874394:
                if (str.equals("latlng")) {
                    c2 = 2;
                    break;
                }
                break;
            case 3601339:
                if (str.equals("uuid")) {
                    c2 = 4;
                    break;
                }
                break;
            case 110541305:
                if (str.equals("token")) {
                    c2 = 3;
                    break;
                }
                break;
            case 1843485230:
                if (str.equals("network")) {
                    c2 = 1;
                    break;
                }
                break;
        }
        String str2 = null;
        switch (c2) {
            case 0:
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.titans.utils.a.a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "3358720fe1ba25c77df7dc5952e87673", RobustBitConfig.DEFAULT_VALUE)) {
                    return (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "3358720fe1ba25c77df7dc5952e87673");
                }
                City o = g.a().o();
                return o == null ? "" : o.getCityCode();
            case 1:
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.titans.utils.a.a;
                return PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "30f5f00cd8dd6058b73e0f50d65be669", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "30f5f00cd8dd6058b73e0f50d65be669") : NetworkUtils.getNetworkTypeString(Titans.getTitansContext().getApplicationContext(), "pt-9099367dd7fbc289");
            case 2:
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "3b9b347b3490a993f0191fd01c7153b0", RobustBitConfig.DEFAULT_VALUE)) {
                    return (String) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "3b9b347b3490a993f0191fd01c7153b0");
                }
                boolean isCookiePrivacySwitch = PrivacyTitansManager.getInstance().isCookiePrivacySwitch();
                c.a("MTCookieService.removeLatLngKey---cookiePrivacySwitch=" + isCookiePrivacySwitch, 35, new String[]{"privacy_cookie"});
                if (isCookiePrivacySwitch) {
                    return ICookieService.EMPTY_COOKIE_TAG;
                }
                StringBuilder sb = new StringBuilder();
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.business.titans.utils.a.a;
                if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "7f3a43cc7b00d4e9ebe46ec148194708", RobustBitConfig.DEFAULT_VALUE)) {
                    valueOf = (String) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "7f3a43cc7b00d4e9ebe46ec148194708");
                } else {
                    WMLocation i = g.a().i();
                    valueOf = i != null ? String.valueOf(i.getLatitude()) : null;
                }
                sb.append(valueOf);
                sb.append("/");
                Object[] objArr6 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.business.titans.utils.a.a;
                if (PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "d2efecf90f3ab9566ed421cfd5926172", RobustBitConfig.DEFAULT_VALUE)) {
                    str2 = (String) PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect6, true, "d2efecf90f3ab9566ed421cfd5926172");
                } else {
                    WMLocation i2 = g.a().i();
                    if (i2 != null) {
                        str2 = String.valueOf(i2.getLongitude());
                    }
                }
                sb.append(str2);
                return sb.toString();
            case 3:
                Object[] objArr7 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect7 = com.sankuai.waimai.business.titans.utils.a.a;
                if (PatchProxy.isSupport(objArr7, null, changeQuickRedirect7, true, "d1cd71887a3f09584002f10ba6a666ea", RobustBitConfig.DEFAULT_VALUE)) {
                    return (String) PatchProxy.accessDispatch(objArr7, null, changeQuickRedirect7, true, "d1cd71887a3f09584002f10ba6a666ea");
                }
                UserCenter a2 = k.a();
                return (a2 == null || a2.getUser() == null) ? "" : a2.getUser().token;
            case 4:
                Object[] objArr8 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect8 = com.sankuai.waimai.business.titans.utils.a.a;
                return PatchProxy.isSupport(objArr8, null, changeQuickRedirect8, true, "c7d28febef5b9bd21d8c9181c8978e00", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr8, null, changeQuickRedirect8, true, "c7d28febef5b9bd21d8c9181c8978e00") : com.sankuai.waimai.business.knb.services.a.a();
            default:
                return null;
        }
    }
}
