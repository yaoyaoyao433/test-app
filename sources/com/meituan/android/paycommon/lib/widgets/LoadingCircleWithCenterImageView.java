package com.meituan.android.paycommon.lib.widgets;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class LoadingCircleWithCenterImageView extends RelativeLayout {
    public static ChangeQuickRedirect a;
    public View b;
    private Animation c;

    public LoadingCircleWithCenterImageView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "494663780d4b18bdab544222293aca96", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "494663780d4b18bdab544222293aca96");
        } else {
            b();
        }
    }

    public LoadingCircleWithCenterImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "382257510e5661c7375a1295e51888f0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "382257510e5661c7375a1295e51888f0");
        } else {
            b();
        }
    }

    public LoadingCircleWithCenterImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7ff9079c8c2abdc4b54a9d0e42d4a4e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7ff9079c8c2abdc4b54a9d0e42d4a4e");
        } else {
            b();
        }
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8959b4860419c06ab5ab764129d2d95f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8959b4860419c06ab5ab764129d2d95f");
            return;
        }
        Drawable drawable = getContext().getResources().getDrawable(R.drawable.paycommon_icon_payment_loading_detection);
        ImageView imageView = new ImageView(getContext());
        imageView.setImageDrawable(drawable);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        addView(imageView, layoutParams);
        Drawable drawable2 = getContext().getResources().getDrawable(R.drawable.paycommon_open_fingerprint_loading);
        this.b = new View(getContext());
        if (Build.VERSION.SDK_INT >= 16) {
            this.b.setBackground(drawable2);
        } else {
            this.b.setBackgroundDrawable(drawable2);
        }
        ViewGroup.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        addView(this.b, layoutParams2);
    }

    public static /* synthetic */ void a(LoadingCircleWithCenterImageView loadingCircleWithCenterImageView) {
        Object[] objArr = {loadingCircleWithCenterImageView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "42804cafb3d177c897f40021498d7a31", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "42804cafb3d177c897f40021498d7a31");
            return;
        }
        loadingCircleWithCenterImageView.c = new RotateAnimation(0.0f, 360.0f, loadingCircleWithCenterImageView.getHeight() / 2, loadingCircleWithCenterImageView.getWidth() / 2);
        loadingCircleWithCenterImageView.c.setInterpolator(new LinearInterpolator());
        loadingCircleWithCenterImageView.c.setRepeatCount(-1);
        loadingCircleWithCenterImageView.c.setDuration(1000L);
        loadingCircleWithCenterImageView.b.startAnimation(loadingCircleWithCenterImageView.c);
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a2d6c218c420e7311ca8f4acc8e93a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a2d6c218c420e7311ca8f4acc8e93a1");
        } else if (this.c != null) {
            this.c.cancel();
        }
    }
}
