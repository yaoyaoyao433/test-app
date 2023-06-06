package com.sankuai.waimai.store.goods.list.templet.newmarket.presenter;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class g {
    public static ChangeQuickRedirect a;
    public boolean b;
    public int c;
    public GoodsPoiCategory d;
    public GoodsPoiCategory e;
    public long f;
    public String g;
    public long h;
    public GoodsPoiCategory i;
    public GoodsPoiCategory j;
    public GoodsSpu k;
    public int l;
    public List<Long> m;
    @NonNull
    public final e n;
    public boolean o;
    public boolean p;
    public int q;
    public String r;

    public g(@NonNull e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cc9d4bf9b4adf0e2ec56430c4f689de", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cc9d4bf9b4adf0e2ec56430c4f689de");
            return;
        }
        this.b = false;
        this.h = -1L;
        this.l = -1;
        this.o = false;
        this.p = false;
        this.r = "0";
        this.n = eVar;
    }

    public final GoodsPoiCategory a() {
        if (this.j == null) {
            return this.i;
        }
        return this.j;
    }

    public final void a(long j, String str) {
        Object[] objArr = {new Long(j), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7c81ba9b9435139b9d9acc9917d52bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7c81ba9b9435139b9d9acc9917d52bd");
            return;
        }
        this.f = j;
        this.g = str;
    }

    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d8ee86e4c8c8be476c09b9bc03d350e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d8ee86e4c8c8be476c09b9bc03d350e");
        } else {
            this.h = j;
        }
    }

    public final int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0089f1e17dd4c7e6404d941e0f76850f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0089f1e17dd4c7e6404d941e0f76850f")).intValue();
        }
        if (this.l == -1) {
            GoodsPoiCategory a2 = a();
            if (a2 == null) {
                return 1;
            }
            return a2.sortType;
        }
        return this.l;
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12038e5bbf309c1d5f94b04af00339c8", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12038e5bbf309c1d5f94b04af00339c8");
        }
        if (a() == null) {
            return super.toString();
        }
        String[] split = this.n.getClass().getName().split("\\.");
        StringBuilder sb = new StringBuilder("请求分类：");
        sb.append(c().name);
        sb.append(";加载分类：");
        sb.append(a().name);
        sb.append(";sup : ");
        sb.append(this.k == null ? StringUtil.NULL : this.k.name);
        sb.append(";加载类型:");
        sb.append(split[split.length - 1]);
        sb.append(";hashCode:");
        sb.append(hashCode());
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        boolean z;
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a58f95ecb4727af7e27ec98bb8d61c7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a58f95ecb4727af7e27ec98bb8d61c7")).booleanValue();
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.i == gVar.i && this.j == gVar.j && this.h == gVar.h && this.c == gVar.c && this.l == gVar.l && this.k == gVar.k && this.m == gVar.m) {
                Object[] objArr2 = {this, gVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "135506f1bdba481a5b3789ee5ccd0850", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "135506f1bdba481a5b3789ee5ccd0850")).booleanValue();
                } else {
                    z = (this.n.getClass() == null || gVar.n.getClass() == null || !TextUtils.equals(this.n.getClass().getName(), gVar.n.getClass().getName())) ? false : true;
                }
                if (z) {
                    return true;
                }
            }
            return false;
        }
        return super.equals(obj);
    }

    public final int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f57346632aad7b3288131e6969f7b727", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f57346632aad7b3288131e6969f7b727")).intValue() : super.hashCode();
    }

    public final void a(GoodsPoiCategory goodsPoiCategory, GoodsPoiCategory goodsPoiCategory2, GoodsSpu goodsSpu) {
        this.d = goodsPoiCategory;
        this.e = goodsPoiCategory2;
        this.k = goodsSpu;
    }

    public final GoodsPoiCategory c() {
        if (this.e == null) {
            return this.d;
        }
        return this.e;
    }
}
