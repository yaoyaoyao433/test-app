package com.sankuai.waimai.business.page.home;

import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.home.upload.LocationUploadApi;
import com.sankuai.waimai.business.page.home.upload.LocationUploadResponse;
import com.sankuai.waimai.foundation.location.LocationSnifferReporter;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.foundation.location.v2.WmAddress;
import com.sankuai.waimai.foundation.location.v2.callback.DeviceLocateCallback;
import com.sankuai.waimai.foundation.location.v2.g;
import com.sankuai.waimai.foundation.location.v2.k;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.capacity.log.i;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.platform.utils.sharedpreference.PlatformSPKeys;
import com.sankuai.waimai.platform.widget.emptylayout.d;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d implements com.sankuai.waimai.foundation.location.v2.listener.a, com.sankuai.waimai.foundation.location.v2.listener.c {
    public static ChangeQuickRedirect a;
    HomePageFragment b;
    boolean c;
    boolean d;
    public boolean e;
    private boolean f;
    private boolean g;
    private Handler h;

    public d(HomePageFragment homePageFragment) {
        Object[] objArr = {homePageFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "538b2215196c6ad719978a4befa6ad8e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "538b2215196c6ad719978a4befa6ad8e");
            return;
        }
        this.c = true;
        this.d = false;
        this.h = new Handler();
        this.e = false;
        this.b = homePageFragment;
    }

    public final void a(Fragment fragment) {
        Object[] objArr = {fragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51231e134d00350f1e54cb0b85738971", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51231e134d00350f1e54cb0b85738971");
            return;
        }
        com.sankuai.waimai.platform.domain.manager.location.v2.a.b = false;
        this.f = false;
        this.g = false;
        if (!this.e) {
            a();
        }
        c();
        g.a().a((DeviceLocateCallback) null, (com.sankuai.waimai.foundation.location.v2.callback.a) null, true, com.sankuai.waimai.platform.domain.manager.location.v2.b.POI_FRAGMENT.toString(), new k(fragment, "dj-b5e9814e9fb3a8f6"));
        com.sankuai.waimai.platform.utils.sharedpreference.a.a().a((com.sankuai.waimai.foundation.utils.e) PlatformSPKeys.KEY_SELECT_LOCATION_ADDRESS, "");
    }

    @Override // com.sankuai.waimai.foundation.location.v2.listener.a
    public final void a(WMLocation wMLocation) {
        Object[] objArr = {wMLocation};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14fd3cc206e8d7b751e28589e35558c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14fd3cc206e8d7b751e28589e35558c6");
            return;
        }
        this.f = true;
        if (this.g) {
            com.sankuai.waimai.platform.domain.manager.location.v2.a.b = true;
        }
        if (com.sankuai.waimai.platform.model.c.a().c()) {
            com.sankuai.waimai.platform.model.c.a().a(0);
        }
        if (wMLocation != null && wMLocation.getLocationResultCode().a == 1200) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0f67a9a8dda26ab581864f9617babc08", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0f67a9a8dda26ab581864f9617babc08");
            } else if (this.b.getActivity() != null) {
                a(true);
                if (this.c) {
                    this.b.i.a(0);
                    this.c = false;
                } else {
                    this.b.i.a(4);
                }
                if (this.b.C != null) {
                    this.b.C.a(true);
                }
            }
            if (this.d) {
                this.d = false;
                com.sankuai.waimai.platform.capacity.log.c.a().a(wMLocation.getLocationResultCode().a, "waimai_location_open_gps_service", SystemClock.elapsedRealtime());
            }
            com.sankuai.waimai.business.page.home.againstcheating.a.a("location");
            return;
        }
        b(wMLocation);
        int i = wMLocation != null ? wMLocation.getLocationResultCode().a : -1;
        if (this.d) {
            this.d = false;
            com.sankuai.waimai.platform.capacity.log.c.a().a(i, "waimai_location_open_gps_service", SystemClock.elapsedRealtime());
        }
    }

    @Override // com.sankuai.waimai.foundation.location.v2.listener.c
    public final void onPoiChange(WmAddress wmAddress, boolean z) {
        Object[] objArr = {wmAddress, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c30baea21255c86c9cdf90dbf18b9f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c30baea21255c86c9cdf90dbf18b9f4");
            return;
        }
        this.g = true;
        if (this.f) {
            com.sankuai.waimai.platform.domain.manager.location.v2.a.b = true;
        }
        if (com.sankuai.waimai.platform.model.c.a().c()) {
            com.sankuai.waimai.platform.model.c.a().a(0);
        }
        if (com.sankuai.waimai.foundation.core.a.d() && this.b != null && this.b.m != null) {
            this.b.m.d(true);
        }
        if (wmAddress != null) {
            if (z) {
                a(wmAddress);
            } else {
                a(wmAddress.getAddress());
            }
            if (!z && wmAddress.getMeitaunCity() != null) {
                com.sankuai.waimai.business.page.home.againstcheating.a.b = wmAddress.getMeitaunCity().getCityName();
            }
            this.b.c();
        }
        this.b.b();
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0459bfd180225351f337aaab86f5bbc4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0459bfd180225351f337aaab86f5bbc4");
        } else if (this.b.getActivity() == null) {
        } else {
            if (this.b.m != null) {
                this.b.m.a(this.b.getString(R.string.wm_page_poiList_progressbar_locating), false);
            }
            this.b.k.d();
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "653f5521ab6a65e8afaeddabc3bc953f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "653f5521ab6a65e8afaeddabc3bc953f");
            return;
        }
        g.a().a((com.sankuai.waimai.foundation.location.v2.listener.c) this, com.sankuai.waimai.platform.domain.manager.location.v2.b.POI_FRAGMENT.toString());
        g.a().a((com.sankuai.waimai.foundation.location.v2.listener.a) this, com.sankuai.waimai.platform.domain.manager.location.v2.b.POI_FRAGMENT.toString());
        this.e = true;
    }

    public final void a(final boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca3f9c38a40682b489a25a887559a4c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca3f9c38a40682b489a25a887559a4c0");
            return;
        }
        com.sankuai.waimai.platform.b.A().s();
        com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((LocationUploadApi) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) LocationUploadApi.class)).uploadLocation(), new b.AbstractC1042b<LocationUploadResponse>() { // from class: com.sankuai.waimai.business.page.home.d.1
            public static ChangeQuickRedirect a;

            @Override // rx.e
            public final void onError(Throwable th) {
            }

            @Override // rx.e
            public final /* synthetic */ void onNext(Object obj) {
                JSONObject location;
                LocationUploadResponse locationUploadResponse = (LocationUploadResponse) obj;
                Object[] objArr2 = {locationUploadResponse};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f6629316620469cf31cc44329ed62375", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f6629316620469cf31cc44329ed62375");
                } else if (locationUploadResponse == null || (location = locationUploadResponse.getLocation()) == null) {
                } else {
                    try {
                        HashMap hashMap = new HashMap();
                        Iterator<String> keys = location.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            hashMap.put(next, location.optString(next));
                        }
                        if (d.this.b.C != null) {
                            d.this.b.C.a(hashMap, z);
                        }
                        com.sankuai.waimai.platform.b.A().a(hashMap);
                    } catch (Exception unused) {
                    }
                }
            }
        }, this.b.q());
    }

    public final void b(WMLocation wMLocation) {
        LocationSnifferReporter locationSnifferReporter;
        Object[] objArr = {wMLocation};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "607a440f49d9fd17eb56008b32f3662f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "607a440f49d9fd17eb56008b32f3662f");
            return;
        }
        this.b.a("locate_failed");
        if (com.sankuai.waimai.foundation.core.a.d() && this.b.m != null) {
            this.b.m.W = false;
        }
        String valueOf = (wMLocation == null || wMLocation.getLocationResultCode() == null) ? "-1" : String.valueOf(wMLocation.getLocationResultCode().a);
        if (wMLocation != null && wMLocation.getLocationSnifferReporter() != null) {
            locationSnifferReporter = wMLocation.getLocationSnifferReporter();
        } else {
            locationSnifferReporter = new LocationSnifferReporter();
        }
        locationSnifferReporter.a(wMLocation);
        i.d(new com.sankuai.waimai.business.page.common.log.a().a("home_locate_fail").b(valueOf).d(locationSnifferReporter.c()).b(true).b());
        JudasManualManager.b("b_waimai_dai1l2a6_mv").a("c_m84bv26").a(this.b).a();
        JudasManualManager.b("b_waimai_ng5wioc0_mc").a("c_m84bv26").a(this.b).a("time", System.currentTimeMillis()).a();
        if (this.b.C != null) {
            this.b.C.a(false);
        }
        this.h.post(new Runnable() { // from class: com.sankuai.waimai.business.page.home.d.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "75a96fe005edbf91fbcfa017cdcaa5bf", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "75a96fe005edbf91fbcfa017cdcaa5bf");
                } else {
                    d.this.a();
                }
            }
        });
        com.sankuai.waimai.business.page.home.utils.i.a(true);
    }

    public final void a(WmAddress wmAddress) {
        Object[] objArr = {wmAddress};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5579523606f351be0b954313c724fb97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5579523606f351be0b954313c724fb97");
        } else if (this.b.getActivity() == null) {
        } else {
            if (wmAddress != null && wmAddress.hasAddress()) {
                if (this.b.m != null) {
                    this.b.m.a(wmAddress.getAddress(), true);
                }
                if (this.b.k.c() == d.b.PROGRESS) {
                    String address = wmAddress.getAddress();
                    if (TextUtils.equals(address, com.meituan.android.singleton.b.a.getString(R.string.wm_default_address_loading))) {
                        address = "";
                    }
                    this.b.k.a(this.b.getString(R.string.wm_page_loading_poilist, address));
                    return;
                }
                return;
            }
            i.d(new com.sankuai.waimai.business.page.home.log.a().a("home_page_address").d(wmAddress == null ? "address null" : wmAddress.toString()).b(true).b());
            if (this.b.m != null) {
                this.b.m.a(this.b.F.getString(R.string.wm_page_poiList_locating_unknown), false);
            }
        }
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f2f2fb517efee3c53fb64e6e8d7e242", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f2f2fb517efee3c53fb64e6e8d7e242");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            a(false);
            if (TextUtils.equals(str, com.meituan.android.singleton.b.a.getString(R.string.wm_default_address_loading))) {
                this.b.k.a(this.b.getString(R.string.wm_page_loading_poilist));
            } else {
                this.b.k.a(this.b.getString(R.string.wm_page_loading_poilist, str));
            }
            if (this.b.m != null) {
                this.b.m.a(str, true);
            }
            this.b.i.a(5);
            if (this.b.C != null) {
                this.b.C.a(true);
            }
        }
    }

    public static boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5c764b08e47a6494f4de4475a00cd8f4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5c764b08e47a6494f4de4475a00cd8f4")).booleanValue() : Build.VERSION.SDK_INT >= 23 && Privacy.createPermissionGuard().a(com.meituan.android.singleton.b.a, "Locate.once", "dj-b5e9814e9fb3a8f6") < 0;
    }
}
