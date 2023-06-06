package com.meituan.android.legwork.bean.orderlist;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class OrderStatus implements Serializable {
    public static final int ARRIVED_STORE = 31;
    public static final int CANCELLED = 6;
    public static final int CANCEL_FOR_ARRIVED_STORE_COURIER_REFUSE = 64;
    public static final int CANCEL_FOR_COURIER_CONFIRMING = 61;
    public static final int CANCEL_FOR_COURIER_REFUSE = 62;
    public static final int DELIVERING = 4;
    public static final int FINISHED = 5;
    public static final int REFUNDED = 8;
    public static final int REFUNDING = 7;
    public static final int REFUND_FAILED = 9;
    public static final int REFUND_PARTIAL = 10;
    public static final int WAITING_FOR_CHANGE_COURIER = 21;
    public static final int WAITING_FOR_COURIER_CONFIRMING = 2;
    public static final int WAITING_FOR_COURIER_PICKING_UP = 3;
    public static final int WAITING_FOR_PAYMENT = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("text")
    private String text;
    @SerializedName("value")
    private int value;

    public OrderStatus(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "44f6d3f59c514eeefd26def77771ec0f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "44f6d3f59c514eeefd26def77771ec0f");
            return;
        }
        this.value = i;
        this.text = str;
    }

    public int getValue() {
        return this.value;
    }

    public String getText() {
        return this.text;
    }

    public void setValue(int i) {
        this.value = i;
    }

    public void setText(String str) {
        this.text = str;
    }
}
