package com.meituan.android.ptcommonim.video.widget;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final PicPreviewBottomView b;
    private final int c;

    private a(PicPreviewBottomView picPreviewBottomView, int i) {
        this.b = picPreviewBottomView;
        this.c = i;
    }

    public static View.OnClickListener a(PicPreviewBottomView picPreviewBottomView, int i) {
        Object[] objArr = {picPreviewBottomView, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "71e9e7351ff67bfd650fd0506ee591a9", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "71e9e7351ff67bfd650fd0506ee591a9") : new a(picPreviewBottomView, i);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "367b2d6caf82b2f238f360c4d39436c7", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "367b2d6caf82b2f238f360c4d39436c7");
        } else {
            PicPreviewBottomView.a(this.b, this.c, view);
        }
    }
}
