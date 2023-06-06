package com.dianping.jscore;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.support.annotation.NonNull;
import com.meituan.android.soloader.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class DPJSExecutor {
    public static ChangeQuickRedirect changeQuickRedirect;
    private JSExecutor mJSExecutor;
    private final Handler mJSHandler;
    private final Handler mUIHandler;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface Result {
        void onException(JSRuntimeException jSRuntimeException);

        void onResult(Value value);
    }

    public DPJSExecutor(@NonNull Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6efbba036e6521f184795c7cad93bca8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6efbba036e6521f184795c7cad93bca8");
            return;
        }
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        final Context applicationContext = context.getApplicationContext();
        this.mJSHandler = new Handler(handlerThread.getLooper());
        this.mJSHandler.post(new Runnable() { // from class: com.dianping.jscore.DPJSExecutor.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "fa27dc4c28886f03f5298ebcf45081d6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "fa27dc4c28886f03f5298ebcf45081d6");
                    return;
                }
                if (SOLibraryLoader.sContext == null) {
                    SOLibraryLoader.sContext = applicationContext;
                }
                k.a(applicationContext, false);
                DPJSExecutor.this.mJSExecutor = JSExecutor.create();
            }
        });
        this.mUIHandler = new Handler(context.getMainLooper());
    }

    public DPJSExecutor(Context context) {
        this(context, "dp_js");
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "16e4c2b237e3c6675d4cdaef42c41b71", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "16e4c2b237e3c6675d4cdaef42c41b71");
        }
    }

    public void exec(final String str, final Result result) {
        Object[] objArr = {str, result};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8549ef8675d1478b8042c78711bd5856", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8549ef8675d1478b8042c78711bd5856");
        } else {
            this.mJSHandler.post(new Runnable() { // from class: com.dianping.jscore.DPJSExecutor.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1f5972e33373c9491fd3e6707002b918", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1f5972e33373c9491fd3e6707002b918");
                        return;
                    }
                    try {
                        final byte[] executeJSForBinary = DPJSExecutor.this.mJSExecutor.executeJSForBinary(str, "unknown");
                        if (result != null) {
                            DPJSExecutor.this.mUIHandler.post(new Runnable() { // from class: com.dianping.jscore.DPJSExecutor.2.1
                                public static ChangeQuickRedirect changeQuickRedirect;

                                @Override // java.lang.Runnable
                                public void run() {
                                    Object[] objArr3 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "3ea582286e4bc64e81e8519759ca5b59", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "3ea582286e4bc64e81e8519759ca5b59");
                                    } else {
                                        result.onResult(new Value(executeJSForBinary));
                                    }
                                }
                            });
                        }
                    } catch (JSRuntimeException e) {
                        if (result != null) {
                            DPJSExecutor.this.mUIHandler.post(new Runnable() { // from class: com.dianping.jscore.DPJSExecutor.2.2
                                public static ChangeQuickRedirect changeQuickRedirect;

                                @Override // java.lang.Runnable
                                public void run() {
                                    Object[] objArr3 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "164df89867a5cb3c4b0e136d775351f1", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "164df89867a5cb3c4b0e136d775351f1");
                                    } else {
                                        result.onException(e);
                                    }
                                }
                            });
                        }
                    }
                }
            });
        }
    }

    public void invokeMethod(final Result result, final String str, Object... objArr) {
        Object[] objArr2 = {result, str, objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "45056a083eeb0f0d1fab4bb25024711d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "45056a083eeb0f0d1fab4bb25024711d");
            return;
        }
        final ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj == null) {
                arrayList.add(new Value());
            } else if (obj instanceof JSONObject) {
                arrayList.add(new Value((JSONObject) obj));
            } else if (obj instanceof String) {
                arrayList.add(new Value((String) obj));
            } else if (obj instanceof Integer) {
                arrayList.add(new Value(((Integer) obj).intValue()));
            } else if (obj instanceof Double) {
                arrayList.add(new Value(((Double) obj).doubleValue()));
            } else if (obj instanceof Boolean) {
                arrayList.add(new Value(((Boolean) obj).booleanValue()));
            } else if (obj instanceof Value) {
                arrayList.add((Value) obj);
            } else {
                arrayList.add(new Value(String.valueOf(obj)));
            }
        }
        this.mJSHandler.post(new Runnable() { // from class: com.dianping.jscore.DPJSExecutor.3
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a49f4d2d26f5ba09e74662aa8ee1bdf6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a49f4d2d26f5ba09e74662aa8ee1bdf6");
                    return;
                }
                try {
                    final byte[] invokeMethod = DPJSExecutor.this.mJSExecutor.invokeMethod(null, str, (Value[]) arrayList.toArray(new Value[0]));
                    if (result != null) {
                        DPJSExecutor.this.mUIHandler.post(new Runnable() { // from class: com.dianping.jscore.DPJSExecutor.3.1
                            public static ChangeQuickRedirect changeQuickRedirect;

                            @Override // java.lang.Runnable
                            public void run() {
                                Object[] objArr4 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "9528dd4afc12193c98120ced81cbb135", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "9528dd4afc12193c98120ced81cbb135");
                                } else {
                                    result.onResult(new Value(invokeMethod));
                                }
                            }
                        });
                    }
                } catch (JSRuntimeException e) {
                    if (result != null) {
                        DPJSExecutor.this.mUIHandler.post(new Runnable() { // from class: com.dianping.jscore.DPJSExecutor.3.2
                            public static ChangeQuickRedirect changeQuickRedirect;

                            @Override // java.lang.Runnable
                            public void run() {
                                Object[] objArr4 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "cf09d79e206c6d8d87eb13607c03608d", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "cf09d79e206c6d8d87eb13607c03608d");
                                } else {
                                    result.onException(e);
                                }
                            }
                        });
                    }
                }
            }
        });
    }

    public void addAsyncJSInterface(final String str, final JavaScriptInterface javaScriptInterface) {
        Object[] objArr = {str, javaScriptInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "424add930db1e08e8c8c35b9081b2bac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "424add930db1e08e8c8c35b9081b2bac");
        } else {
            this.mJSHandler.post(new Runnable() { // from class: com.dianping.jscore.DPJSExecutor.4
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5820e34f9a765c7c5cc9c1d7e2f24a92", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5820e34f9a765c7c5cc9c1d7e2f24a92");
                    } else {
                        DPJSExecutor.this.mJSExecutor.addJavaScriptInterface(str, javaScriptInterface);
                    }
                }
            });
        }
    }

    public void inject(final String str, final Value value) {
        Object[] objArr = {str, value};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d1e6d0b7aa45e4ce24dff72b9b74c195", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d1e6d0b7aa45e4ce24dff72b9b74c195");
        } else {
            this.mJSHandler.post(new Runnable() { // from class: com.dianping.jscore.DPJSExecutor.5
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "af7c3c2b3aa29c2617b33bd6093de256", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "af7c3c2b3aa29c2617b33bd6093de256");
                    } else {
                        DPJSExecutor.this.mJSExecutor.injectGlobalJSObject(str, value);
                    }
                }
            });
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.dianping.jscore.DPJSExecutor$6  reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass6 implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;
        public final /* synthetic */ JavaScriptInterface val$jsInterface;
        public final /* synthetic */ String val$name;

        public AnonymousClass6(String str, JavaScriptInterface javaScriptInterface) {
            this.val$name = str;
            this.val$jsInterface = javaScriptInterface;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "941bcefe408ea44fcdb3d5d4dd3dd1f0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "941bcefe408ea44fcdb3d5d4dd3dd1f0");
            } else {
                DPJSExecutor.this.mJSExecutor.addJavaScriptInterface(this.val$name, new JavaScriptInterface() { // from class: com.dianping.jscore.DPJSExecutor.6.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.dianping.jscore.JavaScriptInterface
                    public Value exec(final Value[] valueArr) {
                        Object[] objArr2 = {valueArr};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e8511ad49b4f7a740fc103425d352fff", RobustBitConfig.DEFAULT_VALUE)) {
                            return (Value) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e8511ad49b4f7a740fc103425d352fff");
                        }
                        final SimpleSettableFuture simpleSettableFuture = new SimpleSettableFuture();
                        DPJSExecutor.this.mUIHandler.post(new Runnable() { // from class: com.dianping.jscore.DPJSExecutor.6.1.1
                            public static ChangeQuickRedirect changeQuickRedirect;

                            @Override // java.lang.Runnable
                            public void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "3ec71978a8fd6fba5145277839c6506d", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "3ec71978a8fd6fba5145277839c6506d");
                                    return;
                                }
                                simpleSettableFuture.set(AnonymousClass6.this.val$jsInterface.exec(valueArr));
                            }
                        });
                        return (Value) simpleSettableFuture.get(10000L);
                    }
                });
            }
        }
    }

    public void addUIJSInterface(String str, JavaScriptInterface javaScriptInterface) {
        Object[] objArr = {str, javaScriptInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9da15960c4872ed0af4677b60cb71351", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9da15960c4872ed0af4677b60cb71351");
        } else {
            this.mJSHandler.post(new AnonymousClass6(str, javaScriptInterface));
        }
    }

    public void destroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "691a69e57d551c680556a3841ecff1e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "691a69e57d551c680556a3841ecff1e1");
        } else {
            this.mJSHandler.post(new Runnable() { // from class: com.dianping.jscore.DPJSExecutor.7
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "dd703050c033970d53e93de01c75cda8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "dd703050c033970d53e93de01c75cda8");
                    } else {
                        DPJSExecutor.this.mJSExecutor.destroy();
                    }
                }
            });
        }
    }

    public Handler getJSHandler() {
        return this.mJSHandler;
    }

    public JSExecutor getJSExecutor() {
        return this.mJSExecutor;
    }
}
