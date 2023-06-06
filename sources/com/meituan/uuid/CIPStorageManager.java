package com.meituan.uuid;

import android.content.Context;
import com.meituan.android.cipstorage.q;
import com.meituan.android.cipstorage.u;
import com.meituan.android.cipstorage.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class CIPStorageManager {
    private static final String CACHE_FILE_MIGRATE_COMPLETED = "uuid_cache_file_migrate_complete";
    public static final String ONE_ID_CIPS_CHANNEL_NAME = "oneid_shared_oneid";
    private static final String SDCARD_FILE_MIGRATE_COMPLETED = "uuid_sdcard_file_migrate_complete";
    private static final String UUID_COMMON_FILE_CONFIG = "uuid_common_file_config";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static x getApdater(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7c45a4cd90a9f713a5ece7be038d9c9e", 6917529027641081856L) ? (x) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7c45a4cd90a9f713a5ece7be038d9c9e") : x.a(q.a(context, "oneid_shared_oneid", 2));
    }

    public static File getFromSdcardEncryptedFile(Context context, String str, String str2) {
        Object[] objArr = {context, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7f0946afcec14401c3b022534ff2fc86", 6917529027641081856L)) {
            return (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7f0946afcec14401c3b022534ff2fc86");
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

    public static File requestFilePath(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1ca3aaaadf4abb702d8fff530fc75a98", 6917529027641081856L)) {
            return (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1ca3aaaadf4abb702d8fff530fc75a98");
        }
        File a = q.a(context, "oneid_shared_oneid", str, u.e);
        if (a != null && !a.exists()) {
            a.getParentFile().mkdirs();
        }
        return a;
    }
}
