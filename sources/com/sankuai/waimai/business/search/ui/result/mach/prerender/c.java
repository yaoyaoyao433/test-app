package com.sankuai.waimai.business.search.ui.result.mach.prerender;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.search.ui.SearchShareData;
import com.sankuai.waimai.mach.lifecycle.c;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public com.sankuai.waimai.mach.recycler.c b;
    public a c;
    private Context d;
    private ViewGroup e;
    private SearchShareData f;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public enum a {
        SHOW,
        HIDE;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54e3395bf55d7ece04704fdc3a00b98a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54e3395bf55d7ece04704fdc3a00b98a");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ad453e54ef8857fcb4e0a6a88faabe84", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ad453e54ef8857fcb4e0a6a88faabe84") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ea0c1038068c06241a6cc0e1d8490c59", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ea0c1038068c06241a6cc0e1d8490c59") : (a[]) values().clone();
        }
    }

    public c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cdd4fd841b350b6ac555fc310e6d44bc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cdd4fd841b350b6ac555fc310e6d44bc");
            return;
        }
        this.c = a.HIDE;
        this.d = context;
        this.f = SearchShareData.a(this.d);
    }

    public final View a(ViewGroup viewGroup, boolean z) {
        Object[] objArr = {viewGroup, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "183207b99e9bc3f820fe36a375e2d768", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "183207b99e9bc3f820fe36a375e2d768");
        }
        View inflate = LayoutInflater.from(this.d).inflate(R.layout.wm_nox_search_layout_common_mach_block, viewGroup, true);
        this.e = (ViewGroup) inflate.findViewById(R.id.common_mach_container);
        return inflate;
    }

    public final void a(int i, @NonNull com.sankuai.waimai.mach.recycler.c cVar) {
        Object[] objArr = {-1, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb3eb320be7533e00b1a967a4f9e403b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb3eb320be7533e00b1a967a4f9e403b");
        } else if (this.b == null || this.b != cVar) {
            com.sankuai.waimai.mach.recycler.b bVar = SearchShareData.s;
            cVar.a("mach_extra_key_index", -1);
            bVar.a(cVar);
            bVar.a(this.e, cVar, bVar.a(cVar.a()));
            this.b = cVar;
        }
    }

    public final void a(boolean z, c.a aVar) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f757ae279757d6c7f0340ac778c73e51", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f757ae279757d6c7f0340ac778c73e51");
        } else if (this.b != null) {
            a(this.b.b(), z, aVar);
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13136c7b3d66915e2df5a47567e081e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13136c7b3d66915e2df5a47567e081e4");
        } else if (this.b == null || this.b.b() == null || this.b.b().f == null) {
        } else {
            this.e.postDelayed(new Runnable() { // from class: com.sankuai.waimai.business.search.ui.result.mach.prerender.c.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5610d0d953a92ac8a2c469f1ecb341af", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5610d0d953a92ac8a2c469f1ecb341af");
                    } else if (c.this.b == null || c.this.b.b() == null || c.this.b.b().f == null) {
                    } else {
                        c.this.b.b().f.onExpose(c.this.b.b());
                    }
                }
            }, 500L);
        }
    }

    private void a(com.sankuai.waimai.mach.node.a aVar, boolean z, c.a aVar2) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64c260c165ade3686123bcb791c7c846", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64c260c165ade3686123bcb791c7c846");
        } else if (aVar != null) {
            com.sankuai.waimai.mach.component.base.a<HostViewType> aVar3 = aVar.h;
            if (aVar3 instanceof com.sankuai.waimai.mach.lifecycle.c) {
                com.sankuai.waimai.mach.lifecycle.c cVar = (com.sankuai.waimai.mach.lifecycle.c) aVar3;
                if (aVar2 == c.a.CONTAINER) {
                    cVar.b(z);
                } else if (aVar2 == c.a.PAGE) {
                    cVar.a(z);
                }
            } else if (aVar.j()) {
                for (com.sankuai.waimai.mach.node.a aVar4 : aVar.b()) {
                    a(aVar4, z, aVar2);
                }
            }
        }
    }
}
