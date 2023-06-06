package com.sankuai.waimai.kit.share;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d implements c {
    public static ChangeQuickRedirect a;
    public c b;

    public d() {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        private static final d a = new d();
    }

    public static d a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6160d596e13474492a1a5b8467d5a69f", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6160d596e13474492a1a5b8467d5a69f") : a.a;
    }

    @Override // com.sankuai.waimai.kit.share.c
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66bfb159271096b5894d04a4d00578e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66bfb159271096b5894d04a4d00578e9");
        } else if (this.b != null) {
            this.b.a(i);
        }
    }

    @Override // com.sankuai.waimai.kit.share.c
    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "090a48eb277499b1ccdf71ec08138ffa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "090a48eb277499b1ccdf71ec08138ffa");
        } else if (this.b != null) {
            this.b.b(i);
        }
    }

    @Override // com.sankuai.waimai.kit.share.c
    public final void c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1232e1da3ad4b78fe2886d9d35dad18", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1232e1da3ad4b78fe2886d9d35dad18");
        } else if (this.b != null) {
            this.b.c(i);
        }
    }

    @Override // com.sankuai.waimai.kit.share.c
    public final void d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36017ae47488f33057afdf911316565a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36017ae47488f33057afdf911316565a");
        } else if (this.b != null) {
            this.b.d(i);
        }
    }
}
