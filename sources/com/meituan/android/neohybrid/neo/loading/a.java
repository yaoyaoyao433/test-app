package com.meituan.android.neohybrid.neo.loading;

import android.animation.ValueAnimator;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {
    public static ChangeQuickRedirect a;
    private final ImageView b;

    private a(ImageView imageView) {
        this.b = imageView;
    }

    public static ValueAnimator.AnimatorUpdateListener a(ImageView imageView) {
        Object[] objArr = {imageView};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6e57f7ede0fa538249b86c7e1ede4d9e", RobustBitConfig.DEFAULT_VALUE) ? (ValueAnimator.AnimatorUpdateListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6e57f7ede0fa538249b86c7e1ede4d9e") : new a(imageView);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object[] objArr = {valueAnimator};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ca0f93da6d4ab4ec56447beb92bd703", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ca0f93da6d4ab4ec56447beb92bd703");
        } else {
            LoadingDialog.a(this.b, valueAnimator);
        }
    }
}
