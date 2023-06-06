package com.meituan.roodesign.widgets.tips;

import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static void a(ImageView imageView, @Nullable Drawable drawable) {
        Object[] objArr = {imageView, drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "82740c8d5202a99f6fc548ad9f9d8ede", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "82740c8d5202a99f6fc548ad9f9d8ede");
        } else if (drawable != null) {
            imageView.setImageDrawable(drawable);
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
    }
}
