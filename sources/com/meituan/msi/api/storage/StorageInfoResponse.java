package com.meituan.msi.api.storage;

import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class StorageInfoResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    public long currentSize;
    public List<String> keys;
    public long limitSize;
}
