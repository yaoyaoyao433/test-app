package com.meituan.android.mrn.component.list;

import android.os.Looper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.s;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.ViewGroup;
import com.facebook.react.uimanager.ao;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class d<T extends RecyclerView.s> extends RecyclerView.a<T> {
    public static ChangeQuickRedirect a;
    boolean b;
    private ao c;
    private com.meituan.android.mrn.component.list.a<T> d;

    public d(ao aoVar, com.meituan.android.mrn.component.list.a<T> aVar) {
        Object[] objArr = {aoVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66866b29615ff40d80ff6759202add58", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66866b29615ff40d80ff6759202add58");
            return;
        }
        this.c = null;
        this.b = false;
        this.c = aoVar;
        this.d = aVar;
        registerAdapterDataObserver(new a());
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1dddcfd782e735717364956e54eabf7e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1dddcfd782e735717364956e54eabf7e");
            return;
        }
        this.c = null;
        this.d = null;
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2737b3ad0bd4c615ef0f724bbb7135ca", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2737b3ad0bd4c615ef0f724bbb7135ca")).intValue();
        }
        if (this.b) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4a58f6206517c69ff8aad754b6a4a5ee", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4a58f6206517c69ff8aad754b6a4a5ee");
            }
        }
        if (this.d != null) {
            return this.d.getItemCount();
        }
        return 0;
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final long getItemId(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "664eb79ff4127f62810826695aff9a29", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "664eb79ff4127f62810826695aff9a29")).longValue() : this.d != null ? this.d.b(i) : i;
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemViewType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0a714222993f56f07db26b59152b009", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0a714222993f56f07db26b59152b009")).intValue() : this.d != null ? this.d.a(i) : i;
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final void onViewRecycled(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ce225fcecfc13ac598be3e1b3b56d20", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ce225fcecfc13ac598be3e1b3b56d20");
            return;
        }
        if (this.d != null) {
            this.d.b((com.meituan.android.mrn.component.list.a<T>) t);
        }
        super.onViewRecycled(t);
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final boolean onFailedToRecycleView(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8cce66b81922bca0b622b92609751a1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8cce66b81922bca0b622b92609751a1")).booleanValue();
        }
        if (this.d != null) {
            return this.d.a((com.meituan.android.mrn.component.list.a<T>) t);
        }
        return super.onFailedToRecycleView(t);
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final T onCreateViewHolder(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1d8618995cf227fcf320ef10755025b", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1d8618995cf227fcf320ef10755025b");
        }
        if (this.d != null) {
            return this.d.a(viewGroup, i);
        }
        return null;
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final void onBindViewHolder(T t, int i) {
        Object[] objArr = {t, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8cb2358310cba63c7807234ee42e5613", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8cb2358310cba63c7807234ee42e5613");
        } else if (this.d != null) {
            this.d.a((com.meituan.android.mrn.component.list.a<T>) t, i);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Object[] objArr = {recyclerView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7acf662b3e9c373b198fd72fbdd85f1e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7acf662b3e9c373b198fd72fbdd85f1e");
            return;
        }
        super.onAttachedToRecyclerView(recyclerView);
        if (this.d != null) {
            this.b = false;
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final void onViewAttachedToWindow(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "536d8c071cae91c5a6cc60552cfe2032", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "536d8c071cae91c5a6cc60552cfe2032");
            return;
        }
        super.onViewAttachedToWindow(t);
        ViewGroup.LayoutParams layoutParams = t.itemView.getLayoutParams();
        if (layoutParams instanceof StaggeredGridLayoutManager.b) {
            StaggeredGridLayoutManager.b bVar = (StaggeredGridLayoutManager.b) layoutParams;
            if (t.itemView instanceof com.meituan.android.mrn.component.list.item.a) {
                bVar.b = true;
            } else {
                bVar.b = false;
            }
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61e38ab0ca1554fce2391945228beb3b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61e38ab0ca1554fce2391945228beb3b");
        } else if (c()) {
            notifyDataSetChanged();
        } else {
            a(this.c, new Runnable() { // from class: com.meituan.android.mrn.component.list.d.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3fd731ff074fac0b458b9d00f3446fb3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3fd731ff074fac0b458b9d00f3446fb3");
                    } else {
                        d.this.notifyDataSetChanged();
                    }
                }
            });
        }
    }

    public final void a(final int i, final int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e8edc5ebf429b6404894fe863457e00", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e8edc5ebf429b6404894fe863457e00");
        } else if (c()) {
            notifyItemRangeInserted(i, i2);
        } else {
            a(this.c, new Runnable() { // from class: com.meituan.android.mrn.component.list.d.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "027e187b2df0156f21a9351bf4339cc4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "027e187b2df0156f21a9351bf4339cc4");
                    } else {
                        d.this.notifyItemRangeInserted(i, i2);
                    }
                }
            });
        }
    }

    public final void b(final int i, final int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "385194df379267c86382f98db1d3f087", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "385194df379267c86382f98db1d3f087");
        } else if (c()) {
            notifyItemRangeRemoved(i, i2);
        } else {
            a(this.c, new Runnable() { // from class: com.meituan.android.mrn.component.list.d.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a3d5505f507a42caf79e0e63d8b04190", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a3d5505f507a42caf79e0e63d8b04190");
                    } else {
                        d.this.notifyItemRangeRemoved(i, i2);
                    }
                }
            });
        }
    }

    public final void a(final int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f0a3016ed3d82770ca0d43311d749d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f0a3016ed3d82770ca0d43311d749d5");
        } else if (c()) {
            notifyItemChanged(i);
        } else {
            a(this.c, new Runnable() { // from class: com.meituan.android.mrn.component.list.d.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "216db7544d973cc5db6b4c2dfc1910b5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "216db7544d973cc5db6b4c2dfc1910b5");
                    } else {
                        d.this.notifyItemChanged(i);
                    }
                }
            });
        }
    }

    private boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7d6fb75e5c2e54772042f1a38a7a8da", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7d6fb75e5c2e54772042f1a38a7a8da")).booleanValue() : Looper.myLooper() == Looper.getMainLooper();
    }

    private void a(ao aoVar, Runnable runnable) {
        Object[] objArr = {aoVar, runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef93b1092325c66777f6db9f2382746b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef93b1092325c66777f6db9f2382746b");
        } else if (aoVar == null) {
        } else {
            aoVar.runOnUiQueueThread(runnable);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class a extends RecyclerView.c {
        public static ChangeQuickRedirect a;

        public a() {
            Object[] objArr = {d.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "807bc7584dd2b57da3c1a1cc1c10cce4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "807bc7584dd2b57da3c1a1cc1c10cce4");
            }
        }

        @Override // android.support.v7.widget.RecyclerView.c
        public final void onChanged() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce3ae1056c3d4a390c78649b025deb64", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce3ae1056c3d4a390c78649b025deb64");
            } else {
                d.this.b = true;
            }
        }

        @Override // android.support.v7.widget.RecyclerView.c
        public final void onItemRangeChanged(int i, int i2) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2db91efe66f6fa2c2e8198ee37c340b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2db91efe66f6fa2c2e8198ee37c340b");
            } else {
                d.this.b = true;
            }
        }

        @Override // android.support.v7.widget.RecyclerView.c
        public final void onItemRangeChanged(int i, int i2, Object obj) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a565f1a5474115bd896f6d0e80fbbc1c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a565f1a5474115bd896f6d0e80fbbc1c");
            } else {
                d.this.b = true;
            }
        }

        @Override // android.support.v7.widget.RecyclerView.c
        public final void onItemRangeInserted(int i, int i2) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64e61ab6a59ef28fbe51692303ef7951", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64e61ab6a59ef28fbe51692303ef7951");
            } else {
                d.this.b = true;
            }
        }

        @Override // android.support.v7.widget.RecyclerView.c
        public final void onItemRangeRemoved(int i, int i2) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21a9465046aedc7fe702ab3e0c53810c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21a9465046aedc7fe702ab3e0c53810c");
            } else {
                d.this.b = true;
            }
        }

        @Override // android.support.v7.widget.RecyclerView.c
        public final void onItemRangeMoved(int i, int i2, int i3) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79026b1346e1d757b1f59263bddc67ad", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79026b1346e1d757b1f59263bddc67ad");
            } else {
                d.this.b = true;
            }
        }
    }
}
