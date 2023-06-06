package com.sankuai.eh.plugins.skeleton.view;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.AppCompatImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.plugins.skeleton.view.d;
import com.squareup.picasso.Picasso;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class SKTImg extends AppCompatImageView {
    public static ChangeQuickRedirect a;
    private d.a b;

    public SKTImg(Context context, d.a aVar) {
        super(context);
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db27092527c1276ab11498725f7bba2c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db27092527c1276ab11498725f7bba2c");
            return;
        }
        this.b = aVar;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d6699d1ff35f50b33e9007bb9e3a8258", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d6699d1ff35f50b33e9007bb9e3a8258");
            return;
        }
        this.b.a(this);
        String b = com.sankuai.eh.component.service.utils.b.b(this.b.f.get("content"), "");
        if (Uri.parse(b).isHierarchical()) {
            Picasso.g(getContext()).d(b).a(this);
        }
    }
}
