package com.meituan.android.paybase.downgrading;

import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class Downgrading implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -3098738637616708612L;
    private String jsonParam;
    private String name;
    private String strategy;

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String getStrategy() {
        return this.strategy;
    }

    public void setStrategy(String str) {
        this.strategy = str;
    }

    public String getJsonParam() {
        return this.jsonParam;
    }

    public void setJsonParam(String str) {
        this.jsonParam = str;
    }
}
