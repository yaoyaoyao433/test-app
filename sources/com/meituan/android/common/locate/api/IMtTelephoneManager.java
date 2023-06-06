package com.meituan.android.common.locate.api;

import android.telephony.CellInfo;
import android.telephony.CellLocation;
import java.util.List;
@Deprecated
/* loaded from: classes2.dex */
public interface IMtTelephoneManager {
    @Deprecated
    List<CellInfo> getAllCellInfo(long j);

    @Deprecated
    CellLocation getCellLocation(long j);
}
