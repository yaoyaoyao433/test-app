package com.sankuai.waimai.bussiness.order.confirm.cache;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.LongSparseArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.param.OrderFoodInput;
import com.sankuai.waimai.foundation.core.service.abtest.ABStrategy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private final LongSparseArray<String> b;
    private final LongSparseArray<List<String>> c;
    private long d;
    private final Map<Long, Map<String, Object>> e;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "323de4c3059fb80f04dfa971147a8b31", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "323de4c3059fb80f04dfa971147a8b31");
            return;
        }
        this.d = -1L;
        this.b = new LongSparseArray<>();
        this.c = new LongSparseArray<>();
        this.e = new HashMap();
        this.d = com.sankuai.waimai.platform.domain.manager.user.a.i().d();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static class a {
        private static b a = new b();
    }

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6ebdca649e0b1aa2938d6f8227fdbdb2", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6ebdca649e0b1aa2938d6f8227fdbdb2") : a.a;
    }

    public final void a(long j, String str, Object obj) {
        Object[] objArr = {new Long(j), str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e77be4c53e7cc4cdee8d4da7780f6183", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e77be4c53e7cc4cdee8d4da7780f6183");
        } else if (this.e.containsKey(Long.valueOf(j))) {
            Map<String, Object> map = this.e.get(Long.valueOf(j));
            if (map != null) {
                map.put(str, obj);
            }
        } else {
            this.e.clear();
            HashMap hashMap = new HashMap();
            hashMap.put(str, obj);
            this.e.put(Long.valueOf(j), hashMap);
        }
    }

    @Nullable
    public final Object a(long j, String str) {
        boolean z = false;
        Object[] objArr = {new Long(j), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e41536fc011ba69c3d6e707805f02221", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e41536fc011ba69c3d6e707805f02221");
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.bussiness.order.base.abtest.a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "e7f9b12845fe834c109947a4bf234fcc", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "e7f9b12845fe834c109947a4bf234fcc")).booleanValue();
        } else {
            String str2 = "tidan_wm";
            if (com.sankuai.waimai.foundation.core.a.e()) {
                str2 = "tidan_mt";
            } else if (com.sankuai.waimai.foundation.core.a.f()) {
                str2 = "tidan_dp";
            }
            ABStrategy a2 = com.sankuai.waimai.bussiness.order.base.abtest.a.a(str2, null);
            if (a2 != null) {
                z = TextUtils.equals(a2.expName, "C");
            }
        }
        if (z) {
            if (com.sankuai.waimai.platform.domain.manager.user.a.i().d() != this.d) {
                this.e.clear();
                return null;
            }
            Map<String, Object> map = this.e.get(Long.valueOf(j));
            if (map == null) {
                return null;
            }
            return map.get(str);
        }
        return null;
    }

    public final void b(long j, String str) {
        Object[] objArr = {new Long(j), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8d837dabfcc676036832110a4e2f5c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8d837dabfcc676036832110a4e2f5c3");
            return;
        }
        Map<String, Object> map = this.e.get(Long.valueOf(j));
        if (map == null) {
            return;
        }
        map.remove(str);
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d832568ce7c2c0fb48a4d9d413dc0049", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d832568ce7c2c0fb48a4d9d413dc0049");
        } else {
            this.e.clear();
        }
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e5d614ad04212e733364df726f148e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e5d614ad04212e733364df726f148e2");
            return;
        }
        long d = com.sankuai.waimai.platform.domain.manager.user.a.i().d();
        this.b.put(d, str);
        if (d != this.d) {
            this.b.remove(this.d);
        }
        this.d = d;
    }

    public final void a(long j, List<OrderFoodInput> list) {
        Object[] objArr = {new Long(j), list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e43d87502abcf59e9753a216241d897", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e43d87502abcf59e9753a216241d897");
            return;
        }
        long d = com.sankuai.waimai.platform.domain.manager.user.a.i().d();
        this.c.put(d, c(j, list));
        if (d != this.d) {
            this.c.remove(this.d);
        }
        this.d = d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x011f, code lost:
        if (r10.containsAll(r9) != false) goto L38;
     */
    @android.support.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String b(long r20, java.util.List<com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.param.OrderFoodInput> r22) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.bussiness.order.confirm.cache.b.b(long, java.util.List):java.lang.String");
    }

    private List<String> c(long j, List<OrderFoodInput> list) {
        Object[] objArr = {new Long(j), list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae8e396540138eb40e59dfa06d1c9be7", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae8e396540138eb40e59dfa06d1c9be7");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("poi-" + j);
        if (com.sankuai.waimai.foundation.utils.b.a(list)) {
            for (OrderFoodInput orderFoodInput : list) {
                if (orderFoodInput != null) {
                    arrayList.add("goods-" + orderFoodInput.id + CommonConstant.Symbol.MINUS + orderFoodInput.count);
                }
            }
        }
        return arrayList;
    }
}
