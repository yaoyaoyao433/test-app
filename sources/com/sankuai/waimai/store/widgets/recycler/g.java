package com.sankuai.waimai.store.widgets.recycler;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class g implements f {
    public static ChangeQuickRedirect A;
    @NonNull
    protected final ArrayList<h> B;

    public g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = A;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29890a5a7df2a809e0910c108bc45c22", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29890a5a7df2a809e0910c108bc45c22");
        } else {
            this.B = new ArrayList<>();
        }
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = A;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2590f7c7216684a5cdb368b881a92cc5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2590f7c7216684a5cdb368b881a92cc5");
        } else {
            System.err.println(str);
        }
    }

    public final void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = A;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0ba2a683450be692f7670663faeb3fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0ba2a683450be692f7670663faeb3fc");
            return;
        }
        synchronized (this.B) {
            int size = this.B.size();
            for (int i = 0; i < size; i++) {
                this.B.get(i).a();
            }
        }
    }

    public final void m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = A;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca928a434986a18aa8c0c63c33884bc5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca928a434986a18aa8c0c63c33884bc5");
        } else {
            l();
        }
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.f
    public final void a(h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = A;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "644b65ad57ea8df85b964bb33481f800", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "644b65ad57ea8df85b964bb33481f800");
        } else if (hVar == null) {
            a("The observer is null.");
        } else {
            synchronized (this.B) {
                if (this.B.contains(hVar)) {
                    a("Observer " + hVar + " is already registered.");
                    return;
                }
                this.B.add(hVar);
            }
        }
    }

    public final void e(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), 1};
        ChangeQuickRedirect changeQuickRedirect = A;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d85bad39a1766af109bb58c8fb07652", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d85bad39a1766af109bb58c8fb07652");
            return;
        }
        synchronized (this.B) {
            int size = this.B.size();
            for (int i3 = 0; i3 < size; i3++) {
                this.B.get(i3).a(i, 1);
            }
        }
    }
}
