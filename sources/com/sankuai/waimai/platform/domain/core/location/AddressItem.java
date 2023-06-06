package com.sankuai.waimai.platform.domain.core.location;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.addrsdk.mvp.bean.AddressBean;
import com.sankuai.waimai.foundation.location.v2.d;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class AddressItem implements Serializable {
    public static final int AOI_ADDRESS_SUGGEST_EDT = 2;
    public static final int AOI_ADDRESS_SUGGEST_NEW = 1;
    public static final int AOI_CLOSE_REASON_EPIDEMIC = 1;
    public static final int BIND_NULL = 0;
    public static final int BIND_REGEO = 12;
    public static final int BIND_STAG_MAP = 15;
    public static final int BIND_SUGGEST = 11;
    public static final String EDIT_DELETE = "2";
    public static final String EDIT_EDIT = "3";
    public static final String EDIT_NEW = "1";
    public static final String EDIT_NULL = "0";
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("ab_strategy")
    public String abStrategy;
    @SerializedName(GearsLocator.ADDRESS)
    public String addrBrief;
    @SerializedName("house_number")
    public String addrBuildingNum;
    public String addrDesc;
    private List<AddressBean.AddressAdminParamList> addressAdminList;
    @SerializedName("address_biz_id")
    public int addressBizId;
    @SerializedName("address_bottom_tip")
    public String addressBottomTip;
    @SerializedName("address_districts")
    public List<District> addressDistricts;
    public String addressKind;
    @SerializedName("address_mode")
    public int addressMode;
    @SerializedName("poi_id")
    public long addressPoiId;
    public String addressRangeTip;
    @SerializedName("address_tip")
    public String addressTip;
    @SerializedName("address_tip_reason")
    public int addressTipReason;
    @SerializedName("address_top_tip_info")
    public AddressTopTipInfo addressTopTipInfo;
    @SerializedName("address_type")
    public int addressType;
    @SerializedName("address_using_type")
    public int addressUsingType;
    @SerializedName("aoi_close_reason")
    public int aoiCloseReason;
    @SerializedName("aoi_type")
    public int aoiType;
    @SerializedName("bind_type")
    public int bindType;
    public boolean canShipping;
    @SerializedName("categories")
    public List<AddressCategory> categories;
    @SerializedName("category")
    public int category;
    @SerializedName("category_icon")
    public String categoryIcon;
    public String cityCode;
    public String cityName;
    @SerializedName("distance")
    public String distance;
    public String district;
    public String editType;
    public int editable;
    public a extraDetail;
    @SerializedName("extra")
    public String extraInfo;
    public int from;
    public String gdType;
    @SerializedName("gender")
    public String gender;
    @SerializedName("guide_text")
    public String guideText;
    @SerializedName("id")
    public long id;
    public int isDefault;
    @SerializedName(Constants.PRIVACY.KEY_LATITUDE)
    public int lat;
    @SerializedName(Constants.PRIVACY.KEY_LONGITUDE)
    public int lng;
    public int mFlagNeedComplate;
    public int mFlagNotInRang;
    @SerializedName("phone_code_options")
    public List<PhoneCodeOption> mPhoneCodeOptions;
    public String mapSearchPoiId;
    @SerializedName("origin_address_info")
    public OriginalAddressInfo originAddressInfo;
    @SerializedName("phone")
    public String phone;
    @SerializedName("phone_inter_code")
    public String phoneInterCode;
    public String province;
    @SerializedName("recommend_pickup_cabinet")
    public int recommendPickupCabinet;
    @SerializedName("recommend_pickup_cabinet_text")
    public String recommendPickupCabinetText;
    public int recommendStrategyCode;
    @SerializedName("recommend_type")
    public int recommendType;
    public int relatedId;
    public String source;
    public String type;
    @SerializedName("name")
    public String userName;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class AddressInfo implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("is_user_address")
        public int isUserAddress;
        @SerializedName(Constants.PRIVACY.KEY_LATITUDE)
        public int lat;
        @SerializedName(Constants.PRIVACY.KEY_LONGITUDE)
        public int lng;
        @SerializedName("name")
        public String name;
        @SerializedName("poi_id")
        public long poiId;
        @SerializedName("type")
        public int type;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class AddressTopTipInfo implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("button")
        public TopButton button;
        @SerializedName("recommend_address_list_info")
        public RecommendAddressListInfo recommendAddressListInfo;
        @SerializedName("tip")
        public String tip;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class OriginalAddressInfo implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName(GearsLocator.ADDRESS)
        public String address;
        @SerializedName("display_origin_address")
        public int displayOriginAddress;
        @SerializedName("house_number")
        public String houseNumber;
        @SerializedName(Constants.PRIVACY.KEY_LATITUDE)
        public int lat;
        @SerializedName(Constants.PRIVACY.KEY_LONGITUDE)
        public int lng;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class ReceiptRemarkInfo implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("is_selected")
        public int isSelected;
        @SerializedName("tip")
        public String tip;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class RecommendAddressListInfo implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("address_list")
        public List<AddressInfo> addressList;
        @SerializedName("origin_address_info")
        public ReceiptRemarkInfo receiptRemarkInfo;
        @SerializedName("title")
        public String title;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class TopButton implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("text")
        public String text;
        @SerializedName("type")
        public int type;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class District implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("code")
        public String code;
        @SerializedName("level")
        public int level;
        @SerializedName("name")
        public String name;

        public District(JSONObject jSONObject) {
            this.code = jSONObject.optString("code");
            this.name = jSONObject.optString("name");
            this.level = jSONObject.optInt("level");
        }
    }

    public AddressItem() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b2198d6ad543b8fcb2f8cffa5ef114ca", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b2198d6ad543b8fcb2f8cffa5ef114ca");
            return;
        }
        this.mFlagNotInRang = -1;
        this.mFlagNeedComplate = -1;
        this.bindType = 0;
        this.userName = "";
        this.gender = "";
        this.addrBrief = "";
        this.addrDesc = "";
        this.addrBuildingNum = "";
        this.phone = "";
        this.editType = "0";
        this.gdType = "";
        this.categoryIcon = "";
        this.guideText = "";
        this.type = "";
        this.mapSearchPoiId = "";
        this.source = "";
        this.addressAdminList = new ArrayList();
        this.relatedId = -1;
        this.addressType = -1;
        this.editable = -1;
    }

    public boolean canShipping() {
        return this.canShipping;
    }

    public AddressItem(long j, int i, int i2, int i3, String str, String str2, String str3) {
        Object[] objArr = {new Long(j), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b53c1d615f595ef0682c0371328ee920", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b53c1d615f595ef0682c0371328ee920");
            return;
        }
        this.mFlagNotInRang = -1;
        this.mFlagNeedComplate = -1;
        this.bindType = 0;
        this.userName = "";
        this.gender = "";
        this.addrBrief = "";
        this.addrDesc = "";
        this.addrBuildingNum = "";
        this.phone = "";
        this.editType = "0";
        this.gdType = "";
        this.categoryIcon = "";
        this.guideText = "";
        this.type = "";
        this.mapSearchPoiId = "";
        this.source = "";
        this.addressAdminList = new ArrayList();
        this.id = j;
        this.isDefault = i;
        this.lat = i2;
        this.lng = i3;
        this.userName = str;
        this.addrBrief = str2;
        this.phone = str3;
        this.relatedId = -1;
    }

    public void setDoubleLatLng(double d, double d2) {
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "caca386ab4ffc2de545e71ac63b25122", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "caca386ab4ffc2de545e71ac63b25122");
            return;
        }
        this.lat = (int) (d * 1000000.0d);
        this.lng = (int) (d2 * 1000000.0d);
    }

    public double getDoubleLat() {
        return this.lat / 1000000.0d;
    }

    public double getDoubleLng() {
        return this.lng / 1000000.0d;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "66d44e4c98f6c20de354a0dd732e5f6d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "66d44e4c98f6c20de354a0dd732e5f6d");
        }
        return "name: " + this.userName + " phone: " + this.phone + " gender: " + this.gender + " address(name + address): (" + this.addrBrief + StringUtil.SPACE + this.addrDesc + ") lat: " + this.lat + " lng: " + this.lng + " bindType: " + this.bindType;
    }

    public AddressItem(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "254263da04e71d49f1c2c86f2ad19678", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "254263da04e71d49f1c2c86f2ad19678");
            return;
        }
        this.mFlagNotInRang = -1;
        this.mFlagNeedComplate = -1;
        this.bindType = 0;
        this.userName = "";
        this.gender = "";
        this.addrBrief = "";
        this.addrDesc = "";
        this.addrBuildingNum = "";
        this.phone = "";
        this.editType = "0";
        this.gdType = "";
        this.categoryIcon = "";
        this.guideText = "";
        this.type = "";
        this.mapSearchPoiId = "";
        this.source = "";
        this.addressAdminList = new ArrayList();
        this.id = jSONObject.optLong("id");
        this.isDefault = jSONObject.optInt("is_default");
        this.lat = jSONObject.optInt(Constants.PRIVACY.KEY_LATITUDE);
        this.lng = jSONObject.optInt(Constants.PRIVACY.KEY_LONGITUDE);
        this.userName = jSONObject.optString("name");
        this.addrBrief = jSONObject.optString(GearsLocator.ADDRESS);
        this.addrDesc = this.addrBrief;
        this.phone = jSONObject.optString("phone");
        this.bindType = jSONObject.optInt("bind_type");
        this.gender = jSONObject.optString("gender");
        this.canShipping = jSONObject.optInt("can_shipping", 0) == 1;
        this.addrBuildingNum = jSONObject.optString("house_number");
        this.gdType = jSONObject.optString("gd_type");
        this.editType = jSONObject.optString("edit_type", "0");
        this.addressType = jSONObject.optInt("address_type", -1);
        this.editable = jSONObject.optInt("editable", 1);
        this.recommendType = jSONObject.optInt("recommend_type");
        this.addressRangeTip = jSONObject.optString("address_range_tip");
        this.distance = jSONObject.optString("distance");
        checkHistoryProperties(jSONObject);
        this.category = jSONObject.optInt("category");
        this.categoryIcon = jSONObject.optString("category_icon");
        this.guideText = jSONObject.optString("guide_text");
        this.categories = fromJsonToList(jSONObject.optJSONArray("categories"));
        this.abStrategy = jSONObject.optString("ab_strategy");
        this.addressTipReason = jSONObject.optInt("address_tip_reason");
        this.extraInfo = jSONObject.optString("extra");
        setExtraDetail();
        this.addressBizId = jSONObject.optInt("address_biz_id");
        this.addressMode = jSONObject.optInt("address_mode");
        this.addressUsingType = jSONObject.optInt("address_using_type");
        parseAddressDistrictsList(jSONObject);
        this.recommendPickupCabinet = jSONObject.optInt("recommend_pickup_cabinet");
        this.recommendPickupCabinetText = jSONObject.optString("recommend_pickup_cabinet_text");
        this.addressBottomTip = jSONObject.optString("address_bottom_tip");
        this.phoneInterCode = jSONObject.optString("phone_inter_code");
        this.aoiType = jSONObject.optInt("aoi_type");
        this.aoiCloseReason = jSONObject.optInt("aoi_close_reason");
        this.addressPoiId = jSONObject.optLong("poi_id");
        parseOriginAddressInfo(jSONObject);
        parseAddressTopTipInfo(jSONObject);
    }

    private void parseOriginAddressInfo(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3aad9d58556f2df5956a70364b4ee495", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3aad9d58556f2df5956a70364b4ee495");
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("origin_address_info");
        if (optJSONObject != null) {
            this.originAddressInfo = (OriginalAddressInfo) d.a().fromJson(optJSONObject.toString(), (Class<Object>) OriginalAddressInfo.class);
        }
    }

    private void parseAddressTopTipInfo(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eb8248f21792c2f45a0ee4154cb9ea8d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eb8248f21792c2f45a0ee4154cb9ea8d");
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("address_top_tip_info");
        if (optJSONObject != null) {
            this.addressTopTipInfo = (AddressTopTipInfo) d.a().fromJson(optJSONObject.toString(), (Class<Object>) AddressTopTipInfo.class);
        }
    }

    private void parseAddressDistrictsList(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6ff9af83eb509396a55d3c3e14a9c68d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6ff9af83eb509396a55d3c3e14a9c68d");
            return;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("address_districts");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return;
        }
        this.addressDistricts = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                this.addressDistricts.add(new District(optJSONObject));
            }
        }
    }

    private JSONArray districtsToJsonArray() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2588b7702405021cb812e2a5fce54ec7", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2588b7702405021cb812e2a5fce54ec7");
        }
        if (this.addressDistricts == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        int size = this.addressDistricts.size();
        for (int i = 0; i < size; i++) {
            District district = this.addressDistricts.get(i);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("code", district.code);
                jSONObject.put("name", district.name);
                jSONObject.put("level", district.level);
            } catch (JSONException e) {
                com.sankuai.waimai.foundation.utils.log.a.a(e);
            }
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    private void checkHistoryProperties(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "da9f3bd08c1cebb34bed4ce7402be8e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "da9f3bd08c1cebb34bed4ce7402be8e9");
            return;
        }
        this.userName = TextUtils.isEmpty(this.userName) ? jSONObject.optString("username") : this.userName;
        this.lat = this.lat == 0 ? jSONObject.optInt("lat") : this.lat;
        this.lng = this.lng == 0 ? jSONObject.optInt("lng") : this.lng;
        this.addrBuildingNum = TextUtils.isEmpty(this.addrBuildingNum) ? jSONObject.optString("buildingNum") : this.addrBuildingNum;
        this.addressType = this.addressType == -1 ? jSONObject.optInt("businessType") : this.addressType;
    }

    public JSONObject toJson() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "564ca398be83ada404edc3d7f35f1d6d", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "564ca398be83ada404edc3d7f35f1d6d");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.id);
            jSONObject.put("is_default", this.isDefault);
            jSONObject.put(Constants.PRIVACY.KEY_LATITUDE, this.lat);
            jSONObject.put(Constants.PRIVACY.KEY_LONGITUDE, this.lng);
            jSONObject.put("related_id", this.relatedId);
            jSONObject.put("bind_type", this.bindType);
            jSONObject.put("username", this.userName);
            jSONObject.put(GearsLocator.ADDRESS, this.addrBrief);
            jSONObject.put("addr_desc", this.addrDesc);
            jSONObject.put("buildingNum", this.addrBuildingNum);
            jSONObject.put("businessType", this.addressType);
            jSONObject.put("phone", this.phone);
            jSONObject.put("gender", this.gender);
            jSONObject.put("edit_type", this.editType);
            jSONObject.put("gd_type", this.gdType);
            jSONObject.put("recommend_type", this.recommendType);
            jSONObject.put("address_range_tip", this.addressRangeTip);
            jSONObject.put("distance", this.distance);
            jSONObject.put("address_type", this.addressType);
            jSONObject.put("category", this.category);
            jSONObject.put("category_icon", this.categoryIcon);
            jSONObject.put("guide_text", this.guideText);
            jSONObject.put("categories", fromToJsonArray(this.categories));
            jSONObject.put("ab_strategy", this.abStrategy);
            jSONObject.put("address_tip_reason", this.addressTipReason);
            jSONObject.put("address_districts", districtsToJsonArray());
            jSONObject.put("recommend_pickup_cabinet", this.recommendPickupCabinet);
            jSONObject.put("recommend_pickup_cabinet_text", this.recommendPickupCabinetText);
            jSONObject.put("address_bottom_tip", this.addressBottomTip);
            jSONObject.put("phone_inter_code", this.phoneInterCode);
            jSONObject.put("aoi_type", this.aoiType);
            jSONObject.put("aoi_close_reason", this.aoiCloseReason);
            jSONObject.put("poi_id", this.addressPoiId);
            if (this.originAddressInfo != null) {
                jSONObject.put("origin_address_info", new JSONObject(d.a().toJson(this.originAddressInfo)));
            }
            if (this.addressTopTipInfo != null) {
                jSONObject.put("address_top_tip_info", new JSONObject(d.a().toJson(this.addressTopTipInfo)));
            }
            return jSONObject;
        } catch (JSONException e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
            return null;
        }
    }

    public List<AddressCategory> fromJsonToList(JSONArray jSONArray) {
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3457f936d53fd0e2e3393c2b747493ad", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3457f936d53fd0e2e3393c2b747493ad");
        }
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            arrayList.add(new AddressCategory(jSONArray.optJSONObject(i)));
        }
        return arrayList;
    }

    private JSONArray fromToJsonArray(List<AddressCategory> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bd35e4336f1c779d381a62bce7e09b37", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bd35e4336f1c779d381a62bce7e09b37");
        }
        if (list == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AddressCategory addressCategory = list.get(i);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("category", addressCategory.category);
                jSONObject.put("category_name", addressCategory.categoryName);
                jSONObject.put("category_icon", addressCategory.categoryIcon);
            } catch (JSONException e) {
                com.sankuai.waimai.foundation.utils.log.a.a(e);
            }
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b06f4884e5699a07ac4e7a595b4c7f2e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b06f4884e5699a07ac4e7a595b4c7f2e")).booleanValue() : obj != null && (obj == this || ((obj instanceof AddressItem) && ((AddressItem) obj).id == this.id));
    }

    public static boolean equals(AddressItem addressItem, AddressItem addressItem2) {
        Object[] objArr = {addressItem, addressItem2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7679967f65c5cad32bcc3c257a39854f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7679967f65c5cad32bcc3c257a39854f")).booleanValue();
        }
        if (addressItem == null) {
            return addressItem2 == null;
        }
        return addressItem.equals(addressItem2);
    }

    public void setAddressAdminList(List<AddressBean.AddressAdminParamList> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "28862bddad9f4e6076629ab3e5517c7a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "28862bddad9f4e6076629ab3e5517c7a");
        } else if (list != null) {
            this.addressAdminList.clear();
            this.addressAdminList.addAll(list);
        }
    }

    public List<AddressBean.AddressAdminParamList> getAddressAdminList() {
        return this.addressAdminList;
    }

    public String getExtraInfo() {
        return this.extraInfo;
    }

    public void setExtraInfo(String str) {
        this.extraInfo = str;
    }

    public void setExtraDetail() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "22a50a81f46109fe4a6ee3935a69b5c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "22a50a81f46109fe4a6ee3935a69b5c8");
        } else {
            this.extraDetail = a.a(this.extraInfo);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a implements Serializable {
        public static ChangeQuickRedirect a;
        public int b;
        public int c;
        public String d;
        public String e;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a817f160a8fe730ff63874443981f0c9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a817f160a8fe730ff63874443981f0c9");
            } else {
                this.b = -1;
            }
        }

        public static a a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "905f9db2643c40247b523674875de032", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "905f9db2643c40247b523674875de032");
            }
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            a aVar = new a();
            try {
                JSONObject jSONObject = new JSONObject(str);
                aVar.b = jSONObject.optInt("abnormalType");
                aVar.c = jSONObject.optInt("errorCheckCode");
                aVar.d = jSONObject.optString("errorCheckMsg");
                aVar.e = jSONObject.optString("modifyHint");
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return aVar;
        }
    }

    public boolean hasOriginalAddress() {
        return (this.originAddressInfo == null || this.originAddressInfo.lat == 0 || this.originAddressInfo.lng == 0) ? false : true;
    }

    public int getAoiAddressSuggestType() {
        if (this.addressTopTipInfo == null || this.addressTopTipInfo.button == null) {
            return 0;
        }
        return this.addressTopTipInfo.button.type;
    }
}
