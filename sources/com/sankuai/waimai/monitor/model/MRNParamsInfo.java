package com.sankuai.waimai.monitor.model;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class MRNParamsInfo extends CommonParamsInfo {
    public static String NAME = "MRNParamsInfo";
    public static ChangeQuickRedirect changeQuickRedirect;
    private String bundleName;
    private String componentLibrary;
    private String componentName;
    private String snifferBusiness;
    private String snifferModule;

    public MRNParamsInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8553ff859516e67badb8942d50d5c9cb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8553ff859516e67badb8942d50d5c9cb");
        } else {
            setPageType("mrn");
        }
    }

    public String getBundleName() {
        return this.bundleName;
    }

    public void setBundleName(String str) {
        this.bundleName = str;
    }

    public String getComponentName() {
        return this.componentName;
    }

    public void setComponentName(String str) {
        this.componentName = str;
    }

    public String getComponentLibrary() {
        return this.componentLibrary;
    }

    public void setComponentLibrary(String str) {
        this.componentLibrary = str;
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
