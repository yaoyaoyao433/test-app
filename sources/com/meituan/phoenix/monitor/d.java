package com.meituan.phoenix.monitor;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d implements b {
    public static ChangeQuickRedirect a;
    private c b;
    private List<c> c;

    public d(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20a3bfecdf833786eb7efc433bf78592", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20a3bfecdf833786eb7efc433bf78592");
        } else {
            this.b = new a(context);
        }
    }

    @Override // com.meituan.phoenix.monitor.b
    public final void a(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ceeea205abef32cfead921f5ee9bc27", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ceeea205abef32cfead921f5ee9bc27");
            return;
        }
        if (this.c == null) {
            this.c = new ArrayList();
        }
        if (cVar == null || this.c.contains(cVar)) {
            return;
        }
        this.c.add(cVar);
    }

    @Override // com.meituan.phoenix.monitor.b
    public final void a(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0af5524d6ac87ddf15422cc4186e91a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0af5524d6ac87ddf15422cc4186e91a3");
        } else if (eVar != null) {
            this.b.a(eVar);
            if (this.c != null) {
                for (c cVar : this.c) {
                    try {
                        cVar.a(eVar);
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }
}
