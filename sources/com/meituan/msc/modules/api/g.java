package com.meituan.msc.modules.api;

import android.annotation.TargetApi;
import android.arch.lifecycle.d;
import android.content.Context;
import android.support.annotation.Nullable;
import android.view.View;
import android.webkit.RenderProcessGoneDetail;
import com.meituan.msc.common.utils.aw;
import com.meituan.msc.modules.container.LifecycleActivity;
import com.meituan.msc.modules.engine.h;
import com.meituan.msc.modules.page.render.webview.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class g {
    public static ChangeQuickRedirect a;

    @TargetApi(26)
    public static void a(View view, RenderProcessGoneDetail renderProcessGoneDetail, String str, h hVar, i iVar) {
        Object[] objArr = {view, renderProcessGoneDetail, str, hVar, iVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a67ecce695962c69851f0ef1d554f805", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a67ecce695962c69851f0ef1d554f805");
        } else {
            a(view, renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit(), str, hVar, iVar);
        }
    }

    public static void a(View view, boolean z, int i, String str, @Nullable h hVar, @Nullable i iVar) {
        Object[] objArr = {view, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), str, hVar, iVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b1ef789e447e6b9c56ee7b60b573ecc1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b1ef789e447e6b9c56ee7b60b573ecc1");
            return;
        }
        Context context = view.getContext();
        aw.b("页面出现问题，重新加载", new Object[0]);
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("loadedUrl", str);
        hashMap.put("didCrash", Boolean.valueOf(z));
        hashMap.put("rendererPriorityAtExit", Integer.valueOf(i));
        hashMap.put("appForeground", Boolean.valueOf(com.meituan.msc.modules.container.a.b.a()));
        hashMap.put("appState", com.meituan.msc.modules.container.a.b.d.name());
        if (com.meituan.msc.modules.update.f.c != null) {
            hashMap.put("webViewType", com.meituan.msc.modules.update.f.c);
        }
        if (context instanceof LifecycleActivity) {
            LifecycleActivity lifecycleActivity = (LifecycleActivity) context;
            hashMap.put("activityForeground", Boolean.valueOf(lifecycleActivity.getLifecycle().a().a(d.b.STARTED)));
            hashMap.put("activityState", lifecycleActivity.getLifecycle().a().name());
        }
        com.meituan.msc.modules.reporter.g.e("RenderProcessGone", view + String.format("current loaded Url %s", str) + ", didCrash: " + z + ", rendererPriorityAtExit: " + i);
        if (hVar != null) {
            hVar.l.a(view);
            ((com.meituan.msc.modules.engine.c) hVar.c(com.meituan.msc.modules.engine.c.class)).a(view);
        }
        if (iVar != null) {
            iVar.a(hashMap);
        }
    }
}
