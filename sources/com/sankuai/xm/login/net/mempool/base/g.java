package com.sankuai.xm.login.net.mempool.base;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class g<T> extends b<T> {
    public static ChangeQuickRedirect j;
    protected volatile int k;

    public g(int i) {
        super(i);
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "670b138ea232cf4319f024126eb0311e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "670b138ea232cf4319f024126eb0311e");
        } else {
            this.k = 0;
        }
    }

    public final void o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9067af9982eda372f12b74c201139a94", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9067af9982eda372f12b74c201139a94");
        } else {
            this.k++;
        }
    }

    public final void p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3298083f9f8a5b4890fe84247cb493a1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3298083f9f8a5b4890fe84247cb493a1");
            return;
        }
        this.k--;
        if (this.k < 0) {
            this.k = 0;
        }
    }

    public final boolean q() {
        return this.k == 0;
    }
}
