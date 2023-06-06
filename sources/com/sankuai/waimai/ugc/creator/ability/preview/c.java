package com.sankuai.waimai.ugc.creator.ability.preview;

import android.content.Intent;
import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.ugc.creator.component.g;
import com.sankuai.waimai.ugc.creator.entity.inner.VideoData;
import com.sankuai.waimai.ugc.creator.manager.d;
import com.sankuai.waimai.ugc.creator.manager.h;
import com.sankuai.waimai.ugc.creator.utils.e;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends a implements d {
    public static ChangeQuickRedirect b;
    private g c;
    private final VideoData d;

    public c(VideoData videoData) {
        Object[] objArr = {videoData};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ff90d314a5efb314e0b37a01f4791a4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ff90d314a5efb314e0b37a01f4791a4");
        } else {
            this.d = videoData;
        }
    }

    @Override // com.sankuai.waimai.ugc.creator.base.b
    public final void a(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6947244845e85f21bda7a4be2c6470e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6947244845e85f21bda7a4be2c6470e9");
        } else if (this.d != null) {
            a("input_media_data", this.d);
        }
    }

    @Override // com.sankuai.waimai.ugc.creator.base.a
    public final String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88412c40090cd77173ec46af7acfc556", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88412c40090cd77173ec46af7acfc556") : B().getString(R.string.wm_ugc_media_permission_request_rationale_for_play, new Object[]{str});
    }

    @Override // com.sankuai.waimai.ugc.creator.base.a
    public final void bK_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "885cd2d8657df2e7930b33ed3f70a4b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "885cd2d8657df2e7930b33ed3f70a4b1");
        } else {
            h.a().a(A(), this.l);
        }
    }

    @Override // com.sankuai.waimai.ugc.creator.base.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73108ccbf7fba882c669a74b0f481017", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73108ccbf7fba882c669a74b0f481017");
        } else if (this.d == null) {
        } else {
            this.c = new g(com.sankuai.waimai.foundation.utils.g.a(A()), (com.sankuai.waimai.foundation.utils.g.b(A()) - com.sankuai.waimai.foundation.utils.g.a(A(), 65.0f)) - e.a(A()));
            a(R.id.fl_preview_container, (int) this.c);
        }
    }

    @Override // com.sankuai.waimai.ugc.creator.base.a
    public final void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4b72df1627643265e52d43e136391cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4b72df1627643265e52d43e136391cc");
        } else {
            h.a().a(A(), this.o.t, this);
        }
    }

    @Override // com.sankuai.waimai.ugc.creator.manager.d
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7204e19faeefdc2e71b1ff0c69d882de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7204e19faeefdc2e71b1ff0c69d882de");
        } else {
            u();
        }
    }

    @Override // com.sankuai.waimai.ugc.creator.manager.d
    public final void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a0facfc30a6311ffb7627795013ccfa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a0facfc30a6311ffb7627795013ccfa");
        } else {
            v();
        }
    }

    @Override // com.sankuai.waimai.ugc.creator.manager.d
    public final void a(VideoData videoData) {
        Object[] objArr = {videoData};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "096d97638061eca2d86604dac64f9fec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "096d97638061eca2d86604dac64f9fec");
        } else {
            b(videoData);
        }
    }

    @Override // com.sankuai.waimai.ugc.creator.manager.d
    public final void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41c4f8d1ec7349f5cb4977af9a51cd98", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41c4f8d1ec7349f5cb4977af9a51cd98");
        } else {
            b(this.d);
        }
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.Lifecycle
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5efcb79435038fa2f46ffdb26b436de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5efcb79435038fa2f46ffdb26b436de");
            return;
        }
        com.sankuai.waimai.ugc.creator.judas.e.a().a(B());
        super.a();
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.b, com.sankuai.waimai.ugc.creator.framework.Lifecycle
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c6a979d1d03c010420fb7e99517722d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c6a979d1d03c010420fb7e99517722d");
            return;
        }
        super.b();
        h.a().a(this.l);
    }
}
