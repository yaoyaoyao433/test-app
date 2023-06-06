package com.sankuai.eh.plugins.skeleton.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.tools.d;
import com.sankuai.eh.plugins.skeleton.util.b;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {
    public static ChangeQuickRedirect a;
    private final b.a b;
    private final List c;

    private c(b.a aVar, List list) {
        this.b = aVar;
        this.c = list;
    }

    public static Runnable a(b.a aVar, List list) {
        Object[] objArr = {aVar, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0614090c23b43b11296d0f84f895c58f", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0614090c23b43b11296d0f84f895c58f") : new c(aVar, list);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15084ea490a91d4813f1acaf085723c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15084ea490a91d4813f1acaf085723c0");
            return;
        }
        b.a aVar = this.b;
        List<ArrayList<Integer>> list = this.c;
        Object[] objArr2 = {aVar, list};
        ChangeQuickRedirect changeQuickRedirect2 = b.a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "a801ea93eda9ac9271dcfa6ea7ebf9f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "a801ea93eda9ac9271dcfa6ea7ebf9f0");
            return;
        }
        d.b("vlq解析完成");
        aVar.b.a(list);
    }
}
