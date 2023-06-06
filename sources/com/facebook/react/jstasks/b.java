package com.facebook.react.jstasks;

import android.os.Handler;
import android.util.SparseArray;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactSoftException;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.modules.appregistry.AppRegistry;
import com.meituan.robust.common.CommonConstant;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b {
    private static final WeakHashMap<ReactContext, b> b = new WeakHashMap<>();
    private final WeakReference<ReactContext> c;
    public final Set<c> a = new CopyOnWriteArraySet();
    private final AtomicInteger d = new AtomicInteger(0);
    private final Handler e = new Handler();
    private final Set<Integer> f = new CopyOnWriteArraySet();
    private final Map<Integer, a> g = new ConcurrentHashMap();
    private final SparseArray<Runnable> h = new SparseArray<>();

    public static b a(ReactContext reactContext) {
        b bVar = b.get(reactContext);
        if (bVar == null) {
            b bVar2 = new b(reactContext);
            b.put(reactContext, bVar2);
            return bVar2;
        }
        return bVar;
    }

    private b(ReactContext reactContext) {
        this.c = new WeakReference<>(reactContext);
    }

    public final boolean a() {
        return this.f.size() > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(a aVar, final int i) {
        UiThreadUtil.assertOnUiThread();
        ReactContext reactContext = (ReactContext) com.facebook.infer.annotation.a.a(this.c.get(), "Tried to start a task on a react context that has already been destroyed");
        if (reactContext.getLifecycleState() == LifecycleState.RESUMED && !aVar.d) {
            throw new IllegalStateException("Tried to start task " + aVar.a + " while in foreground, but this is not allowed.");
        }
        this.f.add(Integer.valueOf(i));
        this.g.put(Integer.valueOf(i), new a(aVar));
        if (reactContext.hasActiveCatalystInstance()) {
            ((AppRegistry) reactContext.getJSModule(AppRegistry.class)).startHeadlessTask(i, aVar.a, aVar.b);
        } else {
            ReactSoftException.logSoftException("HeadlessJsTaskContext", new RuntimeException("Cannot start headless task, CatalystInstance not available"));
        }
        if (aVar.c > 0) {
            long j = aVar.c;
            Runnable runnable = new Runnable() { // from class: com.facebook.react.jstasks.b.3
                @Override // java.lang.Runnable
                public final void run() {
                    b.this.b(i);
                }
            };
            this.h.append(i, runnable);
            this.e.postDelayed(runnable, j);
        }
        for (c cVar : this.a) {
            cVar.onHeadlessJsTaskStart(i);
        }
    }

    public final synchronized boolean a(final int i) {
        a aVar = this.g.get(Integer.valueOf(i));
        boolean z = aVar != null;
        com.facebook.infer.annotation.a.a(z, "Tried to retrieve non-existent task config with id " + i + CommonConstant.Symbol.DOT);
        d dVar = aVar.e;
        if (dVar.a()) {
            d(i);
            final a aVar2 = new a(aVar.a, aVar.b, aVar.c, aVar.d, dVar.c());
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.jstasks.b.1
                @Override // java.lang.Runnable
                public final void run() {
                    b.this.a(aVar2, i);
                }
            }, dVar.b());
            return true;
        }
        return false;
    }

    public final synchronized void b(final int i) {
        boolean remove = this.f.remove(Integer.valueOf(i));
        com.facebook.infer.annotation.a.a(remove, "Tried to finish non-existent task with id " + i + CommonConstant.Symbol.DOT);
        boolean z = this.g.remove(Integer.valueOf(i)) != null;
        com.facebook.infer.annotation.a.a(z, "Tried to remove non-existent task config with id " + i + CommonConstant.Symbol.DOT);
        d(i);
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.jstasks.b.2
            @Override // java.lang.Runnable
            public final void run() {
                for (c cVar : b.this.a) {
                    cVar.onHeadlessJsTaskFinish(i);
                }
            }
        });
    }

    private void d(int i) {
        Runnable runnable = this.h.get(i);
        if (runnable != null) {
            this.e.removeCallbacks(runnable);
            this.h.remove(i);
        }
    }

    public final synchronized boolean c(int i) {
        return this.f.contains(Integer.valueOf(i));
    }
}
