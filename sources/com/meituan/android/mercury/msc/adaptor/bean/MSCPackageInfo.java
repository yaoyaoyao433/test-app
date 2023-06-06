package com.meituan.android.mercury.msc.adaptor.bean;

import android.support.annotation.Keep;
import com.meituan.met.mercury.load.bean.BundleData;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class MSCPackageInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    private BundleData ddd;
    private String name;
    private String root;

    public void setRoot(String str) {
        this.root = str;
    }

    public String getRoot() {
        return this.root;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String getName() {
        return this.name;
    }

    public void setDdd(BundleData bundleData) {
        this.ddd = bundleData;
    }

    public BundleData getDdd() {
        return this.ddd;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "79a563e65c09cda35b0fe55ee1e26134", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "79a563e65c09cda35b0fe55ee1e26134");
        }
        return "MSCPackageInfo{root='" + this.root + "', name='" + this.name + "', ddd=" + this.ddd + '}';
    }
}
