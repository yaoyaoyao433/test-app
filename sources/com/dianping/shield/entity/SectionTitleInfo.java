package com.dianping.shield.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class SectionTitleInfo implements Parcelable {
    public static final Parcelable.Creator<SectionTitleInfo> CREATOR = new Parcelable.Creator<SectionTitleInfo>() { // from class: com.dianping.shield.entity.SectionTitleInfo.1
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SectionTitleInfo createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7462bc5b362bd5b0cb93ba24977244d1", RobustBitConfig.DEFAULT_VALUE) ? (SectionTitleInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7462bc5b362bd5b0cb93ba24977244d1") : new SectionTitleInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SectionTitleInfo[] newArray(int i) {
            return new SectionTitleInfo[i];
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    public String cellKey;
    public int section;
    public String sectionTitle;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public SectionTitleInfo(String str, int i, String str2) {
        Object[] objArr = {str, Integer.valueOf(i), str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e8bd0288f11307d65942b43f6aab8a87", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e8bd0288f11307d65942b43f6aab8a87");
            return;
        }
        this.cellKey = str;
        this.section = i;
        this.sectionTitle = str2;
    }

    public SectionTitleInfo() {
    }

    public SectionTitleInfo(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "575a8b87a49b283c77636bc5371c8d25", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "575a8b87a49b283c77636bc5371c8d25");
            return;
        }
        this.cellKey = parcel.readString();
        this.section = parcel.readInt();
        this.sectionTitle = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c7501eb4ee44e5824ceb22766e43acd9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c7501eb4ee44e5824ceb22766e43acd9");
            return;
        }
        parcel.writeString(this.cellKey);
        parcel.writeInt(this.section);
        parcel.writeString(this.sectionTitle);
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "12d9bd22afc67274abd2db25a43eb9e0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "12d9bd22afc67274abd2db25a43eb9e0")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SectionTitleInfo sectionTitleInfo = (SectionTitleInfo) obj;
        if (this.section != sectionTitleInfo.section) {
            return false;
        }
        if (this.cellKey == null ? sectionTitleInfo.cellKey == null : this.cellKey.equals(sectionTitleInfo.cellKey)) {
            return this.sectionTitle != null ? this.sectionTitle.equals(sectionTitleInfo.sectionTitle) : sectionTitleInfo.sectionTitle == null;
        }
        return false;
    }

    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8c92ce204fbf652f1e88d5f07472ade8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8c92ce204fbf652f1e88d5f07472ade8")).intValue();
        }
        return ((((this.cellKey != null ? this.cellKey.hashCode() : 0) * 31) + this.section) * 31) + (this.sectionTitle != null ? this.sectionTitle.hashCode() : 0);
    }
}
