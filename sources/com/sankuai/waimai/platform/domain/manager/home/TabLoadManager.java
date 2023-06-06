package com.sankuai.waimai.platform.domain.manager.home;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class TabLoadManager {
    public static ChangeQuickRedirect a;
    private static TabLoadManager c;
    public List<a> b;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface TabId {
    }

    public static TabLoadManager a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "41a9586447ed2e358b7e57d45094508c", RobustBitConfig.DEFAULT_VALUE)) {
            return (TabLoadManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "41a9586447ed2e358b7e57d45094508c");
        }
        if (c == null) {
            c = new TabLoadManager();
        }
        return c;
    }

    public final void a(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "794f87f2b4c3d0c01d6d07f9860b2691", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "794f87f2b4c3d0c01d6d07f9860b2691");
        } else if (this.b != null) {
            for (a aVar : this.b) {
                aVar.a(i, z);
            }
        }
    }
}
