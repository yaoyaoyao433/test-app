package com.dianping.titans.utils;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.IOUtils;
import com.sankuai.common.utils.MD5;
import com.sankuai.meituan.android.knb.KNBRuntime;
import com.sankuai.meituan.android.knb.util.AndroidAdapter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class LocalIdUtils {
    public static final String FROM_CLIENT = "client";
    public static final String FROM_SERVER = "server";
    public static final String KEY_TOKEN_QUERY = "sceneToken";
    public static final String QUERY_MAXHEIGHT = "maxHeight";
    public static final String QUERY_MAXWIDTH = "maxWidth";
    public static final String QUERY_QUALITY = "quality";
    public static final String SCHEMA = "knb-media";
    public static final String URL = "url";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static boolean isValid(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9217675a492b4987c26d6068d0e31be5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9217675a492b4987c26d6068d0e31be5")).booleanValue();
        }
        try {
            return isValid(Uri.parse(str));
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean isValid(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2d8cee701eadf6829b4106eb2e52a181", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2d8cee701eadf6829b4106eb2e52a181")).booleanValue() : TextUtils.equals(uri.getScheme(), "knb-media");
    }

    public static File getRootDir() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e6734f68cf98efb16c51c79f0bb62d95", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e6734f68cf98efb16c51c79f0bb62d95");
        }
        String externalStorageState = Environment.getExternalStorageState();
        if ("mounted".equals(externalStorageState) || "mounted_ro".equals(externalStorageState)) {
            return Environment.getExternalStorageDirectory();
        }
        return null;
    }

    @Deprecated
    public static File getFile(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c3528ca7875b6e62282d7a040e52783b", RobustBitConfig.DEFAULT_VALUE) ? (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c3528ca7875b6e62282d7a040e52783b") : getFile(str, null);
    }

    public static File getFile(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fe8ffed7419eeeac4ba98104690c9f40", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fe8ffed7419eeeac4ba98104690c9f40");
        }
        if (isValid(str)) {
            Uri parse = Uri.parse(str);
            if (!parse.isHierarchical()) {
                return null;
            }
            String queryParameter = parse.getQueryParameter("url");
            if (!TextUtils.isEmpty(queryParameter)) {
                if (isContentResource(queryParameter)) {
                    Context context = KNBRuntime.getRuntime().getContext();
                    File file = new File(TempUtil.getTempFile(context), MD5.getMessageDigest(queryParameter.getBytes()));
                    if (!file.exists()) {
                        try {
                            if (!file.getParentFile().exists()) {
                                file.getParentFile().mkdirs();
                            }
                            FileOutputStream fileOutputStream = new FileOutputStream(file);
                            InputStream b = ContentResolverProvider.getContentResolver(context, str2).b(Uri.parse(queryParameter));
                            byte[] bArr = new byte[2048];
                            while (true) {
                                int read = b.read(bArr);
                                if (read == -1) {
                                    break;
                                }
                                fileOutputStream.write(bArr, 0, read);
                            }
                            IOUtils.close(fileOutputStream);
                            IOUtils.close(b);
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                    return file;
                }
                return new File(queryParameter);
            }
        }
        return null;
    }

    public static Uri getUri(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1f505459e09052766c448ecac473a245", RobustBitConfig.DEFAULT_VALUE)) {
            return (Uri) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1f505459e09052766c448ecac473a245");
        }
        if (isValid(str)) {
            Uri parse = Uri.parse(str);
            if (!parse.isHierarchical()) {
                return null;
            }
            String queryParameter = parse.getQueryParameter("url");
            if (!TextUtils.isEmpty(queryParameter)) {
                return Uri.parse(queryParameter);
            }
        }
        return null;
    }

    private static String getSceneToken(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a0996749c5d73e508e3c26cf67f088cb", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a0996749c5d73e508e3c26cf67f088cb");
        }
        if (isValid(str)) {
            Uri parse = Uri.parse(str);
            if (!parse.isHierarchical()) {
                return null;
            }
            String queryParameter = parse.getQueryParameter("sceneToken");
            if (!TextUtils.isEmpty(queryParameter)) {
                return queryParameter;
            }
        }
        return null;
    }

    public static boolean isContentResource(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "08e4e36e78f5a6ac7008dc382a0971fc", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "08e4e36e78f5a6ac7008dc382a0971fc")).booleanValue() : URLUtil.isContentUrl(str);
    }

    public static InputStream getInputStream(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d595402575cd72e72dfdff2428fe0e3f", RobustBitConfig.DEFAULT_VALUE) ? (InputStream) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d595402575cd72e72dfdff2428fe0e3f") : getInputStream(context, str, getSceneToken(str));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.io.InputStream getInputStream(android.content.Context r12, java.lang.String r13, java.lang.String r14) {
        /*
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r12
            r8 = 1
            r0[r8] = r13
            r1 = 2
            r0[r1] = r14
            com.meituan.robust.ChangeQuickRedirect r9 = com.dianping.titans.utils.LocalIdUtils.changeQuickRedirect
            java.lang.String r10 = "442ec2a458d847400ae89eda1013feb1"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L24
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r0, r2, r9, r8, r10)
            java.io.InputStream r12 = (java.io.InputStream) r12
            return r12
        L24:
            android.net.Uri r0 = android.net.Uri.parse(r13)
            boolean r1 = isValid(r0)
            if (r1 == 0) goto Ld4
            java.lang.String r1 = r0.getHost()
            boolean r3 = r0.isHierarchical()
            if (r3 != 0) goto L39
            return r2
        L39:
            java.lang.String r3 = "url"
            java.lang.String r3 = r0.getQueryParameter(r3)
            java.lang.String r4 = "client"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L85
            java.lang.String r1 = "url"
            java.lang.String r0 = r0.getQueryParameter(r1)     // Catch: java.io.FileNotFoundException -> L73
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.io.FileNotFoundException -> L73
            if (r1 != 0) goto Lc4
            boolean r1 = isContentResource(r0)     // Catch: java.io.FileNotFoundException -> L73
            if (r1 == 0) goto L68
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch: java.io.FileNotFoundException -> L73
            com.meituan.android.privacy.interfaces.t r12 = com.dianping.titans.utils.ContentResolverProvider.getContentResolver(r12, r14)     // Catch: java.io.FileNotFoundException -> L73
            java.io.InputStream r12 = r12.b(r0)     // Catch: java.io.FileNotFoundException -> L73
            goto Lc5
        L68:
            java.io.FileInputStream r12 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L73
            java.io.File r14 = new java.io.File     // Catch: java.io.FileNotFoundException -> L73
            r14.<init>(r0)     // Catch: java.io.FileNotFoundException -> L73
            r12.<init>(r14)     // Catch: java.io.FileNotFoundException -> L73
            goto Lc5
        L73:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r14 = "FileNotFoundException url="
            r12.<init>(r14)
            r12.append(r13)
            java.lang.String r12 = r12.toString()
        L81:
            r11 = r2
            r2 = r12
            r12 = r11
            goto Lc5
        L85:
            java.lang.String r12 = "server"
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto Lc4
            com.squareup.okhttp.v r12 = new com.squareup.okhttp.v
            r12.<init>()
            com.meituan.metrics.traffic.reflection.OkHttp2Wrapper.addInterceptorToClient(r12)
            com.squareup.okhttp.v r12 = com.sankuai.waimai.launcher.util.aop.b.a(r12)
            com.squareup.okhttp.x$a r14 = new com.squareup.okhttp.x$a
            r14.<init>()
            com.squareup.okhttp.x$a r14 = r14.a(r3)
            com.squareup.okhttp.x r14 = r14.a()
            com.squareup.okhttp.e r12 = r12.a(r14)
            com.squareup.okhttp.z r12 = r12.a()     // Catch: java.io.IOException -> Lb5
            com.squareup.okhttp.aa r12 = r12.g     // Catch: java.io.IOException -> Lb5
            java.io.InputStream r12 = r12.d()     // Catch: java.io.IOException -> Lb5
            goto Lc5
        Lb5:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r14 = "IOException url="
            r12.<init>(r14)
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            goto L81
        Lc4:
            r12 = r2
        Lc5:
            if (r12 != 0) goto Ld3
            java.lang.String r13 = "media_error"
            java.lang.String r14 = ""
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r2)
            com.dianping.titans.utils.EventReporter.reportException(r13, r14, r0)
        Ld3:
            return r12
        Ld4:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.titans.utils.LocalIdUtils.getInputStream(android.content.Context, java.lang.String, java.lang.String):java.io.InputStream");
    }

    public static String getParam(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9f1369f4afcf2e698741ad529a3cf315", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9f1369f4afcf2e698741ad529a3cf315");
        }
        if (isValid(str)) {
            Uri parse = Uri.parse(str);
            if (parse.isHierarchical()) {
                return parse.getQueryParameter(str2);
            }
            return null;
        }
        return null;
    }

    public static Map<String, String> getParams(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bd73592acf7c6bb420882e726ec28e74", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bd73592acf7c6bb420882e726ec28e74");
        }
        if (isValid(str)) {
            HashMap hashMap = new HashMap();
            Uri parse = Uri.parse(str);
            if (parse.isHierarchical()) {
                for (String str2 : parse.getQueryParameterNames()) {
                    hashMap.put(str2, parse.getQueryParameter(str2));
                }
                return hashMap;
            }
            return null;
        }
        return null;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class Builder {
        public static ChangeQuickRedirect changeQuickRedirect;
        private File file;
        private Map<String, String> queryMap;
        private Uri uri;

        public Builder host(String str) {
            return this;
        }

        public Builder(String str) {
            this(!TextUtils.isEmpty(str) ? Uri.parse(str) : null);
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "342a1d1266921b1863c8607d9e4648a3", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "342a1d1266921b1863c8607d9e4648a3");
            }
        }

        @Deprecated
        public Builder(File file) {
            Object[] objArr = {file};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d2b77b675d20a463fd1d3f503dfc6e5e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d2b77b675d20a463fd1d3f503dfc6e5e");
                return;
            }
            this.queryMap = new HashMap();
            this.file = file;
        }

        public Builder(Uri uri) {
            Object[] objArr = {uri};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7cd016bbc8b684a601d4e8c13a73d5e6", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7cd016bbc8b684a601d4e8c13a73d5e6");
                return;
            }
            this.queryMap = new HashMap();
            if (uri == null || TextUtils.isEmpty(uri.getPath())) {
                return;
            }
            if (AndroidAdapter.androidCompatQ()) {
                if (LocalIdUtils.isContentResource(uri.toString())) {
                    this.uri = uri;
                    return;
                }
                this.file = new File(uri.getPath());
                if (this.file.exists()) {
                    return;
                }
                this.file = new File(LocalIdUtils.getRootDir(), uri.getPath());
                return;
            }
            this.file = new File(uri.getPath());
            if (this.file.exists()) {
                return;
            }
            this.file = new File(LocalIdUtils.getRootDir(), uri.getPath());
        }

        public Builder appendQuery(String str, String str2) {
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "366fc2fdc6dd92d059a24846eb436be6", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "366fc2fdc6dd92d059a24846eb436be6");
            }
            this.queryMap.put(str, str2);
            return this;
        }

        public Builder appendToken(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2cc1ec759ab116333ef687655c677b11", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2cc1ec759ab116333ef687655c677b11");
            }
            this.queryMap.put("sceneToken", str);
            return this;
        }

        public String build() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "89c6f8b0519b75ebecfad4cf3ba56274", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "89c6f8b0519b75ebecfad4cf3ba56274");
            }
            if (this.uri == null || !this.uri.isHierarchical()) {
                return (this.file == null || !this.file.exists()) ? "" : build(this.file.getAbsolutePath());
            }
            return build(this.uri.toString());
        }

        public String build(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e0f5c6adcb05508f1524111186f8642d", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e0f5c6adcb05508f1524111186f8642d");
            }
            Uri.Builder builder = new Uri.Builder();
            builder.scheme("knb-media").authority("client").appendQueryParameter("url", str);
            for (Map.Entry<String, String> entry : this.queryMap.entrySet()) {
                if (!"url".equals(entry.getKey())) {
                    builder.appendQueryParameter(entry.getKey(), entry.getValue());
                }
            }
            return builder.build().toString();
        }
    }
}
