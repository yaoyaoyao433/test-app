package com.meituan.android.common.fingerprint.utils;

import android.content.Context;
import com.meituan.android.common.fingerprint.info.HashInfoWithNumber;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class AudioHashUtils {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static HashInfoWithNumber getAudioHashList(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "556ef8876bcf61e215496f13d7e3a6a9", 6917529027641081856L) ? (HashInfoWithNumber) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "556ef8876bcf61e215496f13d7e3a6a9") : new HashInfoWithNumber(new ArrayList(), 0);
    }
}
