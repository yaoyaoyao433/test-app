package com.sankuai.waimai.addrsdk.mvp.bean;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.addrsdk.manager.a;
import com.sankuai.waimai.monitor.model.ErrorCode;
import java.io.Serializable;
import java.util.ArrayList;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class AddressConfig implements Serializable {
    public static final String ORDERY_BY_DISTANCE = "DISTANCE";
    public static final String ORDERY_BY_WEIGHT = "WEIGHT";
    public static final String SCENARIO_GENERAL = "GENERAL";
    public static final String SCENARIO_WAIMAI = "WAIMAI";
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("address_after_save_success_wait_time_in_milliseconds")
    public int addressEditWaitTimeInMilliseconds;
    @SerializedName("ab_experiment_strategy_list")
    public ArrayList<AbStrategy> newAbStrategyList;
    @SerializedName("search_address_filter_items")
    public String searchAddressFilterItems;
    @SerializedName("search_address_page_size")
    public int searchAddressPageSize;
    @SerializedName("search_address_radius")
    public int searchAddressRadius;
    @SerializedName("search_address_sort")
    public int searchAddressSort;
    @SerializedName("user_bind_phone")
    public String userBindPhone;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static class AbStrategy implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("experimentGroup")
        public String experimentGroup;
        @SerializedName("experimentKey")
        public String experimentKey;
    }

    public AddressConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d4e0ee5e113714f4a77e235807978773", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d4e0ee5e113714f4a77e235807978773");
            return;
        }
        this.searchAddressSort = 1;
        this.searchAddressPageSize = 20;
        this.searchAddressRadius = 1000;
    }

    public String getRadius() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f0f2a20c51c05333151c0ca15d874f87", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f0f2a20c51c05333151c0ca15d874f87");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.searchAddressRadius);
        return sb.toString();
    }

    public boolean isOrderByDistance() {
        return this.searchAddressSort == 1;
    }

    public String getSearchPageSize() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a0ce75e5644aab688d07cae1d5b97f7c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a0ce75e5644aab688d07cae1d5b97f7c");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.searchAddressPageSize);
        return sb.toString();
    }

    public int getEditWaitTime() {
        return this.addressEditWaitTimeInMilliseconds;
    }

    public String getUserBindPhone() {
        return this.userBindPhone;
    }

    public String getSearchOrderBy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "46751117aff24cb0ecee03ca1db502c0", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "46751117aff24cb0ecee03ca1db502c0") : "A".equals(a.a().c) ? ORDERY_BY_WEIGHT : ErrorCode.ERROR_TYPE_B.equals(a.a().c) ? ORDERY_BY_DISTANCE : "C".equals(a.a().c) ? ORDERY_BY_WEIGHT : "D".equals(a.a().c) ? ORDERY_BY_DISTANCE : ORDERY_BY_DISTANCE;
    }

    public String getMapListOrderBy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d2d6344a7bc9ad53cc31d9b0e273be23", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d2d6344a7bc9ad53cc31d9b0e273be23") : "A".equals(a.a().c) ? ORDERY_BY_WEIGHT : (ErrorCode.ERROR_TYPE_B.equals(a.a().c) || "C".equals(a.a().c) || !"D".equals(a.a().c)) ? ORDERY_BY_DISTANCE : ORDERY_BY_WEIGHT;
    }

    public String getSearchScenario() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f826451a516e0f48da630b7796cb4497", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f826451a516e0f48da630b7796cb4497") : ("A".equals(a.a().d) || ErrorCode.ERROR_TYPE_B.equals(a.a().d)) ? SCENARIO_GENERAL : "C".equals(a.a().d) ? SCENARIO_WAIMAI : SCENARIO_WAIMAI;
    }

    public String getMapListScenario() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8c986db2faf175faec4824075e5881ed", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8c986db2faf175faec4824075e5881ed") : "A".equals(a.a().d) ? SCENARIO_WAIMAI : ErrorCode.ERROR_TYPE_B.equals(a.a().d) ? SCENARIO_GENERAL : "C".equals(a.a().d) ? SCENARIO_WAIMAI : SCENARIO_WAIMAI;
    }
}
