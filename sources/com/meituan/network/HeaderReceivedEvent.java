package com.meituan.network;

import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class HeaderReceivedEvent {
    public static ChangeQuickRedirect changeQuickRedirect;
    public List<String> cookies;
    public Map<String, String> header;
}
