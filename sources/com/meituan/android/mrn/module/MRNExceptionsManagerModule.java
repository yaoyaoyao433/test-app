package com.meituan.android.mrn.module;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.kitefly.Log;
import com.meituan.android.common.sniffer.db.SnifferDBHelper;
import com.meituan.android.mrn.engine.e;
import com.meituan.android.mrn.engine.k;
import com.meituan.android.mrn.monitor.MRNJsErrorReporter;
import com.meituan.android.mrn.monitor.g;
import com.meituan.android.mrn.monitor.j;
import com.meituan.android.mrn.utils.LogUtils;
import com.meituan.android.mrn.utils.c;
import com.meituan.android.mrn.utils.p;
import com.meituan.android.mrn.utils.s;
import com.meituan.android.mrn.utils.u;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@ReactModule(name = MRNExceptionsManagerModule.NAME)
/* loaded from: classes2.dex */
public class MRNExceptionsManagerModule extends ReactContextBaseJavaModule {
    private static final String MRN_INIT_ERROR_MSG = "Module AppRegistry is not a registered callable module (calling runApplication)";
    public static final String NAME = "ExceptionsManager";
    public static ChangeQuickRedirect changeQuickRedirect;
    private WeakHashMap<com.meituan.android.mrn.container.b, a> exceptionHandlerMap;
    private volatile boolean hasReportFatalError;
    private List<com.meituan.android.mrn.engine.b> jsCallExceptionHandlers;
    private final com.facebook.react.devsupport.interfaces.b mDevSupportManager;
    private final k mrnInstance;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
        boolean a(String str, ReadableArray readableArray);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public boolean canOverrideExistingModule() {
        return true;
    }

    @ReactMethod
    public void dismissRedbox() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a069416910dd7e5d6bc0c63f78d98f0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a069416910dd7e5d6bc0c63f78d98f0f");
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void updateExceptionMessage(String str, ReadableArray readableArray, double d) {
        Object[] objArr = {str, readableArray, Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "88bf96bd43a0d1a254abb36b169c17f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "88bf96bd43a0d1a254abb36b169c17f5");
        }
    }

