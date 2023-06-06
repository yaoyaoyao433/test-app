package com.sankuai.waimai.store.im.entrance.mach;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements b {
    public static ChangeQuickRedirect a;
    private com.sankuai.waimai.store.im.entrance.drug.jump.I.a b;
    private com.sankuai.waimai.store.im.entrance.drug.unread.a c;

    @Override // com.sankuai.waimai.store.im.entrance.mach.b
    public final void a(Activity activity, String str, String str2, com.sankuai.waimai.store.im.entrance.drug.unread.I.a aVar) {
        Object[] objArr = {activity, str, str2, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "764d466428d0f3933c6d5f446b0bdef1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "764d466428d0f3933c6d5f446b0bdef1");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "745b566d8d34ae8630fe9a25a7c6f749", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "745b566d8d34ae8630fe9a25a7c6f749");
        } else if (this.b != null) {
            this.b.a(0, 0L, str, "", false);
        }
    }

    @Override // com.sankuai.waimai.store.im.entrance.mach.b
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c90af3f7b419b3b2b2421ff5f7044095", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c90af3f7b419b3b2b2421ff5f7044095");
        } else if (this.c != null) {
            this.c.b();
        }
    }

    @Override // com.sankuai.waimai.store.im.entrance.mach.b
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "242afcf9066bfac7b63a0e8ffc26cc60", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "242afcf9066bfac7b63a0e8ffc26cc60");
        } else if (this.c != null) {
            this.c.a();
        }
    }

    @Override // com.sankuai.waimai.store.im.entrance.mach.b
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c45ead3cbc8f47513863d08c082b5ec9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c45ead3cbc8f47513863d08c082b5ec9");
        } else if (this.c != null) {
            this.c.c();
        }
    }
}
