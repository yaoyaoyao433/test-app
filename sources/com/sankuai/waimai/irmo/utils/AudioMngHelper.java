package com.sankuai.waimai.irmo.utils;

import android.content.Context;
import android.media.AudioManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class AudioMngHelper {
    public static ChangeQuickRedirect a;
    public AudioManager b;
    public int c;
    private final String d;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface TYPE {
    }

    public AudioMngHelper(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4e934738881fe780b4ce7af5fae0f20", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4e934738881fe780b4ce7af5fae0f20");
            return;
        }
        this.d = "AudioMngHelper";
        this.c = 3;
        this.b = (AudioManager) context.getSystemService("audio");
    }
}
