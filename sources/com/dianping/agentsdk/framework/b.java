package com.dianping.agentsdk.framework;

import com.dianping.shield.framework.ConfigPriority;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b implements Serializable {
    public static ChangeQuickRedirect a;
    public Class<? extends AgentInterface> b;
    public String c;
    public String d;
    public Class e;
    public int f;
    public HashMap<String, Serializable> g;

    public b(Class<? extends AgentInterface> cls, String str) {
        Object[] objArr = {cls, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "028e3b2d70055596af4ed2d62bbb4ec5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "028e3b2d70055596af4ed2d62bbb4ec5");
            return;
        }
        this.f = ConfigPriority.MAIN;
        if (str == null) {
            throw new RuntimeException("index 不许为null 可以传空字符串");
        }
        this.b = cls;
        this.d = str;
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74f8259a9e4ec25d1a33f3e86b45ee03", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74f8259a9e4ec25d1a33f3e86b45ee03");
        }
        if (this.b != null) {
            return this.b.getSimpleName() + StringUtil.SPACE + this.d;
        } else if (this.e != null) {
            return this.e.getSimpleName() + StringUtil.SPACE + this.d;
        } else {
            return this.c + StringUtil.SPACE + this.d;
        }
    }
}
