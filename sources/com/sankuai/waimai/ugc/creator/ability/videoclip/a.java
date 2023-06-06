package com.sankuai.waimai.ugc.creator.ability.videoclip;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.ugc.creator.component.FlowLineActionBarBlock;
import com.sankuai.waimai.ugc.creator.component.f;
import com.sankuai.waimai.ugc.creator.component.g;
import com.sankuai.waimai.ugc.creator.entity.c;
import com.sankuai.waimai.ugc.creator.entity.e;
import com.sankuai.waimai.ugc.creator.entity.inner.VideoData;
import com.sankuai.waimai.ugc.creator.manager.d;
import com.sankuai.waimai.ugc.creator.manager.h;
import com.sankuai.waimai.ugc.creator.utils.n;
import com.sankuai.waimai.ugc.creator.utils.o;
import com.sankuai.waimai.ugc.creator.utils.task.b;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.ugc.creator.base.a implements d {
    public static ChangeQuickRedirect a;
    private FlowLineActionBarBlock b;
    private g c;
    private f d;
    private final VideoData z;

    @Override // com.sankuai.waimai.ugc.creator.manager.d
    public final void j() {
    }

    public a(VideoData videoData) {
        Object[] objArr = {videoData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8c17c501f5cd8d37c67859ba9b3046d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8c17c501f5cd8d37c67859ba9b3046d");
        } else {
            this.z = videoData;
        }
    }

    @Override // com.sankuai.waimai.ugc.creator.base.b
    public final void a(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8c2a97a07f461c40e86b868aa399f88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8c2a97a07f461c40e86b868aa399f88");
            return;
        }
        n.a("initVideoParams");
        if (this.z == null) {
            return;
        }
        a("input_media_data", this.z);
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.b
    public final View a(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8889719e83fd31694faa80057b2a3cd1", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8889719e83fd31694faa80057b2a3cd1") : layoutInflater.inflate(R.layout.wm_ugc_media_ability_video_clip_block, viewGroup, false);
    }

    @Override // com.sankuai.waimai.ugc.creator.base.a
    public final String[] c() {
        return this.i;
    }

    @Override // com.sankuai.waimai.ugc.creator.base.a
    public final void bK_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77f74fffa934ee848b1d37693dd7b595", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77f74fffa934ee848b1d37693dd7b595");
            return;
        }
        h.a().a(A(), this.l);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4143e272237f42a5be4b8f179eff28a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4143e272237f42a5be4b8f179eff28a6");
            return;
        }
        n.a("initChildBlocks");
        this.b = new FlowLineActionBarBlock(0);
        a(R.id.fl_video_clip_actionbar_container, (int) this.b);
        this.c = new g(com.sankuai.waimai.foundation.utils.g.a(A()) - com.sankuai.waimai.foundation.utils.g.a(A(), 32.0f), (com.sankuai.waimai.foundation.utils.g.b(A()) - com.sankuai.waimai.foundation.utils.g.a(A(), 164.0f)) - com.sankuai.waimai.foundation.utils.g.e(A()));
        a(R.id.fl_video_clip_preview_container, (int) this.c);
        this.d = new f();
        a(R.id.fl_video_clip_control_block, (int) this.d);
    }

    @Override // com.sankuai.waimai.ugc.creator.manager.d
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ce57db6fbfcac1cc227cdb36839d2bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ce57db6fbfcac1cc227cdb36839d2bf");
        } else {
            u();
        }
    }

    @Override // com.sankuai.waimai.ugc.creator.manager.d
    public final void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "999b9657df7e8ef7483bc2454e3f3bdd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "999b9657df7e8ef7483bc2454e3f3bdd");
        } else {
            v();
        }
    }

    @Override // com.sankuai.waimai.ugc.creator.manager.d
    public final void a(final VideoData videoData) {
        Object[] objArr = {videoData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c2728296f9397c4b8e1d8f0138fa99f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c2728296f9397c4b8e1d8f0138fa99f");
        } else if (this.o.A != 1001) {
            b(videoData);
        } else {
            Object[] objArr2 = {videoData};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e11c9508fe694525a4d4203dd7761da6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e11c9508fe694525a4d4203dd7761da6");
                return;
            }
            u();
            b.a(new Runnable() { // from class: com.sankuai.waimai.ugc.creator.ability.videoclip.a.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    String str;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6508deea661293e5bba757052595f6f5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6508deea661293e5bba757052595f6f5");
                        return;
                    }
                    final ArrayList arrayList = new ArrayList();
                    e a2 = videoData.a();
                    String str2 = a2.e;
                    Object[] objArr4 = {str2};
                    ChangeQuickRedirect changeQuickRedirect4 = o.a;
                    if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "f42dc1ef403a2d862ae13fa145c8026a", RobustBitConfig.DEFAULT_VALUE)) {
                        str = (String) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "f42dc1ef403a2d862ae13fa145c8026a");
                    } else {
                        String str3 = "tmp_" + Long.toHexString(new Date().getTime()) + ".png";
                        o.a(str2, o.a(str3));
                        str = "wdfile://" + str3;
                    }
                    a2.a = str;
                    a2.b = "file://" + a2.h;
                    arrayList.add(a2);
                    b.b(new Runnable() { // from class: com.sankuai.waimai.ugc.creator.ability.videoclip.a.1.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr5 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect5 = a;
                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "28fbceae520bcaca827f7a1f86bfc80c", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "28fbceae520bcaca827f7a1f86bfc80c");
                                return;
                            }
                            a.this.v();
                            a.this.a((List<c>) arrayList, 2);
                        }
                    });
                }
            });
        }
    }

    @Override // com.sankuai.waimai.ugc.creator.base.a
    public final void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ae226c46c894d56fd7fee46e937f3a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ae226c46c894d56fd7fee46e937f3a3");
        } else {
            r();
        }
    }

    @Override // com.sankuai.waimai.ugc.creator.base.a
    public final void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b44d07a1bc7308244875eed9837cd42f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b44d07a1bc7308244875eed9837cd42f");
            return;
        }
        com.sankuai.waimai.ugc.creator.judas.e a2 = com.sankuai.waimai.ugc.creator.judas.e.a();
        Activity B = B();
        Object[] objArr2 = {B};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.ugc.creator.judas.e.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "65a8cb113a131e6ca2acadbc55d389a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "65a8cb113a131e6ca2acadbc55d389a1");
        } else if (a2.b != null) {
            a2.a(a2.b.x, a2.b.e, (Map<String, Object>) null, B);
        }
        long j = this.d.f;
        long j2 = this.d.g;
        if (this.o.f) {
            a(this.z, j, j2);
            return;
        }
        h.a().b(j, j2);
        h.a().a(A(), this.o.t, this);
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.Lifecycle
    public final void bM_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87bc385f1e82e88ae9e8bd66f4307833", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87bc385f1e82e88ae9e8bd66f4307833");
            return;
        }
        super.bM_();
        h.a().a((Bitmap) null);
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.b, com.sankuai.waimai.ugc.creator.framework.Lifecycle
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3407c4fdec8a409f8560e312104a57bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3407c4fdec8a409f8560e312104a57bd");
            return;
        }
        super.b();
        n.a("onDestroy");
        h.a().a(this.l);
    }
}
