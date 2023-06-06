package com.meituan.android.cipstorage;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface ae {
    public static final ae a = new ae() { // from class: com.meituan.android.cipstorage.ae.1
        public static ChangeQuickRedirect b;

        @Override // com.meituan.android.cipstorage.ae
        public final long a(l lVar, File file) {
            Object[] objArr = {lVar, file};
            ChangeQuickRedirect changeQuickRedirect = b;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac14fb57c70b8075eda0e7be23239567", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac14fb57c70b8075eda0e7be23239567")).longValue() : MMKV.a(file).b();
        }
    };

    long a(l lVar, File file);
}
