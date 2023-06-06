package com.sankuai.eh.component.web.plugins;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Build;
import android.view.View;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.tools.d;
import com.sankuai.eh.component.service.utils.b;
import com.sankuai.eh.component.web.chain.f;
import com.sankuai.eh.plugins.detector.a;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class g extends b {
    public static ChangeQuickRedirect a;
    public JsonElement b;
    private com.sankuai.eh.plugins.detector.a f;
    private String g;
    private String h;
    private long i;

    @Override // com.sankuai.eh.component.web.plugins.e
    public final String a() {
        return "00";
    }

    @Override // com.sankuai.eh.component.web.plugins.e
    public final String b() {
        return "monitor";
    }

    public static /* synthetic */ Object a(g gVar, Map map, Object obj, Object obj2) {
        Object[] objArr = {map, obj, obj2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, gVar, changeQuickRedirect, false, "19e2228a826bd8d5cd8673fbb86fefb8", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, gVar, changeQuickRedirect, false, "19e2228a826bd8d5cd8673fbb86fefb8");
        }
        Object obj3 = map.get(obj);
        return (obj3 != null || map.containsKey(obj)) ? obj3 : obj2;
    }

    @Override // com.sankuai.eh.component.web.plugins.b
    public final JsonElement d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e30ed283eebf2cbec931ee84c2fa82dc", RobustBitConfig.DEFAULT_VALUE) ? (JsonElement) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e30ed283eebf2cbec931ee84c2fa82dc") : com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.database.d.b("monitor", this.b), "whiteScreen");
    }

    @Override // com.sankuai.eh.component.web.plugins.b
    public final JsonElement Y_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb45d042e098709abeff762e6ad0194a", RobustBitConfig.DEFAULT_VALUE) ? (JsonElement) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb45d042e098709abeff762e6ad0194a") : com.sankuai.eh.component.service.database.d.a("monitor", com.sankuai.eh.component.service.utils.b.c(this.e.e, "data"));
    }

    @Override // com.sankuai.eh.component.web.plugins.e
    public final String[] c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3980d246a8a49a2cb36d51fb5b4c1b80", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3980d246a8a49a2cb36d51fb5b4c1b80") : new String[]{"onModuleStart", "onPageClose", "onModuleClose"};
    }

    @Override // com.sankuai.eh.component.web.plugins.b, com.sankuai.eh.component.web.plugins.e
    public final void a(com.sankuai.eh.component.web.module.c cVar) {
        String str;
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95b2166737a3f61a447d3c13edea7e74", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95b2166737a3f61a447d3c13edea7e74");
            return;
        }
        super.a(cVar);
        this.b = com.sankuai.eh.component.service.utils.b.a(this.e.e, "data");
        Object[] objArr2 = {"whiteScreen"};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f336ad26e69463a34325cc9628839c30", RobustBitConfig.DEFAULT_VALUE)) {
            str = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f336ad26e69463a34325cc9628839c30");
        } else if (this.e != null) {
            str = com.sankuai.eh.component.service.utils.f.a("whiteScreen", (String) this.e.d("scopeKey", "unknown"), (String) this.e.d("pageKey", "unknown"));
        } else {
            str = "whiteScreen.unknown";
        }
        this.g = str;
        this.h = com.sankuai.eh.component.service.utils.f.a(cVar.i);
    }

    @Override // com.sankuai.eh.component.web.plugins.e
    public final void a(com.sankuai.eh.component.web.plugins.api.a aVar) {
        final boolean z;
        Bitmap bitmap;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "010dcc8fb485eba666880e35ef08ca85", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "010dcc8fb485eba666880e35ef08ca85");
            return;
        }
        String a2 = aVar.a();
        char c = 65535;
        int hashCode = a2.hashCode();
        if (hashCode != -726803977) {
            if (hashCode == 827001226 && a2.equals("onPageClose")) {
                c = 1;
            }
        } else if (a2.equals("onModuleStart")) {
            c = 0;
        }
        switch (c) {
            case 0:
                this.i = System.currentTimeMillis();
                com.sankuai.eh.component.web.module.h hVar = this.e;
                Object[] objArr2 = {hVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                this.f = new com.sankuai.eh.plugins.detector.a(PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "949ed4f6d99fb431968c4492e8114b6b", RobustBitConfig.DEFAULT_VALUE) ? (JsonElement) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "949ed4f6d99fb431968c4492e8114b6b") : new b.a().a("data", d()).a("url", new JsonPrimitive(hVar.b)).a("catKey", new JsonPrimitive(this.g)).b, this.d.a());
                return;
            case 1:
                if ("finish".equals(aVar.b())) {
                    final String str = this.e.b;
                    final Map<String, Object> map = this.e.i;
                    final Map<String, Object> a3 = this.d.a();
                    com.sankuai.eh.component.web.module.h hVar2 = this.e;
                    Object[] objArr3 = {hVar2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9386d032ea78d25d61962de9fa39e614", RobustBitConfig.DEFAULT_VALUE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9386d032ea78d25d61962de9fa39e614")).booleanValue();
                    } else {
                        z = ((Boolean) hVar2.d("callshow", Boolean.FALSE)).booleanValue() || (((Boolean) hVar2.d("autoshow", Boolean.FALSE)).booleanValue() && ((Boolean) hVar2.b("load", Boolean.FALSE)).booleanValue());
                    }
                    if (this.f != null) {
                        a(new d.b().a("plugin", "whiteScreen").b);
                        View view = this.d.k != null ? this.d.k : this.d.l;
                        com.sankuai.eh.plugins.detector.a aVar2 = this.f;
                        a.InterfaceC0560a interfaceC0560a = new a.InterfaceC0560a() { // from class: com.sankuai.eh.component.web.plugins.g.1
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.eh.plugins.detector.a.InterfaceC0560a
                            public final void a(float f, boolean z2, long j) {
                                Object[] objArr4 = {Float.valueOf(f), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), new Long(j)};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "6aa57dd0f6dc3dc1471fa0192505479d", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "6aa57dd0f6dc3dc1471fa0192505479d");
                                    return;
                                }
                                g.this.b(new d.b().a("plugin", "whiteScreen").a("status", Boolean.TRUE).a("type", "close").a("isWhite", Boolean.valueOf(z2)).a("monitorCost", Long.valueOf(j)).a("load", g.a(g.this, map, "callshow", Boolean.FALSE)).a("ehShow", Boolean.valueOf(z)).a("value", Long.valueOf(com.sankuai.eh.component.service.utils.f.a(g.this.i))).a(a3).b);
                                if (com.sankuai.eh.component.web.chain.f.a()) {
                                    int a4 = com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.a(g.this.e.e, "data", "timeout", "recorder"), 3000);
                                    if (z2 && com.sankuai.eh.component.service.utils.f.a(g.this.i) > a4) {
                                        com.sankuai.eh.component.web.chain.f.a(g.this.h, str);
                                    }
                                    com.sankuai.eh.component.web.chain.f.b(g.this.h, f.a.CUSTOM_WHITE.j, new b.a().a("isWhite", z2).a("result", Float.toString(f)).b);
                                }
                            }
                        };
                        Object[] objArr4 = {view, interfaceC0560a};
                        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.eh.plugins.detector.a.a;
                        if (PatchProxy.isSupport(objArr4, aVar2, changeQuickRedirect4, false, "113fec40432133ad3789e802041d52af", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, aVar2, changeQuickRedirect4, false, "113fec40432133ad3789e802041d52af");
                            return;
                        }
                        aVar2.e = interfaceC0560a;
                        long currentTimeMillis = System.currentTimeMillis();
                        Object[] objArr5 = {view};
                        ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.eh.plugins.detector.a.a;
                        if (PatchProxy.isSupport(objArr5, aVar2, changeQuickRedirect5, false, "61a7ff20ad7a633293ea74509d8cf4c4", RobustBitConfig.DEFAULT_VALUE)) {
                            bitmap = (Bitmap) PatchProxy.accessDispatch(objArr5, aVar2, changeQuickRedirect5, false, "61a7ff20ad7a633293ea74509d8cf4c4");
                        } else {
                            bitmap = null;
                            if (view != null && view.getWidth() > 0 && view.getHeight() > 0) {
                                if (Build.VERSION.SDK_INT < 26) {
                                    aVar2.b = 4;
                                }
                                float f = 1.0f / aVar2.b;
                                Bitmap createBitmap = Bitmap.createBitmap((int) (view.getWidth() * f), (int) (view.getHeight() * f), Bitmap.Config.ARGB_8888);
                                Canvas canvas = new Canvas(createBitmap);
                                canvas.scale(f, f);
                                view.draw(canvas);
                                canvas.setBitmap(null);
                                bitmap = createBitmap;
                            }
                            if (bitmap == null) {
                                bitmap = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888);
                            }
                        }
                        aVar2.d = bitmap;
                        aVar2.c = System.currentTimeMillis() - currentTimeMillis;
                        aVar2.a(11);
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }
}
