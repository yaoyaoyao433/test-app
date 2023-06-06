package com.sankuai.waimai.ad.interact;

import android.app.Activity;
import android.arch.lifecycle.l;
import android.arch.lifecycle.q;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.ad;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.mach.node.a;
import com.sankuai.waimai.platform.mach.videoextend.d;
import com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchInteractPlugin;
import com.sankuai.waimai.pouch.viewmodel.PouchViewModel;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class PlatinumVideoInteractPlugin extends AbsWMPouchInteractPlugin {
    public static ChangeQuickRedirect a;
    private d b;
    private PouchViewModel c;
    private l<Integer> d;

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchInteractPlugin
    public final void a() {
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchInteractPlugin
    public final void b() {
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchPlugin
    public void onReceiveJSEvent(String str, Map<String, Object> map) {
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchPlugin
    public void onRenderFailed() {
    }

    public PlatinumVideoInteractPlugin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16162b7606b3b64c8eedd7836656692e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16162b7606b3b64c8eedd7836656692e");
        } else {
            this.d = new l<Integer>() { // from class: com.sankuai.waimai.ad.interact.PlatinumVideoInteractPlugin.1
                public static ChangeQuickRedirect a;

                @Override // android.arch.lifecycle.l
                public final /* synthetic */ void a(@Nullable Integer num) {
                    Integer num2 = num;
                    Object[] objArr2 = {num2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c4f45181649109f6ece0498e7d3d6959", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c4f45181649109f6ece0498e7d3d6959");
                    } else if (num2 == null || PlatinumVideoInteractPlugin.this.b == null) {
                    } else {
                        com.sankuai.waimai.foundation.utils.log.a.b("PlatinumVideoInteractPlugin", "video stop way:" + num2, new Object[0]);
                        PlatinumVideoInteractPlugin.this.b.e = num2.intValue();
                    }
                }
            };
        }
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchInteractPlugin
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a9033eb2bd1afa29c09d89de945860c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a9033eb2bd1afa29c09d89de945860c");
        } else if (this.b == null || !this.b.a()) {
        } else {
            this.b.e();
            if (this.pluginParams != 0) {
                com.sankuai.waimai.foundation.utils.log.a.b("PlatinumVideoInteractPlugin", "report video stop, cid:" + ((com.sankuai.waimai.pouch.plugin.params.a) this.pluginParams).b(), new Object[0]);
                this.b.a(((com.sankuai.waimai.pouch.plugin.params.a) this.pluginParams).b(), null);
            }
        }
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchInteractPlugin
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1656fcf90295dabac085ac8d0812b9d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1656fcf90295dabac085ac8d0812b9d2");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.b("VideoComponent", "containerFromInvisibleToVisible", new Object[0]);
        if (this.b != null) {
            ad.c(new Runnable() { // from class: com.sankuai.waimai.ad.interact.PlatinumVideoInteractPlugin.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "13abcf84bea4539077f2e4f0035d88f7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "13abcf84bea4539077f2e4f0035d88f7");
                    } else if (PlatinumVideoInteractPlugin.this.b.a()) {
                        PlatinumVideoInteractPlugin.this.b.d();
                    }
                }
            });
        }
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchInteractPlugin
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53ad146d1659a694b2905d41a079cca5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53ad146d1659a694b2905d41a079cca5");
            return;
        }
        if (this.b != null) {
            this.b.c();
        }
        if (this.c != null) {
            this.c.b().b(this.d);
        }
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchInteractPlugin
    public final void a(String str, int i, Map<String, Object> map) {
        Object[] objArr = {str, Integer.valueOf(i), map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "319ee02e617e73c1bc7c9b54439b8142", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "319ee02e617e73c1bc7c9b54439b8142");
        } else if (this.b == null || this.b.g() == null) {
        } else {
            map.put("ad_video_id", this.b.g().g);
            map.put("ad_video_time", Integer.valueOf(this.b.h()));
        }
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchPlugin
    public void onViewAttached(View view, com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {view, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5c42742ca689eadf496d9aba5bec470", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5c42742ca689eadf496d9aba5bec470");
            return;
        }
        com.sankuai.waimai.mach.node.a.a(aVar, new a.InterfaceC1019a() { // from class: com.sankuai.waimai.ad.interact.PlatinumVideoInteractPlugin.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.node.a.InterfaceC1019a
            public final void a(com.sankuai.waimai.mach.node.a aVar2) {
                Object[] objArr2 = {aVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2f91248da2649fa95f8297d27e647d3f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2f91248da2649fa95f8297d27e647d3f");
                } else if (aVar2 == null || !(aVar2.h instanceof com.sankuai.waimai.platform.mach.videoextend.a)) {
                } else {
                    PlatinumVideoInteractPlugin.this.b = ((com.sankuai.waimai.platform.mach.videoextend.a) aVar2.h).e();
                }
            }
        });
        if (aVar == null || this.c != null) {
            return;
        }
        Mach mach = aVar.f;
        Activity activity = mach != null ? mach.getActivity() : null;
        if (activity instanceof FragmentActivity) {
            this.c = (PouchViewModel) q.a((FragmentActivity) activity).a(PouchViewModel.class);
        }
        if (this.c != null) {
            this.c.b().a(this.d);
        }
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchPlugin
    public void reset() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ed9f54748672fc9a9eb5f826e294635", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ed9f54748672fc9a9eb5f826e294635");
        } else if (this.b != null) {
            this.b.b = false;
            this.b.b();
        }
    }
}
