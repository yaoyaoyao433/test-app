package com.sankuai.waimai.store.widgets.recycler;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class ItemInfo {
    public static ChangeQuickRedirect a;
    int b;
    int c;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface ItemType {
    }

    public ItemInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "983dfdf493e4ea79c154adddd8207a91", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "983dfdf493e4ea79c154adddd8207a91");
            return;
        }
        this.b = -1;
        this.c = 0;
    }

    public final void a() {
        this.b = -1;
        this.c = 0;
    }
}
