package com.meituan.android.loader.impl.bean;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class DynLocalFileBean implements Cloneable {
    public static final int TYPE_ASSETS = 2;
    public static final int TYPE_SO = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    public String abi;
    public String bundleName;
    public String bundleVersion;
    public long fileSize;
    public String name;
    public String originMd5;
    public int type;

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9e2da6997f201d25f16e33b723c13422", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9e2da6997f201d25f16e33b723c13422");
        }
        return "DynLocalFileBean{bundleName='" + this.bundleName + "', name='" + this.name + "', originMd5='" + this.originMd5 + "', abi='" + this.abi + "', bundleVersion='" + this.bundleVersion + "', fileSize=" + this.fileSize + ", type=" + this.type + '}';
    }
}
