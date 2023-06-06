package com.sankuai.waimai.ad.interact.irmo;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.ArrayMap;
import android.view.View;
import com.alipay.sdk.app.PayTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.irmo.render.WMIrmoView;
import com.sankuai.waimai.irmo.render.a;
import com.sankuai.waimai.irmo.render.c;
import com.sankuai.waimai.irmo.render.f;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.mach.node.a;
import com.sankuai.waimai.pouch.monitor.d;
import com.sankuai.waimai.pouch.monitor.e;
import com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchInteractPlugin;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class IrmoEffectByCategoryIDPlugin extends AbsWMPouchInteractPlugin {
    public static ChangeQuickRedirect a;
    private ArrayMap<String, List<WMIrmoView>> b;
    private List<c> c;
    private int d;
    private boolean e;
    private Handler f;
    private View g;
    private Mach h;
    private Runnable i;

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

    public IrmoEffectByCategoryIDPlugin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fbf8f9cce1dc7143c03b8921ef1467d2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fbf8f9cce1dc7143c03b8921ef1467d2");
            return;
        }
        this.b = new ArrayMap<>();
        this.c = new ArrayList();
        this.d = 0;
        this.e = false;
        this.f = new Handler(Looper.getMainLooper());
    }

    public static /* synthetic */ int a(IrmoEffectByCategoryIDPlugin irmoEffectByCategoryIDPlugin, int i) {
        irmoEffectByCategoryIDPlugin.d = 0;
        return 0;
    }

    public static /* synthetic */ boolean a(IrmoEffectByCategoryIDPlugin irmoEffectByCategoryIDPlugin, boolean z) {
        irmoEffectByCategoryIDPlugin.e = false;
        return false;
    }

    public static /* synthetic */ int b(IrmoEffectByCategoryIDPlugin irmoEffectByCategoryIDPlugin) {
        int i = irmoEffectByCategoryIDPlugin.d + 1;
        irmoEffectByCategoryIDPlugin.d = i;
        return i;
    }

    private void g() {
        Map map;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be3a8a4bbea651e36b38fe98d98a965b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be3a8a4bbea651e36b38fe98d98a965b");
            return;
        }
        if (this.b != null) {
            this.b.clear();
        }
        for (c cVar : this.c) {
            WMIrmoView wMIrmoView = (WMIrmoView) cVar.o;
            if (wMIrmoView != null && wMIrmoView.getMachAttr() != null && (map = wMIrmoView.getMachAttr().d) != null && map.containsKey("view-id")) {
                Object obj = map.get("view-id");
                if (obj instanceof String) {
                    try {
                        String str = (String) obj;
                        List<WMIrmoView> list = this.b.get(str);
                        if (list != null) {
                            list.add(wMIrmoView);
                        } else {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(wMIrmoView);
                            this.b.put(str, arrayList);
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class a {
        public String a;
        public Map b;

        public a(String str, Map map) {
            this.a = str;
            this.b = map;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final List<a> list, final String str) {
        Object[] objArr = {list, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e8244f962e755527337807de39137cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e8244f962e755527337807de39137cb");
            return;
        }
        final int[] iArr = {0};
        a aVar = list.get(this.d);
        final boolean[] zArr = {false};
        if (aVar != null && aVar.a != null) {
            final List<WMIrmoView> list2 = this.b.get(aVar.a);
            if (list2 == null || list2.isEmpty()) {
                return;
            }
            for (WMIrmoView wMIrmoView : list2) {
                if (wMIrmoView != null) {
                    wMIrmoView.a(new com.sankuai.waimai.irmo.render.a() { // from class: com.sankuai.waimai.ad.interact.irmo.IrmoEffectByCategoryIDPlugin.2
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.irmo.render.a
                        public final void a(@NonNull a.EnumC0973a enumC0973a, @Nullable Map<String, Object> map) {
                            Object[] objArr2 = {enumC0973a, map};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "135c924e702c30f8cee57a2e0c419e33", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "135c924e702c30f8cee57a2e0c419e33");
                            } else if (enumC0973a == a.EnumC0973a.effect_finished && !zArr[0]) {
                                int[] iArr2 = iArr;
                                iArr2[0] = iArr2[0] + 1;
                                if (iArr[0] == list2.size()) {
                                    if (IrmoEffectByCategoryIDPlugin.b(IrmoEffectByCategoryIDPlugin.this) < list.size()) {
                                        com.sankuai.waimai.foundation.utils.log.a.b("IrmoEffectByCategoryIDPlugin", "This category finished, go to next traverse.", new Object[0]);
                                        IrmoEffectByCategoryIDPlugin.this.a(list, str);
                                        return;
                                    }
                                    com.sankuai.waimai.foundation.utils.log.a.b("IrmoEffectByCategoryIDPlugin", "All categories finished.", new Object[0]);
                                    IrmoEffectByCategoryIDPlugin.a(IrmoEffectByCategoryIDPlugin.this, false);
                                    if (aa.a(str) || IrmoEffectByCategoryIDPlugin.this.h == null) {
                                        return;
                                    }
                                    HashMap hashMap = new HashMap();
                                    hashMap.put("notify_id", str);
                                    IrmoEffectByCategoryIDPlugin.this.h.sendJsEvent("effect_finished", hashMap);
                                }
                            } else if (enumC0973a == a.EnumC0973a.effect_failed || enumC0973a == a.EnumC0973a.effect_cancel) {
                                IrmoEffectByCategoryIDPlugin.a(IrmoEffectByCategoryIDPlugin.this, false);
                                IrmoEffectByCategoryIDPlugin.a(IrmoEffectByCategoryIDPlugin.this, 0);
                            }
                        }
                    });
                    f machAttr = wMIrmoView.getMachAttr();
                    if (machAttr != null && machAttr.d != null && machAttr.d.containsKey("view-node-id")) {
                        Object obj = machAttr.d.get("view-node-id");
                        Map map = aVar.b;
                        if ((obj instanceof String) && map != null) {
                            Object obj2 = map.get((String) obj);
                            if (obj2 instanceof String) {
                                String str2 = (String) obj2;
                                wMIrmoView.a(!str2.startsWith("http"), str2);
                                wMIrmoView.a();
                            }
                        }
                    }
                    wMIrmoView.a();
                }
            }
            this.i = new Runnable() { // from class: com.sankuai.waimai.ad.interact.irmo.IrmoEffectByCategoryIDPlugin.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "73670025e7f0b5594db9b60d2862be0c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "73670025e7f0b5594db9b60d2862be0c");
                    } else if (iArr[0] < list2.size()) {
                        com.sankuai.waimai.foundation.utils.log.a.d("IrmoEffectByCategoryIDPlugin", "Timeout, go to next traverse.", new Object[0]);
                        zArr[0] = true;
                        if (IrmoEffectByCategoryIDPlugin.b(IrmoEffectByCategoryIDPlugin.this) < list.size()) {
                            IrmoEffectByCategoryIDPlugin.this.a(list, str);
                        } else {
                            IrmoEffectByCategoryIDPlugin.a(IrmoEffectByCategoryIDPlugin.this, false);
                        }
                        try {
                            a aVar2 = (a) list.get(IrmoEffectByCategoryIDPlugin.this.d);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("viewID", aVar2.a);
                            jSONObject.put("dslMap", String.valueOf(aVar2.b));
                            HashMap hashMap = new HashMap();
                            hashMap.put("viewID", aVar2.a);
                            hashMap.put("dslMap", String.valueOf(aVar2.b));
                            e.a(new d().a("IrmoEffectByCategoryIDPlugin").b("irmoEffecttTimeOut").d(jSONObject.toString()).a(true).b(), hashMap);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            };
            this.f.postDelayed(this.i, PayTask.j);
            return;
        }
        this.e = false;
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchPlugin
    public void onReceiveJSEvent(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da08acff94855c89dbf332df1f500adb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da08acff94855c89dbf332df1f500adb");
        } else if ("start-irmo-effect".equals(str) && !this.e) {
            g();
            Rect rect = (this.pluginParams == 0 || ((com.sankuai.waimai.pouch.plugin.params.a) this.pluginParams).c == null) ? null : ((com.sankuai.waimai.pouch.plugin.params.a) this.pluginParams).c.i;
            if (this.g != null && rect == null) {
                rect = new Rect(0, 0, this.g.getContext().getResources().getDisplayMetrics().widthPixels, this.g.getContext().getResources().getDisplayMetrics().heightPixels);
            }
            if (ah.a(this.g, rect)) {
                ArrayList arrayList = new ArrayList();
                if (map.get("identifier") instanceof List) {
                    for (Object obj : (List) map.get("identifier")) {
                        if (obj instanceof String) {
                            arrayList.add(new a((String) obj, null));
                        }
                    }
                } else if (map.get("view_id_dsl_list") instanceof List) {
                    for (Object obj2 : (List) map.get("view_id_dsl_list")) {
                        if (obj2 instanceof Map) {
                            try {
                                Map map2 = (Map) obj2;
                                if ((map2.get("view_id") instanceof String) && (map2.get("dsl_map") instanceof Map)) {
                                    arrayList.add(new a((String) map2.get("view_id"), (Map) map2.get("dsl_map")));
                                }
                            } catch (Exception unused) {
                                com.sankuai.waimai.foundation.utils.log.a.b("IrmoEffectByCategoryIDPlugin", "", new Object[0]);
                            }
                        }
                    }
                }
                String str2 = map.get("notify_id") instanceof String ? (String) map.get("notify_id") : "";
                if (arrayList.isEmpty()) {
                    return;
                }
                this.d = 0;
                this.e = true;
                a(arrayList, str2);
            }
        } else if ("stop-irmo-effect".equals(str)) {
            g();
            h();
        }
    }

    private void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac95c1ce5b22b14d013a639a9488ff33", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac95c1ce5b22b14d013a639a9488ff33");
            return;
        }
        if (this.b != null) {
            for (List<WMIrmoView> list : this.b.values()) {
                if (list != null) {
                    for (WMIrmoView wMIrmoView : list) {
                        if (wMIrmoView != null) {
                            wMIrmoView.b();
                            if (wMIrmoView.getPlayStateListener() != null) {
                                wMIrmoView.getPlayStateListener().clear();
                            }
                        }
                    }
                }
            }
        }
        if (this.i != null) {
            this.f.removeCallbacks(this.i);
        }
        this.e = false;
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchPlugin
    public void onDetachedFromContainer() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eab1de9e6910b0bfeb1ef8333fafa310", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eab1de9e6910b0bfeb1ef8333fafa310");
            return;
        }
        super.onDetachedFromContainer();
        com.sankuai.waimai.foundation.utils.log.a.b("IrmoEffectByCategoryIDPlugin", "onDetachedFromContainer", new Object[0]);
        h();
        if (this.b != null) {
            this.b.clear();
        }
        if (this.c != null) {
            this.c.clear();
        }
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchPlugin
    public void onViewAttached(View view, com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {view, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1adf7171267b4028e6e3da4c5bd4636", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1adf7171267b4028e6e3da4c5bd4636");
        } else if (aVar != null) {
            this.h = aVar.f;
            this.g = view;
            if (this.b != null) {
                this.b.clear();
            }
            com.sankuai.waimai.mach.node.a.a(aVar, new a.InterfaceC1019a() { // from class: com.sankuai.waimai.ad.interact.irmo.IrmoEffectByCategoryIDPlugin.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.mach.node.a.InterfaceC1019a
                public final void a(com.sankuai.waimai.mach.node.a aVar2) {
                    Object[] objArr2 = {aVar2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "75dab2cd0c15e4366799f482737f76f8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "75dab2cd0c15e4366799f482737f76f8");
                    } else if (aVar2 == null || !(aVar2.h instanceof c)) {
                    } else {
                        IrmoEffectByCategoryIDPlugin.this.c.add((c) aVar2.h);
                    }
                }
            });
        }
    }
}
