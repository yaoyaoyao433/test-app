package com.sankuai.waimai.ugc.creator.component;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtlive.ugc.library.d;
import com.sankuai.meituan.mtlive.ugc.library.interfaces.c;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.ugc.creator.entity.inner.VideoData;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class g extends com.sankuai.waimai.ugc.creator.base.b {
    public static ChangeQuickRedirect a;
    private long b;
    private long c;
    private d.b d;
    private final int e;
    private final int f;

    public g(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4c0662e873205f67e5cb40e20699e5d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4c0662e873205f67e5cb40e20699e5d");
            return;
        }
        this.e = i2;
        this.f = i;
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.b
    public final View a(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18ab90e41770d1b7d018ef5e8a33f5c4", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18ab90e41770d1b7d018ef5e8a33f5c4") : layoutInflater.inflate(R.layout.wm_ugc_media_video_editor_preview_block, viewGroup, false);
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.b
    public final void a(@NonNull View view) {
        Object accessDispatch;
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97d49c6f8e55811bf7a8e72e177d18d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97d49c6f8e55811bf7a8e72e177d18d6");
            return;
        }
        super.a(view);
        FrameLayout frameLayout = (FrameLayout) b(R.id.fl_video_preview_container);
        Object[] objArr2 = {"input_media_data"};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.ugc.creator.framework.b.r;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c3ba7655e42319a1d9d647054a2e5917", RobustBitConfig.DEFAULT_VALUE)) {
            accessDispatch = PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c3ba7655e42319a1d9d647054a2e5917");
        } else {
            com.sankuai.waimai.ugc.creator.framework.e eVar = this.t;
            Object[] objArr3 = {"input_media_data"};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.ugc.creator.framework.e.a;
            accessDispatch = PatchProxy.isSupport(objArr3, eVar, changeQuickRedirect3, false, "f39af65933a0db641c541c30e3f29437", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr3, eVar, changeQuickRedirect3, false, "f39af65933a0db641c541c30e3f29437") : eVar.a().get("input_media_data");
        }
        VideoData videoData = (VideoData) accessDispatch;
        if (videoData == null) {
            return;
        }
        this.b = ((Long) b("clipStartTime", (String) 0L)).longValue();
        this.c = ((Long) b("clipEndTime", (String) Long.valueOf(videoData.b))).longValue();
        String str = videoData.h;
        int i = this.f;
        int i2 = -1;
        if (videoData.l <= 0 || videoData.m <= 0) {
            i = -1;
        } else {
            float f = (videoData.m * 1.0f) / videoData.l;
            int i3 = (int) (i * f);
            if (f < 1.0f || i3 <= this.e) {
                i2 = i3;
            } else {
                i2 = this.e;
                i = (int) (i2 / f);
            }
        }
        ah.b(frameLayout, i, i2);
        com.sankuai.waimai.ugc.creator.manager.h a2 = com.sankuai.waimai.ugc.creator.manager.h.a();
        Object[] objArr4 = {str};
        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.ugc.creator.manager.h.a;
        if (PatchProxy.isSupport(objArr4, a2, changeQuickRedirect4, false, "717dcd68fae1c64fe87729ceba8ef755", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, a2, changeQuickRedirect4, false, "717dcd68fae1c64fe87729ceba8ef755");
        } else if (!TextUtils.equals(str, a2.e) && !TextUtils.isEmpty(str) && a2.b != null) {
            a2.b.a(str);
            a2.e = str;
        }
        this.d = new d.b();
        this.d.b = 2;
        this.d.a = frameLayout;
        com.sankuai.waimai.ugc.creator.manager.h.a().a(this.d);
        com.sankuai.waimai.ugc.creator.manager.h a3 = com.sankuai.waimai.ugc.creator.manager.h.a();
        c.InterfaceC0619c interfaceC0619c = new c.InterfaceC0619c() { // from class: com.sankuai.waimai.ugc.creator.component.g.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.mtlive.ugc.library.interfaces.c.InterfaceC0619c
            public final void a() {
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "988488ea6a8ea542f264db16aca8ea2d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "988488ea6a8ea542f264db16aca8ea2d");
                } else {
                    com.sankuai.waimai.ugc.creator.manager.h.a().b();
                }
            }
        };
        Object[] objArr5 = {interfaceC0619c};
        ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.ugc.creator.manager.h.a;
        if (PatchProxy.isSupport(objArr5, a3, changeQuickRedirect5, false, "d41b0bf170a3eddb88a3d126f0a3a3ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, a3, changeQuickRedirect5, false, "d41b0bf170a3eddb88a3d126f0a3a3ec");
        } else {
            a3.b.a(interfaceC0619c);
        }
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.Lifecycle
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0631c754153b7b01a69411ea56321d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0631c754153b7b01a69411ea56321d8");
            return;
        }
        super.a();
        com.sankuai.waimai.ugc.creator.manager.h.a().a(this.d);
        com.sankuai.waimai.ugc.creator.manager.h.a().a(this.b, this.c);
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.Lifecycle
    public final void o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0898468551a70464b3dd93952c4abe9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0898468551a70464b3dd93952c4abe9d");
            return;
        }
        super.o();
        com.sankuai.waimai.ugc.creator.manager.h a2 = com.sankuai.waimai.ugc.creator.manager.h.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.ugc.creator.manager.h.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "87f5829fd2806745ddc36611a64fd3ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "87f5829fd2806745ddc36611a64fd3ec");
        } else if (a2.b == null || !a2.c) {
        } else {
            a2.b.d();
            a2.c = false;
        }
    }
}
