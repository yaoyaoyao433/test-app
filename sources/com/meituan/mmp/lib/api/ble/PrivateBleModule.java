package com.meituan.mmp.lib.api.ble;

import android.os.Parcel;
import android.os.Parcelable;
import com.meituan.mmp.lib.api.ApiFunction;
import com.meituan.mmp.main.annotation.Optional;
import com.meituan.mmp.main.annotation.Required;
import com.meituan.mmp.main.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class PrivateBleModule {

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static abstract class AbsPrivateBLECommand extends ApiFunction<MBBLEParams, JSONObject> {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class MBBLEParams implements Parcelable, d {
        public static final Parcelable.Creator<MBBLEParams> CREATOR = new Parcelable.Creator<MBBLEParams>() { // from class: com.meituan.mmp.lib.api.ble.PrivateBleModule.MBBLEParams.1
            public static ChangeQuickRedirect a;

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ MBBLEParams createFromParcel(Parcel parcel) {
                Object[] objArr = {parcel};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3fd7a37470e3a831f05a38a53ac060d2", RobustBitConfig.DEFAULT_VALUE) ? (MBBLEParams) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3fd7a37470e3a831f05a38a53ac060d2") : new MBBLEParams(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ MBBLEParams[] newArray(int i) {
                return new MBBLEParams[i];
            }
        };
        public static ChangeQuickRedirect changeQuickRedirect;
        public int airLock;
        @Required
        public String bikeId;
        @Optional
        public String bikeType;
        public int business;
        @Required
        public String command;
        @Required
        public String deviceId;
        @Required
        public String orderId;
        public int type;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public MBBLEParams(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8746f66905231ce8a1dd01ff46a59638", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8746f66905231ce8a1dd01ff46a59638");
                return;
            }
            this.command = parcel.readString();
            this.orderId = parcel.readString();
            this.deviceId = parcel.readString();
            this.bikeId = parcel.readString();
            this.bikeType = parcel.readString();
            this.type = parcel.readInt();
            this.business = parcel.readInt();
            this.airLock = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            Object[] objArr = {parcel, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "104cae52e679a6fe2ecd12373bf74436", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "104cae52e679a6fe2ecd12373bf74436");
                return;
            }
            parcel.writeString(this.command);
            parcel.writeString(this.orderId);
            parcel.writeString(this.deviceId);
            parcel.writeString(this.bikeId);
            parcel.writeString(this.bikeType);
            parcel.writeInt(this.type);
            parcel.writeInt(this.business);
            parcel.writeInt(this.airLock);
        }
    }
}
