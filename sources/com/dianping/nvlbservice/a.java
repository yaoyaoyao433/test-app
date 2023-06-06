package com.dianping.nvlbservice;

import android.os.Build;
import com.dianping.nvnetwork.Request;
import com.dianping.nvnetwork.q;
import com.meituan.metrics.traffic.hurl.HttpURLWrapper;
import com.meituan.passport.api.AbsApiFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBWebManager;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a implements e {
    public static ChangeQuickRedirect a;

    @Override // com.dianping.nvlbservice.e
    public final q a(Request request) {
        String str;
        int i;
        q build;
        int i2;
        Object[] objArr = {request};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c1705787003202b7f90929c0bb7db7f", RobustBitConfig.DEFAULT_VALUE)) {
            return (q) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c1705787003202b7f90929c0bb7db7f");
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) HttpURLWrapper.wrapURLConnection(new URL(request.d).openConnection());
            str = a(httpURLConnection);
            try {
                httpURLConnection.setDoInput(true);
                httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
                if (request.g != null) {
                    for (Map.Entry<String, String> entry : request.g.entrySet()) {
                        httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                    }
                }
                if (Build.VERSION.SDK_INT < 8) {
                    System.setProperty("http.keepAlive", "false");
                }
                Object[] objArr2 = {request};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5ed1adaf22df6c1b9d4e13315cd0cb55", RobustBitConfig.DEFAULT_VALUE)) {
                    i2 = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5ed1adaf22df6c1b9d4e13315cd0cb55")).intValue();
                } else {
                    i2 = request.h > 0 ? request.h : KNBWebManager.ISetting.DEFAULT_TIMEOUT;
                }
                httpURLConnection.setConnectTimeout(i2);
                httpURLConnection.setReadTimeout(i2);
                httpURLConnection.setRequestMethod(request.f);
                httpURLConnection.setDoOutput(true);
                InputStream inputStream = request.i;
                if (inputStream != null) {
                    if (inputStream.markSupported()) {
                        inputStream.mark(0);
                    }
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        outputStream.write(bArr, 0, read);
                        outputStream.flush();
                    }
                    outputStream.close();
                    inputStream.close();
                }
                InputStream inputStream2 = httpURLConnection.getInputStream();
                int responseCode = httpURLConnection.getResponseCode();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr2 = new byte[4096];
                while (true) {
                    int read2 = inputStream2.read(bArr2);
                    if (read2 < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr2, 0, read2);
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                inputStream2.close();
                HashMap<String, String> hashMap = new HashMap<>(8);
                int i3 = 0;
                while (true) {
                    String headerFieldKey = httpURLConnection.getHeaderFieldKey(i3);
                    String headerField = httpURLConnection.getHeaderField(i3);
                    if (headerFieldKey == null || headerField == null) {
                        break;
                    }
                    hashMap.put(headerFieldKey, headerField);
                    i3++;
                }
                q.a aVar = new q.a();
                aVar.c = responseCode;
                aVar.b = byteArray;
                aVar.e = hashMap;
                aVar.p = str;
                aVar.i = true;
                build = aVar.build();
            } catch (Throwable th) {
                th = th;
                q.a aVar2 = new q.a();
                Object[] objArr3 = {th};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "fa3bdcd52c31d0808284376c72a8c296", RobustBitConfig.DEFAULT_VALUE)) {
                    i = ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "fa3bdcd52c31d0808284376c72a8c296")).intValue();
                } else if (th instanceof SocketTimeoutException) {
                    i = -104;
                } else if ((th instanceof UnknownHostException) || (th instanceof ConnectException)) {
                    i = -102;
                } else {
                    i = ((th instanceof InterruptedIOException) || (th instanceof InterruptedException)) ? -304 : -106;
                }
                aVar2.c = i;
                aVar2.p = str;
                aVar2.j = th;
                build = aVar2.build();
                if (str == null) {
                }
                build.b = 0;
                build.c = 3;
                return build;
            }
        } catch (Throwable th2) {
            th = th2;
            str = "";
        }
        if (str == null && str.startsWith(AbsApiFactory.HTTPS)) {
            build.b = 8;
        } else {
            build.b = 0;
        }
        build.c = 3;
        return build;
    }

    private String a(HttpURLConnection httpURLConnection) {
        Object[] objArr = {httpURLConnection};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57ff04d28a2f69e2bc92a1a963758fe8", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57ff04d28a2f69e2bc92a1a963758fe8");
        }
        if (httpURLConnection != null) {
            try {
                return httpURLConnection.getURL().toString();
            } catch (Exception e) {
                Object[] objArr2 = {e};
                ChangeQuickRedirect changeQuickRedirect2 = i.a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "645bd9647959202512041a47af4fd3ba", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "645bd9647959202512041a47af4fd3ba");
                    return "";
                }
                i.a("LB", e);
                return "";
            }
        }
        return "";
    }
}
