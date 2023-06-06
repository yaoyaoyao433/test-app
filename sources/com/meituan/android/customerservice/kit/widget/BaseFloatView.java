package com.meituan.android.customerservice.kit.widget;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class BaseFloatView extends FloatingView implements View.OnClickListener {
    public static ChangeQuickRedirect b;
    private TextView a;
    protected Handler c;
    private String e;
    private a f;

    public void a() {
    }

    public abstract void a(int i);

    public abstract void b();

    public BaseFloatView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d0202deef5af2cc601d3af9b8f4aafd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d0202deef5af2cc601d3af9b8f4aafd");
            return;
        }
        this.c = new Handler(Looper.getMainLooper());
        c();
    }

    public BaseFloatView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5986bfc655dc46edcd2ff883fff9af5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5986bfc655dc46edcd2ff883fff9af5");
            return;
        }
        this.c = new Handler(Looper.getMainLooper());
        c();
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3adb79f9a1a76b7969a10ca087346f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3adb79f9a1a76b7969a10ca087346f7");
            return;
        }
        this.a = (TextView) inflate(getContext(), R.layout.cs_voip_view_float_small, this).findViewById(R.id.time_text);
        setToEdge(true);
        setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f1443b4528c1a1446d4bde707977239", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f1443b4528c1a1446d4bde707977239");
        } else {
            b();
        }
    }

    public final void a(Runnable runnable) {
        boolean z = true;
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dab753e1e8f67f596fd98ca04aea9731", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dab753e1e8f67f596fd98ca04aea9731");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "05c76dd3a6cbb894610a825a90c8cf2e", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "05c76dd3a6cbb894610a825a90c8cf2e")).booleanValue();
        } else if (Looper.myLooper() != Looper.getMainLooper()) {
            z = false;
        }
        if (z) {
            runnable.run();
        } else {
            this.c.post(runnable);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class a {
        public static ChangeQuickRedirect a;
        int b;
        long c;
        private final int e;
        private Runnable f;

        public a() {
            Object[] objArr = {BaseFloatView.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5c40f5855b5e92e56947d8b369a9a70", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5c40f5855b5e92e56947d8b369a9a70");
                return;
            }
            this.e = 200;
            this.b = 0;
            this.c = 0L;
            this.f = new Runnable() { // from class: com.meituan.android.customerservice.kit.widget.BaseFloatView.a.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c202369ca057895304f4597bc943f458", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c202369ca057895304f4597bc943f458");
                        return;
                    }
                    int i = a.this.b;
                    a aVar = a.this;
                    a aVar2 = a.this;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a.a;
                    aVar.b = (int) (((PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect3, false, "72514177f98035020c64b667a1b05018", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect3, false, "72514177f98035020c64b667a1b05018")).longValue() : System.currentTimeMillis()) - a.this.c) / 1000);
                    if (a.this.b > i) {
                        BaseFloatView.this.a(a.this.b);
                    }
                    BaseFloatView.this.c.postDelayed(this, 200L);
                }
            };
        }

        public final void a(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c284336c7d23ab361853b57fee87b989", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c284336c7d23ab361853b57fee87b989");
                return;
            }
            this.c = j;
            BaseFloatView.this.c.postDelayed(this.f, 200L);
        }

        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a009db7547b4b67c8bab89b035c825f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a009db7547b4b67c8bab89b035c825f");
                return;
            }
            BaseFloatView.this.c.removeCallbacks(this.f);
            this.b = 0;
        }
    }

    public TextView getTimeView() {
        return this.a;
    }

    public a getTalkingTimekeeper() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77538b2525f7ec15d75326781fbfe20a", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77538b2525f7ec15d75326781fbfe20a");
        }
        if (this.f == null) {
            this.f = new a();
        }
        return this.f;
    }

    public void setViewTag(String str) {
        this.e = str;
    }

    public String getViewTag() {
        return this.e;
    }
}
