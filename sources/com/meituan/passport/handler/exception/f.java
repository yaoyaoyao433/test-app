package com.meituan.passport.handler.exception;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class f extends c {
    public static ChangeQuickRedirect b;

    public f(Fragment fragment, com.meituan.passport.converter.b bVar) {
        super(fragment, bVar);
        Object[] objArr = {fragment, bVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3010dfa94ce682950806b761e386102", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3010dfa94ce682950806b761e386102");
        }
    }

    public f(FragmentActivity fragmentActivity, com.meituan.passport.converter.b bVar) {
        super(fragmentActivity, bVar);
        Object[] objArr = {fragmentActivity, bVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9a8d9d6a9d37818b888be0173d9a8e9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9a8d9d6a9d37818b888be0173d9a8e9");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0082, code lost:
        if ((r1 instanceof java.security.cert.CertificateExpiredException) == false) goto L37;
     */
    @Override // com.meituan.passport.handler.exception.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Throwable a(java.lang.Throwable r20) {
        /*
            r19 = this;
            r7 = r19
            r8 = r20
            r9 = 1
            java.lang.Object[] r10 = new java.lang.Object[r9]
            r11 = 0
            r10[r11] = r8
            com.meituan.robust.ChangeQuickRedirect r12 = com.meituan.passport.handler.exception.f.b
            java.lang.String r13 = "ad08576f988ec987702eb63c64467b23"
            r3 = 0
            r5 = 4611686018427387904(0x4000000000000000, double:2.0)
            r0 = r10
            r1 = r19
            r2 = r12
            r4 = r13
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L23
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r7, r12, r11, r13)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            return r0
        L23:
            android.support.v4.app.FragmentActivity r0 = r19.b()
            if (r0 == 0) goto Lab
            if (r8 == 0) goto Lab
            java.lang.Class r1 = r19.getClass()
            r7.a(r1, r8)
            com.meituan.passport.exception.monitor.b r1 = com.meituan.passport.exception.monitor.b.a()
            r1.a(r8)
            boolean r1 = r8 instanceof com.sankuai.meituan.retrofit2.exception.c
            r2 = 0
            if (r1 == 0) goto L4d
            r1 = r8
            com.sankuai.meituan.retrofit2.exception.c r1 = (com.sankuai.meituan.retrofit2.exception.c) r1
            int r1 = r1.a()
            r3 = 10
            if (r1 != r3) goto L4d
            r1 = 2131363159(0x7f0a0557, float:1.8346119E38)
            goto L8f
        L4d:
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r1[r11] = r8
            com.meituan.robust.ChangeQuickRedirect r3 = com.meituan.passport.utils.Utils.a
            java.lang.String r4 = "f6f75dd3c7937ee3d83cc7eacf1f6105"
            r13 = 0
            r15 = 1
            r17 = 4611686018427387904(0x4000000000000000, double:2.0)
            r12 = r1
            r14 = r3
            r16 = r4
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17)
            if (r5 == 0) goto L6e
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r9, r4)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r9 = r1.booleanValue()
            goto L86
        L6e:
            if (r8 == 0) goto L85
            r1 = r8
        L71:
            java.lang.Throwable r3 = r1.getCause()
            if (r3 == 0) goto L7c
            java.lang.Throwable r1 = r1.getCause()
            goto L71
        L7c:
            boolean r3 = r1 instanceof java.security.cert.CertificateNotYetValidException
            if (r3 != 0) goto L86
            boolean r1 = r1 instanceof java.security.cert.CertificateExpiredException
            if (r1 == 0) goto L85
            goto L86
        L85:
            r9 = 0
        L86:
            if (r9 == 0) goto L8c
            r1 = 2131363158(0x7f0a0556, float:1.8346117E38)
            goto L8f
        L8c:
            r1 = 2131363280(0x7f0a05d0, float:1.8346364E38)
        L8f:
            java.lang.String r0 = r0.getString(r1)
            com.meituan.passport.converter.b r1 = r19.a()
            if (r1 == 0) goto La7
            com.meituan.passport.exception.ApiException r3 = new com.meituan.passport.exception.ApiException
            java.lang.String r4 = ""
            r3.<init>(r0, r8, r11, r4)
            boolean r1 = r1.a(r3, r11)
            if (r1 != 0) goto La7
            return r2
        La7:
            r7.a(r0)
            return r2
        Lab:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.passport.handler.exception.f.a(java.lang.Throwable):java.lang.Throwable");
    }
}
