package com.sankuai.waimai.ad.interact;

import android.text.TextUtils;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.node.a;
import com.sankuai.waimai.pouch.mach.tab.PouchTabView;
import com.sankuai.waimai.pouch.mach.tab.b;
import com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchInteractPlugin;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class VerticalTabSwiperPlugin extends AbsWMPouchInteractPlugin {
    public static ChangeQuickRedirect a;
    boolean b;
    private b c;

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchInteractPlugin
    public final void a() {
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchInteractPlugin
    public final void a(String str, int i, Map<String, Object> map) {
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchInteractPlugin
    public final void b() {
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchInteractPlugin
    public final void c() {
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchPlugin
    public void onRenderFailed() {
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchPlugin
    public void reset() {
    }

    public VerticalTabSwiperPlugin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8827b2efba21a959c39f6deb43fd7cf9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8827b2efba21a959c39f6deb43fd7cf9");
        } else {
            this.b = true;
        }
    }

    public VerticalTabSwiperPlugin(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a90a94857c1116568b3d24a07a1b701", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a90a94857c1116568b3d24a07a1b701");
            return;
        }
        this.b = true;
        this.c = bVar;
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchInteractPlugin
    public final void d() {
        PouchTabView pouchTabView;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31cd81fbd563432a24eb6d1a06a9dcd2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31cd81fbd563432a24eb6d1a06a9dcd2");
            return;
        }
        this.b = false;
        if (this.c == null || (pouchTabView = (PouchTabView) this.c.o) == null) {
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = PouchTabView.a;
        if (PatchProxy.isSupport(objArr2, pouchTabView, changeQuickRedirect2, false, "af9eaf1c4fbe3c1d43e6d9d048cc090e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, pouchTabView, changeQuickRedirect2, false, "af9eaf1c4fbe3c1d43e6d9d048cc090e");
        } else if (pouchTabView.c != null) {
            pouchTabView.c.a();
        }
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchInteractPlugin
    public final void e() {
        this.b = true;
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchPlugin
    public void onViewAttached(View view, com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {view, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd400623e3195e727d24bdc85b1151c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd400623e3195e727d24bdc85b1151c6");
        } else if (this.c == null) {
            com.sankuai.waimai.mach.node.a.a(aVar, new a.InterfaceC1019a() { // from class: com.sankuai.waimai.ad.interact.VerticalTabSwiperPlugin.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.mach.node.a.InterfaceC1019a
                public final void a(com.sankuai.waimai.mach.node.a aVar2) {
                    Object[] objArr2 = {aVar2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bed764d48bc609cb55460287cba4d021", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bed764d48bc609cb55460287cba4d021");
                        return;
                    }
                    com.sankuai.waimai.foundation.utils.log.a.b("PouchPlugin", "onViewAttached iterate...", new Object[0]);
                    if (aVar2 == null || !(aVar2.h instanceof b)) {
                        return;
                    }
                    VerticalTabSwiperPlugin.this.c = (b) aVar2.h;
                }
            });
        }
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchPlugin
    public void onReceiveJSEvent(String str, Map<String, Object> map) {
        int intValue;
        PouchTabView pouchTabView;
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d6b1df4b90e12996f4edefa0ce3cb4a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d6b1df4b90e12996f4edefa0ce3cb4a");
        } else if ((this.b && TextUtils.equals(b.b, str)) || TextUtils.equals(com.sankuai.waimai.pouch.mach.swiper.a.c, str)) {
            com.sankuai.waimai.foundation.utils.log.a.b("VerticalTabSwiperPlugin", "VerticalTabSwiperPlugin onReceiveJSEvent:%s", str);
            Object obj = map.get("new_index");
            if (obj != null) {
                if (obj instanceof Integer) {
                    intValue = ((Integer) obj).intValue();
                } else {
                    intValue = obj instanceof Long ? ((Long) obj).intValue() : -1;
                }
                if (this.c == null || intValue == -1 || (pouchTabView = (PouchTabView) this.c.o) == null) {
                    return;
                }
                pouchTabView.setNewIndex(intValue);
            }
        }
    }
}
