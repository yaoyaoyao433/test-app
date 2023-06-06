package com.sankuai.android.share.bean;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import com.meituan.android.nom.lyingkit.LyingkitExtraInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class ShareExtraInfo extends LyingkitExtraInfo {
    public static final Parcelable.Creator<ShareExtraInfo> CREATOR = new Parcelable.Creator<ShareExtraInfo>() { // from class: com.sankuai.android.share.bean.ShareExtraInfo.1
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShareExtraInfo createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d3c9ae70b8d078b83901a9471df36c48", RobustBitConfig.DEFAULT_VALUE) ? (ShareExtraInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d3c9ae70b8d078b83901a9471df36c48") : new ShareExtraInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShareExtraInfo[] newArray(int i) {
            return new ShareExtraInfo[i];
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.meituan.android.nom.lyingkit.LyingkitExtraInfo
    public final HashMap<String, Object> getExtraMgeMap() {
        return null;
    }

    public ShareExtraInfo(@NonNull String str, @NonNull String str2) {
        super(str, str2);
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3273a94166f7a80cfe04a2d7ca8a1b9a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3273a94166f7a80cfe04a2d7ca8a1b9a");
        }
    }

    public ShareExtraInfo(Parcel parcel) {
        super(parcel);
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d22deb589688e0e0ce9cd118006c646e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d22deb589688e0e0ce9cd118006c646e");
        }
    }

    @Override // com.meituan.android.nom.lyingkit.LyingkitExtraInfo, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dee18748d95c75787f68828754b55b8f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dee18748d95c75787f68828754b55b8f");
        } else {
            super.writeToParcel(parcel, i);
        }
    }
}
