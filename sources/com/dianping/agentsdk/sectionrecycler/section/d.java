package com.dianping.agentsdk.sectionrecycler.section;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.s;
import android.util.Pair;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class d<VH extends RecyclerView.s> extends RecyclerView.a<VH> {
    public static final long NO_ID = -1;
    public static ChangeQuickRedirect changeQuickRedirect;
    protected boolean isOnBind;
    protected RecyclerView recyclerView;

    public int getItemViewType(int i, int i2) {
        return 0;
    }

    public abstract int getRowCount(int i);

    public abstract int getSectionCount();

    public abstract void onBindViewHolder(VH vh, int i, int i2);

    @Override // android.support.v7.widget.RecyclerView.a
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Object[] objArr = {recyclerView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3d50d26e2d41fe4068cc8b2a22e6eb6a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3d50d26e2d41fe4068cc8b2a22e6eb6a");
            return;
        }
        super.onAttachedToRecyclerView(recyclerView);
        this.recyclerView = recyclerView;
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        Object[] objArr = {recyclerView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8e2a5241a91e12f92ad4eaf3df6e444d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8e2a5241a91e12f92ad4eaf3df6e444d");
            return;
        }
        this.recyclerView = null;
        super.onDetachedFromRecyclerView(recyclerView);
    }

    @Override // android.support.v7.widget.RecyclerView.a
    @Deprecated
    public final void onBindViewHolder(VH vh, int i, List<Object> list) {
        Object[] objArr = {vh, Integer.valueOf(i), list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5f16fccc71b54a7c1b25799c86eac8ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5f16fccc71b54a7c1b25799c86eac8ff");
        } else {
            super.onBindViewHolder((d<VH>) vh, i, list);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemViewType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9a4fddb2864b6bb5f3b30a0543d3f184", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9a4fddb2864b6bb5f3b30a0543d3f184")).intValue();
        }
        Pair<Integer, Integer> sectionIndex = getSectionIndex(i);
        if (sectionIndex != null) {
            return getItemViewType(((Integer) sectionIndex.first).intValue(), ((Integer) sectionIndex.second).intValue());
        }
        return 0;
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public void onBindViewHolder(VH vh, int i) {
        Object[] objArr = {vh, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "59f699d3b11eec29441326bca1557cdc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "59f699d3b11eec29441326bca1557cdc");
            return;
        }
        Pair<Integer, Integer> sectionIndex = getSectionIndex(i);
        if (sectionIndex != null) {
            this.isOnBind = true;
            onBindViewHolder((d<VH>) vh, ((Integer) sectionIndex.first).intValue(), ((Integer) sectionIndex.second).intValue());
            this.isOnBind = false;
        }
    }

    public boolean isOnBind() {
        return this.isOnBind;
    }

    public Pair<Integer, Integer> getSectionIndex(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2696ff8a48ef5a65656b7e0c63c073e7", RobustBitConfig.DEFAULT_VALUE)) {
            return (Pair) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2696ff8a48ef5a65656b7e0c63c073e7");
        }
        int sectionCount = getSectionCount();
        if (sectionCount > 0) {
            for (int i2 = 0; i2 < sectionCount; i2++) {
                int rowCount = getRowCount(i2);
                if (i < rowCount) {
                    return new Pair<>(Integer.valueOf(i2), Integer.valueOf(i));
                }
                i -= rowCount;
            }
            return null;
        }
        return null;
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4a169342897891bfa43567dd0fb9f691", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4a169342897891bfa43567dd0fb9f691")).intValue();
        }
        int sectionCount = getSectionCount();
        if (sectionCount <= 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < sectionCount; i2++) {
            i += getRowCount(i2);
        }
        return i;
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final long getItemId(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a2af6ae072b9a3f939edc2e4d854acc2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a2af6ae072b9a3f939edc2e4d854acc2")).longValue();
        }
        Pair<Integer, Integer> sectionIndex = getSectionIndex(i);
        return sectionIndex != null ? getItemId(((Integer) sectionIndex.first).intValue(), ((Integer) sectionIndex.second).intValue()) : i;
    }

    public long getItemId(int i, int i2) {
        long j;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a018a0672fb1dc417ca3face426683c7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a018a0672fb1dc417ca3face426683c7")).longValue();
        }
        long j2 = 0;
        for (int i3 = 0; i3 < getSectionCount(); i3++) {
            if (i3 < i) {
                j = j2;
                for (int i4 = 0; i4 < getRowCount(i3); i4++) {
                    j++;
                }
            } else if (i3 == i) {
                j = j2;
                for (int i5 = 0; i5 < getRowCount(i3); i5++) {
                    if (i5 < i2) {
                        j++;
                    }
                }
            }
            j2 = j;
        }
        return j2;
    }
}
