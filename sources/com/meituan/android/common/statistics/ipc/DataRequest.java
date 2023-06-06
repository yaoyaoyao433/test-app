package com.meituan.android.common.statistics.ipc;

import android.os.Parcel;
import android.os.Parcelable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class DataRequest<T> implements Parcelable {
    public static final Parcelable.Creator<DataRequest> CREATOR = new Parcelable.Creator<DataRequest>() { // from class: com.meituan.android.common.statistics.ipc.DataRequest.1
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DataRequest createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e28912ef8ed48f1894dd60d7a3e42a69", 6917529027641081856L) ? (DataRequest) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e28912ef8ed48f1894dd60d7a3e42a69") : new DataRequest(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DataRequest[] newArray(int i) {
            return new DataRequest[i];
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    private volatile int hashCode;
    private boolean inJustRouteLocal;
    private String mEventName;
    private String mMethod;
    private int mOpType;
    private T mOptions;
    private T mParameter;
    private String mProcess;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public DataRequest(Builder<T> builder) {
        Object[] objArr = {builder};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1fb499711cb91754a6d95b0c5a66f912", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1fb499711cb91754a6d95b0c5a66f912");
            return;
        }
        this.hashCode = 0;
        this.mProcess = ((Builder) builder).mProcess;
        this.mOpType = ((Builder) builder).mOptype;
        this.mMethod = ((Builder) builder).mMethod;
        this.mEventName = ((Builder) builder).mEventName;
        this.mParameter = (T) ((Builder) builder).mParameter;
        this.mOptions = (T) ((Builder) builder).mOptions;
        this.inJustRouteLocal = ((Builder) builder).inJustRouteLocal;
    }

    public DataRequest(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "26f6dcc19faf12639a7bb84b42e63c30", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "26f6dcc19faf12639a7bb84b42e63c30");
            return;
        }
        this.hashCode = 0;
        this.mProcess = parcel.readString();
        this.mOpType = parcel.readInt();
        this.mMethod = parcel.readString();
        this.mEventName = parcel.readString();
        this.mParameter = (T) parcel.readValue(getClass().getClassLoader());
        this.mOptions = (T) parcel.readValue(getClass().getClassLoader());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9ea4c4d8c81b4537d98f8171ba81916e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9ea4c4d8c81b4537d98f8171ba81916e");
            return;
        }
        parcel.writeString(this.mProcess);
        parcel.writeInt(this.mOpType);
        parcel.writeString(this.mMethod);
        parcel.writeString(this.mEventName);
        parcel.writeValue(this.mParameter);
        parcel.writeValue(this.mOptions);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class Builder<T> {
        public static ChangeQuickRedirect changeQuickRedirect;
        private boolean inJustRouteLocal;
        private String mEventName;
        private String mMethod;
        private T mOptions;
        private int mOptype;
        private T mParameter;
        private String mProcess;

        public Builder<T> process(String str) {
            this.mProcess = str;
            return this;
        }

        public Builder<T> opType(int i) {
            this.mOptype = i;
            return this;
        }

        public Builder<T> method(String str) {
            this.mMethod = str;
            return this;
        }

        public Builder<T> nm(String str) {
            this.mEventName = str;
            return this;
        }

        public Builder<T> parameter(T t) {
            this.mParameter = t;
            return this;
        }

        public Builder<T> options(T t) {
            this.mOptions = t;
            return this;
        }

        public Builder<T> inJustRouteLocal(boolean z) {
            this.inJustRouteLocal = z;
            return this;
        }

        public DataRequest<T> build() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7d436c6b5ff6fae36c67b999f528a63d", 6917529027641081856L) ? (DataRequest) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7d436c6b5ff6fae36c67b999f528a63d") : new DataRequest<>(this);
        }
    }

    public int getOpType() {
        return this.mOpType;
    }

    public String getMethod() {
        return this.mMethod;
    }

    public String getEventName() {
        return this.mEventName;
    }

    public String getProcess() {
        return this.mProcess;
    }

    public T getParameter() {
        return this.mParameter;
    }

    public T getOptions() {
        return this.mOptions;
    }

    public boolean isInJustRouteLocal() {
        return this.inJustRouteLocal;
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d3aa6271f7a8e924812ad07c4ecfd959", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d3aa6271f7a8e924812ad07c4ecfd959")).booleanValue();
        }
        if (obj != null && (obj instanceof DataRequest)) {
            DataRequest dataRequest = (DataRequest) obj;
            String process = dataRequest.getProcess();
            dataRequest.getOpType();
            return this.mProcess.equals(process) && this.mEventName != null && this.mEventName.equals(dataRequest.getEventName()) && this.mMethod.equals(dataRequest.getMethod());
        }
        return false;
    }

    public void setInJustRouteLocal(boolean z) {
        this.inJustRouteLocal = z;
    }

    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b9e1cd1d4c4b7c3858c0f47ba0082344", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b9e1cd1d4c4b7c3858c0f47ba0082344")).intValue();
        }
        int i = this.hashCode;
        if (i == 0) {
            int hashCode = this.mProcess.hashCode() + this.mMethod.hashCode() + String.valueOf(this.mEventName).hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }
        return i;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "634269197d2fa362e74f947b9b6be1ca", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "634269197d2fa362e74f947b9b6be1ca");
        }
        return "DataRequest mProcess:" + this.mProcess + " mOpType:" + this.mOpType + " mMethod:" + this.mMethod + " mParameter:" + this.mParameter + " mOptions:" + this.mOptions;
    }
}
