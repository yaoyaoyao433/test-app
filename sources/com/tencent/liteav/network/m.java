package com.tencent.liteav.network;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.liteav.basic.log.TXCLog;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class m {
    protected static m a = new m();
    private Context b = null;
    private long c = 3;

    public static m a() {
        return a;
    }

    protected m() {
    }

    public void a(Context context) {
        if (this.b == null) {
            this.b = context.getApplicationContext();
        }
    }

    public String b() {
        try {
            if (this.b != null) {
                int e = com.tencent.liteav.basic.util.g.e(this.b);
                return e == 0 ? "" : e == 1 ? "wifi:" : e == 2 ? "4g:" : e == 3 ? "3g:" : e == 4 ? "2g:" : e == 5 ? "ethernet:" : "xg:";
            }
            return "";
        } catch (Exception e2) {
            TXCLog.e("UploadQualityData", "get network type failed." + e2.getMessage());
            return "";
        }
    }

    public void a(String str, long j, long j2, long j3, float f, float f2, float f3) {
        if (com.tencent.liteav.basic.d.c.a().a("Network", "QualityDataCacheCount") > 0) {
            TXCLog.e("UploadQualityData", String.format("updateQualityData: accessID = %s serverType = %d totalTime = %d networkRTT = %d avgBlockCnt = %f avgVideoQue = %f avgAudioQue = %f", str, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3)));
            if (b(str)) {
                return;
            }
            try {
                SharedPreferences sharedPreferences = this.b.getSharedPreferences("com.tencent.liteav.network", 0);
                JSONObject c = c(sharedPreferences.getString("34238512-C08C-4931-A000-40E1D8B5BA5B", ""));
                JSONObject optJSONObject = c.optJSONObject(str);
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                }
                String str2 = j == 3 ? "DomainArrayData" : "OriginArrayData";
                JSONArray optJSONArray = optJSONObject.optJSONArray(str2);
                if (optJSONArray == null) {
                    optJSONArray = new JSONArray();
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("totalTime", j2);
                jSONObject.put("networkRTT", j3);
                jSONObject.put("avgBlockCnt", f);
                jSONObject.put("avgVideoQue", f2);
                jSONObject.put("avgAudioQue", f3);
                optJSONArray.put(jSONObject);
                int length = optJSONArray.length();
                long j4 = length;
                if (j4 > this.c) {
                    JSONArray jSONArray = new JSONArray();
                    for (int i = (int) (j4 - this.c); i < length; i++) {
                        jSONArray.put(optJSONArray.get(i));
                    }
                    optJSONArray = jSONArray;
                }
                optJSONObject.put(str2, optJSONArray);
                c.put(str, optJSONObject);
                sharedPreferences.edit().putString("34238512-C08C-4931-A000-40E1D8B5BA5B", c.toString()).commit();
            } catch (Exception e) {
                TXCLog.e("UploadQualityData", "build json object failed.", e);
            }
        }
    }

    public boolean c() {
        d();
        String b = b();
        String str = "isDomainAddressBetter: accessID = " + b + " minQualityDataCount = " + this.c;
        a a2 = a(b, true);
        a a3 = a(b, false);
        if (a2 != null) {
            str = String.format("%s \n isDomainAddressBetter：domainQualityData count = %d avgNetworkRTT = %f avgBlockCount = %f avgVideoQueue = %f avgAudioQueue = %f", str, Long.valueOf(a2.e), Float.valueOf(a2.a), Float.valueOf(a2.b), Float.valueOf(a2.c), Float.valueOf(a2.d));
        }
        if (a3 != null) {
            str = String.format("%s \n isDomainAddressBetter：originQualityData count = %d avgNetworkRTT = %f avgBlockCount = %f avgVideoQueue = %f avgAudioQueue = %f", str, Long.valueOf(a3.e), Float.valueOf(a3.a), Float.valueOf(a3.b), Float.valueOf(a3.c), Float.valueOf(a3.d));
        }
        TXCLog.e("UploadQualityData", str);
        return a2 != null && a2.e >= this.c && a3 != null && a3.e >= this.c && a2.b < a3.b && a2.c < a3.c && a2.d < a3.d;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class a {
        public float a = 0.0f;
        public float b = 0.0f;
        public float c = 0.0f;
        public float d = 0.0f;
        public long e = 0;

        protected a() {
        }
    }

    private a a(String str, boolean z) {
        JSONObject optJSONObject;
        if (b(str)) {
            return null;
        }
        try {
            char c = 0;
            String string = this.b.getSharedPreferences("com.tencent.liteav.network", 0).getString("34238512-C08C-4931-A000-40E1D8B5BA5B", "");
            if (b(string) || (optJSONObject = new JSONObject(string).optJSONObject(str)) == null) {
                return null;
            }
            JSONArray optJSONArray = optJSONObject.optJSONArray(z ? "DomainArrayData" : "OriginArrayData");
            if (optJSONArray == null) {
                return null;
            }
            long length = optJSONArray.length();
            if (length == 0) {
                return null;
            }
            float f = 0.0f;
            String str2 = "";
            int i = 0;
            float f2 = 0.0f;
            float f3 = 0.0f;
            float f4 = 0.0f;
            while (i < length) {
                JSONObject jSONObject = optJSONArray.getJSONObject(i);
                f += (float) jSONObject.optLong("networkRTT");
                f2 = (float) (f2 + jSONObject.optDouble("avgBlockCnt"));
                f3 = (float) (f3 + jSONObject.optDouble("avgVideoQue"));
                f4 = (float) (f4 + jSONObject.optDouble("avgAudioQue"));
                Object[] objArr = new Object[6];
                objArr[c] = str2;
                objArr[1] = Boolean.valueOf(z);
                objArr[2] = Long.valueOf(jSONObject.optLong("networkRTT"));
                objArr[3] = Double.valueOf(jSONObject.optDouble("avgBlockCnt"));
                objArr[4] = Double.valueOf(jSONObject.optDouble("avgVideoQue"));
                objArr[5] = Double.valueOf(jSONObject.optDouble("avgAudioQue"));
                str2 = String.format("%s \n isDomainAddressBetter：itemData domain = %b NetworkRTT = %d avgBlockCount = %f avgVideoQueue = %f avgAudioQueue = %f", objArr);
                i++;
                c = 0;
            }
            float f5 = (float) length;
            float f6 = f / f5;
            float f7 = f2 / f5;
            float f8 = f3 / f5;
            float f9 = f4 / f5;
            a aVar = new a();
            aVar.a = f6;
            aVar.b = f7;
            aVar.c = f8;
            aVar.d = f9;
            aVar.e = length;
            return aVar;
        } catch (Exception e) {
            TXCLog.e("UploadQualityData", "get quality data failed.", e);
            return null;
        }
    }

    private boolean b(String str) {
        return str == null || str.length() == 0;
    }

    private JSONObject c(String str) {
        if (!b(str)) {
            try {
                return new JSONObject(str);
            } catch (Exception e) {
                TXCLog.e("UploadQualityData", "failed to parse json string", e);
            }
        }
        return new JSONObject();
    }

    private void d() {
        this.c = com.tencent.liteav.basic.d.c.a().a("Network", "QualityDataCacheCount");
        if (this.c == -1 || this.c < 3) {
            this.c = 3L;
        }
    }

    public long a(String str) {
        if (this.b != null) {
            return this.b.getSharedPreferences("com.tencent.liteav.network", 0).getLong(str, 0L);
        }
        return 0L;
    }

    public void a(String str, long j) {
        if (this.b != null) {
            this.b.getSharedPreferences("com.tencent.liteav.network", 0).edit().putLong(str, j).commit();
        }
    }
}
