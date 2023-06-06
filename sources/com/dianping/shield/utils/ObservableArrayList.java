package com.dianping.shield.utils;

import android.support.annotation.NonNull;
import com.dianping.shield.utils.ObservableList;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ObservableArrayList<T> extends RangeRemoveableArrayList<T> implements ObservableList<T> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private transient ListChangeRegistry mListeners;

    public ObservableArrayList(int i) {
        super(i);
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a26bf9d5178f2886fb8b16259a08e747", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a26bf9d5178f2886fb8b16259a08e747");
        } else {
            this.mListeners = new ListChangeRegistry();
        }
    }

    public ObservableArrayList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d4dbdd7d2dbe016a5a70eece963a98be", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d4dbdd7d2dbe016a5a70eece963a98be");
        } else {
            this.mListeners = new ListChangeRegistry();
        }
    }

    public ObservableArrayList(@NonNull Collection<? extends T> collection) {
        super(collection);
        Object[] objArr = {collection};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "88592e6778dd621bcd4fc1bece6216b9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "88592e6778dd621bcd4fc1bece6216b9");
        } else {
            this.mListeners = new ListChangeRegistry();
        }
    }

    @Override // com.dianping.shield.utils.ObservableList
    public void addOnListChangedCallback(ObservableList.OnListChangedCallback onListChangedCallback) {
        Object[] objArr = {onListChangedCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bc35e383c050365dab95304bd6b897c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bc35e383c050365dab95304bd6b897c6");
            return;
        }
        if (this.mListeners == null) {
            this.mListeners = new ListChangeRegistry();
        }
        this.mListeners.add(onListChangedCallback);
    }

    @Override // com.dianping.shield.utils.ObservableList
    public void removeOnListChangedCallback(ObservableList.OnListChangedCallback onListChangedCallback) {
        Object[] objArr = {onListChangedCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "05957ba2a1a37cd56f9684b67c34cd4f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "05957ba2a1a37cd56f9684b67c34cd4f");
        } else if (this.mListeners != null) {
            this.mListeners.remove(onListChangedCallback);
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d3f141e8b37f5ab587257b71e27648d2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d3f141e8b37f5ab587257b71e27648d2")).booleanValue();
        }
        super.add(t);
        notifyAdd(size() - 1, 1);
        return true;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public void add(int i, T t) {
        Object[] objArr = {Integer.valueOf(i), t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0c8e4ad5de42176619515ff771ca32c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0c8e4ad5de42176619515ff771ca32c5");
            return;
        }
        super.add(i, t);
        notifyAdd(i, 1);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends T> collection) {
        Object[] objArr = {collection};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4e25cdf798fbd2836792cfa860693e08", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4e25cdf798fbd2836792cfa860693e08")).booleanValue();
        }
        int size = size();
        boolean addAll = super.addAll(collection);
        if (addAll) {
            notifyAdd(size, size() - size);
        }
        return addAll;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection<? extends T> collection) {
        Object[] objArr = {Integer.valueOf(i), collection};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "619364a3d991e48730e0c55bd24d2285", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "619364a3d991e48730e0c55bd24d2285")).booleanValue();
        }
        boolean addAll = super.addAll(i, collection);
        if (addAll) {
            notifyAdd(i, collection.size());
        }
        return addAll;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a65c9068e4e55cfbc87156ae4b51a3ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a65c9068e4e55cfbc87156ae4b51a3ce");
            return;
        }
        int size = size();
        ArrayList arrayList = (ArrayList) clone();
        super.clear();
        if (size != 0) {
            notifyRemove(0, size, arrayList);
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public T remove(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cb2fb6a42e9196db64e4d0c265f21ade", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cb2fb6a42e9196db64e4d0c265f21ade");
        }
        T t = (T) super.remove(i);
        ArrayList arrayList = new ArrayList();
        arrayList.add(t);
        notifyRemove(i, 1, arrayList);
        return t;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3914a7fab0ababc6610e687d4284ae50", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3914a7fab0ababc6610e687d4284ae50")).booleanValue();
        }
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            remove(indexOf);
            return true;
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public T set(int i, T t) {
        Object[] objArr = {Integer.valueOf(i), t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a0c27cbd398b7d7b3fcad2320a08507c", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a0c27cbd398b7d7b3fcad2320a08507c");
        }
        T t2 = (T) super.set(i, t);
        ArrayList arrayList = new ArrayList();
        arrayList.add(t2);
        if (this.mListeners != null) {
            this.mListeners.notifyChanged(this, i, 1, arrayList);
        }
        return t2;
    }

    public void setAll(int i, ArrayList<? extends T> arrayList) {
        Object[] objArr = {Integer.valueOf(i), arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "15b79bcf4701661d8749b51ff1cde8c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "15b79bcf4701661d8749b51ff1cde8c0");
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList2.add(super.set(i + i2, arrayList.get(i2)));
        }
        if (this.mListeners != null) {
            this.mListeners.notifyChanged(this, i, arrayList.size(), arrayList2);
        }
    }

    @Override // com.dianping.shield.utils.RangeRemoveableArrayList, java.util.ArrayList, java.util.AbstractList
    public void removeRange(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8fc6ef373ec1a54b9c9c3b9e1658d59e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8fc6ef373ec1a54b9c9c3b9e1658d59e");
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(subList(i, i2));
        super.removeRange(i, i2);
        notifyRemove(i, i2 - i, arrayList);
    }

    public void replaceWithRemoveAndInsert(int i, int i2, @NonNull Collection<? extends T> collection) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), collection};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0059ce98943562849d0384c5f85d02e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0059ce98943562849d0384c5f85d02e9");
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(subList(i, i2));
        super.removeRange(i, i2);
        if (super.addAll(i, collection) || i2 - i > 0) {
            notifyReplace(i, collection.size(), i2 - i, arrayList);
        }
    }

    private void notifyAdd(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e2b793d27885cf3925f2f3af7350fc86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e2b793d27885cf3925f2f3af7350fc86");
        } else if (this.mListeners != null) {
            this.mListeners.notifyInserted(this, i, i2);
        }
    }

    private void notifyRemove(int i, int i2, List list) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3535a08022b0266567cdc0c6eb4d5d6e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3535a08022b0266567cdc0c6eb4d5d6e");
        } else if (this.mListeners != null) {
            this.mListeners.notifyRemoved(this, i, i2, list);
        }
    }

    private void notifyReplace(int i, int i2, int i3, List list) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bf76e2992f671c98be547481b33d34d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bf76e2992f671c98be547481b33d34d4");
        } else if (this.mListeners != null) {
            this.mListeners.notifyReplaced(this, i, i2, i3, list);
        }
    }
}
