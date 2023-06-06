package com.sankuai.waimai.bussiness.order.list.rn;

import android.support.annotation.Keep;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.ao;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.business.order.api.model.e;
import com.sankuai.waimai.business.order.api.model.f;
import com.sankuai.waimai.bussiness.order.list.view.GoldenCoinProgressBar;
import com.sankuai.waimai.foundation.utils.ImageQualityUtil;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.capacity.imageloader.a;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class GoldenCoinProgressViewManager extends SimpleViewManager<GoldenCoinProgressBar> {
    public static final String REACT_CLASS = "GoldCoinProgressBar";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public GoldenCoinProgressBar createViewInstance(ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9eff6407664e5157025290f18a50d378", RobustBitConfig.DEFAULT_VALUE) ? (GoldenCoinProgressBar) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9eff6407664e5157025290f18a50d378") : new GoldenCoinProgressBar(aoVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v2 */
    @ReactProp(name = "goldCoinProgressInfo")
    public void setGoldCoinProgressInfo(GoldenCoinProgressBar goldenCoinProgressBar, String str) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        char c = 2;
        ?? r12 = 0;
        Object[] objArr = {goldenCoinProgressBar, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "51fa09e7241978af39496d6c22b1aab0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "51fa09e7241978af39496d6c22b1aab0");
            return;
        }
        try {
            final f fVar = (f) new Gson().fromJson(str, (Class<Object>) f.class);
            Object[] objArr2 = {fVar};
            ChangeQuickRedirect changeQuickRedirect3 = GoldenCoinProgressBar.a;
            if (PatchProxy.isSupport(objArr2, goldenCoinProgressBar, changeQuickRedirect3, false, "05f24e4a4fefd7a3345e5f17c329b60f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, goldenCoinProgressBar, changeQuickRedirect3, false, "05f24e4a4fefd7a3345e5f17c329b60f");
            } else {
                int size = fVar.f != null ? fVar.f.size() : 0;
                if (size != 0) {
                    int i12 = 5;
                    int i13 = size > 5 ? 5 : size;
                    if (i13 > 3) {
                        int a = goldenCoinProgressBar.f ? g.a(goldenCoinProgressBar.getContext(), 20.0f) : g.a(goldenCoinProgressBar.getContext(), 40.0f);
                        i = a;
                        i2 = (goldenCoinProgressBar.e - (a * 2)) / (i13 - 1);
                    } else {
                        i = goldenCoinProgressBar.e / (i13 + 1);
                        i2 = i;
                    }
                    int i14 = fVar.a;
                    List<e> list = fVar.f;
                    int i15 = 0;
                    while (true) {
                        if (i15 >= i13) {
                            i3 = i13;
                            break;
                        } else if (i14 < list.get(i15).b) {
                            i3 = i15;
                            break;
                        } else {
                            i15++;
                        }
                    }
                    if (i3 < i13) {
                        i5 = list.get(i3).b;
                        i4 = i3 == 0 ? 0 : list.get(i3 - 1).b;
                    } else {
                        int i16 = i3 - 1;
                        i4 = list.get(i16).b;
                        i5 = i3 > 1 ? (list.get(i16).b - list.get(i3 - 2).b) + list.get(i16).b : list.get(0).b * 2;
                    }
                    double d = 1.0d;
                    double d2 = i5 <= i4 ? 1.0d : (i14 - i4) / (i5 - i4);
                    if (d2 <= 1.0d) {
                        d = d2;
                    }
                    int i17 = i3 == 0 ? (int) (i * d) : i3 < i13 ? (int) (((i3 - 1) * i2) + i + (i2 * d)) : (int) (((i3 - 1) * i2) + i + (i * d));
                    if (i17 > goldenCoinProgressBar.e) {
                        i17 = goldenCoinProgressBar.e;
                    }
                    goldenCoinProgressBar.c.getLayoutParams().width = i17;
                    int i18 = 0;
                    while (i18 < i12) {
                        ViewGroup viewGroup = (ViewGroup) goldenCoinProgressBar.d.getChildAt(i18);
                        if (i18 < i13) {
                            byte b = i18 < i3 ? (byte) 1 : (byte) 0;
                            int a2 = ((i2 * i18) + i) - g.a(goldenCoinProgressBar.getContext(), 30.0f);
                            Object[] objArr3 = new Object[i12];
                            objArr3[r12] = viewGroup;
                            objArr3[1] = fVar;
                            objArr3[c] = Integer.valueOf(i18);
                            objArr3[3] = Byte.valueOf(b);
                            objArr3[4] = Integer.valueOf(a2);
                            ChangeQuickRedirect changeQuickRedirect4 = GoldenCoinProgressBar.a;
                            boolean z = b;
                            i6 = i3;
                            i7 = i;
                            i8 = i2;
                            if (PatchProxy.isSupport(objArr3, goldenCoinProgressBar, changeQuickRedirect4, false, "e01eab4eccbef883756df4b27f2f99a3", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, goldenCoinProgressBar, changeQuickRedirect4, r12, "e01eab4eccbef883756df4b27f2f99a3");
                                i9 = i13;
                            } else {
                                View findViewById = viewGroup.findViewById(R.id.ll_golden_coin_progress_milestone_top);
                                ImageView imageView = (ImageView) viewGroup.findViewById(R.id.iv_golden_coin_progress_milestone_top_icon);
                                TextView textView = (TextView) viewGroup.findViewById(R.id.tv_golden_coin_progress_milestone_top_cost);
                                TextView textView2 = (TextView) viewGroup.findViewById(R.id.tv_golden_coin_progress_milestone_top_tip);
                                View findViewById2 = viewGroup.findViewById(R.id.iv_golden_coin_progress_milestone_top_triangle);
                                View findViewById3 = viewGroup.findViewById(R.id.iv_golden_coin_progress_milestone_middle);
                                ImageView imageView2 = (ImageView) viewGroup.findViewById(R.id.iv_golden_coin_progress_milestone_bottom_bg);
                                TextView textView3 = (TextView) viewGroup.findViewById(R.id.tv_golden_coin_progress_milestone_bottom_content);
                                View findViewById4 = viewGroup.findViewById(R.id.iv_golden_coin_progress_milestone_bottom_mask);
                                i9 = i13;
                                ((FrameLayout.LayoutParams) viewGroup.getLayoutParams()).leftMargin = a2;
                                findViewById.setEnabled(z);
                                findViewById2.setEnabled(z);
                                findViewById3.setEnabled(z);
                                textView2.setEnabled(z);
                                if (z != 0) {
                                    i10 = 8;
                                    findViewById4.setVisibility(8);
                                    i11 = 0;
                                } else {
                                    i10 = 8;
                                    i11 = 0;
                                    findViewById4.setVisibility(0);
                                }
                                if (z != 0) {
                                    findViewById.setVisibility(i10);
                                    textView2.setVisibility(i11);
                                    if (TextUtils.isEmpty(fVar.f.get(i18).c)) {
                                        textView2.setText("可兑换");
                                    } else {
                                        textView2.setText(fVar.f.get(i18).c);
                                    }
                                } else {
                                    textView2.setVisibility(i10);
                                    findViewById.setVisibility(0);
                                    b.C0608b a3 = a.a();
                                    a3.b = imageView.getContext();
                                    a3.c = fVar.b;
                                    a3.f = ImageQualityUtil.b();
                                    a3.i = R.drawable.wm_order_golden_coin;
                                    a3.j = R.drawable.wm_order_golden_coin;
                                    a3.a(imageView);
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(fVar.f.get(i18).b);
                                    textView.setText(sb.toString());
                                }
                                textView3.setText(fVar.f.get(i18).d);
                                b.C0608b a4 = a.a();
                                a4.b = imageView2.getContext();
                                a4.c = fVar.c;
                                a4.f = ImageQualityUtil.b();
                                a4.i = R.drawable.wm_order_red_pack_small;
                                a4.j = R.drawable.wm_order_red_pack_small;
                                a4.a(imageView2);
                            }
                            viewGroup.setVisibility(0);
                        } else {
                            i6 = i3;
                            i7 = i;
                            i8 = i2;
                            i9 = i13;
                            viewGroup.setVisibility(8);
                        }
                        i18++;
                        i3 = i6;
                        i = i7;
                        i2 = i8;
                        i13 = i9;
                        c = 2;
                        i12 = 5;
                        r12 = 0;
                    }
                }
            }
            goldenCoinProgressBar.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.list.rn.GoldenCoinProgressViewManager.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr4 = {view};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect5, false, "f7f783c9e30a6c53dd9ebda39249a181", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect5, false, "f7f783c9e30a6c53dd9ebda39249a181");
                        return;
                    }
                    JudasManualManager.a a5 = JudasManualManager.a("b_waimai_uev6qdu1_mc").a("c_1wrb4ko");
                    a5.b = GoldenCoinProgressViewManager.REACT_CLASS;
                    a5.a();
                    com.sankuai.waimai.foundation.router.a.a(view.getContext(), fVar.e);
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
