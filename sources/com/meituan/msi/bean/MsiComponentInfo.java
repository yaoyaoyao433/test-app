package com.meituan.msi.bean;

import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MsiComponentInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String componentName;
    public Class<?> invokeParamType;
    public List<Param> paramList;
    public Class<?> propertyType;
    public String viewClassName;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class Param {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String paramName;
        public Class<?> paramType;
    }
}
