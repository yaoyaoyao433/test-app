package com.sankuai.waimai.store.newwidgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import com.alipay.sdk.app.PayTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class NotableView extends FrameLayout {
    public static ChangeQuickRedirect a;
    private int b;
    private b c;
    private int d;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface b {
        int a();

        View a(@NonNull ViewGroup viewGroup);

        void a(View view, int i);
    }

    public static /* synthetic */ void a(NotableView notableView, final View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, notableView, changeQuickRedirect, false, "f039680bd063980cd242768623d532a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, notableView, changeQuickRedirect, false, "f039680bd063980cd242768623d532a4");
            return;
        }
        AnimationSet animationSet = new AnimationSet(true);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        TranslateAnimation translateAnimation = new TranslateAnimation(view.getX(), view.getX(), (notableView.getHeight() - view.getHeight()) - view.getTranslationY(), notableView.b - view.getTranslationY());
        animationSet.addAnimation(alphaAnimation);
        animationSet.addAnimation(translateAnimation);
        animationSet.setDuration(560L);
        animationSet.setFillAfter(true);
        animationSet.setStartOffset(80L);
        animationSet.setAnimationListener(new a() { // from class: com.sankuai.waimai.store.newwidgets.NotableView.2
            public static ChangeQuickRedirect a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.sankuai.waimai.store.newwidgets.NotableView.a, android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation) {
                Object[] objArr2 = {animation};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a9de6841c3cc41e71057e46868ae42aa", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a9de6841c3cc41e71057e46868ae42aa");
                } else {
                    NotableView.b(NotableView.this, view);
                }
            }

            @Override // com.sankuai.waimai.store.newwidgets.NotableView.a, android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                Object[] objArr2 = {animation};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9f826c40f5ded4bb1306b3e07f7e5138", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9f826c40f5ded4bb1306b3e07f7e5138");
                } else {
                    NotableView.this.a(view);
                }
            }
        });
        view.startAnimation(animationSet);
    }

    public static /* synthetic */ void b(NotableView notableView, View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, notableView, changeQuickRedirect, false, "3aa68de19c33e5118fe6ad9197fb4a8d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, notableView, changeQuickRedirect, false, "3aa68de19c33e5118fe6ad9197fb4a8d");
            return;
        }
        notableView.d++;
        if (notableView.d >= notableView.c.a()) {
            notableView.d = 0;
        }
        notableView.c.a(view, notableView.d);
    }

    public NotableView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b9aad71f51ee8a97861b92f4856f7f1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b9aad71f51ee8a97861b92f4856f7f1");
        }
    }

    public NotableView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cdf9340b82bc770f17413def27c22a63", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cdf9340b82bc770f17413def27c22a63");
        }
    }

    public NotableView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20e6bf6f831196edc9bbc3df9abc71a0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20e6bf6f831196edc9bbc3df9abc71a0");
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.defaultTranslationY}, 0, 0);
        this.b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }

    public void setAdapter(b bVar) {
        View childAt;
        View a2;
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c6b056675c8f9082a907fb31949f3bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c6b056675c8f9082a907fb31949f3bd");
            return;
        }
        this.c = bVar;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a30c21efc5de02fdca2dd3b0934a6902", RobustBitConfig.DEFAULT_VALUE)) {
            childAt = (View) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a30c21efc5de02fdca2dd3b0934a6902");
        } else {
            childAt = getChildCount() <= 0 ? null : getChildAt(0);
        }
        if (childAt != null) {
            childAt.clearAnimation();
        }
        removeAllViews();
        if (this.c == null || this.c.a() <= 0 || (a2 = this.c.a(this)) == null) {
            return;
        }
        a2.setTranslationY(this.b);
        addView(a2);
        this.d = 0;
        this.c.a(a2, 0);
        if (this.c.a() > 1) {
            Object[] objArr3 = {a2};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "04c3607852bef5749c421b6f012219cc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "04c3607852bef5749c421b6f012219cc");
            } else {
                a(a2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(@NonNull final View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f54a91ff784a489422d1971635d0ee72", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f54a91ff784a489422d1971635d0ee72");
            return;
        }
        AnimationSet animationSet = new AnimationSet(true);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        TranslateAnimation translateAnimation = new TranslateAnimation(view.getX(), view.getX(), view.getTranslationY() - this.b, -view.getTranslationY());
        animationSet.addAnimation(alphaAnimation);
        animationSet.addAnimation(translateAnimation);
        animationSet.setDuration(560L);
        animationSet.setStartOffset(PayTask.j);
        animationSet.setFillAfter(true);
        animationSet.setAnimationListener(new a() { // from class: com.sankuai.waimai.store.newwidgets.NotableView.1
            public static ChangeQuickRedirect a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.sankuai.waimai.store.newwidgets.NotableView.a, android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                Object[] objArr2 = {animation};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "96b2bd642bf9b9a5c019b86731ecd28e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "96b2bd642bf9b9a5c019b86731ecd28e");
                } else {
                    NotableView.a(NotableView.this, view);
                }
            }
        });
        view.startAnimation(animationSet);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    class a implements Animation.AnimationListener {
        public static ChangeQuickRedirect d;

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }

        private a() {
            Object[] objArr = {NotableView.this};
            ChangeQuickRedirect changeQuickRedirect = d;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ff8a564575365a3cf85539c6c96bc6f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ff8a564575365a3cf85539c6c96bc6f");
            }
        }
    }
}
