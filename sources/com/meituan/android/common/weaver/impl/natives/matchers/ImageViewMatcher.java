package com.meituan.android.common.weaver.impl.natives.matchers;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.ImageView;
import com.meituan.android.common.weaver.impl.natives.GridsChecker;
import com.meituan.android.common.weaver.impl.utils.DisplayUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.squareup.picasso.PicassoDrawable;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ImageViewMatcher extends AbstractViewMatcher {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final GridsChecker checker;
    private final Context context;
    private int dp50;
    private int maxImageHeight;
    private int maxImageWidth;

    public ImageViewMatcher(@NonNull Context context, @NonNull GridsChecker gridsChecker) {
        Object[] objArr = {context, gridsChecker};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5867203c550679c02805875445b38fb8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5867203c550679c02805875445b38fb8");
            return;
        }
        this.checker = gridsChecker;
        this.context = context;
        this.dp50 = DisplayUtil.dp2Px(context, 50.0f);
    }

    @Override // com.meituan.android.common.weaver.impl.natives.matchers.AbstractViewMatcher
    public boolean match(View view) {
        Drawable drawable;
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "73dfb2a6decb3d1e151b115a3a7f083f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "73dfb2a6decb3d1e151b115a3a7f083f")).booleanValue();
        }
        if ((view instanceof ImageView) && (drawable = ((ImageView) view).getDrawable()) != null) {
            if (this.maxImageHeight == 0) {
                this.maxImageWidth = this.checker.getCurrentWidth() / 3;
                this.maxImageHeight = this.checker.getCurrentHeight() / 3;
            }
            return ((drawable instanceof BitmapDrawable) || (drawable instanceof PicassoDrawable) || ((view.getMeasuredWidth() <= this.maxImageWidth || view.getMeasuredHeight() <= this.dp50) && (view.getMeasuredHeight() <= this.maxImageHeight || view.getMeasuredWidth() <= this.dp50))) && view.getVisibility() == 0;
        }
        return false;
    }
}
