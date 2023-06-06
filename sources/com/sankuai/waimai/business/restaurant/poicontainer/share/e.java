package com.sankuai.waimai.business.restaurant.poicontainer.share;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e {
    public static ChangeQuickRedirect a;
    View b;
    TextView c;
    LayoutInflater d;
    ViewGroup e;

    public e(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e71013069c31ee3a941477cc32b6ea59", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e71013069c31ee3a941477cc32b6ea59");
            return;
        }
        this.d = LayoutInflater.from(com.meituan.android.singleton.b.a);
        this.e = viewGroup;
    }
}
