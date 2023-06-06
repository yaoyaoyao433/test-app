package com.meituan.android.common.aidata.resources.downloader;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class DDResResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<PackageBean> mPackageBeanList;

    public DDResResponse() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5ad228ec21c30b8ea8d2c3856611674a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5ad228ec21c30b8ea8d2c3856611674a");
            return;
        }
        this.mPackageBeanList = null;
        this.mPackageBeanList = new ArrayList();
    }

    public void addResponseBean(PackageBean packageBean) {
        Object[] objArr = {packageBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c8894e1d90bd28209eaeb396b5fc29fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c8894e1d90bd28209eaeb396b5fc29fd");
        } else {
            this.mPackageBeanList.add(packageBean);
        }
    }

    public void addResponseBeanList(List<PackageBean> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "25ac179225c1174ba57bb08c2c3c0f2e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "25ac179225c1174ba57bb08c2c3c0f2e");
        } else {
            this.mPackageBeanList.addAll(list);
        }
    }

    public List<PackageBean> getResult() {
        return this.mPackageBeanList;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class PackageBean {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String mFileContent;
        public String mPackName;
        public String mPackVer;

        public PackageBean(String str, String str2, String str3) {
            Object[] objArr = {str, str2, str3};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3f0179b1d16d734fc3113f9f83610f69", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3f0179b1d16d734fc3113f9f83610f69");
                return;
            }
            this.mPackName = str;
            this.mPackVer = str2;
            this.mFileContent = str3;
        }

        public String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aa94e2d9ddff16ba9ad4f0bcfb026977", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aa94e2d9ddff16ba9ad4f0bcfb026977");
            }
            return "mPackName:" + this.mPackName + " mPackVer:" + this.mPackVer + " mFileContent:" + this.mFileContent;
        }
    }
}
