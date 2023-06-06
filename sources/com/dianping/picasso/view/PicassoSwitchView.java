package com.dianping.picasso.view;

import android.content.Context;
import android.support.constraint.R;
import android.support.v7.widget.SwitchCompat;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class PicassoSwitchView extends SwitchCompat {
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean inUpdating;

    public PicassoSwitchView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "edb7bf21ef58cb5d9a12bfcba09ecec5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "edb7bf21ef58cb5d9a12bfcba09ecec5");
            return;
        }
        this.inUpdating = false;
        setShowText(false);
        setClickable(true);
        setThumbResource(R.drawable.abc_switch_thumb_material);
        setTrackResource(R.drawable.abc_switch_track_mtrl_alpha);
        setGravity(17);
    }

    public boolean isInUpdating() {
        return this.inUpdating;
    }

    public void setInUpdating(boolean z) {
        this.inUpdating = z;
    }
}
