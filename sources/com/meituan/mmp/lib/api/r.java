package com.meituan.mmp.lib.api;

import android.annotation.TargetApi;
import android.arch.lifecycle.d;
import android.content.Context;
import android.support.annotation.Nullable;
import android.view.View;
import android.webkit.RenderProcessGoneDetail;
import com.meituan.mmp.lib.LifecycleActivity;
import com.meituan.mmp.lib.trace.b;
import com.meituan.mmp.lib.utils.bb;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.mmp.main.aa;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class r {
    public static ChangeQuickRedirect a;
    private final com.meituan.mmp.lib.engine.m b;

    public r(com.meituan.mmp.lib.engine.m mVar) {
        Object[] objArr = {mVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1356324af479c0cce90ead2eba43b5bd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1356324af479c0cce90ead2eba43b5bd");
        } else {
            this.b = mVar;
        }
    }

    @TargetApi(26)
    public final void a(View view, RenderProcessGoneDetail renderProcessGoneDetail, String str, com.meituan.mmp.lib.web.h hVar) {
        Object[] objArr = {view, renderProcessGoneDetail, str, hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "506550f3967f735cd2f7f0fd1234d779", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "506550f3967f735cd2f7f0fd1234d779");
        } else {
            a(view, renderProcessGoneDetail, str, this.b, hVar);
        }
    }

    public final void a(View view, boolean z, int i, String str, com.meituan.mmp.lib.web.h hVar) {
        Object[] objArr = {view, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), str, hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79bf6c635c88145a29e755c929495987", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79bf6c635c88145a29e755c929495987");
        } else {
            a(view, z, i, str, this.b, hVar);
        }
    }

    @TargetApi(26)
    public static void a(View view, RenderProcessGoneDetail renderProcessGoneDetail, String str, com.meituan.mmp.lib.engine.m mVar, com.meituan.mmp.lib.web.h hVar) {
        Object[] objArr = {view, renderProcessGoneDetail, str, mVar, hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cd471ee9d4c4d715666d52dc043271ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cd471ee9d4c4d715666d52dc043271ae");
        } else {
            a(view, renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit(), str, mVar, hVar);
        }
    }

    private static void a(View view, boolean z, int i, String str, @Nullable com.meituan.mmp.lib.engine.m mVar, @Nullable com.meituan.mmp.lib.web.h hVar) {
        com.meituan.mmp.lib.trace.h hVar2;
        Object[] objArr = {view, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), str, mVar, hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        Boolean bool = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ca66607056110864127a9aad5f9e6d74", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ca66607056110864127a9aad5f9e6d74");
            return;
        }
        Context context = view.getContext();
        bb.b("页面出现问题，重新加载", new Object[0]);
        if (mVar != null) {
            hVar2 = mVar.e;
        } else {
            hVar2 = new com.meituan.mmp.lib.trace.h(context, "unknown");
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("loadedUrl", str);
        hashMap.put("didCrash", Boolean.valueOf(z));
        hashMap.put("rendererPriorityAtExit", Integer.valueOf(i));
        hashMap.put("appForeground", Boolean.valueOf(com.meituan.mmp.a.b.a()));
        hashMap.put("appState", com.meituan.mmp.a.b.d.name());
        if (com.meituan.mmp.lib.config.a.c != null) {
            hashMap.put("webViewType", com.meituan.mmp.lib.config.a.c);
        }
        if (context instanceof LifecycleActivity) {
            LifecycleActivity lifecycleActivity = (LifecycleActivity) context;
            bool = Boolean.valueOf(lifecycleActivity.getLifecycle().a().a(d.b.STARTED));
            hashMap.put("activityForeground", bool);
            hashMap.put("activityState", lifecycleActivity.getLifecycle().a().name());
        }
        hVar2.b("mmp.render.process.gone", (Map<String, Object>) hashMap);
        aa sniffer = MMPEnvHelper.getSniffer();
        String str2 = "onRenderProcessGone " + bool;
        Object[] objArr2 = new Object[2];
        objArr2[0] = mVar != null ? mVar.b : StringUtil.NULL;
        objArr2[1] = str;
        sniffer.a("WebView_Error", str2, String.format("current loaded appId %s Url %s", objArr2), "RenderProcessGoneDetail didCrash " + z + " rendererPriorityAtExit: " + i);
        b.a.b("RenderProcessGone", view + String.format("current loaded Url %s", str) + ", didCrash: " + z + ", rendererPriorityAtExit: " + i);
        if (mVar != null) {
            mVar.j.a(view);
            mVar.i.a(view);
        }
        if (hVar != null) {
            hVar.a(hashMap);
        }
    }
}
