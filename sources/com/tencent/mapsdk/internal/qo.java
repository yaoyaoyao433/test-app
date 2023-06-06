package com.tencent.mapsdk.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import com.tencent.map.tools.net.NetManager;
import com.tencent.map.tools.net.NetResponse;
import java.io.Closeable;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class qo {
    private static final String c = "https://confinfo.map.qq.com/confinfo?";
    Context a;
    WeakReference<a> b;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface a {
        void c();
    }

    public qo(Context context, a aVar) {
        this.a = context;
        this.b = new WeakReference<>(aVar);
    }

    private void a() {
        com.sankuai.waimai.launcher.util.aop.b.a(new b(this, (byte) 0), this.a);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public final class b extends AsyncTask<Context, Void, Void> {
        private b() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public /* synthetic */ b(qo qoVar, byte b) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        public Void doInBackground(Context... contextArr) {
            InputStream inputStream;
            WeakReference<a> weakReference;
            byte[] b;
            JSONObject optJSONObject;
            int a = ql.a();
            StringBuilder sb = new StringBuilder();
            sb.append(qo.c);
            sb.append("apiKey=");
            if (contextArr != null && contextArr.length > 0) {
                sb.append(qo.a(contextArr[0].getApplicationContext()));
            }
            NetResponse doStream = NetManager.getInstance().builder().url(sb.toString()).timeOut(3000).doStream();
            try {
                inputStream = doStream.dataStream;
            } catch (Throwable th) {
                th = th;
                inputStream = null;
            }
            try {
                b = kd.b(inputStream);
            } catch (Throwable th2) {
                th = th2;
                try {
                    th.printStackTrace();
                    if (inputStream != null) {
                        kd.a((Closeable) inputStream);
                    }
                    if (doStream != null) {
                        kd.a((Closeable) doStream.dataStream);
                    }
                    if ((a != ql.a()) && qo.this.a != null) {
                        ql.a(qo.this.a, a);
                        weakReference = qo.this.b;
                        weakReference.get().c();
                    }
                    return null;
                } finally {
                    if (inputStream != null) {
                        kd.a((Closeable) inputStream);
                    }
                    if (doStream != null) {
                        kd.a((Closeable) doStream.dataStream);
                    }
                    if ((a != ql.a()) && qo.this.a != null) {
                        ql.a(qo.this.a, a);
                        qo.this.b.get().c();
                    }
                }
            }
            if (b != null && b.length != 0) {
                JSONObject jSONObject = new JSONObject(new String(b));
                if (jSONObject.optInt("error", -1) == 0 && (optJSONObject = jSONObject.optJSONObject("info")) != null) {
                    a = optJSONObject.optInt("scenic", a);
                }
                if (inputStream != null) {
                    kd.a((Closeable) inputStream);
                }
                if (doStream != null) {
                    kd.a((Closeable) doStream.dataStream);
                }
                if ((a != ql.a()) && qo.this.a != null) {
                    ql.a(qo.this.a, a);
                    weakReference = qo.this.b;
                    weakReference.get().c();
                }
                return null;
            }
            return null;
        }
    }

    private static int a(String str, int i) throws JSONException {
        JSONObject optJSONObject;
        JSONObject jSONObject = new JSONObject(str);
        return (jSONObject.optInt("error", -1) != 0 || (optJSONObject = jSONObject.optJSONObject("info")) == null) ? i : optJSONObject.optInt("scenic", i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(Context context) {
        ApplicationInfo applicationInfo;
        if (context == null) {
            return "";
        }
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            applicationInfo = null;
        }
        return (applicationInfo == null || applicationInfo.metaData == null) ? "" : applicationInfo.metaData.getString("TencentMapSDK");
    }

    private static /* synthetic */ int b(String str, int i) throws JSONException {
        JSONObject optJSONObject;
        JSONObject jSONObject = new JSONObject(str);
        return (jSONObject.optInt("error", -1) != 0 || (optJSONObject = jSONObject.optJSONObject("info")) == null) ? i : optJSONObject.optInt("scenic", i);
    }
}
