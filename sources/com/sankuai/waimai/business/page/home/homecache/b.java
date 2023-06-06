package com.sankuai.waimai.business.page.home.homecache;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.home.homecache.a;
import com.sankuai.waimai.foundation.core.service.abtest.ABStrategy;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    a.C0776a.C0777a b;
    int c;
    private ABStrategy d;
    private a.C0776a.C0777a e;
    private List<a.C0776a.C0777a.C0778a.c> f;

    private boolean a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a46bcba5345959e4fa2834a63505098", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a46bcba5345959e4fa2834a63505098")).booleanValue() : j == -1 || j > 0;
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62ca8e1eaa105293a7faa25133312ea0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62ca8e1eaa105293a7faa25133312ea0");
        } else {
            this.c = -1;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static final class a {
        private static final b a = new b();
    }

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a51d2328543b27de69909da22fe19ff6", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a51d2328543b27de69909da22fe19ff6") : a.a;
    }

    public final void a(ABStrategy aBStrategy) {
        Object[] objArr = {aBStrategy};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "260fdff418b02a3885fee799213c8beb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "260fdff418b02a3885fee799213c8beb");
            return;
        }
        this.d = aBStrategy;
        if (b()) {
            try {
                com.sankuai.waimai.business.page.home.homecache.a aVar = (com.sankuai.waimai.business.page.home.homecache.a) com.sankuai.waimai.foundation.location.v2.d.a().fromJson(this.d.paramsInfo.get("page"), (Class<Object>) com.sankuai.waimai.business.page.home.homecache.a.class);
                if (aVar == null || aVar.a == null || aVar.a.a == 0 || com.sankuai.waimai.foundation.utils.d.a(aVar.a.b)) {
                    return;
                }
                for (a.C0776a.C0777a c0777a : aVar.a.b) {
                    if (c0777a != null) {
                        if (a(c0777a.a, "v6/home/feeds/rcmdboard")) {
                            this.e = c0777a;
                        }
                        if (a(c0777a.a, "v6/home/feeds/tabs")) {
                            this.b = c0777a;
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7fdc85a7851a26c838a8523fd092a46", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7fdc85a7851a26c838a8523fd092a46")).booleanValue() : com.sankuai.waimai.business.page.common.abtest.a.i() && com.sankuai.waimai.platform.model.c.a().b() == 0 && this.d != null && TextUtils.equals(this.d.expName, "A") && this.d.paramsInfo != null && this.d.paramsInfo.size() > 0 && this.d.paramsInfo.containsKey("valid_time") && c(this.d.paramsInfo.get("valid_time")) && this.d.paramsInfo.containsKey("page") && !TextUtils.isEmpty(this.d.paramsInfo.get("page"));
    }

    public final boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df5d47e2d7d620aea913ad561d27882f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df5d47e2d7d620aea913ad561d27882f")).booleanValue() : b() && this.e != null && this.e.b != null && a((long) this.e.c);
    }

    public final boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a9b115d5617a0db6a521ad49c562018", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a9b115d5617a0db6a521ad49c562018")).booleanValue() : b() && this.b != null && this.b.b != null && a((long) this.b.c);
    }

    private boolean c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ac154d3197285749e0af245db1150b8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ac154d3197285749e0af245db1150b8")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return a(Long.parseLong(str));
        } catch (Exception unused) {
            return false;
        }
    }

    public final int e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e360944effe9ab87452f66f6e1f955e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e360944effe9ab87452f66f6e1f955e")).intValue();
        }
        if (c()) {
            if (this.e.c == -1) {
                return Integer.MAX_VALUE;
            }
            if (this.e.c > 0) {
                return this.e.c * 60 * 1000;
            }
        }
        return 0;
    }

    public final int f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3274db76cfb893ef3881ab8f9115a580", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3274db76cfb893ef3881ab8f9115a580")).intValue();
        }
        if (d()) {
            if (this.b.c == -1) {
                return Integer.MAX_VALUE;
            }
            if (this.b.c > 0) {
                return this.b.c * 60 * 1000;
            }
        }
        return 0;
    }

    private boolean a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "286a35bd992ece5549107fc75c082ffd", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "286a35bd992ece5549107fc75c082ffd")).booleanValue() : (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !str.contains(str2)) ? false : true;
    }

    public final boolean a(String str) {
        List<a.C0776a.C0777a.C0778a.c> list;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3fa996d618e9fc980f1033cfcd3ccf69", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3fa996d618e9fc980f1033cfcd3ccf69")).booleanValue();
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e199c5aed05ef2832888b0f01b95fbb8", RobustBitConfig.DEFAULT_VALUE)) {
            list = (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e199c5aed05ef2832888b0f01b95fbb8");
        } else if (this.f != null) {
            list = this.f;
        } else if (c()) {
            this.f = this.e.b.a;
            list = this.f;
        } else {
            list = null;
        }
        if (com.sankuai.waimai.foundation.utils.d.a(list)) {
            return false;
        }
        for (a.C0776a.C0777a.C0778a.c cVar : list) {
            if (cVar != null && a(cVar.b) && TextUtils.equals(str, cVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final boolean b(String str) {
        a.C0776a.C0777a.C0778a.b bVar;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "964f15c78d0d97a7c39e339a902fe233", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "964f15c78d0d97a7c39e339a902fe233")).booleanValue();
        }
        if (c() && (bVar = this.e.b.b) != null && a(bVar.b)) {
            List<String> list = bVar.a;
            if (com.sankuai.waimai.foundation.utils.d.a(list)) {
                return false;
            }
            for (String str2 : list) {
                if (TextUtils.equals(str2, str)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
