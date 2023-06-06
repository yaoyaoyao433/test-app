package com.sankuai.waimai.monitor.model;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class NativeParamsInfo extends CommonParamsInfo implements Serializable {
    public static String NAME = "NativeParamsInfo";
    public static ChangeQuickRedirect changeQuickRedirect;
    private String componentLibrary;
    private String componentName;
    private String errorPage;
    private String pageName;
    private String scheme;
    private String snifferBusiness;
    private String snifferModule;

    public NativeParamsInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "516248a49fbd5048818d12c1e1167c34", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "516248a49fbd5048818d12c1e1167c34");
        } else {
            setPageType("native");
        }
    }

    public String getPageName() {
        return this.pageName;
    }

    public void setPageName(String str) {
        this.pageName = str;
    }

    public String getComponentName() {
        return this.componentName;
    }

    public void setComponentName(String str) {
        this.componentName = str;
    }

    public String getErrorPage() {
        return this.errorPage;
    }

    public void setErrorPage(String str) {
        this.errorPage = str;
    }

    public String getComponentLibrary() {
        return this.componentLibrary;
    }

    public void setComponentLibrary(String str) {
        this.componentLibrary = str;
    }

    public String getScheme() {
        return this.scheme;
    }

    public void setScheme(String str) {
        this.scheme = str;
    }

    public String getSnifferBusiness() {
        return this.snifferBusiness;
    }

    public void setSnifferBusiness(String str) {
        this.snifferBusiness = str;
    }

    public String getSnifferModule() {
        return this.snifferModule;
    }

    public void setSnifferModule(String str) {
        this.snifferModule = str;
    }
}
