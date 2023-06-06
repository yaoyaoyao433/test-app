package com.tencent.liteav.basic.util;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.meituan.metrics.traffic.hurl.HttpURLWrapper;
import com.meituan.robust.common.StringUtil;
import com.tencent.liteav.basic.log.TXCLog;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class TXHttpRequest {
    private static final int CON_TIMEOUT = 5000;
    private static final int READ_TIMEOUT = 5000;
    private static final String TAG = "TXHttpRequest";
    private long mNativeHttps;

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeOnRecvMessage(long j, int i, byte[] bArr);

    public TXHttpRequest(long j) {
        this.mNativeHttps = 0L;
        this.mNativeHttps = j;
    }

    public static byte[] getHttpPostRsp(Map<String, String> map, String str, byte[] bArr) throws Exception {
        TXCLog.i(TAG, "getHttpPostRsp->request: " + str);
        TXCLog.i(TAG, "getHttpPostRsp->data size: " + bArr.length);
        HttpURLConnection httpURLConnection = (HttpURLConnection) HttpURLWrapper.wrapURLConnection(new URL(str.replace(StringUtil.SPACE, "%20")).openConnection());
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setConnectTimeout(5000);
        httpURLConnection.setReadTimeout(5000);
        httpURLConnection.setRequestMethod("POST");
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        dataOutputStream.write(bArr);
        dataOutputStream.flush();
        dataOutputStream.close();
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode == 200) {
            InputStream inputStream = httpURLConnection.getInputStream();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int read = inputStream.read(bArr, 0, bArr.length);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byteArrayOutputStream.flush();
                    inputStream.close();
                    httpURLConnection.disconnect();
                    TXCLog.i(TAG, "getHttpsPostRsp->rsp size: " + byteArrayOutputStream.size());
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } else {
            TXCLog.i(TAG, "getHttpPostRsp->response code: " + responseCode);
            throw new Exception("response: " + responseCode);
        }
    }

    public int sendHttpsRequest(Map<String, String> map, String str, byte[] bArr) {
        TXCLog.i(TAG, "sendHttpsRequest->enter action: " + str + ", data size: " + bArr.length);
        asyncPostRequest(map, str.getBytes(), bArr);
        return 0;
    }

    public int sendHttpsRequest(String str, byte[] bArr) {
        TXCLog.i(TAG, "sendHttpsRequest->enter action: " + str + ", data size: " + bArr.length);
        asyncPostRequest(null, str.getBytes(), bArr);
        return 0;
    }

    public static byte[] getHttpsPostRsp(Map<String, String> map, String str, byte[] bArr) throws Exception {
        TXCLog.i(TAG, "getHttpsPostRsp->request: " + str);
        TXCLog.i(TAG, "getHttpsPostRsp->data: " + bArr.length);
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) HttpURLWrapper.wrapURLConnection(new URL(str.replace(StringUtil.SPACE, "%20")).openConnection());
        httpsURLConnection.setDoInput(true);
        httpsURLConnection.setDoOutput(true);
        httpsURLConnection.setConnectTimeout(5000);
        httpsURLConnection.setReadTimeout(5000);
        httpsURLConnection.setRequestMethod("POST");
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                httpsURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }
        DataOutputStream dataOutputStream = new DataOutputStream(httpsURLConnection.getOutputStream());
        dataOutputStream.write(bArr);
        dataOutputStream.flush();
        dataOutputStream.close();
        int responseCode = httpsURLConnection.getResponseCode();
        if (responseCode == 200) {
            InputStream inputStream = httpsURLConnection.getInputStream();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int read = inputStream.read(bArr, 0, bArr.length);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byteArrayOutputStream.flush();
                    inputStream.close();
                    httpsURLConnection.disconnect();
                    TXCLog.i(TAG, "getHttpsPostRsp->rsp size: " + byteArrayOutputStream.size());
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } else {
            TXCLog.i(TAG, "getHttpsPostRsp->response code: " + responseCode);
            throw new Exception("response: " + responseCode);
        }
    }

    public void asyncPostRequest(Map<String, String> map, byte[] bArr, byte[] bArr2) {
        com.sankuai.waimai.launcher.util.aop.b.a(new a(this, map), bArr, bArr2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class b {
        public int a = 1;
        public String b = "";
        public byte[] c = "".getBytes();

        b() {
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class a extends AsyncTask<byte[], Void, b> {
        private WeakReference<TXHttpRequest> a;
        private Handler b;
        private Map<String, String> c;

        public a(TXHttpRequest tXHttpRequest, Map<String, String> map) {
            this.b = null;
            this.c = map;
            this.a = new WeakReference<>(tXHttpRequest);
            Looper myLooper = Looper.myLooper();
            if (myLooper != null) {
                this.b = new Handler(myLooper);
            } else {
                this.b = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        public b doInBackground(byte[]... bArr) {
            b bVar = new b();
            try {
                if (new String(bArr[0]).startsWith("https")) {
                    bVar.c = TXHttpRequest.getHttpsPostRsp(this.c, new String(bArr[0]), bArr[1]);
                } else {
                    bVar.c = TXHttpRequest.getHttpPostRsp(this.c, new String(bArr[0]), bArr[1]);
                }
                bVar.a = 0;
            } catch (Exception e) {
                bVar.b = e.toString();
                bVar.a = 1;
            }
            TXCLog.i(TXHttpRequest.TAG, "TXPostRequest->result: " + bVar.a + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + bVar.b);
            return bVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        public void onPostExecute(final b bVar) {
            super.onPostExecute(bVar);
            final TXHttpRequest tXHttpRequest = this.a.get();
            if (tXHttpRequest == null || tXHttpRequest.mNativeHttps == 0) {
                return;
            }
            if (this.b != null) {
                this.b.post(new Runnable() { // from class: com.tencent.liteav.basic.util.TXHttpRequest.a.1
                    @Override // java.lang.Runnable
                    public void run() {
                        TXCLog.i(TXHttpRequest.TAG, "TXPostRequest->recvMsg: " + bVar.a + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + bVar.b);
                        tXHttpRequest.nativeOnRecvMessage(tXHttpRequest.mNativeHttps, bVar.a, bVar.c);
                    }
                });
                return;
            }
            TXCLog.i(TXHttpRequest.TAG, "TXPostRequest->recvMsg: " + bVar.a + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + bVar.b);
            tXHttpRequest.nativeOnRecvMessage(tXHttpRequest.mNativeHttps, bVar.a, bVar.c);
        }
    }
}
