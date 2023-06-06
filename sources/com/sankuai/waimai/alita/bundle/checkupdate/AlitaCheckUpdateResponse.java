package com.sankuai.waimai.alita.bundle.checkupdate;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.bundle.download.update.BundleInfo;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class AlitaCheckUpdateResponse implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public a body;
    public int code;
    public String msg;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a implements Serializable {
        public static ChangeQuickRedirect a;
        @SerializedName("bundles")
        public List<BundleInfo> b;

        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e710c19fa2ceb3e2ebbe925596949023", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e710c19fa2ceb3e2ebbe925596949023");
            }
            return "Body{mBundleList=" + this.b + '}';
        }
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a461b6a1413e73e83e290cb26e32913e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a461b6a1413e73e83e290cb26e32913e");
        }
        return "AlitaCheckUpdateResponse{code=" + this.code + ", msg='" + this.msg + "', body=" + this.body + '}';
    }
}
