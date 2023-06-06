package com.sankuai.waimai.mach.parser;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d {
    public static ChangeQuickRedirect a;
    public String b;
    public List<Object> c;

    public d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "363ddd5959e214b109637c2c29abc195", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "363ddd5959e214b109637c2c29abc195");
        } else {
            this.b = str;
        }
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e454d1682c73768ff56dc6ad27417dae", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e454d1682c73768ff56dc6ad27417dae");
        }
        StringBuilder sb = new StringBuilder(this.b);
        sb.append(CommonConstant.Symbol.BRACKET_LEFT);
        if (this.c != null) {
            for (int i = 0; i < this.c.size(); i++) {
                Object obj = this.c.get(i);
                if (obj != null) {
                    sb.append(obj.toString());
                } else {
                    sb.append(StringUtil.NULL);
                }
                if (i < this.c.size() - 1) {
                    sb.append(", ");
                }
            }
        }
        sb.append(CommonConstant.Symbol.BRACKET_RIGHT);
        return sb.toString();
    }
}
