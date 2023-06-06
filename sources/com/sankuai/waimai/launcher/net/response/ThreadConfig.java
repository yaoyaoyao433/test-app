package com.sankuai.waimai.launcher.net.response;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.Set;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class ThreadConfig {
    public static ChangeQuickRedirect changeQuickRedirect;
    public boolean asyncTask;
    public boolean enableJarvis;
    public Set<String> excludeThreads;
    public int glideProcessors;
    public boolean okHttp;
    public int poolSizeFactor;
    public int rxComputationThreads;

    public ThreadConfig(boolean z, int i, boolean z2, int i2, boolean z3, int i3, Set<String> set) {
        this.enableJarvis = z;
        this.poolSizeFactor = i;
        this.okHttp = z2;
        this.glideProcessors = i2;
        this.asyncTask = z3;
        this.rxComputationThreads = i3;
        this.excludeThreads = set;
    }
}
