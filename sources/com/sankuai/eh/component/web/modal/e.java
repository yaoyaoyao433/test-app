package com.sankuai.eh.component.web.modal;

import android.os.Bundle;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.meituan.android.neohybrid.core.config.UIConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.tools.d;
import com.sankuai.waimai.store.platform.marketing.MarketingModel;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e extends com.sankuai.eh.component.web.plugins.b {
    public static ChangeQuickRedirect a;
    private a b;
    private String f;
    private String g;
    private long h;
    private boolean i;
    private boolean j;
    private boolean k;

    @Override // com.sankuai.eh.component.web.plugins.e
    public final String a() {
        return "01";
    }

    @Override // com.sankuai.eh.component.web.plugins.e
    public final String b() {
        return UIConfig.MODAL;
    }

    @Override // com.sankuai.eh.component.web.plugins.e
    public final String[] c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3c1eecd15d325a613eea1189dd5ca67", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3c1eecd15d325a613eea1189dd5ca67") : new String[]{"onComponentInit", "onComponentStart", "onKNBJSCall", "cmp_disappear"};
    }

    @Override // com.sankuai.eh.component.web.plugins.b, com.sankuai.eh.component.web.plugins.e
    public final void a(com.sankuai.eh.component.web.module.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2621c06ae46d392821a1ca2ca612626f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2621c06ae46d392821a1ca2ca612626f");
            return;
        }
        super.a(cVar);
        this.f = com.sankuai.eh.component.service.utils.e.b(cVar.g, com.sankuai.eh.component.service.a.a());
        this.g = com.sankuai.eh.component.service.utils.e.b(cVar.g, "ehc_inserturl");
        com.sankuai.eh.component.service.tools.d.b("ehc.modal", new d.b().a("timing", "init").b, null);
        new d.c().a("ehc_modal_plugin").a("type", "needShow").b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x012a, code lost:
        if (r0.equals(com.sankuai.eh.component.service.utils.e.a(r1)) != false) goto L105;
     */
    @Override // com.sankuai.eh.component.web.plugins.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.sankuai.eh.component.web.plugins.api.a r20) {
        /*
            Method dump skipped, instructions count: 832
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.eh.component.web.modal.e.a(com.sankuai.eh.component.web.plugins.api.a):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.util.Map] */
    public static /* synthetic */ void a(e eVar, com.sankuai.eh.component.web.plugins.api.a aVar) {
        HashMap hashMap;
        Object[] objArr = {eVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fe31c0ad612a39fdb2d71fdb34f40989", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fe31c0ad612a39fdb2d71fdb34f40989");
            return;
        }
        FragmentActivity fragmentActivity = (FragmentActivity) eVar.d.i;
        ViewGroup viewGroup = (ViewGroup) aVar.d();
        String str = eVar.f;
        String str2 = eVar.g;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "975579d795ba6d44d9d8363222794424", RobustBitConfig.DEFAULT_VALUE)) {
            hashMap = (Map) PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "975579d795ba6d44d9d8363222794424");
        } else {
            hashMap = new HashMap();
            hashMap.put("bizId", com.sankuai.eh.component.service.utils.e.b(eVar.g, "bizId"));
            hashMap.put("from", eVar.a(eVar.g, "from"));
            hashMap.put("utm_source", eVar.a(eVar.g, "utm_source"));
        }
        eVar.b = new a(fragmentActivity, viewGroup, str, str2, hashMap);
        eVar.b.n = new com.sankuai.eh.component.web.module.d(eVar.d.k);
        a aVar2 = eVar.b;
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a.a;
        if (PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect3, false, "671eec667e6abd4bc348f79d4ed2933e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect3, false, "671eec667e6abd4bc348f79d4ed2933e");
        } else {
            aVar2.b();
            aVar2.c = System.currentTimeMillis();
            Bundle bundle = new Bundle();
            bundle.putString("url", aVar2.d);
            aVar2.m = EHModalFragment.a(aVar2.o, bundle);
            aVar2.m.setUserVisibleHint(false);
            aVar2.m.setMenuVisibility(false);
            aVar2.f.getSupportFragmentManager().beginTransaction().add(R.id.eh_component_modal_content, aVar2.m, "modal_fragment").hide(aVar2.m).commitAllowingStateLoss();
        }
        eVar.d.b = eVar.b.o;
        eVar.h = System.currentTimeMillis();
        eVar.a(eVar.g);
        com.sankuai.eh.component.service.tools.d.b("ehc.modal", new d.b().a("timing", MarketingModel.TYPE_ENTER_DIALOG).b, null);
    }

    private void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "375fd60706b4fca80cc9f91cf0f930ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "375fd60706b4fca80cc9f91cf0f930ad");
            return;
        }
        String a2 = com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.database.d.a(str), "pattern");
        com.sankuai.eh.component.service.tools.d.a("ehc_start", new d.b().a("name", "ehc.module.start").a("original", str).a("originalPattern", a2).a("pattern", a2).b);
    }

    private String a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a891524abf8c3660c665f58f09bd2305", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a891524abf8c3660c665f58f09bd2305");
        }
        String b = com.sankuai.eh.component.service.utils.e.b(str, str2);
        return !TextUtils.isEmpty(b) ? b : "-999";
    }

    public final boolean X_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6385397ce29094e6027050e04113c8e3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6385397ce29094e6027050e04113c8e3")).booleanValue();
        }
        if (this.b != null) {
            return this.b.b;
        }
        return false;
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3034c548cbc3baa9ec8cb99bc34f84a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3034c548cbc3baa9ec8cb99bc34f84a8");
        } else if (this.b != null) {
            this.b.d();
        }
    }
}
