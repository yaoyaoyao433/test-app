package com.meituan.android.aurora;

import android.app.Application;
import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
@Keep
@Deprecated
/* loaded from: classes2.dex */
public abstract class InitUnions extends Init {
    public static ChangeQuickRedirect changeQuickRedirect;
    public static ProcessSpec spec;
    protected final List<Init> inits;
    protected final BlockingQueue<Init> queue;

    public InitUnions() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "04225dab74b7bf1d47d4ba6c12ae6f93", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "04225dab74b7bf1d47d4ba6c12ae6f93");
            return;
        }
        this.inits = new LinkedList();
        this.queue = new LinkedBlockingQueue();
    }

    public static void setProcessSpec(ProcessSpec processSpec) {
        spec = processSpec;
    }

    public final void registerOnAllProcess(Init init) {
        Object[] objArr = {init};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eebadb1e8b558cdff9f4e07763474b25", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eebadb1e8b558cdff9f4e07763474b25");
        } else if (spec != null) {
            this.inits.add(init);
        }
    }

    public final void registerOnMainProcess(Init init) {
        Object[] objArr = {init};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6a02a97d6f94eba8d5438701b23718cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6a02a97d6f94eba8d5438701b23718cd");
            return;
        }
        ProcessSpec processSpec = spec;
        if (processSpec == null || !processSpec.isProcessMatch("main")) {
            return;
        }
        this.inits.add(init);
    }

    public final void registerOnPushProcess(Init init) {
        Object[] objArr = {init};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cdfb0ca61aa531ffaab586e40d8329ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cdfb0ca61aa531ffaab586e40d8329ef");
            return;
        }
        ProcessSpec processSpec = spec;
        if (processSpec == null || !processSpec.isProcessMatch("push")) {
            return;
        }
        this.inits.add(init);
    }

    public final void registerOnProcess(String str, Init init) {
        Object[] objArr = {str, init};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5c9803b5de20a3b971eb392878b29bf4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5c9803b5de20a3b971eb392878b29bf4");
            return;
        }
        ProcessSpec processSpec = spec;
        if (processSpec == null || !processSpec.isProcessMatch(str)) {
            return;
        }
        this.inits.add(init);
    }

    public /* synthetic */ void lambda$doInit$0(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9e6e5acb47c49a3ac8fef27b7cf52888", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9e6e5acb47c49a3ac8fef27b7cf52888");
        } else {
            onAsyncInit(application);
        }
    }

    public void doInit(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d3c74e433854af52828ce839418a47f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d3c74e433854af52828ce839418a47f4");
            return;
        }
        c.a(tag(), InitUnions$$Lambda$1.lambdaFactory$(this, application)).start();
        onInit(application);
    }

    @Override // com.meituan.android.aurora.Init
    public void onInit(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "077396904b94512cfefc67192de77199", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "077396904b94512cfefc67192de77199");
            return;
        }
        for (Init init : this.inits) {
            try {
                init.onInit(application);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            this.queue.add(init);
        }
    }

    @Override // com.meituan.android.aurora.Init
    public void onAsyncInit(Application application) {
        int i = 0;
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6c055f57d102b91acb5b4496aeb3468e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6c055f57d102b91acb5b4496aeb3468e");
            return;
        }
        int size = this.inits.size();
        while (i < size) {
            Init init = null;
            try {
                init = this.queue.poll(100L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
            }
            if (init != null) {
                i++;
                try {
                    init.onAsyncInit(application);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }
}
