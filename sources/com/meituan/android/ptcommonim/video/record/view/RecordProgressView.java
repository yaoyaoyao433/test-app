package com.meituan.android.ptcommonim.video.record.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.os.Build;
import android.os.Handler;
import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RecordProgressView extends View {
    public static ChangeQuickRedirect a;
    public int b;
    public int c;
    public int d;
    public ArrayList<a> e;
    public int f;
    private final String g;
    private Paint h;
    private Paint i;
    @Nullable
    private Handler j;
    private a k;
    private int l;
    private boolean m;

    public RecordProgressView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38761bf94bd55d7f6a1a11d0e9d1e04f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38761bf94bd55d7f6a1a11d0e9d1e04f");
            return;
        }
        this.g = "RecordProgressView";
        this.m = false;
        c();
    }

    public RecordProgressView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "087deb682a0e00b56fb61616df6ee96e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "087deb682a0e00b56fb61616df6ee96e");
            return;
        }
        this.g = "RecordProgressView";
        this.m = false;
        c();
    }

    public RecordProgressView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20285392f20681b35631429700ccab97", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20285392f20681b35631429700ccab97");
            return;
        }
        this.g = "RecordProgressView";
        this.m = false;
        c();
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57f2560393c5c3dfdb7b859f9ce99b63", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57f2560393c5c3dfdb7b859f9ce99b63");
            return;
        }
        this.h = new Paint();
        this.i = new Paint();
        this.h.setAntiAlias(true);
        this.i.setAntiAlias(true);
        this.c = getResources().getColor(R.color.ugckit_record_progress_bg);
        this.b = getResources().getColor(R.color.ugckit_record_progress);
        this.d = getResources().getColor(R.color.ugckit_record_progress_divider);
        this.h.setColor(this.b);
        this.i.setColor(this.d);
        this.e = new ArrayList<>();
        this.k = new a();
        this.j = new Handler();
        d();
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        int i = 0;
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "799b79b4430758370c0b3b823e54c1cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "799b79b4430758370c0b3b823e54c1cf");
            return;
        }
        super.onDraw(canvas);
        canvas.drawColor(this.c);
        Iterator<a> it = this.e.iterator();
        float f = 0.0f;
        while (it.hasNext()) {
            a next = it.next();
            float width = ((next.a + i) / this.l) * getWidth();
            int i2 = next.b;
            if (i2 == 1) {
                canvas.drawRect(f, 0.0f, width, getHeight(), this.h);
            } else if (i2 == 3) {
                canvas.drawRect(f - getResources().getDimension(R.dimen.ugckit_progress_divider), 0.0f, width, getHeight(), this.i);
            }
            i += next.a;
            f = width;
        }
        if (this.k != null && this.k.a != 0) {
            canvas.drawRect(f, 0.0f, f + ((this.k.a / this.l) * getWidth()), getHeight(), this.h);
            f += (this.k.a / this.l) * getWidth();
        }
        float f2 = f;
        if (this.m) {
            canvas.drawRect(f2, 0.0f, f2 + getResources().getDimension(R.dimen.ugckit_progress_cursor), getHeight(), this.i);
        }
    }

    public void setNormalColor(@ColorInt int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b500851ac092a8d491eec33dc9981f34", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b500851ac092a8d491eec33dc9981f34");
            return;
        }
        this.b = i;
        this.h.setColor(this.b);
    }

    public void setMaxDuration(int i) {
        this.l = i;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9884cac42446f6ce581f98f9a7af62c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9884cac42446f6ce581f98f9a7af62c0");
            return;
        }
        this.e = new ArrayList<>();
        this.k = new a();
        this.f = 0;
        setProgress(0);
    }

    public void setProgress(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ef254e099455dd36785012cba236502", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ef254e099455dd36785012cba236502");
            return;
        }
        this.m = true;
        this.k.b = 1;
        this.k.a = i - this.f;
        invalidate();
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3afbdb14114e871610235694d0beb80f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3afbdb14114e871610235694d0beb80f");
            return;
        }
        new StringBuilder("GF---DEBUG---RecordProgressView.clipComplete: ").append(this.k.a);
        this.m = false;
        this.f += this.k.a;
        this.e.add(this.k);
        a aVar = new a();
        aVar.b = 3;
        aVar.a = 0;
        this.e.add(aVar);
        this.k = new a();
        invalidate();
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b063ceee6e404507729e5b71fb46a0fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b063ceee6e404507729e5b71fb46a0fb");
        } else if (Build.VERSION.SDK_INT >= 21) {
            this.j.postDelayed(com.meituan.android.ptcommonim.video.record.view.a.a(this), 100L);
        }
    }

    public static /* synthetic */ void a(RecordProgressView recordProgressView) {
        Object[] objArr = {recordProgressView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "32be651f348a2a55a4f374fc1b23e4f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "32be651f348a2a55a4f374fc1b23e4f1");
            return;
        }
        recordProgressView.setOutlineProvider(new ViewOutlineProvider() { // from class: com.meituan.android.ptcommonim.video.record.view.RecordProgressView.1
            public static ChangeQuickRedirect a;

            @Override // android.view.ViewOutlineProvider
            public final void getOutline(View view, Outline outline) {
                Object[] objArr2 = {view, outline};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "98d88d2f6b95056e0305ff669438ffbe", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "98d88d2f6b95056e0305ff669438ffbe");
                } else {
                    outline.setRoundRect(0, 0, RecordProgressView.this.getWidth(), RecordProgressView.this.getHeight(), com.meituan.android.ptcommonim.base.util.a.a(2));
                }
            }
        });
        recordProgressView.setClipToOutline(true);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class a {
        public int a;
        public int b;

        private a() {
        }
    }
}
