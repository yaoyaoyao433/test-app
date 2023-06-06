package com.sankuai.eh.component.web.chain;

import android.text.TextUtils;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.meituan.hotel.android.hplus.diagnoseTool.DiagnoseLog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.utils.b;
import com.sankuai.eh.component.web.chain.e;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b extends com.sankuai.eh.component.web.plugins.b {
    public static ChangeQuickRedirect a;
    public JsonArray b;
    private e.a f;
    private JsonObject g;
    private long h;
    private boolean i;
    private boolean j;

    @Override // com.sankuai.eh.component.web.plugins.e
    public final String a() {
        return "10";
    }

    @Override // com.sankuai.eh.component.web.plugins.e
    public final String b() {
        return "page_recorder";
    }

    @Override // com.sankuai.eh.component.web.plugins.b, com.sankuai.eh.component.web.plugins.e
    public final void a(com.sankuai.eh.component.web.module.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35eae54178cf0ef0b33f03690336bea9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35eae54178cf0ef0b33f03690336bea9");
            return;
        }
        super.a(cVar);
        this.f = new e.a();
        this.g = new JsonObject();
        this.b = new JsonArray();
    }

    @Override // com.sankuai.eh.component.web.plugins.e
    public final String[] c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3bbfff666d17da37c66f5bde5157f9dd", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3bbfff666d17da37c66f5bde5157f9dd") : new String[]{"onPageStart", "onOverrideLoad", "onPageLoad", "onKNBJSCall", "onConsoleMsg", "onUpdateHistory", "onPageClose"};
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.sankuai.eh.component.web.plugins.e
    public final void a(com.sankuai.eh.component.web.plugins.api.a aVar) {
        char c;
        String sb;
        String optString;
        boolean z = false;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "010bf60a02b2263c35ef71e422c5907e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "010bf60a02b2263c35ef71e422c5907e");
            return;
        }
        String a2 = aVar.a();
        switch (a2.hashCode()) {
            case -1293347351:
                if (a2.equals("onConsoleMsg")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1011630009:
                if (a2.equals("onKNBJSCall")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -665788652:
                if (a2.equals("onPageLoad")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 287597548:
                if (a2.equals("onUpdateHistory")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 827001226:
                if (a2.equals("onPageClose")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 842002420:
                if (a2.equals("onPageStart")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                this.h = System.currentTimeMillis();
                e.a aVar2 = this.f;
                String str = this.e.b;
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = e.a.a;
                if (PatchProxy.isSupport(objArr2, aVar2, changeQuickRedirect2, false, "96b2723f1f37b6ed4ff8fe1d8615ff10", RobustBitConfig.DEFAULT_VALUE)) {
                    e.a aVar3 = (e.a) PatchProxy.accessDispatch(objArr2, aVar2, changeQuickRedirect2, false, "96b2723f1f37b6ed4ff8fe1d8615ff10");
                } else {
                    aVar2.b.c = str;
                }
                e.a aVar4 = this.f;
                com.sankuai.eh.component.web.module.c cVar = this.d;
                Object obj = "unknown";
                Object[] objArr3 = {"pattern", "unknown"};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.eh.component.web.module.c.a;
                if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "c747708759331fd2dfb3796f2a80d2d7", RobustBitConfig.DEFAULT_VALUE)) {
                    obj = PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "c747708759331fd2dfb3796f2a80d2d7");
                } else if (cVar.f != null) {
                    obj = cVar.f.b("pattern", "unknown");
                }
                String str2 = (String) obj;
                Object[] objArr4 = {str2};
                ChangeQuickRedirect changeQuickRedirect4 = e.a.a;
                if (PatchProxy.isSupport(objArr4, aVar4, changeQuickRedirect4, false, "0ffb71de192c5eafdfef51ea03156a23", RobustBitConfig.DEFAULT_VALUE)) {
                    e.a aVar5 = (e.a) PatchProxy.accessDispatch(objArr4, aVar4, changeQuickRedirect4, false, "0ffb71de192c5eafdfef51ea03156a23");
                } else {
                    aVar4.b.d = str2;
                }
                c.a(this.e.b, this.f.b);
                this.g.add("t", new JsonPrimitive(com.sankuai.eh.component.service.utils.d.c()));
                this.g.add("type", new JsonPrimitive("h5"));
                this.g.add("url", new JsonPrimitive(this.e.b));
                this.g.add("msg", this.b);
                a(DiagnoseLog.H5, "pageStart");
                com.sankuai.eh.component.web.module.h hVar = this.e;
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.eh.component.web.module.h.a;
                if (PatchProxy.isSupport(objArr5, hVar, changeQuickRedirect5, false, "fde48276a27677747f748093d8befb5c", RobustBitConfig.DEFAULT_VALUE)) {
                    sb = (String) PatchProxy.accessDispatch(objArr5, hVar, changeQuickRedirect5, false, "fde48276a27677747f748093d8befb5c");
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    Iterator<com.sankuai.eh.component.web.plugins.e> it = hVar.f.iterator();
                    while (it.hasNext()) {
                        sb2.append(it.next().getClass().getSimpleName() + ", ");
                    }
                    Iterator<com.sankuai.eh.component.web.plugins.e> it2 = hVar.g.iterator();
                    while (it2.hasNext()) {
                        sb2.append(it2.next().getClass().getSimpleName() + ", ");
                    }
                    sb = sb2.toString();
                }
                a("plugin", sb);
                return;
            case 1:
                this.j = true;
                e.a aVar6 = this.f;
                long a3 = com.sankuai.eh.component.service.utils.f.a(this.h);
                Object[] objArr6 = {new Long(a3)};
                ChangeQuickRedirect changeQuickRedirect6 = e.a.a;
                if (PatchProxy.isSupport(objArr6, aVar6, changeQuickRedirect6, false, "9381d562e2b1ed8270541c4e3722298a", RobustBitConfig.DEFAULT_VALUE)) {
                    e.a aVar7 = (e.a) PatchProxy.accessDispatch(objArr6, aVar6, changeQuickRedirect6, false, "9381d562e2b1ed8270541c4e3722298a");
                } else {
                    aVar6.b.f = a3;
                }
                a(DiagnoseLog.H5, "pageFinish");
                return;
            case 2:
                if (aVar.c() != null) {
                    a("jsError", aVar.c().toString(), true);
                    return;
                }
                return;
            case 3:
                StringBuilder sb3 = new StringBuilder("historyChange:");
                Object[] objArr7 = {aVar, "url"};
                ChangeQuickRedirect changeQuickRedirect7 = a;
                if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "8413008e525a08790a03e6eb4f6a2cd4", RobustBitConfig.DEFAULT_VALUE)) {
                    optString = (String) PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "8413008e525a08790a03e6eb4f6a2cd4");
                } else {
                    optString = (aVar == null || aVar.c() == null || !aVar.c().has("url")) ? "" : aVar.c().optString("url", "");
                }
                sb3.append(com.sankuai.eh.component.service.utils.e.b(optString));
                a(DiagnoseLog.H5, sb3.toString());
                return;
            case 4:
                if (!"ehshow".equals(aVar.b()) || this.i) {
                    return;
                }
                this.i = true;
                e.a aVar8 = this.f;
                long a4 = com.sankuai.eh.component.service.utils.f.a(this.h);
                Object[] objArr8 = {new Long(a4)};
                ChangeQuickRedirect changeQuickRedirect8 = e.a.a;
                if (PatchProxy.isSupport(objArr8, aVar8, changeQuickRedirect8, false, "3cd295e0c35a01192a7956c84eaad802", RobustBitConfig.DEFAULT_VALUE)) {
                    e.a aVar9 = (e.a) PatchProxy.accessDispatch(objArr8, aVar8, changeQuickRedirect8, false, "3cd295e0c35a01192a7956c84eaad802");
                } else {
                    aVar8.b.e = a4;
                }
                a("h5", "ehshow");
                return;
            case 5:
                a("h5", "pageClose");
                com.sankuai.eh.component.web.module.c cVar2 = this.d;
                JsonObject jsonObject = this.g;
                Object[] objArr9 = {jsonObject};
                ChangeQuickRedirect changeQuickRedirect9 = com.sankuai.eh.component.web.module.c.a;
                if (PatchProxy.isSupport(objArr9, cVar2, changeQuickRedirect9, false, "33a55e75cdcd378cb5a689836ca1e805", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr9, cVar2, changeQuickRedirect9, false, "33a55e75cdcd378cb5a689836ca1e805");
                } else {
                    com.sankuai.eh.component.web.plugins.e b = cVar2.b("recorder");
                    if (b instanceof a) {
                        a aVar10 = (a) b;
                        Object[] objArr10 = {jsonObject};
                        ChangeQuickRedirect changeQuickRedirect10 = a.a;
                        if (PatchProxy.isSupport(objArr10, aVar10, changeQuickRedirect10, false, "c671f686cbad6a9c0dc1a65662852ed9", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr10, aVar10, changeQuickRedirect10, false, "c671f686cbad6a9c0dc1a65662852ed9");
                        } else {
                            aVar10.b.add(jsonObject);
                        }
                    }
                }
                c.b(this.e.b);
                int a5 = com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.a(this.e.e, "data", "timeout", "recorder"), 3000);
                int a6 = f.a(this.e);
                if (a6 == 1) {
                    z = !this.i;
                } else if (a6 == 2 && !this.i && !this.j) {
                    z = true;
                }
                if (!z || TextUtils.isEmpty((CharSequence) this.e.b("pattern", "")) || com.sankuai.eh.component.service.utils.f.a(this.h) <= a5) {
                    return;
                }
                f.a(com.sankuai.eh.component.service.utils.d.a((Object) this.d.i), this.e.b);
                return;
            default:
                return;
        }
    }

    private void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c3b19a4d4ad656ef3b36a1e7ab2bce2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c3b19a4d4ad656ef3b36a1e7ab2bce2");
        } else {
            a(str, str2, false);
        }
    }

    private void a(String str, String str2, boolean z) {
        Object[] objArr = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2c1b34f08eb248757fdae0d2b1b12cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2c1b34f08eb248757fdae0d2b1b12cb");
            return;
        }
        b.a a2 = new b.a().a("t", com.sankuai.eh.component.service.utils.d.c()).a("type", str);
        if (z) {
            a2.a("msg", com.sankuai.eh.component.service.utils.b.a(str2));
        } else {
            a2.a("msg", str2);
        }
        this.b.add(a2.b);
    }
}
