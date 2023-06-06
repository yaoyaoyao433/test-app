package com.dianping.picassocontroller.debug;

import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import com.dianping.jscore.model.JSONBuilder;
import com.dianping.picasso.PicassoEnvironment;
import com.dianping.picassocontroller.debug.g;
import com.meituan.metrics.traffic.reflection.OkHttp3Wrapper;
import com.meituan.passport.api.AbsApiFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.mapsdk.internal.y;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class e extends WebSocketListener {
    public static ChangeQuickRedirect a;
    private static volatile e c;
    public String b;
    private WebSocket d;
    private int e;
    private ArrayList<String> f;
    private String g;
    private Boolean h;
    private g i;
    private OkHttpClient j;

    @Override // okhttp3.WebSocketListener
    public void onMessage(WebSocket webSocket, okio.f fVar) {
        Object[] objArr = {webSocket, fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7bf6a050d1f8dc7c9a711d4efa00c59", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7bf6a050d1f8dc7c9a711d4efa00c59");
        }
    }

    public static e a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c862e038daa03b60f8abf7a35b2ac0ff", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c862e038daa03b60f8abf7a35b2ac0ff");
        }
        if (c == null) {
            synchronized (e.class) {
                if (c == null) {
                    e eVar = new e();
                    c = eVar;
                    eVar.b = "8882";
                }
            }
        }
        return c;
    }

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f525528c99583f4068788865e3606a3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f525528c99583f4068788865e3606a3");
            return;
        }
        this.h = Boolean.FALSE;
        this.i = null;
        this.j = null;
        this.e = 300000;
        this.f = new ArrayList<>();
        this.i = g.a();
        this.j = new OkHttpClient();
    }

    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da2bd1673b544904f00564a6396bf376", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da2bd1673b544904f00564a6396bf376");
            return;
        }
        this.g = str;
        this.b = str2;
        c();
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a35651583c57ad75fdc94e2f60e34dd3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a35651583c57ad75fdc94e2f60e34dd3");
        } else if (this.h.booleanValue()) {
        } else {
            if (TextUtils.isEmpty(this.g)) {
                this.g = "localhost";
            }
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            OkHttp3Wrapper.addInterceptorToBuilder(builder);
            builder.readTimeout(10L, TimeUnit.SECONDS).writeTimeout(10L, TimeUnit.SECONDS).build().newWebSocket(new Request.Builder().url("ws://" + this.g + CommonConstant.Symbol.COLON + this.b + "/app/ws").addHeader("x-support-launch-page", "true").build(), this);
        }
    }

    public final Boolean b() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4fa303cb072edc56fd913e5ebd9bda14", RobustBitConfig.DEFAULT_VALUE)) {
            return (Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4fa303cb072edc56fd913e5ebd9bda14");
        }
        if (this.d != null && this.d.send("ConnectTest")) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public final void a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a36ce5c2c49de863d4187c6c2b48680", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a36ce5c2c49de863d4187c6c2b48680");
            return;
        }
        JSONBuilder jSONBuilder = new JSONBuilder();
        int i2 = this.e;
        this.e = i2 + 1;
        jSONBuilder.put("id", String.valueOf(i2));
        jSONBuilder.put("tag", "1");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", String.valueOf(i));
            jSONObject.put("message", str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        jSONBuilder.put("data", jSONObject);
        a(jSONBuilder.toString());
    }

    public final rx.d<String> a(final String str, JSONObject jSONObject) {
        Object[] objArr = {str, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa5c1809946189f2642e2bfb4776bdfc", RobustBitConfig.DEFAULT_VALUE)) {
            return (rx.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa5c1809946189f2642e2bfb4776bdfc");
        }
        if (!this.h.booleanValue()) {
            return rx.d.a((Object) null);
        }
        return rx.d.a(jSONObject).a(rx.schedulers.a.e()).d(new rx.functions.g<JSONObject, String>() { // from class: com.dianping.picassocontroller.debug.e.1
            public static ChangeQuickRedirect a;

            /* JADX INFO: Access modifiers changed from: private */
            @Override // rx.functions.g
            /* renamed from: a */
            public String call(JSONObject jSONObject2) {
                String next;
                Object[] objArr2 = {jSONObject2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2e4c72799e3028e4394db3542118fd13", RobustBitConfig.DEFAULT_VALUE)) {
                    return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2e4c72799e3028e4394db3542118fd13");
                }
                String str2 = AbsApiFactory.HTTP + e.this.g + CommonConstant.Symbol.COLON + (Integer.parseInt(e.this.b) + 1) + "/" + str;
                ArrayList arrayList = new ArrayList();
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    try {
                        arrayList.add(keys.next() + "=" + jSONObject2.getString(next));
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                if (arrayList.size() > 0) {
                    str2 = str2 + CommonConstant.Symbol.QUESTION_MARK + TextUtils.join("&", arrayList);
                }
                try {
                    Response execute = e.this.j.newCall(new Request.Builder().url(str2).get().build()).execute();
                    if (execute.body() != null) {
                        return execute.body().string();
                    }
                    return null;
                } catch (IOException e2) {
                    e2.printStackTrace();
                    return null;
                }
            }
        });
    }

    @Override // okhttp3.WebSocketListener
    public void onOpen(WebSocket webSocket, Response response) {
        Object[] objArr = {webSocket, response};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "158861d32fe6a1caa68c9573c5c2bc50", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "158861d32fe6a1caa68c9573c5c2bc50");
            return;
        }
        this.d = webSocket;
        this.h = Boolean.TRUE;
        g gVar = this.i;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = g.a;
        if (PatchProxy.isSupport(objArr2, gVar, changeQuickRedirect2, false, "9ea0c15e4e5c30229a56b8e63cf156bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, gVar, changeQuickRedirect2, false, "9ea0c15e4e5c30229a56b8e63cf156bc");
        } else {
            gVar.h = g.b.LIVE_LOAD_ON;
        }
    }

    @Override // okhttp3.WebSocketListener
    public void onMessage(WebSocket webSocket, String str) {
        Object[] objArr = {webSocket, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e55bf7ad948d0cc37b3599e084eec95", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e55bf7ad948d0cc37b3599e084eec95");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optString("tag").equals("2")) {
                String jSONObject2 = jSONObject.optJSONObject("data").toString();
                Object[] objArr2 = {jSONObject2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "423c1daa8e2ba3ddbb2a1ff16577cfdf", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "423c1daa8e2ba3ddbb2a1ff16577cfdf");
                } else if (PicassoEnvironment.globalContext != null) {
                    Intent intent = new Intent();
                    intent.setAction("PicassoJSFileChanged");
                    intent.putExtra("fileChange", jSONObject2);
                    LocalBroadcastManager.getInstance(PicassoEnvironment.globalContext).sendBroadcast(intent);
                }
            }
            if (jSONObject.optString("tag").equals("5")) {
                JSONObject optJSONObject = jSONObject.optJSONObject("data");
                final String optString = optJSONObject == null ? "" : optJSONObject.optString("url");
                if (TextUtils.isEmpty(optString)) {
                    return;
                }
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.dianping.picassocontroller.debug.e.2
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4319398e1782d1e0b6495dd30d5e906b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4319398e1782d1e0b6495dd30d5e906b");
                            return;
                        }
                        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(optString));
                        intent2.setPackage(PicassoEnvironment.globalContext.getPackageName());
                        intent2.addFlags(67108864);
                        intent2.addFlags(y.a);
                        intent2.addFlags(65536);
                        PicassoEnvironment.globalContext.startActivity(intent2);
                    }
                });
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // okhttp3.WebSocketListener
    public void onClosing(WebSocket webSocket, int i, String str) {
        Object[] objArr = {webSocket, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8894350a876ac042813eb072092a49fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8894350a876ac042813eb072092a49fe");
        } else {
            a(1000, "close manually");
        }
    }

    @Override // okhttp3.WebSocketListener
    public void onClosed(WebSocket webSocket, int i, String str) {
        Object[] objArr = {webSocket, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9ae997ee7ff272efa8babe33fdef5b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9ae997ee7ff272efa8babe33fdef5b0");
            return;
        }
        this.i.b();
        this.h = Boolean.FALSE;
    }

    @Override // okhttp3.WebSocketListener
    public void onFailure(WebSocket webSocket, Throwable th, Response response) {
        Object[] objArr = {webSocket, th, response};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df9a0eeaa67590ff9df41edf9f6e869d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df9a0eeaa67590ff9df41edf9f6e869d");
            return;
        }
        this.i.b();
        this.h = Boolean.FALSE;
    }

    private synchronized void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80fda141b74acafd3fb7afca021c75b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80fda141b74acafd3fb7afca021c75b2");
        } else if (this.d == null) {
        } else {
            Iterator<String> it = this.f.iterator();
            while (it.hasNext()) {
                if (this.d.send(it.next())) {
                    it.remove();
                }
            }
            if (!this.d.send(str)) {
                this.f.add(str);
            }
        }
    }

    public final void a(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19746a0993b39878834ac744d86d1952", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19746a0993b39878834ac744d86d1952");
        } else if (this.d != null) {
            this.d.close(i, str);
        }
    }
}
