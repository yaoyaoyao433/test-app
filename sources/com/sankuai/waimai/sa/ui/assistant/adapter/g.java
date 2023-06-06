package com.sankuai.waimai.sa.ui.assistant.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.sa.ui.assistant.adapter.g.a;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class g<T extends a> extends RecyclerView.a<T> {
    public static ChangeQuickRedirect c;
    protected String d;

    @Override // android.support.v7.widget.RecyclerView.a
    /* renamed from: a */
    public abstract T onCreateViewHolder(ViewGroup viewGroup, int i);

    public abstract void a(T t, int i);

    @Override // android.support.v7.widget.RecyclerView.a
    public int getItemViewType(int i) {
        return 0;
    }

    public g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "631a9bdffc05e6990229adce8bad7350", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "631a9bdffc05e6990229adce8bad7350");
        } else {
            this.d = getClass().getSimpleName();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.support.v7.widget.RecyclerView.a
    public /* synthetic */ void onBindViewHolder(RecyclerView.s sVar, int i) {
        a((g<T>) ((a) sVar), i);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static abstract class a extends RecyclerView.s implements View.OnClickListener {
        public final View f;

        public a(View view) {
            super(view);
            this.f = view;
        }
    }
}
