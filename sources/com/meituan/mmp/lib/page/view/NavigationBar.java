package com.meituan.mmp.lib.page.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.mmp.lib.utils.as;
import com.meituan.mmp.lib.utils.p;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class NavigationBar extends RelativeLayout implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private TextView b;
    private ProgressBar c;
    private ImageView d;
    private ImageView e;
    private a f;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
    }

    public void setOnMenuCallBack(a aVar) {
        this.f = aVar;
    }

    public NavigationBar(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "766aa7dbfb00c85ea2bd9e0986cd13ea", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "766aa7dbfb00c85ea2bd9e0986cd13ea");
        } else {
            a(context);
        }
    }

    public NavigationBar(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a110226b07859470f352de847543eb8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a110226b07859470f352de847543eb8");
        } else {
            a(context);
        }
    }

    private void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8236b078beba053ab2e4e1e6c20d2a79", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8236b078beba053ab2e4e1e6c20d2a79");
            return;
        }
        LayoutInflater.from(context).inflate(R.layout.mmp_toolbar_layout, this);
        this.e = (ImageView) findViewById(R.id.img_back);
        this.b = (TextView) findViewById(R.id.title);
        this.b.setMaxWidth(p.a(context) - p.d(130));
        this.c = (ProgressBar) findViewById(R.id.progress_bar);
        this.d = (ImageView) findViewById(R.id.img_menu);
        this.d.setVisibility(4);
        this.e.setOnClickListener(this);
        this.d.setOnClickListener(this);
        if (as.a()) {
            this.b.setTypeface(Typeface.defaultFromStyle(0));
        } else {
            this.b.setTypeface(Typeface.defaultFromStyle(1));
        }
        a();
    }

    public void setTitle(CharSequence charSequence) {
        Object[] objArr = {charSequence};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82e4a78c325a4dec5da7165631b72d0e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82e4a78c325a4dec5da7165631b72d0e");
        } else if (this.b != null) {
            this.b.setText(charSequence);
        }
    }

    public void setTitle(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "952e103857da836e806ae84844163771", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "952e103857da836e806ae84844163771");
        } else if (this.b != null) {
            this.b.setText(i);
        }
    }

    public void setTitleTextColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a66e61c1963053df2e7f75b8e46240d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a66e61c1963053df2e7f75b8e46240d6");
        } else if (this.b != null) {
            this.b.setTextColor(i);
            this.e.setImageDrawable(a(this.e.getDrawable(), ColorStateList.valueOf(i)));
            this.d.setImageDrawable(a(this.d.getDrawable(), ColorStateList.valueOf(i)));
        }
    }

    private static Drawable a(Drawable drawable, ColorStateList colorStateList) {
        Object[] objArr = {drawable, colorStateList};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9c27b2cfa51cec2b576e0da1d25bcf14", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9c27b2cfa51cec2b576e0da1d25bcf14");
        }
        Drawable wrap = DrawableCompat.wrap(drawable);
        DrawableCompat.setTintList(wrap, colorStateList);
        return wrap;
    }

    public static int getMaximumHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c1753b503eb60794299b7d824961ea54", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c1753b503eb60794299b7d824961ea54")).intValue() : p.d(45);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac128b2adecd32796b4f42573995a475", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac128b2adecd32796b4f42573995a475");
        } else if (view.getId() == R.id.img_back) {
            b(view.getContext());
        }
    }

    private void b(Context context) {
        while (true) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd75d7b7b83b8bed2d315166c943a288", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd75d7b7b83b8bed2d315166c943a288");
                return;
            } else if (context instanceof Activity) {
                ((Activity) context).onBackPressed();
                return;
            } else if (!(context instanceof ContextWrapper)) {
                return;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f18e9bafb373fbdf8c1e17e551d3024d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f18e9bafb373fbdf8c1e17e551d3024d");
        } else if (this.c != null) {
            this.c.setVisibility(4);
        }
    }
}
