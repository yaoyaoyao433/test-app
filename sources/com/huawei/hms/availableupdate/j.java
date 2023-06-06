package com.huawei.hms.availableupdate;

import android.content.Context;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.IOUtils;
import com.meituan.metrics.traffic.hurl.HttpURLWrapper;
import com.meituan.robust.common.CommonConstant;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import javax.net.ssl.HttpsURLConnection;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class j implements k {
    public HttpURLConnection a;
    public volatile int b = -1;

    @Override // com.huawei.hms.availableupdate.k
    public void a() {
        this.b = 1;
    }

    @Override // com.huawei.hms.availableupdate.k
    public void close() {
        this.b = -1;
        HttpURLConnection httpURLConnection = this.a;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    @Override // com.huawei.hms.availableupdate.k
    public int a(String str, OutputStream outputStream, int i, int i2, Context context) throws IOException, i {
        InputStream inputStream;
        InputStream inputStream2 = null;
        try {
            a(str, context);
            this.a.setRequestMethod("GET");
            if (i > 0) {
                this.a.addRequestProperty("Range", "bytes=" + i + CommonConstant.Symbol.MINUS + i2);
            }
            int responseCode = this.a.getResponseCode();
            if ((i <= 0 || responseCode != 206) && (i > 0 || responseCode != 200)) {
                inputStream = null;
            } else {
                inputStream = this.a.getInputStream();
                try {
                    a(new BufferedInputStream(inputStream, 4096), outputStream);
                    outputStream.flush();
                } catch (Throwable th) {
                    th = th;
                    inputStream2 = inputStream;
                    IOUtils.closeQuietly(inputStream2);
                    throw th;
                }
            }
            IOUtils.closeQuietly(inputStream);
            return responseCode;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final void a(String str, Context context) throws IOException {
        if (this.b == 0) {
            HMSLog.e("HttpRequestHelper", "Not allowed to repeat open http(s) connection.");
        }
        this.a = (HttpURLConnection) HttpURLWrapper.wrapURLConnection(new URL(str).openConnection());
        if (this.a instanceof HttpsURLConnection) {
            try {
                com.huawei.secure.android.common.ssl.b a = com.huawei.secure.android.common.ssl.b.a(context);
                if (a != null) {
                    ((HttpsURLConnection) this.a).setSSLSocketFactory(a);
                }
                ((HttpsURLConnection) this.a).setSSLSocketFactory(a);
            } catch (IOException | IllegalAccessException | IllegalArgumentException | KeyManagementException | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
                HMSLog.e("HttpRequestHelper", "Failed to new TLSSocketFactory instance." + e.getMessage());
                throw new IOException("Failed to create SSLSocketFactory.");
            }
        }
        this.a.setConnectTimeout(30000);
        this.a.setReadTimeout(30000);
        this.a.setDoInput(true);
        this.a.setDoOutput(true);
        this.a.setUseCaches(false);
        this.a.setInstanceFollowRedirects(true);
        this.b = 0;
    }

    public final void a(InputStream inputStream, OutputStream outputStream) throws IOException, i {
        byte[] bArr = new byte[4096];
        do {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                return;
            }
            outputStream.write(bArr, 0, read);
        } while (this.b != 1);
        throw new i("HTTP(s) request was canceled.");
    }
}
