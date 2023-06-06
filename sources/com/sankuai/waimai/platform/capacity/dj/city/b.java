package com.sankuai.waimai.platform.capacity.dj.city;

import android.content.Context;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.Loader;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.meituan.android.common.locate.LocationLoaderFactory;
import com.meituan.android.common.locate.MtLocation;
import com.meituan.android.privacy.locate.g;
import com.meituan.android.singleton.e;
import com.meituan.msi.api.extension.wm.common.GetGBCityInfoResponse;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.location.geo.MtMobileApi;
import com.sankuai.waimai.foundation.location.model.AdminInfo;
import com.sankuai.waimai.foundation.location.model.CityResponse;
import com.sankuai.waimai.foundation.location.model.LocationBaseResponse;
import com.sankuai.waimai.foundation.location.net.b;
import com.sankuai.waimai.platform.capacity.dj.city.b;
import com.sankuai.waimai.platform.net.service.d;
import com.sankuai.waimai.platform.utils.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import rx.functions.f;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static final long b = TimeUnit.MINUTES.toMillis(2);
    private static final e<b> k = new e<b>() { // from class: com.sankuai.waimai.platform.capacity.dj.city.b.1
        public static ChangeQuickRedirect a;

        @Override // com.meituan.android.singleton.e
        public final /* synthetic */ b a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df9554dedcfe326b5dd6d4d9edea350b", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df9554dedcfe326b5dd6d4d9edea350b") : new b();
        }
    };
    private CityInfo c;
    private final List<AddrInfo> d;
    private final Map<String, g> e;
    private final AtomicLong f;
    private final AtomicLong g;
    private f<MtLocation> h;
    private final List<rx.functions.b<CityInfo>> i;
    private final AtomicBoolean j;

    public static /* synthetic */ g a(b bVar, String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "f87cb8f65f12da60493bb9bcf366be95", RobustBitConfig.DEFAULT_VALUE)) {
            return (g) PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "f87cb8f65f12da60493bb9bcf366be95");
        }
        if (bVar.e.get(str) == null) {
            bVar.e.put(str, g.a((com.meituan.android.privacy.locate.lifecycle.b) null, str, com.meituan.android.singleton.f.a()));
        }
        return bVar.e.get(str);
    }

    public static /* synthetic */ void a(b bVar, double d, double d2, final long j, final String str, final rx.functions.b bVar2) {
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2), new Long(j), str, bVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "e1c05e7ceca92fad5103c99e9532aa2a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "e1c05e7ceca92fad5103c99e9532aa2a");
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (elapsedRealtime - (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "b83c7620bb5215b1462538dbdaf4d2ac", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "b83c7620bb5215b1462538dbdaf4d2ac")).longValue() : bVar.f.get()) < b) {
            if (bVar.c != null) {
                bVar2.call(bVar.c);
                return;
            } else if (bVar.j.get()) {
                bVar.i.add(bVar2);
                return;
            } else {
                bVar2.call(null);
                return;
            }
        }
        bVar.j.set(true);
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "d1094ce676687b3228ffef27b12a22d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "d1094ce676687b3228ffef27b12a22d7");
        } else {
            bVar.f.set(SystemClock.elapsedRealtime());
        }
        d.a();
        com.sankuai.waimai.foundation.location.net.b.a(((MtMobileApi) com.sankuai.waimai.foundation.location.net.b.a((Class<Object>) MtMobileApi.class)).getCityInfo(d + CommonConstant.Symbol.COMMA + d2, "0", 1, 1), new b.AbstractC0949b<LocationBaseResponse<CityResponse>>() { // from class: com.sankuai.waimai.platform.capacity.dj.city.b.6
            public static ChangeQuickRedirect a;

            @Override // rx.e
            public final /* synthetic */ void onNext(Object obj) {
                LocationBaseResponse locationBaseResponse = (LocationBaseResponse) obj;
                Object[] objArr4 = {locationBaseResponse};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "84dc6f7b9ff33ec475abaa6640e5a5e9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "84dc6f7b9ff33ec475abaa6640e5a5e9");
                    return;
                }
                b.this.j.set(false);
                try {
                    b.this.d.clear();
                    List<AdminInfo> list = ((CityResponse) locationBaseResponse.data).regeoInfo.c;
                    if (list != null && list.size() != 0) {
                        for (AdminInfo adminInfo : list) {
                            b.this.d.add(new AddrInfo(adminInfo.adminLevel, adminInfo.name, adminInfo.adminCode, adminInfo.levelDesc));
                        }
                        b.this.c = new CityInfo(b.this.d, b.this.d, j);
                        a a2 = a.a();
                        CityInfo cityInfo = b.this.c;
                        String str2 = str;
                        Object[] objArr5 = {cityInfo, str2};
                        ChangeQuickRedirect changeQuickRedirect5 = a.a;
                        if (PatchProxy.isSupport(objArr5, a2, changeQuickRedirect5, false, "31c515a6e870e98c41debb37ffdec7b2", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, a2, changeQuickRedirect5, false, "31c515a6e870e98c41debb37ffdec7b2");
                        } else if (cityInfo != null) {
                            a2.b = cityInfo;
                            MtLocation a3 = com.meituan.android.privacy.locate.f.a().a(str2);
                            if (a3 != null) {
                                CityInfoCacheKey cityInfoCacheKey = new CityInfoCacheKey(a3.getLatitude(), a3.getLongitude());
                                a2.c.put(cityInfoCacheKey, cityInfo);
                                String str3 = cityInfoCacheKey.cipStoreKey;
                                Object[] objArr6 = {str3, cityInfo};
                                ChangeQuickRedirect changeQuickRedirect6 = a.a;
                                if (PatchProxy.isSupport(objArr6, a2, changeQuickRedirect6, false, "76e2d26585eb529562d1f1cd35d7c0c5", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr6, a2, changeQuickRedirect6, false, "76e2d26585eb529562d1f1cd35d7c0c5");
                                } else {
                                    a2.a(com.meituan.android.singleton.b.a).a(str3, cityInfo);
                                }
                            }
                        }
                        bVar2.call(b.this.c);
                        b.c(b.this, b.this.c);
                        return;
                    }
                    bVar2.call(null);
                } catch (Exception unused) {
                    bVar2.call(null);
                    b.c(b.this, null);
                }
            }

            @Override // rx.e
            public final void onError(Throwable th) {
                Object[] objArr4 = {th};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "374433201283886f1abf81f44f7327c0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "374433201283886f1abf81f44f7327c0");
                    return;
                }
                bVar2.call(null);
                b.this.j.set(false);
                b.c(b.this, null);
                com.sankuai.waimai.foundation.utils.log.a.a(th);
            }
        }, com.sankuai.waimai.foundation.location.net.b.b);
    }

    public static /* synthetic */ GetGBCityInfoResponse b(b bVar, CityInfo cityInfo) {
        List<AddrInfo> list;
        Object[] objArr = {cityInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "4f9b83d723ff9796c0524edce4db53b2", RobustBitConfig.DEFAULT_VALUE)) {
            return (GetGBCityInfoResponse) PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "4f9b83d723ff9796c0524edce4db53b2");
        }
        GetGBCityInfoResponse getGBCityInfoResponse = new GetGBCityInfoResponse();
        getGBCityInfoResponse.actual_city_info = new ArrayList();
        getGBCityInfoResponse.city_info = new ArrayList();
        if (cityInfo != null && (list = cityInfo.actual_city_info) != null && list.size() != 0) {
            for (AddrInfo addrInfo : list) {
                GetGBCityInfoResponse.CityInfo cityInfo2 = new GetGBCityInfoResponse.CityInfo();
                cityInfo2.admin_code = addrInfo.admin_code;
                StringBuilder sb = new StringBuilder();
                sb.append(addrInfo.admin_level);
                cityInfo2.admin_level = sb.toString();
                cityInfo2.name = addrInfo.name;
                cityInfo2.level_desc = addrInfo.level_desc;
                getGBCityInfoResponse.city_info.add(cityInfo2);
                GetGBCityInfoResponse.ActualCityInfo actualCityInfo = new GetGBCityInfoResponse.ActualCityInfo();
                actualCityInfo.admin_code = addrInfo.admin_code;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(addrInfo.admin_level);
                actualCityInfo.admin_level = sb2.toString();
                actualCityInfo.name = addrInfo.name;
                actualCityInfo.level_desc = addrInfo.level_desc;
                getGBCityInfoResponse.location_timestamp = cityInfo.location_timestamp;
                getGBCityInfoResponse.actual_city_info.add(actualCityInfo);
            }
        }
        return getGBCityInfoResponse;
    }

    public static /* synthetic */ void c(b bVar, CityInfo cityInfo) {
        Object[] objArr = {cityInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "2b5855e67ecdc2a591c3b5f49816da98", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "2b5855e67ecdc2a591c3b5f49816da98");
            return;
        }
        ArrayList arrayList = new ArrayList(bVar.i);
        bVar.i.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((rx.functions.b) it.next()).call(cityInfo);
        }
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e02f9fc71ec36a22d94d92bb2417f3e9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e02f9fc71ec36a22d94d92bb2417f3e9");
            return;
        }
        this.d = new ArrayList();
        this.e = new HashMap();
        this.f = new AtomicLong(0L);
        this.g = new AtomicLong(0L);
        this.i = Collections.synchronizedList(new ArrayList());
        this.j = new AtomicBoolean(false);
    }

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "03ca474f9c25c4291561d3bd51e1130c", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "03ca474f9c25c4291561d3bd51e1130c") : k.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject a(CityInfo cityInfo) {
        Object[] objArr = {cityInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14ef8e5ff33d8120ff1c47f6f105e5b7", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14ef8e5ff33d8120ff1c47f6f105e5b7");
        }
        if (cityInfo == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            List<AddrInfo> list = cityInfo.actual_city_info;
            if (list != null && list.size() != 0) {
                JSONArray jSONArray = new JSONArray();
                for (AddrInfo addrInfo : list) {
                    jSONArray.put(new JSONObject(new Gson().toJson(addrInfo)));
                }
                jSONObject.put("city_info", jSONArray);
            }
            List<AddrInfo> list2 = cityInfo.user_choose_city_info;
            if (list2 != null && list2.size() != 0) {
                JSONArray jSONArray2 = new JSONArray();
                for (AddrInfo addrInfo2 : list2) {
                    jSONArray2.put(new JSONObject(new Gson().toJson(addrInfo2)));
                }
                jSONObject.put("actual_city_info", new JSONArray(jSONArray2));
            }
            jSONObject.put("location_timestamp", cityInfo.location_timestamp);
        } catch (JSONException e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
        }
        return jSONObject;
    }

    private void b(@Nullable String str, rx.functions.b<MtLocation> bVar) {
        Object[] objArr = {str, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "caf7df601dfa2a9168d0727061855d03", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "caf7df601dfa2a9168d0727061855d03");
            return;
        }
        MtLocation mtLocation = null;
        if (TextUtils.isEmpty(str)) {
            Object[] objArr2 = {"thh_appc_mtmall"};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "870db406329833c697545b1ca8ab98e9", RobustBitConfig.DEFAULT_VALUE)) {
                mtLocation = (MtLocation) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "870db406329833c697545b1ca8ab98e9");
            } else {
                MtLocation a2 = com.meituan.android.privacy.locate.f.a().a("thh_appc_mtmall", com.meituan.android.singleton.b.a);
                if (a2 != null) {
                    mtLocation = a2;
                } else if (this.h != null) {
                    mtLocation = this.h.call();
                }
            }
            bVar.call(mtLocation);
            return;
        }
        l.b(new AnonymousClass4(str, bVar), (String) null);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.platform.capacity.dj.city.b$4  reason: invalid class name */
    /* loaded from: classes5.dex */
    public class AnonymousClass4 implements Runnable {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ String b;
        public final /* synthetic */ rx.functions.b c;

        public AnonymousClass4(String str, rx.functions.b bVar) {
            this.b = str;
            this.c = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78021c287784fa92017793d9bfe96454", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78021c287784fa92017793d9bfe96454");
                return;
            }
            Loader<MtLocation> a2 = b.a(b.this, this.b).a(com.meituan.android.singleton.b.a, LocationLoaderFactory.LoadStrategy.normal);
            if (a2 == null) {
                this.c.call(null);
                return;
            }
            a2.registerListener(0, new Loader.OnLoadCompleteListener<MtLocation>() { // from class: com.sankuai.waimai.platform.capacity.dj.city.DJCityInfoManager$6$1
                public static ChangeQuickRedirect a;

                @Override // android.support.v4.content.Loader.OnLoadCompleteListener
                public /* synthetic */ void onLoadComplete(@NonNull Loader<MtLocation> loader, @Nullable MtLocation mtLocation) {
                    MtLocation mtLocation2 = mtLocation;
                    Object[] objArr2 = {loader, mtLocation2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ccd2afce58692a5dc2a72f753faefdf3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ccd2afce58692a5dc2a72f753faefdf3");
                        return;
                    }
                    loader.stopLoading();
                    b.AnonymousClass4.this.c.call(mtLocation2);
                }
            });
            a2.startLoading();
        }
    }

    public void a(@Nullable final String str, final rx.functions.b<CityInfo> bVar) {
        Object[] objArr = {str, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6cddad8b39e0ba599abae8e1fd28c17", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6cddad8b39e0ba599abae8e1fd28c17");
        } else {
            b(str, new rx.functions.b<MtLocation>() { // from class: com.sankuai.waimai.platform.capacity.dj.city.b.5
                public static ChangeQuickRedirect a;

                @Override // rx.functions.b
                public final /* synthetic */ void call(MtLocation mtLocation) {
                    CityInfo cityInfo;
                    MtLocation mtLocation2 = mtLocation;
                    Object[] objArr2 = {mtLocation2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "53855d83a51179ee0abf407cec4ade27", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "53855d83a51179ee0abf407cec4ade27");
                        return;
                    }
                    String str2 = TextUtils.isEmpty(str) ? "thh_appc_mtmall" : str;
                    a a2 = a.a();
                    Object[] objArr3 = {str2};
                    ChangeQuickRedirect changeQuickRedirect3 = a.a;
                    CityInfo cityInfo2 = null;
                    if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "9d854bf68603301003ae48ef2b9bb2a8", RobustBitConfig.DEFAULT_VALUE)) {
                        cityInfo2 = (CityInfo) PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "9d854bf68603301003ae48ef2b9bb2a8");
                    } else {
                        MtLocation a3 = com.meituan.android.privacy.locate.f.a().a(str2, com.meituan.android.singleton.b.a);
                        if (a3 == null) {
                            cityInfo2 = a2.b;
                        } else if (a2.c == null || a2.c.size() == 0) {
                            Object[] objArr4 = {a3};
                            ChangeQuickRedirect changeQuickRedirect4 = a.a;
                            if (PatchProxy.isSupport(objArr4, a2, changeQuickRedirect4, false, "ae2ecc22b7bd09be9748015d5eb75e45", RobustBitConfig.DEFAULT_VALUE)) {
                                cityInfo2 = (CityInfo) PatchProxy.accessDispatch(objArr4, a2, changeQuickRedirect4, false, "ae2ecc22b7bd09be9748015d5eb75e45");
                            } else if (a3 != null) {
                                CityInfoCacheKey cityInfoCacheKey = new CityInfoCacheKey(a3.getLatitude(), a3.getLongitude());
                                Context context = com.meituan.android.singleton.b.a;
                                String str3 = cityInfoCacheKey.cipStoreKey;
                                Object[] objArr5 = {context, str3};
                                ChangeQuickRedirect changeQuickRedirect5 = a.a;
                                CityInfo cityInfo3 = PatchProxy.isSupport(objArr5, a2, changeQuickRedirect5, false, "19f36355ba8a6eea52ac73b0bd11912d", RobustBitConfig.DEFAULT_VALUE) ? (CityInfo) PatchProxy.accessDispatch(objArr5, a2, changeQuickRedirect5, false, "19f36355ba8a6eea52ac73b0bd11912d") : (CityInfo) a2.a(com.meituan.android.singleton.b.a).a(str3, CityInfo.CREATOR);
                                if (cityInfo3 != null && cityInfo3.isAvailable(a3.getTime())) {
                                    a2.c.put(cityInfoCacheKey, cityInfo3);
                                    cityInfo2 = cityInfo3;
                                }
                            }
                        } else {
                            Object[] objArr6 = {a3};
                            ChangeQuickRedirect changeQuickRedirect6 = a.a;
                            if (PatchProxy.isSupport(objArr6, a2, changeQuickRedirect6, false, "b1fff99cf5337c31c3ca5cacc092d535", RobustBitConfig.DEFAULT_VALUE)) {
                                cityInfo2 = (CityInfo) PatchProxy.accessDispatch(objArr6, a2, changeQuickRedirect6, false, "b1fff99cf5337c31c3ca5cacc092d535");
                            } else if (a3 == null) {
                                cityInfo2 = a2.b;
                            } else if (a2.c != null && a2.c.size() != 0 && (cityInfo = a2.c.get(new CityInfoCacheKey(a3.getLatitude(), a3.getLongitude()))) != null && cityInfo.isAvailable(a3.getTime())) {
                                cityInfo2 = cityInfo;
                            }
                        }
                    }
                    if (mtLocation2 == null) {
                        bVar.call(cityInfo2);
                    } else if (cityInfo2 != null) {
                        bVar.call(cityInfo2);
                    } else {
                        b.a(b.this, mtLocation2.getLatitude(), mtLocation2.getLongitude(), mtLocation2.getTime(), str2, new rx.functions.b<CityInfo>() { // from class: com.sankuai.waimai.platform.capacity.dj.city.b.5.1
                            public static ChangeQuickRedirect a;

                            @Override // rx.functions.b
                            public final /* synthetic */ void call(CityInfo cityInfo4) {
                                CityInfo cityInfo5 = cityInfo4;
                                Object[] objArr7 = {cityInfo5};
                                ChangeQuickRedirect changeQuickRedirect7 = a;
                                if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "2e2e2d2d7af00cbc094443e2e9fde310", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "2e2e2d2d7af00cbc094443e2e9fde310");
                                } else {
                                    bVar.call(cityInfo5);
                                }
                            }
                        });
                    }
                }
            });
        }
    }
}
