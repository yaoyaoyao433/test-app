package com.meituan.android.aurora;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class AuroraAsyncTask extends AuroraTask {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.meituan.android.aurora.IAuroraTask
    public List<String> beforeTaskNames() {
        return null;
    }

    @Override // com.meituan.android.aurora.IAuroraTask
    public boolean isAnchors() {
        return false;
    }

    @Override // com.meituan.android.aurora.IAuroraTask
    public final boolean isAsyncTask() {
        return true;
    }

    public AuroraAsyncTask(String str) {
        super(str);
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1a491cf6201468d180c4a83faaa0e9c5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1a491cf6201468d180c4a83faaa0e9c5");
        }
    }

    public AuroraAsyncTask(String str, int i) {
        super(str, i);
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b0f6bdee2e4fe99c842a4523d962b0fb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b0f6bdee2e4fe99c842a4523d962b0fb");
        }
    }
}
