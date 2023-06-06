package com.meituan.itc.android.mtnn;

import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e {
    public static ChangeQuickRedirect a;
    long b;
    long c;

    public e(long j, long j2) {
        Object[] objArr = {new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72f43e5795477fb7dd6d61c8a5309509", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72f43e5795477fb7dd6d61c8a5309509");
            return;
        }
        this.b = 0L;
        this.c = 0L;
        this.b = j;
        this.c = j2;
    }

    public final void a() throws Exception {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ada95bb28a486e25eff63a9733ceeae0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ada95bb28a486e25eff63a9733ceeae0");
            return;
        }
        b();
        MTNNNetNative.nativeReshapeSession(this.c, this.b);
    }

    public final f a(String str) throws Exception {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64ff9707b6608b5ab991c369669f9f13", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64ff9707b6608b5ab991c369669f9f13");
        }
        b();
        long nativeGetSessionInput = MTNNNetNative.nativeGetSessionInput(this.c, this.b, str);
        if (0 == nativeGetSessionInput) {
            Log.e("MTNNSession", "Can't find seesion input: " + str);
            return null;
        }
        return new f(nativeGetSessionInput, this.c);
    }

    public final f b(String str) throws Exception {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd48fcd20ada09470cc4d01c65bbf75d", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd48fcd20ada09470cc4d01c65bbf75d");
        }
        b();
        long nativeGetSessionOutput = MTNNNetNative.nativeGetSessionOutput(this.c, this.b, str);
        if (0 == nativeGetSessionOutput) {
            Log.e("MTNNSession", "Can't find seesion output: " + str);
            return null;
        }
        return new f(nativeGetSessionOutput, this.c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() throws Exception {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c318f08507d90dfcc23de3b9e2d11875", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c318f08507d90dfcc23de3b9e2d11875");
        } else if (this.b == 0) {
            throw new RuntimeException("MTNNSession native pointer is null, it may has been released");
        }
    }
}
