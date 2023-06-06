package com.sankuai.waimai.business.address.msi;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.singleton.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.addrsdk.mvp.bean.AddressBean;
import com.sankuai.waimai.addrsdk.utils.e;
import com.sankuai.waimai.business.address.model.AddressBackInfo;
import com.sankuai.waimai.business.address.model.RefreshLocationResult;
import com.sankuai.waimai.business.address.util.c;
import com.sankuai.waimai.foundation.core.a;
import com.sankuai.waimai.foundation.core.base.activity.transfer.BaseActivityDelegate;
import com.sankuai.waimai.foundation.core.base.activity.transfer.TransferActivity;
import com.sankuai.waimai.foundation.core.service.abtest.ABStrategy;
import com.sankuai.waimai.foundation.location.v2.City;
import com.sankuai.waimai.foundation.location.v2.LocationResultCode;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.foundation.location.v2.WmAddress;
import com.sankuai.waimai.foundation.location.v2.d;
import com.sankuai.waimai.foundation.location.v2.h;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.platform.capacity.abtest.ABTestManager;
import com.sankuai.waimai.platform.domain.core.location.AddressItem;
import com.sankuai.waimai.platform.domain.manager.location.g;
import com.sankuai.waimai.platform.utils.f;
import com.tencent.smtt.sdk.TbsListener;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class LocateManuallyActivityDelegate extends BaseActivityDelegate {
    public static ChangeQuickRedirect a;
    private Bundle b;
    private String c;
    private WmAddress d;
    private String e;
    private boolean f;
    private int i;
    private String j;

    public LocateManuallyActivityDelegate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31e1465f3cee3f7487af0b4f681f6a34", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31e1465f3cee3f7487af0b4f681f6a34");
            return;
        }
        this.f = false;
        this.i = -1;
        this.j = "";
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.transfer.BaseActivityDelegate, com.sankuai.waimai.foundation.core.base.activity.transfer.lifecycle.a
    public final void a(TransferActivity transferActivity, @Nullable Bundle bundle) {
        String string;
        Object[] objArr = {transferActivity, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2908b216f196c5e9cc52086c8e888408", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2908b216f196c5e9cc52086c8e888408");
            return;
        }
        super.a(transferActivity, bundle);
        this.b = transferActivity.getIntent().getExtras();
        if (this.b == null) {
            transferActivity.finish();
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d9d4abc616ec348ecf55cb69d21b4539", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d9d4abc616ec348ecf55cb69d21b4539");
        } else if (this.h != null) {
            Intent intent = this.h.getIntent();
            if (intent != null) {
                String a2 = a(intent, GearsLocator.ADDRESS);
                String a3 = a(intent, "lat");
                String a4 = a(intent, "lng");
                String a5 = a(intent, "cityName");
                this.e = a(intent, RemoteMessageConst.Notification.NOTIFY_ID);
                if (!a.d() && !TextUtils.isEmpty(a2) && !TextUtils.isEmpty(a5) && !TextUtils.isEmpty(a3) && !TextUtils.isEmpty(a4)) {
                    WmAddress wmAddress = new WmAddress();
                    WMLocation wMLocation = new WMLocation(WMLocation.WM_LOCATION_ADD_ADDRSS);
                    try {
                        wMLocation.setLongitude(Double.parseDouble(a4));
                        wMLocation.setLatitude(Double.parseDouble(a3));
                    } catch (Exception unused) {
                    }
                    LocationResultCode locationResultCode = new LocationResultCode();
                    locationResultCode.a = 1200;
                    locationResultCode.b = "";
                    wMLocation.setLocationResultCode(locationResultCode);
                    wmAddress.setWMLocation(wMLocation);
                    wmAddress.setCreateTime(System.currentTimeMillis());
                    wmAddress.setAddress(a2);
                    City city = new City();
                    city.setCityName(a5);
                    wmAddress.setMafCity(city);
                    wmAddress.setMeitaunCity(city);
                    h.c(wmAddress.getWMLocation());
                    h.b(wmAddress);
                } else {
                    this.c = f.a(intent, "page_source");
                    String a6 = f.a(intent, "wm_address_from_external");
                    if (!TextUtils.isEmpty(a6)) {
                        this.d = WmAddress.parse(a6);
                    }
                    if (this.d != null && this.d.getWMLocation() != null && this.d.getWMLocation().getLocationResultCode() != null && this.d.getWMLocation().getLocationResultCode().a == 1200 && !TextUtils.isEmpty(this.d.getAddress())) {
                        h.c(this.d.getWMLocation());
                        h.b(this.d);
                    }
                }
            }
            if (TextUtils.isEmpty(this.c)) {
                this.c = "FROM_INTERNAL_LOCATE_MANUALLY";
            }
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "160fb29b7fa36afaaf6a9bce0355c15f", RobustBitConfig.DEFAULT_VALUE)) {
            string = (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "160fb29b7fa36afaaf6a9bce0355c15f");
        } else {
            WmAddress c = c();
            TransferActivity transferActivity2 = this.h;
            if (c != null && !d()) {
                String a7 = c.getMeitaunCity() != null ? g.a(c.getMeitaunCity().getCityName(), b.a.getString(R.string.wm_address_province), b.a.getString(R.string.wm_address_city)) : "";
                if (TextUtils.isEmpty(a7) && c.getMafCity() != null) {
                    a7 = g.a(c.getMafCity().getCityName(), transferActivity2.getString(R.string.wm_address_province), transferActivity2.getString(R.string.wm_address_city));
                }
                if (!TextUtils.isEmpty(a7)) {
                    string = a7;
                }
            }
            string = transferActivity2.getString(R.string.wm_address_poiList_locating_failed);
        }
        String str = string;
        String str2 = "";
        com.sankuai.waimai.addrsdk.base.a b = com.sankuai.waimai.addrsdk.manager.a.a().b();
        String v = b != null ? b.v() : "未定位";
        WmAddress c2 = c();
        if (c2 != null && !TextUtils.isEmpty(c2.getAddress())) {
            str2 = c2.getAddress();
        } else if ("FROM_INTERNAL_LOCATE_MANUALLY".equals(this.c)) {
            str2 = com.sankuai.waimai.foundation.location.g.i();
        }
        if (TextUtils.isEmpty(str2) || d()) {
            str2 = b.a.getString(R.string.wm_address_regeo_no_address);
        }
        String str3 = str2;
        Object[] objArr4 = {transferActivity, str3, v, str};
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "a5df2225c04625b2ef237dcec30bc99f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "a5df2225c04625b2ef237dcec30bc99f");
            return;
        }
        Bundle bundle2 = new Bundle();
        String str4 = "meituanwaimai://waimai.meituan.com";
        if (a.e()) {
            str4 = "imeituan://www.meituan.com";
        } else if (a.f()) {
            str4 = "dianping:/";
        }
        String str5 = str4;
        Map<String, String> a8 = com.sankuai.waimai.business.address.b.a(this.h);
        Map<String, String> b2 = com.sankuai.waimai.business.address.b.b(this.h);
        Map<String, String> b3 = com.sankuai.waimai.router.set_id.b.a().b();
        if (a8 != null) {
            a8.putAll(b2);
            a8.putAll(b3);
        } else {
            a8 = new HashMap<>();
        }
        Map<String, String> map = a8;
        String c3 = com.sankuai.waimai.platform.capacity.abtest.b.c(transferActivity);
        ABStrategy strategy = ABTestManager.getInstance(transferActivity).getStrategy("dianping_address_add_group1", null);
        String str6 = strategy != null ? strategy.expName : "";
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("waimai_address_create", c3);
            jSONObject.put("dianping_address_import", str6);
            jSONObject.put("page_source", this.c);
            jSONObject.put("address_name", str3);
            jSONObject.put("city", v);
            jSONObject.put("poi_city", str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        com.sankuai.waimai.foundation.router.a.a(transferActivity, com.sankuai.waimai.addrsdk.manager.a.a().a("locSelect", "mine", str5, d.a().toJson(com.sankuai.waimai.platform.domain.manager.location.a.a()), map, jSONObject.toString()), bundle2, 1005);
    }

    private String a(Intent intent, String str) {
        Object[] objArr = {intent, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41fd5ec9de43c39033595f8eb85a9529", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41fd5ec9de43c39033595f8eb85a9529");
        }
        try {
            Uri data = intent.getData();
            if (data != null) {
                String queryParameter = data.getQueryParameter(str);
                if (queryParameter != null) {
                    return queryParameter;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            return f.a(intent, str);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private WmAddress c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3315bfa9fb2f2d9abacf4d15519c00d", RobustBitConfig.DEFAULT_VALUE)) {
            return (WmAddress) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3315bfa9fb2f2d9abacf4d15519c00d");
        }
        if ("FROM_INTERNAL_LOCATE_MANUALLY".equals(this.c)) {
            return com.sankuai.waimai.foundation.location.v2.g.a().k();
        }
        return this.d;
    }

    private boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d6388d33ca3ed0417026948fe15c87c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d6388d33ca3ed0417026948fe15c87c")).booleanValue() : com.sankuai.waimai.foundation.location.v2.g.a().i() == null || !com.sankuai.waimai.foundation.location.v2.g.a().i().hasLocatedPermission;
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.transfer.BaseActivityDelegate, com.sankuai.waimai.foundation.core.base.activity.transfer.lifecycle.a
    public final void a(TransferActivity transferActivity, int i, int i2, Intent intent) {
        RefreshLocationResult refreshLocationResult;
        AddressBean addressBean;
        AddressItem addressItem;
        int i3;
        int i4;
        RefreshLocationResult refreshLocationResult2;
        AddressBean addressBean2;
        AddressItem addressItem2;
        int i5;
        Object[] objArr = {transferActivity, Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b6d1f74cf768448469550fbe9701c9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b6d1f74cf768448469550fbe9701c9f");
            return;
        }
        super.a(transferActivity, i, i2, intent);
        if (i == 1005 && intent != null) {
            String a2 = f.a(intent, "resultData");
            String a3 = f.a(intent, "appId");
            if (TextUtils.isEmpty(a2) || TextUtils.isEmpty(a3) || !"be7dcad4cf774fed".equals(a3)) {
                refreshLocationResult = null;
                addressBean = null;
                addressItem = null;
                i3 = -1;
                i4 = 0;
            } else {
                try {
                    AddressBackInfo addressBackInfo = (AddressBackInfo) d.a().fromJson(a2, (Class<Object>) AddressBackInfo.class);
                    if (addressBackInfo != null) {
                        i5 = addressBackInfo.addressOperateType;
                        this.i = i5;
                        addressBean2 = addressBackInfo.address;
                        addressItem2 = addressBackInfo.addressItem;
                        i4 = addressBackInfo.position;
                        refreshLocationResult2 = addressBackInfo.refreshLocationResult;
                        if (addressItem2 != null && addressItem2.id > 0) {
                            this.j = new Gson().toJson(addressItem2);
                        }
                    } else {
                        refreshLocationResult2 = null;
                        addressBean2 = null;
                        addressItem2 = null;
                        i5 = -1;
                        i4 = 0;
                    }
                    refreshLocationResult = refreshLocationResult2;
                    i3 = i5;
                    addressBean = addressBean2;
                    addressItem = addressItem2;
                } catch (Exception e) {
                    e.printStackTrace();
                    j();
                    return;
                }
            }
            if (i3 == 202) {
                if (addressBean != null && !TextUtils.isEmpty(addressBean.addressViewId)) {
                    this.j = new Gson().toJson(com.sankuai.waimai.platform.domain.manager.location.a.a(addressBean));
                }
                Object[] objArr2 = {Integer.valueOf(i3), addressBean};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c0714cb8912346e985254503c0ebcc34", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c0714cb8912346e985254503c0ebcc34");
                } else if (i3 != -1 && addressBean != null && !TextUtils.isEmpty(addressBean.addressViewId) && addressBean != null) {
                    if (g()) {
                        com.sankuai.waimai.foundation.location.g.a(e.a(addressBean.getLatitude() / 1000000.0d, 6), e.a(addressBean.getLongitude() / 1000000.0d, 6), addressBean.getAddressName());
                        com.sankuai.waimai.foundation.location.g.b(null);
                    }
                    String a4 = g.a(com.sankuai.waimai.platform.domain.manager.location.a.a(addressBean.getProvince(), addressBean.getCityName()), this.h.getString(R.string.wm_address_city));
                    if (g()) {
                        if (!TextUtils.isEmpty(a4)) {
                            com.sankuai.waimai.foundation.location.g.c(a4);
                        }
                        com.sankuai.waimai.platform.domain.manager.location.a.b(com.sankuai.waimai.platform.domain.manager.location.a.a(addressBean));
                    }
                    double latitude = addressBean.getLatitude();
                    double longitude = addressBean.getLongitude();
                    String addressName = addressBean.getAddressName();
                    String cityCode = addressBean.getCityCode();
                    Object[] objArr3 = {Double.valueOf(latitude), Double.valueOf(longitude), addressName, a4, cityCode};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "051b4c4527b4a4d19219b0fe5f2b5f4f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "051b4c4527b4a4d19219b0fe5f2b5f4f");
                    } else {
                        WmAddress wmAddress = new WmAddress();
                        WMLocation wMLocation = new WMLocation(WMLocation.WM_LOCATION_ADD_ADDRSS);
                        wMLocation.setLongitude(e.a(longitude / 1000000.0d, 6));
                        wMLocation.setLatitude(e.a(latitude / 1000000.0d, 6));
                        LocationResultCode locationResultCode = new LocationResultCode();
                        locationResultCode.a = 1200;
                        locationResultCode.b = "";
                        wMLocation.setLocationResultCode(locationResultCode);
                        wmAddress.setWMLocation(wMLocation);
                        wmAddress.setCreateTime(System.currentTimeMillis());
                        wmAddress.setAddress(addressName);
                        City city = new City();
                        city.setCityName(a4);
                        city.setCityCode(cityCode);
                        wmAddress.setMafCity(city);
                        if (g()) {
                            com.sankuai.waimai.foundation.location.v2.g.a().a(wmAddress, com.sankuai.waimai.platform.domain.manager.location.v2.b.LOCATE_MANUALLY.toString(), false);
                        }
                        a(addressName, wmAddress);
                    }
                }
                j();
                return;
            }
            switch (i3) {
                case TbsListener.ErrorCode.UNZIP_DIR_ERROR /* 205 */:
                    a(addressItem, 1, i4);
                    return;
                case TbsListener.ErrorCode.UNZIP_IO_ERROR /* 206 */:
                    Object[] objArr4 = {addressItem};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "dbb3ed3d2c87012ec52457c4bb15b7d6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "dbb3ed3d2c87012ec52457c4bb15b7d6");
                    } else if (addressItem != null) {
                        com.sankuai.waimai.business.address.model.a aVar = new com.sankuai.waimai.business.address.model.a(addressItem.addrBrief, addressItem.addrDesc, addressItem.lat, addressItem.lng, addressItem.cityCode, addressItem.cityName, addressItem.province, addressItem.district, addressItem.type, addressItem.mapSearchPoiId, addressItem.source);
                        double d = aVar.d / 1000000.0d;
                        double d2 = aVar.e / 1000000.0d;
                        String str = aVar.b;
                        String str2 = aVar.f;
                        if (g()) {
                            com.sankuai.waimai.foundation.location.g.a(d, d2, str);
                            com.sankuai.waimai.foundation.location.g.b(str2);
                            com.sankuai.waimai.foundation.location.g.k();
                        }
                        com.sankuai.waimai.platform.domain.manager.location.a.b(this.h);
                        com.sankuai.waimai.platform.domain.manager.location.a.c();
                        WmAddress wmAddress2 = new WmAddress();
                        wmAddress2.setStatusCode(1200);
                        WMLocation wMLocation2 = new WMLocation(WMLocation.WM_MANUALLY_LOCATE_PROVIDER);
                        wMLocation2.setLatitude(d);
                        wMLocation2.setLongitude(d2);
                        LocationResultCode locationResultCode2 = new LocationResultCode();
                        locationResultCode2.a = 1200;
                        locationResultCode2.b = "";
                        wMLocation2.setLocationResultCode(locationResultCode2);
                        wmAddress2.setWMLocation(wMLocation2);
                        wmAddress2.setCreateTime(System.currentTimeMillis());
                        wmAddress2.setAddress(str);
                        City city2 = new City();
                        city2.setCityName(aVar.g);
                        city2.setCityCode(aVar.f);
                        wmAddress2.setMafCity(city2);
                        if (g()) {
                            com.sankuai.waimai.foundation.location.v2.g.a().a(wmAddress2, com.sankuai.waimai.platform.domain.manager.location.v2.b.LOCATE_MANUALLY.toString(), false);
                        }
                        a(str, wmAddress2);
                    }
                    j();
                    return;
                case TbsListener.ErrorCode.UNZIP_OTHER_ERROR /* 207 */:
                    a(addressItem, 0, i4);
                    return;
                case TbsListener.ErrorCode.EXCEED_DEXOPT_RETRY_NUM /* 208 */:
                    Object[] objArr5 = {refreshLocationResult};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    RefreshLocationResult refreshLocationResult3 = refreshLocationResult;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "6bd61e84677412832bce3af0bb9b6b1c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "6bd61e84677412832bce3af0bb9b6b1c");
                    } else if (refreshLocationResult3 != null) {
                        double a5 = !TextUtils.isEmpty(refreshLocationResult3.latitude) ? r.a(refreshLocationResult3.latitude, 0.0d) : 0.0d;
                        double a6 = TextUtils.isEmpty(refreshLocationResult3.longitude) ? 0.0d : r.a(refreshLocationResult3.longitude, 0.0d);
                        WmAddress wmAddress3 = new WmAddress();
                        wmAddress3.setStatusCode(1200);
                        WMLocation wMLocation3 = new WMLocation(WMLocation.WM_MANUALLY_LOCATE_PROVIDER);
                        wMLocation3.setLatitude(a5 / 1000000.0d);
                        wMLocation3.setLongitude(a6 / 1000000.0d);
                        wmAddress3.setWMLocation(wMLocation3);
                        wmAddress3.setCreateTime(System.currentTimeMillis());
                        if (!TextUtils.isEmpty(refreshLocationResult3.addressName)) {
                            wmAddress3.setAddress(refreshLocationResult3.addressName);
                        }
                        if (!TextUtils.isEmpty(refreshLocationResult3.cityName)) {
                            City city3 = new City();
                            city3.setCityName(refreshLocationResult3.cityName);
                            wmAddress3.setMafCity(city3);
                        }
                        a(refreshLocationResult3.addressName, wmAddress3);
                    }
                    j();
                    return;
                default:
                    h();
                    j();
                    return;
            }
        }
        h();
        j();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(com.sankuai.waimai.platform.domain.core.location.AddressItem r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.address.msi.LocateManuallyActivityDelegate.a(com.sankuai.waimai.platform.domain.core.location.AddressItem, int, int):void");
    }

    public final void a(WmAddress wmAddress, boolean z) {
        Object[] objArr = {wmAddress, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a664d6ba3c0dc6a1b03e88ae1bd8fab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a664d6ba3c0dc6a1b03e88ae1bd8fab");
        } else if (!this.f || wmAddress == null) {
        } else {
            a(wmAddress.getAddress(), wmAddress);
        }
    }

    private void a(@NonNull WmAddress wmAddress) {
        Object[] objArr = {wmAddress};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed57bbd7b09a812d37b04aad032fc97b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed57bbd7b09a812d37b04aad032fc97b");
        } else if (a.d() || wmAddress.getWMLocation() == null || this.h == null) {
        } else {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject.put(GearsLocator.ADDRESS, wmAddress.getAddress());
                jSONObject.put(Constants.PRIVACY.KEY_LONGITUDE, wmAddress.getWMLocation().getLongitude());
                jSONObject.put(Constants.PRIVACY.KEY_LATITUDE, wmAddress.getWMLocation().getLatitude());
                jSONObject.put(RemoteMessageConst.Notification.NOTIFY_ID, this.e);
                jSONObject2.put("info", jSONObject);
                Intent intent = new Intent();
                intent.setPackage(this.h.getPackageName());
                intent.setAction("com.meituan.waimai.didGetLocationWithAddress.notification");
                intent.putExtra("info", jSONObject2.toString());
                LocalBroadcastManager.getInstance(this.h).sendBroadcast(intent);
            } catch (Exception unused) {
            }
        }
    }

    private boolean g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8475d3f230f2112f997feb8c0c86a3b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8475d3f230f2112f997feb8c0c86a3b")).booleanValue() : ("search".equals(this.c) || "shoppingcart".equals(this.c)) ? false : true;
    }

    private void h() {
        WmAddress k;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2f56e17b1727c6189ddcbe313ee3e78", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2f56e17b1727c6189ddcbe313ee3e78");
        } else if (!g() || (k = com.sankuai.waimai.foundation.location.v2.g.a().k()) == null || k.getWMLocation() == null || k.getWMLocation().hasLocatedPermission) {
        } else {
            if (TextUtils.isEmpty(k.getAddress()) || b.a.getString(R.string.wm_default_address_loading).equals(k.getAddress())) {
                String string = b.a.getString(R.string.wm_default_address);
                k.setAddress(string);
                com.sankuai.waimai.foundation.location.v2.g.a().a(k, com.sankuai.waimai.platform.domain.manager.location.v2.b.LOCATE_MANUALLY.toString(), false);
                a(string, k);
            }
        }
    }

    private void a(String str, WmAddress wmAddress) {
        Object[] objArr = {str, wmAddress};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53762c5284a13ec10d83239abe36bc8b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53762c5284a13ec10d83239abe36bc8b");
        } else if (this.h == null) {
        } else {
            f();
            if (g()) {
                com.sankuai.waimai.platform.domain.manager.location.a.a(wmAddress);
            }
            String str2 = null;
            if (wmAddress != null) {
                str2 = wmAddress.toString();
                a(wmAddress);
            }
            Intent intent = this.h.getIntent();
            intent.setFlags(intent.getFlags() & (-2) & (-3));
            if (!TextUtils.isEmpty(str)) {
                intent.putExtra("arg_selected_address", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                intent.putExtra("selected_address", str2);
            }
            if (this.i > 0) {
                intent.putExtra("operator_type", this.i);
            }
            if (!TextUtils.isEmpty(this.j)) {
                intent.putExtra("address_info", this.j);
            }
            this.h.setResult(-1, intent);
        }
    }

    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42c70a9f0312d459ca6dbc153f451237", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42c70a9f0312d459ca6dbc153f451237");
        } else if (this.h == null) {
        } else {
            c.b(this.h);
        }
    }
}
