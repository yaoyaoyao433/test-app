package com.meituan.android.mrn.component.skeleton;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.View;
import com.meituan.android.mrn.component.skeleton.b;
import com.meituan.dio.easy.DioFile;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a extends View implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    public boolean b;
    private Paint c;
    private RectF d;
    private com.meituan.android.mrn.component.skeleton.anim.a e;
    private boolean f;
    private boolean g;
    private String h;
    @Deprecated
    private File i;
    private DioFile j;
    private String k;
    private List<List<Object>> l;
    private int m;
    private float n;
    private boolean o;
    private boolean p;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14ad832dbe1073a2145ed5b918ffae0c", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14ad832dbe1073a2145ed5b918ffae0c");
        }
    }

    public a(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03d7c5a77ea6b91d6fe4e8b6c3d35077", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03d7c5a77ea6b91d6fe4e8b6c3d35077");
            return;
        }
        this.c = new Paint(1);
        this.d = new RectF();
        this.e = new com.meituan.android.mrn.component.skeleton.anim.b(this);
        this.b = false;
        this.f = true;
        this.g = false;
        this.m = -1;
        this.n = -1.0f;
        this.o = true;
        this.p = false;
    }

    public a(Context context, String str, DioFile dioFile) {
        this(context, str, dioFile, true);
        Object[] objArr = {context, str, dioFile};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d4bbf4ee84afda65f288d5318bb2eb2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d4bbf4ee84afda65f288d5318bb2eb2");
        }
    }

    private a(Context context, String str, DioFile dioFile, boolean z) {
        super(context);
        Object[] objArr = {context, str, dioFile, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddd7b59f2af9cecd0b17f48fcb19c44a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddd7b59f2af9cecd0b17f48fcb19c44a");
            return;
        }
        this.c = new Paint(1);
        this.d = new RectF();
        this.e = new com.meituan.android.mrn.component.skeleton.anim.b(this);
        this.b = false;
        this.f = true;
        this.g = false;
        this.m = -1;
        this.n = -1.0f;
        this.o = true;
        this.p = false;
        this.h = str;
        this.j = dioFile;
        this.o = true;
        a();
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a2a1c9093bd1003ef7928b162635af1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a2a1c9093bd1003ef7928b162635af1");
            return;
        }
        setOnClickListener(this);
        if (TextUtils.isEmpty(this.h) && TextUtils.isEmpty(this.k)) {
            return;
        }
        b.a(getContext(), this.o, this.k, this.h, this.i, this.j, new b.a() { // from class: com.meituan.android.mrn.component.skeleton.a.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.mrn.component.skeleton.b.a
            public final void a(Map<String, Object> map) {
                Object[] objArr2 = {map};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2bb1dd27634d55d769daa3c8ddcf5fe7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2bb1dd27634d55d769daa3c8ddcf5fe7");
                    return;
                }
                a.this.l = (List) map.get("LIST_SKELETON");
                a.this.m = ((Integer) map.get("ORIGIN_ROOT_VIEW_SKELETON_WIDTH")).intValue();
                a.this.p = ((Boolean) map.get("IS_COMPAT_STATUS_BAR")).booleanValue();
                a.this.b = false;
                a.this.postInvalidate();
            }

            @Override // com.meituan.android.mrn.component.skeleton.b.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b0c7070aa95eb626391b063dfc02eb44", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b0c7070aa95eb626391b063dfc02eb44");
                    return;
                }
                a.this.b = true;
                a.this.setVisibility(8);
            }
        });
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        float f;
        int i = 1;
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f1eebe4eca8c26d14d482224a12c0f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f1eebe4eca8c26d14d482224a12c0f1");
            return;
        }
        super.draw(canvas);
        if (this.l == null || this.l.isEmpty()) {
            return;
        }
        if (this.n == -1.0f || this.n == 0.0f) {
            this.n = ((b.a((short) getMeasuredWidth(), b.a(getContext())) * 1.0f) / this.m) * 1.0f;
        }
        int size = this.l.size();
        int i2 = 0;
        while (i2 < this.l.size()) {
            try {
                List<Object> list = this.l.get(i2);
                if (list.size() == 6) {
                    float intValue = ((Integer) list.get(0)).intValue() * this.n;
                    float intValue2 = ((Integer) list.get(i)).intValue() * this.n;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "35a7d78010401583d7fd5ba671ed7e4c", RobustBitConfig.DEFAULT_VALUE)) {
                        f = ((Float) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "35a7d78010401583d7fd5ba671ed7e4c")).floatValue();
                    } else {
                        f = this.p ? b.b(getContext()) : 0.0f;
                    }
                    float f2 = intValue2 + f;
                    float intValue3 = ((Integer) list.get(2)).intValue() * this.n;
                    float intValue4 = ((Integer) list.get(3)).intValue() * this.n;
                    float floatValue = ((Float) list.get(4)).floatValue();
                    if (floatValue == 999.0f) {
                        intValue3 = intValue4 * 1.0f;
                    }
                    this.d.set(intValue, f2, intValue3 + intValue, intValue4 + f2);
                    this.c.setColor(((Integer) list.get(5)).intValue());
                    if (this.f) {
                        this.e.a(canvas, this.d, this.c);
                    }
                    canvas.drawRoundRect(this.d, floatValue, floatValue, this.c);
                }
                i2++;
                size--;
                i = 1;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (size != 0 || this.g) {
            return;
        }
        this.g = true;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(@NonNull View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1a08f29aa46f830fe68feccb56db568", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1a08f29aa46f830fe68feccb56db568");
            return;
        }
        super.onVisibilityChanged(view, i);
        if (this.e != null) {
            if (i == 8) {
                this.e.b();
            } else if (this.f) {
                this.e.a(0L);
            }
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4e2772bfc2a583fb779905bb55e94f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4e2772bfc2a583fb779905bb55e94f2");
            return;
        }
        super.onDetachedFromWindow();
        if (this.e != null) {
            this.e.b();
        }
    }

    public final void setOpenAnim(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01221ff19c7d4a310cff989382bb752a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01221ff19c7d4a310cff989382bb752a");
            return;
        }
        this.f = z;
        if (this.e != null) {
            if (this.f) {
                this.e.a(0L);
            } else {
                this.e.b();
            }
        }
    }

    public final void a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dca59898e73fb045acffb8801f9aca33", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dca59898e73fb045acffb8801f9aca33");
            return;
        }
        this.h = str;
        this.o = z;
        a();
    }

    public final void b(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fbeb8f0da68140f503920311216bb366", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fbeb8f0da68140f503920311216bb366");
            return;
        }
        this.o = z;
        this.k = str;
        a();
    }
}
