package com.sankuai.waimai.business.page.homepage.sharkpush;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a = null;
    public static String b = "lastorderstatus";
    public static String c = "SharkPushManager";
    private static a g;
    public boolean d;
    public boolean e;
    public List<b> f;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11d4bf841cfae37488e37c063cb5d9d3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11d4bf841cfae37488e37c063cb5d9d3");
            return;
        }
        this.d = false;
        this.e = false;
    }

    public static /* synthetic */ void a(a aVar, String str, byte[] bArr) {
        Object[] objArr = {str, bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "4f24fb3d1e653d7373454a4c585903a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "4f24fb3d1e653d7373454a4c585903a0");
        } else if (aVar.f != null) {
            for (b bVar : aVar.f) {
                if (bVar != null) {
                    bVar.a(str, bArr);
                }
            }
        }
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e90913de642a7dac8d24f20581db1225", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e90913de642a7dac8d24f20581db1225");
        }
        if (g == null) {
            g = new a();
        }
        return g;
    }

    public void a(boolean z) {
        Object[] objArr = {(byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "310eb78bd51070c2e515d8dde612903f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "310eb78bd51070c2e515d8dde612903f");
            return;
        }
        this.e = true;
        if (this.f != null) {
            for (b bVar : this.f) {
                if (bVar != null) {
                    bVar.b(true);
                }
            }
        }
    }
}
