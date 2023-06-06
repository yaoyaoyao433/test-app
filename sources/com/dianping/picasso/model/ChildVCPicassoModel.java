package com.dianping.picasso.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.dianping.jscore.model.ArchiveException;
import com.dianping.jscore.model.Decoding;
import com.dianping.jscore.model.DecodingFactory;
import com.dianping.jscore.model.Unarchived;
import com.google.gson.annotations.Expose;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ChildVCPicassoModel implements Parcelable, Decoding {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Expose
    public PicassoModel info;
    public byte[] rawData;
    @Expose
    public int vcId;
    public static final DecodingFactory<ChildVCPicassoModel> PICASSO_DECODER = new DecodingFactory<ChildVCPicassoModel>() { // from class: com.dianping.picasso.model.ChildVCPicassoModel.1
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.dianping.jscore.model.DecodingFactory
        public final ChildVCPicassoModel[] createArray(int i) {
            return new ChildVCPicassoModel[i];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.dianping.jscore.model.DecodingFactory
        public final ChildVCPicassoModel createInstance() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "592e78f9a2cb0c7f66e56c672a48b95b", RobustBitConfig.DEFAULT_VALUE) ? (ChildVCPicassoModel) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "592e78f9a2cb0c7f66e56c672a48b95b") : new ChildVCPicassoModel();
        }
    };
    public static final Parcelable.Creator<ChildVCPicassoModel> CREATOR = new Parcelable.Creator<ChildVCPicassoModel>() { // from class: com.dianping.picasso.model.ChildVCPicassoModel.2
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChildVCPicassoModel createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0db8524b8e65fb30e5b36c08cc7ee130", RobustBitConfig.DEFAULT_VALUE)) {
                return (ChildVCPicassoModel) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0db8524b8e65fb30e5b36c08cc7ee130");
            }
            ChildVCPicassoModel childVCPicassoModel = new ChildVCPicassoModel();
            while (true) {
                int readInt = parcel.readInt();
                if (readInt == -1) {
                    return childVCPicassoModel;
                }
                if (readInt == 8360) {
                    childVCPicassoModel.vcId = (int) parcel.readDouble();
                } else if (readInt == 25774) {
                    childVCPicassoModel.info = (PicassoModel) parcel.readParcelable(PicassoModel.class.getClassLoader());
                }
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChildVCPicassoModel[] newArray(int i) {
            return new ChildVCPicassoModel[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ChildVCPicassoModel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "31cdf3a8e0afe6811190fa4df0a3324a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "31cdf3a8e0afe6811190fa4df0a3324a");
            return;
        }
        this.vcId = -1;
        this.rawData = new byte[0];
    }

    @Override // com.dianping.jscore.model.Decoding
    public void decode(Unarchived unarchived) throws ArchiveException {
        Object[] objArr = {unarchived};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ce62219e7088a36ec6e4e39793a03a88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ce62219e7088a36ec6e4e39793a03a88");
            return;
        }
        this.rawData = unarchived.rawData();
        while (true) {
            int readMemberHash16 = unarchived.readMemberHash16();
            if (readMemberHash16 <= 0) {
                return;
            }
            if (readMemberHash16 == 8360) {
                this.vcId = (int) unarchived.readDouble();
            } else if (readMemberHash16 == 25774) {
                this.info = (PicassoModel) unarchived.readObject(PicassoModel.PICASSO_DECODER);
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4ac3e0431a778f8a3a9bb73d17294106", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4ac3e0431a778f8a3a9bb73d17294106");
            return;
        }
        parcel.writeInt(8360);
        parcel.writeDouble(this.vcId);
        parcel.writeInt(25774);
        parcel.writeParcelable(this.info, i);
        parcel.writeInt(-1);
    }
}
