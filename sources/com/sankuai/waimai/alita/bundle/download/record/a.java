package com.sankuai.waimai.alita.bundle.download.record;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.utils.c;
import com.sankuai.waimai.alita.core.utils.f;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public String b;
    private final List<b> c;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38ac98ee05135592ab5a96b27e265827", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38ac98ee05135592ab5a96b27e265827");
        } else {
            this.c = new CopyOnWriteArrayList();
        }
    }

    public final synchronized void a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8583cd1c8fb1dde214df766ae15cec50", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8583cd1c8fb1dde214df766ae15cec50");
            return;
        }
        if (!this.c.contains(bVar)) {
            this.c.add(bVar);
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "024d6f6eb74b37da1a0ebc470d78aeba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "024d6f6eb74b37da1a0ebc470d78aeba");
        } else if (!com.sankuai.waimai.alita.bundle.a.a().b) {
            this.c.clear();
        } else if (!f.a(this.c)) {
            HashMap hashMap = new HashMap();
            hashMap.put("template_id", this.b);
            for (b bVar : this.c) {
                String c = c(bVar);
                String b = b(bVar);
                c.a("reportSuccess::key=" + c + ",value=" + b);
                hashMap.put(c, b);
            }
            this.c.clear();
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d97747215c2f8b1cbf89b89700b4cd91", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d97747215c2f8b1cbf89b89700b4cd91");
        } else if (!f.a(this.c)) {
            HashMap hashMap = new HashMap();
            hashMap.put("template_id", this.b);
            for (b bVar : this.c) {
                String c = c(bVar);
                String b = b(bVar);
                c.a("reportError::key=" + c + ",value=" + b);
                hashMap.put(c, b);
            }
            this.c.clear();
        }
    }

    private String b(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8f0f2e76d7fef4915a42a69233b1da4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8f0f2e76d7fef4915a42a69233b1da4");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(bVar.b);
        sb.append("::");
        sb.append(bVar.c);
        sb.append(" [" + this.b + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
        if (bVar.d > 0) {
            sb.append(">>>异常Code=");
            sb.append(bVar.d);
        }
        return sb.toString();
    }

    private String c(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e01d77c95cf25456c32215f27848cea", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e01d77c95cf25456c32215f27848cea") : new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS").format(new Date(bVar.e));
    }
}
