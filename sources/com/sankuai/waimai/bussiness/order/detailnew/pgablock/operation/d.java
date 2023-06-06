package com.sankuai.waimai.bussiness.order.detailnew.pgablock.operation;

import com.google.gson.JsonArray;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.base.model.OrderAddress;
import com.sankuai.waimai.bussiness.order.detailnew.network.response.j;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class d implements Serializable {
    public static ChangeQuickRedirect a;
    @SerializedName("yunying_area")
    public j b;
    @SerializedName("actual_pay_total")
    public double c;
    @SerializedName("recipient_address")
    public String d;
    @SerializedName(GearsLocator.ADDRESS)
    public OrderAddress e;
    @SerializedName("foodlist")
    public JsonArray f;

    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d7825cd230ae6d24607ea873224c21e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d7825cd230ae6d24607ea873224c21e");
        }
        ArrayList arrayList = new ArrayList();
        try {
            int size = this.f == null ? 0 : this.f.size();
            for (int i = 0; i < size; i++) {
                long optLong = new JSONObject(this.f.get(i).toString()).optLong("id");
                if (optLong != 0) {
                    arrayList.add(String.valueOf(optLong));
                }
            }
        } catch (JSONException unused) {
        }
        return Arrays.toString(arrayList.toArray());
    }
}
