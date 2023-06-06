package com.sankuai.waimai.mach.render;

import android.util.Log;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.mach.g;
import com.sankuai.waimai.mach.utils.e;
import com.sankuai.waimai.mach.utils.j;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d {
    public static ChangeQuickRedirect a;

    public static void a(final Mach mach, ViewGroup viewGroup, com.sankuai.waimai.mach.node.a aVar, final int i) {
        Object[] objArr = {mach, viewGroup, aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5c3b69004a05971bca830997e4a9224e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5c3b69004a05971bca830997e4a9224e");
        } else if (mach == null || viewGroup == null || aVar == null) {
            a(mach, -1, new NullPointerException("container or renderNode is null"));
        } else {
            viewGroup.removeAllViews();
            ViewGroup a2 = j.a(aVar.g());
            if (com.sankuai.waimai.mach.debug.a.a()) {
                viewGroup.addView((ViewGroup) com.sankuai.waimai.mach.debug.a.a(a2, mach.getActivity(), mach.getMachBundle(), mach.getRootNode()));
            } else {
                viewGroup.addView(a2);
            }
            viewGroup.setClipChildren(false);
            if (mach.getRootNode() != null) {
                j.a(viewGroup, aVar.c);
            }
            Iterator<com.sankuai.waimai.mach.component.interf.b> it = mach.getViewTreeObservers().iterator();
            while (it.hasNext()) {
                it.next();
            }
            if (mach.getMachBundle().e()) {
                Mach.getMainHandler().post(new Runnable() { // from class: com.sankuai.waimai.mach.render.d.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "98c7087b6355c72d23361782f1216ba7", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "98c7087b6355c72d23361782f1216ba7");
                            return;
                        }
                        for (g gVar : Mach.this.getRenderListeners()) {
                            gVar.b();
                            gVar.a(i);
                        }
                    }
                });
                return;
            }
            for (g gVar : mach.getRenderListeners()) {
                gVar.b();
                gVar.a(i);
            }
        }
    }

    public static void a(final Mach mach, final Throwable th) {
        Object[] objArr = {mach, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "19f4f7a4166f379c6380e0428b90697a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "19f4f7a4166f379c6380e0428b90697a");
        } else {
            e.a(new Runnable() { // from class: com.sankuai.waimai.mach.render.d.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "159c5cd545a94ac7177b19a2241dd07b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "159c5cd545a94ac7177b19a2241dd07b");
                        return;
                    }
                    for (g gVar : Mach.this.getRenderListeners()) {
                        gVar.a(th);
                    }
                }
            });
        }
    }

    public static void a(final Mach mach, final int i, final Throwable th) {
        Object[] objArr = {mach, Integer.valueOf(i), th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b09ef3fd920ba32a948c130a0773dcea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b09ef3fd920ba32a948c130a0773dcea");
        } else if (mach == null) {
        } else {
            com.sankuai.waimai.mach.manager.cache.e machBundle = mach.getMachBundle();
            if (machBundle != null) {
                com.sankuai.waimai.mach.log.b.b("MachRender", "render error with templates: | BundleVersion: " + machBundle.a(), "templateID:" + machBundle.j, "errorMessage:" + Log.getStackTraceString(th));
            }
            e.a(new Runnable() { // from class: com.sankuai.waimai.mach.render.d.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9626c671d297b62eb580d87e17da108e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9626c671d297b62eb580d87e17da108e");
                        return;
                    }
                    for (g gVar : Mach.this.getRenderListeners()) {
                        if (gVar != null) {
                            gVar.a(i, th);
                        }
                    }
                }
            });
        }
    }

    public static void a(final Mach mach, final com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {mach, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "455e8e2c5431ee3bed68e525d19d781d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "455e8e2c5431ee3bed68e525d19d781d");
        } else if (mach == null || aVar == null) {
        } else {
            e.a(new Runnable() { // from class: com.sankuai.waimai.mach.render.d.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bf569d5675b9cc58cf18cbd2416424cd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bf569d5675b9cc58cf18cbd2416424cd");
                        return;
                    }
                    for (g gVar : Mach.this.getRenderListeners()) {
                        if (gVar != null) {
                            gVar.a(aVar);
                        }
                    }
                }
            });
        }
    }
}
