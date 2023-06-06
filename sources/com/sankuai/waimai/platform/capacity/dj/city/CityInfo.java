package com.sankuai.waimai.platform.capacity.dj.city;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class CityInfo implements Parcelable {
    public static final long AVAILABLE_DATA = TimeUnit.DAYS.toMillis(5);
    public static final Parcelable.Creator<CityInfo> CREATOR = new Parcelable.Creator<CityInfo>() { // from class: com.sankuai.waimai.platform.capacity.dj.city.CityInfo.1
        public static ChangeQuickRedirect a;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CityInfo createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5b572ba56c2238fffb7b2ca88bfc36f5", RobustBitConfig.DEFAULT_VALUE) ? (CityInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5b572ba56c2238fffb7b2ca88bfc36f5") : new CityInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ CityInfo[] newArray(int i) {
            return new CityInfo[i];
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    public List<AddrInfo> actual_city_info;
    public long location_timestamp;
    public List<AddrInfo> user_choose_city_info;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public CityInfo(List<AddrInfo> list, List<AddrInfo> list2, long j) {
        Object[] objArr = {list, list2, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f333a140e6bf8afbdfb41e1150e6eb7f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f333a140e6bf8afbdfb41e1150e6eb7f");
            return;
        }
        this.user_choose_city_info = list;
        this.actual_city_info = list2;
        this.location_timestamp = j;
    }

    public CityInfo(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6fc76ab5ba407064682354ee15b9bb69", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6fc76ab5ba407064682354ee15b9bb69");
            return;
        }
        this.user_choose_city_info = parcel.createTypedArrayList(AddrInfo.CREATOR);
        this.actual_city_info = parcel.createTypedArrayList(AddrInfo.CREATOR);
        this.location_timestamp = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "da6d6f31459999ea291a7d2e318c1fe5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "da6d6f31459999ea291a7d2e318c1fe5");
            return;
        }
        parcel.writeTypedList(this.user_choose_city_info);
        parcel.writeTypedList(this.actual_city_info);
        parcel.writeLong(this.location_timestamp);
    }

    public boolean isAvailable(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3362056173a7e4542b00ac0431e88d90", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3362056173a7e4542b00ac0431e88d90")).booleanValue() : Math.abs(j - this.location_timestamp) <= AVAILABLE_DATA;
    }
}
