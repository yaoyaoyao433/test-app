package com.facebook.react.bridge;

import android.support.annotation.Nullable;
import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.bridge.NativeModule;
import com.facebook.systrace.a;
import com.facebook.systrace.b;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
@DoNotStrip
/* loaded from: classes.dex */
public class JavaModuleWrapper {
    private final JSInstance mJSInstance;
    private final ModuleHolder mModuleHolder;
    private final ArrayList<NativeModule.NativeMethod> mMethods = new ArrayList<>();
    private final ArrayList<MethodDescriptor> mDescs = new ArrayList<>();

    /* compiled from: ProGuard */
    @DoNotStrip
    /* loaded from: classes.dex */
    public class MethodDescriptor {
        @DoNotStrip
        Method method;
        @DoNotStrip
        String name;
        @DoNotStrip
        String signature;
        @DoNotStrip
        String type;

        public MethodDescriptor() {
        }
    }

    public JavaModuleWrapper(JSInstance jSInstance, ModuleHolder moduleHolder) {
        this.mJSInstance = jSInstance;
        this.mModuleHolder = moduleHolder;
    }

    @DoNotStrip
    public BaseJavaModule getModule() {
        return (BaseJavaModule) this.mModuleHolder.getModule();
    }

    @DoNotStrip
    public String getName() {
        return this.mModuleHolder.getName();
    }

    @DoNotStrip
    private void findMethods() {
        Method[] declaredMethods;
        a.a(0L, "findMethods");
        HashSet hashSet = new HashSet();
        Class<?> cls = this.mModuleHolder.getModule().getClass();
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
                MethodDescriptor methodDescriptor = new MethodDescriptor();
                JavaMethodWrapper javaMethodWrapper = new JavaMethodWrapper(this, method, reactMethod.isBlockingSynchronousMethod());
                methodDescriptor.name = name;
                methodDescriptor.type = javaMethodWrapper.getType();
                if (methodDescriptor.type == BaseJavaModule.METHOD_TYPE_SYNC) {
                    methodDescriptor.signature = javaMethodWrapper.getSignature();
                    methodDescriptor.method = method;
                }
                this.mMethods.add(javaMethodWrapper);
                this.mDescs.add(methodDescriptor);
            }
        }
        a.a(0L);
    }

    @DoNotStrip
    public List<MethodDescriptor> getMethodDescriptors() {
        if (this.mDescs.isEmpty()) {
            findMethods();
        }
        return this.mDescs;
    }

    @DoNotStrip
    @Nullable
    public NativeMap getConstants() {
        if (this.mModuleHolder.getHasConstants()) {
            String name = getName();
            b.a(0L, "JavaModuleWrapper.getConstants");
            ReactMarker.logMarker(ReactMarkerConstants.GET_CONSTANTS_START, name);
            BaseJavaModule module = getModule();
            a.a(0L, "module.getConstants");
            Map<String, Object> constants = module.getConstants();
            a.a(0L);
            a.a(0L, "create WritableNativeMap");
            ReactMarker.logMarker(ReactMarkerConstants.CONVERT_CONSTANTS_START, name);
            try {
                return Arguments.makeNativeMap(constants);
            } finally {
                ReactMarker.logMarker(ReactMarkerConstants.CONVERT_CONSTANTS_END, name);
                a.a(0L);
                ReactMarker.logMarker(ReactMarkerConstants.GET_CONSTANTS_END, name);
                b.a(0L);
            }
        }
        return null;
    }

    @DoNotStrip
    public void invoke(int i, ReadableNativeArray readableNativeArray) {
        if (this.mMethods == null || i >= this.mMethods.size()) {
            return;
        }
        try {
            this.mMethods.get(i).invoke(this.mJSInstance, readableNativeArray);
        } catch (Throwable th) {
            String format = String.format("Failed to invoke method '%s' of '%s'.", this.mDescs.size() <= i ? "Unknown" : this.mDescs.get(i).name, getName());
            com.facebook.common.logging.a.d("ReactNative", format + " Parameters: " + readableNativeArray, th);
            throw new com.meituan.android.mrn.exception.b(format, th);
        }
    }
}
