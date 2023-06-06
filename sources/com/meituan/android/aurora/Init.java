package com.meituan.android.aurora;

import android.app.Application;
import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
@Deprecated
/* loaded from: classes2.dex */
public abstract class Init implements IInit {
    public static ChangeQuickRedirect changeQuickRedirect;
    protected int flags;

    @Override // com.meituan.android.aurora.IInit
    @Deprecated
    public void asyncInit(Application application) {
    }

    @Override // com.meituan.android.aurora.IInit
    @Deprecated
    public void init(Application application) {
    }

    @Override // com.meituan.android.aurora.IInit
    public abstract String tag();

    public void setFlags(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1557d4ef59ba36bc69b721d464108bf3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1557d4ef59ba36bc69b721d464108bf3");
        } else {
            this.flags = i | this.flags;
        }
    }

    public void onInit(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "694861e682b66090016250045a7d206c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "694861e682b66090016250045a7d206c");
        } else {
            init(application);
        }
    }

    public void onAsyncInit(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a6dd5bb96839cb8d98a09604f01be06d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a6dd5bb96839cb8d98a09604f01be06d");
        } else {
            asyncInit(application);
        }
    }
}
