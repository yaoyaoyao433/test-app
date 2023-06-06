package com.dianping.picassocontroller.annotation;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.Log;
import com.dianping.jscore.Value;
import com.dianping.jscore.model.ArchiveException;
import com.dianping.jscore.model.JSONBuilder;
import com.dianping.jscore.model.Unarchived;
import com.dianping.picasso.PicassoEnvironment;
import com.dianping.picassocontroller.module.BroadcastModule;
import com.dianping.picassocontroller.module.ImageUtilModule;
import com.dianping.picassocontroller.module.KeyBoardModule;
import com.dianping.picassocontroller.module.ModalModule;
import com.dianping.picassocontroller.module.NavigatorModule;
import com.dianping.picassocontroller.module.NetworkModule;
import com.dianping.picassocontroller.module.PickerModule;
import com.dianping.picassocontroller.module.StatusBarModule;
import com.dianping.picassocontroller.module.StorageModule;
import com.dianping.picassocontroller.module.TimerModule;
import com.dianping.picassocontroller.module.VCModule;
import com.meituan.android.neohybrid.core.config.UIConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class c {
    public static ChangeQuickRedirect a;
    private static Map<Class, a> b = new ConcurrentHashMap();
    private static Map<String, b> c = new ConcurrentHashMap();
    private static final Map<String, String> d = new ConcurrentHashMap();
    private static boolean e = false;
    private static boolean f = true;

    public static synchronized void a(@NonNull Context context) {
        synchronized (c.class) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a0d8e71942d8e75e37970cf11ceb7240", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a0d8e71942d8e75e37970cf11ceb7240");
                return;
            }
            if (f || e) {
                f = false;
                b(context);
            }
        }
    }

    private static synchronized void b(@NonNull Context context) {
        String[] split;
        synchronized (c.class) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a711ad6de365fda88a17cba1870e67af", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a711ad6de365fda88a17cba1870e67af");
                return;
            }
            e = false;
            PicassoEnvironment picassoEnvironment = PicassoEnvironment.getPicassoEnvironment(context);
            if (picassoEnvironment.appID < 0) {
                if (picassoEnvironment.isDebug) {
                    throw new RuntimeException("未正确设置Picasso的appid");
                }
                com.dianping.codelog.b.b(c.class, "未正确设置Picasso的appid");
                e = true;
            }
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "73ddfdf301ee7b8b37ceefbe8d14ada8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "73ddfdf301ee7b8b37ceefbe8d14ada8");
            } else {
                a("network", NetworkModule.class);
                a("navigator", NavigatorModule.class);
                a("storage", StorageModule.class);
                a(UIConfig.MODAL, ModalModule.class);
                a("broadcast", BroadcastModule.class);
                a("timer", TimerModule.class);
                a("vc", VCModule.class);
                a("statusBar", StatusBarModule.class);
                a("picker", PickerModule.class);
                a("keyboard", KeyBoardModule.class);
                a("imageUtil", ImageUtilModule.class);
            }
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().getAssets().open("PicassoModuleMapping_" + picassoEnvironment.appID)));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        return;
                    }
                    if (!readLine.startsWith("#") && (split = readLine.split(CommonConstant.Symbol.COLON)) != null && split.length > 0) {
                        String trim = split[0].trim();
                        if (c.get(trim) != null) {
                            String.format(Locale.getDefault(), "已存在模块:%s,不注册", trim);
                        } else if (split.length > 2 && split[2] != null) {
                            String trim2 = split[2].trim();
                            if (!TextUtils.isEmpty(trim2)) {
                                try {
                                    a(trim, Class.forName(trim2));
                                } catch (ClassNotFoundException e2) {
                                    e2.printStackTrace();
                                    Log.e("PicassoMapping", String.format(Locale.getDefault(), "注册桥失败：moduleName:%s,class:%s", trim, trim2));
                                }
                                d.put(trim, trim2);
                            }
                        }
                    }
                }
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
    }

    private static void a(String str, Class cls) {
        Class<?>[] classes;
        Object[] objArr = {str, cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7519d4888e9f6607107ee138aa7f7b46", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7519d4888e9f6607107ee138aa7f7b46");
            return;
        }
        PCSBModule pCSBModule = (PCSBModule) cls.getAnnotation(PCSBModule.class);
        if (pCSBModule != null) {
            if (TextUtils.isEmpty(str)) {
                str = pCSBModule.name();
                if (TextUtils.isEmpty(str)) {
                    return;
                }
            }
            b bVar = new b(cls);
            bVar.d = pCSBModule.stringify();
            c.put(str, bVar);
            for (Class<?> cls2 : cls.getClasses()) {
                if (cls2.getAnnotation(PCSModel.class) != null) {
                    b.put(cls, new a(cls2));
                }
            }
        }
    }

    public static JSONObject a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "72c791bf18c83f11dffbf133121fac37", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "72c791bf18c83f11dffbf133121fac37");
        }
        JSONBuilder jSONBuilder = new JSONBuilder();
        for (String str : c.keySet()) {
            b bVar = c.get(str);
            if (bVar != null) {
                jSONBuilder.put(str, bVar.a());
            }
        }
        return jSONBuilder.toJSONObject();
    }

    public static Value a(String str, String str2, String str3, Value value, String str4) {
        boolean z;
        Method method;
        Object[] objArr = {str, str2, str3, value, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "70c3acfe5f64afd0dd3754bc14c60cc4", RobustBitConfig.DEFAULT_VALUE)) {
            return (Value) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "70c3acfe5f64afd0dd3754bc14c60cc4");
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return new Value(false);
        }
        b bVar = c.get(str2);
        if (bVar == null) {
            Object[] objArr2 = {str2};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "94590779fadd7731d124c67932d21420", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "94590779fadd7731d124c67932d21420");
            } else {
                String str5 = d.get(str2);
                if (!TextUtils.isEmpty(str5)) {
                    try {
                        a(str2, Class.forName(str5));
                    } catch (ClassNotFoundException e2) {
                        e2.printStackTrace();
                        Log.e("PicassoMapping", String.format(Locale.getDefault(), "注册桥失败：moduleName:%s,class:%s", str2, str5));
                    }
                }
            }
            bVar = c.get(str2);
        }
        if (bVar == null) {
            return new Value(false);
        }
        com.dianping.picassocontroller.vc.b a2 = com.dianping.picassocontroller.vc.c.a(str);
        if (a2 == null) {
            return new Value(false);
        }
        Object a3 = a2.a(bVar.b);
        if (a3 == null) {
            return new Value(false);
        }
        Object[] objArr3 = {str3};
        ChangeQuickRedirect changeQuickRedirect3 = b.a;
        if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "cebe9ff39cbf23453bba493ccf64ebd9", RobustBitConfig.DEFAULT_VALUE)) {
            z = false;
            method = (Method) PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "cebe9ff39cbf23453bba493ccf64ebd9");
        } else {
            z = false;
            method = bVar.c.get(str3);
        }
        if (method == null) {
            return new Value(z);
        }
        return a(a2, a3, method, value, str4);
    }

    private static Value a(com.dianping.picassocontroller.vc.b bVar, Object obj, Method method, Value value, String str) {
        Object invoke;
        Object[] objArr = {bVar, obj, method, value, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1fa6bd8eb64c54101dc2cc17f0cb888d", RobustBitConfig.DEFAULT_VALUE)) {
            return (Value) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1fa6bd8eb64c54101dc2cc17f0cb888d");
        }
        Class<?>[] parameterTypes = method.getParameterTypes();
        try {
            if (parameterTypes.length <= 0) {
                invoke = method.invoke(obj, new Object[0]);
            } else if (parameterTypes[0] == com.dianping.picassocontroller.vc.b.class) {
                if (parameterTypes.length == 1) {
                    invoke = method.invoke(obj, bVar);
                } else {
                    Object a2 = a(value, parameterTypes[1]);
                    invoke = parameterTypes.length == 2 ? method.invoke(obj, bVar, a2) : method.invoke(obj, bVar, a2, new com.dianping.picassocontroller.bridge.b(bVar.a(), str));
                }
            } else {
                Object a3 = a(value, parameterTypes[0]);
                invoke = parameterTypes.length == 1 ? method.invoke(obj, a3) : method.invoke(obj, a3, new com.dianping.picassocontroller.bridge.b(bVar.a(), str));
            }
            if (invoke instanceof Value) {
                return (Value) invoke;
            }
            if (invoke instanceof String) {
                return new Value((String) invoke);
            }
            if (invoke instanceof Integer) {
                return new Value(((Integer) invoke).intValue());
            }
            if (invoke instanceof Float) {
                return new Value(((Float) invoke).floatValue());
            }
            if (invoke instanceof Double) {
                return new Value(((Double) invoke).doubleValue());
            }
            if (invoke instanceof Boolean) {
                return new Value(((Boolean) invoke).booleanValue());
            }
            return new Value(true);
        } catch (Exception e2) {
            e2.printStackTrace();
            return new Value(false);
        }
    }

    private static Object a(Value value, Class cls) throws JSONException, ArchiveException {
        Object jSONArray;
        Object[] objArr = {value, cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "287d4336c386a14584ed3274a97df3af", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "287d4336c386a14584ed3274a97df3af");
        }
        if (cls == Value.class) {
            return value;
        }
        if (cls == JSONObject.class) {
            jSONArray = new JSONObject(value.string());
        } else if (cls == JSONArray.class) {
            jSONArray = new JSONArray(value.string());
        } else {
            return a(value.getUnarchived(), cls);
        }
        return jSONArray;
    }

    public static <T> T a(Unarchived unarchived, Class<T> cls) {
        T t;
        Object[] objArr = {unarchived, cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8226e52e6f8e5ca8da50f44bc77564c3", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8226e52e6f8e5ca8da50f44bc77564c3");
        }
        byte peek = unarchived.peek();
        if (peek == 78) {
            return null;
        }
        if (peek != 65 || !cls.isArray()) {
            if (peek == 79) {
                a aVar = b.get(cls);
                if (aVar != null) {
                    return (T) aVar.a(unarchived);
                }
                a aVar2 = new a(cls);
                b.put(cls, aVar2);
                return (T) aVar2.a(unarchived);
            }
            return null;
        }
        Class<?> componentType = cls.getComponentType();
        try {
            int readMemberHash16 = unarchived.readMemberHash16();
            t = (T) Array.newInstance(componentType, readMemberHash16);
            for (int i = 0; i < readMemberHash16; i++) {
                try {
                    Array.set(t, i, a(unarchived, componentType));
                } catch (ArchiveException e2) {
                    e = e2;
                    e.printStackTrace();
                    return t;
                }
            }
        } catch (ArchiveException e3) {
            e = e3;
            t = null;
        }
        return t;
    }
}
