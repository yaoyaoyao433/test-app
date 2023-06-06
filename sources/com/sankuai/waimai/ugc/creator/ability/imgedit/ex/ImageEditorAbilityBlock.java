package com.sankuai.waimai.ugc.creator.ability.imgedit.ex;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.dianping.shield.entity.ExposeAction;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.dialog.RooAlertDialog;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.platform.utils.f;
import com.sankuai.waimai.ugc.creator.ability.imgedit.ex.b;
import com.sankuai.waimai.ugc.creator.component.FlowLineActionBarBlock;
import com.sankuai.waimai.ugc.creator.component.b;
import com.sankuai.waimai.ugc.creator.entity.inner.ImageData;
import com.sankuai.waimai.ugc.creator.judas.e;
import com.sankuai.waimai.ugc.creator.utils.g;
import com.sankuai.waimai.ugc.creator.utils.j;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class ImageEditorAbilityBlock extends com.sankuai.waimai.ugc.creator.base.a implements a, com.sankuai.waimai.ugc.creator.handler.b, com.sankuai.waimai.ugc.creator.handler.d {
    public static ChangeQuickRedirect a;
    private ViewPager A;
    private ImageViewPagerAdapter B;
    private View C;
    private ValueAnimator D;
    private ArrayList<ImageData> E;
    private int F;
    private FlowLineActionBarBlock b;
    private com.sankuai.waimai.ugc.creator.component.d c;
    private com.sankuai.waimai.ugc.creator.component.b d;
    private b z;

    public static /* synthetic */ void a(ImageEditorAbilityBlock imageEditorAbilityBlock, com.sankuai.waimai.ugc.creator.entity.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, imageEditorAbilityBlock, changeQuickRedirect, false, "3dd085879a52a95c23809b2e2f9b029b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, imageEditorAbilityBlock, changeQuickRedirect, false, "3dd085879a52a95c23809b2e2f9b029b");
            return;
        }
        imageEditorAbilityBlock.e();
        g.a("b_waimai_quj7vw51_mc", "c_waimai_n2dalt8s", imageEditorAbilityBlock.B()).a();
        ImageData imageData = imageEditorAbilityBlock.E.get(imageEditorAbilityBlock.F);
        if (!com.sankuai.waimai.foundation.utils.b.b(imageData.b) && imageData.b.size() >= 4) {
            imageEditorAbilityBlock.b("最多可添加4个标签哦");
            return;
        }
        ArrayList<com.sankuai.waimai.ugc.creator.entity.c> a2 = com.sankuai.waimai.ugc.creator.utils.c.a(imageEditorAbilityBlock.E);
        Uri parse = Uri.parse(Uri.decode(aVar.e));
        Bundle bundle = new Bundle();
        bundle.putString("picList", new Gson().toJson(a2));
        bundle.putString("businessInfo", imageEditorAbilityBlock.o.z);
        bundle.putInt("index", imageEditorAbilityBlock.F);
        com.sankuai.waimai.foundation.router.a.a(imageEditorAbilityBlock.B(), parse.toString(), bundle, 17);
    }

    public static /* synthetic */ void c(ImageEditorAbilityBlock imageEditorAbilityBlock) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, imageEditorAbilityBlock, changeQuickRedirect, false, "0fa650b8d09caec4c5e5f11fa9234a0d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, imageEditorAbilityBlock, changeQuickRedirect, false, "0fa650b8d09caec4c5e5f11fa9234a0d");
            return;
        }
        FlowLineActionBarBlock flowLineActionBarBlock = imageEditorAbilityBlock.b;
        int i = imageEditorAbilityBlock.F + 1;
        int size = imageEditorAbilityBlock.E.size();
        Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(size)};
        ChangeQuickRedirect changeQuickRedirect2 = FlowLineActionBarBlock.a;
        if (PatchProxy.isSupport(objArr2, flowLineActionBarBlock, changeQuickRedirect2, false, "85073fd2a34b8029f388c0353a8bec52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, flowLineActionBarBlock, changeQuickRedirect2, false, "85073fd2a34b8029f388c0353a8bec52");
            return;
        }
        flowLineActionBarBlock.e.setText(String.valueOf(i));
        flowLineActionBarBlock.f.setText(String.valueOf(size));
        flowLineActionBarBlock.d.setVisibility(0);
        flowLineActionBarBlock.g.setVisibility(8);
    }

    public static /* synthetic */ void f(ImageEditorAbilityBlock imageEditorAbilityBlock) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, imageEditorAbilityBlock, changeQuickRedirect, false, "4e4718c8db42f88c19861eada9cede1d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, imageEditorAbilityBlock, changeQuickRedirect, false, "4e4718c8db42f88c19861eada9cede1d");
            return;
        }
        e a2 = e.a();
        Activity B = imageEditorAbilityBlock.B();
        Object[] objArr2 = {B};
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "6e06a7b57d4967189b1f79960a5f3a52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "6e06a7b57d4967189b1f79960a5f3a52");
        } else if (a2.b != null) {
            a2.a(a2.b.n, a2.b.g, (Map<String, Object>) null, B);
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, imageEditorAbilityBlock, changeQuickRedirect3, false, "9d3e5c29e4a021fc9cdd6235e1f46ad2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, imageEditorAbilityBlock, changeQuickRedirect3, false, "9d3e5c29e4a021fc9cdd6235e1f46ad2");
            return;
        }
        ImageData imageData = imageEditorAbilityBlock.E.get(imageEditorAbilityBlock.F);
        if (imageData != null) {
            imageEditorAbilityBlock.z = new b(imageData);
            imageEditorAbilityBlock.a(R.id.fl_image_crop_block_container, (int) imageEditorAbilityBlock.z);
            imageEditorAbilityBlock.z.c(0);
            imageEditorAbilityBlock.z.b = new b.a() { // from class: com.sankuai.waimai.ugc.creator.ability.imgedit.ex.ImageEditorAbilityBlock.8
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.ugc.creator.ability.imgedit.ex.b.a
                public final void a(Bitmap bitmap) {
                    Object[] objArr4 = {bitmap};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "7f82f83f1319aadb0c1d7b762f333c71", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "7f82f83f1319aadb0c1d7b762f333c71");
                        return;
                    }
                    ImageEditorAbilityBlock imageEditorAbilityBlock2 = ImageEditorAbilityBlock.this;
                    Object[] objArr5 = {bitmap};
                    ChangeQuickRedirect changeQuickRedirect5 = ImageEditorAbilityBlock.a;
                    if (PatchProxy.isSupport(objArr5, imageEditorAbilityBlock2, changeQuickRedirect5, false, "a1f0af74d4ea4695d87977cdc8f25b6b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, imageEditorAbilityBlock2, changeQuickRedirect5, false, "a1f0af74d4ea4695d87977cdc8f25b6b");
                        return;
                    }
                    ImageTagEditorPagerFragment g = imageEditorAbilityBlock2.g();
                    Object[] objArr6 = {bitmap};
                    ChangeQuickRedirect changeQuickRedirect6 = ImageTagEditorPagerFragment.a;
                    if (PatchProxy.isSupport(objArr6, g, changeQuickRedirect6, false, "1e5eb6a6d01e54f3f1eed8caa5d633fc", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, g, changeQuickRedirect6, false, "1e5eb6a6d01e54f3f1eed8caa5d633fc");
                    } else {
                        g.b.a(bitmap);
                    }
                }
            };
        }
    }

    public ImageEditorAbilityBlock() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e78a84fd133dea760055dcc6b0cd98c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e78a84fd133dea760055dcc6b0cd98c");
            return;
        }
        this.F = 0;
        this.m = false;
    }

    @Override // com.sankuai.waimai.ugc.creator.base.b
    public final void a(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05e284b6d0fa98a8af8aec00baddc36a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05e284b6d0fa98a8af8aec00baddc36a");
        } else if (intent != null) {
            if (s()) {
                this.E = intent.getParcelableArrayListExtra("input_media_data_list");
            } else {
                this.E = com.sankuai.waimai.ugc.creator.utils.c.a(intent);
            }
            this.F = j.a(intent, "index", 0);
            if (this.F < 0) {
                this.F = com.sankuai.waimai.foundation.utils.b.b(this.E) ? 0 : this.E.size() - 1;
            }
        }
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.b
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5870805125a87f65feccc255027dcd8", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5870805125a87f65feccc255027dcd8") : layoutInflater.inflate(R.layout.wm_ugc_image_editor_ability_block, viewGroup, false);
    }

    @Override // com.sankuai.waimai.ugc.creator.base.a
    public final void b(@NonNull View view) {
        boolean z;
        boolean z2;
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11279d9a8dce7c3c7d9ac8d8d900de0c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11279d9a8dce7c3c7d9ac8d8d900de0c");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3983c99e2520fe719b5af35ca183a669", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3983c99e2520fe719b5af35ca183a669");
        } else {
            this.C = b(R.id.fl_add_tag_tip);
            View findViewById = this.C.findViewById(R.id.ll_add_tag_tip);
            ((TextView) findViewById.findViewById(R.id.tv_add_tag_tip)).setText(TextUtils.isEmpty(this.o.y) ? "点击添加商品" : this.o.y);
            findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.ugc.creator.ability.imgedit.ex.ImageEditorAbilityBlock.9
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Object[] objArr3 = {view2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d5f5c418a924195ea687ddd0491c9288", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d5f5c418a924195ea687ddd0491c9288");
                        return;
                    }
                    g.a("b_waimai_kwqgjck1_mc", "c_waimai_n2dalt8s", ImageEditorAbilityBlock.this.B()).a();
                    ImageEditorAbilityBlock.this.e();
                    ImageTagEditorPagerFragment g = ImageEditorAbilityBlock.this.g();
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = ImageTagEditorPagerFragment.a;
                    if (PatchProxy.isSupport(objArr4, g, changeQuickRedirect4, false, "fc9d67fcefe3f499bf4538f8e2f643b5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, g, changeQuickRedirect4, false, "fc9d67fcefe3f499bf4538f8e2f643b5");
                        return;
                    }
                    c cVar = g.b;
                    Object[] objArr5 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect5 = c.a;
                    if (PatchProxy.isSupport(objArr5, cVar, changeQuickRedirect5, false, "c82b83ec7ddaa6e45ca61263613a5457", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, cVar, changeQuickRedirect5, false, "c82b83ec7ddaa6e45ca61263613a5457");
                    } else {
                        cVar.b(0.5f, 0.5f, 1);
                    }
                }
            });
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "71c9a4ac2e8940d51743390c23b06801", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "71c9a4ac2e8940d51743390c23b06801")).booleanValue();
            } else {
                ImageData imageData = this.E.get(this.F);
                z = imageData == null || com.sankuai.waimai.foundation.utils.b.b(imageData.b);
            }
            if (z) {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "2921b0334630105abcbe65f34cd42659", RobustBitConfig.DEFAULT_VALUE)) {
                    z2 = ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "2921b0334630105abcbe65f34cd42659")).booleanValue();
                } else {
                    z2 = this.o.a() != null;
                }
                if (z2) {
                    Object[] objArr5 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "f7f304fd4d9d81e4eb20a32a2c3e853e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "f7f304fd4d9d81e4eb20a32a2c3e853e");
                    } else {
                        g.b("b_waimai_kwqgjck1_mv", "c_waimai_n2dalt8s", B()).a();
                        this.C.setVisibility(0);
                        final int a2 = com.sankuai.waimai.foundation.utils.g.a(A(), 15.0f);
                        this.D = ValueAnimator.ofFloat(0.0f, 1.0f);
                        this.D.setDuration(ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE);
                        this.D.setRepeatMode(1);
                        this.D.setRepeatCount(-1);
                        this.D.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.sankuai.waimai.ugc.creator.ability.imgedit.ex.ImageEditorAbilityBlock.10
                            public static ChangeQuickRedirect a;

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                Object[] objArr6 = {valueAnimator};
                                ChangeQuickRedirect changeQuickRedirect6 = a;
                                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "b3d39bcfa0de65318a72e9fe1c3d1b50", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "b3d39bcfa0de65318a72e9fe1c3d1b50");
                                    return;
                                }
                                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                ImageEditorAbilityBlock.this.C.getBackground().setAlpha((int) (255.0f - (floatValue * 255.0f)));
                                int i = (int) (floatValue * a2);
                                ImageEditorAbilityBlock.this.C.setPadding(i, i, i, i);
                            }
                        });
                        this.D.start();
                    }
                }
            }
            e();
        }
        this.b = new FlowLineActionBarBlock(0);
        a(R.id.fl_image_editor_actionbar_container, (int) this.b);
        this.b.j = new FlowLineActionBarBlock.a() { // from class: com.sankuai.waimai.ugc.creator.ability.imgedit.ex.ImageEditorAbilityBlock.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.ugc.creator.component.FlowLineActionBarBlock.a
            public final void a() {
                Object[] objArr6 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect6 = a;
                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "6050d24edcefc3b4dd0c9a33f1fe199d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "6050d24edcefc3b4dd0c9a33f1fe199d");
                    return;
                }
                e a3 = e.a();
                Activity B = ImageEditorAbilityBlock.this.B();
                Object[] objArr7 = {B};
                ChangeQuickRedirect changeQuickRedirect7 = e.a;
                if (PatchProxy.isSupport(objArr7, a3, changeQuickRedirect7, false, "2ba5842df6e9a840d652dea2855fb2df", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr7, a3, changeQuickRedirect7, false, "2ba5842df6e9a840d652dea2855fb2df");
                } else if (a3.b != null) {
                    a3.a(a3.b.p, a3.b.g, (Map<String, Object>) null, B);
                }
                ImageEditorAbilityBlock.this.B().onBackPressed();
            }

            @Override // com.sankuai.waimai.ugc.creator.component.FlowLineActionBarBlock.a
            public final void b() {
                Object[] objArr6 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect6 = a;
                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "0f7821e7c21970149bb1f1d25dcc0619", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "0f7821e7c21970149bb1f1d25dcc0619");
                    return;
                }
                e a3 = e.a();
                Activity B = ImageEditorAbilityBlock.this.B();
                Object[] objArr7 = {B};
                ChangeQuickRedirect changeQuickRedirect7 = e.a;
                if (PatchProxy.isSupport(objArr7, a3, changeQuickRedirect7, false, "2bc723f67f4337ea8126242068f0dbc3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr7, a3, changeQuickRedirect7, false, "2bc723f67f4337ea8126242068f0dbc3");
                } else if (a3.b != null) {
                    a3.a(a3.b.o, a3.b.g, (Map<String, Object>) null, B);
                }
                ImageEditorAbilityBlock.this.x();
            }
        };
        this.A = (ViewPager) b(R.id.fl_image_editor_pager);
        this.B = new ImageViewPagerAdapter(C());
        this.A.setAdapter(this.B);
        this.A.addOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() { // from class: com.sankuai.waimai.ugc.creator.ability.imgedit.ex.ImageEditorAbilityBlock.2
            public static ChangeQuickRedirect a;

            @Override // android.support.v4.view.ViewPager.SimpleOnPageChangeListener, android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                Object[] objArr6 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect6 = a;
                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "6aa62f4df84d2bd4320fd7da15124ba6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "6aa62f4df84d2bd4320fd7da15124ba6");
                    return;
                }
                if (ImageEditorAbilityBlock.this.F != i) {
                    ImageEditorAbilityBlock.this.e();
                }
                ImageEditorAbilityBlock.this.F = i;
                ImageEditorAbilityBlock.this.c.a(i);
                ImageEditorAbilityBlock.c(ImageEditorAbilityBlock.this);
            }
        });
        this.c = new com.sankuai.waimai.ugc.creator.component.d(true);
        this.c.b = new View.OnClickListener() { // from class: com.sankuai.waimai.ugc.creator.ability.imgedit.ex.ImageEditorAbilityBlock.5
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object[] objArr6 = {view2};
                ChangeQuickRedirect changeQuickRedirect6 = a;
                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "a9eea8957bb2bfd6e38de4201fc77bca", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "a9eea8957bb2bfd6e38de4201fc77bca");
                    return;
                }
                ImageEditorAbilityBlock.this.e();
                g.a("b_waimai_k17ft0ce_mc", "c_waimai_n2dalt8s", (Activity) ImageEditorAbilityBlock.this.A()).a();
                Bundle bundle = new Bundle();
                bundle.putInt("mediaType", 1);
                bundle.putInt("sourceType", 1);
                bundle.putInt("KEY_ENABLE_ADD_MODE", 1);
                bundle.putParcelableArrayList("PreSelectedImageList", ImageEditorAbilityBlock.this.E);
                ImageEditorAbilityBlock.this.a(bundle, "wm_router://page/wmmediachooseinner", 18);
            }
        };
        a(R.id.fl_image_editor_media_selector_container, (int) this.c);
        this.c.a(new d() { // from class: com.sankuai.waimai.ugc.creator.ability.imgedit.ex.ImageEditorAbilityBlock.6
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.ugc.creator.ability.imgedit.ex.d
            public final void a(ImageData imageData2, int i) {
                Object[] objArr6 = {imageData2, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect6 = a;
                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "b54b3ca0200152de5c13d36e043d3f83", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "b54b3ca0200152de5c13d36e043d3f83");
                    return;
                }
                if (ImageEditorAbilityBlock.this.F != i) {
                    ImageEditorAbilityBlock.this.e();
                }
                ImageEditorAbilityBlock.this.F = i;
                ImageEditorAbilityBlock.this.A.setCurrentItem(i, false);
                ImageEditorAbilityBlock.c(ImageEditorAbilityBlock.this);
            }
        });
        this.d = new com.sankuai.waimai.ugc.creator.component.b();
        a(R.id.fl_image_editor_function_bar_container, (int) this.d);
        this.d.d = new b.a() { // from class: com.sankuai.waimai.ugc.creator.ability.imgedit.ex.ImageEditorAbilityBlock.7
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.ugc.creator.component.b.a
            public final void a(com.sankuai.waimai.ugc.creator.entity.a aVar) {
                Object[] objArr6 = {aVar};
                ChangeQuickRedirect changeQuickRedirect6 = a;
                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "eaa68cf8697e1ea45fc84963e05abb54", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "eaa68cf8697e1ea45fc84963e05abb54");
                    return;
                }
                switch (aVar.c) {
                    case 1:
                        if (TextUtils.isEmpty(aVar.e)) {
                            return;
                        }
                        ImageEditorAbilityBlock.a(ImageEditorAbilityBlock.this, aVar);
                        return;
                    case 2:
                        ImageEditorAbilityBlock.f(ImageEditorAbilityBlock.this);
                        return;
                    default:
                        return;
                }
            }
        };
    }

    @Override // com.sankuai.waimai.ugc.creator.base.a
    public final String[] c() {
        return this.j;
    }

    @Override // com.sankuai.waimai.ugc.creator.base.a
    public final void d() {
        char c = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24c01efcad53c8a1c6794e2e3695d1b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24c01efcad53c8a1c6794e2e3695d1b5");
            return;
        }
        this.B.a(this.E);
        this.c.a(this.E);
        this.c.a(this.F);
        final com.sankuai.waimai.ugc.creator.component.b bVar = this.d;
        List<com.sankuai.waimai.ugc.creator.entity.a> list = this.o.x;
        int i = 1;
        Object[] objArr2 = {list};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.ugc.creator.component.b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "a76b10263a136b32e8eb67859a828099", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "a76b10263a136b32e8eb67859a828099");
            return;
        }
        bVar.b = list;
        if (com.sankuai.waimai.foundation.utils.b.a(bVar.b)) {
            for (final com.sankuai.waimai.ugc.creator.entity.a aVar : bVar.b) {
                if (aVar != null && !TextUtils.isEmpty(aVar.a) && !TextUtils.isEmpty(aVar.b)) {
                    LinearLayout linearLayout = bVar.c;
                    byte b = bVar.b.size() > i ? (byte) 1 : (byte) 0;
                    Object[] objArr3 = new Object[3];
                    objArr3[c] = aVar;
                    objArr3[i] = linearLayout;
                    objArr3[2] = Byte.valueOf(b);
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.ugc.creator.component.b.a;
                    if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "f58626f00734c8cdfd4e78bf0f431945", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "f58626f00734c8cdfd4e78bf0f431945");
                    } else {
                        View inflate = LayoutInflater.from(bVar.A()).inflate(R.layout.wm_ugc_creator_function_bar_item_layout, (ViewGroup) linearLayout, false);
                        View findViewById = inflate.findViewById(R.id.ll_function_item_click_zone);
                        b.C0608b c2 = com.sankuai.meituan.mtimageloader.loader.a.c();
                        c2.b = bVar.A();
                        c2.c = aVar.a;
                        c2.a((ImageView) inflate.findViewById(R.id.iv_function_item_icon));
                        ((TextView) inflate.findViewById(R.id.tv_function_item_title)).setText(aVar.b);
                        findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.ugc.creator.component.b.1
                            public static ChangeQuickRedirect a;

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                Object[] objArr4 = {view};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "881dd0baabe98f5de452c0c7781189be", 4611686018427387906L)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "881dd0baabe98f5de452c0c7781189be");
                                } else if (bVar.d != null) {
                                    bVar.d.a(aVar);
                                }
                            }
                        });
                        if (b != 0) {
                            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) inflate.getLayoutParams();
                            layoutParams.width = 0;
                            layoutParams.weight = 1.0f;
                            inflate.setLayoutParams(layoutParams);
                        }
                        linearLayout.addView(inflate);
                    }
                }
                i = 1;
                c = 0;
            }
        }
    }

    @Override // com.sankuai.waimai.ugc.creator.ability.imgedit.ex.a
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cea4a92bacd4087fc5ec514990975614", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cea4a92bacd4087fc5ec514990975614");
        } else if (this.C.getVisibility() == 0) {
            this.C.setVisibility(8);
            this.C.clearAnimation();
            this.D.end();
            this.D.removeAllUpdateListeners();
            this.D = null;
        }
    }

    @Override // com.sankuai.waimai.ugc.creator.handler.d
    public final void a(ImageData imageData) {
        Object[] objArr = {imageData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6eec2012cf7ab72ef2a58a7d720c85a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6eec2012cf7ab72ef2a58a7d720c85a3");
            return;
        }
        int indexOf = this.E.indexOf(imageData);
        if (indexOf >= 0) {
            this.E.set(indexOf, imageData);
        }
    }

    @Override // com.sankuai.waimai.ugc.creator.base.a
    public final void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03830d8544656a1351e0410c6972a7b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03830d8544656a1351e0410c6972a7b9");
        } else if (this.o.A == 1001) {
            ArrayList<ImageData> arrayList = this.E;
            Object[] objArr2 = {arrayList};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c4dce1a1b281b9a9454ec91db0e5e0d1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c4dce1a1b281b9a9454ec91db0e5e0d1");
                return;
            }
            u();
            com.sankuai.waimai.ugc.creator.utils.task.b.a((com.sankuai.waimai.ugc.creator.utils.task.a) new com.sankuai.waimai.ugc.creator.task.a(arrayList) { // from class: com.sankuai.waimai.ugc.creator.ability.imgedit.ex.ImageEditorAbilityBlock.11
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.ugc.creator.utils.task.a
                public final /* synthetic */ void a(ArrayList<com.sankuai.waimai.ugc.creator.entity.c> arrayList2) {
                    ArrayList<com.sankuai.waimai.ugc.creator.entity.c> arrayList3 = arrayList2;
                    Object[] objArr3 = {arrayList3};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "00960588a3e2262dcdda90908a97b025", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "00960588a3e2262dcdda90908a97b025");
                        return;
                    }
                    ImageEditorAbilityBlock.this.v();
                    ImageEditorAbilityBlock.this.a(arrayList3, 1);
                }
            });
        } else {
            a(this.E);
        }
    }

    @Override // com.sankuai.waimai.ugc.creator.base.a
    public final void l() {
        boolean z;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35f08628077bcd716ac4bc031a4c5a96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35f08628077bcd716ac4bc031a4c5a96");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1f2d2fdfd32a5c44df828c3fef0cf37c", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1f2d2fdfd32a5c44df828c3fef0cf37c")).booleanValue();
        } else {
            z = this.z != null && this.z.E();
        }
        if (z) {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "37973081a94ad658c3b5e232cf78fdf2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "37973081a94ad658c3b5e232cf78fdf2");
                return;
            } else if (this.z != null) {
                this.z.c(8);
                b bVar = this.z;
                Object[] objArr4 = {bVar};
                ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.ugc.creator.framework.b.r;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "99e5d4bf4117d900919b02813c4856fa", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "99e5d4bf4117d900919b02813c4856fa");
                    return;
                } else if (bVar != null) {
                    if (!bVar.E()) {
                        c(String.format("Block (%s) 移除子Block (%s) 失败：子Block没有attach", this, bVar));
                        return;
                    } else if (!this.u.contains(bVar)) {
                        c(String.format("Block (%s) 移除子Block (%s) 失败：子Block的parent非本Block", this, bVar));
                        return;
                    } else {
                        this.u.remove(bVar);
                        bVar.a(this.t, 0);
                        return;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        Object[] objArr5 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect5 = a;
        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "bc00e0dc6df85b036a138b0c0b660091", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "bc00e0dc6df85b036a138b0c0b660091");
            return;
        }
        new RooAlertDialog.a(new ContextThemeWrapper(B(), 2131558962)).a(false).b("确认放弃本次编辑吗？").a("放弃编辑", new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.ugc.creator.ability.imgedit.ex.ImageEditorAbilityBlock.4
            public static ChangeQuickRedirect a;

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                Object[] objArr6 = {dialogInterface, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect6 = a;
                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "4ec8c1ac54bbd8888883133ca5979f97", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "4ec8c1ac54bbd8888883133ca5979f97");
                    return;
                }
                ImageEditorAbilityBlock.this.r();
                dialogInterface.dismiss();
                g.a("b_waimai_iai5pa7n_mc", "c_waimai_n2dalt8s", ImageEditorAbilityBlock.this.B()).a();
            }
        }).b("继续编辑", new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.ugc.creator.ability.imgedit.ex.ImageEditorAbilityBlock.3
            public static ChangeQuickRedirect a;

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                Object[] objArr6 = {dialogInterface, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect6 = a;
                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "295b60c2a9721f741a8ddd78b611044f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "295b60c2a9721f741a8ddd78b611044f");
                    return;
                }
                dialogInterface.dismiss();
                g.a("b_waimai_9wc89jsr_mc", "c_waimai_n2dalt8s", ImageEditorAbilityBlock.this.B()).a();
            }
        }).b();
        g.b("b_waimai_y42ghuzg_mv", "c_waimai_n2dalt8s", B()).a();
    }

    @Override // com.sankuai.waimai.ugc.creator.base.a, com.sankuai.waimai.ugc.creator.base.b
    public final boolean a(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7713616309c867c48cf3f9185c056bb1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7713616309c867c48cf3f9185c056bb1")).booleanValue();
        }
        if (i != 18 || intent == null) {
            return false;
        }
        ArrayList<ImageData> parcelableArrayListExtra = intent.getParcelableArrayListExtra("input_media_data_list");
        int a2 = f.a(intent, "addImageMode", 0);
        int a3 = f.a(intent, "firstNewImageIndex", -1);
        if (!com.sankuai.waimai.foundation.utils.b.b(parcelableArrayListExtra)) {
            if (a2 == 0) {
                this.E = parcelableArrayListExtra;
                if (a3 >= 0) {
                    this.F = a3;
                }
            } else {
                this.F = this.E.size();
                this.E.addAll(parcelableArrayListExtra);
            }
            this.B.a(this.E);
            this.c.a(this.E);
            this.c.a(this.F);
        }
        return true;
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.b
    public final boolean a(com.sankuai.waimai.ugc.creator.framework.event.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf1acb8b35995e923ae58da2a28bbeb8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf1acb8b35995e923ae58da2a28bbeb8")).booleanValue();
        }
        if (super.a(bVar)) {
            return true;
        }
        return g().a(bVar);
    }

    public final ImageTagEditorPagerFragment g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3866986b761a3954e55f0fcd91b4312c", RobustBitConfig.DEFAULT_VALUE)) {
            return (ImageTagEditorPagerFragment) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3866986b761a3954e55f0fcd91b4312c");
        }
        return this.B.a(this.A.getCurrentItem());
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.Lifecycle
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac665b3c62b2029db233b72c8f915e4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac665b3c62b2029db233b72c8f915e4c");
            return;
        }
        super.a();
        e a2 = e.a();
        Activity B = B();
        Object[] objArr2 = {B};
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "28328520fbefb31ee823d0b570e1bb0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "28328520fbefb31ee823d0b570e1bb0a");
        } else if (a2.b != null) {
            a2.a(B, a2.b.g, null);
        }
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.b, com.sankuai.waimai.ugc.creator.framework.Lifecycle
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56b0682380bf29ec2962a8b30522a66f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56b0682380bf29ec2962a8b30522a66f");
            return;
        }
        super.b();
        e();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class ImageViewPagerAdapter extends FragmentStatePagerAdapter {
        public static ChangeQuickRedirect a;
        private final ArrayList<ImageData> b;
        private final SparseArray<ImageTagEditorPagerFragment> c;

        @Override // android.support.v4.view.PagerAdapter
        public int getItemPosition(Object obj) {
            return -2;
        }

        public ImageViewPagerAdapter(FragmentManager fragmentManager) {
            super(fragmentManager);
            Object[] objArr = {fragmentManager};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8922dca627283c21faa3905fbb5c5003", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8922dca627283c21faa3905fbb5c5003");
                return;
            }
            this.c = new SparseArray<>();
            this.b = new ArrayList<>();
        }

        @Override // android.support.v4.app.FragmentStatePagerAdapter
        public Fragment getItem(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb64b0021c7a845595f5397dcdd54dad", RobustBitConfig.DEFAULT_VALUE)) {
                return (Fragment) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb64b0021c7a845595f5397dcdd54dad");
            }
            ImageTagEditorPagerFragment a2 = ImageTagEditorPagerFragment.a(this.b, i);
            this.c.put(i, a2);
            return a2;
        }

        @Override // android.support.v4.app.FragmentStatePagerAdapter, android.support.v4.view.PagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            Object[] objArr = {viewGroup, Integer.valueOf(i), obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22ab448095c97d0e6cd43e460f64d6cf", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22ab448095c97d0e6cd43e460f64d6cf");
                return;
            }
            super.destroyItem(viewGroup, i, obj);
            this.c.remove(i);
        }

        public final void a(List<ImageData> list) {
            Object[] objArr = {list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11c05dae9756eb5c7bfc1f5aab4b7ed5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11c05dae9756eb5c7bfc1f5aab4b7ed5");
                return;
            }
            this.b.clear();
            this.b.addAll(list);
            notifyDataSetChanged();
        }

        public final ImageTagEditorPagerFragment a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77e6304d4493f0694cb4d1b2f6b7a04f", RobustBitConfig.DEFAULT_VALUE) ? (ImageTagEditorPagerFragment) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77e6304d4493f0694cb4d1b2f6b7a04f") : this.c.get(i);
        }

        @Override // android.support.v4.view.PagerAdapter
        public int getCount() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30e9edf557eb9f9c1e6ee7108b2ce9a1", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30e9edf557eb9f9c1e6ee7108b2ce9a1")).intValue() : this.b.size();
        }
    }
}
