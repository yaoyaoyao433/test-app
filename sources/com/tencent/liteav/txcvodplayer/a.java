package com.tencent.liteav.txcvodplayer;

import android.support.annotation.NonNull;
import android.view.View;
import com.tencent.ijk.media.player.IMediaPlayer;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface a {

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.liteav.txcvodplayer.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public interface InterfaceC1464a {
        void a(@NonNull b bVar);

        void a(@NonNull b bVar, int i, int i2);

        void a(@NonNull b bVar, int i, int i2, int i3);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface b {
        @NonNull
        a a();

        void a(IMediaPlayer iMediaPlayer);
    }

    void addRenderCallback(@NonNull InterfaceC1464a interfaceC1464a);

    View getView();

    void removeRenderCallback(@NonNull InterfaceC1464a interfaceC1464a);

    void setAspectRatio(int i);

    void setVideoRotation(int i);

    void setVideoSampleAspectRatio(int i, int i2);

    void setVideoSize(int i, int i2);

    boolean shouldWaitForResize();
}
