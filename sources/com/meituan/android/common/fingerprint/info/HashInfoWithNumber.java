package com.meituan.android.common.fingerprint.info;

import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HashInfoWithNumber {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final List<HashInfo> hashInfo;
    public final int number;

    public HashInfoWithNumber(List<HashInfo> list, int i) {
        this.hashInfo = list;
        this.number = i;
    }
}
