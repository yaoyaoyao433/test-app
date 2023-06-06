package com.meituan.android.paybase.moduleinterface.picasso.coupondialog;

import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class DynamicLayout implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 1;
    private Object jsData;
    private String jsName;
    private String jsPath;

    public String getJsName() {
        return this.jsName;
    }

    public void setJsName(String str) {
        this.jsName = str;
    }

    public Object getJsData() {
        return this.jsData;
    }

    public void setJsData(Object obj) {
        this.jsData = obj;
    }

    public String getJsPath() {
        return this.jsPath;
    }

    public void setJsPath(String str) {
        this.jsPath = str;
    }
}
