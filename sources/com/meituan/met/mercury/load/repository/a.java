package com.meituan.met.mercury.load.repository;

import com.meituan.met.mercury.load.bean.BundleData;
import com.meituan.met.mercury.load.core.DDLoadParams;
import com.meituan.met.mercury.load.core.DDLoadStrategy;
import com.meituan.met.mercury.load.core.n;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a extends BaseLoadRequest {
    public BundleData a;

    public a(String str, BundleData bundleData, DDLoadParams dDLoadParams, n nVar) {
        super(str, DDLoadStrategy.LOCAL_DOWNLOAD, dDLoadParams, nVar);
        this.a = bundleData;
    }
}
