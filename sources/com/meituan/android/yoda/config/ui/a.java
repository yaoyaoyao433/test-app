package com.meituan.android.yoda.config.ui;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.constraint.R;
import com.meituan.android.yoda.util.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class a implements c {
    public static ChangeQuickRedirect a;
    protected String b;
    protected String c;
    protected int d;
    protected int e;
    protected int f;
    protected int g;
    protected int h;
    protected int i;
    protected int j;
    protected int k;
    protected int l;
    protected int m;

    @Override // com.meituan.android.yoda.config.ui.c
    public boolean a() {
        return true;
    }

    @Override // com.meituan.android.yoda.config.ui.b
    public int b() {
        return R.style.YodaThemeBase;
    }

    @Override // com.meituan.android.yoda.config.ui.b
    public String c() {
        return "";
    }

    @Override // com.meituan.android.yoda.config.ui.b
    public JSONObject d() {
        return null;
    }

    @Override // com.meituan.android.yoda.config.ui.b
    public String e() {
        return null;
    }

    @Override // com.meituan.android.yoda.config.ui.b
    public int f() {
        return 0;
    }

    @Override // com.meituan.android.yoda.config.ui.c
    public Drawable n() {
        return null;
    }

    @Override // com.meituan.android.yoda.config.ui.c
    public Drawable o() {
        return null;
    }

    @Override // com.meituan.android.yoda.config.ui.c
    public String p() {
        return "";
    }

    @Override // com.meituan.android.yoda.config.ui.c
    public String q() {
        return "";
    }

    @Override // com.meituan.android.yoda.config.ui.c
    public boolean r() {
        return false;
    }

    @Override // com.meituan.android.yoda.config.ui.c
    public boolean s() {
        return false;
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5386310792c997a86fb38450efe90fe3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5386310792c997a86fb38450efe90fe3");
            return;
        }
        this.d = -1;
        this.e = R.color.yoda_colorPrimary;
        this.f = -1;
        this.g = -1;
        this.h = -1;
        this.i = -1;
        this.j = -1;
        this.k = -1;
        this.l = -1;
        this.m = -1;
    }

    @Override // com.meituan.android.yoda.config.ui.c
    public int g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa96d4b0719089848ee5fe5df660559d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa96d4b0719089848ee5fe5df660559d")).intValue();
        }
        if (this.f != -1) {
            return this.f;
        }
        int b = x.b((int) R.color.yoda_default_status_arrow_color);
        this.f = b;
        return b;
    }

    @Override // com.meituan.android.yoda.config.ui.c
    public int h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3eae50276ced044f7839d94c0c0b157e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3eae50276ced044f7839d94c0c0b157e")).intValue();
        }
        if (this.g != -1) {
            return this.g;
        }
        int b = x.b((int) R.color.yoda_default_status_title_color);
        this.g = b;
        return b;
    }

    @Override // com.meituan.android.yoda.config.ui.c
    public Drawable i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0d9bdc8dc2caef5876b2dd909e82ff3", RobustBitConfig.DEFAULT_VALUE) ? (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0d9bdc8dc2caef5876b2dd909e82ff3") : new ColorDrawable(x.b((int) R.color.yoda_default_status_background_color));
    }

    @Override // com.meituan.android.yoda.config.ui.c
    public int j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d68ad9e27a5ffe9dc714abd3098294c7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d68ad9e27a5ffe9dc714abd3098294c7")).intValue();
        }
        if (this.j != -1) {
            return this.j;
        }
        int b = x.b((int) R.color.yoda_default_text_color);
        this.j = b;
        return b;
    }

    @Override // com.meituan.android.yoda.config.ui.c
    public int k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96e3777a0a4e3bc08bf218c05d5fc9c4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96e3777a0a4e3bc08bf218c05d5fc9c4")).intValue();
        }
        if (this.k != -1) {
            return this.k;
        }
        int b = x.b((int) R.color.yoda_default_btn_background_active_color);
        this.k = b;
        return b;
    }

    @Override // com.meituan.android.yoda.config.ui.c
    public int l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae0d07b6c7a35a961e4da714f95d8e7a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae0d07b6c7a35a961e4da714f95d8e7a")).intValue();
        }
        if (this.l != -1) {
            return this.l;
        }
        int b = x.b((int) R.color.yoda_default_btn_background_normal_color);
        this.l = b;
        return b;
    }

    @Override // com.meituan.android.yoda.config.ui.c
    public int m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "721efe388fbbac5781e7f00c2a196b4d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "721efe388fbbac5781e7f00c2a196b4d")).intValue();
        }
        if (this.m != -1) {
            return this.m;
        }
        int b = x.b((int) R.color.yoda_default_btn_background_ban_color);
        this.m = b;
        return b;
    }
}
