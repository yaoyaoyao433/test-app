package com.dianping.networklog;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class ad extends a {
    public static ChangeQuickRedirect a;
    private final List<b> b;

    public ad(List<b> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa42257d8925c26420afa2fe7b340ed2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa42257d8925c26420afa2fe7b340ed2");
        } else {
            this.b = list;
        }
    }

    @Override // com.dianping.networklog.a, com.dianping.networklog.b
    public final JSONObject a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4c52ca3570e864d1be20471e919e42e", 6917529027641081856L)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4c52ca3570e864d1be20471e919e42e");
        }
        if (this.b != null) {
            for (b bVar : this.b) {
                JSONObject a2 = bVar.a();
                if (c.e) {
                    StringBuilder sb = new StringBuilder("[getConfig][");
                    sb.append(bVar.getClass().getCanonicalName());
                    sb.append(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
                    sb.append(a2);
                    continue;
                }
                if (a2 != null) {
                    return a2;
                }
            }
        }
        return super.a();
    }
}
