package com.sankuai.waimai.store.cell.core.impl;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.cell.core.b;
import com.sankuai.waimai.store.cell.core.c;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.util.h;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements b, c {
    public static ChangeQuickRedirect a;
    public b b;
    public c c;

    @Override // com.sankuai.waimai.store.cell.core.b
    public final void a(GoodsSpu goodsSpu) {
    }

    @Override // com.sankuai.waimai.store.cell.core.b
    public final void b(GoodsSpu goodsSpu, int i) {
    }

    @Override // com.sankuai.waimai.store.cell.core.b
    public final void c(GoodsSpu goodsSpu, int i) {
    }

    @Override // com.sankuai.waimai.store.cell.core.c
    public final void d(GoodsSpu goodsSpu, int i) {
        Object[] objArr = {goodsSpu, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac66191e40e09612eb1744cefa9fc229", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac66191e40e09612eb1744cefa9fc229");
        } else if (this.c != null) {
            this.c.d(goodsSpu, i);
        }
    }

    @Override // com.sankuai.waimai.store.cell.core.c
    public final void e(GoodsSpu goodsSpu, int i) {
        Object[] objArr = {goodsSpu, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12581d1cc87779ace39026d52e5fe5fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12581d1cc87779ace39026d52e5fe5fe");
        } else if (this.c != null) {
            this.c.e(goodsSpu, i);
        }
    }

    @Override // com.sankuai.waimai.store.cell.core.c
    public final void f(GoodsSpu goodsSpu, int i) {
        Object[] objArr = {goodsSpu, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2181185aad16c9e524f9f34ffc029612", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2181185aad16c9e524f9f34ffc029612");
        } else if (this.c != null) {
            this.c.f(goodsSpu, i);
        }
    }

    @Override // com.sankuai.waimai.store.cell.core.c
    public final void g(GoodsSpu goodsSpu, int i) {
        Object[] objArr = {goodsSpu, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e66f4f5a823f2442b1e04b5fa0b7df6b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e66f4f5a823f2442b1e04b5fa0b7df6b");
        } else if (this.c != null) {
            this.c.g(goodsSpu, i);
        }
    }

    @Override // com.sankuai.waimai.store.cell.core.b
    public final void a(GoodsSpu goodsSpu, h hVar, int i) {
        Object[] objArr = {goodsSpu, hVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ec01dfba43a25cf1edc0f5ec76ff9a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ec01dfba43a25cf1edc0f5ec76ff9a2");
        } else if (this.b != null) {
            this.b.a(goodsSpu, hVar, i);
        }
    }

    @Override // com.sankuai.waimai.store.cell.core.b
    public final void a(GoodsSpu goodsSpu, int i) {
        Object[] objArr = {goodsSpu, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60140f4614bbf9727b18b0d3bfc2f9ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60140f4614bbf9727b18b0d3bfc2f9ae");
        } else if (this.b != null) {
            this.b.a(goodsSpu, i);
        }
    }

    @Override // com.sankuai.waimai.store.cell.core.b
    public final void a(GoodsSpu goodsSpu, View view, h hVar, int i) {
        Object[] objArr = {goodsSpu, view, hVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "511b81e3a4f7a561f8e5ca58ae9a13b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "511b81e3a4f7a561f8e5ca58ae9a13b4");
        } else if (this.b == null || goodsSpu.mSaleType != 0) {
        } else {
            this.b.a(goodsSpu, view, hVar, i);
        }
    }

    @Override // com.sankuai.waimai.store.cell.core.b
    public final void b(GoodsSpu goodsSpu, h hVar, int i) {
        Object[] objArr = {goodsSpu, hVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6702388b22e602e5daa366d6565280e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6702388b22e602e5daa366d6565280e");
        } else if (this.b != null) {
            this.b.b(goodsSpu, hVar, i);
        }
    }
}
