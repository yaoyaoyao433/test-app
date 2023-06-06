package com.sankuai.waimai.platform.widget.emptylayout;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.ah;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f {
    public static ChangeQuickRedirect a = null;
    public static final int b = 2131364207;

    /* renamed from: c */
    public static final int wm_common_no_more = 2131364214;

    /* renamed from: d */
    public static final int wm_common_load_more = 2131364206;
    public final View e;
    private a f;
    private ListView g;
    private boolean h;
    private final Context i;
    private final ImageView j;
    private final TextView k;
    private final ImageView l;
    private int m;
    private String n;
    private int o;
    private String p;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public enum a {
        INITIAL,
        HIDE,
        PROGRESS,
        NO_MORE,
        LOAD_MORE,
        ERROR,
        INFO;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b075827612b19e9d088786f6e668df27", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b075827612b19e9d088786f6e668df27");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cdcc6e1f163ae12ec10f164e58a8d1ce", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cdcc6e1f163ae12ec10f164e58a8d1ce") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bbf3bbae951ffd54812c02957eca406c", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bbf3bbae951ffd54812c02957eca406c") : (a[]) values().clone();
        }
    }

    @SuppressLint({"InflateParams"})
    public f(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9161898b0501ace63354fe79362b190", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9161898b0501ace63354fe79362b190");
            return;
        }
        this.f = a.INITIAL;
        this.h = false;
        this.i = context;
        this.e = LayoutInflater.from(this.i).inflate(R.layout.wm_common_layout_refresh_footer, (ViewGroup) null);
        this.j = (ImageView) this.e.findViewById(R.id.img_info);
        this.k = (TextView) this.e.findViewById(R.id.txt_info);
        this.l = (ImageView) this.e.findViewById(R.id.progress_info);
        int i = wm_common_no_more;
        Object[] objArr2 = {0, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0cf15f0698f790f424cdc1b91f2c077f", RobustBitConfig.DEFAULT_VALUE)) {
            f fVar = (f) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0cf15f0698f790f424cdc1b91f2c077f");
        } else {
            a(0, a(i));
        }
        int i2 = wm_common_load_more;
        Object[] objArr3 = {0, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ae27b18e7e49026911618994b1b5eb84", RobustBitConfig.DEFAULT_VALUE)) {
            f fVar2 = (f) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ae27b18e7e49026911618994b1b5eb84");
        } else {
            String a2 = a(i2);
            this.m = 0;
            this.n = a2;
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "6f7a9f11b70dcf0c5c7742a86ddcc3d4", RobustBitConfig.DEFAULT_VALUE)) {
            f fVar3 = (f) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "6f7a9f11b70dcf0c5c7742a86ddcc3d4");
        } else if (a(a.HIDE)) {
            a(this.l);
            a(false);
        }
    }

    public final f a(int i, String str) {
        this.o = i;
        this.p = str;
        return this;
    }

    private boolean a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78c004162ae5c1078cfef0393118493d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78c004162ae5c1078cfef0393118493d")).booleanValue();
        }
        if (aVar != this.f) {
            this.f = aVar;
            return true;
        }
        return false;
    }

    public final f a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0d594453308df5ac55f5d61e32ce322", RobustBitConfig.DEFAULT_VALUE) ? (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0d594453308df5ac55f5d61e32ce322") : b(b);
    }

    private f b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80427dbb426052a82865992b4ce349eb", RobustBitConfig.DEFAULT_VALUE) ? (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80427dbb426052a82865992b4ce349eb") : a(a(i));
    }

    private f a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e55952c1baa9a0bf04ef420616cdd1b6", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e55952c1baa9a0bf04ef420616cdd1b6");
        }
        this.l.setVisibility(0);
        a(this.l, R.anim.loading_animtaion);
        this.j.setVisibility(8);
        ah.a(this.k, str);
        a(true);
        a(a.PROGRESS);
        return this;
    }

    public final f b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6552d8cf62a5635fd2799ad5333e14ea", RobustBitConfig.DEFAULT_VALUE) ? (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6552d8cf62a5635fd2799ad5333e14ea") : a(a.NO_MORE, this.o, this.p);
    }

    public f a(a aVar, int i, String str) {
        Object[] objArr = {aVar, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79a66f7bfc791bbba1d6b380043e373d", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79a66f7bfc791bbba1d6b380043e373d");
        }
        this.l.setVisibility(8);
        a(this.l);
        ah.a(this.j, i);
        ah.a(this.k, str);
        a(true);
        a(aVar);
        return this;
    }

    private void a(ImageView imageView, int i) {
        Drawable drawable;
        Object[] objArr = {imageView, Integer.valueOf((int) R.anim.loading_animtaion)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd2da71f391230af5fb6c83f48220b75", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd2da71f391230af5fb6c83f48220b75");
        } else if (imageView.getDrawable() == null && (drawable = this.i.getResources().getDrawable(R.anim.loading_animtaion)) != null) {
            imageView.setImageDrawable(drawable);
            if (drawable instanceof Animatable) {
                ((Animatable) drawable).start();
            }
        }
    }

    private void a(ImageView imageView) {
        Object[] objArr = {imageView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb9fd6fee64296efc96473e3e655c120", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb9fd6fee64296efc96473e3e655c120");
            return;
        }
        if (imageView.getDrawable() != null) {
            imageView.getDrawable().setCallback(null);
        }
        imageView.setImageDrawable(null);
    }

    private void a(boolean z) {
        View view;
        int i = 0;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc2b201acb3c1934f2c329f7d507139d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc2b201acb3c1934f2c329f7d507139d");
        } else if (this.h != z) {
            if (this.g == null) {
                view = this.e;
                if (!z) {
                    i = 8;
                }
            } else if (z) {
                this.g.addFooterView(this.e);
                view = this.e;
            } else {
                this.g.removeFooterView(this.e);
                this.h = z;
            }
            view.setVisibility(i);
            this.h = z;
        }
    }

    public String a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "518d692049a5b37ec8281440c3aaf2fc", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "518d692049a5b37ec8281440c3aaf2fc");
        }
        if (i != 0) {
            try {
                return this.i.getString(i);
            } catch (Resources.NotFoundException e) {
                com.sankuai.waimai.foundation.utils.log.a.a(e);
                return null;
            }
        }
        return null;
    }
}
