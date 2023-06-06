package com.sankuai.waimai.foundation.core.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.ColorInt;
import android.support.annotation.DrawableRes;
import android.support.annotation.FloatRange;
import android.support.annotation.StringRes;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class ActionBarView extends RelativeLayout {
    public static ChangeQuickRedirect a;
    public TextView b;
    public View c;
    public TextView d;
    private TextView e;
    private a f;
    private View g;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a();
    }

    public ActionBarView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "daad768913df136f45a2f65e94876181", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "daad768913df136f45a2f65e94876181");
        } else {
            a(context);
        }
    }

    public ActionBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c288736276ef8696363fdfe50568aa82", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c288736276ef8696363fdfe50568aa82");
        } else {
            a(context);
        }
    }

    private void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be1c238e801d5ac809fa19be36dd3c22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be1c238e801d5ac809fa19be36dd3c22");
            return;
        }
        LayoutInflater.from(context).inflate(R.layout.wm_page_common_actionbar, this);
        this.g = findViewById(R.id.wm_action_bar);
        this.b = (TextView) findViewById(R.id.left_action_view);
        this.b.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.foundation.core.widget.ActionBarView.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "30aa265df85bdfb8361cc16e76e8f346", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "30aa265df85bdfb8361cc16e76e8f346");
                } else if (ActionBarView.this.f != null) {
                    ActionBarView.this.f.a();
                }
            }
        });
        this.c = findViewById(R.id.seperator);
        this.e = (TextView) findViewById(R.id.title);
        this.d = (TextView) findViewById(R.id.right_action_view);
        this.d.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.foundation.core.widget.ActionBarView.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7c3306210bb5fbeab2079700c806e875", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7c3306210bb5fbeab2079700c806e875");
                } else if (ActionBarView.this.f != null) {
                    a unused = ActionBarView.this.f;
                }
            }
        });
    }

    public void setClickListener(a aVar) {
        this.f = aVar;
    }

    public final TextView a(@StringRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2502aa13c7e0c4c9efce62bfa961f05e", RobustBitConfig.DEFAULT_VALUE)) {
            return (TextView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2502aa13c7e0c4c9efce62bfa961f05e");
        }
        this.e.setText(i);
        return this.e;
    }

    public void setActionbarBackgroundColor(@ColorInt int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50d1e05c27fc33e504614ba541019c8b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50d1e05c27fc33e504614ba541019c8b");
        } else {
            this.g.setBackgroundColor(i);
        }
    }

    public void setActionbarBackgroundResource(@DrawableRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "416ffa47507b9b32c4a28b7cd2101092", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "416ffa47507b9b32c4a28b7cd2101092");
        } else {
            this.g.setBackgroundResource(i);
        }
    }

    public void setActionbarBackgroundAlpha(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b90e6c994fecb0b17d80a4233da96b45", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b90e6c994fecb0b17d80a4233da96b45");
        } else {
            this.g.setAlpha(f);
        }
    }

    public void setActionbarBackground(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2cc8519b3389c776bf5b9cdf7ec9918e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2cc8519b3389c776bf5b9cdf7ec9918e");
        } else {
            this.g.setBackground(drawable);
        }
    }
}
