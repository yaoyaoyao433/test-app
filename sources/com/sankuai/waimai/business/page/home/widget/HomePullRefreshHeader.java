package com.sankuai.waimai.business.page.home.widget;

import android.animation.Animator;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.e;
import com.airbnb.lottie.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.lottie.a;
import com.sankuai.waimai.platform.widget.pullrefresh.PullRefreshLogic;
import com.sankuai.waimai.platform.widget.pullrefresh.a;
import com.sankuai.waimai.platform.widget.pullrefresh.b;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class HomePullRefreshHeader extends FrameLayout implements a {
    public static ChangeQuickRedirect a;
    private boolean b;
    private LottieAnimationView c;
    private LottieAnimationView d;
    private e e;
    private e f;
    private e g;
    private Context h;

    @Override // com.sankuai.waimai.platform.widget.pullrefresh.a
    public final void a(@NonNull b bVar, int i, int i2, @PullRefreshLogic.State int i3) {
    }

    public HomePullRefreshHeader(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc8746da950342a3e38b27d9fc9c009b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc8746da950342a3e38b27d9fc9c009b");
        } else {
            a(context);
        }
    }

    public HomePullRefreshHeader(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5baf52abcedbd485a841d6405ee1d22b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5baf52abcedbd485a841d6405ee1d22b");
        } else {
            a(context);
        }
    }

    private void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85c494155f29bbd2b50cab7314e1cc42", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85c494155f29bbd2b50cab7314e1cc42");
            return;
        }
        this.h = context;
        ah.c(this, 0, 40, 0, 0);
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

    @Override // com.sankuai.waimai.platform.widget.pullrefresh.a
    public final void a(@NonNull b bVar, int i, int i2) {
        Object[] objArr = {bVar, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95755373cea70b9c3fcdf2eaf4e02a99", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95755373cea70b9c3fcdf2eaf4e02a99");
        } else if (this.b) {
            boolean z = i != 0;
            try {
                if (i == 3) {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bb5fba4fe35d5c710aac8328031f8091", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bb5fba4fe35d5c710aac8328031f8091");
                    } else if (this.d != null) {
                        this.d.setVisibility(0);
                        if (this.g != null) {
                            a(this.d, this.g, false, 2);
                            this.d.a(new Animator.AnimatorListener() { // from class: com.sankuai.waimai.business.page.home.widget.HomePullRefreshHeader.1
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
                                    Object[] objArr3 = {animator};
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f1c043f5f3950830003fdfa56bdf1478", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f1c043f5f3950830003fdfa56bdf1478");
                                    } else if (HomePullRefreshHeader.this.f != null) {
                                        HomePullRefreshHeader.this.a(HomePullRefreshHeader.this.c, HomePullRefreshHeader.this.f, true, 1);
                                    } else {
                                        HomePullRefreshHeader.this.a("pull_refresh_pulling.json", 0, true, true);
                                    }
                                }
                            });
                        }
                    }
                } else if (i >= 4) {
                    a();
                } else {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "04d35664d82f0e127896cac0e483ac58", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "04d35664d82f0e127896cac0e483ac58");
                    } else if (this.c != null) {
                        this.c.setVisibility(0);
                        if (this.e != null) {
                            a(this.c, this.e, true, 0);
                        } else {
                            a("pull_refresh_pulling.json", 0, true, true);
                        }
                    }
                }
                if (z) {
                    return;
                }
                a();
            } catch (Exception e) {
                com.sankuai.waimai.foundation.utils.log.a.a(e);
                com.sankuai.waimai.foundation.utils.log.a.a(getClass().getSimpleName(), e.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(LottieAnimationView lottieAnimationView, e eVar, boolean z, int i) {
        Object[] objArr = {lottieAnimationView, eVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "840efe7c440ea598ef97a074399567b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "840efe7c440ea598ef97a074399567b0");
        } else if (lottieAnimationView == null || eVar == null) {
        } else {
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
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, final int i, final boolean z, final boolean z2) {
        Object[] objArr = {str, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99ae9767974178c817955e71ea4a0202", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99ae9767974178c817955e71ea4a0202");
        } else if (this.h == null || TextUtils.isEmpty(str)) {
        } else {
            try {
                a.b.a(this.h, str, new l() { // from class: com.sankuai.waimai.business.page.home.widget.HomePullRefreshHeader.2
                    public static ChangeQuickRedirect a;

                    @Override // com.airbnb.lottie.l
                    public final void a(@Nullable e eVar) {
                        Object[] objArr2 = {eVar};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e3581aa3f7e286f2ea9d5a748ee7b21f", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e3581aa3f7e286f2ea9d5a748ee7b21f");
                        } else if (eVar == null) {
                        } else {
                            if (i == 0) {
                                HomePullRefreshHeader.this.e = eVar;
                            } else if (i == 1) {
                                HomePullRefreshHeader.this.f = eVar;
                            } else if (i == 2) {
                                HomePullRefreshHeader.this.g = eVar;
                            }
                            if (z2) {
                                if (i == 2) {
                                    HomePullRefreshHeader.this.a(HomePullRefreshHeader.this.c, eVar, z, i);
                                } else {
                                    HomePullRefreshHeader.this.a(HomePullRefreshHeader.this.d, eVar, z, i);
                                }
                            }
                        }
                    }
                });
            } catch (Exception unused) {
            }
        }
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d4502735cbb8d1ff5a34e9e78900cba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d4502735cbb8d1ff5a34e9e78900cba");
        } else if (this.c != null) {
            this.c.f();
        }
    }
}
