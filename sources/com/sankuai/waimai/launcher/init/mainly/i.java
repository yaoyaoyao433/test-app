package com.sankuai.waimai.launcher.init.mainly;

import android.app.Application;
import android.support.annotation.Nullable;
import com.meituan.android.common.statistics.Interface.AbsEnvironment;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.init.AbsInit;
import com.sankuai.waimai.foundation.location.LocationSPKeys;
import com.sankuai.waimai.foundation.location.v2.City;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.foundation.utils.e;
import com.sankuai.waimai.launcher.model.AppInfo;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class i extends AbsInit {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.foundation.core.init.a
    public final String tag() {
        return "GAHelperInit";
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public final void init(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7e4d23ac69962f73b87026182cf166d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7e4d23ac69962f73b87026182cf166d");
        } else {
            Statistics.initStatistics(application, new a(), "");
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a extends AbsEnvironment {
        public static ChangeQuickRedirect a;
        private WMLocation b;

        @Override // com.meituan.android.common.statistics.Interface.IEnvironment
        public final String getLch() {
            return null;
        }

        public static /* synthetic */ WMLocation a(a aVar, WMLocation wMLocation) {
            aVar.b = null;
            return null;
        }

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbfafea0bd61d1871347f20f6272cdd5", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbfafea0bd61d1871347f20f6272cdd5");
            } else {
                com.sankuai.waimai.foundation.location.g.a(new e.a() { // from class: com.sankuai.waimai.launcher.init.mainly.i.a.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.foundation.utils.e.a
                    public final void a(String str, String str2) {
                        Object[] objArr2 = {str, str2};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "de5866a38eb2a4fa753d28c23d0902e3", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "de5866a38eb2a4fa753d28c23d0902e3");
                        } else if (LocationSPKeys.POI_LOCATION.name().equals(str2)) {
                            a.a(a.this, null);
                        }
                    }
                });
            }
        }

        @Override // com.meituan.android.common.statistics.Interface.AbsEnvironment, com.meituan.android.common.statistics.Interface.IEnvironment
        public final String getCh() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8ca728256efc2bbd1fe0f1a37b9d22b", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8ca728256efc2bbd1fe0f1a37b9d22b") : com.sankuai.waimai.platform.b.A().d();
        }

        @Override // com.meituan.android.common.statistics.Interface.AbsEnvironment, com.meituan.android.common.statistics.Interface.IEnvironment
        public final String getLat() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b82ef384e340589ce07e9d7da3bad7b6", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b82ef384e340589ce07e9d7da3bad7b6");
            }
            WMLocation a2 = a();
            if (a2 != null) {
                return String.valueOf(a2.getLatitude());
            }
            return null;
        }

        @Override // com.meituan.android.common.statistics.Interface.AbsEnvironment, com.meituan.android.common.statistics.Interface.IEnvironment
        public final String getLng() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fbc62fa200ad66952d3b94b5c908be72", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fbc62fa200ad66952d3b94b5c908be72");
            }
            WMLocation a2 = a();
            if (a2 != null) {
                return String.valueOf(a2.getLongitude());
            }
            return null;
        }

        @Override // com.meituan.android.common.statistics.Interface.AbsEnvironment, com.meituan.android.common.statistics.Interface.IEnvironment
        public final String getAppName() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07738106c6a507612d648dafc9a2b708", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07738106c6a507612d648dafc9a2b708") : com.sankuai.waimai.platform.b.A().r();
        }

        @Override // com.meituan.android.common.statistics.Interface.AbsEnvironment, com.meituan.android.common.statistics.Interface.IEnvironment
        public final String getUid() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27f0ba176b28aed21a54b3c04ab0f706", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27f0ba176b28aed21a54b3c04ab0f706") : com.sankuai.waimai.platform.b.A().B();
        }

        @Override // com.meituan.android.common.statistics.Interface.AbsEnvironment, com.meituan.android.common.statistics.Interface.IEnvironment
        public final String getCityId() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d1aba6e5ce26e1928af8085aaedfbde", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d1aba6e5ce26e1928af8085aaedfbde") : String.valueOf(AppInfo.getCityID());
        }

        @Override // com.meituan.android.common.statistics.Interface.AbsEnvironment
        public final String getLocateCityId() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ab106c6806f03be8c4ddc0aa8760450", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ab106c6806f03be8c4ddc0aa8760450");
            }
            City m = com.sankuai.waimai.foundation.location.v2.g.a().m();
            return m != null ? m.getCityCode() : "0";
        }

        @Override // com.meituan.android.common.statistics.Interface.AbsEnvironment, com.meituan.android.common.statistics.Interface.IEnvironment
        public final String getLoginType() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef64003956fd7e750b9be8a0725a9576", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef64003956fd7e750b9be8a0725a9576") : super.getLoginType();
        }

        @Nullable
        private WMLocation a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56ac2b7772e19726b5a247bc1f677708", RobustBitConfig.DEFAULT_VALUE)) {
                return (WMLocation) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56ac2b7772e19726b5a247bc1f677708");
            }
            WMLocation wMLocation = this.b;
            if (wMLocation != null && com.sankuai.waimai.foundation.utils.h.d(Double.valueOf(wMLocation.getLatitude()), Double.valueOf(0.0d)) && com.sankuai.waimai.foundation.utils.h.d(Double.valueOf(wMLocation.getLongitude()), Double.valueOf(0.0d))) {
                return wMLocation;
            }
            this.b = com.sankuai.waimai.foundation.location.g.j();
            return this.b;
        }
    }
}
