package com.sankuai.waimai.business.restaurant.base.share;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import com.meituan.android.cipstorage.q;
import com.meituan.android.cipstorage.u;
import com.meituan.android.singleton.b;
import com.meituan.passport.api.AbsApiFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.platform.utils.l;
import java.io.File;
import java.io.FileOutputStream;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class a {
    public static ChangeQuickRedirect a;
    protected View b;
    protected String c;
    protected String d;
    protected boolean e;
    public Bitmap f;
    protected int g;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.restaurant.base.share.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0823a {
        void a(boolean z);
    }

    public static /* synthetic */ void a(a aVar, Bitmap bitmap) {
        Object[] objArr = {bitmap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "8b61914c025c08460591d486d47dec54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "8b61914c025c08460591d486d47dec54");
            return;
        }
        File file = new File(aVar.c);
        if (file.exists()) {
            file.delete();
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            bitmap.compress(aVar.c.endsWith(CommonConstant.File.JPG) ? Bitmap.CompressFormat.JPEG : Bitmap.CompressFormat.PNG, 90, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (Exception unused) {
        }
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc204f02b3b4c436beccb2663a531723", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc204f02b3b4c436beccb2663a531723");
            return;
        }
        this.e = false;
        this.g = g.a(b.a, 210.0f);
        File a2 = q.a(b.a, "waimai", "local_share", u.e);
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7ac0e0afc9f20b1d1e53845401f6258", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7ac0e0afc9f20b1d1e53845401f6258");
        } else if (!TextUtils.isEmpty(str) && str.contains("#MARK#_")) {
            this.c = str;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(this.d);
            sb.append("#MARK#_");
            sb.append(TextUtils.isEmpty(str) ? "default.jpg" : str.replace(" http://", "").replace(AbsApiFactory.HTTPS, "").replace("/", CommonConstant.Symbol.UNDERLINE).toLowerCase());
            this.c = sb.toString();
        }
    }

    public final void b() {
        Bitmap createBitmap;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "217f906dc28fd2b797ab4c621df62be4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "217f906dc28fd2b797ab4c621df62be4");
        } else if (this.b != null) {
            if (this.e) {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a9f1bb6e6dea9818e6e8f56121b42d35", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a9f1bb6e6dea9818e6e8f56121b42d35")).booleanValue() : new File(this.c).exists()) {
                    return;
                }
            }
            View view = this.b;
            Object[] objArr3 = {view};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "705ec1467b80eee7af2ab7b03c29b263", RobustBitConfig.DEFAULT_VALUE)) {
                createBitmap = (Bitmap) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "705ec1467b80eee7af2ab7b03c29b263");
            } else {
                view.buildDrawingCache();
                Bitmap drawingCache = view.getDrawingCache();
                createBitmap = drawingCache != null ? Bitmap.createBitmap(drawingCache) : null;
            }
            this.f = createBitmap;
            if (this.f == null) {
                return;
            }
            l.a(new l.a() { // from class: com.sankuai.waimai.business.restaurant.base.share.a.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.utils.l.a
                public final void a() {
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "581516dd80c498033975b4b3ac57e4bf", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "581516dd80c498033975b4b3ac57e4bf");
                    } else {
                        a.a(a.this, a.this.f);
                    }
                }
            }, (String) null);
            this.e = true;
        }
    }

    public final String c() {
        return this.c;
    }
}
