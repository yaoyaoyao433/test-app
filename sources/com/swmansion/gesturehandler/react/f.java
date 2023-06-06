package com.swmansion.gesturehandler.react;

import android.support.annotation.Nullable;
import android.util.SparseArray;
import android.view.View;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class f implements com.swmansion.gesturehandler.e {
    private final SparseArray<com.swmansion.gesturehandler.b> a = new SparseArray<>();
    private final SparseArray<Integer> b = new SparseArray<>();
    private final SparseArray<ArrayList<com.swmansion.gesturehandler.b>> c = new SparseArray<>();

    public final synchronized void a(com.swmansion.gesturehandler.b bVar) {
        this.a.put(bVar.e, bVar);
    }

    @Nullable
    public final synchronized com.swmansion.gesturehandler.b a(int i) {
        return this.a.get(i);
    }

    public final synchronized boolean a(int i, int i2) {
        com.swmansion.gesturehandler.b bVar = this.a.get(i);
        if (bVar != null) {
            b(bVar);
            a(i2, bVar);
            return true;
        }
        return false;
    }

    private synchronized void a(int i, com.swmansion.gesturehandler.b bVar) {
        if (this.b.get(bVar.e) != null) {
            throw new IllegalStateException("Handler " + bVar + " already attached");
        }
        this.b.put(bVar.e, Integer.valueOf(i));
        ArrayList<com.swmansion.gesturehandler.b> arrayList = this.c.get(i);
        if (arrayList == null) {
            ArrayList<com.swmansion.gesturehandler.b> arrayList2 = new ArrayList<>(1);
            arrayList2.add(bVar);
            this.c.put(i, arrayList2);
            return;
        }
        arrayList.add(bVar);
    }

    private synchronized void b(final com.swmansion.gesturehandler.b bVar) {
        Integer num = this.b.get(bVar.e);
        if (num != null) {
            this.b.remove(bVar.e);
            ArrayList<com.swmansion.gesturehandler.b> arrayList = this.c.get(num.intValue());
            if (arrayList != null) {
                arrayList.remove(bVar);
                if (arrayList.size() == 0) {
                    this.c.remove(num.intValue());
                }
            }
        }
        if (bVar.f != null) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.swmansion.gesturehandler.react.f.1
                @Override // java.lang.Runnable
                public final void run() {
                    bVar.cancel();
                }
            });
        }
    }

    public final synchronized void b(int i) {
        com.swmansion.gesturehandler.b bVar = this.a.get(i);
        if (bVar != null) {
            b(bVar);
            this.a.remove(i);
        }
    }

    public final synchronized void a() {
        this.a.clear();
        this.b.clear();
        this.c.clear();
    }

    private synchronized ArrayList<com.swmansion.gesturehandler.b> c(int i) {
        return this.c.get(i);
    }

    @Override // com.swmansion.gesturehandler.e
    public final synchronized ArrayList<com.swmansion.gesturehandler.b> a(View view) {
        return c(view.getId());
    }
}
