package com.meituan.android.nom.lyingkit;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class LyingkitExtraInfo implements Parcelable {
    public static ChangeQuickRedirect changeQuickRedirect;
    protected final String belongBiz;
    protected final String belongPage;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public abstract HashMap<String, Object> getExtraMgeMap();

    public LyingkitExtraInfo(@NonNull String str, @NonNull String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "14cb8ea97ae014abe5fc9b3b75900a00", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "14cb8ea97ae014abe5fc9b3b75900a00");
        } else if ((TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) && d.a(b.b)) {
            throw new RuntimeException("传入的LyingkitExtraInfo中customBusiness为空");
        } else {
            this.belongBiz = str;
            this.belongPage = str2;
        }
    }

    public LyingkitExtraInfo(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "df84682fe0e711660758c0ebc324b790", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "df84682fe0e711660758c0ebc324b790");
            return;
        }
        this.belongBiz = parcel.readString();
        this.belongPage = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e3449e9cfccd9639ebef7b80b7ad22e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e3449e9cfccd9639ebef7b80b7ad22e0");
            return;
        }
        parcel.writeString(this.belongBiz);
        parcel.writeString(this.belongPage);
    }

    public String getBelongBiz() {
        return this.belongBiz;
    }

    public String getBelongPage() {
        return this.belongPage;
    }

    public boolean checkExtraInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7b56a8a4a08eabbeadedcbebadc15f84", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7b56a8a4a08eabbeadedcbebadc15f84")).booleanValue() : !TextUtils.isEmpty(this.belongBiz);
    }
}
