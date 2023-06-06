package com.meituan.android.neohybrid.v2.neo.loading;

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
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bb53cd00c635eb896c6c9094a5b86597", RobustBitConfig.DEFAULT_VALUE) ? (ValueAnimator.AnimatorUpdateListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bb53cd00c635eb896c6c9094a5b86597") : new a(imageView);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object[] objArr = {valueAnimator};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93fd83eaaceb32d74dbdaa1ae56fe270", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93fd83eaaceb32d74dbdaa1ae56fe270");
        } else {
            LoadingDialog.a(this.b, valueAnimator);
        }
    }
}
