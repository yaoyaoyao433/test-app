package com.sankuai.waimai.platform.provider;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.router.method.Func1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public Map<String, Boolean> b;
    private List<Func1<String, Boolean>> c;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dfe7438740826ed053dc4b0b6a410304", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dfe7438740826ed053dc4b0b6a410304");
            return;
        }
        this.b = new HashMap();
        this.c = new ArrayList();
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9fa56218bd6b20842f1f791f98762c43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9fa56218bd6b20842f1f791f98762c43");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.b.put(str, Boolean.TRUE);
        }
    }
}
