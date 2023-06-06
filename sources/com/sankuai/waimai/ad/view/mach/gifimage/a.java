package com.sankuai.waimai.ad.view.mach.gifimage;

import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.ad.view.mach.tierslide.d;
import com.sankuai.waimai.mach.component.c;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends c implements com.sankuai.waimai.ad.view.mach.tierslide.b {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.ad.view.mach.tierslide.b
    public final String d() {
        return "wm-gif-image";
    }

    @Override // com.sankuai.waimai.mach.component.c, com.sankuai.waimai.mach.component.base.a
    @NonNull
    /* renamed from: a */
    public final com.sankuai.waimai.mach.widget.c b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3aebfd0ae1c5dbc85267d9608c95fae", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.mach.widget.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3aebfd0ae1c5dbc85267d9608c95fae") : new b(context);
    }

    @Override // com.sankuai.waimai.ad.view.mach.tierslide.b
    public final void ab_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c1748b820ec3352b9f45cb0222ca5b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c1748b820ec3352b9f45cb0222ca5b5");
        } else {
            a(0);
        }
    }

    @Override // com.sankuai.waimai.ad.view.mach.tierslide.b
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6cc96b63a4fc632ac7f001fdff443230", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6cc96b63a4fc632ac7f001fdff443230");
            return;
        }
        com.sankuai.waimai.mach.widget.c cVar = (com.sankuai.waimai.mach.widget.c) this.o;
        if (cVar != null && (cVar instanceof b)) {
            ((b) cVar).a();
        }
    }

    @Override // com.sankuai.waimai.ad.view.mach.tierslide.b
    public final void aa_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32a06dfbc90eec283d9531e416d74d4d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32a06dfbc90eec283d9531e416d74d4d");
            return;
        }
        com.sankuai.waimai.mach.widget.c cVar = (com.sankuai.waimai.mach.widget.c) this.o;
        if (cVar != null && (cVar instanceof b)) {
            b bVar = (b) cVar;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "dea82eb58c92ccb957440377279a371a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "dea82eb58c92ccb957440377279a371a");
                return;
            }
            bVar.b = true;
            bVar.b();
        }
    }

    @Override // com.sankuai.waimai.ad.view.mach.tierslide.b
    public final boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63de13b971ba0f60427544b50804a2e3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63de13b971ba0f60427544b50804a2e3")).booleanValue();
        }
        com.sankuai.waimai.mach.widget.c cVar = (com.sankuai.waimai.mach.widget.c) this.o;
        if (cVar instanceof b) {
            return ((b) cVar).getGifPlayState();
        }
        return false;
    }

    @Override // com.sankuai.waimai.ad.view.mach.tierslide.b
    public final long a(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6930ddf2afe9b3a741f61b90dbb4805f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6930ddf2afe9b3a741f61b90dbb4805f")).longValue();
        }
        if (dVar == null) {
            return 0L;
        }
        return dVar.h;
    }
}
