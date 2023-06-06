package com.sankuai.waimai.store.platform.domain.core.shop;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.a;
import com.sankuai.waimai.store.platform.domain.core.im.DrugImEntranceEntity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class GetMenuResponse {
    public static final int ADD_SHORTCUT_TO_DESKTOP_CODE = 10;
    public static final int CART_ITEM_CODE = 1;
    public static final int COMPLAIN_SELLER_CODE = 5;
    public static final int CONTACT_SELLER_CODE = 3;
    public static final int GOOD_SHARE_CODE = 9;
    public static final int MESSAGE_CENTER_CODE = 4;
    public static final int POI_COLLECT_CODE = 8;
    public static final int POI_COMMENT_CODE = 7;
    public static final int SELLER_DETAIL_CODE = 6;
    public static final int SG_MENU_CODE_SCAN_PRODUCT = 17;
    public static final int SHARE_SELLER_CODE = 2;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("api_response_extra_info")
    public ApiResponseExtraInfo apiExtra;
    @SerializedName("drug_im_entrance")
    public DrugImEntranceEntity drugImEntranceEntity;
    @SerializedName("menu_info_list")
    public ArrayList<MenuInfo> menuInfoArrayList;
    @SerializedName("out_menu_list")
    public ArrayList<MenuInfo> outMenuList;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class ApiResponseExtraInfo implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("rec_trace_info")
        public String recTraceInfo;
        @SerializedName("api_stids")
        public String stids;
    }

    public String getStids() {
        return this.apiExtra == null ? "" : this.apiExtra.stids;
    }

    public MenuInfo.AdditionalInfo.d getPoiImInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3b4fb03a1be545cfd336400698a5101f", RobustBitConfig.DEFAULT_VALUE)) {
            return (MenuInfo.AdditionalInfo.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3b4fb03a1be545cfd336400698a5101f");
        }
        MenuInfo.AdditionalInfo.d dVar = null;
        if (a.b(this.menuInfoArrayList)) {
            return null;
        }
        Iterator<MenuInfo> it = this.menuInfoArrayList.iterator();
        while (it.hasNext()) {
            MenuInfo next = it.next();
            if (next != null && next.b == 3 && next.g != null && next.g.a != null) {
                dVar = next.g.a;
            }
        }
        return dVar;
    }

    public int[] getMenuCodes() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fd32bd78497f97893c33f13d1418339c", RobustBitConfig.DEFAULT_VALUE)) {
            return (int[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fd32bd78497f97893c33f13d1418339c");
        }
        if (a.b(this.menuInfoArrayList)) {
            return null;
        }
        int[] iArr = new int[this.menuInfoArrayList.size()];
        for (int i = 0; i < this.menuInfoArrayList.size(); i++) {
            if (this.menuInfoArrayList.get(i) != null) {
                iArr[i] = this.menuInfoArrayList.get(i).b;
            }
        }
        return iArr;
    }

    public int getMsgCenterUnreadCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e9c9450693ceb84cc26111f48829f382", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e9c9450693ceb84cc26111f48829f382")).intValue();
        }
        if (a.b(this.menuInfoArrayList)) {
            return 0;
        }
        Iterator<MenuInfo> it = this.menuInfoArrayList.iterator();
        while (it.hasNext()) {
            MenuInfo next = it.next();
            if (next != null && next.b == 4) {
                return next.h;
            }
        }
        return 0;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class MenuInfo {
        public static ChangeQuickRedirect a;
        @SerializedName("menu_code")
        public int b;
        @SerializedName("has_red_point")
        public int c;
        @SerializedName("title")
        public String d;
        @SerializedName("icon_url")
        public String e;
        @SerializedName(NetLogConstants.Details.SCHEME)
        public String f;
        @SerializedName("addtional_info")
        public AdditionalInfo g;
        @SerializedName("im_center_unread_count")
        public int h;

        /* compiled from: ProGuard */
        /* loaded from: classes5.dex */
        public static class AdditionalInfo {
            @SerializedName("poi_im_info")
            public d a;
            @SerializedName("my_msg_info")
            public c b;
            @SerializedName("poi_report_info")
            public e c;
            @SerializedName("desktop_shortcut_info")
            public b d;
            @SerializedName("is_collect_info")
            public a e;
            @SerializedName("scan_upc_info")
            public ScanUpcInfo f;

            /* compiled from: ProGuard */
            @Keep
            /* loaded from: classes5.dex */
            public static class ScanUpcInfo {
                public static ChangeQuickRedirect changeQuickRedirect;
                @SerializedName("upc_scheme")
                public String upcScheme;
            }

            /* compiled from: ProGuard */
            /* loaded from: classes5.dex */
            public static class a {
                @SerializedName("button_text")
                public String a;
                @SerializedName("is_favorite")
                public int b;
            }

            /* compiled from: ProGuard */
            /* loaded from: classes5.dex */
            public static class b {
                @SerializedName("name")
                public String a;
                @SerializedName("pic_url")
                public String b;
                @SerializedName("desktop_shortcut_scheme")
                public String c;
            }

            /* compiled from: ProGuard */
            /* loaded from: classes5.dex */
            public static class c {
                @SerializedName("url")
                public String a;
            }

            /* compiled from: ProGuard */
            /* loaded from: classes5.dex */
            public static class d {
                @SerializedName("poi_dx_id")
                public long a;
                @SerializedName("b_app_id")
                public short b;
            }

            /* compiled from: ProGuard */
            /* loaded from: classes5.dex */
            public static class e {
                @SerializedName("url")
                public String a;
            }
        }

        public final boolean a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "448b0db3f2750431afae421753c36cad", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "448b0db3f2750431afae421753c36cad")).booleanValue() : this.c != 0 && this.c == 1;
        }
    }
}
