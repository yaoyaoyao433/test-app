package com.meituan.android.ptcommonim.base.bean;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PTIMCommonBean implements Parcelable {
    public static final Parcelable.Creator<PTIMCommonBean> CREATOR = new Parcelable.Creator<PTIMCommonBean>() { // from class: com.meituan.android.ptcommonim.base.bean.PTIMCommonBean.1
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PTIMCommonBean createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "67d71bb80d573b6f6622a06e475b4f8d", RobustBitConfig.DEFAULT_VALUE) ? (PTIMCommonBean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "67d71bb80d573b6f6622a06e475b4f8d") : new PTIMCommonBean(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PTIMCommonBean[] newArray(int i) {
            return new PTIMCommonBean[i];
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    public final String buID;
    public final String poiID;
    public final String realPageCid;
    public final String trace;
    public final UserType userType;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public enum UserType {
        TYPE_C,
        TYPE_B;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        UserType() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b1d3634c0e8dc3540cb7692d91f8aa3d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b1d3634c0e8dc3540cb7692d91f8aa3d");
            }
        }

        public static UserType valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "aa63050ec671cbea1264b9d8639cb7eb", RobustBitConfig.DEFAULT_VALUE) ? (UserType) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "aa63050ec671cbea1264b9d8639cb7eb") : (UserType) Enum.valueOf(UserType.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static UserType[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c13a9062b73cbf163dd2ea505ab8468f", RobustBitConfig.DEFAULT_VALUE) ? (UserType[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c13a9062b73cbf163dd2ea505ab8468f") : (UserType[]) values().clone();
        }
    }

    public PTIMCommonBean(String str, String str2, String str3, String str4, UserType userType) {
        Object[] objArr = {str, str2, str3, str4, userType};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3ccab322062b8c59288f49874329e1ae", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3ccab322062b8c59288f49874329e1ae");
            return;
        }
        this.buID = str;
        this.poiID = str2;
        this.realPageCid = str3;
        this.trace = str4;
        this.userType = userType;
    }

    public PTIMCommonBean(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a97f5a22caacdeab9038fccd05d7d520", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a97f5a22caacdeab9038fccd05d7d520");
            return;
        }
        this.buID = parcel.readString();
        this.poiID = parcel.readString();
        this.realPageCid = parcel.readString();
        this.trace = parcel.readString();
        this.userType = parcel.readInt() == 0 ? UserType.TYPE_C : UserType.TYPE_B;
    }

    public boolean isValid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "744971bdd78968b48f8872ee86afc3b8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "744971bdd78968b48f8872ee86afc3b8")).booleanValue() : (TextUtils.isEmpty(this.buID) || TextUtils.isEmpty(this.realPageCid) || this.userType == null) ? false : true;
    }

    private String getUserTypeStr() {
        return this.userType == UserType.TYPE_B ? "商家" : this.userType == UserType.TYPE_C ? "用户" : "-999";
    }

    public HashMap<String, Object> getMgeMap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dd971112a8e0842f859ca4d1dd5c1bb4", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dd971112a8e0842f859ca4d1dd5c1bb4");
        }
        HashMap<String, Object> hashMap = new HashMap<>(8);
        hashMap.put(Constants.Business.KEY_BU_ID, TextUtils.isEmpty(this.buID) ? "-999" : this.buID);
        hashMap.put("poi_id", TextUtils.isEmpty(this.poiID) ? "-999" : this.poiID);
        hashMap.put("real_cid", TextUtils.isEmpty(this.realPageCid) ? "-999" : this.realPageCid);
        hashMap.put("user_type", getUserTypeStr());
        return hashMap;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0e9e7e8867c7bb1b12257c8317552287", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0e9e7e8867c7bb1b12257c8317552287");
            return;
        }
        parcel.writeString(this.buID);
        parcel.writeString(this.poiID);
        parcel.writeString(this.realPageCid);
        parcel.writeString(TextUtils.isEmpty(this.trace) ? "" : this.trace);
        parcel.writeInt(this.userType != UserType.TYPE_C ? 1 : 0);
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "831955e0b4b833565c072785369ccb57", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "831955e0b4b833565c072785369ccb57");
        }
        return "PTIMCommonBean{buID='" + this.buID + "', poiID='" + this.poiID + "', realPageCid='" + this.realPageCid + "', trace='" + this.trace + "', userType=" + this.userType + '}';
    }
}
