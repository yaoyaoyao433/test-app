package com.sankuai.android.share.keymodule.SharePanel;

import android.os.Parcel;
import android.os.Parcelable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class SharePanelConfigBean implements Parcelable {
    public static final Parcelable.Creator<SharePanelConfigBean> CREATOR = new Parcelable.Creator<SharePanelConfigBean>() { // from class: com.sankuai.android.share.keymodule.SharePanel.SharePanelConfigBean.1
        public static ChangeQuickRedirect a;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ SharePanelConfigBean createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9228f7074220ae85c7c0aa021ce282f4", RobustBitConfig.DEFAULT_VALUE) ? (SharePanelConfigBean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9228f7074220ae85c7c0aa021ce282f4") : new SharePanelConfigBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ SharePanelConfigBean[] newArray(int i) {
            return new SharePanelConfigBean[i];
        }
    };
    public static ChangeQuickRedirect a;
    public HashMap<String, String> b;
    public String c;
    public String d;
    public String e;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public SharePanelConfigBean(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2222cb1f505f98844552defcd1042b7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2222cb1f505f98844552defcd1042b7");
            return;
        }
        this.b = new HashMap<>();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.b = parcel.readHashMap(HashMap.class.getClassLoader());
        this.e = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1951210d493d5d5be52c0fd753b9fdc5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1951210d493d5d5be52c0fd753b9fdc5");
            return;
        }
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeMap(this.b);
        parcel.writeString(this.e);
    }
}
