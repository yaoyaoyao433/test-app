package com.sankuai.waimai.ad.interact.irmo;

import android.text.TextUtils;
import android.util.ArrayMap;
import android.view.View;
import com.meituan.android.legwork.monitor.report.channel.dao.DaBaiDao;
import com.meituan.android.ptcommonim.protocol.message.PTIMMessageBeanEntity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.k;
import com.sankuai.waimai.irmo.render.c;
import com.sankuai.waimai.mach.manager.cache.e;
import com.sankuai.waimai.mach.node.a;
import com.sankuai.waimai.pouch.monitor.d;
import com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchInteractPlugin;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class IrmoEffectByViewIdDSLPlugin extends AbsWMPouchInteractPlugin {
    public static ChangeQuickRedirect a;
    private ArrayMap<String, a> b;
    private e c;

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
    public void onRenderFailed() {
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchPlugin
    public void reset() {
    }

    public IrmoEffectByViewIdDSLPlugin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5d169785fea2e580aba77009eb444e4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5d169785fea2e580aba77009eb444e4");
        } else {
            this.b = new ArrayMap<>();
        }
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchPlugin
    public void onReceiveJSEvent(String str, Map<String, Object> map) {
        a aVar;
        a aVar2;
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15d0dd79a044d9dd575cafe703ab7ee2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15d0dd79a044d9dd575cafe703ab7ee2");
        } else if ("start-irmo-effect".equals(str)) {
            try {
                Object obj = map.get("view_id_dsl_array");
                if (obj instanceof List) {
                    for (Object obj2 : (List) obj) {
                        if (obj2 instanceof Map) {
                            Object obj3 = ((Map) obj2).get("view_id");
                            if ((obj3 instanceof String) && (aVar = this.b.get(obj3)) != null) {
                                aVar.a();
                                String str2 = DaBaiDao.JSON_DATA;
                                if (((Map) obj2).containsKey("dsl_type")) {
                                    Object obj4 = ((Map) obj2).get("dsl_type");
                                    if (obj4 instanceof String) {
                                        str2 = (String) obj4;
                                    }
                                }
                                if (((Map) obj2).containsKey("dsl")) {
                                    Object obj5 = ((Map) obj2).get("dsl");
                                    if (obj5 instanceof String) {
                                        int i = !"url".equals(str2) ? 1 : 0;
                                        if (!TextUtils.isEmpty((String) obj5)) {
                                            String str3 = (String) obj5;
                                            Object[] objArr2 = {Integer.valueOf(i), str3};
                                            ChangeQuickRedirect changeQuickRedirect2 = a.a;
                                            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "ac9df3a8d0e0ab5ad0c75bab6edc8833", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "ac9df3a8d0e0ab5ad0c75bab6edc8833");
                                            } else if (aVar.c != null) {
                                                aVar.c.a(i, str3);
                                            }
                                        }
                                    } else if (obj5 instanceof Map) {
                                        a("dsl_not_string", "is_map");
                                    }
                                }
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a.a;
                                if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "eae45d33f1cc375c739c4d466e6fe893", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "eae45d33f1cc375c739c4d466e6fe893");
                                } else if (aVar.h < aVar.e || aVar.e < 0) {
                                    if (aVar.g == 0) {
                                        if (aVar.c != null) {
                                            aVar.c.a();
                                        }
                                    } else {
                                        aVar.i.removeCallbacks(aVar.j);
                                        aVar.i.postDelayed(aVar.j, aVar.g);
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (Exception e) {
                a("start irmo effect fail", e.getMessage());
            }
        } else if ("stop-irmo-effect".equals(str)) {
            try {
                Object obj6 = map.get("view_id_array");
                if (obj6 instanceof List) {
                    for (Object obj7 : (List) obj6) {
                        if ((obj7 instanceof String) && (aVar2 = this.b.get(obj7)) != null) {
                            aVar2.a();
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a.a;
                            if (PatchProxy.isSupport(objArr4, aVar2, changeQuickRedirect4, false, "2f59a66a6445b8814053e28c58bdbee6", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, aVar2, changeQuickRedirect4, false, "2f59a66a6445b8814053e28c58bdbee6");
                            } else {
                                aVar2.i.removeCallbacks(aVar2.j);
                                if (aVar2.c != null) {
                                    aVar2.c.b();
                                }
                            }
                        }
                    }
                }
            } catch (Exception e2) {
                a("stop irmo effect fail", e2.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1cd79cd10f9b9903ccf151ab6ebbd94", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1cd79cd10f9b9903ccf151ab6ebbd94");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("error_info", str2);
            HashMap hashMap = new HashMap();
            hashMap.put("error_info", str2);
            if (this.c != null) {
                jSONObject.put(PTIMMessageBeanEntity.DATA_KEY_TEMPLATE, this.c.j + ", " + this.c.a());
                hashMap.put(PTIMMessageBeanEntity.DATA_KEY_TEMPLATE, this.c.j + ", " + this.c.a());
            }
            com.sankuai.waimai.pouch.monitor.e.a(new d().a("IrmoEffectByViewIdDSLPlugin").b(str).d(jSONObject.toString()).a(true).b(), hashMap);
        } catch (Exception unused) {
        }
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchPlugin
    public void onViewAttached(View view, com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {view, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e778572d8c77d7e9958662cb6c6ab57", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e778572d8c77d7e9958662cb6c6ab57");
        } else if (aVar != null) {
            if (aVar.f != null) {
                this.c = aVar.f.getMachBundle();
            }
            if (this.b != null) {
                this.b.clear();
            }
            com.sankuai.waimai.mach.node.a.a(aVar, new a.InterfaceC1019a() { // from class: com.sankuai.waimai.ad.interact.irmo.IrmoEffectByViewIdDSLPlugin.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.mach.node.a.InterfaceC1019a
                public final void a(com.sankuai.waimai.mach.node.a aVar2) {
                    c cVar;
                    String a2;
                    Object[] objArr2 = {aVar2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6ba46d0e9f636ff31159c591599c0807", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6ba46d0e9f636ff31159c591599c0807");
                    } else if (aVar2 != null) {
                        try {
                            if (!(aVar2.h instanceof c) || (a2 = (cVar = (c) aVar2.h).a("extra-params")) == null) {
                                return;
                            }
                            Map map = (Map) k.a().fromJson(a2, (Class<Object>) Map.class);
                            if (map.containsKey("viewId")) {
                                a aVar3 = new a(cVar);
                                Object obj = map.get("viewId");
                                if (obj instanceof String) {
                                    IrmoEffectByViewIdDSLPlugin.this.b.put((String) obj, aVar3);
                                }
                                int i = -1;
                                if (map.containsKey("triggerTimes")) {
                                    Object obj2 = map.get("triggerTimes");
                                    if (!(obj2 instanceof String)) {
                                        IrmoEffectByViewIdDSLPlugin.this.a("triggerTimes", "triggerTimes type error");
                                    } else {
                                        try {
                                            i = Integer.parseInt((String) obj2);
                                        } catch (Exception e) {
                                            IrmoEffectByViewIdDSLPlugin.this.a("triggerTimes", e.getMessage());
                                        }
                                    }
                                }
                                aVar3.e = i;
                                long j = 0;
                                if (map.containsKey("triggerDelay")) {
                                    Object obj3 = map.get("triggerDelay");
                                    if (!(obj3 instanceof String)) {
                                        IrmoEffectByViewIdDSLPlugin.this.a("triggerDelay", "triggerDelay type error");
                                    } else {
                                        try {
                                            j = Long.parseLong((String) obj3);
                                        } catch (Exception e2) {
                                            IrmoEffectByViewIdDSLPlugin.this.a("triggerDelay", e2.getMessage());
                                        }
                                    }
                                }
                                aVar3.g = j;
                            }
                        } catch (Exception e3) {
                            IrmoEffectByViewIdDSLPlugin.this.a("iterate fail", e3.getMessage());
                        }
                    }
                }
            });
        }
    }
}
