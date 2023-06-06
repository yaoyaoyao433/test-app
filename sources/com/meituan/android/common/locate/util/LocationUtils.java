package com.meituan.android.common.locate.util;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.support.annotation.RequiresApi;
import android.support.v4.content.ContextCompat;
import android.telephony.CellLocation;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import android.text.TextUtils;
import com.dianping.titans.utils.NetworkUtil;
import com.meituan.android.common.fingerprint.FingerprintManager;
import com.meituan.android.common.locate.MtLocation;
import com.meituan.android.common.locate.MtLocationInfo;
import com.meituan.android.common.locate.loader.LoadBusinessEnum;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.android.common.locate.model.Coordinate;
import com.meituan.android.common.locate.model.Rectangle;
import com.meituan.android.common.locate.platform.sniffer.c;
import com.meituan.android.common.locate.provider.t;
import com.meituan.android.common.unionid.oneid.monitor.LogMonitor;
import com.meituan.android.common.unionid.oneid.util.AppUtil;
import com.meituan.android.privacy.interfaces.MtTelephonyManager;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.android.privacy.interfaces.u;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import okhttp3.Request;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class LocationUtils {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static int f;
    private static LoadBusinessEnum n;
    private static HashMap<String, GeoCoderInfo> g = new HashMap<>();
    private static String h = "";
    private static String i = "";
    private static volatile String j = null;
    public static volatile int a = -19;
    public static volatile boolean b = true;
    public static volatile boolean c = true;
    private static volatile boolean k = true;
    public static volatile int d = 5;
    public static volatile int e = 10;
    private static volatile boolean l = false;
    private static boolean m = false;
    private static Rectangle[] o = {new Rectangle(49.2204d, 79.4462d, 42.8899d, 96.33d), new Rectangle(54.1415d, 109.6872d, 39.3742d, 135.0002d), new Rectangle(42.8899d, 73.1246d, 29.5297d, 124.143255d), new Rectangle(29.5297d, 82.9684d, 26.7186d, 97.0352d), new Rectangle(29.5297d, 97.0253d, 20.414096d, 124.367395d), new Rectangle(20.414096d, 107.975793d, 17.871542d, 111.744104d)};
    private static Rectangle[] p = {new Rectangle(22.284d, 101.8652d, 20.0988d, 106.665d), new Rectangle(21.5422d, 106.4525d, 20.4878d, 108.051d), new Rectangle(55.8175d, 109.0323d, 50.3257d, 119.127d), new Rectangle(55.8175d, 127.4568d, 49.5574d, 137.0227d), new Rectangle(44.8922d, 131.2662d, 42.5692d, 137.0227d)};

    /* loaded from: classes2.dex */
    public enum CHANNEL {
        MEITUAN,
        DIANPING;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        CHANNEL() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dff70e10c824cb1e79febddaf963df8b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dff70e10c824cb1e79febddaf963df8b");
            }
        }

        public static CHANNEL valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return (CHANNEL) (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1d7d63308e5dbabfdc1fc0a4a6c3cd0e", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1d7d63308e5dbabfdc1fc0a4a6c3cd0e") : Enum.valueOf(CHANNEL.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static CHANNEL[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return (CHANNEL[]) (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d4a68ca0c96f39587d858e9e0ec70eb7", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d4a68ca0c96f39587d858e9e0ec70eb7") : values().clone());
        }
    }

    /* loaded from: classes2.dex */
    public static class GeoCoderInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        private String a;
        private String b;
        private String c;
        private String d;
        private String e;

        public String getCity() {
            return this.d;
        }

        public String getCountry() {
            return this.b;
        }

        public String getDistrict() {
            return this.e;
        }

        public String getFullInfo() {
            return this.a;
        }

        public String getProvince() {
            return this.c;
        }

        public void setCity(String str) {
            this.d = str;
        }

        public void setCountry(String str) {
            this.b = str;
        }

        public void setDistrict(String str) {
            this.e = str;
        }

        public void setInfo(String str) {
            this.a = str;
        }

        public void setProvince(String str) {
            this.c = str;
        }
    }

    public static int a(CellLocation cellLocation, Context context) {
        Object[] objArr = {cellLocation, context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cec715c11570b54911d8c5d0ed10af4a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cec715c11570b54911d8c5d0ed10af4a")).intValue();
        }
        if (l(context) || cellLocation == null) {
            return 9;
        }
        if (cellLocation instanceof GsmCellLocation) {
            return 1;
        }
        return cellLocation instanceof CdmaCellLocation ? 2 : 9;
    }

    public static String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b2c365a42e12f25b53e75d042c2f4cad", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b2c365a42e12f25b53e75d042c2f4cad");
        }
        SharedPreferences b2 = com.meituan.android.common.locate.reporter.f.b();
        return b2 != null ? b2.getString("userid", "") : "";
    }

    public static String a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b5a210902d6650167207ba851085e002", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b5a210902d6650167207ba851085e002");
        }
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2 & 255);
            if (hexString.length() == 1) {
                hexString = String.format(Locale.CHINA, "0%s", hexString);
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    public static HttpURLConnection a(HttpURLConnection httpURLConnection) {
        Object[] objArr = {httpURLConnection};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "94f0070dc2c5014743194c8c39849e6b", RobustBitConfig.DEFAULT_VALUE)) {
            return (HttpURLConnection) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "94f0070dc2c5014743194c8c39849e6b");
        }
        if (httpURLConnection == null) {
            return null;
        }
        httpURLConnection.setRequestProperty("X-Identity-Client", com.meituan.android.common.locate.provider.a.a());
        httpURLConnection.setRequestProperty("X-Identity-User", com.meituan.android.common.locate.provider.a.b());
        httpURLConnection.setRequestProperty("X-Identity-Device", com.meituan.android.common.locate.provider.a.d());
        httpURLConnection.setRequestProperty("X-Identity-Request", c());
        return httpURLConnection;
    }

    public static Request.Builder a(Request.Builder builder) {
        Object[] objArr = {builder};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "dd2280978dafc12ceda220e0d1157077", RobustBitConfig.DEFAULT_VALUE)) {
            return (Request.Builder) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "dd2280978dafc12ceda220e0d1157077");
        }
        if (builder == null) {
            return null;
        }
        builder.addHeader("X-Identity-Client", com.meituan.android.common.locate.provider.a.a()).addHeader("X-Identity-User", com.meituan.android.common.locate.provider.a.b()).addHeader("X-Identity-Device", com.meituan.android.common.locate.provider.a.d()).addHeader("X-Identity-Request", c());
        return builder;
    }

    private static JSONObject a(int i2) {
        c.a aVar;
        Object[] objArr = {Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "28645f320b2bf30bf3c70ab013fc9ede", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "28645f320b2bf30bf3c70ab013fc9ede");
        }
        Context a2 = com.meituan.android.common.locate.provider.g.a();
        if (a2 == null) {
            aVar = new c.a("ble_scan_module", "type_location_fingerprint_null", "", "");
        } else if (com.meituan.android.common.locate.reporter.k.a().a != 1) {
            aVar = new c.a("ble_scan_module", "type_location_fingerprint_off", "", "");
        } else if (t.a && com.meituan.android.common.locate.provider.e.a && com.meituan.android.common.locate.controller.e.d) {
            com.meituan.android.common.locate.platform.sniffer.b.b(new c.a("ble_scan_module", "type_location_fingerprint_all", "", ""));
            JSONObject jSONObject = new JSONObject();
            try {
                com.meituan.android.common.locate.provider.k.a(a2).a(jSONObject);
                com.meituan.android.common.locate.provider.q.a(a2).a(jSONObject);
                com.meituan.android.common.locate.provider.m.a().a(jSONObject);
                com.meituan.android.common.locate.provider.m.a().b(jSONObject);
                com.meituan.android.common.locate.controller.e.a().a(jSONObject);
                jSONObject.put("beacons", com.meituan.android.common.locate.ble.a.a().b(FingerprintManager.TAG));
            } catch (Exception e2) {
                com.meituan.android.common.locate.platform.sniffer.b.b(new c.a("ble_scan_module", "type_location_fingerprint_error", "", e2.getMessage()));
                LogUtils.a(e2);
            }
            return jSONObject;
        } else {
            aVar = new c.a("ble_scan_module", "type_location_fingerprint_init", "", "");
        }
        com.meituan.android.common.locate.platform.sniffer.b.b(aVar);
        return null;
    }

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c4e97d6ac0312c7871946b4b75543ab1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c4e97d6ac0312c7871946b4b75543ab1");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            i = h.a.format(Long.valueOf(System.currentTimeMillis())) + CommonConstant.Symbol.COLON + str;
        }
    }

    public static void a(String str, Context context) {
        Object[] objArr = {str, context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "079983375103e6154a1d1d22b25f2c5a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "079983375103e6154a1d1d22b25f2c5a");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            h = str;
            com.meituan.android.common.locate.provider.a.b(str);
            c(str);
        }
    }

    public static void a(String str, Bundle bundle) {
        Object[] objArr = {str, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f798e776c50c2989c0b4c370453e9850", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f798e776c50c2989c0b4c370453e9850");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            try {
                bundle.putString(GearsLocator.ORIGIN_CITY_ID, new JSONObject(str).optString(GearsLocator.ORIGIN_CITY_ID, ""));
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "20d252ed54e30b7cb9d0d239f2dbaf8a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "20d252ed54e30b7cb9d0d239f2dbaf8a");
            return;
        }
        String str = "";
        if (jSONObject != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(jSONObject.has("mmacssid") ? "" : " mmacssid");
            sb.append(jSONObject.has("wifi_towers") ? "" : " wifi_towers");
            sb.append(jSONObject.has("cell_towers") ? "" : " cell_towers");
            str = sb.toString();
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("signal", str);
            b(jSONObject2);
        } catch (JSONException e2) {
            LogUtils.a(e2);
        }
        String b2 = b(jSONObject);
        LogUtils.a("locate items lack : " + b2);
    }

    public static void a(boolean z) {
        b = z;
    }

    public static boolean a(double d2, double d3) {
        StringBuilder sb;
        Object[] objArr = {Double.valueOf(d2), Double.valueOf(d3)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bb5bfa878923ad56dd67b5738a0951ac", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bb5bfa878923ad56dd67b5738a0951ac")).booleanValue();
        }
        if (d3 == 0.0d && d2 == 0.0d) {
            return false;
        }
        if (d3 > 180.0d || d2 > 90.0d) {
            sb = new StringBuilder("strange coord:");
        } else if (d3 >= -180.0d && d2 >= -90.0d) {
            return true;
        } else {
            sb = new StringBuilder("strange coord:");
        }
        sb.append(d3);
        sb.append("#");
        sb.append(d2);
        LogUtils.a(sb.toString());
        return false;
    }

    public static boolean a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "760297a1c611a627ba779ff785bdf4bf", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "760297a1c611a627ba779ff785bdf4bf")).booleanValue();
        }
        try {
            return (context.getApplicationInfo().flags & 2) != 0;
        } catch (Throwable th) {
            com.meituan.android.common.locate.platform.logs.c.a("isdebugversion exception:" + th.getMessage(), 3);
            return false;
        }
    }

    @SuppressLint({"MissingPermission", "NewApi"})
    public static boolean a(Context context, MtLocation mtLocation) {
        boolean isFromMockProvider;
        boolean z = false;
        Object[] objArr = {context, mtLocation};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9a7e60ff45896232867d75f599dfd712", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9a7e60ff45896232867d75f599dfd712")).booleanValue();
        }
        if (context == null) {
            return false;
        }
        if ("unknown".equalsIgnoreCase(Build.BOARD) || "generic".equalsIgnoreCase(Build.BRAND) || "generic".equalsIgnoreCase(Build.DEVICE) || "sdk".equalsIgnoreCase(Build.MODEL) || "sdk".equalsIgnoreCase(Build.PRODUCT) || "goldfish".equalsIgnoreCase(Build.HARDWARE) || "Genymotion".equalsIgnoreCase(Build.MANUFACTURER)) {
            return true;
        }
        try {
            String str = "";
            if (Build.VERSION.SDK_INT < 26) {
                str = Build.SERIAL;
            } else if (Build.VERSION.SDK_INT <= 28) {
                str = AppUtil.getSerial(context);
            }
            if ("unknown".equalsIgnoreCase(str)) {
                return true;
            }
        } catch (Exception e2) {
            LogUtils.a(e2);
        }
        if (b() < 18 || !a(mtLocation)) {
            return false;
        }
        try {
            isFromMockProvider = mtLocation.isFromMockProvider();
        } catch (Exception e3) {
            e = e3;
        }
        try {
            LogUtils.a("isFromMockProvider " + isFromMockProvider);
            return isFromMockProvider;
        } catch (Exception e4) {
            e = e4;
            z = isFromMockProvider;
            LogUtils.a(e.getMessage());
            return z;
        }
    }

    public static boolean a(Context context, MtLocationInfo mtLocationInfo, MtLocationInfo mtLocationInfo2, long j2) {
        Object[] objArr = {context, mtLocationInfo, mtLocationInfo2, new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "33764d051a9a3316c7134b4152effcd4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "33764d051a9a3316c7134b4152effcd4")).booleanValue();
        }
        if (mtLocationInfo2 == null || mtLocationInfo2.location == null) {
            boolean z = mtLocationInfo2 == null;
            com.meituan.android.common.locate.platform.logs.c.a("isBetterMtLocation::currentBestLocationInfo is Null return true currentBestLocationInfo is null:" + z, 3);
            return true;
        }
        LogUtils.a("currentBestLocationInfo is not null");
        if (mtLocationInfo == null || mtLocationInfo.location == null) {
            com.meituan.android.common.locate.platform.logs.c.a("isBetterMtLocation::locationInfo is Null", 3);
            return false;
        }
        LogUtils.a("locationInfo is not null");
        MtLocation mtLocation = mtLocationInfo.location;
        MtLocation mtLocation2 = mtLocationInfo2.location;
        if (mtLocation2 == null || isValidLatLon(mtLocation2)) {
            double meterDistanceBetweenPoints = meterDistanceBetweenPoints(mtLocation.getLatitude(), mtLocation.getLongitude(), mtLocation2.getLatitude(), mtLocation2.getLongitude());
            long time = (mtLocation.getTime() - mtLocation2.getTime()) / 1000;
            if (com.meituan.android.common.locate.reporter.e.a(context).b() && meterDistanceBetweenPoints > 55 * time) {
                com.meituan.android.common.locate.platform.logs.c.a("isBetterMtLocation::current location is too far,distance is:" + meterDistanceBetweenPoints + ",timeDiff is:" + time, 3);
                return false;
            } else if (TextUtils.equals("mars", mtLocation.getProvider())) {
                return true;
            } else {
                if ((TextUtils.equals(GearsLocator.GEARS_PROVIDER, mtLocation2.getProvider()) && TextUtils.equals(GearsLocator.GEARS_PROVIDER, mtLocation.getProvider())) || TextUtils.equals("network", mtLocation2.getProvider()) || mtLocationInfo.locationGotTime - mtLocationInfo2.locationGotTime > j2) {
                    return true;
                }
                com.meituan.android.common.locate.platform.logs.c.a("isBetterMtLocation::locationInfo is not better", 3);
                return false;
            }
        }
        return true;
    }

    public static boolean a(Context context, String[] strArr) {
        Object[] objArr = {context, strArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d751a5d9589166fe6a4e110a3cd46928", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d751a5d9589166fe6a4e110a3cd46928")).booleanValue();
        }
        if (context == null) {
            return false;
        }
        int i2 = context.getApplicationInfo().targetSdkVersion;
        for (String str : strArr) {
            if (i2 >= 23 && ContextCompat.checkSelfPermission(context, str) != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean a(MtLocation mtLocation) {
        Object[] objArr = {mtLocation};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6f4702e9283881a5d4de1bc3767e6833", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6f4702e9283881a5d4de1bc3767e6833")).booleanValue();
        }
        if (mtLocation != null && mtLocation.hasAccuracy()) {
            return a(mtLocation.getLatitude(), mtLocation.getLongitude());
        }
        return false;
    }

    public static boolean a(MtTelephonyManager mtTelephonyManager) {
        boolean z = true;
        Object[] objArr = {mtTelephonyManager};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e9d5bfcead4fcf9142611d96f08c075f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e9d5bfcead4fcf9142611d96f08c075f")).booleanValue();
        }
        if (mtTelephonyManager == null) {
            return false;
        }
        switch (mtTelephonyManager.getSimState()) {
            case 0:
            case 1:
                z = false;
                break;
        }
        LogUtils.a(z ? "有SIM卡" : "无SIM卡");
        return z;
    }

    public static double[] a(double[] dArr) {
        Object[] objArr = {dArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "04a493388a9bf053e5a358da64089374", RobustBitConfig.DEFAULT_VALUE)) {
            return (double[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "04a493388a9bf053e5a358da64089374");
        }
        double d2 = dArr[0];
        double d3 = dArr[1];
        if (b(d2, d3)) {
            return dArr;
        }
        double d4 = d3 - 105.0d;
        double d5 = d2 - 35.0d;
        double c2 = c(d4, d5);
        double d6 = d(d4, d5);
        double d7 = (d2 / 180.0d) * 3.141592653589793d;
        double sin = Math.sin(d7);
        double d8 = 1.0d - ((0.006693421622965943d * sin) * sin);
        double sqrt = Math.sqrt(d8);
        dArr[0] = d2 + ((c2 * 180.0d) / ((6335552.717000426d / (d8 * sqrt)) * 3.141592653589793d));
        dArr[1] = d3 + ((d6 * 180.0d) / (((6378245.0d / sqrt) * Math.cos(d7)) * 3.141592653589793d));
        return dArr;
    }

    @SuppressLint({"PrimitiveParseDetector"})
    public static int b() {
        int i2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4d7e1c0b7525abba2917d34d7a6e15d7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4d7e1c0b7525abba2917d34d7a6e15d7")).intValue();
        }
        if (f > 0) {
            return f;
        }
        try {
            try {
                i2 = Build.VERSION.SDK_INT;
            } catch (Exception unused) {
                i2 = Integer.valueOf(Build.VERSION.SDK).intValue();
            }
        } catch (Exception e2) {
            LogUtils.a("getSdk exception: " + e2.getMessage());
            i2 = 0;
        }
        LogUtils.a("LocationUtils getSdk: " + i2);
        return i2;
    }

    public static String b(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0cda264d2d8688fd57214efaec528ab3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0cda264d2d8688fd57214efaec528ab3");
        }
        if (jSONObject == null) {
            return "";
        }
        Context a2 = com.meituan.android.common.locate.provider.g.a();
        try {
            jSONObject.put("nettype", i(a2));
            jSONObject.put("lackPerm", c(a2));
            jSONObject.put("lackServ", checkLocationServiceStatus(a2));
            jSONObject.put("scan", f(a2));
            jSONObject.put("wifienable", s.a(a2, "pt-c140c5921e4d3392"));
            return jSONObject.toString();
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    private static boolean b(double d2, double d3) {
        Object[] objArr = {Double.valueOf(d2), Double.valueOf(d3)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9ec2cd8ec7a35c82b1859422c29c05b7", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9ec2cd8ec7a35c82b1859422c29c05b7")).booleanValue() : d3 < 72.004d || d3 > 137.8347d || d2 < 0.8293d || d2 > 55.8271d;
    }

    public static boolean b(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e6820a8ef86f163a11fc42efb6ab3745", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e6820a8ef86f163a11fc42efb6ab3745")).booleanValue();
        }
        if (context == null) {
            return false;
        }
        try {
        } catch (Throwable th) {
            LogUtils.a(LocationUtils.class, th);
        }
        if (Build.VERSION.SDK_INT < 23) {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            return runningAppProcessInfo.importance == 100 && runningAppProcessInfo.processName.equals(context.getPackageName());
        }
        ActivityManager activityManager = (ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME);
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo2 : runningAppProcesses) {
            if (runningAppProcessInfo2.importance == 100 && runningAppProcessInfo2.processName.equals(context.getPackageName())) {
                return true;
            }
        }
        return false;
    }

    public static byte[] b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1763403066d0878ed526557641db4152", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1763403066d0878ed526557641db4152");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return b(c(str.getBytes(Charset.forName("UTF-8"))));
    }

    public static byte[] b(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c60d6972ebeec55b4222191712e19c1b", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c60d6972ebeec55b4222191712e19c1b");
        }
        for (int i2 = 0; i2 < bArr.length; i2++) {
            bArr[i2] = (byte) (((byte) (~bArr[i2])) ^ Byte.MAX_VALUE);
        }
        return bArr;
    }

    private static double c(double d2, double d3) {
        Object[] objArr = {Double.valueOf(d2), Double.valueOf(d3)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "40c9f068e7b2616c53d50e83598ebefc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "40c9f068e7b2616c53d50e83598ebefc")).doubleValue();
        }
        double d4 = d2 * 2.0d;
        double d5 = d3 * 3.141592653589793d;
        return (-100.0d) + d4 + (d3 * 3.0d) + (d3 * 0.2d * d3) + (0.1d * d2 * d3) + (Math.sqrt(Math.abs(d2)) * 0.2d) + ((((Math.sin((d2 * 6.0d) * 3.141592653589793d) * 20.0d) + (Math.sin(d4 * 3.141592653589793d) * 20.0d)) * 2.0d) / 3.0d) + ((((Math.sin(d5) * 20.0d) + (Math.sin((d3 / 3.0d) * 3.141592653589793d) * 40.0d)) * 2.0d) / 3.0d) + ((((Math.sin((d3 / 12.0d) * 3.141592653589793d) * 160.0d) + (Math.sin(d5 / 30.0d) * 320.0d)) * 2.0d) / 3.0d);
    }

    public static String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a8806fee20378c4431bfbe31458f93cc", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a8806fee20378c4431bfbe31458f93cc");
        }
        try {
            return Long.toHexString(System.currentTimeMillis());
        } catch (Throwable th) {
            LogUtils.a(th);
            return "";
        }
    }

    public static String c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f1b4f5c2a09043e9204c50fe1eaa955e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f1b4f5c2a09043e9204c50fe1eaa955e");
        }
        StringBuffer stringBuffer = new StringBuffer();
        if (context == null) {
            try {
                stringBuffer.append("context in permission is null");
            } catch (Throwable th) {
                try {
                    stringBuffer.append(th.getMessage());
                    return stringBuffer.toString();
                } catch (Throwable unused) {
                    return stringBuffer.toString();
                }
            }
        }
        int i2 = context != null ? context.getApplicationInfo().targetSdkVersion : 0;
        if (!j(context)) {
            stringBuffer.append("ACCESS_FINE_LOCATION;");
        }
        if (i2 >= 23 && !a(context, i.a)) {
            stringBuffer.append("ACCESS_COARSE_LOCATION;");
        }
        return stringBuffer.toString();
    }

    private static void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a81601edb352b4b62fd2b885c9dbc552", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a81601edb352b4b62fd2b885c9dbc552");
            return;
        }
        SharedPreferences b2 = com.meituan.android.common.locate.reporter.f.b();
        if (b2 != null) {
            b2.edit().putString("userid", str).apply();
        }
    }

    public static void c(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ab96963959a3c7c93436d8415f51c6b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ab96963959a3c7c93436d8415f51c6b4");
        } else if (jSONObject == null) {
        } else {
            try {
                if (jSONObject.has("error")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("error");
                    jSONObject2.remove("type");
                    com.meituan.android.common.locate.platform.sniffer.a.a(jSONObject2);
                    LogUtils.a("store server error : " + jSONObject2.toString());
                }
            } catch (Exception e2) {
                LogUtils.a(e2);
            }
        }
    }

    public static byte[] c(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "027bc152c42558bf63748b2688a0a47c", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "027bc152c42558bf63748b2688a0a47c");
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String checkLocationServiceStatus(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c460a1babd375c1a7e1b9fe64db6fc5b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c460a1babd375c1a7e1b9fe64db6fc5b");
        }
        StringBuffer stringBuffer = new StringBuffer();
        try {
            u createLocationManager = Privacy.createLocationManager(context, "pt-c140c5921e4d3392");
            if (createLocationManager == null) {
                LogUtils.a("LocationUtils checkLocationServiceStatus location is null!");
                return "locationmanager is null";
            }
            if (!createLocationManager.c("gps")) {
                stringBuffer.append("gps;");
            }
            if (!createLocationManager.c("network")) {
                stringBuffer.append("network;");
            }
            return stringBuffer.toString();
        } catch (Exception e2) {
            LogUtils.a("LocationUtils checkLocationServiceStatus exception: " + e2.getMessage());
            return LogMonitor.EXCEPTION_TAG;
        }
    }

    @Deprecated
    public static boolean checkPermissions(Context context, String[] strArr) {
        Object[] objArr = {context, strArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a05e4195ac3d2ced3c40094bf6089abe", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a05e4195ac3d2ced3c40094bf6089abe")).booleanValue();
        }
        if (context == null) {
            return false;
        }
        return context.getApplicationInfo().targetSdkVersion < 23 || a(context, strArr);
    }

    private static double d(double d2, double d3) {
        Object[] objArr = {Double.valueOf(d2), Double.valueOf(d3)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "18c809657ba4cbb795e35d3f12ef80fd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "18c809657ba4cbb795e35d3f12ef80fd")).doubleValue();
        }
        double d4 = d2 * 0.1d;
        return d2 + 300.0d + (d3 * 2.0d) + (d4 * d2) + (d4 * d3) + (Math.sqrt(Math.abs(d2)) * 0.1d) + ((((Math.sin((6.0d * d2) * 3.141592653589793d) * 20.0d) + (Math.sin((d2 * 2.0d) * 3.141592653589793d) * 20.0d)) * 2.0d) / 3.0d) + ((((Math.sin(d2 * 3.141592653589793d) * 20.0d) + (Math.sin((d2 / 3.0d) * 3.141592653589793d) * 40.0d)) * 2.0d) / 3.0d) + ((((Math.sin((d2 / 12.0d) * 3.141592653589793d) * 150.0d) + (Math.sin((d2 / 30.0d) * 3.141592653589793d) * 300.0d)) * 2.0d) / 3.0d);
    }

    public static LoadBusinessEnum d() {
        return n;
    }

    public static String d(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "359304d995abc7bad25ca697b1797e52", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "359304d995abc7bad25ca697b1797e52");
        }
        StringBuffer stringBuffer = new StringBuffer();
        try {
            try {
                if (!a(context, i.a)) {
                    stringBuffer.append("ACCESS_COARSE_LOCATION;");
                }
                if (!j(context)) {
                    stringBuffer.append("ACCESS_FINE_LOCATION;");
                }
                if (!a(context, new String[]{"android.permission.ACCESS_WIFI_STATE"})) {
                    stringBuffer.append("ACCESS_WIFI_STATE;");
                }
                LogUtils.a("checkLocateLackPermission : " + stringBuffer.toString());
                return stringBuffer.toString();
            } catch (Exception e2) {
                LogUtils.a("checkLocateLackPermission exception: " + e2.getMessage());
                return stringBuffer.toString();
            }
        } catch (Throwable unused) {
            return stringBuffer.toString();
        }
    }

    public static byte[] d(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2d30731e0cf98089e94115900b735d33", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2d30731e0cf98089e94115900b735d33");
        }
        for (int i2 = 0; i2 < bArr.length; i2++) {
            bArr[i2] = (byte) (~(bArr[i2] ^ Byte.MAX_VALUE));
        }
        return bArr;
    }

    public static boolean e(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8b583628e3230e069fb429b73ee0d94c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8b583628e3230e069fb429b73ee0d94c")).booleanValue();
        }
        try {
            u createLocationManager = Privacy.createLocationManager(context, "pt-c140c5921e4d3392");
            if (createLocationManager == null) {
                LogUtils.a("LocationUtils checkLocationServiceStatus location is null!");
                return false;
            } else if (createLocationManager.c("gps") || createLocationManager.c("network")) {
                LogUtils.a("Location service is started");
                return true;
            } else {
                LogUtils.a("Location service is closed");
                return false;
            }
        } catch (Exception e2) {
            LogUtils.a("LocationUtils checkLocationServiceStatus exception: " + e2.getMessage());
            return false;
        }
    }

    public static byte[] e(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "570dbdc00722760e484c40867f190009", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "570dbdc00722760e484c40867f190009");
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            byte[] bArr2 = new byte[512];
            while (true) {
                int read = gZIPInputStream.read(bArr2);
                if (read == -1) {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return byteArray;
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
        } catch (IOException e2) {
            LogUtils.a("ungzip IOException: " + e2.getMessage());
            return null;
        }
    }

    public static int f(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6ab5135511c8f0a849519489e35cf00d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6ab5135511c8f0a849519489e35cf00d")).intValue();
        }
        if (context == null || Build.VERSION.SDK_INT <= 17) {
            return -1;
        }
        try {
            Object[] objArr2 = {context.getContentResolver(), "wifi_scan_always_enabled"};
            try {
                Method declaredMethod = Class.forName("android.provider.Settings$Global").getDeclaredMethod("getInt", ContentResolver.class, String.class);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return ((Integer) declaredMethod.invoke(null, objArr2)).intValue();
            } catch (Exception e2) {
                LogUtils.a("enableWifiAlwaysScan invoke error: " + e2.getMessage());
                return -1;
            }
        } catch (Exception unused) {
        }
    }

    public static byte[] f(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b15679b30fa67dddf1213f0dd2f20ea9", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b15679b30fa67dddf1213f0dd2f20ea9");
        }
        if (bArr != null) {
            return e(d(bArr));
        }
        return null;
    }

    public static String g(Context context) {
        boolean z = true;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6e3979f5a527f0838bec894ec3b4e976", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6e3979f5a527f0838bec894ec3b4e976");
        }
        JSONObject jSONObject = new JSONObject();
        if (context != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                com.meituan.android.common.locate.provider.m.a().c(jSONObject2);
                JSONObject jSONObject3 = new JSONObject();
                com.meituan.android.common.locate.provider.m.a().d(jSONObject3);
                jSONObject.put("version", "1.0");
                jSONObject.put("wifiInfo", jSONObject2);
                jSONObject.put("wifiConnected", isWifiConnected(context));
                jSONObject.put("cellInfo", jSONObject3);
                jSONObject.put("nettype", i(context));
                jSONObject.put("lackPerm", d(context));
                jSONObject.put("lackServe", checkLocationServiceStatus(context));
                if (f(context) != 1) {
                    z = false;
                }
                jSONObject.put("scan", z);
                jSONObject.put("errorInfo", i);
            } catch (Exception e2) {
                LogUtils.a(e2);
            }
        }
        return jSONObject.toString();
    }

    @Deprecated
    public static String getKeyInfoFinger() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "051e05491d7e8fb1057ff9f21e334d3e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "051e05491d7e8fb1057ff9f21e334d3e");
        }
        Context a2 = com.meituan.android.common.locate.provider.g.a();
        return a2 == null ? "" : g(a2);
    }

    public static String getKeyInfoFingerV3() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d99d1cddde394bfe2b9a8596190875c4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d99d1cddde394bfe2b9a8596190875c4");
        }
        Context a2 = com.meituan.android.common.locate.provider.g.a();
        if (a2 != null && com.meituan.android.common.locate.reporter.e.a(a2).f()) {
            JSONObject jSONObject = new JSONObject();
            try {
                JSONObject jSONObject2 = new JSONObject();
                com.meituan.android.common.locate.provider.m.a().a(jSONObject2);
                JSONObject jSONObject3 = new JSONObject();
                com.meituan.android.common.locate.provider.m.a().b(jSONObject3);
                jSONObject.put("version", "3.0");
                jSONObject.put("wifiInfo", jSONObject2);
                jSONObject.put("wifiConnected", isWifiConnected(a2));
                jSONObject.put("cellInfo", jSONObject3);
                jSONObject.put("nettype", i(a2));
                jSONObject.put("lackPerm", d(a2));
                jSONObject.put("lackServe", checkLocationServiceStatus(a2));
                jSONObject.put("scan", f(a2) == 1);
                jSONObject.put("errorInfo", i);
            } catch (Exception e2) {
                LogUtils.a(e2);
            }
            return a(m.a(jSONObject.toString().getBytes()));
        }
        return "";
    }

    @Deprecated
    public static String getKeyInfoFingerprint() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1aa43a0df91ff15bc3ed6be25c2ed1e1", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1aa43a0df91ff15bc3ed6be25c2ed1e1");
        }
        Context a2 = com.meituan.android.common.locate.provider.g.a();
        return a2 == null ? "" : g(a2);
    }

    @RequiresApi(api = 17)
    public static String getKeyInfoFingerprint(int i2) {
        Object[] objArr = {Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "34bdf7218d78496c9f58e5274583e473", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "34bdf7218d78496c9f58e5274583e473");
        }
        if (com.meituan.android.common.locate.provider.g.a() == null) {
            com.meituan.android.common.locate.platform.sniffer.b.b(new c.a("ble_scan_module", "type_location_fingerprint_null", "", ""));
            return "{}";
        } else if (!t.a || !com.meituan.android.common.locate.provider.e.a || !com.meituan.android.common.locate.controller.e.d) {
            com.meituan.android.common.locate.platform.sniffer.b.b(new c.a("ble_scan_module", "type_location_fingerprint_init", "", ""));
            return "{}";
        } else {
            com.meituan.android.common.locate.platform.sniffer.b.b(new c.a("ble_scan_module", "type_location_fingerprint_all", "", ""));
            JSONObject jSONObject = new JSONObject();
            try {
                com.meituan.android.common.locate.provider.m.a().a(jSONObject);
                com.meituan.android.common.locate.provider.m.a().b(jSONObject);
                jSONObject.put("beacons", com.meituan.android.common.locate.ble.a.a().a("keyInfo"));
            } catch (Exception e2) {
                LogUtils.a(e2);
            }
            com.meituan.android.common.locate.platform.logs.c.a("getKeyInfoFingerprintn from locate impl", 3);
            return jSONObject.toString();
        }
    }

    public static String getKeyInfoFingerprint(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "447538d4c18a2bdbc6ff7b6c2d2601ba", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "447538d4c18a2bdbc6ff7b6c2d2601ba");
        }
        Context a2 = com.meituan.android.common.locate.provider.g.a();
        return a2 == null ? "" : a(m.a(g(a2).getBytes()));
    }

    @RequiresApi(api = 17)
    public static String getLocationFingerprint(int i2) {
        Object[] objArr = {Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f3c319a2ccbc9af42c9b2736182a6b62", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f3c319a2ccbc9af42c9b2736182a6b62");
        }
        JSONObject a2 = a(i2);
        LogUtils.a("getLocationFingerprint:" + a2);
        return a2 == null ? "{}" : a2.toString();
    }

    @RequiresApi(api = 17)
    @Deprecated
    public static String getPerceptPOIFingerprint(int i2) {
        Object[] objArr = {Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a6713f1d31851ac9b39f97e6659a5238", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a6713f1d31851ac9b39f97e6659a5238");
        }
        JSONObject a2 = a(i2);
        if (a2 == null) {
            a2 = new JSONObject();
        }
        try {
            JSONArray b2 = com.meituan.android.common.locate.controller.e.a().b();
            if (b2 != null && b2.length() > 0) {
                a2.put("last_points", b2);
            }
        } catch (Exception e2) {
            LogUtils.a(e2);
        }
        return a2.toString();
    }

    public static boolean h(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo[] networkInfoArr;
        NetworkInfo activeNetworkInfo;
        String str;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d66a7f89d0fdcaa2f9f3d39aafa06cf9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d66a7f89d0fdcaa2f9f3d39aafa06cf9")).booleanValue();
        }
        if (context == null) {
            return true;
        }
        try {
            connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        } catch (Throwable th) {
            LogUtils.a("isNetworkConnected exception : " + th.getMessage());
            connectivityManager = null;
        }
        if (connectivityManager == null) {
            return false;
        }
        try {
            networkInfoArr = connectivityManager.getAllNetworkInfo();
        } catch (Exception e2) {
            LogUtils.a(LocationUtils.class, e2);
            networkInfoArr = null;
        }
        try {
            if (networkInfoArr != null) {
                int length = networkInfoArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        if (networkInfoArr[i2].getState() == NetworkInfo.State.CONNECTED) {
                            str = "network connected all net";
                            break;
                        }
                        i2++;
                    }
                }
                LogUtils.a(str);
                return true;
            }
            activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        } catch (Throwable unused) {
        }
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            LogUtils.a("network connected active net");
            return true;
        }
        NetworkInfo networkInfo = connectivityManager.getNetworkInfo(1);
        if (networkInfo == null || !networkInfo.isConnected()) {
            NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(0);
            if (networkInfo2 != null && networkInfo2.isConnected()) {
                str = "network connected mobile net";
            }
            return false;
        }
        str = "network connected wifi net";
        LogUtils.a(str);
        return true;
    }

    public static String i(Context context) {
        NetworkInfo networkInfo;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3e00b6f2dfbe9b28a1f96d4d36da063d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3e00b6f2dfbe9b28a1f96d4d36da063d");
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            return "error";
        }
        try {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } catch (Throwable th) {
            LogUtils.a("LocationUtils getNetworkType exception: " + th.getMessage());
            networkInfo = null;
        }
        if (networkInfo == null) {
            LogUtils.a("network info is null");
            return "";
        } else if (networkInfo.getType() == 1) {
            return "wifi";
        } else {
            LogUtils.a("network info getSubtype: " + networkInfo.getSubtype());
            switch (networkInfo.getSubtype()) {
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                    return "3g";
                case 4:
                case 7:
                case 11:
                case 16:
                case 17:
                case 18:
                case 19:
                default:
                    return "2g";
                case 13:
                    return "4g";
                case 20:
                    return NetworkUtil.NAME_NETWORK_5G;
            }
        }
    }

    @Deprecated
    public static boolean isUsedGCJ02(Location location) {
        return false;
    }

    public static boolean isUsedGCJ02(MtLocation mtLocation) {
        Object[] objArr = {mtLocation};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b1bc051405a4b7f218513e066547e075", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b1bc051405a4b7f218513e066547e075")).booleanValue();
        }
        if (mtLocation != null && a(mtLocation.getLatitude(), mtLocation.getLongitude())) {
            Coordinate coordinate = new Coordinate(mtLocation.getLatitude(), mtLocation.getLongitude());
            for (Rectangle rectangle : o) {
                if (Rectangle.isInRectangle(rectangle, coordinate)) {
                    for (Rectangle rectangle2 : p) {
                        if (Rectangle.isInRectangle(rectangle2, coordinate)) {
                            return false;
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Deprecated
    public static boolean isUsedGCJ02(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "60e1c3b7f24ab18cff50a149d52c0ec4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "60e1c3b7f24ab18cff50a149d52c0ec4")).booleanValue();
        }
        if (obj instanceof MtLocation) {
            return isUsedGCJ02((MtLocation) obj);
        }
        return false;
    }

    public static boolean isValidLatLon(MtLocation mtLocation) {
        String str;
        Object[] objArr = {mtLocation};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2e41d71dd25ef317927af591431f7534", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2e41d71dd25ef317927af591431f7534")).booleanValue();
        }
        if (mtLocation == null) {
            str = "isValid :location null";
        } else if (mtLocation.getLatitude() == 0.0d) {
            str = "isValid :latitude is 0 or NAN";
        } else if (mtLocation.getLongitude() == 0.0d) {
            str = "isValid :longitude is 0 or NAN";
        } else {
            String provider = mtLocation.getProvider();
            if (GearsLocator.GEARS_PROVIDER.equalsIgnoreCase(provider) || "mars".equalsIgnoreCase(provider) || "network".equals(provider)) {
                boolean z = mtLocation.getAccuracy() < 20000.0f;
                if (!z) {
                    LogUtils.a("isValid :invalid accuracy");
                }
                return z;
            }
            str = "isValid :provider is illegal :" + provider;
        }
        LogUtils.a(str);
        return false;
    }

    @Deprecated
    public static boolean isValidLatLon(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0c14f06985144a08d1fa71791da96dd5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0c14f06985144a08d1fa71791da96dd5")).booleanValue();
        }
        if (obj instanceof MtLocation) {
            return isValidLatLon((MtLocation) obj);
        }
        return false;
    }

    public static boolean isWifiConnected(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5e2d6f79916d1b07e178cf513d755b5d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5e2d6f79916d1b07e178cf513d755b5d")).booleanValue();
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            return false;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return false;
            }
            return activeNetworkInfo.getType() == 1;
        } catch (Throwable th) {
            LogUtils.a(LocationUtils.class, th);
            return false;
        }
    }

    public static boolean j(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c661380fffb25e07c4fb19fdc081f75b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c661380fffb25e07c4fb19fdc081f75b")).booleanValue();
        }
        if (context == null) {
            return false;
        }
        int a2 = Privacy.createPermissionGuard().a(context, "Locate.once", "pt-c140c5921e4d3392");
        com.meituan.android.common.locate.platform.logs.c.a(" LocationUtils checkLocatePermission checkPermission: " + a2, 3);
        return a2 > 0;
    }

    public static boolean k(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d52b0ffc74421f89dd061eb639640ecd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d52b0ffc74421f89dd061eb639640ecd")).booleanValue();
        }
        SharedPreferences b2 = com.meituan.android.common.locate.reporter.f.b(context);
        return b2 != null && b2.getBoolean("useApproximateLocate", true) && !j(context) && a(context, i.a);
    }

    @SuppressLint({"NewApi"})
    private static boolean l(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "12da3695438e2189a9e84f13ada481b5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "12da3695438e2189a9e84f13ada481b5")).booleanValue();
        }
        if (context == null) {
            return false;
        }
        ContentResolver contentResolver = context.getContentResolver();
        if (b() < 17) {
            try {
                return ((Integer) l.a("android.provider.Settings$System", "getInt", new Object[]{contentResolver, ((String) l.a("android.provider.Settings$System", "AIRPLANE_MODE_ON")).toString()}, new Class[]{ContentResolver.class, String.class})).intValue() == 1;
            } catch (Exception e2) {
                LogUtils.a("airPlainModeOn exception: " + e2.getMessage());
            }
        } else {
            try {
                String str = "airplane_mode_on".toString();
                Object[] objArr2 = {contentResolver, str};
                Class[] clsArr = {ContentResolver.class, String.class};
                Integer valueOf = Integer.valueOf(Settings.Global.getInt(contentResolver, str));
                LogUtils.a("LocationUtils: airPlaneModeOn " + valueOf.intValue());
                if (valueOf.intValue() == 1) {
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static final double meterDistanceBetweenPoints(double d2, double d3, double d4, double d5) {
        Object[] objArr = {Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4), Double.valueOf(d5)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "45e18acd3aac863e48a229c392fdad31", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "45e18acd3aac863e48a229c392fdad31")).doubleValue();
        }
        double d6 = d2 / 57.295780181884766d;
        double d7 = d3 / 57.295780181884766d;
        double d8 = d4 / 57.295780181884766d;
        double d9 = d5 / 57.295780181884766d;
        return Math.acos((Math.cos(d6) * Math.cos(d7) * Math.cos(d8) * Math.cos(d9)) + (Math.cos(d6) * Math.sin(d7) * Math.cos(d8) * Math.sin(d9)) + (Math.sin(d6) * Math.sin(d8))) * 6366000.0d;
    }

    public static void onAppBackground() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "59d2cd07eae95d44b8de3d30df2f58a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "59d2cd07eae95d44b8de3d30df2f58a3");
        } else {
            k.a().c();
        }
    }

    public static void onAppForeground() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "55e126eda298dda37e9908a18a2ebeae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "55e126eda298dda37e9908a18a2ebeae");
        } else {
            k.a().b();
        }
    }

    @Deprecated
    public static void setBusiness(LoadBusinessEnum loadBusinessEnum) {
        n = loadBusinessEnum;
    }

    public static void setChannel(CHANNEL channel) {
        Object[] objArr = {channel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3b97b7aae21974b1ef81bc9565f714f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3b97b7aae21974b1ef81bc9565f714f3");
        } else if (!TextUtils.isEmpty(j) || channel == null) {
            LogUtils.a("sChannel is not empty or channel is null");
        } else {
            switch (channel) {
                case MEITUAN:
                    j = "MEITUAN";
                    return;
                case DIANPING:
                    j = "DIANPING";
                    return;
                default:
                    return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
        if (r1.equals("DIANPING") != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void setUserid(java.lang.String r12) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.android.common.locate.util.LocationUtils.changeQuickRedirect
            java.lang.String r11 = "3dbe10f7aac7a9601babd727f5bbe119"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1c
            r12 = 0
            com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r0, r11)
            return
        L1c:
            boolean r1 = android.text.TextUtils.isEmpty(r12)
            if (r1 != 0) goto L8b
            java.lang.String r1 = com.meituan.android.common.locate.util.LocationUtils.j
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L2b
            goto L8b
        L2b:
            java.lang.String r1 = com.meituan.android.common.locate.util.LocationUtils.j
            r2 = -1
            int r3 = r1.hashCode()
            r4 = 550663140(0x20d273e4, float:3.5652074E-19)
            if (r3 == r4) goto L47
            r0 = 1663721375(0x632a5f9f, float:3.1428367E21)
            if (r3 == r0) goto L3d
            goto L50
        L3d:
            java.lang.String r0 = "MEITUAN"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L50
            r0 = 0
            goto L51
        L47:
            java.lang.String r3 = "DIANPING"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L50
            goto L51
        L50:
            r0 = -1
        L51:
            switch(r0) {
                case 0: goto L5d;
                case 1: goto L55;
                default: goto L54;
            }
        L54:
            return
        L55:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "dianping:"
            r0.<init>(r1)
            goto L65
        L5d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "meituan:"
            r0.<init>(r1)
        L65:
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "userid is: "
            r0.<init>(r1)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            com.meituan.android.common.locate.util.LogUtils.a(r0)
            com.meituan.android.common.locate.provider.a.b(r12)
            android.content.Context r0 = com.meituan.android.common.locate.provider.g.a()
            if (r0 == 0) goto L8a
            a(r12, r0)
        L8a:
            return
        L8b:
            java.lang.String r12 = "setuserid is empty or channel is null"
            com.meituan.android.common.locate.util.LogUtils.a(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.locate.util.LocationUtils.setUserid(java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
        if (r1.equals("DIANPING") != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void setUuid(java.lang.String r12) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.android.common.locate.util.LocationUtils.changeQuickRedirect
            java.lang.String r11 = "5c6a5f053c1cd6f5460c9c388e5f7312"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1c
            r12 = 0
            com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r0, r11)
            return
        L1c:
            boolean r1 = android.text.TextUtils.isEmpty(r12)
            if (r1 != 0) goto L82
            java.lang.String r1 = com.meituan.android.common.locate.util.LocationUtils.j
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L2b
            goto L82
        L2b:
            java.lang.String r1 = com.meituan.android.common.locate.util.LocationUtils.j
            r2 = -1
            int r3 = r1.hashCode()
            r4 = 550663140(0x20d273e4, float:3.5652074E-19)
            if (r3 == r4) goto L47
            r0 = 1663721375(0x632a5f9f, float:3.1428367E21)
            if (r3 == r0) goto L3d
            goto L50
        L3d:
            java.lang.String r0 = "MEITUAN"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L50
            r0 = 0
            goto L51
        L47:
            java.lang.String r3 = "DIANPING"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L50
            goto L51
        L50:
            r0 = -1
        L51:
            switch(r0) {
                case 0: goto L5d;
                case 1: goto L55;
                default: goto L54;
            }
        L54:
            return
        L55:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "dpid:"
            r0.<init>(r1)
            goto L65
        L5d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "uuid:"
            r0.<init>(r1)
        L65:
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "uuid is: "
            r0.<init>(r1)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            com.meituan.android.common.locate.util.LogUtils.a(r0)
            com.meituan.android.common.locate.provider.a.c(r12)
            return
        L82:
            java.lang.String r12 = "setUuid is empty or channel is null"
            com.meituan.android.common.locate.util.LogUtils.a(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.locate.util.LocationUtils.setUuid(java.lang.String):void");
    }
}
