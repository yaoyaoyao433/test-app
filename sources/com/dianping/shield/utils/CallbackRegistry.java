package com.dianping.shield.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class CallbackRegistry<C, T, A> implements Cloneable {
    private static final String TAG = "CallbackRegistry";
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<C> mCallbacks;
    private long mFirst64Removed;
    private int mNotificationLevel;
    private final NotifierCallback<C, T, A> mNotifier;
    private long[] mRemainderRemoved;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static abstract class NotifierCallback<C, T, A> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public abstract void onNotifyCallback(C c, T t, int i, A a);
    }

    public CallbackRegistry(NotifierCallback<C, T, A> notifierCallback) {
        Object[] objArr = {notifierCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "af9b5acb2ab70ab793c425cb5674705a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "af9b5acb2ab70ab793c425cb5674705a");
            return;
        }
        this.mCallbacks = new ArrayList();
        this.mFirst64Removed = 0L;
        this.mNotifier = notifierCallback;
    }

    public synchronized void notifyCallbacks(T t, int i, A a) {
        Object[] objArr = {t, Integer.valueOf(i), a};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5557b3dcb749cd5eaeb4acc5cdd38e49", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5557b3dcb749cd5eaeb4acc5cdd38e49");
            return;
        }
        this.mNotificationLevel++;
        notifyRecurseLocked(t, i, a);
        this.mNotificationLevel--;
        if (this.mNotificationLevel == 0) {
            if (this.mRemainderRemoved != null) {
                for (int length = this.mRemainderRemoved.length - 1; length >= 0; length--) {
                    long j = this.mRemainderRemoved[length];
                    if (j != 0) {
                        removeRemovedCallbacks((length + 1) * 64, j);
                        this.mRemainderRemoved[length] = 0;
                    }
                }
            }
            if (this.mFirst64Removed != 0) {
                removeRemovedCallbacks(0, this.mFirst64Removed);
                this.mFirst64Removed = 0L;
            }
        }
    }

    private void notifyFirst64Locked(T t, int i, A a) {
        Object[] objArr = {t, Integer.valueOf(i), a};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "febfb719e029fcb7401b99b76366d449", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "febfb719e029fcb7401b99b76366d449");
        } else {
            notifyCallbacksLocked(t, i, a, 0, Math.min(64, this.mCallbacks.size()), this.mFirst64Removed);
        }
    }

    private void notifyRecurseLocked(T t, int i, A a) {
        Object[] objArr = {t, Integer.valueOf(i), a};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "59488a4b483dbfcacccc645adde2dffe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "59488a4b483dbfcacccc645adde2dffe");
            return;
        }
        int size = this.mCallbacks.size();
        int length = this.mRemainderRemoved == null ? -1 : this.mRemainderRemoved.length - 1;
        notifyRemainderLocked(t, i, a, length);
        notifyCallbacksLocked(t, i, a, (length + 2) * 64, size, 0L);
    }

    private void notifyRemainderLocked(T t, int i, A a, int i2) {
        Object[] objArr = {t, Integer.valueOf(i), a, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8aae1254e07ca0b2f5ee58d5447ab3d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8aae1254e07ca0b2f5ee58d5447ab3d3");
        } else if (i2 < 0) {
            notifyFirst64Locked(t, i, a);
        } else {
            long j = this.mRemainderRemoved[i2];
            int i3 = (i2 + 1) * 64;
            int min = Math.min(this.mCallbacks.size(), i3 + 64);
            notifyRemainderLocked(t, i, a, i2 - 1);
            notifyCallbacksLocked(t, i, a, i3, min, j);
        }
    }

    private void notifyCallbacksLocked(T t, int i, A a, int i2, int i3, long j) {
        Object[] objArr = {t, Integer.valueOf(i), a, Integer.valueOf(i2), Integer.valueOf(i3), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5e694dc79f0dc6bb7a05fc45202fc636", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5e694dc79f0dc6bb7a05fc45202fc636");
            return;
        }
        long j2 = 1;
        for (int i4 = i2; i4 < i3; i4++) {
            if ((j & j2) == 0) {
                this.mNotifier.onNotifyCallback(this.mCallbacks.get(i4), t, i, a);
            }
            j2 <<= 1;
        }
    }

    public synchronized void add(C c) {
        Object[] objArr = {c};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "228783b29c5f57b23a9645a0c5fea74e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "228783b29c5f57b23a9645a0c5fea74e");
            return;
        }
        int lastIndexOf = this.mCallbacks.lastIndexOf(c);
        if (lastIndexOf < 0 || isRemovedLocked(lastIndexOf)) {
            this.mCallbacks.add(c);
        }
    }

    private boolean isRemovedLocked(int i) {
        int i2;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "78e13a31049c3fbffd008e90e382e1f8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "78e13a31049c3fbffd008e90e382e1f8")).booleanValue() : i < 64 ? ((1 << i) & this.mFirst64Removed) != 0 : (this.mRemainderRemoved == null || (i2 = (i / 64) - 1) >= this.mRemainderRemoved.length || ((1 << (i % 64)) & this.mRemainderRemoved[i2]) == 0) ? false : true;
    }

    private void removeRemovedCallbacks(int i, long j) {
        Object[] objArr = {Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e00bbc537cf0fc9bc67bf0d0c1d46ef4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e00bbc537cf0fc9bc67bf0d0c1d46ef4");
            return;
        }
        long j2 = Long.MIN_VALUE;
        for (int i2 = (i + 64) - 1; i2 >= i; i2--) {
            if ((j & j2) != 0) {
                this.mCallbacks.remove(i2);
            }
            j2 >>>= 1;
        }
    }

    public synchronized void remove(C c) {
        Object[] objArr = {c};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "19585cf028ea6c0b88109b1969dfbb28", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "19585cf028ea6c0b88109b1969dfbb28");
        } else if (this.mNotificationLevel == 0) {
            this.mCallbacks.remove(c);
        } else {
            int lastIndexOf = this.mCallbacks.lastIndexOf(c);
            if (lastIndexOf >= 0) {
                setRemovalBitLocked(lastIndexOf);
            }
        }
    }

    private void setRemovalBitLocked(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c6698e1a417f06b80f1e47e534d0917b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c6698e1a417f06b80f1e47e534d0917b");
        } else if (i < 64) {
            this.mFirst64Removed = (1 << i) | this.mFirst64Removed;
        } else {
            int i2 = (i / 64) - 1;
            if (this.mRemainderRemoved == null) {
                this.mRemainderRemoved = new long[this.mCallbacks.size() / 64];
            } else if (this.mRemainderRemoved.length < i2) {
                long[] jArr = new long[this.mCallbacks.size() / 64];
                System.arraycopy(this.mRemainderRemoved, 0, jArr, 0, this.mRemainderRemoved.length);
                this.mRemainderRemoved = jArr;
            }
            long j = 1 << (i % 64);
            long[] jArr2 = this.mRemainderRemoved;
            jArr2[i2] = j | jArr2[i2];
        }
    }

    public synchronized ArrayList<C> copyListeners() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bd174fc9f9c8c0689544e42152d7276b", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bd174fc9f9c8c0689544e42152d7276b");
        }
        ArrayList<C> arrayList = new ArrayList<>(this.mCallbacks.size());
        int size = this.mCallbacks.size();
        for (int i = 0; i < size; i++) {
            if (!isRemovedLocked(i)) {
                arrayList.add(this.mCallbacks.get(i));
            }
        }
        return arrayList;
    }

    public synchronized boolean isEmpty() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "82851b0183626bd8b767938566eeb26f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "82851b0183626bd8b767938566eeb26f")).booleanValue();
        } else if (this.mCallbacks.isEmpty()) {
            return true;
        } else {
            if (this.mNotificationLevel == 0) {
                return false;
            }
            int size = this.mCallbacks.size();
            for (int i = 0; i < size; i++) {
                if (!isRemovedLocked(i)) {
                    return false;
                }
            }
            return true;
        }
    }

    public synchronized void clear() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "80f2b266a0eabd64a45bdd0113e0c0e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "80f2b266a0eabd64a45bdd0113e0c0e7");
        } else if (this.mNotificationLevel == 0) {
            this.mCallbacks.clear();
        } else if (!this.mCallbacks.isEmpty()) {
            for (int size = this.mCallbacks.size() - 1; size >= 0; size--) {
                setRemovalBitLocked(size);
            }
        }
    }

    /* renamed from: clone */
    public synchronized CallbackRegistry<C, T, A> m4clone() {
        CallbackRegistry<C, T, A> callbackRegistry;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "05694fb54ce5fe36c4363b0c9b0c9dc5", RobustBitConfig.DEFAULT_VALUE)) {
            return (CallbackRegistry) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "05694fb54ce5fe36c4363b0c9b0c9dc5");
        }
        try {
            callbackRegistry = (CallbackRegistry) super.clone();
            try {
                callbackRegistry.mFirst64Removed = 0L;
                callbackRegistry.mRemainderRemoved = null;
                callbackRegistry.mNotificationLevel = 0;
                callbackRegistry.mCallbacks = new ArrayList();
                int size = this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    if (!isRemovedLocked(i)) {
                        callbackRegistry.mCallbacks.add(this.mCallbacks.get(i));
                    }
                }
            } catch (CloneNotSupportedException e) {
                e = e;
                e.printStackTrace();
                return callbackRegistry;
            }
        } catch (CloneNotSupportedException e2) {
            e = e2;
            callbackRegistry = null;
        }
        return callbackRegistry;
    }
}
