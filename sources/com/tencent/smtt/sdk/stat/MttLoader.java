package com.tencent.smtt.sdk.stat;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.mapsdk.internal.y;
import com.tencent.smtt.sdk.TbsConfig;
import com.tencent.smtt.utils.FileProvider;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
/* loaded from: classes6.dex */
public class MttLoader {
    public static final String CHANNEL_ID = "ChannelID";
    public static final String ENTRY_ID = "entryId";
    @Deprecated
    public static final String KEY_ACTIVITY_NAME = "KEY_ACT";
    @Deprecated
    public static final String KEY_APP_NAME = "KEY_APPNAME";
    public static final String KEY_EUSESTAT = "KEY_EUSESTAT";
    @Deprecated
    public static final String KEY_PACKAGE = "KEY_PKG";
    public static final String KEY_PID = "KEY_PID";
    public static final String MTT_ACTION = "com.tencent.QQBrowser.action.VIEW";
    public static final String MTT_ACTION_SP = "com.tencent.QQBrowser.action.VIEWSP";
    public static final String PID_ARTICLE_NEWS = "21272";
    public static final String PID_MOBILE_QQ = "50079";
    public static final String PID_QQPIM = "50190";
    public static final String PID_QZONE = "10494";
    public static final String PID_WECHAT = "10318";
    public static final String POS_ID = "PosID";
    public static final String QQBROWSER_DIRECT_DOWNLOAD_URL = "https://mdc.html5.qq.com/d/directdown.jsp?channel_id=50079";
    public static final String QQBROWSER_DOWNLOAD_URL = "https://mdc.html5.qq.com/mh?channel_id=50079&u=";
    public static final String QQBROWSER_PARAMS_FROME = ",from=";
    public static final String QQBROWSER_PARAMS_PACKAGENAME = ",packagename=";
    public static final String QQBROWSER_PARAMS_PD = ",product=";
    public static final String QQBROWSER_PARAMS_VERSION = ",version=";
    public static final String QQBROWSER_SCHEME = "mttbrowser://url=";
    public static final int RESULT_INVALID_CONTEXT = 3;
    public static final int RESULT_INVALID_URL = 2;
    public static final int RESULT_NOT_INSTALL_QQBROWSER = 4;
    public static final int RESULT_OK = 0;
    public static final int RESULT_QQBROWSER_LOW = 5;
    public static final int RESULT_UNKNOWN = 1;
    public static final String STAT_KEY = "StatKey";

    /* loaded from: classes6.dex */
    public static class BrowserInfo {
        public int browserType = -1;
        public int ver = -1;
        public String quahead = "";
        public String vn = "0";
        public String packageName = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static class a {
        public String a;
        public String b;

        private a() {
            this.a = "";
            this.b = "";
        }
    }

    private static int a(Context context) {
        String str = context.getApplicationInfo().processName;
        if (str.equals("com.tencent.mobileqq")) {
            return 13;
        }
        if (str.equals("com.qzone")) {
            return 14;
        }
        if (str.equals("com.tencent.WBlog")) {
            return 15;
        }
        return str.equals("com.tencent.mm") ? 24 : 26;
    }

    private static Uri a(Context context, String str) {
        return FileProvider.a(context, str);
    }

    private static a a(Context context, Uri uri) {
        Intent intent = new Intent(MTT_ACTION);
        intent.setData(uri);
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        if (queryIntentActivities.size() <= 0) {
            return null;
        }
        a aVar = new a();
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            String str = resolveInfo.activityInfo.packageName;
            if (str.contains(TbsConfig.APP_QB)) {
                aVar.a = resolveInfo.activityInfo.name;
                aVar.b = resolveInfo.activityInfo.packageName;
                return aVar;
            } else if (str.contains("com.tencent.qbx")) {
                aVar.a = resolveInfo.activityInfo.name;
                aVar.b = resolveInfo.activityInfo.packageName;
            }
        }
        return aVar;
    }

    private static String a(Certificate certificate) throws CertificateEncodingException {
        byte[] encoded = certificate.getEncoded();
        int length = encoded.length;
        char[] cArr = new char[length * 2];
        for (int i = 0; i < length; i++) {
            byte b = encoded[i];
            int i2 = (b >> 4) & 15;
            int i3 = i * 2;
            cArr[i3] = (char) (i2 >= 10 ? (i2 + 97) - 10 : i2 + 48);
            int i4 = b & 15;
            cArr[i3 + 1] = (char) (i4 >= 10 ? (i4 + 97) - 10 : i4 + 48);
        }
        return new String(cArr);
    }

