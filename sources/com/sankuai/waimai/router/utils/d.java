package com.sankuai.waimai.router.utils;

import android.annotation.TargetApi;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.function.Consumer;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d<T> extends AbstractList<T> {
    public static ChangeQuickRedirect a;
    private final LinkedList<a<T>> b;
    private final int c;

    private d(int i) {
        Object[] objArr = {0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "198dcbbb93f8e1514f2383e6274564db", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "198dcbbb93f8e1514f2383e6274564db");
            return;
        }
        this.b = new LinkedList<>();
        this.c = 0;
    }

    public d() {
        this(0);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a0d884341eb54a2d44c034ae16dd6ea", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a0d884341eb54a2d44c034ae16dd6ea");
        }
    }

    public final boolean a(T t, int i) {
        Object[] objArr = {t, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1428cb419d55d5155e5039eaff94ad5e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1428cb419d55d5155e5039eaff94ad5e")).booleanValue();
        }
        a<T> aVar = new a<>(t, i);
        if (this.b.isEmpty()) {
            this.b.add(aVar);
            return true;
        }
        ListIterator<a<T>> listIterator = this.b.listIterator();
        while (listIterator.hasNext()) {
            if (listIterator.next().a < i) {
                listIterator.previous();
                listIterator.add(aVar);
                return true;
            }
        }
        this.b.addLast(aVar);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    @Deprecated
    public final void add(int i, T t) {
        Object[] objArr = {Integer.valueOf(i), t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (!PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e18bb1d2afe077645fc556adac6f5754", RobustBitConfig.DEFAULT_VALUE)) {
            throw new UnsupportedOperationException("不支持添加到指定位置");
        }
        PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e18bb1d2afe077645fc556adac6f5754");
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fbfe5d099c0b1da5bb6c8967bf5eb510", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fbfe5d099c0b1da5bb6c8967bf5eb510")).booleanValue() : a(t, this.c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a57aaf55c4312a65bc3eff023938396", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a57aaf55c4312a65bc3eff023938396")).booleanValue();
        }
        Iterator<a<T>> it = this.b.iterator();
        while (it.hasNext()) {
            if (it.next().b == obj) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba9082bb8060d1a55b42be5d0a3fa634", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba9082bb8060d1a55b42be5d0a3fa634")).intValue() : this.b.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final T get(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0119ac927be6a311f3767e3f09412bad", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0119ac927be6a311f3767e3f09412bad") : this.b.get(i).b;
    }

    @Override // java.util.AbstractList, java.util.List
    public final T set(int i, T t) {
        Object[] objArr = {Integer.valueOf(i), t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efe10379b3689bfb9c756a0af80c56ec", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efe10379b3689bfb9c756a0af80c56ec");
        }
        a<T> aVar = this.b.get(i);
        T t2 = aVar.b;
        aVar.b = t;
        return t2;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @NonNull
    public final Iterator<T> iterator() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7fa787a7eca17913075a0e289b7d8363", RobustBitConfig.DEFAULT_VALUE) ? (Iterator) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7fa787a7eca17913075a0e289b7d8363") : new b(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a<T> {
        public int a;
        public T b;

        public a(T t, int i) {
            this.b = t;
            this.a = i;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class b implements Iterator<T> {
        public static ChangeQuickRedirect a;
        private final ListIterator<a<T>> c;

        public b(d dVar) {
            this(0);
            Object[] objArr = {dVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "891a9e87ed24fcc47b1bd3254d228beb", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "891a9e87ed24fcc47b1bd3254d228beb");
            }
        }

        private b(int i) {
            Object[] objArr = {d.this, 0};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32793e2a6e5fceb1cd37c554eba5bf2a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32793e2a6e5fceb1cd37c554eba5bf2a");
            } else {
                this.c = d.this.b.listIterator(0);
            }
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6766d252dbed26a53ec4d2830b5c584", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6766d252dbed26a53ec4d2830b5c584")).booleanValue() : this.c.hasNext();
        }

        @Override // java.util.Iterator
        public final T next() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4921495111c0e901f46e4df946824d96", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4921495111c0e901f46e4df946824d96") : this.c.next().b;
        }

        @Override // java.util.Iterator
        public final void remove() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d2f5f276e9b3c5eb51f7250276e3208", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d2f5f276e9b3c5eb51f7250276e3208");
            } else {
                this.c.remove();
            }
        }

        @Override // java.util.Iterator
        @TargetApi(24)
        public final void forEachRemaining(final Consumer<? super T> consumer) {
            Object[] objArr = {consumer};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f8d1e4421c4b1ed690665a29ed848f1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f8d1e4421c4b1ed690665a29ed848f1");
            } else {
                this.c.forEachRemaining(new Consumer<a<T>>() { // from class: com.sankuai.waimai.router.utils.d.b.1
                    public static ChangeQuickRedirect a;

                    @Override // java.util.function.Consumer
                    public final /* synthetic */ void accept(Object obj) {
                        a aVar = (a) obj;
                        Object[] objArr2 = {aVar};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1acbc02c725e2d1ca7f3627549171108", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1acbc02c725e2d1ca7f3627549171108");
                        } else {
                            consumer.accept(aVar.b);
                        }
                    }
                });
            }
        }
    }
}
