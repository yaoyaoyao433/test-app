package com.sankuai.waimai.store.poi.list.newp.home.model;

import android.arch.lifecycle.k;
import android.arch.lifecycle.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.store.poi.list.refactor.bean.PoiLocationAddress;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class BaseContainerViewModel extends o {
    public static ChangeQuickRedirect a;
    public k<com.sankuai.waimai.store.param.a> b;
    public k<Map<String, Object>> c;
    public k<Integer> d;
    private k<PoiLocationAddress> e;

    public BaseContainerViewModel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73e66997a901d3e66ac2f9623324ca4f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73e66997a901d3e66ac2f9623324ca4f");
            return;
        }
        this.b = new k<>();
        this.c = new k<>();
        this.e = new k<>();
        this.d = new k<>();
    }
}
