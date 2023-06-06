package com.meituan.android.common.locate.offline;

import android.content.Context;
import android.location.Location;
import okhttp3.OkHttpClient;
@Deprecated
/* loaded from: classes2.dex */
public interface IOfflineDataDownloader {
    void onLocationGot(Context context, OkHttpClient okHttpClient, Location location, String str);
}
