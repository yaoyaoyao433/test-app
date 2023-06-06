package com.meituan.msi.api.event;

import com.google.gson.JsonObject;
import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class PublishResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    public JsonObject data;
    public String eventName;
    public String scope;
}
