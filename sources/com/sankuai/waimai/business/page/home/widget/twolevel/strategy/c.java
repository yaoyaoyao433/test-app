package com.sankuai.waimai.business.page.home.widget.twolevel.strategy;

import com.meituan.android.cipstorage.ag;
import com.meituan.android.cipstorage.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;
    q b;
    a c;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfa9fb75b001a23e31dcaecfae201f95", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfa9fb75b001a23e31dcaecfae201f95");
            return;
        }
        this.b = q.a(com.meituan.android.singleton.b.a, "waimai_second_guide_sp", 1);
        this.c = new a();
    }

    public final SecondFloorGuideStrategy a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6dfb77d61138fa814d609b71d7ec7369", RobustBitConfig.DEFAULT_VALUE)) {
            return (SecondFloorGuideStrategy) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6dfb77d61138fa814d609b71d7ec7369");
        }
        if (this.b == null) {
            return null;
        }
        return (SecondFloorGuideStrategy) this.b.a(str, this.c);
    }

    public final void a(String str, SecondFloorGuideStrategy secondFloorGuideStrategy) {
        Object[] objArr = {str, secondFloorGuideStrategy};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ad65f40aeb3968c8f23ac2c8a28c59d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ad65f40aeb3968c8f23ac2c8a28c59d");
        } else if (this.b == null) {
        } else {
            this.b.a(str, (String) secondFloorGuideStrategy, (ag<String>) this.c);
        }
    }
}
