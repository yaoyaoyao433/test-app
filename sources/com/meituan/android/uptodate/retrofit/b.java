package com.meituan.android.uptodate.retrofit;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.meituan.android.common.locate.loader.LocationStrategy;
import com.meituan.android.upgrade.e;
import com.meituan.android.uptodate.model.VersionInfoBean;
import com.meituan.android.uptodate.service.UpdateInfoService;
import com.meituan.metrics.traffic.reflection.OkHttp3Wrapper;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.NetWorkUtils;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.ar;
import com.sankuai.meituan.retrofit2.mock.a;
import com.sankuai.meituan.retrofit2.raw.a;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class b {
    public static ChangeQuickRedirect a;
    private static volatile b b;
    private ar c;
    private Context d;

    private b(final Context context) {
        a.InterfaceC0637a a2;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31ccd53fac2034bd0088f6a3c9e561a3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31ccd53fac2034bd0088f6a3c9e561a3");
            return;
        }
        String str = e.a().f ? "http://ddapi.fe.test.sankuai.com/" : "https://api.meituan.com/";
        com.meituan.android.upgrade.b bVar = e.a().c;
        if (bVar != null && bVar.c() != null) {
            a2 = bVar.c();
        } else {
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            OkHttp3Wrapper.addInterceptorToBuilder(builder);
            a2 = com.sankuai.meituan.retrofit2.callfactory.okhttp3.a.a(builder.connectTimeout(LocationStrategy.LOCATION_TIMEOUT, TimeUnit.MILLISECONDS).readTimeout(20000L, TimeUnit.MILLISECONDS).build());
        }
        this.d = context;
        this.c = new ar.a().a(str).a(a2).a(a.a()).a(new com.sankuai.meituan.retrofit2.mock.a(context, new a.InterfaceC0636a() { // from class: com.meituan.android.uptodate.retrofit.b.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.retrofit2.mock.a.InterfaceC0636a
            public final String a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ab031573d9cbb7d8dad80e44a1447ce3", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ab031573d9cbb7d8dad80e44a1447ce3") : com.meituan.android.uptodate.a.a(context).g;
            }
        })).a();
    }

    public static b a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cb6ea029faa0e299c5a4ba6edfad8fd0", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cb6ea029faa0e299c5a4ba6edfad8fd0");
        }
        if (b == null) {
            synchronized (b.class) {
                if (b == null) {
                    b = new b(context);
                }
            }
        }
        return b;
    }

    public final Call<VersionInfoBean> a(String str, long j, String str2, String str3, String str4, String str5, String str6, Map<String, String> map, String str7, int i) {
        Object[] objArr = {str, new Long(j), str2, str3, str4, str5, str6, map, str7, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71d2c651cbe1e8ee8b97aaf362a97fca", RobustBitConfig.DEFAULT_VALUE)) {
            return (Call) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71d2c651cbe1e8ee8b97aaf362a97fca");
        }
        HashMap hashMap = new HashMap();
        if (map != null && !map.isEmpty()) {
            hashMap.putAll(map);
        }
        hashMap.put("type", "android");
        hashMap.put("uuid", str5);
        hashMap.put("name", str);
        hashMap.put("version", String.valueOf(j));
        hashMap.put("apilevel", String.valueOf(Build.VERSION.SDK_INT));
        hashMap.put("channel", str2);
        hashMap.put("md5", str3);
        hashMap.put("diffVersion", "2");
        hashMap.put("userid", String.valueOf(str4));
        hashMap.put("ci", String.valueOf(str6));
        hashMap.put("applicationId", this.d.getPackageName());
        hashMap.put(NetLogConstants.Environment.DEVICE_PROVIDER, Build.MANUFACTURER);
        hashMap.put("deviceType", Build.MODEL);
        hashMap.put("deviceBrand", Build.BRAND);
        hashMap.put("deviceBoard", Build.BOARD);
        hashMap.put("systemVersion", Build.VERSION.RELEASE);
        hashMap.put("networkType", String.valueOf(NetWorkUtils.getNetworkType(this.d)));
        if (Build.VERSION.SDK_INT >= 21) {
            hashMap.put("supportedABIs", Build.SUPPORTED_ABIS == null ? "" : TextUtils.join(CommonConstant.Symbol.COMMA, Build.SUPPORTED_ABIS));
        } else {
            hashMap.put("supportedABIs", Build.CPU_ABI);
        }
        hashMap.put("sdkVersion", "2.1.18");
        hashMap.put("timing", String.valueOf(i));
        return ((UpdateInfoService) this.c.a(UpdateInfoService.class)).getVersionInfo(a(str7), hashMap);
    }

    private String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a11d323e47fff73a5969cb83c29434aa", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a11d323e47fff73a5969cb83c29434aa");
        }
        if (TextUtils.isEmpty(str)) {
            str = e.a().f ? "http://ddapi.fe.test.sankuai.com/" : "https://api.meituan.com/";
        }
        return str + "appupdate/legacy/appstatus";
    }
}
