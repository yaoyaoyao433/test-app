package com.meituan.android.common.weaver.interfaces.ffp;

import android.support.annotation.AnyThread;
import android.support.annotation.NonNull;
import com.meituan.android.common.weaver.interfaces.Weaver;
import com.meituan.android.common.weaver.interfaces.WeaverEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class FFPRecord {
    public static ChangeQuickRedirect changeQuickRedirect;

    @AnyThread
    public void record(@NonNull WeaverEvent weaverEvent) {
        Object[] objArr = {weaverEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6a05967030704b77b6a254fe5a046aaa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6a05967030704b77b6a254fe5a046aaa");
        } else {
            Weaver.getWeaver().weave(weaverEvent);
        }
    }
}
