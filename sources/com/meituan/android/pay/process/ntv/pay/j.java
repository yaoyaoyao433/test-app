package com.meituan.android.pay.process.ntv.pay;

import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class j implements com.meituan.android.pay.process.d {
    public static ChangeQuickRedirect a;
    FragmentActivity b;

    @Override // com.meituan.android.pay.process.d
    public final String a() {
        return "PayModeCenter";
    }

    public j(FragmentActivity fragmentActivity) {
        Object[] objArr = {fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0b95ec074fa315755f88c91072a5c6a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0b95ec074fa315755f88c91072a5c6a");
        } else {
            this.b = fragmentActivity;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x01fa, code lost:
        if ("cardpay".equals(r5.getPayType()) == false) goto L71;
     */
    @Override // com.meituan.android.pay.process.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 804
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.pay.process.ntv.pay.j.a(java.lang.Object):void");
    }
}
