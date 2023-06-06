package com.meituan.msi.api.extension.sgc.chat;

import com.meituan.msi.annotations.MsiParamChecker;
import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class OpenIMPageParam {
    public static ChangeQuickRedirect changeQuickRedirect;
    @MsiParamChecker(required = true)
    public int buzType;
    public Object extraInfo;
    public int form;
    @MsiParamChecker(required = true)
    public String poiID;
    @MsiParamChecker(required = true)
    public String poiIDStr;
    @MsiParamChecker(required = true)
    public int source;
    @MsiParamChecker(required = true)
    public String spuID;
}
