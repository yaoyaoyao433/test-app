package com.meituan.mmp.lib;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Trace;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.meituan.android.recce.props.gens.BorderStyle;
import com.meituan.android.recce.views.anim.RecceAnimUtils;
import com.meituan.hotel.android.hplus.diagnoseTool.DiagnoseLog;
import com.meituan.mmp.lib.aa;
import com.meituan.mmp.lib.engine.AppPage;
import com.meituan.mmp.lib.page.view.g;
import com.meituan.mmp.lib.resume.d;
import com.meituan.mmp.lib.service.IServiceEngine;
import com.meituan.mmp.lib.service.b;
import com.meituan.mmp.lib.trace.b;
import com.meituan.mmp.lib.update.MMPPackageInfo;
import com.meituan.mmp.lib.utils.bc;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.base.TitansBundle;
import java.util.HashMap;
import java.util.Stack;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ab implements g.a {
    public static ChangeQuickRedirect a;
    protected final com.meituan.mmp.lib.engine.m b;
    protected final com.meituan.mmp.lib.config.a c;
    protected final a d;
    protected final com.meituan.mmp.lib.interfaces.d e;
    protected final Activity f;
    protected final FrameLayout g;
    protected boolean h;
    public com.meituan.mmp.lib.load.d i;
    public d.a j;
    public com.meituan.mmp.main.fusion.b k;

    @Override // com.meituan.mmp.lib.page.view.g.a
    public final void a(float f) {
    }

    @Override // com.meituan.mmp.lib.page.view.g.a
    public final void b(float f) {
    }

    public ab(a aVar, com.meituan.mmp.lib.engine.m mVar) {
        int i;
        AnimatorSet animatorSet;
        int i2;
        AnimatorSet animatorSet2;
        Object[] objArr = {aVar, mVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f1a1f227b6b16d7b064ae455f62ea0f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f1a1f227b6b16d7b064ae455f62ea0f");
            return;
        }
        this.k = MMPEnvHelper.getFusionPageManager();
        this.d = aVar;
        this.f = this.d.f;
        this.b = mVar;
        this.c = this.b.d;
        this.g = new FrameLayout(this.f) { // from class: com.meituan.mmp.lib.ab.1
            public static ChangeQuickRedirect a;
            public final ViewTreeObserver.OnGlobalLayoutListener b = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.meituan.mmp.lib.ab.1.1
                public static ChangeQuickRedirect a;
                private int c = 0;
                private int d = 0;

                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e82169b33224260472247085607d628e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e82169b33224260472247085607d628e");
                        return;
                    }
                    int height = ab.this.g.getHeight();
                    int width = ab.this.g.getWidth();
                    com.meituan.mmp.lib.page.e e = ab.this.e();
                    if (this.c != 0 && this.d != 0 && e != null) {
                        if (this.c != height || this.d != width) {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = com.meituan.mmp.lib.page.e.a;
                            if (PatchProxy.isSupport(objArr3, e, changeQuickRedirect3, false, "fa45643c55bfcfdb41a7a40a2d2d77a1", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, e, changeQuickRedirect3, false, "fa45643c55bfcfdb41a7a40a2d2d77a1");
                            } else if (e.k) {
                                com.meituan.mmp.lib.trace.b.b("Page", "onWidgetSizeChanged: " + e.e.getWidth() + " * " + e.e.getHeight());
                                e.b("onWidgetSizeChanged", com.meituan.mmp.lib.utils.ac.a("widgetSize", com.meituan.mmp.lib.utils.ac.a("width", Integer.valueOf(com.meituan.mmp.lib.utils.p.c(e.e.getWidth())), "height", Integer.valueOf(com.meituan.mmp.lib.utils.p.c(e.e.getHeight())))).toString(), e.getViewId());
                            }
                        }
                        if (this.c + 100 < height) {
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = com.meituan.mmp.lib.page.e.a;
                            if (PatchProxy.isSupport(objArr4, e, changeQuickRedirect4, false, "341665fa13674d61de47783982691b86", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, e, changeQuickRedirect4, false, "341665fa13674d61de47783982691b86");
                            } else {
                                com.meituan.mmp.lib.page.view.g gVar = e.e;
                                Object[] objArr5 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect5 = com.meituan.mmp.lib.page.view.g.a;
                                if (PatchProxy.isSupport(objArr5, gVar, changeQuickRedirect5, false, "e2ef623f08869aba283733e18bc2a50b", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, gVar, changeQuickRedirect5, false, "e2ef623f08869aba283733e18bc2a50b");
                                } else {
                                    gVar.f.c();
                                }
                            }
                        }
                    }
                    this.c = height;
                    this.d = width;
                }
            };

            @Override // android.view.ViewGroup, android.view.View
            public final void onAttachedToWindow() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "382c620621c814e4812540f1dee40571", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "382c620621c814e4812540f1dee40571");
                    return;
                }
                ab.this.g.getViewTreeObserver().addOnGlobalLayoutListener(this.b);
                super.onAttachedToWindow();
            }

            @Override // android.view.ViewGroup, android.view.View
            public final void onDetachedFromWindow() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9afd87801286d92aaebf014449ab0ff4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9afd87801286d92aaebf014449ab0ff4");
                    return;
                }
                ab.this.g.getViewTreeObserver().removeOnGlobalLayoutListener(this.b);
                super.onDetachedFromWindow();
            }
        };
        this.e = this.d;
        DisplayMetrics displayMetrics = this.f.getResources().getDisplayMetrics();
        LayoutTransition layoutTransition = new LayoutTransition();
        int i3 = displayMetrics.widthPixels;
        Object[] objArr2 = {Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "69511eee40a685b0617b11871d2cb536", RobustBitConfig.DEFAULT_VALUE)) {
            i = 2;
            animatorSet = (Animator) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "69511eee40a685b0617b11871d2cb536");
        } else {
            AnimatorSet animatorSet3 = new AnimatorSet();
            i = 2;
            animatorSet3.playTogether(ObjectAnimator.ofFloat((Object) null, RecceAnimUtils.TRANSLATION_X, i3, 0.0f));
            animatorSet = animatorSet3;
        }
        layoutTransition.setAnimator(i, animatorSet);
        int i4 = displayMetrics.widthPixels;
        Object[] objArr3 = {Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4409ee21101aa32da24b3208634a94c7", RobustBitConfig.DEFAULT_VALUE)) {
            i2 = 2;
            animatorSet2 = (Animator) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4409ee21101aa32da24b3208634a94c7");
        } else {
            AnimatorSet animatorSet4 = new AnimatorSet();
            i2 = 2;
            animatorSet4.playTogether(ObjectAnimator.ofFloat((Object) null, RecceAnimUtils.TRANSLATION_X, 0.0f, i4));
            animatorSet2 = animatorSet4;
        }
        layoutTransition.setAnimator(3, animatorSet2);
        layoutTransition.setStartDelay(i2, 0L);
        layoutTransition.setStartDelay(3, 0L);
        layoutTransition.setStartDelay(0, 0L);
        layoutTransition.setStartDelay(1, 0L);
        layoutTransition.setDuration(i2, 300L);
        layoutTransition.setDuration(3, 300L);
        layoutTransition.setDuration(0, 300L);
        layoutTransition.setDuration(1, 300L);
        this.g.setLayoutTransition(layoutTransition);
        this.j = new d.a() { // from class: com.meituan.mmp.lib.ab.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.mmp.lib.resume.d.a
            public final void a(com.meituan.mmp.lib.resume.a aVar2) {
                Object[] objArr4 = {aVar2};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "aa0891a073599a5cef7def53968403bd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "aa0891a073599a5cef7def53968403bd");
                } else {
                    ab.this.a(aVar2);
                }
            }
        };
    }

    public final void a(final com.meituan.mmp.lib.resume.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a86fd86c198bf124e8a1a22520caf3d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a86fd86c198bf124e8a1a22520caf3d0");
            return;
        }
        String str = aVar.a;
        String str2 = null;
        try {
            str2 = k().getPagePath();
        } catch (Exception e) {
            e.printStackTrace();
        }
        g(str2);
        try {
            aa.a aVar2 = new aa.a();
            aVar2.c = "reload";
            aVar2.b = str;
            aVar2.f = aVar.b;
            final aa a2 = aVar2.a(this.c);
            this.i.a(str, new com.meituan.mmp.lib.load.b() { // from class: com.meituan.mmp.lib.ab.3
                public static ChangeQuickRedirect a;

                @Override // com.meituan.mmp.lib.load.b
                public final void a(boolean z, boolean z2, MMPPackageInfo mMPPackageInfo) {
                    Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), mMPPackageInfo};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bb14985797a4c5009afb60f93d4efc87", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bb14985797a4c5009afb60f93d4efc87");
                        return;
                    }
                    com.meituan.mmp.lib.page.e e2 = ab.this.e();
                    com.meituan.mmp.lib.page.e a3 = ab.this.a(a2, aVar, z);
                    ab.this.a(a3);
                    a3.h();
                    a3.a(a2);
                    if (e2 != null) {
                        a3.l();
                        ab.this.g.removeView(e2);
                    }
                }
            });
        } catch (com.meituan.mmp.lib.api.d e2) {
            com.meituan.mmp.lib.trace.b.a("PageManager", e2, "reloadTopOfStack");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b1dc0e2b7e7f029331ee5f912fccc08", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b1dc0e2b7e7f029331ee5f912fccc08");
            return;
        }
        LayoutTransition layoutTransition = this.g.getLayoutTransition();
        if (layoutTransition != null) {
            layoutTransition.enableTransitionType(2);
            layoutTransition.enableTransitionType(3);
            layoutTransition.enableTransitionType(0);
            layoutTransition.enableTransitionType(1);
            layoutTransition.enableTransitionType(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd16a80a94534a8da5bf866dfe5a86ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd16a80a94534a8da5bf866dfe5a86ae");
            return;
        }
        LayoutTransition layoutTransition = this.g.getLayoutTransition();
        if (layoutTransition != null) {
            layoutTransition.disableTransitionType(2);
            layoutTransition.disableTransitionType(3);
            layoutTransition.disableTransitionType(0);
            layoutTransition.disableTransitionType(1);
            layoutTransition.disableTransitionType(4);
        }
    }

    public final FrameLayout a() {
        return this.g;
    }

    public final int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "755d5f0bb4a5fbfedca3bc71a2ab92a6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "755d5f0bb4a5fbfedca3bc71a2ab92a6")).intValue();
        }
        com.meituan.mmp.lib.page.e e = e();
        if (e != null) {
            return e.getViewId();
        }
        return 0;
    }

    public final boolean a(String str, String str2, int[] iArr) {
        boolean z;
        Object[] objArr = {str, str2, iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d37fb3855a228b4de392dbabbb9cb9b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d37fb3855a228b4de392dbabbb9cb9b")).booleanValue();
        }
        if (iArr == null || iArr.length == 0) {
            com.meituan.mmp.lib.trace.b.c("PageManager", "page subscribeHandler failed, viewIds is empty");
            return false;
        }
        int c = c();
        for (int i = 0; i < c; i++) {
            com.meituan.mmp.lib.page.e eVar = (com.meituan.mmp.lib.page.e) this.g.getChildAt(i);
            Object[] objArr2 = {str, str2, iArr};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.mmp.lib.page.e.a;
            if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "424257a8585c87d45a807f17f86340fb", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "424257a8585c87d45a807f17f86340fb")).booleanValue();
            } else {
                if (iArr != null && iArr.length != 0) {
                    for (int i2 : iArr) {
                        AppPage a2 = eVar.a(i2);
                        if (a2 != null) {
                            a2.a(str, str2);
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final boolean a(String str, int i) {
        boolean z;
        AppPage a2;
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a928f67b93016344297d9120ca3e4bb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a928f67b93016344297d9120ca3e4bb")).booleanValue();
        }
        if (i <= 0) {
            com.meituan.mmp.lib.trace.b.c("MMPMsi", "page msiDispatchEvent failed, viewId is illegal");
            return false;
        }
        int c = c();
        for (int i2 = 0; i2 < c; i2++) {
            if (this.g != null) {
                com.meituan.mmp.lib.page.e eVar = (com.meituan.mmp.lib.page.e) this.g.getChildAt(i2);
                Object[] objArr2 = {str, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = com.meituan.mmp.lib.page.e.a;
                if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "fafa9f4a632c1c4beb9ad884bc5ecd9a", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "fafa9f4a632c1c4beb9ad884bc5ecd9a")).booleanValue();
                } else if (i <= 0 || (a2 = eVar.a(i)) == null) {
                    z = false;
                } else {
                    Object[] objArr3 = {str};
                    ChangeQuickRedirect changeQuickRedirect3 = AppPage.a;
                    if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "0d73a813947925cfa3bec1d81de23955", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "0d73a813947925cfa3bec1d81de23955");
                    } else {
                        a2.a(str);
                    }
                    z = true;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void a(String str, JSONObject jSONObject, IApiCallback iApiCallback) throws com.meituan.mmp.lib.api.d {
        int i;
        com.meituan.mmp.lib.page.e a2;
        int i2;
        com.meituan.mmp.lib.page.e a3;
        com.meituan.mmp.lib.page.view.k a4;
        com.meituan.mmp.lib.page.view.k a5;
        com.meituan.mmp.lib.page.view.k a6;
        com.meituan.mmp.lib.page.view.k a7;
        com.meituan.mmp.lib.page.view.k a8;
        com.meituan.mmp.lib.widget.f swipeRefreshLayout;
        Object[] objArr = {str, jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3b655a7ec66e1b8bccb67aef98ad608", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3b655a7ec66e1b8bccb67aef98ad608");
            return;
        }
        com.meituan.mmp.lib.trace.b.b("PageManager", "handlePageEvent event:" + str);
        com.meituan.mmp.lib.trace.b.b("PageManager", "handlePageEvent params:" + jSONObject);
        if ("disableScrollBounce".equals(str)) {
            boolean optBoolean = jSONObject.optBoolean("disable", false);
            Object[] objArr2 = {Byte.valueOf(optBoolean ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1ef8919ac1b54cfdbf64033e71e9f265", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1ef8919ac1b54cfdbf64033e71e9f265");
                return;
            }
            com.meituan.mmp.lib.page.e e = e();
            if (e != null) {
                Object[] objArr3 = {Byte.valueOf(optBoolean ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect3 = com.meituan.mmp.lib.page.e.a;
                if (PatchProxy.isSupport(objArr3, e, changeQuickRedirect3, false, "4941023faa9cd4842fa3ef03c15d92f4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, e, changeQuickRedirect3, false, "4941023faa9cd4842fa3ef03c15d92f4");
                    return;
                } else if (e.e == null || !e.e.b || (swipeRefreshLayout = e.getSwipeRefreshLayout()) == null) {
                    return;
                } else {
                    if (swipeRefreshLayout.isEnabled() && optBoolean) {
                        swipeRefreshLayout.setEnabled(false);
                        return;
                    } else if (swipeRefreshLayout.isEnabled() || optBoolean) {
                        return;
                    } else {
                        swipeRefreshLayout.setEnabled(true);
                        return;
                    }
                }
            }
            return;
        }
        if ("navigateTo".equals(str)) {
            aa.a aVar = new aa.a();
            aVar.b = jSONObject.optString("url", "");
            aVar.c = "navigateTo";
            aVar.d = jSONObject.has("openSeq") ? Integer.valueOf(jSONObject.optInt("openSeq")) : null;
            a(aVar.a(this.c));
        } else if ("redirectTo".equals(str)) {
            aa.a aVar2 = new aa.a();
            aVar2.c = "redirectTo";
            aVar2.b = jSONObject.optString("url", "");
            b(aVar2.a(this.c));
        } else if ("switchTab".equals(str)) {
            c(jSONObject.optString("url", ""));
        } else if ("reLaunch".equals(str)) {
            e(jSONObject.optString("url", ""));
        } else if ("navigateBack".equals(str)) {
            b(jSONObject.optInt("delta", 0), jSONObject.optBoolean("__mtAllowCloseContainer", false));
        } else if ("setNavigationBarTitle".equals(str)) {
            String optString = jSONObject.optString("title", "");
            int optInt = jSONObject.optInt("__mmp__viewId", -1);
            Object[] objArr4 = {optString, Integer.valueOf(optInt)};
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "e283ebdbe9100f6601a63740041c23d8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "e283ebdbe9100f6601a63740041c23d8");
            } else {
                d(optInt).setNavigationBarTitle(optString);
            }
        } else if ("setNavigationBarColor".equals(str)) {
            String optString2 = jSONObject.optString("frontColor", DiagnoseLog.COLOR_ERROR);
            String optString3 = jSONObject.optString("backgroundColor", "#ffffff");
            int optInt2 = jSONObject.optInt("__mmp__viewId", -1);
            Object[] objArr5 = {optString2, optString3, Integer.valueOf(optInt2)};
            ChangeQuickRedirect changeQuickRedirect5 = a;
            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "52e648db0ec39ae2733dccb476adb786", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "52e648db0ec39ae2733dccb476adb786");
                return;
            }
            com.meituan.mmp.lib.page.e d = d(optInt2);
            int a9 = com.meituan.mmp.lib.utils.i.a(optString2);
            int a10 = com.meituan.mmp.lib.utils.i.a(optString3);
            Object[] objArr6 = {Integer.valueOf(a9), Integer.valueOf(a10)};
            ChangeQuickRedirect changeQuickRedirect6 = com.meituan.mmp.lib.page.e.a;
            if (PatchProxy.isSupport(objArr6, d, changeQuickRedirect6, false, "e2c18af63e75e5df2c9374a312ed2b56", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr6, d, changeQuickRedirect6, false, "e2c18af63e75e5df2c9374a312ed2b56");
                return;
            }
            d.e.setNavigationBarTextColor(a9);
            d.e.setNavigationBarIconColor(a9);
            d.e.setNavigationBarBackgroundColor(a10);
        } else if ("showNavigationBarLoading".equals(str)) {
            int optInt3 = jSONObject.optInt("__mmp__viewId", -1);
            Object[] objArr7 = {Integer.valueOf(optInt3)};
            ChangeQuickRedirect changeQuickRedirect7 = a;
            if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "59bee23038756d5323ed9eaaf447d38f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "59bee23038756d5323ed9eaaf447d38f");
                return;
            }
            com.meituan.mmp.lib.page.e d2 = d(optInt3);
            Object[] objArr8 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect8 = com.meituan.mmp.lib.page.e.a;
            if (PatchProxy.isSupport(objArr8, d2, changeQuickRedirect8, false, "b5d1497749ef99b562073e5d686edbcb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr8, d2, changeQuickRedirect8, false, "b5d1497749ef99b562073e5d686edbcb");
                return;
            }
            com.meituan.mmp.lib.page.view.g gVar = d2.e;
            Object[] objArr9 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect9 = com.meituan.mmp.lib.page.view.g.a;
            if (PatchProxy.isSupport(objArr9, gVar, changeQuickRedirect9, false, "3bac48d2a3fb57e1d9a3248baff985f3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr9, gVar, changeQuickRedirect9, false, "3bac48d2a3fb57e1d9a3248baff985f3");
            } else if (gVar.g || gVar.c == null) {
            } else {
                gVar.c.showNavigationBarLoading();
            }
        } else if ("hideNavigationBarLoading".equals(str)) {
            int optInt4 = jSONObject.optInt("__mmp__viewId", -1);
            Object[] objArr10 = {Integer.valueOf(optInt4)};
            ChangeQuickRedirect changeQuickRedirect10 = a;
            if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "1cb528942030dca2399a4fe28f26251d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "1cb528942030dca2399a4fe28f26251d");
                return;
            }
            com.meituan.mmp.lib.page.e d3 = d(optInt4);
            Object[] objArr11 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect11 = com.meituan.mmp.lib.page.e.a;
            if (PatchProxy.isSupport(objArr11, d3, changeQuickRedirect11, false, "d46c8b8e3d564e273d4c5ff889addfad", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr11, d3, changeQuickRedirect11, false, "d46c8b8e3d564e273d4c5ff889addfad");
                return;
            }
            com.meituan.mmp.lib.page.view.g gVar2 = d3.e;
            Object[] objArr12 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect12 = com.meituan.mmp.lib.page.view.g.a;
            if (PatchProxy.isSupport(objArr12, gVar2, changeQuickRedirect12, false, "9bf71a0545695c01f91b748ffea03722", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr12, gVar2, changeQuickRedirect12, false, "9bf71a0545695c01f91b748ffea03722");
            } else if (gVar2.g || gVar2.c == null) {
            } else {
                gVar2.c.hideNavigationBarLoading();
            }
        } else if ("showToast".equals(str)) {
            a(false, jSONObject);
        } else if (TitansBundle.PARAM_SHOW_LOADING.equals(str)) {
            a(true, jSONObject);
        } else if ("hideToast".equals(str) || "hideLoading".equals(str)) {
            Object[] objArr13 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect13 = a;
            if (PatchProxy.isSupport(objArr13, this, changeQuickRedirect13, false, "0eee7283caee249b33fccf8365f9e87a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr13, this, changeQuickRedirect13, false, "0eee7283caee249b33fccf8365f9e87a");
            } else {
                k().m();
            }
        } else if ("startPullDownRefresh".equals(str)) {
            int optInt5 = jSONObject.optInt("__mmp__viewId", -1);
            Object[] objArr14 = {Integer.valueOf(optInt5)};
            ChangeQuickRedirect changeQuickRedirect14 = a;
            if (PatchProxy.isSupport(objArr14, this, changeQuickRedirect14, false, "d7da9d40366fd398421194b79e6663a9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr14, this, changeQuickRedirect14, false, "d7da9d40366fd398421194b79e6663a9");
                return;
            }
            com.meituan.mmp.lib.page.e d4 = d(optInt5);
            Object[] objArr15 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect15 = com.meituan.mmp.lib.page.e.a;
            if (PatchProxy.isSupport(objArr15, d4, changeQuickRedirect15, false, "eb9f0258a1389d8b2cded5a9ac2be529", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr15, d4, changeQuickRedirect15, false, "eb9f0258a1389d8b2cded5a9ac2be529");
                return;
            }
            com.meituan.mmp.lib.widget.f swipeRefreshLayout2 = d4.getSwipeRefreshLayout();
            if (swipeRefreshLayout2 == null || !swipeRefreshLayout2.isEnabled() || swipeRefreshLayout2.b) {
                return;
            }
            swipeRefreshLayout2.setRefreshing(true);
        } else if ("stopPullDownRefresh".equals(str)) {
            int optInt6 = jSONObject.optInt("__mmp__viewId", -1);
            Object[] objArr16 = {Integer.valueOf(optInt6)};
            ChangeQuickRedirect changeQuickRedirect16 = a;
            if (PatchProxy.isSupport(objArr16, this, changeQuickRedirect16, false, "0671d890d17b42752b113f6fabd23d73", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr16, this, changeQuickRedirect16, false, "0671d890d17b42752b113f6fabd23d73");
                return;
            }
            com.meituan.mmp.lib.page.e d5 = d(optInt6);
            Object[] objArr17 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect17 = com.meituan.mmp.lib.page.e.a;
            if (PatchProxy.isSupport(objArr17, d5, changeQuickRedirect17, false, "26ab855494165b26bd6a6036e7f473e7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr17, d5, changeQuickRedirect17, false, "26ab855494165b26bd6a6036e7f473e7");
                return;
            }
            com.meituan.mmp.lib.widget.f swipeRefreshLayout3 = d5.getSwipeRefreshLayout();
            if (swipeRefreshLayout3 == null || !swipeRefreshLayout3.b) {
                return;
            }
            swipeRefreshLayout3.setRefreshing(false);
        } else if ("setTabBarBadge".equals(str)) {
            int optInt7 = jSONObject.optInt("index", -1);
            String optString4 = jSONObject.optString("text");
            Object[] objArr18 = {Integer.valueOf(optInt7), optString4};
            ChangeQuickRedirect changeQuickRedirect18 = a;
            if (PatchProxy.isSupport(objArr18, this, changeQuickRedirect18, false, "7dbd53fb05d2262e2922793067b4c16b", RobustBitConfig.DEFAULT_VALUE)) {
                ((Boolean) PatchProxy.accessDispatch(objArr18, this, changeQuickRedirect18, false, "7dbd53fb05d2262e2922793067b4c16b")).booleanValue();
                return;
            }
            com.meituan.mmp.lib.page.view.j f = f();
            if (f == null || (a8 = f.a(optInt7)) == null || TextUtils.isEmpty(optString4)) {
                return;
            }
            a8.setTabBarBadge(optString4);
        } else if ("removeTabBarBadge".equals(str)) {
            int optInt8 = jSONObject.optInt("index", -1);
            Object[] objArr19 = {Integer.valueOf(optInt8)};
            ChangeQuickRedirect changeQuickRedirect19 = a;
            if (PatchProxy.isSupport(objArr19, this, changeQuickRedirect19, false, "35db5742e7de5773c44cff44df66705b", RobustBitConfig.DEFAULT_VALUE)) {
                ((Boolean) PatchProxy.accessDispatch(objArr19, this, changeQuickRedirect19, false, "35db5742e7de5773c44cff44df66705b")).booleanValue();
                return;
            }
            com.meituan.mmp.lib.page.view.j f2 = f();
            if (f2 == null || (a7 = f2.a(optInt8)) == null) {
                return;
            }
            a7.c();
        } else if ("showTabBarRedDot".equals(str)) {
            int optInt9 = jSONObject.optInt("index", -1);
            Object[] objArr20 = {Integer.valueOf(optInt9)};
            ChangeQuickRedirect changeQuickRedirect20 = a;
            if (PatchProxy.isSupport(objArr20, this, changeQuickRedirect20, false, "6217bc92547f56a6033ddb0b0295e4da", RobustBitConfig.DEFAULT_VALUE)) {
                ((Boolean) PatchProxy.accessDispatch(objArr20, this, changeQuickRedirect20, false, "6217bc92547f56a6033ddb0b0295e4da")).booleanValue();
                return;
            }
            com.meituan.mmp.lib.page.view.j f3 = f();
            if (f3 == null || (a6 = f3.a(optInt9)) == null) {
                return;
            }
            a6.a();
        } else if ("hideTabBarRedDot".equals(str)) {
            int optInt10 = jSONObject.optInt("index", -1);
            Object[] objArr21 = {Integer.valueOf(optInt10)};
            ChangeQuickRedirect changeQuickRedirect21 = a;
            if (PatchProxy.isSupport(objArr21, this, changeQuickRedirect21, false, "30da5a5434ee77d021b2a148a9a76618", RobustBitConfig.DEFAULT_VALUE)) {
                ((Boolean) PatchProxy.accessDispatch(objArr21, this, changeQuickRedirect21, false, "30da5a5434ee77d021b2a148a9a76618")).booleanValue();
                return;
            }
            com.meituan.mmp.lib.page.view.j f4 = f();
            if (f4 == null || (a5 = f4.a(optInt10)) == null) {
                return;
            }
            a5.b();
        } else if ("setTabBarStyle".equals(str)) {
            a(jSONObject.optString("color"), jSONObject.optString("selectedColor"), jSONObject.optString("backgroundColor"), jSONObject.optString(BorderStyle.LOWER_CASE_NAME));
        } else if ("setTabBarItem".equals(str)) {
            int optInt11 = jSONObject.optInt("index", -1);
            String optString5 = jSONObject.optString("text");
            String optString6 = jSONObject.optString("iconPath");
            String optString7 = jSONObject.optString("selectedIconPath");
            Object[] objArr22 = {Integer.valueOf(optInt11), optString5, optString6, optString7};
            ChangeQuickRedirect changeQuickRedirect22 = a;
            if (PatchProxy.isSupport(objArr22, this, changeQuickRedirect22, false, "081a63f3bf2d7994c5223ea391b4e809", RobustBitConfig.DEFAULT_VALUE)) {
                ((Boolean) PatchProxy.accessDispatch(objArr22, this, changeQuickRedirect22, false, "081a63f3bf2d7994c5223ea391b4e809")).booleanValue();
                return;
            }
            com.meituan.mmp.lib.page.view.j f5 = f();
            if (f5 == null || (a4 = f5.a(optInt11)) == null) {
                return;
            }
            a4.a(optString5, optString6, optString7);
            a4.setSelected(a4.isSelected());
        } else if ("showTabBar".equals(str)) {
            a(true, jSONObject.optString("animation", "false").equals("true"));
        } else if ("hideTabBar".equals(str)) {
            a(false, jSONObject.optString("animation", "false").equals("true"));
        } else if ("setBackgroundColor".equals(str)) {
            Object[] objArr23 = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect23 = a;
            if (PatchProxy.isSupport(objArr23, this, changeQuickRedirect23, false, "b8c6fdc36012f47db110614fddcba3cd", RobustBitConfig.DEFAULT_VALUE)) {
                ((Boolean) PatchProxy.accessDispatch(objArr23, this, changeQuickRedirect23, false, "b8c6fdc36012f47db110614fddcba3cd")).booleanValue();
                return;
            }
            String optString8 = jSONObject.optString("backgroundColor");
            int optInt12 = jSONObject.optInt("__mmp__viewId", -1);
            if (TextUtils.isEmpty(optString8)) {
                com.meituan.mmp.lib.trace.b.d("PageManager", "setPageBackgroundColor failed, backgroundColor is empty!");
                return;
            }
            if (optInt12 == -1) {
                a3 = e();
                i2 = a3.getViewId();
            } else {
                i2 = optInt12;
                a3 = a(optInt12);
            }
            if (a3 != null) {
                a3.b(com.meituan.mmp.lib.utils.i.b(optString8), i2);
            } else {
                com.meituan.mmp.lib.trace.b.d("PageManager", "setPageBackgroundColor failed, no pages available!");
            }
        } else if ("setBackgroundTextStyle".equals(str)) {
            Object[] objArr24 = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect24 = a;
            if (PatchProxy.isSupport(objArr24, this, changeQuickRedirect24, false, "254fa9f8cefbcfe8366e4df55a93e8d4", RobustBitConfig.DEFAULT_VALUE)) {
                ((Boolean) PatchProxy.accessDispatch(objArr24, this, changeQuickRedirect24, false, "254fa9f8cefbcfe8366e4df55a93e8d4")).booleanValue();
                return;
            }
            String optString9 = jSONObject.optString("textStyle");
            if (!TextUtils.isEmpty(optString9)) {
                boolean z = !"light".equals(optString9);
                int optInt13 = jSONObject.optInt("__mmp__viewId", -1);
                if (optInt13 == -1) {
                    a2 = e();
                    i = a2.getViewId();
                } else {
                    i = optInt13;
                    a2 = a(optInt13);
                }
                if (a2 != null) {
                    a2.a(z, i);
                    return;
                } else {
                    com.meituan.mmp.lib.trace.b.d("PageManager", "setPageBackgroundTextStyle failed, no pages available!");
                    return;
                }
            }
            com.meituan.mmp.lib.trace.b.d("PageManager", "setPageBackgroundTextStyle failed, backgroundColor is empty!");
        } else if ("enableBeforeUnload".equals(str)) {
            a(true, jSONObject.optInt("__mmp__viewId", -1), iApiCallback);
        } else if ("disableBeforeUnload".equals(str)) {
            a(false, jSONObject.optInt("__mmp__viewId", -1), iApiCallback);
        } else if ("pageNotFoundCallback".equals(str)) {
            int optInt14 = jSONObject.optInt("__mmp__viewId", -1);
            Object[] objArr25 = {Integer.valueOf(optInt14)};
            ChangeQuickRedirect changeQuickRedirect25 = a;
            if (PatchProxy.isSupport(objArr25, this, changeQuickRedirect25, false, "682ebcc35825fffdfe56f5b83cf1272b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr25, this, changeQuickRedirect25, false, "682ebcc35825fffdfe56f5b83cf1272b");
                return;
            }
            try {
                com.meituan.mmp.lib.page.e d6 = d(optInt14);
                if (this.h) {
                    d6.q();
                    this.e.a(d6.getPagePath(), (HashMap<String, Object>) null);
                }
            } catch (com.meituan.mmp.lib.api.d e2) {
                e2.printStackTrace();
            }
        } else {
            throw new IllegalArgumentException("unsupported event: " + str);
        }
    }

    private boolean a(boolean z, boolean z2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e30c45a77e7f71440bec2db17f07f935", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e30c45a77e7f71440bec2db17f07f935")).booleanValue();
        }
        com.meituan.mmp.lib.page.view.j f = f();
        if (f != null) {
            f.setVisibility(z ? 0 : 8);
            return true;
        }
        return false;
    }

    private boolean a(String str, String str2, String str3, String str4) {
        Object[] objArr = {str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cafbc3b3d9082dc97ff1009f03893ef3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cafbc3b3d9082dc97ff1009f03893ef3")).booleanValue();
        }
        com.meituan.mmp.lib.page.view.j f = f();
        if (f != null) {
            if (!TextUtils.isEmpty(str3)) {
                f.setBackgroundColor(com.meituan.mmp.lib.utils.i.a(str3));
            }
            if (!TextUtils.isEmpty(str4)) {
                f.setBorderColor(com.meituan.mmp.lib.utils.i.a("white".equals(str4) ? "#f5f5f5" : "#e5e5e5"));
            }
            int tabItemCount = f.getTabItemCount();
            for (int i = 0; i < tabItemCount; i++) {
                com.meituan.mmp.lib.page.view.k a2 = f.a(i);
                if (a2 != null) {
                    a2.getInfo().a = str;
                    a2.getInfo().b = str2;
                    a2.setSelected(a2.isSelected());
                }
            }
            return true;
        }
        return false;
    }

    public final int c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d61db75bab294243e75f90859a5988a2", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d61db75bab294243e75f90859a5988a2")).intValue() : this.g.getChildCount();
    }

    public final com.meituan.mmp.lib.page.e d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48e8bde6dc5fb7abf0920b1c8df77055", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.mmp.lib.page.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48e8bde6dc5fb7abf0920b1c8df77055");
        }
        if (c() <= 0) {
            com.meituan.mmp.lib.trace.b.c("PageManager", "container have no pages");
            return null;
        }
        return (com.meituan.mmp.lib.page.e) this.g.getChildAt(0);
    }

    public final com.meituan.mmp.lib.page.e e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5858bacd6672812894ab7a4e094016d5", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.mmp.lib.page.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5858bacd6672812894ab7a4e094016d5");
        }
        int c = c();
        if (c <= 0) {
            com.meituan.mmp.lib.trace.b.c("PageManager", "container have no pages");
            return null;
        }
        return (com.meituan.mmp.lib.page.e) this.g.getChildAt(c - 1);
    }

    public final com.meituan.mmp.lib.page.view.j f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6da80bfb527c5d73008ca4420e092f2", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.mmp.lib.page.view.j) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6da80bfb527c5d73008ca4420e092f2");
        }
        int c = c();
        if (c > 0) {
            for (int i = c - 1; i >= 0; i--) {
                com.meituan.mmp.lib.page.e eVar = (com.meituan.mmp.lib.page.e) this.g.getChildAt(i);
                if (eVar != null && eVar.getTabBar() != null) {
                    return eVar.getTabBar();
                }
            }
        }
        com.meituan.mmp.lib.trace.b.c("PageManager", "tabBar not found");
        return null;
    }

    @Nullable
    public final com.meituan.mmp.lib.page.e a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c33b2e6b52f2c7a88e31c8e1375ff6b", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.mmp.lib.page.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c33b2e6b52f2c7a88e31c8e1375ff6b");
        }
        for (int c = c() - 1; c >= 0; c--) {
            com.meituan.mmp.lib.page.e eVar = (com.meituan.mmp.lib.page.e) this.g.getChildAt(c);
            if (eVar.getViewId() == i) {
                return eVar;
            }
        }
        return null;
    }

    public final boolean g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1b8a2843f5f85e931a2fdcd31a32c3e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1b8a2843f5f85e931a2fdcd31a32c3e")).booleanValue();
        }
        g(c());
        a aVar = this.d;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "ae90c4b766cb0f31fa489bc05b63dff6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "ae90c4b766cb0f31fa489bc05b63dff6");
            return true;
        } else if (aVar.J != null) {
            com.meituan.mmp.lib.resume.d dVar = aVar.J;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.meituan.mmp.lib.resume.d.a;
            if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "c8fa22a1ba7d35cef650fbdb711902df", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "c8fa22a1ba7d35cef650fbdb711902df");
                return true;
            } else if (dVar.b != null) {
                while (!dVar.b.empty()) {
                    dVar.b.pop();
                }
                return true;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28d6ed280a7d16fa7c7a5d508b5903dd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28d6ed280a7d16fa7c7a5d508b5903dd")).booleanValue();
        }
        int c = c();
        int min = c - Math.min(c, i);
        for (int i2 = c - 1; i2 >= min; i2--) {
            com.meituan.mmp.lib.page.e eVar = (com.meituan.mmp.lib.page.e) this.g.getChildAt(i2);
            eVar.a(false);
            eVar.i();
            this.g.removeViewAt(i2);
            this.b.e.c(eVar.getRoutePath(), String.valueOf(eVar.getViewId()));
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
        if (r14 != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean d(int r13, boolean r14) {
        /*
            r12 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r8 = 0
            r0[r8] = r1
            java.lang.Byte r1 = java.lang.Byte.valueOf(r14)
            r9 = 1
            r0[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.mmp.lib.ab.a
            java.lang.String r11 = "ea45ab8efa0b695a01fa7191358e5c58"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L2d
            java.lang.Object r13 = com.meituan.robust.PatchProxy.accessDispatch(r0, r12, r10, r8, r11)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            return r13
        L2d:
            int r0 = r12.c()
            if (r0 > r9) goto L37
            r12.j()
            return r8
        L37:
            if (r13 < r0) goto L3e
            int r13 = r0 + (-1)
            if (r14 == 0) goto L3e
            goto L3f
        L3e:
            r8 = 1
        L3f:
            if (r13 > 0) goto L42
            r13 = 1
        L42:
            r12.g(r13)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.mmp.lib.ab.d(int, boolean):boolean");
    }

    public final com.meituan.mmp.lib.page.e a(aa aaVar, @Nullable com.meituan.mmp.lib.resume.a aVar, boolean z) {
        Object[] objArr = {aaVar, aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "258042feb9a36aca713362e25d5692cd", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.mmp.lib.page.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "258042feb9a36aca713362e25d5692cd");
        }
        aaVar.g = aaVar.g && (!this.d.a() || DebugHelper.p);
        if (aaVar.g) {
            j();
            g();
        } else if (c() == 0) {
            j();
        } else {
            i();
        }
        return new com.meituan.mmp.lib.page.e(this.b, this.d, this.e, aaVar, aVar, this.d.a(), c() == 0, z);
    }

    public final void a(String str) throws com.meituan.mmp.lib.api.d {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98444d65d7046426f889a16c8c0afbe1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98444d65d7046426f889a16c8c0afbe1");
            return;
        }
        int c = c() - 1;
        for (int i = c; i >= 0; i--) {
            if (TextUtils.equals(((com.meituan.mmp.lib.page.e) this.g.getChildAt(i)).getPagePath(), str)) {
                if (i == c) {
                    return;
                }
                b(c - i);
                return;
            }
        }
        b(str);
    }

    public final void a(com.meituan.mmp.lib.page.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71f14a9022a15085ce575a9ca588cb9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71f14a9022a15085ce575a9ca588cb9f");
            return;
        }
        Trace.beginSection("addPage");
        this.g.addView(bc.a(eVar), new FrameLayout.LayoutParams(-1, -1));
        this.b.e.b(eVar.getRoutePath(), String.valueOf(eVar.getViewId()));
        Trace.endSection();
    }

    public final void a(String str, com.meituan.mmp.lib.trace.h hVar) {
        Object[] objArr = {str, hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd96f32fb891526587c7cdbf2bd98488", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd96f32fb891526587c7cdbf2bd98488");
        } else {
            a(str, (Integer) null, hVar, true);
        }
    }

    public final void a(String str, Integer num, final com.meituan.mmp.lib.trace.h hVar, final boolean z) {
        Object[] objArr = {str, num, hVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2846f866839d3c7b5467501139ae26eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2846f866839d3c7b5467501139ae26eb");
        } else if (TextUtils.isEmpty(str)) {
            com.meituan.mmp.lib.trace.b.c("PageManager", "navigateHomePage failed, url is null");
        } else {
            String str2 = z ? "appLaunch" : "navigateTo";
            try {
                aa.a aVar = new aa.a();
                aVar.d = num;
                aVar.b = str;
                aVar.c = str2;
                aVar.e = true;
                final aa a2 = aVar.a(this.c);
                g();
                this.i.a(a2.b, false, new com.meituan.mmp.lib.load.b() { // from class: com.meituan.mmp.lib.ab.4
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.mmp.lib.load.b
                    public final void a(boolean z2, boolean z3, MMPPackageInfo mMPPackageInfo) {
                        Object[] objArr2 = {Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0), mMPPackageInfo};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cf230e04849544e500fa1ba0a5c7c41b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cf230e04849544e500fa1ba0a5c7c41b");
                            return;
                        }
                        com.meituan.mmp.main.ab.a("PageManager.navigateHomePage.onPackageLoaded");
                        com.meituan.mmp.lib.page.e a3 = ab.this.a(a2, (com.meituan.mmp.lib.resume.a) null, z2);
                        ab.this.a(a3);
                        a3.h();
                        a3.setAppLaunchReporter(hVar);
                        if (z) {
                            aa aaVar = a2;
                            Object[] objArr3 = {aaVar};
                            ChangeQuickRedirect changeQuickRedirect3 = com.meituan.mmp.lib.page.e.a;
                            if (PatchProxy.isSupport(objArr3, a3, changeQuickRedirect3, false, "f88ed5b13d87e1651dd7f0dacbc73e9b", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, a3, changeQuickRedirect3, false, "f88ed5b13d87e1651dd7f0dacbc73e9b");
                            } else {
                                com.meituan.mmp.lib.trace.b.b("Page", String.format("onLaunchHome(%s) view@%s ", aaVar.b, Integer.valueOf(a3.getViewId())));
                                a3.l = true;
                                a3.a(aaVar);
                                a3.l = false;
                            }
                        } else {
                            a3.a(a2);
                        }
                        com.meituan.mmp.main.ab.a();
                    }
                });
            } catch (com.meituan.mmp.lib.api.d e) {
                com.meituan.mmp.lib.trace.b.a("PageManager", e, "navigateHomePage");
                a(str, str2);
            }
        }
    }

    public final void b(String str) throws com.meituan.mmp.lib.api.d {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2dff1d65b36fe94ace52b6d09900a0e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2dff1d65b36fe94ace52b6d09900a0e");
            return;
        }
        aa.a aVar = new aa.a();
        aVar.b = str;
        aVar.c = "navigateTo";
        a(aVar.a(this.c));
    }

    public void a(final aa aaVar) throws com.meituan.mmp.lib.api.d {
        boolean z;
        Object[] objArr = {aaVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4e6170c782a0c4c9a05cb68a5f07ef2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4e6170c782a0c4c9a05cb68a5f07ef2");
            return;
        }
        String str = aaVar.b;
        f(str);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fecab5444120d30c0b53e2d8e35e69c0", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fecab5444120d30c0b53e2d8e35e69c0")).booleanValue();
        } else {
            int c = c();
            if (c < 10 || this.c.e()) {
                z = true;
            } else {
                com.meituan.mmp.lib.trace.b.c("PageManager", String.format("create page failed, current page count:%s, most count:%s", Integer.valueOf(c), 10));
                z = false;
            }
        }
        if (!z) {
            throw new com.meituan.mmp.lib.api.d(String.format("no more than %s pages allowed", 10));
        }
        String str2 = null;
        try {
            str2 = k().getPagePath();
        } catch (Exception e) {
            e.printStackTrace();
        }
        g(str2);
        this.i.a(str, new com.meituan.mmp.lib.load.b() { // from class: com.meituan.mmp.lib.ab.5
            public static ChangeQuickRedirect a;

            @Override // com.meituan.mmp.lib.load.b
            public final void a(boolean z2, boolean z3, MMPPackageInfo mMPPackageInfo) {
                Object[] objArr3 = {Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0), mMPPackageInfo};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5948397854375958fc00f65e42d2f025", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5948397854375958fc00f65e42d2f025");
                    return;
                }
                com.meituan.mmp.lib.page.e e2 = ab.this.e();
                if (e2 != null) {
                    e2.a(true);
                }
                com.meituan.mmp.lib.page.e a2 = ab.this.a(aaVar, (com.meituan.mmp.lib.resume.a) null, z2);
                ab.this.a(a2);
                a2.h();
                a2.b(aaVar);
            }
        });
    }

    public final Stack<com.meituan.mmp.lib.resume.a> h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "558acf1472026a12f518df0b44fd3cbe", RobustBitConfig.DEFAULT_VALUE)) {
            return (Stack) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "558acf1472026a12f518df0b44fd3cbe");
        }
        Stack<com.meituan.mmp.lib.resume.a> stack = new Stack<>();
        for (int i = 0; i < c(); i++) {
            stack.add(((com.meituan.mmp.lib.page.e) this.g.getChildAt(i)).getPageInfoArray());
        }
        return stack;
    }

    public void b(final aa aaVar) throws com.meituan.mmp.lib.api.d {
        Object[] objArr = {aaVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "beb0ca6929790bd005c4a2c03173750b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "beb0ca6929790bd005c4a2c03173750b");
            return;
        }
        String str = aaVar.b;
        f(str);
        g(k().getPagePath());
        this.i.a(str, new com.meituan.mmp.lib.load.b() { // from class: com.meituan.mmp.lib.ab.6
            public static ChangeQuickRedirect a;

            @Override // com.meituan.mmp.lib.load.b
            public final void a(boolean z, boolean z2, MMPPackageInfo mMPPackageInfo) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), mMPPackageInfo};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d80ac1a03640fe6c0484b5024a33b731", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d80ac1a03640fe6c0484b5024a33b731");
                    return;
                }
                ab.this.j();
                ab.this.g(1);
                com.meituan.mmp.lib.page.e a2 = ab.this.a(aaVar, (com.meituan.mmp.lib.resume.a) null, z);
                ab.this.a(a2);
                a2.h();
                ab.this.i();
                aa aaVar2 = aaVar;
                Object[] objArr3 = {aaVar2};
                ChangeQuickRedirect changeQuickRedirect3 = com.meituan.mmp.lib.page.e.a;
                if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "84e6d9f9a3e4b9af78c70008973009b0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "84e6d9f9a3e4b9af78c70008973009b0");
                    return;
                }
                com.meituan.mmp.lib.trace.b.b("Page", String.format("onRedirectTo view@%s, url:%s", Integer.valueOf(a2.getViewId()), aaVar2.b));
                if (a2.d != null) {
                    a2.d.setVisibility(8);
                }
                a2.b(aaVar2);
            }
        });
    }

    public void c(String str) throws com.meituan.mmp.lib.api.d {
        com.meituan.mmp.lib.page.e d;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8739d438c34e0216b3dc5b7a74342483", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8739d438c34e0216b3dc5b7a74342483");
            return;
        }
        f(str);
        if (!this.c.o(str)) {
            throw new com.meituan.mmp.lib.api.d("can't switchTab to single page");
        }
        if (this.c.e() && (d = d()) != null && !d.c) {
            if (this.k == null || !this.k.b(this.f, this.c.c(), str, this.d.d())) {
                throw new com.meituan.mmp.lib.api.d("can not switchTab in fusionMode while tab is not bottom of stack");
            }
            this.d.Q = true;
            return;
        }
        d(str);
    }

    public void d(String str) throws com.meituan.mmp.lib.api.d {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a423c1cb97a5634b26e24362ea6dbee2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a423c1cb97a5634b26e24362ea6dbee2");
            return;
        }
        f(str);
        if (!this.c.o(str)) {
            throw new com.meituan.mmp.lib.api.d("can't switchTab to single page");
        }
        String p = com.meituan.mmp.lib.config.a.p(str);
        if (c() > 1) {
            d(Integer.MAX_VALUE, false);
        }
        com.meituan.mmp.lib.page.e e = e();
        if (e == null || !e.c) {
            g();
            aa.a aVar = new aa.a();
            aVar.b = p;
            aVar.c = "switchTab";
            e = a(aVar.a(this.c), (com.meituan.mmp.lib.resume.a) null, true);
            a(e);
        }
        g(k().getPagePath());
        e.h();
        e.c(p);
    }

    private void g(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1b4a5a3588b8a7d420ef4d65bcaf73a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1b4a5a3588b8a7d420ef4d65bcaf73a");
        } else if (TextUtils.isEmpty(str)) {
            b.a.c("PageManager", "getAndCacheJSMemoryUsage lastUrl is null");
        } else if (!com.meituan.mmp.lib.config.b.u()) {
            b.a.c("PageManager", "GetV8JSMemUsage config is close");
        } else {
            IServiceEngine iServiceEngine = this.b.h.c;
            if (iServiceEngine instanceof com.meituan.mmp.lib.service.c) {
                final com.meituan.mmp.lib.service.c cVar = (com.meituan.mmp.lib.service.c) iServiceEngine;
                cVar.a(new b.a() { // from class: com.meituan.mmp.lib.ab.7
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.mmp.lib.service.b.a
                    public final void a(long j) {
                        Object[] objArr2 = {new Long(j)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ddcdd94465b52139d6e8ead0dcd8a257", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ddcdd94465b52139d6e8ead0dcd8a257");
                        } else if (ab.this.c == null || TextUtils.isEmpty(ab.this.c.c())) {
                        } else {
                            ab.this.a(j, str);
                            ab abVar = ab.this;
                            com.meituan.mmp.lib.service.c cVar2 = cVar;
                            Object[] objArr3 = {new Long(j), cVar2};
                            ChangeQuickRedirect changeQuickRedirect3 = ab.a;
                            if (PatchProxy.isSupport(objArr3, abVar, changeQuickRedirect3, false, "3fcebfbe455f4145c202eed1687a8849", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, abVar, changeQuickRedirect3, false, "3fcebfbe455f4145c202eed1687a8849");
                                return;
                            }
                            p.a(j);
                            cVar2.d();
                        }
                    }
                });
            }
        }
    }

    public final void a(long j, String str) {
        Object[] objArr = {new Long(j), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a9918f933725109208f66d0d89d6bb6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a9918f933725109208f66d0d89d6bb6");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        long j2 = 0;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c87994a1c1e2894c50f2467d054f8d2f", RobustBitConfig.DEFAULT_VALUE)) {
            j2 = ((Long) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c87994a1c1e2894c50f2467d054f8d2f")).longValue();
        } else if (this.b != null && this.b.h != null) {
            IServiceEngine iServiceEngine = this.b.h.c;
            if (iServiceEngine instanceof com.meituan.mmp.lib.service.c) {
                j2 = ((com.meituan.mmp.lib.service.c) iServiceEngine).b;
            }
        }
        p.a(this.c.c(), str, j - j2);
        Object[] objArr3 = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "52c4cb483bbff11df068a0469a2148ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "52c4cb483bbff11df068a0469a2148ff");
        } else if (this.b == null || this.b.h == null) {
        } else {
            IServiceEngine iServiceEngine2 = this.b.h.c;
            if (iServiceEngine2 instanceof com.meituan.mmp.lib.service.c) {
                ((com.meituan.mmp.lib.service.c) iServiceEngine2).b = j;
            }
        }
    }

    public void e(String str) throws com.meituan.mmp.lib.api.d {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c496e7a32dfd98675a150bff4ed97bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c496e7a32dfd98675a150bff4ed97bf");
        } else if (a(str, this.d.d())) {
        } else {
            b(str, (com.meituan.mmp.lib.trace.h) null);
        }
    }

    public final boolean a(String str, Intent intent) throws com.meituan.mmp.lib.api.d {
        Object[] objArr = {str, intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc98d5ecab4ad03c87d7eae57392b806", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc98d5ecab4ad03c87d7eae57392b806")).booleanValue();
        }
        f(str);
        if (!this.c.e() || (this.d.f() && com.meituan.mmp.main.fusion.c.b(this.c.c()) <= 1)) {
            return false;
        }
        if (this.k == null || !this.k.a(this.f, this.c.c(), str, intent)) {
            throw new com.meituan.mmp.lib.api.d("can't relaunch in fusionMode");
        }
        this.d.Q = true;
        return true;
    }

    public final void b(String str, @Nullable final com.meituan.mmp.lib.trace.h hVar) throws com.meituan.mmp.lib.api.d {
        Object[] objArr = {str, hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18ac819e68ba07415ba8c072afbfdf1f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18ac819e68ba07415ba8c072afbfdf1f");
            return;
        }
        com.meituan.mmp.lib.trace.a.a().c();
        String str2 = null;
        try {
            str2 = k().getPagePath();
        } catch (Exception e) {
            e.printStackTrace();
        }
        g(str2);
        aa.a aVar = new aa.a();
        aVar.c = "reLaunch";
        aVar.b = str;
        final aa a2 = aVar.a(this.c);
        this.i.a(a2.b, new com.meituan.mmp.lib.load.b() { // from class: com.meituan.mmp.lib.ab.8
            public static ChangeQuickRedirect a;

            @Override // com.meituan.mmp.lib.load.b
            public final void a(boolean z, boolean z2, MMPPackageInfo mMPPackageInfo) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), mMPPackageInfo};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "46f7d24d30040562f6389483b6ecd7bb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "46f7d24d30040562f6389483b6ecd7bb");
                    return;
                }
                ab.this.j();
                ab.this.g();
                com.meituan.mmp.lib.page.e a3 = ab.this.a(a2, (com.meituan.mmp.lib.resume.a) null, z);
                a3.setAppLaunchReporter(hVar);
                ab.this.a(a3);
                a3.h();
                a3.a(a2);
            }
        });
    }

    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fcd866a5ac24f0130f49df1c5e2c0eb9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fcd866a5ac24f0130f49df1c5e2c0eb9");
            return;
        }
        this.h = true;
        g();
        com.meituan.mmp.lib.page.e eVar = new com.meituan.mmp.lib.page.e(this.b, this.d, this.e, new aa(str, str2), null, false, true, false);
        a(eVar);
        eVar.h();
        eVar.a(str, str2);
    }

    public final boolean b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0eae679174a19e621b912cf1882f9706", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0eae679174a19e621b912cf1882f9706")).booleanValue() : a(i, false);
    }

    public boolean a(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c335ae6e87c336afb759f7a35c8ee2e1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c335ae6e87c336afb759f7a35c8ee2e1")).booleanValue();
        }
        String str = null;
        try {
            str = k().getPagePath();
        } catch (com.meituan.mmp.lib.api.d e) {
            e.printStackTrace();
        }
        if (!d(i, this.c.e() && z)) {
            if (this.c.e()) {
                com.meituan.mmp.lib.trace.b.b("PageManager", "PageManager navigateBackPage close Container");
                this.d.p();
                return true;
            }
            return false;
        }
        com.meituan.mmp.lib.trace.a.b();
        com.meituan.mmp.lib.page.e e2 = e();
        if (e2 != null) {
            e2.h();
            e2.l();
            g(str);
            com.meituan.mmp.lib.trace.a.a(e2.getPagePath(), this.c.c(), "navigateBack");
        }
        return true;
    }

    public final void c(int i) throws com.meituan.mmp.lib.api.d {
        Object[] objArr = {1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3eef2ac84b832c64842c5242581de10f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3eef2ac84b832c64842c5242581de10f");
            return;
        }
        com.meituan.mmp.lib.trace.b.b("PageManager", "PageManager removePage from stack");
        if (c() <= 1) {
            this.d.p();
        } else {
            b(1);
        }
    }

    public void b(int i, boolean z) throws com.meituan.mmp.lib.api.d {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3927082e2f4e2f8c635e16a099642611", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3927082e2f4e2f8c635e16a099642611");
        } else if (!a(i, z)) {
            throw new com.meituan.mmp.lib.api.d("cannot navigate back at first page");
        }
    }

    public final void f(String str) throws com.meituan.mmp.lib.api.d {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e26b067a59737167c98107408a905e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e26b067a59737167c98107408a905e8");
        } else if (TextUtils.isEmpty(str)) {
            throw new com.meituan.mmp.lib.api.d("url is empty");
        } else {
            if (!this.c.c(str)) {
                throw new com.meituan.mmp.lib.api.d("url is not a valid page");
            }
            this.h = false;
        }
    }

    @NonNull
    public final com.meituan.mmp.lib.page.e d(int i) throws com.meituan.mmp.lib.api.d {
        com.meituan.mmp.lib.page.e a2;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "672df0d2908ca727afaceab3c7cbb42b", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.mmp.lib.page.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "672df0d2908ca727afaceab3c7cbb42b");
        }
        if (i == -1) {
            a2 = e();
        } else {
            a2 = a(i);
        }
        if (a2 != null) {
            return a2;
        }
        throw new com.meituan.mmp.lib.api.d("no page available");
    }

    @NonNull
    private com.meituan.mmp.lib.page.e k() throws com.meituan.mmp.lib.api.d {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0e56fe3473024486512e44ce80ced4a", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.mmp.lib.page.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0e56fe3473024486512e44ce80ced4a");
        }
        com.meituan.mmp.lib.page.e e = e();
        if (e != null) {
            return e;
        }
        throw new com.meituan.mmp.lib.api.d("no page available");
    }

    public final void a(int i, boolean z, boolean z2) throws com.meituan.mmp.lib.api.d {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "327577c102548eb62bd6f32f9ff2705d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "327577c102548eb62bd6f32f9ff2705d");
            return;
        }
        com.meituan.mmp.lib.page.e d = d(i);
        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.mmp.lib.page.e.a;
        if (PatchProxy.isSupport(objArr2, d, changeQuickRedirect2, false, "436c3a977bdc2a876e17995315701fdd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, d, changeQuickRedirect2, false, "436c3a977bdc2a876e17995315701fdd");
            return;
        }
        com.meituan.mmp.lib.page.view.g gVar = d.e;
        Object[] objArr3 = {Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect3 = com.meituan.mmp.lib.page.view.g.a;
        if (PatchProxy.isSupport(objArr3, gVar, changeQuickRedirect3, false, "98f27d7b6d6b9d9a780b102f212ab0d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, gVar, changeQuickRedirect3, false, "98f27d7b6d6b9d9a780b102f212ab0d4");
        } else if (gVar.c != null) {
            gVar.c.showNavigationBarMoreMenu(z2);
        }
        d.n = z;
    }

    public final void c(int i, boolean z) throws com.meituan.mmp.lib.api.d {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe97cabc5258925496f5fc7db8c80ccc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe97cabc5258925496f5fc7db8c80ccc");
            return;
        }
        com.meituan.mmp.lib.page.e d = d(i);
        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.mmp.lib.page.e.a;
        if (PatchProxy.isSupport(objArr2, d, changeQuickRedirect2, false, "33ad76bf64fa9567b2d99b106da77fe5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, d, changeQuickRedirect2, false, "33ad76bf64fa9567b2d99b106da77fe5");
            return;
        }
        com.meituan.mmp.lib.page.view.g gVar = d.e;
        Object[] objArr3 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect3 = com.meituan.mmp.lib.page.view.g.a;
        if (PatchProxy.isSupport(objArr3, gVar, changeQuickRedirect3, false, "6a53012e09f5c5835bb9e55a728168bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, gVar, changeQuickRedirect3, false, "6a53012e09f5c5835bb9e55a728168bb");
        } else if (gVar.c != null) {
            gVar.c.hideNavigationBarMoreMenu(z);
        }
    }

    @Nullable
    public final Rect e(int i) throws com.meituan.mmp.lib.api.d {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "012e5f81f069b6dbb59c5cd3e7678964", RobustBitConfig.DEFAULT_VALUE) ? (Rect) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "012e5f81f069b6dbb59c5cd3e7678964") : d(i).getMenuRect();
    }

    public final boolean f(int i) throws com.meituan.mmp.lib.api.d {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "473ad04bd3be3ecaf132c2ca47e06b12", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "473ad04bd3be3ecaf132c2ca47e06b12")).booleanValue();
        }
        com.meituan.mmp.lib.page.e d = d(i);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.mmp.lib.page.e.a;
        if (PatchProxy.isSupport(objArr2, d, changeQuickRedirect2, false, "412994b9c38975bc686990c7c6a2ca4f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr2, d, changeQuickRedirect2, false, "412994b9c38975bc686990c7c6a2ca4f")).booleanValue();
        }
        com.meituan.mmp.lib.page.view.g gVar = d.e;
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = com.meituan.mmp.lib.page.view.g.a;
        return PatchProxy.isSupport(objArr3, gVar, changeQuickRedirect3, false, "21c0ded1667365e615b155f398a4423b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr3, gVar, changeQuickRedirect3, false, "21c0ded1667365e615b155f398a4423b")).booleanValue() : gVar.c.isMenuButtonShown();
    }

    private void a(boolean z, JSONObject jSONObject) throws com.meituan.mmp.lib.api.d {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "731602ecbeadc8e551e29b253156665a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "731602ecbeadc8e551e29b253156665a");
        } else {
            k().a(z, jSONObject);
        }
    }

    private void a(boolean z, int i, IApiCallback iApiCallback) throws com.meituan.mmp.lib.api.d {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71729260c3c2cc0306f86c3890e59b30", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71729260c3c2cc0306f86c3890e59b30");
            return;
        }
        d(i).setEnableInterceptBackAction(z);
        iApiCallback.onSuccess(null);
    }
}
