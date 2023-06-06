package com.dianping.shield.prefetch;

import android.util.SparseArray;
import com.dianping.shield.utils.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.functions.b;
import kotlin.jvm.internal.i;
/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "element", "invoke", "(Ljava/lang/Object;)Z"}, k = 3, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class AttachStatusWithPrefetchManager$updateCurrentInScreenElement$3<T> extends i implements b<T, Boolean> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ SparseArray $completeInScreenElementList;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AttachStatusWithPrefetchManager$updateCurrentInScreenElement$3(SparseArray sparseArray) {
        super(1);
        this.$completeInScreenElementList = sparseArray;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.b
    public final /* synthetic */ Boolean invoke(Object obj) {
        return Boolean.valueOf(invoke2((AttachStatusWithPrefetchManager$updateCurrentInScreenElement$3<T>) obj));
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final boolean invoke2(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c64480ec6468726899956b1b73cec3cf", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c64480ec6468726899956b1b73cec3cf")).booleanValue() : !CollectionUtils.Companion.hasEqualsValue(t, this.$completeInScreenElementList);
    }
}
