package com.meituan.android.paybase.widgets.notice;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.android.paybase.utils.aj;
import com.meituan.android.paybase.utils.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class NoticeView extends LinearLayout {
    public static ChangeQuickRedirect a;
    private a b;
    private String c;

    public NoticeView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fcf6054f88ec47054c3d74157d5dbad1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fcf6054f88ec47054c3d74157d5dbad1");
        } else {
            a();
        }
    }

    public NoticeView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8163927dfdaec0337c1f82e1ee132ae1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8163927dfdaec0337c1f82e1ee132ae1");
            return;
        }
        a(context, attributeSet);
        a();
    }

    public NoticeView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04140f652455698bdb72882d10779bba", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04140f652455698bdb72882d10779bba");
            return;
        }
        a(context, attributeSet);
        a();
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81a30f9922e48249e0556528e506373e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81a30f9922e48249e0556528e506373e");
            return;
        }
        setOrientation(1);
        inflate(getContext(), R.layout.paybase__notice_layout, this);
        if (this.b == null) {
            this.b = a.DEFAULT;
        }
        setStyle(this.b);
        setText(this.c);
    }

    public void setText(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "493356b343306627fc24ac978c9c78d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "493356b343306627fc24ac978c9c78d4");
        } else {
            ((TextView) findViewById(R.id.notice_content)).setText(str);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        Object[] objArr = {onClickListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0310d6b7e729e04223566117d1986d8c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0310d6b7e729e04223566117d1986d8c");
            return;
        }
        super.setOnClickListener(onClickListener);
        if (onClickListener != null) {
            findViewById(R.id.notice_icon).setVisibility(0);
        } else {
            findViewById(R.id.notice_icon).setVisibility(8);
        }
    }

    public void setStyle(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8bcd9abe4725029243578a453e76a48", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8bcd9abe4725029243578a453e76a48");
            return;
        }
        View findViewById = findViewById(R.id.notice_bottom_divider);
        TextView textView = (TextView) findViewById(R.id.notice_content);
        ImageView imageView = (ImageView) findViewById(R.id.notice_icon);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.notice_view_root);
        if (aVar == a.ROUND_ORANGE) {
            l.a(linearLayout, l.a(getContext().getResources().getDimensionPixelOffset(R.dimen.paybase__head_notice_round_conner), getResources().getColor(R.color.paybase__bg_notice3)));
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, aj.a(getContext(), 25.0f)));
            textView.setTextColor(getResources().getColor(R.color.paybase__notice_text3));
            textView.setTextSize(1, 12.0f);
            textView.setGravity(17);
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.height = aj.a(getContext(), 10.0f);
            layoutParams.width = aj.a(getContext(), 6.0f);
            imageView.setLayoutParams(layoutParams);
            com.meituan.android.paybase.config.a.d().r().a("https://p0.meituan.net/scarlett/b41a9314619167f2c28a1f248c2898ab256.png").a(imageView);
            findViewById.setVisibility(8);
        } else if (aVar == a.RED) {
            linearLayout.setBackgroundResource(R.color.paybase__bg_notice2);
            findViewById.setBackgroundResource(R.color.paybase__notice_divider2);
            textView.setTextColor(getResources().getColor(R.color.paybase__notice_text2));
            com.meituan.android.paybase.config.a.d().r().a("https://p0.meituan.net/scarlett/b6f026cbde8af759873c10f217b8c286305.png").a(imageView);
        } else {
            linearLayout.setBackgroundResource(R.color.paybase__bg_notice);
            findViewById.setBackgroundResource(R.color.paybase__notice_divider);
            textView.setTextColor(getResources().getColor(R.color.paybase__notice_text));
            imageView.setImageResource(R.drawable.paybase__home_notice_icon);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public enum a {
        DEFAULT,
        RED,
        ROUND_ORANGE;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b72eb4b7fc8cc46e3a6d0f78a9b289e6", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b72eb4b7fc8cc46e3a6d0f78a9b289e6");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "14d7af1d89bd2c0373dbae2df2a36583", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "14d7af1d89bd2c0373dbae2df2a36583") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1be09824c23d354b81450637a8f8ea23", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1be09824c23d354b81450637a8f8ea23") : (a[]) values().clone();
        }
    }

    private void a(Context context, AttributeSet attributeSet) {
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0881b50cb760d967f73ca2d0fb9cfc9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0881b50cb760d967f73ca2d0fb9cfc9");
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.noticeViewText, R.attr.noticeViewType});
        int i = obtainStyledAttributes.getInt(1, 1);
        this.c = obtainStyledAttributes.getString(0);
        obtainStyledAttributes.recycle();
        if (i == 1) {
            this.b = a.DEFAULT;
        } else if (i == 2) {
            this.b = a.ROUND_ORANGE;
        } else {
            this.b = a.RED;
        }
    }
}
