package com.meituan.mmp.lib.msi.embed;

import com.meituan.mmp.lib.embeddedwidget.e;
import com.meituan.mmp.lib.embeddedwidget.i;
import com.meituan.mmp.lib.embeddedwidget.k;
import com.meituan.mmp.lib.engine.m;
import com.meituan.msi.view.c;
import com.meituan.msi.view.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a implements com.meituan.msi.view.a {
    public static ChangeQuickRedirect a;
    private m b;

    public a(m mVar) {
        Object[] objArr = {mVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9a6965436a61380044b4b9e18965cf8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9a6965436a61380044b4b9e18965cf8");
        } else {
            this.b = mVar;
        }
    }

    @Override // com.meituan.msi.view.a
    public final void a(final c cVar, final f fVar, final com.meituan.msi.view.b bVar) {
        Object[] objArr = {cVar, fVar, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b530efbdd30dfd8d1ddb3446cc5b00f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b530efbdd30dfd8d1ddb3446cc5b00f");
        } else if (cVar == null || fVar == null) {
            if (bVar != null) {
                bVar.a("view or viewInfo is null", null);
            }
        } else {
            final i iVar = new i();
            final int i = fVar.b;
            iVar.b = new e() { // from class: com.meituan.mmp.lib.msi.embed.a.1
                @Override // com.meituan.mmp.lib.embeddedwidget.e
                public final String a() {
                    return fVar.a;
                }

                @Override // com.meituan.mmp.lib.embeddedwidget.e
                public final String b() {
                    return fVar.d;
                }

                @Override // com.meituan.mmp.lib.embeddedwidget.e
                public final int c() {
                    return i;
                }

                @Override // com.meituan.mmp.lib.embeddedwidget.e
                public final String d() {
                    return fVar.c;
                }
            };
            k.a(iVar, new com.meituan.mmp.main.a<Void>() { // from class: com.meituan.mmp.lib.msi.embed.a.2
                public static ChangeQuickRedirect a;

                @Override // com.meituan.mmp.main.a
                public final /* synthetic */ void a(Void r11) {
                    Object[] objArr2 = {null};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ff3af1d8c862e951a211abc44a9e6917", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ff3af1d8c862e951a211abc44a9e6917");
                        return;
                    }
                    iVar.a(new b(cVar));
                    if (bVar != null) {
                        bVar.a();
                    }
                }

                @Override // com.meituan.mmp.main.a
                public final void a(String str, Exception exc) {
                    Object[] objArr2 = {str, exc};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "68e6d2e022303e361090f690fc05a167", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "68e6d2e022303e361090f690fc05a167");
                    } else if (bVar != null) {
                        bVar.a(str, exc);
                    }
                }
            }, a(i));
        }
    }

    @Override // com.meituan.msi.view.a
    public final boolean a(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aab8c5d40fc5b05033447850281d7201", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aab8c5d40fc5b05033447850281d7201")).booleanValue();
        }
        if (cVar != null && (cVar.getSlWidget() instanceof i)) {
            return ((i) cVar.getSlWidget()).g();
        }
        return false;
    }

    @Override // com.meituan.msi.view.a
    public final void a(c cVar, final com.meituan.msi.view.b bVar) {
        Object[] objArr = {cVar, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aeabd8f59ed5c5a2c55140ab96ddb2af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aeabd8f59ed5c5a2c55140ab96ddb2af");
        } else if (cVar == null || !(cVar.getSlWidget() instanceof i)) {
            if (bVar != null) {
                bVar.a("view is null ", null);
            }
        } else {
            i iVar = cVar.getSlWidget() instanceof i ? (i) cVar.getSlWidget() : null;
            if (iVar == null) {
                bVar.a("MPWidget is not match", null);
            } else {
                k.a(iVar, new com.meituan.mmp.main.a<Void>() { // from class: com.meituan.mmp.lib.msi.embed.a.3
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.mmp.main.a
                    public final /* synthetic */ void a(Void r11) {
                        Object[] objArr2 = {null};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "07095506407d0472fdeaddb4d3490795", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "07095506407d0472fdeaddb4d3490795");
                            return;
                        }
                        com.meituan.mmp.lib.trace.b.c("updateCoverView rebind client success");
                        if (bVar != null) {
                            bVar.a();
                        }
                    }

                    @Override // com.meituan.mmp.main.a
                    public final void a(String str, Exception exc) {
                        Object[] objArr2 = {str, exc};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a1b33f4e448834c24b589731a1aded0f", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a1b33f4e448834c24b589731a1aded0f");
                            return;
                        }
                        com.meituan.mmp.lib.trace.b.c("updateCoverView rebind client failed");
                        if (bVar != null) {
                            bVar.a(str, exc);
                        }
                    }
                }, a(iVar.c()));
            }
        }
    }

    @Override // com.meituan.msi.view.a
    public final boolean a(String str, int i) {
        com.meituan.mmp.lib.page.e a2;
        com.meituan.mmp.lib.page.view.b webView;
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e2dc84e5304c9c2a4412235ffe2221b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e2dc84e5304c9c2a4412235ffe2221b")).booleanValue();
        }
        if (this.b == null || (a2 = this.b.a(i)) == null || (webView = a2.getWebView()) == null) {
            return false;
        }
        return com.meituan.mmp.lib.embeddedwidget.b.a(webView.getWebView());
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.meituan.mmp.lib.trace.h a(int r12) {
        /*
            r11 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            r8 = 0
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.mmp.lib.msi.embed.a.a
            java.lang.String r10 = "8a82496e5583cb31e0f20fbca2f423f6"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L22
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r0, r11, r9, r8, r10)
            com.meituan.mmp.lib.trace.h r12 = (com.meituan.mmp.lib.trace.h) r12
            return r12
        L22:
            com.meituan.mmp.lib.engine.m r0 = r11.b
            r1 = 0
            if (r0 != 0) goto L28
            return r1
        L28:
            r0 = -1
            if (r12 == r0) goto L40
            com.meituan.mmp.lib.engine.m r0 = r11.b
            com.meituan.mmp.lib.page.e r0 = r0.a(r12)
            if (r0 == 0) goto L38
            com.meituan.mmp.lib.engine.AppPage r12 = r0.a(r12)
            goto L39
        L38:
            r12 = r1
        L39:
            if (r12 == 0) goto L40
            com.meituan.mmp.lib.trace.h r12 = r12.r()
            goto L41
        L40:
            r12 = r1
        L41:
            if (r12 == 0) goto L44
            return r12
        L44:
            com.meituan.mmp.lib.engine.m r12 = r11.b
            com.meituan.mmp.lib.config.a r12 = r12.d
            if (r12 == 0) goto L51
            com.meituan.mmp.lib.engine.m r12 = r11.b
            com.meituan.mmp.lib.config.a r12 = r12.d
            com.meituan.mmp.lib.trace.h r12 = r12.h
            return r12
        L51:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.mmp.lib.msi.embed.a.a(int):com.meituan.mmp.lib.trace.h");
    }
}
