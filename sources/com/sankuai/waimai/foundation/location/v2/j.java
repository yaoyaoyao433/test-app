package com.sankuai.waimai.foundation.location.v2;

import android.os.SystemClock;
import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.location.geo.MtMobileApi;
import com.sankuai.waimai.foundation.location.model.AdminInfo;
import com.sankuai.waimai.foundation.location.model.CityResponse;
import com.sankuai.waimai.foundation.location.model.LocationBaseResponse;
import com.sankuai.waimai.foundation.location.net.b;
import com.sankuai.waimai.foundation.utils.ab;
import io.agora.rtc.internal.RtcEngineEvent;
import java.util.HashSet;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class j {
    public static ChangeQuickRedirect a = null;
    private static final String f = "j";
    volatile int b;
    final Set<com.sankuai.waimai.foundation.location.v2.callback.b> c;
    rx.k d;
    rx.k e;
    private long g;
    private WmAddress h;

    public static /* synthetic */ void a(j jVar, LocationBaseResponse locationBaseResponse) {
        Object[] objArr = {locationBaseResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, jVar, changeQuickRedirect, false, "9f582cbf7674ae4cfaefeefc1f15e4ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, jVar, changeQuickRedirect, false, "9f582cbf7674ae4cfaefeefc1f15e4ce");
        } else if (locationBaseResponse == null || locationBaseResponse.data == 0 || ((CityResponse) locationBaseResponse.data).regeoInfo == null || ((CityResponse) locationBaseResponse.data).regeoInfo.b != 0) {
        } else {
            try {
                City city = new City();
                city.setCityCode(String.valueOf(((CityResponse) locationBaseResponse.data).id));
                city.setCityName(((CityResponse) locationBaseResponse.data).city);
                try {
                    h.b(city);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (((CityResponse) locationBaseResponse.data).mtBackCityInfo != null) {
                    try {
                        h.d(d.a().toJson(((CityResponse) locationBaseResponse.data).mtBackCityInfo));
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
                if (((CityResponse) locationBaseResponse.data).regeoInfo.c != null) {
                    try {
                        h.a(d.a().toJson(((CityResponse) locationBaseResponse.data).regeoInfo.c));
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                }
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        }
    }

    public static /* synthetic */ void a(j jVar, LocationBaseResponse locationBaseResponse, boolean z) {
        Object[] objArr = {locationBaseResponse, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, jVar, changeQuickRedirect, false, "b5e0d39d0d111848d8bdd30202d55000", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, jVar, changeQuickRedirect, false, "b5e0d39d0d111848d8bdd30202d55000");
            return;
        }
        int i = R.string.wm_cat_regeo_mt;
        if (locationBaseResponse == null || locationBaseResponse.data == 0 || ((CityResponse) locationBaseResponse.data).regeoInfo == null || ((CityResponse) locationBaseResponse.data).regeoInfo.b != 0) {
            if (com.sankuai.waimai.foundation.location.e.b()) {
                i = R.string.wm_cat_regeo_wmapp;
            }
            com.sankuai.waimai.foundation.location.e.c().a(13031, ab.a(i), jVar.g);
            if (((CityResponse) locationBaseResponse.data).regeoInfo.b == 408) {
                jVar.h.setStatusCode(WmAddress.CHECK_ADDRESS_REGEO_UNKNOWN);
            }
            jVar.b();
            return;
        }
        try {
            try {
                City city = new City();
                city.setCityCode(jVar.a(locationBaseResponse));
                city.setCityName(jVar.b(locationBaseResponse));
                jVar.h.setMafCity(city);
                jVar.h.setAddress(((CityResponse) locationBaseResponse.data).regeoInfo == null ? "" : ((CityResponse) locationBaseResponse.data).regeoInfo.a);
                if (com.sankuai.waimai.foundation.location.e.b()) {
                    i = R.string.wm_cat_regeo_wmapp;
                }
                com.sankuai.waimai.foundation.location.e.c().a(RtcEngineEvent.EvtType.EVT_LASTMILE_PROBE_RESULT, ab.a(i), jVar.g);
                jVar.h.setStatusCode(1200);
                if (jVar.h != null && jVar.h.hasAddress() && jVar.h.getMeitaunCity() != null) {
                    h.a(jVar.h);
                }
                if (z) {
                    try {
                        h.a(city);
                    } catch (Exception e) {
                        com.sankuai.waimai.foundation.utils.log.a.b(e);
                    }
                }
                h.b(city);
                if (((CityResponse) locationBaseResponse.data).mtBackCityInfo != null) {
                    if (z) {
                        try {
                            h.c(d.a().toJson(((CityResponse) locationBaseResponse.data).mtBackCityInfo));
                        } catch (Exception e2) {
                            com.sankuai.waimai.foundation.utils.log.a.b(e2);
                        }
                    }
                    h.d(d.a().toJson(((CityResponse) locationBaseResponse.data).mtBackCityInfo));
                }
                if (((CityResponse) locationBaseResponse.data).regeoInfo.c != null) {
                    if (z) {
                        try {
                            h.b(d.a().toJson(((CityResponse) locationBaseResponse.data).regeoInfo.c));
                        } catch (Exception e3) {
                            com.sankuai.waimai.foundation.utils.log.a.b(e3);
                        }
                    }
                    h.a(d.a().toJson(((CityResponse) locationBaseResponse.data).regeoInfo.c));
                }
                if (jVar.h != null && g.a().b(jVar.h.getWMLocation())) {
                    jVar.h.setAddress(com.meituan.android.singleton.b.a.getString(R.string.wm_default_address));
                }
                jVar.b();
            } catch (Exception e4) {
                com.sankuai.waimai.foundation.location.utils.b.a(f, e4);
                if (jVar.h != null && g.a().b(jVar.h.getWMLocation())) {
                    jVar.h.setAddress(com.meituan.android.singleton.b.a.getString(R.string.wm_default_address));
                }
                jVar.b();
            }
        } catch (Throwable th) {
            if (jVar.h != null && g.a().b(jVar.h.getWMLocation())) {
                jVar.h.setAddress(com.meituan.android.singleton.b.a.getString(R.string.wm_default_address));
            }
            jVar.b();
            throw th;
        }
    }

    public j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "794ed65d953096773acfefbdb5370788", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "794ed65d953096773acfefbdb5370788");
            return;
        }
        this.b = 0;
        this.h = new WmAddress();
        this.c = new HashSet();
    }

    public static j a(WMLocation wMLocation, com.sankuai.waimai.foundation.location.v2.callback.b bVar) {
        Object[] objArr = {wMLocation, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6cd1de80240a0b048f817eaceb2171b1", RobustBitConfig.DEFAULT_VALUE)) {
            return (j) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6cd1de80240a0b048f817eaceb2171b1");
        }
        if (wMLocation == null || bVar == null) {
            return null;
        }
        j jVar = new j();
        jVar.c.add(bVar);
        jVar.a(wMLocation, true);
        return jVar;
    }

    public static j a(WmAddress wmAddress, com.sankuai.waimai.foundation.location.v2.callback.b bVar) {
        Object[] objArr = {wmAddress, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8397c173aafba28de58215dec43d5163", RobustBitConfig.DEFAULT_VALUE)) {
            return (j) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8397c173aafba28de58215dec43d5163");
        }
        if (wmAddress == null || wmAddress.getWMLocation() == null) {
            return null;
        }
        j jVar = new j();
        jVar.h.setMafCity(wmAddress.getMafCity());
        jVar.h.setMeitaunCity(wmAddress.getMeitaunCity());
        jVar.h.setAddress(wmAddress.getAddress());
        jVar.h.setWMLocation(wmAddress.getWMLocation());
        jVar.c.add(bVar);
        jVar.a(wmAddress.getWMLocation(), false);
        return jVar;
    }

    public static j a(double d, double d2, com.sankuai.waimai.foundation.location.v2.callback.b bVar) {
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2), bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f2d85a46dec46021c41053c3ddeed4ca", RobustBitConfig.DEFAULT_VALUE)) {
            return (j) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f2d85a46dec46021c41053c3ddeed4ca");
        }
        if (Double.compare(d, 0.0d) == 0 || Double.compare(d2, 0.0d) == 0) {
            return null;
        }
        WMLocation wMLocation = new WMLocation("");
        wMLocation.setLatitude(d);
        wMLocation.setLongitude(d2);
        return a(wMLocation, bVar);
    }

    private void a(WMLocation wMLocation, boolean z) {
        Object[] objArr = {wMLocation, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7d9c7f168a9f6e9bd55aaddf077746d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7d9c7f168a9f6e9bd55aaddf077746d");
            return;
        }
        this.g = SystemClock.elapsedRealtime();
        this.b = 2;
        this.h.setWMLocation(wMLocation);
        a(wMLocation.getLatitude(), wMLocation.getLongitude(), z);
    }

    public static void a(WmAddress wmAddress) {
        Object[] objArr = {wmAddress};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "960092a0c7492a49fef0dd7f6823d8cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "960092a0c7492a49fef0dd7f6823d8cc");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.b("gxb", "regeoForGBCity", new Object[0]);
        j jVar = new j();
        Object[] objArr2 = {wmAddress};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, jVar, changeQuickRedirect2, false, "808d5b97ff674377b7246fb71aed1690", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, jVar, changeQuickRedirect2, false, "808d5b97ff674377b7246fb71aed1690");
        } else if (wmAddress == null || wmAddress.getWMLocation() == null) {
        } else {
            com.sankuai.waimai.foundation.utils.log.a.b("gxb", "regeoForGBCityInternal", new Object[0]);
            double latitude = wmAddress.getWMLocation().getLatitude();
            double longitude = wmAddress.getWMLocation().getLongitude();
            jVar.d = com.sankuai.waimai.foundation.location.net.b.a(((MtMobileApi) com.sankuai.waimai.foundation.location.net.b.a((Class<Object>) MtMobileApi.class)).getCityInfo(latitude + CommonConstant.Symbol.COMMA + longitude, "0", 1, 1), new b.AbstractC0949b<LocationBaseResponse<CityResponse>>() { // from class: com.sankuai.waimai.foundation.location.v2.j.1
                public static ChangeQuickRedirect a;

                @Override // rx.e
                public final void onError(Throwable th) {
                }

                @Override // rx.e
                public final /* synthetic */ void onNext(Object obj) {
                    LocationBaseResponse locationBaseResponse = (LocationBaseResponse) obj;
                    Object[] objArr3 = {locationBaseResponse};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ad431087a261ec142da4b622e03af872", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ad431087a261ec142da4b622e03af872");
                    } else {
                        j.a(j.this, locationBaseResponse);
                    }
                }
            }, com.sankuai.waimai.foundation.location.net.b.b);
        }
    }

    private void a(double d, double d2, final boolean z) {
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b6c592818b63cb875d5e9eeffa28cc5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b6c592818b63cb875d5e9eeffa28cc5");
        } else if (this.h.getMeitaunCity() != null) {
            b();
        } else {
            this.e = com.sankuai.waimai.foundation.location.net.b.a(((MtMobileApi) com.sankuai.waimai.foundation.location.net.b.a((Class<Object>) MtMobileApi.class)).getCityInfo(d + CommonConstant.Symbol.COMMA + d2, "0", 1, 1), new b.AbstractC0949b<LocationBaseResponse<CityResponse>>() { // from class: com.sankuai.waimai.foundation.location.v2.j.2
                public static ChangeQuickRedirect a;

                @Override // rx.e
                public final /* synthetic */ void onNext(Object obj) {
                    LocationBaseResponse locationBaseResponse = (LocationBaseResponse) obj;
                    Object[] objArr2 = {locationBaseResponse};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "95bb13639117ad2983801a1d79a3ea1d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "95bb13639117ad2983801a1d79a3ea1d");
                        return;
                    }
                    j.a(j.this, locationBaseResponse, z);
                    if (locationBaseResponse != null) {
                        try {
                            try {
                                if (locationBaseResponse.data != 0) {
                                    City city = new City();
                                    city.setCityCode(String.valueOf(((CityResponse) locationBaseResponse.data).id));
                                    city.setCityName(((CityResponse) locationBaseResponse.data).city);
                                    j.this.h.setMeitaunCity(city);
                                }
                            } catch (Exception e) {
                                com.sankuai.waimai.foundation.location.utils.b.a(j.f, e);
                            }
                        } catch (Throwable th) {
                            j.this.b();
                            throw th;
                        }
                    }
                    if (j.this.h != null && j.this.h.hasAddress() && j.this.h.getMeitaunCity() != null) {
                        h.a(j.this.h);
                    }
                    j.this.b();
                }

                @Override // rx.e
                public final void onError(Throwable th) {
                    Object[] objArr2 = {th};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f8f676904d22d5e44aff63a73651edc7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f8f676904d22d5e44aff63a73651edc7");
                    } else {
                        j.this.b();
                    }
                }
            }, com.sankuai.waimai.foundation.location.net.b.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1054b31cf2a426a8e9f30d993faa2184", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1054b31cf2a426a8e9f30d993faa2184");
            return;
        }
        this.b--;
        if (this.b > 0 || this.c.isEmpty()) {
            return;
        }
        synchronized (this.c) {
            this.h.setCreateTime(System.currentTimeMillis());
            for (com.sankuai.waimai.foundation.location.v2.callback.b bVar : this.c) {
                try {
                    bVar.a(this.h);
                } catch (Exception e) {
                    com.sankuai.waimai.foundation.location.utils.b.a(f, e);
                }
            }
            this.c.clear();
        }
    }

    private String a(LocationBaseResponse<CityResponse> locationBaseResponse) {
        Object[] objArr = {locationBaseResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "791d945218ca71abe3fda81cdc6eecad", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "791d945218ca71abe3fda81cdc6eecad");
        }
        if (locationBaseResponse == null || com.sankuai.waimai.foundation.utils.d.a(locationBaseResponse.data.regeoInfo.c)) {
            return "";
        }
        for (AdminInfo adminInfo : locationBaseResponse.data.regeoInfo.c) {
            if (adminInfo.adminLevel == 5) {
                return adminInfo.adminCode;
            }
        }
        return "";
    }

    private String b(LocationBaseResponse<CityResponse> locationBaseResponse) {
        Object[] objArr = {locationBaseResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90c82de592a063b9795740579e7d6ad6", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90c82de592a063b9795740579e7d6ad6");
        }
        if (locationBaseResponse == null || com.sankuai.waimai.foundation.utils.d.a(locationBaseResponse.data.regeoInfo.c)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (AdminInfo adminInfo : locationBaseResponse.data.regeoInfo.c) {
            if (adminInfo.adminLevel == 4 && !sb.toString().equals(adminInfo.name)) {
                sb.insert(0, adminInfo.name);
            }
            if (adminInfo.adminLevel == 5 && !sb.toString().equals(adminInfo.name)) {
                sb.append(adminInfo.name);
            }
        }
        return sb.toString();
    }
}
