package com.sankuai.waimai.ugc.creator.component;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class b extends com.sankuai.waimai.ugc.creator.base.b {
    public static ChangeQuickRedirect a;
    public List<com.sankuai.waimai.ugc.creator.entity.a> b;
    public LinearLayout c;
    public a d;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface a {
        void a(com.sankuai.waimai.ugc.creator.entity.a aVar);
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.b
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa6ea6a007361e48e7a65d2c8ebeb5d1", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa6ea6a007361e48e7a65d2c8ebeb5d1");
        }
        this.c = new LinearLayout(A());
        this.c.setOrientation(0);
        int a2 = com.sankuai.waimai.foundation.utils.g.a(A(), 16.0f);
        this.c.setPadding(a2, 0, a2, 0);
        this.c.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        return this.c;
    }
}
