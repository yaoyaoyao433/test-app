package com.sankuai.waimai.store.manager.sequence.strategy;

import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.util.ab;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c implements a {
    public static ChangeQuickRedirect a;
    private String b;
    private int c;

    public c(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d5fb0c065a538104dfc922c9ad98ea7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d5fb0c065a538104dfc922c9ad98ea7");
            return;
        }
        this.b = str;
        this.c = i;
    }

    @Override // com.sankuai.waimai.store.manager.sequence.strategy.a
    public final boolean isValid(@Nullable com.sankuai.waimai.store.manager.marketing.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e81b26761e03c84c9218137af4f4706b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e81b26761e03c84c9218137af4f4706b")).booleanValue() : this.c <= 0 || t.a(this.b) || ab.b().b(com.sankuai.waimai.store.util.b.a(), this.b, 0) < this.c;
    }

    @Override // com.sankuai.waimai.store.manager.sequence.strategy.a
    public final void rollback(@Nullable com.sankuai.waimai.store.manager.marketing.d dVar) {
        int b;
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8df7f9f6f7624eac0953b770d319460d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8df7f9f6f7624eac0953b770d319460d");
        } else if (this.c <= 0 || t.a(this.b) || (b = ab.b().b(com.sankuai.waimai.store.util.b.a(), this.b, 0)) <= 0) {
        } else {
            ab.b().a(com.sankuai.waimai.store.util.b.a(), this.b, b - 1);
        }
    }

    @Override // com.sankuai.waimai.store.manager.sequence.strategy.a
    public final void updateValidStatus(@Nullable com.sankuai.waimai.store.manager.marketing.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83982dfa46dc8c69a721a578d5bb1d4a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83982dfa46dc8c69a721a578d5bb1d4a");
        } else if (this.c <= 0 || t.a(this.b)) {
        } else {
            ab.b().a(com.sankuai.waimai.store.util.b.a(), this.b, ab.b().b(com.sankuai.waimai.store.util.b.a(), this.b, 0) + 1);
        }
    }
}
