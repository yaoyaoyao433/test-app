package com.sankuai.waimai.business.search.datatype;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.search.statistics.StatisticsEntity;
import com.sankuai.waimai.search.common.mach.provider.IMachProvider;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class CommonMachData extends StatisticsEntity implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    public static final int needAdjustPaddingForBusiness = 4;
    public static final int needAdjustPaddingForBusinessFullScreen = 7;
    public static final int needAdjustPaddingForCard = 3;
    public static final int needAdjustPaddingForCardFullScreen = 6;
    public static final int needAdjustPaddingForPoiLabelRank = 2;
    public static final int needAdjustPaddingForPoiLabelRankFullScreen = 5;
    public static final int needAdjustPaddingForPoiStagger = -1;
    public static final int needAdjustPaddingForStagger = 1;
    public boolean isTrackable;
    private final com.sankuai.waimai.business.search.statistics.b lookup;
    public com.sankuai.waimai.mach.recycler.c mItem;
    public int mNeedAdjustPadding;
    @Nullable
    public IMachProvider machProvider;
    public String oasisModuleId;
    public a state;
    public String unionId;

    public CommonMachData(IMachProvider iMachProvider, com.sankuai.waimai.mach.recycler.c cVar, String str) {
        this(cVar, str);
        Object[] objArr = {iMachProvider, cVar, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "65cdde6a4269a64bb9bd1df722db5629", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "65cdde6a4269a64bb9bd1df722db5629");
        } else {
            this.machProvider = iMachProvider;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public enum a {
        SHOWING,
        HIDE;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb757ce244d5e44d5592ff8220682852", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb757ce244d5e44d5592ff8220682852");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ee0fc7371a363f9297f2901b14b3725d", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ee0fc7371a363f9297f2901b14b3725d") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2807989eb957a1b31cefb11185e58a92", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2807989eb957a1b31cefb11185e58a92") : (a[]) values().clone();
        }
    }

    public CommonMachData(com.sankuai.waimai.mach.recycler.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "46f73ec5c82bf2f525b560dac49b0c00", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "46f73ec5c82bf2f525b560dac49b0c00");
            return;
        }
        this.mNeedAdjustPadding = 0;
        this.oasisModuleId = "";
        this.isTrackable = true;
        this.state = a.SHOWING;
        this.lookup = new com.sankuai.waimai.business.search.statistics.a();
        this.mItem = cVar;
    }

    public CommonMachData(com.sankuai.waimai.mach.recycler.c cVar, String str) {
        Object[] objArr = {cVar, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3cc3a4c4728c46cebcb9bb69de2a2abe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3cc3a4c4728c46cebcb9bb69de2a2abe");
            return;
        }
        this.mNeedAdjustPadding = 0;
        this.oasisModuleId = "";
        this.isTrackable = true;
        this.state = a.SHOWING;
        this.lookup = new com.sankuai.waimai.business.search.statistics.a();
        this.mItem = cVar;
        this.unionId = str;
    }

    public CommonMachData() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c9d01ff3426d144774fd6cd0c838d2b1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c9d01ff3426d144774fd6cd0c838d2b1");
            return;
        }
        this.mNeedAdjustPadding = 0;
        this.oasisModuleId = "";
        this.isTrackable = true;
        this.state = a.SHOWING;
        this.lookup = new com.sankuai.waimai.business.search.statistics.a();
    }

    public com.sankuai.waimai.business.search.statistics.b getStaggerIndexLookup() {
        return this.lookup;
    }
}
