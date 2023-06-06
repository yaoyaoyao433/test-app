package com.meituan.msc.modules.update;

import com.meituan.msc.modules.update.bean.AppMetaInfoWrapper;
import com.meituan.msc.modules.update.bean.LaunchPageParams;
import com.meituan.msc.modules.update.bean.PackageInfoWrapper;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface c {
    com.meituan.msc.common.support.java.util.concurrent.a<AppMetaInfoWrapper> a(LaunchPageParams launchPageParams);

    void a(String str, i iVar);

    void a(List<PackageInfoWrapper> list, j jVar);
}
