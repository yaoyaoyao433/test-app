package com.meituan.msi.api.schema;

import com.google.gson.JsonElement;
import com.meituan.msi.annotations.MsiParamChecker;
import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class OpenLinkParam {
    public static ChangeQuickRedirect changeQuickRedirect;
    public boolean enableExtra = false;
    public JsonElement extraData;
    public Boolean needResult;
    @MsiParamChecker(required = true)
    public String url;
}
