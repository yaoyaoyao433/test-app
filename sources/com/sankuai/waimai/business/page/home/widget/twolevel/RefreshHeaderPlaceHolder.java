package com.sankuai.waimai.business.page.home.widget.twolevel;

import android.animation.Animator;
import android.annotation.TargetApi;
import android.content.Context;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.home.widget.twolevel.RefreshHeaderHelper;
import com.sankuai.waimai.lottie.SafeLottieAnimationView;
import com.sankuai.waimai.lottie.a;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class RefreshHeaderPlaceHolder extends FrameLayout {
    public static ChangeQuickRedirect a;
    private boolean b;
    private LottieAnimationView c;
    private LottieAnimationView d;
    private com.airbnb.lottie.e e;
    private com.airbnb.lottie.e f;
    private com.airbnb.lottie.e g;
    private Context h;
    private int i;
    private boolean j;
    private RefreshHeaderHelper.c k;

    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(com.sankuai.waimai.business.page.home.widget.twolevel.RefreshHeaderPlaceHolder r18, com.airbnb.lottie.e r19, int r20, boolean r21, boolean r22) {
        /*
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r22
            r0 = 4
            java.lang.Object[] r11 = new java.lang.Object[r0]
            r12 = 0
            r11[r12] = r8
            java.lang.Integer r0 = java.lang.Integer.valueOf(r20)
            r13 = 1
            r11[r13] = r0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r21)
            r14 = 2
            r11[r14] = r0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r22)
            r1 = 3
            r11[r1] = r0
            com.meituan.robust.ChangeQuickRedirect r15 = com.sankuai.waimai.business.page.home.widget.twolevel.RefreshHeaderPlaceHolder.a
            java.lang.String r5 = "5ea03e5cdf20b1bf0509d119f1353837"
            r3 = 0
            r16 = 4611686018427387904(0x4000000000000000, double:2.0)
            r0 = r11
            r1 = r18
            r2 = r15
            r4 = r5
            r14 = r5
            r5 = r16
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L3c
            com.meituan.robust.PatchProxy.accessDispatch(r11, r7, r15, r12, r14)
            return
        L3c:
            if (r8 == 0) goto L5b
            if (r9 != 0) goto L44
            r7.e = r8
        L42:
            r0 = 2
            goto L4e
        L44:
            if (r9 != r13) goto L49
            r7.f = r8
            goto L42
        L49:
            r0 = 2
            if (r9 != r0) goto L4e
            r7.g = r8
        L4e:
            if (r9 != r0) goto L56
            com.airbnb.lottie.LottieAnimationView r0 = r7.c
            r7.a(r0, r8, r10, r9)
            return
        L56:
            com.airbnb.lottie.LottieAnimationView r0 = r7.d
            r7.a(r0, r8, r10, r9)
        L5b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.page.home.widget.twolevel.RefreshHeaderPlaceHolder.a(com.sankuai.waimai.business.page.home.widget.twolevel.RefreshHeaderPlaceHolder, com.airbnb.lottie.e, int, boolean, boolean):void");
    }

    public static /* synthetic */ boolean a(RefreshHeaderPlaceHolder refreshHeaderPlaceHolder, boolean z) {
        refreshHeaderPlaceHolder.j = false;
        return false;
    }

    public static /* synthetic */ void c(RefreshHeaderPlaceHolder refreshHeaderPlaceHolder) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, refreshHeaderPlaceHolder, changeQuickRedirect, false, "ed1c1daf99d820f9ac451698c950a5f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, refreshHeaderPlaceHolder, changeQuickRedirect, false, "ed1c1daf99d820f9ac451698c950a5f2");
        } else if (refreshHeaderPlaceHolder.d != null) {
            refreshHeaderPlaceHolder.d.setVisibility(0);
            if (refreshHeaderPlaceHolder.g != null) {
                refreshHeaderPlaceHolder.a(refreshHeaderPlaceHolder.d, refreshHeaderPlaceHolder.g, false, 2);
                refreshHeaderPlaceHolder.d.a(new Animator.AnimatorListener() { // from class: com.sankuai.waimai.business.page.home.widget.twolevel.RefreshHeaderPlaceHolder.2
                    public static ChangeQuickRedirect a;

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationRepeat(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationStart(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        Object[] objArr2 = {animator};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1f886fe850edc69523f8d6851e776f90", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1f886fe850edc69523f8d6851e776f90");
                        } else if (RefreshHeaderPlaceHolder.this.f != null) {
                            RefreshHeaderPlaceHolder.this.a(RefreshHeaderPlaceHolder.this.c, RefreshHeaderPlaceHolder.this.f, true, 1);
                        } else {
                            RefreshHeaderPlaceHolder.this.a("pull_refresh_pulling.json", 0, true, true);
                        }
                    }
                });
            }
        }
    }

    public static /* synthetic */ void d(RefreshHeaderPlaceHolder refreshHeaderPlaceHolder) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, refreshHeaderPlaceHolder, changeQuickRedirect, false, "65a43e9878169af5d3859f1f19b1bab2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, refreshHeaderPlaceHolder, changeQuickRedirect, false, "65a43e9878169af5d3859f1f19b1bab2");
        } else if (refreshHeaderPlaceHolder.c != null) {
            refreshHeaderPlaceHolder.c.setVisibility(0);
            if (refreshHeaderPlaceHolder.e != null) {
                refreshHeaderPlaceHolder.a(refreshHeaderPlaceHolder.c, refreshHeaderPlaceHolder.e, true, 0);
            } else {
                refreshHeaderPlaceHolder.a("pull_refresh_pulling.json", 0, true, true);
            }
        }
    }

    public static /* synthetic */ void e(RefreshHeaderPlaceHolder refreshHeaderPlaceHolder) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, refreshHeaderPlaceHolder, changeQuickRedirect, false, "484ba5a40ffbd10e1a7ed221ca5f94d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, refreshHeaderPlaceHolder, changeQuickRedirect, false, "484ba5a40ffbd10e1a7ed221ca5f94d3");
        } else if (refreshHeaderPlaceHolder.c != null) {
            refreshHeaderPlaceHolder.c.f();
        }
    }

    public RefreshHeaderPlaceHolder(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a41f62ed1cca638a72da066dcb922899", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a41f62ed1cca638a72da066dcb922899");
            return;
        }
        this.i = 0;
        this.j = true;
        this.k = new RefreshHeaderHelper.a() { // from class: com.sankuai.waimai.business.page.home.widget.twolevel.RefreshHeaderPlaceHolder.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.page.home.widget.twolevel.RefreshHeaderHelper.a, com.sankuai.waimai.business.page.home.widget.twolevel.RefreshHeaderHelper.c
            public final void a(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9ccce7c36f5520d65c41302da4571551", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9ccce7c36f5520d65c41302da4571551");
                    return;
                }
                super.a(i);
                com.sankuai.waimai.foundation.utils.log.a.b("RefreshHeaderPlaceHolder", "onStateChanged: " + i, new Object[0]);
                if (RefreshHeaderPlaceHolder.this.b && RefreshHeaderPlaceHolder.this.i != i) {
                    try {
                        if (i == 6) {
                            RefreshHeaderPlaceHolder.c(RefreshHeaderPlaceHolder.this);
                        } else if (i > 0 && i <= 3) {
                            RefreshHeaderPlaceHolder.d(RefreshHeaderPlaceHolder.this);
                        } else {
                            RefreshHeaderPlaceHolder.e(RefreshHeaderPlaceHolder.this);
                        }
                    } catch (Exception e) {
                        com.sankuai.waimai.foundation.utils.log.a.a(e);
                        com.sankuai.waimai.foundation.utils.log.a.a(getClass().getSimpleName(), e.getMessage());
                    }
                    if (i != 1 && i != 2 && i != 3 && i != 6) {
                        RefreshHeaderPlaceHolder.this.setVisibility(4);
                        RefreshHeaderPlaceHolder.this.i = i;
                    }
                    RefreshHeaderPlaceHolder.this.setVisibility(0);
                    RefreshHeaderPlaceHolder.this.i = i;
                }
            }

            @Override // com.sankuai.waimai.business.page.home.widget.twolevel.RefreshHeaderHelper.a, com.sankuai.waimai.business.page.home.widget.twolevel.RefreshHeaderHelper.c
            public final void a(int i, float f, int i2, int i3, boolean z) {
                Object[] objArr2 = {Integer.valueOf(i), Float.valueOf(f), Integer.valueOf(i2), Integer.valueOf(i3), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "29a6eb65a82b9f62392a46de11903c7e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "29a6eb65a82b9f62392a46de11903c7e");
                    return;
                }
                super.a(i, f, i2, i3, z);
                com.sankuai.waimai.foundation.utils.log.a.b("RefreshHeaderPlaceHolder", "onScroll: " + i + "ratio: " + f, new Object[0]);
            }
        };
        a(context);
    }

    public RefreshHeaderPlaceHolder(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4abe7ace71d433da39d1372a7b37ea83", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4abe7ace71d433da39d1372a7b37ea83");
            return;
        }
        this.i = 0;
        this.j = true;
        this.k = new RefreshHeaderHelper.a() { // from class: com.sankuai.waimai.business.page.home.widget.twolevel.RefreshHeaderPlaceHolder.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.page.home.widget.twolevel.RefreshHeaderHelper.a, com.sankuai.waimai.business.page.home.widget.twolevel.RefreshHeaderHelper.c
            public final void a(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9ccce7c36f5520d65c41302da4571551", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9ccce7c36f5520d65c41302da4571551");
                    return;
                }
                super.a(i);
                com.sankuai.waimai.foundation.utils.log.a.b("RefreshHeaderPlaceHolder", "onStateChanged: " + i, new Object[0]);
                if (RefreshHeaderPlaceHolder.this.b && RefreshHeaderPlaceHolder.this.i != i) {
                    try {
                        if (i == 6) {
                            RefreshHeaderPlaceHolder.c(RefreshHeaderPlaceHolder.this);
                        } else if (i > 0 && i <= 3) {
                            RefreshHeaderPlaceHolder.d(RefreshHeaderPlaceHolder.this);
                        } else {
                            RefreshHeaderPlaceHolder.e(RefreshHeaderPlaceHolder.this);
                        }
                    } catch (Exception e) {
                        com.sankuai.waimai.foundation.utils.log.a.a(e);
                        com.sankuai.waimai.foundation.utils.log.a.a(getClass().getSimpleName(), e.getMessage());
                    }
                    if (i != 1 && i != 2 && i != 3 && i != 6) {
                        RefreshHeaderPlaceHolder.this.setVisibility(4);
                        RefreshHeaderPlaceHolder.this.i = i;
                    }
                    RefreshHeaderPlaceHolder.this.setVisibility(0);
                    RefreshHeaderPlaceHolder.this.i = i;
                }
            }

            @Override // com.sankuai.waimai.business.page.home.widget.twolevel.RefreshHeaderHelper.a, com.sankuai.waimai.business.page.home.widget.twolevel.RefreshHeaderHelper.c
            public final void a(int i, float f, int i2, int i3, boolean z) {
                Object[] objArr2 = {Integer.valueOf(i), Float.valueOf(f), Integer.valueOf(i2), Integer.valueOf(i3), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "29a6eb65a82b9f62392a46de11903c7e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "29a6eb65a82b9f62392a46de11903c7e");
                    return;
                }
                super.a(i, f, i2, i3, z);
                com.sankuai.waimai.foundation.utils.log.a.b("RefreshHeaderPlaceHolder", "onScroll: " + i + "ratio: " + f, new Object[0]);
            }
        };
        a(context);
    }

    public RefreshHeaderPlaceHolder(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11474be5f36b2bbe60d394fb970ac05d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11474be5f36b2bbe60d394fb970ac05d");
            return;
        }
        this.i = 0;
        this.j = true;
        this.k = new RefreshHeaderHelper.a() { // from class: com.sankuai.waimai.business.page.home.widget.twolevel.RefreshHeaderPlaceHolder.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.page.home.widget.twolevel.RefreshHeaderHelper.a, com.sankuai.waimai.business.page.home.widget.twolevel.RefreshHeaderHelper.c
            public final void a(int i2) {
                Object[] objArr2 = {Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9ccce7c36f5520d65c41302da4571551", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9ccce7c36f5520d65c41302da4571551");
                    return;
                }
                super.a(i2);
                com.sankuai.waimai.foundation.utils.log.a.b("RefreshHeaderPlaceHolder", "onStateChanged: " + i2, new Object[0]);
                if (RefreshHeaderPlaceHolder.this.b && RefreshHeaderPlaceHolder.this.i != i2) {
                    try {
                        if (i2 == 6) {
                            RefreshHeaderPlaceHolder.c(RefreshHeaderPlaceHolder.this);
                        } else if (i2 > 0 && i2 <= 3) {
                            RefreshHeaderPlaceHolder.d(RefreshHeaderPlaceHolder.this);
                        } else {
                            RefreshHeaderPlaceHolder.e(RefreshHeaderPlaceHolder.this);
                        }
                    } catch (Exception e) {
                        com.sankuai.waimai.foundation.utils.log.a.a(e);
                        com.sankuai.waimai.foundation.utils.log.a.a(getClass().getSimpleName(), e.getMessage());
                    }
                    if (i2 != 1 && i2 != 2 && i2 != 3 && i2 != 6) {
                        RefreshHeaderPlaceHolder.this.setVisibility(4);
                        RefreshHeaderPlaceHolder.this.i = i2;
                    }
                    RefreshHeaderPlaceHolder.this.setVisibility(0);
                    RefreshHeaderPlaceHolder.this.i = i2;
                }
            }

            @Override // com.sankuai.waimai.business.page.home.widget.twolevel.RefreshHeaderHelper.a, com.sankuai.waimai.business.page.home.widget.twolevel.RefreshHeaderHelper.c
            public final void a(int i2, float f, int i22, int i3, boolean z) {
                Object[] objArr2 = {Integer.valueOf(i2), Float.valueOf(f), Integer.valueOf(i22), Integer.valueOf(i3), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "29a6eb65a82b9f62392a46de11903c7e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "29a6eb65a82b9f62392a46de11903c7e");
                    return;
                }
                super.a(i2, f, i22, i3, z);
                com.sankuai.waimai.foundation.utils.log.a.b("RefreshHeaderPlaceHolder", "onScroll: " + i2 + "ratio: " + f, new Object[0]);
            }
        };
        a(context);
    }

    @TargetApi(21)
    public RefreshHeaderPlaceHolder(Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2353448f5464f96120e5e19843f460d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2353448f5464f96120e5e19843f460d");
            return;
        }
        this.i = 0;
        this.j = true;
        this.k = new RefreshHeaderHelper.a() { // from class: com.sankuai.waimai.business.page.home.widget.twolevel.RefreshHeaderPlaceHolder.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.page.home.widget.twolevel.RefreshHeaderHelper.a, com.sankuai.waimai.business.page.home.widget.twolevel.RefreshHeaderHelper.c
            public final void a(int i22) {
                Object[] objArr2 = {Integer.valueOf(i22)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9ccce7c36f5520d65c41302da4571551", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9ccce7c36f5520d65c41302da4571551");
                    return;
                }
                super.a(i22);
                com.sankuai.waimai.foundation.utils.log.a.b("RefreshHeaderPlaceHolder", "onStateChanged: " + i22, new Object[0]);
                if (RefreshHeaderPlaceHolder.this.b && RefreshHeaderPlaceHolder.this.i != i22) {
                    try {
                        if (i22 == 6) {
                            RefreshHeaderPlaceHolder.c(RefreshHeaderPlaceHolder.this);
                        } else if (i22 > 0 && i22 <= 3) {
                            RefreshHeaderPlaceHolder.d(RefreshHeaderPlaceHolder.this);
                        } else {
                            RefreshHeaderPlaceHolder.e(RefreshHeaderPlaceHolder.this);
                        }
                    } catch (Exception e) {
                        com.sankuai.waimai.foundation.utils.log.a.a(e);
                        com.sankuai.waimai.foundation.utils.log.a.a(getClass().getSimpleName(), e.getMessage());
                    }
                    if (i22 != 1 && i22 != 2 && i22 != 3 && i22 != 6) {
                        RefreshHeaderPlaceHolder.this.setVisibility(4);
                        RefreshHeaderPlaceHolder.this.i = i22;
                    }
                    RefreshHeaderPlaceHolder.this.setVisibility(0);
                    RefreshHeaderPlaceHolder.this.i = i22;
                }
            }

            @Override // com.sankuai.waimai.business.page.home.widget.twolevel.RefreshHeaderHelper.a, com.sankuai.waimai.business.page.home.widget.twolevel.RefreshHeaderHelper.c
            public final void a(int i22, float f, int i222, int i3, boolean z) {
                Object[] objArr2 = {Integer.valueOf(i22), Float.valueOf(f), Integer.valueOf(i222), Integer.valueOf(i3), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "29a6eb65a82b9f62392a46de11903c7e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "29a6eb65a82b9f62392a46de11903c7e");
                    return;
                }
                super.a(i22, f, i222, i3, z);
                com.sankuai.waimai.foundation.utils.log.a.b("RefreshHeaderPlaceHolder", "onScroll: " + i22 + "ratio: " + f, new Object[0]);
            }
        };
        a(context);
    }

    private void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d59e50c4990d974fe07431365e426f40", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d59e50c4990d974fe07431365e426f40");
            return;
        }
        this.h = context;
        try {
            View inflate = LayoutInflater.from(context).inflate(R.layout.wm_page_home_pull_refresh_header, (ViewGroup) this, true);
            this.c = (LottieAnimationView) inflate.findViewById(R.id.refresh_img_pulling);
            this.d = (LottieAnimationView) inflate.findViewById(R.id.refresh_img_transition);
            a("pull_refresh_pulling.json", 0, true, true);
            a("pull_refresh_transition.json", 2, false, false);
            a("pull_refresh_refreshing.json", 1, true, false);
            this.b = true;
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
            this.b = false;
            new View(getContext()).setLayoutParams(new ViewGroup.LayoutParams(-1, 100));
            com.sankuai.waimai.foundation.utils.log.a.a(getClass().getSimpleName(), e.getMessage());
        }
    }

    public RefreshHeaderHelper.c getOnSecondLevelListener() {
        return this.k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(LottieAnimationView lottieAnimationView, com.airbnb.lottie.e eVar, boolean z, int i) {
        Object[] objArr = {lottieAnimationView, eVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6a9916f051a49a20f256a7f5022f38f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6a9916f051a49a20f256a7f5022f38f");
        } else if (lottieAnimationView == null || eVar == null) {
        } else {
            try {
                lottieAnimationView.e();
                lottieAnimationView.setProgress(0.0f);
                lottieAnimationView.setComposition(eVar);
                lottieAnimationView.a();
                if (i == 2) {
                    lottieAnimationView.setVisibility(0);
                    if (this.c != null) {
                        this.c.setVisibility(8);
                        return;
                    }
                    return;
                }
                lottieAnimationView.setVisibility(0);
                if (this.d != null) {
                    this.d.setVisibility(8);
                }
            } catch (Exception e) {
                this.j = false;
                e.printStackTrace();
                com.sankuai.waimai.foundation.utils.log.a.a(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, int i, boolean z, boolean z2) {
        Object[] objArr = {str, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d4061dab31e443ae45daaa8beeeb1c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d4061dab31e443ae45daaa8beeeb1c1");
        } else if (this.h == null || TextUtils.isEmpty(str)) {
        } else {
            if (this.j) {
                b(str, i, z, z2);
            } else {
                c(str, i, z, z2);
            }
        }
    }

    private void b(final String str, final int i, final boolean z, final boolean z2) {
        SafeLottieAnimationView safeLottieAnimationView;
        Object[] objArr = {str, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0d5e0358c8ca2147bbc9460b0f09084", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0d5e0358c8ca2147bbc9460b0f09084");
            return;
        }
        if (i == 2) {
            safeLottieAnimationView = (SafeLottieAnimationView) this.d;
        } else {
            safeLottieAnimationView = (SafeLottieAnimationView) this.c;
        }
        com.sankuai.waimai.lottie.e.a().a(safeLottieAnimationView, "pull_to_refresh_lottie", str, "dynamic-tabs-lottie", new com.sankuai.waimai.lottie.c() { // from class: com.sankuai.waimai.business.page.home.widget.twolevel.RefreshHeaderPlaceHolder.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.lottie.c
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b8fe4b49dfc81ccb25cf8ae0bd6ce69a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b8fe4b49dfc81ccb25cf8ae0bd6ce69a");
                    return;
                }
                RefreshHeaderPlaceHolder.a(RefreshHeaderPlaceHolder.this, false);
                RefreshHeaderPlaceHolder.this.c(str, i, z, z2);
            }

            @Override // com.sankuai.waimai.lottie.c
            public final void a(com.airbnb.lottie.e eVar) {
                Object[] objArr2 = {eVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "036cba0d910aa3eb69cc24667113a764", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "036cba0d910aa3eb69cc24667113a764");
                } else if (eVar == null) {
                } else {
                    RefreshHeaderPlaceHolder.a(RefreshHeaderPlaceHolder.this, eVar, i, z2, z);
                }
            }

            @Override // com.sankuai.waimai.lottie.c
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e3cbc56a1d1db6680aa976b0a24d5435", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e3cbc56a1d1db6680aa976b0a24d5435");
                    return;
                }
                RefreshHeaderPlaceHolder.a(RefreshHeaderPlaceHolder.this, false);
                RefreshHeaderPlaceHolder.this.c(str, i, z, z2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str, final int i, final boolean z, final boolean z2) {
        Object[] objArr = {str, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9db87b93159ee9e7ce8ac6282ca9c1f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9db87b93159ee9e7ce8ac6282ca9c1f3");
        } else {
            a.b.a(this.h, str, new l() { // from class: com.sankuai.waimai.business.page.home.widget.twolevel.RefreshHeaderPlaceHolder.4
                public static ChangeQuickRedirect a;

                @Override // com.airbnb.lottie.l
                public final void a(@Nullable com.airbnb.lottie.e eVar) {
                    Object[] objArr2 = {eVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "233f4822ff5ce667d4c1dc4f33e92121", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "233f4822ff5ce667d4c1dc4f33e92121");
                    } else {
                        RefreshHeaderPlaceHolder.a(RefreshHeaderPlaceHolder.this, eVar, i, z2, z);
                    }
                }
            });
        }
    }
}
