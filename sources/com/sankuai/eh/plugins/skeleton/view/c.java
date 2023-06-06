package com.sankuai.eh.plugins.skeleton.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.plugins.skeleton.view.SKTText;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {
    public static ChangeQuickRedirect a;
    private final SKTText.AnonymousClass1 b;
    private final String c;

    public c(SKTText.AnonymousClass1 anonymousClass1, String str) {
        this.b = anonymousClass1;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d28f84c4a5fda291401329d302713976", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d28f84c4a5fda291401329d302713976");
            return;
        }
        final SKTText.AnonymousClass1 anonymousClass1 = this.b;
        final String str = this.c;
        Object[] objArr2 = {anonymousClass1, str};
        ChangeQuickRedirect changeQuickRedirect2 = SKTText.AnonymousClass1.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "2ff1f70bc0f17b76a616203bebc3a03f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "2ff1f70bc0f17b76a616203bebc3a03f");
        } else if (TextUtils.isEmpty(SKTText.this.g.getText().toString())) {
            SKTText.this.g.setText(str);
            SKTText.this.k.start();
        } else {
            objectAnimator = SKTText.this.l;
            objectAnimator.start();
            objectAnimator2 = SKTText.this.l;
            objectAnimator2.addListener(new AnimatorListenerAdapter() { // from class: com.sankuai.eh.plugins.skeleton.view.SKTText.1.1
                public static ChangeQuickRedirect a;

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    Object[] objArr3 = {animator};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "69f2ed115fc02117918f0faa9f865b62", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "69f2ed115fc02117918f0faa9f865b62");
                        return;
                    }
                    super.onAnimationEnd(animator);
                    SKTText.this.k.start();
                    SKTText.this.g.setText(str);
                }
            });
        }
    }
}
