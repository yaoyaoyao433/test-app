package com.meituan.android.common.unionid.oneid.cache;

import android.content.Context;
import com.meituan.android.cipstorage.q;
import com.meituan.android.cipstorage.u;
import com.meituan.android.cipstorage.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CIPStorageManager {
    public static final String ONE_ID_CIPS_CHANNEL_NAME = "oneid_shared_oneid";
    private static final String UIONID_COMMON_FILE_CONFIG = "unionid_common_file_config";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static x getApdater(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d233439e45b0dc2340d848f91ab42470", RobustBitConfig.DEFAULT_VALUE) ? (x) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d233439e45b0dc2340d848f91ab42470") : x.a(q.a(context, "oneid_shared_oneid", 2));
    }

    public static String getFromSdcardEncryptedFile(Context context, String str, String str2) {
        Object[] objArr = {context, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d6640efe1fcfb971a6498e4ad031965f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d6640efe1fcfb971a6498e4ad031965f");
        }
        File b = q.b(context, UIONID_COMMON_FILE_CONFIG, str2, u.e);
        if (b != null && !b.exists()) {
            b.getParentFile().mkdirs();
        }
        return b.getAbsolutePath();
    }

    public static File getUUIDFromSdcardEncryptedFile(Context context, String str, String str2) {
        Object[] objArr = {context, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a31aaa1b010eedd056f9a32dba64a823", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a31aaa1b010eedd056f9a32dba64a823");
        }
        try {
            File b = q.b(context, "oneid_shared_oneid", str2, u.e);
            if (b != null && !b.exists()) {
                b.getParentFile().mkdirs();
            }
            return b;
        } catch (Throwable unused) {
            return null;
        }
    }
}
