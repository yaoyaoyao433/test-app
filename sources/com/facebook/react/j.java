package com.facebook.react;

import android.support.annotation.NonNull;
import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class j {
    public static Iterable<ModuleHolder> a(i iVar, ReactApplicationContext reactApplicationContext, ReactInstanceManager reactInstanceManager) {
        final List<NativeModule> createNativeModules;
        com.facebook.common.logging.a.a("ReactNative", iVar.getClass().getSimpleName() + " is not a LazyReactPackage, falling back to old version.");
        if (iVar instanceof g) {
            createNativeModules = ((g) iVar).a(reactApplicationContext, reactInstanceManager);
        } else {
            createNativeModules = iVar.createNativeModules(reactApplicationContext);
        }
        return new Iterable<ModuleHolder>() { // from class: com.facebook.react.j.1
            @Override // java.lang.Iterable
            @NonNull
            public final Iterator<ModuleHolder> iterator() {
                return new Iterator<ModuleHolder>() { // from class: com.facebook.react.j.1.1
                    int a = 0;

                    @Override // java.util.Iterator
                    public final boolean hasNext() {
                        return this.a < createNativeModules.size();
                    }

                    @Override // java.util.Iterator
                    public final void remove() {
                        throw new UnsupportedOperationException("Cannot remove methods ");
                    }

                    @Override // java.util.Iterator
                    public final /* synthetic */ ModuleHolder next() {
                        List list = createNativeModules;
                        int i = this.a;
                        this.a = i + 1;
                        return new ModuleHolder((NativeModule) list.get(i));
                    }
                };
            }
        };
    }
}
