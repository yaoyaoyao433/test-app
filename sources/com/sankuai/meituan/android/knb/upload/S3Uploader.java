package com.sankuai.meituan.android.knb.upload;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.dianping.titans.utils.ContentResolverProvider;
import com.dianping.titans.utils.LocalIdUtils;
import com.meituan.android.common.statistics.quickreport.QuickReportConstants;
import com.meituan.android.common.unionid.oneid.network.OneIdNetworkTool;
import com.meituan.metrics.traffic.hurl.HttpURLWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class S3Uploader {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void uploadOthers(JSONObject jSONObject, OnUploadFileCompleted onUploadFileCompleted) {
        Object[] objArr = {jSONObject, onUploadFileCompleted};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9f3cae50cc003bd4f8a0540c287ee29f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9f3cae50cc003bd4f8a0540c287ee29f");
        } else if (jSONObject == null) {
            onUploadFileCompleted.onError(UploadFileManager.ERROR_MSG_520, 520, "", 0);
        } else {
            String valuableString = UploadFileManager.getValuableString(jSONObject, "presignedUrl");
            if (TextUtils.isEmpty(valuableString)) {
                onUploadFileCompleted.onError(UploadFileManager.ERROR_MSG_520, 520, "", 0);
                return;
            }
            String optString = jSONObject.optString(QuickReportConstants.CONFIG_FILE_NAME);
            String optString2 = jSONObject.optString("contentType");
            if (!LocalIdUtils.isValid(optString)) {
                onUploadFileCompleted.onError(UploadFileManager.ERROR_MSG_521, 521, "", 0);
                return;
            }
            try {
                S3Response reportFile = reportFile(valuableString, getFileInputStrem(onUploadFileCompleted.getContext(), optString, onUploadFileCompleted.getSceneToken()), optString2);
                if (reportFile != null) {
                    if (reportFile.isSuccess()) {
                        onUploadFileCompleted.onSuccess("", "", "", 0);
                        return;
                    }
                    onUploadFileCompleted.onError(UploadFileManager.ERROR_MSG_2021, 2021, reportFile.description + "/" + reportFile.responseMessage, reportFile.statusCode);
                }
            } catch (Exception e) {
                onUploadFileCompleted.onError(UploadFileManager.ERROR_MSG_2021, 2021, e.getLocalizedMessage(), 0);
            }
        }
    }

    public static InputStream getFileInputStrem(Context context, String str, String str2) throws Exception {
        Object[] objArr = {context, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e42eb0bdb9fc69fd09c6550df6f88c51", RobustBitConfig.DEFAULT_VALUE)) {
            return (InputStream) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e42eb0bdb9fc69fd09c6550df6f88c51");
        }
        Uri uri = LocalIdUtils.getUri(str);
        if (TextUtils.equals("content", uri.getScheme())) {
            return ContentResolverProvider.getContentResolver(context, str2).b(uri);
        }
        File file = LocalIdUtils.getFile(str, str2);
        if (file.exists()) {
            return new FileInputStream(file);
        }
        return null;
    }

    @NonNull
    public static S3Response reportFile(String str, InputStream inputStream, String str2) throws Exception {
        HttpURLConnection httpURLConnection;
        Object[] objArr = {str, inputStream, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        try {
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "beb53dcba7c1aba191dc042407bbb986", RobustBitConfig.DEFAULT_VALUE)) {
                return (S3Response) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "beb53dcba7c1aba191dc042407bbb986");
            }
            try {
                httpURLConnection = (HttpURLConnection) HttpURLWrapper.wrapURLConnection(new URL(str).openConnection());
                try {
                    httpURLConnection.setReadTimeout(10000);
                    httpURLConnection.setConnectTimeout(10000);
                    httpURLConnection.setDoInput(true);
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.setUseCaches(false);
                    httpURLConnection.setRequestMethod(OneIdNetworkTool.PUT);
                    httpURLConnection.setRequestProperty("Connection", "Keep-Alive");
                    httpURLConnection.setRequestProperty("Charset", "UTF-8");
                    httpURLConnection.setRequestProperty("Content-Type", "");
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        outputStream.write(bArr, 0, read);
                    }
                    inputStream.close();
                    outputStream.close();
                    outputStream.flush();
                    S3Response s3Response = new S3Response();
                    s3Response.statusCode = httpURLConnection.getResponseCode();
                    if (!s3Response.isSuccess()) {
                        s3Response.parseXmlData(httpURLConnection.getErrorStream());
                        s3Response.responseMessage = httpURLConnection.getResponseMessage();
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    return s3Response;
                } catch (Exception e) {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    throw th;
                }
            } catch (Exception e2) {
                throw e2;
            }
        } catch (Throwable th2) {
            th = th2;
            httpURLConnection = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class S3Response {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String description;
        public String responseMessage;
        public int statusCode;

        public boolean isSuccess() {
            return this.statusCode >= 200 && this.statusCode < 300;
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
            r12.description = r1.nextText();
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void parseXmlData(java.io.InputStream r13) throws java.lang.Exception {
            /*
                r12 = this;
                r0 = 1
                java.lang.Object[] r8 = new java.lang.Object[r0]
                r9 = 0
                r8[r9] = r13
                com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.meituan.android.knb.upload.S3Uploader.S3Response.changeQuickRedirect
                java.lang.String r11 = "ab740cc6c2c86adf3defc088ae3103fe"
                r4 = 0
                r6 = 4611686018427387904(0x4000000000000000, double:2.0)
                r1 = r8
                r2 = r12
                r3 = r10
                r5 = r11
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
                if (r1 == 0) goto L1b
                com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r9, r11)
                return
            L1b:
                if (r13 != 0) goto L23
                if (r13 == 0) goto L22
                r13.close()
            L22:
                return
            L23:
                org.xmlpull.v1.XmlPullParserFactory r1 = org.xmlpull.v1.XmlPullParserFactory.newInstance()     // Catch: java.lang.Throwable -> L60
                org.xmlpull.v1.XmlPullParser r1 = r1.newPullParser()     // Catch: java.lang.Throwable -> L60
                java.lang.String r2 = "utf-8"
                r1.setInput(r13, r2)     // Catch: java.lang.Throwable -> L60
                int r2 = r1.getDepth()     // Catch: java.lang.Throwable -> L60
            L35:
                int r3 = r1.next()     // Catch: java.lang.Throwable -> L60
                r4 = 3
                if (r3 != r4) goto L42
                int r4 = r1.getDepth()     // Catch: java.lang.Throwable -> L60
                if (r4 <= r2) goto L59
            L42:
                if (r3 == r0) goto L59
                r4 = 2
                if (r3 != r4) goto L35
                java.lang.String r3 = r1.getName()     // Catch: java.lang.Throwable -> L60
                java.lang.String r4 = "Message"
                boolean r3 = r4.equals(r3)     // Catch: java.lang.Throwable -> L60
                if (r3 == 0) goto L35
                java.lang.String r0 = r1.nextText()     // Catch: java.lang.Throwable -> L60
                r12.description = r0     // Catch: java.lang.Throwable -> L60
            L59:
                if (r13 == 0) goto L5f
                r13.close()
                return
            L5f:
                return
            L60:
                r0 = move-exception
                if (r13 == 0) goto L66
                r13.close()
            L66:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.android.knb.upload.S3Uploader.S3Response.parseXmlData(java.io.InputStream):void");
        }
    }
}
