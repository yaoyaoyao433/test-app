package com.sankuai.waimai.mach.manager.download.update;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class UpdateResponse implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public Body body;
    public int code;
    public boolean isPartUpdate;
    public String msg;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class Body implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("bundles")
        private List<BundleInfo> mBundleList;

        public List<BundleInfo> getBundleList() {
            return this.mBundleList;
        }

        public void setBundleList(List<BundleInfo> list) {
            this.mBundleList = list;
        }
    }
}
