package com.facebook.react;

import android.support.annotation.NonNull;
import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.uimanager.ViewManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class LazyReactPackage implements i {
    protected abstract List<ModuleSpec> getNativeModules(ReactApplicationContext reactApplicationContext);

    public abstract com.facebook.react.module.model.a getReactModuleInfoProvider();

    public static com.facebook.react.module.model.a getReactModuleInfoProviderViaReflection(LazyReactPackage lazyReactPackage) {
        try {
            Class<?> cls = Class.forName(lazyReactPackage.getClass().getCanonicalName() + "$$ReactModuleInfoProvider");
            if (cls == null) {
                throw new RuntimeException("ReactModuleInfoProvider class for " + lazyReactPackage.getClass().getCanonicalName() + " not found.");
            }
            try {
                return (com.facebook.react.module.model.a) cls.newInstance();
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Unable to instantiate ReactModuleInfoProvider for " + lazyReactPackage.getClass(), e);
            } catch (InstantiationException e2) {
                throw new RuntimeException("Unable to instantiate ReactModuleInfoProvider for " + lazyReactPackage.getClass(), e2);
            }
        } catch (ClassNotFoundException unused) {
            return new com.facebook.react.module.model.a() { // from class: com.facebook.react.LazyReactPackage.1
                @Override // com.facebook.react.module.model.a
                public final Map<String, ReactModuleInfo> a() {
                    return Collections.emptyMap();
                }
            };
        }
    }

    public Iterable<ModuleHolder> getNativeModuleIterator(ReactApplicationContext reactApplicationContext) {
        final Map<String, ReactModuleInfo> a = getReactModuleInfoProvider().a();
        final List<ModuleSpec> nativeModules = getNativeModules(reactApplicationContext);
        return new Iterable<ModuleHolder>() { // from class: com.facebook.react.LazyReactPackage.2
            @Override // java.lang.Iterable
            @NonNull
            public final Iterator<ModuleHolder> iterator() {
                return new Iterator<ModuleHolder>() { // from class: com.facebook.react.LazyReactPackage.2.1
                    int a = 0;

                    /* JADX INFO: Access modifiers changed from: private */
                    @Override // java.util.Iterator
                    /* renamed from: a */
                    public ModuleHolder next() {
                        List list = nativeModules;
                        int i = this.a;
                        this.a = i + 1;
                        ModuleSpec moduleSpec = (ModuleSpec) list.get(i);
                        String name = moduleSpec.getName();
                        ReactModuleInfo reactModuleInfo = (ReactModuleInfo) a.get(name);
                        if (reactModuleInfo == null) {
                            ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_START, name);
                            try {
                                NativeModule nativeModule = moduleSpec.getProvider().get();
                                ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END);
                                return new ModuleHolder(nativeModule);
                            } catch (Throwable th) {
                                ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END);
                                throw th;
                            }
                        }
                        return new ModuleHolder(reactModuleInfo, moduleSpec.getProvider());
                    }

                    @Override // java.util.Iterator
                    public final boolean hasNext() {
                        return this.a < nativeModules.size();
                    }

                    @Override // java.util.Iterator
                    public final void remove() {
                        throw new UnsupportedOperationException("Cannot remove native modules from the list");
                    }
                };
            }
        };
    }

    @Override // com.facebook.react.i
    public final List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        for (ModuleSpec moduleSpec : getNativeModules(reactApplicationContext)) {
            com.facebook.systrace.b.a(0L, "createNativeModule");
            moduleSpec.getType();
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_START, moduleSpec.getName());
            try {
                NativeModule nativeModule = moduleSpec.getProvider().get();
                ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END);
                com.facebook.systrace.b.a(0L);
                arrayList.add(nativeModule);
            } catch (Throwable th) {
                ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END);
                com.facebook.systrace.b.a(0L);
                throw th;
            }
        }
        return arrayList;
    }

    public List<ModuleSpec> getViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }

    @Override // com.facebook.react.i
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        List<ModuleSpec> viewManagers = getViewManagers(reactApplicationContext);
        if (viewManagers == null || viewManagers.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (ModuleSpec moduleSpec : viewManagers) {
            arrayList.add((ViewManager) moduleSpec.getProvider().get());
        }
        return arrayList;
    }
}
