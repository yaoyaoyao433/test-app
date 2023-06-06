package com.sankuai.waimai.mach.manager;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.manager.cache.CacheException;
import com.sankuai.waimai.mach.manager.cache.c;
import com.sankuai.waimai.mach.manager.monitor.MonitorManager;
import com.sankuai.waimai.mach.manager_new.e;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class a {
    public static ChangeQuickRedirect a;
    private static a c;
    public e b;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.mach.manager.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC1013a {
        void a(@NonNull CacheException cacheException);

        void a(@NonNull com.sankuai.waimai.mach.manager.cache.e eVar);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface b {
        void a(@NonNull CacheException cacheException);

        void a(@NonNull c cVar);
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c6e795ab99db5d8a93d0fbcb91a3ed1e", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c6e795ab99db5d8a93d0fbcb91a3ed1e");
        }
        if (c == null) {
            synchronized (a.class) {
                if (c == null) {
                    c = new a();
                }
            }
        }
        return c;
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "892710536e7e238ad828bf5c5f51354c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "892710536e7e238ad828bf5c5f51354c");
        } else {
            this.b = com.sankuai.waimai.mach.manager_new.b.a();
        }
    }

    public final MonitorManager b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "575e08cd2ea3fe65cc7c5cc55e1db1e9", RobustBitConfig.DEFAULT_VALUE) ? (MonitorManager) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "575e08cd2ea3fe65cc7c5cc55e1db1e9") : com.sankuai.waimai.mach.manager_new.b.a().b();
    }

    @Nullable
    public final com.sankuai.waimai.mach.manager.cache.e a(String str, String str2, String str3, String str4) {
        Object[] objArr = {str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01946455559583b83241021ac81db43d", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.mach.manager.cache.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01946455559583b83241021ac81db43d") : this.b.a(str, str2, str3, str4);
    }

    public final void a(String str, String str2, String str3, String str4, InterfaceC1013a interfaceC1013a) {
        Object[] objArr = {str, str2, str3, str4, interfaceC1013a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3d33785f9020e870642d777ab29243b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3d33785f9020e870642d777ab29243b");
            return;
        }
        com.sankuai.waimai.mach.manager_new.common.c.b();
        this.b.a(str, str2, str3, str4, interfaceC1013a);
    }

    public final void a(String str, int i, String str2, boolean z, boolean z2, b bVar) {
        Object[] objArr = {str, Integer.valueOf(i), str2, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07d4a20f6e02502dc72eae38c07fd4e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07d4a20f6e02502dc72eae38c07fd4e6");
        } else {
            this.b.a(str, "", str2, "", i, z, z2, bVar);
        }
    }

    public final void a(String str, String str2, String str3, InterfaceC1013a interfaceC1013a) {
        Object[] objArr = {str, str2, str3, interfaceC1013a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddd31610ce019cf29dfb7f6ee037b481", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddd31610ce019cf29dfb7f6ee037b481");
        } else {
            this.b.a(str, (String) null, str2, str3, interfaceC1013a);
        }
    }

    public final void b(String str, String str2, String str3, String str4, InterfaceC1013a interfaceC1013a) {
        Object[] objArr = {str, str2, str3, str4, interfaceC1013a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "087eab9fb115019f92ffdfe128706b89", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "087eab9fb115019f92ffdfe128706b89");
            return;
        }
        com.sankuai.waimai.mach.manager_new.common.c.b();
        this.b.a(str, str4, str2, str3, interfaceC1013a);
    }
}
