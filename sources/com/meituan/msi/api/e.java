package com.meituan.msi.api;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.msi.annotations.MsiApiEnv;
import com.meituan.msi.annotations.MsiApiGray;
import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.annotations.MsiApiPermission;
import com.meituan.msi.annotations.MsiComponent;
import com.meituan.msi.annotations.MsiHookMethod;
import com.meituan.msi.annotations.MsiNewApi;
import com.meituan.msi.annotations.MsiParamChecker;
import com.meituan.msi.annotations.MsiSupport;
import com.meituan.msi.bean.EventType;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.serviceloader.b;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e {
    public static ChangeQuickRedirect a;
    private static final Set<String> b = new HashSet(Arrays.asList("return", "success", "object", "callback"));
    private static final ConcurrentHashMap<String, o> c = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<String, o> d = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<String, o> e = new ConcurrentHashMap<>();
    private static volatile boolean f = false;

    public static synchronized void a() {
        synchronized (e.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e13f27158fca9a0ecab6def9b3cbd537", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e13f27158fca9a0ecab6def9b3cbd537");
            } else if (!f) {
                if (!com.sankuai.meituan.serviceloader.b.a()) {
                    com.sankuai.meituan.serviceloader.b.a(com.meituan.msi.a.f(), new b.a() { // from class: com.meituan.msi.api.e.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.meituan.serviceloader.b.a
                        public final void a(Throwable th) {
                            Object[] objArr2 = {th};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "35dbb8cace8d9aa8798948384d90da87", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "35dbb8cace8d9aa8798948384d90da87");
                            } else {
                                com.meituan.msi.log.a.a("init  ServiceLoader fail ");
                            }
                        }
                    });
                }
                long currentTimeMillis = System.currentTimeMillis();
                Map<String, String> map = com.sankuai.meituan.serviceloader.b.b().get(IMsiApi.class.getName());
                if (map != null && map.size() != 0) {
                    com.meituan.msi.log.a.a("registerApi size " + map.size());
                    for (String str : map.values()) {
                        try {
                            Class<?> cls = Class.forName(str);
                            MsiComponent msiComponent = (MsiComponent) cls.getAnnotation(MsiComponent.class);
                            if (msiComponent != null) {
                                a(msiComponent.name(), cls);
                            }
                            a(cls);
                        } catch (ClassNotFoundException unused) {
                            com.meituan.msi.log.a.a("registerApi fail" + str + " not fund");
                        }
                    }
                    com.meituan.msi.log.a.a("registerApi cost " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
                    f = true;
                }
                com.meituan.msi.log.a.a("IMsiApi  is empty ");
                f = true;
            }
        }
    }

    private static synchronized List<n> a(Class<?>... clsArr) {
        synchronized (e.class) {
            Object[] objArr = {clsArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "256e17171bd2b8ca979bb5a04d558520", RobustBitConfig.DEFAULT_VALUE)) {
                return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "256e17171bd2b8ca979bb5a04d558520");
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i <= 0; i++) {
                Class<?> cls = clsArr[i];
                if (cls == null) {
                    com.meituan.msi.log.a.a("注册类型不能为空");
                } else {
                    Class<?>[] interfaces = cls.getInterfaces();
                    if (interfaces.length > 0) {
                        for (Class<?> cls2 : interfaces) {
                            arrayList.addAll(a(cls2, cls));
                        }
                    }
                    a(cls.getSuperclass(), cls, arrayList);
                    arrayList.addAll(a(cls, cls));
                }
            }
            return arrayList;
        }
    }

    private static void a(Class<?> cls, Class<?> cls2, List<n> list) {
        Object[] objArr = {cls, cls2, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cd26429b7f49bb506c24e0a1ff934e9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cd26429b7f49bb506c24e0a1ff934e9f");
        } else if (cls != null && !"java.lang.Object".equals(cls.getName())) {
            Class<?>[] interfaces = cls.getInterfaces();
            if (interfaces.length > 0) {
                for (Class<?> cls3 : interfaces) {
                    list.addAll(a(cls3, cls2));
                }
            }
            a(cls.getSuperclass(), cls2, list);
            list.addAll(a(cls, cls2));
        }
    }

    private static List<n> a(Class<?> cls, Class<?> cls2) {
        ConcurrentHashMap<String, o> concurrentHashMap;
        boolean z;
        MsiApiEnv msiApiEnv;
        Object[] objArr = {cls, cls2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "21c6db7c314d047fd85a708933ad8bdf", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "21c6db7c314d047fd85a708933ad8bdf");
        }
        MsiApiPermission msiApiPermission = (MsiApiPermission) cls.getAnnotation(MsiApiPermission.class);
        MsiApiEnv msiApiEnv2 = (MsiApiEnv) cls2.getAnnotation(MsiApiEnv.class);
        Method[] declaredMethods = cls.getDeclaredMethods();
        ArrayList arrayList = new ArrayList();
        ConcurrentHashMap<String, o> concurrentHashMap2 = c;
        if (msiApiEnv2 == null || TextUtils.isEmpty(msiApiEnv2.name())) {
            concurrentHashMap = concurrentHashMap2;
            z = false;
        } else {
            concurrentHashMap = d;
            z = true;
        }
        boolean z2 = ((MsiNewApi) cls2.getAnnotation(MsiNewApi.class)) != null;
        MsiApiGray msiApiGray = (MsiApiGray) cls2.getAnnotation(MsiApiGray.class);
        String graySwitchName = msiApiGray != null ? msiApiGray.graySwitchName() : null;
        int length = declaredMethods.length;
        int i = 0;
        while (i < length) {
            Method method = declaredMethods[i];
            MsiApiMethod msiApiMethod = (MsiApiMethod) method.getAnnotation(MsiApiMethod.class);
            MsiApiPermission msiApiPermission2 = (MsiApiPermission) method.getAnnotation(MsiApiPermission.class);
            if (msiApiMethod != null) {
                String str = msiApiMethod.scope() + msiApiMethod.name();
                if (z) {
                    str = msiApiEnv2.name() + msiApiMethod.scope() + msiApiMethod.name();
                }
                msiApiEnv = msiApiEnv2;
                n nVar = new n(str, new ArrayList());
                arrayList.add(nVar);
                nVar.d = cls2;
                nVar.e = method;
                nVar.b = msiApiMethod.isCallback();
                nVar.j = msiApiMethod.token();
                nVar.k = msiApiMethod.onUiThread();
                nVar.l = msiApiMethod.onSerializedThread();
                nVar.f = msiApiMethod.request();
                nVar.g = msiApiMethod.response();
                nVar.n = msiApiMethod.sampleRate();
                nVar.m = msiApiMethod.scope();
                nVar.p = msiApiMethod.isForeground();
                nVar.c = msiApiMethod.eventType();
                nVar.r = z2;
                nVar.q = graySwitchName;
                if (msiApiMethod.env().length > 0) {
                    nVar.i = new HashSet();
                    nVar.i.addAll(Arrays.asList(msiApiMethod.env()));
                }
                if (msiApiPermission != null && msiApiPermission.apiPermissions().length > 0) {
                    nVar.h = new HashSet();
                    nVar.h.addAll(Arrays.asList(msiApiPermission.apiPermissions()));
                }
                if (msiApiPermission2 != null && msiApiPermission2.apiPermissions().length > 0) {
                    if (nVar.h == null) {
                        nVar.h = new HashSet();
                    }
                    nVar.h.addAll(Arrays.asList(msiApiPermission2.apiPermissions()));
                }
                nVar.a = method.getReturnType() != Void.TYPE;
                o oVar = concurrentHashMap.get(str);
                if (oVar instanceof n) {
                    n nVar2 = (n) oVar;
                    if (nVar2.r == nVar.r) {
                        com.meituan.msi.log.a.a(str + " 重复注册 " + cls.getName());
                    } else if (!nVar2.r) {
                        nVar2.s = nVar;
                        if (!TextUtils.isEmpty(nVar2.q)) {
                            nVar.q = nVar2.q;
                        }
                        nVar2.q = nVar.q;
                    } else {
                        nVar.s = nVar2;
                        concurrentHashMap.put(str, nVar);
                        if (TextUtils.isEmpty(nVar.q)) {
                            nVar.q = nVar2.q;
                        }
                        nVar2.q = nVar.q;
                    }
                } else {
                    concurrentHashMap.put(str, nVar);
                }
            } else {
                msiApiEnv = msiApiEnv2;
            }
            i++;
            msiApiEnv2 = msiApiEnv;
        }
        return arrayList;
    }

    private static o d(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b772553ed3763441a3899383ca05dcce", RobustBitConfig.DEFAULT_VALUE)) {
            return (o) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b772553ed3763441a3899383ca05dcce");
        }
        if (c.isEmpty() && d.isEmpty()) {
            a();
        }
        if (str == null || str.isEmpty()) {
            return null;
        }
        if (!TextUtils.isEmpty(str2)) {
            String str3 = str2 + str;
            if (d.containsKey(str3)) {
                return d.get(str3);
            }
        }
        return c.get(str);
    }

    public static synchronized n a(String str, String str2) {
        synchronized (e.class) {
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4a1001179a1618f79ff56e986230f263", RobustBitConfig.DEFAULT_VALUE)) {
                return (n) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4a1001179a1618f79ff56e986230f263");
            }
            o d2 = d(str, str2);
            if (d2 instanceof n) {
                return (n) d2;
            }
            return null;
        }
    }

    public static synchronized EventType a(String str, String str2, String str3) {
        synchronized (e.class) {
            Object[] objArr = {str, str2, str3};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3ea6b8af95c5a6d4f023ebac36e902d6", RobustBitConfig.DEFAULT_VALUE)) {
                return (EventType) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3ea6b8af95c5a6d4f023ebac36e902d6");
            }
            o d2 = d(str + str2, str3);
            if (d2 instanceof n) {
                return ((n) d2).c;
            }
            return EventType.COMMON_EVENT;
        }
    }

    public static synchronized boolean b(String str, String str2) {
        synchronized (e.class) {
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1290acc024107ded5440b4fca01d68d6", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1290acc024107ded5440b4fca01d68d6")).booleanValue();
            }
            n a2 = a(str, str2);
            if (a2 == null) {
                return false;
            }
            return a2.k;
        }
    }

    public static synchronized boolean c(String str, String str2) {
        synchronized (e.class) {
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0c52b8f5f2e463c05d1662a228a4cd95", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0c52b8f5f2e463c05d1662a228a4cd95")).booleanValue();
            }
            n a2 = a(str, str2);
            if (a2 == null) {
                return false;
            }
            return a2.l;
        }
    }

    public static synchronized void a(String str, Map<String, com.meituan.msi.interceptor.a<?>> map) {
        synchronized (e.class) {
            Object[] objArr = {str, map};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d5da3c13388eea6dda28fc5463d118f9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d5da3c13388eea6dda28fc5463d118f9");
                return;
            }
            if (map != null && map.size() != 0) {
                for (Map.Entry<String, com.meituan.msi.interceptor.a<?>> entry : map.entrySet()) {
                    String str2 = str + entry.getKey();
                    if (TextUtils.isEmpty(str2)) {
                        com.meituan.msi.log.a.a(" 重复信息为空");
                        return;
                    } else if (e.containsKey(str2)) {
                        com.meituan.msi.log.a.a(str2 + " 重复注册");
                        return;
                    } else {
                        Method[] methods = entry.getValue().getClass().getMethods();
                        if (methods.length == 0) {
                            return;
                        }
                        for (Method method : methods) {
                            MsiHookMethod msiHookMethod = (MsiHookMethod) method.getAnnotation(MsiHookMethod.class);
                            if (msiHookMethod != null) {
                                o oVar = new o(str2, new ArrayList());
                                e.put(str2, oVar);
                                if (msiHookMethod.response() != Void.class) {
                                    oVar.u.add(new o("response", a(msiHookMethod.response())));
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private static synchronized void a(String str, Class<?> cls) {
        synchronized (e.class) {
            Object[] objArr = {str, cls};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ba69da6e5ae09b418e645517cbadde08", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ba69da6e5ae09b418e645517cbadde08");
                return;
            }
            MsiComponent msiComponent = (MsiComponent) cls.getAnnotation(MsiComponent.class);
            if (msiComponent == null) {
                com.meituan.msi.log.a.a(str + "组件MsiComponent信息为空");
                return;
            }
            String str2 = "inner_msi_component_prefix_" + msiComponent.scope() + str;
            if (TextUtils.isEmpty(str2)) {
                com.meituan.msi.log.a.a(" 组件重复信息为空");
            } else if (c.containsKey(str2)) {
                com.meituan.msi.log.a.a(str + " 组件重复注册");
            } else {
                m mVar = new m(str2, new ArrayList());
                if (msiComponent.env().length > 0) {
                    mVar.b = new HashSet();
                    mVar.b.addAll(Arrays.asList(msiComponent.env()));
                }
                mVar.a = cls;
                mVar.c = msiComponent.scope();
                c.put(str2, mVar);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x0243, code lost:
        r2 = com.meituan.msi.api.e.e;
        r2 = r2.get(r7 + r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x025a, code lost:
        if (r2 == null) goto L87;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized boolean a(com.meituan.msi.api.ApiRequest<?> r25, java.lang.String r26, java.lang.String r27) {
        /*
            Method dump skipped, instructions count: 635
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msi.api.e.a(com.meituan.msi.api.ApiRequest, java.lang.String, java.lang.String):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static ArrayList<o> a(Class<?> cls) {
        Field[] declaredFields;
        ArrayList<o> a2;
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "703b5ccd74a1cf2fc2b62e5f1c78a478", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "703b5ccd74a1cf2fc2b62e5f1c78a478");
        }
        ArrayList<o> arrayList = null;
        while (cls.getSuperclass() != null && cls.getAnnotation(MsiSupport.class) != null) {
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            if (cls.isEnum()) {
                Object[] enumConstants = cls.getEnumConstants();
                for (int i = 0; enumConstants != null && i < enumConstants.length; i++) {
                    arrayList.add(new o(enumConstants[i].toString(), null));
                }
            } else {
                for (Field field : cls.getDeclaredFields()) {
                    if (!cls.getName().startsWith(field.getType().getName() + CommonConstant.Symbol.DOLLAR)) {
                        MsiParamChecker msiParamChecker = (MsiParamChecker) field.getAnnotation(MsiParamChecker.class);
                        if (msiParamChecker != null && msiParamChecker.in().length > 0) {
                            a2 = new ArrayList<>();
                            for (int i2 = 0; i2 < msiParamChecker.in().length; i2++) {
                                a2.add(new o(msiParamChecker.in()[i2], null));
                            }
                        } else {
                            a2 = a(field.getType());
                        }
                        SerializedName serializedName = (SerializedName) field.getAnnotation(SerializedName.class);
                        if (serializedName != null) {
                            arrayList.add(new o(serializedName.value(), a2));
                        } else {
                            arrayList.add(new o(field.getName(), a2));
                        }
                    }
                }
            }
            Method[] declaredMethods = cls.getDeclaredMethods();
            for (int i3 = 0; i3 < declaredMethods.length; i3++) {
                MsiSupport msiSupport = (MsiSupport) declaredMethods[i3].getAnnotation(MsiSupport.class);
                if (msiSupport != null) {
                    arrayList.add(new o(TextUtils.isEmpty(msiSupport.value()) ? declaredMethods[i3].getName() : msiSupport.value(), null));
                }
            }
            cls = cls.getSuperclass();
        }
        return arrayList;
    }
}
