package com.meituan.android.neohybrid.util.gson.checker;

import com.meituan.android.neohybrid.util.gson.annotation.ArrayCheck;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b implements a<ArrayCheck> {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.neohybrid.util.gson.checker.a
    public final /* bridge */ /* synthetic */ String a(ArrayCheck arrayCheck, Object obj) {
        return a2(arrayCheck, (ArrayCheck) obj);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private <V> String a2(ArrayCheck arrayCheck, V v) {
        int i = 0;
        Object[] objArr = {arrayCheck, v};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4a29e21c562789c8f2d86a570b47efc", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4a29e21c562789c8f2d86a570b47efc");
        }
        if (arrayCheck == null || v == null) {
            return null;
        }
        HashSet hashSet = new HashSet(Arrays.asList(arrayCheck.strCheck()));
        boolean z = !hashSet.isEmpty();
        try {
            if (v.getClass().isArray()) {
                int length = Array.getLength(v);
                while (i < length) {
                    Object obj = Array.get(v, i);
                    if (obj == null) {
                        return "ArrayChecker: element at " + i + " is null.";
                    } else if ((obj instanceof String) && z && !hashSet.contains(obj)) {
                        return "ArrayChecker: element at " + i + " is " + obj + ", not correct";
                    } else {
                        i++;
                    }
                }
            } else if (!Collection.class.isAssignableFrom(v.getClass())) {
                return "ArrayChecker: element is not array type";
            } else {
                for (Object obj2 : (Collection) v) {
                    if (obj2 == null) {
                        return "ArrayChecker: element at " + i + " is null.";
                    } else if ((obj2 instanceof String) && z && !hashSet.contains(obj2)) {
                        return "ArrayChecker: element at " + i + " is " + obj2 + ", not correct";
                    } else {
                        i++;
                    }
                }
            }
        } catch (Exception e) {
            com.meituan.android.neohybrid.neo.report.b.a(e, "ArrayChecker: check");
        }
        return null;
    }
}
