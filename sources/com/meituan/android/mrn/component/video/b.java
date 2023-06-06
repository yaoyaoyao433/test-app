package com.meituan.android.mrn.component.video;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b extends FrameLayout implements com.meituan.android.mtplayer.video.callback.a {
    public static ChangeQuickRedirect a;
    private View b;

    @Override // com.meituan.android.mtplayer.video.callback.IPlayerStateCallback
    public final void a(int i) {
    }

    @Override // com.meituan.android.mtplayer.video.callback.IPlayerStateCallback
    public final void a(int i, int i2, int i3) {
    }

    @Override // com.meituan.android.mtplayer.video.callback.a
    public final void setPlayerController(com.meituan.android.mtplayer.video.callback.c cVar) {
    }

    public b(@NonNull Context context, View view) {
        super(context);
        Object[] objArr = {context, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f41aea4d1b0f50e999c1b8aa867d1ab", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f41aea4d1b0f50e999c1b8aa867d1ab");
        } else {
            this.b = view;
        }
    }

    @Override // com.meituan.android.mtplayer.video.callback.a
    public final View getView() {
        return this.b;
    }
}
