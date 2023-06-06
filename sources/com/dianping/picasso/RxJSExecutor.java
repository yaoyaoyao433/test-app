package com.dianping.picasso;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import com.dianping.codelog.b;
import com.dianping.jscore.JSExecutor;
import com.dianping.jscore.JSRuntimeException;
import com.dianping.jscore.JavaScriptInterface;
import com.dianping.jscore.Value;
import com.dianping.picasso.model.PicassoValue;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Locale;
import org.json.JSONObject;
import rx.android.schedulers.a;
import rx.d;
import rx.functions.g;
import rx.j;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class RxJSExecutor {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final String JS_LAYOUT;
    private final int coreNumber;
    private int index;
    private HashMap<Looper, JSExecutor> mExecutors;
    private SparseArray<Looper> mLoopers;

    public RxJSExecutor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f4e177a7db414d738e68012340d19b5c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f4e177a7db414d738e68012340d19b5c");
            return;
        }
        this.mLoopers = new SparseArray<>();
        this.mExecutors = new HashMap<>();
        this.index = 0;
        this.JS_LAYOUT = "var picassoData=decodeURIComponent(\"%s\".replace(/\\+/g,\" \")); %s.layout(%s,JSON.parse(picassoData),%s).info();";
        if (i < 0 || i > 8) {
            throw new RuntimeException("Parameter coreNum should between 1 to 8");
        }
        this.coreNumber = i;
        final Object obj = new Object();
        for (int i2 = 0; i2 < this.coreNumber; i2++) {
            HandlerThread handlerThread = new HandlerThread("dp_js" + i2);
            handlerThread.start();
            final Looper looper = handlerThread.getLooper();
            this.mLoopers.put(i2, looper);
            this.mExecutors.put(looper, null);
            new Handler(looper).post(new Runnable() { // from class: com.dianping.picasso.RxJSExecutor.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f6eb2e11301732946d4ce114b08bd6ec", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f6eb2e11301732946d4ce114b08bd6ec");
                        return;
                    }
                    synchronized (obj) {
                        RxJSExecutor.this.mExecutors.put(looper, JSExecutor.create());
                    }
                }
            });
        }
    }

    public void injectJSValue(final String str, final Value value) {
        Object[] objArr = {str, value};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1ce8926d9958dce6c9075bdcc6d6d685", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1ce8926d9958dce6c9075bdcc6d6d685");
            return;
        }
        for (final Looper looper : this.mExecutors.keySet()) {
            d.a((d.a) new d.a<Object>() { // from class: com.dianping.picasso.RxJSExecutor.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // rx.functions.b
                public void call(j<? super Object> jVar) {
                    Object[] objArr2 = {jVar};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b020421ae9744799c8396a9c1cd5778d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b020421ae9744799c8396a9c1cd5778d");
                    } else {
                        RxJSExecutor.this.getJSExecutor(looper).injectGlobalJSObject(str, value);
                    }
                }
            }).b(a.a(looper)).f();
        }
    }

    public void injectJavaScriptInterface(final String str, final JavaScriptInterface javaScriptInterface) {
        Object[] objArr = {str, javaScriptInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "becad210a41e271983f3e1f0273f8e8d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "becad210a41e271983f3e1f0273f8e8d");
            return;
        }
        for (final Looper looper : this.mExecutors.keySet()) {
            d.a((d.a) new d.a<Object>() { // from class: com.dianping.picasso.RxJSExecutor.3
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // rx.functions.b
                public void call(j<? super Object> jVar) {
                    Object[] objArr2 = {jVar};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "646418ba495b271e1fe248982f4bdf56", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "646418ba495b271e1fe248982f4bdf56");
                    } else {
                        RxJSExecutor.this.getJSExecutor(looper).addJavaScriptInterface(str, javaScriptInterface);
                    }
                }
            }).b(a.a(looper)).f();
        }
    }

    public void loadJSCode(final String str, final String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5802b3f0529ee1ca6fd36a04df354b52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5802b3f0529ee1ca6fd36a04df354b52");
            return;
        }
        for (final Looper looper : this.mExecutors.keySet()) {
            d.a((d.a) new d.a<Object>() { // from class: com.dianping.picasso.RxJSExecutor.4
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // rx.functions.b
                public void call(j<? super Object> jVar) {
                    Object[] objArr2 = {jVar};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "06017b11ced7c7ff68bc008bf52465ce", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "06017b11ced7c7ff68bc008bf52465ce");
                        return;
                    }
                    try {
                        RxJSExecutor.this.getJSExecutor(looper).executeJSForBinary(str, str2);
                    } catch (JSRuntimeException e) {
                        e.printStackTrace();
                        b.b(RxJSExecutor.class, "JS Exception", "JS Exception:" + e.getMessage());
                    }
                }
            }).b(a.a(looper)).f();
        }
    }

    public int count() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2a5ee4dc0dfc3169d8b0b855d03c563d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2a5ee4dc0dfc3169d8b0b855d03c563d")).intValue();
        }
        if (this.index == 1024) {
            this.index = 0;
        }
        int i = this.index;
        this.index = i + 1;
        return i;
    }

    public d<Value> exec(final PicassoInput picassoInput, final String str, int i) {
        Object[] objArr = {picassoInput, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ba8a7b1b85bb781c2f8ef4c0fa7085e0", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ba8a7b1b85bb781c2f8ef4c0fa7085e0");
        }
        final Looper looper = getLooper(i);
        return d.a(picassoInput.jsonData).d(new g<String, Value>() { // from class: com.dianping.picasso.RxJSExecutor.5
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // rx.functions.g
            public Value call(String str2) {
                Object[] objArr2 = {str2};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "295a0419fbcaa1c41f2a2b299935ddce", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Value) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "295a0419fbcaa1c41f2a2b299935ddce");
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("width", picassoInput.width);
                    jSONObject.put("height", picassoInput.height);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                String str3 = null;
                try {
                    str3 = URLEncoder.encode(picassoInput.jsonData, "UTF-8");
                } catch (Exception unused) {
                }
                Locale locale = Locale.getDefault();
                Object[] objArr3 = new Object[4];
                objArr3[0] = str3;
                objArr3[1] = picassoInput.name;
                objArr3[2] = jSONObject.toString();
                objArr3[3] = picassoInput.userDefined == null ? "{}" : picassoInput.userDefined.toString();
                String format = String.format(locale, "var picassoData=decodeURIComponent(\"%s\".replace(/\\+/g,\" \")); %s.layout(%s,JSON.parse(picassoData),%s).info();", objArr3);
                if (picassoInput.lastLayoutString == null || !picassoInput.lastLayoutString.equals(picassoInput.layoutString)) {
                    picassoInput.lastLayoutString = picassoInput.layoutString;
                    format = picassoInput.layoutString + ";\n" + format;
                }
                try {
                    return new PicassoValue(RxJSExecutor.this.getJSExecutor(looper).executeJSForBinary(format, str));
                } catch (JSRuntimeException e2) {
                    e2.printStackTrace();
                    picassoInput.computeError = e2;
                    b.b(RxJSExecutor.class, "JS Exception", "RXJSExecutor JS Name:" + str + " \nRXJSExecutor JS Exception:" + e2.getMessage());
                    return new Value();
                }
            }
        }).b(a.a(looper));
    }

    @Deprecated
    public JSExecutor getJSExecutor(Looper looper) {
        Object[] objArr = {looper};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a04e68f2da3a470b3550ea5b6efc6563", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSExecutor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a04e68f2da3a470b3550ea5b6efc6563");
        }
        JSExecutor jSExecutor = this.mExecutors.get(looper);
        if (jSExecutor == null) {
            Log.e("RxJSExecutor", "getJSExecutor:null");
            for (JSExecutor jSExecutor2 : this.mExecutors.values()) {
                if (jSExecutor2 != null) {
                    return jSExecutor2;
                }
            }
        }
        return jSExecutor;
    }

    public Looper getLooper(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1af1a55c05d965962b5589258982f89c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Looper) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1af1a55c05d965962b5589258982f89c");
        }
        Looper looper = this.mLoopers.get(i % this.coreNumber);
        return looper == null ? this.mLoopers.get(0) : looper;
    }

    public void destroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c44afbed2ed40890be196c6ea5704b7e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c44afbed2ed40890be196c6ea5704b7e");
            return;
        }
        for (final Looper looper : this.mExecutors.keySet()) {
            d.a((d.a) new d.a<Object>() { // from class: com.dianping.picasso.RxJSExecutor.6
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // rx.functions.b
                public void call(j<? super Object> jVar) {
                    Object[] objArr2 = {jVar};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "60cb16177f314d9ac9775ed90513098f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "60cb16177f314d9ac9775ed90513098f");
                        return;
                    }
                    JSExecutor jSExecutor = RxJSExecutor.this.getJSExecutor(looper);
                    if (jSExecutor != null) {
                        jSExecutor.destroy();
                    }
                }
            }).b(a.a(looper)).f();
        }
        this.mExecutors.clear();
    }

    public void finalize() throws Throwable {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fbe9e8fd74a450923e5945a7d5e8c66f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fbe9e8fd74a450923e5945a7d5e8c66f");
            return;
        }
        for (final Looper looper : this.mExecutors.keySet()) {
            d.a((d.a) new d.a<Object>() { // from class: com.dianping.picasso.RxJSExecutor.7
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // rx.functions.b
                public void call(j<? super Object> jVar) {
                    Object[] objArr2 = {jVar};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "cd3866403a912a8396b8661f627088ec", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "cd3866403a912a8396b8661f627088ec");
                    } else {
                        RxJSExecutor.this.getJSExecutor(looper).destroy();
                    }
                }
            }).b(a.a(looper)).f();
        }
        this.mExecutors.clear();
        super.finalize();
    }

    @Deprecated
    public void execSync(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4f829bd493e483502407748fe129b7a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4f829bd493e483502407748fe129b7a2");
            return;
        }
        for (Looper looper : this.mExecutors.keySet()) {
            getJSExecutor(looper).execJS(str, "unknown");
        }
    }

    public d<Value> invokeMethod(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ae6e4fa72f5a6d92d850e437159ff670", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ae6e4fa72f5a6d92d850e437159ff670");
        }
        String str2 = str + "(%s)";
        StringBuilder sb = new StringBuilder();
        for (Object obj : objArr) {
            if (obj instanceof String) {
                obj = String.format(Locale.getDefault(), "\"%s\"", obj);
            }
            sb.append(String.valueOf(obj));
            sb.append(CommonConstant.Symbol.COMMA);
        }
        if (objArr.length > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        String format = String.format(str2, sb.toString());
        final Looper looper = getLooper(this.index);
        return d.a(format).d(new g<String, Value>() { // from class: com.dianping.picasso.RxJSExecutor.8
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // rx.functions.g
            public Value call(String str3) {
                Object[] objArr3 = {str3};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b3d2cfda41958f0b7568cad602ccab8f", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Value) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b3d2cfda41958f0b7568cad602ccab8f");
                }
                try {
                    return new PicassoValue(RxJSExecutor.this.getJSExecutor(looper).executeJSForBinary(str3, "unknown"));
                } catch (JSRuntimeException e) {
                    e.printStackTrace();
                    b.b(RxJSExecutor.class, "JS Exception", "RXJSExecutor JS Exception:" + e.getMessage());
                    return new Value();
                }
            }
        }).b(a.a(looper));
    }
}
