package com.dianping.shield.utils;

import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface ObservableList<T> extends List<T> {

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static abstract class OnListChangedCallback<T extends ObservableList> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public abstract void onChanged(T t);

        public abstract void onItemRangeChanged(T t, int i, int i2, List list);

        public abstract void onItemRangeInserted(T t, int i, int i2);

        public abstract void onItemRangeMoved(T t, int i, int i2, int i3);

        public abstract void onItemRangeRemoved(T t, int i, int i2, List list);

        public abstract void onItemRangeReplaced(T t, int i, int i2, int i3, List list);
    }

    void addOnListChangedCallback(OnListChangedCallback<? extends ObservableList<T>> onListChangedCallback);

    void removeOnListChangedCallback(OnListChangedCallback<? extends ObservableList<T>> onListChangedCallback);
}
