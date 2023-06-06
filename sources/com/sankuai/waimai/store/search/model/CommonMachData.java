package com.sankuai.waimai.store.search.model;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.search.statistics.StatisticsEntity;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class CommonMachData extends StatisticsEntity implements com.sankuai.waimai.store.search.statistics.b, Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    public static final int needAdjustPaddingForCard = 3;
    public static final int needAdjustPaddingForFeed = 2;
    public static final int needAdjustPaddingForStagger = 1;
    public int bottomMargin;
    private final com.sankuai.waimai.store.search.statistics.c lookup;
    public com.sankuai.waimai.mach.recycler.c mItem;
    public Serializable mNativeModel;
    public int mNeedAdjustPadding;
    public a state;
    public String unionId;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public enum a {
        SHOWING,
        HIDE;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd75fb19b26d0308d586ea038544e780", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd75fb19b26d0308d586ea038544e780");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7078066bdc3e77519a58beb08391ae54", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7078066bdc3e77519a58beb08391ae54") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c7d2795d99ee0588328042425e8e3a8d", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c7d2795d99ee0588328042425e8e3a8d") : (a[]) values().clone();
        }
    }

    public CommonMachData(com.sankuai.waimai.mach.recycler.c cVar, String str, Serializable serializable) {
        Object[] objArr = {cVar, str, serializable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d8610761758d34ca2f0b128590e51151", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d8610761758d34ca2f0b128590e51151");
            return;
        }
        this.mNeedAdjustPadding = 0;
        this.bottomMargin = 0;
        this.state = a.SHOWING;
        this.lookup = new com.sankuai.waimai.store.search.statistics.a();
        this.mItem = cVar;
        this.unionId = str;
        this.mNativeModel = serializable;
    }

    public CommonMachData(com.sankuai.waimai.mach.recycler.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a760d91e26246a018c1a1b46608b6336", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a760d91e26246a018c1a1b46608b6336");
            return;
        }
        this.mNeedAdjustPadding = 0;
        this.bottomMargin = 0;
        this.state = a.SHOWING;
        this.lookup = new com.sankuai.waimai.store.search.statistics.a();
        this.mItem = cVar;
    }

    public CommonMachData() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b95243b595eba38ceff0f079464ca37f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b95243b595eba38ceff0f079464ca37f");
            return;
        }
        this.mNeedAdjustPadding = 0;
        this.bottomMargin = 0;
        this.state = a.SHOWING;
        this.lookup = new com.sankuai.waimai.store.search.statistics.a();
    }

    @Override // com.sankuai.waimai.store.search.statistics.b
    public com.sankuai.waimai.store.search.statistics.c getStaggerIndexLookup() {
        return this.lookup;
    }
}
