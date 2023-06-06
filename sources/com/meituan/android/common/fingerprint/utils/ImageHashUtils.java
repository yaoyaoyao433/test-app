package com.meituan.android.common.fingerprint.utils;

import android.content.Context;
import com.meituan.android.common.fingerprint.info.HashInfoWithNumber;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ImageHashUtils {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static HashInfoWithNumber getImageHashList(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "37d9326569423d5ddba08a6814506bda", 6917529027641081856L) ? (HashInfoWithNumber) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "37d9326569423d5ddba08a6814506bda") : new HashInfoWithNumber(new ArrayList(), 0);
    }
}
