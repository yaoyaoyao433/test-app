package com.sankuai.waimai.platform.mach.monitor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.Mach;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e {
    public static ChangeQuickRedirect a;

    public static int a(Mach mach) {
        int a2;
        Object[] objArr = {mach};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eba46475415a551990ff2b2b46743d50", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eba46475415a551990ff2b2b46743d50")).intValue();
        }
        if (mach == null || mach.getRootNode() == null || (a2 = a(mach.getRootNode())) <= 0) {
            return 1;
        }
        return a2;
    }

    private static int a(com.sankuai.waimai.mach.node.a aVar) {
        int i = 0;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7d2ee2e766901e85eaa847c76c1db598", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7d2ee2e766901e85eaa847c76c1db598")).intValue();
        }
        if (aVar == null) {
            return 0;
        }
        com.sankuai.waimai.mach.lifecycle.d dVar = aVar.h;
        if (dVar instanceof com.sankuai.waimai.mach.component.b) {
            return ((com.sankuai.waimai.mach.component.b) dVar).d();
        }
        if (aVar.j()) {
            for (com.sankuai.waimai.mach.node.a aVar2 : aVar.b()) {
                i += a(aVar2);
            }
            return i;
        }
        return 0;
    }
}
