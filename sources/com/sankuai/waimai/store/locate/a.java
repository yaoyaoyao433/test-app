package com.sankuai.waimai.store.locate;

import android.app.Activity;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.foundation.location.v2.WmAddress;
import com.sankuai.waimai.foundation.location.v2.callback.DeviceLocateCallback;
import com.sankuai.waimai.foundation.location.v2.g;
import com.sankuai.waimai.foundation.location.v2.k;
import com.sankuai.waimai.foundation.location.v2.listener.c;
import com.sankuai.waimai.store.i.locate.d;
import com.sankuai.waimai.store.util.al;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static final Map<com.sankuai.waimai.store.i.locate.b, c> b = new HashMap();

    public static WMLocation a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bc53589009d2836ed4b909753097bd55", RobustBitConfig.DEFAULT_VALUE)) {
            return (WMLocation) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bc53589009d2836ed4b909753097bd55");
        }
        if (g.a().k() != null) {
            return g.a().k().getWMLocation();
        }
        return c();
    }

    public static WMLocation b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eaa231398d5c314bd28657ba61adb31c", RobustBitConfig.DEFAULT_VALUE)) {
            return (WMLocation) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eaa231398d5c314bd28657ba61adb31c");
        }
        if (g.a().k() != null) {
            return g.a().k().getWMLocation();
        }
        return null;
    }

    public static WMLocation c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "09b6b444b297059cf37bd6f56b9f480c", RobustBitConfig.DEFAULT_VALUE)) {
            return (WMLocation) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "09b6b444b297059cf37bd6f56b9f480c");
        }
        if (g.a().p() != null) {
            return g.a().p();
        }
        return null;
    }

    public static String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1db8d54daa7fd14b3ec5f50ace23042c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1db8d54daa7fd14b3ec5f50ace23042c");
        }
        if (g.a().k() != null) {
            return g.a().k().getAddress();
        }
        return null;
    }

    public static boolean e() {
        boolean z;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c3cd7617c59781a4ab017b069902ba1d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c3cd7617c59781a4ab017b069902ba1d")).booleanValue();
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "5e0bcd765aae1cbcb7dd5cc33fbb1871", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "5e0bcd765aae1cbcb7dd5cc33fbb1871")).booleanValue();
        } else {
            z = g.a().p() != null;
        }
        return z && !g();
    }

    public static boolean f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "20abd1005eec7480445ce15a071e8ce0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "20abd1005eec7480445ce15a071e8ce0")).booleanValue() : g.a().g();
    }

    public static boolean g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a801654824d9ebba87acc12873f7dbb2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a801654824d9ebba87acc12873f7dbb2")).booleanValue();
        }
        return (TextUtils.isEmpty(d()) || b() == null) ? false : true;
    }

    public static void a(com.sankuai.waimai.store.i.locate.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f42e1ca91a4da5add15db26fa98fb63c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f42e1ca91a4da5add15db26fa98fb63c");
            return;
        }
        b bVar2 = new b(bVar);
        b.put(bVar, bVar2);
        g.a().a(bVar2, "SG-LocateService");
    }

    public static void b(com.sankuai.waimai.store.i.locate.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b5e34af29dc13862bdc27a95559c4a7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b5e34af29dc13862bdc27a95559c4a7b");
            return;
        }
        c remove = b.remove(bVar);
        if (remove != null) {
            g.a().b(remove, "SG-LocateService");
        }
    }

    public static void a(Activity activity, final d dVar, boolean z, int i, @Nullable String str) {
        Object[] objArr = {activity, dVar, (byte) 1, 3, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "15e5bc41e89ccaa1fe22a77bc0e876e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "15e5bc41e89ccaa1fe22a77bc0e876e9");
            return;
        }
        a(activity, str, new com.sankuai.waimai.store.i.locate.a() { // from class: com.sankuai.waimai.store.locate.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.i.locate.a
            public final void a(boolean z2, String str2, WMLocation wMLocation) {
                Object[] objArr2 = {Byte.valueOf(z2 ? (byte) 1 : (byte) 0), str2, wMLocation};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c5f6750b5169f9f03b75a25b0eaf32bf", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c5f6750b5169f9f03b75a25b0eaf32bf");
                    return;
                }
                al.cancel("SG-Locate-Delay-Task");
                d.this.a(z2, str2, wMLocation);
            }
        }, true);
        al.a(new Runnable() { // from class: com.sankuai.waimai.store.locate.a.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "309b5eb03c81876b5e2c1f599b427f70", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "309b5eb03c81876b5e2c1f599b427f70");
                } else {
                    d.this.a();
                }
            }
        }, 3000, "SG-Locate-Delay-Task");
    }

    public static void a(Activity activity, com.sankuai.waimai.store.i.locate.a aVar, boolean z) {
        Object[] objArr = {activity, aVar, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cd941bf1fd380b475df2048ca32a80e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cd941bf1fd380b475df2048ca32a80e7");
        } else {
            a(activity, "", aVar, true);
        }
    }

    public static void a(Activity activity, String str, final com.sankuai.waimai.store.i.locate.c cVar) {
        Object[] objArr = {activity, str, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "38141bb0efdef0d39681d97327aa87cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "38141bb0efdef0d39681d97327aa87cd");
            return;
        }
        com.sankuai.waimai.store.base.monitor.time.a.a().a(activity);
        final SoftReference softReference = new SoftReference(activity);
        k kVar = new k(activity, str);
        g a2 = g.a();
        DeviceLocateCallback deviceLocateCallback = new DeviceLocateCallback() { // from class: com.sankuai.waimai.store.locate.a.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.foundation.location.v2.callback.DeviceLocateCallback
            public final void a(@Nullable WMLocation wMLocation) {
                Object[] objArr2 = {wMLocation};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9843f2a5fb80578e19944f51e68e6923", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9843f2a5fb80578e19944f51e68e6923");
                    return;
                }
                com.sankuai.waimai.store.base.monitor.time.a.a().b((Activity) softReference.get());
                cVar.a(wMLocation);
            }
        };
        Object[] objArr2 = {deviceLocateCallback, "SG-LocateService", kVar};
        ChangeQuickRedirect changeQuickRedirect2 = g.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "8a1cdaa39aba836d92b1c2a691f7846c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "8a1cdaa39aba836d92b1c2a691f7846c");
        } else {
            a2.a(deviceLocateCallback, true, "SG-LocateService", kVar);
        }
    }

    public static void a(Activity activity, String str, final com.sankuai.waimai.store.i.locate.a aVar, boolean z) {
        Object[] objArr = {activity, str, aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b9e851a1f797efa64e0add76fd2e2165", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b9e851a1f797efa64e0add76fd2e2165");
        } else if (aVar == null) {
        } else {
            com.sankuai.waimai.store.base.monitor.time.a.a().a(activity);
            final SoftReference softReference = new SoftReference(activity);
            g.a().a(new com.sankuai.waimai.foundation.location.v2.callback.a() { // from class: com.sankuai.waimai.store.locate.a.4
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.foundation.location.v2.callback.a
                public final void a(WmAddress wmAddress) {
                    Object[] objArr2 = {wmAddress};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5336df3e187d46d27d862c5ae8aebc99", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5336df3e187d46d27d862c5ae8aebc99");
                        return;
                    }
                    com.sankuai.waimai.store.base.monitor.time.a.a().b((Activity) softReference.get());
                    if (wmAddress != null) {
                        aVar.a(wmAddress.hasAddress(), wmAddress.getAddress(), wmAddress.getWMLocation());
                    } else {
                        aVar.a(false, null, null);
                    }
                }
            }, z, "SG-LocateService", new k(activity, str));
        }
    }

    public static void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "aed2111e71f91f5d5e18d47149c4e13c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "aed2111e71f91f5d5e18d47149c4e13c");
        } else {
            g.a().e();
        }
    }
}
