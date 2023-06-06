package com.meituan.passport.pojo;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.common.aidata.mrn.Constants;
import com.meituan.hotel.android.hplus.diagnoseTool.DiagnoseLog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class LogoutInfo implements Parcelable {
    public static final Parcelable.Creator<LogoutInfo> CREATOR = new Parcelable.Creator<LogoutInfo>() { // from class: com.meituan.passport.pojo.LogoutInfo.1
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LogoutInfo createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "842e09c53a2e43c0a924ea0e8b6a5437", RobustBitConfig.DEFAULT_VALUE) ? (LogoutInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "842e09c53a2e43c0a924ea0e8b6a5437") : new LogoutInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LogoutInfo[] newArray(int i) {
            return new LogoutInfo[i];
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    private String componentName;
    private BaseLogoutData extraInfo;
    private LogoutScene logoutScene;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getComponentName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eb7e5e9292334fabff707e0b21fb4760", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eb7e5e9292334fabff707e0b21fb4760") : !TextUtils.isEmpty(this.componentName) ? this.componentName : "unknown";
    }

    public String getLogoutScene() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ebaa4a0daf936948be566ba5bbee5baf", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ebaa4a0daf936948be566ba5bbee5baf") : this.logoutScene != null ? this.logoutScene.getLabel() : "unknown";
    }

    public String getLogoutExtraInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "982c4fb41acbbb934d416e27d2b5bc9b", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "982c4fb41acbbb934d416e27d2b5bc9b") : this.extraInfo != null ? this.extraInfo.toString() : "";
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7da74495e8f4845fbc42afb16b0b2194", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7da74495e8f4845fbc42afb16b0b2194");
        }
        return "LogoutInfo{componentName= " + getComponentName() + ", logoutScene= " + getLogoutScene() + "', extraInfo= " + getLogoutExtraInfo() + "'}";
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public enum LogoutScene implements Parcelable {
        LOGOUT_TYPE_URL("Naitve URL"),
        LOGOUT_TYPE_MMP("MMP"),
        LOGOUT_TYPE_KNB("KNB"),
        LOGOUT_TYPE_MRN(DiagnoseLog.MRN),
        LOGOUT_TYPE_DEBUG("DEBUG"),
        LOGOUT_TYPE_OTHER("OTHER");
        
        public static final Parcelable.Creator<LogoutScene> CREATOR = new Parcelable.Creator<LogoutScene>() { // from class: com.meituan.passport.pojo.LogoutInfo.LogoutScene.1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LogoutScene createFromParcel(Parcel parcel) {
                Object[] objArr = {parcel};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eb7a5d9071203cb9d990cf52eed1810c", RobustBitConfig.DEFAULT_VALUE) ? (LogoutScene) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eb7a5d9071203cb9d990cf52eed1810c") : LogoutScene.valuesCustom()[parcel.readInt()];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LogoutScene[] newArray(int i) {
                return new LogoutScene[i];
            }
        };
        public static ChangeQuickRedirect changeQuickRedirect;
        private String label;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public static LogoutScene valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9266c3fad6e3a6bd7c97fbd93b8a4eed", RobustBitConfig.DEFAULT_VALUE) ? (LogoutScene) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9266c3fad6e3a6bd7c97fbd93b8a4eed") : (LogoutScene) Enum.valueOf(LogoutScene.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static LogoutScene[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "95af00da209071169ca754680ead26d5", RobustBitConfig.DEFAULT_VALUE) ? (LogoutScene[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "95af00da209071169ca754680ead26d5") : (LogoutScene[]) values().clone();
        }

        LogoutScene(String str) {
            Object[] objArr = {r10, Integer.valueOf(r11), str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bd210dc9675544bc7dbe3f7391a77441", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bd210dc9675544bc7dbe3f7391a77441");
            } else {
                this.label = str;
            }
        }

        public final String getLabel() {
            return this.label;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Object[] objArr = {parcel, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "068bab42a6618925911d27d6064f1b5b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "068bab42a6618925911d27d6064f1b5b");
            } else {
                parcel.writeString(this.label);
            }
        }
    }

    public LogoutInfo(@NonNull String str, @NonNull NativeUrlData nativeUrlData, @Nullable HashMap<String, String> hashMap) {
        Object[] objArr = {str, nativeUrlData, hashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9794853d2b746f846146578940c7fed8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9794853d2b746f846146578940c7fed8");
            return;
        }
        this.componentName = str;
        this.logoutScene = LogoutScene.LOGOUT_TYPE_URL;
        this.extraInfo = nativeUrlData;
        this.extraInfo.map = hashMap;
    }

    public LogoutInfo(@NonNull String str, @NonNull KNBData kNBData, @Nullable HashMap<String, String> hashMap) {
        Object[] objArr = {str, kNBData, hashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1d4bd4982318b9645f6de6867b841741", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1d4bd4982318b9645f6de6867b841741");
            return;
        }
        this.componentName = str;
        this.logoutScene = LogoutScene.LOGOUT_TYPE_KNB;
        this.extraInfo = kNBData;
        this.extraInfo.map = hashMap;
    }

    public LogoutInfo(@NonNull String str, @NonNull MMPData mMPData, @Nullable HashMap<String, String> hashMap) {
        Object[] objArr = {str, mMPData, hashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2349c24ce3bf026c19983791cb6a72a7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2349c24ce3bf026c19983791cb6a72a7");
            return;
        }
        this.componentName = str;
        this.logoutScene = LogoutScene.LOGOUT_TYPE_MMP;
        this.extraInfo = mMPData;
        this.extraInfo.map = hashMap;
    }

    public LogoutInfo(@NonNull String str, @NonNull MRNData mRNData, @Nullable HashMap<String, String> hashMap) {
        Object[] objArr = {str, mRNData, hashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c970bad0791dadc552ffdc9aeadff7df", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c970bad0791dadc552ffdc9aeadff7df");
            return;
        }
        this.componentName = str;
        this.logoutScene = LogoutScene.LOGOUT_TYPE_MRN;
        this.extraInfo = mRNData;
        this.extraInfo.map = hashMap;
    }

    public LogoutInfo(@NonNull String str, @Nullable HashMap<String, String> hashMap) {
        Object[] objArr = {str, hashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b7e8d777dde2817d6f4208a2fc3a5ca3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b7e8d777dde2817d6f4208a2fc3a5ca3");
            return;
        }
        this.componentName = str;
        this.logoutScene = LogoutScene.LOGOUT_TYPE_DEBUG;
        this.extraInfo = new DebugData("switch env");
        this.extraInfo.map = hashMap;
    }

    public LogoutInfo(@NonNull String str, @NonNull DefaultData defaultData, @Nullable HashMap<String, String> hashMap) {
        Object[] objArr = {str, defaultData, hashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "18f5f90651840a4d21f51b7837ec8a3e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "18f5f90651840a4d21f51b7837ec8a3e");
            return;
        }
        this.componentName = str;
        this.logoutScene = LogoutScene.LOGOUT_TYPE_OTHER;
        this.extraInfo = defaultData;
        this.extraInfo.map = hashMap;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class NativeUrlData extends BaseLogoutData {
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // com.meituan.passport.pojo.LogoutInfo.BaseLogoutData, android.os.Parcelable
        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        @Override // com.meituan.passport.pojo.LogoutInfo.BaseLogoutData
        public /* bridge */ /* synthetic */ String toString() {
            return super.toString();
        }

        @Override // com.meituan.passport.pojo.LogoutInfo.BaseLogoutData, android.os.Parcelable
        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
        }

        public NativeUrlData(String str, int i) {
            super();
            Object[] objArr = {str, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "308e3c3488b4a2edbce654b2e306ac28", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "308e3c3488b4a2edbce654b2e306ac28");
                return;
            }
            ((BaseLogoutData) this).nativeUrl = str;
            ((BaseLogoutData) this).nativeCode = i;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class KNBData extends BaseLogoutData {
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // com.meituan.passport.pojo.LogoutInfo.BaseLogoutData, android.os.Parcelable
        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        @Override // com.meituan.passport.pojo.LogoutInfo.BaseLogoutData
        public /* bridge */ /* synthetic */ String toString() {
            return super.toString();
        }

        @Override // com.meituan.passport.pojo.LogoutInfo.BaseLogoutData, android.os.Parcelable
        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
        }

        public KNBData(String str) {
            super();
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "02766b5c35bccee83b55aed8756e0d22", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "02766b5c35bccee83b55aed8756e0d22");
            } else {
                ((BaseLogoutData) this).knbUrl = str;
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class MMPData extends BaseLogoutData {
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // com.meituan.passport.pojo.LogoutInfo.BaseLogoutData, android.os.Parcelable
        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        @Override // com.meituan.passport.pojo.LogoutInfo.BaseLogoutData
        public /* bridge */ /* synthetic */ String toString() {
            return super.toString();
        }

        @Override // com.meituan.passport.pojo.LogoutInfo.BaseLogoutData, android.os.Parcelable
        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
        }

        public MMPData(String str, String str2) {
            super();
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4f68776c006c243b882f43e8de5b2a60", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4f68776c006c243b882f43e8de5b2a60");
                return;
            }
            ((BaseLogoutData) this).mmpId = str;
            ((BaseLogoutData) this).mmpPath = str2;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class MRNData extends BaseLogoutData {
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // com.meituan.passport.pojo.LogoutInfo.BaseLogoutData, android.os.Parcelable
        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        @Override // com.meituan.passport.pojo.LogoutInfo.BaseLogoutData
        public /* bridge */ /* synthetic */ String toString() {
            return super.toString();
        }

        @Override // com.meituan.passport.pojo.LogoutInfo.BaseLogoutData, android.os.Parcelable
        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
        }

        public MRNData(String str, String str2) {
            super();
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a34fb2fc6c1b0cb0dfcd8aea123a8195", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a34fb2fc6c1b0cb0dfcd8aea123a8195");
                return;
            }
            ((BaseLogoutData) this).bundleName = str;
            ((BaseLogoutData) this).mrnUrl = str2;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class DebugData extends BaseLogoutData {
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // com.meituan.passport.pojo.LogoutInfo.BaseLogoutData, android.os.Parcelable
        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        @Override // com.meituan.passport.pojo.LogoutInfo.BaseLogoutData
        public /* bridge */ /* synthetic */ String toString() {
            return super.toString();
        }

        @Override // com.meituan.passport.pojo.LogoutInfo.BaseLogoutData, android.os.Parcelable
        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
        }

        public DebugData(String str) {
            super();
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c705bc4f253501f56b77a0353d9d9dbf", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c705bc4f253501f56b77a0353d9d9dbf");
            } else {
                ((BaseLogoutData) this).debugInfo = str;
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class DefaultData extends BaseLogoutData {
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // com.meituan.passport.pojo.LogoutInfo.BaseLogoutData, android.os.Parcelable
        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        @Override // com.meituan.passport.pojo.LogoutInfo.BaseLogoutData
        public /* bridge */ /* synthetic */ String toString() {
            return super.toString();
        }

        @Override // com.meituan.passport.pojo.LogoutInfo.BaseLogoutData, android.os.Parcelable
        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
        }

        public DefaultData(String str) {
            super();
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9dab5bb45db5052592b1e96173553218", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9dab5bb45db5052592b1e96173553218");
            } else {
                ((BaseLogoutData) this).defaultInfo = str;
            }
        }
    }

    public LogoutInfo(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7bf7459357f74c870c1da81fbc9f2acf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7bf7459357f74c870c1da81fbc9f2acf");
            return;
        }
        this.componentName = parcel.readString();
        this.logoutScene = (LogoutScene) parcel.readParcelable(LogoutScene.class.getClassLoader());
        this.extraInfo = (BaseLogoutData) parcel.readParcelable(BaseLogoutData.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1ce3201c165a132e49c99635bc4dfaf6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1ce3201c165a132e49c99635bc4dfaf6");
            return;
        }
        parcel.writeString(this.componentName);
        parcel.writeParcelable(this.logoutScene, i);
        parcel.writeParcelable(this.extraInfo, i);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class BaseLogoutData implements Parcelable {
        public static final Parcelable.Creator<BaseLogoutData> CREATOR = new Parcelable.Creator<BaseLogoutData>() { // from class: com.meituan.passport.pojo.LogoutInfo.BaseLogoutData.1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BaseLogoutData createFromParcel(Parcel parcel) {
                Object[] objArr = {parcel};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d23a51ec8d5e8b26d4023d0297acbc9a", RobustBitConfig.DEFAULT_VALUE) ? (BaseLogoutData) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d23a51ec8d5e8b26d4023d0297acbc9a") : new BaseLogoutData(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BaseLogoutData[] newArray(int i) {
                return new BaseLogoutData[i];
            }
        };
        public static ChangeQuickRedirect changeQuickRedirect;
        private String bundleName;
        private String debugInfo;
        private String defaultInfo;
        private String knbUrl;
        private HashMap map;
        private String mmpId;
        private String mmpPath;
        private String mrnUrl;
        private int nativeCode;
        private String nativeUrl;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public BaseLogoutData(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a4a460c6e11d364601a7357cb6aa4131", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a4a460c6e11d364601a7357cb6aa4131");
                return;
            }
            this.nativeUrl = parcel.readString();
            this.nativeCode = parcel.readInt();
            this.knbUrl = parcel.readString();
            this.mmpId = parcel.readString();
            this.mmpPath = parcel.readString();
            this.bundleName = parcel.readString();
            this.mrnUrl = parcel.readString();
            this.debugInfo = parcel.readString();
            this.defaultInfo = parcel.readString();
            this.map = parcel.readHashMap(HashMap.class.getClassLoader());
        }

        public BaseLogoutData() {
        }

        public String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2066ad688dede60bc2ef2a71cf4c3126", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2066ad688dede60bc2ef2a71cf4c3126");
            }
            JSONObject jSONObject = new JSONObject();
            try {
                if (!TextUtils.isEmpty(this.nativeUrl)) {
                    jSONObject.put("nativeUrl", this.nativeUrl);
                    jSONObject.put("nativeCode", this.nativeCode);
                }
                if (!TextUtils.isEmpty(this.knbUrl)) {
                    jSONObject.put("knbUrl", this.knbUrl);
                }
                if (!TextUtils.isEmpty(this.mmpId)) {
                    jSONObject.put("mmpId", this.mmpId);
                }
                if (!TextUtils.isEmpty(this.mmpPath)) {
                    jSONObject.put("mmpPath", this.mmpPath);
                }
                if (!TextUtils.isEmpty(this.bundleName)) {
                    jSONObject.put(Constants.ModelBeanConstants.KEY_BUNDLE_NAME, this.bundleName);
                }
                if (!TextUtils.isEmpty(this.mrnUrl)) {
                    jSONObject.put("mrnUrl", this.mrnUrl);
                }
                if (!TextUtils.isEmpty(this.debugInfo)) {
                    jSONObject.put("debugInfo", this.debugInfo);
                }
                if (!TextUtils.isEmpty(this.defaultInfo)) {
                    jSONObject.put("defaultInfo", this.defaultInfo);
                }
                if (this.map != null) {
                    jSONObject.put("extraMap", this.map.toString());
                }
            } catch (Exception unused) {
            }
            return jSONObject.toString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            Object[] objArr = {parcel, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b8891a30a4e89ee6c1906869019f75ad", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b8891a30a4e89ee6c1906869019f75ad");
                return;
            }
            parcel.writeString(this.nativeUrl);
            parcel.writeInt(this.nativeCode);
            parcel.writeString(this.knbUrl);
            parcel.writeString(this.mmpId);
            parcel.writeString(this.mmpPath);
            parcel.writeString(this.bundleName);
            parcel.writeString(this.mrnUrl);
            parcel.writeString(this.debugInfo);
            parcel.writeString(this.defaultInfo);
            parcel.writeMap(this.map);
        }
    }
}
