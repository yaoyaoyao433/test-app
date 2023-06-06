package com.sankuai.waimai.ugc.creator.utils;

import android.support.annotation.Nullable;
import com.meituan.android.cipstorage.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class l {
    public static ChangeQuickRedirect a;

    @Nullable
    public static File a(String str, boolean z) {
        Object[] objArr = {str, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7ab1f385c584dc39a75e64335249f849", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7ab1f385c584dc39a75e64335249f849");
        }
        try {
            File b = q.b(b.a, "wm_ugc_creator", str);
            if (b != null && !b.exists()) {
                File parentFile = b.getParentFile();
                if (parentFile == null) {
                    return null;
                }
                if (!parentFile.exists()) {
                    parentFile.mkdirs();
                }
                b.createNewFile();
            }
            return b;
        } catch (Exception unused) {
            return null;
        }
    }
}
