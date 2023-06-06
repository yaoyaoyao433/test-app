package com.meituan.network.request;

import com.meituan.msi.annotations.MsiSupport;
import com.meituan.network.CommonProfile;
import com.meituan.network.SharkCommonProfile;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.Map;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class RequestResult {
    public static ChangeQuickRedirect changeQuickRedirect;
    public SharkCommonProfile _mt;
    public String[] cookies;
    public Object data;
    public Map<String, String> header;
    public CommonProfile profile;
    public int statusCode;
}
