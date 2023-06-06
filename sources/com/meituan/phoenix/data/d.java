package com.meituan.phoenix.data;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.common.aidata.entity.DataConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class d {
    public static ChangeQuickRedirect a;
    @SerializedName(DataConstants.CITY_ID)
    public String b;
    @SerializedName("cdn_list")
    public List<a> c;
    @SerializedName("raptor_rate")
    public float d;
    @SerializedName(AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE)
    public List<String> e;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        @SerializedName("appkey")
        public String b;
        @SerializedName("commonSource")
        public List<String> c;
        @SerializedName("match")
        public List<String> d;
        @SerializedName("replace")
        public CopyOnWriteArrayList<b> e;

        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8dbbab6be7a8f7cce53460e911a399e8", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8dbbab6be7a8f7cce53460e911a399e8");
            }
            return "CDNMatchItem{phoenixKey='" + this.b + "', commonSource=" + this.c + ", match=" + this.d + ", replaceList=" + this.e + '}';
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class b {
        public static ChangeQuickRedirect a;
        @SerializedName("host")
        public String b;
        @SerializedName("try_count")
        public int c;

        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "502fd243667684d230fce73dcd56a029", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "502fd243667684d230fce73dcd56a029");
            }
            return "CDNReplaceItem{host='" + this.b + "', tryCount=" + this.c + '}';
        }
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "271726344bc50d4c97760f593f9d6d37", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "271726344bc50d4c97760f593f9d6d37");
        }
        return "PhoenixData{cityId='" + this.b + "', matchList=" + this.c + ", raptorRate=" + this.d + ", errorCodeList=" + this.e + '}';
    }
}
