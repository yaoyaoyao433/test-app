package com.sankuai.waimai.store.poi.list.refactor.card.background;

import android.arch.lifecycle.f;
import android.arch.lifecycle.l;
import android.arch.lifecycle.q;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.Shape;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.meituan.android.bus.annotation.Subscribe;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.d;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.foundation.utils.ImageQualityUtil;
import com.sankuai.waimai.store.assembler.component.BaseCard;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.newwidgets.PrioritySmoothNestedScrollView;
import com.sankuai.waimai.store.newwidgets.list.o;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.poi.list.refactor.PoiPageViewModel;
import com.sankuai.waimai.store.poi.list.refactor.bean.PoiResult;
import com.sankuai.waimai.store.repository.model.BaseTileNew;
import com.sankuai.waimai.store.repository.model.PoiChannelBackgroundConfig;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.util.m;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class PoiBackgroundCard2 extends BaseCard implements l<PoiResult> {
    public static ChangeQuickRedirect h;
    private View A;
    private String B;
    private String C;
    private String D;
    private float E;
    private int F;
    private ImageView G;
    private FrameLayout i;
    private LottieAnimationView j;
    private com.sankuai.waimai.store.param.a k;
    private PoiResult l;
    private View m;
    private View n;
    private View o;
    private LottieAnimationView p;
    private String q;
    private GradientImageLayout r;
    private float s;
    private ConstraintLayout t;
    private ImageView u;
    private ImageView v;
    private float w;
    private int x;
    private ViewGroup y;
    private ImageView z;

    public static /* synthetic */ Matrix a(PoiBackgroundCard2 poiBackgroundCard2, Bitmap bitmap, View view, boolean z) {
        float floatValue;
        Object[] objArr = {bitmap, view, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, poiBackgroundCard2, changeQuickRedirect, false, "1c33a8c25cbc5167cd8e71cd618a4f6f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Matrix) PatchProxy.accessDispatch(objArr, poiBackgroundCard2, changeQuickRedirect, false, "1c33a8c25cbc5167cd8e71cd618a4f6f");
        }
        Matrix matrix = new Matrix();
        Object[] objArr2 = {bitmap, view};
        ChangeQuickRedirect changeQuickRedirect2 = h;
        float floatValue2 = PatchProxy.isSupport(objArr2, poiBackgroundCard2, changeQuickRedirect2, false, "f09be0cbcc0d918e40c3e009b2960ba8", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr2, poiBackgroundCard2, changeQuickRedirect2, false, "f09be0cbcc0d918e40c3e009b2960ba8")).floatValue() : (view.getWidth() * 1.0f) / bitmap.getWidth();
        Object[] objArr3 = {bitmap, view};
        ChangeQuickRedirect changeQuickRedirect3 = h;
        float max = Math.max(floatValue2, PatchProxy.isSupport(objArr3, poiBackgroundCard2, changeQuickRedirect3, false, "1bd6b0bab51f44a8d9654fa9415afe0e", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr3, poiBackgroundCard2, changeQuickRedirect3, false, "1bd6b0bab51f44a8d9654fa9415afe0e")).floatValue() : (view.getHeight() * 1.0f) / bitmap.getHeight());
        matrix.setScale(max, max);
        if (!poiBackgroundCard2.k.be) {
            Object[] objArr4 = {bitmap, Float.valueOf(max), view};
            ChangeQuickRedirect changeQuickRedirect4 = h;
            float floatValue3 = PatchProxy.isSupport(objArr4, poiBackgroundCard2, changeQuickRedirect4, false, "bcd7fc65a6d47aa7a825dc3be14189e3", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr4, poiBackgroundCard2, changeQuickRedirect4, false, "bcd7fc65a6d47aa7a825dc3be14189e3")).floatValue() : (-((bitmap.getWidth() * max) - view.getWidth())) / 2.0f;
            if (z) {
                floatValue = 0.0f;
            } else {
                Object[] objArr5 = {bitmap, Float.valueOf(max), view};
                ChangeQuickRedirect changeQuickRedirect5 = h;
                floatValue = PatchProxy.isSupport(objArr5, poiBackgroundCard2, changeQuickRedirect5, false, "5cbc2d718fa8c88565207776416c3d8d", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr5, poiBackgroundCard2, changeQuickRedirect5, false, "5cbc2d718fa8c88565207776416c3d8d")).floatValue() : -((bitmap.getHeight() * max) - view.getHeight());
            }
            matrix.postTranslate(floatValue3, floatValue);
        }
        return matrix;
    }

    public static /* synthetic */ void a(PoiBackgroundCard2 poiBackgroundCard2, Canvas canvas, Paint paint, Rect rect) {
        Object[] objArr = {canvas, paint, rect};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, poiBackgroundCard2, changeQuickRedirect, false, "c47bf32783a1b8403442cb189f4ee71b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, poiBackgroundCard2, changeQuickRedirect, false, "c47bf32783a1b8403442cb189f4ee71b");
        } else if (canvas == null || paint == null) {
        } else {
            canvas.drawRect(rect, paint);
        }
    }

    public static /* synthetic */ void a(PoiBackgroundCard2 poiBackgroundCard2, Matrix matrix) {
        Object[] objArr = {matrix};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, poiBackgroundCard2, changeQuickRedirect, false, "2d7ce468e1082949de9b776578472d2b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, poiBackgroundCard2, changeQuickRedirect, false, "2d7ce468e1082949de9b776578472d2b");
            return;
        }
        poiBackgroundCard2.j.setScaleType(ImageView.ScaleType.MATRIX);
        poiBackgroundCard2.j.setImageMatrix(matrix);
        b.C0608b a = m.a(poiBackgroundCard2.e(), h.a((Context) poiBackgroundCard2.e), ImageQualityUtil.a());
        a.g = false;
        a.k = 4;
        a.a((ImageView) poiBackgroundCard2.j);
    }

    public static /* synthetic */ void a(PoiBackgroundCard2 poiBackgroundCard2, com.sankuai.waimai.store.poi.list.model.a aVar) {
        int a;
        BaseTileNew<BaseModuleDesc, Object> searchTipsBlocks;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, poiBackgroundCard2, changeQuickRedirect, false, "2f4eb63310952d302a378f17a8336971", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, poiBackgroundCard2, changeQuickRedirect, false, "2f4eb63310952d302a378f17a8336971");
        } else if (com.sankuai.waimai.store.util.b.a(poiBackgroundCard2.e)) {
        } else {
            if (t.a(aVar.a) || ((SCBaseActivity) poiBackgroundCard2.e).w().equals(aVar.a)) {
                poiBackgroundCard2.i.setBackgroundColor(0);
                ViewGroup a2 = poiBackgroundCard2.f.a("kingkong_v2");
                poiBackgroundCard2.l = ((PoiPageViewModel) q.a(poiBackgroundCard2.e).a(PoiPageViewModel.class)).b.a();
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = h;
                if (PatchProxy.isSupport(objArr2, poiBackgroundCard2, changeQuickRedirect2, false, "deb1b7acf7292ef87189180c159d9288", RobustBitConfig.DEFAULT_VALUE)) {
                    a = ((Integer) PatchProxy.accessDispatch(objArr2, poiBackgroundCard2, changeQuickRedirect2, false, "deb1b7acf7292ef87189180c159d9288")).intValue();
                } else {
                    a = h.a(poiBackgroundCard2.e, 120.0f);
                    if (poiBackgroundCard2.f != null) {
                        ViewGroup a3 = poiBackgroundCard2.f.a("poi-action-bar-card");
                        if (a3 != null && a3.getBottom() > 0) {
                            a = a3.getBottom();
                        }
                        if (poiBackgroundCard2.l != null && poiBackgroundCard2.l.response != null && poiBackgroundCard2.l.response.getSearchTipsBlocks() != null && (searchTipsBlocks = poiBackgroundCard2.l.response.getSearchTipsBlocks()) != null && searchTipsBlocks.data != null && searchTipsBlocks.data.jsonData != null && searchTipsBlocks.data.jsonData.get("search_keyword") != null) {
                            Object obj = searchTipsBlocks.data.jsonData.get("search_keyword");
                            if ((obj instanceof ArrayList) && ((ArrayList) obj).size() > 0) {
                                ViewGroup a4 = poiBackgroundCard2.f.a("search_tips");
                                int bottom = (a4 == null || a4.getBottom() <= 0) ? 0 : a4.getBottom();
                                ViewGroup a5 = poiBackgroundCard2.f.a("supermarket-search-down-searchtext");
                                if (a5 != null && a5.getBottom() > 0) {
                                    bottom = a5.getBottom();
                                }
                                a = bottom > a ? bottom : a + h.a(poiBackgroundCard2.e, 32.0f);
                            }
                        }
                        if (poiBackgroundCard2.k.bc && poiBackgroundCard2.k.f() && poiBackgroundCard2.k.bd < 5) {
                            a += h.a(poiBackgroundCard2.e, 10.0f);
                            poiBackgroundCard2.k.bd++;
                        }
                        a += h.a(poiBackgroundCard2.e, 9.0f);
                    }
                }
                Object[] objArr3 = {Integer.valueOf(a)};
                ChangeQuickRedirect changeQuickRedirect3 = h;
                if (PatchProxy.isSupport(objArr3, poiBackgroundCard2, changeQuickRedirect3, false, "291ddb8c555109aa848170d8e1d58f42", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, poiBackgroundCard2, changeQuickRedirect3, false, "291ddb8c555109aa848170d8e1d58f42");
                } else if ((poiBackgroundCard2.k.aS || !poiBackgroundCard2.k.y) && poiBackgroundCard2.m != null) {
                    ViewGroup.LayoutParams layoutParams = poiBackgroundCard2.m.getLayoutParams();
                    layoutParams.height = (poiBackgroundCard2.k.be ? 10 : 0) + a;
                    poiBackgroundCard2.m.setLayoutParams(layoutParams);
                    if (!TextUtils.isEmpty(poiBackgroundCard2.q)) {
                        poiBackgroundCard2.a(poiBackgroundCard2.q);
                    }
                }
                if (a2 != null && !poiBackgroundCard2.k.aa) {
                    final Rect rect = new Rect();
                    rect.left = 0;
                    rect.right = poiBackgroundCard2.i.getWidth();
                    if (!poiBackgroundCard2.k.aS && poiBackgroundCard2.k.y) {
                        a = 0;
                    }
                    rect.top = a;
                    rect.bottom = a2.getBottom() - 15;
                    ShapeDrawable shapeDrawable = new ShapeDrawable(new Shape() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.background.PoiBackgroundCard2.7
                        public static ChangeQuickRedirect a;

                        @Override // android.graphics.drawable.shapes.Shape
                        public final void draw(Canvas canvas, Paint paint) {
                            Object[] objArr4 = {canvas, paint};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "3c60723ec642cf68bf362f25c8e506dd", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "3c60723ec642cf68bf362f25c8e506dd");
                            } else if (canvas == null || paint == null) {
                            } else {
                                paint.setAntiAlias(true);
                                paint.setColor(-1);
                                canvas.drawRect(rect, paint);
                            }
                        }
                    });
                    if (poiBackgroundCard2.f != null && poiBackgroundCard2.f.b() != null) {
                        poiBackgroundCard2.f.b().setBackground(shapeDrawable);
                    }
                }
                if (poiBackgroundCard2.k.aa) {
                    if (poiBackgroundCard2.g() == 1) {
                        poiBackgroundCard2.b(poiBackgroundCard2.e());
                    }
                    if (TextUtils.isEmpty(poiBackgroundCard2.e())) {
                        return;
                    }
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = h;
                    if (PatchProxy.isSupport(objArr4, poiBackgroundCard2, changeQuickRedirect4, false, "839988f1a18551cdb73787c349ce203e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, poiBackgroundCard2, changeQuickRedirect4, false, "839988f1a18551cdb73787c349ce203e");
                        return;
                    }
                    b.C0608b a6 = m.a(poiBackgroundCard2.e(), h.a((Context) poiBackgroundCard2.e), ImageQualityUtil.a());
                    a6.g = false;
                    a6.k = 4;
                    a6.a(new b.a() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.background.PoiBackgroundCard2.8
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.meituan.mtimageloader.config.b.a
                        public final void a() {
                        }

                        @Override // com.sankuai.meituan.mtimageloader.config.b.a
                        public final void a(Bitmap bitmap) {
                            Object[] objArr5 = {bitmap};
                            ChangeQuickRedirect changeQuickRedirect5 = a;
                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "b2b053af7d96bf763667ffa02e1e633f", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "b2b053af7d96bf763667ffa02e1e633f");
                                return;
                            }
                            PoiBackgroundCard2.this.b(PoiBackgroundCard2.this.e());
                            PoiBackgroundCard2.a(PoiBackgroundCard2.this, PoiBackgroundCard2.a(PoiBackgroundCard2.this, bitmap, (View) PoiBackgroundCard2.this.j, false));
                        }
                    });
                }
            }
        }
    }

    public static /* synthetic */ void j(PoiBackgroundCard2 poiBackgroundCard2) {
        int i;
        View findViewById;
        String sb;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, poiBackgroundCard2, changeQuickRedirect, false, "ded0653eed4ba37965212a9d205ec731", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, poiBackgroundCard2, changeQuickRedirect, false, "ded0653eed4ba37965212a9d205ec731");
        } else if (com.sankuai.waimai.store.util.b.a(poiBackgroundCard2.e) || poiBackgroundCard2.k.y) {
        } else {
            int i2 = 1;
            if (o.m()) {
                i = u.a() + h.a(poiBackgroundCard2.e, 83.0f) + (poiBackgroundCard2.k.bc ? h.a(poiBackgroundCard2.e, 10.0f) : 0);
            } else {
                View childAt = ((LinearLayout) poiBackgroundCard2.f.b()).getChildAt(2);
                if (childAt == null || (findViewById = childAt.findViewById(R.id.ll_module_container)) == null) {
                    i = 0;
                } else {
                    int[] iArr = new int[2];
                    findViewById.getLocationOnScreen(iArr);
                    i = iArr[1];
                }
            }
            poiBackgroundCard2.s = i + h.a(poiBackgroundCard2.e, 10.0f);
            PoiResult poiResult = poiBackgroundCard2.l;
            Object[] objArr2 = {poiResult};
            ChangeQuickRedirect changeQuickRedirect2 = h;
            if (PatchProxy.isSupport(objArr2, poiBackgroundCard2, changeQuickRedirect2, false, "8833ef22069a2155f5b74d0374d676d0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, poiBackgroundCard2, changeQuickRedirect2, false, "8833ef22069a2155f5b74d0374d676d0");
            } else if (poiBackgroundCard2.k.aX && !poiBackgroundCard2.k.y) {
                poiBackgroundCard2.j.setVisibility(8);
                poiBackgroundCard2.m.setVisibility(8);
                poiBackgroundCard2.r.setVisibility(0);
                new ArrayList();
                ArrayList arrayList = new ArrayList();
                if (poiResult != null && poiResult.response != null && poiResult.response.getBackgroundPromotion() != null && !com.sankuai.shangou.stone.util.a.b(poiResult.response.getBackgroundPromotion().bannerBackgroundPicList)) {
                    List<PoiVerticalityDataResponse.BannerPic> list = poiResult.response.getBackgroundPromotion().bannerBackgroundPicList;
                    int i3 = 0;
                    while (i3 < list.size()) {
                        String str = list.get(i3).bannerBackgroundUrl;
                        Object[] objArr3 = new Object[i2];
                        objArr3[0] = str;
                        ChangeQuickRedirect changeQuickRedirect3 = h;
                        if (PatchProxy.isSupport(objArr3, poiBackgroundCard2, changeQuickRedirect3, false, "562dca0ad0a6f41b8428ceb9f2ca248b", RobustBitConfig.DEFAULT_VALUE)) {
                            sb = (String) PatchProxy.accessDispatch(objArr3, poiBackgroundCard2, changeQuickRedirect3, false, "562dca0ad0a6f41b8428ceb9f2ca248b");
                        } else {
                            float a = 1053.0f / (h.a((Context) poiBackgroundCard2.e) - h.a(poiBackgroundCard2.e, 24.0f));
                            float a2 = h.a(poiBackgroundCard2.e, 12.0f) * a;
                            float f = 36.0f - a2;
                            if (f <= 0.0f) {
                                f = -f;
                            }
                            float f2 = 462.0f - (a * poiBackgroundCard2.s);
                            float f3 = (a2 * 2.0f) + 1053.0f;
                            StringBuilder sb2 = new StringBuilder(str);
                            sb2.append("@" + ((int) f) + CommonConstant.Symbol.UNDERLINE + ((int) f2) + CommonConstant.Symbol.UNDERLINE + ((int) f3) + CommonConstant.Symbol.UNDERLINE + ((int) ((1113.0f * f3) / 1125.0f)) + "a");
                            sb = sb2.toString();
                        }
                        ImageView imageView = new ImageView(poiBackgroundCard2.e);
                        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                        b.C0608b a3 = m.a(sb, h.a((Context) poiBackgroundCard2.e), ImageQualityUtil.a());
                        a3.g = false;
                        a3.k = 4;
                        a3.a(new b.d() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.background.PoiBackgroundCard2.1
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.meituan.mtimageloader.config.b.d
                            public final void a() {
                            }

                            @Override // com.sankuai.meituan.mtimageloader.config.b.d
                            public final void a(int i4, Exception exc) {
                                Object[] objArr4 = {Integer.valueOf(i4), exc};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "f7a3c2221ace8516b9fadb2e78484829", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "f7a3c2221ace8516b9fadb2e78484829");
                                    return;
                                }
                                PoiBackgroundCard2.this.r.setVisibility(8);
                                PoiBackgroundCard2.this.c();
                            }
                        }).a(imageView);
                        arrayList.add(imageView);
                        i3++;
                        i2 = 1;
                    }
                }
                poiBackgroundCard2.r.setImageList(arrayList);
            } else {
                poiBackgroundCard2.r.setVisibility(8);
            }
        }
    }

    public static /* synthetic */ void k(PoiBackgroundCard2 poiBackgroundCard2) {
        int i;
        View findViewById;
        float f;
        String sb;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, poiBackgroundCard2, changeQuickRedirect, false, "73e71ab6c80401b5570809a50a7c9bdc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, poiBackgroundCard2, changeQuickRedirect, false, "73e71ab6c80401b5570809a50a7c9bdc");
        } else if (com.sankuai.waimai.store.util.b.a(poiBackgroundCard2.e) || poiBackgroundCard2.k.A >= 3) {
        } else {
            poiBackgroundCard2.k.A++;
            if (o.m()) {
                i = u.a() + h.a(poiBackgroundCard2.e, poiBackgroundCard2.i() ? 116.0f : 91.0f) + (poiBackgroundCard2.k.bc ? h.a(poiBackgroundCard2.e, 10.0f) : 0);
            } else {
                View childAt = ((LinearLayout) poiBackgroundCard2.f.b()).getChildAt(2);
                if (childAt == null || (findViewById = childAt.findViewById(R.id.ll_module_container)) == null) {
                    i = 0;
                } else {
                    int[] iArr = new int[2];
                    findViewById.getLocationOnScreen(iArr);
                    i = iArr[1];
                }
            }
            poiBackgroundCard2.w = i + h.a(poiBackgroundCard2.e, poiBackgroundCard2.i() ? 6.0f : 2.0f);
            PoiResult poiResult = poiBackgroundCard2.l;
            Object[] objArr2 = {poiResult};
            ChangeQuickRedirect changeQuickRedirect2 = h;
            if (PatchProxy.isSupport(objArr2, poiBackgroundCard2, changeQuickRedirect2, false, "c65325a87615de043125d338116fe9a3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, poiBackgroundCard2, changeQuickRedirect2, false, "c65325a87615de043125d338116fe9a3");
            } else if (poiBackgroundCard2.k.aY) {
                poiBackgroundCard2.j.setVisibility(8);
                poiBackgroundCard2.m.setVisibility(8);
                poiBackgroundCard2.y.setVisibility(8);
                poiBackgroundCard2.t.setVisibility(0);
                if (poiResult == null || poiResult.response == null || poiResult.response.getBackgroundPromotion() == null || poiResult.response.getBackgroundPromotion().acrossBackground == null) {
                    return;
                }
                String str = poiResult.response.getBackgroundPromotion().acrossBackground.acrossBackgroundUrl;
                if (t.a(str)) {
                    return;
                }
                Object[] objArr3 = {str};
                ChangeQuickRedirect changeQuickRedirect3 = h;
                if (PatchProxy.isSupport(objArr3, poiBackgroundCard2, changeQuickRedirect3, false, "76bd140034d28395c4d6ba03362f2c90", RobustBitConfig.DEFAULT_VALUE)) {
                    sb = (String) PatchProxy.accessDispatch(objArr3, poiBackgroundCard2, changeQuickRedirect3, false, "76bd140034d28395c4d6ba03362f2c90");
                } else {
                    float a = 1125.0f / h.a((Context) poiBackgroundCard2.e);
                    float f2 = poiBackgroundCard2.x * 1.0f;
                    poiBackgroundCard2.E = h.a(poiBackgroundCard2.e, 158.0f) - ((((poiBackgroundCard2.k.aZ == 2 ? PushConstants.BROADCAST_MESSAGE_ARRIVE : 1500) / a) - poiBackgroundCard2.x) - (552.0f - (poiBackgroundCard2.w * a)));
                    StringBuilder sb2 = new StringBuilder(str);
                    sb2.append("@0" + CommonConstant.Symbol.UNDERLINE + ((int) f) + "_1125" + CommonConstant.Symbol.UNDERLINE + ((int) f2) + "a");
                    sb = sb2.toString();
                }
                b.C0608b a2 = m.a(sb, h.a((Context) poiBackgroundCard2.e), ImageQualityUtil.a());
                a2.g = false;
                a2.k = 4;
                a2.a(new b.d() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.background.PoiBackgroundCard2.11
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.meituan.mtimageloader.config.b.d
                    public final void a() {
                    }

                    @Override // com.sankuai.meituan.mtimageloader.config.b.d
                    public final void a(int i2, Exception exc) {
                        Object[] objArr4 = {Integer.valueOf(i2), exc};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "0c173dee7ad882f589a34b660a19d8d2", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "0c173dee7ad882f589a34b660a19d8d2");
                            return;
                        }
                        PoiBackgroundCard2.this.t.setVisibility(8);
                        PoiBackgroundCard2.this.c();
                    }
                }).a(poiBackgroundCard2.u);
                StringBuilder sb3 = new StringBuilder("https://p0.meituan.net/travelcube/04f295c45b799df8bbe68cb8a0e38bf348054.png");
                float f3 = poiBackgroundCard2.E;
                Object[] objArr4 = {Float.valueOf(f3)};
                ChangeQuickRedirect changeQuickRedirect4 = h;
                if (PatchProxy.isSupport(objArr4, poiBackgroundCard2, changeQuickRedirect4, false, "7b4be088f380ec36a8a3734d4a74a38c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, poiBackgroundCard2, changeQuickRedirect4, false, "7b4be088f380ec36a8a3734d4a74a38c");
                } else if (poiBackgroundCard2.e != null && poiBackgroundCard2.v != null) {
                    ViewGroup.LayoutParams layoutParams = poiBackgroundCard2.v.getLayoutParams();
                    if (layoutParams == null) {
                        layoutParams = new FrameLayout.LayoutParams(-1, h.a(poiBackgroundCard2.e, 158.0f));
                    }
                    layoutParams.height = (int) ((h.a((Context) poiBackgroundCard2.e) * f3) / 1125.0f);
                    poiBackgroundCard2.v.setLayoutParams(layoutParams);
                }
                sb3.append("@0_0_1125_" + ((int) poiBackgroundCard2.E) + "a");
                b.C0608b a3 = m.a(sb3.toString(), h.a((Context) poiBackgroundCard2.e), ImageQualityUtil.a());
                a3.g = false;
                a3.k = 4;
                a3.a(new b.d() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.background.PoiBackgroundCard2.2
                    @Override // com.sankuai.meituan.mtimageloader.config.b.d
                    public final void a() {
                    }

                    @Override // com.sankuai.meituan.mtimageloader.config.b.d
                    public final void a(int i2, Exception exc) {
                    }
                }).a(poiBackgroundCard2.v);
            } else {
                poiBackgroundCard2.t.setVisibility(8);
            }
        }
    }

    public static /* synthetic */ void l(PoiBackgroundCard2 poiBackgroundCard2) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, poiBackgroundCard2, changeQuickRedirect, false, "4d4793b4aca951cc0638d85ecda64704", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, poiBackgroundCard2, changeQuickRedirect, false, "4d4793b4aca951cc0638d85ecda64704");
        } else if (com.sankuai.waimai.store.util.b.a(poiBackgroundCard2.e) || poiBackgroundCard2.k.A >= 3) {
        } else {
            poiBackgroundCard2.k.A++;
            poiBackgroundCard2.F = (int) ((h.a((Context) poiBackgroundCard2.e) / 375.0f) * 246.0f);
            int i = poiBackgroundCard2.F;
            Object[] objArr2 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = h;
            if (PatchProxy.isSupport(objArr2, poiBackgroundCard2, changeQuickRedirect2, false, "ed042497b54040f706a7759948051b89", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, poiBackgroundCard2, changeQuickRedirect2, false, "ed042497b54040f706a7759948051b89");
            } else if (poiBackgroundCard2.e != null && poiBackgroundCard2.G != null) {
                ViewGroup.LayoutParams layoutParams = poiBackgroundCard2.G.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = new FrameLayout.LayoutParams(-1, i);
                }
                layoutParams.height = i;
                poiBackgroundCard2.G.setLayoutParams(layoutParams);
            }
            PoiResult poiResult = poiBackgroundCard2.l;
            Object[] objArr3 = {poiResult};
            ChangeQuickRedirect changeQuickRedirect3 = h;
            if (PatchProxy.isSupport(objArr3, poiBackgroundCard2, changeQuickRedirect3, false, "f055fbb47358b720f10117896ab82577", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, poiBackgroundCard2, changeQuickRedirect3, false, "f055fbb47358b720f10117896ab82577");
            } else if (!poiBackgroundCard2.k.ba) {
                u.c(poiBackgroundCard2.G);
            } else {
                poiBackgroundCard2.j.setVisibility(8);
                poiBackgroundCard2.m.setVisibility(8);
                poiBackgroundCard2.y.setVisibility(8);
                poiBackgroundCard2.t.setVisibility(8);
                u.a(poiBackgroundCard2.G);
                if (poiResult == null || poiResult.response == null || poiResult.response.pageConfig == null || poiResult.response.pageConfig.propsData == null || poiResult.response.pageConfig.propsData.extra == null) {
                    return;
                }
                String str = poiResult.response.pageConfig.propsData.extra.newUserAcrossBg;
                if (t.a(str)) {
                    return;
                }
                b.C0608b a = m.a(str, h.a((Context) poiBackgroundCard2.e), ImageQualityUtil.a());
                a.g = false;
                a.k = 4;
                a.a(new b.d() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.background.PoiBackgroundCard2.10
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.meituan.mtimageloader.config.b.d
                    public final void a() {
                    }

                    @Override // com.sankuai.meituan.mtimageloader.config.b.d
                    public final void a(int i2, Exception exc) {
                        Object[] objArr4 = {Integer.valueOf(i2), exc};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "dbe6f27ff1c3a76576d2d0b3cebe36bd", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "dbe6f27ff1c3a76576d2d0b3cebe36bd");
                            return;
                        }
                        PoiBackgroundCard2.this.G.setVisibility(8);
                        PoiBackgroundCard2.this.c();
                    }
                }).a(poiBackgroundCard2.G);
            }
        }
    }

    public static /* synthetic */ void m(PoiBackgroundCard2 poiBackgroundCard2) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, poiBackgroundCard2, changeQuickRedirect, false, "1285857a7ae20413b135dd7797bdc16e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, poiBackgroundCard2, changeQuickRedirect, false, "1285857a7ae20413b135dd7797bdc16e");
            return;
        }
        if (poiBackgroundCard2.e != null && poiBackgroundCard2.z != null) {
            b.C0608b a = m.a(poiBackgroundCard2.D, h.a((Context) poiBackgroundCard2.e), ImageQualityUtil.a());
            a.g = false;
            a.k = 4;
            a.a(new b.d() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.background.PoiBackgroundCard2.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mtimageloader.config.b.d
                public final void a() {
                }

                @Override // com.sankuai.meituan.mtimageloader.config.b.d
                public final void a(int i, Exception exc) {
                    Object[] objArr2 = {Integer.valueOf(i), exc};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e5e14b777837d03fe56d0d45a0b0e75b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e5e14b777837d03fe56d0d45a0b0e75b");
                    } else {
                        PoiBackgroundCard2.this.y.setVisibility(8);
                    }
                }
            }).a(poiBackgroundCard2.z);
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = h;
        if (PatchProxy.isSupport(objArr2, poiBackgroundCard2, changeQuickRedirect2, false, "539f03ac3005c1e38c1f978bc3ad4cb3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, poiBackgroundCard2, changeQuickRedirect2, false, "539f03ac3005c1e38c1f978bc3ad4cb3");
            return;
        }
        ViewGroup.LayoutParams layoutParams = poiBackgroundCard2.A.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(-2, -2);
        }
        layoutParams.height = h.a(poiBackgroundCard2.e, poiBackgroundCard2.i() ? 150.0f : 105.0f);
        poiBackgroundCard2.A.setLayoutParams(layoutParams);
        poiBackgroundCard2.A.setBackground(e.a(poiBackgroundCard2.e, new int[]{d.a(poiBackgroundCard2.B, 0), d.a(poiBackgroundCard2.C, 0)}, R.dimen.wm_sc_common_dimen_0, GradientDrawable.Orientation.TOP_BOTTOM));
    }

    @Override // android.arch.lifecycle.l
    public final /* synthetic */ void a(@Nullable PoiResult poiResult) {
        PoiChannelBackgroundConfig backgroundConfig;
        String str;
        PoiResult poiResult2 = poiResult;
        Object[] objArr = {poiResult2};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1619440dff4ddee0ecdd4ad8692d4bb3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1619440dff4ddee0ecdd4ad8692d4bb3");
        } else if (poiResult2 != null) {
            if (this.k.aa) {
                this.j.setVisibility(0);
                this.m.setVisibility(8);
            }
            if (!this.k.aa) {
                this.i.setBackgroundColor(d.a(this.k.E, -657930));
            }
            if (!this.k.aa && this.f != null) {
                this.f.b().setBackground(null);
            }
            if (!this.k.aX && !this.k.y && !this.k.aa) {
                Object[] objArr2 = {poiResult2};
                ChangeQuickRedirect changeQuickRedirect2 = h;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cb6026b24a098d0ebe9d998a986c4654", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cb6026b24a098d0ebe9d998a986c4654");
                } else if (!this.k.aX && !this.k.y && !this.k.aa) {
                    str = "";
                    String str2 = "";
                    String str3 = "";
                    if (poiResult2.response != null) {
                        PoiChannelBackgroundConfig backgroundConfig2 = poiResult2.response.getBackgroundConfig();
                        String str4 = "";
                        if (backgroundConfig2 != null) {
                            this.q = backgroundConfig2.minuteHeadDefBgUrl;
                            str3 = backgroundConfig2.minuteHeadTopBgUrl;
                            str4 = backgroundConfig2.minuteBgColorFrm;
                        }
                        str = TextUtils.isEmpty(str4) ? "" : str4;
                        String str5 = backgroundConfig2 != null ? backgroundConfig2.minuteBgColorTo : "";
                        if (!TextUtils.isEmpty(str5)) {
                            str2 = str5;
                        }
                    }
                    if (!TextUtils.isEmpty(this.q) && !TextUtils.isEmpty(str3)) {
                        this.p.setVisibility(0);
                        this.n.setVisibility(8);
                        a(this.q);
                    } else if (this.k.be && !TextUtils.isEmpty(this.q)) {
                        this.p.setVisibility(0);
                        this.n.setVisibility(8);
                        a(this.q);
                    } else {
                        this.p.setVisibility(8);
                        this.n.setVisibility(0);
                        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                            str = "#FFE14D";
                            str2 = "#FFE34D";
                        }
                        this.n.setBackground(e.a(this.e, new int[]{d.a(str, -7859), d.a(str2, -15539)}, R.dimen.wm_sc_common_dimen_0, GradientDrawable.Orientation.TL_BR));
                    }
                    float a = h.a(this.e, 9.0f);
                    e.a c = new e.a().c(com.sankuai.waimai.store.util.b.b(this.e, this.k.y ? R.color.wm_sg_color_FFFFFE : R.color.wm_sg_color_F5F5F6));
                    c.a(a, a, 0.0f, 0.0f);
                    this.o.setBackground(c.a());
                }
            }
            this.x = this.k.aY ? this.k.aZ == 2 ? 1865 : 1265 : 0;
            this.k.A = 0;
            c();
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = h;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "590bbdf78d84344a9e7703d9325a8a04", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "590bbdf78d84344a9e7703d9325a8a04");
            } else if (this.e != null) {
                this.r = new GradientImageLayout(this.e);
                this.r = (GradientImageLayout) a(R.id.gradient_img_layout);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, h.a(this.e, 556.0f));
                layoutParams.height = (this.e.getWindowManager().getDefaultDisplay().getWidth() * 371) / 375;
                this.r.setLayoutParams(layoutParams);
            }
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = h;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "3e7ad989e16a80fd767d9c793f6c9ff5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "3e7ad989e16a80fd767d9c793f6c9ff5");
            } else if (this.e != null && this.u != null) {
                ViewGroup.LayoutParams layoutParams2 = this.u.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = new FrameLayout.LayoutParams(-1, h.a(this.e, 552.0f));
                }
                layoutParams2.height = (h.a((Context) this.e) * this.x) / 1125;
                this.u.setLayoutParams(layoutParams2);
            }
            Object[] objArr5 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect5 = h;
            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "c27f0f22242c102e5bbb36ae57a30175", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "c27f0f22242c102e5bbb36ae57a30175");
            } else if ((!this.k.y && !this.k.ab) || this.k.aa || this.k.aX || this.k.aY) {
                this.y.setVisibility(8);
            } else {
                this.j.setVisibility(8);
                this.m.setVisibility(8);
                this.t.setVisibility(8);
                this.y.setVisibility(0);
            }
            Object[] objArr6 = {poiResult2};
            ChangeQuickRedirect changeQuickRedirect6 = h;
            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "52615e9aa5db9da04bb3380c90754842", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "52615e9aa5db9da04bb3380c90754842");
            } else if (!this.k.ab || poiResult2.response == null || (backgroundConfig = poiResult2.response.getBackgroundConfig()) == null) {
            } else {
                this.D = backgroundConfig.minuteHeadDefBgUrl;
                if (!TextUtils.isEmpty(backgroundConfig.minuteBgColorFrm)) {
                    this.B = backgroundConfig.minuteBgColorFrm;
                }
                if (TextUtils.isEmpty(backgroundConfig.minuteBgColorTo)) {
                    return;
                }
                this.C = backgroundConfig.minuteBgColorTo;
            }
        }
    }

    public PoiBackgroundCard2(f fVar, FragmentActivity fragmentActivity) {
        super(fVar, fragmentActivity);
        Object[] objArr = {fVar, fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f1619d4c9f56b4d2b601cf1dd06886c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f1619d4c9f56b4d2b601cf1dd06886c");
            return;
        }
        this.q = "";
        this.s = 0.0f;
        this.w = 0.0f;
        this.x = 0;
        this.B = "#FFE75D";
        this.C = "#F5F5F6";
        this.D = "https://p0.meituan.net/travelcube/6b732f6f2e40e6f6bd95346424028e395429.jpg";
        this.E = 0.0f;
        this.F = 0;
    }

    @Override // com.sankuai.waimai.store.assembler.component.BaseCard
    @NonNull
    public final View a(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88e27bb5dd3689451b8749a6fa1be334", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88e27bb5dd3689451b8749a6fa1be334") : LayoutInflater.from(this.e).inflate(R.layout.wm_sc_home_channel_refactor_background_card, viewGroup);
    }

    @Override // com.sankuai.waimai.store.assembler.component.BaseCard
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7efacb0f3c6d71a33b8fe2f532ebe5e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7efacb0f3c6d71a33b8fe2f532ebe5e1");
            return;
        }
        super.a(view);
        this.i = (FrameLayout) a(R.id.fl_background_root);
        this.j = (LottieAnimationView) a(R.id.img_background_root);
        this.m = a(R.id.sg_minute_layout);
        this.n = a(R.id.sg_minute_view_bg);
        this.p = (LottieAnimationView) a(R.id.sg_minute_img_bg);
        this.o = a(R.id.sg_minute_bottom_corners);
        this.t = (ConstraintLayout) a(R.id.cl_head_across_banner);
        this.u = (ImageView) a(R.id.iv_head_across_banner);
        this.v = (ImageView) a(R.id.iv_head_across_banner_mask);
        this.y = (ViewGroup) a(R.id.rv_normal_bg);
        this.z = (ImageView) a(R.id.iv_top_area);
        this.A = a(R.id.iv_bottom_area);
        this.G = (ImageView) a(R.id.iv_head_new_user_bg);
        com.meituan.android.bus.a.a().a(this);
        PoiPageViewModel poiPageViewModel = (PoiPageViewModel) q.a(this.e).a(PoiPageViewModel.class);
        this.k = poiPageViewModel.d.a();
        this.j.getLayoutParams().height = h.a(this.e, this.k.y ? 265.0f : 182.0f);
        poiPageViewModel.b.a(this.d, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6779869f43f41746f476ba0460b69e06", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6779869f43f41746f476ba0460b69e06");
        } else if (this.k.y) {
            this.j.setVisibility(8);
            this.m.setVisibility(8);
        } else if (this.k.aY || this.k.aX || this.k.aa) {
            this.j.setVisibility(0);
            this.m.setVisibility(8);
        } else {
            this.j.setVisibility(8);
            this.m.setVisibility(0);
        }
    }

    @Subscribe
    public final void onHomeBannerChangeReceive(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e20e089c90391f28970527c004dc3a8f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e20e089c90391f28970527c004dc3a8f");
        } else if (aVar == null || this.r == null || this.r.getVisibility() != 0) {
        } else {
            final GradientImageLayout gradientImageLayout = this.r;
            final int i = aVar.a;
            Object[] objArr2 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = GradientImageLayout.a;
            if (PatchProxy.isSupport(objArr2, gradientImageLayout, changeQuickRedirect2, false, "2426d9fb38f49c23eebaac7e29550d4b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, gradientImageLayout, changeQuickRedirect2, false, "2426d9fb38f49c23eebaac7e29550d4b");
            } else {
                gradientImageLayout.b.post(new Runnable() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.background.GradientImageLayout.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "fc8051999c5c2f210704d01ab3ce3ca2", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "fc8051999c5c2f210704d01ab3ce3ca2");
                            return;
                        }
                        try {
                            int size = gradientImageLayout.c.size();
                            if (gradientImageLayout.k != i && i <= size - 1 && i >= 0) {
                                for (int i2 = 0; i2 < size; i2++) {
                                    if (i2 != gradientImageLayout.k && i2 != i) {
                                        if (gradientImageLayout.c.get(i2) != null) {
                                            ((ImageView) gradientImageLayout.c.get(i2)).setVisibility(8);
                                        }
                                    }
                                    if (gradientImageLayout.c.get(i2) != null) {
                                        ((ImageView) gradientImageLayout.c.get(i2)).setVisibility(0);
                                    }
                                }
                                ((ImageView) gradientImageLayout.c.get(gradientImageLayout.k)).startAnimation((Animation) gradientImageLayout.d.get(gradientImageLayout.k));
                                ((ImageView) gradientImageLayout.c.get(i)).startAnimation((Animation) gradientImageLayout.e.get(i));
                                gradientImageLayout.k = i;
                            }
                        } catch (Exception unused) {
                        }
                    }
                });
            }
        }
    }

    @Override // com.sankuai.waimai.store.assembler.component.BaseCard
    public final void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fed5c3097045ffba8f2a8e31a9ef43ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fed5c3097045ffba8f2a8e31a9ef43ba");
            return;
        }
        super.onStart();
        PrioritySmoothNestedScrollView prioritySmoothNestedScrollView = (PrioritySmoothNestedScrollView) this.f.b().getParent();
        if (prioritySmoothNestedScrollView != null) {
            prioritySmoothNestedScrollView.getChildAt(prioritySmoothNestedScrollView.getChildCount());
            prioritySmoothNestedScrollView.a(new PrioritySmoothNestedScrollView.a() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.background.PoiBackgroundCard2.4
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.newwidgets.PrioritySmoothNestedScrollView.a
                public final void c_(int i) {
                    Object[] objArr2 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7486fd33d5a118352f9a3e459b30dab2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7486fd33d5a118352f9a3e459b30dab2");
                        return;
                    }
                    PoiBackgroundCard2.this.j.scrollTo(0, i);
                    if (!PoiBackgroundCard2.this.k.be) {
                        PoiBackgroundCard2.this.m.scrollTo(0, i);
                    }
                    if (PoiBackgroundCard2.this.r != null) {
                        PoiBackgroundCard2.this.r.scrollTo(0, i);
                    }
                    if (PoiBackgroundCard2.this.t != null) {
                        PoiBackgroundCard2.this.t.scrollTo(0, i);
                    }
                    if (PoiBackgroundCard2.this.y != null) {
                        PoiBackgroundCard2.this.y.scrollTo(0, i);
                    }
                    if (PoiBackgroundCard2.this.G != null) {
                        PoiBackgroundCard2.this.G.scrollTo(0, i);
                    }
                }
            });
        }
    }

    private void a(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4e70b3c7fa433aef1a393f74f3f7219", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4e70b3c7fa433aef1a393f74f3f7219");
            return;
        }
        b.C0608b a = m.a(str, h.a((Context) this.e), ImageQualityUtil.a());
        a.g = false;
        a.k = 4;
        a.a(new b.a() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.background.PoiBackgroundCard2.5
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.mtimageloader.config.b.a
            public final void a() {
            }

            @Override // com.sankuai.meituan.mtimageloader.config.b.a
            public final void a(Bitmap bitmap) {
                Object[] objArr2 = {bitmap};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4110f94f3a62c1d9186bbdfd185155e5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4110f94f3a62c1d9186bbdfd185155e5");
                    return;
                }
                Matrix a2 = PoiBackgroundCard2.a(PoiBackgroundCard2.this, bitmap, PoiBackgroundCard2.this.p, PoiBackgroundCard2.this.k.y);
                PoiBackgroundCard2.this.p.setScaleType(ImageView.ScaleType.MATRIX);
                PoiBackgroundCard2.this.p.setImageMatrix(a2);
                b.C0608b a3 = m.a(str, h.a((Context) PoiBackgroundCard2.this.e), ImageQualityUtil.a());
                a3.g = false;
                a3.k = 4;
                a3.a((ImageView) PoiBackgroundCard2.this.p);
            }
        });
    }

    @Subscribe
    public final void onAcrossBannerRendered(final com.sankuai.waimai.store.poi.list.model.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7841a8d4873478cd590ad2c022ea58c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7841a8d4873478cd590ad2c022ea58c");
        } else if (aVar == null) {
        } else {
            this.i.post(new Runnable() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.background.PoiBackgroundCard2.6
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e5f386309ec85189e8f9fcc93d7893ca", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e5f386309ec85189e8f9fcc93d7893ca");
                        return;
                    }
                    try {
                        PoiBackgroundCard2.a(PoiBackgroundCard2.this, aVar);
                        if (!PoiBackgroundCard2.this.k.aX) {
                            PoiBackgroundCard2.this.r.setVisibility(8);
                        } else {
                            PoiBackgroundCard2.j(PoiBackgroundCard2.this);
                        }
                        if (!PoiBackgroundCard2.this.k.aY) {
                            PoiBackgroundCard2.this.t.setVisibility(8);
                        } else {
                            PoiBackgroundCard2.k(PoiBackgroundCard2.this);
                        }
                        if (com.sankuai.waimai.store.goods.list.utils.e.b()) {
                            if (PoiBackgroundCard2.this.k.ba) {
                                PoiBackgroundCard2.l(PoiBackgroundCard2.this);
                            } else {
                                u.c(PoiBackgroundCard2.this.G);
                            }
                        }
                        if (PoiBackgroundCard2.this.k.y && !PoiBackgroundCard2.this.k.aY && !PoiBackgroundCard2.this.k.aa && !PoiBackgroundCard2.this.k.aX && !PoiBackgroundCard2.this.k.ba) {
                            PoiBackgroundCard2.m(PoiBackgroundCard2.this);
                        }
                        if (PoiBackgroundCard2.this.k.y || !PoiBackgroundCard2.this.k.ab) {
                            return;
                        }
                        PoiBackgroundCard2.m(PoiBackgroundCard2.this);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    private PoiVerticalityDataResponse.Promotion d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb924b3ac6cc34eac430b29a7c5c0818", RobustBitConfig.DEFAULT_VALUE) ? (PoiVerticalityDataResponse.Promotion) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb924b3ac6cc34eac430b29a7c5c0818") : this.l.response.getBackgroundPromotion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "484eb4613d1d1c131b6fed4216a28a41", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "484eb4613d1d1c131b6fed4216a28a41");
        }
        try {
            return d().bgPicUrl;
        } catch (Exception unused) {
            return "";
        }
    }

    private int f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "966cc63a4027da67a2c2cdfe65f4f09d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "966cc63a4027da67a2c2cdfe65f4f09d")).intValue();
        }
        try {
            return d().picOrColor;
        } catch (Exception unused) {
            return 0;
        }
    }

    private int g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f6f68de020dcbcd3550d06b1745c38c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f6f68de020dcbcd3550d06b1745c38c")).intValue();
        }
        try {
            return d().bgAreaOnePic;
        } catch (Exception unused) {
            return 1;
        }
    }

    private String b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01eb2bdd11ea767fe8b7ba2531593ff9", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01eb2bdd11ea767fe8b7ba2531593ff9");
        }
        try {
            switch (i) {
                case 1:
                    return d().bgAreaOne.startColor;
                case 2:
                    return d().bgAreaTwo.startColor;
                case 3:
                    return d().bgAreaThr.startColor;
                default:
                    return "#FFFFFFFF";
            }
        } catch (Exception unused) {
            return "#FFFFFFFF";
        }
    }

    private String c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f792181b1ac1081fcd7cf1fba1f9e926", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f792181b1ac1081fcd7cf1fba1f9e926");
        }
        try {
            switch (i) {
                case 1:
                    return d().bgAreaOne.endColor;
                case 2:
                    return d().bgAreaTwo.endColor;
                case 3:
                    return d().bgAreaThr.endColor;
                default:
                    return "#FFFFFFFF";
            }
        } catch (Exception unused) {
            return "#FFFFFFFF";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(@Nullable String str) {
        Rect rect;
        PoiBackgroundCard2 poiBackgroundCard2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        final Rect rect2;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d569aa8a5e65394e196052bd20bb2b93", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d569aa8a5e65394e196052bd20bb2b93");
        } else if (com.sankuai.waimai.store.util.b.a(this.e)) {
        } else {
            int f = f();
            int a = h.a(this.e, this.k.y ? 265.0f : 182.0f);
            int h2 = h();
            int g = g();
            final Rect rect3 = new Rect();
            final Paint paint = new Paint();
            rect3.left = 0;
            rect3.right = this.i.getWidth();
            rect3.top = 0;
            rect3.bottom = a;
            paint.setAntiAlias(true);
            paint.setShader(new LinearGradient(rect3.left, rect3.top, rect3.left, rect3.bottom, g == 1 ? d.a(b(1), 0) : 0, g == 1 ? d.a(c(1), 0) : 0, Shader.TileMode.REPEAT));
            Rect rect4 = new Rect();
            final Paint paint2 = new Paint();
            rect4.left = 0;
            rect4.right = this.i.getWidth();
            int i6 = h2 - a;
            rect4.top = i6 >= 0 ? a : 0;
            rect4.bottom = i6 >= 0 ? (int) ((h2 * 0.75d) + (a * 0.25d)) : 0;
            paint2.setAntiAlias(true);
            float f2 = rect4.left;
            float f3 = rect4.top;
            float f4 = rect4.left;
            float f5 = rect4.bottom;
            if (f == 1) {
                rect = rect4;
                poiBackgroundCard2 = this;
                i = 0;
                i3 = d.a(poiBackgroundCard2.b(2), 0);
                i2 = 1;
            } else {
                rect = rect4;
                poiBackgroundCard2 = this;
                i = 0;
                i2 = 1;
                i3 = 0;
            }
            paint2.setShader(new LinearGradient(f2, f3, f4, f5, i3, f == i2 ? d.a(poiBackgroundCard2.c(2), i) : 0, Shader.TileMode.REPEAT));
            final Rect rect5 = new Rect();
            final Paint paint3 = new Paint();
            rect5.left = 0;
            rect5.right = poiBackgroundCard2.i.getWidth();
            rect5.top = i6 >= 0 ? (int) ((h2 * 0.75d) + (a * 0.25d)) : 0;
            if (i6 < 0) {
                h2 = 0;
            }
            rect5.bottom = h2;
            paint3.setAntiAlias(true);
            float f6 = rect5.left;
            float f7 = rect5.top;
            float f8 = rect5.left;
            float f9 = rect5.bottom;
            if (f == 1) {
                i4 = 0;
                i5 = d.a(poiBackgroundCard2.b(3), 0);
            } else {
                i4 = 0;
                i5 = 0;
            }
            paint3.setShader(new LinearGradient(f6, f7, f8, f9, i5, f == 1 ? d.a(poiBackgroundCard2.c(3), i4) : 0, Shader.TileMode.REPEAT));
            if (!TextUtils.isEmpty(str)) {
                poiBackgroundCard2.a(-999, str);
            }
            try {
                rect2 = rect;
            } catch (Exception e) {
                e = e;
            }
            try {
                poiBackgroundCard2.f.b().setBackground(new ShapeDrawable(new Shape() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.background.PoiBackgroundCard2.9
                    public static ChangeQuickRedirect a;

                    @Override // android.graphics.drawable.shapes.Shape
                    public final void draw(Canvas canvas, Paint paint4) {
                        Object[] objArr2 = {canvas, paint4};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "53b3568b90859866e9ac230836f65fdb", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "53b3568b90859866e9ac230836f65fdb");
                            return;
                        }
                        PoiBackgroundCard2.a(PoiBackgroundCard2.this, canvas, paint, rect3);
                        PoiBackgroundCard2.a(PoiBackgroundCard2.this, canvas, paint2, rect2);
                        PoiBackgroundCard2.a(PoiBackgroundCard2.this, canvas, paint3, rect5);
                    }
                }));
            } catch (Exception e2) {
                e = e2;
                com.sankuai.waimai.store.base.log.a.a(e);
            }
        }
    }

    private int h() {
        View findViewById;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7cabca87fe3d7c9890b21767fef533a6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7cabca87fe3d7c9890b21767fef533a6")).intValue();
        }
        LinearLayout linearLayout = (LinearLayout) this.f.b();
        int childCount = linearLayout.getChildCount();
        View childAt = linearLayout.getChildAt(0);
        int height = childAt != null ? 0 + childAt.getHeight() : 0;
        for (int i = 1; i < childCount; i++) {
            View childAt2 = linearLayout.getChildAt(i);
            if (childAt2 != null && (findViewById = childAt2.findViewById(R.id.ll_module_container)) != null) {
                height += findViewById.getHeight();
            }
        }
        return height;
    }

    private void a(int i, String str) {
        Object[] objArr = {-999, str};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74f914878a31f4ece828aac1f3e5a80a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74f914878a31f4ece828aac1f3e5a80a");
            return;
        }
        String str2 = this.k.G;
        ViewGroup b = this.f.b();
        com.sankuai.waimai.store.expose.v2.entity.b bVar = new com.sankuai.waimai.store.expose.v2.entity.b(str2, "b_waimai_kshjs2vb_mv", b, "b_waimai_kshjs2vb_mv-999");
        bVar.a("pic_id", str);
        bVar.a("cat_id", Long.valueOf(this.k.c));
        bVar.a("banner_id", -999);
        com.sankuai.waimai.store.expose.v2.b.a().a((SCBaseActivity) this.e, bVar);
    }

    @Override // com.sankuai.waimai.store.assembler.component.BaseCard
    public final void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c3bdd29074950bafb35d08f5deca672", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c3bdd29074950bafb35d08f5deca672");
            return;
        }
        super.onDestroy();
        com.meituan.android.bus.a.a().b(this);
    }

    private boolean i() {
        BaseTileNew<BaseModuleDesc, Object> searchTipsBlocks;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d157351eeee2ba4013d4b856fcfab358", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d157351eeee2ba4013d4b856fcfab358")).booleanValue();
        }
        if (this.l != null && this.l.response != null && this.l.response.getSearchTipsBlocks() != null && (searchTipsBlocks = this.l.response.getSearchTipsBlocks()) != null && searchTipsBlocks.data != null && searchTipsBlocks.data.jsonData != null && searchTipsBlocks.data.jsonData.get("search_keyword") != null) {
            Object obj = searchTipsBlocks.data.jsonData.get("search_keyword");
            if ((obj instanceof ArrayList) && ((ArrayList) obj).size() > 0) {
                return true;
            }
        }
        return false;
    }
}
