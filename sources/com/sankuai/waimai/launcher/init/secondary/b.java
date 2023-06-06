package com.sankuai.waimai.launcher.init.secondary;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.android.common.mtguard.MTGuard;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.init.AbsInit;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.foundation.utils.ab;
import com.sankuai.waimai.monitor.model.ErrorCode;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends AbsInit {
    public static ChangeQuickRedirect a;
    private Context b;

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public final void asyncInit(Application application) {
    }

    @Override // com.sankuai.waimai.foundation.core.init.a
    public final String tag() {
        return "AddressSdkInit";
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public final void init(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3fad0b0ddc35ac60b41cd2ffad11fe7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3fad0b0ddc35ac60b41cd2ffad11fe7");
            return;
        }
        this.b = application.getApplicationContext();
        Context context = this.b;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        com.sankuai.waimai.addrsdk.base.a aVar = PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "97887f4524a5577f61826df4506a7e50", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.addrsdk.base.a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "97887f4524a5577f61826df4506a7e50") : new com.sankuai.waimai.addrsdk.base.a() { // from class: com.sankuai.waimai.launcher.init.secondary.b.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.addrsdk.base.a
            public final String b() {
                return "";
            }

            @Override // com.sankuai.waimai.addrsdk.base.a
            public final String c() {
                return "";
            }

            @Override // com.sankuai.waimai.addrsdk.base.a
            public final String k() {
                return ErrorCode.ERROR_CODE_OKHTTP_EXCEPTION;
            }

            @Override // com.sankuai.waimai.addrsdk.base.a
            public final String l() {
                return "1";
            }

            @Override // com.sankuai.waimai.addrsdk.base.a
            public final String n() {
                return "0";
            }

            @Override // com.sankuai.waimai.addrsdk.base.a
            public final String a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "595cfb7af18c395963a08c91c7304b46", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "595cfb7af18c395963a08c91c7304b46") : com.sankuai.waimai.platform.b.A().c();
            }

            @Override // com.sankuai.waimai.addrsdk.base.a
            public final String d() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e328a4c0326f58485bf49b51ae6e8808", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e328a4c0326f58485bf49b51ae6e8808") : com.sankuai.waimai.platform.b.A().o();
            }

            @Override // com.sankuai.waimai.addrsdk.base.a
            public final String f() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "01a4ddbc861c6cce627b5338e86ad2ee", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "01a4ddbc861c6cce627b5338e86ad2ee") : com.sankuai.waimai.platform.b.A().u();
            }

            @Override // com.sankuai.waimai.addrsdk.base.a
            public final String g() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1806b72b3375300e14c7b0e5d8bcf649", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1806b72b3375300e14c7b0e5d8bcf649") : com.sankuai.waimai.platform.b.A().v();
            }

            @Override // com.sankuai.waimai.addrsdk.base.a
            public final String h() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6d7ba9387a1d366b7d55a880444c7096", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6d7ba9387a1d366b7d55a880444c7096") : com.sankuai.waimai.platform.b.A().w();
            }

            @Override // com.sankuai.waimai.addrsdk.base.a
            public final String i() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "faebca0d114c1fa2cadd76f23f05a523", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "faebca0d114c1fa2cadd76f23f05a523") : com.sankuai.waimai.kit.fingerPrint.a.a().b.fingerprint();
            }

            @Override // com.sankuai.waimai.addrsdk.base.a
            public final String j() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "226c5e67f83f5bf8f446875c2360b75f", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "226c5e67f83f5bf8f446875c2360b75f") : com.sankuai.waimai.platform.b.A().i();
            }

            @Override // com.sankuai.waimai.addrsdk.base.a
            public final String m() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "37407318899d0d450edfcebac5c136a9", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "37407318899d0d450edfcebac5c136a9") : com.sankuai.waimai.platform.domain.manager.user.a.i().e();
            }

            @Override // com.sankuai.waimai.addrsdk.base.a
            public final String o() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "187d718b0bb335223a321cf90cdecfc4", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "187d718b0bb335223a321cf90cdecfc4") : com.sankuai.waimai.platform.b.A().h();
            }

            @Override // com.sankuai.waimai.addrsdk.base.a
            public final String p() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "97af63d9e194cf7083758776bd15f62a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "97af63d9e194cf7083758776bd15f62a") : com.sankuai.waimai.platform.b.A().g();
            }

            @Override // com.sankuai.waimai.addrsdk.base.a
            public final double q() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "667042d4e61532077d2b6e336d3430d8", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Double) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "667042d4e61532077d2b6e336d3430d8")).doubleValue();
                }
                WMLocation j = com.sankuai.waimai.foundation.location.v2.h.j();
                WMLocation i = com.sankuai.waimai.foundation.location.v2.h.i();
                if (j == null || !j.hasLocatedPermission || i == null || !i.hasLocatedPermission) {
                    return 0.0d;
                }
                return j.getLongitude();
            }

            @Override // com.sankuai.waimai.addrsdk.base.a
            public final double r() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "927535e3297abd2166e506a7ebb2d45f", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Double) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "927535e3297abd2166e506a7ebb2d45f")).doubleValue();
                }
                WMLocation j = com.sankuai.waimai.foundation.location.v2.h.j();
                WMLocation i = com.sankuai.waimai.foundation.location.v2.h.i();
                if (j == null || !j.hasLocatedPermission || i == null || !i.hasLocatedPermission) {
                    return 0.0d;
                }
                return j.getLatitude();
            }

            @Override // com.sankuai.waimai.addrsdk.base.a
            public final double s() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "384166b5b27a9d0b5eca84ebd97fed18", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Double) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "384166b5b27a9d0b5eca84ebd97fed18")).doubleValue();
                }
                WMLocation i = com.sankuai.waimai.foundation.location.v2.h.i();
                if (i == null || !i.hasLocatedPermission) {
                    return 0.0d;
                }
                return i.getLongitude();
            }

            @Override // com.sankuai.waimai.addrsdk.base.a
            public final double t() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "afbe21beb288308f56a39645b17ead16", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Double) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "afbe21beb288308f56a39645b17ead16")).doubleValue();
                }
                WMLocation i = com.sankuai.waimai.foundation.location.v2.h.i();
                if (i == null || !i.hasLocatedPermission) {
                    return 0.0d;
                }
                return i.getLatitude();
            }

            @Override // com.sankuai.waimai.addrsdk.base.a
            public final String u() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7d2d4fb3c83c1686435a889a36858286", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7d2d4fb3c83c1686435a889a36858286") : ab.a(b.this.b, (int) R.string.mt_map_key);
            }

            @Override // com.sankuai.waimai.addrsdk.base.a
            public final String v() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "daf30d6d9cb1c3931df22ce3f283487f", RobustBitConfig.DEFAULT_VALUE)) {
                    return (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "daf30d6d9cb1c3931df22ce3f283487f");
                }
                if (com.sankuai.waimai.foundation.location.v2.g.a().m() != null) {
                    String cityName = com.sankuai.waimai.foundation.location.v2.g.a().m().getCityName();
                    if (!TextUtils.isEmpty(cityName)) {
                        return cityName;
                    }
                }
                return b.this.b.getResources().getString(R.string.takeout_poiList_locating_failed);
            }

            @Override // com.sankuai.waimai.addrsdk.base.a
            public final String e() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e3120c3a0ea9694c9293582700b8ee26", RobustBitConfig.DEFAULT_VALUE)) {
                    return (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e3120c3a0ea9694c9293582700b8ee26");
                }
                byte[] userIdentification = MTGuard.userIdentification(com.meituan.android.singleton.b.a);
                return userIdentification != null ? new String(userIdentification) : "";
            }
        };
        Integer valueOf = Integer.valueOf((int) R.style.AppAddressSdk);
        Object[] objArr3 = {context, "waimai_app", aVar, valueOf};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.addrsdk.a.a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "373c5d680d2f5a7abc3fef591cb19ef3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "373c5d680d2f5a7abc3fef591cb19ef3");
        } else if (aVar == null) {
            throw new IllegalArgumentException("BaseCommonParams must not be null");
        } else {
            com.sankuai.waimai.addrsdk.utils.b.a = context.getApplicationContext();
            com.sankuai.waimai.addrsdk.manager.a a2 = com.sankuai.waimai.addrsdk.manager.a.a();
            Object[] objArr4 = {"waimai_app", aVar};
            ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.addrsdk.manager.a.a;
            if (PatchProxy.isSupport(objArr4, a2, changeQuickRedirect4, false, "6a581f9b1b369feb4d6ba9cf7212d8e0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, a2, changeQuickRedirect4, false, "6a581f9b1b369feb4d6ba9cf7212d8e0");
            } else {
                a2.e.put("waimai_app", aVar);
            }
            com.sankuai.waimai.addrsdk.manager.a a3 = com.sankuai.waimai.addrsdk.manager.a.a();
            int intValue = valueOf.intValue();
            Object[] objArr5 = {"waimai_app", Integer.valueOf(intValue)};
            ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.addrsdk.manager.a.a;
            if (PatchProxy.isSupport(objArr5, a3, changeQuickRedirect5, false, "8cdff99e60ca879345cb4506a378990f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, a3, changeQuickRedirect5, false, "8cdff99e60ca879345cb4506a378990f");
            } else {
                a3.f.put("waimai_app", Integer.valueOf(intValue));
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences("addr_sdk_file", 0);
            com.sankuai.waimai.addrsdk.manager.a.a().c = sharedPreferences.getString("address_map_rank.address_map_rank_group1", "");
            com.sankuai.waimai.addrsdk.manager.a.a().d = sharedPreferences.getString("address_map_whitelist.address_map_whitelist_group1", "");
        }
        com.sankuai.waimai.addrsdk.a.a("waimai_app");
    }
}
