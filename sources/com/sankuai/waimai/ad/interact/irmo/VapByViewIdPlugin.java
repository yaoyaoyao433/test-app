package com.sankuai.waimai.ad.interact.irmo;

import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.ArrayMap;
import android.view.View;
import com.meituan.android.ptcommonim.protocol.message.PTIMMessageBeanEntity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.k;
import com.sankuai.waimai.irmo.mach.vap.b;
import com.sankuai.waimai.irmo.mach.vap.c;
import com.sankuai.waimai.irmo.render.a;
import com.sankuai.waimai.mach.manager.cache.e;
import com.sankuai.waimai.mach.node.a;
import com.sankuai.waimai.pouch.monitor.d;
import com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchInteractPlugin;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class VapByViewIdPlugin extends AbsWMPouchInteractPlugin {
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

    public VapByViewIdPlugin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7991acbf0a812478af6804612757b23b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7991acbf0a812478af6804612757b23b");
        } else {
            this.b = new ArrayMap<>();
        }
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchPlugin
    public void onReceiveJSEvent(String str, Map<String, Object> map) {
        List list;
        a aVar;
        List list2;
        a aVar2;
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84bf221164881eb1076bb130aba81ad5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84bf221164881eb1076bb130aba81ad5");
        } else if ("start-irmo-vap-effect".equals(str)) {
            try {
                Object obj = map.get("view_id_array");
                if (!(obj instanceof List) || (list = (List) obj) == null) {
                    return;
                }
                for (Object obj2 : list) {
                    if ((obj2 instanceof String) && (aVar = this.b.get(obj2)) != null) {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a.a;
                        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "ec58dc2234b143a0868170c2fc02f0ec", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "ec58dc2234b143a0868170c2fc02f0ec");
                        } else if (aVar.f < aVar.d || aVar.d < 0) {
                            if (aVar.e == 0) {
                                if (aVar.b != null) {
                                    aVar.b.e();
                                    com.sankuai.waimai.foundation.utils.log.a.b("VapByViewIdPlugin", "try to play effects delay, --%s", Integer.valueOf(aVar.hashCode()));
                                }
                            } else {
                                aVar.g.removeCallbacks(aVar.h);
                                aVar.g.postDelayed(aVar.h, aVar.e);
                            }
                        }
                    }
                }
            } catch (Exception e) {
                a("start vap effect fail", e.getMessage());
            }
        } else if ("stop-irmo-vap-effect".equals(str)) {
            try {
                Object obj3 = map.get("view_id_array");
                if (!(obj3 instanceof List) || (list2 = (List) obj3) == null) {
                    return;
                }
                for (Object obj4 : list2) {
                    if ((obj4 instanceof String) && (aVar2 = this.b.get(obj4)) != null) {
                        aVar2.a();
                    }
                }
            } catch (Exception e2) {
                a("stop vap effect fail", e2.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d32a43668521d0c0bb63cf7d5e2d999e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d32a43668521d0c0bb63cf7d5e2d999e");
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
            com.sankuai.waimai.pouch.monitor.e.a(new d().a("irmo-vap-by-view-id").b(str).d(jSONObject.toString()).a(true).b(), hashMap);
        } catch (Exception unused) {
        }
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchPlugin
    public void reset() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9cc98dd12f75578bf9fe700796424d3b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9cc98dd12f75578bf9fe700796424d3b");
        } else if (this.b != null && this.b.values() != null && !this.b.values().isEmpty()) {
            for (a aVar : this.b.values()) {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a.a;
                if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "40eeb03e8c56c23ff37bb6e312d0ebf9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "40eeb03e8c56c23ff37bb6e312d0ebf9");
                } else {
                    aVar.a();
                    if (aVar.c != null && aVar.b != null) {
                        com.sankuai.waimai.irmo.mach.vap.a aVar2 = aVar.b;
                        com.sankuai.waimai.irmo.render.a aVar3 = aVar.c;
                        Object[] objArr3 = {aVar3};
                        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.irmo.mach.vap.a.a;
                        if (PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect3, false, "a4b20db4ce3136f54b943828515b219f", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect3, false, "a4b20db4ce3136f54b943828515b219f");
                        } else if (aVar2.c != null) {
                            c cVar = aVar2.c;
                            Object[] objArr4 = {aVar3};
                            ChangeQuickRedirect changeQuickRedirect4 = c.a;
                            if (PatchProxy.isSupport(objArr4, cVar, changeQuickRedirect4, false, "a1eeaa1c35b06c763f178fe9064feeb7", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, cVar, changeQuickRedirect4, false, "a1eeaa1c35b06c763f178fe9064feeb7");
                            } else if (cVar.b != null) {
                                b bVar = cVar.b;
                                Object[] objArr5 = {aVar3};
                                ChangeQuickRedirect changeQuickRedirect5 = b.b;
                                if (PatchProxy.isSupport(objArr5, bVar, changeQuickRedirect5, false, "f28c6f4f48024b04ac76cfbba33dd37b", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, bVar, changeQuickRedirect5, false, "f28c6f4f48024b04ac76cfbba33dd37b");
                                } else if (bVar.h != null) {
                                    bVar.h.remove(aVar3);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class a {
        public static ChangeQuickRedirect a;
        public com.sankuai.waimai.irmo.mach.vap.a b;
        public com.sankuai.waimai.irmo.render.a c;
        public int d;
        public long e;
        public int f;
        Handler g;
        Runnable h;

        public a(com.sankuai.waimai.irmo.mach.vap.a aVar) {
            Object[] objArr = {VapByViewIdPlugin.this, aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b53d017b61ffcc9d9b3ec935ea168c80", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b53d017b61ffcc9d9b3ec935ea168c80");
                return;
            }
            this.d = 1;
            this.e = 0L;
            this.f = 0;
            this.g = new Handler();
            this.h = new Runnable() { // from class: com.sankuai.waimai.ad.interact.irmo.VapByViewIdPlugin.a.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1ae12f0e54cd99432ad7ec63e10a5f24", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1ae12f0e54cd99432ad7ec63e10a5f24");
                    } else if (a.this.b != null) {
                        a.this.b.e();
                    }
                }
            };
            this.b = aVar;
            if (this.b != null) {
                this.c = new com.sankuai.waimai.irmo.render.a() { // from class: com.sankuai.waimai.ad.interact.irmo.VapByViewIdPlugin.a.2
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.irmo.render.a
                    public final void a(@NonNull a.EnumC0973a enumC0973a, @Nullable Map<String, Object> map) {
                        Object[] objArr2 = {enumC0973a, map};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "07a89dd4f5be262f092a4bfb3d26ed7e", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "07a89dd4f5be262f092a4bfb3d26ed7e");
                        } else if (enumC0973a == a.EnumC0973a.effect_start) {
                            a.this.f++;
                        }
                    }
                };
                com.sankuai.waimai.irmo.mach.vap.a aVar2 = this.b;
                com.sankuai.waimai.irmo.render.a aVar3 = this.c;
                Object[] objArr2 = {aVar3};
                ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.irmo.mach.vap.a.a;
                if (PatchProxy.isSupport(objArr2, aVar2, changeQuickRedirect2, false, "491945b7514c7b5f8ce0402e9d8ea561", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, aVar2, changeQuickRedirect2, false, "491945b7514c7b5f8ce0402e9d8ea561");
                } else if (aVar2.c != null) {
                    c cVar = aVar2.c;
                    Object[] objArr3 = {aVar3};
                    ChangeQuickRedirect changeQuickRedirect3 = c.a;
                    if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "245bad8732ffe6bc475e5e21339bf084", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "245bad8732ffe6bc475e5e21339bf084");
                    } else if (cVar.b != null) {
                        b bVar = cVar.b;
                        Object[] objArr4 = {aVar3};
                        ChangeQuickRedirect changeQuickRedirect4 = b.b;
                        if (PatchProxy.isSupport(objArr4, bVar, changeQuickRedirect4, false, "ddd0e96db85ad18e15277c6458f1258f", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, bVar, changeQuickRedirect4, false, "ddd0e96db85ad18e15277c6458f1258f");
                            return;
                        }
                        if (bVar.h == null) {
                            bVar.h = new ArrayList();
                        }
                        bVar.h.add(aVar3);
                    }
                }
            }
        }

        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8ec8fad5d6483a68d127396a877ce37", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8ec8fad5d6483a68d127396a877ce37");
                return;
            }
            com.sankuai.waimai.foundation.utils.log.a.b("VapByViewIdPlugin", "try to stop effects delay, --%s", Integer.valueOf(hashCode()));
            this.g.removeCallbacks(this.h);
            if (this.b != null) {
                this.b.f();
            }
        }
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchPlugin
    public void onViewAttached(View view, com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {view, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dddf9af82a81091a0c181b7cca5fea89", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dddf9af82a81091a0c181b7cca5fea89");
        } else if (aVar != null) {
            if (aVar.f != null) {
                this.c = aVar.f.getMachBundle();
            }
            if (this.b != null) {
                this.b.clear();
            }
            com.sankuai.waimai.mach.node.a.a(aVar, new a.InterfaceC1019a() { // from class: com.sankuai.waimai.ad.interact.irmo.VapByViewIdPlugin.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.mach.node.a.InterfaceC1019a
                public final void a(com.sankuai.waimai.mach.node.a aVar2) {
                    Map map;
                    Object[] objArr2 = {aVar2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "444c10dfe04cdf92b498fde0b654d52e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "444c10dfe04cdf92b498fde0b654d52e");
                    } else if (aVar2 != null) {
                        try {
                            if (aVar2.h instanceof com.sankuai.waimai.irmo.mach.vap.a) {
                                com.sankuai.waimai.irmo.mach.vap.a aVar3 = (com.sankuai.waimai.irmo.mach.vap.a) aVar2.h;
                                String str = aVar3.b.d;
                                if (str == null || (map = (Map) k.a().fromJson(str, (Class<Object>) Map.class)) == null || !map.containsKey("viewId")) {
                                    return;
                                }
                                a aVar4 = new a(aVar3);
                                Object obj = map.get("viewId");
                                if (obj instanceof String) {
                                    VapByViewIdPlugin.this.b.put((String) obj, aVar4);
                                }
                                int i = -1;
                                if (map.containsKey("triggerTimes")) {
                                    Object obj2 = map.get("triggerTimes");
                                    if (!(obj2 instanceof String)) {
                                        VapByViewIdPlugin.this.a("triggerTimes", "triggerTimes type error");
                                    } else {
                                        try {
                                            i = Integer.parseInt((String) obj2);
                                        } catch (Exception e) {
                                            VapByViewIdPlugin.this.a("triggerTimes", e.getMessage());
                                        }
                                    }
                                }
                                aVar4.d = i;
                                long j = 0;
                                if (map.containsKey("triggerDelay")) {
                                    Object obj3 = map.get("triggerDelay");
                                    if (!(obj3 instanceof String)) {
                                        VapByViewIdPlugin.this.a("triggerDelay", "triggerDelay type error");
                                    } else {
                                        try {
                                            j = Long.parseLong((String) obj3);
                                        } catch (Exception e2) {
                                            VapByViewIdPlugin.this.a("triggerDelay", e2.getMessage());
                                        }
                                    }
                                }
                                aVar4.e = j;
                            }
                        } catch (Exception e3) {
                            VapByViewIdPlugin.this.a("iterate fail", e3.getMessage());
                        }
                    }
                }
            });
        }
    }
}
