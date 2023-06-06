package com.sankuai.waimai.mach.render;

import android.support.annotation.Keep;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.mach.g;
import com.sankuai.waimai.mach.h;
import com.sankuai.waimai.mach.manager.monitor.MonitorManager;
import com.sankuai.waimai.mach.utils.e;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class RenderViewTreeTask {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final Mach mMach;
    private com.sankuai.waimai.mach.model.data.a mRecord;
    private final com.sankuai.waimai.mach.model.data.a mUIRenderRecord;
    private final h progressListener;

    public RenderViewTreeTask(Mach mach, com.sankuai.waimai.mach.model.data.a aVar, h hVar) {
        Object[] objArr = {mach, aVar, hVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "43c30124b4e63b4a5d234320cd835ec1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "43c30124b4e63b4a5d234320cd835ec1");
            return;
        }
        this.mUIRenderRecord = new com.sankuai.waimai.mach.model.data.a("mach_ui_render");
        this.mMach = mach;
        this.mRecord = aVar;
        this.progressListener = hVar;
    }

    public View createView(com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "78eb491cd7e89a8ca3271bbbb18f8327", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "78eb491cd7e89a8ca3271bbbb18f8327") : createView(aVar, null);
    }

    public View createView(com.sankuai.waimai.mach.node.a aVar, com.sankuai.waimai.mach.node.a aVar2) {
        c renderEngine;
        View g;
        Object[] objArr = {aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cd50f967ff51782317416e7e417e03a4", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cd50f967ff51782317416e7e417e03a4");
        }
        if (aVar == null || (renderEngine = this.mMach.getRenderEngine()) == null) {
            return null;
        }
        MonitorManager.RECORD_STEP(this.mRecord, "createView_start");
        if (aVar2 == null) {
            g = renderEngine.a(aVar);
        } else {
            renderEngine.a(aVar2, aVar);
            g = aVar.g();
            e.c(aVar2);
            com.sankuai.waimai.mach.log.b.a("MachRender", "render diff view tree succeed ");
        }
        if (g == null) {
            return null;
        }
        if (g.getParent() != null) {
            ((ViewGroup) g.getParent()).removeView(g);
        }
        for (g gVar : this.mMach.getRenderListeners()) {
            gVar.a();
        }
        MonitorManager.RECORD_STEP(this.mRecord, "createView_end");
        MonitorManager.RECORD_END(this.mRecord);
        com.sankuai.waimai.mach.log.b.a("MachRender", "render create view tree succeed ");
        return g;
    }
}
