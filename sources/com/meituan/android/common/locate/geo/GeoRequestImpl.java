package com.meituan.android.common.locate.geo;

import android.location.Location;
import android.text.TextUtils;
import android.util.Base64;
import com.meituan.android.common.locate.AddressResult;
import com.meituan.android.common.locate.GeoCoder;
import com.meituan.android.common.locate.MtLocation;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.android.common.locate.remote.IGeocoderApi;
import com.meituan.android.common.locate.reporter.f;
import com.meituan.android.common.locate.util.LocationUtils;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.location.collector.utils.g;
import com.sankuai.meituan.retrofit2.Response;
import com.sankuai.meituan.retrofit2.ap;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.ResponseBody;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class GeoRequestImpl implements GeoCoder {
    private static final String MEITUAN_URL = "https://apimobile.meituan.com/group/v1/city/latlng/";
    public static ChangeQuickRedirect changeQuickRedirect;
    private IGeocoderApi mGeoCoderApi;
    private OkHttpClient okHttpClient;
    private int tag;

    public GeoRequestImpl(IGeocoderApi iGeocoderApi, OkHttpClient okHttpClient) {
        Object[] objArr = {iGeocoderApi, okHttpClient};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3a90eb8204fb7c86bfc8d6025b7ffa2d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3a90eb8204fb7c86bfc8d6025b7ffa2d");
            return;
        }
        this.tag = 0;
        this.mGeoCoderApi = iGeocoderApi;
        this.okHttpClient = okHttpClient;
    }

    private AddressResult doRemoteRequest(MtLocation mtLocation, int i) throws IOException {
        String str;
        Object[] objArr = {mtLocation, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d7b9223c5e8ad8345adef575bf623aa2", RobustBitConfig.DEFAULT_VALUE)) {
            return (AddressResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d7b9223c5e8ad8345adef575bf623aa2");
        }
        if (mtLocation != null) {
            AddressResult addressResult = new AddressResult();
            if (this.mGeoCoderApi != null) {
                try {
                    Response<ap> a = (f.b().getBoolean("geo_encrypt_switcher", false) ? this.mGeoCoderApi.sendGotEncryptData(encryptLatLng(mtLocation.getLatitude(), mtLocation.getLongitude()), i, 1) : this.mGeoCoderApi.send(mtLocation.getLatitude(), mtLocation.getLongitude(), i)).a();
                    if (!a.f()) {
                        throw new IOException("response not success");
                    }
                    addressResult = onResponseGot(a);
                } catch (Throwable th) {
                    throw new IOException(th.getMessage());
                }
            } else if (this.okHttpClient != null) {
                if (f.b().getBoolean("geo_encrypt_switcher", false)) {
                    str = MEITUAN_URL + encryptLatLng(mtLocation.getLatitude(), mtLocation.getLongitude()) + "?tag=" + i + "&encrypt=1";
                } else {
                    str = MEITUAN_URL + mtLocation.getLatitude() + CommonConstant.Symbol.COMMA + mtLocation.getLongitude() + "?tag=" + i;
                }
                okhttp3.Response execute = this.okHttpClient.newCall(new Request.Builder().url(str).build()).execute();
                if (!execute.isSuccessful()) {
                    throw new IOException("response not success");
                }
                ResponseBody body = execute.body();
                if (body == null) {
                    throw new IOException("response not success");
                }
                addressResult = handleJsonString(f.b().getBoolean("geo_encrypt_switcher", false) ? new String(LocationUtils.f(Base64.decode(body.bytes(), 0)), Charset.forName("UTF-8")) : body.string());
            }
            com.meituan.android.common.locate.a.a().a(mtLocation, addressResult);
            return addressResult;
        }
        throw new IOException("loc is null");
    }

    private String encryptLatLng(double d, double d2) {
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8d38ccf9b773f293f7f2657b68f7cd14", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8d38ccf9b773f293f7f2657b68f7cd14");
        }
        return Base64.encodeToString(LocationUtils.b((d + CommonConstant.Symbol.COMMA + d2).getBytes(Charset.forName("UTF-8"))), 0).replace("\n", "").replace("\r", "");
    }

    private AddressResult getFromNet(MtLocation mtLocation) throws IOException {
        Object[] objArr = {mtLocation};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c1320ffd3dc59577fae45cc7e55515f4", RobustBitConfig.DEFAULT_VALUE)) {
            return (AddressResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c1320ffd3dc59577fae45cc7e55515f4");
        }
        if ("network".equals(mtLocation.getProvider()) || "gps".equals(mtLocation.getProvider())) {
            this.tag = 1;
        } else {
            this.tag = 0;
        }
        return doRemoteRequest(mtLocation, this.tag);
    }

    private AddressResult handleJsonString(String str) {
        int lastIndexOf;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0b0a6b9b201cb8df6f1e83cdc0978277", RobustBitConfig.DEFAULT_VALUE)) {
            return (AddressResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0b0a6b9b201cb8df6f1e83cdc0978277");
        }
        AddressResult addressResult = new AddressResult();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("code") && jSONObject.getInt("code") != 200) {
                addressResult.setErrorCode(3);
                return addressResult;
            } else if (jSONObject.has("error")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("error");
                addressResult.setErrorCode(jSONObject2.has("code") ? jSONObject2.getInt("code") : 3);
                addressResult.setDetail(jSONObject2.has("message") ? jSONObject2.getString("message") : "");
                return addressResult;
            } else {
                JSONObject jSONObject3 = jSONObject.getJSONObject("data");
                String string = jSONObject3.getString(TextUtils.isEmpty(jSONObject3.getString("city")) ? "province" : "city");
                if (string != null && (lastIndexOf = string.lastIndexOf("市")) > 0 && lastIndexOf < string.length()) {
                    string = string.substring(0, lastIndexOf);
                }
                addressResult.setCity(string);
                addressResult.setDistrict(jSONObject3.getString(GearsLocator.DISTRICT));
                addressResult.setDetail(jSONObject3.getString(GearsLocator.DETAIL));
                addressResult.setCityId(jSONObject3.optInt("id", -2));
                if (!jSONObject3.optBoolean("isOpen", true)) {
                    addressResult.setErrorCode(4);
                }
                return addressResult;
            }
        } catch (JSONException e) {
            LogUtils.a("getFromNet JSONException: " + e.getMessage());
            addressResult.setErrorCode(3);
            return addressResult;
        }
    }

    private AddressResult onResponseGot(Response<ap> response) throws IOException {
        String string;
        Object[] objArr = {response};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "418d55de1dfb97028536b8d4df5fd067", RobustBitConfig.DEFAULT_VALUE)) {
            return (AddressResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "418d55de1dfb97028536b8d4df5fd067");
        }
        if (response != null) {
            try {
                if (response.b() == 200) {
                    if (f.b().getBoolean("geo_encrypt_switcher", false)) {
                        InputStream source = response.e().source();
                        if (source == null) {
                            AddressResult addressResult = new AddressResult();
                            addressResult.setErrorCode(2);
                            return addressResult;
                        }
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        g.a(source, byteArrayOutputStream);
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        source.close();
                        string = new String(LocationUtils.f(Base64.decode(byteArray, 0)), Charset.forName("UTF-8"));
                    } else {
                        string = response.e().string();
                    }
                    return handleJsonString(string);
                }
                throw new IOException("status is not 200");
            } catch (IOException e) {
                LogUtils.a("getFromNet JSONException: " + e.getMessage());
                AddressResult addressResult2 = new AddressResult();
                addressResult2.setErrorCode(3);
                return addressResult2;
            } catch (Throwable th) {
                throw new IOException(th.getMessage());
            }
        }
        throw new IOException("response is null");
    }

    @Override // com.meituan.android.common.locate.GeoCoder
    @Deprecated
    public AddressResult getAddress(Location location) {
        return null;
    }

    @Override // com.meituan.android.common.locate.GeoCoder
    public AddressResult getAddress(MtLocation mtLocation) throws IOException {
        Object[] objArr = {mtLocation};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "578fc4a80d1353732423a630a29d606e", RobustBitConfig.DEFAULT_VALUE)) {
            return (AddressResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "578fc4a80d1353732423a630a29d606e");
        }
        if (mtLocation == null) {
            LogUtils.a("GeoCoderImplRetrofit getAddress location is null");
            return null;
        }
        AddressResult a = com.meituan.android.common.locate.a.a().a(mtLocation);
        if (a == null) {
            try {
                a = getFromNet(mtLocation);
            } catch (Throwable th) {
                com.meituan.android.common.locate.platform.sniffer.a.b(th.getMessage());
                throw th;
            }
        }
        if (a != null && a.getErrorCode() == 0) {
            com.meituan.android.common.locate.platform.sniffer.a.f();
        }
        return a;
    }
}
