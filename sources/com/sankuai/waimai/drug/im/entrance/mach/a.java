package com.sankuai.waimai.drug.im.entrance.mach;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.im.entrance.mach.b;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements b {
    public static ChangeQuickRedirect a;
    private com.sankuai.waimai.store.im.entrance.drug.jump.I.a b;
    private com.sankuai.waimai.store.im.entrance.drug.unread.a c;

    @Override // com.sankuai.waimai.store.im.entrance.mach.b
    public final void a(Activity activity, String str, String str2, com.sankuai.waimai.store.im.entrance.drug.unread.I.a aVar) {
        Object[] objArr = {activity, str, str2, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b9612550ec7b14f0775ad439026e6dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b9612550ec7b14f0775ad439026e6dd");
            return;
        }
        this.b = new com.sankuai.waimai.store.im.entrance.drug.jump.b(activity, str, str2);
        this.c = new com.sankuai.waimai.store.im.entrance.drug.unread.a(aVar);
        this.c.a();
    }

    @Override // com.sankuai.waimai.store.im.entrance.mach.b
    public final void a(int i, long j, String str) {
        Object[] objArr = {0, 0L, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6311ee18ab1e87ea2da73be8d7ddaa92", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6311ee18ab1e87ea2da73be8d7ddaa92");
        } else if (this.b != null) {
            this.b.a(0, 0L, str, "", false);
        }
    }

    @Override // com.sankuai.waimai.store.im.entrance.mach.b
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e41f365fb0e299732346d46cb5da76f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e41f365fb0e299732346d46cb5da76f");
        } else if (this.c != null) {
            this.c.b();
        }
    }

    @Override // com.sankuai.waimai.store.im.entrance.mach.b
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b365ac4195ef52b64e076c988e93d51", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b365ac4195ef52b64e076c988e93d51");
        } else if (this.c != null) {
            this.c.a();
        }
    }

    @Override // com.sankuai.waimai.store.im.entrance.mach.b
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "820b198b801704436024ad7de58a4b90", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "820b198b801704436024ad7de58a4b90");
        } else if (this.c != null) {
            this.c.c();
        }
    }
}
