package com.sankuai.waimai.ad.view.mach.nested;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.ad.view.mach.nested.c;
import com.sankuai.waimai.ad.view.mach.nested.d;
import com.sankuai.waimai.mach.manager.cache.e;
import com.sankuai.waimai.platform.mach.dialog.DynamicDialog;
import com.sankuai.waimai.platform.mach.dialog.h;
import com.sankuai.waimai.pouch.a;
import com.sankuai.waimai.pouch.model.PouchDynamicAd;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends com.sankuai.waimai.mach.component.base.a<FrameLayout> {
    public static ChangeQuickRedirect a;
    public com.sankuai.waimai.pouch.a b;
    c.a c;
    private String d;
    private String e;
    private String f;
    private com.sankuai.waimai.pouch.model.c g;
    private DynamicDialog.d h;

    @Override // com.sankuai.waimai.mach.component.base.a
    public final /* synthetic */ void a(FrameLayout frameLayout) {
        final e eVar;
        FrameLayout frameLayout2 = frameLayout;
        Object[] objArr = {frameLayout2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b5b7fc559a27fa31d04b287599f7bcb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b5b7fc559a27fa31d04b287599f7bcb");
            return;
        }
        super.a((b) frameLayout2);
        if (TextUtils.equals(this.d, "wm_pouch_embeded_popup") || (TextUtils.equals(this.d, "wm_home_embeded_super_style") && i(this.e) && i(this.f) && this.m != null)) {
            if (TextUtils.equals(this.d, "wm_home_embeded_super_style")) {
                try {
                    HashMap hashMap = new HashMap();
                    hashMap.put("mach_pouch_embed_use_error", 1);
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("tempID", this.e);
                    if (this.m != null && this.m.getMachBundle() != null) {
                        hashMap2.put("parentTempID", this.m.getMachBundle().j);
                    }
                    com.sankuai.waimai.pouch.monitor.c.a(hashMap, hashMap2);
                } catch (Exception unused) {
                }
            }
            this.g.g = 4;
            ArrayList arrayList = new ArrayList();
            arrayList.add("waimai_platinum_report_procedure");
            com.sankuai.waimai.pouch.plugin.b bVar = new com.sankuai.waimai.pouch.plugin.b();
            bVar.b = arrayList;
            a.C1112a c1112a = new a.C1112a();
            c1112a.c = frameLayout2;
            c1112a.b = this.m.getActivity();
            c1112a.d = this.g;
            c1112a.g = bVar;
            this.b = c1112a.a();
            if (this.h != null) {
                Map<String, Object> m = this.h.m();
                if (m != null) {
                    this.b.d = m;
                }
                Map<String, String> n = this.h.n();
                if (m != null) {
                    this.b.e = n;
                }
            }
            if (frameLayout2 != null && frameLayout2.getContext() != null) {
                this.b.a(new Rect(0, 0, frameLayout2.getContext().getResources().getDisplayMetrics().widthPixels, frameLayout2.getContext().getResources().getDisplayMetrics().heightPixels));
            }
            d a2 = d.a();
            String str = this.e;
            Object[] objArr2 = {str, "", ""};
            ChangeQuickRedirect changeQuickRedirect2 = d.a.a;
            d.a aVar = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "c4b339c509446bad96e331b79ea5e354", RobustBitConfig.DEFAULT_VALUE) ? (d.a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "c4b339c509446bad96e331b79ea5e354") : new d.a(str, "", "");
            Object[] objArr3 = {aVar};
            ChangeQuickRedirect changeQuickRedirect3 = d.a;
            if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "1850ac117f1405e4ffe3e621df8f650a", RobustBitConfig.DEFAULT_VALUE)) {
                eVar = (e) PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "1850ac117f1405e4ffe3e621df8f650a");
            } else {
                eVar = aVar == null ? null : a2.b.get(aVar);
            }
            com.sankuai.waimai.pouch.model.b bVar2 = new com.sankuai.waimai.pouch.model.b() { // from class: com.sankuai.waimai.ad.view.mach.nested.b.3
                @Override // com.sankuai.waimai.pouch.model.b
                public final /* bridge */ /* synthetic */ Object a() {
                    return eVar;
                }
            };
            PouchDynamicAd pouchDynamicAd = new PouchDynamicAd();
            pouchDynamicAd.businessName = "pouchMachEmbed";
            pouchDynamicAd.adTemplateId = this.e;
            pouchDynamicAd.defaultID = this.e;
            pouchDynamicAd.adContainerId = PouchDynamicAd.CONTAINER_ID_POUCH_MACH_POPUP;
            pouchDynamicAd.stringData = this.f;
            if ((this.b.g() instanceof h) && this.h != null) {
                ((h) this.b.g()).a(this.h);
            }
            if (eVar != null) {
                this.b.a(pouchDynamicAd, bVar2);
                return;
            } else {
                frameLayout2.setVisibility(8);
                return;
            }
        }
        frameLayout2.setVisibility(8);
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final /* synthetic */ FrameLayout b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae8c95181fa489167c04faaf9ec7fb7f", RobustBitConfig.DEFAULT_VALUE)) {
            return (FrameLayout) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae8c95181fa489167c04faaf9ec7fb7f");
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.sankuai.waimai.ad.view.mach.nested.b.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2e27be9bd68e577c8e55418c9bcaaacc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2e27be9bd68e577c8e55418c9bcaaacc");
                } else {
                    c.a().a(b.this.m, b.this.c);
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6841af9e46c7fcad0d67662830612c7f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6841af9e46c7fcad0d67662830612c7f");
                } else {
                    c.a().b(b.this.m, b.this.c);
                }
            }
        });
        return frameLayout;
    }

    public b(DynamicDialog.d dVar, com.sankuai.waimai.pouch.model.c cVar) {
        Object[] objArr = {dVar, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "164cfa2ac63831975780722c94a95127", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "164cfa2ac63831975780722c94a95127");
            return;
        }
        this.c = new c.a() { // from class: com.sankuai.waimai.ad.view.mach.nested.b.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.ad.view.mach.nested.c.a
            public final void a(Rect rect) {
                Object[] objArr2 = {rect};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0034a3d7b0ea700b3b76a40bb4c1e295", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0034a3d7b0ea700b3b76a40bb4c1e295");
                } else if (b.this.b != null) {
                    b.this.b.a(rect);
                    b.this.b.a();
                }
            }

            @Override // com.sankuai.waimai.ad.view.mach.nested.c.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e9b143e15c9cd0d1c86ed0a4684255fb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e9b143e15c9cd0d1c86ed0a4684255fb");
                } else if (b.this.b != null) {
                    b.this.b.c();
                }
            }
        };
        this.g = cVar;
        this.h = dVar;
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4dd5371a16fe5d87de8861427646b733", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4dd5371a16fe5d87de8861427646b733");
            return;
        }
        this.d = a("native-id");
        this.e = a("template-id");
        this.f = a("template-data");
        com.sankuai.waimai.foundation.utils.log.a.b("MachEmbed", "EmbedComponent#onBind::mNativeId=" + this.d + ",mTemplateId=" + this.e + ",mTemplateData=" + this.f, new Object[0]);
    }

    public final void a(DynamicDialog.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7ce27ee4ebf2ff28ab9d72ad6688cbb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7ce27ee4ebf2ff28ab9d72ad6688cbb");
            return;
        }
        this.h = dVar;
        if (this.b == null || this.h == null) {
            return;
        }
        if ((this.b.g() instanceof h) && this.h != null) {
            ((h) this.b.g()).a(this.h);
        }
        Map<String, Object> m = this.h.m();
        if (m != null) {
            this.b.d = m;
        }
        Map<String, String> n = this.h.n();
        if (m != null) {
            this.b.e = n;
        }
    }
}
