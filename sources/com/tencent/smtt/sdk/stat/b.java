package com.tencent.smtt.sdk.stat;

import MTT.ThirdAppInfoNew;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.meituan.android.common.statistics.quickreport.QuickReportConstants;
import com.meituan.android.recce.host.RecceBridgeHandler;
import com.meituan.metrics.traffic.hurl.HttpURLWrapper;
import com.meituan.msc.modules.engine.requestPrefetch.PrefetchConfig;
import com.meituan.passport.UserCenter;
import com.meituan.robust.common.CommonConstant;
import com.tencent.smtt.sdk.QbSdk;
import com.tencent.smtt.sdk.TbsDownloadConfig;
import com.tencent.smtt.sdk.TbsDownloadUpload;
import com.tencent.smtt.sdk.TbsDownloader;
import com.tencent.smtt.sdk.TbsLogReport;
import com.tencent.smtt.sdk.TbsPVConfig;
import com.tencent.smtt.sdk.TbsShareManager;
import com.tencent.smtt.utils.FileUtil;
import com.tencent.smtt.utils.TbsLog;
import com.tencent.smtt.utils.g;
import com.tencent.smtt.utils.k;
import com.tencent.smtt.utils.n;
import com.tencent.smtt.utils.r;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public class b {
    public static byte[] a;
    private static ThirdAppInfoNew b;

    static {
        try {
            a = "65dRa93L".getBytes("utf-8");
        } catch (UnsupportedEncodingException unused) {
        }
    }

    private static String a(Context context) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put("cpuabi", com.tencent.smtt.utils.b.c() ? "64" : "32");
                jSONObject.put("ex5i", r.n(context));
                if (TbsShareManager.isThirdPartyApp(context)) {
                    jSONObject.put("canReadSDCard", com.tencent.smtt.utils.b.l(context));
                    if (r.c(context)) {
                        String replace = r.b().replace(CommonConstant.Symbol.COMMA, CommonConstant.Symbol.MINUS);
                        if (!TextUtils.isEmpty(replace)) {
                            jSONObject.put("coreUpdate", replace);
                        }
                    }
                }
                r.c();
                if (TbsShareManager.isThirdPartyApp(context) && r.i(context)) {
                    String d = r.d();
                    if (!TextUtils.isEmpty(d)) {
                        jSONObject.put("destroyCode", d);
                    }
                }
                if (TbsShareManager.isThirdPartyApp(context) && r.h(context)) {
                    String j = r.j(context);
                    if (!TextUtils.isEmpty(j)) {
                        jSONObject.put("coreSource", j);
                        r.a(QbSdk.getTbsVersion(context));
                    }
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            jSONObject = null;
        }
        return jSONObject == null ? "" : jSONObject.toString();
    }

    public static void a(ThirdAppInfoNew thirdAppInfoNew, Context context) {
        a(thirdAppInfoNew, context, null, null);
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [com.tencent.smtt.sdk.stat.b$1] */
    public static void a(final ThirdAppInfoNew thirdAppInfoNew, final Context context, final String str, final String str2) {
        new Thread("HttpUtils") { // from class: com.tencent.smtt.sdk.stat.b.1
            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() {
                String str3;
                com.tencent.smtt.utils.b.b(context, thirdAppInfoNew.sGuid);
                thirdAppInfoNew.sCpu = com.tencent.smtt.utils.b.a();
                if (Build.VERSION.SDK_INT < 8) {
                    return;
                }
                JSONObject jSONObject = null;
                if (b.a == null) {
                    try {
                        b.a = "65dRa93L".getBytes("utf-8");
                    } catch (UnsupportedEncodingException unused) {
                        b.a = null;
                        TbsLog.e("sdkreport", "Post failed -- get POST_DATA_KEY failed!");
                    }
                }
                if (b.a == null) {
                    TbsLog.e("sdkreport", "Post failed -- POST_DATA_KEY is null!");
                    return;
                }
                String string = TbsDownloadConfig.getInstance(context).mPreferences.getString(TbsDownloadConfig.TbsConfigKey.KEY_DESkEY_TOKEN, "");
                String str4 = "";
                String str5 = "";
                if (!TextUtils.isEmpty(string)) {
                    str4 = string.substring(0, string.indexOf("&"));
                    str5 = string.substring(string.indexOf("&") + 1, string.length());
                }
                boolean z = TextUtils.isEmpty(str4) || str4.length() != 96 || TextUtils.isEmpty(str5) || str5.length() != 24;
                try {
                    n a2 = n.a();
                    if (z) {
                        str3 = a2.b() + g.a().b();
                    } else {
                        str3 = a2.i() + str4;
                    }
                    TbsLog.i("sdkreport", "Post post_url is " + str3);
                    HttpURLConnection httpURLConnection = (HttpURLConnection) HttpURLWrapper.wrapURLConnection(new URL(str3).openConnection());
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.setDoInput(true);
                    httpURLConnection.setUseCaches(false);
                    httpURLConnection.setConnectTimeout(UserCenter.TYPE_LOGOUT_NEGATIVE);
                    if (Build.VERSION.SDK_INT > 13) {
                        httpURLConnection.setRequestProperty("Connection", "close");
                    }
                    try {
                        jSONObject = b.c(thirdAppInfoNew, context);
                    } catch (Exception e) {
                        TbsLog.i(e);
                    }
                    if (jSONObject == null) {
                        TbsLog.e("sdkreport", "post -- jsonData is null!");
                        return;
                    }
                    try {
                        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                            String str6 = "";
                            try {
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put(str, str2);
                                str6 = jSONObject2.toString();
                            } catch (Throwable unused2) {
                            }
                            jSONObject.put("EXT_INFO", str6);
                            jSONObject.put(QuickReportConstants.PV_CONFIG, 0);
                        }
                    } catch (Exception e2) {
                        TbsLog.i(e2);
                    }
                    try {
                        TbsLog.i("sdkreport", "Post jsonData.toString() is " + jSONObject.toString());
                        byte[] bytes = jSONObject.toString().getBytes("utf-8");
                        byte[] a3 = z ? g.a().a(bytes) : g.a(bytes, str5);
                        httpURLConnection.setRequestProperty("Content-Type", PrefetchConfig.PREFETCH_POST_CONTENT_TYPE_FORM);
                        httpURLConnection.setRequestProperty("Content-Length", String.valueOf(a3.length));
                        try {
                            OutputStream outputStream = httpURLConnection.getOutputStream();
                            outputStream.write(a3);
                            outputStream.flush();
                            if (httpURLConnection.getResponseCode() == 200) {
                                TbsLog.i("sdkreport", "Post successful!");
                                TbsLog.i("sdkreport", "SIGNATURE is " + jSONObject.getString("SIGNATURE"));
                                b.b(context, b.b(httpURLConnection, str5, z));
                                new TbsDownloadUpload(context).clearUploadCode();
                                return;
                            }
                            TbsLog.e("sdkreport", "Post failed -- not 200 code is " + httpURLConnection.getResponseCode());
                            TbsLogReport.TbsLogInfo tbsLogInfo = TbsLogReport.getInstance(context).tbsLogInfo();
                            tbsLogInfo.setErrorCode(126);
                            StringBuilder sb = new StringBuilder();
                            sb.append(httpURLConnection.getResponseCode());
                            tbsLogInfo.setFailDetail(sb.toString());
                            TbsLogReport.getInstance(context).eventReport(TbsLogReport.EventType.TYPE_DOWNLOAD, tbsLogInfo);
                        } catch (Throwable th) {
                            TbsLog.e("sdkreport", "Post failed -- exceptions:" + th.getMessage());
                            TbsLogReport.TbsLogInfo tbsLogInfo2 = TbsLogReport.getInstance(context).tbsLogInfo();
                            tbsLogInfo2.setErrorCode(126);
                            tbsLogInfo2.setFailDetail(th);
                            TbsLogReport.getInstance(context).eventReport(TbsLogReport.EventType.TYPE_DOWNLOAD, tbsLogInfo2);
                        }
                    } catch (Throwable unused3) {
                    }
                } catch (IOException e3) {
                    TbsLog.e("sdkreport", "Post failed -- IOException:" + e3);
                } catch (AssertionError e4) {
                    TbsLog.e("sdkreport", "Post failed -- AssertionError:" + e4);
                } catch (Exception e5) {
                    TbsLog.e("sdkreport", "Post failed -- Exception:" + e5);
                } catch (NoClassDefFoundError e6) {
                    TbsLog.e("sdkreport", "Post failed -- NoClassDefFoundError:" + e6);
                }
            }
        }.start();
    }

    public static void a(Context context, String str, String str2) {
        if (b == null) {
            ThirdAppInfoNew thirdAppInfoNew = new ThirdAppInfoNew();
            thirdAppInfoNew.sAppName = context.getApplicationContext().getApplicationInfo().packageName;
            n.a(context);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+08"));
            thirdAppInfoNew.sTime = simpleDateFormat.format(Calendar.getInstance().getTime());
            thirdAppInfoNew.sVersionCode = com.tencent.smtt.utils.b.e(context);
            String a2 = com.tencent.smtt.utils.b.a(context, TbsDownloader.TBS_METADATA);
            if (!TextUtils.isEmpty(a2)) {
                thirdAppInfoNew.sMetaData = a2;
            }
            thirdAppInfoNew.sGuid = "";
            StringBuilder sb = new StringBuilder();
            sb.append(QbSdk.getTbsVersion(context));
            thirdAppInfoNew.sQua2 = k.a(context, sb.toString());
            thirdAppInfoNew.sLc = "";
            String j = com.tencent.smtt.utils.b.j(context);
            String h = com.tencent.smtt.utils.b.h(context);
            String i = com.tencent.smtt.utils.b.i(context);
            String k = com.tencent.smtt.utils.b.k(context);
            if (h != null && !"".equals(h)) {
                thirdAppInfoNew.sImei = h;
            }
            if (i != null && !"".equals(i)) {
                thirdAppInfoNew.sImsi = i;
            }
            if (!TextUtils.isEmpty(k)) {
                thirdAppInfoNew.sAndroidID = k;
            }
            if (j != null && !"".equals(j)) {
                thirdAppInfoNew.sMac = j;
            }
            thirdAppInfoNew.iPv = 0L;
            if (QbSdk.getTbsVersion(context) > 0) {
                thirdAppInfoNew.iCoreType = 1;
            } else {
                thirdAppInfoNew.iCoreType = 0;
                thirdAppInfoNew.localCoreVersion = QbSdk.getTbsVersion(context);
            }
            thirdAppInfoNew.sAppVersionName = context.getApplicationInfo().packageName;
            thirdAppInfoNew.sAppSignature = b(context);
            b = thirdAppInfoNew;
        }
        a(b, context, str, str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0141, code lost:
        if (r14 != false) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ba A[Catch: Throwable -> 0x017d, TryCatch #0 {Throwable -> 0x017d, blocks: (B:24:0x0076, B:26:0x00ba, B:27:0x00bc, B:29:0x00c0, B:31:0x00cb, B:33:0x00fe, B:35:0x0106, B:37:0x010a, B:39:0x0112, B:40:0x0114, B:42:0x011a, B:44:0x011e, B:46:0x0126, B:47:0x0128, B:50:0x0134, B:52:0x013a, B:55:0x0143, B:61:0x0150, B:63:0x015a, B:64:0x0162, B:53:0x013e, B:56:0x0146, B:57:0x0149, B:30:0x00c5), top: B:69:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c0 A[Catch: Throwable -> 0x017d, TryCatch #0 {Throwable -> 0x017d, blocks: (B:24:0x0076, B:26:0x00ba, B:27:0x00bc, B:29:0x00c0, B:31:0x00cb, B:33:0x00fe, B:35:0x0106, B:37:0x010a, B:39:0x0112, B:40:0x0114, B:42:0x011a, B:44:0x011e, B:46:0x0126, B:47:0x0128, B:50:0x0134, B:52:0x013a, B:55:0x0143, B:61:0x0150, B:63:0x015a, B:64:0x0162, B:53:0x013e, B:56:0x0146, B:57:0x0149, B:30:0x00c5), top: B:69:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c5 A[Catch: Throwable -> 0x017d, TryCatch #0 {Throwable -> 0x017d, blocks: (B:24:0x0076, B:26:0x00ba, B:27:0x00bc, B:29:0x00c0, B:31:0x00cb, B:33:0x00fe, B:35:0x0106, B:37:0x010a, B:39:0x0112, B:40:0x0114, B:42:0x011a, B:44:0x011e, B:46:0x0126, B:47:0x0128, B:50:0x0134, B:52:0x013a, B:55:0x0143, B:61:0x0150, B:63:0x015a, B:64:0x0162, B:53:0x013e, B:56:0x0146, B:57:0x0149, B:30:0x00c5), top: B:69:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011a A[Catch: Throwable -> 0x017d, TryCatch #0 {Throwable -> 0x017d, blocks: (B:24:0x0076, B:26:0x00ba, B:27:0x00bc, B:29:0x00c0, B:31:0x00cb, B:33:0x00fe, B:35:0x0106, B:37:0x010a, B:39:0x0112, B:40:0x0114, B:42:0x011a, B:44:0x011e, B:46:0x0126, B:47:0x0128, B:50:0x0134, B:52:0x013a, B:55:0x0143, B:61:0x0150, B:63:0x015a, B:64:0x0162, B:53:0x013e, B:56:0x0146, B:57:0x0149, B:30:0x00c5), top: B:69:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0149 A[Catch: Throwable -> 0x017d, TryCatch #0 {Throwable -> 0x017d, blocks: (B:24:0x0076, B:26:0x00ba, B:27:0x00bc, B:29:0x00c0, B:31:0x00cb, B:33:0x00fe, B:35:0x0106, B:37:0x010a, B:39:0x0112, B:40:0x0114, B:42:0x011a, B:44:0x011e, B:46:0x0126, B:47:0x0128, B:50:0x0134, B:52:0x013a, B:55:0x0143, B:61:0x0150, B:63:0x015a, B:64:0x0162, B:53:0x013e, B:56:0x0146, B:57:0x0149, B:30:0x00c5), top: B:69:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x015a A[Catch: Throwable -> 0x017d, TryCatch #0 {Throwable -> 0x017d, blocks: (B:24:0x0076, B:26:0x00ba, B:27:0x00bc, B:29:0x00c0, B:31:0x00cb, B:33:0x00fe, B:35:0x0106, B:37:0x010a, B:39:0x0112, B:40:0x0114, B:42:0x011a, B:44:0x011e, B:46:0x0126, B:47:0x0128, B:50:0x0134, B:52:0x013a, B:55:0x0143, B:61:0x0150, B:63:0x015a, B:64:0x0162, B:53:0x013e, B:56:0x0146, B:57:0x0149, B:30:0x00c5), top: B:69:0x0076 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(android.content.Context r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, int r10, boolean r11, long r12, boolean r14) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.stat.b.a(android.content.Context, java.lang.String, java.lang.String, java.lang.String, int, boolean, long, boolean):void");
    }

    private static String b(Context context) {
        try {
            byte[] byteArray = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures[0].toByteArray();
            if (byteArray != null) {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
                messageDigest.update(byteArray);
                byte[] digest = messageDigest.digest();
                if (digest != null) {
                    StringBuilder sb = new StringBuilder("");
                    if (digest != null && digest.length > 0) {
                        for (int i = 0; i < digest.length; i++) {
                            String upperCase = Integer.toHexString(digest[i] & 255).toUpperCase();
                            if (i > 0) {
                                sb.append(CommonConstant.Symbol.COLON);
                            }
                            if (upperCase.length() < 2) {
                                sb.append(0);
                            }
                            sb.append(upperCase);
                        }
                        return sb.toString();
                    }
                    return null;
                }
            }
        } catch (Exception e) {
            TbsLog.i(e);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v5 */
    public static String b(HttpURLConnection httpURLConnection, String str, boolean z) {
        Exception e;
        ByteArrayOutputStream byteArrayOutputStream;
        String str2 = "";
        ByteArrayOutputStream byteArrayOutputStream2 = 0;
        r1 = null;
        ByteArrayOutputStream byteArrayOutputStream3 = null;
        byteArrayOutputStream2 = 0;
        try {
            try {
                try {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    String contentEncoding = httpURLConnection.getContentEncoding();
                    httpURLConnection = (contentEncoding == null || !contentEncoding.equalsIgnoreCase("gzip")) ? (contentEncoding == null || !contentEncoding.equalsIgnoreCase("deflate")) ? inputStream : new InflaterInputStream(inputStream, new Inflater(true)) : new GZIPInputStream(inputStream);
                    try {
                        byteArrayOutputStream = new ByteArrayOutputStream();
                    } catch (Exception e2) {
                        e = e2;
                    }
                } catch (IOException e3) {
                    TbsLog.i(e3);
                }
                try {
                    byte[] bArr = new byte[128];
                    while (true) {
                        int read = httpURLConnection.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                    str2 = z ? new String(g.a().c(byteArrayOutputStream.toByteArray())) : new String(g.b(byteArrayOutputStream.toByteArray(), str));
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e4) {
                        TbsLog.i(e4);
                    }
                } catch (Exception e5) {
                    e = e5;
                    byteArrayOutputStream3 = byteArrayOutputStream;
                    TbsLog.i(e);
                    if (byteArrayOutputStream3 != null) {
                        try {
                            byteArrayOutputStream3.close();
                        } catch (IOException e6) {
                            TbsLog.i(e6);
                        }
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.close();
                    }
                    httpURLConnection = "HttpUtils";
                    StringBuilder sb = new StringBuilder("getResponseFromConnection,response=");
                    sb.append(str2);
                    byteArrayOutputStream2 = ";isUseRSA=";
                    sb.append(";isUseRSA=");
                    sb.append(z);
                    TbsLog.i("HttpUtils", sb.toString());
                    return str2;
                } catch (Throwable th) {
                    th = th;
                    byteArrayOutputStream2 = byteArrayOutputStream;
                    if (byteArrayOutputStream2 != 0) {
                        try {
                            byteArrayOutputStream2.close();
                        } catch (IOException e7) {
                            TbsLog.i(e7);
                        }
                    }
                    if (httpURLConnection != 0) {
                        try {
                            httpURLConnection.close();
                        } catch (IOException e8) {
                            TbsLog.i(e8);
                        }
                    }
                    throw th;
                }
            } catch (Exception e9) {
                e = e9;
                httpURLConnection = null;
            } catch (Throwable th2) {
                th = th2;
                httpURLConnection = 0;
            }
            if (httpURLConnection != 0) {
                httpURLConnection.close();
            }
            httpURLConnection = "HttpUtils";
            StringBuilder sb2 = new StringBuilder("getResponseFromConnection,response=");
            sb2.append(str2);
            byteArrayOutputStream2 = ";isUseRSA=";
            sb2.append(";isUseRSA=");
            sb2.append(z);
            TbsLog.i("HttpUtils", sb2.toString());
            return str2;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Context context, String str) {
        try {
            TbsPVConfig.releaseInstance();
            TbsPVConfig.getInstance(context).clear();
            if (TextUtils.isEmpty(str)) {
                return;
            }
            for (String str2 : str.split(RecceBridgeHandler.RECCE_BRIDGE_ARGS_SEPARATOR)) {
                try {
                    String[] split = str2.split("=");
                    if (split.length == 2) {
                        b(context, split[0], split[1]);
                    }
                } catch (Exception e) {
                    TbsLog.i(e);
                }
            }
            TbsPVConfig.getInstance(context).commit();
        } catch (Exception e2) {
            TbsLog.i(e2);
        }
    }

    private static void b(Context context, String str, String str2) {
        if ("reset".equals(str) && "true".equals(str2)) {
            QbSdk.reset(context);
        } else if (!str.startsWith("rmfile")) {
            TbsPVConfig.getInstance(context).putData(str, str2);
        } else {
            try {
                SharedPreferences sharedPreferences = context.getSharedPreferences("tbs_status", 0);
                if (sharedPreferences.getBoolean(str, false)) {
                    return;
                }
                File file = new File(str2);
                if (str2 != null && file.exists()) {
                    TbsLog.i("HttpUtils", "received command,delete" + str2);
                    FileUtil.b(file);
                }
                sharedPreferences.edit().putBoolean(str, true).apply();
            } catch (Exception e) {
                TbsLog.i(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(18:1|2|(16:9|(1:11)(1:45)|12|13|(1:15)|16|(2:18|(1:20))(1:44)|21|(1:23)(1:43)|24|(1:26)|27|29|30|(3:32|(1:34)(2:37|(1:39))|35)|40)|46|13|(0)|16|(0)(0)|21|(0)(0)|24|(0)|27|29|30|(0)|40|(1:(0))) */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00f5 A[Catch: Exception -> 0x01a8, TryCatch #0 {Exception -> 0x01a8, blocks: (B:2:0x0000, B:4:0x0071, B:6:0x007b, B:9:0x0086, B:12:0x008e, B:15:0x00d8, B:17:0x00f5, B:18:0x00fa, B:20:0x010d, B:22:0x011f, B:24:0x013b, B:26:0x014f, B:30:0x0165, B:31:0x016c, B:27:0x015d, B:23:0x0129, B:13:0x0092, B:14:0x0097), top: B:46:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x010d A[Catch: Exception -> 0x01a8, TryCatch #0 {Exception -> 0x01a8, blocks: (B:2:0x0000, B:4:0x0071, B:6:0x007b, B:9:0x0086, B:12:0x008e, B:15:0x00d8, B:17:0x00f5, B:18:0x00fa, B:20:0x010d, B:22:0x011f, B:24:0x013b, B:26:0x014f, B:30:0x0165, B:31:0x016c, B:27:0x015d, B:23:0x0129, B:13:0x0092, B:14:0x0097), top: B:46:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0129 A[Catch: Exception -> 0x01a8, TryCatch #0 {Exception -> 0x01a8, blocks: (B:2:0x0000, B:4:0x0071, B:6:0x007b, B:9:0x0086, B:12:0x008e, B:15:0x00d8, B:17:0x00f5, B:18:0x00fa, B:20:0x010d, B:22:0x011f, B:24:0x013b, B:26:0x014f, B:30:0x0165, B:31:0x016c, B:27:0x015d, B:23:0x0129, B:13:0x0092, B:14:0x0097), top: B:46:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x014f A[Catch: Exception -> 0x01a8, TryCatch #0 {Exception -> 0x01a8, blocks: (B:2:0x0000, B:4:0x0071, B:6:0x007b, B:9:0x0086, B:12:0x008e, B:15:0x00d8, B:17:0x00f5, B:18:0x00fa, B:20:0x010d, B:22:0x011f, B:24:0x013b, B:26:0x014f, B:30:0x0165, B:31:0x016c, B:27:0x015d, B:23:0x0129, B:13:0x0092, B:14:0x0097), top: B:46:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x015d A[Catch: Exception -> 0x01a8, TryCatch #0 {Exception -> 0x01a8, blocks: (B:2:0x0000, B:4:0x0071, B:6:0x007b, B:9:0x0086, B:12:0x008e, B:15:0x00d8, B:17:0x00f5, B:18:0x00fa, B:20:0x010d, B:22:0x011f, B:24:0x013b, B:26:0x014f, B:30:0x0165, B:31:0x016c, B:27:0x015d, B:23:0x0129, B:13:0x0092, B:14:0x0097), top: B:46:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0165 A[Catch: Exception -> 0x01a8, TryCatch #0 {Exception -> 0x01a8, blocks: (B:2:0x0000, B:4:0x0071, B:6:0x007b, B:9:0x0086, B:12:0x008e, B:15:0x00d8, B:17:0x00f5, B:18:0x00fa, B:20:0x010d, B:22:0x011f, B:24:0x013b, B:26:0x014f, B:30:0x0165, B:31:0x016c, B:27:0x015d, B:23:0x0129, B:13:0x0092, B:14:0x0097), top: B:46:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0179 A[Catch: Exception -> 0x01a7, TryCatch #1 {Exception -> 0x01a7, blocks: (B:32:0x0173, B:34:0x0179, B:36:0x0184, B:37:0x018d, B:38:0x0193, B:40:0x019d), top: B:48:0x0173 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.json.JSONObject c(MTT.ThirdAppInfoNew r7, android.content.Context r8) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.stat.b.c(MTT.ThirdAppInfoNew, android.content.Context):org.json.JSONObject");
    }
}
