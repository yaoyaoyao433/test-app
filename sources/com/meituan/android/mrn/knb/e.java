package com.meituan.android.mrn.knb;

import com.dianping.titans.js.JsHost;
import com.facebook.react.LazyReactPackage;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.i;
import com.facebook.react.j;
import com.facebook.react.n;
import com.meituan.android.mrn.utils.ad;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class e {
    public static ChangeQuickRedirect a;
    Map<String, JavaModuleWrapper> b;
    c c;
    private Collection<String> d;

    public e(JsHost jsHost, List<i> list, Collection<String> collection) throws f {
        Object[] objArr = {jsHost, list, collection};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9436e80dd3765861a4623ea02ce5dba4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9436e80dd3765861a4623ea02ce5dba4");
            return;
        }
        this.b = new ConcurrentHashMap();
        this.c = new c(jsHost, this);
        this.d = collection == null ? Collections.EMPTY_SET : collection;
        a(list);
    }

    private void a(List<i> list) throws f {
        Iterable<ModuleHolder> iterable;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c94f852dbc8f8665633bb0d33cf8eedf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c94f852dbc8f8665633bb0d33cf8eedf");
            return;
        }
        try {
            for (i iVar : list) {
                Object[] objArr2 = {iVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "58f9c1a843196033e5a61af04c088e54", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "58f9c1a843196033e5a61af04c088e54");
                } else {
                    if (iVar instanceof LazyReactPackage) {
                        try {
                            iterable = (Iterable) ad.a((Class<?>) LazyReactPackage.class, (Object) iVar, "getNativeModuleIterator", this.c);
                        } catch (Exception e) {
                            throw new f("处理 LazyReactPackage 出错了", e);
                        }
                    } else if (iVar instanceof n) {
                        iterable = ((n) iVar).getNativeModuleIterator(this.c);
                    } else {
                        iterable = j.a(iVar, this.c, null);
                    }
                    for (ModuleHolder moduleHolder : iterable) {
                        String name = moduleHolder.getName();
                        if (!this.d.contains(name)) {
                            if (this.b.containsKey(name)) {
                                JavaModuleWrapper javaModuleWrapper = this.b.get(name);
                                if (!moduleHolder.getCanOverrideExistingModule() && !javaModuleWrapper.getModule().getClass().equals(moduleHolder.getModule().getClass())) {
                                    throw new f("Native module " + name + " tried to override " + javaModuleWrapper.getModule().getClass());
                                }
                                this.b.remove(javaModuleWrapper);
                            }
                            if (!com.facebook.react.config.a.a || !moduleHolder.isTurboModule()) {
                                if (!moduleHolder.isCxxModule()) {
                                    this.b.put(name, new JavaModuleWrapper(this.c, moduleHolder));
                                }
                            }
                        }
                    }
                    continue;
                }
            }
        } catch (Exception e2) {
            throw new f("加载桥出错", e2);
        }
    }

    public final void a(JSONArray jSONArray, Callback callback, Callback callback2) {
        Object[] objArr = {jSONArray, callback, callback2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15237507816ba6a4549c0beb5af82bc0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15237507816ba6a4549c0beb5af82bc0");
            return;
        }
        WritableMap createMap = Arguments.createMap();
        if (jSONArray == null) {
            for (JavaModuleWrapper javaModuleWrapper : this.b.values()) {
                a(createMap, javaModuleWrapper);
            }
        } else {
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    a(createMap, this.b.get(jSONArray.getString(i)));
                } catch (Throwable unused) {
                }
            }
        }
        callback.invoke(createMap);
    }

    private void a(WritableMap writableMap, JavaModuleWrapper javaModuleWrapper) {
        Object[] objArr = {writableMap, javaModuleWrapper};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71770b2b67cec37ea0e2fed99393bdc8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71770b2b67cec37ea0e2fed99393bdc8");
            return;
        }
        try {
            writableMap.putMap(javaModuleWrapper.getName(), (WritableMap) javaModuleWrapper.getConstants());
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public JSONArray a(JavaModuleWrapper javaModuleWrapper, int i, JSONArray jSONArray, Callback callback, Callback callback2) {
        int i2 = 0;
        Object[] objArr = {javaModuleWrapper, Integer.valueOf(i), jSONArray, callback, callback2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "451236ee3ce036e948f24ce1fc7361dc", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "451236ee3ce036e948f24ce1fc7361dc");
        }
        Class<?>[] parameterTypes = javaModuleWrapper.b.get(i).b.getParameterTypes();
        int length = parameterTypes.length;
        if (length >= 2 && parameterTypes[length - 1].isAssignableFrom(Callback.class)) {
            int i3 = length - 2;
            if (parameterTypes[i3].isAssignableFrom(Callback.class)) {
                JSONArray jSONArray2 = new JSONArray();
                while (i2 < i3) {
                    jSONArray2.put(jSONArray.opt(i2));
                    i2++;
                }
                jSONArray2.put(this.c.a(callback2));
                jSONArray2.put(this.c.a(callback));
                return jSONArray2;
            }
        }
        if (length > 0) {
            int i4 = length - 1;
            if (parameterTypes[i4].isAssignableFrom(Callback.class)) {
                JSONArray jSONArray3 = new JSONArray();
                while (i2 < i4) {
                    jSONArray3.put(jSONArray.opt(i2));
                    i2++;
                }
                jSONArray3.put(this.c.a(callback));
                return jSONArray3;
            }
        }
        return jSONArray;
    }
}
