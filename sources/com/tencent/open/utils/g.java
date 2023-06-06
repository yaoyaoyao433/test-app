package com.tencent.open.utils;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import com.meituan.robust.common.CommonConstant;
import com.tencent.connect.common.Constants;
import com.tencent.open.log.SLog;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class g {
    private static Map<String, g> a = Collections.synchronizedMap(new HashMap());
    private static String b = null;
    private Context c;
    private String d;
    private JSONObject e = null;
    private long f = 0;
    private int g = 0;
    private boolean h = true;

    public static g a(Context context, String str) {
        g gVar;
        synchronized (a) {
            SLog.v("openSDK_LOG.OpenConfig", "getInstance begin");
            if (str != null) {
                b = str;
            }
            if (str == null) {
                str = b != null ? b : "0";
            }
            gVar = a.get(str);
            if (gVar == null) {
                gVar = new g(context, str);
                a.put(str, gVar);
            }
            SLog.v("openSDK_LOG.OpenConfig", "getInstance end");
        }
        return gVar;
    }

    private g(Context context, String str) {
        this.c = null;
        this.d = null;
        this.c = context.getApplicationContext();
        this.d = str;
        a();
        b();
    }

    private void a() {
        try {
            this.e = new JSONObject(c("com.tencent.open.config.json"));
        } catch (JSONException unused) {
            this.e = new JSONObject();
        }
    }

    private String c(String str) {
        InputStream open;
        String str2;
        try {
            try {
                if (this.d != null) {
                    str2 = str + CommonConstant.Symbol.DOT + this.d;
                } else {
                    str2 = str;
                }
                open = this.c.openFileInput(str2);
            } catch (FileNotFoundException unused) {
                open = this.c.getAssets().open(str);
            }
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open, Charset.forName("UTF-8")));
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                try {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        stringBuffer.append(readLine);
                    } catch (IOException e) {
                        e.printStackTrace();
                        try {
                            open.close();
                            bufferedReader.close();
                            return "";
                        } catch (IOException e2) {
                            e2.printStackTrace();
                            return "";
                        }
                    }
                } catch (Throwable th) {
                    try {
                        open.close();
                        bufferedReader.close();
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                    throw th;
                }
            }
            String stringBuffer2 = stringBuffer.toString();
            try {
                open.close();
                bufferedReader.close();
            } catch (IOException e4) {
                e4.printStackTrace();
            }
            return stringBuffer2;
        } catch (IOException e5) {
            e5.printStackTrace();
            return "";
        }
    }

    private void a(String str, String str2) {
        try {
            if (this.d != null) {
                str = str + CommonConstant.Symbol.DOT + this.d;
            }
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(this.c.openFileOutput(str, 0), Charset.forName("UTF-8"));
            outputStreamWriter.write(str2);
            outputStreamWriter.flush();
            outputStreamWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void b() {
        if (this.g != 0) {
            d("update thread is running, return");
            return;
        }
        this.g = 1;
        final HashMap hashMap = new HashMap();
        hashMap.put("appid", this.d);
        hashMap.put("status_os", Build.VERSION.RELEASE);
        hashMap.put("status_machine", Build.MODEL);
        hashMap.put("status_version", Build.VERSION.SDK);
        hashMap.put("sdkv", Constants.SDK_VERSION);
        hashMap.put("sdkp", "a");
        j.a(new Runnable() { // from class: com.tencent.open.utils.g.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.tencent.open.a.b a2 = com.tencent.open.a.a.a().a("https://cgi.connect.qq.com/qqconnectopen/openapi/policy_conf", hashMap);
                    String a3 = a2.a();
                    SLog.i("openSDK_LOG.OpenConfig", "update: get config statusCode " + a2.d());
                    g.this.a(k.d(a3));
                } catch (Exception e) {
                    SLog.e("openSDK_LOG.OpenConfig", "get config error ", e);
                }
                g.this.g = 0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        d("cgi back, do update");
        this.e = jSONObject;
        a("com.tencent.open.config.json", jSONObject.toString());
        this.f = SystemClock.elapsedRealtime();
    }

    private void c() {
        int optInt = this.e.optInt("Common_frequency");
        if (optInt == 0) {
            optInt = 1;
        }
        if (SystemClock.elapsedRealtime() - this.f >= optInt * com.meituan.android.common.statistics.Constants.CONFIG_REFRESH_TIME) {
            b();
        }
    }

    public int a(String str) {
        d("get " + str);
        c();
        return this.e.optInt(str);
    }

    public boolean b(String str) {
        d("get " + str);
        c();
        Object opt = this.e.opt(str);
        if (opt == null) {
            return false;
        }
        if (opt instanceof Integer) {
            return !opt.equals(0);
        } else if (opt instanceof Boolean) {
            return ((Boolean) opt).booleanValue();
        } else {
            return false;
        }
    }

    private void d(String str) {
        if (this.h) {
            SLog.v("openSDK_LOG.OpenConfig", str + "; appid: " + this.d);
        }
    }
}
