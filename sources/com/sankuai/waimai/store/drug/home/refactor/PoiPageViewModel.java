package com.sankuai.waimai.store.drug.home.refactor;

import android.arch.lifecycle.o;
import android.graphics.Bitmap;
import android.util.SparseArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.drug.home.refactor.bean.PoiLocationAddress;
import com.sankuai.waimai.store.drug.home.refactor.bean.PoiResult;
import com.sankuai.waimai.store.platform.domain.core.poi.CategoryInfo;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class PoiPageViewModel extends o {
    public static ChangeQuickRedirect a;
    public android.arch.lifecycle.k<PoiResult> b;
    public android.arch.lifecycle.k<PoiVerticalityDataResponse> c;
    public android.arch.lifecycle.k<com.sankuai.waimai.store.param.a> d;
    public android.arch.lifecycle.k<Boolean> e;
    public android.arch.lifecycle.k<PoiLocationAddress> f;
    public android.arch.lifecycle.k<Boolean> g;
    public android.arch.lifecycle.k<Boolean> h;
    public android.arch.lifecycle.k<Bitmap> i;
    public int j;
    public int k;
    public int l;
    public int m;
    public boolean n;
    public boolean o;
    private SparseArray<CategoryInfo> p;

    public PoiPageViewModel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2660a24961b48e8b8c14cc7f27f2c9d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2660a24961b48e8b8c14cc7f27f2c9d");
            return;
        }
        this.b = new android.arch.lifecycle.k<>();
        this.c = new android.arch.lifecycle.k<>();
        this.d = new android.arch.lifecycle.k<>();
        this.e = new android.arch.lifecycle.k<>();
        this.f = new android.arch.lifecycle.k<>();
        this.g = new android.arch.lifecycle.k<>();
        this.h = new android.arch.lifecycle.k<>();
        this.i = new android.arch.lifecycle.k<>();
        this.j = 0;
        this.k = 0;
        this.l = 0;
        this.m = 0;
        this.n = false;
        this.o = false;
    }

    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80a1cd1ff8ad7bdd143ea3d26b5151e4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80a1cd1ff8ad7bdd143ea3d26b5151e4")).booleanValue();
        }
        Boolean a2 = this.g.a();
        return a2 != null && a2.booleanValue();
    }

    public final SparseArray<CategoryInfo> c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02f57890a6c42ff6a9a90328a4d8dd1c", RobustBitConfig.DEFAULT_VALUE)) {
            return (SparseArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02f57890a6c42ff6a9a90328a4d8dd1c");
        }
        if (this.p == null) {
            this.p = new SparseArray<>();
        }
        return this.p;
    }
}
