package com.sankuai.waimai.business.order.api.detail.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class a implements Serializable {
    public static ChangeQuickRedirect a;
    @SerializedName("sub_biz_type")
    public int A;
    @SerializedName("is_stimulate_order")
    public int B;
    @SerializedName("can_report_coordinate")
    public int C;
    @SerializedName("is_display_order_modify_area")
    public int D;
    @SerializedName("rider_delivery_code")
    public int E;
    @SerializedName("poi_prepare_code")
    public int F;
    @SerializedName("show_map_type")
    public int G;
    @SerializedName("order_template_type")
    public int b;
    @SerializedName("show_map_flag")
    public int c;
    @SerializedName("weather_type")
    public int d;
    @SerializedName("order_status")
    public int e;
    @SerializedName("pay_status")
    public int f;
    @SerializedName("logistics_status")
    public int g;
    @SerializedName("order_push_time")
    public int h;
    @SerializedName("order_time")
    public long i;
    @SerializedName("pay_success_time")
    public int j;
    @SerializedName("preorder_begin_deal_time")
    public int k;
    @SerializedName("expected_arrival_time")
    public String l;
    @SerializedName("delivery_time")
    public long m;
    @SerializedName("formatted_delivery_time")
    public String n;
    @SerializedName("wm_order_pay_type")
    public int o;
    @SerializedName("use_privacy")
    public int p;
    @SerializedName("force_use_privacy")
    public int q;
    @SerializedName("privacy_icon")
    public String r;
    @SerializedName("can_feedback")
    public int s;
    @SerializedName("no_rider_confirm_alert")
    public int t;
    @SerializedName("no_rider_confirm_alert_text")
    public String u;
    @SerializedName("delivery_type")
    public int v;
    @SerializedName("actual_delivery_type")
    public int w;
    @SerializedName("status_code")
    public int x;
    @SerializedName("status_time")
    public int y;
    @SerializedName("biz_type")
    public int z;

    public final boolean a() {
        return this.C == 1;
    }

    public final boolean b() {
        return this.A == 1;
    }

    public final boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1d2161583333f38d1594e710ee1ac76", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1d2161583333f38d1594e710ee1ac76")).booleanValue() : this.d == 11 || this.d == 14 || this.d == 13 || this.d == 12 || this.d == 21 || this.d == 22 || this.d == 23 || this.d == 5 || this.d == 31 || this.d == 8 || this.d == 41 || this.d == 80;
    }
}
