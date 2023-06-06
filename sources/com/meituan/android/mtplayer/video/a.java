package com.meituan.android.mtplayer.video;

import android.annotation.SuppressLint;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.LinkedHashSet;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static final a g = new a();
    AudioManager b;
    AudioFocusRequest c;
    AudioFocusRequest d;
    AudioAttributes e;
    Set<Integer> f;

    public static a a() {
        return g;
    }

    @SuppressLint({"NewApi"})
    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31d3f31af2f89a84e41dd771f721fa63", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31d3f31af2f89a84e41dd771f721fa63");
            return;
        }
        this.f = new LinkedHashSet();
        if (Build.VERSION.SDK_INT >= 26) {
            this.e = new AudioAttributes.Builder().setUsage(1).setContentType(2).build();
            this.c = new AudioFocusRequest.Builder(2).setAudioAttributes(this.e).build();
        }
    }
}
