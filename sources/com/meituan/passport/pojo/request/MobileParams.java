package com.meituan.passport.pojo.request;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.RestrictTo;
import com.dianping.titans.utils.StorageUtil;
import com.meituan.passport.pojo.KeyValue;
import com.meituan.passport.pojo.Mobile;
import com.meituan.passport.service.ai;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.unionpay.tsmservice.data.Constant;
import java.util.ArrayList;
import java.util.Map;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class MobileParams extends b implements Parcelable {
    public static final Parcelable.Creator<MobileParams> CREATOR = new Parcelable.Creator<MobileParams>() { // from class: com.meituan.passport.pojo.request.MobileParams.1
        public static ChangeQuickRedirect a;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ MobileParams createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67f13be0e4d3412b5e859ced6cbae2c7", RobustBitConfig.DEFAULT_VALUE) ? (MobileParams) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67f13be0e4d3412b5e859ced6cbae2c7") : new MobileParams(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ MobileParams[] newArray(int i) {
            return new MobileParams[i];
        }
    };
    public static ChangeQuickRedirect a;
    public com.meituan.passport.clickaction.d<Mobile> b;
    public ai c;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public MobileParams() {
    }

    public MobileParams(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f437cfb4624b006664101c677190b82", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f437cfb4624b006664101c677190b82");
            return;
        }
        if (parcel.dataSize() > 3) {
            int readInt = parcel.readInt();
            if (readInt > 0) {
                this.e = new ArrayList(readInt);
                for (int i = 2; i < readInt; i++) {
                    this.e.add(new KeyValue(parcel.readString(), com.meituan.passport.clickaction.d.a(parcel.readString())));
                }
            }
            int readInt2 = parcel.readInt();
            if (readInt2 > 0) {
                this.f = new ArrayList(readInt2);
                for (int i2 = 2; i2 < readInt2; i2++) {
                    this.f.add(new KeyValue(parcel.readString(), com.meituan.passport.clickaction.d.a(parcel.readString())));
                }
            }
            int readInt3 = parcel.readInt();
            if (readInt3 > 0) {
                this.g = new ArrayList(readInt3);
                for (int i3 = 2; i3 < readInt3; i3++) {
                    this.g.add(new KeyValue(parcel.readString(), com.meituan.passport.clickaction.d.a(parcel.readString())));
                }
            }
        }
        Mobile mobile = new Mobile();
        mobile.number = parcel.readString();
        mobile.countryCode = parcel.readString();
        this.b = com.meituan.passport.clickaction.d.a(mobile);
    }

    @Override // com.meituan.passport.pojo.request.b
    public final boolean a() {
        return this.b != null;
    }

    @Override // com.meituan.passport.pojo.request.b
    public final void a(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f1b7a7473f944a0be8004276940fdb5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f1b7a7473f944a0be8004276940fdb5");
            return;
        }
        a(map, "encryptMobile", com.meituan.passport.encryption.a.b(this.b.b().number));
        a(map, Constant.KEY_COUNTRY_CODE, this.b.b().countryCode);
        a(map, "sim_mask_mobile", StorageUtil.getSharedValue(com.meituan.android.singleton.b.a(), "Channel.Account.SIMMaskMobile"));
    }

    @Override // com.meituan.passport.pojo.request.b
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62b763e9692adb9c5505131d3e5d98f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62b763e9692adb9c5505131d3e5d98f9");
        } else {
            this.b.a();
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d539ec551305daa3575900daf5d416e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d539ec551305daa3575900daf5d416e4");
        } else if (a()) {
            d();
            if (this.e != null) {
                parcel.writeInt(this.e.size());
                for (KeyValue keyValue : this.e) {
                    parcel.writeString(keyValue.key);
                    parcel.writeString(keyValue.value.b());
                }
            } else {
                parcel.writeInt(0);
            }
            if (this.f != null) {
                parcel.writeInt(this.f.size());
                for (KeyValue keyValue2 : this.f) {
                    parcel.writeString(keyValue2.key);
                    parcel.writeString(keyValue2.value.b());
                }
            } else {
                parcel.writeInt(0);
            }
            if (this.g != null) {
                parcel.writeInt(this.g.size());
                for (KeyValue keyValue3 : this.g) {
                    parcel.writeString(keyValue3.key);
                    parcel.writeString(keyValue3.value.b());
                }
            } else {
                parcel.writeInt(0);
            }
            if (this.b.b() != null) {
                parcel.writeString(this.b.b().number);
                parcel.writeString(this.b.b().countryCode);
                return;
            }
            parcel.writeString("");
            parcel.writeString("");
        }
    }
}
