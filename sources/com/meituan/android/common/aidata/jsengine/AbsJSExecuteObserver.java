package com.meituan.android.common.aidata.jsengine;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class AbsJSExecuteObserver {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String bundleName;
    private boolean mDebug;

    public abstract void onFail(Exception exc);

    public abstract void onSuccess(Object obj);

    public AbsJSExecuteObserver() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5355e658e47cc2c2f367d1005a4d05a8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5355e658e47cc2c2f367d1005a4d05a8");
        } else {
            this.mDebug = false;
        }
    }

    public String getBundleName() {
        return this.bundleName;
    }

    public void setBundleName(String str) {
        this.bundleName = str;
    }

    public boolean isDebug() {
        return this.mDebug;
    }

    public void setDebug(boolean z) {
        this.mDebug = z;
    }
}
