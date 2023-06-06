package com.meituan.android.common.dfingerprint.store;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public class BioSharedPref extends BaseSharedPref {
    public static final String BIO_COLLECT_CURRENTTIMEMILLIS = "bio_collect_current_time_millis";
    public static final String BIO_COLLECT_INDEX = "bio_collect_index";
    public static final String BIO_COLLECT_MTX_KEY = "bio_collect_mtx";
    public static final String FIRST_PROCESS_BOOT_TIME_KEY = "first_process_boot_time";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static BioSharedPref instance;

    public BioSharedPref(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "532a6cfc0aad3a37c6e68ec50d0a44c5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "532a6cfc0aad3a37c6e68ec50d0a44c5");
        }
    }

    public static BioSharedPref getInstance(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "dc7fee353e6e537cfbf08dcc5d91b6b0", RobustBitConfig.DEFAULT_VALUE)) {
            return (BioSharedPref) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "dc7fee353e6e537cfbf08dcc5d91b6b0");
        }
        if (instance == null) {
            synchronized (BioSharedPref.class) {
                if (instance == null) {
                    instance = new BioSharedPref(context);
                }
            }
        }
        return instance;
    }
}
