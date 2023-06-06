package com.sankuai.waimai.ugc.creator.ability.camera;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.ugc.creator.component.c;
import com.sankuai.waimai.ugc.creator.component.h;
import com.sankuai.waimai.ugc.creator.component.i;
import com.sankuai.waimai.ugc.creator.entity.inner.ImageData;
import com.sankuai.waimai.ugc.creator.entity.inner.MediaData;
import com.sankuai.waimai.ugc.creator.manager.g;
import com.sankuai.waimai.ugc.creator.utils.j;
import com.sankuai.waimai.ugc.creator.utils.n;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.ugc.creator.base.a implements com.sankuai.waimai.ugc.creator.manager.a {
    public static ChangeQuickRedirect a;
    private int A;
    private h b;
    private i c;
    private c d;
    private List<ImageData> z;

    public a(Fragment fragment) {
        super(fragment);
        Object[] objArr = {fragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "950b1ca4366dd5519457a9861e6ff2a1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "950b1ca4366dd5519457a9861e6ff2a1");
        }
    }

    @Override // com.sankuai.waimai.ugc.creator.base.b
    public final void a(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "822219122c190f3f8e20626d240d2912", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "822219122c190f3f8e20626d240d2912");
            return;
        }
        this.A = j.a(w(), "KEY_ENABLE_ADD_MODE", 0);
        if (s()) {
            this.z = intent.getParcelableArrayListExtra("PreSelectedImageList");
        } else {
            this.z = com.sankuai.waimai.ugc.creator.utils.c.a(intent);
        }
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.b
    public final View a(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54d5dbbe212e374cc9bbb3b4a98ffa9f", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54d5dbbe212e374cc9bbb3b4a98ffa9f") : layoutInflater.inflate(R.layout.wm_ugc_media_ability_camera_photo_block, viewGroup, false);
    }

    @Override // com.sankuai.waimai.ugc.creator.base.a
    public final String[] c() {
        return this.h;
    }

    @Override // com.sankuai.waimai.ugc.creator.base.a
    public final String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd5e029077ebd3c44d6b53d3bcaf3ee1", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd5e029077ebd3c44d6b53d3bcaf3ee1") : B().getString(R.string.wm_ugc_media_permission_request_rationale_for_take_photo, new Object[]{str});
    }

    @Override // com.sankuai.waimai.ugc.creator.base.a
    public final void bK_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c66c98c54af0e467037851836a6c8f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c66c98c54af0e467037851836a6c8f6");
            return;
        }
        g.a().a(A(), this.l);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a2ef406567aebf513778e2fcbd4a9b1d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a2ef406567aebf513778e2fcbd4a9b1d");
            return;
        }
        n.a("initChildBlocks");
        this.b = new h();
        a(R.id.photo_camera_actionbar_container, (int) this.b);
        FrameLayout frameLayout = (FrameLayout) b(R.id.photo_camera_viewfinder_container);
        this.c = new i();
        a((ViewGroup) frameLayout, (FrameLayout) this.c);
        ah.b(frameLayout, Integer.MIN_VALUE, (com.sankuai.waimai.foundation.utils.g.a(A()) * 4) / 3);
        this.d = new c();
        a(R.id.photo_camera_control_container, (int) this.d);
    }

    @Override // com.sankuai.waimai.ugc.creator.manager.a
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23cce90ed02a5db9efefb1462f476040", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23cce90ed02a5db9efefb1462f476040");
        } else {
            u();
        }
    }

    @Override // com.sankuai.waimai.ugc.creator.manager.a
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9004ba8f0145e10230d95fe2bf632f94", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9004ba8f0145e10230d95fe2bf632f94");
        } else {
            v();
        }
    }

    @Override // com.sankuai.waimai.ugc.creator.manager.a
    public final void a(ImageData imageData) {
        Object[] objArr = {imageData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6045c9299f05cdf4ea6e6f21396312d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6045c9299f05cdf4ea6e6f21396312d6");
            return;
        }
        Object[] objArr2 = {imageData};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "833b8161d8009773047548ddca3d2fc7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "833b8161d8009773047548ddca3d2fc7");
            return;
        }
        ArrayList<ImageData> arrayList = new ArrayList<>();
        arrayList.add(imageData);
        if (this.A == 1) {
            a(arrayList, 1, -1);
        } else if (this.o.g) {
            if (!com.sankuai.waimai.foundation.utils.b.b(this.z)) {
                arrayList.addAll(0, this.z);
            }
            a(arrayList, -1);
        } else {
            a((MediaData) imageData);
        }
    }

    @Override // com.sankuai.waimai.ugc.creator.base.a
    public final void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39ec023fe2b4713fa944ee80757d50d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39ec023fe2b4713fa944ee80757d50d3");
        } else {
            r();
        }
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.Lifecycle
    public final void bM_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7430a0bb53a4ec63377fcf6b60c467bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7430a0bb53a4ec63377fcf6b60c467bf");
            return;
        }
        super.bM_();
        g.a().d = this;
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.b, com.sankuai.waimai.ugc.creator.framework.Lifecycle
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5250ea73deeb7285e606e3aa18617c3d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5250ea73deeb7285e606e3aa18617c3d");
            return;
        }
        super.b();
        n.a("onDestroy");
        g.a().a(this.l);
    }
}
