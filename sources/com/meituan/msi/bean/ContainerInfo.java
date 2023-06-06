package com.meituan.msi.bean;

import com.meituan.robust.ChangeQuickRedirect;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ContainerInfo {
    public static final String ENV_KNB = "titans";
    public static final String ENV_MMP = "mmp";
    public static final String ENV_MRN = "mrn";
    public static final String ENV_MSC = "msc";
    public static ChangeQuickRedirect changeQuickRedirect;
    public String containerId;
    public final String name;
    public final String version;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface ContainerName {
    }

    public ContainerInfo(String str, String str2, String str3) {
        this.version = str;
        this.name = str2;
        this.containerId = str3;
    }
}
