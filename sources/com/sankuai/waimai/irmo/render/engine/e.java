package com.sankuai.waimai.irmo.render.engine;

import android.graphics.drawable.Drawable;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.foundation.utils.ImageQualityUtil;
import com.sankuai.waimai.irmo.render.a;
import com.sankuai.waimai.irmo.render.bean.layers.IrmoLayerInfo;
import com.sankuai.waimai.irmo.render.bean.layers.ScratchCardEffectParams;
import com.sankuai.waimai.irmo.render.i;
import com.sankuai.waimai.irmo.render.view.IrmoScratchCardView;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e extends c {
    public static ChangeQuickRedirect a;
    int b;
    int c;
    @NonNull
    private final List<View> d;
    private g e;
    private boolean f;
    private int g;
    private int h;
    private IrmoLayerInfo o;

    @Override // com.sankuai.waimai.irmo.render.engine.a
    @MainThread
    public final void a() {
    }

    @Override // com.sankuai.waimai.irmo.render.engine.a
    public final void c() {
    }

    @Override // com.sankuai.waimai.irmo.render.engine.a
    public final void d() {
    }

    @Override // com.sankuai.waimai.irmo.render.engine.a
    public final void e() {
    }

    @Override // com.sankuai.waimai.irmo.render.engine.c
    public final void g() {
    }

    @Override // com.sankuai.waimai.irmo.render.engine.c
    public final void h() {
    }

    @Override // com.sankuai.waimai.irmo.render.engine.c
    public final void i() {
    }

    public e(com.sankuai.waimai.irmo.render.a aVar, i iVar, com.sankuai.waimai.irmo.render.f fVar) {
        super(aVar, iVar, fVar);
        Object[] objArr = {aVar, iVar, fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8962f9e72d8107c899b7a178b7b22a48", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8962f9e72d8107c899b7a178b7b22a48");
            return;
        }
        this.b = -1;
        this.c = -1;
        this.f = false;
        this.g = -1;
        this.h = -1;
        this.o = null;
        this.d = new ArrayList();
    }

    @Override // com.sankuai.waimai.irmo.render.engine.c
    public final void a(g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7ea3a6d798de3042dd43a30b7189520", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7ea3a6d798de3042dd43a30b7189520");
            return;
        }
        if (this.k != null) {
            this.k.a("InfiniteEngineWillPlay", 1008);
        }
        this.e = gVar;
        if (this.e == null || this.o == null) {
            return;
        }
        if (this.g == 1) {
            if (this.k != null) {
                this.k.a(true, 1008, this.h);
            }
            this.e.a(this.o, true);
        } else if (this.g == 0) {
            if (this.k != null) {
                this.k.a(false, 1008, this.h);
            }
            this.e.a(this.o, false);
        }
    }

    @Override // com.sankuai.waimai.irmo.render.engine.c, com.sankuai.waimai.irmo.render.engine.a
    public final void a(@NonNull final IrmoLayerInfo irmoLayerInfo, View view) {
        Object[] objArr = {irmoLayerInfo, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bdbdbaaac383169cf52a84458f82681d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bdbdbaaac383169cf52a84458f82681d");
            return;
        }
        super.a(irmoLayerInfo, view);
        this.o = irmoLayerInfo;
        final IrmoScratchCardView irmoScratchCardView = new IrmoScratchCardView(com.meituan.android.singleton.b.a);
        if (irmoLayerInfo.effectParams instanceof ScratchCardEffectParams) {
            ScratchCardEffectParams scratchCardEffectParams = (ScratchCardEffectParams) irmoLayerInfo.effectParams;
            if (TextUtils.isEmpty(scratchCardEffectParams.image)) {
                a(irmoLayerInfo, false, 1002);
                return;
            }
            this.d.add(irmoScratchCardView);
            final ImageView imageView = null;
            if (!TextUtils.isEmpty(scratchCardEffectParams.guideImage)) {
                imageView = new ImageView(com.meituan.android.singleton.b.a);
                b.C0608b c = com.sankuai.meituan.mtimageloader.loader.a.c();
                c.b = com.meituan.android.singleton.b.a;
                c.c = scratchCardEffectParams.guideImage;
                c.f = ImageQualityUtil.a(0);
                c.h = new b.c() { // from class: com.sankuai.waimai.irmo.render.engine.e.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.meituan.mtimageloader.config.b.c
                    public final void a() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5199422fff210da88632321da6b2932e", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5199422fff210da88632321da6b2932e");
                            return;
                        }
                        e.this.b = 1;
                        e.this.a(irmoLayerInfo, true, 1);
                    }

                    @Override // com.sankuai.meituan.mtimageloader.config.b.c
                    public final void b() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "31047b36ff53d3ab448921576ff760d6", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "31047b36ff53d3ab448921576ff760d6");
                            return;
                        }
                        e.this.b = 0;
                        irmoScratchCardView.setVisibility(8);
                        imageView.setVisibility(8);
                        e.this.a(irmoLayerInfo, false, 1004);
                    }
                };
                c.a(imageView);
                this.d.add(imageView);
            } else {
                this.b = 1;
            }
            irmoScratchCardView.setTouchWidth(scratchCardEffectParams.brushWidth);
            irmoScratchCardView.setClearPercent(scratchCardEffectParams.scratchPercent);
            irmoScratchCardView.setAnimDuration(scratchCardEffectParams.clearDuration * 1000.0f);
            irmoScratchCardView.setScratchCardListener(new IrmoScratchCardView.a() { // from class: com.sankuai.waimai.irmo.render.engine.e.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.irmo.render.view.IrmoScratchCardView.a
                public final void a(boolean z) {
                    Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a30f045b0b70df29ff0f32b138f98259", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a30f045b0b70df29ff0f32b138f98259");
                    } else if (!z || imageView == null) {
                    } else {
                        e.this.j.a(a.EnumC0973a.effect_start, null);
                        imageView.setVisibility(8);
                    }
                }

                @Override // com.sankuai.waimai.irmo.render.view.IrmoScratchCardView.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b5a15f8ed96fc3ba83fb8b99e249068c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b5a15f8ed96fc3ba83fb8b99e249068c");
                    } else {
                        e.this.j.a(a.EnumC0973a.effect_finished, null);
                    }
                }
            });
            irmoScratchCardView.setVisibility(0);
            b.C0608b c2 = com.sankuai.meituan.mtimageloader.loader.a.c();
            c2.b = irmoScratchCardView.getContext();
            c2.c = scratchCardEffectParams.image;
            c2.e = 1;
            c2.a(new com.sankuai.meituan.mtimageloader.utils.b() { // from class: com.sankuai.waimai.irmo.render.engine.e.3
                public static ChangeQuickRedirect a;

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.sankuai.meituan.mtimageloader.utils.b, com.sankuai.meituan.mtimageloader.utils.d
                public final void a(Drawable drawable) {
                    Object[] objArr2 = {drawable};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "da2ada01d26cd2752ba285cbad955044", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "da2ada01d26cd2752ba285cbad955044");
                        return;
                    }
                    super.a(drawable);
                    e.this.c = 1;
                    IrmoScratchCardView irmoScratchCardView2 = irmoScratchCardView;
                    Object[] objArr3 = {drawable};
                    ChangeQuickRedirect changeQuickRedirect3 = IrmoScratchCardView.a;
                    if (PatchProxy.isSupport(objArr3, irmoScratchCardView2, changeQuickRedirect3, false, "78edf071913db9fd7b51a6797804a4f2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, irmoScratchCardView2, changeQuickRedirect3, false, "78edf071913db9fd7b51a6797804a4f2");
                    } else if (drawable != null) {
                        irmoScratchCardView2.b = drawable;
                        irmoScratchCardView2.a(irmoScratchCardView2.getWidth(), irmoScratchCardView2.getHeight());
                    }
                    e.this.a(irmoLayerInfo, true, 1);
                }

                @Override // com.sankuai.meituan.mtimageloader.utils.b, com.sankuai.meituan.mtimageloader.utils.d
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4a38d13116e8bdfd443b4f390ed9d6e1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4a38d13116e8bdfd443b4f390ed9d6e1");
                        return;
                    }
                    super.a();
                    e.this.c = 0;
                    irmoScratchCardView.setVisibility(8);
                    imageView.setVisibility(8);
                    e.this.a(irmoLayerInfo, false, 1003);
                }
            });
            return;
        }
        a(irmoLayerInfo, false, 1001);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(IrmoLayerInfo irmoLayerInfo, boolean z, int i) {
        Object[] objArr = {irmoLayerInfo, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "751f89aef93201a7ae97d128ca9e0956", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "751f89aef93201a7ae97d128ca9e0956");
        } else if (this.f) {
        } else {
            this.h = i;
            if (z) {
                if (this.c == 1 && this.b == 1) {
                    this.f = true;
                    this.h = 0;
                    if (this.e != null) {
                        if (this.k != null) {
                            this.k.a(true, 1008, this.h);
                        }
                        this.e.a(irmoLayerInfo, true);
                        return;
                    }
                    this.g = 1;
                    return;
                }
                return;
            }
            this.f = true;
            if (this.e != null) {
                if (this.k != null) {
                    this.k.a(false, 1008, this.h);
                }
                this.e.a(irmoLayerInfo, false);
                return;
            }
            this.g = 0;
        }
    }

    @Override // com.sankuai.waimai.irmo.render.engine.a
    @NonNull
    public final List<View> b() {
        return this.d;
    }
}
