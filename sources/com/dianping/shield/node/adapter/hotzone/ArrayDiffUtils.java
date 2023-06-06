package com.dianping.shield.node.adapter.hotzone;

import android.support.annotation.NonNull;
import android.util.SparseArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ArrayDiffUtils {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface Comparator<T> {
        boolean equals(T t, T t2);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface Processor<T> {
        void processAddedItem(int i, T t);

        void processDeletedItem(int i, T t);

        void processUnchangedList(int i, T t);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class Result<T> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public SparseArray<T> addedList = new SparseArray<>();
        public SparseArray<T> deletedList = new SparseArray<>();
        public SparseArray<T> unchangedList = new SparseArray<>();
    }

    public static <T> Result<T> diffForResult(ArrayList<T> arrayList, int i, ArrayList<T> arrayList2, int i2) {
        Object[] objArr = {arrayList, Integer.valueOf(i), arrayList2, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d0211577b2ed4c9c1a8e28ebb420c0fa", RobustBitConfig.DEFAULT_VALUE) ? (Result) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d0211577b2ed4c9c1a8e28ebb420c0fa") : diffForResult(arrayList, i, arrayList2, i2, null);
    }

    public static <T> Result<T> diffForResult(ArrayList<T> arrayList, int i, ArrayList<T> arrayList2, int i2, Comparator<T> comparator) {
        Object[] objArr = {arrayList, Integer.valueOf(i), arrayList2, Integer.valueOf(i2), comparator};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a838b8ed3e27f615cee16404ba7e8b68", RobustBitConfig.DEFAULT_VALUE)) {
            return (Result) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a838b8ed3e27f615cee16404ba7e8b68");
        }
        Result<T> result = new Result<>();
        diffForProcess(arrayList, i, arrayList2, i2, new ResultProcessor(result), comparator);
        return result;
    }

    public static <T> void diffForProcess(ArrayList<T> arrayList, int i, ArrayList<T> arrayList2, int i2, @NonNull Processor<T> processor) {
        Object[] objArr = {arrayList, Integer.valueOf(i), arrayList2, Integer.valueOf(i2), processor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0acd8845330b220ef2ac436b5cb025d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0acd8845330b220ef2ac436b5cb025d2");
        } else {
            diffForProcess(arrayList, i, arrayList2, i2, processor, null);
        }
    }

    public static <T> void diffForProcess(ArrayList<T> arrayList, int i, ArrayList<T> arrayList2, int i2, @NonNull Processor<T> processor, Comparator<T> comparator) {
        boolean z;
        Object[] objArr = {arrayList, Integer.valueOf(i), arrayList2, Integer.valueOf(i2), processor, comparator};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bd7d7e9a6a9d49503febbd872ba216aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bd7d7e9a6a9d49503febbd872ba216aa");
            return;
        }
        int size = arrayList != null ? arrayList.size() : 0;
        int size2 = arrayList2 != null ? arrayList2.size() : 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < size && i4 < size2) {
            int i5 = i3 + i;
            int i6 = i4 + i2;
            if (i5 < i6) {
                processor.processDeletedItem(i5, arrayList.get(i3));
                i3++;
            } else if (i5 > i6) {
                processor.processAddedItem(i6, arrayList2.get(i4));
                i4++;
            } else {
                T t = arrayList.get(i3);
                T t2 = arrayList2.get(i4);
                if (comparator != null) {
                    z = comparator.equals(t, t2);
                } else {
                    z = t == t2 || (t != null && t.equals(t2));
                }
                if (!z) {
                    processor.processDeletedItem(i5, t);
                    processor.processAddedItem(i6, t2);
                } else {
                    processor.processUnchangedList(i6, t2);
                }
                i3++;
                i4++;
            }
        }
        if (i3 < size) {
            while (i3 < size) {
                processor.processDeletedItem(i3 + i, arrayList.get(i3));
                i3++;
            }
        }
        if (i4 < size2) {
            while (i4 < size2) {
                processor.processAddedItem(i4 + i2, arrayList2.get(i4));
                i4++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class ResultProcessor<T> implements Processor<T> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Result<T> result;

        public ResultProcessor(Result<T> result) {
            Object[] objArr = {result};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b1ed662a578b5de3cf28c5b77ff80bf8", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b1ed662a578b5de3cf28c5b77ff80bf8");
            } else {
                this.result = result;
            }
        }

        @Override // com.dianping.shield.node.adapter.hotzone.ArrayDiffUtils.Processor
        public void processDeletedItem(int i, T t) {
            Object[] objArr = {Integer.valueOf(i), t};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5559e06902151bc390535ea97ea2c7d9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5559e06902151bc390535ea97ea2c7d9");
            } else if (this.result != null) {
                this.result.deletedList.put(i, t);
            }
        }

        @Override // com.dianping.shield.node.adapter.hotzone.ArrayDiffUtils.Processor
        public void processAddedItem(int i, T t) {
            Object[] objArr = {Integer.valueOf(i), t};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f23d0df18306336895a1e598b8433f5e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f23d0df18306336895a1e598b8433f5e");
            } else if (this.result != null) {
                this.result.addedList.put(i, t);
            }
        }

        @Override // com.dianping.shield.node.adapter.hotzone.ArrayDiffUtils.Processor
        public void processUnchangedList(int i, T t) {
            Object[] objArr = {Integer.valueOf(i), t};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fe026da0ab10b9972e963e1b21e4ef96", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fe026da0ab10b9972e963e1b21e4ef96");
            } else if (this.result != null) {
                this.result.unchangedList.put(i, t);
            }
        }
    }
}
