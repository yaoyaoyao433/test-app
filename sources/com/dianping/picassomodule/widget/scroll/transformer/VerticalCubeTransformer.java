package com.dianping.picassomodule.widget.scroll.transformer;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class VerticalCubeTransformer extends VerticalPagerTransformer {
    public static ChangeQuickRedirect c;

    @Override // com.dianping.picassomodule.widget.scroll.transformer.VerticalPagerTransformer, com.dianping.picassomodule.widget.scroll.transformer.BaseTransformer
    public final void a(View view, float f) {
        Object[] objArr = {view, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a50a9a7fc9c686ffcd8cc0ac621927a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a50a9a7fc9c686ffcd8cc0ac621927a4");
            return;
        }
        super.a(view, f);
        view.setPivotX(this.b * 0.5f);
        view.setPivotY(f < 0.0f ? view.getHeight() : 0.0f);
        view.setRotationX(f * (-75.0f));
    }
}
