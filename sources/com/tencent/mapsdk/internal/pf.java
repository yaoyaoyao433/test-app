package com.tencent.mapsdk.internal;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.tencent.map.tools.json.JsonParser;
import com.tencent.map.tools.json.JsonUtils;
import com.tencent.map.tools.net.NetResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class pf extends AsyncTask<Object, Void, Void> {
    public static final int a = 10000;
    private Handler b;
    private String c;
    private String d;
    private b e;
    private a f;
    private Handler g = new Handler(Looper.myLooper()) { // from class: com.tencent.mapsdk.internal.pf.1
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what != 10000) {
                return;
            }
            com.sankuai.waimai.launcher.util.aop.b.a(new pf(pf.this.b, pf.this.c, pf.this.d, pf.this.e), new Object[0]);
        }
    };

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface b {
        void a(a aVar);
    }

    public pf(Handler handler, String str, String str2, b bVar) {
        this.b = handler;
        this.e = bVar;
        this.c = TextUtils.isEmpty(str) ? "" : str;
        this.d = TextUtils.isEmpty(str2) ? "" : str2;
    }

    private boolean a() {
        String str;
        String str2;
        int i;
        cr crVar = (cr) ((dd) ck.a(dd.class)).h();
        String a2 = gy.a();
        String str3 = this.c;
        String l = gy.l();
        String str4 = this.d;
        String h = gy.h();
        String d = gy.d();
        int j = gy.j();
        String k = gy.k();
        String m = gy.m();
        String c = gy.c();
        String g = gy.g();
        if (TextUtils.isEmpty(g)) {
            str = "0";
        } else {
            str = "wifi".equals(g) ? "2" : "1";
        }
        NetResponse checkAuth = crVar.checkAuth(a2, str3, l, str4, h, d, j, k, m, c, str);
        String str5 = "utf-8";
        byte[] bArr = new byte[0];
        if (checkAuth != null) {
            str5 = checkAuth.charset;
            if (checkAuth.data != null) {
                bArr = checkAuth.data;
            }
        }
        gy.j = Calendar.getInstance().get(1);
        gy.k = Calendar.getInstance().get(2);
        gy.l = Calendar.getInstance().get(5);
        try {
            JSONObject jSONObject = new JSONObject(new String(bArr, str5));
            this.f = (a) JsonUtils.parseToModel(jSONObject.optJSONObject(GearsLocator.DETAIL), a.class, new Object[0]);
            this.b.post(new AnonymousClass2(jSONObject));
            JSONObject optJSONObject = jSONObject.optJSONObject("info");
            if (optJSONObject != null) {
                i = optJSONObject.optInt("error");
                str2 = optJSONObject.optString("msg");
            } else {
                str2 = null;
                i = 0;
            }
            if (i == 0) {
                gy.i = 0;
            } else {
                a(i, str2);
                if (i < -400) {
                    gy.i = -1;
                } else {
                    gy.i = 1;
                }
            }
            return gy.i == 0;
        } catch (Exception unused) {
            return false;
        }
    }

    private static String b() {
        String g = gy.g();
        return TextUtils.isEmpty(g) ? "0" : "wifi".equals(g) ? "2" : "1";
    }

    private static void a(JSONObject jSONObject) {
        String str;
        int i;
        JSONObject optJSONObject = jSONObject.optJSONObject("info");
        if (optJSONObject != null) {
            i = optJSONObject.optInt("error");
            str = optJSONObject.optString("msg");
        } else {
            str = null;
            i = 0;
        }
        if (i == 0) {
            gy.i = 0;
            return;
        }
        a(i, str);
        if (i < -400) {
            gy.i = -1;
        } else {
            gy.i = 1;
        }
    }

    private void b(JSONObject jSONObject) {
        this.f = (a) JsonUtils.parseToModel(jSONObject.optJSONObject(GearsLocator.DETAIL), a.class, new Object[0]);
        this.b.post(new AnonymousClass2(jSONObject));
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.pf$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass2 implements Runnable {
        final /* synthetic */ JSONObject a;

        AnonymousClass2(JSONObject jSONObject) {
            this.a = jSONObject;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (pf.this.e != null) {
                pf.this.e.a(pf.this.f);
            }
        }
    }

    private Void c() {
        boolean a2 = a();
        if (gy.i == 2) {
            this.g.sendEmptyMessageDelayed(10000, 10000L);
        }
        if (a2 || this.b == null) {
            return null;
        }
        fs fsVar = new fs();
        fsVar.f = 3;
        this.b.sendMessage(this.b.obtainMessage(fsVar.f, fsVar));
        return null;
    }

    private void d() {
        if (this.b != null) {
            fs fsVar = new fs();
            fsVar.f = 3;
            this.b.sendMessage(this.b.obtainMessage(fsVar.f, fsVar));
        }
    }

    private static void a(int i, String str) {
        ArrayList<String> arrayList = new ArrayList(4);
        arrayList.add("腾讯地图鉴权失败，请访问 lbs.qq.com 检查 key 配置");
        arrayList.add("错误码：".concat(String.valueOf(i)));
        arrayList.add("错误信息：".concat(String.valueOf(str)));
        StringBuilder sb = new StringBuilder(1024);
        sb.append("Auth Fail:\n");
        char[] cArr = new char[81];
        Arrays.fill(cArr, '*');
        cArr[80] = '\n';
        sb.append(cArr);
        for (String str2 : arrayList) {
            sb.append(str2);
            sb.append("\n");
        }
        sb.append(cArr);
        Log.e("tencentmap", sb.toString());
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class a implements JsonParser {
        public fp a;
        public JSONArray b;
        public JSONObject c;
        public pk d;
        public int e = qz.c;

        @Override // com.tencent.map.tools.json.JsonParser
        public void parse(JSONObject jSONObject) {
            JSONObject optJSONObject;
            if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject("cfg")) == null) {
                return;
            }
            this.b = optJSONObject.optJSONObject("custom_map_style").optJSONArray("style_list");
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("indoor_map");
            if (optJSONObject2 != null) {
                int optInt = optJSONObject2.optInt("enable", -1);
                int optInt2 = optJSONObject2.optInt("type", -1);
                if (optInt != -1 && optInt2 != -1) {
                    this.a = new fp(optInt, optInt2, optJSONObject2.optJSONArray("building_list"));
                }
            }
            JSONObject optJSONObject3 = optJSONObject.optJSONObject("custom_layer");
            if (optJSONObject3 != null) {
                this.d = (pk) JsonUtils.parseToModel(optJSONObject3, pk.class, new Object[0]);
            }
            JSONObject optJSONObject4 = optJSONObject.optJSONObject("event_map");
            if (optJSONObject4 != null) {
                this.e = optJSONObject4.optInt("enable", qz.c);
            }
            this.c = optJSONObject.optJSONObject("data_layer");
        }
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ Void doInBackground(Object[] objArr) {
        boolean a2 = a();
        if (gy.i == 2) {
            this.g.sendEmptyMessageDelayed(10000, 10000L);
        }
        if (a2 || this.b == null) {
            return null;
        }
        fs fsVar = new fs();
        fsVar.f = 3;
        this.b.sendMessage(this.b.obtainMessage(fsVar.f, fsVar));
        return null;
    }
}
