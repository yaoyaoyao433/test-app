package com.sankuai.waimai.business.address.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.addrsdk.mvp.bean.AddressBean;
import com.sankuai.waimai.platform.domain.core.location.AddressItem;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class AddressBackInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName(GearsLocator.ADDRESS)
    public AddressBean address;
    @SerializedName("address_item")
    public AddressItem addressItem;
    @SerializedName("force_save")
    public boolean forceSave;
    @SerializedName("location_refresh")
    public RefreshLocationResult refreshLocationResult;
    @SerializedName("address_operate_type")
    public int addressOperateType = -1;
    @SerializedName("position")
    public int position = -1;
}
