package com.meituan.msc.exception;

import android.text.TextUtils;
import com.meituan.msc.modules.reporter.g;
import com.meituan.msc.uimanager.UIImplementation;
import com.meituan.msc.uimanager.aa;
import com.meituan.msc.uimanager.ag;
import com.meituan.msc.uimanager.events.MSCRenderCommandModule;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    final ArrayList<C0440a> b;
    public final ArrayList<C0440a> c;
    public boolean d;
    public boolean e;
    public final AtomicInteger f;
    public long g;
    boolean h;
    public boolean i;
    private final AtomicInteger j;
    private long k;
    private boolean l;

    public static /* synthetic */ void a(a aVar, String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "1501b171e0acd0340eef9d3ab099b8c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "1501b171e0acd0340eef9d3ab099b8c6");
            return;
        }
        int length = 2001 - str.length();
        while (str2.length() > length) {
            g.d(str, str2.substring(0, length));
            str2 = str2.substring(length);
        }
        g.d(str, str2);
    }

    public static /* synthetic */ void a(a aVar, ArrayList arrayList, String str) {
        Object[] objArr = {arrayList, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "c30faa9ec5ffe5a46b05fdfc543eef73", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "c30faa9ec5ffe5a46b05fdfc543eef73");
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            C0440a c0440a = (C0440a) arrayList.get(i);
            g.d("MSCRender", str, Integer.valueOf(c0440a.c), c0440a.a, c0440a.b);
        }
    }

    public a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7222b45fdddc1adda3976ee92b9cf70c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7222b45fdddc1adda3976ee92b9cf70c");
            return;
        }
        this.b = new ArrayList<>();
        this.c = new ArrayList<>();
        this.d = true;
        this.e = false;
        this.j = new AtomicInteger(1);
        this.f = new AtomicInteger(1);
        this.l = false;
        this.d = z;
        g.d("[MSCRenderCommandTool@MSCRenderCommandTool]", "enable: ", Boolean.valueOf(z));
    }

    public final void a(String str, JSONArray jSONArray) {
        Object[] objArr = {str, jSONArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d48c0906c97bdc70996ead244b416a95", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d48c0906c97bdc70996ead244b416a95");
        } else if (this.d && !this.e) {
            if (!this.h) {
                long id = Thread.currentThread().getId();
                if (this.k == 0) {
                    this.k = id;
                }
                if (id != this.k) {
                    g.b("[MSCRenderCommandTool@logJSCommand]", null, Long.valueOf(id), Long.valueOf(this.k));
                    this.h = true;
                }
            }
            C0440a c0440a = new C0440a();
            c0440a.a = a(str);
            c0440a.b = String.valueOf(jSONArray);
            c0440a.c = this.j.getAndIncrement();
            this.b.add(c0440a);
        }
    }

    public String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d52fe508853c519d395e605074ad63d5", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d52fe508853c519d395e605074ad63d5");
        }
        if (str == null) {
            return "n";
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1526066370) {
            if (hashCode != -646120319) {
                if (hashCode != 1369272769) {
                    if (hashCode == 1935813252 && str.equals("manageChildren")) {
                        c = 1;
                    }
                } else if (str.equals("createView")) {
                    c = 0;
                }
            } else if (str.equals("setChildren")) {
                c = 2;
            }
        } else if (str.equals("batchDidComplete")) {
            c = 3;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
                return str.substring(0, 1);
            default:
                return str;
        }
    }

    public final void a(MSCRenderCommandModule mSCRenderCommandModule, int i) {
        Object[] objArr = {mSCRenderCommandModule, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "537217b5222bf014ed027a6fe265af29", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "537217b5222bf014ed027a6fe265af29");
        } else if (!this.d || mSCRenderCommandModule == null || this.l) {
        } else {
            this.l = true;
            mSCRenderCommandModule.printShadowTree(i);
        }
    }

    public final void a(UIImplementation uIImplementation) {
        Object[] objArr = {uIImplementation};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31b744ee28929ec32175b738a248bfef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31b744ee28929ec32175b738a248bfef");
        } else if (this.d && !this.e && uIImplementation != null) {
            this.e = true;
            ag p = uIImplementation.p();
            g.d("[MSCRenderCommandTool@printCommands]", "shadowNodeRegistry: ", p);
            com.sankuai.waimai.launcher.util.aop.b.a(c.a(), new Runnable() { // from class: com.meituan.msc.exception.a.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    boolean z;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1ca57ba022bdd2cc657ea281af6ba260", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1ca57ba022bdd2cc657ea281af6ba260");
                        return;
                    }
                    for (int i = 0; i < a.this.c.size(); i++) {
                        C0440a c0440a = a.this.b.get(i);
                        C0440a c0440a2 = a.this.c.get(i);
                        if (c0440a == null || c0440a2 == null) {
                            g.b("[MSCRenderCommandTool@printCommands]", null, "command null:", c0440a, c0440a2);
                            if (c0440a != null || c0440a2 != null) {
                                g.d("[MSCRenderCommandTool@run]", "nativeCommand: ", c0440a2);
                                z = true;
                                break;
                            }
                            g.a("[MSCRenderCommandTool@run]", "nativeCommand jsCommand both null");
                        } else if (!TextUtils.equals(c0440a.a, c0440a2.a) || !TextUtils.equals(c0440a.b, c0440a2.b) || c0440a.c != c0440a2.c) {
                            g.d("[MSCRenderCommandTool@printCommands]", Integer.valueOf(c0440a.c), c0440a.a, c0440a.b, Integer.valueOf(c0440a2.c), c0440a2.a, c0440a2.b);
                            z = true;
                            break;
                        }
                    }
                    z = false;
                    a.a(a.this, a.this.c, "nv");
                    if (z) {
                        a.a(a.this, a.this.b, "js");
                    }
                    if (a.this.h || a.this.i) {
                        g.b("[MSCRenderCommandTool@printCommands]", null, Boolean.valueOf(a.this.h), Boolean.valueOf(a.this.i));
                    }
                    a.this.a();
                }
            });
            Object[] objArr2 = {p};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f04839ad708346b0a0f52d9d231268f5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f04839ad708346b0a0f52d9d231268f5");
            } else if (p == null) {
                g.a("[MSCRenderCommandTool@printShadowTree]", "shadowNodeRegistry null");
            } else {
                int a2 = p.a();
                g.d("[MSCRenderCommandTool@printShadowTree]", "rootNodeCount: ", Integer.valueOf(a2));
                for (int i = 0; i < a2; i++) {
                    final aa c = p.c(p.e(i));
                    com.sankuai.waimai.launcher.util.aop.b.a(c.b(), new Runnable() { // from class: com.meituan.msc.exception.a.2
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e7205be4734b87f38a92d258e3868d0e", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e7205be4734b87f38a92d258e3868d0e");
                                return;
                            }
                            JSONObject jSONObject = new JSONObject();
                            a.this.a(c, jSONObject);
                            a.a(a.this, "MSCR", jSONObject.toString());
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(aa aaVar, JSONObject jSONObject) {
        Object[] objArr = {aaVar, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3193715f7c424a6cb1f80ce4af93ce22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3193715f7c424a6cb1f80ce4af93ce22");
        } else if (aaVar == null) {
            g.a("[MSCRenderCommandTool@printNodeTreeLoop]", "node null");
        } else {
            try {
                if (aaVar.m() == 0) {
                    jSONObject.put(String.valueOf(aaVar.p()), new JSONArray());
                    return;
                }
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < aaVar.m(); i++) {
                    aa e = aaVar.e(i);
                    JSONObject jSONObject2 = new JSONObject();
                    a(e, jSONObject2);
                    jSONArray.put(jSONObject2);
                }
                jSONObject.put(String.valueOf(aaVar.p()), jSONArray);
            } catch (JSONException e2) {
                g.a("[MSCRenderCommandTool@printNodeTreeLoop]", e2);
            }
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75d7cdbb21c27b9b38a1a359888ca297", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75d7cdbb21c27b9b38a1a359888ca297");
            return;
        }
        this.b.clear();
        this.c.clear();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.msc.exception.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0440a implements Serializable {
        public String a;
        public String b;
        public int c;

        public C0440a() {
        }
    }
}
