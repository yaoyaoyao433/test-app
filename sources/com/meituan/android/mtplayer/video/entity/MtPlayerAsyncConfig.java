package com.meituan.android.mtplayer.video.entity;

import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashSet;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class MtPlayerAsyncConfig {
    public static ChangeQuickRedirect changeQuickRedirect;
    public List<String> asyncModeBusiness;
    public boolean asyncModeEnabled;
    @NonNull
    public final transient HashSet<String> businessSet;

    public MtPlayerAsyncConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "00ba796df10eac41e910ee4a106d628f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "00ba796df10eac41e910ee4a106d628f");
        } else {
            this.businessSet = new HashSet<>();
        }
    }

    public void init() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "63e8b7941aae4b072124f422b1bc1093", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "63e8b7941aae4b072124f422b1bc1093");
        } else if (this.asyncModeBusiness != null) {
            this.businessSet.addAll(this.asyncModeBusiness);
        }
    }
}
