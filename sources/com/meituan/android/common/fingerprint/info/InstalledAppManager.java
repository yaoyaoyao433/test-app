package com.meituan.android.common.fingerprint.info;

import com.alipay.sdk.app.PayTask;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.common.fingerprint.aes.AESUtils;
import com.meituan.android.common.fingerprint.utils.StringUtils;
import com.meituan.metrics.traffic.hurl.HttpURLWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.android.jarvis.c;
import com.sankuai.waimai.launcher.util.aop.b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.http.client.HttpClient;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class InstalledAppManager {
    public static final String BASE_URL = "https://mobile.meituan.com";
    public static final String DEBUG_BASE_URL = "http://10.64.17.241:8080";
    private static final String DEFAULT_VALUE = "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";
    public static final int MAX_RETRY = 3;
    public static final String PATH = "/push/launch/v2/android";
    private static final String TAG = "AppList";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static Executor executor = c.a("FingerPrint-LocalizerFetcher");
    private HttpClient client;
    private Runnable mAppListFetcher;
    private AtomicReference<List<String>> mApps;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class DataWrapper {
        public static ChangeQuickRedirect changeQuickRedirect;
        public List<String> data;
    }

    public InstalledAppManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2191a7473bf298a04850ba486b0e0178", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2191a7473bf298a04850ba486b0e0178");
            return;
        }
        this.mApps = new AtomicReference<>(null);
        this.mAppListFetcher = new AppListFetcher();
        decAndSet(DEFAULT_VALUE.getBytes());
    }

    public HttpClient getClient() {
        return this.client;
    }

    public void setClient(HttpClient httpClient) {
        this.client = httpClient;
    }

    public boolean decAndSet(byte[] bArr) {
        String decrypt;
        DataWrapper dataWrapper;
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6e13b7db659851828fb5b665b8d96a3b", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6e13b7db659851828fb5b665b8d96a3b")).booleanValue();
        }
        if (bArr == null || (decrypt = AESUtils.decrypt(bArr)) == null || decrypt.length() <= 0) {
            return false;
        }
        try {
            dataWrapper = (DataWrapper) new Gson().fromJson(decrypt, new TypeToken<DataWrapper>() { // from class: com.meituan.android.common.fingerprint.info.InstalledAppManager.1
                public static ChangeQuickRedirect changeQuickRedirect;
            }.getType());
        } catch (Throwable th) {
            StringUtils.setErrorLogan(th);
            dataWrapper = null;
        }
        if (dataWrapper == null || dataWrapper.data.size() <= 0) {
            return false;
        }
        this.mApps.set(Collections.unmodifiableList(dataWrapper.data));
        return true;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    class AppListFetcher implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;
        private int mRetryTime = 0;

        public AppListFetcher() {
        }

        public int getmRetryTime() {
            return this.mRetryTime;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z = false;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "39207c17e3785f97ce7063ddf5c80482", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "39207c17e3785f97ce7063ddf5c80482");
                return;
            }
            try {
                Thread.sleep(PayTask.j);
            } catch (InterruptedException e) {
                StringUtils.setErrorLogan(e);
                e.printStackTrace();
            }
            this.mRetryTime = 0;
            while (!z && this.mRetryTime < 3) {
                this.mRetryTime++;
                try {
                    z = doLoad("https://mobile.meituan.com/push/launch/v2/android");
                } catch (Throwable th) {
                    StringUtils.setErrorLogan(th);
                }
            }
        }

        public byte[] loadFromUrl(String str) throws IOException {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0e552c5dd898ce794a5bcc0f1752cac3", 6917529027641081856L)) {
                return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0e552c5dd898ce794a5bcc0f1752cac3");
            }
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) HttpURLWrapper.wrapURLConnection(new URL(str).openConnection());
                if (200 != httpURLConnection.getResponseCode()) {
                    httpURLConnection.getInputStream().close();
                    httpURLConnection.disconnect();
                    return null;
                }
                byte[] readBytes = InstalledAppManager.readBytes(httpURLConnection.getInputStream());
                httpURLConnection.getInputStream().close();
                httpURLConnection.disconnect();
                if (readBytes.length <= 0) {
                    return null;
                }
                return readBytes;
            } catch (Throwable unused) {
                return null;
            }
        }

        public boolean doLoad(String str) throws IOException {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1df21d279e3acac1a2b4c8b4feb41455", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1df21d279e3acac1a2b4c8b4feb41455")).booleanValue() : InstalledAppManager.this.decAndSet(loadFromUrl(str));
        }

        public String decrypt(byte[] bArr) {
            Object[] objArr = {bArr};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4ba947efe60947569c9a908ee59d3610", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4ba947efe60947569c9a908ee59d3610") : AESUtils.decrypt(bArr);
        }
    }

    public List<String> applist() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6211d247acb3a054cc4dcc703cb035c5", 6917529027641081856L) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6211d247acb3a054cc4dcc703cb035c5") : this.mApps.get();
    }

    public void updateAppList(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7c3ca5e607ce4244b775ebfe95eb0481", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7c3ca5e607ce4244b775ebfe95eb0481");
        } else if (fetchFailed() || z) {
            updateAppList();
        }
    }

    public void updateAppList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "460bf5f854334f649487e2449a019839", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "460bf5f854334f649487e2449a019839");
        } else {
            b.a(executor, this.mAppListFetcher);
        }
    }

    public boolean fetchFailed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "228ed7533eb0741eb042c2d7d709af54", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "228ed7533eb0741eb042c2d7d709af54")).booleanValue() : this.mApps.get() == null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] readBytes(InputStream inputStream) {
        Object[] objArr = {inputStream};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "73f2f04e685841fed1bd1865f2818022", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "73f2f04e685841fed1bd1865f2818022");
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[4096];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byteArrayOutputStream.flush();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return byteArray;
                }
            }
        } catch (Throwable th) {
            StringUtils.setErrorLogan(th);
            return new byte[0];
        }
    }
}
