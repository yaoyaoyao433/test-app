package com.meituan.android.cube.pga.view;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class a<ContentViewType extends View> {
    public static ChangeQuickRedirect a;
    public ContentViewType b;
    public Context c;
    private ViewStub d;

    public void b() {
    }

    @Nullable
    public ContentViewType c() {
        return null;
    }

    @LayoutRes
    public int d() {
        return -1;
    }

    public a(Context context) {
        this(context, (ViewStub) null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3bd15dfeec2c34147f9f597de22573fa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3bd15dfeec2c34147f9f597de22573fa");
        }
    }

    public a(Context context, @Nullable ViewStub viewStub) {
        ViewParent parent;
        Object[] objArr = {context, viewStub};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e05edc7b587deec4c9019c16d642265", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e05edc7b587deec4c9019c16d642265");
            return;
        }
        this.c = context;
        this.d = viewStub;
        int d = d();
        if (viewStub == null && d != -1) {
            this.b = (ContentViewType) LayoutInflater.from(context).inflate(d(), (ViewGroup) null);
        } else if (viewStub != null && d != -1) {
            this.d.setLayoutResource(d);
            this.b = (ContentViewType) this.d.inflate();
        } else if (viewStub != null && viewStub.getLayoutResource() != 0) {
            this.b = (ContentViewType) this.d.inflate();
        }
        if (this.b == null) {
            this.b = c();
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1ca829a3cf925f57a332195df0a7bfe8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1ca829a3cf925f57a332195df0a7bfe8");
            } else if (this.b != null && this.d != null && (parent = this.d.getParent()) != null && (parent instanceof ViewGroup)) {
                ViewGroup viewGroup = (ViewGroup) parent;
                int indexOfChild = viewGroup.indexOfChild(this.d);
                viewGroup.removeViewInLayout(this.d);
                ViewGroup.LayoutParams layoutParams = this.d.getLayoutParams();
                if (layoutParams != null) {
                    viewGroup.addView(this.b, indexOfChild, layoutParams);
                } else {
                    viewGroup.addView(this.b, indexOfChild);
                }
            }
        }
        if (this.b == null) {
            throw new IllegalStateException("需要提供视图对象");
        }
        b();
    }

    public a(Context context, View view) {
        Object[] objArr = {context, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ef2fd4281b112d3bb005702948ab812", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ef2fd4281b112d3bb005702948ab812");
            return;
        }
        this.c = context;
        this.b = view;
        b();
    }

    public final ContentViewType a() {
        return this.b;
    }
}
