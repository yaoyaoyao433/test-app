package com.sankuai.waimai.platform.widget.labelview;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.widget.labelview.b;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends c {
    public static ChangeQuickRedirect a;
    private final b.a e;

    public a(b.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2bbbe9a8ac303517dfe612a670a25534", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2bbbe9a8ac303517dfe612a670a25534");
        } else {
            this.e = aVar;
        }
    }

    @Override // com.sankuai.waimai.platform.widget.labelview.e
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5cdf61506c3f4cf20b626619ee96176", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5cdf61506c3f4cf20b626619ee96176");
            return;
        }
        super.a();
        this.e.a();
    }
}
