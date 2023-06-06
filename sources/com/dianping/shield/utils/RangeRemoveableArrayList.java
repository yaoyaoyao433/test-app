package com.dianping.shield.utils;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Collection;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class RangeRemoveableArrayList<T> extends ArrayList<T> {
    public static ChangeQuickRedirect changeQuickRedirect;

    public RangeRemoveableArrayList(int i) {
        super(i);
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "83e446098896b0be6d1b0a0f3495439e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "83e446098896b0be6d1b0a0f3495439e");
        }
    }

    public RangeRemoveableArrayList() {
    }

    public RangeRemoveableArrayList(@NonNull Collection<? extends T> collection) {
        super(collection);
        Object[] objArr = {collection};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6a4323f666800b5873ecc41fdb3c940b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6a4323f666800b5873ecc41fdb3c940b");
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractList
    public void removeRange(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3c45c38ba9ec7770823f70a6e8380d26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3c45c38ba9ec7770823f70a6e8380d26");
        } else {
            super.removeRange(i, i2);
        }
    }
}
