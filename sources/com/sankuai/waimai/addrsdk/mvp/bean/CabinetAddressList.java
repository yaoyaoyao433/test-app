package com.sankuai.waimai.addrsdk.mvp.bean;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.util.WebUtil;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.waimai.addrsdk.constants.a;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class CabinetAddressList implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName(WebUtil.EXTRA_RESULT_IMAGES)
    public List<CabinetAddress> cabinetAddresses;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static class CabinetAddress implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String address;
        public int adminAreaCode;
        public String adminAreaName;
        public int adminCityCode;
        public String adminCityName;
        public String id;
        public String name;
        public Point point;
        public boolean selected;

        public AddressBean convert2AddressBean() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ae55fbf0f1282862b80e535b1334627e", RobustBitConfig.DEFAULT_VALUE)) {
                return (AddressBean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ae55fbf0f1282862b80e535b1334627e");
            }
            AddressBean addressBean = new AddressBean();
            addressBean.addressName = this.name;
            if (this.point != null) {
                addressBean.latitude = this.point.getLatLng().latitude;
                addressBean.longitude = this.point.getLatLng().longitude;
            }
            addressBean.addressKind = AddressBean.TYPE_CABINET;
            addressBean.addressSource = a.b;
            return addressBean;
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static class Point implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        public int lat;
        public int lng;

        public LatLng getLatLng() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9b1dd0c87ac5c329a2637d904269b0cb", RobustBitConfig.DEFAULT_VALUE)) {
                return (LatLng) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9b1dd0c87ac5c329a2637d904269b0cb");
            }
            if (this.lat == 0 || this.lng == 0) {
                return null;
            }
            return new LatLng((this.lat * 1.0d) / 1000000.0d, (this.lng * 1.0d) / 1000000.0d);
        }
    }
}
