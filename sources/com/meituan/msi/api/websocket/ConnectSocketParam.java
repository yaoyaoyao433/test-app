package com.meituan.msi.api.websocket;

import com.meituan.msi.annotations.MsiParamChecker;
import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class ConnectSocketParam {
    public static ChangeQuickRedirect changeQuickRedirect;
    public Map<String, String> header;
    public List<String> protocols;
    @MsiParamChecker(required = true)
    public String url;
}
