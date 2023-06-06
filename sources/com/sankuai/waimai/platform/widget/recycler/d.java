package com.sankuai.waimai.platform.widget.recycler;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class d implements c {
    public static ChangeQuickRedirect g;
    @NonNull
    protected final ArrayList<e> h;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10a76476a1993cdd2576cbb57896e3eb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10a76476a1993cdd2576cbb57896e3eb");
        } else {
            this.h = new ArrayList<>();
        }
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d2fc0712c8b70f12c16dff5d0bf4610", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d2fc0712c8b70f12c16dff5d0bf4610");
        } else {
            System.err.println(str);
        }
    }

    @Override // com.sankuai.waimai.platform.widget.recycler.c
    public final void a(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72240cf332c2b0c6ee36040196020288", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72240cf332c2b0c6ee36040196020288");
        } else if (eVar == null) {
            a("The observer is null.");
        } else {
            synchronized (this.h) {
                if (this.h.contains(eVar)) {
                    a("Observer " + eVar + " is already registered.");
                    return;
                }
                this.h.add(eVar);
            }
        }
    }

    @Override // com.sankuai.waimai.platform.widget.recycler.c
    public final void b(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8bc81fcddc18420a9593a0d50384e53", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8bc81fcddc18420a9593a0d50384e53");
        } else if (eVar == null) {
            a("The observer is null.");
        } else {
            synchronized (this.h) {
                int indexOf = this.h.indexOf(eVar);
                if (indexOf == -1) {
                    a("Observer " + eVar + " was not registered.");
                    return;
                }
                this.h.remove(indexOf);
            }
        }
    }
}
