package com.meituan.android.loader.impl.bean;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class DynLocalContainerBean implements Cloneable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public List<DynLocalFileBean> dynLocalFileBeanList;
    public boolean enableDevEnviroment;
    public String versionName;

    public DynLocalContainerBean(List<DynLocalFileBean> list, boolean z, String str) {
        Object[] objArr = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "63e6bb42e588692773a074f4a5d0e046", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "63e6bb42e588692773a074f4a5d0e046");
            return;
        }
        this.dynLocalFileBeanList = list;
        this.enableDevEnviroment = z;
        this.versionName = str;
    }

    public List<DynLocalFileBean> getDynLocalFileBeanList() {
        return this.dynLocalFileBeanList;
    }

    public boolean isEnableDevEnviroment() {
        return this.enableDevEnviroment;
    }

    public String getVersionName() {
        return this.versionName;
    }
}
