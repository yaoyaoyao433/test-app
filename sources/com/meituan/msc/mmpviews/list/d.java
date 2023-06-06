package com.meituan.msc.mmpviews.list;

import android.os.Looper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.s;
import android.view.ViewGroup;
import com.meituan.msc.uimanager.ThemedReactContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d<T extends RecyclerView.s> extends RecyclerView.a<T> {
    public static ChangeQuickRedirect a;
    public ThemedReactContext b;
    public b<T> c;
    boolean d;

    public d(ThemedReactContext themedReactContext, b<T> bVar) {
        Object[] objArr = {themedReactContext, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09be7b72090d24cb8d63cc6ff1c367ed", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09be7b72090d24cb8d63cc6ff1c367ed");
            return;
        }
        this.b = null;
        this.d = false;
        this.b = themedReactContext;
        this.c = bVar;
        registerAdapterDataObserver(new a());
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6533158bb9bb7b0b994a29290225cd6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6533158bb9bb7b0b994a29290225cd6")).intValue();
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ea68d73f8a51c0da26351170db6f90c", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ea68d73f8a51c0da26351170db6f90c")).intValue() : this.c != null ? this.c.a(i) : i;
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final T onCreateViewHolder(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4bf3ffbe9f6abaf709364416bf278c03", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4bf3ffbe9f6abaf709364416bf278c03");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48ecb3ed32be9558036a098d5b6105f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48ecb3ed32be9558036a098d5b6105f1");
        } else if (this.c != null) {
            this.c.a((b<T>) t, i);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Object[] objArr = {recyclerView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5d091728dea8c64256672165a24dd53", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5d091728dea8c64256672165a24dd53");
            return;
        }
        super.onAttachedToRecyclerView(recyclerView);
        if (this.c != null) {
            this.d = false;
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ce8beb439c9d922133539c83042b1c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ce8beb439c9d922133539c83042b1c4");
        } else if (c()) {
            notifyDataSetChanged();
            b();
        } else {
            a(this.b, new Runnable() { // from class: com.meituan.msc.mmpviews.list.d.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d0717adeede5b2e60fa01469dcdc6fa8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d0717adeede5b2e60fa01469dcdc6fa8");
                        return;
                    }
                    d.this.notifyDataSetChanged();
                    d.this.b();
                }
            });
        }
    }

    public final void a(final int i, final int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "994d601797a60bb7e9c4c382586eb454", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "994d601797a60bb7e9c4c382586eb454");
        } else if (c()) {
            notifyItemRangeInserted(i, i2);
            b();
        } else {
            a(this.b, new Runnable() { // from class: com.meituan.msc.mmpviews.list.d.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1abb72e885bf5c440dd1affe0f67f298", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1abb72e885bf5c440dd1affe0f67f298");
                        return;
                    }
                    d.this.notifyItemRangeInserted(i, i2);
                    d.this.b();
                }
            });
        }
    }

    public final void b(final int i, final int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4265c11b2f4cf40c209e04a9648307d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4265c11b2f4cf40c209e04a9648307d");
        } else if (c()) {
            notifyItemRangeRemoved(i, i2);
            b();
        } else {
            a(this.b, new Runnable() { // from class: com.meituan.msc.mmpviews.list.d.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3368be3a1f143857c060c22d212f0b65", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3368be3a1f143857c060c22d212f0b65");
                        return;
                    }
                    d.this.notifyItemRangeRemoved(i, i2);
                    d.this.b();
                }
            });
        }
    }

    public final void a(final int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a77d9d7a0bb382000c9f4c86a65c7e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a77d9d7a0bb382000c9f4c86a65c7e5");
        } else if (c()) {
            notifyItemChanged(i);
            b();
        } else {
            a(this.b, new Runnable() { // from class: com.meituan.msc.mmpviews.list.d.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0ca30b4b15b0b59eddb8fa2762b1b667", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0ca30b4b15b0b59eddb8fa2762b1b667");
                        return;
                    }
                    d.this.notifyItemChanged(i);
                    d.this.b();
                }
            });
        }
    }

    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e97388aed218fe305d3873fda3015686", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e97388aed218fe305d3873fda3015686");
        } else {
            this.b.getUIManagerModule().c.a(8, "triggered by ListView reloadData");
        }
    }

    public boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b706d9e5220c3e8bc9e7901a1aad036", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b706d9e5220c3e8bc9e7901a1aad036")).booleanValue() : Looper.myLooper() == Looper.getMainLooper();
    }

    public void a(ThemedReactContext themedReactContext, Runnable runnable) {
        Object[] objArr = {themedReactContext, runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9ca3d034c26b14a9a5091c81d27a5e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9ca3d034c26b14a9a5091c81d27a5e3");
        } else if (themedReactContext == null) {
        } else {
            themedReactContext.runOnUiQueueThread(runnable);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    class a extends RecyclerView.c {
        public static ChangeQuickRedirect a;

        public a() {
            Object[] objArr = {d.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41d1f8d9bf5fde98115936f25f81fecb", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41d1f8d9bf5fde98115936f25f81fecb");
            }
        }

        @Override // android.support.v7.widget.RecyclerView.c
        public final void onChanged() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "925ec09e16e695294c2b3c957248acb3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "925ec09e16e695294c2b3c957248acb3");
            } else {
                d.this.d = true;
            }
        }

        @Override // android.support.v7.widget.RecyclerView.c
        public final void onItemRangeChanged(int i, int i2) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec833783a7f2a7009391995ed48410b4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec833783a7f2a7009391995ed48410b4");
            } else {
                d.this.d = true;
            }
        }

        @Override // android.support.v7.widget.RecyclerView.c
        public final void onItemRangeChanged(int i, int i2, Object obj) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e5cccb5eddf8f0ae7ab8249b432f95b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e5cccb5eddf8f0ae7ab8249b432f95b");
            } else {
                d.this.d = true;
            }
        }

        @Override // android.support.v7.widget.RecyclerView.c
        public final void onItemRangeInserted(int i, int i2) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1433c0cbee09683e3e6250d20652dcbb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1433c0cbee09683e3e6250d20652dcbb");
            } else {
                d.this.d = true;
            }
        }

        @Override // android.support.v7.widget.RecyclerView.c
        public final void onItemRangeRemoved(int i, int i2) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65334a7a2ace11bfe4716167dc44f8fe", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65334a7a2ace11bfe4716167dc44f8fe");
            } else {
                d.this.d = true;
            }
        }

        @Override // android.support.v7.widget.RecyclerView.c
        public final void onItemRangeMoved(int i, int i2, int i3) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c4ed9c3c7dc463eb9622123b10965ff", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c4ed9c3c7dc463eb9622123b10965ff");
            } else {
                d.this.d = true;
            }
        }
    }
}
