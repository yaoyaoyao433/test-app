package com.meituan.msi.api.websocket;

import com.meituan.msi.annotations.MsiParamChecker;
import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class SendParam {
    public static ChangeQuickRedirect changeQuickRedirect;
    @MsiParamChecker(required = true)
    public String data;
    public String type;
}
