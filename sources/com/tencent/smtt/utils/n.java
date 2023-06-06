package com.tencent.smtt.utils;

import android.annotation.TargetApi;
import android.content.Context;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Properties;
/* loaded from: classes6.dex */
public class n {
    private static n c;
    private Context a;
    private File b = null;
    private String d = "https://log.tbs.qq.com/ajax?c=pu&v=2&k=";
    private String e = "https://log.tbs.qq.com/ajax?c=pu&tk=";
    private String f = "https://log.tbs.qq.com/ajax?c=dl&k=";
    private String g = "https://cfg.imtt.qq.com/tbs?v=2&mk=";
    private String h = "https://log.tbs.qq.com/ajax?c=ul&v=2&k=";
    private String i = "https://mqqad.html5.qq.com/adjs";
    private String j = "https://log.tbs.qq.com/ajax?c=ucfu&k=";
    private String k = "";
    private String l = "";
    private String m = "";
    private String n = "https://tbsrecovery.imtt.qq.com/getconfig";

    @TargetApi(11)
    private n(Context context) {
        this.a = null;
        TbsLog.w("TbsCommonConfig", "TbsCommonConfig constructing...");
        this.a = context.getApplicationContext();
        k();
    }

    public static synchronized n a() {
        n nVar;
        synchronized (n.class) {
            nVar = c;
        }
        return nVar;
    }

    public static synchronized n a(Context context) {
        n nVar;
        synchronized (n.class) {
            if (c == null) {
                c = new n(context);
            }
            nVar = c;
        }
        return nVar;
    }

    private synchronized void k() {
        BufferedInputStream bufferedInputStream;
        Throwable th;
        StringWriter stringWriter;
        try {
            File l = l();
            if (l == null) {
                TbsLog.e("TbsCommonConfig", "Config file is null, default values will be applied");
                return;
            }
            bufferedInputStream = new BufferedInputStream(new FileInputStream(l));
            try {
                Properties properties = new Properties();
                properties.load(bufferedInputStream);
                String property = properties.getProperty("pv_post_url", "");
                if (!"".equals(property)) {
                    this.d = property;
                }
                String property2 = properties.getProperty("tbs_download_stat_post_url", "");
                if (!"".equals(property2)) {
                    this.f = property2;
                }
                String property3 = properties.getProperty("tbs_downloader_post_url", "");
                TbsLog.i("TbsCommonConfig", "KEY_TBS_DOWNLOADER_POST_URL is " + property3);
                if (!"".equals(property3)) {
                    this.g = property3;
                }
                String property4 = properties.getProperty("tbs_downloader_response_query", "");
                TbsLog.i("TbsCommonConfig", "KEY_TBS_DOWNLOADER_RESPONSE_QUERY is " + property4);
                if (!"".equals(property4)) {
                    this.k = property4;
                }
                String property5 = properties.getProperty("tbs_downloader_response_update", "");
                TbsLog.i("TbsCommonConfig", "KEY_TBS_DOWNLOADER_RESPONSE_UPDATE is " + property5);
                if (!"".equals(property5)) {
                    this.l = property5;
                }
                String property6 = properties.getProperty("tbs_downloader_response_download", "");
                TbsLog.i("TbsCommonConfig", "KEY_TBS_DOWNLOADER_RESPONSE_DOWNLOAD is " + property6);
                if (!"".equals(property6)) {
                    this.m = property6;
                }
                String property7 = properties.getProperty("tbs_log_post_url", "");
                if (!"".equals(property7)) {
                    this.h = property7;
                }
                String property8 = properties.getProperty("tips_url", "");
                if (!"".equals(property8)) {
                    this.i = property8;
                }
                String property9 = properties.getProperty("tbs_cmd_post_url", "");
                if (!"".equals(property9)) {
                    this.j = property9;
                }
                String property10 = properties.getProperty("tbs_emergency_post_url", "");
                if (!"".equals(property10)) {
                    this.n = property10;
                }
                String property11 = properties.getProperty("pv_post_url_tk", "");
                if (!"".equals(property11)) {
                    this.e = property11;
                }
                try {
                    bufferedInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (Throwable th2) {
                th = th2;
                th.printStackTrace(new PrintWriter(new StringWriter()));
                TbsLog.e("TbsCommonConfig", "exceptions occurred1:" + stringWriter.toString());
                if (bufferedInputStream != null) {
                    try {
                        bufferedInputStream.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                }
            }
        } catch (Throwable th3) {
            bufferedInputStream = null;
            th = th3;
        }
    }

    private File l() {
        File file;
        File file2 = null;
        try {
            if (this.b == null) {
                String str = this.a.getApplicationContext().getApplicationInfo().packageName;
                if (TextUtils.isEmpty(str)) {
                    file = new File(FileUtil.a(this.a, 8));
                } else {
                    boolean z = com.sankuai.meituan.takeoutnew.util.aop.f.a(this.a.getPackageManager(), "android.permission.READ_EXTERNAL_STORAGE", str) == 0;
                    boolean z2 = com.sankuai.meituan.takeoutnew.util.aop.f.a(this.a.getPackageManager(), "android.permission.WRITE_EXTERNAL_STORAGE", str) == 0;
                    if (!z && !z2) {
                        file = new File(FileUtil.a(this.a, 8));
                    }
                    TbsLog.i("TbsCommonConfig", "no permission,use sdcard default folder");
                    file = new File(FileUtil.a(this.a, 5));
                }
                this.b = file;
                if (this.b == null || !this.b.isDirectory()) {
                    return null;
                }
            }
            TbsLog.i("TbsCommonConfig", "mTbsConfigDir is " + this.b.getAbsolutePath());
            File file3 = new File(this.b, "tbsnet.conf");
            if (!file3.exists()) {
                TbsLog.e("TbsCommonConfig", "Get file(" + file3.getCanonicalPath() + ") failed!");
                return null;
            }
            try {
                TbsLog.w("TbsCommonConfig", "pathc:" + file3.getCanonicalPath());
                return file3;
            } catch (Throwable th) {
                th = th;
                file2 = file3;
                StringWriter stringWriter = new StringWriter();
                th.printStackTrace(new PrintWriter(stringWriter));
                TbsLog.e("TbsCommonConfig", "exceptions occurred2:" + stringWriter.toString());
                return file2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public String b() {
        return this.d;
    }

    public String c() {
        return this.f;
    }

    public String d() {
        return this.k;
    }

    public String e() {
        return this.l;
    }

    public String f() {
        return this.m;
    }

    public String g() {
        return this.g;
    }

    public String h() {
        return this.h;
    }

    public String i() {
        return this.e;
    }

    public String j() {
        return this.n;
    }
}
