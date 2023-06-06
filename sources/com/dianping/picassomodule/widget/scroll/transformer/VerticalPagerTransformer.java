package com.dianping.picassomodule.widget.scroll.transformer;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class VerticalPagerTransformer extends BaseTransformer {
    public static ChangeQuickRedirect d;

    @Override // com.dianping.picassomodule.widget.scroll.transformer.BaseTransformer
    public void a(View view, float f) {
        Object[] objArr = {view, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1468cb6dd44374bf7633678568b42ffe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1468cb6dd44374bf7633678568b42ffe");
        } else {
            view.setTranslationY(f * view.getHeight());
        }
    }
}
