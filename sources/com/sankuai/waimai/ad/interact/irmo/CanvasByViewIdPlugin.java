package com.sankuai.waimai.ad.interact.irmo;

import android.arch.lifecycle.l;
import android.os.Handler;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Pair;
import android.view.View;
import com.meituan.android.ptcommonim.protocol.message.PTIMMessageBeanEntity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.irmo.canvas.mach.b;
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
public class CanvasByViewIdPlugin extends AbsWMPouchInteractPlugin {
    public static ChangeQuickRedirect a;
    private ArrayMap<String, a> b;
    private e c;
    private l<Pair<String, Map<String, Object>>> d;

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

    public CanvasByViewIdPlugin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6061193958b6388e662ff3d5f21850f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6061193958b6388e662ff3d5f21850f");
            return;
        }
        this.capabilityID = "infinite-canvas-by-view-id";
        this.b = new ArrayMap<>();
        this.d = new l<Pair<String, Map<String, Object>>>() { // from class: com.sankuai.waimai.ad.interact.irmo.CanvasByViewIdPlugin.1
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(Pair<String, Map<String, Object>> pair) {
                Pair<String, Map<String, Object>> pair2 = pair;
                Object[] objArr2 = {pair2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "548d2c511223c7001f61f7d713d0745c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "548d2c511223c7001f61f7d713d0745c");
                } else if (pair2 != null) {
                    com.sankuai.waimai.foundation.utils.log.a.b("CanvasByViewIdPlugin", "onChanged, %s", pair2.toString());
                    if (!"startRefresh".equals(pair2.first) || CanvasByViewIdPlugin.this.b == null || CanvasByViewIdPlugin.this.b.values() == null || CanvasByViewIdPlugin.this.b.values().isEmpty()) {
                        return;
                    }
                    for (a aVar : CanvasByViewIdPlugin.this.b.values()) {
                        aVar.a();
                    }
                }
            }
        };
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchPlugin
    public void onReceiveJSEvent(String str, Map<String, Object> map) {
        List list;
        a aVar;
        List list2;
        a aVar2;
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64d934c2bf557e4a6ccd02c0771fb827", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64d934c2bf557e4a6ccd02c0771fb827");
        } else if ("start-infinite-canvas-effect".equals(str)) {
            try {
                Object a2 = com.sankuai.waimai.pouch.util.a.a(map, "view_id_array");
                if (!(a2 instanceof List) || (list = (List) a2) == null) {
                    return;
                }
                for (Object obj : list) {
                    if ((obj instanceof String) && (aVar = (a) com.sankuai.waimai.pouch.util.a.a(this.b, (String) obj)) != null) {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a.a;
                        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "9dd40c39baab5eba67d55f887e446396", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "9dd40c39baab5eba67d55f887e446396");
                        } else if (aVar.e < aVar.c || aVar.c < 0) {
                            if (aVar.d == 0) {
                                if (aVar.b != null) {
                                    aVar.b.g();
                                    aVar.b.e();
                                    aVar.e++;
                                    com.sankuai.waimai.foundation.utils.log.a.b("CanvasByViewIdPlugin", "try to play effects, --%s", Integer.valueOf(aVar.hashCode()));
                                }
                            } else {
                                aVar.f.removeCallbacks(aVar.g);
                                aVar.f.postDelayed(aVar.g, aVar.d);
                            }
                        }
                    }
                }
            } catch (Exception e) {
                a("start canvas effect fail", e.getMessage());
            }
        } else if ("stop-infinite-canvas-effect".equals(str)) {
            try {
                Object a3 = com.sankuai.waimai.pouch.util.a.a(map, "view_id_array");
                if (!(a3 instanceof List) || (list2 = (List) a3) == null) {
                    return;
                }
                for (Object obj2 : list2) {
                    if ((obj2 instanceof String) && (aVar2 = (a) com.sankuai.waimai.pouch.util.a.a(this.b, (String) obj2)) != null) {
                        aVar2.a();
                    }
                }
            } catch (Exception e2) {
                a("stop canvas effect fail", e2.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe0e61b6ce60da1a21e64dd446271103", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe0e61b6ce60da1a21e64dd446271103");
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
            com.sankuai.waimai.pouch.monitor.e.a(new d().a(!TextUtils.isEmpty(this.capabilityID) ? this.capabilityID : "infinite-canvas-by-view-id").b(str).d(jSONObject.toString()).a(true).b(), hashMap);
        } catch (Exception unused) {
        }
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchPlugin
    public void reset() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "701d65d840759be99d20592694549824", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "701d65d840759be99d20592694549824");
            return;
        }
        if (this.b != null && this.b.values() != null && !this.b.values().isEmpty()) {
            for (a aVar : this.b.values()) {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a.a;
                if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "340f54b50923e5f738748404615d86f9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "340f54b50923e5f738748404615d86f9");
                } else {
                    aVar.a();
                    if (aVar.b != null) {
                        b bVar = aVar.b;
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = b.a;
                        if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "78860ce45e642b626f32eb0d9ff2af40", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "78860ce45e642b626f32eb0d9ff2af40");
                        } else {
                            com.sankuai.waimai.irmo.utils.d.a("Java inf_canvas_log: MachCanvasComponent destroy() ", new Object[0]);
                            if (bVar.o != 0) {
                                ((com.sankuai.waimai.irmo.canvas.mach.a) bVar.o).a();
                            }
                        }
                    }
                }
            }
        }
        if (this.pluginParams == 0 || ((com.sankuai.waimai.pouch.plugin.params.a) this.pluginParams).b == null) {
            return;
        }
        com.sankuai.waimai.pouch.a aVar2 = ((com.sankuai.waimai.pouch.plugin.params.a) this.pluginParams).b;
        l<Pair<String, Map<String, Object>>> lVar = this.d;
        Object[] objArr4 = {lVar};
        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.pouch.a.a;
        if (PatchProxy.isSupport(objArr4, aVar2, changeQuickRedirect4, false, "1fbfcff74c6511a2e0bba92c0f502832", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, aVar2, changeQuickRedirect4, false, "1fbfcff74c6511a2e0bba92c0f502832");
        } else if (aVar2.o != null && !aVar2.o.isEmpty()) {
            aVar2.o.remove(lVar);
        }
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchPlugin
    public void onDetachedFromContainer() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5e459699161de15b8693cb00dec8f71", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5e459699161de15b8693cb00dec8f71");
            return;
        }
        super.onDetachedFromContainer();
        reset();
        if (this.b != null) {
            this.b.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class a {
        public static ChangeQuickRedirect a;
        public b b;
        public int c;
        public long d;
        public int e;
        Handler f;
        Runnable g;

        public a(b bVar) {
            Object[] objArr = {CanvasByViewIdPlugin.this, bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c9f65a29753174be721dac7ec49a33e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c9f65a29753174be721dac7ec49a33e");
                return;
            }
            this.c = 1;
            this.d = 0L;
            this.e = 0;
            this.f = new Handler();
            this.g = new Runnable() { // from class: com.sankuai.waimai.ad.interact.irmo.CanvasByViewIdPlugin.a.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "34539eedfac54c5f48add5b4ae6db8c6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "34539eedfac54c5f48add5b4ae6db8c6");
                    } else if (a.this.b != null) {
                        a.this.b.g();
                        a.this.b.e();
                        com.sankuai.waimai.foundation.utils.log.a.b("CanvasByViewIdPlugin", "try to play effects delay, --%s", Integer.valueOf(a.this.hashCode()));
                        a.this.e++;
                    }
                }
            };
            this.b = bVar;
        }

        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca6111d91eea71a87889201baf81461c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca6111d91eea71a87889201baf81461c");
                return;
            }
            com.sankuai.waimai.foundation.utils.log.a.b("CanvasByViewIdPlugin", "try to stop effects delay, --%s", Integer.valueOf(hashCode()));
            this.f.removeCallbacks(this.g);
            if (this.b != null) {
                this.b.f();
                this.b.h();
            }
        }
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchPlugin
    public void onViewAttached(View view, com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {view, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52ee6496897df7590a5e33b395edef96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52ee6496897df7590a5e33b395edef96");
        } else if (aVar != null) {
            if (aVar.f != null) {
                this.c = aVar.f.getMachBundle();
            }
            if (this.pluginParams != 0 && ((com.sankuai.waimai.pouch.plugin.params.a) this.pluginParams).b != null) {
                com.sankuai.waimai.pouch.a aVar2 = ((com.sankuai.waimai.pouch.plugin.params.a) this.pluginParams).b;
                l<Pair<String, Map<String, Object>>> lVar = this.d;
                Object[] objArr2 = {lVar};
                ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.pouch.a.a;
                if (PatchProxy.isSupport(objArr2, aVar2, changeQuickRedirect2, false, "39846c913a6f560eb0cf56c799727fdf", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, aVar2, changeQuickRedirect2, false, "39846c913a6f560eb0cf56c799727fdf");
                } else {
                    if (aVar2.o == null) {
                        aVar2.o = new ArrayList<>();
                    }
                    if (lVar != null) {
                        aVar2.o.add(lVar);
                    }
                }
            }
            if (this.b != null) {
                this.b.clear();
            }
            com.sankuai.waimai.mach.node.a.a(aVar, new a.InterfaceC1019a() { // from class: com.sankuai.waimai.ad.interact.irmo.CanvasByViewIdPlugin.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.mach.node.a.InterfaceC1019a
                public final void a(com.sankuai.waimai.mach.node.a aVar3) {
                    Object[] objArr3 = {aVar3};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "bac62df38f809e059eb5249a2cb630f6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "bac62df38f809e059eb5249a2cb630f6");
                    } else if (aVar3 != null) {
                        try {
                            if (aVar3.h instanceof b) {
                                b bVar = (b) aVar3.h;
                                Map i = bVar.i();
                                if (com.sankuai.waimai.pouch.util.a.a(i, "viewId") == null) {
                                    return;
                                }
                                a aVar4 = new a(bVar);
                                Object a2 = com.sankuai.waimai.pouch.util.a.a(i, "viewId");
                                if (a2 instanceof String) {
                                    CanvasByViewIdPlugin.this.b.put((String) a2, aVar4);
                                }
                                int i2 = -1;
                                Object a3 = com.sankuai.waimai.pouch.util.a.a(i, "triggerTimes");
                                if (!(a3 instanceof String)) {
                                    CanvasByViewIdPlugin.this.a("triggerTimes", "triggerTimes type error");
                                } else {
                                    try {
                                        i2 = Integer.parseInt((String) a3);
                                    } catch (Exception e) {
                                        CanvasByViewIdPlugin.this.a("triggerTimes", e.getMessage());
                                    }
                                }
                                aVar4.c = i2;
                                long j = 0;
                                Object a4 = com.sankuai.waimai.pouch.util.a.a(i, "triggerDelay");
                                if (!(a4 instanceof String)) {
                                    CanvasByViewIdPlugin.this.a("triggerDelay", "triggerDelay type error");
                                } else {
                                    try {
                                        j = Long.parseLong((String) a4);
                                    } catch (Exception e2) {
                                        CanvasByViewIdPlugin.this.a("triggerDelay", e2.getMessage());
                                    }
                                }
                                aVar4.d = j;
                            }
                        } catch (Exception e3) {
                            CanvasByViewIdPlugin.this.a("iterate fail", e3.getMessage());
                        }
                    }
                }
            });
        }
    }
}
