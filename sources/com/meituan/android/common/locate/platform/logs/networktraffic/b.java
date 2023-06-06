package com.meituan.android.common.locate.platform.logs.networktraffic;

import com.meituan.android.common.locate.platform.logs.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Interceptor;
import com.sankuai.meituan.retrofit2.aj;
import com.sankuai.meituan.retrofit2.q;
import java.io.IOException;
import java.util.List;
/* loaded from: classes2.dex */
public class b implements Interceptor {
    public static ChangeQuickRedirect changeQuickRedirect;

    private String a(List<q> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "efb762ce8a7a8a82b4e4afb9604decb1", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "efb762ce8a7a8a82b4e4afb9604decb1");
        }
        if (list == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append(list.get(i).a());
            sb.append(": ");
            sb.append(list.get(i).b());
            sb.append("\n");
        }
        return sb.toString();
    }

    @Override // com.sankuai.meituan.retrofit2.Interceptor
    public com.sankuai.meituan.retrofit2.raw.b intercept(Interceptor.a aVar) throws IOException {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b47a1a0fc3c275317be54e2aec9f03fa", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b47a1a0fc3c275317be54e2aec9f03fa");
        }
        aj request = aVar.request();
        long length = a(request.d()).getBytes().length;
        long contentLength = request.i() != null ? request.i().contentLength() : 0L;
        com.sankuai.meituan.retrofit2.raw.b a = aVar.a(request);
        g.a().a(length, contentLength, a(a.headers()).getBytes().length, a.body() != null ? a.body().contentLength() : 0L);
        return a;
    }
}
