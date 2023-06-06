package com.tencent.smtt.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.tencent.smtt.sdk.TbsDownloadConfig;
import com.tencent.smtt.utils.Base64;
import com.tencent.smtt.utils.TbsLog;
import com.tencent.smtt.utils.f;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.json.JSONArray;
/* loaded from: classes6.dex */
public class TbsLogReport {
    private static TbsLogReport a;
    private Handler b;
    private Context c;
    private boolean d = false;

    /* loaded from: classes6.dex */
    public enum EventType {
        TYPE_DOWNLOAD(0),
        TYPE_INSTALL(1),
        TYPE_LOAD(2),
        TYPE_DOWNLOAD_DECOUPLE(3),
        TYPE_INSTALL_DECOUPLE(4),
        TYPE_COOKIE_DB_SWITCH(5),
        TYPE_SDK_REPORT_INFO(6);
        
        int a;

        EventType(int i) {
            this.a = i;
        }
    }

    /* loaded from: classes6.dex */
    public static class TbsLogInfo implements Cloneable {
        int a;
        private long b;
        private String c;
        private String d;
        private int e;
        private int f;
        private int g;
        private int h;
        private String i;
        private int j;
        private int k;
        private long l;
        private long m;
        private int n;
        private String o;
        private String p;
        private long q;

        private TbsLogInfo() {
            resetArgs();
        }

        protected Object clone() {
            try {
                return super.clone();
            } catch (CloneNotSupportedException unused) {
                return this;
            }
        }

        public int getDownFinalFlag() {
            return this.k;
        }

        public void resetArgs() {
            this.b = 0L;
            this.c = null;
            this.d = null;
            this.e = 0;
            this.f = 0;
            this.g = 0;
            this.h = 2;
            this.i = "unknown";
            this.j = 0;
            this.k = 2;
            this.l = 0L;
            this.m = 0L;
            this.n = 1;
            this.a = 0;
            this.o = null;
            this.p = null;
            this.q = 0L;
        }

        public void setApn(String str) {
            this.i = str;
        }

        public void setCheckErrorDetail(String str) {
            setErrorCode(108);
            this.o = str;
        }

        public void setDownConsumeTime(long j) {
            this.m += j;
        }

        public void setDownFinalFlag(int i) {
            this.k = i;
        }

        public void setDownloadCancel(int i) {
            this.g = i;
        }

        public void setDownloadSize(long j) {
            this.q += j;
        }

        public void setDownloadUrl(String str) {
            if (this.c == null) {
                this.c = str;
                return;
            }
            this.c += ";" + str;
        }

        public void setErrorCode(int i) {
            if (i != 100 && i != 110 && i != 120 && i != 111 && i < 400) {
                TbsLog.i(TbsDownloader.LOGTAG, "error occured, errorCode:" + i, true);
            }
            if (i == 111) {
                TbsLog.i(TbsDownloader.LOGTAG, "you are not in wifi, downloading stoped", true);
            }
            this.a = i;
        }

        public void setEventTime(long j) {
            this.b = j;
        }

        public void setFailDetail(String str) {
            if (str == null) {
                return;
            }
            if (str.length() > 1024) {
                str = str.substring(0, 1024);
            }
            this.p = str;
        }

        public void setFailDetail(Throwable th) {
            if (th == null) {
                this.p = "";
                return;
            }
            String stackTraceString = Log.getStackTraceString(th);
            if (stackTraceString.length() > 1024) {
                stackTraceString = stackTraceString.substring(0, 1024);
            }
            this.p = stackTraceString;
        }

        public void setHttpCode(int i) {
            this.e = i;
        }

        public void setNetworkChange(int i) {
            this.n = i;
        }

        public void setNetworkType(int i) {
            this.j = i;
        }

        public void setPatchUpdateFlag(int i) {
            this.f = i;
        }

        public void setPkgSize(long j) {
            this.l = j;
        }

        public void setResolveIp(String str) {
            this.d = str;
        }

