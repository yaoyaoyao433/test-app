package com.sankuai.waimai.ad.interact;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.ad.alita.a;
import com.sankuai.waimai.alita.core.intention.AlitaIntention;
import com.sankuai.waimai.alita.core.intention.b;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.foundation.utils.k;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.mach.component.base.a;
import com.sankuai.waimai.pouch.a;
import com.sankuai.waimai.pouch.model.c;
import com.sankuai.waimai.pouch.plugin.params.b;
import com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchInteractPlugin;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class AlitaIntentionPlugin<T extends com.sankuai.waimai.mach.component.base.a> extends AbsWMPouchInteractPlugin {
    public static ChangeQuickRedirect a;
    private com.sankuai.waimai.ad.alita.a b;
    private Mach c;
    private int d;
    private String e;
    private String f;
    private String g;

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
    public final void d() {
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchInteractPlugin
    public final void e() {
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchPlugin
    public void onRenderFailed() {
    }

    public AlitaIntentionPlugin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc566c6e7d88dc6cf595de3b3bd3eef6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc566c6e7d88dc6cf595de3b3bd3eef6");
            return;
        }
        this.d = 0;
        this.e = null;
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchInteractPlugin
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19de4d2118f8b62e62cceae38b43e206", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19de4d2118f8b62e62cceae38b43e206");
        } else if (this.b != null) {
            this.b.a();
        }
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchPlugin
    public void onReceiveJSEvent(String str, Map<String, Object> map) {
        com.sankuai.waimai.pouch.a aVar;
        a.b bVar;
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2fcc2fb6b39f5bf4cbe29b867a53a36", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2fcc2fb6b39f5bf4cbe29b867a53a36");
        } else if (!TextUtils.equals("ad-interactive-recommend-response", str) || (aVar = ((com.sankuai.waimai.pouch.plugin.params.a) this.pluginParams).b) == null || (bVar = aVar.n) == null) {
        } else {
            bVar.a(map);
        }
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchPlugin
    public void reset() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9ce95adfa16e4969f9366b5691eb171", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9ce95adfa16e4969f9366b5691eb171");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.b("AlitaIntentionPlugin", "resetting, mADAlitaExecutor:" + this.b, new Object[0]);
        if (this.b != null) {
            this.b.a();
        }
        this.d = 0;
        this.e = null;
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchPlugin
    public void onDetachedFromContainer() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0dc31a92d1b8a6c756d178c68b5c5d99", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0dc31a92d1b8a6c756d178c68b5c5d99");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.b("AlitaIntentionPlugin", "onDetachedFromContainer, mADAlitaExecutor:" + this.b, new Object[0]);
        if (this.b != null) {
            this.b.a();
        }
        this.d = 0;
        this.e = null;
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchPlugin
    public void onViewAttached(View view, com.sankuai.waimai.mach.node.a aVar) {
        Object obj;
        Object[] objArr = {view, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c80b6ac641dcf9eeb9dd03ce00c8b23d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c80b6ac641dcf9eeb9dd03ce00c8b23d");
            return;
        }
        if (aVar != null) {
            this.c = aVar.f;
        }
        if (this.pluginParams == 0 || this.mExtraParams == null) {
            return;
        }
        if (this.mExtraParams.containsKey("scene_key")) {
            String str = (String) com.sankuai.waimai.pouch.util.a.a(this.mExtraParams, "scene_key");
            String str2 = (String) com.sankuai.waimai.pouch.util.a.a(this.mExtraParams, "bundle_name");
            Map map = (Map) com.sankuai.waimai.pouch.util.a.a(this.mExtraParams, "bundle_params");
            this.f = (String) com.sankuai.waimai.pouch.util.a.a(this.mExtraParams, "verify_key");
            if (this.f != null && this.mExtraParams.containsKey("verify_value") && (obj = this.mExtraParams.get("verify_value")) != null) {
                this.g = String.valueOf(obj);
            }
            if (this.mExtraParams.containsKey("need_intention")) {
                Object obj2 = this.mExtraParams.get("need_intention");
                if (obj2 instanceof Number) {
                    this.d = ((Number) obj2).intValue();
                }
            }
            if (str != null) {
                this.b = new com.sankuai.waimai.ad.alita.a(str, str2, map != null ? new JSONObject(map) : null);
            }
        }
        if (this.b != null) {
            final com.sankuai.waimai.ad.alita.a aVar2 = this.b;
            final a.InterfaceC0674a interfaceC0674a = new a.InterfaceC0674a() { // from class: com.sankuai.waimai.ad.interact.AlitaIntentionPlugin.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.ad.alita.a.InterfaceC0674a
                public final void a(@Nullable AlitaIntention alitaIntention) {
                    Object[] objArr2 = {alitaIntention};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8974d6652fa448c691f39ce88f99f714", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8974d6652fa448c691f39ce88f99f714");
                    } else if (AlitaIntentionPlugin.this.d == 1) {
                        try {
                            AlitaIntentionPlugin.this.e = k.a().toJson(alitaIntention);
                        } catch (Exception e) {
                            com.sankuai.waimai.foundation.utils.log.a.b(e);
                        }
                    }
                }

                @Override // com.sankuai.waimai.ad.alita.a.InterfaceC0674a
                public final void a(@Nullable JSONObject jSONObject) {
                    boolean z;
                    c.a aVar3;
                    Map<String, Map<String, Object>> M;
                    String valueOf;
                    Object[] objArr2 = {jSONObject};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "20bd4ba016383ba857d0916f0133374a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "20bd4ba016383ba857d0916f0133374a");
                        return;
                    }
                    if (AlitaIntentionPlugin.this.f == null || AlitaIntentionPlugin.this.g == null) {
                        z = false;
                    } else {
                        try {
                            valueOf = String.valueOf(jSONObject.getJSONObject("data").getJSONObject("data").getJSONObject("current_action").get(AlitaIntentionPlugin.this.f));
                            z = TextUtils.equals(valueOf, AlitaIntentionPlugin.this.g);
                        } catch (Exception e) {
                            e = e;
                            z = false;
                        }
                        try {
                            com.sankuai.waimai.foundation.utils.log.a.b("AlitaIntentionPlugin", "valueFromAlita:%s, matched:%s", valueOf, Boolean.valueOf(z));
                        } catch (Exception e2) {
                            e = e2;
                            e.printStackTrace();
                            if (z) {
                                return;
                            }
                            return;
                        }
                    }
                    if (z || AlitaIntentionPlugin.this.c == null) {
                        return;
                    }
                    Map<String, Object> map2 = null;
                    if (AlitaIntentionPlugin.this.pluginParams != null) {
                        com.sankuai.waimai.pouch.plugin.params.a aVar4 = (com.sankuai.waimai.pouch.plugin.params.a) AlitaIntentionPlugin.this.pluginParams;
                        Object[] objArr3 = {"alita-intention"};
                        ChangeQuickRedirect changeQuickRedirect3 = b.a;
                        if (PatchProxy.isSupport(objArr3, aVar4, changeQuickRedirect3, false, "929c0999fcd7ac2f2d488c16b3e4b913", RobustBitConfig.DEFAULT_VALUE)) {
                            map2 = (Map) PatchProxy.accessDispatch(objArr3, aVar4, changeQuickRedirect3, false, "929c0999fcd7ac2f2d488c16b3e4b913");
                        } else if (aVar4.c != null && (aVar3 = aVar4.c.j) != null && (M = aVar3.M()) != null) {
                            map2 = M.get("alita-intention");
                        }
                    }
                    if (map2 == null) {
                        map2 = new HashMap<>();
                    }
                    try {
                        if (jSONObject.has("data")) {
                            map2.put("behavioral_characteristics", k.a().toJson(jSONObject.getJSONObject("data")));
                        }
                        if (AlitaIntentionPlugin.this.d == 1 && AlitaIntentionPlugin.this.e != null) {
                            map2.put("alita_intention", AlitaIntentionPlugin.this.e);
                        }
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                    if (!map2.isEmpty()) {
                        AlitaIntentionPlugin.this.c.sendJsEvent("ad-interactive-recommend-trigger", map2);
                    } else {
                        com.sankuai.waimai.pouch.monitor.c.a("AlitaIntentionPlugin", "request_params_empty", "request_params_empty", true);
                    }
                }

                @Override // com.sankuai.waimai.ad.alita.a.InterfaceC0674a
                public final void a(@Nullable Exception exc) {
                    Object[] objArr2 = {exc};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "abee8c7576955055e41e6ac4d4bd6ffc", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "abee8c7576955055e41e6ac4d4bd6ffc");
                        return;
                    }
                    String str3 = "unknown";
                    if (exc != null) {
                        str3 = exc.getMessage();
                        com.sankuai.waimai.foundation.utils.log.a.a("AlitaIntentionPlugin", "onFailed", exc);
                    }
                    com.sankuai.waimai.pouch.monitor.c.a("AlitaIntentionPlugin", "alita_execute_error", str3, true);
                }
            };
            Object[] objArr2 = {interfaceC0674a};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.ad.alita.a.a;
            if (PatchProxy.isSupport(objArr2, aVar2, changeQuickRedirect2, false, "9d38a610b938b9ba8804ed1acfbb29a9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar2, changeQuickRedirect2, false, "9d38a610b938b9ba8804ed1acfbb29a9");
            } else if (aa.a(aVar2.c)) {
                com.sankuai.waimai.foundation.utils.log.a.a(com.sankuai.waimai.ad.alita.a.b, "mSceneKey is empty!");
                interfaceC0674a.a(new Exception("mSceneKey is empty!"));
            } else {
                com.sankuai.waimai.alita.core.intention.a a2 = com.sankuai.waimai.alita.core.intention.c.a().a("waimai");
                if (a2 == null) {
                    interfaceC0674a.a(new Exception("AlitaIntentionManager is null!"));
                } else {
                    aVar2.d = a2.a(aVar2.c, new b.a() { // from class: com.sankuai.waimai.ad.alita.a.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.alita.core.intention.b.a
                        public final void a(@Nullable AlitaIntention alitaIntention, @Nullable AlitaIntention alitaIntention2) {
                            Object[] objArr3 = {alitaIntention, alitaIntention2};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "acd78579f1b1be0482fe6d8b02013b46", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "acd78579f1b1be0482fe6d8b02013b46");
                                return;
                            }
                            interfaceC0674a.a(alitaIntention);
                            if (aa.a(aVar2.e)) {
                                return;
                            }
                            a.a(aVar2, interfaceC0674a);
                        }
                    });
                }
            }
        }
    }
}
