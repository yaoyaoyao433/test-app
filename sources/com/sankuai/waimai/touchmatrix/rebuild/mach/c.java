package com.sankuai.waimai.touchmatrix.rebuild.mach;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.node.a;
import com.sankuai.waimai.touchmatrix.a;
import com.sankuai.waimai.touchmatrix.data.AlertInfo;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class c extends com.sankuai.waimai.touchmatrix.dialog.view.a {
    public static ChangeQuickRedirect a;
    Set<a> c;
    private com.sankuai.waimai.touchmatrix.rebuild.mach.b d;
    private View e;
    private View f;
    private com.sankuai.waimai.touchmatrix.data.a g;
    private com.sankuai.waimai.touchmatrix.rebuild.factory.c h;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a();

        void b();
    }

    public abstract ViewGroup a(@NonNull AlertInfo.Module module);

    public abstract ViewGroup getModuleContainer();

    public static /* synthetic */ void c(c cVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "dd597edbd90df1f2fc31b1fcfd904176", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "dd597edbd90df1f2fc31b1fcfd904176");
        } else if (cVar.d != null) {
            com.sankuai.waimai.mach.node.a.a(cVar.d.f(), new a.InterfaceC1019a() { // from class: com.sankuai.waimai.touchmatrix.rebuild.mach.c.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.mach.node.a.InterfaceC1019a
                public final void a(com.sankuai.waimai.mach.node.a aVar) {
                    Object[] objArr2 = {aVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d2f76e5ec6dbd13bce2366e7af945d7b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d2f76e5ec6dbd13bce2366e7af945d7b");
                        return;
                    }
                    Map<String, Object> h = aVar.h();
                    if (h == null) {
                        return;
                    }
                    if (h.containsKey("content-container") || h.containsKey("contentContainer")) {
                        c.this.e = aVar.g();
                    } else if (h.containsKey("bg-container") || h.containsKey("bgContainer")) {
                        c.this.f = aVar.g();
                    }
                }
            });
        }
    }

    public com.sankuai.waimai.touchmatrix.data.a getTMatrixMessage() {
        return this.g;
    }

    public void setTMatrixMessage(com.sankuai.waimai.touchmatrix.data.a aVar) {
        this.g = aVar;
    }

    public void setControler(com.sankuai.waimai.touchmatrix.rebuild.factory.c cVar) {
        this.h = cVar;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.touchmatrix.rebuild.mach.c$c  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    class View$OnAttachStateChangeListenerC1353c implements View.OnAttachStateChangeListener {
        public static ChangeQuickRedirect a;
        private a c;

        private View$OnAttachStateChangeListenerC1353c(a aVar) {
            Object[] objArr = {c.this, aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e25e58978521d90c8d01d267cc8be35", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e25e58978521d90c8d01d267cc8be35");
            } else {
                this.c = aVar;
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "163308a885d34e8c0e2f5b181bad075f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "163308a885d34e8c0e2f5b181bad075f");
            } else {
                c.this.c.add(this.c);
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d371d01c17e67a292640500c6eca992a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d371d01c17e67a292640500c6eca992a");
                return;
            }
            this.c.a();
            c.this.c.remove(this.c);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class b implements a {
        public static ChangeQuickRedirect a;
        a b;

        @Override // com.sankuai.waimai.touchmatrix.rebuild.mach.c.a
        public final void b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c63cc296e03acea017a5a685a83c01c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c63cc296e03acea017a5a685a83c01c");
            } else if (this.b != null) {
                this.b.b();
            }
        }

        @Override // com.sankuai.waimai.touchmatrix.rebuild.mach.c.a
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01d5e367ab67d8cfff9b15a0526d8938", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01d5e367ab67d8cfff9b15a0526d8938");
            } else if (this.b != null) {
                this.b.a();
            }
        }
    }

    public c(@NonNull Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62dbde31ca7ff0417873074a11a4cc17", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62dbde31ca7ff0417873074a11a4cc17");
        } else {
            setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        }
    }

    public c(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19637ab408777cfc6decc279a2661e27", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19637ab408777cfc6decc279a2661e27");
        } else {
            this.c = new HashSet();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a a(ViewGroup viewGroup, @NonNull AlertInfo.Module module, Map<String, Object> map, e eVar) {
        com.sankuai.waimai.touchmatrix.rebuild.mach.b bVar;
        Object[] objArr = {viewGroup, module, map, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8120d1fa9f82da431e29cf09d1dfb351", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8120d1fa9f82da431e29cf09d1dfb351");
        }
        b bVar2 = new b();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3ea41454635f76b88966a3e96adf6c01", RobustBitConfig.DEFAULT_VALUE)) {
            bVar = (com.sankuai.waimai.touchmatrix.rebuild.mach.b) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3ea41454635f76b88966a3e96adf6c01");
        } else {
            bVar = new com.sankuai.waimai.touchmatrix.rebuild.mach.b((Activity) getContext(), "");
            a.C1348a b2 = com.sankuai.waimai.touchmatrix.rebuild.message.a.b(this.g);
            if (b2 != null) {
                bVar.v = b2.f;
                bVar.t = b2.b;
                com.sankuai.waimai.touchmatrix.monitor.d dVar = b2.m;
                if (dVar != null) {
                    bVar.w = dVar;
                }
            }
            bVar.c = this.g;
            bVar.b = this.h;
        }
        this.d = bVar;
        bVar.d = getDialogContext();
        bVar.e = eVar;
        try {
            bVar.a(viewGroup, module.moduleId, "waimai");
            if (map != null) {
                bVar.a(map);
            }
            bVar.a(module.templateId, module.defaultTemplateId, b(module), 0, 0);
        } catch (Exception e) {
            com.sankuai.waimai.touchmatrix.rebuild.utils.c.e("machRender失败 : " + e.getMessage(), new Object[0]);
        }
        bVar2.b = bVar;
        return bVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.Map<java.lang.String, java.lang.Object> b(@android.support.annotation.NonNull com.sankuai.waimai.touchmatrix.data.AlertInfo.Module r13) {
        /*
            r12 = this;
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.waimai.touchmatrix.rebuild.mach.c.a
            java.lang.String r11 = "7de4c9f2de70c6f0f506594a13d66049"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            java.lang.Object r13 = com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r9, r11)
            java.util.Map r13 = (java.util.Map) r13
            return r13
        L1e:
            r1 = 0
            int r2 = r13.dataType
            if (r2 != 0) goto L32
            com.google.gson.JsonObject r0 = r13.jsonData
            if (r0 != 0) goto L2b
            java.lang.String r13 = ""
        L29:
            r1 = r13
            goto L55
        L2b:
            com.google.gson.JsonObject r13 = r13.jsonData
            java.lang.String r13 = r13.toString()
            goto L29
        L32:
            int r2 = r13.dataType
            if (r2 != r0) goto L55
            java.lang.String r13 = r13.stringData
            org.json.JSONTokener r0 = new org.json.JSONTokener     // Catch: java.lang.Exception -> L55
            r0.<init>(r13)     // Catch: java.lang.Exception -> L55
            java.lang.Object r0 = r0.nextValue()     // Catch: java.lang.Exception -> L55
            boolean r2 = r0 instanceof org.json.JSONArray     // Catch: java.lang.Exception -> L55
            if (r2 == 0) goto L56
            org.json.JSONObject r13 = new org.json.JSONObject     // Catch: java.lang.Exception -> L55
            r13.<init>()     // Catch: java.lang.Exception -> L55
            java.lang.String r2 = "list"
            r13.put(r2, r0)     // Catch: java.lang.Exception -> L55
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Exception -> L55
            goto L56
        L55:
            r13 = r1
        L56:
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            if (r0 == 0) goto L61
            java.util.Map r13 = java.util.Collections.emptyMap()
            return r13
        L61:
            java.util.Map r13 = com.sankuai.waimai.mach.utils.b.a(r13)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.touchmatrix.rebuild.mach.c.b(com.sankuai.waimai.touchmatrix.data.AlertInfo$Module):java.util.Map");
    }

    public View getContentView() {
        return this.e;
    }

    public View getBgView() {
        return this.f;
    }
}
