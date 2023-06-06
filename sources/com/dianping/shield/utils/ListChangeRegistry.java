package com.dianping.shield.utils;

import android.support.v4.util.Pools;
import com.dianping.shield.utils.CallbackRegistry;
import com.dianping.shield.utils.ObservableList;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ListChangeRegistry extends CallbackRegistry<ObservableList.OnListChangedCallback, ObservableList, ListChanges> {
    private static final int ALL = 0;
    private static final int CHANGED = 1;
    private static final int INSERTED = 2;
    private static final int MOVED = 3;
    private static final int REMOVED = 4;
    private static final int REPLACED = 5;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final Pools.SynchronizedPool<ListChanges> sListChanges = new Pools.SynchronizedPool<>(10);
    private static final CallbackRegistry.NotifierCallback<ObservableList.OnListChangedCallback, ObservableList, ListChanges> NOTIFIER_CALLBACK = new CallbackRegistry.NotifierCallback<ObservableList.OnListChangedCallback, ObservableList, ListChanges>() { // from class: com.dianping.shield.utils.ListChangeRegistry.1
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // com.dianping.shield.utils.CallbackRegistry.NotifierCallback
        public final void onNotifyCallback(ObservableList.OnListChangedCallback onListChangedCallback, ObservableList observableList, int i, ListChanges listChanges) {
            Object[] objArr = {onListChangedCallback, observableList, Integer.valueOf(i), listChanges};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b3e70db1ad24761820c3ea2d3febc609", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b3e70db1ad24761820c3ea2d3febc609");
                return;
            }
            switch (i) {
                case 1:
                    onListChangedCallback.onItemRangeChanged(observableList, listChanges.start, listChanges.count, listChanges.oldItems);
                    return;
                case 2:
                    onListChangedCallback.onItemRangeInserted(observableList, listChanges.start, listChanges.count);
                    return;
                case 3:
                    onListChangedCallback.onItemRangeMoved(observableList, listChanges.start, listChanges.to, listChanges.count);
                    return;
                case 4:
                    onListChangedCallback.onItemRangeRemoved(observableList, listChanges.start, listChanges.count, listChanges.oldItems);
                    return;
                case 5:
                    onListChangedCallback.onItemRangeReplaced(observableList, listChanges.start, listChanges.count, listChanges.oldCount, listChanges.oldItems);
                    return;
                default:
                    onListChangedCallback.onChanged(observableList);
                    return;
            }
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class ListChanges {
        public static ChangeQuickRedirect changeQuickRedirect;
        public int count;
        public int oldCount;
        public List oldItems;
        public int start;
        public int to;
    }

    public ListChangeRegistry() {
        super(NOTIFIER_CALLBACK);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "265978bc625998243c53e581a18a5c62", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "265978bc625998243c53e581a18a5c62");
        }
    }

    private static ListChanges acquire(int i, int i2, int i3, int i4, List list) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8b257a4369577c58fea59384f79ede42", RobustBitConfig.DEFAULT_VALUE)) {
            return (ListChanges) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8b257a4369577c58fea59384f79ede42");
        }
        ListChanges acquire = sListChanges.acquire();
        if (acquire == null) {
            acquire = new ListChanges();
        }
        acquire.start = i;
        acquire.to = i2;
        acquire.count = i3;
        acquire.oldCount = i4;
        acquire.oldItems = list;
        return acquire;
    }

    public static void releasePoolData() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b763152ca1f2b0229b1a54730e936eea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b763152ca1f2b0229b1a54730e936eea");
            return;
        }
        while (true) {
            ListChanges acquire = sListChanges.acquire();
            if (acquire == null) {
                return;
            }
            acquire.oldItems = null;
        }
    }

    public void notifyChanged(ObservableList observableList) {
        Object[] objArr = {observableList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1d375badb8041e5494f42b00759a7dd2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1d375badb8041e5494f42b00759a7dd2");
        } else {
            notifyCallbacks(observableList, 0, (ListChanges) null);
        }
    }

    public void notifyChanged(ObservableList observableList, int i, int i2, List list) {
        Object[] objArr = {observableList, Integer.valueOf(i), Integer.valueOf(i2), list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b9a79437718aa18fb2b4d8e8c501f9a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b9a79437718aa18fb2b4d8e8c501f9a8");
        } else {
            notifyCallbacks(observableList, 1, acquire(i, 0, i2, 0, list));
        }
    }

    public void notifyInserted(ObservableList observableList, int i, int i2) {
        Object[] objArr = {observableList, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2e05e999617d1a1a273bcacb95dad13e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2e05e999617d1a1a273bcacb95dad13e");
        } else {
            notifyCallbacks(observableList, 2, acquire(i, 0, i2, 0, null));
        }
    }

    public void notifyMoved(ObservableList observableList, int i, int i2, int i3) {
        Object[] objArr = {observableList, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8086258287c0af5984bbcfea742ff692", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8086258287c0af5984bbcfea742ff692");
        } else {
            notifyCallbacks(observableList, 3, acquire(i, i2, i3, 0, null));
        }
    }

    public void notifyRemoved(ObservableList observableList, int i, int i2, List list) {
        Object[] objArr = {observableList, Integer.valueOf(i), Integer.valueOf(i2), list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b02fb1b65fa7ac7d95b0fc1556d5ce96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b02fb1b65fa7ac7d95b0fc1556d5ce96");
        } else {
            notifyCallbacks(observableList, 4, acquire(i, 0, i2, 0, list));
        }
    }

    public void notifyReplaced(ObservableList observableList, int i, int i2, int i3, List list) {
        Object[] objArr = {observableList, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "82fcdee37720517628e4cf4e4adf8cd1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "82fcdee37720517628e4cf4e4adf8cd1");
        } else {
            notifyCallbacks(observableList, 5, acquire(i, 0, i2, i3, list));
        }
    }

    @Override // com.dianping.shield.utils.CallbackRegistry
    public synchronized void notifyCallbacks(ObservableList observableList, int i, ListChanges listChanges) {
        Object[] objArr = {observableList, Integer.valueOf(i), listChanges};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8f83a1205420b617f157d2515ef2982e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8f83a1205420b617f157d2515ef2982e");
            return;
        }
        super.notifyCallbacks((ListChangeRegistry) observableList, i, (int) listChanges);
        if (listChanges != null) {
            sListChanges.release(listChanges);
            listChanges.oldItems = null;
        }
    }
}
