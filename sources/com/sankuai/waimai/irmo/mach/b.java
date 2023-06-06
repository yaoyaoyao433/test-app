package com.sankuai.waimai.irmo.mach;

import android.content.Context;
import android.media.MediaExtractor;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.irmo.utils.AudioMngHelper;
import com.sankuai.waimai.irmo.utils.g;
import com.sankuai.waimai.irmo.utils.h;
import java.io.File;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private ImageView b;
    private AudioMngHelper c;
    private boolean d;
    private ViewGroup e;
    private a f;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        void setVolume(float f);
    }

    public static /* synthetic */ void b(b bVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "a3124ea3e18e7c2aaa0110160029ecb6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "a3124ea3e18e7c2aaa0110160029ecb6");
        } else {
            bVar.a(0);
        }
    }

    public static /* synthetic */ void c(b bVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "3160b3bc6f294d2b3bfad330dac6c39c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "3160b3bc6f294d2b3bfad330dac6c39c");
        } else {
            bVar.a(8);
        }
    }

    public b(@NonNull ViewGroup viewGroup, a aVar) {
        Object[] objArr = {viewGroup, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e65626a7e74f2f511e15db60afc16d1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e65626a7e74f2f511e15db60afc16d1");
            return;
        }
        this.f = aVar;
        this.e = viewGroup;
        this.c = new AudioMngHelper(viewGroup.getContext());
        this.d = false;
        Context context = viewGroup.getContext();
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e193a36432a17cfa7a4484f0be3f13b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e193a36432a17cfa7a4484f0be3f13b2");
            return;
        }
        this.b = new ImageView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a(context, 36.0f), a(context, 26.0f));
        this.b.setPadding(7, 7, 7, 7);
        layoutParams.leftMargin = a(context, 10.0f);
        layoutParams.topMargin = a(context, 10.0f);
        this.b.setLayoutParams(layoutParams);
        this.b.setVisibility(8);
        this.e.addView(this.b);
        this.b.setOnClickListener(this);
        if (this.d) {
            a();
        } else {
            c();
        }
    }

    private void b() {
        int intValue;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2dd16c5d2e44e75c783c04e7d0ca318", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2dd16c5d2e44e75c783c04e7d0ca318");
            return;
        }
        AudioMngHelper audioMngHelper = this.c;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = AudioMngHelper.a;
        if (PatchProxy.isSupport(objArr2, audioMngHelper, changeQuickRedirect2, false, "9d39e02b2857cb7a0d0d2f0bbb2f9308", RobustBitConfig.DEFAULT_VALUE)) {
            intValue = ((Integer) PatchProxy.accessDispatch(objArr2, audioMngHelper, changeQuickRedirect2, false, "9d39e02b2857cb7a0d0d2f0bbb2f9308")).intValue();
        } else {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = AudioMngHelper.a;
            int intValue2 = (PatchProxy.isSupport(objArr3, audioMngHelper, changeQuickRedirect3, false, "b762e3d0c819daaaf90a41f1ec53562f", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr3, audioMngHelper, changeQuickRedirect3, false, "b762e3d0c819daaaf90a41f1ec53562f")).intValue() : audioMngHelper.b.getStreamVolume(audioMngHelper.c)) * 100;
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = AudioMngHelper.a;
            intValue = intValue2 / (PatchProxy.isSupport(objArr4, audioMngHelper, changeQuickRedirect4, false, "0ef7d2749949a1c5c0d822af2b66d30a", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr4, audioMngHelper, changeQuickRedirect4, false, "0ef7d2749949a1c5c0d822af2b66d30a")).intValue() : audioMngHelper.b.getStreamMaxVolume(audioMngHelper.c));
        }
        com.sankuai.waimai.foundation.utils.log.a.c("VolumeControlUtil", "当前系统媒体音量：" + intValue, new Object[0]);
        if (intValue > 50) {
            float f = 20.0f / intValue;
            com.sankuai.waimai.foundation.utils.log.a.c("VolumeControlUtil", "设置播放器音量：" + f, new Object[0]);
            this.f.setVolume(f);
            return;
        }
        this.f.setVolume(1.0f);
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2124544d5b52a443fed9e6fdfa1e58b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2124544d5b52a443fed9e6fdfa1e58b5");
            return;
        }
        this.d = false;
        b();
        com.meituan.roodesign.resfetcher.runtime.c.a(this.b, "waimai_c_volume_open");
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69de5181b4ef3bbbc18c8688e35ef1a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69de5181b4ef3bbbc18c8688e35ef1a4");
            return;
        }
        this.d = true;
        this.f.setVolume(0.0f);
        com.meituan.roodesign.resfetcher.runtime.c.a(this.b, "waimai_c_volume_close");
    }

    public final void a(com.sankuai.waimai.irmo.mach.a aVar, final File file) {
        Object[] objArr = {aVar, file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a72b81d2199ca376d31cff5233ed429c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a72b81d2199ca376d31cff5233ed429c");
        } else if (aVar == null) {
        } else {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.b.getLayoutParams();
            if (aVar.i != -1) {
                layoutParams.topMargin = a(this.b.getContext(), aVar.i);
            }
            if (aVar.h != -1) {
                layoutParams.leftMargin = a(this.b.getContext(), aVar.h);
            }
            if (aVar.g != 1) {
                this.b.setVisibility(8);
            } else if (file == null) {
                this.b.setVisibility(0);
            } else {
                Object[] objArr2 = {file};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f785e8afb3d5ac0fbb67711674f9eeeb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f785e8afb3d5ac0fbb67711674f9eeeb");
                } else {
                    h.a(new h.a() { // from class: com.sankuai.waimai.irmo.mach.b.2
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.irmo.utils.h.a
                        public final void a() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "62cb0f08900d15754a1b2e3351741723", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "62cb0f08900d15754a1b2e3351741723");
                                return;
                            }
                            boolean a2 = b.this.a(file);
                            com.sankuai.waimai.foundation.utils.log.a.c("VolumeControlUtil", "是否有音频：" + a2, new Object[0]);
                            if (a2) {
                                b.b(b.this);
                            } else {
                                b.c(b.this);
                            }
                        }
                    }, "check_has_audio");
                }
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "117ca8038527fb50ed3afe6c9d047533", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "117ca8038527fb50ed3afe6c9d047533");
        } else if (view != this.b) {
        } else {
            if (this.d) {
                c();
            } else {
                a();
            }
        }
    }

    private void a(final int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a94218ca1d71a15084f6d009e2bb27e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a94218ca1d71a15084f6d009e2bb27e");
        } else if (h.a()) {
            this.b.setVisibility(i);
        } else {
            h.a(new Runnable() { // from class: com.sankuai.waimai.irmo.mach.b.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "79b253b8923c3439d85e0274794aecec", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "79b253b8923c3439d85e0274794aecec");
                    } else {
                        b.this.b.setVisibility(i);
                    }
                }
            }, "set_volume_visibility");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c196d0646928b926c99d70ecd29d7d59", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c196d0646928b926c99d70ecd29d7d59")).booleanValue();
        }
        if (file == null) {
            return false;
        }
        MediaExtractor mediaExtractor = null;
        try {
            try {
                Object[] objArr2 = {file};
                ChangeQuickRedirect changeQuickRedirect2 = g.a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "7bfb2f7e403c1ceed1128750dc74141d", RobustBitConfig.DEFAULT_VALUE)) {
                    mediaExtractor = (MediaExtractor) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "7bfb2f7e403c1ceed1128750dc74141d");
                } else {
                    MediaExtractor mediaExtractor2 = new MediaExtractor();
                    mediaExtractor2.setDataSource(file.toString());
                    mediaExtractor = mediaExtractor2;
                }
                if (g.a(mediaExtractor) == -1) {
                    if (mediaExtractor != null) {
                        mediaExtractor.release();
                    }
                    return false;
                }
                if (mediaExtractor != null) {
                    mediaExtractor.release();
                }
                return true;
            } catch (IOException e) {
                com.sankuai.waimai.foundation.utils.log.a.a(e);
                if (mediaExtractor != null) {
                    mediaExtractor.release();
                }
                return false;
            }
        } catch (Throwable th) {
            if (mediaExtractor != null) {
                mediaExtractor.release();
            }
            throw th;
        }
    }

    public static int a(Context context, float f) {
        Object[] objArr = {context, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1a0cb08e67a24c6aa66ee1e888ffa362", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1a0cb08e67a24c6aa66ee1e888ffa362")).intValue() : (int) (f * context.getResources().getDisplayMetrics().density);
    }
}
