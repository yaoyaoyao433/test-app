package com.handmark.pulltorefresh.library.view;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class RecyclerViewCompat extends RecyclerView {
    private View a;
    private b b;
    private b c;
    private c d;
    private final RecyclerView.c e;
    private final com.handmark.pulltorefresh.library.view.a f;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface c {
        int a();

        int b();
    }

    public RecyclerViewCompat(Context context) {
        this(context, null);
    }

    private RecyclerViewCompat(Context context, AttributeSet attributeSet) {
        this(context, null, 0);
    }

    public RecyclerViewCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = new b();
        this.c = new b();
        this.e = new RecyclerView.c() { // from class: com.handmark.pulltorefresh.library.view.RecyclerViewCompat.1
            @Override // android.support.v7.widget.RecyclerView.c
            public final void onChanged() {
                RecyclerViewCompat.this.a();
            }

            @Override // android.support.v7.widget.RecyclerView.c
            public final void onItemRangeInserted(int i2, int i3) {
                RecyclerViewCompat.this.a();
            }

            @Override // android.support.v7.widget.RecyclerView.c
            public final void onItemRangeRemoved(int i2, int i3) {
                RecyclerViewCompat.this.a();
            }
        };
        this.f = new com.handmark.pulltorefresh.library.view.a() { // from class: com.handmark.pulltorefresh.library.view.RecyclerViewCompat.2
        };
        setLayoutManager(new LinearLayoutManager(context, 1, false));
    }

    public LinearLayoutManager getLinearLayoutManager() {
        if (getLayoutManager() instanceof LinearLayoutManager) {
            return (LinearLayoutManager) getLayoutManager();
        }
        return null;
    }

    public void setOnRecyclerViewCompatListener(c cVar) {
        this.d = cVar;
    }

    public int getFirstVisiblePosition() {
        if (!(getLayoutManager() instanceof LinearLayoutManager)) {
            if (this.d != null) {
                return this.d.a();
            }
            return -1;
        }
        return ((LinearLayoutManager) getLayoutManager()).findFirstVisibleItemPosition();
    }

    public int getLastVisiblePosition() {
        if (!(getLayoutManager() instanceof LinearLayoutManager)) {
            if (this.d != null) {
                return this.d.b();
            }
            return -1;
        }
        return ((LinearLayoutManager) getLayoutManager()).findLastVisibleItemPosition();
    }

    public int getVisibleItemCount() {
        return getLayoutManager().getChildCount();
    }

    public int getHeaderViewsCount() {
        return this.b.a();
    }

    public int getFooterViewsCount() {
        return this.c.a();
    }

    public void setAdapter2(a aVar) {
        RecyclerView.a adapter = getAdapter();
        if (adapter != null) {
            adapter.unregisterAdapterDataObserver(this.e);
            if (adapter instanceof a) {
                ((a) adapter).a();
            }
        }
        super.setAdapter(aVar);
        if (aVar != null) {
            aVar.registerAdapterDataObserver(this.e);
            aVar.a(this.f);
        }
        a();
    }

    public void setEmptyView(View view) {
        this.a = view;
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (this.a == null || getAdapter() == null) {
            return;
        }
        boolean z = getAdapter().getItemCount() == 0;
        this.a.setVisibility(z ? 0 : 8);
        setVisibility(z ? 8 : 0);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static abstract class a extends RecyclerView.a {
        protected com.handmark.pulltorefresh.library.view.a a = null;

        public final void a(com.handmark.pulltorefresh.library.view.a aVar) {
            this.a = aVar;
        }

        public final void a() {
            this.a = null;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class b {
        private List<String> a = new ArrayList();
        private List<String> b = new ArrayList();
        private Map<String, View> c = new HashMap();

        public final int a() {
            int size;
            synchronized (this) {
                size = this.b.size();
            }
            return size;
        }
    }
}
