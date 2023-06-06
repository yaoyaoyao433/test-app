package com.facebook.react;

import android.support.annotation.NonNull;
import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.uimanager.ViewManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import javax.inject.Provider;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class n implements i {
    public abstract NativeModule getModule(String str, ReactApplicationContext reactApplicationContext);

    public abstract com.facebook.react.module.model.a getReactModuleInfoProvider();

    @Override // com.facebook.react.i
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        throw new UnsupportedOperationException("In case of TurboModules, createNativeModules is not supported. NativeModuleRegistry should instead use getModuleList or getModule method");
    }

    public Iterable<ModuleHolder> getNativeModuleIterator(final ReactApplicationContext reactApplicationContext) {
        final Iterator<Map.Entry<String, ReactModuleInfo>> it = getReactModuleInfoProvider().a().entrySet().iterator();
        return new Iterable<ModuleHolder>() { // from class: com.facebook.react.n.1
            @Override // java.lang.Iterable
            @NonNull
            public final Iterator<ModuleHolder> iterator() {
                return new Iterator<ModuleHolder>() { // from class: com.facebook.react.n.1.1
                    Map.Entry<String, ReactModuleInfo> a = null;

                    /* JADX WARN: Removed duplicated region for block: B:4:0x000a  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    private void a() {
                        /*
                            r3 = this;
                        L0:
                            com.facebook.react.n$1 r0 = com.facebook.react.n.AnonymousClass1.this
                            java.util.Iterator r0 = r2
                            boolean r0 = r0.hasNext()
                            if (r0 == 0) goto L25
                            com.facebook.react.n$1 r0 = com.facebook.react.n.AnonymousClass1.this
                            java.util.Iterator r0 = r2
                            java.lang.Object r0 = r0.next()
                            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                            java.lang.Object r1 = r0.getValue()
                            com.facebook.react.module.model.ReactModuleInfo r1 = (com.facebook.react.module.model.ReactModuleInfo) r1
                            boolean r2 = com.facebook.react.config.a.a
                            if (r2 == 0) goto L22
                            boolean r1 = r1.g
                            if (r1 != 0) goto L0
                        L22:
                            r3.a = r0
                            return
                        L25:
                            r0 = 0
                            r3.a = r0
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.n.AnonymousClass1.C01491.a():void");
                    }

                    @Override // java.util.Iterator
                    public final boolean hasNext() {
                        if (this.a == null) {
                            a();
                        }
                        return this.a != null;
                    }

                    @Override // java.util.Iterator
                    public final void remove() {
                        throw new UnsupportedOperationException("Cannot remove native modules from the list");
                    }

                    @Override // java.util.Iterator
                    public final /* synthetic */ ModuleHolder next() {
                        if (this.a == null) {
                            a();
                        }
                        if (this.a == null) {
                            throw new NoSuchElementException("ModuleHolder not found");
                        }
                        Map.Entry<String, ReactModuleInfo> entry = this.a;
                        a();
                        return new ModuleHolder(entry.getValue(), new a(entry.getKey(), reactApplicationContext));
                    }
                };
            }
        };
    }

    protected List<ModuleSpec> getViewManagers(ReactApplicationContext reactApplicationContext) {
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

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    class a implements Provider<NativeModule> {
        private final String b;
        private final ReactApplicationContext c;

        public a(String str, ReactApplicationContext reactApplicationContext) {
            this.b = str;
            this.c = reactApplicationContext;
        }

        @Override // javax.inject.Provider
        public final /* synthetic */ NativeModule get() {
            return n.this.getModule(this.b, this.c);
        }
    }
}
