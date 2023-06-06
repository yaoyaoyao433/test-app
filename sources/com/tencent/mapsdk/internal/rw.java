package com.tencent.mapsdk.internal;

import android.content.Context;
import android.view.ViewGroup;
import com.tencent.mapsdk.vector.VectorMap;
import com.tencent.tencentmap.mapsdk.maps.TencentMapOptions;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class rw extends so {
    public rw(Context context, TencentMapOptions tencentMapOptions, ViewGroup viewGroup) {
        super(context, tencentMapOptions, viewGroup);
    }

    @Override // com.tencent.mapsdk.internal.sw, com.tencent.mapsdk.internal.bo
    /* renamed from: a */
    public final VectorMap b(mn mnVar) {
        return new rv(mnVar);
    }
}
