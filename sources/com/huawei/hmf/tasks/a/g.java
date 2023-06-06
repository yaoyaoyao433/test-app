package com.huawei.hmf.tasks.a;

import android.app.Activity;
import android.app.Fragment;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
/* loaded from: classes2.dex */
public final class g extends Fragment {
    private static final WeakHashMap<Activity, WeakReference<g>> b = new WeakHashMap<>();
    private final List<WeakReference<com.huawei.hmf.tasks.b<?>>> a = new ArrayList();

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        synchronized (this.a) {
            for (WeakReference<com.huawei.hmf.tasks.b<?>> weakReference : this.a) {
                com.huawei.hmf.tasks.b<?> bVar = weakReference.get();
                if (bVar != null) {
                    bVar.cancel();
                }
            }
            this.a.clear();
        }
    }
}
