package com.meituan.android.common.locate.provider;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class n {
    private static n b;
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<a> a;

    /* loaded from: classes2.dex */
    public interface a {
        void a(String str, long j);
    }

    public n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6b7258ea2a914e89ddb7833bbfdcd07a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6b7258ea2a914e89ddb7833bbfdcd07a");
        } else {
            this.a = new ArrayList();
        }
    }

    public static synchronized n a() {
        synchronized (n.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bc7c9b9a81bb25d9b47b305a070bcc2e", RobustBitConfig.DEFAULT_VALUE)) {
                return (n) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bc7c9b9a81bb25d9b47b305a070bcc2e");
            }
            if (b == null) {
                b = new n();
            }
            return b;
        }
    }

    public void a(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "10e7ee590f5a7f1322da23759d3b9f24", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "10e7ee590f5a7f1322da23759d3b9f24");
        } else if (this.a != null && this.a.size() != 0) {
            for (a aVar : this.a) {
                aVar.a(str, j);
            }
        }
    }
}
