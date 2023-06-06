package com.dianping.picassocontroller.vc;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.dianping.picasso.model.PicassoModel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class PicassoVCInput implements Parcelable {
    public static final Parcelable.Creator<PicassoVCInput> CREATOR = new Parcelable.Creator<PicassoVCInput>() { // from class: com.dianping.picassocontroller.vc.PicassoVCInput.1
        public static ChangeQuickRedirect a;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ PicassoVCInput createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bfecc795180d3b6c09e6d51c4fd22ef0", RobustBitConfig.DEFAULT_VALUE) ? (PicassoVCInput) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bfecc795180d3b6c09e6d51c4fd22ef0") : new PicassoVCInput(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ PicassoVCInput[] newArray(int i) {
            return new PicassoVCInput[i];
        }
    };
    public static ChangeQuickRedirect a;
    public String b;
    public String c;
    public String d;
    public int e;
    public int f;
    public g g;
    public boolean h;
    public JSONObject i;
    public PicassoModel j;
    private com.dianping.picassocontroller.monitor.a k;
    private a l;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface a {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public PicassoVCInput() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c00fdb49e37c03fa70b3ae1af5cc867e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c00fdb49e37c03fa70b3ae1af5cc867e");
        } else {
            this.k = new com.dianping.picassocontroller.monitor.a();
        }
    }

    public PicassoVCInput(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38960c95fb87b88c996c5e65024aa109", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38960c95fb87b88c996c5e65024aa109");
            return;
        }
        this.k = new com.dianping.picassocontroller.monitor.a();
        String str = null;
        while (true) {
            int readInt = parcel.readInt();
            if (readInt == -1) {
                break;
            } else if (readInt == 7259) {
                this.j = (PicassoModel) parcel.readParcelable(PicassoModel.class.getClassLoader());
            } else if (readInt == 11718) {
                this.e = parcel.readInt();
            } else if (readInt == 31371) {
                this.b = parcel.readString();
            } else if (readInt == 31638) {
                this.h = parcel.readByte() != 0;
            } else if (readInt == 37159) {
                this.f = parcel.readInt();
            } else if (readInt == 40114) {
                this.d = parcel.readString();
            } else if (readInt == 49115) {
                this.c = parcel.readString();
            } else if (readInt == 61579) {
                str = parcel.readString();
            }
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.i = new JSONObject(str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81700f3434b9608127d9d0b44cdd4719", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81700f3434b9608127d9d0b44cdd4719");
        } else if (this.l == null) {
            Object[] objArr2 = {parcel, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "acd7b54fd826dea08c768bd7c14de426", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "acd7b54fd826dea08c768bd7c14de426");
                return;
            }
            PicassoModel picassoModel = this.j;
            if (this.g != null) {
                picassoModel = this.g.u;
            }
            parcel.writeInt(31371);
            parcel.writeString(this.b);
            parcel.writeInt(49115);
            parcel.writeString(this.c);
            parcel.writeInt(40114);
            parcel.writeString(this.d);
            parcel.writeInt(11718);
            parcel.writeInt(this.e);
            parcel.writeInt(37159);
            parcel.writeInt(this.f);
            parcel.writeInt(31638);
            parcel.writeByte(this.h ? (byte) 1 : (byte) 0);
            parcel.writeInt(7259);
            parcel.writeParcelable(picassoModel, i);
            parcel.writeInt(61579);
            parcel.writeString(this.i == null ? "" : this.i.toString());
            parcel.writeInt(-1);
        }
    }
}
