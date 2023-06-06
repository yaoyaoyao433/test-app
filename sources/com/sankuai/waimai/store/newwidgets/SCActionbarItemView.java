package com.sankuai.waimai.store.newwidgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SCActionbarItemView extends FrameLayout {
    public static ChangeQuickRedirect a;
    private ImageView b;
    private TextView c;

    public SCActionbarItemView(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0c7c5d5b5441275fe37f6f567ef0f68", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0c7c5d5b5441275fe37f6f567ef0f68");
        } else {
            a((AttributeSet) null);
        }
    }

    public SCActionbarItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9912fb42d4b1aeeb20c8c491b4bf7209", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9912fb42d4b1aeeb20c8c491b4bf7209");
        } else {
            a(attributeSet);
        }
    }

    public SCActionbarItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8536aead422bcf170487547d6a5e2ab", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8536aead422bcf170487547d6a5e2ab");
        } else {
            a(attributeSet);
        }
    }

    private void a(AttributeSet attributeSet) {
        Object[] objArr = {attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c7a3b668a13506924d7b1876969385a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c7a3b668a13506924d7b1876969385a");
            return;
        }
        LayoutInflater.from(getContext()).inflate(R.layout.wm_sc_view_actionbar_item, (ViewGroup) this, true);
        this.b = (ImageView) findViewById(R.id.iv_actionbar_icon);
        this.c = (TextView) findViewById(R.id.tv_actionbar_unread_message_count);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.src});
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            if (resourceId != 0) {
                this.b.setImageResource(resourceId);
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void setImageResource(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9254368c0c20962784804dab889745f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9254368c0c20962784804dab889745f");
        } else {
            this.b.setImageResource(i);
        }
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d91e9fdd659898f21cf2f439b7264d3e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d91e9fdd659898f21cf2f439b7264d3e");
            return;
        }
        if (this.c.getVisibility() != 0) {
            this.c.setVisibility(0);
        }
        this.c.setText(str);
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8dfbcc30970851c9e4ccbeacd542bbcd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8dfbcc30970851c9e4ccbeacd542bbcd");
        } else if (this.c.getVisibility() != 8) {
            this.c.setVisibility(8);
        }
    }

    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb069b15567d859dad5c6d4448d6cfa9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb069b15567d859dad5c6d4448d6cfa9")).booleanValue() : this.c.getVisibility() == 0;
    }
}
