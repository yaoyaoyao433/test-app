package com.sankuai.waimai.platform.widget.recycler;

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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc208f798c46fcfea9ca66f0891a031d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc208f798c46fcfea9ca66f0891a031d");
            return;
        }
        this.b = -1;
        this.c = 0;
    }

    public final void a() {
        this.b = -1;
        this.c = 0;
    }

    public final void a(int i) {
        this.b = -6;
        this.c = i;
    }

    public final void b(int i) {
        this.b = -4;
        this.c = i;
    }

    public final void c(int i) {
        this.b = -5;
        this.c = i;
    }
}
