package com.meituan.android.mtplayer.video;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.media.MediaMetadataCompat;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class AudioPlayerParam extends BasePlayerParam {
    public static final Parcelable.Creator<AudioPlayerParam> CREATOR = new Parcelable.Creator<AudioPlayerParam>() { // from class: com.meituan.android.mtplayer.video.AudioPlayerParam.1
        public static ChangeQuickRedirect a;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ AudioPlayerParam createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7372094accebca95bf0764fc1cc2a033", RobustBitConfig.DEFAULT_VALUE) ? (AudioPlayerParam) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7372094accebca95bf0764fc1cc2a033") : new AudioPlayerParam(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ AudioPlayerParam[] newArray(int i) {
            return new AudioPlayerParam[i];
        }
    };
    public static ChangeQuickRedirect a;
    private MediaMetadataCompat f;
    private boolean g;

    public AudioPlayerParam(String str) {
        super(str);
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae1eb1b998e4d447e9a1a2b0f6d132fa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae1eb1b998e4d447e9a1a2b0f6d132fa");
        } else {
            this.g = true;
        }
    }

    public AudioPlayerParam(Parcel parcel) {
        super(parcel);
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6114a3912a93ae54c2da30ad22e57daf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6114a3912a93ae54c2da30ad22e57daf");
            return;
        }
        this.g = true;
        this.f = (MediaMetadataCompat) parcel.readParcelable(MediaMetadataCompat.class.getClassLoader());
        this.g = parcel.readByte() != 0;
    }

    @Override // com.meituan.android.mtplayer.video.BasePlayerParam, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a8be1daa714b207556d45465b0a473a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a8be1daa714b207556d45465b0a473a");
            return;
        }
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f, i);
        parcel.writeByte(this.g ? (byte) 1 : (byte) 0);
    }

    public final boolean a() {
        return this.e;
    }

    @Override // com.meituan.android.mtplayer.video.BasePlayerParam
    @Deprecated
    public final void a(Context context, @Nullable String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca8fe0333e02fceeafce57f9c1b48cf7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca8fe0333e02fceeafce57f9c1b48cf7");
        } else {
            super.a(context, str);
        }
    }

    @Override // com.meituan.android.mtplayer.video.BasePlayerParam
    @Deprecated
    public final void a(@Nullable String str, @NonNull com.meituan.android.mtplayer.video.proxy.d dVar) {
        Object[] objArr = {str, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d2c74428460138debefe1f00bf027f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d2c74428460138debefe1f00bf027f8");
        } else {
            super.a(str, dVar);
        }
    }
}
