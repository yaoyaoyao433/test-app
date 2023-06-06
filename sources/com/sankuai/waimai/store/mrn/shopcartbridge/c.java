package com.sankuai.waimai.store.mrn.shopcartbridge;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.platform.domain.core.order.WmOrderedFood;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class c {
    public static ChangeQuickRedirect a = null;
    static final String b = "c";
    public Activity c;

    public c(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec8cff4edbe8c85b81a8ed48cf86b8a6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec8cff4edbe8c85b81a8ed48cf86b8a6");
        } else {
            this.c = activity;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public final com.sankuai.waimai.store.platform.domain.manager.poi.a a;
        public final List<WmOrderedFood> b;
        public final Map<String, Object> c;
        public String d;

        public a(com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, List<WmOrderedFood> list, Map<String, Object> map, String str) {
            this.a = aVar;
            this.b = list;
            this.c = map;
            this.d = str;
        }
    }
}
