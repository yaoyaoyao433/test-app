package com.meituan.android.mtplayer.video;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class VideoPlayerParam extends BasePlayerParam {
    public static final Parcelable.Creator<VideoPlayerParam> CREATOR = new Parcelable.Creator<VideoPlayerParam>() { // from class: com.meituan.android.mtplayer.video.VideoPlayerParam.1
        public static ChangeQuickRedirect a;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VideoPlayerParam createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3befdcad083b7bf8f97e80096c6d2c17", RobustBitConfig.DEFAULT_VALUE) ? (VideoPlayerParam) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3befdcad083b7bf8f97e80096c6d2c17") : new VideoPlayerParam(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VideoPlayerParam[] newArray(int i) {
            return new VideoPlayerParam[i];
        }
    };

    public VideoPlayerParam(Uri uri) {
        super(uri);
    }

    public VideoPlayerParam(String str) {
        super(str);
    }

    public VideoPlayerParam(Parcel parcel) {
        super(parcel);
    }
}
