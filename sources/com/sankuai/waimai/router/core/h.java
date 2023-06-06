package com.sankuai.waimai.router.core;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class h {
    public static ChangeQuickRedirect h;
    protected c i;

    public abstract void a(@NonNull j jVar, @NonNull g gVar);

    public abstract boolean a(@NonNull j jVar);

    public final h a(@NonNull i iVar) {
        Object[] objArr = {iVar};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9d2199c19f91bf1aa367a413ee2ed43", RobustBitConfig.DEFAULT_VALUE)) {
            return (h) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9d2199c19f91bf1aa367a413ee2ed43");
        }
        if (iVar != null) {
            if (this.i == null) {
                this.i = new c();
            }
            this.i.a(iVar);
        }
        return this;
    }

    public final h a(i... iVarArr) {
        Object[] objArr = {iVarArr};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd7a7ad5a3e771b69f686dcafe996628", RobustBitConfig.DEFAULT_VALUE)) {
            return (h) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd7a7ad5a3e771b69f686dcafe996628");
        }
        if (iVarArr != null && iVarArr.length > 0) {
            if (this.i == null) {
                this.i = new c();
            }
            for (i iVar : iVarArr) {
                this.i.a(iVar);
            }
        }
        return this;
    }

    public void b(@NonNull final j jVar, @NonNull final g gVar) {
        Object[] objArr = {jVar, gVar};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4614ece643fe68e6d8aa6fcb20c5b18e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4614ece643fe68e6d8aa6fcb20c5b18e");
        } else if (a(jVar)) {
            d.a("%s: handle request %s", this, jVar);
            if (this.i != null) {
                this.i.a(jVar, new g() { // from class: com.sankuai.waimai.router.core.h.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.router.core.g
                    public final void a() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d82f61ca3e75123f2c9f10efd7e84179", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d82f61ca3e75123f2c9f10efd7e84179");
                        } else {
                            h.this.a(jVar, gVar);
                        }
                    }

                    @Override // com.sankuai.waimai.router.core.g
                    public final void a(int i) {
                        Object[] objArr2 = {Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b8b686e8fadb58f85bed40273b598118", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b8b686e8fadb58f85bed40273b598118");
                        } else {
                            gVar.a(i);
                        }
                    }
                });
            } else {
                a(jVar, gVar);
            }
        } else {
            d.a("%s: ignore request %s", this, jVar);
            gVar.a();
        }
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86deeae7c5b6dfb678dee87c0d84f560", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86deeae7c5b6dfb678dee87c0d84f560") : getClass().getSimpleName();
    }
}
