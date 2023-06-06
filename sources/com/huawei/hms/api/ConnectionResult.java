package com.huawei.hms.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.internal.Objects;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.meituan.robust.common.CommonConstant;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class ConnectionResult implements Parcelable {
    public static final int API_UNAVAILABLE = 1000;
    public static final int BINDFAIL_RESOLUTION_BACKGROUND = 7;
    public static final int BINDFAIL_RESOLUTION_REQUIRED = 6;
    public static final int CANCELED = 13;
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new a();
    public static final int DEVELOPER_ERROR = 10;
    public static final int DRIVE_EXTERNAL_STORAGE_REQUIRED = 9002;
    public static final int INTERNAL_ERROR = 8;
    public static final int INTERRUPTED = 15;
    public static final int INVALID_ACCOUNT = 5;
    public static final int LICENSE_CHECK_FAILED = 11;
    public static final int NETWORK_ERROR = 9000;
    public static final int RESOLUTION_REQUIRED = 9001;
    public static final int RESTRICTED_PROFILE = 9003;
    public static final int SERVICE_DISABLED = 3;
    public static final int SERVICE_INVALID = 9;
    public static final int SERVICE_MISSING = 1;
    public static final int SERVICE_MISSING_PERMISSION = 19;
    public static final int SERVICE_UNSUPPORTED = 21;
    public static final int SERVICE_UPDATING = 9004;
    public static final int SERVICE_VERSION_UPDATE_REQUIRED = 2;
    public static final int SIGN_IN_FAILED = 9005;
    public static final int SIGN_IN_REQUIRED = 4;
    public static final int SUCCESS = 0;
    public static final int TIMEOUT = 14;
    private int a;
    private PendingIntent b;
    private String c;
    private int d;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static final class a implements Parcelable.Creator<ConnectionResult> {
        a() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConnectionResult createFromParcel(Parcel parcel) {
            return new ConnectionResult(parcel, (a) null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConnectionResult[] newArray(int i) {
            return new ConnectionResult[i];
        }
    }

    /* synthetic */ ConnectionResult(Parcel parcel, a aVar) {
        this(parcel);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(int i) {
        switch (i) {
            case -1:
                return GrsBaseInfo.CountryCodeSource.UNKNOWN;
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
            case 5:
            case 12:
            case 15:
            case 16:
            case 17:
            case 18:
            case 20:
            default:
                return "UNKNOWN_ERROR_CODE(" + i + CommonConstant.Symbol.BRACKET_RIGHT;
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            case 13:
                return "CANCELED";
            case 14:
                return "TIMEOUT";
            case 19:
                return "SERVICE_MISSING_PERMISSION";
            case 21:
                return "API_VERSION_UPDATE_REQUIRED";
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ConnectionResult) {
            try {
                if (this.a == ((ConnectionResult) obj).a && this.d == ((ConnectionResult) obj).d && this.c.equals(((ConnectionResult) obj).c)) {
                    if (this.b.equals(((ConnectionResult) obj).b)) {
                        return true;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public final int getErrorCode() {
        return this.d;
    }

    public final String getErrorMessage() {
        return this.c;
    }

    public final PendingIntent getResolution() {
        return this.b;
    }

    public final boolean hasResolution() {
        return HuaweiApiAvailability.getInstance().isUserResolvableError(this.d, this.b);
    }

    public final int hashCode() {
        return Objects.hashCode(Long.valueOf(this.a), Long.valueOf(getErrorCode()), getErrorMessage(), this.b);
    }

    public final boolean isSuccess() {
        return this.d == 0;
    }

    public final void startResolutionForResult(Activity activity, int i) throws IntentSender.SendIntentException {
        if (hasResolution()) {
            HuaweiApiAvailability.getInstance().resolveError(activity, this.d, i, this.b);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.d);
        parcel.writeString(this.c);
        this.b.writeToParcel(parcel, i);
    }

    ConnectionResult(int i, int i2, PendingIntent pendingIntent, String str) {
        this.a = 1;
        this.b = null;
        this.c = null;
        this.a = i;
        this.d = i2;
        this.b = pendingIntent;
        this.c = str;
    }

    public ConnectionResult(int i) {
        this(i, (PendingIntent) null);
    }

    public ConnectionResult(int i, PendingIntent pendingIntent) {
        this(i, pendingIntent, null);
    }

    public ConnectionResult(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str);
    }

    private ConnectionResult(Parcel parcel) {
        this.a = 1;
        this.b = null;
        this.c = null;
        this.a = parcel.readInt();
        this.d = parcel.readInt();
        this.c = parcel.readString();
        Parcelable parcelable = (Parcelable) PendingIntent.CREATOR.createFromParcel(parcel);
        if (parcelable != null) {
            this.b = (PendingIntent) parcelable;
        }
    }
}
