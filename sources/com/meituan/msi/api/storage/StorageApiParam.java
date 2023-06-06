package com.meituan.msi.api.storage;

import com.google.gson.JsonElement;
import com.meituan.msi.annotations.MsiParamChecker;
import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class StorageApiParam {
    public static ChangeQuickRedirect changeQuickRedirect;
    public JsonElement data;
    @MsiParamChecker(required = true)
    public String key;
}
