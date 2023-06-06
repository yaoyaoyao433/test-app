package com.tencent.smtt.sdk;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.meituan.metrics.traffic.hurl.HttpURLWrapper;
import com.meituan.mtmap.rendersdk.MapConstant;
import com.meituan.passport.UserCenter;
import com.meituan.robust.common.CommonConstant;
import com.tencent.smtt.sdk.TbsDownloadConfig;
import com.tencent.smtt.sdk.TbsLogReport;
import com.tencent.smtt.utils.Apn;
import com.tencent.smtt.utils.FileUtil;
import com.tencent.smtt.utils.TbsLog;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
/* loaded from: classes6.dex */
public class m {
    private static int e = 5;
    private static int f = 1;
    private static final String[] g = {"tbs_downloading_com.tencent.mtt", "tbs_downloading_com.tencent.mm", "tbs_downloading_com.tencent.mobileqq", "tbs_downloading_com.tencent.tbs", "tbs_downloading_com.qzone"};
    private boolean A;
    private Handler B;
    private boolean E;
    String a;
    private Context h;
    private String i;
    private String j;
    private String k;
    private File l;
    private File m;
    private long n;
    private boolean q;
    private int r;
    private int s;
    private boolean t;
    private boolean u;
    private HttpURLConnection v;
    private String w;
    private TbsLogReport.TbsLogInfo x;
    private String y;
    private int z;
    private boolean d = false;
    private int o = 30000;
    private int p = UserCenter.TYPE_LOGOUT_NEGATIVE;
    private int D = e;
    String[] b = null;
    int c = 0;
    private Set<String> C = new HashSet();

    public m(Context context) throws NullPointerException {
        this.h = context.getApplicationContext();
        this.x = TbsLogReport.getInstance(this.h).tbsLogInfo();
        this.w = "tbs_downloading_" + this.h.getPackageName();
        p.a();
        this.l = p.t(this.h);
        if (this.l == null) {
            throw new NullPointerException("TbsCorePrivateDir is null!");
        }
        try {
            Context packageContext = TbsShareManager.getPackageContext(context, "com.tencent.mm", false);
            if (packageContext == null) {
                this.m = new File(FileUtil.a(context, "com.tencent.mm", 4, true));
            } else {
                this.m = new File(FileUtil.a(packageContext, 4));
            }
        } catch (Throwable unused) {
        }
        g();
        this.y = null;
        this.z = -1;
    }

    private long a(long j, long j2) {
        long currentTimeMillis = System.currentTimeMillis();
        this.x.setDownConsumeTime(currentTimeMillis - j);
        this.x.setDownloadSize(j2);
        return currentTimeMillis;
    }

    private static File a(Context context, int i) {
        File file = new File(FileUtil.a(context, i));
        if (file.exists() && file.isDirectory()) {
            if (new File(file, TbsDownloader.getOverSea(context) ? "x5.oversea.tbs.org" : TbsDownloader.getBackupFileName(false)).exists()) {
                return file;
            }
        }
        return null;
    }

    private String a(Throwable th) {
        String stackTraceString = Log.getStackTraceString(th);
        return stackTraceString.length() > 1024 ? stackTraceString.substring(0, 1024) : stackTraceString;
    }

    private String a(URL url) {
        try {
            return InetAddress.getByName(url.getHost()).getHostAddress();
        } catch (Error e2) {
            e2.printStackTrace();
            return "";
        } catch (Exception e3) {
            e3.printStackTrace();
            return "";
        }
    }

    private void a(int i, String str, boolean z) {
        if (z || this.r > this.D) {
            this.x.setErrorCode(i);
            this.x.setFailDetail(str);
        }
    }

    private void a(long j) {
        this.r++;
        if (j <= 0) {
            try {
                j = n();
            } catch (Exception unused) {
                return;
            }
        }
        Thread.sleep(j);
    }

