package com.meituan.android.aurora;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class AuroraUITask extends AuroraTask {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.meituan.android.aurora.IAuroraTask
    public List<String> beforeTaskNames() {
        return null;
    }

    @Override // com.meituan.android.aurora.IAuroraTask
    public boolean isAnchors() {
        return true;
    }

    @Override // com.meituan.android.aurora.IAuroraTask
    public final boolean isAsyncTask() {
        return false;
    }

    public AuroraUITask(String str) {
        super(str);
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7a4356e09c2b99b7fff81317f4bc9886", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7a4356e09c2b99b7fff81317f4bc9886");
        }
    }

    public AuroraUITask(String str, int i) {
        super(str, i);
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e52c1c17e7d0d30a148f5e6898d18feb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e52c1c17e7d0d30a148f5e6898d18feb");
        }
    }
}
