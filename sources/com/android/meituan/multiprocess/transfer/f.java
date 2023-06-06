package com.android.meituan.multiprocess.transfer;

import android.os.Parcel;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class f implements e {
    @Override // com.android.meituan.multiprocess.transfer.e
    public final boolean a(Object obj) {
        return obj instanceof JSONObject;
    }

    @Override // com.android.meituan.multiprocess.transfer.e
    public final void a(Object obj, Parcel parcel) {
        parcel.writeString(obj.toString());
    }

    @Override // com.android.meituan.multiprocess.transfer.e
    public final Object a(Parcel parcel) {
        try {
            return new JSONObject(parcel.readString());
        } catch (JSONException unused) {
            return null;
        }
    }
}
