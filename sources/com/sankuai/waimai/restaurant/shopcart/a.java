package com.sankuai.waimai.restaurant.shopcart;

import android.util.SparseArray;
import android.util.SparseIntArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSpu;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public SparseArray<List<GoodsSpu>> b;
    public SparseIntArray c;
    public final String d;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.restaurant.shopcart.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC1124a {
        void a(int i, List<GoodsSpu> list);
    }

    public a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbfaaa5f0f90716cf71fab1b93d39cdb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbfaaa5f0f90716cf71fab1b93d39cdb");
            return;
        }
        this.b = new SparseArray<>();
        this.c = new SparseIntArray();
        this.d = str;
    }

    public void a(InterfaceC1124a interfaceC1124a, int i, List<GoodsSpu> list) {
        Object[] objArr = {interfaceC1124a, Integer.valueOf(i), list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b08a1aac3f2f0f173981c806868c2611", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b08a1aac3f2f0f173981c806868c2611");
        } else if (interfaceC1124a != null) {
            interfaceC1124a.a(i, list);
        }
    }

    public void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27b417b1a172a1b82ed8b25e3fd72738", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27b417b1a172a1b82ed8b25e3fd72738");
        } else if (this.c != null) {
            this.c.put(i, i2);
        }
    }
}
