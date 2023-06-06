package com.meituan.android.customerservice.cscallsdk.inner;

import com.meituan.android.customerservice.cscallsdk.state.CallStateMachine;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class d implements com.meituan.android.customerservice.callbase.protohelper.c {
    public static ChangeQuickRedirect a;
    private CallStateMachine b;
    private com.meituan.android.customerservice.cscallsdk.controllor.a c;

    public d(CallStateMachine callStateMachine, com.meituan.android.customerservice.cscallsdk.controllor.a aVar) {
        Object[] objArr = {callStateMachine, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08b7e623004e0ec689e70a7ce4a881e5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08b7e623004e0ec689e70a7ce4a881e5");
            return;
        }
        this.b = callStateMachine;
        this.c = aVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0063, code lost:
        if (r31.equals(com.meituan.android.customerservice.callbase.bean.proto.CSCallUris.SVID_CALL_RING) != false) goto L11;
     */
    @Override // com.meituan.android.customerservice.callbase.protohelper.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r31, java.lang.String r32) {
        /*
            Method dump skipped, instructions count: 1300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.customerservice.cscallsdk.inner.d.a(java.lang.String, java.lang.String):void");
    }
}
