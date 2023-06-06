package com.sankuai.waimai.foundation.location;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.content.Loader;
import android.util.Pair;
import com.meituan.android.common.locate.MtLocation;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.foundation.location.v2.WmHistoryAddressList;
import com.sankuai.waimai.foundation.location.v2.k;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface b {
    Loader<MtLocation> a(Context context, long j, @Nullable k kVar);

    com.sankuai.waimai.foundation.location.locatesdk.b a(Context context, String str, c cVar);

    void a(double d, double d2);

    void a(int i, int i2, String str);

    void a(int i, String str, long j);

    void a(WMLocation wMLocation, String str);

    void a(WmHistoryAddressList.SimpleAddressItem simpleAddressItem);

    void a(String str, String str2);

    void a(String str, String str2, Pair... pairArr);

    void a(Throwable th);

    void a(List<String> list);

    boolean a(Context context);

    double[] a();

    void b();

    void c();
}
