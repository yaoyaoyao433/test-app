package com.meituan.msc.uimanager.events;

import android.support.v4.internal.view.SupportMenu;
import android.util.SparseIntArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class f {
    public static ChangeQuickRedirect a;
    private final SparseIntArray b;

    public f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11f23aaed93ea7fa671bac2786848c4c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11f23aaed93ea7fa671bac2786848c4c");
        } else {
            this.b = new SparseIntArray();
        }
    }

    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4580158ec22b1b561896e5555b81e8ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4580158ec22b1b561896e5555b81e8ca");
        } else {
            this.b.put((int) j, 0);
        }
    }

    public final void b(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c1e43f339ee19a94da0bf3214dc7d0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c1e43f339ee19a94da0bf3214dc7d0a");
            return;
        }
        int i = (int) j;
        int i2 = this.b.get(i, -1);
        if (i2 == -1) {
            throw new RuntimeException("Tried to increment non-existent cookie");
        }
        this.b.put(i, i2 + 1);
    }

    public final short c(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5996d0a2b3537f0088e435553736230", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Short) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5996d0a2b3537f0088e435553736230")).shortValue();
        }
        int i = this.b.get((int) j, -1);
        if (i != -1) {
            return (short) (i & SupportMenu.USER_MASK);
        }
        throw new RuntimeException("Tried to get non-existent cookie");
    }

    public final void d(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49a8f7e9df43197b021e8ac240310bd6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49a8f7e9df43197b021e8ac240310bd6");
        } else {
            this.b.delete((int) j);
        }
    }

    public final boolean e(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f981e290c597ce4d393011de12a0720", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f981e290c597ce4d393011de12a0720")).booleanValue() : this.b.get((int) j, -1) != -1;
    }
}
