package com.sankuai.waimai.irmo.canvas.module;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.irmo.canvas.bridge.jscallbak.CanvasArray;
import com.sankuai.waimai.irmo.canvas.bridge.jscallbak.CanvasMap;
import com.sankuai.waimai.irmo.canvas.data.b;
import com.sankuai.waimai.irmo.canvas.data.c;
import com.sankuai.waimai.irmo.canvas.data.d;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a implements c {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.irmo.canvas.data.c
    public final b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d759a188462fc9bf1fe5eda825c2026", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d759a188462fc9bf1fe5eda825c2026") : new CanvasArray();
    }

    @Override // com.sankuai.waimai.irmo.canvas.data.c
    public final d b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6009ec3daa32a439f8df4e4d9f2dca50", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6009ec3daa32a439f8df4e4d9f2dca50") : new CanvasMap();
    }
}
