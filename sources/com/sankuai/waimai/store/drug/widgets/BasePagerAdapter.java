package com.sankuai.waimai.store.drug.widgets;

import android.support.v4.view.PagerAdapter;
import android.util.SparseArray;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class BasePagerAdapter<T> extends PagerAdapter {
    public static ChangeQuickRedirect a;
    protected final List<T> b;
    private final SparseArray<View> c;

    public BasePagerAdapter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9922b8c0ecef4380e11f9eeab4fd5217", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9922b8c0ecef4380e11f9eeab4fd5217");
            return;
        }
        this.b = new ArrayList();
        this.c = new SparseArray<>();
    }
}
