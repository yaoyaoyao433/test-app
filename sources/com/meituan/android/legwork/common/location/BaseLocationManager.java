package com.meituan.android.legwork.common.location;

import android.content.Intent;
import android.os.Process;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.content.Loader;
import android.text.TextUtils;
import com.facebook.react.bridge.Promise;
import com.meituan.android.common.locate.MtLocation;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.android.legwork.bean.address.MtRevGeoBean;
import com.meituan.android.legwork.bean.mtmap.Admin;
import com.meituan.android.legwork.common.util.PmUtil;
import com.meituan.android.legwork.net.response.MapBaseEntity;
import com.meituan.android.legwork.net.service.CommonAPIService;
import com.meituan.android.legwork.utils.q;
import com.meituan.android.legwork.utils.x;
import com.meituan.android.privacy.locate.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.location.v2.City;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.foundation.location.v2.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class BaseLocationManager implements com.meituan.android.legwork.common.location.b {
    public static ChangeQuickRedirect a;
    public double b;
    public double c;
    public String d;
    boolean e;
    public Map<String, b> f;
    public String g;
    public int h;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
        void a(MtLocation mtLocation);
    }

    public static int a(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1b8d527fa272aad645e5312f8069c301", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1b8d527fa272aad645e5312f8069c301")).intValue() : (int) (d * 1000000.0d);
    }

    public BaseLocationManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9956e50e34957ea19a55d38b022e0f48", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9956e50e34957ea19a55d38b022e0f48");
            return;
        }
        this.d = "";
        this.e = false;
        this.g = "";
    }

    private boolean b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee387d62e313bcf09b683e8896aae2d2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee387d62e313bcf09b683e8896aae2d2")).booleanValue();
        }
        if (PmUtil.a() == 2) {
            return true;
        }
        com.meituan.android.legwork.common.util.a a2 = com.meituan.android.legwork.common.util.a.a();
        List<String> list = (a2.b == null || a2.b.businessConfig == null || a2.b.businessConfig.enterPaotuiWMChannels == null) ? null : a2.b.businessConfig.enterPaotuiWMChannels;
        return list == null || list.size() <= 0 || list.contains(str);
    }

    private boolean b(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9350767dc1f984756085cbdd90136a64", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9350767dc1f984756085cbdd90136a64")).booleanValue();
        }
        if (intent == null || intent.getData() == null) {
            return false;
        }
        String a2 = com.meituan.android.legwork.ui.base.c.a(intent.getData());
        if (TextUtils.isEmpty(a2)) {
            return false;
        }
        HashSet hashSet = new HashSet();
        hashSet.add(com.meituan.android.legwork.a.a().getResources().getString(R.string.legwork_scheme_path_homepage));
        hashSet.add(com.meituan.android.legwork.a.a().getResources().getString(R.string.legwork_scheme_path_homepage_two));
        hashSet.add(com.meituan.android.legwork.a.a().getResources().getString(R.string.legwork_scheme_path_send_preview));
        hashSet.add(com.meituan.android.legwork.a.a().getResources().getString(R.string.legwork_scheme_path_preview));
        hashSet.add(com.meituan.android.legwork.a.a().getResources().getString(R.string.legwork_scheme_path_preview_two));
        hashSet.add(com.meituan.android.legwork.a.a().getResources().getString(R.string.legwork_scheme_path_preview_hot));
        boolean contains = hashSet.contains(a2);
        x.c("BaseLocationManager.checkBlankPage()", "isBlankPage =", Boolean.valueOf(contains));
        return contains;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.content.Intent r22) {
        /*
            Method dump skipped, instructions count: 603
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.legwork.common.location.BaseLocationManager.a(android.content.Intent):void");
    }

    private void c(Intent intent) {
        WMLocation wMLocation;
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0b2753abf0822372d31601cfdeea6b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0b2753abf0822372d31601cfdeea6b4");
            return;
        }
        this.c = 0.0d;
        this.b = 0.0d;
        this.d = "";
        this.g = "";
        a();
        String str = "default";
        String str2 = "";
        if (intent != null && intent.getData() != null) {
            str2 = intent.getData().getQueryParameter("channel");
        }
        if (b(str2)) {
            City city = null;
            try {
                wMLocation = g.a().p();
            } catch (Exception e) {
                x.e("BaseLocationManager.initDefaultLocationForPageNotInBlank()", "get wm location error, msg:", e);
                x.a(e);
                wMLocation = null;
            }
            if (wMLocation != null && com.meituan.android.legwork.utils.address.a.a(wMLocation.getLongitude(), wMLocation.getLatitude())) {
                this.b = wMLocation.getLongitude();
                this.c = wMLocation.getLatitude();
                try {
                    city = g.a().o();
                } catch (Exception e2) {
                    x.e("BaseLocationManager.initDefaultLocation()", "get wm maf city error, msg:", e2);
                    x.a(e2);
                }
                if (city != null) {
                    this.d = city.getCityName();
                    this.g = city.getCityCode();
                } else {
                    try {
                        this.d = com.sankuai.waimai.foundation.location.g.d();
                        this.g = com.sankuai.waimai.foundation.location.g.c();
                    } catch (Exception e3) {
                        x.e("BaseLocationManager.initDefaultLocation()", "get wm location city error, msg:", e3);
                        x.a(e3);
                    }
                }
                str = "wmHomePage";
                this.h = 3;
            }
        }
        if ((TextUtils.isEmpty(this.d) || !a(this.g)) && com.meituan.android.legwork.utils.address.a.a(b(), c())) {
            this.b = b();
            this.c = c();
            this.d = d();
            this.g = e();
            this.h = 1;
            str = "location";
        }
        if ((TextUtils.isEmpty(this.d) || !a(this.g)) && com.meituan.android.legwork.utils.address.a.a(h(), i())) {
            this.b = h();
            this.c = i();
            this.d = g();
            this.g = j();
            a();
            str = "choose";
        }
        HashMap hashMap = new HashMap(2);
        if (com.meituan.android.legwork.utils.address.a.a(this.b, this.c)) {
            hashMap.put("status", "valid");
        } else {
            hashMap.put("status", "invalid");
        }
        q.a("legwork_default_locate", 2, hashMap);
        x.b("BaseLocationManager.initDefaultLocationForPageNotInBlank()", "initDefaultLocation lng=", Double.valueOf(this.b), " lat=", Double.valueOf(this.c), " cityName=", this.d, " mDefaultCityId=", this.g);
        x.d("BaseLocationManager.initDefaultLocationForPageNotInBlank()", "mDefaultCityId:", this.g, " mDefaultCityIdType:", Integer.valueOf(this.h), " cityInfoFrom:", str);
        if (TextUtils.isEmpty(this.d) || !a(this.g)) {
            this.c = 39.908821d;
            this.b = 116.397469d;
            this.d = "北京市";
            this.g = "110100";
            this.h = 3;
        }
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba480f6fc268f74af60014a8003dec1b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba480f6fc268f74af60014a8003dec1b");
        } else {
            PmUtil.a(new PmUtil.b() { // from class: com.meituan.android.legwork.common.location.BaseLocationManager.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.legwork.common.util.PmUtil.b
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d55f33236512f5e71336a5b05b8cff36", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d55f33236512f5e71336a5b05b8cff36");
                    } else {
                        BaseLocationManager.this.h = 1;
                    }
                }

                @Override // com.meituan.android.legwork.common.util.PmUtil.b
                public final void b() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "abec30a270c3ac4be9aaa83d6d9f675c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "abec30a270c3ac4be9aaa83d6d9f675c");
                    } else {
                        BaseLocationManager.this.h = 3;
                    }
                }

                @Override // com.meituan.android.legwork.common.util.PmUtil.b
                public final void c() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1be49d140e12aed5e86a15f0654ebb29", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1be49d140e12aed5e86a15f0654ebb29");
                    } else {
                        BaseLocationManager.this.h = 2;
                    }
                }
            });
        }
    }

    public final double b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15ec27f907f28cba17888a8d165c6e79", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15ec27f907f28cba17888a8d165c6e79")).doubleValue();
        }
        MtLocation a2 = f.a().a("android-legwork");
        if (a2 == null) {
            return 0.0d;
        }
        return a2.getLongitude();
    }

    public final double c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5e41c9deb8f286608df91aadc887739", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5e41c9deb8f286608df91aadc887739")).doubleValue();
        }
        MtLocation a2 = f.a().a("android-legwork");
        if (a2 == null) {
            return 0.0d;
        }
        return a2.getLatitude();
    }

    @NonNull
    public final String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14feb6d3239c47111071ed68422b06f0", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14feb6d3239c47111071ed68422b06f0");
        }
        MtLocation a2 = f.a().a("android-legwork");
        return (a2 == null || a2.getExtras() == null) ? "" : a2.getExtras().getString("city");
    }

    @NonNull
    public final String e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c78b3a8cb472d463bb3e5795a73c494c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c78b3a8cb472d463bb3e5795a73c494c");
        }
        MtLocation a2 = f.a().a("android-legwork");
        return (a2 == null || a2.getExtras() == null) ? "" : String.valueOf(a2.getExtras().getLong(GearsLocator.MT_CITY_ID));
    }

    public final float f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cabcb0a99ccbb0d8ac7d88e39c68566", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cabcb0a99ccbb0d8ac7d88e39c68566")).floatValue();
        }
        MtLocation a2 = f.a().a("android-legwork");
        if (a2 == null) {
            return 0.0f;
        }
        return a2.getAccuracy();
    }

    @NonNull
    public final String g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "810065ca0e2110056266c032de76378c", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "810065ca0e2110056266c032de76378c") : com.dianping.mainboard.a.b().d == null ? "" : com.dianping.mainboard.a.b().d;
    }

    public static int a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1e1b49e59da29b53fa085ffbb6539ba4", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1e1b49e59da29b53fa085ffbb6539ba4")).intValue() : Math.round(f);
    }

    public final void a(double d, double d2, String str, String str2, boolean z, Promise promise) {
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2), str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0), promise};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40c93bc9e118d945bd81a1979ab4badf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40c93bc9e118d945bd81a1979ab4badf");
        } else if (!com.meituan.android.legwork.utils.address.a.a(d, d2)) {
            x.b("BaseLocationManager.updateDefaultLocate()", "location valid ", " defaultLng=", Double.valueOf(d), " defaultLat=", Double.valueOf(d2), " cityId=", str2, " cityName=", str);
            if (promise != null) {
                promise.resolve(Boolean.FALSE);
            }
        } else {
            this.b = d;
            this.c = d2;
            this.e = false;
            if (!TextUtils.isEmpty(str) && a(str2)) {
                this.d = str;
                this.g = str2;
                this.h = 3;
                if (promise != null) {
                    promise.resolve(Boolean.TRUE);
                }
            } else if (z) {
                a(promise);
            } else if (promise != null) {
                promise.resolve(Boolean.TRUE);
            }
            x.b("BaseLocationManager.updateDefaultLocate()", "updateDefault", " mLastDefaultLng=", Double.valueOf(this.b), " mLastDefaultLat=", Double.valueOf(this.c), " mDefaultCityId=", this.g, " mLastDefaultCityName=", this.d);
        }
    }

    private void a(final Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "404176c81bfd910bead789930f26219b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "404176c81bfd910bead789930f26219b");
        } else if (this.e) {
            if (promise != null) {
                promise.resolve(Boolean.TRUE);
            }
        } else if (!com.meituan.android.legwork.utils.address.a.a(this.b, this.c)) {
            if (promise != null) {
                promise.resolve(Boolean.FALSE);
            }
        } else {
            this.e = true;
            final double d = this.b;
            final double d2 = this.c;
            d.a(new com.meituan.android.legwork.net.subscriber.a<MapBaseEntity<MtRevGeoBean>>() { // from class: com.meituan.android.legwork.common.location.BaseLocationManager.2
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.legwork.net.subscriber.a
                public final /* synthetic */ void a(MapBaseEntity<MtRevGeoBean> mapBaseEntity) {
                    MapBaseEntity<MtRevGeoBean> mapBaseEntity2 = mapBaseEntity;
                    Object[] objArr2 = {mapBaseEntity2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c0cf55ee7ef862ee423e9064f407ac4b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c0cf55ee7ef862ee423e9064f407ac4b");
                        return;
                    }
                    BaseLocationManager.this.e = false;
                    if (promise != null) {
                        promise.resolve(Boolean.TRUE);
                    }
                    if (Double.compare(d, BaseLocationManager.this.b) != 0 || Double.compare(d2, BaseLocationManager.this.c) != 0) {
                        x.b("BaseLocationManager.getDefaultCityInfo()", "get city name by location abandoned", " defaultLng=", Double.valueOf(BaseLocationManager.this.b), " requestingLng=", Double.valueOf(d), " defaultLat=", Double.valueOf(BaseLocationManager.this.c), " requestingLat=", Double.valueOf(d2));
                    } else if (mapBaseEntity2 == null || mapBaseEntity2.status != 200 || mapBaseEntity2.result == null || mapBaseEntity2.result.addInfo == null || mapBaseEntity2.wmCityId <= 0) {
                        x.e("BaseLocationManager.getDefaultCityInfo()", "get city name by location failed");
                    } else {
                        String str = "";
                        Iterator<Admin> it = mapBaseEntity2.result.addInfo.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Admin next = it.next();
                            if (next != null && TextUtils.equals(next.level, "4")) {
                                str = next.name;
                            } else if (next != null && TextUtils.equals(next.level, "5")) {
                                BaseLocationManager.this.d = next.name;
                                break;
                            }
                        }
                        if (TextUtils.isEmpty(BaseLocationManager.this.d)) {
                            BaseLocationManager.this.d = str;
                        }
                        BaseLocationManager.this.g = String.valueOf(mapBaseEntity2.wmCityId);
                        BaseLocationManager.this.h = 3;
                        x.b("BaseLocationManager.getDefaultCityInfo()", "get city name by location success, cityName is " + BaseLocationManager.this.d + " mDefaultCityId is " + BaseLocationManager.this.g);
                    }
                }

                @Override // com.meituan.android.legwork.net.subscriber.a
                public final void a(boolean z, int i, String str) {
                    Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "27190fde911eb596939761ec66fc3f22", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "27190fde911eb596939761ec66fc3f22");
                        return;
                    }
                    BaseLocationManager.this.e = false;
                    if (promise != null) {
                        promise.resolve(Boolean.FALSE);
                    }
                    x.e("BaseLocationManager.checkAndGetDefaultCityName()", "get city name by location failed error,errCode:" + i + ",msg:" + str);
                }
            }, ((CommonAPIService) com.meituan.android.legwork.net.manager.a.a().a(CommonAPIService.class)).regeo(this.b + CommonConstant.Symbol.COMMA + this.c).b(rx.schedulers.a.e()).c(rx.schedulers.a.e()).a(rx.android.schedulers.a.a()));
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class LegworkOnLoadCompleteListener implements Loader.OnLoadCompleteListener<MtLocation> {
        public static ChangeQuickRedirect a;
        public List<Loader.OnLoadCompleteListener<MtLocation>> b;
        public a c;

        public static /* synthetic */ void a(LegworkOnLoadCompleteListener legworkOnLoadCompleteListener, Loader.OnLoadCompleteListener onLoadCompleteListener) {
            Object[] objArr = {onLoadCompleteListener};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, legworkOnLoadCompleteListener, changeQuickRedirect, false, "d6d69244a2b7f69b1c7fff91da70c05a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, legworkOnLoadCompleteListener, changeQuickRedirect, false, "d6d69244a2b7f69b1c7fff91da70c05a");
            } else {
                legworkOnLoadCompleteListener.b.add(onLoadCompleteListener);
            }
        }

        @Override // android.support.v4.content.Loader.OnLoadCompleteListener
        public final /* synthetic */ void onLoadComplete(@NonNull Loader<MtLocation> loader, @Nullable MtLocation mtLocation) {
            MtLocation mtLocation2 = mtLocation;
            Object[] objArr = {loader, mtLocation2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4bb0a034c866382f1b213dc05efef37e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4bb0a034c866382f1b213dc05efef37e");
                return;
            }
            Object[] objArr2 = new Object[1];
            StringBuilder sb = new StringBuilder("LegworkOnLoadCompleteListener 获取定位完成:");
            sb.append(loader);
            sb.append(" data:");
            sb.append(mtLocation2 == null ? StringUtil.NULL : String.format("status: %1$d location:[%2$,.2f,%3$,.2f]", Integer.valueOf(mtLocation2.getStatusCode()), Double.valueOf(mtLocation2.getLongitude()), Double.valueOf(mtLocation2.getLatitude())));
            objArr2[0] = sb.toString();
            x.c("BaseLocationManager.requestActualLocation", objArr2);
            for (Loader.OnLoadCompleteListener<MtLocation> onLoadCompleteListener : this.b) {
                if (onLoadCompleteListener != null) {
                    onLoadCompleteListener.onLoadComplete(loader, mtLocation2);
                }
            }
            if (this.c != null) {
                this.c.a(mtLocation2);
            }
        }

        private LegworkOnLoadCompleteListener(Loader.OnLoadCompleteListener<MtLocation> onLoadCompleteListener, a aVar) {
            Object[] objArr = {onLoadCompleteListener, aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1e91116f17fe12b1ed8a348338ddd26", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1e91116f17fe12b1ed8a348338ddd26");
                return;
            }
            this.b = new ArrayList();
            this.b.add(onLoadCompleteListener);
            this.c = aVar;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class b {
        public static ChangeQuickRedirect a;
        public Loader<MtLocation> b;
        public LegworkOnLoadCompleteListener c;

        public b(Loader<MtLocation> loader, Loader.OnLoadCompleteListener<MtLocation> onLoadCompleteListener, a aVar) {
            Object[] objArr = {BaseLocationManager.this, loader, onLoadCompleteListener, aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f311a2a0e52132ab6b049a14f0c4dde7", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f311a2a0e52132ab6b049a14f0c4dde7");
                return;
            }
            this.b = loader;
            this.c = new LegworkOnLoadCompleteListener(onLoadCompleteListener, aVar);
            this.b.registerListener(Process.myPid(), this.c);
        }
    }

    public boolean a(String str) {
        int i;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f56005f690036bdd669bd1ac9256fe0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f56005f690036bdd669bd1ac9256fe0")).booleanValue();
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                i = Integer.valueOf(str).intValue();
            } catch (NumberFormatException e) {
                x.e("BaseLocationManager.isCityIdAvailable()", "transform city id to int failed sg:", e);
                x.a(e);
                i = 0;
            }
            if (i > 0) {
                return true;
            }
        }
        return false;
    }
}
