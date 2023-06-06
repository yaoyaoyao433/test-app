package com.dianping.shield.utils;

import android.support.annotation.NonNull;
import android.util.SparseArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collection;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class IndexMap<T> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int autoIndex;
    private SparseArray<T> index2Value;
    private HashMap<T, Integer> value2Index;

    public IndexMap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5940ad24890cf228c5573482275235e4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5940ad24890cf228c5573482275235e4");
            return;
        }
        this.autoIndex = 0;
        this.index2Value = new SparseArray<>();
        this.value2Index = new HashMap<>();
    }

    public int getIndex(@NonNull T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2e7b4b8d58a14536189b90ca2b36d4d1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2e7b4b8d58a14536189b90ca2b36d4d1")).intValue();
        }
        Integer num = this.value2Index.get(t);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    public T getValue(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "13e0b439254f776bd1a25d1e4308895a", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "13e0b439254f776bd1a25d1e4308895a") : this.index2Value.get(i);
    }

    public void putValue(@NonNull T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e2b1f6f04462ef8cf0f94212e41539ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e2b1f6f04462ef8cf0f94212e41539ec");
        } else if (this.value2Index.containsKey(t)) {
        } else {
            this.value2Index.put(t, Integer.valueOf(this.autoIndex));
            this.index2Value.put(this.autoIndex, t);
            this.autoIndex++;
        }
    }

    public boolean containsValue(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dd40567700cff11d41b4f4f0c76a7fb0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dd40567700cff11d41b4f4f0c76a7fb0")).booleanValue() : this.value2Index.containsKey(t);
    }

    public void putValue(Collection<T> collection) {
        Object[] objArr = {collection};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d971eda35be13f47816d1059cfe76cac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d971eda35be13f47816d1059cfe76cac");
        } else if (collection != null && !collection.isEmpty()) {
            for (T t : collection) {
                if (t != null) {
                    putValue((IndexMap<T>) t);
                }
            }
        }
    }

    public void removeValue(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ffdbcb626ffa259b4a1580522628765c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ffdbcb626ffa259b4a1580522628765c");
            return;
        }
        Integer remove = this.value2Index.remove(t);
        if (remove != null) {
            this.index2Value.remove(remove.intValue());
        }
    }

    public void removeValue(Collection<T> collection) {
        Object[] objArr = {collection};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0bc6fab170fb42fc8622aedd2098cc36", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0bc6fab170fb42fc8622aedd2098cc36");
        } else if (collection != null && !collection.isEmpty()) {
            for (T t : collection) {
                if (t != null) {
                    removeValue((IndexMap<T>) t);
                }
            }
        }
    }

    public void clear() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "32d1006e2b34fd56f1aa48299b7229fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "32d1006e2b34fd56f1aa48299b7229fe");
            return;
        }
        this.value2Index.clear();
        this.index2Value.clear();
        this.autoIndex = 0;
    }
}
