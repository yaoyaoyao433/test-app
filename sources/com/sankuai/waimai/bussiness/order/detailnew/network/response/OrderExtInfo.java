package com.sankuai.waimai.bussiness.order.detailnew.network.response;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class OrderExtInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public ArrayList<Map<String, Object>> expInfo;
    @SerializedName("exp_infos")
    public ArrayList<a> expInfoList;
    public String ext;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a implements Serializable {
        @SerializedName("exp_type")
        public int a;
        @SerializedName("exp_name")
        public String b;
    }

    public OrderExtInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "44db218a29f334dbda03f8ee96542ac1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "44db218a29f334dbda03f8ee96542ac1");
        } else {
            this.expInfo = new ArrayList<>();
        }
    }

    public ArrayList<Map<String, Object>> getExpInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b55e059a61f88c9e53c2fd88fb9d5592", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b55e059a61f88c9e53c2fd88fb9d5592");
        }
        Iterator<a> it = this.expInfoList.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (next != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("exp_type", Integer.valueOf(next.a));
                hashMap.put("exp_name", next.b);
                this.expInfo.add(hashMap);
            }
        }
        return this.expInfo;
    }

    @Deprecated
    public boolean isImNewStyle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b4f863cf609f897c51bb6a97e6a2b187", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b4f863cf609f897c51bb6a97e6a2b187")).booleanValue();
        }
        if (com.sankuai.waimai.imbase.utils.a.a(this.expInfoList)) {
            return false;
        }
        Iterator<a> it = this.expInfoList.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (next != null && next.a == 2 && "A".equals(next.b)) {
                return true;
            }
        }
        return false;
    }
}
