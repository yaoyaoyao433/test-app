package com.meituan.msc.modules.api.msi.embed;

import android.support.annotation.Nullable;
import com.meituan.msc.modules.container.q;
import com.meituan.msc.modules.engine.h;
import com.meituan.msc.modules.page.embeddedwidget.e;
import com.meituan.msc.modules.page.embeddedwidget.i;
import com.meituan.msc.modules.page.embeddedwidget.k;
import com.meituan.msc.modules.page.view.d;
import com.meituan.msc.modules.reporter.g;
import com.meituan.msi.view.c;
import com.meituan.msi.view.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a implements com.meituan.msi.view.a {
    public static ChangeQuickRedirect a;
    private h b;

    public a(h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87ffe09baa5667bb1c0e45ba8b8073b7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87ffe09baa5667bb1c0e45ba8b8073b7");
        } else {
            this.b = hVar;
        }
    }

    @Override // com.meituan.msi.view.a
    public final void a(final c cVar, final f fVar, final com.meituan.msi.view.b bVar) {
        Object[] objArr = {cVar, fVar, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fe3a862857b955e6acd252c109148d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fe3a862857b955e6acd252c109148d2");
        } else if (cVar == null || fVar == null) {
            if (bVar != null) {
                bVar.a("view or viewInfo is null", null);
            }
        } else {
            final i iVar = new i();
            final int i = fVar.b;
            iVar.b = new e() { // from class: com.meituan.msc.modules.api.msi.embed.a.1
                @Override // com.meituan.msc.modules.page.embeddedwidget.e
                public final String a() {
                    return fVar.a;
                }

                @Override // com.meituan.msc.modules.page.embeddedwidget.e
                public final String b() {
                    return fVar.d;
                }

                @Override // com.meituan.msc.modules.page.embeddedwidget.e
                public final int c() {
                    return i;
                }

                @Override // com.meituan.msc.modules.page.embeddedwidget.e
                public final String d() {
                    return fVar.c;
                }
            };
            k.a(iVar, new com.meituan.msc.common.framework.a<Void>() { // from class: com.meituan.msc.modules.api.msi.embed.a.2
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msc.common.framework.a
                public final /* synthetic */ void a(Void r21) {
                    Object[] objArr2 = {r21};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b5be7224888ae31401fbe240917274bc", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b5be7224888ae31401fbe240917274bc");
                        return;
                    }
                    i iVar2 = iVar;
                    b bVar2 = new b(cVar);
                    Object[] objArr3 = {bVar2};
                    ChangeQuickRedirect changeQuickRedirect3 = i.a;
                    if (PatchProxy.isSupport(objArr3, iVar2, changeQuickRedirect3, false, "1a474552c7acfd7ff4c35b5dd7fbf2a5", RobustBitConfig.DEFAULT_VALUE)) {
                        i iVar3 = (i) PatchProxy.accessDispatch(objArr3, iVar2, changeQuickRedirect3, false, "1a474552c7acfd7ff4c35b5dd7fbf2a5");
                    } else {
                        iVar2.d = bVar2;
                        bVar2.a(iVar2);
                    }
                    if (bVar != null) {
                        bVar.a();
                    }
                }

                @Override // com.meituan.msc.common.framework.a
                public final void a(String str, Exception exc) {
                    Object[] objArr2 = {str, exc};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "56f3ceaab89085a57997f3f654d8759a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "56f3ceaab89085a57997f3f654d8759a");
                    } else if (bVar != null) {
                        bVar.a(str, exc);
                    }
                }

                @Override // com.meituan.msc.common.framework.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5757bcf3f4e16f2fdbf74a11284dc19a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5757bcf3f4e16f2fdbf74a11284dc19a");
                    } else if (bVar != null) {
                        bVar.a("cancel", null);
                    }
                }
            }, b(i));
        }
    }

    @Override // com.meituan.msi.view.a
    public final boolean a(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ab41186d432bda2464468293301efe3", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ab41186d432bda2464468293301efe3")).booleanValue() : (cVar == null || !(cVar.getSlWidget() instanceof i) || ((i) cVar.getSlWidget()).c == null) ? false : true;
    }

    @Override // com.meituan.msi.view.a
    public final void a(c cVar, final com.meituan.msi.view.b bVar) {
        Object[] objArr = {cVar, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "285f419973302159d4cc0e833413aff5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "285f419973302159d4cc0e833413aff5");
        } else if (cVar == null) {
            if (bVar != null) {
                bVar.a("view is null ", null);
            }
        } else {
            Object slWidget = cVar.getSlWidget();
            if (slWidget instanceof i) {
                i iVar = (i) slWidget;
                k.a(iVar, new com.meituan.msc.common.framework.a<Void>() { // from class: com.meituan.msc.modules.api.msi.embed.a.3
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.msc.common.framework.a
                    public final /* synthetic */ void a(Void r12) {
                        Object[] objArr2 = {r12};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "112925d5d090115e69d33d2da6f8ecd8", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "112925d5d090115e69d33d2da6f8ecd8");
                            return;
                        }
                        g.d("MSCMsiEmbed", "updateCoverView rebind client success");
                        if (bVar != null) {
                            bVar.a();
                        }
                    }

                    @Override // com.meituan.msc.common.framework.a
                    public final void a(String str, Exception exc) {
                        Object[] objArr2 = {str, exc};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1ef1deef4c7b2bb1d5199c54c0e3f998", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1ef1deef4c7b2bb1d5199c54c0e3f998");
                            return;
                        }
                        g.d("MSCMsiEmbed", "updateCoverView rebind client failed");
                        if (bVar != null) {
                            bVar.a(str, exc);
                        }
                    }

                    @Override // com.meituan.msc.common.framework.a
                    public final void a() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5bd7444184bc4ad616f3a398b189c2d9", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5bd7444184bc4ad616f3a398b189c2d9");
                        } else if (bVar != null) {
                            bVar.a("cancel", null);
                        }
                    }
                }, b(iVar.c()));
            } else if (bVar != null) {
                bVar.a("MPWidget is not match", null);
            }
        }
    }

    @Override // com.meituan.msi.view.a
    public final boolean a(String str, int i) {
        d dVar;
        com.meituan.msc.modules.page.render.webview.c B;
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd5913fe8fe1874a23382c6d7baefd24", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd5913fe8fe1874a23382c6d7baefd24")).booleanValue();
        }
        com.meituan.msc.modules.page.e a2 = a(i);
        if (a2 != null && (dVar = (d) a2.b()) != null) {
            com.meituan.msc.modules.page.render.d renderer = dVar.getRenderer();
            if ((renderer instanceof com.meituan.msc.modules.page.render.webview.e) && (B = ((com.meituan.msc.modules.page.render.webview.e) renderer).B()) != null) {
                return com.meituan.msc.modules.page.embeddedwidget.b.a(B.getWebView());
            }
        }
        return false;
    }

    @Nullable
    private com.meituan.msc.modules.page.e a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52c72b6521ad5ef2f0d67fa53d1b2a90", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msc.modules.page.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52c72b6521ad5ef2f0d67fa53d1b2a90");
        }
        q b = this.b.b();
        if (b != null) {
            return b.b(i);
        }
        return null;
    }

    private com.meituan.msc.modules.page.render.a b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e14b7cad008532834d64fea219c45c7c", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msc.modules.page.render.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e14b7cad008532834d64fea219c45c7c");
        }
        com.meituan.msc.modules.page.e a2 = a(i);
        if (a2 == null) {
            return null;
        }
        return a2.l();
    }
}
