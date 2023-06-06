package com.dianping.shield.node.adapter;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface ListObserver {
    void onChanged();

    void onItemRangeChanged(int i, int i2);

    void onItemRangeInserted(int i, int i2);

    void onItemRangeMoved(int i, int i2);

    void onItemRangeRemoved(int i, int i2);
}
