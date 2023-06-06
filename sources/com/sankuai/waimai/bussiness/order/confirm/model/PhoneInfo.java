package com.sankuai.waimai.bussiness.order.confirm.model;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class PhoneInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String code;
    public String phone;
    public int valid_digit;

    public PhoneInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "110c855dfea66db78714d9ca14d1f097", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "110c855dfea66db78714d9ca14d1f097");
            return;
        }
        this.phone = "";
        this.code = "";
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ebcf3c807aab3ff6e02f8adf7d256b91", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ebcf3c807aab3ff6e02f8adf7d256b91");
        }
        if ("86".equals(this.code)) {
            return this.phone;
        }
        return this.code + CommonConstant.Symbol.UNDERLINE + this.phone;
    }

    public boolean isEmpty() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ba765d8ebc01a42c277f505e593fe9cb", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ba765d8ebc01a42c277f505e593fe9cb")).booleanValue() : TextUtils.isEmpty(this.phone);
    }

    public boolean valid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d7f5533b98c8d71963841e923abbf1d6", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d7f5533b98c8d71963841e923abbf1d6")).booleanValue() : this.phone.trim().length() == this.valid_digit || this.valid_digit == Integer.MAX_VALUE;
    }
}
