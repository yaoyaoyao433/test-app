package com.sankuai.waimai.bussiness.order.confirm.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.addrsdk.mvp.bean.AddressBean;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class AddressBackInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName(GearsLocator.ADDRESS)
    public AddressBean address;
    @SerializedName("address_operate_type")
    public int addressOperateType;
    @SerializedName("force_save")
    public boolean forceSave;
    @SerializedName("modify_type")
    public boolean modifyType;
}
