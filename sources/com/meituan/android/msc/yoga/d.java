package com.meituan.android.msc.yoga;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class d extends c {
    public static ChangeQuickRedirect b;
    public long c;

    private d(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6ebfccf7489dc938c552e3f58db6c1e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6ebfccf7489dc938c552e3f58db6c1e");
        } else if (j == 0) {
            throw new IllegalStateException("Failed to allocate native memory");
        } else {
            this.c = j;
        }
    }

    public d() {
        this(YogaNative.jni_YGConfigNewJNI());
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f35b9c3643838f1c79eb323eacb96c5c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f35b9c3643838f1c79eb323eacb96c5c");
        }
    }

    @Override // com.meituan.android.msc.yoga.c
    public final void a(boolean z) {
        Object[] objArr = {(byte) 1};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63af496cc8675ff27df227692522c1a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63af496cc8675ff27df227692522c1a8");
        } else {
            YogaNative.jni_YGConfigSetUseWebDefaultsJNI(this.c, true);
        }
    }

    @Override // com.meituan.android.msc.yoga.c
    public final void a(float f) {
        Object[] objArr = {Float.valueOf(0.0f)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39adaaff7e9c033a65342aaea5d43a45", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39adaaff7e9c033a65342aaea5d43a45");
        } else {
            YogaNative.jni_YGConfigSetPointScaleFactorJNI(this.c, 0.0f);
        }
    }
}
