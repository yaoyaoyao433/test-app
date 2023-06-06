package com.tencent.liteav;

import android.content.Context;
import android.content.SharedPreferences;
import com.meituan.metrics.traffic.hurl.HttpURLWrapper;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class o {
    private static volatile o d;
    private Context a;
    private Map<String, List<b>> b = new HashMap();
    private Map<String, Long> c = new HashMap();

    private o(Context context) {
        this.a = context.getApplicationContext();
        a();
    }

    public static o a(Context context) {
        if (d == null) {
            synchronized (o.class) {
                if (d == null) {
                    d = new o(context);
                }
            }
        }
        return d;
    }

    public int a(String str) {
        a aVar;
        if (str == null || str.isEmpty()) {
            return 60;
        }
        synchronized (this) {
            List<b> list = this.b.get(str);
            if (list != null) {
                for (b bVar : list) {
                    if ("40302".equals(bVar.b) && str.equalsIgnoreCase(bVar.a) && (aVar = (a) bVar) != null && aVar.e > System.currentTimeMillis() / 1000) {
                        return aVar.c;
                    }
                }
            }
            return 60;
        }
    }

    public boolean b(String str) {
        a aVar;
        if (str == null || str.isEmpty()) {
            return false;
        }
        synchronized (this) {
            List<b> list = this.b.get(str);
            if (list != null) {
                for (b bVar : list) {
                    if ("40302".equals(bVar.b) && str.equalsIgnoreCase(bVar.a) && (aVar = (a) bVar) != null && aVar.e > System.currentTimeMillis() / 1000) {
                        return aVar.d;
                    }
                }
            }
            return false;
        }
    }

    private long d(String str) {
        if (str == null || str.isEmpty()) {
            return (System.currentTimeMillis() / 1000) + 3600;
        }
        if (this.c.containsKey(str)) {
            return this.c.get(str).longValue();
        }
        List<b> list = this.b.get(str);
        if (list != null) {
            for (b bVar : list) {
                if ("40302".equals(bVar.b) && str.equalsIgnoreCase(bVar.a)) {
                    return ((a) bVar).e;
                }
            }
            return 0L;
        }
        return 0L;
    }

    private void a(String str, long j) {
        this.c.put(str, Long.valueOf(j));
        TXCLog.i("TXCVodPlayReportControl", "SetReportExpireTime in mem appid= " + str + " , time=" + j);
    }

    public void c(final String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        synchronized (this) {
            if (d(str) < System.currentTimeMillis() / 1000) {
                TXCLog.i("TXCVodPlayReportControl", "RequestReportControl");
                a(str, (System.currentTimeMillis() / 1000) + 3600);
                new Thread(new Runnable() { // from class: com.tencent.liteav.o.1
                    @Override // java.lang.Runnable
                    public void run() {
                        o.this.e(str);
                        o.this.b();
                    }
                }, "report_control").start();
            }
        }
    }

    private void a() {
        SharedPreferences sharedPreferences = this.a.getSharedPreferences("vod_report_config", 0);
        if (sharedPreferences != null) {
            String string = sharedPreferences.getString("value", "");
            if (string.isEmpty()) {
                return;
            }
            try {
                JSONArray jSONArray = new JSONArray(string);
                for (int i = 0; i < jSONArray.length(); i++) {
                    List<b> h = h(jSONArray.optString(i));
                    if (h != null && h.size() > 0) {
                        this.b.put(h.get(0).a, h);
                    }
                }
            } catch (JSONException e) {
                TXCLog.e("TXCVodPlayReportControl", e.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        SharedPreferences.Editor edit;
        int i = 0;
        SharedPreferences sharedPreferences = this.a.getSharedPreferences("vod_report_config", 0);
        if (sharedPreferences == null || (edit = sharedPreferences.edit()) == null || this.b.size() <= 0) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        for (Map.Entry<String, List<b>> entry : this.b.entrySet()) {
            int i2 = i + 1;
            try {
                jSONArray.put(i, a(entry.getValue()));
            } catch (JSONException e) {
                TXCLog.e("TXCVodPlayReportControl", e.toString());
            }
            i = i2;
        }
        edit.putString("value", jSONArray.toString());
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str) {
        URL url;
        HttpURLConnection httpURLConnection;
        IOException e;
        StringBuilder sb;
        String str2;
        BufferedReader bufferedReader = null;
        try {
            url = new URL(g(str));
        } catch (MalformedURLException e2) {
            TXCLog.i("TXCVodPlayReportControl", "URL :" + e2.toString());
            url = null;
        }
        if (url == null) {
            return;
        }
        try {
            httpURLConnection = (HttpURLConnection) HttpURLWrapper.wrapURLConnection(url.openConnection());
        } catch (IOException e3) {
            TXCLog.i("TXCVodPlayReportControl", "openConnection :" + e3.toString());
            httpURLConnection = null;
        }
        if (httpURLConnection == null) {
            return;
        }
        try {
            try {
                httpURLConnection.setConnectTimeout(8000);
                httpURLConnection.setReadTimeout(8000);
                httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
                httpURLConnection.setInstanceFollowRedirects(true);
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                TXCLog.i("TXCVodPlayReportControl", "request report control response code : " + responseCode);
                if (200 == responseCode) {
                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                    try {
                        StringBuilder sb2 = new StringBuilder();
                        while (true) {
                            String readLine = bufferedReader2.readLine();
                            if (readLine == null) {
                                break;
                            }
                            sb2.append(readLine);
                        }
                        f(sb2.toString());
                        bufferedReader = bufferedReader2;
                    } catch (IOException e4) {
                        e = e4;
                        bufferedReader = bufferedReader2;
                        TXCLog.i("TXCVodPlayReportControl", "connect or read: " + e.toString());
                        httpURLConnection.disconnect();
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                                return;
                            } catch (IOException e5) {
                                e = e5;
                                str2 = "TXCVodPlayReportControl";
                                sb = new StringBuilder("bufferedReader.close :");
                                sb.append(e.toString());
                                TXCLog.i(str2, sb.toString());
                            }
                        }
                        return;
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader = bufferedReader2;
                        httpURLConnection.disconnect();
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e6) {
                                TXCLog.i("TXCVodPlayReportControl", "bufferedReader.close :" + e6.toString());
                            }
                        }
                        throw th;
                    }
                }
                httpURLConnection.disconnect();
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e7) {
                        e = e7;
                        str2 = "TXCVodPlayReportControl";
                        sb = new StringBuilder("bufferedReader.close :");
                        sb.append(e.toString());
                        TXCLog.i(str2, sb.toString());
                    }
                }
            } catch (IOException e8) {
                e = e8;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private void f(String str) {
        if (str == null || str.isEmpty()) {
            TXCLog.i("TXCVodPlayReportControl", "response msg is empty");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i = jSONObject.getInt("code");
            String optString = jSONObject.optString("message");
            String optString2 = jSONObject.optString("requestId");
            TXCLog.i("TXCVodPlayReportControl", "code = " + i + " ,message = " + optString + " , requestID= " + optString2);
            if (i == 0 && jSONObject.getInt("version") == 1) {
                a(jSONObject);
            }
        } catch (JSONException e) {
            TXCLog.e("TXCVodPlayReportControl", "parseJson err: " + e.toString());
        }
    }

    private void a(JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray("controlInfos");
        int optInt = jSONObject.optInt("appId");
        if (optInt == 0) {
            TXCLog.i("TXCVodPlayReportControl", "response appid is zero!");
        } else if (optJSONArray != null && optJSONArray.length() != 0) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null && "40302".equals(optJSONObject.optString("eventId"))) {
                    long optLong = optJSONObject.optLong("expireTime", 0L);
                    if (optLong > System.currentTimeMillis() / 1000) {
                        String optString = optJSONObject.optString("switch");
                        int optInt2 = optJSONObject.optInt("frequency", 60);
                        int i2 = optInt2 < 60 ? 60 : optInt2;
                        boolean equalsIgnoreCase = "on".equalsIgnoreCase(optString);
                        StringBuilder sb = new StringBuilder();
                        sb.append(optInt);
                        arrayList.add(new a(i2, equalsIgnoreCase, optLong, sb.toString()));
                    }
                }
            }
            synchronized (this) {
                if (arrayList.size() != 0) {
                    Map<String, List<b>> map = this.b;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(optInt);
                    map.put(sb2.toString(), arrayList);
                    this.c.remove(Integer.valueOf(optInt));
                }
            }
        }
    }

    private String g(String str) {
        String str2 = "https://vodreport.qcloud.com/describeControlInfos/v1/" + str + "?sdkVersion=" + TXCCommonUtil.getSDKVersionStr();
        TXCLog.i("TXCVodPlayReportControl", "makeUrl: " + str2);
        return str2;
    }

    private String a(List<b> list) {
        if (list == null) {
            return "";
        }
        JSONArray jSONArray = new JSONArray();
        int i = 0;
        for (b bVar : list) {
            JSONObject jSONObject = new JSONObject();
            if ("40302".equals(bVar.b)) {
                a aVar = (a) bVar;
                try {
                    jSONObject.put("appid", aVar.a);
                    jSONObject.put("eventid", aVar.b);
                    jSONObject.put("40302", aVar.toString());
                } catch (JSONException e) {
                    TXCLog.e("TXCVodPlayReportControl", "controlDataListToString jsonObject.put：" + e.toString());
                }
            }
            int i2 = i + 1;
            try {
                jSONArray.put(i, jSONObject);
            } catch (JSONException e2) {
                TXCLog.e("TXCVodPlayReportControl", "jsonArray.put： " + e2.toString());
            }
            i = i2;
        }
        return jSONArray.toString();
    }

    private List<b> h(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    optJSONObject.optString("appid", "");
                    if (optJSONObject.optString("eventid", "").equalsIgnoreCase("40302")) {
                        String optString = optJSONObject.optString("40302", "");
                        if (!optString.isEmpty()) {
                            arrayList.add(new a(optString));
                        }
                    }
                }
            }
        } catch (JSONException e) {
            TXCLog.e("TXCVodPlayReportControl", "controlDataListParseFormString :" + e.toString());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class b {
        protected String a;
        protected String b;

        public b(String str, String str2) {
            this.a = "";
            this.b = "";
            this.a = str;
            this.b = str2;
        }

        public b() {
            this.a = "";
            this.b = "";
        }

        public void a(String str) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.a = jSONObject.optString("appid", "");
                this.b = jSONObject.optString("eventid", "");
            } catch (JSONException e) {
                TXCLog.i("TXCVodPlayReportControl", "parseFromString: " + e.toString());
                this.a = "";
                this.b = "";
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class a extends b {
        private int c;
        private boolean d;
        private long e;

        public a(int i, boolean z, long j, String str) {
            super(str, "40302");
            this.c = 60;
            this.d = false;
            this.e = 0L;
            this.c = i;
            this.d = z;
            this.e = j;
        }

        public a(String str) {
            this.c = 60;
            this.d = false;
            this.e = 0L;
            a(str);
        }

        public String toString() {
            return a().toString();
        }

        private JSONObject a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("SengmentDuration", this.c);
                jSONObject.put("ReportSwitch", this.d);
                jSONObject.put("ExpireTime", this.e);
                jSONObject.put("appid", this.a);
                jSONObject.put("eventid", this.b);
            } catch (JSONException e) {
                TXCLog.e("TXCVodPlayReportControl", "toJsonObject jsonexception: " + e.toString());
            }
            return jSONObject;
        }

        @Override // com.tencent.liteav.o.b
        public void a(String str) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.c = jSONObject.optInt("SengmentDuration", 60);
                this.d = jSONObject.optBoolean("ReportSwitch", false);
                this.e = jSONObject.optLong("ExpireTime", (System.currentTimeMillis() / 1000) + 3600);
                this.a = jSONObject.optString("appid", "");
                this.b = jSONObject.optString("eventid", "");
            } catch (JSONException e) {
                TXCLog.i("TXCVodPlayReportControl", "parseFromString: " + e.toString());
                this.c = 60;
                this.d = false;
                this.e = 0L;
                this.a = "";
                this.b = "40302";
            }
        }
    }
}
