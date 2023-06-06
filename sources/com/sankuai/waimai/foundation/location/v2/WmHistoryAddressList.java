package com.sankuai.waimai.foundation.location.v2;

import android.support.annotation.Keep;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.List;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class WmHistoryAddressList {
    private static final long REFRESH_TIME = 864000000;
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<SimpleAddressItem> addressItems;
    private long updateTime;
    private long userId;

    public void setUpdateTime(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f6433f150411496a9f92355ae9f3d647", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f6433f150411496a9f92355ae9f3d647");
        } else {
            this.updateTime = j;
        }
    }

    public void setAddressItems(List<SimpleAddressItem> list) {
        this.addressItems = list;
    }

    public long getUserId() {
        return this.userId;
    }

    public void setUserId(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3ad26d6daeb3a935b5acfec2e4642785", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3ad26d6daeb3a935b5acfec2e4642785");
        } else {
            this.userId = j;
        }
    }

    public long getUpdateTime() {
        return this.updateTime;
    }

    public List<SimpleAddressItem> getAddressItems() {
        return this.addressItems;
    }

    public boolean isValid(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a116b865607e4ffd14d363878611d246", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a116b865607e4ffd14d363878611d246")).booleanValue() : this.userId == j && System.currentTimeMillis() - this.updateTime < REFRESH_TIME;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static class SimpleAddressItem implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        private String addrBrief;
        private String addrBuildingNum;
        private int addressType;
        private int category;
        private String gender;
        private long id;
        private int lat;
        private int lng;
        private String phone;
        private String phoneCode;
        private String userName;

        public long getId() {
            return this.id;
        }

        public int getLat() {
            return this.lat;
        }

        public int getLng() {
            return this.lng;
        }

        public String getAddrBrief() {
            return this.addrBrief;
        }

        public String getPhone() {
            return this.phone;
        }

        public String getPhoneCode() {
            return this.phoneCode;
        }

        public String getUserName() {
            return this.userName;
        }

        public String getAddrBuildingNum() {
            return this.addrBuildingNum;
        }

        public String getGender() {
            return this.gender;
        }

        public int getCategory() {
            return this.category;
        }

        public int getAddressType() {
            return this.addressType;
        }

        public void setAddressType(int i) {
            this.addressType = i;
        }

        public static SimpleAddressItem simplifyAddressItem(long j, int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, int i3, int i4) {
            Object[] objArr = {new Long(j), Integer.valueOf(i), Integer.valueOf(i2), str, str2, str3, str4, str5, str6, Integer.valueOf(i3), Integer.valueOf(i4)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5561c5786c9888f131804c6bf2a87574", RobustBitConfig.DEFAULT_VALUE)) {
                return (SimpleAddressItem) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5561c5786c9888f131804c6bf2a87574");
            }
            SimpleAddressItem simpleAddressItem = new SimpleAddressItem();
            simpleAddressItem.id = j;
            simpleAddressItem.lat = i;
            simpleAddressItem.lng = i2;
            simpleAddressItem.addrBrief = str;
            simpleAddressItem.phone = str2;
            simpleAddressItem.phoneCode = str3;
            simpleAddressItem.userName = str4;
            simpleAddressItem.addrBuildingNum = str5;
            simpleAddressItem.gender = str6;
            simpleAddressItem.category = i3;
            simpleAddressItem.addressType = i4;
            return simpleAddressItem;
        }

        public static SimpleAddressItem fromJson(JSONObject jSONObject) {
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6c60436407ca7881715a1623dafa4b79", RobustBitConfig.DEFAULT_VALUE)) {
                return (SimpleAddressItem) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6c60436407ca7881715a1623dafa4b79");
            }
            if (jSONObject == null) {
                return null;
            }
            SimpleAddressItem simpleAddressItem = new SimpleAddressItem();
            simpleAddressItem.id = jSONObject.optLong("id");
            simpleAddressItem.lat = jSONObject.optInt(Constants.PRIVACY.KEY_LATITUDE);
            simpleAddressItem.lng = jSONObject.optInt(Constants.PRIVACY.KEY_LONGITUDE);
            simpleAddressItem.addrBrief = jSONObject.optString(GearsLocator.ADDRESS);
            simpleAddressItem.phone = jSONObject.optString("phone");
            simpleAddressItem.userName = jSONObject.optString("userName");
            simpleAddressItem.addrBuildingNum = jSONObject.optString("addrBuildingNum");
            simpleAddressItem.gender = jSONObject.optString("gender");
            simpleAddressItem.category = jSONObject.optInt("category");
            simpleAddressItem.addressType = jSONObject.optInt("addressType");
            return simpleAddressItem;
        }

        public static SimpleAddressItem fromPTAddressItem(SimpleAddressItemNew simpleAddressItemNew) {
            Object[] objArr = {simpleAddressItemNew};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6e6fcdbf88c0ab1bcf91d30675ec69bc", RobustBitConfig.DEFAULT_VALUE)) {
                return (SimpleAddressItem) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6e6fcdbf88c0ab1bcf91d30675ec69bc");
            }
            if (simpleAddressItemNew == null) {
                return null;
            }
            SimpleAddressItem simpleAddressItem = new SimpleAddressItem();
            simpleAddressItem.id = simpleAddressItemNew.id;
            simpleAddressItem.lat = simpleAddressItemNew.latitude;
            simpleAddressItem.lng = simpleAddressItemNew.longitude;
            simpleAddressItem.addrBrief = simpleAddressItemNew.address;
            simpleAddressItem.phone = simpleAddressItemNew.phone;
            simpleAddressItem.phoneCode = simpleAddressItemNew.phone_inter_code;
            simpleAddressItem.userName = simpleAddressItemNew.name;
            simpleAddressItem.addrBuildingNum = simpleAddressItemNew.house_number;
            simpleAddressItem.gender = simpleAddressItemNew.gender;
            simpleAddressItem.category = simpleAddressItemNew.category;
            simpleAddressItem.addressType = simpleAddressItemNew.address_type;
            return simpleAddressItem;
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static class SimpleAddressItemNew implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        private String address;
        private int address_type;
        private int category;
        private String gender;
        private String house_number;
        private long id;
        private int latitude;
        private int longitude;
        private String name;
        private String phone;
        private String phone_inter_code;

        public long getId() {
            return this.id;
        }

        public void setId(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b596e23d170ce8ed5df5f80256d2ee68", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b596e23d170ce8ed5df5f80256d2ee68");
            } else {
                this.id = j;
            }
        }

        public void setLatitude(int i) {
            this.latitude = i;
        }

        public void setLongitude(int i) {
            this.longitude = i;
        }

        public void setAddress(String str) {
            this.address = str;
        }

        public void setPhone(String str) {
            this.phone = str;
        }

        public void setPhone_inter_code(String str) {
            this.phone_inter_code = str;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setHouse_number(String str) {
            this.house_number = str;
        }

        public void setGender(String str) {
            this.gender = str;
        }

        public void setCategory(int i) {
            this.category = i;
        }

        public void setAddress_type(int i) {
            this.address_type = i;
        }
    }
}
