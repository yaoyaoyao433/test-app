package com.meituan.passport.view;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class j implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final TextButton b;

    private j(TextButton textButton) {
        this.b = textButton;
    }

    public static View.OnClickListener a(TextButton textButton) {
        Object[] objArr = {textButton};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "701bd8efc43008153b1df5f0bfd2740a", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "701bd8efc43008153b1df5f0bfd2740a") : new j(textButton);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62aae274b2bc5953d0f290b1311a10ac", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62aae274b2bc5953d0f290b1311a10ac");
        } else {
            TextButton.a(this.b, view);
        }
    }
}
