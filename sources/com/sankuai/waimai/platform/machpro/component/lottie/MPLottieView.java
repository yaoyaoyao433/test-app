package com.sankuai.waimai.platform.machpro.component.lottie;

import android.content.Context;
import android.graphics.Canvas;
import com.airbnb.lottie.LottieAnimationView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class MPLottieView extends LottieAnimationView {
    public static ChangeQuickRedirect c;

    public MPLottieView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80c9782019a8e313b7b5431f72cb99c7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80c9782019a8e313b7b5431f72cb99c7");
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24ff261403a82735790173b998ce632e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24ff261403a82735790173b998ce632e");
            return;
        }
        try {
            super.onDraw(canvas);
        } catch (Exception e) {
            com.sankuai.waimai.machpro.util.a.a("MPLottieView 渲染异常：" + e.getMessage());
        }
    }
}
