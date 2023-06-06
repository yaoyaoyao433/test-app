package com.dianping.picassocontroller.debug;

import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import com.dianping.jscore.JSRuntimeException;
import com.dianping.jscore.JavaScriptInterface;
import com.dianping.jscore.SimpleSettableFuture;
import com.dianping.jscore.Value;
import com.dianping.jscore.model.Encoding;
import com.dianping.jscore.model.JSONBuilder;
import com.dianping.picassocontroller.debug.g;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.metrics.traffic.reflection.OkHttp3Wrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import org.json.JSONArray;
import org.json.JSONObject;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class j extends WebSocketListener implements com.dianping.picassocontroller.jse.a {
    public static ChangeQuickRedirect a = null;
    private static final String c = "j";
    private static AtomicInteger g = new AtomicInteger();
    private static a l;
    public SimpleSettableFuture<WebSocket> b;
    private Field d;
    private Field e;
    private Handler f;
    private boolean h;
    private Map<String, JavaScriptInterface> i;
    private Map<String, SimpleSettableFuture<Value>> j;
    private g k;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface a {
    }

    @Override // okhttp3.WebSocketListener
    public void onClosing(WebSocket webSocket, int i, String str) {
        Object[] objArr = {webSocket, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3dcbf347aef839eace57b0d559fb455f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3dcbf347aef839eace57b0d559fb455f");
        }
    }

    @Override // okhttp3.WebSocketListener
    public void onMessage(WebSocket webSocket, okio.f fVar) {
        Object[] objArr = {webSocket, fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28dabd8f991deab9e6788c1e4ac9a320", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28dabd8f991deab9e6788c1e4ac9a320");
        }
    }

    public j(String str, Handler handler) {
        Object[] objArr = {str, handler};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64492ad1c5a0b9483b9da5693d4e20c9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64492ad1c5a0b9483b9da5693d4e20c9");
            return;
        }
        this.h = true;
        this.i = new HashMap();
        this.j = new HashMap();
        this.k = g.a();
        g gVar = this.k;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = g.a;
        if (PatchProxy.isSupport(objArr2, gVar, changeQuickRedirect2, false, "d0a7092d3ebe843806287abc76d546bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, gVar, changeQuickRedirect2, false, "d0a7092d3ebe843806287abc76d546bb");
        } else {
            g.e = g.a.DEBUG_CONNECTING;
            if (gVar.g != null) {
                gVar.g.a();
            }
        }
        this.f = handler;
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        OkHttp3Wrapper.addInterceptorToBuilder(builder);
        builder.readTimeout(10L, TimeUnit.SECONDS).writeTimeout(10L, TimeUnit.SECONDS).build().newWebSocket(new Request.Builder().url("ws://" + str + ":8880/app").build(), this);
        try {
            this.d = Value.class.getDeclaredField("type");
            this.d.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        try {
            this.e = Value.class.getDeclaredField("value");
            this.e.setAccessible(true);
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
        }
        this.b = new SimpleSettableFuture<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(JSONBuilder jSONBuilder) {
        Object[] objArr = {jSONBuilder};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8122a189506c4d5d17ce6e041738fd2b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8122a189506c4d5d17ce6e041738fd2b");
        }
        String valueOf = String.valueOf(g.getAndIncrement());
        jSONBuilder.put("id", valueOf);
        String jSONBuilder2 = jSONBuilder.toString();
        Object[] objArr2 = {jSONBuilder2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d0e635558d230e569ae376601aae57a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d0e635558d230e569ae376601aae57a0");
        } else {
            this.b.get(MetricsAnrManager.ANR_THRESHOLD).send(jSONBuilder2);
            new StringBuilder("send: ").append(jSONBuilder2);
        }
        return valueOf;
    }

    @Override // okhttp3.WebSocketListener
    public void onOpen(WebSocket webSocket, Response response) {
        Object[] objArr = {webSocket, response};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e433db7ee1bfd4f74716d76202e46e49", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e433db7ee1bfd4f74716d76202e46e49");
            return;
        }
        this.b.set(webSocket);
        JSONBuilder jSONBuilder = new JSONBuilder();
        jSONBuilder.put("method", "prepareJSRuntime");
        a(jSONBuilder);
    }

    @Override // okhttp3.WebSocketListener
    public void onMessage(WebSocket webSocket, String str) {
        final Value[] valueArr;
        Object[] objArr = {webSocket, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe13b9f6997791f866f9c79bbbc9ab39", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe13b9f6997791f866f9c79bbbc9ab39");
            return;
        }
        new StringBuilder("onMessage:").append(str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("id");
            String optString2 = jSONObject.optString("method");
            String optString3 = jSONObject.optString("name");
            JSONObject optJSONObject = jSONObject.optJSONObject("result");
            SimpleSettableFuture<Value> simpleSettableFuture = this.j.get(optString);
            if (optString2 != null) {
                if ("executeScript".equals(optString2)) {
                    String d = g.d();
                    if (d.equals(optString3 + ".js") && this.h) {
                        g gVar = this.k;
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = g.a;
                        if (PatchProxy.isSupport(objArr2, gVar, changeQuickRedirect2, false, "9ce5785eb24b53425a81861e8fc5887a", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, gVar, changeQuickRedirect2, false, "9ce5785eb24b53425a81861e8fc5887a");
                        } else {
                            g.e = g.a.DEBUG_ON;
                        }
                        this.h = false;
                    }
                }
                if ("prepareJSRuntime".equals(optString2)) {
                    g gVar2 = this.k;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = g.a;
                    if (PatchProxy.isSupport(objArr3, gVar2, changeQuickRedirect3, false, "ae56a093e4bdfa2cadb8e4aa9f105588", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, gVar2, changeQuickRedirect3, false, "ae56a093e4bdfa2cadb8e4aa9f105588");
                    } else {
                        g.e = g.a.DEBUG_CONNECTING;
                        if (gVar2.g != null) {
                            gVar2.g.b();
                        }
                    }
                }
            }
            if (simpleSettableFuture != null) {
                String optString4 = jSONObject.optString("result");
                if (!TextUtils.isEmpty(optString4) && !"\"\"".equals(optString4)) {
                    if (optString4.startsWith("[") && optString4.endsWith(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT)) {
                        simpleSettableFuture.set(new i(new JSONArray(optString4)).a());
                        return;
                    }
                    if (!optString4.equals("false") && !optString4.equals("true")) {
                        simpleSettableFuture.set(new i(new JSONObject(optString4)).a());
                        return;
                    }
                    simpleSettableFuture.set(new Value(jSONObject.optBoolean("result")));
                    return;
                }
                simpleSettableFuture.set(new Value());
            } else if (optJSONObject != null) {
                String optString5 = optJSONObject.optString("type");
                final String optString6 = optJSONObject.optString("func");
                final String optString7 = optJSONObject.optString("injectId");
                if ("inject".equals(optString5)) {
                    final JavaScriptInterface javaScriptInterface = this.i.get(optString6);
                    if (javaScriptInterface == null) {
                        String str2 = c;
                        Log.e(str2, "Cannot find Injected function :" + optString6);
                        return;
                    }
                    JSONArray optJSONArray = optJSONObject.optJSONArray("arguments");
                    if (optJSONArray == null) {
                        valueArr = new Value[0];
                    } else {
                        Value[] valueArr2 = new Value[optJSONArray.length()];
                        for (int i = 0; i < valueArr2.length; i++) {
                            valueArr2[i] = new i(optJSONArray.opt(i)).a();
                        }
                        valueArr = valueArr2;
                    }
                    rx.d.a(new rx.j<Value>() { // from class: com.dianping.picassocontroller.debug.j.1
                        public static ChangeQuickRedirect a;

                        @Override // rx.e
                        public final void onCompleted() {
                        }

                        @Override // rx.e
                        public final void onError(Throwable th) {
                        }

                        @Override // rx.e
                        public final /* synthetic */ void onNext(Object obj) {
                            Value value = (Value) obj;
                            Object[] objArr4 = {value};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "2ab35a969a4c79b34f2b4330de4e24b1", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "2ab35a969a4c79b34f2b4330de4e24b1");
                            } else if (TextUtils.isEmpty(optString7)) {
                            } else {
                                JSONBuilder jSONBuilder = new JSONBuilder();
                                jSONBuilder.put("method", "injectFunctionResult");
                                jSONBuilder.put("func", optString6);
                                jSONBuilder.put("injectId", optString7);
                                jSONBuilder.put("result", value.getValue());
                                j.this.a(jSONBuilder);
                            }
                        }
                    }, rx.d.a((d.a) new d.a<Value>() { // from class: com.dianping.picassocontroller.debug.j.2
                        public static ChangeQuickRedirect a;

                        @Override // rx.functions.b
                        public final /* synthetic */ void call(Object obj) {
                            rx.j jVar = (rx.j) obj;
                            Object[] objArr4 = {jVar};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "619713b2f7e773bab4a713153854317e", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "619713b2f7e773bab4a713153854317e");
                            } else {
                                jVar.onNext(javaScriptInterface.exec(valueArr));
                            }
                        }
                    }).a(rx.schedulers.a.a()).b(rx.android.schedulers.a.a(this.f.getLooper())));
                }
            }
        } catch (Exception e) {
            Log.e("WebSocket", "onMessage Error: " + str);
            e.printStackTrace();
        }
    }

    @Override // okhttp3.WebSocketListener
    public void onClosed(WebSocket webSocket, int i, String str) {
        Object[] objArr = {webSocket, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8edf3ace7479a8e35d39d67e9d19164b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8edf3ace7479a8e35d39d67e9d19164b");
            return;
        }
        this.k.c();
        this.h = true;
    }

    @Override // okhttp3.WebSocketListener
    public void onFailure(WebSocket webSocket, Throwable th, Response response) {
        Object[] objArr = {webSocket, th, response};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "431389b2776f011264232b424b377927", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "431389b2776f011264232b424b377927");
            return;
        }
        this.k.c();
        this.h = true;
    }

    @Override // com.dianping.picassocontroller.jse.a
    public final void a(String str, JavaScriptInterface javaScriptInterface) {
        Object[] objArr = {str, javaScriptInterface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7accaa153bd52b74d29d4b9bc88ac36", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7accaa153bd52b74d29d4b9bc88ac36");
            return;
        }
        JSONBuilder jSONBuilder = new JSONBuilder();
        jSONBuilder.put("method", "injectFunction");
        JSONBuilder jSONBuilder2 = new JSONBuilder();
        jSONBuilder2.put(str, "");
        jSONBuilder.put("injectFunction", jSONBuilder2.toJSONObject());
        a(jSONBuilder);
        this.i.put(str, javaScriptInterface);
    }

    @Override // com.dianping.picassocontroller.jse.a
    public final void a(String str, Encoding encoding) {
        Object[] objArr = {str, encoding};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1781469675476c70107b3a4e4d5a1c96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1781469675476c70107b3a4e4d5a1c96");
            return;
        }
        JSONBuilder jSONBuilder = new JSONBuilder();
        jSONBuilder.put("method", "injectConst");
        jSONBuilder.put("inject", new JSONBuilder().put(str, encoding.encode()).toJSONObject());
        a(jSONBuilder);
    }

    @Override // com.dianping.picassocontroller.jse.a
    public final void a(String str, String str2) throws JSRuntimeException {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f62d71f590042a5c445062d6cca1acd8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f62d71f590042a5c445062d6cca1acd8");
            return;
        }
        JSONBuilder jSONBuilder = new JSONBuilder();
        jSONBuilder.put("method", "executeScript");
        jSONBuilder.put("content", str);
        jSONBuilder.put("name", str2);
        SimpleSettableFuture<Value> simpleSettableFuture = new SimpleSettableFuture<>();
        this.j.put(a(jSONBuilder), simpleSettableFuture);
        simpleSettableFuture.get(100000L);
    }

    @Override // com.dianping.picassocontroller.jse.a
    public final Value a(String str, String str2, Value[] valueArr) throws JSRuntimeException {
        Object[] objArr = {str, str2, valueArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e09c3847fde2bee1229c1de807d2ecc9", RobustBitConfig.DEFAULT_VALUE)) {
            return (Value) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e09c3847fde2bee1229c1de807d2ecc9");
        }
        JSONBuilder jSONBuilder = new JSONBuilder();
        jSONBuilder.put("method", str2);
        JSONArray jSONArray = new JSONArray();
        for (Value value : valueArr) {
            jSONArray.put(a(value));
        }
        jSONBuilder.put("arguments", jSONArray);
        SimpleSettableFuture<Value> simpleSettableFuture = new SimpleSettableFuture<>();
        this.j.put(a(jSONBuilder), simpleSettableFuture);
        return simpleSettableFuture.get(100000L);
    }

    private Object a(Value value) {
        Object[] objArr = {value};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f2726797dd1cf0d6acc266fc36ebb19", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f2726797dd1cf0d6acc266fc36ebb19");
        }
        try {
            int i = this.d.getInt(value);
            String str = (String) this.e.get(value);
            switch (i) {
                case 0:
                    return JSONObject.NULL;
                case 1:
                    return Double.valueOf(str);
                case 2:
                    return Boolean.valueOf(str);
                case 3:
                default:
                    return str;
                case 4:
                    return new JSONObject(str);
                case 5:
                    return new JSONArray(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return JSONObject.NULL;
        }
    }

    public static void a(a aVar) {
        l = aVar;
    }
}
