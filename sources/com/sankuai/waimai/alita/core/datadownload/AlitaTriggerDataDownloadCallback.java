package com.sankuai.waimai.alita.core.datadownload;

import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class AlitaTriggerDataDownloadCallback {
    public static final AlitaTriggerDataDownloadCallback c = new AlitaTriggerDataDownloadCallback() { // from class: com.sankuai.waimai.alita.core.datadownload.AlitaTriggerDataDownloadCallback.1
        public static ChangeQuickRedirect a;

        @Override // com.sankuai.waimai.alita.core.datadownload.AlitaTriggerDataDownloadCallback
        public final c a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "778180707868fbb1e34f5c8911beeb52", RobustBitConfig.DEFAULT_VALUE)) {
                return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "778180707868fbb1e34f5c8911beeb52");
            }
            return c.a(i == 0).a();
        }
    };

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface TriggerType {
        public static final int APP_CHANGE_TO_FOREGROUND = 1;
        public static final int BIZ_REGISTER = 0;
    }

    @Nullable
    public abstract c a(int i);
}
