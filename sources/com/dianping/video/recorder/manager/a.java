package com.dianping.video.recorder.manager;

import android.media.MediaCodec;
import android.support.annotation.RequiresApi;
import com.dianping.video.recorder.model.RecordSession;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
@RequiresApi(api = 18)
/* loaded from: classes.dex */
public class a {
    public static ChangeQuickRedirect a = null;
    public static final String b = "a";
    private int c;
    private List<RecordSession> d;
    private List<RecordSession> e;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c98e0deac9d2c3bf0ffe2ab5b7b30fd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c98e0deac9d2c3bf0ffe2ab5b7b30fd");
            return;
        }
        this.c = 90;
        this.d = new ArrayList();
        this.e = new ArrayList();
    }

    public static String a(MediaCodec.BufferInfo bufferInfo) {
        Object[] objArr = {bufferInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bec8fed8dddc954c2c9440fd24c2358d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bec8fed8dddc954c2c9440fd24c2358d");
        }
        return "size = " + bufferInfo.size + " ; flags = " + bufferInfo.flags + " ; offset = " + bufferInfo.offset + " ; presentationTimeUs = " + bufferInfo.presentationTimeUs;
    }
}
