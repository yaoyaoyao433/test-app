package com.sankuai.waimai.addrsdk.mvp.bean;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.addrsdk.utils.e;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class AddressBean implements Serializable {
    public static final int ABNORMAL_HOUSE_ADDRESS = 7102;
    public static final int CITY_LEVEL = 5;
    public static final int DISTRICT_LEVEL = 6;
    public static final int INVALID_CABINET_ADDRESS = 7103;
    public static final int OTHER_ERROR_ADDRESS = 7104;
    public static final int POI_ERROR_ADDRESS = 7101;
    public static final int PROVINCE_LEVEL = 4;
    public static final int STREET_NUMBER = 10;
    public static final String TYPE_CABINET = "pickup";
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("address_admin_list")
    public List<AddressAdminParamList> addressAdminParamList;
    public String addressKind;
    @SerializedName("address_map_source")
    public String addressMapSource;
    @SerializedName("address_name")
    public String addressName;
    @SerializedName("address_source")
    public int addressSource;
    public String addressType;
    @SerializedName("address_view_id")
    public String addressViewId;
    public String city;
    @SerializedName("encrypted_phone")
    public String encrypted_phone;
    @SerializedName("extra")
    public String extra;
    public ExtraAddressDetail extraDetail;
    @SerializedName("gender")
    public int gender;
    @SerializedName("house_number")
    public String houseNumber;
    public int index;
    public String keyword;
    @SerializedName(Constants.PRIVACY.KEY_LATITUDE)
    public double latitude;
    @SerializedName(Constants.PRIVACY.KEY_LONGITUDE)
    public double longitude;
    public String mCityCode;
    public String mCityName;
    public StringBuffer mDetailAddress;
    public String mDistrict;
    public String mLevel7Info;
    public String mLevel8Info;
    public String mLevel9Info;
    public String mProvince;
    public String mStreetNumber;
    public String mapSearchPoiId;
    public String pageType;
    @SerializedName("phone")
    public String phone;
    @SerializedName("phone_inter_code")
    public String phoneInterCode;
    public PoiAddressBean poiAddressBean;
    public String radius;
    @SerializedName("recipient_name")
    public String recipientName;
    public String searchType;
    @SerializedName("tag_info")
    public TagBean tagInfo;

    public AddressBean() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f2a7ee740923f8cc7d60f20bc8209266", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f2a7ee740923f8cc7d60f20bc8209266");
        } else {
            this.index = -1;
        }
    }

    public AddressBean(AddressBean addressBean) {
        Object[] objArr = {addressBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3084b2fbe2fbc7f2da9c7aeeb3ddb8a5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3084b2fbe2fbc7f2da9c7aeeb3ddb8a5");
            return;
        }
        this.index = -1;
        this.addressViewId = addressBean.addressViewId;
        this.recipientName = addressBean.recipientName;
        this.addressName = addressBean.addressName;
        this.phone = addressBean.phone;
        this.phoneInterCode = addressBean.phoneInterCode;
        this.encrypted_phone = addressBean.encrypted_phone;
        this.latitude = addressBean.latitude;
        this.longitude = addressBean.longitude;
        this.gender = addressBean.gender;
        this.houseNumber = addressBean.houseNumber;
        this.addressSource = addressBean.addressSource;
        this.addressMapSource = addressBean.addressMapSource;
        this.tagInfo = addressBean.tagInfo;
        setAddressAdminParamList(addressBean.addressAdminParamList);
        this.extra = addressBean.extra;
        setExtraDetail();
    }

    public String getRecipientName() {
        return this.recipientName;
    }

    public void setRecipientName(String str) {
        this.recipientName = str;
    }

    public String getAddressName() {
        return this.addressName;
    }

    public void setAddressName(String str) {
        this.addressName = str;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String str) {
        this.phone = str;
    }

    public String getPhoneInterCode() {
        return this.phoneInterCode;
    }

    public void setPhoneInterCode(String str) {
        this.phoneInterCode = str;
    }

    public String getEncryptedPhone() {
        return this.encrypted_phone;
    }

    public void setEncryptedPhone(String str) {
        this.encrypted_phone = str;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public void setLatitude(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "43c36b615691a36c3a7f20d6c3ea1c97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "43c36b615691a36c3a7f20d6c3ea1c97");
        } else {
            this.latitude = d;
        }
    }

    public double getLongitude() {
        return this.longitude;
    }

    public void setLongitude(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a22cc81d2c3857023d4eed21a0e4ea65", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a22cc81d2c3857023d4eed21a0e4ea65");
        } else {
            this.longitude = d;
        }
    }

    public int getGender() {
        return this.gender;
    }

    public void setGender(int i) {
        this.gender = i;
    }

    public String getHouseNumber() {
        return this.houseNumber;
    }

    public void setHouseNumber(String str) {
        this.houseNumber = str;
    }

    public int getAddressSource() {
        return this.addressSource;
    }

    public void setAddressSource(int i) {
        this.addressSource = i;
    }

    public String getAddressMapSource() {
        return this.addressMapSource;
    }

    public void setAddressMapSource(String str) {
        this.addressMapSource = str;
    }

    public List<AddressAdminParamList> getAddressAdminParamList() {
        return this.addressAdminParamList;
    }

    public void setAddressAdminParamList(List<AddressAdminParamList> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7bc4cf2ba8dfbe12de719492a120e261", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7bc4cf2ba8dfbe12de719492a120e261");
            return;
        }
        if (this.addressAdminParamList == null) {
            this.addressAdminParamList = new ArrayList();
        }
        this.addressAdminParamList.clear();
        if (list != null) {
            try {
                this.addressAdminParamList.addAll(list);
            } catch (Exception unused) {
            }
        }
    }

    public String getAddressViewId() {
        return this.addressViewId;
    }

    public void setAddressViewId(String str) {
        this.addressViewId = str;
    }

    public TagBean getTagInfo() {
        return this.tagInfo;
    }

    public void setTagInfo(TagBean tagBean) {
        this.tagInfo = tagBean;
    }

    public String getExtra() {
        return this.extra;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class AddressAdminParamList implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("code")
        public String code;
        @SerializedName("level_info")
        public LevelInfoBean levelInfo;
        @SerializedName("name")
        public String name;

        public String getCode() {
            return this.code;
        }

        public void setCode(String str) {
            this.code = str;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String str) {
            this.name = str;
        }

        public LevelInfoBean getLevelInfo() {
            return this.levelInfo;
        }

        public void setLevelInfo(LevelInfoBean levelInfoBean) {
            this.levelInfo = levelInfoBean;
        }
    }

    public String toRequestJson(boolean z, boolean z2, String str) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4a85ce5301fc1ecef4fe089364dc27b5", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4a85ce5301fc1ecef4fe089364dc27b5");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("address_view_id", String.valueOf(this.addressViewId));
            jSONObject.put("recipient_name", this.recipientName);
            jSONObject.put("address_name", this.addressName);
            jSONObject.put("gender", this.gender);
            jSONObject.put("phone", this.phone);
            jSONObject.put("phone_inter_code", this.phoneInterCode);
            jSONObject.put(Constants.PRIVACY.KEY_LATITUDE, e.a(this.latitude));
            jSONObject.put(Constants.PRIVACY.KEY_LONGITUDE, e.a(this.longitude));
            jSONObject.put("house_number", this.houseNumber);
            jSONObject.put("tag_id", this.tagInfo != null ? Integer.valueOf(this.tagInfo.getTagId()) : "");
            jSONObject.put("address_source", this.addressSource);
            if (this.addressAdminParamList != null && this.addressAdminParamList.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < this.addressAdminParamList.size(); i++) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", this.addressAdminParamList.get(i).code);
                    jSONObject2.put("name", this.addressAdminParamList.get(i).name);
                    if (this.addressAdminParamList.get(i).levelInfo != null) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("level", this.addressAdminParamList.get(i).levelInfo.level);
                        jSONObject3.put("desc", this.addressAdminParamList.get(i).levelInfo.desc);
                        jSONObject2.put("level_info", jSONObject3);
                    }
                    jSONArray.put(jSONObject2);
                }
                jSONObject.put("address_admin_list", jSONArray);
            }
            jSONObject.put("address_map_source", this.addressMapSource);
            jSONObject.put("user_confirmed", z);
            jSONObject.put("force_return_success", z2);
            jSONObject.put("extra", str);
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }

    public void covertParams(List<AddressAdminParamList> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6d6a9263d39cad4e42ada76f5741bd1d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6d6a9263d39cad4e42ada76f5741bd1d");
            return;
        }
        this.mDetailAddress = new StringBuffer();
        for (AddressAdminParamList addressAdminParamList : list) {
            if (addressAdminParamList.levelInfo.level == 4) {
                this.mProvince = addressAdminParamList.name;
            } else if (addressAdminParamList.levelInfo.level == 5) {
                this.mCityName = addressAdminParamList.name;
                this.mCityCode = addressAdminParamList.code;
            } else if (addressAdminParamList.levelInfo.level == 6) {
                this.mDistrict = addressAdminParamList.name;
            } else if (addressAdminParamList.levelInfo.level == 10) {
                this.mStreetNumber = addressAdminParamList.name;
            } else if (addressAdminParamList.levelInfo.level == 7) {
                this.mLevel7Info = addressAdminParamList.name;
            } else if (addressAdminParamList.levelInfo.level == 8) {
                this.mLevel8Info = addressAdminParamList.name;
            } else if (addressAdminParamList.levelInfo.level == 9) {
                this.mLevel9Info = addressAdminParamList.name;
            }
        }
        if (!TextUtils.isEmpty(this.mCityName)) {
            if (!TextUtils.isEmpty(this.mProvince) && !this.mProvince.contains(this.mCityName) && (TextUtils.isEmpty(this.mStreetNumber) || !this.mStreetNumber.contains(this.mProvince))) {
                this.mDetailAddress.append(this.mProvince);
            }
            if (!TextUtils.isEmpty(this.mStreetNumber) && !this.mStreetNumber.contains(this.mCityName)) {
                this.mDetailAddress.append(this.mCityName);
            }
        }
        if (!TextUtils.isEmpty(this.mDistrict) && (TextUtils.isEmpty(this.mStreetNumber) || TextUtils.isEmpty(this.mStreetNumber) || !this.mStreetNumber.contains(this.mDistrict))) {
            this.mDetailAddress.append(this.mDistrict);
        }
        if (!TextUtils.isEmpty(this.mLevel7Info)) {
            this.mDetailAddress.append(this.mLevel7Info);
        }
        if (!TextUtils.isEmpty(this.mLevel8Info)) {
            this.mDetailAddress.append(this.mLevel8Info);
        }
        if (!TextUtils.isEmpty(this.mLevel9Info)) {
            this.mDetailAddress.append(this.mLevel9Info);
        }
        if (TextUtils.isEmpty(this.mStreetNumber)) {
            return;
        }
        this.mDetailAddress.append(this.mStreetNumber);
    }

    public String getCityName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "53955199807d84ca587d59b322442414", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "53955199807d84ca587d59b322442414");
        }
        if (this.addressAdminParamList != null && this.addressAdminParamList.size() > 0) {
            covertParams(this.addressAdminParamList);
        }
        return this.mCityName;
    }

    public String getCityCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "83ef3888c77f1a89692d3d69a18c3b26", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "83ef3888c77f1a89692d3d69a18c3b26");
        }
        if (this.addressAdminParamList != null && this.addressAdminParamList.size() > 0) {
            covertParams(this.addressAdminParamList);
        }
        return this.mCityCode;
    }

    public String getProvince() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dae33689123dd81508019ec1bb13d471", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dae33689123dd81508019ec1bb13d471");
        }
        if (this.addressAdminParamList != null && this.addressAdminParamList.size() > 0) {
            covertParams(this.addressAdminParamList);
        }
        return this.mProvince;
    }

    public String getDistrict() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "250d29c7b003252dff9e95d1e6a531a8", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "250d29c7b003252dff9e95d1e6a531a8");
        }
        if (this.addressAdminParamList != null && this.addressAdminParamList.size() > 0) {
            covertParams(this.addressAdminParamList);
        }
        return this.mDistrict;
    }

    public String getAddressDetail() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f3616e00c6c485505ee87c18c6dc793a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f3616e00c6c485505ee87c18c6dc793a");
        }
        if (this.addressAdminParamList != null && this.addressAdminParamList.size() > 0) {
            covertParams(this.addressAdminParamList);
        }
        return this.mDetailAddress == null ? "" : this.mDetailAddress.toString();
    }

    public String getMapSearchPoiId() {
        return this.mapSearchPoiId;
    }

    public void setMapSearchPoiId(String str) {
        this.mapSearchPoiId = str;
    }

    public int getIntLatitude() {
        return (int) (this.latitude * 1000000.0d);
    }

    public int getIntLongitude() {
        return (int) (this.longitude * 1000000.0d);
    }

    public void setExtraDetail() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a98e62e77d060c3b3e0f14225ea3342f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a98e62e77d060c3b3e0f14225ea3342f");
        } else {
            this.extraDetail = ExtraAddressDetail.getExtraAddressDetail(this.extra);
        }
    }

    public boolean isExtraAbnormalAddress() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9ea1105a43d07e3191ced72412464608", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9ea1105a43d07e3191ced72412464608")).booleanValue() : (this.extraDetail == null || TextUtils.isEmpty(this.extraDetail.modifyHint)) ? false : true;
    }

    public boolean isInvalidCabinetAddress() {
        return this.extraDetail != null && this.extraDetail.errorCheckCode == 7103;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class ExtraAddressDetail implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("abnormalType")
        public int abnormalType;
        @SerializedName("errorCheckCode")
        public int errorCheckCode;
        @SerializedName("errorCheckMsg")
        public String errorCheckMsg;
        @SerializedName("modifyHint")
        public String modifyHint;

        public static ExtraAddressDetail getExtraAddressDetail(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a97415f36ba51bed6e8d87871cb582ae", RobustBitConfig.DEFAULT_VALUE)) {
                return (ExtraAddressDetail) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a97415f36ba51bed6e8d87871cb582ae");
            }
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            ExtraAddressDetail extraAddressDetail = new ExtraAddressDetail();
            try {
                JSONObject jSONObject = new JSONObject(str);
                extraAddressDetail.abnormalType = jSONObject.optInt("abnormalType");
                extraAddressDetail.errorCheckCode = jSONObject.optInt("errorCheckCode");
                extraAddressDetail.errorCheckMsg = jSONObject.optString("errorCheckMsg");
                extraAddressDetail.modifyHint = jSONObject.optString("modifyHint");
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return extraAddressDetail;
        }
    }

    public boolean isCabinetAddress() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7611add73074779fd92abc676bc0f457", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7611add73074779fd92abc676bc0f457")).booleanValue();
        }
        return TextUtils.equals(this.addressKind, TYPE_CABINET) || (this.tagInfo != null && this.tagInfo.getTagId() == 4);
    }
}
