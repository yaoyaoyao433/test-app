package com.sankuai.waimai.business.page.home.head.banner.live;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.ugc.mach.live.MachLivePlayerNativeMethod;
import com.sankuai.waimai.business.ugc.mach.live.MachLivePlayerTagProcessor;
import com.sankuai.waimai.mach.Mach;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends com.sankuai.waimai.platform.dynamic.a {
    public static ChangeQuickRedirect a;

    public b(Activity activity, String str, String str2, String str3) {
        super(activity, str, str2, str3);
        Object[] objArr = {activity, str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e881e5a620b980efd21f59776a7b343", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e881e5a620b980efd21f59776a7b343");
        }
    }

    @Override // com.sankuai.waimai.platform.dynamic.a, com.sankuai.waimai.platform.mach.a, com.sankuai.waimai.mach.container.a
    public final void a(Mach.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bfae058b65f6addcf26348fde2d44f52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bfae058b65f6addcf26348fde2d44f52");
            return;
        }
        super.a(aVar);
        aVar.a(new MachLivePlayerTagProcessor()).a(new MachLivePlayerNativeMethod());
    }

    @Override // com.sankuai.waimai.platform.dynamic.a, com.sankuai.waimai.platform.mach.a
    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d001739c4ceb71d29ceecd5a1e4cddb", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d001739c4ceb71d29ceecd5a1e4cddb")).booleanValue() : super.a();
    }

    @Override // com.sankuai.waimai.mach.container.a
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2ad5c2b989e2a7d70cf7fed1bbbaf9a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2ad5c2b989e2a7d70cf7fed1bbbaf9a");
            return;
        }
        super.a(z);
        HashMap hashMap = new HashMap();
        hashMap.put("visible", Boolean.valueOf(z));
        b("display_state_change", hashMap);
    }
}
