package com.sankuai.eh.plugins.skeleton.view;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.widget.AppCompatTextView;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.animation.AccelerateInterpolator;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.dianping.titans.js.JsBridgeResult;
import com.dianping.titans.widget.DynamicTitleParser;
import com.google.gson.JsonArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.plugins.skeleton.view.d;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class SKTText extends RelativeLayout {
    public static ChangeQuickRedirect a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private d.a f;
    private TextView g;
    private JsonArray h;
    private Handler i;
    private ScheduledFuture<?> j;
    private ObjectAnimator k;
    private ObjectAnimator l;

    public SKTText(Context context, d.a aVar) {
        super(context);
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb80a67b8ccb1236fba9812075b78105", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb80a67b8ccb1236fba9812075b78105");
            return;
        }
        this.b = 1;
        this.c = 2;
        this.d = 3;
        this.e = 1000;
        this.i = new Handler(Looper.getMainLooper());
        this.f = aVar;
        this.h = com.sankuai.eh.component.service.utils.b.b(this.f.f.get("content"));
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3a5eff2eb33c0db145517f9ee07d4642", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3a5eff2eb33c0db145517f9ee07d4642");
            return;
        }
        this.f.a(this);
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0a5f67050c5cf65a4e71e75910f09e97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0a5f67050c5cf65a4e71e75910f09e97");
        } else {
            this.g = new FitHeightTextView(getContext());
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "a6684ec606a2a6044c5245a1abde3d34", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "a6684ec606a2a6044c5245a1abde3d34");
            } else {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(15);
                int a2 = com.sankuai.eh.component.service.utils.b.a(this.f.f.get("align"), 1);
                if (a2 == 1) {
                    layoutParams.addRule(9);
                } else if (a2 == 2) {
                    layoutParams.addRule(11);
                } else {
                    layoutParams.addRule(13);
                }
                this.g.setLayoutParams(layoutParams);
            }
            this.g.setTextColor(com.sankuai.eh.plugins.skeleton.util.b.a(com.sankuai.eh.component.service.utils.b.b(this.f.f.get("color"), ""), -16777216));
            this.g.getPaint().setFakeBoldText(com.sankuai.eh.component.service.utils.b.a(this.f.f.get(DynamicTitleParser.PARSER_VAL_FONT_STYLE_BOLD), false).booleanValue());
            this.g.setEllipsize(TextUtils.TruncateAt.END);
            this.g.setTextSize(getTextSize());
        }
        Object[] objArr5 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect5 = a;
        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "227f6dfbdce8d392b2f92675e181b0b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "227f6dfbdce8d392b2f92675e181b0b7");
            return;
        }
        int a3 = com.sankuai.eh.component.service.utils.b.a(this.f.f.get("delay"), 0);
        if (a3 > 0) {
            postDelayed(b.a(this), a3);
            return;
        }
        addView(this.g);
        a();
    }

    public static /* synthetic */ void a(SKTText sKTText) {
        Object[] objArr = {sKTText};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "25bfc0b5d59344efe553def3a18cc63f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "25bfc0b5d59344efe553def3a18cc63f");
            return;
        }
        sKTText.addView(sKTText.g);
        sKTText.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f62412777225ac3173c1a2329e0986f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f62412777225ac3173c1a2329e0986f");
            return;
        }
        super.onDetachedFromWindow();
        if (this.j != null) {
            this.j.cancel(false);
        }
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4b601ffe422a49db8a26c10fdc2f618", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4b601ffe422a49db8a26c10fdc2f618");
            return;
        }
        b();
        int a2 = com.sankuai.eh.component.service.utils.b.a(this.f.f.get("interval"), 0);
        if (this.h.size() <= 0) {
            return;
        }
        if (a2 > 0 && this.h.size() > 1) {
            this.j = com.sankuai.android.jarvis.c.c("eh-text").scheduleAtFixedRate(new AnonymousClass1(), 0L, a2, TimeUnit.MILLISECONDS);
            return;
        }
        this.g.setText(com.sankuai.eh.component.service.utils.b.b(this.h.get(0), ""));
        this.k.start();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.eh.plugins.skeleton.view.SKTText$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public class AnonymousClass1 implements Runnable {
        public static ChangeQuickRedirect a;
        public int b = 0;

        public AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d82dd5e5d6a1b2ffe31d6bf018bdbad", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d82dd5e5d6a1b2ffe31d6bf018bdbad");
                return;
            }
            JsonArray jsonArray = SKTText.this.h;
            int i = this.b;
            this.b = i + 1;
            String b = com.sankuai.eh.component.service.utils.b.b(jsonArray.get(i % SKTText.this.h.size()), "");
            Handler handler = SKTText.this.i;
            Object[] objArr2 = {this, b};
            ChangeQuickRedirect changeQuickRedirect2 = c.a;
            handler.post(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "c5abcae33ce8b39e6b6764f816dfd6bc", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "c5abcae33ce8b39e6b6764f816dfd6bc") : new c(this, b));
        }
    }

    private float getTextSize() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "816c86314b11bd43b659bf1d8192e765", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "816c86314b11bd43b659bf1d8192e765")).floatValue();
        }
        return (float) Math.round(((Math.min(com.sankuai.eh.component.service.utils.a.a(), 768) / 7.5d) * com.sankuai.eh.component.service.utils.b.a(this.f.f.get(JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE), 300)) / 1000.0d);
    }

    public final int getFontHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cecb1a500547c5d24a551bac69c5f49c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cecb1a500547c5d24a551bac69c5f49c")).intValue();
        }
        Paint paint = new Paint();
        paint.setTextSize(getTextSize());
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        return ((int) Math.ceil(fontMetrics.descent - fontMetrics.top)) + 2;
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc2214ee8aaebb25bf5db19fc457b025", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc2214ee8aaebb25bf5db19fc457b025");
            return;
        }
        this.k = ObjectAnimator.ofFloat(this.g, "alpha", 0.0f, 1.0f);
        this.l = ObjectAnimator.ofFloat(this.g, "alpha", 1.0f, 0.0f);
        this.k.setDuration(300L);
        this.l.setDuration(300L);
        this.k.setInterpolator(new AccelerateInterpolator());
        this.l.setInterpolator(new AccelerateInterpolator());
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class FitHeightTextView extends AppCompatTextView {
        public static ChangeQuickRedirect a;
        private Paint b;
        private float c;

        public FitHeightTextView(Context context) {
            super(context);
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45b5cb88131d712e9c1063bd84479962", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45b5cb88131d712e9c1063bd84479962");
                return;
            }
            this.c = 8.0f;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f110b9dbec54f43ed8d759a53309dd0a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f110b9dbec54f43ed8d759a53309dd0a");
                return;
            }
            this.b = new TextPaint();
            this.b.set(getPaint());
        }

        @Override // android.support.v7.widget.AppCompatTextView, android.widget.TextView
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            Object[] objArr = {charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "acc8a3ed281341e09f7694997c0824e4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "acc8a3ed281341e09f7694997c0824e4");
                return;
            }
            a(charSequence.toString(), getHeight());
            super.onTextChanged(charSequence, i, i2, i3);
        }

        private void a(String str, int i) {
            Object[] objArr = {str, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5906a82af9bc230ffcaf05e276f691b7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5906a82af9bc230ffcaf05e276f691b7");
            } else if (i > 0) {
                int paddingTop = (i - getPaddingTop()) - getPaddingBottom();
                float textSize = getTextSize();
                this.b.setTextSize(textSize);
                while (true) {
                    if (this.b.descent() - this.b.ascent() <= paddingTop) {
                        break;
                    }
                    textSize -= 1.0f;
                    if (textSize <= this.c) {
                        textSize = this.c;
                        break;
                    }
                    this.b.setTextSize(textSize);
                }
                Context context = getContext();
                Object[] objArr2 = {context, Float.valueOf(textSize)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                setTextSize(PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "96d85985e275f1d8020ea589b621d9a5", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "96d85985e275f1d8020ea589b621d9a5")).floatValue() : textSize / context.getResources().getDisplayMetrics().scaledDensity);
            }
        }

        @Override // android.view.View
        public void onSizeChanged(int i, int i2, int i3, int i4) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae0df2dbec533cadbb83b06dbcb2d5e8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae0df2dbec533cadbb83b06dbcb2d5e8");
            } else if (i2 != i4) {
                a(getText().toString(), i2);
            }
        }
    }
}
