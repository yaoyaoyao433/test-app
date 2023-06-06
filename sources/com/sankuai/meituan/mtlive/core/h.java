package com.sankuai.meituan.mtlive.core;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtlive.core.d;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class h implements d {
    public static ChangeQuickRedirect b;
    protected Context c;
    protected i d;
    protected boolean e;

    public void a(d.a aVar) {
    }

    public void b() {
    }

    @Override // com.sankuai.meituan.mtlive.core.d
    public void a(Context context, i iVar) {
        Object[] objArr = {context, iVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81b97bb0df0568ae9d0268670c86148b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81b97bb0df0568ae9d0268670c86148b");
            return;
        }
        this.c = context.getApplicationContext();
        this.d = iVar;
    }

    @Override // com.sankuai.meituan.mtlive.core.d
    public final boolean b(d.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4cede67b1301a222d08027a745db71d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4cede67b1301a222d08027a745db71d")).booleanValue();
        }
        if (this.c == null) {
            return false;
        }
        if (a()) {
            aVar.a();
            return true;
        }
        a(aVar);
        return false;
    }

    @Override // com.sankuai.meituan.mtlive.core.d
    public boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f410cd40dd8edb684ca2fc1d4d3aff2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f410cd40dd8edb684ca2fc1d4d3aff2")).booleanValue();
        }
        if (this.e) {
            b();
        }
        return this.e;
    }
}
