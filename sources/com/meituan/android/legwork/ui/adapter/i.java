package com.meituan.android.legwork.ui.adapter;

import android.view.View;
import com.meituan.android.legwork.bean.im.IMMsgTemplate;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class i implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final h b;
    private final IMMsgTemplate c;

    private i(h hVar, IMMsgTemplate iMMsgTemplate) {
        this.b = hVar;
        this.c = iMMsgTemplate;
    }

    public static View.OnClickListener a(h hVar, IMMsgTemplate iMMsgTemplate) {
        Object[] objArr = {hVar, iMMsgTemplate};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f0926fbe06573e51ba8b45db537e051c", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f0926fbe06573e51ba8b45db537e051c") : new i(hVar, iMMsgTemplate);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32f41470321e13e3499d2193429a7bb6", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32f41470321e13e3499d2193429a7bb6");
            return;
        }
        h hVar = this.b;
        IMMsgTemplate iMMsgTemplate = this.c;
        Object[] objArr2 = {hVar, iMMsgTemplate, view};
        ChangeQuickRedirect changeQuickRedirect2 = h.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "a21cdfdda2783cbe67c961284daf31c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "a21cdfdda2783cbe67c961284daf31c7");
        } else if (hVar.c != null) {
            hVar.c.a(iMMsgTemplate);
        }
    }
}
