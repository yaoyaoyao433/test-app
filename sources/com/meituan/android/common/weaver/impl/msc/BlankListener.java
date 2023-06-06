package com.meituan.android.common.weaver.impl.msc;

import android.support.annotation.GuardedBy;
import android.view.View;
import com.meituan.android.common.weaver.impl.ErrorReporter;
import com.meituan.android.common.weaver.impl.blank.Blanks;
import com.meituan.msc.common.lib.IWhiteScreenCheckReporter;
import com.meituan.msc.common.lib.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.WeakHashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class BlankListener implements IWhiteScreenCheckReporter {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final ErrorReporter mscReporter = new ErrorReporter("blank", 2);
    @GuardedBy("this")
    private final WeakHashMap<View, Boolean> cache;

    public BlankListener() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e82ab1f1c92333ff4d7c1e00199c698c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e82ab1f1c92333ff4d7c1e00199c698c");
        } else {
            this.cache = new WeakHashMap<>();
        }
    }

    @Override // com.meituan.msc.common.lib.IWhiteScreenCheckReporter
    public void pageResume(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "675d0d6abaed40e7fc16b594b8f59cce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "675d0d6abaed40e7fc16b594b8f59cce");
        } else if (dVar.i == null || dVar.f == null || !Blanks.sEnable) {
        } else {
            try {
                if (Blanks.getInstance().onlyMSCCreate()) {
                    synchronized (this) {
                        if (this.cache.containsKey(dVar.f)) {
                            return;
                        }
                        this.cache.put(dVar.f, Boolean.TRUE);
                    }
                }
                MSCParam fromBlank = MSCParam.fromBlank(dVar);
                Blanks.getInstance().scheduleContainerDetector(dVar.i, fromBlank.pageUrl, new MSCPagePathHelper(fromBlank, MSCRouteListener.pagePath(fromBlank)), dVar.f);
            } catch (Throwable th) {
                mscReporter.report(th);
            }
        }
    }

    @Override // com.meituan.msc.common.lib.IWhiteScreenCheckReporter
    public void pagePause(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "198a4b8791367885d7d6bb9723b7b9f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "198a4b8791367885d7d6bb9723b7b9f8");
        } else if (Blanks.sEnable) {
            try {
                Blanks.getInstance().scheduleContainerStop(dVar.i, dVar.a);
            } catch (Throwable th) {
                mscReporter.report(th);
            }
        }
    }
}
