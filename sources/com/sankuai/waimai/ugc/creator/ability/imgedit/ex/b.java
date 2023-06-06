package com.sankuai.waimai.ugc.creator.ability.imgedit.ex;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.ugc.creator.component.FlowLineActionBarBlock;
import com.sankuai.waimai.ugc.creator.entity.ImageEditInfo;
import com.sankuai.waimai.ugc.creator.entity.inner.ImageData;
import com.sankuai.waimai.ugc.creator.judas.e;
import com.sankuai.waimai.ugc.creator.utils.k;
import com.sankuai.waimai.ugc.creator.widgets.imageview.CropImageView;
import com.sankuai.waimai.ugc.creator.widgets.round.RoundCornerTextView;
import com.squareup.picasso.Picasso;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends com.sankuai.waimai.ugc.creator.base.b implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private float A;
    private boolean B;
    private float C;
    a b;
    private final ImageData c;
    private Bitmap d;
    private CropImageView e;
    private LinearLayout f;
    private RoundCornerTextView g;
    private RoundCornerTextView h;
    private RoundCornerTextView i;
    private RoundCornerTextView j;
    private RoundCornerTextView k;
    private FlowLineActionBarBlock l;
    private int m;
    private int z;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a(Bitmap bitmap);
    }

    public static /* synthetic */ void a(b bVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "3c86e9496fbd920987abb1a23a27b968", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "3c86e9496fbd920987abb1a23a27b968");
        } else if (bVar.e.getImageAreaInBounds() != null) {
            bVar.u();
            bVar.e.a(new com.sankuai.waimai.ugc.creator.widgets.imageview.c() { // from class: com.sankuai.waimai.ugc.creator.ability.imgedit.ex.b.6
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.ugc.creator.widgets.imageview.c
                public final void a(ImageData imageData) {
                    Object[] objArr2 = {imageData};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5ffc9f9016461b26b88376cfa3d7ec0b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5ffc9f9016461b26b88376cfa3d7ec0b");
                        return;
                    }
                    float[] suppMatrixValues = b.this.e.getSuppMatrixValues();
                    float cropBoundsRatio = b.this.e.getCropBoundsRatio();
                    b.this.c.h = imageData.h;
                    if (b.this.c.c == null) {
                        b.this.c.c = new ImageEditInfo();
                        b.this.c.c.b = b.this.c.e;
                        b.this.c.c.c = b.this.c.i;
                        b.this.c.c.d = b.this.c.k;
                    }
                    b.this.c.c.e = cropBoundsRatio;
                    b.this.c.c.f = suppMatrixValues;
                    Picasso.g(b.this.A()).d(imageData.h).a(new k() { // from class: com.sankuai.waimai.ugc.creator.ability.imgedit.ex.b.6.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.ugc.creator.utils.k, com.squareup.picasso.Target
                        public final void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
                            Object[] objArr3 = {bitmap, loadedFrom};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e5ed7e935cb70ea4dcf4eca1636ca591", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e5ed7e935cb70ea4dcf4eca1636ca591");
                                return;
                            }
                            b.this.v();
                            if (b.this.b != null) {
                                b.this.b.a(bitmap);
                            }
                            b.this.B().onBackPressed();
                        }

                        @Override // com.sankuai.waimai.ugc.creator.utils.k, com.squareup.picasso.Target
                        public final void onBitmapFailed(Drawable drawable) {
                            Object[] objArr3 = {drawable};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "dcd3a5566c52aaf5fe4546e1708e2f01", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "dcd3a5566c52aaf5fe4546e1708e2f01");
                            } else {
                                b.this.v();
                            }
                        }
                    });
                }
            });
        }
    }

    public static /* synthetic */ void a(b bVar, Bitmap bitmap) {
        Object[] objArr = {bitmap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "70393a6508f74389641d5779d848f585", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "70393a6508f74389641d5779d848f585");
            return;
        }
        bVar.d = bitmap;
        bVar.m = bVar.d.getWidth();
        bVar.z = bVar.d.getHeight();
        bVar.A = bVar.m / bVar.z;
        bVar.e.setImageBitmap(bitmap);
        if (bVar.c.c != null) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "74a96a8ce81fcfb43ce8cb45b3759d5c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "74a96a8ce81fcfb43ce8cb45b3759d5c");
                return;
            }
            if (bVar.c.c.f != null && bVar.c.c.f.length == 9) {
                Matrix matrix = new Matrix();
                matrix.setValues(bVar.c.c.f);
                bVar.e.setDisplayMatrix(matrix);
            }
            bVar.a(bVar.c.c.e);
            return;
        }
        bVar.a(bVar.A);
    }

    public b(ImageData imageData) {
        Object[] objArr = {imageData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e399c2462e8252076c49c083fb71d27e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e399c2462e8252076c49c083fb71d27e");
            return;
        }
        this.B = false;
        this.c = imageData;
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.b
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76c27832f32de628bda192e5564ce395", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76c27832f32de628bda192e5564ce395") : layoutInflater.inflate(R.layout.wm_ugc_creator_image_crop_block, viewGroup, false);
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.b
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1289ba3f1d1000db16598b64f2648ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1289ba3f1d1000db16598b64f2648ed");
            return;
        }
        this.e = (CropImageView) b(R.id.iv_image_crop);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c6a9c446ec62b6f89790989079996eda", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c6a9c446ec62b6f89790989079996eda");
        } else {
            View b = b(R.id.cl_image_crop_control_bar);
            this.f = (LinearLayout) b.findViewById(R.id.rtv_rotate_btn);
            this.g = (RoundCornerTextView) b.findViewById(R.id.rtv_crop_btn_og);
            this.h = (RoundCornerTextView) b.findViewById(R.id.rtv_crop_btn_3_4);
            this.i = (RoundCornerTextView) b.findViewById(R.id.rtv_crop_btn_1_1);
            this.j = (RoundCornerTextView) b.findViewById(R.id.rtv_crop_btn_4_3);
            this.f.setOnClickListener(this);
            this.g.setOnClickListener(this);
            this.h.setOnClickListener(this);
            this.i.setOnClickListener(this);
            this.j.setOnClickListener(this);
        }
        this.l = new FlowLineActionBarBlock(2);
        a(R.id.fl_image_crop_actionbar_block, (int) this.l);
        this.l.a(R.string.wm_ugc_image_edit_crop);
        this.l.j = new FlowLineActionBarBlock.a() { // from class: com.sankuai.waimai.ugc.creator.ability.imgedit.ex.b.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.ugc.creator.component.FlowLineActionBarBlock.a
            public final void a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3fe36c69416dbffce9ce5d1d9c28bd0b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3fe36c69416dbffce9ce5d1d9c28bd0b");
                    return;
                }
                e a2 = e.a();
                Activity B = b.this.B();
                Object[] objArr4 = {B};
                ChangeQuickRedirect changeQuickRedirect4 = e.a;
                if (PatchProxy.isSupport(objArr4, a2, changeQuickRedirect4, false, "0cc92be39400f2d40d4be2ef15246e8d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, a2, changeQuickRedirect4, false, "0cc92be39400f2d40d4be2ef15246e8d");
                } else if (a2.b != null) {
                    a2.a(a2.b.t, a2.b.h, (Map<String, Object>) null, B);
                }
                b.this.B().onBackPressed();
            }

            @Override // com.sankuai.waimai.ugc.creator.component.FlowLineActionBarBlock.a
            public final void b() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5ce4177ff265adeba9ab8a0893340020", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5ce4177ff265adeba9ab8a0893340020");
                    return;
                }
                e a2 = e.a();
                Activity B = b.this.B();
                Object[] objArr4 = {B};
                ChangeQuickRedirect changeQuickRedirect4 = e.a;
                if (PatchProxy.isSupport(objArr4, a2, changeQuickRedirect4, false, "2cd7e6bd935b6c23924c43245d63ef85", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, a2, changeQuickRedirect4, false, "2cd7e6bd935b6c23924c43245d63ef85");
                } else if (a2.b != null) {
                    a2.a(a2.b.s, a2.b.h, (Map<String, Object>) null, B);
                }
                b.a(b.this);
            }
        };
        this.s.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.ugc.creator.ability.imgedit.ex.b.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object[] objArr3 = {view2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f4e1a6f6baa85cdd774047acdf961e8f", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f4e1a6f6baa85cdd774047acdf961e8f");
                }
            }
        });
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7980b9567b6af54addee27c97bfb7294", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7980b9567b6af54addee27c97bfb7294");
        } else if (this.c != null) {
            if (!TextUtils.isEmpty(this.c.i)) {
                String str = this.c.i;
                Object[] objArr4 = {str};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "ea5662623912972abe9c404b289b010b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "ea5662623912972abe9c404b289b010b");
                } else {
                    Picasso.g(A()).d(str).a(new k() { // from class: com.sankuai.waimai.ugc.creator.ability.imgedit.ex.b.3
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.ugc.creator.utils.k, com.squareup.picasso.Target
                        public final void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
                            Object[] objArr5 = {bitmap, loadedFrom};
                            ChangeQuickRedirect changeQuickRedirect5 = a;
                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "31868246946016bcb17c29e86a2c4cfb", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "31868246946016bcb17c29e86a2c4cfb");
                            } else {
                                b.a(b.this, bitmap);
                            }
                        }
                    });
                }
            } else if (TextUtils.isEmpty(this.c.k)) {
            } else {
                String str2 = this.c.k;
                Object[] objArr5 = {str2};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "75b6f1e1f21a0590895e0b62d15ac902", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "75b6f1e1f21a0590895e0b62d15ac902");
                    return;
                }
                b.C0608b c = com.sankuai.meituan.mtimageloader.loader.a.c();
                c.b = A();
                c.c = str2;
                c.a(new b.a() { // from class: com.sankuai.waimai.ugc.creator.ability.imgedit.ex.b.4
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.meituan.mtimageloader.config.b.a
                    public final void a() {
                    }

                    @Override // com.sankuai.meituan.mtimageloader.config.b.a
                    public final void a(Bitmap bitmap) {
                        Object[] objArr6 = {bitmap};
                        ChangeQuickRedirect changeQuickRedirect6 = a;
                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "9799e12a899684895705119e772cdcd1", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "9799e12a899684895705119e772cdcd1");
                        } else {
                            b.a(b.this, bitmap);
                        }
                    }
                });
            }
        }
    }

    private void a(final float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd7ce4751f214df2d71d3b1c32a7f589", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd7ce4751f214df2d71d3b1c32a7f589");
        } else {
            this.e.post(new Runnable() { // from class: com.sankuai.waimai.ugc.creator.ability.imgedit.ex.b.5
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f7684bc668b064e5f3ea5af0511f24ed", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f7684bc668b064e5f3ea5af0511f24ed");
                    } else {
                        b.this.b(f);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4ebe6802ec1d7940580485235be7f5e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4ebe6802ec1d7940580485235be7f5e");
        } else if (f <= 0.875f) {
            e();
        } else if (f > 0.875f && f <= 1.1666666f) {
            f();
        } else {
            g();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "876c966ddd47dbaa447437cebd6cbb56", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "876c966ddd47dbaa447437cebd6cbb56");
            return;
        }
        int id = view.getId();
        if (id != R.id.rtv_rotate_btn) {
            if (id == R.id.rtv_crop_btn_og) {
                d();
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ba69b3ad039d591612ac01d6612b839a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ba69b3ad039d591612ac01d6612b839a");
                    return;
                } else if (a(this.g)) {
                    c(this.A);
                    return;
                } else {
                    return;
                }
            } else if (id == R.id.rtv_crop_btn_3_4) {
                d();
                e();
                return;
            } else if (id == R.id.rtv_crop_btn_1_1) {
                d();
                f();
                return;
            } else if (id == R.id.rtv_crop_btn_4_3) {
                d();
                g();
                return;
            } else {
                return;
            }
        }
        e a2 = e.a();
        Activity B = B();
        Object[] objArr3 = {B};
        ChangeQuickRedirect changeQuickRedirect3 = e.a;
        if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "796e40c7b16cd20830dbec028e72e11a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "796e40c7b16cd20830dbec028e72e11a");
        } else if (a2.b != null) {
            a2.a(a2.b.q, a2.b.h, (Map<String, Object>) null, B);
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "6069b8718dd56b5cc01cb4ec046ea366", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "6069b8718dd56b5cc01cb4ec046ea366");
            return;
        }
        CropImageView cropImageView = this.e;
        Object[] objArr5 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect5 = CropImageView.a;
        if (PatchProxy.isSupport(objArr5, cropImageView, changeQuickRedirect5, false, "5148120b73f8178a2a6803f2bdf77231", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, cropImageView, changeQuickRedirect5, false, "5148120b73f8178a2a6803f2bdf77231");
        } else {
            com.sankuai.waimai.ugc.creator.widgets.imageview.a aVar = cropImageView.b;
            Object[] objArr6 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.ugc.creator.widgets.imageview.a.a;
            if (PatchProxy.isSupport(objArr6, aVar, changeQuickRedirect6, false, "44febab5cf87d1a3ba60d347b6fcac25", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr6, aVar, changeQuickRedirect6, false, "44febab5cf87d1a3ba60d347b6fcac25");
            } else {
                Matrix matrix = aVar.d;
                Object[] objArr7 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect7 = com.sankuai.waimai.ugc.creator.widgets.imageview.a.a;
                float floatValue = PatchProxy.isSupport(objArr7, aVar, changeQuickRedirect7, false, "6c609d113c08a829650c395218ba89af", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr7, aVar, changeQuickRedirect7, false, "6c609d113c08a829650c395218ba89af")).floatValue() : aVar.g() * 0.5f;
                Object[] objArr8 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect8 = com.sankuai.waimai.ugc.creator.widgets.imageview.a.a;
                matrix.postRotate(-90.0f, floatValue, PatchProxy.isSupport(objArr8, aVar, changeQuickRedirect8, false, "e74fb1f400009d6aa38240aad4bc3ab6", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr8, aVar, changeQuickRedirect8, false, "e74fb1f400009d6aa38240aad4bc3ab6")).floatValue() : aVar.h() * 0.5f);
                if (aVar.g != null) {
                    float f = 1.3333334f;
                    if (aVar.h != 0.75f) {
                        f = aVar.h == 1.3333334f ? 0.75f : aVar.g.height() / aVar.g.width();
                    }
                    aVar.a(f, true, false);
                }
                aVar.e();
            }
        }
        this.C = this.e.getCropBoundsRatio();
        if (this.B) {
            return;
        }
        b(this.C);
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "856bf8a486adb1897c84b5ed4f36a691", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "856bf8a486adb1897c84b5ed4f36a691");
        } else {
            e.a().a((Object) B());
        }
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f475c6fae01571d66bb73b7125f33319", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f475c6fae01571d66bb73b7125f33319");
        } else if (a(this.h)) {
            c(0.75f);
        }
    }

    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c98f6d2da397c444ad0b3b7a6ff1ea8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c98f6d2da397c444ad0b3b7a6ff1ea8");
        } else if (a(this.i)) {
            c(1.0f);
        }
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5566efedc2dcf0f41f31ae7372b320fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5566efedc2dcf0f41f31ae7372b320fe");
        } else if (a(this.j)) {
            c(1.3333334f);
        }
    }

    private boolean a(RoundCornerTextView roundCornerTextView) {
        Object[] objArr = {roundCornerTextView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "306183cfadb33a2653eb91c1c253c2f3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "306183cfadb33a2653eb91c1c253c2f3")).booleanValue();
        }
        if (this.k == roundCornerTextView) {
            return false;
        }
        if (this.k != null) {
            int parseColor = Color.parseColor("#575859");
            this.k.setBorderColor(parseColor);
            this.k.setTextColor(parseColor);
        }
        if (roundCornerTextView != null) {
            int parseColor2 = Color.parseColor("#ffffff");
            roundCornerTextView.setBorderColor(parseColor2);
            roundCornerTextView.setTextColor(parseColor2);
        }
        this.k = roundCornerTextView;
        this.B = roundCornerTextView == this.g;
        return true;
    }

    private void c(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "976c7eeac17048f814730198e2205f4d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "976c7eeac17048f814730198e2205f4d");
            return;
        }
        this.C = f;
        this.e.setCropBoundsRatio(f);
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.Lifecycle
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c92305a88de9750de75c29886611d62e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c92305a88de9750de75c29886611d62e");
            return;
        }
        super.a();
        e.a().a(B(), true);
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.Lifecycle
    public final void bN_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9e2697c33aa7fd4598b7d90681d9962", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9e2697c33aa7fd4598b7d90681d9962");
            return;
        }
        super.bN_();
        e.a().a(B(), false);
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.b, com.sankuai.waimai.ugc.creator.framework.Lifecycle
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be9562464341d37ee4a5148812cab3c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be9562464341d37ee4a5148812cab3c1");
            return;
        }
        super.b();
        com.sankuai.waimai.ugc.creator.utils.task.b.a((Object) null);
        this.d = null;
    }
}
