package com.sankuai.waimai.business.page.kingkong.utils;

import android.arch.lifecycle.q;
import android.os.Handler;
import android.os.SystemClock;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.home.upload.LocationUploadApi;
import com.sankuai.waimai.business.page.home.upload.LocationUploadResponse;
import com.sankuai.waimai.business.page.kingkong.future.root.FKKFragment;
import com.sankuai.waimai.business.page.kingkong.viewmodel.KingKongViewModel;
import com.sankuai.waimai.foundation.location.LocationSnifferReporter;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.foundation.location.v2.WmAddress;
import com.sankuai.waimai.foundation.location.v2.callback.DeviceLocateCallback;
import com.sankuai.waimai.foundation.location.v2.g;
import com.sankuai.waimai.foundation.location.v2.k;
import com.sankuai.waimai.foundation.location.v2.listener.c;
import com.sankuai.waimai.foundation.utils.e;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.capacity.log.i;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.platform.utils.sharedpreference.PlatformSPKeys;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b implements com.sankuai.waimai.foundation.location.v2.listener.a, c {
    public static ChangeQuickRedirect a;
    public boolean b;
    public boolean c;
    private FKKFragment d;
    private KingKongViewModel e;
    private Handler f;

    public b(FKKFragment fKKFragment) {
        Object[] objArr = {fKKFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9f37e9d901c3274bead2a33ec7706cf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9f37e9d901c3274bead2a33ec7706cf");
            return;
        }
        this.b = false;
        this.f = new Handler();
        this.c = false;
        this.d = fKKFragment;
        this.e = (KingKongViewModel) q.a(fKKFragment.getActivity()).a(KingKongViewModel.class);
    }

    public final void a(Fragment fragment) {
        Object[] objArr = {fragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70a059f57aa6aa5e13b1462e43f79621", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70a059f57aa6aa5e13b1462e43f79621");
            return;
        }
        b();
        g.a().a((DeviceLocateCallback) null, (com.sankuai.waimai.foundation.location.v2.callback.a) null, true, com.sankuai.waimai.platform.domain.manager.location.v2.b.POI_FRAGMENT.toString(), new k(fragment, "dj-a16fc3bdb33a963c"));
        com.sankuai.waimai.platform.utils.sharedpreference.a.a().a((e) PlatformSPKeys.KEY_SELECT_LOCATION_ADDRESS, "");
    }

    @Override // com.sankuai.waimai.foundation.location.v2.listener.a
    public final void a(WMLocation wMLocation) {
        Object[] objArr = {wMLocation};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de302317f5b549dfafd1fb68068bf6fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de302317f5b549dfafd1fb68068bf6fc");
        } else if (wMLocation != null && wMLocation.getLocationResultCode().a == 1200) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5bcdf6ee25a9fd26acc2ec6cdb49c67d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5bcdf6ee25a9fd26acc2ec6cdb49c67d");
            } else if (this.d.getActivity() != null) {
                a(true);
                ((com.sankuai.waimai.business.page.kingkong.future.root.a) this.d.f).Q();
            }
            if (this.b) {
                this.b = false;
                com.sankuai.waimai.platform.capacity.log.c.a().a(wMLocation.getLocationResultCode().a, "waimai_location_open_gps_service", SystemClock.elapsedRealtime());
            }
            com.sankuai.waimai.business.page.home.againstcheating.a.a("location");
        } else {
            b(wMLocation);
            int i = wMLocation != null ? wMLocation.getLocationResultCode().a : -1;
            if (this.b) {
                this.b = false;
                com.sankuai.waimai.platform.capacity.log.c.a().a(i, "waimai_location_open_gps_service", SystemClock.elapsedRealtime());
            }
        }
    }

    @Override // com.sankuai.waimai.foundation.location.v2.listener.c
    public final void onPoiChange(WmAddress wmAddress, boolean z) {
        Object[] objArr = {wmAddress, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7768f49fb3f1cac584bc6ece7dc50f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7768f49fb3f1cac584bc6ece7dc50f4");
            return;
        }
        if (wmAddress != null) {
            if (z) {
                a(wmAddress);
            } else {
                String address = wmAddress.getAddress();
                Object[] objArr2 = {address};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "96745a4b4523c8f5573ee9f73a3bece8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "96745a4b4523c8f5573ee9f73a3bece8");
                } else if (!TextUtils.isEmpty(address)) {
                    a(false);
                    if (this.e != null) {
                        this.e.a(address, true);
                    }
                    ((com.sankuai.waimai.business.page.kingkong.future.root.a) this.d.f).Q();
                }
            }
            if (!z && wmAddress.getMeitaunCity() != null) {
                com.sankuai.waimai.business.page.home.againstcheating.a.b = wmAddress.getMeitaunCity().getCityName();
            }
        }
        ((com.sankuai.waimai.business.page.kingkong.future.root.a) this.d.f).M();
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43aab9d952e8648b17ab898c9d5fc042", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43aab9d952e8648b17ab898c9d5fc042");
        } else if (this.d.getActivity() == null || this.e == null) {
        } else {
            this.e.a(this.d.getString(R.string.wm_page_poiList_progressbar_locating), false);
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "705242c566a0d339208c6a68fc0bc503", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "705242c566a0d339208c6a68fc0bc503");
        } else if (this.c) {
        } else {
            g.a().a((c) this, com.sankuai.waimai.platform.domain.manager.location.v2.b.POI_FRAGMENT.toString());
            g.a().a((com.sankuai.waimai.foundation.location.v2.listener.a) this, com.sankuai.waimai.platform.domain.manager.location.v2.b.POI_FRAGMENT.toString());
            this.c = true;
        }
    }

    private void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e519c705e501ce0e34752a4d6d20a74", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e519c705e501ce0e34752a4d6d20a74");
            return;
        }
        com.sankuai.waimai.platform.b.A().s();
        com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((LocationUploadApi) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) LocationUploadApi.class)).uploadLocation(), new b.AbstractC1042b<LocationUploadResponse>() { // from class: com.sankuai.waimai.business.page.kingkong.utils.b.1
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
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bec51ad7dbcee1a4d9f63fae7b75bdae", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bec51ad7dbcee1a4d9f63fae7b75bdae");
                } else if (locationUploadResponse == null || (location = locationUploadResponse.getLocation()) == null) {
                } else {
                    try {
                        HashMap hashMap = new HashMap();
                        Iterator<String> keys = location.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            hashMap.put(next, location.optString(next));
                        }
                        com.sankuai.waimai.platform.b.A().a(hashMap);
                    } catch (Exception unused) {
                    }
                }
            }
        }, this.d.a());
    }

    public final void b(WMLocation wMLocation) {
        LocationSnifferReporter locationSnifferReporter;
        Object[] objArr = {wMLocation};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5edf1d71ad37aba1fb8e48201dcf1ff2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5edf1d71ad37aba1fb8e48201dcf1ff2");
            return;
        }
        String valueOf = (wMLocation == null || wMLocation.getLocationResultCode() == null) ? "-1" : String.valueOf(wMLocation.getLocationResultCode().a);
        if (wMLocation != null && wMLocation.getLocationSnifferReporter() != null) {
            locationSnifferReporter = wMLocation.getLocationSnifferReporter();
        } else {
            locationSnifferReporter = new LocationSnifferReporter();
        }
        locationSnifferReporter.a(wMLocation);
        i.d(new com.sankuai.waimai.business.page.common.log.a().a("home_locate_fail").b(valueOf).d(locationSnifferReporter.c()).b(true).b());
        JudasManualManager.b("b_waimai_dai1l2a6_mv").a("c_m84bv26").a(this.d).a();
        JudasManualManager.b("b_waimai_ng5wioc0_mc").a("c_m84bv26").a(this.d).a("time", System.currentTimeMillis()).a();
        this.f.post(new Runnable() { // from class: com.sankuai.waimai.business.page.kingkong.utils.b.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "024401ce210c9e04b904ea19f5f074bb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "024401ce210c9e04b904ea19f5f074bb");
                } else {
                    b.this.a();
                }
            }
        });
    }

    public final void a(WmAddress wmAddress) {
        Object[] objArr = {wmAddress};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd59edb6915a8178718dd683a8cc734f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd59edb6915a8178718dd683a8cc734f");
        } else if (this.d.getActivity() == null) {
        } else {
            if (wmAddress != null && wmAddress.hasAddress()) {
                if (this.e != null) {
                    if (g.a().b(wmAddress.getWMLocation())) {
                        this.e.a(this.d.getResources().getString(R.string.wm_default_address), true);
                        return;
                    } else {
                        this.e.a(wmAddress.getAddress(), true);
                        return;
                    }
                }
                return;
            }
            i.d(new com.sankuai.waimai.business.page.home.log.a().a("home_page_address").d(wmAddress == null ? "address null" : wmAddress.toString()).b(true).b());
            if (this.e != null) {
                this.e.a(this.d.getString(R.string.wm_page_poiList_locating_unknown), false);
            }
        }
    }
}
