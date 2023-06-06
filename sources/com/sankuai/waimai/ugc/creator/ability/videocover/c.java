package com.sankuai.waimai.ugc.creator.ability.videocover;

import android.app.Activity;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.n;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.ugc.creator.manager.e;
import com.sankuai.waimai.ugc.creator.utils.o;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends com.sankuai.waimai.ugc.creator.base.b {
    public static ChangeQuickRedirect a;
    e b;
    long c;
    RecyclerView d;
    Bitmap[] e;
    String f;
    long g;
    private ExecutorService h;
    private final int i;
    private final int j;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public e a;
        public long b;
        public String c;
    }

    public static /* synthetic */ int a(c cVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "e55caae1c3b1d11e56c05607350f80a6", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "e55caae1c3b1d11e56c05607350f80a6")).intValue() : g.a(cVar.A(), 50.0f) * 20;
    }

    public static /* synthetic */ void a(c cVar, final long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "a95beab4a42f04789b0a8d41ea76b763", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "a95beab4a42f04789b0a8d41ea76b763");
        } else {
            cVar.h.execute(new Runnable() { // from class: com.sankuai.waimai.ugc.creator.ability.videocover.c.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "006500e4ba84f9a95aea8f64800a67f1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "006500e4ba84f9a95aea8f64800a67f1");
                        return;
                    }
                    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                    if (c.this.f.startsWith("http")) {
                        mediaMetadataRetriever.setDataSource(c.this.f, new HashMap());
                    } else {
                        mediaMetadataRetriever.setDataSource(c.this.f);
                    }
                    final Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime(j * 1000, 3);
                    c.this.a(new Runnable() { // from class: com.sankuai.waimai.ugc.creator.ability.videocover.c.3.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "32cc3bdfdcf2df1aeffdc4836a06c070", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "32cc3bdfdcf2df1aeffdc4836a06c070");
                            } else if (c.this.b != null) {
                                c.this.b.a(0, j, frameAtTime);
                            }
                        }
                    });
                    mediaMetadataRetriever.release();
                }
            });
        }
    }

    public c(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0d4a750f81e2fdf9d467c491efc2915", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0d4a750f81e2fdf9d467c491efc2915");
            return;
        }
        this.i = 20;
        this.j = 50;
        this.b = aVar.a;
        this.c = aVar.b;
        this.f = aVar.c;
        this.h = com.sankuai.android.jarvis.c.a("wm-ugcpicker-videoCoverSelect", n.PRIORITY_HIGH);
        this.e = new Bitmap[22];
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.b
    public final View a(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8155bff7b3b6701d81cacea03a00100", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8155bff7b3b6701d81cacea03a00100");
        }
        View inflate = layoutInflater.inflate(R.layout.wm_ugc_meida_video_cover_frame_select_block, viewGroup, false);
        this.d = (RecyclerView) inflate.findViewById(R.id.wm_ugc_media_video_cover_recycler_view);
        return inflate;
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.b
    public final void a(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a752743761e5f1cc32a51c48feca351", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a752743761e5f1cc32a51c48feca351");
            return;
        }
        super.a(view);
        u();
        this.h.execute(new Runnable() { // from class: com.sankuai.waimai.ugc.creator.ability.videocover.c.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "72ff7d25cc9ba030eaefad81dedf796c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "72ff7d25cc9ba030eaefad81dedf796c");
                    return;
                }
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                if (c.this.f.startsWith("http")) {
                    mediaMetadataRetriever.setDataSource(c.this.f, new HashMap());
                } else {
                    mediaMetadataRetriever.setDataSource(c.this.f);
                }
                c.this.g = Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
                int i = 0;
                while (i < 20) {
                    Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime(Math.round(((c.this.g * 1.0d) / 20.0d) * i * 1000.0d), 3);
                    i++;
                    c.this.e[i] = frameAtTime.copy(Bitmap.Config.ARGB_8888, false);
                }
                mediaMetadataRetriever.release();
                final c cVar = c.this;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = c.a;
                if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "90e468eea386a4cabaf8dc86c21f26a4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "90e468eea386a4cabaf8dc86c21f26a4");
                } else {
                    cVar.a(new Runnable() { // from class: com.sankuai.waimai.ugc.creator.ability.videocover.c.2
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "166eba30d1bb61241dfd4ac0186c8d99", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "166eba30d1bb61241dfd4ac0186c8d99");
                                return;
                            }
                            c.this.v();
                            c.this.d.setAdapter(new b(c.this.A(), Arrays.asList(c.this.e)));
                            c.this.d.addOnScrollListener(new RecyclerView.k() { // from class: com.sankuai.waimai.ugc.creator.ability.videocover.c.2.1
                                public static ChangeQuickRedirect a;
                                public int b = 0;

                                @Override // android.support.v7.widget.RecyclerView.k
                                public final void onScrolled(RecyclerView recyclerView, int i2, int i3) {
                                    Object[] objArr5 = {recyclerView, Integer.valueOf(i2), Integer.valueOf(i3)};
                                    ChangeQuickRedirect changeQuickRedirect5 = a;
                                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "18ee038e7e671944acc5e20403f583c9", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "18ee038e7e671944acc5e20403f583c9");
                                        return;
                                    }
                                    super.onScrolled(recyclerView, i2, i3);
                                    this.b += i2;
                                }

                                @Override // android.support.v7.widget.RecyclerView.k
                                public final void onScrollStateChanged(RecyclerView recyclerView, int i2) {
                                    Object[] objArr5 = {recyclerView, Integer.valueOf(i2)};
                                    ChangeQuickRedirect changeQuickRedirect5 = a;
                                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "d1ebc4d4b2d586d422fda14d278de5dc", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "d1ebc4d4b2d586d422fda14d278de5dc");
                                        return;
                                    }
                                    super.onScrollStateChanged(recyclerView, i2);
                                    if (i2 == 0) {
                                        c.a(c.this, Math.round(((this.b * 1.0d) / c.a(c.this)) * c.this.g));
                                    }
                                    com.sankuai.waimai.ugc.creator.judas.e a2 = com.sankuai.waimai.ugc.creator.judas.e.a();
                                    Activity B = c.this.B();
                                    Object[] objArr6 = {B};
                                    ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.ugc.creator.judas.e.a;
                                    if (PatchProxy.isSupport(objArr6, a2, changeQuickRedirect6, false, "e323a0a9c931ad66874bf0db6b068a78", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr6, a2, changeQuickRedirect6, false, "e323a0a9c931ad66874bf0db6b068a78");
                                    } else if (a2.b != null) {
                                        a2.a(a2.b.u, a2.b.i, (Map<String, Object>) null, B);
                                    }
                                }
                            });
                            c.this.b(R.id.wm_ugc_media_video_indicator).bringToFront();
                            if (c.this.c != 0) {
                                Long valueOf = Long.valueOf(Math.round(((c.this.c * 1.0d) / c.this.g) * c.a(c.this)));
                                c.a(c.this, c.this.c);
                                c.this.d.scrollTo(valueOf.intValue(), c.this.d.computeVerticalScrollOffset());
                                return;
                            }
                            c.a(c.this, 0L);
                        }
                    });
                }
            }
        });
    }

    void a(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "775820ab0d13436d31d64383df00f2b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "775820ab0d13436d31d64383df00f2b9");
            return;
        }
        Activity B = B();
        if (o.a(B)) {
            B.runOnUiThread(runnable);
        }
    }
}
