package com.meituan.android.common.statistics.ipc;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class DataResponse<T> implements Parcelable {
    public static final int CODE_ERROR = 1;
    public static final int CODE_INVALID_PARAM = 2;
    public static final int CODE_MALFORMATED = 4;
    public static final int CODE_NOT_SUPPORTED = 3;
    public static final int CODE_SUCCESS = 0;
    public static ChangeQuickRedirect changeQuickRedirect;
    private int code;
    private String error;
    private T result;
    private static final DataResponse ERROR = new Builder().code(1).build();
    public static final Parcelable.Creator<DataResponse> CREATOR = new Parcelable.Creator<DataResponse>() { // from class: com.meituan.android.common.statistics.ipc.DataResponse.1
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DataResponse createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ff685a1845e7d62b21adb287d32e019b", 6917529027641081856L) ? (DataResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ff685a1845e7d62b21adb287d32e019b") : new DataResponse(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DataResponse[] newArray(int i) {
            return new DataResponse[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public static DataResponse error(String str) {
        ERROR.error = str;
        return ERROR;
    }

    public DataResponse(Builder<T> builder) {
        Object[] objArr = {builder};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ec99e8ab4b91739663b4669ae2023082", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ec99e8ab4b91739663b4669ae2023082");
            return;
        }
        this.code = ((Builder) builder).code;
        this.result = (T) ((Builder) builder).result;
        this.error = ((Builder) builder).error;
    }

    public DataResponse(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ca7d8a2226607eea0b15a70e5db3bc8c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ca7d8a2226607eea0b15a70e5db3bc8c");
            return;
        }
        this.code = parcel.readInt();
        this.error = parcel.readString();
        try {
            String readString = parcel.readString();
            if (TextUtils.isEmpty(readString)) {
                return;
            }
            this.result = (T) parcel.readValue(Class.forName(readString).getClassLoader());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class Builder<T> {
        public static ChangeQuickRedirect changeQuickRedirect;
        private int code;
        private String error;
        private T result;

        public Builder<T> code(int i) {
            this.code = i;
            return this;
        }

        public Builder<T> result(T t) {
            this.result = t;
            return this;
        }

        public Builder<T> error(String str) {
            this.error = str;
            return this;
        }

        public DataResponse<T> build() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "765996c5a573e6ddf74d7a73a0c00488", 6917529027641081856L) ? (DataResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "765996c5a573e6ddf74d7a73a0c00488") : new DataResponse<>(this);
        }
    }

    public T getResult() {
        return this.result;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d1c2ec006f16e6b6dcc1562a8ec704ff", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d1c2ec006f16e6b6dcc1562a8ec704ff");
            return;
        }
        parcel.writeInt(this.code);
        parcel.writeString(this.error);
        if (this.result != null) {
            parcel.writeString(this.result.getClass().getName());
            parcel.writeValue(this.result);
        }
    }

    public String getError() {
        return this.error;
    }

    public boolean isSuccess() {
        return this.code == 0;
    }

    public int getCode() {
        return this.code;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ff2c07d3f2107982e7cb42c9e8f36bb2", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ff2c07d3f2107982e7cb42c9e8f36bb2");
        }
        return "DataResponse code: " + this.code + " result" + this.result + " error" + this.error;
    }
}
