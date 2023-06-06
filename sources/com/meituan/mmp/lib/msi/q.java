package com.meituan.mmp.lib.msi;

import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.gson.JsonObject;
import com.meituan.mmp.lib.page.view.CoverViewWrapper;
import com.meituan.msi.page.ComponentParam;
import com.meituan.msi.page.IPage;
import com.meituan.msi.view.ToastView;
import com.meituan.mtwebkit.MTWebView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class q implements com.meituan.mmp.lib.api.input.textarea.c, IPage {
    public static ChangeQuickRedirect a;
    public com.meituan.mmp.lib.page.e b;
    private com.meituan.msi.page.c c;
    private com.meituan.msi.page.e d;

    @Override // com.meituan.mmp.lib.api.input.textarea.c
    public final void G_() {
    }

    @Override // com.meituan.mmp.lib.api.input.textarea.c
    public final void H_() {
    }

    @Override // com.meituan.mmp.lib.api.input.textarea.c
    public final boolean a(String str) {
        return false;
    }

    @Override // com.meituan.mmp.lib.api.input.textarea.c
    public final void b() {
    }

    @Override // com.meituan.mmp.lib.api.input.textarea.c
    public final void c(int i) {
    }

    public q(com.meituan.mmp.lib.page.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47f2caf00413f898b66396f525c5f7f4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47f2caf00413f898b66396f525c5f7f4");
            return;
        }
        this.c = new com.meituan.msi.page.c() { // from class: com.meituan.mmp.lib.msi.q.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msi.page.c
            public final void a(int i, int i2, boolean z) {
            }

            @Override // com.meituan.msi.page.c
            public final void a(com.meituan.msi.page.d dVar) {
            }

            @Override // com.meituan.msi.page.c
            public final void a(int[] iArr) {
            }

            @Override // com.meituan.msi.page.c
            public final boolean a(com.meituan.msi.page.a aVar, View view, com.meituan.msi.page.b bVar, com.meituan.msi.dispather.e eVar2, ComponentParam componentParam) {
                return false;
            }

            @Override // com.meituan.msi.page.c
            public final int b() {
                return 0;
            }

            @Override // com.meituan.msi.page.c
            public final int a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "88b2ebb108462cd02c36b9bd20341c72", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "88b2ebb108462cd02c36b9bd20341c72")).intValue();
                }
                com.meituan.mmp.lib.page.e eVar2 = q.this.b;
                if (eVar2 != null) {
                    return eVar2.getKeyboardHeight();
                }
                return -1;
            }
        };
        this.d = new com.meituan.msi.page.e() { // from class: com.meituan.mmp.lib.msi.q.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msi.page.e
            public final void a(View view, JsonObject jsonObject) {
                Object[] objArr2 = {view, jsonObject};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b4decbbdd8b94292abc463771911b5b5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b4decbbdd8b94292abc463771911b5b5");
                    return;
                }
                com.meituan.mmp.lib.page.e eVar2 = q.this.b;
                if (eVar2 != null) {
                    int id = view.getId();
                    view.setId(-1);
                    Object[] objArr3 = {view, jsonObject};
                    ChangeQuickRedirect changeQuickRedirect3 = com.meituan.mmp.lib.page.e.a;
                    if (PatchProxy.isSupport(objArr3, eVar2, changeQuickRedirect3, false, "b2fc0db7d21b8a145f16df6e339f882a", RobustBitConfig.DEFAULT_VALUE)) {
                        ((Boolean) PatchProxy.accessDispatch(objArr3, eVar2, changeQuickRedirect3, false, "b2fc0db7d21b8a145f16df6e339f882a")).booleanValue();
                    } else {
                        if (view instanceof com.meituan.mmp.lib.api.input.d) {
                            ((com.meituan.mmp.lib.api.input.d) view).a(eVar2);
                        } else if (view instanceof com.meituan.mmp.lib.api.web.h) {
                            View webView = ((com.meituan.mmp.lib.api.web.h) view).getWebView();
                            if (webView instanceof WebView) {
                                eVar2.e.j = new WeakReference<>((WebView) webView);
                            } else if (webView instanceof MTWebView) {
                                eVar2.e.j = new WeakReference<>((MTWebView) webView);
                            }
                        }
                        com.meituan.mmp.lib.widget.f swipeRefreshLayout = eVar2.getSwipeRefreshLayout();
                        if (swipeRefreshLayout != null) {
                            if (jsonObject.has("mtSinkMode") && jsonObject.get("mtSinkMode").getAsBoolean()) {
                                eVar2.m = true;
                                swipeRefreshLayout.a(true);
                                swipeRefreshLayout.getUnderCoverViewContainer().a(view, jsonObject);
                            } else {
                                swipeRefreshLayout.getCoverViewContainer().a(view, jsonObject);
                            }
                        }
                    }
                    if (view.getParent() instanceof View) {
                        ((View) view.getParent()).setId(id);
                    }
                }
            }

            @Override // com.meituan.msi.page.e
            public final void a(int i, JsonObject jsonObject) {
                Object[] objArr2 = {Integer.valueOf(i), jsonObject};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9a1338f2a79d2e8b76022262b712c065", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9a1338f2a79d2e8b76022262b712c065");
                    return;
                }
                com.meituan.mmp.lib.page.e eVar2 = q.this.b;
                if (eVar2 != null) {
                    eVar2.a(i, jsonObject);
                }
            }

            @Override // com.meituan.msi.page.e
            public final void a(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1f596a83f9b81a47ba14d542a49e5387", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1f596a83f9b81a47ba14d542a49e5387");
                } else if (view == null) {
                } else {
                    View view2 = (View) view.getParent();
                    if (view2 instanceof CoverViewWrapper) {
                        ViewGroup viewGroup = (ViewGroup) view2.getParent();
                        if (viewGroup != null) {
                            viewGroup.removeView(view2);
                        }
                    } else if (view2 instanceof ViewGroup) {
                        ((ViewGroup) view2).removeView(view);
                    }
                }
            }

            @Override // com.meituan.msi.page.e
            public final View a(int i, int i2) {
                CoverViewWrapper c;
                Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4d71bbf84e0244989b609793ccbd40e0", RobustBitConfig.DEFAULT_VALUE)) {
                    return (View) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4d71bbf84e0244989b609793ccbd40e0");
                }
                com.meituan.mmp.lib.page.e eVar2 = q.this.b;
                if (eVar2 == null || (c = eVar2.c(i, i2)) == null) {
                    return null;
                }
                return c.getContent();
            }
        };
        this.b = eVar;
    }

    @Override // com.meituan.msi.page.IPage
    public final com.meituan.msi.page.e getViewGroup() {
        return this.d;
    }

    @Override // com.meituan.msi.page.IPage
    public final com.meituan.msi.page.c getKeyBoard() {
        return this.c;
    }

    @Override // com.meituan.msi.page.IPage
    public final View getAndCreateView(int i, String str, final com.meituan.msi.page.f fVar) {
        com.meituan.mmp.lib.page.e eVar;
        com.meituan.mmp.lib.widget.f swipeRefreshLayout;
        Object[] objArr = {Integer.valueOf(i), str, fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee3d2f6e9f7bb2f79bad557a32eeec93", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee3d2f6e9f7bb2f79bad557a32eeec93");
        }
        if (i != 2 || (eVar = this.b) == null || (swipeRefreshLayout = eVar.getSwipeRefreshLayout()) == null) {
            return null;
        }
        final com.meituan.mmp.lib.page.coverview.c cVar = (com.meituan.mmp.lib.page.coverview.c) swipeRefreshLayout.a(str);
        cVar.f = new com.meituan.mmp.lib.api.coverview.b() { // from class: com.meituan.mmp.lib.msi.q.3
            public static ChangeQuickRedirect a;

            @Override // com.meituan.mmp.lib.api.coverview.b
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "55cac57d13ee8d547303959b792e4c38", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "55cac57d13ee8d547303959b792e4c38");
                } else if (fVar != null) {
                    fVar.a(cVar);
                }
            }
        };
        return cVar;
    }

    @Override // com.meituan.msi.page.IPage
    public final String getPagePath() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45d8baa49caef24bcaeed0d99137ae18", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45d8baa49caef24bcaeed0d99137ae18");
        }
        com.meituan.mmp.lib.page.e eVar = this.b;
        if (eVar != null) {
            return eVar.getPagePath();
        }
        return null;
    }

    @Override // com.meituan.msi.page.IPage
    public final View findView(int i, IPage.a aVar) {
        Object[] objArr = {Integer.valueOf(i), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "deb44115a679dffa485476690dd8fdce", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "deb44115a679dffa485476690dd8fdce");
        }
        com.meituan.mmp.lib.page.e eVar = this.b;
        if (eVar == null || i != 1) {
            return null;
        }
        return eVar.getToastView();
    }

    @Override // com.meituan.msi.page.IPage
    public final void showView(int i, View view, IPage.a aVar) {
        com.meituan.mmp.lib.page.e eVar;
        Object[] objArr = {Integer.valueOf(i), view, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fba496f788bb24976adc4dca2f15159", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fba496f788bb24976adc4dca2f15159");
        } else if (i != 1 || (eVar = this.b) == null) {
        } else {
            Object[] objArr2 = {view};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.mmp.lib.page.e.a;
            if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "a23c416fdc45cee49a21eb905e22660c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "a23c416fdc45cee49a21eb905e22660c");
                return;
            }
            final com.meituan.mmp.lib.page.view.g gVar = eVar.e;
            Object[] objArr3 = {view};
            ChangeQuickRedirect changeQuickRedirect3 = com.meituan.mmp.lib.page.view.g.a;
            if (PatchProxy.isSupport(objArr3, gVar, changeQuickRedirect3, false, "efacbc251534f2462366f8561284d0b3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, gVar, changeQuickRedirect3, false, "efacbc251534f2462366f8561284d0b3");
                return;
            }
            if (gVar.h == null) {
                gVar.h = (ToastView) view;
                gVar.h.setVisibility(8);
            }
            if (gVar.h.getParent() == null) {
                gVar.addView(gVar.h);
            }
            if (gVar.e.i()) {
                gVar.h.setVisibility(0);
            } else {
                gVar.i = new Runnable() { // from class: com.meituan.mmp.lib.page.view.g.4
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "6852845cf17163ab6537eb91cf9275f1", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "6852845cf17163ab6537eb91cf9275f1");
                        } else {
                            gVar.h.setVisibility(0);
                        }
                    }
                };
            }
        }
    }

    @Override // com.meituan.msi.page.IPage
    public final void hideView(int i, View view, IPage.a aVar) {
        com.meituan.mmp.lib.page.e eVar;
        Object[] objArr = {Integer.valueOf(i), view, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b4a48669beec7242a12dcdfd66ab7b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b4a48669beec7242a12dcdfd66ab7b4");
        } else if (i != 1 || (eVar = this.b) == null) {
        } else {
            eVar.m();
        }
    }
}
