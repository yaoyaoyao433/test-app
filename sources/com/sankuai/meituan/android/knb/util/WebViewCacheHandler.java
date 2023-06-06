package com.sankuai.meituan.android.knb.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.preference.PreferenceManager;
import android.support.annotation.RequiresApi;
import android.text.TextUtils;
import android.util.Log;
import com.dianping.titans.service.FileUtil;
import com.meituan.android.cipstorage.q;
import com.meituan.android.cipstorage.u;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.kitefly.utils.CommonUtils;
import com.meituan.android.common.unionid.oneid.network.OneIdNetworkTool;
import com.meituan.crashreporter.a;
import com.meituan.crashreporter.c;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.metrics.traffic.hurl.HttpURLWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.uuid.GetUUID;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WebViewCacheHandler {
    private static final int BUFFER_SIZE = 2048;
    private static final String DEFAULT_WEBVIEW_KEY = "WebViewVersion";
    private static final String REPORT_KEY_FOR_CRASH_SERVICE = "WebViewCacheFileUrl";
    private static final int TIME_OUT = 10000;
    private static final String WEBVIEW_CACHE_LAST_REPORT_TIME = "webview_cache_last_report_time";
    private static final long WEBVIEW_CACHE_REPORT_DURATION = 3600000;
    private static final String WEBVIEW_KEY_PREFIX = "WebViewOOM";
    private static final String WEBVIEW_TAG = "WebViewCrash";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isWebViewCrash(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "683dd4937b05d59d2710e4a8a6564834", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "683dd4937b05d59d2710e4a8a6564834")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains("TrichromeLibrary.apk") || str.contains("WebViewGoogle.apk") || str.contains("libwebviewchromium.so") || str.contains("webview.apk");
    }

    public static void registerCrashInfoProvider(final Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c17379e939078124459445793247af34", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c17379e939078124459445793247af34");
            return;
        }
        System.out.println("WebViewCrash registerCrashInfoProvider begin");
        try {
            c.c().a(new a() { // from class: com.sankuai.meituan.android.knb.util.WebViewCacheHandler.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.crashreporter.a
                public final Map<String, Object> getCrashInfo(String str, boolean z) {
                    Object[] objArr2 = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "00dfceb58614cb3d8751954cb06d7531", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Map) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "00dfceb58614cb3d8751954cb06d7531");
                    }
                    System.out.println("WebViewCrash getCrashInfo");
                    if (z || Build.VERSION.SDK_INT < 28 || !WebViewCacheHandler.isWebViewCrash(str)) {
                        return null;
                    }
                    HashMap hashMap = new HashMap();
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                    if (System.currentTimeMillis() - defaultSharedPreferences.getLong(WebViewCacheHandler.WEBVIEW_CACHE_LAST_REPORT_TIME, 0L) >= 3600000) {
                        try {
                            Map<String, Object> execute = WebViewCacheHandler.execute(context, hashMap);
                            defaultSharedPreferences.edit().putLong(WebViewCacheHandler.WEBVIEW_CACHE_LAST_REPORT_TIME, System.currentTimeMillis()).commit();
                            return execute;
                        } catch (Throwable th) {
                            th.printStackTrace();
                            return null;
                        }
                    }
                    System.out.println("WebViewCrash delete&report already");
                    hashMap.put(WebViewCacheHandler.REPORT_KEY_FOR_CRASH_SERVICE, "no report -- WebViewCrash delete&report already");
                    return hashMap;
                }
            });
        } catch (Throwable th) {
            PrintStream printStream = System.out;
            StringBuffer stringBuffer = new StringBuffer("WebViewCrash \n");
            stringBuffer.append(th.getLocalizedMessage());
            printStream.println(stringBuffer);
            th.printStackTrace();
        }
        System.out.println("WebViewCrash registerCrashInfoProvider end");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(api = 24)
    public static Map<String, Object> execute(Context context, Map<String, Object> map) {
        Object[] objArr = {context, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8062a596dcbbaf1050119a88899c9eb5", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8062a596dcbbaf1050119a88899c9eb5");
        }
        System.out.println("WebViewCrash execute begin");
        File file = new File(context.getDataDir().getAbsolutePath() + File.separator + "app_webview");
        File file2 = new File(context.getDataDir().getAbsolutePath() + File.separator + "app_webviewcache");
        File file3 = new File(context.getCacheDir().getAbsolutePath() + File.separator + "WebView");
        File file4 = new File(context.getCacheDir().getAbsolutePath() + File.separator + "org.chromium.android_webview");
        ArrayList arrayList = new ArrayList();
        arrayList.add(file);
        arrayList.add(file2);
        arrayList.add(file3);
        arrayList.add(file4);
        try {
            upload(context, arrayList, map);
            System.out.println("WebViewCrash upload end");
            return map;
        } finally {
            deleteWebViewCache(context);
        }
    }

    private static void upload(Context context, ArrayList<File> arrayList, Map<String, Object> map) {
        Object[] objArr = {context, arrayList, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5ee5c88e2505d2c19a6e7f37b24edbe8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5ee5c88e2505d2c19a6e7f37b24edbe8");
            return;
        }
        try {
            String reportFile = reportFile(context, arrayList);
            Babel.logRT(WEBVIEW_TAG, reportFile);
            map.put(REPORT_KEY_FOR_CRASH_SERVICE, reportFile);
            PrintStream printStream = System.out;
            printStream.println("WebViewCrash Babel logRT result=" + reportFile);
        } catch (Throwable unused) {
            System.out.println("WebViewCrash upload fail");
        }
    }

    private static boolean compress(ArrayList<File> arrayList, String str, boolean z) throws Exception {
        ZipOutputStream zipOutputStream;
        Object[] objArr = {arrayList, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "411742602180eb95404faa82261a82f2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "411742602180eb95404faa82261a82f2")).booleanValue();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(new File(str));
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                zipOutputStream = new ZipOutputStream(fileOutputStream);
            } catch (Throwable th) {
                th = th;
                zipOutputStream = null;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            compress(arrayList, zipOutputStream, z);
            long currentTimeMillis2 = System.currentTimeMillis();
            System.out.println("WebViewCrash 压缩完成，耗时：" + (currentTimeMillis2 - currentTimeMillis) + " ms");
            try {
                zipOutputStream.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
            return true;
        } catch (Exception e3) {
            e = e3;
            throw new RuntimeException("zip error from ZipUtils", e);
        } catch (Throwable th2) {
            th = th2;
            if (zipOutputStream != null) {
                try {
                    zipOutputStream.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
            }
            throw th;
        }
    }

    private static void compress(File file, ZipOutputStream zipOutputStream, String str, boolean z) throws Exception {
        Object[] objArr = {file, zipOutputStream, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6718f3a315ff5509f2ccb4a1930e05d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6718f3a315ff5509f2ccb4a1930e05d0");
            return;
        }
        byte[] bArr = new byte[2048];
        if (file.isFile()) {
            zipOutputStream.putNextEntry(new ZipEntry(str));
            FileInputStream fileInputStream = new FileInputStream(file);
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read != -1) {
                    zipOutputStream.write(bArr, 0, read);
                } else {
                    zipOutputStream.closeEntry();
                    fileInputStream.close();
                    return;
                }
            }
        } else {
            File[] listFiles = file.listFiles();
            if (listFiles == null || listFiles.length == 0) {
                if (z) {
                    zipOutputStream.putNextEntry(new ZipEntry(str + "/"));
                    zipOutputStream.closeEntry();
                    return;
                }
                return;
            }
            for (File file2 : listFiles) {
                if (z) {
                    compress(file2, zipOutputStream, str + "/" + file2.getName(), z);
                } else {
                    compress(file2, zipOutputStream, file2.getName(), z);
                }
            }
        }
    }

    private static void compress(List<File> list, ZipOutputStream zipOutputStream, boolean z) throws Exception {
        Object[] objArr = {list, zipOutputStream, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f7fe83e0ebce40bce67f7bea0ba6364a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f7fe83e0ebce40bce67f7bea0ba6364a");
            return;
        }
        byte[] bArr = new byte[2048];
        for (File file : list) {
            String name = file.getName();
            if (file.isFile()) {
                zipOutputStream.putNextEntry(new ZipEntry(name));
                FileInputStream fileInputStream = new FileInputStream(file);
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    zipOutputStream.write(bArr, 0, read);
                }
                zipOutputStream.closeEntry();
                fileInputStream.close();
            } else {
                File[] listFiles = file.listFiles();
                if (listFiles != null && listFiles.length != 0) {
                    for (File file2 : listFiles) {
                        if (z) {
                            compress(file2, zipOutputStream, name + "/" + file2.getName(), z);
                        } else {
                            compress(file2, zipOutputStream, file2.getName(), z);
                        }
                    }
                } else if (z) {
                    zipOutputStream.putNextEntry(new ZipEntry(name + "/"));
                    zipOutputStream.closeEntry();
                }
            }
        }
    }

    private static String getUrl(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7de0f7e560daa6076240fd1036351e46", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7de0f7e560daa6076240fd1036351e46");
        }
        String obtainToken = CommonUtils.obtainToken(context);
        return "https://frep.meituan.net/" + obtainToken + "/file-upload/signed-url";
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0124 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0141 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x011a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0137 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String request(java.lang.String r13, java.util.Map<java.lang.String, java.lang.String> r14) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.android.knb.util.WebViewCacheHandler.request(java.lang.String, java.util.Map):java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.net.HttpURLConnection] */
    private static boolean reportFile(String str, String str2) {
        DataOutputStream dataOutputStream;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        DataOutputStream dataOutputStream2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "147b1b5ba62c55c091b3ebc2fb0ba92f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "147b1b5ba62c55c091b3ebc2fb0ba92f")).booleanValue();
        }
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        File file = new File(str2);
        try {
            if (!file.exists()) {
                return false;
            }
            try {
                str = (HttpURLConnection) HttpURLWrapper.wrapURLConnection(new URL(str).openConnection());
                try {
                    str.setReadTimeout(10000);
                    str.setConnectTimeout(10000);
                    str.setDoInput(true);
                    str.setDoOutput(true);
                    str.setUseCaches(false);
                    str.setRequestMethod(OneIdNetworkTool.PUT);
                    str.setRequestProperty("Connection", "Keep-Alive");
                    str.setRequestProperty("Charset", "UTF-8");
                    str.setRequestProperty("content-type", "application/zip");
                    dataOutputStream = new DataOutputStream(str.getOutputStream());
                } catch (Exception e) {
                    e = e;
                }
                try {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        dataOutputStream.write(bArr, 0, read);
                    }
                    fileInputStream.close();
                    dataOutputStream.flush();
                    boolean z = str.getResponseCode() == 200;
                    try {
                        dataOutputStream.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                    if (str != 0) {
                        str.disconnect();
                    }
                    return z;
                } catch (Exception e3) {
                    e = e3;
                    dataOutputStream2 = dataOutputStream;
                    e.printStackTrace();
                    if (dataOutputStream2 != null) {
                        try {
                            dataOutputStream2.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                    if (str != 0) {
                        str.disconnect();
                    }
                    return false;
                } catch (Throwable th) {
                    th = th;
                    dataOutputStream2 = dataOutputStream;
                    if (dataOutputStream2 != null) {
                        try {
                            dataOutputStream2.close();
                        } catch (IOException e5) {
                            e5.printStackTrace();
                        }
                    }
                    if (str != 0) {
                        str.disconnect();
                    }
                    throw th;
                }
            } catch (Exception e6) {
                e = e6;
                str = 0;
            } catch (Throwable th2) {
                th = th2;
                str = 0;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private static String streamToString(InputStream inputStream) {
        Object[] objArr = {inputStream};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bc966b7a394b6522b6108054eba08929", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bc966b7a394b6522b6108054eba08929");
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[4096];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byteArrayOutputStream.close();
                    inputStream.close();
                    return new String(byteArrayOutputStream.toByteArray());
                }
            }
        } catch (Exception unused) {
            return null;
        }
    }

    private static String reportFile(Context context, ArrayList<File> arrayList) throws Exception {
        String jSONException;
        Object[] objArr = {context, arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cf6853d5e7d9cfcc3696f3a3008ec39b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cf6853d5e7d9cfcc3696f3a3008ec39b");
        }
        String path = q.a(context, "mtplatform_titans", "webviewcrash.zip", u.b).getPath();
        if (compress(arrayList, path, true)) {
            File file = new File(path);
            if (file.exists()) {
                try {
                    HashMap hashMap = new HashMap(8);
                    hashMap.put("contentType", "application/zip");
                    hashMap.put("fileNamePrefix", "moon");
                    hashMap.put("uuid", GetUUID.getInstance().getUUID(context));
                    String request = request(getUrl(context), hashMap);
                    if (TextUtils.isEmpty(request)) {
                        return "Fetch report info error";
                    }
                    try {
                        JSONObject jSONObject = new JSONObject(request);
                        int optInt = jSONObject.optInt("code");
                        jSONException = jSONObject.optString("message");
                        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                        String optString = jSONObject2.optString("putFile");
                        String optString2 = jSONObject2.optString("getFile");
                        if (optInt == 0 && !TextUtils.isEmpty(optString)) {
                            if (!reportFile(optString, path)) {
                                optString2 = "report file error";
                            }
                            return optString2;
                        }
                    } catch (JSONException e) {
                        jSONException = e.toString();
                    }
                    return jSONException;
                } finally {
                    file.delete();
                }
            }
            return "zip file is not exists";
        }
        return "failed to compress the file";
    }

    public static void handle(Context context, boolean z, String str, List<String> list, List<String> list2) {
        Object[] objArr = {context, Byte.valueOf(z ? (byte) 1 : (byte) 0), str, list, list2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "806b0c2b4bdc571fcb02ce78455c6f01", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "806b0c2b4bdc571fcb02ce78455c6f01");
        } else if (!z || list == null || list.isEmpty()) {
        } else {
            try {
                diagnosticWebView(context, str, list, list2);
            } catch (Exception e) {
                Log.e(WEBVIEW_TAG, "init error=" + e.getMessage());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00e3 A[Catch: Exception -> 0x012e, TryCatch #0 {Exception -> 0x012e, blocks: (B:15:0x0043, B:18:0x004b, B:20:0x005d, B:22:0x0066, B:24:0x006e, B:27:0x0076, B:29:0x0087, B:32:0x0092, B:35:0x0099, B:36:0x009d, B:38:0x00a3, B:40:0x00d0, B:42:0x00e3, B:43:0x00f1, B:39:0x00cd, B:45:0x010a), top: B:50:0x0043 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void diagnosticWebView(android.content.Context r12, @android.support.annotation.Nullable java.lang.String r13, @android.support.annotation.NonNull java.util.List<java.lang.String> r14, java.util.List<java.lang.String> r15) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.android.knb.util.WebViewCacheHandler.diagnosticWebView(android.content.Context, java.lang.String, java.util.List, java.util.List):void");
    }

    @RequiresApi(api = 24)
    private static boolean usingWebView(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e8ad46cc21fcc3c250626efc473466b0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e8ad46cc21fcc3c250626efc473466b0")).booleanValue();
        }
        File file = new File(context.getDataDir().getAbsolutePath() + File.separator + "app_webview/Default/GPUCache/index-dir/the-real-index");
        return file.exists() && System.currentTimeMillis() - file.lastModified() < MetricsAnrManager.ANR_THRESHOLD;
    }

    @RequiresApi(api = 24)
    private static void deleteWebViewCache(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2a38777b00c6f71d82f1c08b64fdc351", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2a38777b00c6f71d82f1c08b64fdc351");
            return;
        }
        System.out.println("WebViewCache deleteWebViewCache begin");
        File file = new File(context.getDataDir().getAbsolutePath() + File.separator + "app_webview");
        File file2 = new File(context.getDataDir().getAbsolutePath() + File.separator + "app_webviewcache");
        File file3 = new File(context.getCacheDir().getAbsolutePath() + File.separator + "WebView");
        File file4 = new File(context.getCacheDir().getAbsolutePath() + File.separator + "org.chromium.android_webview");
        FileUtil.deleteFileForce(file, false);
        FileUtil.deleteFileForce(file2, false);
        FileUtil.deleteFileForce(file3, false);
        FileUtil.deleteFileForce(file4, false);
        System.out.println("WebViewCache deleteWebViewCache end");
    }
}
