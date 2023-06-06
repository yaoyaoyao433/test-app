package com.meituan.msc.mmpviews.perflist;

import android.os.Looper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.s;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.ViewGroup;
import com.meituan.msc.uimanager.ThemedReactContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b<T extends RecyclerView.s> extends RecyclerView.a<T> {
    public static ChangeQuickRedirect a;
    public ThemedReactContext b;
    public com.meituan.msc.mmpviews.perflist.a<T> c;
    boolean d;

    public b(com.meituan.msc.mmpviews.perflist.a<T> aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eae86f79bd7726ec42b9b8bb1faa4e3b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eae86f79bd7726ec42b9b8bb1faa4e3b");
            return;
        }
        this.b = null;
        this.d = false;
        this.c = aVar;
        registerAdapterDataObserver(new a());
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ff2f15743b26ef03c5e3c6eed224773", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ff2f15743b26ef03c5e3c6eed224773")).intValue();
        }
        if (this.c != null) {
            return this.c.getItemCount();
        }
        return 0;
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemViewType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a68654ec57c2838de8a11095dd6cc42", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a68654ec57c2838de8a11095dd6cc42")).intValue() : this.c != null ? this.c.a(i) : i;
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final T onCreateViewHolder(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a540dfa0ea001db9705e321bdbda116", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a540dfa0ea001db9705e321bdbda116");
        }
        if (this.c != null) {
            return this.c.a(viewGroup, i);
        }
        return null;
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final void onBindViewHolder(T t, int i) {
        Object[] objArr = {t, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e3cf8860001c276c39fe6b43eb1a1e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e3cf8860001c276c39fe6b43eb1a1e5");
        } else if (this.c != null) {
            this.c.a((com.meituan.msc.mmpviews.perflist.a<T>) t, i);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Object[] objArr = {recyclerView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6f14ae32370d4757a117892b09631b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6f14ae32370d4757a117892b09631b1");
            return;
        }
        super.onAttachedToRecyclerView(recyclerView);
        if (this.c != null) {
            this.d = false;
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final void onViewAttachedToWindow(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b787b3d1cb5e31b1c75f9f0ce13b37f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b787b3d1cb5e31b1c75f9f0ce13b37f2");
            return;
        }
        super.onViewAttachedToWindow(t);
        ViewGroup.LayoutParams layoutParams = t.itemView.getLayoutParams();
        if (layoutParams instanceof StaggeredGridLayoutManager.b) {
            ((StaggeredGridLayoutManager.b) layoutParams).a(false);
        }
    }

    public final void a(final int i, final int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b48d32baa20985daa59b4d3c6dd37fa7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b48d32baa20985daa59b4d3c6dd37fa7");
        } else if (a()) {
            notifyItemRangeInserted(i, i2);
        } else {
            a(this.b, new Runnable() { // from class: com.meituan.msc.mmpviews.perflist.b.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5d21cbafd59185596a60d3ced22ba3e6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5d21cbafd59185596a60d3ced22ba3e6");
                    } else {
                        b.this.notifyItemRangeInserted(i, i2);
                    }
                }
            });
        }
    }

    public final void b(final int i, final int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff1c274e8562f934da274a79a0351eab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff1c274e8562f934da274a79a0351eab");
        } else if (a()) {
            notifyItemRangeRemoved(i, i2);
        } else {
            a(this.b, new Runnable() { // from class: com.meituan.msc.mmpviews.perflist.b.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7fb91c7b0bca2abfeb997dae5940eac4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7fb91c7b0bca2abfeb997dae5940eac4");
                    } else {
                        b.this.notifyItemRangeRemoved(i, i2);
                    }
                }
            });
        }
    }

    public final void a(final int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6a8134139850e1c7102ee234c8258bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6a8134139850e1c7102ee234c8258bb");
        } else if (a()) {
            notifyItemChanged(i);
        } else {
            a(this.b, new Runnable() { // from class: com.meituan.msc.mmpviews.perflist.b.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f0da1ea4d20036be4e7ce5f6c968c287", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f0da1ea4d20036be4e7ce5f6c968c287");
                    } else {
                        b.this.notifyItemChanged(i);
                    }
                }
            });
        }
    }

    public boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fdd711e2b1ba27d9697ef472e7450b0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fdd711e2b1ba27d9697ef472e7450b0")).booleanValue() : Looper.myLooper() == Looper.getMainLooper();
    }

    public void a(ThemedReactContext themedReactContext, Runnable runnable) {
        Object[] objArr = {themedReactContext, runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b08b9d85f3c135728c952434e987bcc0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b08b9d85f3c135728c952434e987bcc0");
        } else if (themedReactContext == null) {
        } else {
            themedReactContext.runOnUiQueueThread(runnable);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class a extends RecyclerView.c {
        public static ChangeQuickRedirect a;

        public a() {
            Object[] objArr = {b.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70754cabac90b81d989ec5274ed93b53", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70754cabac90b81d989ec5274ed93b53");
            }
        }

        @Override // android.support.v7.widget.RecyclerView.c
        public final void onChanged() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5615f89c0e310e4ee6a3043394365ab", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5615f89c0e310e4ee6a3043394365ab");
            } else {
                b.this.d = true;
            }
        }

        @Override // android.support.v7.widget.RecyclerView.c
        public final void onItemRangeChanged(int i, int i2) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55b47b9454e04d801bd1038dfce05b88", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55b47b9454e04d801bd1038dfce05b88");
            } else {
                b.this.d = true;
            }
        }

        @Override // android.support.v7.widget.RecyclerView.c
        public final void onItemRangeChanged(int i, int i2, Object obj) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24e0f10d74a8f7a120b4df735bc69095", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24e0f10d74a8f7a120b4df735bc69095");
            } else {
                b.this.d = true;
            }
        }

        @Override // android.support.v7.widget.RecyclerView.c
        public final void onItemRangeInserted(int i, int i2) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4b9134892560bd0707cbeb7433833fd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4b9134892560bd0707cbeb7433833fd");
            } else {
                b.this.d = true;
            }
        }

        @Override // android.support.v7.widget.RecyclerView.c
        public final void onItemRangeRemoved(int i, int i2) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f74f71bf538fcd19a58d56901f79c8de", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f74f71bf538fcd19a58d56901f79c8de");
            } else {
                b.this.d = true;
            }
        }

        @Override // android.support.v7.widget.RecyclerView.c
        public final void onItemRangeMoved(int i, int i2, int i3) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36013ae3ec4694c620703d05ff9361a7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36013ae3ec4694c620703d05ff9361a7");
            } else {
                b.this.d = true;
            }
        }
    }
}
