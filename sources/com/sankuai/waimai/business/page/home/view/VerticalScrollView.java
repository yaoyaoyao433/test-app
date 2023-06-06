package com.sankuai.waimai.business.page.home.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import com.dianping.shield.entity.ExposeAction;
import com.meituan.android.recce.views.anim.RecceAnimUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class VerticalScrollView extends FrameLayout {
    public static ChangeQuickRedirect a;
    private int b;
    private BaseAdapter c;
    private boolean d;
    private AnimatorSet e;
    private View f;
    private View g;
    private boolean h;
    private boolean i;
    private Handler j;
    private a k;

    public VerticalScrollView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79ff840021b028f7e76f9dcb2339ac8a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79ff840021b028f7e76f9dcb2339ac8a");
        }
    }

    private VerticalScrollView(Context context, AttributeSet attributeSet) {
        this(context, null, 0);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a5f0d23d46a73c8c2e07ff6094b2836", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a5f0d23d46a73c8c2e07ff6094b2836");
        }
    }

    public VerticalScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1a2228755d976102fb4ed5991cde182", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1a2228755d976102fb4ed5991cde182");
            return;
        }
        this.b = 0;
        this.d = true;
        this.h = false;
        this.i = false;
        this.j = new Handler(Looper.getMainLooper());
    }

    public void setAdapter(BaseAdapter baseAdapter) {
        Object[] objArr = {baseAdapter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5903c35ef870f4571b8833e1785cf834", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5903c35ef870f4571b8833e1785cf834");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d904390176e2b425fe67445b1b37a9f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d904390176e2b425fe67445b1b37a9f7");
        } else {
            a();
            this.h = false;
            if (this.e != null) {
                this.e.cancel();
            }
            removeAllViews();
        }
        this.c = baseAdapter;
        this.b = 0;
        this.f = baseAdapter.getView(0, null, this);
        if (baseAdapter.getCount() == 1) {
            addView(this.f);
            return;
        }
        this.g = baseAdapter.getView((this.b + 1) % this.c.getCount(), null, this);
        this.g.setVisibility(4);
        addView(this.g);
        addView(this.f);
        this.h = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "588baa109e9f0033fe96e035e4eff944", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "588baa109e9f0033fe96e035e4eff944");
            return;
        }
        super.onDetachedFromWindow();
        a();
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c421459178e00ef5554b11c05d0e7a4f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c421459178e00ef5554b11c05d0e7a4f");
        } else if (this.h && this.i) {
            this.i = false;
            this.j.removeCallbacks(this.k);
            this.k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a implements Runnable {
        public static ChangeQuickRedirect a;
        private WeakReference<VerticalScrollView> b;

        @Override // java.lang.Runnable
        public final void run() {
            final VerticalScrollView verticalScrollView;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c46d84bb9e312ce6fe57a7013a01b6fc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c46d84bb9e312ce6fe57a7013a01b6fc");
                return;
            }
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d7968e7ac8ede2f27faf277c9c67736f", RobustBitConfig.DEFAULT_VALUE)) {
                verticalScrollView = (VerticalScrollView) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d7968e7ac8ede2f27faf277c9c67736f");
            } else if (this.b == null || (verticalScrollView = this.b.get()) == null) {
                verticalScrollView = null;
            }
            if (verticalScrollView != null && verticalScrollView.h) {
                if (!verticalScrollView.d) {
                    verticalScrollView.j.postDelayed(this, ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE);
                    return;
                }
                verticalScrollView.d = false;
                int count = (verticalScrollView.b + 1) % verticalScrollView.c.getCount();
                final View view = verticalScrollView.c.getView(count, verticalScrollView.g, verticalScrollView);
                final View view2 = verticalScrollView.f;
                view.setVisibility(0);
                view2.setVisibility(0);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.play(ObjectAnimator.ofFloat(view, RecceAnimUtils.TRANSLATION_Y, view.getHeight(), 0.0f).setDuration(500L)).with(ObjectAnimator.ofFloat(view2, RecceAnimUtils.TRANSLATION_Y, 0.0f, -view2.getHeight()).setDuration(500L));
                animatorSet.start();
                animatorSet.addListener(new Animator.AnimatorListener() { // from class: com.sankuai.waimai.business.page.home.view.VerticalScrollView.a.1
                    public static ChangeQuickRedirect a;

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
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9aaa6ba285473685e22271e62e40e04a", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9aaa6ba285473685e22271e62e40e04a");
                            return;
                        }
                        verticalScrollView.d = true;
                        view2.setVisibility(8);
                        view.setVisibility(0);
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationCancel(Animator animator) {
                        Object[] objArr3 = {animator};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "90718d9e032f734d13376ac360b0913a", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "90718d9e032f734d13376ac360b0913a");
                            return;
                        }
                        verticalScrollView.d = true;
                        view2.setVisibility(8);
                        view.setVisibility(0);
                    }
                });
                verticalScrollView.b = count;
                View view3 = verticalScrollView.f;
                verticalScrollView.f = verticalScrollView.g;
                verticalScrollView.g = view3;
                verticalScrollView.j.postDelayed(this, ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE);
            }
        }
    }
}
