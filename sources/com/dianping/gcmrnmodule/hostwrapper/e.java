package com.dianping.gcmrnmodule.hostwrapper;

import com.facebook.react.modules.core.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/dianping/gcmrnmodule/hostwrapper/MRNModuleUpdateFrameCallback;", "Lcom/facebook/react/modules/core/ChoreographerCompat$FrameCallback;", "hostWrapper", "Lcom/dianping/gcmrnmodule/hostwrapper/MRNModuleBaseHostWrapper;", "(Lcom/dianping/gcmrnmodule/hostwrapper/MRNModuleBaseHostWrapper;)V", "doFrame", "", "frameTimeNanos", "", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class e extends a.AbstractC0145a {
    public static ChangeQuickRedirect a;
    private final a b;

    public e(@NotNull a aVar) {
        h.b(aVar, "hostWrapper");
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f19115a366da863721f32c5e53e8888", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f19115a366da863721f32c5e53e8888");
        } else {
            this.b = aVar;
        }
    }

    @Override // com.facebook.react.modules.core.a.AbstractC0145a
    public final void doFrame(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b1f3524308e237cbec1470450cf4a14", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b1f3524308e237cbec1470450cf4a14");
        } else if (this.b.d) {
            this.b.c();
            this.b.a(false);
        }
    }
}
