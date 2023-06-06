package com.sankuai.meituan.mtlive.mtrtc.library;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceView;
import android.view.TextureView;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MTRTCVideoView extends FrameLayout {
    public static ChangeQuickRedirect a;
    private TextureView b;
    private SurfaceView c;
    private String d;

    public MTRTCVideoView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd3af9b222b877e4cb9ef0fdae80738e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd3af9b222b877e4cb9ef0fdae80738e");
        }
    }

    public MTRTCVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0778d49e4f20b6fd2c9c73c4d6add302", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0778d49e4f20b6fd2c9c73c4d6add302");
        }
    }

    public String getUserId() {
        return this.d;
    }

    public void setUserId(String str) {
        this.d = str;
    }

    public TextureView getTextureView() {
        return this.b;
    }

    public void setTextureView(TextureView textureView) {
        this.b = textureView;
    }

    public SurfaceView getSurfaceView() {
        return this.c;
    }

    public void setSurfaceView(SurfaceView surfaceView) {
        this.c = surfaceView;
    }
}
