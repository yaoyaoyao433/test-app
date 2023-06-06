package com.tencent.avroom;

import android.content.Context;
import android.view.TextureView;
import com.tencent.liteav.TXCRenderAndDec;
import com.tencent.rtmp.ui.TXCloudVideoView;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class c extends TXCRenderAndDec {
    TXCloudVideoView a;
    private a b;

    public c(Context context) {
        super(context);
        this.b = null;
    }

    public void a(TXCloudVideoView tXCloudVideoView) {
        if (tXCloudVideoView != null) {
            this.a = tXCloudVideoView;
        }
        if (this.a == null) {
            return;
        }
        this.a.setVisibility(0);
        TextureView textureView = new TextureView(this.a.getContext());
        this.a.addVideoView(textureView);
        getVideoRender().a(textureView);
    }

    public a a() {
        return this.b;
    }

    public void a(a aVar) {
        this.b = aVar;
    }
}
