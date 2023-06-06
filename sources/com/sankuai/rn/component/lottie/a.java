package com.sankuai.rn.component.lottie;

import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.facebook.react.bridge.ReadableArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    final WeakReference<LottieAnimationView> b;
    String c;
    Float d;
    Boolean e;
    Float f;
    boolean g;
    String h;
    ImageView.ScaleType i;
    String j;
    Boolean k;
    ReadableArray l;

    public a(LottieAnimationView lottieAnimationView) {
        Object[] objArr = {lottieAnimationView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7e5bd09bf985bf579c0e08cb1443179", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7e5bd09bf985bf579c0e08cb1443179");
        } else {
            this.b = new WeakReference<>(lottieAnimationView);
        }
    }
}
