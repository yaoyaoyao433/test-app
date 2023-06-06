package com.sankuai.waimai.store.newwidgets.list;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.newwidgets.list.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class f<T, Contract extends com.sankuai.waimai.store.newwidgets.list.b> extends RecyclerView.a<c> {
    public static ChangeQuickRedirect e;
    @NonNull
    public final List<T> f;
    public k g;
    public l h;
    @NonNull
    protected Contract i;

    @NonNull
    public abstract g a(int i);

    public f(@NonNull Contract contract) {
        Object[] objArr = {contract};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20b60b732697cf8ab7c596e9410541e5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20b60b732697cf8ab7c596e9410541e5");
            return;
        }
        this.f = new ArrayList();
        this.i = contract;
    }

    public void a(@NonNull Contract contract) {
        this.i = contract;
    }

    @NonNull
    public final Contract f() {
        return this.i;
    }

    public void b_(List<T> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "188e127c2cfc60c743a575e66c5b88cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "188e127c2cfc60c743a575e66c5b88cb");
            return;
        }
        this.f.clear();
        if (com.sankuai.shangou.stone.util.a.a((Collection<?>) list)) {
            this.f.addAll(list);
        }
        notifyDataSetChanged();
    }

    public void c_(List<T> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a79182a5e0c8478e21dc116bcb0374d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a79182a5e0c8478e21dc116bcb0374d");
        } else if (com.sankuai.shangou.stone.util.a.a((Collection<?>) list)) {
            this.f.addAll(list);
            notifyItemRangeInserted(this.f.size() - list.size(), list.size());
        }
    }

    public final void g(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4ec05edaca1853797bd2a757a377ddd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4ec05edaca1853797bd2a757a377ddd");
        } else if (i >= this.f.size()) {
        } else {
            this.f.remove(i);
            notifyDataSetChanged();
        }
    }

    public final void a(int i, List<T> list) {
        Object[] objArr = {Integer.valueOf(i), list};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97ef48f19591958f18b82d56827d46f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97ef48f19591958f18b82d56827d46f8");
        } else if (i > this.f.size() || i < 0 || !com.sankuai.shangou.stone.util.a.a((Collection<?>) list)) {
        } else {
            this.f.addAll(i, list);
            notifyItemRangeInserted(0, list.size());
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    @NonNull
    /* renamed from: b */
    public final c onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8cc624c119857eebb8c4552dd1549ef", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8cc624c119857eebb8c4552dd1549ef");
        }
        g a2 = a(i);
        a2.a((g) this.i);
        return new c(a2, viewGroup);
    }

    public void a(k kVar) {
        this.g = kVar;
    }

    public void a(l lVar) {
        this.h = lVar;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class c extends RecyclerView.s {
        public static ChangeQuickRedirect a;
        public h b;

        private c(@NonNull h hVar, ViewGroup viewGroup) {
            super(hVar.c(viewGroup));
            Object[] objArr = {hVar, viewGroup};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a2234c6fd63de918c92ffce62cfc242", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a2234c6fd63de918c92ffce62cfc242");
                return;
            }
            this.b = hVar;
            if (hVar.h()) {
                return;
            }
            setIsRecyclable(false);
        }
    }

    public T h(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e341a57289f8503aa05365c8f88eb42", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e341a57289f8503aa05365c8f88eb42");
        }
        if (i < 0 || i >= this.f.size()) {
            return null;
        }
        return this.f.get(i);
    }

    @Override // android.support.v7.widget.RecyclerView.a
    /* renamed from: a */
    public void onBindViewHolder(@NonNull c cVar, int i) {
        Object[] objArr = {cVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e27d79113522d9cde27df92b962982f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e27d79113522d9cde27df92b962982f7");
            return;
        }
        if (this.g != null) {
            cVar.itemView.setOnClickListener(new a(i, this.g));
        }
        if (this.h != null) {
            cVar.itemView.setOnLongClickListener(new b(i, this.h));
        }
        T h = h(i);
        Object[] objArr2 = {cVar, h, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = e;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "756bcd4873a864f140a35c78123fe7ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "756bcd4873a864f140a35c78123fe7ac");
        } else {
            cVar.b.b(h, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class b implements View.OnLongClickListener {
        public static ChangeQuickRedirect a;
        private final int b;
        @NonNull
        private final l c;

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9f3cb651a8f2367816db4b940e00ad4", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9f3cb651a8f2367816db4b940e00ad4")).booleanValue();
            }
            return true;
        }

        private b(int i, @NonNull l lVar) {
            Object[] objArr = {Integer.valueOf(i), lVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d2e4c7ef29f6091c8c2e77e3bd09aeb", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d2e4c7ef29f6091c8c2e77e3bd09aeb");
                return;
            }
            this.b = i;
            this.c = lVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a implements View.OnClickListener {
        public static ChangeQuickRedirect a;
        private final int b;
        @NonNull
        private final k c;

        private a(int i, @NonNull k kVar) {
            Object[] objArr = {Integer.valueOf(i), kVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69ca62326a598a401992fe31c48aa296", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69ca62326a598a401992fe31c48aa296");
                return;
            }
            this.b = i;
            this.c = kVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efab4957a9332aef99b760640859957e", 4611686018427387906L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efab4957a9332aef99b760640859957e");
            } else {
                this.c.a(view, this.b);
            }
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c21c17a2548d9bb59d94b6d495a3aad", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c21c17a2548d9bb59d94b6d495a3aad")).intValue() : this.f.size();
    }

    public final boolean g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cbc59416952f85fdc37afdd788b1c354", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cbc59416952f85fdc37afdd788b1c354")).booleanValue() : this.f.isEmpty();
    }
}
