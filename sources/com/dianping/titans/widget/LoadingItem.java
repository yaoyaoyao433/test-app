package com.dianping.titans.widget;

import android.content.Context;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class LoadingItem extends LinearLayout {
    public static ChangeQuickRedirect changeQuickRedirect;

    public LoadingItem(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5a03e91925b73f091e03651e0177c221", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5a03e91925b73f091e03651e0177c221");
        }
    }

    public LoadingItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2d2edb077564e3ada4a80c7b8713013b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2d2edb077564e3ada4a80c7b8713013b");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5c3995434be85ca50d3094bda9f82509", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5c3995434be85ca50d3094bda9f82509");
            return;
        }
        super.onAttachedToWindow();
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.titans_loading_rotate_alpha);
        loadAnimation.setInterpolator(new LinearInterpolator());
        findViewById(R.id.anim_icon).startAnimation(loadAnimation);
    }
}
