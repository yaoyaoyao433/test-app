package com.sankuai.waimai.store.drug.home.refactor.card.background;

import android.arch.lifecycle.f;
import android.arch.lifecycle.l;
import android.arch.lifecycle.q;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.Shape;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.assembler.component.BaseCard;
import com.sankuai.waimai.store.drug.home.refactor.PoiPageViewModel;
import com.sankuai.waimai.store.drug.home.refactor.bean.PoiResult;
import com.sankuai.waimai.store.drug.home.util.b;
import com.sankuai.waimai.store.util.m;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class PoiBackgroundCard extends BaseCard implements l<PoiResult> {
    public static ChangeQuickRedirect h;
    private FrameLayout i;
    private com.sankuai.waimai.store.param.a j;
    private int k;

    public static /* synthetic */ void a(PoiBackgroundCard poiBackgroundCard, Canvas canvas, Paint paint) {
        Object[] objArr = {canvas, paint};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, poiBackgroundCard, changeQuickRedirect, false, "ea37a56a3fb008c1ecd69e1b475831df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, poiBackgroundCard, changeQuickRedirect, false, "ea37a56a3fb008c1ecd69e1b475831df");
            return;
        }
        paint.setColor(-1);
        int a = h.a((Context) poiBackgroundCard.e);
        boolean booleanValue = ((Boolean) b.b(poiBackgroundCard.j, b.g, Boolean.FALSE)).booleanValue();
        int a2 = poiBackgroundCard.k + h.a(poiBackgroundCard.e, 417.0f);
        float f = a;
        canvas.drawRect(0.0f, 0.0f, f, poiBackgroundCard.k, paint);
        float f2 = poiBackgroundCard.k;
        float f3 = a2;
        int[] iArr = {-1, -657930};
        float[] fArr = new float[2];
        fArr[0] = booleanValue ? 0.6f : 0.3f;
        fArr[1] = 1.0f;
        paint.setShader(new LinearGradient(0.0f, f2, 0.0f, f3, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.drawRect(0.0f, poiBackgroundCard.k, f, f3, paint);
    }

    @Override // android.arch.lifecycle.l
    public final /* synthetic */ void a(@Nullable PoiResult poiResult) {
        PoiResult poiResult2 = poiResult;
        Object[] objArr = {poiResult2};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9e9e480ec382b33d7e5b0cf613e33d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9e9e480ec382b33d7e5b0cf613e33d6");
        } else if (poiResult2 != null) {
            Object[] objArr2 = {poiResult2};
            ChangeQuickRedirect changeQuickRedirect2 = h;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "87c01092c8c80c33bc8de562dae9e90d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "87c01092c8c80c33bc8de562dae9e90d");
            } else {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = h;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d426d60608dc679855ff5d3d6723b399", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d426d60608dc679855ff5d3d6723b399");
                } else {
                    this.i.setBackground(new ShapeDrawable(new Shape() { // from class: com.sankuai.waimai.store.drug.home.refactor.card.background.PoiBackgroundCard.2
                        public static ChangeQuickRedirect a;

                        @Override // android.graphics.drawable.shapes.Shape
                        public final void draw(Canvas canvas, Paint paint) {
                            Object[] objArr4 = {canvas, paint};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "abdf4789e9fc2154dc8d697cc97c04f4", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "abdf4789e9fc2154dc8d697cc97c04f4");
                                return;
                            }
                            paint.setColor(-1);
                            int a2 = h.a((Context) PoiBackgroundCard.this.e);
                            int b = h.b(PoiBackgroundCard.this.e);
                            float f = a2;
                            canvas.drawRect(0.0f, 0.0f, f, PoiBackgroundCard.this.k, paint);
                            paint.setColor(-657930);
                            canvas.drawRect(0.0f, PoiBackgroundCard.this.k, f, b, paint);
                        }
                    }));
                }
            }
            if (this.f != null) {
                if (this.j.aa) {
                    final int a = h.a((Context) this.e);
                    final int a2 = h.a(this.e, 265.0f);
                    m.a(poiResult2.response.drugBackgroundConfig.marketBgPicUrl, a, new b.a() { // from class: com.sankuai.waimai.store.drug.home.refactor.card.background.PoiBackgroundCard.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.meituan.mtimageloader.config.b.a
                        public final void a(Bitmap bitmap) {
                            Object[] objArr4 = {bitmap};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "c1d30860040b0400ab8756397b337c43", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "c1d30860040b0400ab8756397b337c43");
                                return;
                            }
                            if (bitmap != null && bitmap.getWidth() > 0 && bitmap.getHeight() > 0) {
                                try {
                                    final Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, a, a2, false);
                                    PoiBackgroundCard.this.f.b().setBackground(new ShapeDrawable(new Shape() { // from class: com.sankuai.waimai.store.drug.home.refactor.card.background.PoiBackgroundCard.1.1
                                        public static ChangeQuickRedirect a;

                                        @Override // android.graphics.drawable.shapes.Shape
                                        public final void draw(Canvas canvas, Paint paint) {
                                            Object[] objArr5 = {canvas, paint};
                                            ChangeQuickRedirect changeQuickRedirect5 = a;
                                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "780591d066269b0f267b6dd772bc53f4", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "780591d066269b0f267b6dd772bc53f4");
                                                return;
                                            }
                                            PoiBackgroundCard.a(PoiBackgroundCard.this, canvas, paint);
                                            canvas.drawBitmap(createScaledBitmap, 0.0f, 0.0f, paint);
                                        }
                                    }));
                                    return;
                                } catch (Exception unused) {
                                }
                            }
                            a();
                        }

                        @Override // com.sankuai.meituan.mtimageloader.config.b.a
                        public final void a() {
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "e7c8f06d57923f508580089f3a780043", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "e7c8f06d57923f508580089f3a780043");
                                return;
                            }
                            PoiBackgroundCard.this.j.aa = false;
                            PoiBackgroundCard.this.c();
                            PoiBackgroundCard.this.f.a();
                            PoiBackgroundCard.this.b((PoiBackgroundCard) new a());
                        }
                    });
                    return;
                }
                c();
            }
        }
    }

    public PoiBackgroundCard(f fVar, FragmentActivity fragmentActivity) {
        super(fVar, fragmentActivity);
        Object[] objArr = {fVar, fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18aa8cf7a3f60188c000c55900008576", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18aa8cf7a3f60188c000c55900008576");
        } else {
            this.k = h.a(this.e, 48.0f) + u.a();
        }
    }

    @Override // com.sankuai.waimai.store.assembler.component.BaseCard
    @NonNull
    public final View a(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3937aaeed75bf6606e219369643b945b", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3937aaeed75bf6606e219369643b945b") : LayoutInflater.from(this.e).inflate(R.layout.wm_drug_home_channel_refactor_background_card, viewGroup);
    }

    @Override // com.sankuai.waimai.store.assembler.component.BaseCard
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc6242b8d6242c2ba151b47d85778421", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc6242b8d6242c2ba151b47d85778421");
            return;
        }
        super.a(view);
        this.i = (FrameLayout) a(R.id.fl_background_root);
        PoiPageViewModel poiPageViewModel = (PoiPageViewModel) q.a(this.e).a(PoiPageViewModel.class);
        this.j = poiPageViewModel.d.a();
        poiPageViewModel.b.a(this.d, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0efebf131df938e4b70b8eca67196607", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0efebf131df938e4b70b8eca67196607");
            return;
        }
        Shape shape = new Shape() { // from class: com.sankuai.waimai.store.drug.home.refactor.card.background.PoiBackgroundCard.3
            public static ChangeQuickRedirect a;

            @Override // android.graphics.drawable.shapes.Shape
            public final void draw(Canvas canvas, Paint paint) {
                Object[] objArr2 = {canvas, paint};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "83a23d30d0fa1b075c5315e05bf71f7e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "83a23d30d0fa1b075c5315e05bf71f7e");
                } else {
                    PoiBackgroundCard.a(PoiBackgroundCard.this, canvas, paint);
                }
            }
        };
        if (this.f != null) {
            this.f.b().setBackground(new ShapeDrawable(shape));
        }
    }

    @Override // com.sankuai.waimai.store.assembler.component.BaseCard
    public final void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2dff8016879cd675a5cc7d97566721b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2dff8016879cd675a5cc7d97566721b7");
        } else {
            super.onDestroy();
        }
    }
}
