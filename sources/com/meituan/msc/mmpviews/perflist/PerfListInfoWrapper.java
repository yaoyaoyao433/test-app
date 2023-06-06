package com.meituan.msc.mmpviews.perflist;

import android.content.Context;
import com.meituan.msc.jse.bridge.queue.MessageQueueThreadSpec;
import com.meituan.msc.mmpviews.perflist.view.PerfListView;
import com.meituan.msc.uimanager.ThemedReactContext;
import com.meituan.msc.uimanager.ab;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PerfListInfoWrapper {
    public static ChangeQuickRedirect a;
    public static final String b = null;
    public Map<String, List<a>> c;
    public Map<a, PerfListView> d;

    public PerfListInfoWrapper() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eda4dbc6f85c1981a9c3cc33bfb71475", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eda4dbc6f85c1981a9c3cc33bfb71475");
            return;
        }
        this.c = new ConcurrentHashMap();
        this.d = new HashMap();
    }

    public final PerfListView a(ThemedReactContext themedReactContext, a aVar, ab abVar) {
        PerfListView perfListView;
        Object[] objArr = {themedReactContext, aVar, abVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "233f6d492d3a167b84e34a278ec38c9d", RobustBitConfig.DEFAULT_VALUE)) {
            return (PerfListView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "233f6d492d3a167b84e34a278ec38c9d");
        }
        synchronized (this.d) {
            perfListView = this.d.get(aVar);
            if (perfListView == null) {
                perfListView = a(themedReactContext, aVar);
            }
            Object[] objArr2 = {themedReactContext, abVar};
            ChangeQuickRedirect changeQuickRedirect2 = PerfListView.j;
            if (PatchProxy.isSupport(objArr2, perfListView, changeQuickRedirect2, false, "3ae5bd01880bf596c6b917182ec54f88", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, perfListView, changeQuickRedirect2, false, "3ae5bd01880bf596c6b917182ec54f88");
            } else {
                perfListView.l = themedReactContext;
                perfListView.m = abVar;
                perfListView.k.b = themedReactContext;
                perfListView.l.addLifecycleEventListener(perfListView.s);
                perfListView.q = themedReactContext.a().generateConfiguration(perfListView.l.getRuntimeDelegate().enableJSErrorFix() ? MessageQueueThreadSpec.mainThreadSpec() : MessageQueueThreadSpec.newBackgroundThreadSpec("js"), MessageQueueThreadSpec.mainThreadSpec());
                perfListView.p = themedReactContext.getUIManagerModule().b();
                themedReactContext.getRuntimeDelegate().addScrollVelocityHelper(perfListView.n);
                perfListView.r = themedReactContext.getRuntimeDelegate().getPerfEventRecorder();
            }
            perfListView.setOverScrollMode(2);
            this.d.put(aVar, null);
        }
        return perfListView;
    }

    public PerfListView a(Context context, a aVar) {
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "839e35470862600b08febcdcae17ac93", RobustBitConfig.DEFAULT_VALUE) ? (PerfListView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "839e35470862600b08febcdcae17ac93") : new PerfListView(context, aVar);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public String b;
        public String c;
        public String d;
        public int e;
        public String f;
        public String g;
        public Boolean h;
        public Boolean i;

        public a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1fdc3f7444b2903214b45dbb25065ecf", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1fdc3f7444b2903214b45dbb25065ecf");
            } else {
                this.b = str;
            }
        }

        public final boolean equals(Object obj) {
            Object[] objArr = {obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5d62e0ffb40cebdbe28706266dabb82", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5d62e0ffb40cebdbe28706266dabb82")).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.e == aVar.e && com.meituan.msc.utils.b.a(this.b, aVar.b) && com.meituan.msc.utils.b.a(this.c, aVar.c) && com.meituan.msc.utils.b.a(this.d, aVar.d) && com.meituan.msc.utils.b.a(this.f, aVar.f) && com.meituan.msc.utils.b.a(this.g, aVar.g) && com.meituan.msc.utils.b.a(this.h, aVar.h) && com.meituan.msc.utils.b.a(this.i, aVar.i);
        }

        public final int hashCode() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19ca26b231f4d0db5809a0652f47d122", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19ca26b231f4d0db5809a0652f47d122")).intValue() : com.meituan.msc.utils.b.a(this.b, this.c, this.d, Integer.valueOf(this.e), this.f, this.g, this.h, this.i);
        }
    }
}
