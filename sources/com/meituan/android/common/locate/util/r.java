package com.meituan.android.common.locate.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public abstract class r {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int a;

    public r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f8bb261a25c1701c8c591f910443b379", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f8bb261a25c1701c8c591f910443b379");
        } else {
            this.a = 0;
        }
    }

    public abstract String a();

    public abstract void b();

    public abstract void c();

    public void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6b7a3fdb4d2e0a5dc5647cc8eac0e78c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6b7a3fdb4d2e0a5dc5647cc8eac0e78c");
            return;
        }
        LogUtils.a(a() + "increase");
        this.a = this.a + 1;
        if (this.a == 1) {
            LogUtils.a(a() + "onStart");
            c();
        }
    }

    public boolean i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fc60978ac3d6c80f6f8bd7a70f0b1311", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fc60978ac3d6c80f6f8bd7a70f0b1311")).booleanValue();
        }
        LogUtils.a(a() + "decrease");
        if (this.a == 0) {
            return false;
        }
        this.a--;
        if (this.a == 0) {
            LogUtils.a(a() + "onStop");
            b();
        }
        return true;
    }
}
