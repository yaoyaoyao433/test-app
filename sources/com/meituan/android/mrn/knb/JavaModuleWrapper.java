package com.meituan.android.mrn.knb;

import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.JSInstance;
import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.ReadableNativeArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
@DoNotStrip
/* loaded from: classes2.dex */
public class JavaModuleWrapper {
    public static ChangeQuickRedirect a;
    final ArrayList<a> b;
    private final JSInstance c;
    private final ModuleHolder d;
    private final ArrayList<MethodDescriptor> e;

    /* compiled from: ProGuard */
    @DoNotStrip
    /* loaded from: classes2.dex */
    public class MethodDescriptor {
        @DoNotStrip
        public Method method;
        @DoNotStrip
        public String name;
        @DoNotStrip
        public String signature;
        @DoNotStrip
        public String type;

        public MethodDescriptor() {
        }
    }

    public JavaModuleWrapper(JSInstance jSInstance, ModuleHolder moduleHolder) {
        Object[] objArr = {jSInstance, moduleHolder};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67be40a188b4d072d88c20c25af8472e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67be40a188b4d072d88c20c25af8472e");
            return;
        }
        this.c = jSInstance;
        this.d = moduleHolder;
        this.b = new ArrayList<>();
        this.e = new ArrayList<>();
    }

    @DoNotStrip
    public BaseJavaModule getModule() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fad8e288172786ddc61f31fe477b9f44", RobustBitConfig.DEFAULT_VALUE) ? (BaseJavaModule) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fad8e288172786ddc61f31fe477b9f44") : (BaseJavaModule) this.d.getModule();
    }

    @DoNotStrip
    public String getName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da42e2bc9a72ab927d311aa26122c9f3", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da42e2bc9a72ab927d311aa26122c9f3") : this.d.getName();
    }

    @DoNotStrip
    private void findMethods() {
        Method[] declaredMethods;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f137f0c7add0348b240395af43248a3e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f137f0c7add0348b240395af43248a3e");
            return;
        }
        HashSet hashSet = new HashSet();
        Class<?> cls = this.d.getModule().getClass();
        Class<? super Object> superclass = cls.getSuperclass();
        if (ReactModuleWithSpec.class.isAssignableFrom(superclass)) {
            cls = superclass;
        }
        for (Method method : cls.getDeclaredMethods()) {
            ReactMethod reactMethod = (ReactMethod) method.getAnnotation(ReactMethod.class);
            if (reactMethod != null) {
                String name = method.getName();
                if (hashSet.contains(name)) {
                    throw new IllegalArgumentException("Java Module " + getName() + " method name already registered: " + name);
                }
                hashSet.add(name);
                MethodDescriptor methodDescriptor = new MethodDescriptor();
                a aVar = new a(this, method, reactMethod.isBlockingSynchronousMethod());
                methodDescriptor.name = name;
                methodDescriptor.type = aVar.c;
                if (methodDescriptor.type == BaseJavaModule.METHOD_TYPE_SYNC) {
                    methodDescriptor.signature = aVar.a();
                    methodDescriptor.method = method;
                }
                this.b.add(aVar);
                this.e.add(methodDescriptor);
            }
        }
    }

    @DoNotStrip
    public List<MethodDescriptor> getMethodDescriptors() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "592230d1516f9f66411168fdbdf0d463", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "592230d1516f9f66411168fdbdf0d463");
        }
        if (this.e.isEmpty()) {
            findMethods();
        }
        return this.e;
    }

    @DoNotStrip
    @Nullable
    public NativeMap getConstants() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fb7dac0c3744d4405f62a6f08046ee1", RobustBitConfig.DEFAULT_VALUE)) {
            return (NativeMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fb7dac0c3744d4405f62a6f08046ee1");
        }
        if (this.d.getHasConstants()) {
            return Arguments.makeNativeMap(getModule().getConstants());
        }
        return null;
    }

    @DoNotStrip
    public Object invoke(int i, ReadableNativeArray readableNativeArray) {
        Object[] objArr = {Integer.valueOf(i), readableNativeArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ee09d54f47ad674b314713950835b89", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ee09d54f47ad674b314713950835b89") : this.b.get(i).a(this.c, readableNativeArray);
    }
}
