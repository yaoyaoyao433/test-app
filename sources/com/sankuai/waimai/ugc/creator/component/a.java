package com.sankuai.waimai.ugc.creator.component;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.opengl.GLES20;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.dianping.video.videofilter.gpuimage.l;
import com.dianping.video.videofilter.gpuimage.t;
import com.dianping.video.videofilter.gpuimage.u;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.ugc.creator.utils.o;
import com.sankuai.waimai.ugc.creator.widgets.SmoothScrollLinearLayoutManager;
import com.sankuai.waimai.ugc.creator.widgets.round.RoundCornerFrameLayout;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.List;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a extends com.sankuai.waimai.ugc.creator.base.b implements com.sankuai.waimai.ugc.creator.ability.videofilter.a, com.sankuai.waimai.ugc.creator.ability.videofilter.c {
    public static ChangeQuickRedirect a;
    public b b;
    private TextView c;
    private View d;
    private SeekBar e;
    private RecyclerView f;

    public static /* synthetic */ void a(a aVar, float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "ef3f0a8da41780c737f23d8007798a1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "ef3f0a8da41780c737f23d8007798a1c");
        } else {
            com.sankuai.waimai.ugc.creator.manager.h.a().a(f);
        }
    }

    public static /* synthetic */ void a(a aVar, String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "e71ea5c3b80624345d9aaf9be1feda75", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "e71ea5c3b80624345d9aaf9be1feda75");
            return;
        }
        aVar.c.setText(str);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) aVar.c.getLayoutParams();
        marginLayoutParams.leftMargin = i;
        aVar.c.setLayoutParams(marginLayoutParams);
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.b
    public final View a(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc9b555a4e7f73567c2a7ade018a37e5", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc9b555a4e7f73567c2a7ade018a37e5") : layoutInflater.inflate(R.layout.wm_ugc_media_component_video_filter_selector_block, viewGroup, false);
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.b
    public final void a(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9df8371cddb0463715079c3a79d7bc94", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9df8371cddb0463715079c3a79d7bc94");
            return;
        }
        super.a(view);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1a669449a10c119c1901920f37756800", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1a669449a10c119c1901920f37756800");
        } else {
            this.d = b(R.id.fl_bubble_seek_bar_container);
            this.c = (TextView) b(R.id.ugc_edit_video_bar_indicator);
            this.e = (SeekBar) b(R.id.ugc_edit_video_seek_bar);
            this.e.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.sankuai.waimai.ugc.creator.component.a.1
                public static ChangeQuickRedirect a;

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                    Object[] objArr3 = {seekBar, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c980d66e571738a364b3539d07a779ce", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c980d66e571738a364b3539d07a779ce");
                        return;
                    }
                    float progress = a.this.e.getProgress() / a.this.e.getMax();
                    int width = a.this.e.getWidth();
                    int width2 = a.this.e.getProgressDrawable().getBounds().width();
                    a.a(a.this, String.valueOf(i), (int) (((width2 * progress) + ((width - width2) / 2.0f)) - (a.this.c.getWidth() / 2.0d)));
                    a.a(a.this, (i * 1.0f) / seekBar.getMax());
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public final void onStartTrackingTouch(SeekBar seekBar) {
                    Object[] objArr3 = {seekBar};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f97b90240393c2f2d77f3d5d8a3a9e6b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f97b90240393c2f2d77f3d5d8a3a9e6b");
                    } else {
                        a.this.c.setVisibility(0);
                    }
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public final void onStopTrackingTouch(SeekBar seekBar) {
                    Object[] objArr3 = {seekBar};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4fc5c08d4a7833957c0099682a6b643f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4fc5c08d4a7833957c0099682a6b643f");
                    } else {
                        a.this.c.setVisibility(4);
                    }
                }
            });
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "40befa3841df22748b65d127f965c036", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "40befa3841df22748b65d127f965c036");
            return;
        }
        this.f = (RecyclerView) b(R.id.rv_video_filters_list);
        this.f.setLayoutManager(new SmoothScrollLinearLayoutManager(B(), 0, false));
        this.b = new b(B(), this);
        this.f.setAdapter(this.b);
    }

    @Override // com.sankuai.waimai.ugc.creator.ability.videofilter.a
    public final void bO_() {
        int i;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1f51cfa6df8cdc798d045e40fd27423", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1f51cfa6df8cdc798d045e40fd27423");
            return;
        }
        b bVar = this.b;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "3fd97a5ab7e9ff2be53e8efd6cab01ad", RobustBitConfig.DEFAULT_VALUE)) {
            i = ((Integer) PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "3fd97a5ab7e9ff2be53e8efd6cab01ad")).intValue();
        } else {
            if (bVar.d > 0) {
                bVar.a(bVar.b.get(bVar.d - 1), bVar.d - 1);
            }
            i = bVar.d;
        }
        a(i);
    }

    @Override // com.sankuai.waimai.ugc.creator.ability.videofilter.a
    public final void bP_() {
        int i;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a80b1a6113780f9e6117129522d68b6c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a80b1a6113780f9e6117129522d68b6c");
            return;
        }
        b bVar = this.b;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "98586e3365dd2ae7398eaa5b4960a1c7", RobustBitConfig.DEFAULT_VALUE)) {
            i = ((Integer) PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "98586e3365dd2ae7398eaa5b4960a1c7")).intValue();
        } else {
            if (bVar.d + 1 <= bVar.b.size()) {
                bVar.a(bVar.b.get(bVar.d + 1), bVar.d + 1);
            }
            i = bVar.d;
        }
        a(i);
    }

    @Override // com.sankuai.waimai.ugc.creator.ability.videofilter.c
    public final void a(@NonNull final com.sankuai.waimai.ugc.creator.entity.inner.c cVar, int i) {
        Object[] objArr = {cVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cbbd9a3d26377154bebc9dd856ac2345", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cbbd9a3d26377154bebc9dd856ac2345");
            return;
        }
        this.b.a(cVar, i);
        String str = cVar.b;
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "902eb91c4369aed139c707712640b9a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "902eb91c4369aed139c707712640b9a7");
        } else if (TextUtils.equals("R0", str)) {
            this.d.setVisibility(4);
        } else {
            this.d.setVisibility(0);
        }
        Object[] objArr3 = {cVar};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "bb063db4755946102abed874ba098a6a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "bb063db4755946102abed874ba098a6a");
        } else if (TextUtils.equals("R0", cVar.b)) {
            com.sankuai.waimai.ugc.creator.manager.h.a().a((Bitmap) null);
        } else {
            b.C0608b c = com.sankuai.meituan.mtimageloader.loader.a.c();
            c.b = B();
            c.c = cVar.d;
            c.a(new b.a() { // from class: com.sankuai.waimai.ugc.creator.component.a.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                public final void a() {
                }

                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                public final void a(Bitmap bitmap) {
                    Object[] objArr4 = {bitmap};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "8c3e052e46aebdf1fe4d3e4c4a41e296", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "8c3e052e46aebdf1fe4d3e4c4a41e296");
                    } else if (o.a(a.this.A())) {
                        com.sankuai.waimai.ugc.creator.manager.h.a().a(bitmap);
                        com.sankuai.waimai.ugc.creator.manager.h.a().a(cVar.e);
                    }
                }
            });
        }
        ((com.sankuai.waimai.ugc.creator.ability.videofilter.b) a(com.sankuai.waimai.ugc.creator.ability.videofilter.b.class)).a(cVar);
    }

    private void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efeccd3fb76f4efc1b84fc2597d84d19", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efeccd3fb76f4efc1b84fc2597d84d19");
        } else if (i > 0) {
            this.f.smoothScrollToPosition(i);
        }
    }

    public final String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ab895ffb54cc8eac1c10a66a7f3ff42", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ab895ffb54cc8eac1c10a66a7f3ff42");
        }
        com.sankuai.waimai.ugc.creator.entity.inner.c cVar = this.b.c;
        return cVar == null ? "R0" : cVar.b;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class b extends RecyclerView.a<C1362a> {
        public static ChangeQuickRedirect a;
        public final List<com.sankuai.waimai.ugc.creator.entity.inner.c> b;
        public com.sankuai.waimai.ugc.creator.entity.inner.c c;
        public int d;
        public Bitmap e;
        private final LayoutInflater f;
        private final com.sankuai.waimai.ugc.creator.ability.videofilter.c g;

        @Override // android.support.v7.widget.RecyclerView.a
        public final /* synthetic */ void onBindViewHolder(@NonNull C1362a c1362a, final int i) {
            final C1362a c1362a2 = c1362a;
            Object[] objArr = {c1362a2, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7825f04771b455fed3da3bb94bacd8e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7825f04771b455fed3da3bb94bacd8e");
                return;
            }
            final com.sankuai.waimai.ugc.creator.entity.inner.c cVar = this.b.get(i);
            boolean equals = this.c.equals(cVar);
            final Bitmap bitmap = this.e;
            final com.sankuai.waimai.ugc.creator.ability.videofilter.c cVar2 = this.g;
            Object[] objArr2 = {cVar, bitmap, Integer.valueOf(i), Byte.valueOf(equals ? (byte) 1 : (byte) 0), cVar2};
            ChangeQuickRedirect changeQuickRedirect2 = C1362a.a;
            if (PatchProxy.isSupport(objArr2, c1362a2, changeQuickRedirect2, false, "a528027862b7ba10ab51dc14ac1e1df6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, c1362a2, changeQuickRedirect2, false, "a528027862b7ba10ab51dc14ac1e1df6");
            } else if (cVar == null || !o.a(c1362a2.e)) {
            } else {
                if (!cVar.equals(c1362a2.f)) {
                    c1362a2.f = cVar;
                    c1362a2.d.setText(cVar.c);
                    if (TextUtils.equals("R0", cVar.b)) {
                        c1362a2.c.setImageBitmap(bitmap);
                    } else {
                        b.C0608b c = com.sankuai.meituan.mtimageloader.loader.a.c();
                        c.b = c1362a2.e;
                        c.c = cVar.d;
                        c.a(new b.a() { // from class: com.sankuai.waimai.ugc.creator.component.a.a.1
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.meituan.mtimageloader.config.b.a
                            public final void a(Bitmap bitmap2) {
                                Bitmap bitmap3;
                                Bitmap bitmap4;
                                Object[] objArr3 = {bitmap2};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2e8cc5460c8475046af3423990436a87", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2e8cc5460c8475046af3423990436a87");
                                } else if (o.a(C1362a.this.e)) {
                                    com.dianping.video.videofilter.gpuimage.b bVar = new com.dianping.video.videofilter.gpuimage.b(C1362a.this.e);
                                    com.dianping.video.videofilter.gpuimage.i iVar = new com.dianping.video.videofilter.gpuimage.i();
                                    iVar.a(bitmap2);
                                    Object[] objArr4 = {iVar};
                                    ChangeQuickRedirect changeQuickRedirect4 = com.dianping.video.videofilter.gpuimage.b.a;
                                    if (PatchProxy.isSupport(objArr4, bVar, changeQuickRedirect4, false, "73ae19224d748e7909b62c000aaa5573", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, bVar, changeQuickRedirect4, false, "73ae19224d748e7909b62c000aaa5573");
                                    } else {
                                        bVar.c = iVar;
                                        bVar.b.a(bVar.c);
                                    }
                                    Bitmap bitmap5 = bitmap;
                                    Object[] objArr5 = {bitmap5};
                                    ChangeQuickRedirect changeQuickRedirect5 = com.dianping.video.videofilter.gpuimage.b.a;
                                    if (PatchProxy.isSupport(objArr5, bVar, changeQuickRedirect5, false, "37851ee4ecad4b858a7d01af7d5730c1", RobustBitConfig.DEFAULT_VALUE)) {
                                        bitmap4 = (Bitmap) PatchProxy.accessDispatch(objArr5, bVar, changeQuickRedirect5, false, "37851ee4ecad4b858a7d01af7d5730c1");
                                    } else {
                                        final l lVar = new l(bVar.c);
                                        lVar.a(u.NORMAL, bVar.b.d, bVar.b.e);
                                        lVar.f = bVar.e;
                                        t tVar = new t(bitmap5.getWidth(), bitmap5.getHeight());
                                        Object[] objArr6 = {lVar};
                                        ChangeQuickRedirect changeQuickRedirect6 = t.a;
                                        if (PatchProxy.isSupport(objArr6, tVar, changeQuickRedirect6, false, "2bc8d6d781eec174deac7ffaa15073bb", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr6, tVar, changeQuickRedirect6, false, "2bc8d6d781eec174deac7ffaa15073bb");
                                        } else {
                                            tVar.b = lVar;
                                            if (!Thread.currentThread().getName().equals(tVar.m)) {
                                                Log.e("PixelBuffer", "setRenderer: This thread does not own the OpenGL context.");
                                            } else {
                                                tVar.b.onSurfaceCreated(tVar.l, tVar.i);
                                                tVar.b.onSurfaceChanged(tVar.l, tVar.c, tVar.d);
                                            }
                                        }
                                        lVar.a(bitmap5, false);
                                        Object[] objArr7 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect7 = t.a;
                                        if (PatchProxy.isSupport(objArr7, tVar, changeQuickRedirect7, false, "914d90994034ab3283674c6debc7aba2", RobustBitConfig.DEFAULT_VALUE)) {
                                            bitmap3 = (Bitmap) PatchProxy.accessDispatch(objArr7, tVar, changeQuickRedirect7, false, "914d90994034ab3283674c6debc7aba2");
                                        } else {
                                            if (tVar.b == null) {
                                                Log.e("PixelBuffer", "getBitmap: Renderer was not set.");
                                            } else if (!Thread.currentThread().getName().equals(tVar.m)) {
                                                Log.e("PixelBuffer", "getBitmap: This thread does not own the OpenGL context.");
                                            } else {
                                                tVar.b.onDrawFrame(tVar.l);
                                                tVar.b.onDrawFrame(tVar.l);
                                                Object[] objArr8 = new Object[0];
                                                ChangeQuickRedirect changeQuickRedirect8 = t.a;
                                                if (PatchProxy.isSupport(objArr8, tVar, changeQuickRedirect8, false, "be5c4bb2b13438d1aa9dbced9683b969", RobustBitConfig.DEFAULT_VALUE)) {
                                                    PatchProxy.accessDispatch(objArr8, tVar, changeQuickRedirect8, false, "be5c4bb2b13438d1aa9dbced9683b969");
                                                } else {
                                                    IntBuffer allocate = IntBuffer.allocate(tVar.c * tVar.d);
                                                    tVar.l.glReadPixels(0, 0, tVar.c, tVar.d, 6408, 5121, allocate);
                                                    tVar.e = Bitmap.createBitmap(tVar.c, tVar.d, Bitmap.Config.ARGB_8888);
                                                    if (tVar.e != null) {
                                                        tVar.e.copyPixelsFromBuffer(IntBuffer.wrap(allocate.array()));
                                                    }
                                                }
                                                bitmap3 = tVar.e;
                                            }
                                            bitmap3 = null;
                                        }
                                        bVar.c.d();
                                        Object[] objArr9 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect9 = l.a;
                                        if (PatchProxy.isSupport(objArr9, lVar, changeQuickRedirect9, false, "744ba4984b8b0700e3322ae30c4b2c11", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr9, lVar, changeQuickRedirect9, false, "744ba4984b8b0700e3322ae30c4b2c11");
                                        } else {
                                            lVar.a(new Runnable() { // from class: com.dianping.video.videofilter.gpuimage.l.2
                                                public static ChangeQuickRedirect a;

                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    Object[] objArr10 = new Object[0];
                                                    ChangeQuickRedirect changeQuickRedirect10 = a;
                                                    if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "4ad52dd7e71401dff9e1d9c331072be9", RobustBitConfig.DEFAULT_VALUE)) {
                                                        PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "4ad52dd7e71401dff9e1d9c331072be9");
                                                        return;
                                                    }
                                                    GLES20.glDeleteTextures(1, new int[]{lVar.h}, 0);
                                                    lVar.h = -1;
                                                }
                                            });
                                        }
                                        Object[] objArr10 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect10 = t.a;
                                        if (PatchProxy.isSupport(objArr10, tVar, changeQuickRedirect10, false, "ae7409dbbbb0ff769bc8aeffa68a4606", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr10, tVar, changeQuickRedirect10, false, "ae7409dbbbb0ff769bc8aeffa68a4606");
                                        } else {
                                            tVar.b.onDrawFrame(tVar.l);
                                            tVar.b.onDrawFrame(tVar.l);
                                            EGL10 egl10 = tVar.f;
                                            EGLDisplay eGLDisplay = tVar.g;
                                            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
                                            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
                                            tVar.f.eglDestroySurface(tVar.g, tVar.k);
                                            tVar.f.eglDestroyContext(tVar.g, tVar.j);
                                            tVar.f.eglTerminate(tVar.g);
                                        }
                                        bVar.b.a(bVar.c);
                                        if (bVar.d != null) {
                                            bVar.b.a(bVar.d, false);
                                        }
                                        bitmap4 = bitmap3;
                                    }
                                    C1362a.this.c.setImageBitmap(bitmap4);
                                }
                            }

                            @Override // com.sankuai.meituan.mtimageloader.config.b.a
                            public final void a() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "cfbd1421b73f3429382f998f0ba68c82", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "cfbd1421b73f3429382f998f0ba68c82");
                                } else {
                                    C1362a.this.c.setImageBitmap(bitmap);
                                }
                            }
                        });
                    }
                }
                try {
                    if (equals) {
                        int parseColor = Color.parseColor("#FFCC33");
                        c1362a2.b.setBorderWidth(com.sankuai.waimai.foundation.utils.g.a(c1362a2.e, 1.0f));
                        c1362a2.b.setBorderColor(parseColor);
                        c1362a2.d.setTextColor(parseColor);
                    } else {
                        c1362a2.b.setBorderWidth(com.sankuai.waimai.foundation.utils.g.a(c1362a2.e, 0.0f));
                        c1362a2.d.setTextColor(Color.parseColor("#FFFFFF"));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                c1362a2.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.ugc.creator.component.a.a.2
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr3 = {view};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8e9e62ac3aaef6868a9be8062e99a0d9", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8e9e62ac3aaef6868a9be8062e99a0d9");
                        } else {
                            cVar2.a(cVar, i);
                        }
                    }
                });
            }
        }

        @Override // android.support.v7.widget.RecyclerView.a
        @NonNull
        public final /* synthetic */ C1362a onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            Object[] objArr = {viewGroup, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e76837b748fed0bd30baf862487da64b", RobustBitConfig.DEFAULT_VALUE) ? (C1362a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e76837b748fed0bd30baf862487da64b") : new C1362a(this.f.inflate(R.layout.wm_ugc_video_edit_filter_item_layout, viewGroup, false));
        }

        public b(Context context, @NonNull com.sankuai.waimai.ugc.creator.ability.videofilter.c cVar) {
            Object[] objArr = {context, cVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e5e4c90e35846af6256071bb9b65209", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e5e4c90e35846af6256071bb9b65209");
                return;
            }
            this.d = 0;
            this.b = new ArrayList();
            this.f = LayoutInflater.from(context);
            this.g = cVar;
            setHasStableIds(true);
        }

        @Override // android.support.v7.widget.RecyclerView.a
        public final int getItemCount() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "263e975fe02176fd0be22ff99a6adeb6", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "263e975fe02176fd0be22ff99a6adeb6")).intValue() : this.b.size();
        }

        @Override // android.support.v7.widget.RecyclerView.a
        public final long getItemId(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cbf099c3903ac7f415534dc8cbb5ca6b", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cbf099c3903ac7f415534dc8cbb5ca6b")).longValue() : this.b.get(i).hashCode();
        }

        public final void a(@NonNull com.sankuai.waimai.ugc.creator.entity.inner.c cVar, int i) {
            Object[] objArr = {cVar, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1bbc692028ac23a82ea4ce0c58e66715", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1bbc692028ac23a82ea4ce0c58e66715");
            } else if (cVar.equals(this.c)) {
            } else {
                this.c = cVar;
                this.d = i;
                notifyDataSetChanged();
                if (this.g != null) {
                    this.g.a(this.c, this.d);
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.ugc.creator.component.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static class C1362a extends RecyclerView.s {
        public static ChangeQuickRedirect a;
        RoundCornerFrameLayout b;
        final ImageView c;
        final TextView d;
        final Context e;
        com.sankuai.waimai.ugc.creator.entity.inner.c f;

        public C1362a(View view) {
            super(view);
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d2ce2c86b763b915167bf2e618169c6", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d2ce2c86b763b915167bf2e618169c6");
                return;
            }
            this.e = view.getContext();
            this.c = (ImageView) view.findViewById(R.id.ugc_edit_video_filter_item_img);
            this.d = (TextView) view.findViewById(R.id.ugc_edit_video_filter_item_txt);
            this.b = (RoundCornerFrameLayout) view.findViewById(R.id.fl_thumbnail_container);
        }
    }
}
