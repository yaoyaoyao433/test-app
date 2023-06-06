package com.meituan.msi.api.sharedstorage;

import com.meituan.msi.annotations.MsiParamChecker;
import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class SharedStorageParam {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String data;
    public String key;
    @MsiParamChecker(max = 1, min = 0)
    public int level = 0;
}
