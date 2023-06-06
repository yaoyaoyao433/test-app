package com.sankuai.waimai.ad.interact;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.node.a;
import com.sankuai.waimai.pouch.mach.tab.b;
import com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchInteractPlugin;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class DessertDrinkLinkInteractPlugin extends AbsWMPouchInteractPlugin {
    public static ChangeQuickRedirect a;
    private WMVerticalImageInteractPlugin b;
    private VerticalTextSwiperPlugin c;
    private VerticalTabSwiperPlugin d;

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchInteractPlugin
    public final void a(String str, int i, Map<String, Object> map) {
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchInteractPlugin
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c90c304a50ecd0a866ab2442d8171d06", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c90c304a50ecd0a866ab2442d8171d06");
            return;
        }
        if (this.b != null) {
            this.b.d();
        }
        if (this.c != null) {
            this.c.d();
        }
        if (this.d != null) {
            this.d.d();
        }
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchInteractPlugin
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b657e7facbb891c1f462cebbaf263e75", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b657e7facbb891c1f462cebbaf263e75");
            return;
        }
        if (this.b != null) {
            this.b.e();
        }
        if (this.c != null) {
            this.c.b = true;
        }
        if (this.d != null) {
            this.d.b = true;
        }
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchInteractPlugin
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a127934672aae11ac1b23bb0f7439716", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a127934672aae11ac1b23bb0f7439716");
            return;
        }
        if (this.b != null) {
            WMVerticalImageInteractPlugin wMVerticalImageInteractPlugin = this.b;
        }
        if (this.c != null) {
            VerticalTextSwiperPlugin verticalTextSwiperPlugin = this.c;
        }
        if (this.d != null) {
            VerticalTabSwiperPlugin verticalTabSwiperPlugin = this.d;
        }
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchInteractPlugin
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20ddf58762f89c469114776e33d80c12", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20ddf58762f89c469114776e33d80c12");
            return;
        }
        if (this.b != null) {
            WMVerticalImageInteractPlugin wMVerticalImageInteractPlugin = this.b;
        }
        if (this.c != null) {
            VerticalTextSwiperPlugin verticalTextSwiperPlugin = this.c;
        }
        if (this.d != null) {
            VerticalTabSwiperPlugin verticalTabSwiperPlugin = this.d;
        }
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchInteractPlugin
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74cfd00ec2a7bc04cf0e961983786f65", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74cfd00ec2a7bc04cf0e961983786f65");
            return;
        }
        if (this.b != null) {
            WMVerticalImageInteractPlugin wMVerticalImageInteractPlugin = this.b;
        }
        if (this.c != null) {
            VerticalTextSwiperPlugin verticalTextSwiperPlugin = this.c;
        }
        if (this.d != null) {
            VerticalTabSwiperPlugin verticalTabSwiperPlugin = this.d;
        }
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchPlugin
    public void onViewAttached(View view, com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {view, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9189eb3fecaddebda03520df4bd73d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9189eb3fecaddebda03520df4bd73d5");
        } else {
            com.sankuai.waimai.mach.node.a.a(aVar, new a.InterfaceC1019a() { // from class: com.sankuai.waimai.ad.interact.DessertDrinkLinkInteractPlugin.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.mach.node.a.InterfaceC1019a
                public final void a(com.sankuai.waimai.mach.node.a aVar2) {
                    Object[] objArr2 = {aVar2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5899eed9a248b56f60f202a662b89958", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5899eed9a248b56f60f202a662b89958");
                        return;
                    }
                    if (aVar2 != null && (aVar2.h instanceof com.sankuai.waimai.pouch.mach.swiper.a)) {
                        DessertDrinkLinkInteractPlugin.this.b = new WMVerticalImageInteractPlugin((com.sankuai.waimai.pouch.mach.swiper.a) aVar2.h);
                        DessertDrinkLinkInteractPlugin.this.b.setPluginParams(DessertDrinkLinkInteractPlugin.this.pluginParams);
                    }
                    if (aVar2 != null && (aVar2.h instanceof com.sankuai.waimai.pouch.mach.text.a)) {
                        DessertDrinkLinkInteractPlugin.this.c = new VerticalTextSwiperPlugin((com.sankuai.waimai.pouch.mach.text.a) aVar2.h);
                        DessertDrinkLinkInteractPlugin.this.c.setPluginParams(DessertDrinkLinkInteractPlugin.this.pluginParams);
                    }
                    if (aVar2 == null || !(aVar2.h instanceof b)) {
                        return;
                    }
                    DessertDrinkLinkInteractPlugin.this.d = new VerticalTabSwiperPlugin((b) aVar2.h);
                    DessertDrinkLinkInteractPlugin.this.d.setPluginParams(DessertDrinkLinkInteractPlugin.this.pluginParams);
                }
            });
        }
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchPlugin
    public void onRenderFailed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68ab1a8d24cf26e8269647d8575d6aee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68ab1a8d24cf26e8269647d8575d6aee");
            return;
        }
        if (this.b != null) {
            this.b.onRenderFailed();
        }
        if (this.c != null) {
            this.c.onRenderFailed();
        }
        if (this.d != null) {
            this.d.onRenderFailed();
        }
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchPlugin
    public void onReceiveJSEvent(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee2cf31b388eb73e01b810548e2ce202", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee2cf31b388eb73e01b810548e2ce202");
            return;
        }
        if (this.b != null) {
            this.b.onReceiveJSEvent(str, map);
        }
        if (this.c != null) {
            this.c.onReceiveJSEvent(str, map);
        }
        if (this.d != null) {
            this.d.onReceiveJSEvent(str, map);
        }
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchPlugin
    public void reset() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4dc9dd2aa00fbeacd24f472290e38a56", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4dc9dd2aa00fbeacd24f472290e38a56");
            return;
        }
        if (this.b != null) {
            this.b.reset();
        }
        if (this.c != null) {
            this.c.reset();
        }
        if (this.d != null) {
            this.d.reset();
        }
    }
}
