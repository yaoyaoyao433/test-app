package com.sankuai.waimai.ad.interact;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.ad.view.mach.nested.b;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.mach.node.a;
import com.sankuai.waimai.pouch.monitor.d;
import com.sankuai.waimai.pouch.monitor.e;
import com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchInteractPlugin;
import com.sankuai.waimai.pouch.view.c;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class EmbedLifeCyclePlugin extends AbsWMPouchInteractPlugin {
    public static ChangeQuickRedirect a;
    private int b;
    private String c;
    private Mach d;

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

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchInteractPlugin
    public final void d() {
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchInteractPlugin
    public final void e() {
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

    public EmbedLifeCyclePlugin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47e3f9bf272f40a4a8a22ac9ed15f52a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47e3f9bf272f40a4a8a22ac9ed15f52a");
        } else {
            this.b = 0;
        }
    }

    public static /* synthetic */ int b(EmbedLifeCyclePlugin embedLifeCyclePlugin) {
        int i = embedLifeCyclePlugin.b;
        embedLifeCyclePlugin.b = i - 1;
        return i;
    }

    public static /* synthetic */ void c(EmbedLifeCyclePlugin embedLifeCyclePlugin) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, embedLifeCyclePlugin, changeQuickRedirect, false, "27852674feec5f71765b09e7e6467bf0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, embedLifeCyclePlugin, changeQuickRedirect, false, "27852674feec5f71765b09e7e6467bf0");
        } else if (embedLifeCyclePlugin.d == null) {
            com.sankuai.waimai.foundation.utils.log.a.c("EmbedLifeCyclePlugin", "mMach is null!!", new Object[0]);
        } else if (embedLifeCyclePlugin.b == 0) {
            embedLifeCyclePlugin.a("send success event to Mach ！");
            embedLifeCyclePlugin.d.sendJsEvent("embed-render-success", null);
        }
    }

    public static /* synthetic */ int e(EmbedLifeCyclePlugin embedLifeCyclePlugin) {
        int i = embedLifeCyclePlugin.b;
        embedLifeCyclePlugin.b = i + 1;
        return i;
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchPlugin
    public void onViewAttached(View view, com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {view, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d281bc50238725cc05b775901160857", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d281bc50238725cc05b775901160857");
        } else if (aVar == null) {
            com.sankuai.waimai.foundation.utils.log.a.c("EmbedLifeCyclePlugin", "rootNode is null !", new Object[0]);
        } else {
            if (this.d == null) {
                this.d = aVar.f;
            }
            this.c = aVar.i;
            Object[] objArr2 = {aVar};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1cd962a3627ac61387189001f48b3c89", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1cd962a3627ac61387189001f48b3c89");
            } else if (aVar != null) {
                com.sankuai.waimai.mach.node.a.a(aVar, new a.InterfaceC1019a() { // from class: com.sankuai.waimai.ad.interact.EmbedLifeCyclePlugin.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.mach.node.a.InterfaceC1019a
                    public final void a(com.sankuai.waimai.mach.node.a aVar2) {
                        com.sankuai.waimai.pouch.a aVar3;
                        Object[] objArr3 = {aVar2};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "17e31687fe9b8207ccf4c00dc8d1fc70", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "17e31687fe9b8207ccf4c00dc8d1fc70");
                        } else if (aVar2 == null || !(aVar2.h instanceof b) || (aVar3 = ((b) aVar2.h).b) == null) {
                        } else {
                            aVar3.f = new c() { // from class: com.sankuai.waimai.ad.interact.EmbedLifeCyclePlugin.1.1
                                public static ChangeQuickRedirect a;

                                @Override // com.sankuai.waimai.pouch.view.c
                                public final void c() {
                                }

                                @Override // com.sankuai.waimai.pouch.view.c
                                public final void a() {
                                    Object[] objArr4 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "61657c0c6224224169e1bdacb567cee1", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "61657c0c6224224169e1bdacb567cee1");
                                        return;
                                    }
                                    EmbedLifeCyclePlugin embedLifeCyclePlugin = EmbedLifeCyclePlugin.this;
                                    embedLifeCyclePlugin.a("render Success!!! mCount:" + EmbedLifeCyclePlugin.this.b);
                                    EmbedLifeCyclePlugin.b(EmbedLifeCyclePlugin.this);
                                    EmbedLifeCyclePlugin.c(EmbedLifeCyclePlugin.this);
                                }

                                @Override // com.sankuai.waimai.pouch.view.c
                                public final void b() {
                                    Object[] objArr4 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "d30303d8261fdd6c92223936278f7f11", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "d30303d8261fdd6c92223936278f7f11");
                                        return;
                                    }
                                    JSONObject jSONObject = new JSONObject();
                                    try {
                                        if (EmbedLifeCyclePlugin.this.d != null && EmbedLifeCyclePlugin.this.d.getMachBundle() != null) {
                                            jSONObject.put("TemplateId", EmbedLifeCyclePlugin.this.d.getMachBundle().j);
                                            jSONObject.put("TemplateVersion", EmbedLifeCyclePlugin.this.d.getMachBundle().a());
                                        }
                                    } catch (JSONException e) {
                                        e.printStackTrace();
                                    }
                                    e.a(new d().a("embed-render-success-opportunity").b("EmbedRenderFail").d(jSONObject.toString()).a(true).b(), (Map<String, String>) null);
                                    EmbedLifeCyclePlugin embedLifeCyclePlugin = EmbedLifeCyclePlugin.this;
                                    embedLifeCyclePlugin.a("render Fail... mCount:" + EmbedLifeCyclePlugin.this.b);
                                }
                            };
                            EmbedLifeCyclePlugin.e(EmbedLifeCyclePlugin.this);
                        }
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70e9f9c38b11368c487ce8aea5515405", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70e9f9c38b11368c487ce8aea5515405");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.c("EmbedLifeCyclePlugin", this.c + " : " + str, new Object[0]);
    }
}
