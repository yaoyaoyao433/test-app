package com.sankuai.waimai.business.restaurant.base.repository.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class GetMenuResponse {
    public static final int COMPLAIN_SELLER_CODE = 5;
    public static final int CONTACT_SELLER_CODE = 3;
    public static final int MESSAGE_CENTER_CODE = 4;
    public static final int MY_SHOP_MALL_CODE = 1;
    public static final int SELLER_DETAIL_CODE = 6;
    public static final int SHARE_GOODS_CODE = 7;
    public static final int SHARE_SELLER_CODE = 2;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("menu_info_list")
    public ArrayList<a> menuInfoArrayList;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        @SerializedName("menu_code")
        public int b;
        @SerializedName("has_red_point")
        public int c;
        @SerializedName("addtional_info")
        public C0820a d;

        /* compiled from: ProGuard */
        /* renamed from: com.sankuai.waimai.business.restaurant.base.repository.model.GetMenuResponse$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static class C0820a {
            @SerializedName("poi_im_info")
            public b a;
            @SerializedName("my_msg_info")
            public C0821a b;
            @SerializedName("poi_report_info")
            public c c;

            /* compiled from: ProGuard */
            /* renamed from: com.sankuai.waimai.business.restaurant.base.repository.model.GetMenuResponse$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static class C0821a {
                @SerializedName("url")
                public String a;
            }

            /* compiled from: ProGuard */
            /* renamed from: com.sankuai.waimai.business.restaurant.base.repository.model.GetMenuResponse$a$a$b */
            /* loaded from: classes4.dex */
            public static class b {
                @SerializedName("poi_dx_id")
                public long a;
                @SerializedName("b_app_id")
                public short b;
            }

            /* compiled from: ProGuard */
            /* renamed from: com.sankuai.waimai.business.restaurant.base.repository.model.GetMenuResponse$a$a$c */
            /* loaded from: classes4.dex */
            public static class c {
                @SerializedName("url")
                public String a;
            }
        }
    }

    public boolean hasRedPoint() {
        boolean z;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6d0bb92ea8d728202b9a3abd7b592dd2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6d0bb92ea8d728202b9a3abd7b592dd2")).booleanValue();
        }
        if (this.menuInfoArrayList != null && this.menuInfoArrayList.size() > 1) {
            Iterator<a> it = this.menuInfoArrayList.iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next != null && next.b == 4) {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a.a;
                    if (PatchProxy.isSupport(objArr2, next, changeQuickRedirect3, false, "3da3078d495481daabf3ca4d091e4574", RobustBitConfig.DEFAULT_VALUE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(objArr2, next, changeQuickRedirect3, false, "3da3078d495481daabf3ca4d091e4574")).booleanValue();
                    } else {
                        z = next.b == 4 && com.sankuai.waimai.business.im.api.msgcenter.a.a().showMsgCenterDot();
                    }
                    if (z) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public a.C0820a.b getPoiImInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "54c1e736b23372ad7923f7aeae44d72c", RobustBitConfig.DEFAULT_VALUE)) {
            return (a.C0820a.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "54c1e736b23372ad7923f7aeae44d72c");
        }
        a.C0820a.b bVar = null;
        if (this.menuInfoArrayList != null && this.menuInfoArrayList.size() > 1) {
            Iterator<a> it = this.menuInfoArrayList.iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next.b == 3 && next.d != null && next.d.a != null) {
                    bVar = next.d.a;
                }
            }
        }
        return bVar;
    }

    public int[] getMenuCodes() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "19d8ccf0ea24bc13d33d499c975ef4c0", RobustBitConfig.DEFAULT_VALUE)) {
            return (int[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "19d8ccf0ea24bc13d33d499c975ef4c0");
        }
        int[] iArr = null;
        if (this.menuInfoArrayList != null && this.menuInfoArrayList.size() > 1) {
            iArr = new int[this.menuInfoArrayList.size()];
            for (int i = 0; i < this.menuInfoArrayList.size(); i++) {
                iArr[i] = this.menuInfoArrayList.get(i).b;
            }
        }
        return iArr;
    }
}
