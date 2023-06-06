package com.meituan.android.aurora;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class AuroraMainLooperRecord {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int count;
    public String key;
    public int section;
    public long startTime;
    public long time;

    public AuroraMainLooperRecord() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f0603fddde96db641120e6a7d4ecba9d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f0603fddde96db641120e6a7d4ecba9d");
            return;
        }
        this.time = 0L;
        this.startTime = 0L;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1ceffd9e862c30a1a75ad109d44b9a1a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1ceffd9e862c30a1a75ad109d44b9a1a");
        }
        return "Count = " + this.count + " Time = " + this.time + " Key = " + this.key + " StartTime = " + this.startTime + " Section = " + this.section;
    }
}
