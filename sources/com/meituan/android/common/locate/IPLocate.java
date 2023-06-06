package com.meituan.android.common.locate;

import android.os.Bundle;
import android.text.TextUtils;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.android.common.locate.remote.IPLocateApi;
import com.meituan.android.common.locate.reporter.f;
import com.meituan.android.common.locate.util.LocationUtils;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.metrics.traffic.hurl.HttpURLWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.location.collector.utils.g;
import com.sankuai.meituan.retrofit2.Response;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.ar;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class IPLocate {
    private static IPLocate b;
    public static ChangeQuickRedirect changeQuickRedirect;
    private IPLocateApi a;
    private int c;

    /* loaded from: classes2.dex */
    public static class IPLocateResult {
        public static final int STATUS_FROM_WHERE_EMPTY = 19;
        public static final int STATUS_IP_LOCATION_ERROR = 18;
        public static final int STATUS_RESPONSE_ERROR = 17;
        public static final int STATUS_SUCCESS = 16;
        public static ChangeQuickRedirect changeQuickRedirect;
        private String adcode;
        private String city;
        private String country;
        private String district;
        private String dpCityId;
        private String fromwhere;
        private String isp;
        private double lat;
        private double lng;
        private Bundle mExtras;
        private int mIpCode;
        private String mtCityId;
        private String province;

        public IPLocateResult() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e84d622a476f87f7b78412d5db5a8dc6", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e84d622a476f87f7b78412d5db5a8dc6");
                return;
            }
            this.mIpCode = 16;
            this.mExtras = null;
        }

        public String getAdcode() {
            return this.adcode;
        }

        public String getCity() {
            return this.city;
        }

        public String getCountry() {
            return this.country;
        }

        public String getDistrict() {
            return this.district;
        }

        public String getDpCityId() {
            return this.dpCityId;
        }

        public Bundle getExtras() {
            return this.mExtras;
        }

        public String getFromwhere() {
            return this.fromwhere;
        }

        public int getIpCode() {
            return this.mIpCode;
        }

        public String getIsp() {
            return this.isp;
        }

        public double getLat() {
            return this.lat;
        }

        public double getLng() {
            return this.lng;
        }

        public String getMtCityId() {
            return this.mtCityId;
        }

        public String getProvince() {
            return this.province;
        }

        public void setAdcode(String str) {
            this.adcode = str;
        }

        public void setCity(String str) {
            this.city = str;
        }

        public void setCountry(String str) {
            this.country = str;
        }

        public void setDistrict(String str) {
            this.district = str;
        }

        public void setDpCityId(String str) {
            this.dpCityId = str;
        }

        public void setExtras(Bundle bundle) {
            Object[] objArr = {bundle};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fd366c690c0740e2af8d678f2552529f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fd366c690c0740e2af8d678f2552529f");
            } else {
                this.mExtras = bundle == null ? null : new Bundle(bundle);
            }
        }

        public void setFromwhere(String str) {
            this.fromwhere = str;
        }

        public void setIpCode(int i) {
            this.mIpCode = i;
        }

        public void setIsp(String str) {
            this.isp = str;
        }

        public void setLat(double d) {
            Object[] objArr = {Double.valueOf(d)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1702cb43e0ec052d33fa526967ccb6af", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1702cb43e0ec052d33fa526967ccb6af");
            } else {
                this.lat = d;
            }
        }

        public void setLng(double d) {
            Object[] objArr = {Double.valueOf(d)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e62a33132fc5e955bdb011db1d4dff73", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e62a33132fc5e955bdb011db1d4dff73");
            } else {
                this.lng = d;
            }
        }

        public void setMtCityId(String str) {
            this.mtCityId = str;
        }

        public void setProvince(String str) {
            this.province = str;
        }

        public String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6dabf4ece5a87c25cedb1d87cb0c59d8", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6dabf4ece5a87c25cedb1d87cb0c59d8");
            }
            return "IPLocateResult{fromwhere='" + this.fromwhere + "', lng=" + this.lng + ", lat=" + this.lat + ", isp='" + this.isp + "', country='" + this.country + "', province='" + this.province + "', city='" + this.city + "', district='" + this.district + "', adcode='" + this.adcode + "', mtCityId='" + this.mtCityId + "', dpCityId='" + this.dpCityId + "', IpCode='" + String.valueOf(this.mIpCode) + "'}";
        }
    }

    /* loaded from: classes2.dex */
    public interface RequestIpLocate {
        void onIPLocationChanged(IPLocateResult iPLocateResult);
    }

    @Deprecated
    public IPLocate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "26485b26ef9b880a328f4716ca1cbe7d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "26485b26ef9b880a328f4716ca1cbe7d");
            return;
        }
        this.c = 0;
        ar b2 = com.meituan.android.common.locate.remote.b.b();
        if (b2 != null) {
            this.a = (IPLocateApi) b2.a(IPLocateApi.class);
        }
        this.c = com.meituan.android.common.locate.provider.a.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0226  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.meituan.android.common.locate.IPLocate.IPLocateResult a(int r12, java.lang.String r13, java.lang.String r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 579
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.locate.IPLocate.a(int, java.lang.String, java.lang.String, java.lang.String):com.meituan.android.common.locate.IPLocate$IPLocateResult");
    }

    private IPLocateResult a(Response<ap> response) {
        Object[] objArr = {response};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f93abdd1f89273ee56c78351a315b4dd", RobustBitConfig.DEFAULT_VALUE)) {
            return (IPLocateResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f93abdd1f89273ee56c78351a315b4dd");
        }
        IPLocateResult iPLocateResult = new IPLocateResult();
        if (response != null && response.b() == 200) {
            String str = "";
            if (f.b().getBoolean("ip_location_encrypt_switcher", true)) {
                try {
                    InputStream source = response.e().source();
                    if (source != null) {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        g.a(source, byteArrayOutputStream);
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        source.close();
                        str = new String(LocationUtils.f(byteArray), Charset.forName("UTF-8"));
                    }
                } catch (IOException unused) {
                    return iPLocateResult;
                }
            } else {
                str = response.e().string();
            }
            return a(str);
        }
        return iPLocateResult;
    }

    private static IPLocateResult a(String str) {
        JSONObject optJSONObject;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1d7302adfd3a7928176884dcdb9214df", RobustBitConfig.DEFAULT_VALUE)) {
            return (IPLocateResult) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1d7302adfd3a7928176884dcdb9214df");
        }
        IPLocateResult iPLocateResult = new IPLocateResult();
        if (TextUtils.isEmpty(str)) {
            return iPLocateResult;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = new JSONObject();
            if (jSONObject.has("data")) {
                jSONObject2 = jSONObject.optJSONObject("data");
                iPLocateResult.setFromwhere(jSONObject2.optString("fromwhere"));
                iPLocateResult.setLng(jSONObject2.optDouble("lng"));
                iPLocateResult.setLat(jSONObject2.optDouble("lat"));
                iPLocateResult.setIsp(jSONObject2.optString("isp"));
                iPLocateResult.setDpCityId(jSONObject2.optString(GearsLocator.DP_CITY_ID));
                iPLocateResult.setMtCityId(jSONObject2.optString(GearsLocator.MT_CITY_ID));
            }
            if (jSONObject2.has("rgeo") && (optJSONObject = jSONObject2.optJSONObject("rgeo")) != null) {
                iPLocateResult.setCountry(optJSONObject.optString(GearsLocator.COUNTRY));
                iPLocateResult.setProvince(optJSONObject.optString("province"));
                iPLocateResult.setCity(optJSONObject.optString("city"));
                iPLocateResult.setDistrict(optJSONObject.optString(GearsLocator.DISTRICT));
                iPLocateResult.setAdcode(optJSONObject.optString(GearsLocator.AD_CODE));
            }
        } catch (Throwable th) {
            LogUtils.a(th);
        }
        return iPLocateResult;
    }

    private static String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d6b9357125fa83d087a73e47677b67a7", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d6b9357125fa83d087a73e47677b67a7") : com.meituan.android.common.locate.cache.b.a() ? "https://mars.zservey.com/locate/v2/ip/loc?" : "https://mars.meituan.com/locate/v2/ip/loc?";
    }

    private static String a(InputStream inputStream) throws IOException {
        Object[] objArr = {inputStream};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "06fd5c526468e91b989f981db31acb49", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "06fd5c526468e91b989f981db31acb49");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        g.a(inputStream, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();
        inputStream.close();
        return new String(LocationUtils.f(byteArray), Charset.forName("UTF-8"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public IPLocateResult b() throws IOException {
        Response<ap> response;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8c71bc4b395128c6756579d418ce307e", RobustBitConfig.DEFAULT_VALUE)) {
            return (IPLocateResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8c71bc4b395128c6756579d418ce307e");
        }
        IPLocateResult iPLocateResult = new IPLocateResult();
        String str = "";
        if (this.a != null) {
            try {
                response = (f.b().getBoolean("ip_location_encrypt_switcher", true) ? this.a.sendRequestWithNoIP("", true, this.c) : this.a.sendRequestWithNoIPEncrypted("", true, this.c)).a();
            } catch (Throwable th) {
                LogUtils.a(th);
                response = null;
            }
            if (response == null || !response.f()) {
                throw new IOException("reponse not success");
            }
            return a(response);
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) HttpURLWrapper.wrapURLConnection(new URL(a() + "rgeo=true&cityid=" + this.c).openConnection());
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setConnectTimeout(5000);
            httpURLConnection.setRequestProperty("X-Default-Location", "1");
            httpURLConnection.setRequestProperty("connection", "Keep-Alive");
            httpURLConnection.setRequestProperty("Content-Type", "text/plain");
            LocationUtils.a(httpURLConnection);
            if (f.b().getBoolean("ip_location_encrypt_switcher", true)) {
                httpURLConnection.setRequestProperty("X-Response-Encrypt", "1");
                httpURLConnection.setRequestProperty("X-Response-Encoding", "gzip");
            }
            httpURLConnection.connect();
            if (httpURLConnection.getResponseCode() == 200) {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (!f.b().getBoolean("ip_location_encrypt_switcher", true)) {
                    str = g.a(inputStream);
                } else if (inputStream != null) {
                    str = a(inputStream);
                }
            }
            return a(str);
        } catch (Exception e) {
            LogUtils.a(e);
            return iPLocateResult;
        }
    }

    public static IPLocate getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "75d5b0902923e0285e1200aa88f78498", RobustBitConfig.DEFAULT_VALUE)) {
            return (IPLocate) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "75d5b0902923e0285e1200aa88f78498");
        }
        if (b == null) {
            synchronized (IPLocate.class) {
                b = new IPLocate();
            }
        }
        return b;
    }

    public static void requestIPLocate(final RequestIpLocate requestIpLocate, final int i, final String str, final String str2, final String str3) {
        Object[] objArr = {requestIpLocate, Integer.valueOf(i), str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f7914492ca422d1854c8de923dcc1460", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f7914492ca422d1854c8de923dcc1460");
        } else {
            com.meituan.android.common.locate.util.f.a().a(new Runnable() { // from class: com.meituan.android.common.locate.IPLocate.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "84594e50df19e765bf161043674d3776", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "84594e50df19e765bf161043674d3776");
                    } else {
                        IPLocate.requestIPLocateSync(RequestIpLocate.this, i, str, str2, str3);
                    }
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void requestIPLocateSync(com.meituan.android.common.locate.IPLocate.RequestIpLocate r22, int r23, java.lang.String r24, java.lang.String r25, java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.locate.IPLocate.requestIPLocateSync(com.meituan.android.common.locate.IPLocate$RequestIpLocate, int, java.lang.String, java.lang.String, java.lang.String):void");
    }

    @Deprecated
    public IPLocateResult requestIPLocate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fa8666f56b2d228390512799577fef90", RobustBitConfig.DEFAULT_VALUE)) {
            return (IPLocateResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fa8666f56b2d228390512799577fef90");
        }
        try {
            return b();
        } catch (Throwable th) {
            LogUtils.a(th);
            return null;
        }
    }

    public synchronized void requestIPLocateUpdate(final RequestIpLocate requestIpLocate) {
        Object[] objArr = {requestIpLocate};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8d40e7c8d7fbf5e5793f144735c3f23e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8d40e7c8d7fbf5e5793f144735c3f23e");
        } else if (requestIpLocate == null) {
            LogUtils.a("requestIplocate is null return");
        } else {
            com.meituan.android.common.locate.util.f.a().a(new Runnable() { // from class: com.meituan.android.common.locate.IPLocate.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "3976589dc11f3f5ba81fcac2d4cda45a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "3976589dc11f3f5ba81fcac2d4cda45a");
                        return;
                    }
                    try {
                        requestIpLocate.onIPLocationChanged(IPLocate.this.b());
                    } catch (Throwable th) {
                        LogUtils.a("requestIplocate exce：" + th.getMessage());
                    }
                }
            });
        }
    }
}
