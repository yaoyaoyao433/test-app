package android.support.v7.widget;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.support.v4.util.ArrayMap;
import android.support.v4.util.LongSparseArray;
import android.support.v4.util.Pools;
import android.support.v7.widget.RecyclerView;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class bc {
    @VisibleForTesting
    final ArrayMap<RecyclerView.s, a> a = new ArrayMap<>();
    @VisibleForTesting
    final LongSparseArray<RecyclerView.s> b = new LongSparseArray<>();

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface b {
        void a(RecyclerView.s sVar);

        void a(RecyclerView.s sVar, @NonNull RecyclerView.ItemAnimator.c cVar, @Nullable RecyclerView.ItemAnimator.c cVar2);

        void b(RecyclerView.s sVar, @Nullable RecyclerView.ItemAnimator.c cVar, RecyclerView.ItemAnimator.c cVar2);

        void c(RecyclerView.s sVar, @NonNull RecyclerView.ItemAnimator.c cVar, @NonNull RecyclerView.ItemAnimator.c cVar2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.a.clear();
        this.b.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(RecyclerView.s sVar, RecyclerView.ItemAnimator.c cVar) {
        a aVar = this.a.get(sVar);
        if (aVar == null) {
            aVar = a.a();
            this.a.put(sVar, aVar);
        }
        aVar.b = cVar;
        aVar.a |= 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(RecyclerView.s sVar) {
        a aVar = this.a.get(sVar);
        return (aVar == null || (aVar.a & 1) == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RecyclerView.ItemAnimator.c a(RecyclerView.s sVar, int i) {
        a valueAt;
        RecyclerView.ItemAnimator.c cVar;
        int indexOfKey = this.a.indexOfKey(sVar);
        if (indexOfKey < 0 || (valueAt = this.a.valueAt(indexOfKey)) == null || (valueAt.a & i) == 0) {
            return null;
        }
        valueAt.a &= ~i;
        if (i == 4) {
            cVar = valueAt.b;
        } else if (i == 8) {
            cVar = valueAt.c;
        } else {
            throw new IllegalArgumentException("Must provide flag PRE or POST");
        }
        if ((valueAt.a & 12) == 0) {
            this.a.removeAt(indexOfKey);
            a.a(valueAt);
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(long j, RecyclerView.s sVar) {
        this.b.put(j, sVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(RecyclerView.s sVar, RecyclerView.ItemAnimator.c cVar) {
        a aVar = this.a.get(sVar);
        if (aVar == null) {
            aVar = a.a();
            this.a.put(sVar, aVar);
        }
        aVar.c = cVar;
        aVar.a |= 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(RecyclerView.s sVar) {
        a aVar = this.a.get(sVar);
        if (aVar == null) {
            aVar = a.a();
            this.a.put(sVar, aVar);
        }
        aVar.a |= 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(RecyclerView.s sVar) {
        a aVar = this.a.get(sVar);
        if (aVar == null) {
            return;
        }
        aVar.a &= -2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(RecyclerView.s sVar) {
        int size = this.b.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            } else if (sVar == this.b.valueAt(size)) {
                this.b.removeAt(size);
                break;
            } else {
                size--;
            }
        }
        a remove = this.a.remove(sVar);
        if (remove != null) {
            a.a(remove);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a {
        static Pools.Pool<a> d = new Pools.SimplePool(20);
        int a;
        @Nullable
        RecyclerView.ItemAnimator.c b;
        @Nullable
        RecyclerView.ItemAnimator.c c;

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static a a() {
            a acquire = d.acquire();
            return acquire == null ? new a() : acquire;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static void a(a aVar) {
            aVar.a = 0;
            aVar.b = null;
            aVar.c = null;
            d.release(aVar);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static void b() {
            do {
            } while (d.acquire() != null);
        }
    }
}
