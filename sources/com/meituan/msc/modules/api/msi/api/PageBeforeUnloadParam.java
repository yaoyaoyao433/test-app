package com.meituan.msc.modules.api.msi.api;

import com.meituan.msc.modules.container.b;
import com.meituan.msc.modules.container.p;
import com.meituan.msc.modules.engine.h;
import com.meituan.msc.modules.page.c;
import com.meituan.msc.modules.page.e;
import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class PageBeforeUnloadParam {
    public static final String NAVIGATION_ONPAGE_BEFORE_UNLOAD = "onPageBeforeUnload";
    public static final String NAVIGATION_TYPE_EXITMINIPROGRAM = "exitMiniProgram";
    public static final String NAVIGATION_TYPE_NAVIGATEBACK = "navigateBack";
    public static ChangeQuickRedirect changeQuickRedirect;
    public String navigationType;
    public int pageId;

    public PageBeforeUnloadParam(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f23a6193cc8d2aeec4c4e7311d107dd8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f23a6193cc8d2aeec4c4e7311d107dd8");
            return;
        }
        this.pageId = i;
        this.navigationType = str;
    }

    public static void sendOnPageBeforeUnload(e eVar, b.a aVar, c cVar, h hVar) {
        Object[] objArr = {eVar, aVar, cVar, hVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c496f8a4b3c4f4affbcc97ca881d62c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c496f8a4b3c4f4affbcc97ca881d62c1");
            return;
        }
        String str = "navigateBack";
        if (isCurMiniAppHasOnlyOnePage(cVar, hVar) || aVar == b.a.CLOSE) {
            str = NAVIGATION_TYPE_EXITMINIPROGRAM;
        }
        hVar.m.a(NAVIGATION_ONPAGE_BEFORE_UNLOAD, new PageBeforeUnloadParam(eVar.d(), str));
    }

    public static boolean isCurMiniAppHasOnlyOnePage(c cVar, h hVar) {
        boolean z;
        Object[] objArr = {cVar, hVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ba9b354891ea35c882858b7283e020aa", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ba9b354891ea35c882858b7283e020aa")).booleanValue();
        }
        if (cVar.d() <= 1) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = h.a;
            if (PatchProxy.isSupport(objArr2, hVar, changeQuickRedirect3, false, "678663e093afe798385d9850b69de413", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, hVar, changeQuickRedirect3, false, "678663e093afe798385d9850b69de413")).booleanValue();
            } else {
                List<p> d = hVar.b().d();
                z = d == null || d.size() <= 1;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }
}
