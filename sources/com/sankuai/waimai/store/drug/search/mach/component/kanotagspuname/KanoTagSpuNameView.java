package com.sankuai.waimai.store.drug.search.mach.component.kanotagspuname;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.d;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.foundation.utils.ColorUtils;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.platform.widget.tag.virtualtag.TagCanvasView;
import com.sankuai.waimai.store.search.model.BaseProductPoi;
import com.sankuai.waimai.store.search.ui.result.dynamictag.SGSearchTagInfo;
import com.sankuai.waimai.store.util.ah;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.util.i;
import com.sankuai.waimai.store.util.monitor.monitor.StoreException;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class KanoTagSpuNameView extends FrameLayout {
    public static ChangeQuickRedirect a;
    public static final int b = Color.parseColor("#33312E");
    private Context c;
    private TextView d;
    private TagCanvasView e;
    private LinearLayout f;
    private com.sankuai.waimai.store.drug.search.common.others.a g;
    private a h;

    public KanoTagSpuNameView(@NonNull Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82b0606128210e0bd68038836f9f7710", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82b0606128210e0bd68038836f9f7710");
        }
    }

    private KanoTagSpuNameView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, null, 0);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06cedd1149ddd92b44d3351c2b832d8d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06cedd1149ddd92b44d3351c2b832d8d");
        }
    }

    public KanoTagSpuNameView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "386f9d9b3ea87b25908c9fee90b052c3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "386f9d9b3ea87b25908c9fee90b052c3");
            return;
        }
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "55e0f646a3ceb52f882fdf54db10a512", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "55e0f646a3ceb52f882fdf54db10a512");
            return;
        }
        inflate(context, R.layout.wm_drug_kano_tag_spu_name, this);
        this.c = context;
        this.f = (LinearLayout) findViewById(R.id.kano_tag_container);
        this.d = (TextView) findViewById(R.id.spu_name);
        this.e = (TagCanvasView) findViewById(R.id.tag_front_of_name);
        this.g = new com.sankuai.waimai.store.drug.search.common.others.a(context);
        this.e.setCallback(new TagCanvasView.a() { // from class: com.sankuai.waimai.store.drug.search.mach.component.kanotagspuname.KanoTagSpuNameView.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.widget.tag.virtualtag.TagCanvasView.a
            public final void a() {
                int measuredWidth;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "15a5e6789ecb68e57caa87d5d8ad012f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "15a5e6789ecb68e57caa87d5d8ad012f");
                } else if (KanoTagSpuNameView.this.f.getVisibility() == 0 && KanoTagSpuNameView.this.h != null && (measuredWidth = KanoTagSpuNameView.this.e.getMeasuredWidth()) > 0) {
                    Drawable a2 = new e.a().a();
                    a2.setBounds(0, 0, measuredWidth, 1);
                    KanoTagSpuNameView.this.a(KanoTagSpuNameView.this.h.d, KanoTagSpuNameView.this.h.c, KanoTagSpuNameView.this.h.e);
                    com.sankuai.waimai.store.drug.search.common.utils.a.a(a2, KanoTagSpuNameView.this.h.g, KanoTagSpuNameView.this.d, KanoTagSpuNameView.this.h.f, KanoTagSpuNameView.this.h.b, 2);
                }
            }
        });
    }

    public void setData(@NonNull a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0943d38837062fe11ff04ce8d21a88a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0943d38837062fe11ff04ce8d21a88a");
            return;
        }
        u.c(this.f);
        if (aVar == null) {
            return;
        }
        this.h = aVar;
        a(aVar.d, aVar.c, aVar.e);
        int i = 2;
        if (com.sankuai.shangou.stone.util.a.b(aVar.h) || this.g == null) {
            u.c(this.f);
            List<BaseProductPoi.RedWord> list = aVar.g;
            TextView textView = this.d;
            final String str = aVar.f;
            String str2 = aVar.b;
            Integer[] numArr = {2};
            Object[] objArr2 = {list, textView, str, str2, numArr};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.drug.search.common.utils.a.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "7647276ef96506ae8e73aa5a9b08632d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "7647276ef96506ae8e73aa5a9b08632d");
                return;
            }
            Context context = textView.getContext();
            if (com.sankuai.shangou.stone.util.a.b(list)) {
                textView.setText(str2);
                return;
            }
            try {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                BaseProductPoi.RedWord a2 = com.sankuai.waimai.store.drug.search.common.utils.a.a(list, numArr);
                if (a2 != null) {
                    spannableStringBuilder.append((CharSequence) a2.word);
                }
                spannableStringBuilder.append((CharSequence) str2);
                int i2 = 0;
                while (i2 < list.size()) {
                    BaseProductPoi.RedWord redWord = list.get(i2);
                    if (redWord != null && !t.a(redWord.word) && com.sankuai.waimai.store.drug.search.common.utils.a.a(redWord.position, numArr)) {
                        if (redWord.position != i && redWord.position != 3) {
                            if (redWord.position == 1 && !com.sankuai.waimai.store.drug.search.common.utils.a.a(i, numArr)) {
                                spannableStringBuilder.setSpan(new com.sankuai.waimai.store.view.b(g.a(context, 14.0f), d.a("#19FF8000", -1), g.a(context, 4.0f), d.a("#FF8000", -1), g.a(context, 11.0f), g.a(context, 4.0f), 0, g.a(context, 2.0f)), 0, redWord.word.length(), 0);
                            }
                        }
                        spannableStringBuilder.setSpan(new com.sankuai.waimai.store.view.e() { // from class: com.sankuai.waimai.store.drug.search.common.utils.a.1
                            public static ChangeQuickRedirect a;

                            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                            public final void updateDrawState(@NonNull TextPaint textPaint) {
                                Object[] objArr3 = {textPaint};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "aabd9dab51195fffd3ed7fea9b0c7753", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "aabd9dab51195fffd3ed7fea9b0c7753");
                                    return;
                                }
                                super.updateDrawState(textPaint);
                                if (TextUtils.isEmpty(str)) {
                                    textPaint.setColor(d.a("#FF8000", -1));
                                } else {
                                    textPaint.setColor(d.a(str, -1));
                                }
                                textPaint.setUnderlineText(false);
                            }
                        }, redWord.index, redWord.index + redWord.word.length(), 0);
                        i2++;
                        i = 2;
                    }
                    i2++;
                    i = 2;
                }
                textView.setText(spannableStringBuilder);
                return;
            } catch (Exception unused) {
                textView.setText(str2);
                StoreException storeException = StoreException.ApiDataNotRightException;
                ah.a(storeException, "redWorlds: " + i.a(list) + " originText: " + str2);
                return;
            }
        }
        float a3 = a(aVar.h);
        Drawable a4 = new e.a().a();
        a4.setBounds(0, 0, h.a(this.c, a3), 0);
        com.sankuai.waimai.store.drug.search.common.utils.a.a(a4, aVar.g, this.d, aVar.f, aVar.b, 2);
        this.d.setCompoundDrawables(new e.a().a(), null, null, null);
        this.g.a(this.f, this.e, aVar.h);
    }

    private float a(@NonNull List<SGSearchTagInfo> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0fdaebef3db9d9f11102046d84be15b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0fdaebef3db9d9f11102046d84be15b")).floatValue();
        }
        float f = 0.0f;
        for (int i = 0; i < com.sankuai.shangou.stone.util.a.a((List) list); i++) {
            SGSearchTagInfo sGSearchTagInfo = list.get(i);
            if (sGSearchTagInfo != null) {
                List<com.sankuai.waimai.platform.widget.tag.api.e> list2 = sGSearchTagInfo.subTagBaseInfoList;
                if (!com.sankuai.shangou.stone.util.a.b(list2)) {
                    float f2 = f;
                    for (int i2 = 0; i2 < com.sankuai.shangou.stone.util.a.a((List) list2); i2++) {
                        if (list2.get(i2) != null) {
                            f2 += Float.valueOf(list2.get(i2).f).floatValue();
                        }
                    }
                    f = f2;
                }
            }
        }
        return f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(float f, @NonNull String str, int i) {
        Object[] objArr = {Float.valueOf(f), str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ffa2da2c4da5d42f3a700e9924ecd8b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ffa2da2c4da5d42f3a700e9924ecd8b");
            return;
        }
        this.d.setTextSize(f);
        this.d.setTextColor(ColorUtils.a(str, b));
        this.d.setMaxLines(i);
    }
}
