package com.sankuai.titans.base;

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
/* loaded from: classes4.dex */
public class LoadingItem extends LinearLayout {
    public static ChangeQuickRedirect changeQuickRedirect;

    public LoadingItem(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ecb23fb0828ad87077b14fff969ee13c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ecb23fb0828ad87077b14fff969ee13c");
        }
    }

    public LoadingItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "889c452d900095a4832999ad6e5b8a52", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "889c452d900095a4832999ad6e5b8a52");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9e8e5227ef06d24baf0539ccc396e2f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9e8e5227ef06d24baf0539ccc396e2f7");
            return;
        }
        super.onAttachedToWindow();
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.titans_loading_rotate_alpha);
        loadAnimation.setInterpolator(new LinearInterpolator());
        findViewById(R.id.anim_icon).startAnimation(loadAnimation);
    }
}
