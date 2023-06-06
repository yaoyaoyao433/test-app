package com.sankuai.waimai.foundation.location;

import com.meituan.android.common.locate.MtLocation;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.location.locatesdk.LocateSDK;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.foundation.utils.p;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class LocationSnifferReporter {
    public static ChangeQuickRedirect a;
    private final JSONObject b;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface Key {
        public static final String BASE_INFO = "base_info";
        public static final String CACHE = "cache";
        public static final String CHECK_ADDRESS = "check_address";
        public static final String GD_SDK = "gd_sdk";
        public static final String LOCATION = "location";
        public static final String MT_CACHE = "mt_cache";
        public static final String MT_SDK = "mt_sdk";
    }

    public LocationSnifferReporter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b1c666ab83ebf28c5e1e65eb3ed0ac1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b1c666ab83ebf28c5e1e65eb3ed0ac1");
        } else {
            this.b = new JSONObject();
        }
    }

    public final void a(String str, MtLocation mtLocation) {
        Object[] objArr = {str, mtLocation};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da9c6b5521d8e4209b5d617a5a71c314", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da9c6b5521d8e4209b5d617a5a71c314");
            return;
        }
        int statusCode = mtLocation == null ? -1 : mtLocation.getStatusCode();
        Object[] objArr2 = {str, Integer.valueOf(statusCode)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b9f9df87f7df751788c7b545968d3959", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b9f9df87f7df751788c7b545968d3959");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", str);
            jSONObject.put("errorCode", statusCode);
            if (str.equals(LocateSDK.MT)) {
                this.b.put(Key.MT_SDK, jSONObject);
            } else {
                this.b.put(Key.GD_SDK, jSONObject);
            }
        } catch (Exception unused) {
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be92393f1266582cb866436f45be76d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be92393f1266582cb866436f45be76d3");
        } else {
            a("cache", "Not Use");
        }
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "285009962b7400b9b8d229b0235faacf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "285009962b7400b9b8d229b0235faacf");
        } else if (i == 1) {
            a(Key.CHECK_ADDRESS, "Not Login");
        } else {
            a(Key.CHECK_ADDRESS, "Not Match");
        }
    }

    public final void a(WMLocation wMLocation) {
        Object[] objArr = {wMLocation};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c47fc66c4f5b27ec1c2a3ade6894625", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c47fc66c4f5b27ec1c2a3ade6894625");
        } else {
            a("location", wMLocation == null ? "Location Null" : wMLocation.toString());
        }
    }

    private void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec3509cab9be3615f734ec5574dd3348", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec3509cab9be3615f734ec5574dd3348");
            return;
        }
        try {
            this.b.put(str, str2);
        } catch (Exception unused) {
        }
    }

    public static String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "43ec1f6b6f5c6d242a7a9c50b7386566", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "43ec1f6b6f5c6d242a7a9c50b7386566");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("network_available", p.f(com.meituan.android.singleton.b.a));
            jSONObject.put(NetLogConstants.Tags.NETWORK_TYPE, p.b(com.meituan.android.singleton.b.a));
            jSONObject.put("gps_widget", com.sankuai.waimai.foundation.location.utils.c.a(com.meituan.android.singleton.b.a));
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }

    public final String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7fc8ce782aebabf15d84af7e6e1bbb91", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7fc8ce782aebabf15d84af7e6e1bbb91");
        }
        try {
            this.b.put(Key.BASE_INFO, b());
        } catch (Exception unused) {
        }
        return this.b.toString();
    }
}
