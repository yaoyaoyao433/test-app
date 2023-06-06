package com.dianping.picassocontroller.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import com.meituan.android.recce.views.anim.RecceAnimUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class CircleProgressBar extends AppCompatImageView implements c {
    public static ChangeQuickRedirect a;
    private ObjectAnimator b;

    @Override // com.dianping.picassocontroller.widget.c
    public final int c() {
        return 0;
    }

    public CircleProgressBar(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4c4555dce3404336b78a008569d9391", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4c4555dce3404336b78a008569d9391");
        } else {
            d();
        }
    }

    public CircleProgressBar(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b64586abf1a9c8a2098555363af75b34", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b64586abf1a9c8a2098555363af75b34");
        } else {
            d();
        }
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4dda2c7bc15a491f3aac37d8dbb54350", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4dda2c7bc15a491f3aac37d8dbb54350");
            return;
        }
        setBackgroundResource(R.drawable.pcs_loading_small_bg);
        setScaleType(ImageView.ScaleType.FIT_XY);
        setImageResource(R.drawable.pcs_loading_small_main);
    }

    @Override // com.dianping.picassocontroller.widget.c
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6952d763e06eb09fe9f52ef525bccf46", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6952d763e06eb09fe9f52ef525bccf46");
            return;
        }
        if (this.b == null) {
            this.b = ObjectAnimator.ofFloat(this, RecceAnimUtils.ROTATION, 0.0f, 360.0f).setDuration(1000L);
            this.b.setInterpolator(new LinearInterpolator());
            this.b.setRepeatCount(-1);
        }
        this.b.start();
    }

    @Override // com.dianping.picassocontroller.widget.c
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d8666ba6142cc8acd01b21735c0bcd8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d8666ba6142cc8acd01b21735c0bcd8");
        } else if (this.b != null) {
            this.b.end();
        }
    }

    @Override // com.dianping.picassocontroller.widget.c
    public void setProgressRotation(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5a6987b16912089761b354d3ab57d74", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5a6987b16912089761b354d3ab57d74");
        } else {
            setRotation(f * 360.0f);
        }
    }
}
