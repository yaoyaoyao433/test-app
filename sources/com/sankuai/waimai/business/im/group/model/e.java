package com.sankuai.waimai.business.im.group.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e {
    @SerializedName("group_session_infos")
    public List<a> a;
    @SerializedName("group_switch_map")
    public Map<String, Boolean> b;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        @SerializedName("group_id")
        public long b;
        @SerializedName("order_view_id")
        public long c;
        @SerializedName("poi_id")
        public long d;
        @SerializedName(FoodDetailNetWorkPreLoader.URI_POI_STR)
        public String e;
        @SerializedName("group_name")
        public String f;
        @SerializedName("poi_avatar")
        public String g;
        @SerializedName("rider_avatar")
        public String h;
        @SerializedName("group_icon")
        public String i;
        @SerializedName("commentId")
        public long j;
        @SerializedName("group_type")
        public int k;
        @SerializedName("group_notice")
        public int l;
        @SerializedName("group_state")
        public int m;
        @SerializedName("subscribe_text")
        public String n;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "900726f3dffc22f0bc65f50d7e248391", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "900726f3dffc22f0bc65f50d7e248391");
            } else {
                this.e = "";
            }
        }

        public final boolean a() {
            return this.k == 0;
        }

        public final boolean b() {
            return this.k == 1;
        }

        public final boolean c() {
            return this.k == 2;
        }

        public final boolean d() {
            return this.k == 3;
        }
    }
}
