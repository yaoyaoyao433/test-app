package com.coloros.ocs.base.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.coloros.ocs.base.internal.safeparcel.AbstractSafeParcelable;
import com.huawei.hms.adapter.internal.CommonCode;
import java.util.Arrays;
/* loaded from: classes.dex */
public class Status extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new c();
    private int a;
    private int b;
    private String c;
    private PendingIntent d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Status(int i, int i2, String str, PendingIntent pendingIntent) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = pendingIntent;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), this.c, this.d});
    }

    public String toString() {
        return com.coloros.ocs.base.a.c.a(this).a("statusCode", this.c != null ? this.c : com.coloros.ocs.base.common.constant.a.a(this.b)).a(CommonCode.MapKey.HAS_RESOLUTION, this.d).toString();
    }

    public boolean equals(Object obj) {
        if (obj instanceof Status) {
            Status status = (Status) obj;
            if (this.a == status.a && this.b == status.b && com.coloros.ocs.base.a.c.a(this.c, status.c) && com.coloros.ocs.base.a.c.a(this.d, status.d)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int b = com.coloros.ocs.base.internal.safeparcel.b.b(parcel, 20293);
        com.coloros.ocs.base.internal.safeparcel.b.a(parcel, 1, this.b);
        com.coloros.ocs.base.internal.safeparcel.b.a(parcel, 1000, this.a);
        String str = this.c;
        if (str != null) {
            int b2 = com.coloros.ocs.base.internal.safeparcel.b.b(parcel, 2);
            parcel.writeString(str);
            com.coloros.ocs.base.internal.safeparcel.b.a(parcel, b2);
        }
        PendingIntent pendingIntent = this.d;
        if (pendingIntent != null) {
            int b3 = com.coloros.ocs.base.internal.safeparcel.b.b(parcel, 3);
            pendingIntent.writeToParcel(parcel, i);
            com.coloros.ocs.base.internal.safeparcel.b.a(parcel, b3);
        }
        com.coloros.ocs.base.internal.safeparcel.b.a(parcel, b);
    }
}
