package com.sankuai.xm.coredata.processor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.util.ac;
import com.sankuai.xm.coredata.bean.BaseDataMsg;
import com.sankuai.xm.login.net.taskqueue.d;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class b extends d implements d.a {
    public static ChangeQuickRedirect a;
    private a d;

    public b(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f360c1632d118c01260c1e3834e84d82", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f360c1632d118c01260c1e3834e84d82");
            return;
        }
        this.d = aVar;
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = d.b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e644f73f9db6625779538a90d86c993d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e644f73f9db6625779538a90d86c993d");
            return;
        }
        synchronized (this) {
            if (this.c.contains(this)) {
                return;
            }
            this.c.add(this);
        }
    }

    public final <T> T a(String str) {
        d.b b;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2bb15aebcb4b27560dee7db556822667", 6917529027641081856L)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2bb15aebcb4b27560dee7db556822667");
        }
        if (ac.a(str) || (b = b(str)) == null) {
            return null;
        }
        return (T) b.b;
    }

    @Override // com.sankuai.xm.login.net.taskqueue.d.a
    public final void a(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6e7d3f31c7bccb38b6c96a8125e50bb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6e7d3f31c7bccb38b6c96a8125e50bb");
        } else if (obj instanceof BaseDataMsg) {
            this.d.a((BaseDataMsg) obj);
        }
    }

    @Override // com.sankuai.xm.login.net.taskqueue.d.a
    public final void b(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8684add63bca8df9bbf4883eaef69ad8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8684add63bca8df9bbf4883eaef69ad8");
        } else if (obj instanceof BaseDataMsg) {
            BaseDataMsg baseDataMsg = (BaseDataMsg) obj;
            this.d.a(10020, baseDataMsg.getMsgUuid(), 0L, baseDataMsg.getCts());
        }
    }
}
