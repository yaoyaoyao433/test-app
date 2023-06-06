package com.dianping.voyager.widgets.container.secondfloor;

import android.support.annotation.Keep;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
/* compiled from: ProGuard */
@Keep
@Deprecated
/* loaded from: classes.dex */
public class HeaderViewRecyclerAdapter extends RecyclerView.a<RecyclerView.s> {
    private static final int VIEW_TYPE_HEADER = -1;
    public static ChangeQuickRedirect changeQuickRedirect;
    private SparseArray<View> headers;
    private final RecyclerView.a mAdapter;
    private RecyclerView.c mDataObserver;
    private int maxHeadersCount;
    private RecyclerView recyclerView;

    public HeaderViewRecyclerAdapter(ArrayList<View> arrayList, RecyclerView.a aVar, RecyclerView recyclerView) {
        Object[] objArr = {arrayList, aVar, recyclerView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c3ed718d648a0eee2449231946ac0ae4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c3ed718d648a0eee2449231946ac0ae4");
            return;
        }
        this.mDataObserver = new RecyclerView.c() { // from class: com.dianping.voyager.widgets.container.secondfloor.HeaderViewRecyclerAdapter.1
            public static ChangeQuickRedirect a;

            @Override // android.support.v7.widget.RecyclerView.c
            public final void onChanged() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "aae95aa786155cfbd91cfdff2ced8432", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "aae95aa786155cfbd91cfdff2ced8432");
                    return;
                }
                super.onChanged();
                HeaderViewRecyclerAdapter.this.notifyDataSetChanged();
            }

            @Override // android.support.v7.widget.RecyclerView.c
            public final void onItemRangeChanged(int i, int i2) {
                Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1bf5acf67ea66e092e7a8ce47e1c8b25", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1bf5acf67ea66e092e7a8ce47e1c8b25");
                    return;
                }
                super.onItemRangeChanged(i, i2);
                HeaderViewRecyclerAdapter headerViewRecyclerAdapter = HeaderViewRecyclerAdapter.this;
                headerViewRecyclerAdapter.notifyItemRangeChanged(i + headerViewRecyclerAdapter.getHeadersCount(), i2);
            }

            @Override // android.support.v7.widget.RecyclerView.c
            public final void onItemRangeInserted(int i, int i2) {
                Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7a21579726ac1522a6acbfc870568575", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7a21579726ac1522a6acbfc870568575");
                    return;
                }
                super.onItemRangeInserted(i, i2);
                HeaderViewRecyclerAdapter headerViewRecyclerAdapter = HeaderViewRecyclerAdapter.this;
                headerViewRecyclerAdapter.notifyItemRangeInserted(i + headerViewRecyclerAdapter.getHeadersCount(), i2);
            }

            @Override // android.support.v7.widget.RecyclerView.c
            public final void onItemRangeRemoved(int i, int i2) {
                Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2cdc68af53434dbf2491e016a49246ac", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2cdc68af53434dbf2491e016a49246ac");
                    return;
                }
                super.onItemRangeRemoved(i, i2);
                HeaderViewRecyclerAdapter headerViewRecyclerAdapter = HeaderViewRecyclerAdapter.this;
                headerViewRecyclerAdapter.notifyItemRangeRemoved(i + headerViewRecyclerAdapter.getHeadersCount(), i2);
            }

            @Override // android.support.v7.widget.RecyclerView.c
            public final void onItemRangeMoved(int i, int i2, int i3) {
                Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "38f123e9a0fd6ee36aef70086c6d963b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "38f123e9a0fd6ee36aef70086c6d963b");
                    return;
                }
                super.onItemRangeMoved(i, i2, i3);
                int headersCount = HeaderViewRecyclerAdapter.this.getHeadersCount();
                HeaderViewRecyclerAdapter.this.notifyItemRangeChanged(i + headersCount, i2 + headersCount + i3);
            }
        };
        this.mAdapter = aVar;
        this.mAdapter.registerAdapterDataObserver(this.mDataObserver);
        this.recyclerView = recyclerView;
        this.headers = new SparseArray<>();
        this.maxHeadersCount = arrayList == null ? 0 : arrayList.size();
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                this.headers.put((-1) - i, arrayList.get(i));
            }
        }
    }

    public void addHeader(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "153b39e1f0023e3966f1faba791c7aa0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "153b39e1f0023e3966f1faba791c7aa0");
            return;
        }
        this.headers.put((-1) - this.maxHeadersCount, view);
        this.maxHeadersCount++;
        notifyDataSetChanged();
    }

    public void removeHeader(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7c3670f60f6f199b2e34232ab76189e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7c3670f60f6f199b2e34232ab76189e9");
            return;
        }
        for (int i = 0; i < this.headers.size(); i++) {
            int keyAt = this.headers.keyAt(i);
            if (view == this.headers.get(keyAt)) {
                this.headers.remove(keyAt);
            }
        }
        notifyDataSetChanged();
    }

    public void removeAllHeader() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2bf157605151f332dcb288160d72ab5f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2bf157605151f332dcb288160d72ab5f");
            return;
        }
        this.headers.clear();
        notifyDataSetChanged();
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemViewType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c0ab20d3a9309f45771b7b95dbabb81b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c0ab20d3a9309f45771b7b95dbabb81b")).intValue();
        }
        if (i < getHeadersCount()) {
            return this.headers.keyAt(i);
        }
        return this.mAdapter.getItemViewType(i - getHeadersCount());
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final RecyclerView.s onCreateViewHolder(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "edc868171df08b0365fbd785a6292baf", RobustBitConfig.DEFAULT_VALUE)) {
            return (RecyclerView.s) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "edc868171df08b0365fbd785a6292baf");
        }
        if (i < 0) {
            return new a(this.headers.get(i));
        }
        return this.mAdapter.onCreateViewHolder(viewGroup, i);
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public void onBindViewHolder(RecyclerView.s sVar, int i) {
        Object[] objArr = {sVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "852749e11e21ceade09b18eb975178bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "852749e11e21ceade09b18eb975178bd");
            return;
        }
        if (i == 0 && getHeadersCount() == 1 && (this.recyclerView.getLayoutManager() instanceof StaggeredGridLayoutManager)) {
            StaggeredGridLayoutManager.b bVar = new StaggeredGridLayoutManager.b(-1, -2);
            bVar.b = true;
            sVar.itemView.setLayoutParams(bVar);
        }
        int headersCount = getHeadersCount();
        if (i < headersCount) {
            return;
        }
        int i2 = i - headersCount;
        if (this.mAdapter == null || i2 >= this.mAdapter.getItemCount()) {
            return;
        }
        this.mAdapter.onBindViewHolder(sVar, i2);
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "00e295b1e5ccd03e8273d5a3762490ab", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "00e295b1e5ccd03e8273d5a3762490ab")).intValue();
        }
        if (this.mAdapter != null) {
            return getHeadersCount() + this.mAdapter.getItemCount();
        }
        return getHeadersCount();
    }

    public int getHeadersCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "535376d13c29abdbb5d3ac67a6ef5a3b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "535376d13c29abdbb5d3ac67a6ef5a3b")).intValue();
        }
        if (this.headers == null) {
            return 0;
        }
        return this.headers.size();
    }

    public RecyclerView.a getWrappedAdapter() {
        return this.mAdapter;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    static class a extends RecyclerView.s {
        public a(View view) {
            super(view);
        }
    }
}
