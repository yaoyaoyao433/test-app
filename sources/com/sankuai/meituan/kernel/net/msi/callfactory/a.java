package com.sankuai.meituan.kernel.net.msi.callfactory;

import com.meituan.android.singleton.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.kernel.net.e;
import com.sankuai.meituan.retrofit2.raw.a;
import com.tencent.open.SocialConstants;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class a {
    public static ChangeQuickRedirect a;
    private static volatile a.InterfaceC0637a b;

    public static a.InterfaceC0637a a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b68a582a85d3dbe51ba7654df0a8fdb7", RobustBitConfig.DEFAULT_VALUE)) {
            return (a.InterfaceC0637a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b68a582a85d3dbe51ba7654df0a8fdb7");
        }
        a.InterfaceC0637a interfaceC0637a = com.sankuai.meituan.kernel.net.msi.config.b.a().b.b;
        if (!z || interfaceC0637a == null) {
            a.InterfaceC0637a b2 = b();
            if (b2 instanceof a.b) {
                ((a.b) b2).a(z);
            }
            return b2;
        }
        return interfaceC0637a;
    }

    private static a.InterfaceC0637a b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b086adb0dd99559b7962d798f42ddfeb", RobustBitConfig.DEFAULT_VALUE)) {
            return (a.InterfaceC0637a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b086adb0dd99559b7962d798f42ddfeb");
        }
        if (b == null) {
            synchronized (a.class) {
                if (b == null) {
                    b = a(SocialConstants.TYPE_REQUEST);
                }
            }
        }
        return b;
    }

    public static e a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8d34b68ee8a7129852b0dc3d85523561", RobustBitConfig.DEFAULT_VALUE) ? (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8d34b68ee8a7129852b0dc3d85523561") : (e) new b().a("webSocket");
    }

    public static a.InterfaceC0637a a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8e9260c8d9ee726804b81b97f01513a8", RobustBitConfig.DEFAULT_VALUE) ? (a.InterfaceC0637a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8e9260c8d9ee726804b81b97f01513a8") : i.a(new b().a(str));
    }
}
