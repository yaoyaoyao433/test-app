package com.sankuai.meituan.tte;

import android.support.annotation.NonNull;
import android.support.annotation.VisibleForTesting;
import android.util.Pair;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.metrics.traffic.hurl.HttpURLWrapper;
import com.meituan.msc.modules.engine.requestPrefetch.PrefetchConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.platform.message.BasicPushStatus;
import com.sankuai.meituan.tte.i;
import com.sankuai.meituan.tte.w;
import com.sankuai.meituan.tte.x;
import com.sankuai.waimai.monitor.model.ErrorCode;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.InvalidKeyException;
import java.security.SignatureException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class r {
    public static ChangeQuickRedirect a;
    final v b;
    private final x.b c;
    private final i d;
    private final String e;

    public r(x.b bVar) {
        byte[] a2;
        i jVar;
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9c4cf1575bd9986dde37986f260a955", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9c4cf1575bd9986dde37986f260a955");
            return;
        }
        this.c = bVar;
        if (bVar.c == x.a.SM) {
            jVar = k.a(bVar.b);
        } else {
            x.d dVar = bVar.b;
            Object[] objArr2 = {dVar};
            ChangeQuickRedirect changeQuickRedirect2 = j.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "1857870c8f66d39f7e730d2ae0d5f236", RobustBitConfig.DEFAULT_VALUE)) {
                jVar = (j) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "1857870c8f66d39f7e730d2ae0d5f236");
            } else {
                if (x.d.PROD == dVar) {
                    a2 = y.a("BLsK/E2JrJppyq15CPr4XYOmnZnClLWeUmpoffJFAVFJRZ3Bv5mNjejH+x4ebktFb9ojmWlX8bb44PBFaTy2pmU=");
                } else {
                    a2 = y.a("BEs9LHk22O9/8TPTR3dgPcEqU/2J8/QO8bxl82NRSMGxxhQgnAKxzUIL6IOsdwgXTxlHNIe0ylJ/CazdXg2LG4U=");
                }
                jVar = new j(a2);
            }
        }
        this.d = jVar;
        String str = bVar.b == x.d.PROD ? "https://tte.meituan.com" : "https://tte.inf.test.sankuai.com";
        String str2 = bVar.c == x.a.SM ? "/api/v1/tte/gmt" : "/api/v1/tte/fips";
        this.e = str + str2;
        this.b = new v("TKeyAgreement", this.c.a());
    }

    @VisibleForTesting
    public final ScheduledExecutorService a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ac318e93fa13154421f4094f1ed51f6", RobustBitConfig.DEFAULT_VALUE) ? (ScheduledExecutorService) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ac318e93fa13154421f4094f1ed51f6") : g.a();
    }

    @NonNull
    public final l b() throws Exception {
        i.a aVar;
        l lVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39bd2c72f480695850090658c7b0c371", RobustBitConfig.DEFAULT_VALUE)) {
            return (l) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39bd2c72f480695850090658c7b0c371");
        }
        w.a b = w.b();
        if (b == null) {
            b = w.c;
        }
        w.a aVar2 = b;
        try {
            aVar2.a("algo", this.d.a());
            aVar2.a("bizCode", "-1");
            aVar2.a("httpCode", "-1");
            aVar2.a("code", "0");
            try {
                try {
                    aVar = this.d.b();
                } catch (Throwable th) {
                    th = th;
                    aVar = null;
                }
                try {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("protVer", 1);
                        jSONObject.put("serKeyVer", 1);
                        jSONObject.put("cliKeyVer", 1);
                        jSONObject.put("cliTempPubKey", y.a(aVar.a()));
                        JSONObject put = new JSONObject().put("platform", "android");
                        StringBuilder sb = new StringBuilder();
                        sb.append(y.b());
                        jSONObject.put("otherData", put.put("appId", sb.toString()).put("uuid", y.c()));
                        byte[] bytes = jSONObject.toString().getBytes();
                        try {
                            JSONObject a2 = a(this.e + "/ka", bytes);
                            this.b.b("resp: " + a2);
                            aVar2.a("httpCode", BasicPushStatus.SUCCESS_CODE);
                            int optInt = a2.optInt("code");
                            aVar2.a("bizCode", String.valueOf(optInt));
                            if (optInt != 200) {
                                aVar2.a("code", "1");
                                throw new IOException("api exception, status code: " + optInt + ", msg:" + a2.optString("msg", ""));
                            }
                            try {
                                JSONObject jSONObject2 = a2.getJSONObject("data");
                                byte[] a3 = y.a(jSONObject2.getString("serTempPubKey"));
                                byte[] a4 = y.a(jSONObject2.getString("keyCipher"));
                                if (!a(bytes, a3, a4, y.a(jSONObject2.getString(DeviceInfo.SIGN)))) {
                                    aVar2.a("code", "1002");
                                    throw new SignatureException("invalid signature");
                                }
                                try {
                                    byte[] a5 = aVar.a(a3);
                                    this.b.a("tempDK: " + y.a(a5));
                                    try {
                                        Object[] objArr2 = {a4, a5};
                                        ChangeQuickRedirect changeQuickRedirect2 = a;
                                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a2a71b8cf1f40e56c8dc6530b8c54ca8", RobustBitConfig.DEFAULT_VALUE)) {
                                            lVar = (l) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a2a71b8cf1f40e56c8dc6530b8c54ca8");
                                        } else if (a4 == null || a4.length == 0 || a5 == null) {
                                            throw new IllegalArgumentException("tempDK is null");
                                        } else {
                                            String[] split = new String(this.d.b(a4, a5)).split("###");
                                            if (split.length != 2) {
                                                throw new InvalidKeyException("wrong key format");
                                            }
                                            byte[] a6 = y.a(split[0]);
                                            if (a6 == null || a6.length == 0) {
                                                throw new InvalidKeyException("dk is null");
                                            }
                                            byte[] a7 = y.a(split[1]);
                                            if (a7 == null || a7.length == 0) {
                                                throw new InvalidKeyException("edk is null");
                                            }
                                            l lVar2 = new l(this.c.b, this.c.c.d, a6, a7);
                                            lVar2.f = System.currentTimeMillis();
                                            lVar = lVar2;
                                        }
                                        y.a(aVar);
                                        return lVar;
                                    } catch (Exception e) {
                                        aVar2.a("code", "1003");
                                        throw e;
                                    }
                                } catch (Exception e2) {
                                    aVar2.a("code", ErrorCode.ERROR_CODE_OKHTTP_EXCEPTION);
                                    throw e2;
                                }
                            } catch (Exception e3) {
                                aVar2.a("code", "1008");
                                throw e3;
                            }
                        } catch (a e4) {
                            aVar2.a("httpCode", String.valueOf(e4.a));
                            aVar2.a("code", "2");
                            throw e4;
                        } catch (Exception e5) {
                            aVar2.a("code", "2");
                            throw e5;
                        }
                    } catch (Exception e6) {
                        aVar2.a("code", "1009");
                        throw e6;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    y.a(aVar);
                    throw th;
                }
            } catch (Exception e7) {
                aVar2.a("code", "1004");
                throw e7;
            }
        } finally {
            aVar2.a();
        }
    }

    private boolean a(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws Exception {
        Object[] objArr = {bArr, bArr2, bArr3, bArr4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "380d0e3897917fc22aad07874e5d8953", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "380d0e3897917fc22aad07874e5d8953")).booleanValue();
        }
        try {
            return this.d.a(y.a(bArr, bArr2, bArr3), bArr4);
        } catch (Throwable th) {
            this.b.a("verify signature failed", th);
            return false;
        }
    }

    @VisibleForTesting
    private byte[] a(String str, List<Pair<String, String>> list, byte[] bArr) throws IOException {
        OutputStream outputStream;
        Object[] objArr = {str, list, bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb32b275ba498af2e7397414232fe285", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb32b275ba498af2e7397414232fe285");
        }
        v vVar = this.b;
        vVar.a("post[" + str + "] => " + new String(bArr));
        HttpURLConnection httpURLConnection = (HttpURLConnection) HttpURLWrapper.wrapURLConnection(new URL(str).openConnection());
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setReadTimeout(15000);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setDoOutput(true);
        if (list != null) {
            for (Pair<String, String> pair : list) {
                httpURLConnection.addRequestProperty((String) pair.first, (String) pair.second);
            }
        }
        OutputStream outputStream2 = null;
        try {
            outputStream = httpURLConnection.getOutputStream();
        } catch (Throwable th) {
            th = th;
        }
        try {
            outputStream.write(bArr);
            y.a(outputStream);
            int responseCode = httpURLConnection.getResponseCode();
            v vVar2 = this.b;
            vVar2.b("post[" + str + "] <= " + responseCode);
            if (responseCode / 100 != 2) {
                throw new a(httpURLConnection.getResponseMessage(), responseCode);
            }
            return y.a(httpURLConnection.getInputStream());
        } catch (Throwable th2) {
            th = th2;
            outputStream2 = outputStream;
            y.a(outputStream2);
            throw th;
        }
    }

    private JSONObject a(String str, byte[] bArr) throws IOException, JSONException {
        Object[] objArr = {str, bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "283fe3666b5ab04a446ac2205f091c63", RobustBitConfig.DEFAULT_VALUE) ? (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "283fe3666b5ab04a446ac2205f091c63") : new JSONObject(new String(a(str, Arrays.asList(new Pair("Content-Type", PrefetchConfig.PREFETCH_POST_CONTENT_TYPE_JSON)), bArr)));
    }

    public final boolean a(l lVar, boolean z) {
        q a2;
        byte[] bytes;
        JSONObject a3;
        int i;
        Object[] objArr = {lVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c716c7230c9c6cbe740020f1920546ed", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c716c7230c9c6cbe740020f1920546ed")).booleanValue();
        }
        if (e.a(x.a()).a(this.c.c).c()) {
            this.b.b("verifyKey: disable");
            return true;
        }
        w.a a4 = w.a("tte.keyVerify.result", "keyVerify");
        try {
            a4.a("algo", this.d.a());
            a4.a("type", z ? "2" : "1");
            a4.a("bizCode", "-1");
            a4.a("httpCode", "-1");
            a4.a("code", "0");
            try {
                try {
                    a2 = lVar.c.a();
                    String str = this.e + "/verify";
                    bytes = "Client Hello".getBytes();
                    try {
                        a3 = a(str, new JSONObject().put("cipher", y.a(a2.a(bytes, lVar.d))).put("edk", y.a(lVar.e)).toString().getBytes());
                        a4.a("httpCode", BasicPushStatus.SUCCESS_CODE);
                        i = a3.getInt("code");
                        StringBuilder sb = new StringBuilder();
                        sb.append(i);
                        a4.a("bizCode", sb.toString());
                    } catch (a e) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(e.a);
                        a4.a("httpCode", sb2.toString());
                        a4.a("code", "2");
                        throw e;
                    } catch (Exception e2) {
                        a4.a("code", "2");
                        throw e2;
                    }
                } catch (c e3) {
                    this.b.b("verifyKey", e3);
                    if (e3.b == -10100) {
                        a4.a("code", "1004");
                        a4.b();
                        return false;
                    }
                    a4.a("code", "1005");
                } catch (IOException e4) {
                    this.b.a("verifyKey", e4);
                }
            } catch (JSONException e5) {
                a4.a("code", "1003");
                this.b.a("verifyKey", e5);
            } catch (Throwable th) {
                a4.a("code", "1100");
                this.b.b("verifyKey", th);
            }
            if (i == 200) {
                if (!Arrays.equals(a2.b(y.a(a3.getJSONObject("data").getString("serCipher")), lVar.d), bytes)) {
                    a4.a("code", ErrorCode.ERROR_CODE_OKHTTP_EXCEPTION);
                    this.b.b("verifyKey: dec error", null);
                    a4.b();
                    return false;
                }
                this.b.b("verifyKey: ok");
                a4.b();
                return true;
            }
            a4.a("code", "1");
            this.b.b("verifyKey: code error, code=" + i + ", msg=" + a3.optString("msg", ""), null);
            a4.b();
            return false;
        } catch (Throwable th2) {
            a4.b();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a extends IOException {
        public final int a;

        public a(String str, int i) {
            super(str);
            this.a = i;
        }
    }
}
