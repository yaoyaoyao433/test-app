package com.sankuai.waimai.ugc.creator.component;

import android.app.Activity;
import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.alipay.sdk.app.PayTask;
import com.meituan.android.common.locate.loader.LocationStrategy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtlive.ugc.library.interfaces.c;
import com.sankuai.waimai.ugc.creator.entity.inner.VideoData;
import com.sankuai.waimai.ugc.creator.utils.m;
import com.sankuai.waimai.ugc.creator.utils.o;
import com.sankuai.waimai.ugc.creator.widgets.clipper.VideoClipperView;
import java.text.DecimalFormat;
import java.text.MessageFormat;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class f extends com.sankuai.waimai.ugc.creator.base.b {
    public static ChangeQuickRedirect a;
    VideoClipperView b;
    TextView c;
    long d;
    int e;
    public long f;
    public long g;
    private long h;
    private long i;
    private VideoData j;

    @Override // com.sankuai.waimai.ugc.creator.framework.b
    public final View a(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09466f0a5fb0762d1071d9e05a078514", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09466f0a5fb0762d1071d9e05a078514") : layoutInflater.inflate(R.layout.wm_ugc_media_component_video_clip_control_block, viewGroup, false);
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.b
    public final void a(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0254889d5a46c1b6e82ab84b6c2465c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0254889d5a46c1b6e82ab84b6c2465c");
            return;
        }
        super.a(view);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d4b18dfa70c500a4fb055e6d67264210", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d4b18dfa70c500a4fb055e6d67264210");
        } else {
            this.j = (VideoData) b("input_media_data", (String) null);
            this.d = this.o.o;
            this.h = this.o.p;
            long j = this.d;
            long j2 = this.h;
            long j3 = LocationStrategy.LOCATION_TIMEOUT;
            if (j >= j2) {
                this.d = PayTask.j;
                this.h = LocationStrategy.LOCATION_TIMEOUT;
            }
            this.i = this.j.b;
            this.f = 0L;
            if (this.i <= LocationStrategy.LOCATION_TIMEOUT) {
                j3 = this.i;
            }
            this.g = j3;
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e7a849abb2de985d6a9063b650ff0fe2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e7a849abb2de985d6a9063b650ff0fe2");
        } else {
            this.b = (VideoClipperView) b(R.id.video_clipper_view);
            this.b.setCallback(new VideoClipperView.a() { // from class: com.sankuai.waimai.ugc.creator.component.f.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.ugc.creator.widgets.clipper.VideoClipperView.a
                public final void a(int i, int i2, int i3) {
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "ac1192e82c17e9f83c884d8db8c1127c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "ac1192e82c17e9f83c884d8db8c1127c");
                        return;
                    }
                    f.this.e = i3;
                    final com.sankuai.waimai.ugc.creator.manager.h a2 = com.sankuai.waimai.ugc.creator.manager.h.a();
                    final Activity B = f.this.B();
                    int i4 = f.this.e;
                    final com.sankuai.waimai.ugc.creator.manager.e eVar = new com.sankuai.waimai.ugc.creator.manager.e() { // from class: com.sankuai.waimai.ugc.creator.component.f.1.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.ugc.creator.manager.e
                        public final void a(int i5, long j4, Bitmap bitmap) {
                            Object[] objArr5 = {Integer.valueOf(i5), new Long(j4), bitmap};
                            ChangeQuickRedirect changeQuickRedirect5 = a;
                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "cc8720585ecd80133f554af717ba375b", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "cc8720585ecd80133f554af717ba375b");
                                return;
                            }
                            VideoClipperView videoClipperView = f.this.b;
                            Object[] objArr6 = {bitmap};
                            ChangeQuickRedirect changeQuickRedirect6 = VideoClipperView.g;
                            if (PatchProxy.isSupport(objArr6, videoClipperView, changeQuickRedirect6, false, "61a38758be1b660f6bd5973b01a22adc", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr6, videoClipperView, changeQuickRedirect6, false, "61a38758be1b660f6bd5973b01a22adc");
                            } else if (videoClipperView.h != null) {
                                com.sankuai.waimai.ugc.creator.widgets.clipper.a aVar = videoClipperView.h;
                                Object[] objArr7 = {bitmap};
                                ChangeQuickRedirect changeQuickRedirect7 = com.sankuai.waimai.ugc.creator.widgets.clipper.a.a;
                                if (PatchProxy.isSupport(objArr7, aVar, changeQuickRedirect7, false, "60969f942421f295dd6f8e3309e461f6", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr7, aVar, changeQuickRedirect7, false, "60969f942421f295dd6f8e3309e461f6");
                                } else if (aVar.c < 0 || aVar.c > aVar.b.size()) {
                                    aVar.b.add(bitmap);
                                    aVar.notifyItemChanged(aVar.b.size() - 1);
                                }
                            }
                        }
                    };
                    Object[] objArr5 = {B, Integer.valueOf(i4), Integer.valueOf(i), Integer.valueOf(i2), eVar};
                    ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.ugc.creator.manager.h.a;
                    if (PatchProxy.isSupport(objArr5, a2, changeQuickRedirect5, false, "d53ed07b00f2a15763a4faa144f23653", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, a2, changeQuickRedirect5, false, "d53ed07b00f2a15763a4faa144f23653");
                    } else if (a2.b != null) {
                        a2.b.a(i4, i, i2, true, new c.a() { // from class: com.sankuai.waimai.ugc.creator.manager.h.3
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.meituan.mtlive.ugc.library.interfaces.c.a
                            public final void a(final int i5, final long j4, final Bitmap bitmap) {
                                Object[] objArr6 = {Integer.valueOf(i5), new Long(j4), bitmap};
                                ChangeQuickRedirect changeQuickRedirect6 = a;
                                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "2682dade63689c947ad2d265cd7dbb9c", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "2682dade63689c947ad2d265cd7dbb9c");
                                } else if (o.a(B)) {
                                    B.runOnUiThread(new Runnable() { // from class: com.sankuai.waimai.ugc.creator.manager.h.3.1
                                        public static ChangeQuickRedirect a;

                                        {
                                            AnonymousClass3.this = this;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            Object[] objArr7 = new Object[0];
                                            ChangeQuickRedirect changeQuickRedirect7 = a;
                                            if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "906d3e7d8fc133c2ab3f8c5b652c019a", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "906d3e7d8fc133c2ab3f8c5b652c019a");
                                            } else if (eVar != null) {
                                                eVar.a(i5, j4, bitmap);
                                            }
                                        }
                                    });
                                }
                            }
                        });
                    }
                }

                @Override // com.sankuai.waimai.ugc.creator.widgets.clipper.VideoClipperView.a
                public final void a() {
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "100e9ef1dfd9e139e38b7012629af1d6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "100e9ef1dfd9e139e38b7012629af1d6");
                    } else {
                        com.sankuai.waimai.ugc.creator.manager.h.a().c();
                    }
                }

                @Override // com.sankuai.waimai.ugc.creator.widgets.clipper.VideoClipperView.a
                public final void b(int i, int i2, int i3) {
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "e21478336e80f9c23dabe260803a890e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "e21478336e80f9c23dabe260803a890e");
                    } else {
                        f.this.c.setText(f.this.a(i3));
                    }
                }

                @Override // com.sankuai.waimai.ugc.creator.widgets.clipper.VideoClipperView.a
                public final void a(int i, int i2) {
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "44e691d96cfd87ed780926f850c32156", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "44e691d96cfd87ed780926f850c32156");
                        return;
                    }
                    f.this.f = i;
                    f.this.g = i2;
                    com.sankuai.waimai.ugc.creator.manager.h.a().a(f.this.f, f.this.g);
                }

                @Override // com.sankuai.waimai.ugc.creator.widgets.clipper.VideoClipperView.a
                public final void b() {
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "63016007c60a89477ec47963b43860dc", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "63016007c60a89477ec47963b43860dc");
                    } else {
                        f.this.b(MessageFormat.format(f.this.B().getString(R.string.wm_ugc_video_slide_tips), m.a(f.this.d)));
                    }
                }
            });
            final VideoClipperView videoClipperView = this.b;
            int i = (int) this.i;
            int i2 = (int) this.h;
            int i3 = (int) this.d;
            Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
            ChangeQuickRedirect changeQuickRedirect4 = VideoClipperView.g;
            if (PatchProxy.isSupport(objArr4, videoClipperView, changeQuickRedirect4, false, "be1e396c47d91d8bda65e0f69068d399", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, videoClipperView, changeQuickRedirect4, false, "be1e396c47d91d8bda65e0f69068d399");
            } else if (i < i3) {
                throw new IllegalStateException("视频总时长小于最短裁剪时长");
            } else {
                videoClipperView.j = i;
                videoClipperView.i = i2;
                videoClipperView.l = i3;
                if (videoClipperView.l >= videoClipperView.i) {
                    videoClipperView.l = 3000;
                    videoClipperView.i = 60000;
                }
                videoClipperView.k = Math.min(videoClipperView.j, videoClipperView.i);
                videoClipperView.m = videoClipperView.k;
                videoClipperView.b();
                videoClipperView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.sankuai.waimai.ugc.creator.widgets.clipper.VideoClipperView.3
                    public static ChangeQuickRedirect a;

                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public final void onGlobalLayout() {
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "dfa34942e7c7e856630f04e71deebf61", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "dfa34942e7c7e856630f04e71deebf61");
                            return;
                        }
                        videoClipperView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                        VideoClipperView.p(videoClipperView);
                    }
                });
            }
        }
        Object[] objArr5 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect5 = a;
        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "d74b98fd740b3e8cf39559a11a40536e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "d74b98fd740b3e8cf39559a11a40536e");
            return;
        }
        this.c = (TextView) b(R.id.tv_selected_tips);
        this.c.setText(a(this.i));
    }

    String a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba2e3ccf2dda980e3d08ea49d609c1c4", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba2e3ccf2dda980e3d08ea49d609c1c4") : MessageFormat.format(B().getString(R.string.wm_ugc_clip_video_tips), b(Math.min(j, this.h)));
    }

    private String b(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53723578ef54012bc043350b7b5654a1", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53723578ef54012bc043350b7b5654a1") : new DecimalFormat("##0.0").format((j * 1.0d) / 1000.0d);
    }
}
