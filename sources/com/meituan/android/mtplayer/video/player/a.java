package com.meituan.android.mtplayer.video.player;

import com.meituan.android.mtplayer.video.player.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class a implements d {
    public static ChangeQuickRedirect changeQuickRedirect;
    private d.a mOnBufferingUpdateListener;
    private d.b mOnCompletionListener;
    private d.c mOnErrorListener;
    private d.InterfaceC0298d mOnInfoListener;
    private d.e mOnPreparedListener;
    private d.f mOnSeekCompleteListener;
    private d.g mOnVideoSizeChangedListener;

    @Override // com.meituan.android.mtplayer.video.player.d
    public void setOption(int i, String str, long j) {
    }

    public void setOption(int i, String str, String str2) {
    }

    public void resetListeners() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b698fb4b629bdd56aa6ff5173d2b2721", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b698fb4b629bdd56aa6ff5173d2b2721");
            return;
        }
        this.mOnPreparedListener = null;
        this.mOnBufferingUpdateListener = null;
        this.mOnCompletionListener = null;
        this.mOnSeekCompleteListener = null;
        this.mOnVideoSizeChangedListener = null;
        this.mOnErrorListener = null;
        this.mOnInfoListener = null;
    }

    @Override // com.meituan.android.mtplayer.video.player.d
    public final void setOnPreparedListener(d.e eVar) {
        this.mOnPreparedListener = eVar;
    }

    @Override // com.meituan.android.mtplayer.video.player.d
    public final void setOnCompletionListener(d.b bVar) {
        this.mOnCompletionListener = bVar;
    }

    @Override // com.meituan.android.mtplayer.video.player.d
    public final void setOnBufferingUpdateListener(d.a aVar) {
        this.mOnBufferingUpdateListener = aVar;
    }

    @Override // com.meituan.android.mtplayer.video.player.d
    public final void setOnSeekCompleteListener(d.f fVar) {
        this.mOnSeekCompleteListener = fVar;
    }

    @Override // com.meituan.android.mtplayer.video.player.d
    public final void setOnVideoSizeChangedListener(d.g gVar) {
        this.mOnVideoSizeChangedListener = gVar;
    }

    @Override // com.meituan.android.mtplayer.video.player.d
    public final void setOnErrorListener(d.c cVar) {
        this.mOnErrorListener = cVar;
    }

    @Override // com.meituan.android.mtplayer.video.player.d
    public final void setOnInfoListener(d.InterfaceC0298d interfaceC0298d) {
        this.mOnInfoListener = interfaceC0298d;
    }

    public void releaseListeners() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "44658e5e8c86279dd5883e632e0ef545", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "44658e5e8c86279dd5883e632e0ef545");
            return;
        }
        this.mOnPreparedListener = null;
        this.mOnBufferingUpdateListener = null;
        this.mOnCompletionListener = null;
        this.mOnSeekCompleteListener = null;
        this.mOnVideoSizeChangedListener = null;
        this.mOnErrorListener = null;
        this.mOnInfoListener = null;
    }

    public final void notifyOnPrepared() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d0cc02d47d8cb6ee1d14859c01ae7d5e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d0cc02d47d8cb6ee1d14859c01ae7d5e");
        } else if (this.mOnPreparedListener != null) {
            this.mOnPreparedListener.a(this);
        }
    }

    public final void notifyOnCompletion() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9119d65923a71381b649911da414c104", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9119d65923a71381b649911da414c104");
        } else if (this.mOnCompletionListener != null) {
            this.mOnCompletionListener.a(this);
        }
    }

    public final void notifyOnBufferingUpdate(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7815660f2284ff6fe497c1ef4ea831fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7815660f2284ff6fe497c1ef4ea831fe");
        } else if (this.mOnBufferingUpdateListener != null) {
            this.mOnBufferingUpdateListener.a(this, i);
        }
    }

    public final void notifyOnSeekComplete() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "df520cdf6000c3c9e6f1ca143555682b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "df520cdf6000c3c9e6f1ca143555682b");
        } else if (this.mOnSeekCompleteListener != null) {
            this.mOnSeekCompleteListener.a(this);
        }
    }

    public final void notifyOnVideoSizeChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0161b41d23dbf6ffb5b5689488c660a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0161b41d23dbf6ffb5b5689488c660a5");
        } else if (this.mOnVideoSizeChangedListener != null) {
            this.mOnVideoSizeChangedListener.a(this, i, i2, i3, i4);
        }
    }

    public final boolean notifyOnError(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eb1766d871777f5feb91f1fdb6ca5b39", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eb1766d871777f5feb91f1fdb6ca5b39")).booleanValue() : this.mOnErrorListener != null && this.mOnErrorListener.a(this, i, i2);
    }

    public final boolean notifyOnInfo(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c3579d36a6a763e06a99ca67b19cd495", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c3579d36a6a763e06a99ca67b19cd495")).booleanValue() : this.mOnInfoListener != null && this.mOnInfoListener.a(this, i, i2);
    }
}
