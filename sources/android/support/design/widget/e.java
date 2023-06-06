package android.support.design.widget;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.util.Pools;
import android.support.v4.util.SimpleArrayMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class e<T> {
    final Pools.Pool<ArrayList<T>> a = new Pools.SimplePool(10);
    final SimpleArrayMap<T, ArrayList<T>> b = new SimpleArrayMap<>();
    private final ArrayList<T> c = new ArrayList<>();
    private final HashSet<T> d = new HashSet<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(@NonNull T t) {
        if (this.b.containsKey(t)) {
            return;
        }
        this.b.put(t, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public final List b(@NonNull T t) {
        return this.b.get(t);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public final List<T> c(@NonNull T t) {
        int size = this.b.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            ArrayList<T> valueAt = this.b.valueAt(i);
            if (valueAt != null && valueAt.contains(t)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.b.keyAt(i));
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public final ArrayList<T> a() {
        this.c.clear();
        this.d.clear();
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            a(this.b.keyAt(i), this.c, this.d);
        }
        return this.c;
    }

    private void a(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t)) {
            return;
        }
        if (hashSet.contains(t)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(t);
        ArrayList<T> arrayList2 = this.b.get(t);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                a(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(t);
        arrayList.add(t);
    }
}
