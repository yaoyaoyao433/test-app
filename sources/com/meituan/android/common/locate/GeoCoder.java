package com.meituan.android.common.locate;

import android.location.Location;
import java.io.IOException;
/* loaded from: classes2.dex */
public interface GeoCoder {
    @Deprecated
    AddressResult getAddress(Location location) throws IOException;

    AddressResult getAddress(MtLocation mtLocation) throws IOException;
}
