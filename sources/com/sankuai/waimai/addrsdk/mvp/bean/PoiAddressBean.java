package com.sankuai.waimai.addrsdk.mvp.bean;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.addrsdk.utils.e;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class PoiAddressBean implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("addr_info")
    public List<AddressInfo> addrInfo;
    @SerializedName(GearsLocator.ADDRESS)
    public String address;
    @SerializedName("distance")
    public int distance;
    @SerializedName(RemoteMessageConst.Notification.ICON)
    public String icon;
    @SerializedName("id")
    public String id;
    @SerializedName("location")
    public String location;
    private StringBuffer mDetailAddress;
    private double[] mLatLng;
    @SerializedName("name")
    public String name;
    @SerializedName("kind")
    public String type;

    public double[] getLat() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5e44317c641efaccfed0a56f884a7568", RobustBitConfig.DEFAULT_VALUE)) {
            return (double[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5e44317c641efaccfed0a56f884a7568");
        }
        if (this.mLatLng == null) {
            this.mLatLng = new double[2];
        }
        if (TextUtils.isEmpty(this.location)) {
            return null;
        }
        String[] split = this.location.split(CommonConstant.Symbol.COMMA);
        if (split.length < 2) {
            return null;
        }
        try {
            return new double[]{Double.valueOf(split[0]).doubleValue(), Double.valueOf(split[1]).doubleValue()};
        } catch (Exception unused) {
            return null;
        }
    }

    public String getDetailAddress() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2d86a1a823bba4d9bdd324e156f48ce5", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2d86a1a823bba4d9bdd324e156f48ce5");
        }
        if (TextUtils.isEmpty(this.mDetailAddress)) {
            this.mDetailAddress = new StringBuffer();
            String str = "";
            String str2 = "";
            String str3 = "";
            if (this.addrInfo != null && this.addrInfo.size() > 0) {
                for (AddressInfo addressInfo : this.addrInfo) {
                    if (e.a(addressInfo.adminLevel) == 4) {
                        str = addressInfo.name;
                    } else if (e.a(addressInfo.adminLevel) == 5) {
                        str2 = addressInfo.name;
                    } else if (e.a(addressInfo.adminLevel) == 6) {
                        str3 = addressInfo.name;
                    }
                }
            }
            if (!TextUtils.isEmpty(str2)) {
                if (!TextUtils.isEmpty(str) && !str.contains(str2)) {
                    this.mDetailAddress.append(str);
                }
                this.mDetailAddress.append(str2);
            }
            if (!TextUtils.isEmpty(this.address)) {
                if (!TextUtils.isEmpty(str3) && !this.address.contains(str3)) {
                    this.mDetailAddress.append(str3);
                }
                this.mDetailAddress.append(this.address);
            }
            return this.mDetailAddress.toString();
        }
        return this.mDetailAddress.toString();
    }
}
