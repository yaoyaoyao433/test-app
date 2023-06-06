package com.facebook.react;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import com.facebook.react.bridge.MemoryPressureListener;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b implements ComponentCallbacks2 {
    final Set<MemoryPressureListener> a = Collections.synchronizedSet(new LinkedHashSet());

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Context context) {
        context.getApplicationContext().registerComponentCallbacks(this);
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        for (MemoryPressureListener memoryPressureListener : (MemoryPressureListener[]) this.a.toArray(new MemoryPressureListener[this.a.size()])) {
            memoryPressureListener.handleMemoryPressure(i);
        }
    }
}
