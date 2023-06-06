package com.meituan.met.mercury.load.retrofit;

import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.met.mercury.load.bean.BaseResponse;
import com.meituan.met.mercury.load.bean.CheckListData;
import com.meituan.met.mercury.load.bean.ResourceIdVersion;
import com.meituan.met.mercury.load.core.DDLoadParams;
import com.meituan.met.mercury.load.core.e;
import com.meituan.met.mercury.load.core.g;
import com.meituan.met.mercury.load.utils.c;
import com.meituan.met.mercury.load.utils.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.ar;
import com.sankuai.meituan.retrofit2.mock.a;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class b {
    public static ChangeQuickRedirect a;
    private static volatile b d;
    public DDLoaderRetrofitService b;
    public DDLoaderDownloadRetrofitService c;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2aba27808553ebdc94d6fbc2f153a95e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2aba27808553ebdc94d6fbc2f153a95e");
            return;
        }
        this.b = (DDLoaderRetrofitService) new ar.a().a("https://dd.meituan.com/").a(com.sankuai.meituan.retrofit2.converter.gson.a.a()).a(a.a()).a(new com.sankuai.meituan.retrofit2.mock.a(e.b(), new a.InterfaceC0636a() { // from class: com.meituan.met.mercury.load.retrofit.b.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.retrofit2.mock.a.InterfaceC0636a
            public final String a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "47ff8bab67b878d39fe82b6c3b3c2c2c", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "47ff8bab67b878d39fe82b6c3b3c2c2c") : e.h();
            }
        })).a().a(DDLoaderRetrofitService.class);
        this.c = (DDLoaderDownloadRetrofitService) new ar.a().a("https://dd.meituan.com/").a(com.sankuai.meituan.retrofit2.converter.gson.a.a()).a(a.b()).a(new com.sankuai.meituan.retrofit2.mock.a(e.b(), new a.InterfaceC0636a() { // from class: com.meituan.met.mercury.load.retrofit.b.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.retrofit2.mock.a.InterfaceC0636a
            public final String a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "44e77b2682785693ca4df86e1ff7e44b", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "44e77b2682785693ca4df86e1ff7e44b") : e.h();
            }
        })).a().a(DDLoaderDownloadRetrofitService.class);
    }

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eccd597a8e4d40487e658b0c7e81ef35", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eccd597a8e4d40487e658b0c7e81ef35");
        }
        if (d == null) {
            synchronized (b.class) {
                if (d == null) {
                    d = new b();
                }
            }
        }
        return d;
    }

    public String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55437214a20fba968d350ade957ee6d6", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55437214a20fba968d350ade957ee6d6") : (g.a(str).c || e.f) ? "https://ddapi.fe.test.sankuai.com/" : "https://dd.meituan.com/";
    }

    public final Call<BaseResponse<CheckListData>> a(String str, Set<String> set, List<ResourceIdVersion> list, DDLoadParams dDLoadParams) {
        int i;
        Object[] objArr = {str, set, list, dDLoadParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03c96307dc64764137aa35d0bfde8d53", RobustBitConfig.DEFAULT_VALUE)) {
            return (Call) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03c96307dc64764137aa35d0bfde8d53");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("appVersion", Long.valueOf(e.e()));
        hashMap.put("appVersionName", e.d());
        hashMap.put("applicationId", e.g());
        hashMap.put("deviceManufacture", Build.MANUFACTURER);
        hashMap.put("deviceBrand", Build.BRAND);
        hashMap.put(DeviceInfo.DEVICE_MODEL, Build.MODEL);
        hashMap.put("deviceBoard", Build.BOARD);
        hashMap.put("isEmulator", Integer.valueOf(d.a() ? 1 : 0));
        DisplayMetrics a2 = d.a(e.b());
        hashMap.put("displayWidth", Integer.valueOf(a2.widthPixels));
        hashMap.put("displayHeight", Integer.valueOf(a2.heightPixels));
        hashMap.put("displayDensity", Float.valueOf(a2.density));
        hashMap.put("systemVersion", Build.VERSION.RELEASE);
        hashMap.put("systemApiLevel", Integer.valueOf(Build.VERSION.SDK_INT));
        if (Build.VERSION.SDK_INT >= 21) {
            hashMap.put("supportedABIs", Build.SUPPORTED_ABIS);
        } else {
            hashMap.put("supportedABIs", new String[]{Build.CPU_ABI});
        }
        hashMap.put("cpuNumbers", Integer.valueOf(Runtime.getRuntime().availableProcessors()));
        hashMap.put(DeviceInfo.USER_ID, e.i());
        hashMap.put("UUID", e.h());
        hashMap.put("channel", e.k());
        hashMap.put("platform", "Android");
        hashMap.put("dddVersion", e.f());
        if (dDLoadParams != null) {
            if (!TextUtils.isEmpty(dDLoadParams.getBusinessSdkVersion())) {
                hashMap.put("sdkVersion", dDLoadParams.getBusinessSdkVersion());
                e.a(str, dDLoadParams.getBusinessSdkVersion());
            }
            if (!TextUtils.isEmpty(dDLoadParams.tag)) {
                hashMap.put("tag", dDLoadParams.tag);
            }
            if (!d.a(dDLoadParams.extraParams)) {
                hashMap.put("extraParams", dDLoadParams.extraParams);
            }
        }
        hashMap.put("bundles", list);
        if (!TextUtils.isEmpty(e.j())) {
            hashMap.put("cityID", e.j());
        }
        String str2 = "";
        if (set == null || set.isEmpty()) {
            i = 1;
        } else {
            StringBuilder sb = new StringBuilder();
            for (String str3 : set) {
                sb.append(CommonConstant.Symbol.COMMA);
                sb.append(str3);
            }
            i = 1;
            str2 = sb.substring(1);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(a(str));
        Object[] objArr2 = new Object[i];
        objArr2[0] = str;
        sb2.append(String.format("config/%s/checkList", objArr2));
        String sb3 = sb2.toString();
        if (g.a(str).e) {
            sb3 = g.a(str).f;
        }
        com.meituan.met.mercury.load.utils.b bVar = new com.meituan.met.mercury.load.utils.b("DDLoaderRetrofit checkList");
        bVar.a("url", sb3).a("body", hashMap).a("bundleNames", str2);
        c.a(bVar);
        return this.b.checkList(sb3, hashMap, str2);
    }
}
