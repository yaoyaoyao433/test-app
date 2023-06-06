package com.sankuai.waimai.reactnative.lottie;

import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    final WeakReference<LottieAnimationView> b;
    String c;
    Float d;
    Boolean e;
    Float f;
    boolean g;
    String h;
    LottieAnimationView.a i;
    Boolean j;
    ImageView.ScaleType k;
    String l;
    Boolean m;

    public a(LottieAnimationView lottieAnimationView) {
        Object[] objArr = {lottieAnimationView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aeeb1ea02d7ed34ed617118fc5b56e67", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aeeb1ea02d7ed34ed617118fc5b56e67");
        } else {
            this.b = new WeakReference<>(lottieAnimationView);
        }
    }
}