    public static void a(Context context) {
        try {
            TbsLog.i(TbsDownloader.LOGTAG, "clearDecoupleDirOld #00");
            File a = p.a().a(context, context.getDir("tbs_64", 0));
            FileUtil.b(a);
            if (a != null) {
                TbsLog.i(TbsDownloader.LOGTAG, "clearDecoupleDirOld dir is " + a.getAbsolutePath());
            }
            File a2 = p.a().a(context, context.getDir("tbs", 0));
            FileUtil.b(a2);
            if (a2 != null) {
                TbsLog.i(TbsDownloader.LOGTAG, "clearDecoupleDirOld dir is " + a2.getAbsolutePath());
            }
        } catch (Throwable th) {
            TbsLog.i(TbsDownloader.LOGTAG, "clearDecoupleDirOld stack is " + Log.getStackTraceString(th));
        }
    }

    private void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void a(File file, Context context) {
        boolean contains;
        synchronized (com.tencent.smtt.utils.a.class) {
            if (file != null) {
                try {
                    if (file.exists()) {
                        if (TbsShareManager.isThirdPartyApp(context)) {
                            return;
                        }
                        try {
                            File c = c(context);
                            if (c != null) {
                                File file2 = new File(c, TbsDownloader.getOverSea(context) ? "x5.oversea.tbs.org" : TbsDownloader.getBackupFileName(false));
                                file2.delete();
                                FileUtil.b(file, file2);
                                TbsLog.i(TbsDownloader.LOGTAG, "[TbsApkDownloader.backupTbsApk]tbsApk is " + file.getAbsolutePath());
                                TbsLog.i(TbsDownloader.LOGTAG, "[TbsApkDownloader.backupTbsApk]backUpApk is " + file2.getAbsolutePath());
                                boolean contains2 = file2.getName().contains("tbs.org");
                                if (file2.getName().contains("x5.tbs.decouple") || contains2) {
                                    File[] listFiles = c.listFiles();
                                    Pattern compile = Pattern.compile(com.tencent.smtt.utils.a.a(contains) + "(.*)");
                                    for (File file3 : listFiles) {
                                        if (compile.matcher(file3.getName()).find() && file3.isFile() && file3.exists()) {
                                            file3.delete();
                                        }
                                    }
                                    File file4 = new File(c, com.tencent.smtt.utils.a.a(contains) + CommonConstant.Symbol.DOT + TbsDownloadConfig.getInstance(context).mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_TBS_DOWNLOAD_V, 0));
                                    if (file4.exists()) {
                                        TbsLog.e(TbsDownloader.LOGTAG, "[TbsApkDownloader.backupTbsApk]delete bacup config file error ");
                                        return;
                                    }
                                    file4.createNewFile();
                                }
                            }
                        } catch (Exception unused) {
                        }
                    }
                } finally {
                }
            }
        }
    }

    private void a(String str) throws Exception {
        URL url = new URL(str);
        if (this.v != null) {
            try {
                this.v.disconnect();
            } catch (Throwable th) {
                TbsLog.e(TbsDownloader.LOGTAG, "[initHttpRequest] mHttpRequest.disconnect() Throwable:" + th.toString());
            }
        }
        this.v = (HttpURLConnection) HttpURLWrapper.wrapURLConnection(url.openConnection());
        this.v.setRequestProperty("User-Agent", TbsDownloader.b(this.h));
        this.v.setRequestProperty("Accept-Encoding", "identity");
        this.v.setRequestMethod("GET");
        this.v.setInstanceFollowRedirects(false);
        this.v.setConnectTimeout(this.p);
        this.v.setReadTimeout(this.o);
    }

    private boolean a(File file) {
        int i = TbsDownloadConfig.getInstance(this.h).mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_USE_BACKUP_VERSION, 0);
        if (i == 0) {
            i = TbsDownloadConfig.getInstance(this.h).mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_TBS_DOWNLOAD_V, 0);
        }
        return com.tencent.smtt.utils.a.a(this.h, file, 0L, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x009e, code lost:
        if (r7 != r5) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean a(boolean r10, boolean r11, java.io.File r12) {
        /*
            Method dump skipped, instructions count: 519
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.m.a(boolean, boolean, java.io.File):boolean");
    }

    public static void b(Context context) {
        File file;
        try {
            if (TbsShareManager.isThirdPartyApp(context) || com.tencent.smtt.utils.r.g(context)) {
                TbsLog.i(TbsDownloader.LOGTAG, "clearOldBackup #00");
                String str = Environment.getExternalStorageDirectory() + File.separator;
                if (!str.equals("")) {
                    str = str + UserCenter.OAUTH_TYPE_QQ + File.separator + "tbs" + File.separator + "backup" + File.separator + context.getApplicationInfo().packageName;
                }
                FileUtil.b(new File(str));
                TbsLog.i(TbsDownloader.LOGTAG, "clearOldBackup dir is " + file.getAbsolutePath());
            }
        } catch (Throwable th) {
            TbsLog.i(TbsDownloader.LOGTAG, "clearOldBackup stack is " + Log.getStackTraceString(th));
        }
    }

    private boolean b(int i) {
        try {
            File file = new File(this.l, "x5.tbs");
            File c = c(this.h);
            if (c != null) {
                File file2 = new File(c, TbsDownloader.getOverSea(this.h) ? "x5.oversea.tbs.org" : TbsDownloader.getBackupFileName(false));
                file.delete();
                FileUtil.b(file2, file);
                if (com.tencent.smtt.utils.a.a(this.h, file, 0L, i)) {
                    return true;
                }
                TbsLog.i(TbsDownloader.LOGTAG, "[TbsApkDownloader.copyTbsApkFromBackupToInstall] verifyTbsApk error!!");
                return false;
            }
            return false;
        } catch (Exception e2) {
            e2.printStackTrace();
            TbsLog.e(TbsDownloader.LOGTAG, "[TbsApkDownloader.copyTbsApkFromBackupToInstall] Exception is " + e2.getMessage());
            return false;
        }
    }

    @TargetApi(8)
    static File c(Context context) {
        try {
            File file = Build.VERSION.SDK_INT >= 8 ? new File(FileUtil.a(context, 4)) : null;
            if (file != null && !file.exists() && !file.isDirectory()) {
                file.mkdirs();
            }
            return file;
        } catch (Exception e2) {
            e2.printStackTrace();
            TbsLog.e(TbsDownloader.LOGTAG, "[TbsApkDownloader.backupApkPath] Exception is " + e2.getMessage());
            return null;
        }
    }

    private boolean c(boolean z, boolean z2) {
        return a(z, z2, (File) null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @TargetApi(8)
    public static File d(Context context) {
        try {
            if (Build.VERSION.SDK_INT >= 8) {
                File a = a(context, 4);
                if (a == null) {
                    a = a(context, 3);
                }
                if (a == null) {
                    a = a(context, 2);
                }
                return a == null ? a(context, 1) : a;
            }
            return null;
        } catch (Exception e2) {
            e2.printStackTrace();
            TbsLog.e(TbsDownloader.LOGTAG, "[TbsApkDownloader.backupApkPath] Exception is " + e2.getMessage());
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x01b9, code lost:
        if (com.tencent.smtt.utils.b.c() != false) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void d(boolean r14) {
        /*
            Method dump skipped, instructions count: 1022
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.m.d(boolean):void");
    }

    public static void e(Context context) {
        try {
            p.a();
            File t = p.t(context);
            new File(t, "x5.tbs").delete();
            new File(t, "x5.tbs.temp").delete();
            File c = c(context);
            if (c != null) {
                new File(c, TbsDownloader.getBackupFileName(false)).delete();
                new File(c, "x5.oversea.tbs.org").delete();
                File[] listFiles = c.listFiles();
                Pattern compile = Pattern.compile(com.tencent.smtt.utils.a.a(true) + "(.*)");
                for (File file : listFiles) {
                    if (compile.matcher(file.getName()).find() && file.isFile() && file.exists()) {
                        file.delete();
                    }
                }
                Pattern compile2 = Pattern.compile(com.tencent.smtt.utils.a.a(false) + "(.*)");
                for (File file2 : listFiles) {
                    if (compile2.matcher(file2.getName()).find() && file2.isFile() && file2.exists()) {
                        file2.delete();
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    private boolean e(boolean z) {
        TbsLog.i(TbsDownloader.LOGTAG, "[TbsApkDownloader.deleteFile] isApk=" + z);
        File file = z ? new File(this.l, "x5.tbs") : new File(this.l, "x5.tbs.temp");
        if (file.exists()) {
            FileUtil.b(file);
            return true;
        }
        return true;
    }

    private void g() {
        this.r = 0;
        this.s = 0;
        this.n = -1L;
        this.k = null;
        this.q = false;
        this.t = false;
        this.u = false;
        this.A = false;
    }

    private void h() {
        TbsLogReport tbsLogReport;
        TbsLogReport.EventType eventType;
        TbsLog.i(TbsDownloader.LOGTAG, "[TbsApkDownloader.closeHttpRequest]");
        if (this.v != null) {
            if (!this.t) {
                this.x.setResolveIp(a(this.v.getURL()));
            }
            try {
                this.v.disconnect();
            } catch (Throwable th) {
                TbsLog.e(TbsDownloader.LOGTAG, "[closeHttpRequest] mHttpRequest.disconnect() Throwable:" + th.toString());
            }
            this.v = null;
            TbsLog.i(TbsDownloader.LOGTAG, "[TbsApkDownloader.closeHttpRequest] mHttpRequest set null");
        }
        int i = this.x.a;
        if (this.t || !this.A) {
            if (this.d) {
                return;
            }
            TbsDownloader.a = false;
            return;
        }
        this.x.setEventTime(System.currentTimeMillis());
        String apnInfo = Apn.getApnInfo(this.h);
        if (apnInfo == null) {
            apnInfo = "";
        }
        int apnType = Apn.getApnType(this.h);
        this.x.setApn(apnInfo);
        this.x.setNetworkType(apnType);
        if (apnType != this.z || !apnInfo.equals(this.y)) {
            this.x.setNetworkChange(0);
        }
        if ((this.x.a == 0 || this.x.a == 107) && this.x.getDownFinalFlag() == 0 && (!Apn.isNetworkAvailable(this.h) || !m())) {
            a(101, (String) null, true);
        }
        if (TbsDownloader.a(this.h)) {
            tbsLogReport = TbsLogReport.getInstance(this.h);
            eventType = TbsLogReport.EventType.TYPE_DOWNLOAD_DECOUPLE;
        } else {
            tbsLogReport = TbsLogReport.getInstance(this.h);
            eventType = TbsLogReport.EventType.TYPE_DOWNLOAD;
        }
        tbsLogReport.eventReport(eventType, this.x);
        this.x.resetArgs();
        if (i != 100) {
            QbSdk.n.onDownloadFinish(i);
        }
    }

    private File i() {
        return TbsDownloader.a(this.h) ? new File(FileUtil.a(this.h, 4), TbsDownloader.getBackupFileName(true)) : new File(FileUtil.a(this.h, 4), TbsDownloader.getOverSea(this.h) ? "x5.oversea.tbs.org" : TbsDownloader.getBackupFileName(false));
    }

    private void j() {
        try {
            File i = i();
            if (i == null || !i.exists()) {
                return;
            }
            FileUtil.b(i);
            File[] listFiles = i.getParentFile().listFiles();
            Pattern compile = Pattern.compile(com.tencent.smtt.utils.a.a(TbsDownloader.a(this.h)) + "(.*)");
            for (File file : listFiles) {
                if (compile.matcher(file.getName()).find() && file.isFile() && file.exists()) {
                    FileUtil.b(file);
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private boolean k() {
        return new File(this.l, "x5.tbs.temp").exists();
    }

    private long l() {
        File file = new File(this.l, "x5.tbs.temp");
        if (file.exists()) {
            return file.length();
        }
        return 0L;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    private boolean m() {
        /*
            r9 = this;
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            java.lang.String r1 = "www.qq.com"
            r2 = 0
            r3 = 0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L68
            java.lang.String r5 = "ping "
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L68
            r4.append(r1)     // Catch: java.lang.Throwable -> L68
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L68
            java.lang.Process r0 = r0.exec(r1)     // Catch: java.lang.Throwable -> L68
            java.io.InputStream r0 = r0.getInputStream()     // Catch: java.lang.Throwable -> L68
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L5e
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L5e
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L55
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L55
            r3 = 0
        L29:
            java.lang.String r5 = r4.readLine()     // Catch: java.lang.Throwable -> L4d
            r6 = 1
            if (r5 == 0) goto L47
            java.lang.String r7 = "TTL"
            boolean r7 = r5.contains(r7)     // Catch: java.lang.Throwable -> L4d
            if (r7 != 0) goto L46
            java.lang.String r7 = "ttl"
            boolean r5 = r5.contains(r7)     // Catch: java.lang.Throwable -> L4d
            if (r5 == 0) goto L41
            goto L46
        L41:
            int r3 = r3 + r6
            r5 = 5
            if (r3 < r5) goto L29
            goto L47
        L46:
            r2 = 1
        L47:
            r9.a(r0)
            goto L71
        L4b:
            r2 = move-exception
            goto L7a
        L4d:
            r3 = move-exception
            r8 = r3
            r3 = r0
            r0 = r8
            goto L6b
        L52:
            r2 = move-exception
            r4 = r3
            goto L7a
        L55:
            r4 = move-exception
            r8 = r3
            r3 = r0
            r0 = r4
            r4 = r8
            goto L6b
        L5b:
            r2 = move-exception
            r4 = r3
            goto L7b
        L5e:
            r1 = move-exception
            r4 = r3
            r3 = r0
            r0 = r1
            r1 = r4
            goto L6b
        L64:
            r2 = move-exception
            r0 = r3
            r4 = r0
            goto L7b
        L68:
            r0 = move-exception
            r1 = r3
            r4 = r1
        L6b:
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L78
            r9.a(r3)
        L71:
            r9.a(r1)
            r9.a(r4)
            return r2
        L78:
            r2 = move-exception
            r0 = r3
        L7a:
            r3 = r1
        L7b:
            r9.a(r0)
            r9.a(r3)
            r9.a(r4)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.m.m():boolean");
    }

    private long n() {
        switch (this.r) {
            case 1:
            case 2:
                return 20000 * this.r;
            case 3:
            case 4:
                return 100000L;
            default:
                return 200000L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean o() {
        String str;
        HttpURLConnection httpURLConnection;
        boolean z = Apn.getApnType(this.h) == 3;
        TbsLog.i(TbsDownloader.LOGTAG, "[TbsApkDwonloader.detectWifiNetworkAvailable] isWifi=" + z);
        HttpURLConnection httpURLConnection2 = null;
        if (z) {
            str = Apn.getWifiSSID(this.h);
            TbsLog.i(TbsDownloader.LOGTAG, "[TbsApkDwonloader.detectWifiNetworkAvailable] localBSSID=" + str);
            try {
                try {
                    httpURLConnection = (HttpURLConnection) HttpURLWrapper.wrapURLConnection(new URL("https://pms.mb.qq.com/rsp204").openConnection());
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setConnectTimeout(10000);
                    httpURLConnection.setReadTimeout(10000);
                    httpURLConnection.setUseCaches(false);
                    httpURLConnection.getInputStream();
                    int responseCode = httpURLConnection.getResponseCode();
                    TbsLog.i(TbsDownloader.LOGTAG, "[TbsApkDwonloader.detectWifiNetworkAvailable] responseCode=" + responseCode);
                    r2 = responseCode == 204;
                } catch (Throwable th2) {
                    th = th2;
                    httpURLConnection2 = httpURLConnection;
                    try {
                        th.printStackTrace();
                        if (httpURLConnection2 != null) {
                            httpURLConnection2.disconnect();
                        }
                        if (!r2) {
                            this.C.add(str);
                            p();
                            this.B.sendMessageDelayed(this.B.obtainMessage(MapConstant.ANIMATION_DURATION_SHORT, str), 120000L);
                        }
                        if (r2) {
                            this.C.remove(str);
                        }
                        return r2;
                    } catch (Throwable th3) {
                        HttpURLConnection httpURLConnection3 = httpURLConnection2;
                        if (httpURLConnection3 != null) {
                            try {
                                httpURLConnection3.disconnect();
                            } catch (Exception unused) {
                            }
                        }
                        throw th3;
                    }
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
            } catch (Exception unused2) {
            }
        } else {
            str = null;
        }
        if (!r2 && !TextUtils.isEmpty(str) && !this.C.contains(str)) {
            this.C.add(str);
            p();
            this.B.sendMessageDelayed(this.B.obtainMessage(MapConstant.ANIMATION_DURATION_SHORT, str), 120000L);
        }
        if (r2 && this.C.contains(str)) {
            this.C.remove(str);
        }
        return r2;
    }

    private void p() {
        if (this.B == null) {
            this.B = new Handler(o.a().getLooper()) { // from class: com.tencent.smtt.sdk.m.1
                @Override // android.os.Handler
                public void handleMessage(Message message) {
                    if (message.what == 150) {
                        m.this.o();
                    }
                }
            };
        }
    }

    public Bundle a(int i, File file, boolean z) {
        File file2;
        if (z) {
            file2 = new File(file, TbsDownloader.getBackupFileName(true));
        } else {
            file2 = new File(file, TbsDownloader.getOverSea(this.h) ? "x5.oversea.tbs.org" : TbsDownloader.getBackupFileName(false));
        }
        int a = com.tencent.smtt.utils.a.a(this.h, file2);
        File file3 = new File(this.l, "x5.tbs");
        String absolutePath = file3.exists() ? file3.getAbsolutePath() : null;
        int i2 = TbsDownloadConfig.getInstance(this.h).mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_TBS_DOWNLOAD_V, 0);
        Bundle bundle = new Bundle();
        bundle.putInt("operation", i);
        bundle.putInt("old_core_ver", a);
        bundle.putInt("new_core_ver", i2);
        bundle.putString("old_apk_location", file2.getAbsolutePath());
        bundle.putString("new_apk_location", absolutePath);
        bundle.putString("diff_file_location", absolutePath);
        return bundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0189  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.os.Bundle a(int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.m.a(int, boolean):android.os.Bundle");
    }

    public void a(int i) {
        if (p.a().u(this.h)) {
            p.a().b();
            try {
                File file = new File(this.l, "x5.tbs");
                int a = com.tencent.smtt.utils.a.a(this.h, file);
                if (-1 == a || (i > 0 && i == a)) {
                    FileUtil.b(file);
                }
            } catch (Exception unused) {
            }
        }
    }

    public void a(boolean z) {
        b(z, false);
    }

    public boolean a() {
        String str;
        String str2;
        TbsLog.i("TbsApkDownloader", "verifyAndInstallDecoupleCoreFromBackup #1");
        try {
            File file = com.tencent.smtt.utils.r.b(this.h) ? new File(FileUtil.a(this.h, "com.tencent.mm", 4, true), TbsDownloader.getBackupFileName(false)) : new File(FileUtil.a(this.h, 4), TbsDownloader.getBackupFileName(true));
            TbsLog.i("TbsApkDownloader", "verifyAndInstallDecoupleCoreFromBackup backupFile is " + file.getAbsolutePath());
            if (file.exists()) {
                TbsLog.i("TbsApkDownloader", "verifyAndInstallDecoupleCoreFromBackup #2");
            } else {
                File b = TbsDownloader.b(TbsDownloadConfig.getInstance(this.h).mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_DECOUPLECOREVERSION, -1));
                if (b != null) {
                    TbsLog.i("TbsApkDownloader", "verifyAndInstallDecoupleCoreFromBackup getExistBackupCoreForDecouple is " + b.getAbsolutePath());
                }
                if (b != null && b.exists()) {
                    FileUtil.b(b, file);
                }
                String name = b.getName();
                TbsLog.i("TbsApkDownloader", "verifyAndInstallDecoupleCoreFromBackup fileNameSource is " + name);
                int i = name.contains("64") ? 64 : 32;
                if (com.tencent.smtt.utils.r.b(this.h)) {
                    File[] listFiles = this.m.listFiles();
                    Pattern compile = Pattern.compile(com.tencent.smtt.utils.a.a(false, i));
                    for (File file2 : listFiles) {
                        if (compile.matcher(file2.getName()).find() && file2.isFile() && file2.exists()) {
                            file2.delete();
                            TbsLog.i("TbsApkDownloader", "verifyAndInstallDecoupleCoreFromBackup delete file " + file2.getAbsolutePath());
                        }
                    }
                    File file3 = new File(this.m, com.tencent.smtt.utils.a.a(false, i) + CommonConstant.Symbol.DOT + TbsDownloadConfig.getInstance(this.h).mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_DECOUPLECOREVERSION, -1));
                    if (file3.exists()) {
                        str = "TbsApkDownloader";
                        str2 = "verifyAndInstallDecoupleCoreFromBackup  file already exist " + file3.getAbsolutePath();
                    } else {
                        file3.createNewFile();
                        str = "TbsApkDownloader";
                        str2 = "verifyAndInstallDecoupleCoreFromBackup create file " + file3.getAbsolutePath();
                    }
                    TbsLog.i(str, str2);
                }
            }
            if (com.tencent.smtt.utils.a.a(this.h, file, 0L, TbsDownloadConfig.getInstance(this.h).mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_DECOUPLECOREVERSION, -1))) {
                TbsLog.i("TbsApkDownloader", "verifyAndInstallDecoupleCoreFromBackup #3");
                if (com.tencent.smtt.utils.r.b(this.h)) {
                    TbsLog.i("TbsApkDownloader", "verifyAndInstallDecoupleCoreFromBackup isStableCoreForHostEnable and return true");
                    return true;
                }
                TbsLog.i("TbsApkDownloader", "verifyAndInstallDecoupleCoreFromBackup goto installDecoupleCoreFromBackup");
                return p.a().f(this.h);
            }
        } catch (Exception e2) {
            TbsLog.i("TbsApkDownloader", "stack is " + Log.getStackTraceString(e2));
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(boolean r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.m.a(boolean, boolean):boolean");
    }

    public void b() {
        this.t = true;
        if (TbsShareManager.isThirdPartyApp(this.h)) {
            TbsLogReport.TbsLogInfo tbsLogInfo = TbsLogReport.getInstance(this.h).tbsLogInfo();
            tbsLogInfo.setErrorCode(-309);
            tbsLogInfo.setFailDetail(new Exception());
            if (TbsDownloader.a(this.h)) {
                TbsLogReport.getInstance(this.h).eventReport(TbsLogReport.EventType.TYPE_DOWNLOAD_DECOUPLE, tbsLogInfo);
            } else {
                TbsLogReport.getInstance(this.h).eventReport(TbsLogReport.EventType.TYPE_DOWNLOAD, tbsLogInfo);
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public void b(boolean r38, boolean r39) {
        /*
            Method dump skipped, instructions count: 3422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.m.b(boolean, boolean):void");
    }

    public boolean b(boolean z) {
        if ((!z || o() || (QbSdk.getDownloadWithoutWifi() && Apn.isNetworkAvailable(this.h))) && this.b != null && this.c >= 0 && this.c < this.b.length) {
            String[] strArr = this.b;
            int i = this.c;
            this.c = i + 1;
            this.k = strArr[i];
            this.r = 0;
            this.s = 0;
            this.n = -1L;
            this.q = false;
            this.t = false;
            this.u = false;
            this.A = false;
            return true;
        }
        return false;
    }

    public int c(boolean z) {
        File c = c(this.h);
        if (z) {
            if (c == null) {
                return 0;
            }
            return com.tencent.smtt.utils.a.a(this.h, new File(c, TbsDownloader.getBackupFileName(true)));
        } else if (c == null) {
            return 0;
        } else {
            return com.tencent.smtt.utils.a.a(this.h, new File(c, TbsDownloader.getOverSea(this.h) ? "x5.oversea.tbs.org" : TbsDownloader.getBackupFileName(false)));
        }
    }

    public void c() {
        b();
        e(false);
        e(true);
    }

    public boolean d() {
        TbsLog.i(TbsDownloader.LOGTAG, "[TbsApkDownloader.isDownloadForeground] mIsDownloadForeground=" + this.E);
        return this.E;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e() {
        TbsLog.i(TbsDownloader.LOGTAG, "pauseDownload,isPause=" + this.d + "isDownloading=" + TbsDownloader.isDownloading());
        if (this.d || !TbsDownloader.isDownloading()) {
            return;
        }
        b();
        this.d = true;
        this.A = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f() {
        TbsLog.i(TbsDownloader.LOGTAG, "resumeDownload,isPause=" + this.d + "isDownloading=" + TbsDownloader.isDownloading());
        if (this.d && TbsDownloader.isDownloading()) {
            this.d = false;
            a(false);
        }
    }
}
