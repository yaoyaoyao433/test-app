package com.sankuai.waimai.ad.interact;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.ad.view.mach.gifimage.b;
import com.sankuai.waimai.ad.view.mach.tierslide.c;
import com.sankuai.waimai.mach.node.a;
import com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchInteractPlugin;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class TileSwiperInteractPlugin extends AbsWMPouchInteractPlugin {
    public static ChangeQuickRedirect a;
    private c b;

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchInteractPlugin
    public final void a(String str, int i, Map<String, Object> map) {
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchInteractPlugin
    public final void c() {
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchPlugin
    public void onReceiveJSEvent(String str, Map<String, Object> map) {
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchPlugin
    public void onRenderFailed() {
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchPlugin
    public void reset() {
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchInteractPlugin
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b7e362bee54a01cde471e8adc05e44d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b7e362bee54a01cde471e8adc05e44d");
        } else if (this.b != null) {
            this.b.b(false);
        }
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchInteractPlugin
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "950c9d52ff4ff01eed129c62021a2727", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "950c9d52ff4ff01eed129c62021a2727");
        } else if (this.b != null) {
            this.b.b(true);
        }
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchInteractPlugin
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "faad7a6d28a1aa9c2e9f10ff85ca2fa3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "faad7a6d28a1aa9c2e9f10ff85ca2fa3");
        } else if (this.b != null) {
            this.b.a(true);
        }
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchInteractPlugin
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "901cdde26c9fd3b20a30f18425e6a070", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "901cdde26c9fd3b20a30f18425e6a070");
        } else if (this.b != null) {
            this.b.a(false);
        }
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchPlugin
    public void onViewAttached(View view, com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {view, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aeb3823fec3a334952d610baf2abd52d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aeb3823fec3a334952d610baf2abd52d");
            return;
        }
        final PlatinumItemVideoInteractPlugin platinumItemVideoInteractPlugin = new PlatinumItemVideoInteractPlugin();
        final WMGifInteractPlugin wMGifInteractPlugin = new WMGifInteractPlugin();
        com.sankuai.waimai.mach.node.a.a(aVar, new a.InterfaceC1019a() { // from class: com.sankuai.waimai.ad.interact.TileSwiperInteractPlugin.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.node.a.InterfaceC1019a
            public final void a(com.sankuai.waimai.mach.node.a aVar2) {
                Object[] objArr2 = {aVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8ff4ee84c257792e12324c7244b4bf4b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8ff4ee84c257792e12324c7244b4bf4b");
                } else if (aVar2 == null) {
                } else {
                    if (aVar2.h instanceof c) {
                        TileSwiperInteractPlugin.this.b = (c) aVar2.h;
                    }
                    if (aVar2.h instanceof com.sankuai.waimai.ad.view.mach.itemvideo.a) {
                        platinumItemVideoInteractPlugin.setPluginParams(TileSwiperInteractPlugin.this.pluginParams);
                    }
                    if ((aVar2.g() instanceof b) && (aVar2.h instanceof com.sankuai.waimai.ad.view.mach.gifimage.a)) {
                        wMGifInteractPlugin.setPluginParams(TileSwiperInteractPlugin.this.pluginParams);
                    }
                }
            }
        });
    }
}
