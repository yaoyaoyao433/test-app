package com.sankuai.waimai.ad.interact;

import android.text.TextUtils;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.node.a;
import com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchInteractPlugin;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class VerticalTextSwiperPlugin extends AbsWMPouchInteractPlugin {
    public static ChangeQuickRedirect a;
    boolean b;
    private com.sankuai.waimai.pouch.mach.text.a c;

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

    public VerticalTextSwiperPlugin(com.sankuai.waimai.pouch.mach.text.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f068c8c60fc6a8882e0f1c57f17f290", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f068c8c60fc6a8882e0f1c57f17f290");
            return;
        }
        this.b = true;
        this.c = aVar;
    }

    public VerticalTextSwiperPlugin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1be6267f388d79fbd570eb23146c0ad6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1be6267f388d79fbd570eb23146c0ad6");
        } else {
            this.b = true;
        }
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchInteractPlugin
    public final void d() {
        this.b = false;
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchInteractPlugin
    public final void e() {
        this.b = true;
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchPlugin
    public void onViewAttached(View view, com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {view, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6677d2a9cfed1ea14162d4b00944756", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6677d2a9cfed1ea14162d4b00944756");
        } else if (this.c == null) {
            com.sankuai.waimai.mach.node.a.a(aVar, new a.InterfaceC1019a() { // from class: com.sankuai.waimai.ad.interact.VerticalTextSwiperPlugin.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.mach.node.a.InterfaceC1019a
                public final void a(com.sankuai.waimai.mach.node.a aVar2) {
                    Object[] objArr2 = {aVar2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "defea0ffe1a19510146e22f97adc3d59", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "defea0ffe1a19510146e22f97adc3d59");
                    } else if (aVar2 == null || !(aVar2.h instanceof com.sankuai.waimai.pouch.mach.text.a)) {
                    } else {
                        VerticalTextSwiperPlugin.this.c = (com.sankuai.waimai.pouch.mach.text.a) aVar2.h;
                    }
                }
            });
        }
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchPlugin
    public void onReceiveJSEvent(String str, Map<String, Object> map) {
        Object obj;
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58143e7133675b5a4da043776df9f769", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58143e7133675b5a4da043776df9f769");
        } else if (!TextUtils.equals(com.sankuai.waimai.pouch.mach.text.a.f, str) || !this.b || map == null || (obj = map.get("new_content")) == null || !(obj instanceof String) || this.c == null) {
        } else {
            this.c.j((String) obj);
        }
    }
}
