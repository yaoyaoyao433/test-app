package com.meituan.android.mrn.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class al<T> {
    public static ChangeQuickRedirect b;
    protected WeakReference<T> c;

    public al(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "572c02495c369f42191b7ddeadc92b15", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "572c02495c369f42191b7ddeadc92b15");
        } else {
            this.c = new WeakReference<>(t);
        }
    }

    public final T a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ccba64ae1772ff491860bcab9492ac92", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ccba64ae1772ff491860bcab9492ac92");
        }
        if (this.c == null) {
            return null;
        }
        return this.c.get();
    }
}
