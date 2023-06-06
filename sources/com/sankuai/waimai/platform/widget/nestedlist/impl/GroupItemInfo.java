package com.sankuai.waimai.platform.widget.nestedlist.impl;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class GroupItemInfo {
    public static ChangeQuickRedirect a;
    public int b;
    int c;
    int d;
    int e;
    public boolean f;
    public Map<String, Object> g;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface ItemType {
    }

    public GroupItemInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b1db092502351dd13e3076d7fc594a0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b1db092502351dd13e3076d7fc594a0");
            return;
        }
        this.b = -1;
        this.c = -1;
        this.d = 0;
        this.e = 0;
        this.f = false;
    }

    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c41eb9852ac3530d1ccda4c378c569e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c41eb9852ac3530d1ccda4c378c569e")).intValue();
        }
        if (b()) {
            return -2;
        }
        return d() ? -3 : -1;
    }

    public final boolean b() {
        return this.b != -1 && this.c == -2;
    }

    private boolean d() {
        return (this.b == -1 || this.c == -1 || this.c == -2) ? false : true;
    }

    public final int c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9750ab2d585f4a244a2eb6969638fa30", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9750ab2d585f4a244a2eb6969638fa30")).intValue();
        }
        if (d()) {
            return this.c;
        }
        return -1;
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d53cf17811b6f70d225d7dd6c481b155", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d53cf17811b6f70d225d7dd6c481b155");
        }
        switch (a()) {
            case -3:
                return String.format("Child(%d, %d), GroupCount = %d, Child Count = %d", Integer.valueOf(this.b), Integer.valueOf(c()), Integer.valueOf(this.d), Integer.valueOf(this.e));
            case -2:
                return String.format("Group(%d), GroupCount = %d, Child Count = %d", Integer.valueOf(this.b), Integer.valueOf(this.d), Integer.valueOf(this.e));
            default:
                return "Invalid";
        }
    }
}
