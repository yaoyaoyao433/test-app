package com.sankuai.waimai.reactnative.modules;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import com.meituan.android.cipstorage.q;
import com.meituan.android.cipstorage.u;
import com.meituan.passport.api.AbsApiFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.g;
import java.io.File;
import java.io.FileOutputStream;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class a {
    public static ChangeQuickRedirect a;
    protected View b;
    protected String c;
    protected String d;
    protected boolean e;
    protected int f;
    protected int g;
    private Bitmap h;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.reactnative.modules.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC1117a {
        void a(boolean z);
    }

    public a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6e75d8bcf97cdbb016b1240d50daa74", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6e75d8bcf97cdbb016b1240d50daa74");
            return;
        }
        this.e = false;
        this.f = g.a(com.meituan.android.singleton.b.a, 210.0f);
        this.g = g.a(com.meituan.android.singleton.b.a, 170.0f);
        File a2 = q.a(com.meituan.android.singleton.b.a, "waimai", str, u.e);
        this.d = a2.getAbsolutePath() + File.separator;
        if (a2.exists()) {
            return;
        }
        a2.mkdirs();
    }

    public final void a() {
        this.e = false;
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42e7e2d33c4647b430100e3ece7dd68d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42e7e2d33c4647b430100e3ece7dd68d");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.d);
        sb.append(TextUtils.isEmpty(str) ? "default.jpg" : str.replace(" http://", "").replace(AbsApiFactory.HTTPS, "").replace("/", CommonConstant.Symbol.UNDERLINE).toLowerCase());
        this.c = sb.toString();
    }

    public final void b() {
        Bitmap bitmap;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d276dc8eeb4d40abaac00006de76ca2c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d276dc8eeb4d40abaac00006de76ca2c");
        } else if (this.b != null) {
            if (this.e) {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e63862e4b24d55c7a7cb87043e4b49b1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e63862e4b24d55c7a7cb87043e4b49b1")).booleanValue() : new File(this.c).exists()) {
                    return;
                }
            }
            View view = this.b;
            Object[] objArr3 = {view};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "cd569bce6cbd1e7fe72097cbbfffa96d", RobustBitConfig.DEFAULT_VALUE)) {
                bitmap = (Bitmap) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "cd569bce6cbd1e7fe72097cbbfffa96d");
            } else {
                view.measure(View.MeasureSpec.makeMeasureSpec(this.f, 1073741824), View.MeasureSpec.makeMeasureSpec(this.g, 1073741824));
                view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.drawColor(-1);
                view.draw(canvas);
                bitmap = createBitmap;
            }
            this.h = bitmap;
            if (this.h == null) {
                return;
            }
            Bitmap bitmap2 = this.h;
            Object[] objArr4 = {bitmap2};
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "92376b7f42a2a8c1b6f28cec24975d1d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "92376b7f42a2a8c1b6f28cec24975d1d");
            } else {
                File file = new File(this.c);
                if (file.exists()) {
                    file.delete();
                }
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    bitmap2.compress(this.c.endsWith(CommonConstant.File.JPG) ? Bitmap.CompressFormat.JPEG : Bitmap.CompressFormat.PNG, 90, fileOutputStream);
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    if (bitmap2 != null && !bitmap2.isRecycled()) {
                        bitmap2.recycle();
                    }
                } catch (Exception unused) {
                }
            }
            this.e = true;
        }
    }

    public final String c() {
        return this.c;
    }
}
