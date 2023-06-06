package com.sankuai.waimai.store.poi.list.newp.home;

import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.store.base.SCBaseActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private SCBaseActivity b;
    private String c;
    private ViewGroup d;
    private Map<String, Object> e;
    private Map<String, Object> f;
    private final List<com.sankuai.waimai.store.base.b> g;

    public b(SCBaseActivity sCBaseActivity, String str, ViewGroup viewGroup) {
        Object[] objArr = {sCBaseActivity, str, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9355eacb929da2f66400bf40407f5f94", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9355eacb929da2f66400bf40407f5f94");
            return;
        }
        this.e = new HashMap();
        this.f = new HashMap();
        this.g = new ArrayList();
        this.b = sCBaseActivity;
        this.c = str;
        this.d = viewGroup;
    }
}
