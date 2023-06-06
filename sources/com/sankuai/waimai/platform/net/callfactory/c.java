package com.sankuai.waimai.platform.net.callfactory;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.aj;
import com.squareup.okhttp.v;
import com.squareup.okhttp.w;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends com.sankuai.meituan.retrofit2.callfactory.okhttp.a {
    public static ChangeQuickRedirect b;
    private static String[] c;
    private com.sankuai.meituan.retrofit2.callfactory.okhttp.a d;
    private com.sankuai.meituan.retrofit2.callfactory.okhttp.a e;

    public c(v vVar) {
        Object[] objArr = {vVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eeeddb3d7ef080368bfa01178918fdb2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eeeddb3d7ef080368bfa01178918fdb2");
        } else if (vVar == null) {
            throw new NullPointerException("client == null");
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(w.HTTP_1_1);
            arrayList.add(w.SPDY_3);
            v a = vVar.clone().a(arrayList);
            a.d = null;
            this.d = com.sankuai.meituan.retrofit2.callfactory.okhttp.a.a(a);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(w.HTTP_1_1);
            arrayList2.add(w.SPDY_3);
            arrayList2.add(w.HTTP_2);
            v a2 = vVar.clone().a(arrayList2);
            a2.d = null;
            this.e = com.sankuai.meituan.retrofit2.callfactory.okhttp.a.a(a2);
        }
    }

    @Override // com.sankuai.meituan.retrofit2.callfactory.okhttp.a, com.sankuai.meituan.retrofit2.raw.a.InterfaceC0637a
    public final com.sankuai.meituan.retrofit2.raw.a get(aj ajVar) {
        boolean z = true;
        Object[] objArr = {ajVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08794c8f4b35c1e33dbb2287112726bf", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.meituan.retrofit2.raw.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08794c8f4b35c1e33dbb2287112726bf");
        }
        Object[] objArr2 = {ajVar};
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "43da6b40dcfdc11b8695e424a1a1bd05", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "43da6b40dcfdc11b8695e424a1a1bd05")).booleanValue();
        } else {
            if (c != null && c.length > 0 && !TextUtils.isEmpty(ajVar.b())) {
                for (String str : c) {
                    if (ajVar.b().startsWith(str)) {
                        break;
                    }
                }
            }
            z = false;
        }
        return (z ? this.e : this.d).get(ajVar);
    }
}
