package com.sankuai.waimai.pouch.viewmodel;

import android.arch.lifecycle.k;
import android.arch.lifecycle.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.js.JSInvokeNativeMethod;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class PouchViewModel extends o {
    public static ChangeQuickRedirect a;
    public k<Void> b;
    public k<Integer> c;
    public k<Void> d;
    public k<Void> e;
    public k<JSInvokeNativeMethod> f;
    public int g;
    public boolean h;
    public CopyOnWriteArrayList i;

    public PouchViewModel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6afcb526e3d51df8b6feeb75086b0622", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6afcb526e3d51df8b6feeb75086b0622");
        } else {
            this.i = new CopyOnWriteArrayList();
        }
    }

    public final k<Integer> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9642961a6ad02813f71f3619e1f3fe8", RobustBitConfig.DEFAULT_VALUE)) {
            return (k) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9642961a6ad02813f71f3619e1f3fe8");
        }
        if (this.c == null) {
            this.c = new k<>();
        }
        return this.c;
    }

    public final k<Void> c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "440c5ccdb65e77a94fe403e7760b5818", RobustBitConfig.DEFAULT_VALUE)) {
            return (k) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "440c5ccdb65e77a94fe403e7760b5818");
        }
        if (this.d == null) {
            this.d = new k<>();
        }
        return this.d;
    }

    public final k<Void> d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "726ce7b39e15263cda77bc73be80ce5a", RobustBitConfig.DEFAULT_VALUE)) {
            return (k) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "726ce7b39e15263cda77bc73be80ce5a");
        }
        if (this.e == null) {
            this.e = new k<>();
        }
        return this.e;
    }

    public final boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f484f5bbffbaf527112e2a133be79bc7", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f484f5bbffbaf527112e2a133be79bc7")).booleanValue() : this.i.contains(str);
    }

    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad75241ca621c893379dc8fffe407b0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad75241ca621c893379dc8fffe407b0b");
        } else if (this.i.size() > 0) {
            this.i.remove(str);
        }
    }
}
