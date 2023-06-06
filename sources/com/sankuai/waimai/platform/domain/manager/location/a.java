package com.sankuai.waimai.platform.domain.manager.location;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import com.dianping.titans.js.JsHandlerFactory;
import com.dianping.titans.utils.StorageUtil;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.addrsdk.mvp.bean.AddressBean;
import com.sankuai.waimai.addrsdk.mvp.bean.AddressListResponse;
import com.sankuai.waimai.addrsdk.mvp.bean.TagBean;
import com.sankuai.waimai.contextual.computing.storage.sp.ContextualComputingSP;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.foundation.location.v2.WmAddress;
import com.sankuai.waimai.foundation.location.v2.WmHistoryAddressList;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.foundation.utils.ab;
import com.sankuai.waimai.platform.domain.core.location.AddressItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a = null;
    public static String b = "delivery_location";
    private static List<AddressItem> c = new CopyOnWriteArrayList();
    private static AddressItem d;

    public static void a(List<AddressItem> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8e67017addf49373c82198cb049b7101", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8e67017addf49373c82198cb049b7101");
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (list != null && !list.isEmpty()) {
            c.clear();
            c.addAll(list);
            for (AddressItem addressItem : list) {
                arrayList.add(WmHistoryAddressList.SimpleAddressItem.simplifyAddressItem(addressItem.id, addressItem.lat, addressItem.lng, addressItem.addrBrief, addressItem.phone, addressItem.phoneInterCode, addressItem.userName, addressItem.addrBuildingNum, addressItem.gender, addressItem.category, addressItem.addressType));
            }
            ContextualComputingSP.a(list);
        }
        com.sankuai.waimai.foundation.location.v2.c.a(arrayList);
    }

    public static void b(List<String> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cbd07b75106dd0659f602a50eb42ad12", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cbd07b75106dd0659f602a50eb42ad12");
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (!com.sankuai.waimai.foundation.utils.d.a(list)) {
            try {
                for (String str : list) {
                    arrayList.add(new AddressItem(new JSONObject(str)));
                }
            } catch (JSONException unused) {
            }
        }
        a(arrayList);
    }

    public static ArrayList<String> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2e81b7055b4e9c57e1d8ad6ce4fde27e", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2e81b7055b4e9c57e1d8ad6ce4fde27e");
        }
        if (c == null || c.isEmpty()) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        for (AddressItem addressItem : c) {
            if (arrayList.size() <= 10 && addressItem != null && !TextUtils.isEmpty(addressItem.phone) && !arrayList.contains(addressItem.phone)) {
                arrayList.add(addressItem.phone);
            }
        }
        return arrayList;
    }

    public static JSONArray a(int i) {
        Object[] objArr = {3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4169233e9e24fcffd5ad147d50c2386e", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4169233e9e24fcffd5ad147d50c2386e");
        }
        if (c == null || c.isEmpty()) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        ArrayList arrayList = new ArrayList();
        try {
            for (AddressItem addressItem : c) {
                if (arrayList.size() == 3) {
                    break;
                }
                JSONObject jSONObject = new JSONObject();
                if (addressItem != null && !aa.a(addressItem.phone)) {
                    String str = addressItem.phone + CommonConstant.Symbol.MINUS + addressItem.userName + CommonConstant.Symbol.MINUS + addressItem.gender;
                    jSONObject.put("phone", addressItem.phone);
                    jSONObject.put("recipient_name", addressItem.userName);
                    jSONObject.put("gender", addressItem.gender);
                    if (!arrayList.contains(str)) {
                        jSONArray.put(jSONObject);
                        arrayList.add(str);
                    }
                }
            }
        } catch (Exception unused) {
        }
        return jSONArray;
    }

    public static void a(Context context, AddressItem addressItem) {
        Object[] objArr = {context, addressItem};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "df1f04169cff047bca857ceb98c43445", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "df1f04169cff047bca857ceb98c43445");
        } else if (addressItem != null) {
            AddressItem a2 = a(context);
            if (a2 != null && (addressItem.id == a2.id || a2.id == 0)) {
                b(context, addressItem);
            }
            if (d == null || addressItem.id != d.id) {
                return;
            }
            if (addressItem.lng == d.lng && addressItem.lat == d.lat) {
                b(addressItem);
            } else {
                d = null;
            }
        }
    }

    public static AddressItem a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "66e2b8dcd7a6eb0c6d32398e831ca592", RobustBitConfig.DEFAULT_VALUE)) {
            return (AddressItem) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "66e2b8dcd7a6eb0c6d32398e831ca592");
        }
        String b2 = com.sankuai.waimai.platform.capacity.persistent.sp.a.b(context, b, (String) null);
        if (!TextUtils.isEmpty(b2)) {
            try {
                return new AddressItem(new JSONObject(b2));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dddc1c74bf42dcb4c3d97a08ce54dcbb", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dddc1c74bf42dcb4c3d97a08ce54dcbb") : (TextUtils.isEmpty(str) || !str.contains(CommonConstant.Symbol.UNDERLINE)) ? "86" : str.split(CommonConstant.Symbol.UNDERLINE)[0];
    }

    public static String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9fbe8aff4552f9df5d03bc32bf561dae", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9fbe8aff4552f9df5d03bc32bf561dae") : (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '_') ? "" : (TextUtils.isEmpty(str) || !str.contains(CommonConstant.Symbol.UNDERLINE)) ? str : str.split(CommonConstant.Symbol.UNDERLINE)[1];
    }

    public static void b(Context context, AddressItem addressItem) {
        JSONObject json;
        Object[] objArr = {context, addressItem};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "046fa1effff6f77da6a701f7ecead6df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "046fa1effff6f77da6a701f7ecead6df");
        } else if (addressItem == null || (json = addressItem.toJson()) == null) {
        } else {
            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, b, json.toString());
        }
    }

    public static void b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5dc1990039ff62d27e8f6c743920d239", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5dc1990039ff62d27e8f6c743920d239");
        } else {
            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, b);
        }
    }

    public static String a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "38c6be1b93a175c2907fafe7ada1bcce", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "38c6be1b93a175c2907fafe7ada1bcce") : TextUtils.isEmpty(str2) ? str : str2;
    }

    public static AddressItem c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b11877600193abbb487a8169ddc804e5", RobustBitConfig.DEFAULT_VALUE) ? (AddressItem) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b11877600193abbb487a8169ddc804e5") : a(context);
    }

    public static void d(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "691c65d328e002312462a11bb4c3905c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "691c65d328e002312462a11bb4c3905c");
            return;
        }
        b(context);
        d = null;
    }

    public static AddressBean a(AddressItem addressItem) {
        Object[] objArr = {addressItem};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8cc3de6bcf595b31dd52f355e3efd565", RobustBitConfig.DEFAULT_VALUE)) {
            return (AddressBean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8cc3de6bcf595b31dd52f355e3efd565");
        }
        if (addressItem != null) {
            AddressBean addressBean = new AddressBean();
            StringBuilder sb = new StringBuilder();
            sb.append(addressItem.id);
            addressBean.setAddressViewId(sb.toString());
            addressBean.setAddressSource(addressItem.bindType);
            addressBean.setLongitude(addressItem.getDoubleLng());
            addressBean.setLatitude(addressItem.getDoubleLat());
            addressBean.setHouseNumber(addressItem.addrBuildingNum);
            addressBean.setAddressName(addressItem.addrBrief);
            addressBean.setGender(ab.a(R.string.wm_platform_location_gender_lady).equals(addressItem.gender) ? 2 : 1);
            addressBean.setPhone(addressItem.phone);
            addressBean.setRecipientName(addressItem.userName);
            addressBean.setExtra(addressItem.getExtraInfo());
            if (addressItem.category != 0) {
                TagBean tagBean = new TagBean();
                tagBean.setTagId(addressItem.category);
                addressBean.setTagInfo(tagBean);
            }
            if (addressItem.getAddressAdminList() != null) {
                addressBean.setAddressAdminParamList(addressItem.getAddressAdminList());
            }
            addressBean.addressKind = addressItem.addressKind;
            return addressBean;
        }
        return null;
    }

    public static AddressItem a(AddressBean addressBean) {
        Object[] objArr = {addressBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "031b65976ba620162aa8d09e1938eea3", RobustBitConfig.DEFAULT_VALUE)) {
            return (AddressItem) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "031b65976ba620162aa8d09e1938eea3");
        }
        if (addressBean != null) {
            AddressItem addressItem = new AddressItem();
            try {
                addressItem.id = Long.parseLong(addressBean.getAddressViewId());
            } catch (Exception unused) {
            }
            addressItem.userName = addressBean.getRecipientName();
            addressItem.addrBrief = addressBean.getAddressName();
            if (!"86".equals(addressBean.getPhoneInterCode()) && !TextUtils.isEmpty(addressBean.getPhoneInterCode())) {
                addressItem.phone = addressBean.getPhoneInterCode() + CommonConstant.Symbol.UNDERLINE + addressBean.getPhone();
            } else {
                addressItem.phone = addressBean.getPhone();
            }
            addressItem.phoneInterCode = addressBean.getPhoneInterCode();
            addressItem.lat = (int) addressBean.getLatitude();
            addressItem.lng = (int) addressBean.getLongitude();
            addressItem.bindType = addressBean.getAddressSource();
            addressItem.addrBuildingNum = addressBean.getHouseNumber();
            addressItem.category = addressBean.getTagInfo() != null ? addressBean.getTagInfo().getTagId() : 0;
            addressItem.categoryIcon = addressBean.getTagInfo() != null ? addressBean.getTagInfo().getTagIconUrl() : "";
            String str = "";
            if (addressBean.getGender() == 1) {
                str = ab.a(R.string.wm_platform_location_gender_gentleman);
            } else if (addressBean.getGender() == 2) {
                str = ab.a(R.string.wm_platform_location_gender_lady);
            }
            addressItem.gender = str;
            if (addressBean.getAddressAdminParamList() != null) {
                addressItem.setAddressAdminList(addressBean.getAddressAdminParamList());
            }
            return addressItem;
        }
        return null;
    }

    public static List<AddressItem> a(AddressListResponse addressListResponse) {
        Object[] objArr = {addressListResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "403d4fba4bcf6868d0983275d872cb7c", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "403d4fba4bcf6868d0983275d872cb7c");
        }
        ArrayList arrayList = new ArrayList();
        if (addressListResponse == null || addressListResponse.addressList == null || addressListResponse.addressList.size() == 0) {
            return arrayList;
        }
        for (int i = 0; i < addressListResponse.addressList.size(); i++) {
            arrayList.add(a(addressListResponse.addressList.get(i)));
        }
        return arrayList;
    }

    @Nullable
    public static AddressItem b() {
        WmAddress k;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f69add1f7c9d15e78df12692c8d7b2ef", RobustBitConfig.DEFAULT_VALUE)) {
            return (AddressItem) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f69add1f7c9d15e78df12692c8d7b2ef");
        }
        if (d != null) {
            return d;
        }
        WMLocation p = com.sankuai.waimai.foundation.location.v2.g.a().p();
        if (p == null || p.getLocationResultCode() == null || p.getLocationResultCode().a != 1200 || (k = com.sankuai.waimai.foundation.location.v2.g.a().k()) == null || TextUtils.isEmpty(k.getAddress()) || k.getWMLocation() == null) {
            return null;
        }
        AddressItem addressItem = new AddressItem();
        addressItem.lat = (int) (k.getWMLocation().getLatitude() * 1000000.0d);
        addressItem.lng = (int) (k.getWMLocation().getLongitude() * 1000000.0d);
        if (addressItem.lat == 0 || addressItem.lng == 0) {
            return null;
        }
        addressItem.addrBrief = k.getAddress();
        return addressItem;
    }

    public static void b(AddressItem addressItem) {
        Object[] objArr = {addressItem};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "da37952dc6aee9514dd61feab49743e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "da37952dc6aee9514dd61feab49743e5");
            return;
        }
        if (!TextUtils.isEmpty(addressItem.phoneInterCode) && !addressItem.phone.contains(CommonConstant.Symbol.UNDERLINE) && !"86".equals(addressItem.phoneInterCode)) {
            addressItem.phone = addressItem.phoneInterCode + CommonConstant.Symbol.UNDERLINE + addressItem.phone;
        }
        d = addressItem;
    }

    public static void c() {
        d = null;
    }

    public static void a(WmAddress wmAddress) {
        String cityName;
        Object[] objArr = {wmAddress};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8a0fde1b81b15ef18bb386285159876f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8a0fde1b81b15ef18bb386285159876f");
        } else if (wmAddress == null || wmAddress.getWMLocation() == null) {
        } else {
            WMLocation wMLocation = wmAddress.getWMLocation();
            try {
                HashMap hashMap = new HashMap();
                hashMap.put(Constants.PRIVACY.KEY_LATITUDE, Double.valueOf(wMLocation.getLatitude()));
                hashMap.put(Constants.PRIVACY.KEY_LONGITUDE, Double.valueOf(wMLocation.getLongitude()));
                hashMap.put(GearsLocator.ADDRESS, wmAddress.getAddress());
                Object[] objArr2 = {wmAddress};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "73954f7bc01030ee2c154943803857ca", RobustBitConfig.DEFAULT_VALUE)) {
                    cityName = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "73954f7bc01030ee2c154943803857ca");
                } else if (wmAddress.getMeitaunCity() != null) {
                    cityName = wmAddress.getMeitaunCity().getCityName();
                } else {
                    cityName = wmAddress.getMafCity() != null ? wmAddress.getMafCity().getCityName() : "";
                }
                hashMap.put("cityName", cityName);
                StorageUtil.putSharedValue(com.meituan.android.singleton.b.a, "nativelatitudelongitude", com.sankuai.waimai.foundation.location.v2.d.a().toJson(hashMap), 1);
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "f63b81e0738483b4bc1ef8520347172c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "f63b81e0738483b4bc1ef8520347172c");
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("action", "addressChange");
                JsHandlerFactory.publish(jSONObject);
            } catch (Exception e) {
                com.sankuai.waimai.foundation.utils.log.a.b(e);
            }
        }
    }
}
