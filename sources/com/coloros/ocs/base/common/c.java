package com.coloros.ocs.base.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.internal.view.SupportMenu;
import com.coloros.ocs.base.internal.safeparcel.a;
/* loaded from: classes.dex */
public final class c implements Parcelable.Creator<Status> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Status[] newArray(int i) {
        return new Status[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Status createFromParcel(Parcel parcel) {
        Parcelable parcelable;
        int readInt = parcel.readInt();
        int b = com.coloros.ocs.base.internal.safeparcel.a.b(parcel, readInt);
        int dataPosition = parcel.dataPosition();
        if ((readInt & SupportMenu.USER_MASK) != 20293) {
            throw new a.C0049a("Expected object header. Got 0x" + Integer.toHexString(readInt));
        }
        int i = b + dataPosition;
        if (i >= dataPosition && i <= parcel.dataSize()) {
            int i2 = 0;
            String str = null;
            PendingIntent pendingIntent = null;
            int i3 = 0;
            while (parcel.dataPosition() < i) {
                int readInt2 = parcel.readInt();
                int i4 = readInt2 & SupportMenu.USER_MASK;
                if (i4 != 1000) {
                    switch (i4) {
                        case 1:
                            i3 = com.coloros.ocs.base.internal.safeparcel.a.a(parcel, readInt2);
                            continue;
                        case 2:
                            int b2 = com.coloros.ocs.base.internal.safeparcel.a.b(parcel, readInt2);
                            int dataPosition2 = parcel.dataPosition();
                            if (b2 == 0) {
                                str = null;
                                break;
                            } else {
                                String readString = parcel.readString();
                                parcel.setDataPosition(dataPosition2 + b2);
                                str = readString;
                                continue;
                            }
                        case 3:
                            Parcelable.Creator creator = PendingIntent.CREATOR;
                            int b3 = com.coloros.ocs.base.internal.safeparcel.a.b(parcel, readInt2);
                            int dataPosition3 = parcel.dataPosition();
                            if (b3 == 0) {
                                parcelable = null;
                            } else {
                                parcelable = (Parcelable) creator.createFromParcel(parcel);
                                parcel.setDataPosition(dataPosition3 + b3);
                            }
                            pendingIntent = (PendingIntent) parcelable;
                            continue;
                        default:
                            parcel.setDataPosition(parcel.dataPosition() + com.coloros.ocs.base.internal.safeparcel.a.b(parcel, readInt2));
                            continue;
                    }
                } else {
                    i2 = com.coloros.ocs.base.internal.safeparcel.a.a(parcel, readInt2);
                }
            }
            if (parcel.dataPosition() != i) {
                throw new a.C0049a("Overread allowed size end=".concat(String.valueOf(i)));
            }
            return new Status(i2, i3, str, pendingIntent);
        }
        throw new a.C0049a("Size read is invalid start=" + dataPosition + " end=" + i);
    }
}
