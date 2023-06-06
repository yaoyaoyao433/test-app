package com.meituan.msc.common.aov_task.task;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class b<ExecuteResult> implements c<ExecuteResult> {
    public static ChangeQuickRedirect b;
    private final String a;
    public String c;

    public b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe9549c9f7d992d0ea3b871ef9d95eb5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe9549c9f7d992d0ea3b871ef9d95eb5");
        } else {
            this.a = str;
        }
    }

    @Override // com.meituan.msc.common.aov_task.task.c
    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de5df07145374ba5dd1b58514726102d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de5df07145374ba5dd1b58514726102d");
        }
        if (this.a != null) {
            return this.a;
        }
        return getClass().getCanonicalName();
    }

    @Override // com.meituan.msc.common.aov_task.task.c
    public void a(com.meituan.msc.common.aov_task.context.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (!PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "630fa779b72f4e8f971d64ea7c76e059", RobustBitConfig.DEFAULT_VALUE)) {
            throw new UnsupportedOperationException(toString());
        }
        PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "630fa779b72f4e8f971d64ea7c76e059");
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "504f0217652bba2f65ea83f55fb0bd83", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "504f0217652bba2f65ea83f55fb0bd83");
        }
        return "BaseTask{name='" + this.a + "@" + Integer.toHexString(hashCode()) + "'}";
    }
}
