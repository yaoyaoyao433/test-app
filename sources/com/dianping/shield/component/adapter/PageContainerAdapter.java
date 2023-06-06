package com.dianping.shield.component.adapter;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.dianping.agentsdk.pagecontainer.e;
import com.dianping.shield.component.widgets.PageContainerRecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class PageContainerAdapter extends RecyclerView.a<RecyclerView.s> implements e {
    private static final int VIEW_TYPE_HEADER = -1;
    public static ChangeQuickRedirect changeQuickRedirect;
    private final RecyclerView.a adapter;
    private SparseArray<View> headers;
    private boolean isPageCountFinish;
    private boolean isPageLoadingFinish;
    private RecyclerView.c mDataObserver;
    private int maxHeadersCount;
    private List<PageContainerRecyclerView.PageLoadFinishListener> pageLoadFinishListeners;
    private List<PageContainerRecyclerView.PageLoadingListener> pageLoadListeners;
    private RecyclerView recyclerView;

    public PageContainerAdapter(ArrayList<View> arrayList, RecyclerView.a aVar, RecyclerView recyclerView) {
        Object[] objArr = {arrayList, aVar, recyclerView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "680d2d5f61d76fd617f71b769e2c2c60", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "680d2d5f61d76fd617f71b769e2c2c60");
            return;
        }
        this.mDataObserver = new RecyclerView.c() { // from class: com.dianping.shield.component.adapter.PageContainerAdapter.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.support.v7.widget.RecyclerView.c
            public void onChanged() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "641e264afadedd64c972b364f1145af9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "641e264afadedd64c972b364f1145af9");
                    return;
                }
                super.onChanged();
                PageContainerAdapter.this.notifyDataSetChanged();
            }

            @Override // android.support.v7.widget.RecyclerView.c
            public void onItemRangeChanged(int i, int i2) {
                Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2dee47d08ce7582fd960e00b62ef5ef9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2dee47d08ce7582fd960e00b62ef5ef9");
                    return;
                }
                super.onItemRangeChanged(i, i2);
                PageContainerAdapter pageContainerAdapter = PageContainerAdapter.this;
                pageContainerAdapter.notifyItemRangeChanged(i + pageContainerAdapter.getHeadersCount(), i2);
            }

            @Override // android.support.v7.widget.RecyclerView.c
            public void onItemRangeInserted(int i, int i2) {
                Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c6caedfcd56e6e545e3641efd904c145", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c6caedfcd56e6e545e3641efd904c145");
                    return;
                }
                super.onItemRangeInserted(i, i2);
                PageContainerAdapter pageContainerAdapter = PageContainerAdapter.this;
                pageContainerAdapter.notifyItemRangeInserted(i + pageContainerAdapter.getHeadersCount(), i2);
            }

            @Override // android.support.v7.widget.RecyclerView.c
            public void onItemRangeRemoved(int i, int i2) {
                Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "98c608dd04f450ace0f5c351605ddc19", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "98c608dd04f450ace0f5c351605ddc19");
                    return;
                }
                super.onItemRangeRemoved(i, i2);
                PageContainerAdapter pageContainerAdapter = PageContainerAdapter.this;
                pageContainerAdapter.notifyItemRangeRemoved(i + pageContainerAdapter.getHeadersCount(), i2);
            }

            @Override // android.support.v7.widget.RecyclerView.c
            public void onItemRangeMoved(int i, int i2, int i3) {
                Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "fb522df4a79a51b47ba96598e2119a63", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "fb522df4a79a51b47ba96598e2119a63");
                    return;
                }
                super.onItemRangeMoved(i, i2, i3);
                int headersCount = PageContainerAdapter.this.getHeadersCount();
                PageContainerAdapter.this.notifyItemRangeChanged(i + headersCount, i2 + headersCount + i3);
            }
        };
        this.adapter = aVar;
        aVar.registerAdapterDataObserver(this.mDataObserver);
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eb2c48918614544c78a8c73fb03738c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eb2c48918614544c78a8c73fb03738c3");
            return;
        }
        this.headers.put((-1) - this.maxHeadersCount, view);
        this.maxHeadersCount++;
        notifyDataSetChanged();
    }

    public void removeHeader(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "df2b8348e4457c6fc705f27633ff6337", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "df2b8348e4457c6fc705f27633ff6337");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bcd5d5ca048a197509fb6c547e7533f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bcd5d5ca048a197509fb6c547e7533f5");
            return;
        }
        this.headers.clear();
        notifyDataSetChanged();
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemViewType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5e3673be414b8e184a830b12bca08f9c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5e3673be414b8e184a830b12bca08f9c")).intValue();
        }
        if (i < getHeadersCount()) {
            return this.headers.keyAt(i);
        }
        return this.adapter.getItemViewType(i - getHeadersCount());
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final RecyclerView.s onCreateViewHolder(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2bf84b29fa1491200c76d8892479dc34", RobustBitConfig.DEFAULT_VALUE)) {
            return (RecyclerView.s) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2bf84b29fa1491200c76d8892479dc34");
        }
        if (i < 0) {
            return new WrapViewHolder(this.headers.get(i));
        }
        return this.adapter.onCreateViewHolder(viewGroup, i);
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Object[] objArr = {recyclerView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fa7efc65cd0192ac70b5ecf1180752ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fa7efc65cd0192ac70b5ecf1180752ef");
            return;
        }
        super.onAttachedToRecyclerView(recyclerView);
        if (this.adapter != null) {
            this.adapter.onAttachedToRecyclerView(recyclerView);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public void onBindViewHolder(RecyclerView.s sVar, int i) {
        Object[] objArr = {sVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9be0ce663baff25b87dc1b8f9281336d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9be0ce663baff25b87dc1b8f9281336d");
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
        if (this.adapter == null || i2 >= this.adapter.getItemCount()) {
            return;
        }
        this.adapter.onBindViewHolder(sVar, i2);
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8576d31bd56319ad1072ec4e340f8509", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8576d31bd56319ad1072ec4e340f8509")).intValue();
        }
        if (this.adapter != null) {
            return getHeadersCount() + this.adapter.getItemCount();
        }
        return getHeadersCount();
    }

    public int getHeadersCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a2acbc1a941bc86d46ce1d10371c4978", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a2acbc1a941bc86d46ce1d10371c4978")).intValue();
        }
        if (this.headers == null) {
            return 0;
        }
        return this.headers.size();
    }

    public RecyclerView.a getWrappedAdapter() {
        return this.adapter;
    }

    @Override // com.dianping.agentsdk.pagecontainer.e
    public void setAutoOffset(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "35a9204bb8c813235df9b793eb48e028", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "35a9204bb8c813235df9b793eb48e028");
        } else if (getWrappedAdapter() instanceof e) {
            ((e) getWrappedAdapter()).setAutoOffset(i);
        }
    }

    @Override // com.dianping.agentsdk.pagecontainer.e
    public int getAutoOffset() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7f855a06c279aa7724bc0f44d15c89c9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7f855a06c279aa7724bc0f44d15c89c9")).intValue();
        }
        if (getWrappedAdapter() instanceof e) {
            return ((e) getWrappedAdapter()).getAutoOffset();
        }
        return 0;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    static class WrapViewHolder extends RecyclerView.s {
        public static ChangeQuickRedirect changeQuickRedirect;

        public WrapViewHolder(View view) {
            super(view);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public void setHasStableIds(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a02b8715666c2ea9fd2fde96e7c14053", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a02b8715666c2ea9fd2fde96e7c14053");
        } else {
            this.adapter.setHasStableIds(z);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public long getItemId(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "66bffee87a62b82cf7b9caea08e5665e", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "66bffee87a62b82cf7b9caea08e5665e")).longValue() : this.adapter.getItemId(i);
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public void registerAdapterDataObserver(RecyclerView.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "99a152088d8d582320743c6a419be6a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "99a152088d8d582320743c6a419be6a6");
        } else {
            this.adapter.registerAdapterDataObserver(cVar);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public void unregisterAdapterDataObserver(RecyclerView.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aeb85c24873957641c0aa44f96120d9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aeb85c24873957641c0aa44f96120d9c");
        } else {
            this.adapter.unregisterAdapterDataObserver(cVar);
        }
    }

    public void setPageLoadListeners(List<PageContainerRecyclerView.PageLoadingListener> list) {
        this.pageLoadListeners = list;
    }

    public void setPageLoadFinishListeners(List<PageContainerRecyclerView.PageLoadFinishListener> list) {
        this.pageLoadFinishListeners = list;
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public void onViewDetachedFromWindow(RecyclerView.s sVar) {
        Object[] objArr = {sVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "02fc2c7aad318abda6c4e4bbe58ec89b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "02fc2c7aad318abda6c4e4bbe58ec89b");
        } else if (sVar instanceof WrapViewHolder) {
            super.onViewDetachedFromWindow(sVar);
        } else {
            this.adapter.onViewDetachedFromWindow(sVar);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public void onViewAttachedToWindow(RecyclerView.s sVar) {
        Object[] objArr = {sVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4efdaf446bde507b81f8b68bafd9dd05", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4efdaf446bde507b81f8b68bafd9dd05");
            return;
        }
        if (sVar instanceof WrapViewHolder) {
            super.onViewAttachedToWindow(sVar);
        } else {
            this.adapter.onViewAttachedToWindow(sVar);
        }
        if (sVar.getAdapterPosition() == 0 || sVar.getAdapterPosition() != getItemCount() - 1) {
            return;
        }
        if (!this.isPageLoadingFinish && this.pageLoadListeners != null) {
            for (PageContainerRecyclerView.PageLoadingListener pageLoadingListener : this.pageLoadListeners) {
                if (pageLoadingListener != null) {
                    pageLoadingListener.onPageLoadingFinish();
                }
            }
            this.isPageLoadingFinish = true;
        }
        if (this.isPageCountFinish) {
            return;
        }
        if (this.pageLoadFinishListeners != null) {
            for (PageContainerRecyclerView.PageLoadFinishListener pageLoadFinishListener : this.pageLoadFinishListeners) {
                if (pageLoadFinishListener != null) {
                    pageLoadFinishListener.onCountFinish();
                }
            }
        }
        this.isPageCountFinish = true;
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public void onBindViewHolder(RecyclerView.s sVar, int i, List<Object> list) {
        Object[] objArr = {sVar, Integer.valueOf(i), list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "40dded76e567ab1ebc09d6a86a943021", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "40dded76e567ab1ebc09d6a86a943021");
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
        if (this.adapter == null || i2 >= this.adapter.getItemCount()) {
            return;
        }
        this.adapter.onBindViewHolder(sVar, i2, list);
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public void onViewRecycled(RecyclerView.s sVar) {
        Object[] objArr = {sVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e68121d7337d5c04991866c5e1ec3e1f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e68121d7337d5c04991866c5e1ec3e1f");
        } else if (sVar instanceof WrapViewHolder) {
            super.onViewRecycled(sVar);
        } else {
            this.adapter.onViewRecycled(sVar);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        Object[] objArr = {recyclerView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "38e3e35c6db442f3dbbee79d6892299d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "38e3e35c6db442f3dbbee79d6892299d");
        } else {
            this.adapter.onDetachedFromRecyclerView(recyclerView);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public boolean onFailedToRecycleView(RecyclerView.s sVar) {
        Object[] objArr = {sVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5068671936d7b519ed05f131e9f8330e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5068671936d7b519ed05f131e9f8330e")).booleanValue();
        }
        if (sVar instanceof WrapViewHolder) {
            return super.onFailedToRecycleView(sVar);
        }
        return this.adapter.onFailedToRecycleView(sVar);
    }
}
