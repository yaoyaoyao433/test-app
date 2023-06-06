package com.sankuai.meituan.mapsdk.core.widgets;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.model.IndoorBuilding;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class IndoorControlView extends ScrollView {
    public static ChangeQuickRedirect a;
    private float b;
    private String c;
    private Context d;
    private LinearLayout e;
    private IndoorBuilding f;
    private View g;
    private boolean h;
    private a i;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a(int i);
    }

    public IndoorControlView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6696f436724be641e330d7e5fd9efa35", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6696f436724be641e330d7e5fd9efa35");
            return;
        }
        this.b = 400.0f;
        this.c = "#3E8BFF";
        this.h = true;
        a(context);
    }

    public IndoorControlView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca4ebf87831b856a331881571a7104c3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca4ebf87831b856a331881571a7104c3");
            return;
        }
        this.b = 400.0f;
        this.c = "#3E8BFF";
        this.h = true;
        a(context);
    }

    public IndoorControlView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b226c5945f9bf4f9c826bd55c08e501", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b226c5945f9bf4f9c826bd55c08e501");
            return;
        }
        this.b = 400.0f;
        this.c = "#3E8BFF";
        this.h = true;
        a(context);
    }

    private void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f74a1304cb51f5f2e296589e074b38d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f74a1304cb51f5f2e296589e074b38d");
            return;
        }
        this.d = context;
        setVerticalScrollBarEnabled(false);
        setBackgroundResource(R.drawable.mtmapsdk_indoor_bg);
        setPadding(0, 15, 0, 15);
        if (Build.VERSION.SDK_INT >= 21) {
            setElevation(8.0f);
        }
        this.e = new LinearLayout(context);
        this.e.setOrientation(1);
        addView(this.e, -1, -1);
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af9ca2e17e03e9f3994f8263a22794e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af9ca2e17e03e9f3994f8263a22794e7");
            return;
        }
        if (this.b <= View.MeasureSpec.getSize(i2) && this.b > -1.0f) {
            i2 = View.MeasureSpec.makeMeasureSpec(Float.valueOf(this.b).intValue(), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
    }

    public void setEnable(boolean z) {
        boolean z2 = true;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a88424ac10373d9ffbbad739bb8b24b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a88424ac10373d9ffbbad739bb8b24b7");
            return;
        }
        this.h = z;
        a((this.f == null || !z) ? false : false);
    }

    public void setOnIndoorControlListener(a aVar) {
        this.i = aVar;
    }

    public IndoorBuilding getIndoorBuilding() {
        return this.f;
    }

    public void setIndoorBuilding(IndoorBuilding indoorBuilding) {
        boolean z = true;
        Object[] objArr = {indoorBuilding};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f072f159b7b61cb023ac7f83697c6db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f072f159b7b61cb023ac7f83697c6db");
            return;
        }
        this.f = indoorBuilding;
        a((this.f == null || !this.h) ? false : false);
    }

    public void setActiveIndex(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "182a890b438fe8bb49c64a2b2932e066", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "182a890b438fe8bb49c64a2b2932e066");
        } else {
            a(i, false);
        }
    }

    public final void a(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0edc254afb3b4e64bd2dc71ec482ee18", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0edc254afb3b4e64bd2dc71ec482ee18");
        } else if (i >= 0 && this.e.getChildCount() > i && this.f != null) {
            if (this.g == null || ((Integer) this.g.getTag()).intValue() != i) {
                this.g = this.e.getChildAt(i);
                a(this.g);
                if (z && this.i != null) {
                    this.i.a(((Integer) this.g.getTag()).intValue());
                }
                for (int i2 = 0; i2 < this.e.getChildCount(); i2++) {
                    TextView textView = (TextView) this.e.getChildAt(i2);
                    if (textView.getTag() == this.g.getTag()) {
                        this.f.setActiveIndex(((Integer) this.g.getTag()).intValue());
                        textView.setTextColor(-1);
                        textView.setBackgroundColor(Color.parseColor(this.c));
                    } else {
                        textView.setTextColor(-16777216);
                        textView.setBackgroundColor(0);
                    }
                }
            }
        }
    }

    private void a(final View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aaf1db80aad80138a041c629993b89e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aaf1db80aad80138a041c629993b89e4");
        } else {
            postDelayed(new Runnable() { // from class: com.sankuai.meituan.mapsdk.core.widgets.IndoorControlView.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "086bff9e5ac7c6f13709e0ba8a822219", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "086bff9e5ac7c6f13709e0ba8a822219");
                        return;
                    }
                    Rect rect = new Rect();
                    boolean globalVisibleRect = view.getGlobalVisibleRect(rect);
                    if (globalVisibleRect && rect.width() >= view.getMeasuredWidth() && rect.height() >= view.getMeasuredHeight()) {
                        globalVisibleRect = false;
                    }
                    if (globalVisibleRect || view.getBottom() > IndoorControlView.this.getHeight()) {
                        IndoorControlView.this.scrollTo(0, view.getTop());
                    }
                }
            }, 100L);
        }
    }

    private void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1737a6d2dec4c4eba61da723a377bdb3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1737a6d2dec4c4eba61da723a377bdb3");
            return;
        }
        setVisibility(z ? 0 : 4);
        if (z) {
            this.e.removeAllViews();
            for (int i = 0; i < this.f.getIndoorFloorNames().size(); i++) {
                TextView textView = new TextView(this.d);
                textView.setGravity(17);
                textView.setTypeface(Typeface.DEFAULT_BOLD);
                textView.setText(this.f.getIndoorFloorNames().get(i));
                textView.setTag(Integer.valueOf(i));
                this.e.addView(textView, this.e.getWidth(), this.e.getWidth());
                if (i == this.f.getActiveIndex()) {
                    textView.setTextColor(-1);
                    textView.setBackgroundColor(Color.parseColor(this.c));
                } else {
                    textView.setTextColor(-16777216);
                    textView.setBackgroundColor(0);
                }
                textView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.meituan.mapsdk.core.widgets.IndoorControlView.2
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bc9fe7842e37c5ec7e8661dfa3619604", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bc9fe7842e37c5ec7e8661dfa3619604");
                        } else {
                            IndoorControlView.this.a(((Integer) view.getTag()).intValue(), true);
                        }
                    }
                });
            }
            View childAt = this.e.getChildAt(this.e.getChildCount() - this.f.getActiveIndex());
            if (childAt != null) {
                a(childAt);
            }
        }
    }
}