    private static boolean a(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        String trim = str.trim();
        int indexOf = trim.toLowerCase().indexOf("://");
        int indexOf2 = trim.toLowerCase().indexOf(46);
        if (indexOf <= 0 || indexOf2 <= 0 || indexOf <= indexOf2) {
            return trim.toLowerCase().contains("://");
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00da A[Catch: Exception -> 0x0107, TRY_ENTER, TRY_LEAVE, TryCatch #6 {Exception -> 0x0107, blocks: (B:5:0x0019, B:7:0x001f, B:8:0x0025, B:10:0x0031, B:12:0x0038, B:15:0x0067, B:16:0x006d, B:41:0x00da, B:19:0x0079, B:21:0x0080, B:24:0x008d, B:25:0x0093), top: B:62:0x0019 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.tencent.smtt.sdk.stat.MttLoader.BrowserInfo getBrowserInfo(android.content.Context r9) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.stat.MttLoader.getBrowserInfo(android.content.Context):com.tencent.smtt.sdk.stat.MttLoader$BrowserInfo");
    }

    public static String getDownloadUrlWithQb(String str) {
        try {
            return QQBROWSER_DOWNLOAD_URL + URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return QQBROWSER_DOWNLOAD_URL;
        }
    }

    public static String getValidQBUrl(Context context, String str) {
        if (str.toLowerCase().startsWith("qb://")) {
            BrowserInfo browserInfo = getBrowserInfo(context);
            boolean z = true;
            if (browserInfo.browserType != -1 && (browserInfo.browserType != 2 || browserInfo.ver >= 33)) {
                z = false;
            }
            if (z) {
                return getDownloadUrlWithQb(str);
            }
        }
        return str;
    }

    public static boolean isBrowserInstalled(Context context) {
        return getBrowserInfo(context).browserType != -1;
    }

    public static boolean isBrowserInstalledEx(Context context) {
        BrowserInfo browserInfo = getBrowserInfo(context);
        boolean z = false;
        try {
            if (Long.valueOf(browserInfo.vn).longValue() >= 6001500) {
                z = true;
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        if (browserInfo.ver >= 601500) {
            return true;
        }
        return z;
    }

    public static boolean isGreatBrowserVer(Context context, long j, long j2) {
        BrowserInfo browserInfo = getBrowserInfo(context);
        boolean z = false;
        try {
            if (Long.valueOf(browserInfo.vn).longValue() >= j) {
                z = true;
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        if (browserInfo.ver >= j2) {
            return true;
        }
        return z;
    }

    public static boolean isSupportQBScheme(Context context) {
        BrowserInfo browserInfo = getBrowserInfo(context);
        if (browserInfo.browserType == -1) {
            return false;
        }
        return browserInfo.browserType != 2 || browserInfo.ver >= 42;
    }

    public static boolean isSupportingTbsTips(Context context) {
        BrowserInfo browserInfo = getBrowserInfo(context);
        return browserInfo.browserType == 2 && browserInfo.ver >= 580000;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x007f, code lost:
        if (android.text.TextUtils.isEmpty(r0.a) == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0081, code lost:
        r2.setClassName(r0.b, r0.a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00c9, code lost:
        if (android.text.TextUtils.isEmpty(r0.a) == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00df, code lost:
        if (android.text.TextUtils.isEmpty(r0.a) == false) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int loadUrl(android.content.Context r6, java.lang.String r7, java.util.HashMap<java.lang.String, java.lang.String> r8, com.tencent.smtt.sdk.WebView r9) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.stat.MttLoader.loadUrl(android.content.Context, java.lang.String, java.util.HashMap, com.tencent.smtt.sdk.WebView):int");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|2|3|(3:7|8|(8:10|11|12|(1:14)|15|(1:17)(1:21)|18|19))|25|11|12|(0)|15|(0)(0)|18|19) */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int loadUrl(android.content.Context r4, java.lang.String r5, java.util.HashMap<java.lang.String, java.lang.String> r6, java.lang.String r7, com.tencent.smtt.sdk.WebView r8) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            android.content.pm.PackageManager r2 = r4.getPackageManager()     // Catch: java.lang.Throwable -> L1d
            if (r2 == 0) goto L1d
            java.lang.String r3 = "com.tencent.mtt"
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r3, r1)     // Catch: java.lang.Throwable -> L1d
            if (r2 == 0) goto L1d
            int r2 = r2.versionCode     // Catch: java.lang.Throwable -> L1d
            r3 = 601000(0x92ba8, float:8.4218E-40)
            if (r2 <= r3) goto L1d
            r2 = 1
            goto L1e
        L1d:
            r2 = 0
        L1e:
            java.lang.String r3 = "UTF-8"
            java.lang.String r3 = java.net.URLEncoder.encode(r5, r3)     // Catch: java.lang.Exception -> L28
            if (r2 == 0) goto L27
            r5 = r3
        L27:
            r1 = r2
        L28:
            if (r1 == 0) goto L2d
            java.lang.String r1 = ",encoded=1"
            goto L2f
        L2d:
            java.lang.String r1 = ""
        L2f:
            java.lang.String r2 = "mttbrowser://url="
            r0.append(r2)
            r0.append(r5)
            java.lang.String r5 = ",product=TBS"
            r0.append(r5)
            java.lang.String r5 = ",packagename="
            r0.append(r5)
            java.lang.String r5 = r4.getPackageName()
            r0.append(r5)
            java.lang.String r5 = ",from="
            r0.append(r5)
            r0.append(r7)
            java.lang.String r5 = ",version=4.3.0.265"
            r0.append(r5)
            r0.append(r1)
            java.lang.String r5 = r0.toString()
            int r4 = loadUrl(r4, r5, r6, r8)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.stat.MttLoader.loadUrl(android.content.Context, java.lang.String, java.util.HashMap, java.lang.String, com.tencent.smtt.sdk.WebView):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007d A[Catch: Exception -> 0x00a6, TryCatch #0 {Exception -> 0x00a6, blocks: (B:3:0x0001, B:5:0x000a, B:7:0x0010, B:8:0x0014, B:10:0x001a, B:12:0x002c, B:13:0x0030, B:15:0x0046, B:19:0x0050, B:22:0x0059, B:24:0x0060, B:26:0x006a, B:28:0x006e, B:29:0x0071, B:32:0x007d, B:34:0x009d, B:35:0x00a2), top: B:40:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean openDocWithQb(android.content.Context r6, java.lang.String r7, int r8, java.lang.String r9, java.lang.String r10, java.util.HashMap<java.lang.String, java.lang.String> r11, android.os.Bundle r12) {
        /*
            r0 = 0
            android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Exception -> La6
            java.lang.String r2 = "com.tencent.QQBrowser.action.sdk.document"
            r1.<init>(r2)     // Catch: java.lang.Exception -> La6
            if (r11 == 0) goto L30
            java.util.Set r2 = r11.keySet()     // Catch: java.lang.Exception -> La6
            if (r2 == 0) goto L30
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Exception -> La6
        L14:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Exception -> La6
            if (r3 == 0) goto L30
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Exception -> La6
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> La6
            java.lang.Object r4 = r11.get(r3)     // Catch: java.lang.Exception -> La6
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Exception -> La6
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Exception -> La6
            if (r5 != 0) goto L14
            r1.putExtra(r3, r4)     // Catch: java.lang.Exception -> La6
            goto L14
        L30:
            java.io.File r11 = new java.io.File     // Catch: java.lang.Exception -> La6
            r11.<init>(r7)     // Catch: java.lang.Exception -> La6
            java.lang.String r11 = "key_reader_sdk_id"
            r2 = 3
            r1.putExtra(r11, r2)     // Catch: java.lang.Exception -> La6
            java.lang.String r11 = "key_reader_sdk_type"
            r1.putExtra(r11, r8)     // Catch: java.lang.Exception -> La6
            boolean r11 = android.text.TextUtils.isEmpty(r10)     // Catch: java.lang.Exception -> La6
            if (r11 != 0) goto L4b
            java.lang.String r11 = "big_brother_source_key"
            r1.putExtra(r11, r10)     // Catch: java.lang.Exception -> La6
        L4b:
            r10 = 1
            if (r8 != 0) goto L54
            java.lang.String r8 = "key_reader_sdk_path"
        L50:
            r1.putExtra(r8, r7)     // Catch: java.lang.Exception -> La6
            goto L59
        L54:
            if (r8 != r10) goto L59
            java.lang.String r8 = "key_reader_sdk_url"
            goto L50
        L59:
            java.lang.String r8 = "key_reader_sdk_format"
            r1.putExtra(r8, r9)     // Catch: java.lang.Exception -> La6
            if (r6 == 0) goto L71
            android.content.pm.ApplicationInfo r8 = r6.getApplicationInfo()     // Catch: java.lang.Exception -> La6
            int r8 = r8.targetSdkVersion     // Catch: java.lang.Exception -> La6
            r11 = 24
            if (r8 < r11) goto L71
            int r8 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> La6
            if (r8 < r11) goto L71
            r1.addFlags(r10)     // Catch: java.lang.Exception -> La6
        L71:
            r8 = 268435456(0x10000000, float:2.5243549E-29)
            r1.addFlags(r8)     // Catch: java.lang.Exception -> La6
            android.net.Uri r7 = a(r6, r7)     // Catch: java.lang.Exception -> La6
            if (r7 != 0) goto L7d
            return r0
        L7d:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> La6
            java.lang.String r11 = "mtt/"
            r8.<init>(r11)     // Catch: java.lang.Exception -> La6
            r8.append(r9)     // Catch: java.lang.Exception -> La6
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Exception -> La6
            r1.setDataAndType(r7, r8)     // Catch: java.lang.Exception -> La6
            java.lang.String r7 = "loginType"
            android.content.Context r8 = r6.getApplicationContext()     // Catch: java.lang.Exception -> La6
            int r8 = a(r8)     // Catch: java.lang.Exception -> La6
            r1.putExtra(r7, r8)     // Catch: java.lang.Exception -> La6
            if (r12 == 0) goto La2
            java.lang.String r7 = "key_reader_sdk_extrals"
            r1.putExtra(r7, r12)     // Catch: java.lang.Exception -> La6
        La2:
            r6.startActivity(r1)     // Catch: java.lang.Exception -> La6
            return r10
        La6:
            r6 = move-exception
            r6.printStackTrace()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.stat.MttLoader.openDocWithQb(android.content.Context, java.lang.String, int, java.lang.String, java.lang.String, java.util.HashMap, android.os.Bundle):boolean");
    }

    public static boolean openDocWithQb(Context context, String str, int i, String str2, HashMap<String, String> hashMap) {
        return openDocWithQb(context, str, i, str2, hashMap, null);
    }

    public static boolean openDocWithQb(Context context, String str, int i, String str2, HashMap<String, String> hashMap, Bundle bundle) {
        return openDocWithQb(context, str, i, str2, "", hashMap, null);
    }

    public static boolean openVideoWithQb(Context context, String str, HashMap<String, String> hashMap) {
        boolean z;
        Set<String> keySet;
        Uri parse = Uri.parse(str);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setFlags(y.a);
        intent.setDataAndType(parse, "video/*");
        if (hashMap != null && (keySet = hashMap.keySet()) != null) {
            for (String str2 : keySet) {
                String str3 = hashMap.get(str2);
                if (!TextUtils.isEmpty(str3)) {
                    intent.putExtra(str2, str3);
                }
            }
        }
        try {
            intent.putExtra("loginType", a(context));
            intent.setComponent(new ComponentName(TbsConfig.APP_QB, "com.tencent.mtt.browser.video.H5VideoThrdcallActivity"));
            context.startActivity(intent);
            z = true;
        } catch (Throwable unused) {
            z = false;
        }
        if (!z) {
            try {
                intent.setComponent(null);
                context.startActivity(intent);
            } catch (Throwable th) {
                th.printStackTrace();
                return false;
            }
        }
        return true;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public static boolean verifySignature(java.io.File r7) {
        /*
            r0 = 0
            r1 = 0
            java.util.jar.JarFile r2 = new java.util.jar.JarFile     // Catch: java.lang.Throwable -> L6d
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r7 = "AndroidManifest.xml"
            java.util.jar.JarEntry r7 = r2.getJarEntry(r7)     // Catch: java.lang.Throwable -> L6e
            if (r7 != 0) goto L13
            r2.close()     // Catch: java.io.IOException -> L12
        L12:
            return r1
        L13:
            r3 = 8192(0x2000, float:1.14794E-41)
            byte[] r4 = new byte[r3]     // Catch: java.lang.Throwable -> L6e
            java.io.InputStream r5 = r2.getInputStream(r7)     // Catch: java.lang.Throwable -> L6e
        L1b:
            int r0 = r5.read(r4, r1, r3)     // Catch: java.lang.Throwable -> L5a
            r6 = -1
            if (r0 != r6) goto L1b
            r5.close()     // Catch: java.lang.Throwable -> L5a
            java.security.cert.Certificate[] r7 = r7.getCertificates()     // Catch: java.lang.Throwable -> L5a
            int r0 = r7.length     // Catch: java.lang.Throwable -> L5a
            if (r0 > 0) goto L35
            if (r5 == 0) goto L31
            r5.close()     // Catch: java.io.IOException -> L31
        L31:
            r2.close()     // Catch: java.io.IOException -> L34
        L34:
            return r1
        L35:
            r7 = r7[r1]     // Catch: java.lang.Throwable -> L5a
            java.lang.String r7 = a(r7)     // Catch: java.lang.Throwable -> L5a
            if (r7 == 0) goto L4f
            java.lang.String r0 = "3082023f308201a8a00302010202044c46914a300d06092a864886f70d01010505003064310b30090603550406130238363110300e060355040813074265696a696e673110300e060355040713074265696a696e673110300e060355040a130754656e63656e74310c300a060355040b13035753443111300f0603550403130873616d75656c6d6f301e170d3130303732313036313835305a170d3430303731333036313835305a3064310b30090603550406130238363110300e060355040813074265696a696e673110300e060355040713074265696a696e673110300e060355040a130754656e63656e74310c300a060355040b13035753443111300f0603550403130873616d75656c6d6f30819f300d06092a864886f70d010101050003818d0030818902818100c209077044bd0d63ea00ede5b839914cabcc912a87f0f8b390877e0f7a2583f0d5933443c40431c35a4433bc4c965800141961adc44c9625b1d321385221fd097e5bdc2f44a1840d643ab59dc070cf6c4b4b4d98bed5cbb8046e0a7078ae134da107cdf2bfc9b440fe5cb2f7549b44b73202cc6f7c2c55b8cfb0d333a021f01f0203010001300d06092a864886f70d010105050003818100b007db9922774ef4ccfee81ba514a8d57c410257e7a2eba64bfa17c9e690da08106d32f637ac41fbc9f205176c71bde238c872c3ee2f8313502bee44c80288ea4ef377a6f2cdfe4d3653c145c4acfedbfbadea23b559d41980cc3cdd35d79a68240693739aabf5c5ed26148756cf88264226de394c8a24ac35b712b120d4d23a"
            boolean r7 = r7.equals(r0)     // Catch: java.lang.Throwable -> L5a
            if (r7 == 0) goto L4f
            if (r5 == 0) goto L4a
            r5.close()     // Catch: java.io.IOException -> L4a
        L4a:
            r2.close()     // Catch: java.io.IOException -> L4d
        L4d:
            r7 = 1
            return r7
        L4f:
            if (r5 == 0) goto L54
            r5.close()     // Catch: java.io.IOException -> L54
        L54:
            r2.close()     // Catch: java.io.IOException -> L76
            goto L76
        L58:
            r7 = move-exception
            goto L62
        L5a:
            r0 = r5
            goto L6e
        L5c:
            r7 = move-exception
            r5 = r0
            goto L62
        L5f:
            r7 = move-exception
            r2 = r0
            r5 = r2
        L62:
            if (r5 == 0) goto L67
            r5.close()     // Catch: java.io.IOException -> L67
        L67:
            if (r2 == 0) goto L6c
            r2.close()     // Catch: java.io.IOException -> L6c
        L6c:
            throw r7
        L6d:
            r2 = r0
        L6e:
            if (r0 == 0) goto L73
            r0.close()     // Catch: java.io.IOException -> L73
        L73:
            if (r2 == 0) goto L76
            goto L54
        L76:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.stat.MttLoader.verifySignature(java.io.File):boolean");
    }
}
