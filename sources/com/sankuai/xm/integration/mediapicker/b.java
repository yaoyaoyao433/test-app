package com.sankuai.xm.integration.mediapicker;

import android.content.Context;
import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.callback.Callback;
import com.sankuai.xm.base.service.m;
import com.sankuai.xm.base.util.ad;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private final a b;
    private Context c;

    private b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78e69a1c9fe53f94f912e597e71f8b5a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78e69a1c9fe53f94f912e597e71f8b5a");
            return;
        }
        this.b = new a();
        this.c = context;
    }

    public final b a(int i) {
        this.b.a = 9;
        return this;
    }

    public final b b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2248fb0d6cd54221b23d4b0a4d0f788", 6917529027641081856L)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2248fb0d6cd54221b23d4b0a4d0f788");
        }
        this.b.e = i & 3;
        return this;
    }

    public final void a(Callback<List<MediaResult>> callback) {
        Object[] objArr = {callback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e11e992e1b94e90a2b9f97a6bf64cb27", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e11e992e1b94e90a2b9f97a6bf64cb27");
            return;
        }
        IMediaPicker iMediaPicker = (IMediaPicker) m.a(IMediaPicker.class);
        if (iMediaPicker == null) {
            iMediaPicker = (IMediaPicker) m.a(IMediaPicker.class);
        }
        if (iMediaPicker != null) {
            iMediaPicker.a(this.c, this.b, callback);
            return;
        }
        com.sankuai.xm.log.c.c("MediaPickerBuilder", "pick:: image picker proxy is not available.", new Object[0]);
        ad.a(this.c, (int) R.string.xm_sdk_image_pick_no_service);
    }

    public static b a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3be7d475de6db0567648021e5f58f22d", 6917529027641081856L) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3be7d475de6db0567648021e5f58f22d") : new b(context);
    }
}
