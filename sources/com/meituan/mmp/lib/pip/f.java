package com.meituan.mmp.lib.pip;

import android.content.Context;
import android.support.constraint.R;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class f extends RelativeLayout {
    public static ChangeQuickRedirect a;
    View b;
    ImageView c;
    View.OnClickListener d;

    public f(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5683a3ca459daef49b8f458a766fc0d7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5683a3ca459daef49b8f458a766fc0d7");
        } else {
            setBackgroundResource(R.drawable.mmp_border);
        }
    }
}
