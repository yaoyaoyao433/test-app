package com.sankuai.waimai.platform.mach.dialog;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.foundation.core.service.abtest.ABStrategy;
import com.sankuai.waimai.foundation.core.service.abtest.IABTestService;
import com.sankuai.waimai.mach.node.a;
import com.sankuai.waimai.platform.mach.a;
import com.sankuai.waimai.platform.mach.dialog.AlertInfo;
import com.sankuai.waimai.platform.mach.dialog.DynamicDialog;
import com.sankuai.waimai.pouch.a;
import com.sankuai.waimai.pouch.model.PouchDynamicAd;
import com.sankuai.waimai.store.platform.marketing.MarketingModel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public abstract class DialogModuleView extends com.sankuai.waimai.platform.mach.dialog.c {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final boolean sUseAsyLoadAB = isOpenAsyWithAB();
    private View bgView;
    private View contentView;
    private WeakReference<e> mMachContainerRef;
    private Map<String, View> mTagViews;
    private Set<a> moduleItems;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void j();

        void k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public a nativeRender(ViewGroup viewGroup, AlertInfo.Module module) {
        return null;
    }

    private boolean shouldRenderWithMach(@NonNull AlertInfo.Module module) {
        return true;
    }

    public abstract ViewGroup createModuleItemView(@NonNull AlertInfo.Module module);

    public abstract ViewGroup getModuleContainer();

    public void setLogReporter(com.sankuai.waimai.mach.d dVar) {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class c implements View.OnAttachStateChangeListener {
        public static ChangeQuickRedirect a;
        private a c;

        private c(a aVar) {
            Object[] objArr = {DialogModuleView.this, aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "faafe7ca36331c3e6f7071bbc9d6dfdc", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "faafe7ca36331c3e6f7071bbc9d6dfdc");
            } else {
                this.c = aVar;
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e15145f66d5eff42248e1edd60eb24b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e15145f66d5eff42248e1edd60eb24b");
            } else {
                DialogModuleView.this.moduleItems.add(this.c);
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ffa47a4d4d451c377012eeda1cda3f59", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ffa47a4d4d451c377012eeda1cda3f59");
                return;
            }
            this.c.j();
            DialogModuleView.this.moduleItems.remove(this.c);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class b implements a {
        public static ChangeQuickRedirect a;
        a b;

        @Override // com.sankuai.waimai.platform.mach.dialog.DialogModuleView.a
        public final void k() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c283d5d122c7767df25678b7fc1904b4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c283d5d122c7767df25678b7fc1904b4");
            } else if (this.b != null) {
                this.b.k();
            }
        }

        @Override // com.sankuai.waimai.platform.mach.dialog.DialogModuleView.a
        public final void j() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84836c8ad1e07d63742b7184b7824ee7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84836c8ad1e07d63742b7184b7824ee7");
            } else if (this.b != null) {
                this.b.j();
            }
        }
    }

    public DialogModuleView(@NonNull Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ef67a79fdcd46f8047b56c8d707c2bc0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ef67a79fdcd46f8047b56c8d707c2bc0");
        } else {
            setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        }
    }

    public DialogModuleView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f95cbb522391f698a03cb056f81dd43a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f95cbb522391f698a03cb056f81dd43a");
            return;
        }
        this.moduleItems = new HashSet();
        this.mTagViews = new ArrayMap();
    }

    public void tryExposeModules() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "00431069b089c5f12bfca81c37258d13", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "00431069b089c5f12bfca81c37258d13");
            return;
        }
        for (a aVar : this.moduleItems) {
            aVar.k();
        }
    }

    public void refresh(List<AlertInfo.Module> list, j jVar) {
        Object[] objArr = {list, jVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f77e630453f6c3f2ba9e43ef6ad502eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f77e630453f6c3f2ba9e43ef6ad502eb");
            return;
        }
        getModuleContainer().removeAllViews();
        if (com.facebook.react.util.a.a(list)) {
            jVar.a();
            return;
        }
        int i = 0;
        for (AlertInfo.Module module : list) {
            if (module != null && shouldRenderWithMach(module)) {
                i++;
            }
        }
        if (i == 0) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.platform.mach.dialog.a.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "15ec3450f2c84bcf5965311de22b702e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "15ec3450f2c84bcf5965311de22b702e");
            } else {
                com.sankuai.waimai.platform.mach.dialog.a.a(18902);
            }
        }
        i newMachModulesRenderListener = newMachModulesRenderListener(i, jVar);
        for (int i2 = 0; i2 < list.size(); i2++) {
            AlertInfo.Module module2 = list.get(i2);
            if (module2 != null) {
                ViewGroup createModuleItemView = createModuleItemView(module2);
                Map<String, Object> i3 = getDialogContext().i();
                i3.put("index", Integer.valueOf(i2));
                createModuleItemView.addOnAttachStateChangeListener(new c(render(createModuleItemView, module2, i3, newMachModulesRenderListener)));
                getModuleContainer().addView(createModuleItemView);
            }
        }
        if (i != 0 || jVar == null) {
            return;
        }
        jVar.a();
    }

    private a render(ViewGroup viewGroup, @NonNull AlertInfo.Module module, Map<String, Object> map, i iVar) {
        Object[] objArr = {viewGroup, module, map, iVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ebfb893d8f747bce7f1c843269da7ed9", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ebfb893d8f747bce7f1c843269da7ed9");
        }
        if ("ad".equals(module.businessType)) {
            return pouchRender(viewGroup, module, map, iVar);
        }
        if (shouldRenderWithMach(module)) {
            return machRender(viewGroup, module, map, iVar);
        }
        return nativeRender(viewGroup, module);
    }

    private a machRender(final ViewGroup viewGroup, @NonNull final AlertInfo.Module module, Map<String, Object> map, i iVar) {
        Object[] objArr = {viewGroup, module, map, iVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b6d127eedfb78ac1d81b38a738371e9d", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b6d127eedfb78ac1d81b38a738371e9d");
        }
        final b bVar = new b();
        e createModuleMachContainer = createModuleMachContainer(module);
        this.mMachContainerRef = new WeakReference<>(createModuleMachContainer);
        createModuleMachContainer.e = getDialogContext();
        createModuleMachContainer.f = iVar;
        createModuleMachContainer.a(viewGroup, module.moduleId, "waimai");
        createModuleMachContainer.u = new a.InterfaceC1053a() { // from class: com.sankuai.waimai.platform.mach.dialog.DialogModuleView.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.mach.a.InterfaceC1053a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "805a2b789d9c214a45295bea9cded091", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "805a2b789d9c214a45295bea9cded091");
                } else {
                    bVar.b = DialogModuleView.this.nativeRender(viewGroup, module);
                }
            }
        };
        if (map != null) {
            createModuleMachContainer.b(map);
        }
        if (sUseAsyLoadAB) {
            createModuleMachContainer.b(module.templateId, module.defaultTemplateId, getTemplateData(module));
        } else {
            createModuleMachContainer.a(module.templateId, module.defaultTemplateId, getTemplateData(module), 0, 0);
        }
        bVar.b = createModuleMachContainer;
        return bVar;
    }

    private a pouchRender(ViewGroup viewGroup, @NonNull AlertInfo.Module module, Map<String, Object> map, i iVar) {
        Object[] objArr = {viewGroup, module, map, iVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b5fe658cbeb065e06bb0f94c31438a13", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b5fe658cbeb065e06bb0f94c31438a13");
        }
        b bVar = new b();
        ArrayList arrayList = new ArrayList();
        arrayList.add("waimai_platinum_report_procedure");
        com.sankuai.waimai.pouch.plugin.b bVar2 = new com.sankuai.waimai.pouch.plugin.b();
        bVar2.b = arrayList;
        com.sankuai.waimai.pouch.model.c cVar = new com.sankuai.waimai.pouch.model.c();
        cVar.b = getDialogContext().g();
        cVar.a = AppUtil.generatePageInfoKey(getContext());
        cVar.f = "waimai";
        cVar.e = module.moduleId;
        cVar.g = module.containerType;
        if (getContext() instanceof BaseActivity) {
            cVar.d = ((BaseActivity) getContext()).w();
        }
        cVar.h = map;
        a.C1112a c1112a = new a.C1112a();
        c1112a.c = viewGroup;
        c1112a.b = getContext();
        c1112a.g = bVar2;
        c1112a.d = cVar;
        c1112a.e = getDialogContext().f();
        com.sankuai.waimai.pouch.a a2 = c1112a.a();
        PouchDynamicAd pouchDynamicAd = new PouchDynamicAd();
        pouchDynamicAd.businessName = "homepage_tianjiang";
        pouchDynamicAd.adTemplateId = module.templateId;
        pouchDynamicAd.defaultID = module.defaultTemplateId;
        pouchDynamicAd.adContainerId = PouchDynamicAd.CONTAINER_ID_POUCH_MACH_POPUP;
        pouchDynamicAd.stringData = com.sankuai.waimai.pouch.util.c.a(getTemplateData(module));
        Map<String, Object> m = getDialogContext().m();
        if (m != null) {
            a2.d = m;
        }
        Map<String, String> n = getDialogContext().n();
        if (m != null) {
            a2.e = n;
        }
        a2.a(new Rect(0, 0, getContext().getResources().getDisplayMetrics().widthPixels, getContext().getResources().getDisplayMetrics().heightPixels));
        Object[] objArr2 = {pouchDynamicAd};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.pouch.a.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect3, false, "d139d10b0d3e030d0fa78ff55111b4dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect3, false, "d139d10b0d3e030d0fa78ff55111b4dc");
        } else {
            a2.a(pouchDynamicAd, false);
            if (a2.b != null) {
                a2.b.a(pouchDynamicAd);
            }
        }
        if (a2.g() instanceof h) {
            ((h) a2.g()).a(getDialogContext());
            ((h) a2.g()).a(iVar);
        }
        if (a2.g() instanceof a) {
            bVar.b = (a) a2.g();
        }
        return bVar;
    }

    @NonNull
    private e createModuleMachContainer(AlertInfo.Module module) {
        Object[] objArr = {module};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4652627c72fa684dffd49b2c4d4271c9", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4652627c72fa684dffd49b2c4d4271c9");
        }
        DynamicDialog.h j = getDialogContext().j();
        e a2 = j != null ? j.a((Activity) getContext(), module) : null;
        return a2 == null ? new e((Activity) getContext(), "") : a2;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.Map<java.lang.String, java.lang.Object> getTemplateData(@android.support.annotation.NonNull com.sankuai.waimai.platform.mach.dialog.AlertInfo.Module r13) {
        /*
            r12 = this;
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.waimai.platform.mach.dialog.DialogModuleView.changeQuickRedirect
            java.lang.String r11 = "97325ee2c744dbfb1ccbf6e492a67d1a"
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
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.platform.mach.dialog.DialogModuleView.getTemplateData(com.sankuai.waimai.platform.mach.dialog.AlertInfo$Module):java.util.Map");
    }

    private i newMachModulesRenderListener(final int i, final j jVar) {
        Object[] objArr = {Integer.valueOf(i), jVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "40cf300c88d0f6a80b9b193952c677e9", RobustBitConfig.DEFAULT_VALUE) ? (i) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "40cf300c88d0f6a80b9b193952c677e9") : new i() { // from class: com.sankuai.waimai.platform.mach.dialog.DialogModuleView.2
            public static ChangeQuickRedirect a;
            private int e;
            private int f;
            private int g;
            private int h;
            private int i;
            private int j;

            @Override // com.sankuai.waimai.platform.mach.dialog.i
            public final void a(int i2, Throwable th) {
                Object[] objArr2 = {Integer.valueOf(i2), th};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a526cffbf6fba85d1026ea52614138c9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a526cffbf6fba85d1026ea52614138c9");
                    return;
                }
                this.f++;
                if (i2 == 2) {
                    this.g++;
                } else if (i2 == 1) {
                    this.h++;
                } else if (i2 == 0) {
                    this.i++;
                } else if (i2 == 3) {
                    this.j++;
                }
                a();
                if (DialogModuleView.this.getDialogContext().k() != null) {
                    DialogModuleView.this.getDialogContext().k().a(i2, th);
                }
            }

            @Override // com.sankuai.waimai.platform.mach.dialog.i
            public final void a(com.sankuai.waimai.mach.node.a aVar) {
                Object[] objArr2 = {aVar};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "645f7e524518c30cdedc3d5910c3803c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "645f7e524518c30cdedc3d5910c3803c");
                    return;
                }
                this.e++;
                a();
                DialogModuleView.this.checkViewTree(aVar);
                if (DialogModuleView.this.getDialogContext().k() != null) {
                    DialogModuleView.this.getDialogContext().k().a(aVar);
                }
            }

            private void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6cb2ce7cf87ace3aff02bf40e8d135e9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6cb2ce7cf87ace3aff02bf40e8d135e9");
                } else if (this.f + this.e == i) {
                    if (this.e > 0) {
                        DialogModuleView.this.getDialogContext().e();
                        DialogModuleView.this.post(new Runnable() { // from class: com.sankuai.waimai.platform.mach.dialog.DialogModuleView.2.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "4dbefc78488aa082cfb17a3a89a66f04", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "4dbefc78488aa082cfb17a3a89a66f04");
                                } else {
                                    DialogModuleView.this.tryExposeModules();
                                }
                            }
                        });
                    } else {
                        DialogModuleView.this.getDialogContext().a();
                        com.sankuai.waimai.platform.mach.dialog.a.a();
                        l.a(this.g, this.h, this.i, this.j);
                    }
                    if (jVar != null) {
                        jVar.a();
                    }
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkViewTree(com.sankuai.waimai.mach.node.a aVar) {
        e eVar;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "50e0f3331e100e999b0eeb69482f5c88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "50e0f3331e100e999b0eeb69482f5c88");
            return;
        }
        if (aVar == null && this.mMachContainerRef != null && (eVar = this.mMachContainerRef.get()) != null) {
            aVar = eVar.l();
        }
        if (aVar == null) {
            return;
        }
        com.sankuai.waimai.mach.node.a.a(aVar, new a.InterfaceC1019a() { // from class: com.sankuai.waimai.platform.mach.dialog.DialogModuleView.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.node.a.InterfaceC1019a
            public final void a(com.sankuai.waimai.mach.node.a aVar2) {
                Object[] objArr2 = {aVar2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "debc0fb1a86e367ffc7cf966d4ed1319", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "debc0fb1a86e367ffc7cf966d4ed1319");
                    return;
                }
                Map<String, Object> h = aVar2.h();
                if (h == null) {
                    return;
                }
                if (h.containsKey("view-tag")) {
                    Object obj = h.get("view-tag");
                    if (obj instanceof String) {
                        DialogModuleView.this.mTagViews.put((String) obj, aVar2.g());
                    }
                }
                if (h.containsKey("content-container") || h.containsKey("contentContainer")) {
                    DialogModuleView.this.contentView = aVar2.g();
                } else if (h.containsKey("bg-container") || h.containsKey("bgContainer")) {
                    DialogModuleView.this.bgView = aVar2.g();
                }
            }
        });
    }

    public View getContentView() {
        return this.contentView;
    }

    public View getBgView() {
        return this.bgView;
    }

    public Map<String, View> getTagViews() {
        return this.mTagViews;
    }

    private static boolean isOpenAsyWithAB() {
        ABStrategy strategy;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "054c82ac67c7367b2bb52a4ceaf4305e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "054c82ac67c7367b2bb52a4ceaf4305e")).booleanValue();
        }
        IABTestService iABTestService = (IABTestService) com.sankuai.waimai.router.a.a(IABTestService.class, IABTestService.KEY);
        if (iABTestService == null || (strategy = iABTestService.getStrategy("waimai_sky_mach_load_asy_strategy", null)) == null) {
            return false;
        }
        return TextUtils.equals(strategy.expName, MarketingModel.TYPE_ENTER_DIALOG);
    }
}
