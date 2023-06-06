package com.meituan.msc.modules.manager;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class k implements c {
    public static ChangeQuickRedirect n;
    public static Class<k> r = k.class;
    private String a;
    private volatile boolean b;
    private final Map<String, Method> c;
    private final Map<String, Method> d;
    private final Map<String, Method> e;
    private l f;
    protected k o;
    public com.meituan.msc.modules.engine.h p;
    protected com.meituan.msc.modules.engine.e q;

    public void L_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "220a0e6eec8edabe68be0ab1b298e7ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "220a0e6eec8edabe68be0ab1b298e7ed");
        }
    }

    public void a(com.meituan.msc.modules.engine.e eVar) {
    }

    public void a(com.meituan.msc.modules.engine.h hVar) {
    }

    public boolean a_(String str, String str2) {
        return false;
    }

    public h q() {
        return null;
    }

    public k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b0d97a8952246dd68923683ebb451b3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b0d97a8952246dd68923683ebb451b3");
            return;
        }
        this.b = false;
        this.c = new ConcurrentHashMap();
        this.d = new ConcurrentHashMap();
        this.e = new ConcurrentHashMap();
    }

    public JSONObject N_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc5bd88b06a86bc1b1be750b6c43f7d5", RobustBitConfig.DEFAULT_VALUE) ? (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc5bd88b06a86bc1b1be750b6c43f7d5") : new JSONObject();
    }

    public String J_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b1f5e66f8d1a5576680a7b18c16f02f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b1f5e66f8d1a5576680a7b18c16f02f");
        }
        if (TextUtils.isEmpty(this.a)) {
            this.a = r.a(getClass(), true);
        }
        return this.a;
    }

    public final JSONArray p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a8ea490d6930570854839239d887ecb", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a8ea490d6930570854839239d887ecb");
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(J_());
        jSONArray.put(N_());
        jSONArray.put(new JSONArray((Collection) this.c.keySet()));
        jSONArray.put(new JSONArray((Collection) this.e.keySet()));
        jSONArray.put(new JSONArray((Collection) this.d.keySet()));
        return jSONArray;
    }

    public final void b(com.meituan.msc.modules.engine.h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e4b851f7eb1779fced99841c2891926", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e4b851f7eb1779fced99841c2891926");
            return;
        }
        this.p = hVar;
        this.q = hVar.d;
        l lVar = new l(hVar);
        lVar.b = this;
        this.f = lVar;
    }

    public final void b(com.meituan.msc.modules.engine.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "931dac9f668d1331497d5b03b85280bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "931dac9f668d1331497d5b03b85280bf");
            return;
        }
        this.q = eVar;
        if (this.f != null) {
            this.f.a(eVar);
        }
        a(eVar);
    }

    public Object a(Method method, JSONArray jSONArray, a aVar) {
        Object[] objArr = {method, jSONArray, aVar};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e77f5709fe056465c3da2e3ee264a39", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e77f5709fe056465c3da2e3ee264a39");
        }
        if (method == null) {
            throw new RuntimeException(String.format("Can't find method '%s' in '%s' module", StringUtil.NULL, J_()));
        }
        Object[] a = j.a(aVar, method, jSONArray);
        try {
            if (method.getParameterTypes().length == 0) {
                return method.invoke(this, new Object[0]);
            }
            return method.invoke(this, a);
        } catch (IllegalAccessException e) {
            throw new i("invoking method '" + method.getName() + "' failed", e);
        } catch (InvocationTargetException e2) {
            com.meituan.crashreporter.c.a(e2.getCause(), "MSC-ModuleManager", false);
            String str = "invoking method '" + method.getName() + "' failed";
            com.meituan.msc.modules.reporter.g.a("MSCModule" + str, e2.getCause());
            throw new i(str, e2);
        }
    }

    public final com.meituan.msc.modules.engine.h U_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "232eea6696f5ec0a25da8a8b76e30452", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msc.modules.engine.h) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "232eea6696f5ec0a25da8a8b76e30452");
        }
        d();
        return this.p;
    }

    @NonNull
    public final com.meituan.msc.modules.engine.e s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31aec576239870186b29c4725c964ea7", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msc.modules.engine.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31aec576239870186b29c4725c964ea7");
        }
        e();
        return this.q;
    }

    public Object a(String str, String str2, JSONArray jSONArray, a aVar) {
        Object[] objArr = {str, str2, jSONArray, aVar};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6add3649fb516f3414d0bf84c6a635a", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6add3649fb516f3414d0bf84c6a635a");
        }
        if (this.f != null) {
            return this.f.a(str, str2, jSONArray, aVar);
        }
        return null;
    }

    public final JSONArray e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2248fd51656b88686d03bd448998eff4", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2248fd51656b88686d03bd448998eff4");
        }
        if (this.f != null) {
            return this.f.b(str);
        }
        return null;
    }

    @Override // com.meituan.msc.modules.manager.c
    public final void a(k kVar, Class... clsArr) {
        Object[] objArr = {kVar, clsArr};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "864daaca2859211a532438b252397c59", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "864daaca2859211a532438b252397c59");
        } else if (this.f != null) {
            this.f.a(kVar, clsArr);
        }
    }

    @Override // com.meituan.msc.modules.manager.c
    public final void a(k kVar) {
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d989b51480a0b53b8220c776d7d1ec3b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d989b51480a0b53b8220c776d7d1ec3b");
        } else if (this.f != null) {
            this.f.a(kVar);
        }
    }

    @Override // com.meituan.msc.modules.manager.c
    public void o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8b264b1a06fc306bd1d0e9b8a125de9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8b264b1a06fc306bd1d0e9b8a125de9");
            return;
        }
        L_();
        if (this.o != null) {
            this.o.a(this);
            this.o = null;
        }
        if (this.f != null) {
            this.f.a();
            this.f = null;
        }
    }

    public final <T> T c(Class<T> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95b3c33d2b0ec961437c33dc54a84b58", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95b3c33d2b0ec961437c33dc54a84b58");
        }
        if (this.p == null) {
            throw new m("no module manager attached");
        }
        T t = (T) this.p.c(cls);
        if (t == null) {
            com.meituan.msc.modules.reporter.g.a("MSCModule", " module with class " + cls.getCanonicalName() + " not found");
        }
        return t;
    }

    public final k f(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a709a7f49e9fbd5cbed3bdcde39de915", RobustBitConfig.DEFAULT_VALUE)) {
            return (k) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a709a7f49e9fbd5cbed3bdcde39de915");
        }
        if (this.f == null || TextUtils.isEmpty(str)) {
            return null;
        }
        k a = this.f.a(str);
        if (a != null) {
            return a;
        }
        throw new m(" submodule with name " + str + " not found");
    }

    @Override // com.meituan.msc.modules.manager.c
    public final <T> T b(Class<T> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0cef0bdea8f736366ea901955eeca290", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0cef0bdea8f736366ea901955eeca290");
        }
        if (this.f == null) {
            return null;
        }
        T t = (T) this.f.a(cls);
        if (t == null) {
            com.meituan.msc.modules.reporter.g.a("MSCModule", " submodule with class " + cls.getCanonicalName() + " not found");
        }
        return t;
    }

    public final void t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0222d9a1e9e7e8fce92dc7c583f3170e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0222d9a1e9e7e8fce92dc7c583f3170e");
        } else if (this.b) {
        } else {
            V_();
            this.b = true;
        }
    }

    public final Method g(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = n;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7532aed772680f7788a27313995b3e9", RobustBitConfig.DEFAULT_VALUE) ? (Method) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7532aed772680f7788a27313995b3e9") : this.c.get(str);
    }

    public final boolean h(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = n;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a549601b2a6c555af0a31a3659fee91c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a549601b2a6c555af0a31a3659fee91c")).booleanValue() : this.d.get(str) != null;
    }

    public void V_() {
        Set<Class> set;
        Method[] declaredMethods;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da5db8cb7daf2ffa5180333387c5a892", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da5db8cb7daf2ffa5180333387c5a892");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = n;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4bbb3c9027641da49ceb901170f9aef5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4bbb3c9027641da49ceb901170f9aef5");
            return;
        }
        Class<?> cls = getClass();
        Object[] objArr3 = {cls};
        ChangeQuickRedirect changeQuickRedirect3 = n;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "bb0042cb99febe7b159c888c01b89dfd", RobustBitConfig.DEFAULT_VALUE)) {
            set = (Set) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "bb0042cb99febe7b159c888c01b89dfd");
        } else {
            HashSet hashSet = new HashSet();
            hashSet.add(cls);
            for (Class<? super Object> superclass = cls.getSuperclass(); superclass != null && superclass != r; superclass = superclass.getSuperclass()) {
                hashSet.add(superclass);
            }
            set = hashSet;
        }
        for (Class cls2 : set) {
            for (Method method : cls2.getDeclaredMethods()) {
                if (method.isAnnotationPresent(MSCMethod.class)) {
                    String name = method.getName();
                    this.c.put(name, method);
                    if (((MSCMethod) method.getAnnotation(MSCMethod.class)).isSync()) {
                        this.d.put(name, method);
                    }
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    int length = parameterTypes.length;
                    if (length > 0 && parameterTypes[length - 1] == d.class) {
                        this.e.put(name, method);
                    }
                }
            }
        }
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33fcf344a79ed70e36b7170cb60be414", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33fcf344a79ed70e36b7170cb60be414");
        } else if (this.p == null) {
            throw new p("no msc runtime attached, check if the module is registered to runtime");
        }
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "571bde6b71d84511b7e4c56afda903b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "571bde6b71d84511b7e4c56afda903b1");
        } else if (this.q == null) {
            throw new p("no msc app context attached, check if msc App is started");
        }
    }

    public final com.meituan.msc.modules.page.e g(int i) {
        com.meituan.msc.modules.container.q b;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f82e1690fbc2ffd9be9630a020190d7b", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msc.modules.page.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f82e1690fbc2ffd9be9630a020190d7b");
        }
        if (this.p == null || (b = this.p.b()) == null) {
            return null;
        }
        return b.b(i);
    }
}
