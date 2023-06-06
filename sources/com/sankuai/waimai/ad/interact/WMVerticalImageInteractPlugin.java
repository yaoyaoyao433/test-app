package com.sankuai.waimai.ad.interact;

import android.text.TextUtils;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.node.a;
import com.sankuai.waimai.pouch.mach.swiper.PouchSwiperContainer;
import com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchInteractPlugin;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WMVerticalImageInteractPlugin extends AbsWMPouchInteractPlugin {
    public static ChangeQuickRedirect a;
    private com.sankuai.waimai.pouch.mach.swiper.a b;
    private boolean c;

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

    public WMVerticalImageInteractPlugin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e90a34e6dc2e030bbe7498d341b04e1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e90a34e6dc2e030bbe7498d341b04e1");
        } else {
            this.c = true;
        }
    }

    public WMVerticalImageInteractPlugin(com.sankuai.waimai.pouch.mach.swiper.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ca0c349c0e84d7da5c4948a6a305d27", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ca0c349c0e84d7da5c4948a6a305d27");
            return;
        }
        this.c = true;
        this.b = aVar;
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchInteractPlugin
    public final void d() {
        PouchSwiperContainer pouchSwiperContainer;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4230137d27403a9e691fcbf5e5b46a8e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4230137d27403a9e691fcbf5e5b46a8e");
            return;
        }
        this.c = false;
        if (this.b == null || (pouchSwiperContainer = (PouchSwiperContainer) this.b.o) == null) {
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = PouchSwiperContainer.a;
        if (PatchProxy.isSupport(objArr2, pouchSwiperContainer, changeQuickRedirect2, false, "298ef2bcfb4422952958038fb283b386", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, pouchSwiperContainer, changeQuickRedirect2, false, "298ef2bcfb4422952958038fb283b386");
            return;
        }
        if (pouchSwiperContainer.b != null) {
            pouchSwiperContainer.b.removeOnScrollListener(pouchSwiperContainer.f);
        }
        if (pouchSwiperContainer.e != null) {
            pouchSwiperContainer.e.m = null;
        }
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchInteractPlugin
    public final void e() {
        PouchSwiperContainer pouchSwiperContainer;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c294f753d563756479be1ad1adaa3395", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c294f753d563756479be1ad1adaa3395");
            return;
        }
        this.c = true;
        if (this.b == null || (pouchSwiperContainer = (PouchSwiperContainer) this.b.o) == null) {
            return;
        }
        pouchSwiperContainer.a();
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchPlugin
    public void onViewAttached(View view, com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {view, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "196ce947593331cd9dbfb912dcb13d26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "196ce947593331cd9dbfb912dcb13d26");
        } else if (this.b == null) {
            com.sankuai.waimai.mach.node.a.a(aVar, new a.InterfaceC1019a() { // from class: com.sankuai.waimai.ad.interact.WMVerticalImageInteractPlugin.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.mach.node.a.InterfaceC1019a
                public final void a(com.sankuai.waimai.mach.node.a aVar2) {
                    Object[] objArr2 = {aVar2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "882a23ebc3204a1d3c4713a30abf8411", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "882a23ebc3204a1d3c4713a30abf8411");
                    } else if (aVar2 == null || !(aVar2.h instanceof com.sankuai.waimai.pouch.mach.swiper.a)) {
                    } else {
                        WMVerticalImageInteractPlugin.this.b = (com.sankuai.waimai.pouch.mach.swiper.a) aVar2.h;
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad5666c4e819d5f71b171805f9580992", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad5666c4e819d5f71b171805f9580992");
        } else if (!this.c || !TextUtils.equals(com.sankuai.waimai.pouch.mach.swiper.a.c, str) || (obj = map.get("new_index")) == null || this.b == null) {
        } else {
            if (obj instanceof Integer) {
                this.b.a(((Integer) obj).intValue());
            } else if (obj instanceof Long) {
                this.b.a(((Long) obj).intValue());
            }
        }
    }
}
