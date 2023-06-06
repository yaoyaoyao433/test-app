package com.meituan.android.legwork.monitor.report.channel.model;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public abstract class ReportChannel {
    public static ChangeQuickRedirect changeQuickRedirect;
    protected boolean isReporting;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
        void a(List<Long> list);
    }

    public abstract void reportCachedData(a aVar, int i);

    public ReportChannel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aec9397169358ec2c34de6c3843fac77", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aec9397169358ec2c34de6c3843fac77");
        } else {
            this.isReporting = false;
        }
    }
}
