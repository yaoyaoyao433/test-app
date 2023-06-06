package com.tencent.liteav;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.meituan.metrics.traffic.hurl.HttpURLWrapper;
import com.meituan.robust.common.StringUtil;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class m {
    private String a = "";
    private String b = "";
    private int c = 0;
    private String d = "";
    private String e = "";
    private long f = 0;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface a {
        void a(long j);
    }

    public long a() {
        return System.currentTimeMillis() - this.f;
    }

    public String a(long j) {
        return this.c < 0 ? String.format("http://%s/timeshift/%s/%s/timeshift.m3u8?delay=%d", this.a, this.e, this.b, Long.valueOf(((System.currentTimeMillis() - this.f) - j) / 1000)) : String.format("http://%s/%s/%s/timeshift.m3u8?starttime=%s&appid=%s&txKbps=0", this.a, Integer.valueOf(this.c), this.b, new SimpleDateFormat("yyyyMMddHHmmss").format(new Date(this.f + (j * 1000))), this.d);
    }

    public int a(final String str, final String str2, final int i, final a aVar) {
        if (str == null || str.isEmpty()) {
            return -1;
        }
        this.d = TXCCommonUtil.getAppID();
        if (TextUtils.isEmpty(this.d)) {
            return -2;
        }
        AsyncTask.execute(new Runnable() { // from class: com.tencent.liteav.m.1
            @Override // java.lang.Runnable
            public void run() {
                m.this.f = System.currentTimeMillis();
                m.this.b = "";
                m.this.c = i;
                m.this.a = str2;
                m.this.b = TXCCommonUtil.getStreamIDByStreamUrl(str);
                m.this.e = TXCCommonUtil.getAppNameByStreamUrl(str);
                if (m.this.e == null) {
                    m.this.e = "live";
                }
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) HttpURLWrapper.wrapURLConnection(new URL(m.this.c < 0 ? String.format("http://%s/timeshift/%s/%s/timeshift.m3u8?delay=0", m.this.a, m.this.e, m.this.b) : String.format("http://%s/%s/%s/timeshift.m3u8?delay=0&appid=%s&txKbps=0", m.this.a, Integer.valueOf(m.this.c), m.this.b, m.this.d)).openConnection());
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.setDoInput(true);
                    httpURLConnection.setUseCaches(false);
                    httpURLConnection.setConnectTimeout(5000);
                    httpURLConnection.setReadTimeout(5000);
                    httpURLConnection.setRequestMethod("GET");
                    httpURLConnection.setRequestProperty("Charsert", "UTF-8");
                    httpURLConnection.setRequestProperty("Content-Type", "text/plain;");
                    String str3 = "";
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        str3 = str3 + readLine;
                    }
                    TXCLog.i("TXCTimeShiftUtil", "prepareSeekTime: receive response, strResponse = " + str3);
                    String a2 = m.this.a(str3);
                    if (a2 != null) {
                        m.this.f = Long.parseLong(a2) * 1000;
                    }
                } catch (Exception e) {
                    m.this.f = System.currentTimeMillis();
                    TXCLog.e("TXCTimeShiftUtil", "prepareSeekTime error " + e.toString());
                }
                long currentTimeMillis = System.currentTimeMillis();
                TXCLog.i("TXCTimeShiftUtil", "live start time:" + m.this.f + ",currentTime:" + currentTimeMillis + ",diff:" + (currentTimeMillis - m.this.f));
                final long j = currentTimeMillis - m.this.f;
                if (aVar != null) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tencent.liteav.m.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            aVar.a(j);
                        }
                    });
                }
            }
        });
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str) {
        int indexOf;
        String substring;
        int indexOf2;
        if (!str.contains("#EXT-TX-TS-START-TIME") || (indexOf = str.indexOf("#EXT-TX-TS-START-TIME:") + 22) <= 0 || (indexOf2 = (substring = str.substring(indexOf)).indexOf("#")) <= 0) {
            return null;
        }
        return substring.substring(0, indexOf2).replaceAll(StringUtil.CRLF_STRING, "");
    }
}
