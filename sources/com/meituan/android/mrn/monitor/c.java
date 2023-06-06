package com.meituan.android.mrn.monitor;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import com.meituan.android.mrn.utils.FsRenderTimeBean;
import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public FsRenderTimeBean b;
    public boolean c;
    public MetricsSpeedMeterTask d;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "054390be748fcf06a1eaf97f0aa4a7ef", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "054390be748fcf06a1eaf97f0aa4a7ef");
            return;
        }
        this.b = new FsRenderTimeBean();
        this.c = false;
    }

    public c(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "611238370b64fc48ae4c28b311560db1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "611238370b64fc48ae4c28b311560db1");
            return;
        }
        this.b = new FsRenderTimeBean();
        this.c = false;
        Object[] objArr2 = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a5d0ab1a7fadf8eef7c1d2219bb5ddcb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a5d0ab1a7fadf8eef7c1d2219bb5ddcb");
            return;
        }
        this.c = true;
        this.b.startTime = System.currentTimeMillis();
        this.b.bundleName = str;
        this.b.componentName = str2;
        this.b.bundleDidDownloadTime = 0L;
        this.b.jSEngineDidInitTime = 0L;
        this.b.bundleDidLoadTime = 0L;
        this.b.renderStartTime = 0L;
        this.b.fCPTime = 0L;
        this.b.fsRenderTime = 0L;
        this.b.interactionTime = 0L;
        this.b.customTime = 0L;
        this.b.viewTreeChangedTime = 0L;
        this.b.fmpTreeNode = 0L;
        this.b.interactionTimeTreeNode = 0L;
        this.b.fmpByWhat = 0;
        this.b.routerPath = "";
        this.d = MetricsSpeedMeterTask.createCustomSpeedMeterTask("MRNContainerPageFullLoad");
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb8b3cb8e337be67c88934ecd3d93a69", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb8b3cb8e337be67c88934ecd3d93a69");
            return;
        }
        this.b.fsRenderTime = System.currentTimeMillis();
        this.b.routerPath = d();
        com.meituan.hotel.android.hplus.diagnoseTool.b.b();
        a(this.b.fsRenderTime);
        if (this.d != null) {
            this.d.recordStep("fsRender");
        }
    }

    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a3bc751fc127e8d8417a5206bc76871", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a3bc751fc127e8d8417a5206bc76871")).booleanValue() : this.b.interactionTime > 0;
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04681ed4bdf5d070f5dd830439dfafef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04681ed4bdf5d070f5dd830439dfafef");
            return;
        }
        if (this.b.interactionTime == 0) {
            this.b.interactionTime = this.b.viewTreeChangedTime;
            boolean z = i.b;
            com.meituan.hotel.android.hplus.diagnoseTool.b.b();
        }
        if (this.d != null) {
            this.d.recordStep("interaction");
        }
    }

    private String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c36ddbe59e9857b66e82195133d4ea6", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c36ddbe59e9857b66e82195133d4ea6");
        }
        ArrayList<WeakReference<Activity>> arrayList = com.meituan.android.mrn.router.c.a().b;
        if (arrayList == null || arrayList.size() == 0) {
            return "";
        }
        List<WeakReference<Activity>> subList = arrayList.subList(Math.max(0, arrayList.size() - 4), arrayList.size() - 1);
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < subList.size(); i++) {
            WeakReference<Activity> weakReference = subList.get(i);
            if (weakReference != null && weakReference.get() != null) {
                arrayList2.add(a(weakReference.get()));
            }
        }
        return TextUtils.join(CommonConstant.Symbol.COMMA, arrayList2);
    }

    private String a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42951204ef02b2df772ad10872c2f8ff", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42951204ef02b2df772ad10872c2f8ff");
        }
        if (activity == null) {
            return "";
        }
        if (activity.getIntent() != null && activity.getIntent().getData() != null) {
            Uri data = activity.getIntent().getData();
            String queryParameter = data.getQueryParameter("mrn_entry");
            String queryParameter2 = data.getQueryParameter("mrn_component");
            return (TextUtils.isEmpty(queryParameter2) || TextUtils.isEmpty(queryParameter)) ? data.getPath() : String.format("%s_%s", queryParameter, queryParameter2);
        }
        return activity.getClass().getSimpleName();
    }

    private void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e051e1abca574565ce4318098444bf81", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e051e1abca574565ce4318098444bf81");
        } else {
            boolean z = i.b;
        }
    }

    public static boolean a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4acc9c761d3a28e378b5d4f9bf6b8b96", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4acc9c761d3a28e378b5d4f9bf6b8b96")).booleanValue();
        }
        if (com.meituan.android.mrn.config.horn.g.b.a() != null && !TextUtils.isEmpty(str)) {
            for (String str3 : com.meituan.android.mrn.config.horn.g.b.a()) {
                if (str.equals(str3)) {
                    return true;
                }
            }
        }
        return false;
    }
}
