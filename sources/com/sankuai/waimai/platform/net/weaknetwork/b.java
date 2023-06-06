package com.sankuai.waimai.platform.net.weaknetwork;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public boolean b;
    String c;
    public float d;
    String e;
    private float f;
    private float g;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "148f09e583782eb719c5abae7a1507ad", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "148f09e583782eb719c5abae7a1507ad");
            return;
        }
        this.f = -1.0f;
        this.d = -1.0f;
        this.g = -1.0f;
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71b23c7e339742759f88bc9ab2bef07b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71b23c7e339742759f88bc9ab2bef07b");
            return;
        }
        try {
            this.f = Float.valueOf(str).floatValue();
        } catch (NumberFormatException e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
        }
    }

    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a297f28eed70341e5f53b4aa7968e74", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a297f28eed70341e5f53b4aa7968e74");
            return;
        }
        try {
            this.g = Float.valueOf(str).floatValue();
        } catch (NumberFormatException e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
        }
    }

    public final void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b958d4ef50e136e3f4a95401e61d57e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b958d4ef50e136e3f4a95401e61d57e2");
            return;
        }
        try {
            this.d = Float.valueOf(str).floatValue();
        } catch (NumberFormatException e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
        }
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7153a2f98072920dc7ca616b83295ef", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7153a2f98072920dc7ca616b83295ef");
        }
        return "PingResponse{isLongChain=" + this.b + ", ipAddress='" + this.c + "', max=" + this.f + ", min=" + this.d + ", avg=" + this.g + ", packetLossRate='" + this.e + "'}";
    }
}
