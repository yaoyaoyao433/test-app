package com.meituan.msi.api.extension;

import com.meituan.msi.annotations.MsiParamChecker;
import com.meituan.msi.annotations.MsiSupport;
import com.meituan.msi.bean.ContainerInfo;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class FloatViewParam {
    public static ChangeQuickRedirect changeQuickRedirect;
    @MsiParamChecker(in = {"mrn", ContainerInfo.ENV_MMP, "all"})
    public String type = "all";
}