    public MRNExceptionsManagerModule(ReactApplicationContext reactApplicationContext, k kVar, com.facebook.react.devsupport.interfaces.b bVar) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext, kVar, bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7679610ec9c410cc1e49f28e53083652", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7679610ec9c410cc1e49f28e53083652");
            return;
        }
        this.jsCallExceptionHandlers = new ArrayList();
        this.exceptionHandlerMap = new WeakHashMap<>();
        if (kVar == null) {
            throw new RuntimeException("MRNExceptionsManagerModule mrnInstance can not be null");
        }
        this.mrnInstance = kVar;
        this.mDevSupportManager = bVar;
    }

    @ReactMethod
    public void reportFatalException(String str, ReadableArray readableArray, double d) {
        Object[] objArr = {str, readableArray, Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5349824cede742cc0ac86b526eabfc45", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5349824cede742cc0ac86b526eabfc45");
            return;
        }
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.putString("message", str);
        javaOnlyMap.putArray("stack", readableArray);
        javaOnlyMap.putInt("id", (int) d);
        javaOnlyMap.putBoolean("isFatal", true);
        reportException(javaOnlyMap);
    }

    @ReactMethod
    public void reportSoftException(String str, ReadableArray readableArray, double d) {
        Object[] objArr = {str, readableArray, Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fb6cb03f147e682e031ad9a63f65f607", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fb6cb03f147e682e031ad9a63f65f607");
            return;
        }
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.putString("message", str);
        javaOnlyMap.putArray("stack", readableArray);
        javaOnlyMap.putInt("id", (int) d);
        javaOnlyMap.putBoolean("isFatal", false);
        reportException(javaOnlyMap);
    }

    @ReactMethod
    public void reportException(ReadableMap readableMap) {
        boolean z = false;
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "878b17cf0deeefdd90afa40379344c5c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "878b17cf0deeefdd90afa40379344c5c");
            return;
        }
        String string = readableMap.hasKey("message") ? readableMap.getString("message") : "";
        ReadableArray array = readableMap.hasKey("stack") ? readableMap.getArray("stack") : Arguments.createArray();
        int i = readableMap.hasKey("id") ? readableMap.getInt("id") : -1;
        if (readableMap.hasKey("isFatal") && readableMap.getBoolean("isFatal")) {
            z = true;
        }
        showOrThrowError(!z, string, array, i, readableMap.hasKey("extraData") ? readableMap.getMap("extraData") : null);
    }

    private void showOrThrowError(boolean z, String str, ReadableArray readableArray, int i, ReadableMap readableMap) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str, readableArray, Integer.valueOf(i), readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6c4976722222bddbdc80760c021d7a00", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6c4976722222bddbdc80760c021d7a00");
        } else if (com.meituan.android.mrn.debug.a.b()) {
        } else {
            try {
                handleException(getReactApplicationContext(), this.mrnInstance, new b(z, str, readableArray, readableMap));
            } catch (Throwable th) {
                th.printStackTrace();
                c.a("[MRNExceptionsManagerModule@showOrThrowError]", th);
            }
        }
    }

    private void handleException(Context context, k kVar, b bVar) {
        Object[] objArr = {context, kVar, bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5b725aa0e6ae9ab6ea97ff9132f37bfe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5b725aa0e6ae9ab6ea97ff9132f37bfe");
            return;
        }
        p.a("[MRNExceptionsManagerModule@handleException]", kVar + StringUtil.SPACE + bVar);
        if (bVar == null) {
            return;
        }
        synchronized (this) {
            if (this.jsCallExceptionHandlers != null && this.jsCallExceptionHandlers.size() > 0) {
                for (com.meituan.android.mrn.engine.b bVar2 : this.jsCallExceptionHandlers) {
                    if (bVar2 != null) {
                        bVar2.a(bVar.c, bVar.d);
                    }
                }
            }
        }
        if (bVar.b) {
            reportError(context, kVar, bVar, true, false);
        } else if (!this.hasReportFatalError) {
            this.hasReportFatalError = true;
            a aVar = this.exceptionHandlerMap.get(u.a(getReactApplicationContext()));
            if (aVar != null) {
                if (aVar.a(bVar.c, bVar.d)) {
                    reportError(context, kVar, bVar, false, true);
                    return;
                } else {
                    reportError(context, kVar, bVar, true, false);
                    return;
                }
            }
            reportError(context, kVar, bVar, true, false);
            showErrorView();
        } else {
            reportError(context, kVar, bVar, false, false);
        }
    }

    public static void reportError(Context context, k kVar, b bVar, boolean z, boolean z2) {
        char c;
        int i;
        Object[] objArr = {context, kVar, bVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "772070fb9558e76b2a0d68a4cce55444", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "772070fb9558e76b2a0d68a4cce55444");
        } else if (bVar == null) {
        } else {
            bVar.f = z;
            bVar.g = z2;
            if (!bVar.b && kVar != null) {
                kVar.f = com.meituan.android.mrn.engine.p.ERROR;
            }
            bVar.h = getBusinessMetricsTag(kVar);
            final j a2 = j.a(context);
            final MRNJsErrorReporter a3 = MRNJsErrorReporter.a();
            final JSONObject a4 = a2.a(context, kVar, bVar);
            final JSONObject a5 = a3.a(context, kVar, bVar);
            final LogUtils a6 = LogUtils.a();
            final LogUtils.a aVar = new LogUtils.a() { // from class: com.meituan.android.mrn.module.MRNExceptionsManagerModule.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.mrn.utils.LogUtils.a
                public final void a(final String str) {
                    Object[] objArr2 = {str};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a398f0ace4263367c2fffeb9ef90f52f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a398f0ace4263367c2fffeb9ef90f52f");
                        return;
                    }
                    final j jVar = j.this;
                    JSONObject jSONObject = a4;
                    Object[] objArr3 = {jSONObject, str};
                    ChangeQuickRedirect changeQuickRedirect4 = j.a;
                    if (PatchProxy.isSupport(objArr3, jVar, changeQuickRedirect4, false, "b4bc3dad0c48e7bb75cb784cc003f5db", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, jVar, changeQuickRedirect4, false, "b4bc3dad0c48e7bb75cb784cc003f5db");
                    } else if (jSONObject != null) {
                        String optString = jSONObject.optString("content");
                        try {
                            jSONObject.put("content", optString + "\nReactNativeJNI信息：\n" + str);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        final String optString2 = jSONObject.optString("project");
                        final JSONArray jSONArray = new JSONArray();
                        jSONArray.put(jSONObject);
                        try {
                            com.sankuai.waimai.launcher.util.aop.b.a(jVar.c, new Runnable() { // from class: com.meituan.android.mrn.monitor.j.1
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr4 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect5 = a;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect5, false, "dab7ed50fb340588f0b533d21b8196ff", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect5, false, "dab7ed50fb340588f0b533d21b8196ff");
                                        return;
                                    }
                                    try {
                                        j.this.f.log(optString2, "1", jSONArray.toString()).f();
                                    } catch (Throwable th) {
                                        com.meituan.android.mrn.utils.c.a("[MRNJsErrorCatReporter@reportJsCrash@run]", th);
                                    }
                                }
                            });
                        } catch (Exception e2) {
                            com.facebook.common.logging.a.d(j.b, e2.getMessage(), e2);
                        }
                    }
                    final MRNJsErrorReporter mRNJsErrorReporter = a3;
                    final JSONObject jSONObject2 = a5;
                    Object[] objArr4 = {jSONObject2, str};
                    ChangeQuickRedirect changeQuickRedirect5 = MRNJsErrorReporter.a;
                    if (PatchProxy.isSupport(objArr4, mRNJsErrorReporter, changeQuickRedirect5, false, "552c0f19dd0a8f58eb9821f909b830dc", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, mRNJsErrorReporter, changeQuickRedirect5, false, "552c0f19dd0a8f58eb9821f909b830dc");
                    } else if (jSONObject2 != null) {
                        mRNJsErrorReporter.b.execute(new Runnable() { // from class: com.meituan.android.mrn.monitor.MRNJsErrorReporter.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr5 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect6 = a;
                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect6, false, "d1daae45db3dcff3357387cbf3b7efb4", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect6, false, "d1daae45db3dcff3357387cbf3b7efb4");
                                    return;
                                }
                                try {
                                    JSONArray jSONArray2 = new JSONArray();
                                    JSONObject jSONObject3 = jSONObject2;
                                    jSONObject3.put(SnifferDBHelper.COLUMN_LOG, jSONObject2.optString(SnifferDBHelper.COLUMN_LOG) + "\nReactNativeJNI错误信息: \n" + str);
                                    jSONArray2.put(jSONObject2);
                                    MRNJsErrorReporter.a(MRNJsErrorReporter.this, jSONArray2.toString());
                                } catch (Throwable unused) {
                                }
                            }
                        });
                    }
                }
            };
            Object[] objArr2 = {"ReactNativeJNI", "E", aVar};
            ChangeQuickRedirect changeQuickRedirect3 = LogUtils.a;
            if (PatchProxy.isSupport(objArr2, a6, changeQuickRedirect3, false, "a27001ce3520438715e035434f5043b7", RobustBitConfig.DEFAULT_VALUE)) {
                c = 0;
                PatchProxy.accessDispatch(objArr2, a6, changeQuickRedirect3, false, "a27001ce3520438715e035434f5043b7");
            } else {
                c = 0;
                LogUtils.b.execute(new Runnable() { // from class: com.meituan.android.mrn.utils.LogUtils.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Process process;
                        InputStreamReader inputStreamReader;
                        int i2 = 0;
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "c5bf96c3cc2d98c1387ffffccc0f49c2", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "c5bf96c3cc2d98c1387ffffccc0f49c2");
                            return;
                        }
                        StringBuffer stringBuffer = new StringBuffer();
                        String str = "";
                        BufferedReader bufferedReader = null;
                        try {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add("logcat");
                            arrayList.add("-d");
                            arrayList.add("-v");
                            arrayList.add("time");
                            arrayList.add("-s");
                            arrayList.add(String.format("%s:%s", r2, r3));
                            process = Runtime.getRuntime().exec((String[]) arrayList.toArray(new String[arrayList.size()]));
                            try {
                                inputStreamReader = new InputStreamReader(process.getInputStream());
                                try {
                                    try {
                                        BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader);
                                        boolean z3 = false;
                                        do {
                                            try {
                                                String readLine = bufferedReader2.readLine();
                                                if (readLine == null) {
                                                    break;
                                                }
                                                new StringBuilder("[LogUtils@run] str: ").append(readLine);
                                                z3 = (!readLine.startsWith("--------- beginning of") || i2 > 3) ? true : true;
                                                stringBuffer.append(readLine);
                                                stringBuffer.append(StringUtil.CRLF_STRING);
                                                i2++;
                                            } catch (Exception e) {
                                                e = e;
                                                bufferedReader = bufferedReader2;
                                                c.a("[LogUtils@reportLog@run]", e);
                                                if (bufferedReader != null) {
                                                    try {
                                                        bufferedReader.close();
                                                    } catch (IOException e2) {
                                                        c.a("[LogUtils@reportLog@run]", e2);
                                                    }
                                                }
                                                if (inputStreamReader != null) {
                                                    try {
                                                        inputStreamReader.close();
                                                    } catch (IOException e3) {
                                                        c.a("[LogUtils@reportLog@run]", e3);
                                                    }
                                                }
                                                if (process != null) {
                                                    process.destroy();
                                                }
                                                if (aVar == null) {
                                                    return;
                                                }
                                                aVar.a(str);
                                            } catch (Throwable th) {
                                                th = th;
                                                bufferedReader = bufferedReader2;
                                                if (bufferedReader != null) {
                                                    try {
                                                        bufferedReader.close();
                                                    } catch (IOException e4) {
                                                        c.a("[LogUtils@reportLog@run]", e4);
                                                    }
                                                }
                                                if (inputStreamReader != null) {
                                                    try {
                                                        inputStreamReader.close();
                                                    } catch (IOException e5) {
                                                        c.a("[LogUtils@reportLog@run]", e5);
                                                    }
                                                }
                                                if (process != null) {
                                                    process.destroy();
                                                }
                                                if (aVar != null) {
                                                    aVar.a(str);
                                                }
                                                throw th;
                                            }
                                        } while (i2 <= 100);
                                        if (!TextUtils.isEmpty(stringBuffer) && z3) {
                                            c.a("[LogUtils@run]", r2 + StringUtil.SPACE + stringBuffer.toString());
                                            str = stringBuffer.toString();
                                        }
                                        Process exec = Runtime.getRuntime().exec("logcat -c");
                                        try {
                                            bufferedReader2.close();
                                        } catch (IOException e6) {
                                            c.a("[LogUtils@reportLog@run]", e6);
                                        }
                                        try {
                                            inputStreamReader.close();
                                        } catch (IOException e7) {
                                            c.a("[LogUtils@reportLog@run]", e7);
                                        }
                                        if (process != null) {
                                            process.destroy();
                                        }
                                        if (exec != null) {
                                            exec.destroy();
                                        }
                                        if (aVar == null) {
                                            return;
                                        }
                                    } catch (Exception e8) {
                                        e = e8;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            } catch (Exception e9) {
                                e = e9;
                                inputStreamReader = null;
                            } catch (Throwable th3) {
                                th = th3;
                                inputStreamReader = null;
                            }
                        } catch (Exception e10) {
                            e = e10;
                            process = null;
                            inputStreamReader = null;
                        } catch (Throwable th4) {
                            th = th4;
                            process = null;
                            inputStreamReader = null;
                        }
                        aVar.a(str);
                    }
                });
            }
            g a7 = g.a();
            Object[] objArr3 = new Object[1];
            objArr3[c] = kVar;
            ChangeQuickRedirect changeQuickRedirect4 = g.a;
            if (PatchProxy.isSupport(objArr3, a7, changeQuickRedirect4, false, "6301399fae5cf9ebae0206545c4eac11", RobustBitConfig.DEFAULT_VALUE)) {
                i = 0;
                a7 = (g) PatchProxy.accessDispatch(objArr3, a7, changeQuickRedirect4, false, "6301399fae5cf9ebae0206545c4eac11");
            } else {
                i = 0;
                if (kVar != null) {
                    a7 = a7.a(kVar.i);
                }
            }
            Object[] objArr4 = new Object[i];
            ChangeQuickRedirect changeQuickRedirect5 = g.a;
            if (PatchProxy.isSupport(objArr4, a7, changeQuickRedirect5, false, "079ec2987ceccdb1a295322431640f0f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, a7, changeQuickRedirect5, false, "079ec2987ceccdb1a295322431640f0f");
            } else {
                a7.b("MRNJSException", 1.0f);
            }
            handleExceptionType(kVar, bVar.b, z);
            reportDDJSError(kVar, bVar);
        }
    }

    private void showErrorView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a51f69ba7ce3d830514d8282f1f39f18", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a51f69ba7ce3d830514d8282f1f39f18");
        } else {
            s.a(getReactApplicationContext());
        }
    }

    private static void handleExceptionType(k kVar, boolean z, boolean z2) {
        Object[] objArr = {kVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "14d96c8aec8f19c67289d826f2ffc920", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "14d96c8aec8f19c67289d826f2ffc920");
        } else if (kVar == null || kVar.i == null) {
        } else {
            g a2 = g.a().a("bundle_name", z2 ? kVar.i.c : "rn_mrn_unhandled").a("real_bundle_name", kVar.i.c).b(kVar.i.c).a("bundle_version", kVar.i.f);
            if (z2) {
                if (z) {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = g.a;
                    if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect3, false, "c3459a7d2c7ea9c556b38d6ea42fef17", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect3, false, "c3459a7d2c7ea9c556b38d6ea42fef17");
                        return;
                    } else {
                        a2.b("MRNSoftException", 1.0f);
                        return;
                    }
                }
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = g.a;
                if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect4, false, "0883876ed6fa9a671988c28e1ac9a005", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect4, false, "0883876ed6fa9a671988c28e1ac9a005");
                } else {
                    a2.b("MRNFatalException", 1.0f);
                }
            }
        }
    }

    private static void reportDDJSError(k kVar, b bVar) {
        String a2;
        Object[] objArr = {kVar, bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "06448d2f64c447a4e803840c3c4767af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "06448d2f64c447a4e803840c3c4767af");
        } else if (kVar == null || kVar.i == null) {
        } else {
            Map<String, Object> d = g.d();
            e eVar = kVar.i;
            d.put("bundle_name", !bVar.f ? "rn_mrn_unhandled" : eVar.c);
            d.put("bundle_version", eVar.f);
            d.put("exceptionType", bVar.b ? "warn" : "fatal");
            try {
                d.put("message", com.meituan.android.mrn.monitor.k.a(bVar.c));
                if (bVar.i != null) {
                    a2 = Log.getStackTraceString(bVar.i);
                } else {
                    a2 = com.meituan.android.mrn.monitor.k.a(bVar.c, bVar.d, null, kVar != null ? kVar.k : null);
                }
                d.put("errorStack", a2);
                JSONObject a3 = com.meituan.android.mrn.monitor.k.a(kVar, bVar);
                if (a3 != null) {
                    d.put("userInfo", a3.toString());
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            Babel.logRT(new Log.Builder("").tag("jsError").optional(d).reportChannel("prism-report-mrn").lv4LocalStatus(true).build());
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "baa30e2bc4a785b20a5063859259e462", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "baa30e2bc4a785b20a5063859259e462");
            return;
        }
        super.onCatalystInstanceDestroy();
        this.hasReportFatalError = false;
    }

    public synchronized void addJSCallExceptionHandler(com.meituan.android.mrn.engine.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "41fb8c06ee650813d316dbf27ed93c86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "41fb8c06ee650813d316dbf27ed93c86");
            return;
        }
        if (bVar != null && !this.jsCallExceptionHandlers.contains(bVar)) {
            this.jsCallExceptionHandlers.add(bVar);
        }
    }

    public synchronized void removeJSCallExceptionHandler(com.meituan.android.mrn.engine.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "73eb4e2087aae602dea89c7148c7b373", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "73eb4e2087aae602dea89c7148c7b373");
            return;
        }
        if (bVar != null) {
            this.jsCallExceptionHandlers.remove(bVar);
        }
    }

    public synchronized void addJSCallExceptionInterceptor(com.meituan.android.mrn.container.b bVar, a aVar) {
        Object[] objArr = {bVar, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "618c5fa9c0878adb77e5cbe76ac60ec9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "618c5fa9c0878adb77e5cbe76ac60ec9");
            return;
        }
        if (bVar != null && aVar != null && !this.exceptionHandlerMap.containsKey(bVar)) {
            this.exceptionHandlerMap.put(bVar, aVar);
        }
    }

    public synchronized void removeJSCallExceptionInterceptor(com.meituan.android.mrn.container.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0508adb415f996f43e522a84637d9b40", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0508adb415f996f43e522a84637d9b40");
            return;
        }
        if (bVar != null) {
            this.exceptionHandlerMap.remove(bVar);
        }
    }

    public void handleLoadBundleException(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2171b0babe4b4e1e05df3c719e5d80dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2171b0babe4b4e1e05df3c719e5d80dc");
            return;
        }
        a aVar = this.exceptionHandlerMap.get(u.a(getReactApplicationContext()));
        if (bVar != null && aVar != null) {
            aVar.a(bVar.c, bVar.d);
        } else {
            showErrorView();
        }
    }

    private static Map<String, String> getBusinessMetricsTag(k kVar) {
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d87885670e35ced9f9682b3be258fac7", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d87885670e35ced9f9682b3be258fac7");
        }
        if (kVar == null || kVar.i == null || TextUtils.isEmpty(kVar.i.c)) {
            return null;
        }
        return com.meituan.android.mrn.config.p.a(kVar.i.c);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class b {
        public static ChangeQuickRedirect a;
        public boolean b;
        public String c;
        public ReadableArray d;
        public ReadableMap e;
        public boolean f;
        public boolean g;
        public Map<String, String> h;
        public Throwable i;

        public b(boolean z, String str, ReadableArray readableArray, ReadableMap readableMap) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str, readableArray, readableMap};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "007966c758902364ce7fbad39b5dbcd6", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "007966c758902364ce7fbad39b5dbcd6");
                return;
            }
            this.b = z;
            this.c = str;
            this.d = readableArray;
            this.e = readableMap;
        }

        public b(boolean z, String str, Throwable th, ReadableMap readableMap) {
            Object[] objArr = {(byte) 1, str, th, null};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd6ee37b9f6bacad97e15b26b7f83584", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd6ee37b9f6bacad97e15b26b7f83584");
                return;
            }
            this.b = true;
            this.c = str;
            this.i = th;
            this.e = null;
        }

        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c427469677a4f77bbcf18551fdda454", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c427469677a4f77bbcf18551fdda454");
            }
            return "MRNExceptionInfo{isSoftType=" + this.b + ", title='" + this.c + "', details=" + this.d + ", extendsInfo=" + this.e + ", shouldReportError=" + this.f + ", isRetryError=" + this.g + '}';
        }
    }
}
