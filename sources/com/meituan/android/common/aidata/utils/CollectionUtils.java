package com.meituan.android.common.aidata.utils;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.Contract;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class CollectionUtils {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface Predicate<E> {
        boolean test(E e);
    }

    @Contract(pure = true, value = "null -> true")
    public static <T> boolean isEmpty(@Nullable Collection<T> collection) {
        Object[] objArr = {collection};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "30b32071c18dc7617088a36527ccdfb0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "30b32071c18dc7617088a36527ccdfb0")).booleanValue() : collection == null || collection.isEmpty();
    }

    @Contract(pure = true, value = "null -> true")
    public static <T> boolean isEmpty(@Nullable T[] tArr) {
        return tArr == null || tArr.length == 0;
    }

    public static int size(@Nullable Collection collection) {
        Object[] objArr = {collection};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "de12601360b6d0f6c6e655c3088c748f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "de12601360b6d0f6c6e655c3088c748f")).intValue();
        }
        if (collection != null) {
            return collection.size();
        }
        return 0;
    }

    @NonNull
    public static <T> List<T> nonNullList(@Nullable List<T> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8ff5e891157a3d134d1995ffe97173a9", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8ff5e891157a3d134d1995ffe97173a9") : list == null ? Collections.emptyList() : list;
    }

    public static <K, V> Map<K, V> nonNullMap(@Nullable Map<K, V> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "828b343f0a468dda09f748398f574f80", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "828b343f0a468dda09f748398f574f80") : map == null ? Collections.emptyMap() : map;
    }

    public static <T> Set<T> nonNullSet(@Nullable Set<T> set) {
        Object[] objArr = {set};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "18d72c4d10a1581d752921ea1340ca22", RobustBitConfig.DEFAULT_VALUE) ? (Set) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "18d72c4d10a1581d752921ea1340ca22") : set == null ? Collections.emptySet() : set;
    }

    public static <E> boolean removeIf(Collection<E> collection, Predicate<E> predicate) {
        boolean z = false;
        Object[] objArr = {collection, predicate};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "743421603a46c4a32ee2695d144aaf9a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "743421603a46c4a32ee2695d144aaf9a")).booleanValue();
        }
        if (collection == null || predicate == null) {
            return false;
        }
        Iterator<E> it = collection.iterator();
        while (it.hasNext()) {
            if (predicate.test(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public static <E> List<E> filterList(@Nullable List<E> list, @NonNull Predicate<E> predicate) {
        Object[] objArr = {list, predicate};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f2ac7efc74c829dc4ca321a44e716966", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f2ac7efc74c829dc4ca321a44e716966");
        }
        List nonNullList = nonNullList(list);
        int size = nonNullList.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            Object obj = nonNullList.get(i);
            if (predicate.test(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