        public void setUnpkgFlag(int i) {
            this.h = i;
        }
    }

    /* loaded from: classes6.dex */
    static class a {
        private final String a;
        private final String b;

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        private static void a(File file) throws IOException {
            RandomAccessFile randomAccessFile;
            RandomAccessFile randomAccessFile2 = null;
            try {
                try {
                    randomAccessFile = new RandomAccessFile(file, "rw");
                } catch (Throwable th) {
                    th = th;
                    randomAccessFile = null;
                }
            } catch (Exception e) {
                e = e;
            }
            try {
                int parseInt = Integer.parseInt("00001000", 2);
                randomAccessFile.seek(7L);
                int read = randomAccessFile.read();
                if ((read & parseInt) > 0) {
                    randomAccessFile.seek(7L);
                    randomAccessFile.write((~parseInt) & 255 & read);
                }
                try {
                    randomAccessFile.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            } catch (Exception e3) {
                e = e3;
                randomAccessFile2 = randomAccessFile;
                e.printStackTrace();
                if (randomAccessFile2 != null) {
                    try {
                        randomAccessFile2.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                }
                throw th;
            }
        }

        /* JADX WARN: Can't wrap try/catch for region: R(13:4|5|6|7|8|(2:9|10)|(10:12|13|14|15|(2:16|(1:18)(1:19))|20|21|22|23|24)|25|26|27|28|29|30) */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x008d, code lost:
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x008e, code lost:
            r0.printStackTrace();
         */
        /* JADX WARN: Removed duplicated region for block: B:107:0x006f A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:117:0x00a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:125:0x009d A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:128:0x0079 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void a() {
            /*
                Method dump skipped, instructions count: 243
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.TbsLogReport.a.a():void");
        }
    }

    private TbsLogReport(Context context) {
        this.b = null;
        this.c = context.getApplicationContext();
        HandlerThread handlerThread = new HandlerThread("TbsLogReportThread");
        handlerThread.start();
        this.b = new Handler(handlerThread.getLooper()) { // from class: com.tencent.smtt.sdk.TbsLogReport.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (message.what != 600) {
                    if (message.what == 601) {
                        TbsLogReport.this.b();
                    }
                } else if (message.obj instanceof TbsLogInfo) {
                    try {
                        int i = message.arg1;
                        TbsLogReport.this.a(i, (TbsLogInfo) message.obj);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        };
    }

    private String a(int i) {
        return i + HiAnalyticsConstant.REPORT_VAL_SEPARATOR;
    }

    private String a(long j) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date(j));
        } catch (Exception unused) {
            return null;
        }
    }

    private String a(String str) {
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        sb.append(str);
        sb.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        return sb.toString();
    }

    private JSONArray a() {
        String string = d().getString("tbs_download_upload", null);
        if (string != null) {
            try {
                string = new String(Base64.a(string, 2));
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        if (string == null) {
            return new JSONArray();
        }
        try {
            JSONArray jSONArray = new JSONArray(string);
            if (jSONArray.length() > 5) {
                JSONArray jSONArray2 = new JSONArray();
                int length = jSONArray.length() - 1;
                if (length >= jSONArray.length() - 5) {
                    jSONArray2.put(jSONArray.get(length));
                    return jSONArray2;
                }
            }
            return jSONArray;
        } catch (Exception unused) {
            return new JSONArray();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, TbsLogInfo tbsLogInfo) {
        if (QbSdk.o != null && QbSdk.o.containsKey(QbSdk.KEY_SET_SENDREQUEST_AND_UPLOAD) && QbSdk.o.get(QbSdk.KEY_SET_SENDREQUEST_AND_UPLOAD).equals("false")) {
            TbsLog.i("upload", "[TbsLogReport.sendLogReportRequest] -- SET_SENDREQUEST_AND_UPLOAD is false");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(a(i));
        sb.append(a((String) null));
        sb.append(a(com.tencent.smtt.utils.k.a(this.c)));
        sb.append(a(p.a().j(this.c)));
        String d = com.tencent.smtt.utils.r.d(this.c);
        try {
            d = new String(d.getBytes("UTF-8"), "ISO8859-1");
        } catch (Exception unused) {
        }
        sb.append(a(d));
        String packageName = this.c.getPackageName();
        sb.append(a(packageName));
        sb.append("com.tencent.mm".equals(packageName) ? a(com.tencent.smtt.utils.b.a(this.c, TbsDownloader.TBS_METADATA)) : a(com.tencent.smtt.utils.b.e(this.c)));
        sb.append(a(a(tbsLogInfo.b)));
        sb.append(a(tbsLogInfo.c));
        sb.append(a(tbsLogInfo.d));
        sb.append(a(tbsLogInfo.e));
        sb.append(a(tbsLogInfo.f));
        sb.append(a(tbsLogInfo.g));
        sb.append(a(tbsLogInfo.h));
        sb.append(a(tbsLogInfo.i));
        sb.append(a(tbsLogInfo.j));
        sb.append(a(tbsLogInfo.k));
        sb.append(b(tbsLogInfo.q));
        sb.append(b(tbsLogInfo.l));
        sb.append(b(tbsLogInfo.m));
        sb.append(a(tbsLogInfo.n));
        sb.append(a(tbsLogInfo.a));
        sb.append(a(tbsLogInfo.o));
        sb.append(a(tbsLogInfo.p));
        sb.append(a(TbsDownloadConfig.getInstance(this.c).mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_TBS_DOWNLOAD_V, 0)));
        sb.append(a(com.tencent.smtt.utils.b.k(this.c)));
        sb.append(a("4.3.0.265_44165"));
        sb.append(false);
        SharedPreferences d2 = d();
        JSONArray a2 = a();
        a2.put(sb.toString());
        SharedPreferences.Editor edit = d2.edit();
        String jSONArray = a2.toString();
        try {
            jSONArray = Base64.encodeToString(jSONArray.getBytes(), 2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        edit.putString("tbs_download_upload", jSONArray);
        edit.commit();
        if (this.d || i != EventType.TYPE_LOAD.a) {
            b();
        }
    }

    private void a(int i, TbsLogInfo tbsLogInfo, EventType eventType) {
        tbsLogInfo.setErrorCode(i);
        tbsLogInfo.setEventTime(System.currentTimeMillis());
        QbSdk.n.onInstallFinish(i);
        eventReport(eventType, tbsLogInfo);
    }

    private String b(long j) {
        return j + HiAnalyticsConstant.REPORT_VAL_SEPARATOR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        String str;
        String str2;
        if (QbSdk.o != null && QbSdk.o.containsKey(QbSdk.KEY_SET_SENDREQUEST_AND_UPLOAD) && QbSdk.o.get(QbSdk.KEY_SET_SENDREQUEST_AND_UPLOAD).equals("false")) {
            str = "upload";
            str2 = "[TbsLogReport.sendLogReportRequest] -- SET_SENDREQUEST_AND_UPLOAD is false";
        } else {
            TbsLog.i(TbsDownloader.LOGTAG, "[TbsApkDownloadStat.reportDownloadStat]");
            JSONArray a2 = a();
            if (a2 != null && a2.length() != 0) {
                TbsLog.i(TbsDownloader.LOGTAG, "[TbsApkDownloadStat.reportDownloadStat] jsonArray:" + a2);
                try {
                    String a3 = com.tencent.smtt.utils.f.a(com.tencent.smtt.utils.n.a(this.c).c(), a2.toString().getBytes("utf-8"), new f.a() { // from class: com.tencent.smtt.sdk.TbsLogReport.3
                        @Override // com.tencent.smtt.utils.f.a
                        public void a(int i) {
                            TbsLog.i(TbsDownloader.LOGTAG, "[TbsApkDownloadStat.reportDownloadStat] onHttpResponseCode:" + i);
                            if (i < 300) {
                                TbsLogReport.this.c();
                            }
                        }
                    }, true);
                    TbsLog.i(TbsDownloader.LOGTAG, "[TbsApkDownloadStat.reportDownloadStat] response:" + a3 + " testcase: -1");
                    return;
                } catch (Throwable th) {
                    th.printStackTrace();
                    return;
                }
            }
            str = TbsDownloader.LOGTAG;
            str2 = "[TbsApkDownloadStat.reportDownloadStat] no data";
        }
        TbsLog.i(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        SharedPreferences.Editor edit = d().edit();
        edit.remove("tbs_download_upload");
        edit.commit();
    }

    private SharedPreferences d() {
        return this.c.getSharedPreferences("tbs_download_stat", 4);
    }

    public static TbsLogReport getInstance(Context context) {
        if (a == null) {
            synchronized (TbsLogReport.class) {
                if (a == null) {
                    a = new TbsLogReport(context);
                }
            }
        }
        return a;
    }

    public void clear() {
        try {
            SharedPreferences.Editor edit = d().edit();
            edit.clear();
            edit.commit();
        } catch (Exception unused) {
        }
    }

    public void dailyReport() {
        this.b.sendEmptyMessage(601);
    }

    public void eventReport(EventType eventType, TbsLogInfo tbsLogInfo) {
        try {
            Message obtainMessage = this.b.obtainMessage();
            obtainMessage.what = 600;
            obtainMessage.arg1 = eventType.a;
            obtainMessage.obj = (TbsLogInfo) tbsLogInfo.clone();
            this.b.sendMessage(obtainMessage);
        } catch (Throwable th) {
            TbsLog.w("upload", "[TbsLogReport.eventReport] error, message=" + th.getMessage());
        }
    }

    public boolean getShouldUploadEventReport() {
        return this.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00fd A[EDGE_INSN: B:102:0x00fd->B:33:0x00fd ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f9 A[Catch: Exception -> 0x0117, all -> 0x015c, LOOP:0: B:83:0x00f2->B:32:0x00f9, LOOP_END, TryCatch #5 {Exception -> 0x0117, blocks: (B:30:0x00f2, B:32:0x00f9, B:33:0x00fd), top: B:83:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0132 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0137 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0165 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0160 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void reportTbsLog() {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.TbsLogReport.reportTbsLog():void");
    }

    public void setInstallErrorCode(int i, String str) {
        setInstallErrorCode(i, str, EventType.TYPE_INSTALL);
    }

    public void setInstallErrorCode(int i, String str, EventType eventType) {
        if (i != 200 && i != 220 && i != 221) {
            TbsLog.i(TbsDownloader.LOGTAG, "error occured in installation, errorCode:" + i, true);
        }
        TbsLogInfo tbsLogInfo = tbsLogInfo();
        tbsLogInfo.setFailDetail(str);
        a(i, tbsLogInfo, eventType);
    }

    public void setInstallErrorCode(int i, Throwable th) {
        TbsLogInfo tbsLogInfo = tbsLogInfo();
        tbsLogInfo.setFailDetail(th);
        a(i, tbsLogInfo, EventType.TYPE_INSTALL);
    }

    public void setLoadErrorCode(int i, String str) {
        TbsLogInfo tbsLogInfo = tbsLogInfo();
        tbsLogInfo.setErrorCode(i);
        tbsLogInfo.setEventTime(System.currentTimeMillis());
        tbsLogInfo.setFailDetail(str);
        eventReport(EventType.TYPE_LOAD, tbsLogInfo);
    }

    public void setLoadErrorCode(int i, Throwable th) {
        String str = "NULL";
        if (th != null) {
            String str2 = "msg: " + th.getMessage() + "; err: " + th + "; cause: " + Log.getStackTraceString(th.getCause());
            if (str2.length() > 1024) {
                str2 = str2.substring(0, 1024);
            }
            str = str2;
        }
        setLoadErrorCode(i, str);
    }

    public void setShouldUploadEventReport(boolean z) {
        this.d = z;
    }

    public TbsLogInfo tbsLogInfo() {
        return new TbsLogInfo();
    }
}
