package com.meituan.android.common.fingerprint.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.File;
import java.io.FileFilter;
import java.lang.invoke.LambdaForm;
/* loaded from: classes2.dex */
public final /* synthetic */ class CommonFingerItemCache$$Lambda$1 implements FileFilter {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final CommonFingerItemCache$$Lambda$1 instance = new CommonFingerItemCache$$Lambda$1();

    @Override // java.io.FileFilter
    @LambdaForm.Hidden
    public final boolean accept(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2944222f872d84f808e7bdf227aa871b", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2944222f872d84f808e7bdf227aa871b")).booleanValue() : CommonFingerItemCache.lambda$getCpuCore$0(file);
    }
}
