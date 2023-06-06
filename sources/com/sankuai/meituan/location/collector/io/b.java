package com.sankuai.meituan.location.collector.io;

import com.meituan.android.common.locate.reporter.m;
import com.meituan.android.common.locate.util.LocationUtils;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.metrics.traffic.hurl.HttpURLWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.location.collector.io.e;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.zip.GZIPOutputStream;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.json.JSONObject;
/* loaded from: classes4.dex */
public final class b implements e {
    public static ChangeQuickRedirect a;
    private OkHttpClient b;
    private boolean c;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20c09fc7242faafabe49889d59b356af", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20c09fc7242faafabe49889d59b356af");
        } else {
            this.c = false;
        }
    }

    private static String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c1d7c5a38ebcf84f649953f49083137b", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c1d7c5a38ebcf84f649953f49083137b") : com.meituan.android.common.locate.cache.b.a() ? "https://mars.zservey.com/locate/v2/sdk/locationreport" : "https://mars.meituan.com/locate/v2/sdk/locationreport";
    }

    private boolean a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c0622eef86a5a3ef79653d1459630c0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c0622eef86a5a3ef79653d1459630c0")).booleanValue();
        }
        Response b = b(bArr);
        if (b != null) {
            try {
                if (b.code() == 200) {
                    LogUtils.a("upload collect data success : " + b.code());
                    return true;
                }
            } catch (Throwable th) {
                LogUtils.a("upload collect data exception : " + th.getMessage());
            }
        }
        return false;
    }

    private Response b(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b66ebba4c791538b4ceea54b643bc77f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Response) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b66ebba4c791538b4ceea54b643bc77f");
        }
        try {
            Request.Builder post = new Request.Builder().url(a()).post(RequestBody.create(MediaType.parse("application/octet-stream"), bArr));
            LocationUtils.a(post);
            return this.b.newCall(post.build()).execute();
        } catch (Throwable th) {
            LogUtils.a("upload collect data by okhttp exception : " + th.getMessage());
            return null;
        }
    }

    private boolean c(byte[] bArr) throws IOException {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00c77ddac95b653fc15b4c96cc84a54b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00c77ddac95b653fc15b4c96cc84a54b")).booleanValue();
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) HttpURLWrapper.wrapURLConnection(new URL(a()).openConnection());
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("Content-Type", "application/octet-stream");
        LocationUtils.a(httpURLConnection);
        httpURLConnection.setConnectTimeout(3000);
        httpURLConnection.connect();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        OutputStream outputStream = httpURLConnection.getOutputStream();
        com.sankuai.meituan.location.collector.utils.g.a(byteArrayInputStream, outputStream);
        outputStream.close();
        if (httpURLConnection.getResponseCode() == 200) {
            InputStream inputStream = httpURLConnection.getInputStream();
            String a2 = com.sankuai.meituan.location.collector.utils.g.a(inputStream);
            inputStream.close();
            LogUtils.a("CollectorUploader collector upload response:" + a2);
            try {
                JSONObject jSONObject = new JSONObject(a2);
                return jSONObject.optBoolean("success") && jSONObject.optString("msg").equalsIgnoreCase("success");
            } catch (Throwable th) {
                LogUtils.a(th);
            }
        }
        return false;
    }

    @Override // com.sankuai.meituan.location.collector.io.e
    public final e.a a(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a3a778e105f006e437c26cc3fc85bd6", RobustBitConfig.DEFAULT_VALUE) ? (e.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a3a778e105f006e437c26cc3fc85bd6") : b(file);
    }

    private e.a b(File file) {
        byte[] bArr;
        boolean z;
        byte[] byteArray;
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c928a8577d97a49376df6fe071f98303", RobustBitConfig.DEFAULT_VALUE)) {
            return (e.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c928a8577d97a49376df6fe071f98303");
        }
        byte[] bArr2 = null;
        try {
            bArr = com.sankuai.meituan.location.collector.utils.d.a(file);
        } catch (Throwable th) {
            LogUtils.a(th);
            bArr = null;
        }
        if (bArr == null) {
            return new e.a(false, 0);
        }
        try {
            Object[] objArr2 = {bArr};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "22b33c744c40a324d0974b3b4f74059c", RobustBitConfig.DEFAULT_VALUE)) {
                byteArray = (byte[]) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "22b33c744c40a324d0974b3b4f74059c");
            } else {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                gZIPOutputStream.write(bArr);
                gZIPOutputStream.close();
                byteArray = byteArrayOutputStream.toByteArray();
            }
            bArr2 = byteArray;
        } catch (IOException e) {
            LogUtils.a(e);
        }
        if (bArr2 == null) {
            return new e.a(false, 0);
        }
        int length = bArr2.length;
        com.sankuai.meituan.location.collector.utils.e a2 = com.sankuai.meituan.location.collector.b.a();
        try {
        } catch (Throwable th2) {
            LogUtils.a(th2);
        }
        if (a2 != null) {
            z = a2.a(bArr2);
        } else if (this.c) {
            if (this.b == null) {
                this.b = m.a();
            }
            if (this.b != null) {
                z = a(bArr2);
            }
            z = false;
        } else {
            z = c(bArr2);
        }
        if (!z) {
            LogUtils.a("collector upload failed!!");
            return new e.a(false, 0);
        }
        LogUtils.a("CollectorUploader collector upload ok! length:" + length);
        return new e.a(true, length);
    }
}
